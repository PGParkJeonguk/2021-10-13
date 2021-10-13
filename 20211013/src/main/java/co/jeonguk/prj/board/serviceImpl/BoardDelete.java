package co.jeonguk.prj.board.serviceImpl;

import co.jeonguk.prj.board.service.BoardService;
import co.jeonguk.prj.board.service.BoardVO;
import co.jeonguk.prj.comm.Command;
import co.jeonguk.prj.comm.GB;

public class BoardDelete implements Command {

	@Override
	public void execute() {
		if (GB.AUTHOR.equals("ADMIN")) {
			BoardService dao = new BoardServiceImpl();
			BoardVO vo = new BoardVO();
			System.out.println("=========================");
			System.out.println("삭제할 글 번호를 입력하세요.");
			vo.setBId(scn.nextInt());
			int n = dao.boardDelete(vo);
			if (n != 0) {
				System.out.println("정상적으로 삭제되었습니다.");
			} else {
				System.out.println("게시글 삭제에 실패하였습니다.");
			}
		}else {
			System.out.println("관리자만 삭제 가능합니다.");
		}
	}

}
