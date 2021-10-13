package co.jeonguk.prj.board.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import co.jeonguk.prj.board.service.BoardService;
import co.jeonguk.prj.board.service.BoardVO;
import co.jeonguk.prj.comm.Command;

public class BoardList implements Command {
	private BoardService dao = new BoardServiceImpl();
	@Override
	public void execute() {
		List<BoardVO> boards = new ArrayList<BoardVO>();
		boards = dao.boardSelectList();
		
		System.out.println("===========================");
		for(BoardVO vo : boards) {
			System.out.print(vo.getBId() + " : ");
			System.out.print(vo.getBWriter() + " : ");
			System.out.print(vo.getBWritedate() + " : ");
			System.out.print(vo.getBTitele() + " : ");
			System.out.print(vo.getBHit() + " : \n");
			System.out.println("===========================");
		}
		
	}
}
