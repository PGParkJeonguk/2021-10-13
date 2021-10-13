package co.jeonguk.prj.board.serviceImpl;

import co.jeonguk.prj.board.service.BoardService;
import co.jeonguk.prj.board.service.BoardVO;
import co.jeonguk.prj.comm.Command;


public class BoardSelect implements Command {
	private BoardService dao = new BoardServiceImpl();
	@Override
	public void execute() {
		BoardVO board = new BoardVO();
		System.out.println("=========================");
		System.out.println("조회할 공지사항 번호를 입력하세요.");
		board.setBId(scn.nextInt());
		board = dao.boardSelect(board);
		
		System.out.println("번호 : " + board.getBId() + "      ");
		System.out.println("작성자 : " +board.getBWriter() + "      ");
		System.out.println("작성날짜 : " +board.getBWritedate() + "      ");
		System.out.println("제목 : " +board.getBTitele() + "      ");
		System.out.println("내용 : " +board.getBContents() + "      " );
		System.out.println("조회수 : " +board.getBHit() + "      "); 
	}

}
