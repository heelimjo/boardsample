package board.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import board.mapper.ReplyMapper;
import board.vo.Reply;


@Repository("replyDao")
public class ReplyDAOImpl implements ReplyDAO {

	@Autowired
	private ReplyMapper replyMapper;
	
	@Override
	public void insertReply(Reply reply) {
		replyMapper.insertReply(reply);

	}

	@Override
	public void updateReply(Reply reply) {
		replyMapper.updateReply(reply);

	}

	@Override
	public void deleteReply(int id) {
		replyMapper.deleteReply(id);
	}

	@Override
	public Reply selectOneReply(int id) {
		return replyMapper.selectOneReply(id);
	}

	@Override
	public Reply selectAllReplies() {
		return replyMapper.selectAllReplies();
	}

	@Override
	public Reply selectReplyLastOne() {
		return replyMapper.selectReplyLastOne();
	}
	
	
	@Override
	public int selectCountReplybyBoardID(int boardid) {
		return replyMapper.selectCountReplybyBoardID(boardid);
	}

}
