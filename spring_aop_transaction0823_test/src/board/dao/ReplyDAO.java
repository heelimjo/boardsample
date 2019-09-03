package board.dao;

import board.vo.Reply;

public interface ReplyDAO {
	
	
	public void insertReply(Reply reply);
	public void updateReply(Reply reply);
	public void deleteReply(int id);
	public Reply selectOneReply(int id);
	public Reply selectAllReplies();
	public Reply selectReplyLastOne();
	public int selectCountReplybyBoardID(int boardid);
}
