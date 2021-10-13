package co.jeonguk.prj.board.service;

import java.util.List;

public interface BoardService {	
	List<BoardVO> boardSelectList();
	BoardVO boardSelect(BoardVO vo);
	int boardInsert(BoardVO vo);
	int boardUpdate(BoardVO vo);
	int boardDelete(BoardVO vo);
	//4
}
