package co.jeonguk.prj.serviceImple;

import co.jeonguk.prj.comm.Command;
import co.jeonguk.prj.memberservice.MemberService;
import co.jeonguk.prj.memberservice.MemberVO;

public class MemberInsert implements Command {
	

	@Override
	public void execute() {
		if(co.jeonguk.prj.comm.GB.AUTHOR.equals("ADMIN")) {
			MemberService dao = new MemberServiceImpl();
			MemberVO member = new MemberVO();
			System.out.println("=========================");
			System.out.println("생성할 아이디를 입력하세요.");
			member.setId(scn.nextLine());
			System.out.println("이름을 입력하세요.");
			member.setName(scn.nextLine());
			System.out.println("비밀번호를 입력하세요.");
			member.setPassword(scn.nextLine());
			
			int n = dao.memberInsert(member);
			if( n != 0 ) {
				System.out.println("정상적으로 생성되었습니다.");
			}else {
				System.out.println("생성에 실패하였습니다.");
			}
		}else {
			System.out.println("권한이 없습니다. ADMIN계정으로 접속하십시오.");
		}
	
		}
		
}
