package co.jeonguk.prj.board.serviceImpl;

import co.jeonguk.prj.board.service.BoardService;
import co.jeonguk.prj.board.service.BoardVO;
import co.jeonguk.prj.comm.Command;
import co.jeonguk.prj.comm.GB;

public class BoardUpdate implements Command {

	@Override
	public void execute() {
		BoardService dao = new BoardServiceImpl();
		BoardVO vo = new BoardVO();

		System.out.println("=========================");
		System.out.println("변경할 글 번호를 입력하세요.");
		vo.setBId(GB.scn.nextInt());GB.scn.nextLine();
		vo = dao.boardSelect(vo);
		if (vo != null) {
			if (vo.getBWriter().equals(GB.NAME)) {
				System.out.println("=========================");
				System.out.println("변경할 내용을 입력하세요.");
				vo.setBContents(GB.scn.nextLine());
				int n = dao.boardUpdate(vo);
				String mes = (n != 0) ? "수정성공" : "수정실패";
				System.out.println(mes);
			} else {
				System.out.println("작성자만 수정이 가능합니다.");
			}
		} else {
			System.out.println("존재하지않는 게시글입니다.");
		}
		System.out.println("=========================");

	}

}
