package co.jeonguk.prj.menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import co.jeonguk.prj.board.serviceImpl.BoardDelete;
import co.jeonguk.prj.board.serviceImpl.BoardInsert;
import co.jeonguk.prj.board.serviceImpl.BoardList;
import co.jeonguk.prj.board.serviceImpl.BoardSelect;
import co.jeonguk.prj.board.serviceImpl.BoardUpdate;
import co.jeonguk.prj.comm.Command;
import co.jeonguk.prj.serviceImple.MemberInsert;
import co.jeonguk.prj.serviceImple.MemberList;
import co.jeonguk.prj.serviceImple.MemberSelect;
import co.jeonguk.prj.serviceImple.MemberUpdate;

public class Menu {
	private Map<String, Command> map = new HashMap<String, Command>();

	public void Map() {
		map.put("memberSelcetList", new MemberList());
		map.put("memberSelect", new MemberSelect());
		map.put("memberInsert", new MemberInsert());
		map.put("memberUpdate", new MemberUpdate());
		map.put("boardList", new BoardList());
		map.put("boardSelect", new BoardSelect());
		map.put("boardInsert", new BoardInsert());
		map.put("boardUpdate", new BoardUpdate());
		map.put("boardDelete", new BoardDelete());

	}

	private void menu() {
		while (true) {
			mainMenu();
			int jobNo = co.jeonguk.prj.comm.GB.scn.nextInt();
			switch (jobNo) {
			case 1:
				memberMangement();
				break;
			case 2:
				boardMangement();
				break;
			case 3:
				System.out.println("프로그램 완전히 종료합니다.");
				co.jeonguk.prj.comm.GB.scn.close();
				return;
			default:
				System.out.println("잘못된 키를 입력하였습니다.");
			}
		}
	}

	private void boardMangement() {
		boolean b = false;
		do {
			boardTitle();
			int jobNo = co.jeonguk.prj.comm.GB.scn.nextInt();
			switch (jobNo) {
			case 1:
				executRun("boardList");
				break;
			case 2:
				executRun("boardSelect");
				break;
			case 3:
				executRun("boardInsert");
				break;
			case 4:
				executRun("boardUpdate");
				break;
			case 5:
				executRun("boardDelete");
				break;
			case 6:
				System.out.println("메뉴화명으로 돌아갑니다.");
				b = true;
				break;
			default:
				System.out.println("잘못된 키를 입력하였습니다.");
			}
		} while (!b);
	}

	private void memberMangement() {
		boolean b = false;
		do {
			memberTitle();
			int jobNo = co.jeonguk.prj.comm.GB.scn.nextInt();
			switch (jobNo) {
			case 1:
				executRun("memberSelcetList");
				break;
			case 2:
				executRun("memberSelect");
				break;
			case 3:
				executRun("memberInsert");
				break;
			case 4:
				executRun("memberUpdate");
				break;
			case 5:
				executRun("memberDelete");
				break;
			case 6:
				System.out.println("메뉴화명으로 돌아갑니다.");
				b = true;
				break;
			default:
				System.out.println("잘못된 키를 입력하였습니다.");
			}
		} while (!b);

	}

	private void mainMenu() {
		System.out.println("==================");
		System.out.println("=== 1. 멤버 관리 ===");
		System.out.println("=== 2. 공지 관리 ===");
		System.out.println("====3. 종    료 ====");
		System.out.println("==================");
		System.out.println("작업번호를 넣어주세요");
	}

	private void boardTitle() {
		System.out.println("====================");
		System.out.println("=== 1. 공지사항 목록 ===");
		System.out.println("=== 2. 공지사항 조회 ===");
		System.out.println("=== 3. 공지사항 등록 ===");
		System.out.println("=== 4. 공지사항 수정 ===");
		System.out.println("=== 5. 공지사항 삭제 ===");
		System.out.println("=== 6. 메인메뉴 이동 ===");
		System.out.println("====================");
		System.out.println("작업번호를 넣어주세요");

	}

	private void memberTitle() {
		System.out.println("=====================");
		System.out.println("=== 1. 회원목록 조회 ===");
		System.out.println("=== 2. 회원정보 조회 ===");
		System.out.println("=== 3. 회원정보 등록 ===");
		System.out.println("=== 4. 회원정보 수정 ===");
		System.out.println("=== 5. 회원정보 삭제 ===");
		System.out.println("=== 6. 메인메뉴 이동 ===");
		System.out.println("=====================");
		System.out.println("작업번호를 넣어주세요");
	}

	private void executRun(String str) {
		Command command = map.get(str);
		command.execute();
	}

	public void run() {
		Map();
		menu();
	}
}
