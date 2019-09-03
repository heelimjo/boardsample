package board.mapper;

import board.vo.Reply;

@Mymapper
public interface ReplyMapper {
	
	public void insertReply(Reply reply);
	public void updateReply(Reply reply);
	public void deleteReply(int id);
	public Reply selectOneReply(int id);
	public Reply selectAllReplies();
	public Reply selectReplyLastOne();
	public int selectCountReplybyBoardID(int id);

}
