package board.service;

import board.vo.BoardVO;
import board.vo.Reply;

public interface BoardService {

	public void createBoard(BoardVO board);
	
	public void createReply(Reply reply);
	  
	public Reply selectReply(int replyId);
	
	public void deleteReply(Reply reply);
	
}
