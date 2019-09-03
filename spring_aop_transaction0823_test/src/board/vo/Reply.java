package board.vo;

public class Reply {

	int id;
	int boardId;
	String content;
	
	public Reply() {
		super();
	}
	
	public Reply(int id, int boardId, String content) {
		super();
		this.id = id;
		this.boardId = boardId;
		this.content = content;
	}
	
	public Reply(int id) {
		super();
		this.id = id;
	
	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Reply [id=" + id + ", boardId=" + boardId + ", content=" + content + "]";
	}
	
	
	
}
