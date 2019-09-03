package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


import board.service.BoardService;
import board.vo.BoardVO;
import board.vo.Reply;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext context = new GenericXmlApplicationContext("config/applicationContext.xml");
	BoardService bs = context.getBean("boardService", BoardService.class);
//		
	bs.createBoard(new BoardVO(1, "안녕", "조희림", "하하하하", 0));
////	
//	
	
	bs.
	Reply reply = bs.selectReply(1);
	
	
	}

}
