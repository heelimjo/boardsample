package board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import board.dao.BoardDAO;
import board.dao.ReplyDAO;
import board.mapper.BoardMapper;
import board.mapper.ReplyMapper;
import board.vo.BoardVO;
import board.vo.Reply;


@Service("boardService")
public class BoardServiceImpl implements BoardService {

	
	@Autowired
	private BoardDAO boardDao;
	
	@Autowired
	private ReplyDAO replyDao;
	
	
	@Override
	public void createBoard(BoardVO board) {
		// TODO Auto-generated method stub

		boardDao.insert(board);
		
	}

	
	@Override
	@Transactional
	public void createReply(Reply reply) {
		
		replyDao.insertReply(reply);
		
		int count = replyDao.selectCountReplybyBoardID(reply.getBoardId());
	
		boardDao.updateReplyCount(reply.getBoardId());

	}

	
	public Reply selectReply(int replyId) {
		
		return replyDao.selectOneReply(replyId);
	}
	
	
	public void deleteReply(Reply reply) {
		
		replyDao.deleteReply(reply.getId());
		
		int count = replyDao.selectCountReplybyBoardID(reply.getBoardId());
		
		boardDao.updateReplyCount(reply.getBoardId());
	}
	
}
