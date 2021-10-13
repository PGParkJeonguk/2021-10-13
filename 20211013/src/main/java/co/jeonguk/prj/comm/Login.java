package co.jeonguk.prj.comm;

import co.jeonguk.prj.memberservice.MemberService;
import co.jeonguk.prj.memberservice.MemberVO;
import co.jeonguk.prj.serviceImple.MemberServiceImpl;

public class Login {
	public void run() {
		MemberService dao = new MemberServiceImpl();
		MemberVO member;
		boolean b =false;
		do {
			member = new MemberVO();
			System.out.println("======로 그 인======");
			System.out.println("아이디를 입력하세요.");
			member.setId(GB.scn.nextLine());
			System.out.println("패스워드를 입력하세요.");
			member.setPassword(GB.scn.nextLine());
			member = dao.memberSelect(member);
			
			if(member != null) {
				GB.NAME = member.getName();
				GB.AUTHOR = member.getAuthor();
				GB.ID = member.getId();
				b=true;
			}else {
				System.out.println("사용자의 아이디 또는 패스워드가 틀렸습니다.");
				GB.scn.close();
			}
		}while(!b);

}

}
