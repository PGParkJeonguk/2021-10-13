package co.jeonguk.prj.board.serviceImpl;

import co.jeonguk.prj.board.service.BoardService;
import co.jeonguk.prj.board.service.BoardVO;
import co.jeonguk.prj.comm.Command;


public class BoardInsert implements Command {
	private BoardService dao = new BoardServiceImpl();
	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		System.out.println("====================");
		System.out.println("작성자를 입력하세요.");
		vo.setBWriter(scn.nextLine());
		System.out.println("제목을 입력하세요.");
		vo.setBTitele(scn.nextLine());
		System.out.println("내용을 입력하세요.");
		vo.setBContents(scn.nextLine());
		int n = dao.boardInsert(vo);
		if( n != 0) {
			System.out.println("정상적으로 등록되었습니다.");
		}else {
			System.out.println("등록에 실패하였습니다.");
		}
		
	}

}
