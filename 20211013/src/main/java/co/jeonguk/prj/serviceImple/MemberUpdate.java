package co.jeonguk.prj.serviceImple;

import co.jeonguk.prj.comm.Command;
import co.jeonguk.prj.comm.GB;
import co.jeonguk.prj.memberservice.MemberService;
import co.jeonguk.prj.memberservice.MemberVO;

public class MemberUpdate implements Command {
	MemberService dao = new MemberServiceImpl();
	MemberVO member = new MemberVO();
	@Override
	public void execute() {
		
		System.out.println("이름을 입력하세요.");
		if(GB.NAME.equals(scn.nextLine())) {
			System.out.println("=========================");
			member.setId(GB.ID);
			System.out.println("변경할 이름을 입력하세요");
			member.setName(scn.nextLine());
			System.out.println("변경할 패스워드를 입력하세요");
			member.setPassword(scn.nextLine());

			int n = dao.memberUpdate(member);
			if( n != 0) {
				System.out.println("정상적으로 변경되었습니다.");
			}else {
				System.out.println("변경에 실패하였습니다.");
			}
		}else {
			System.out.println("본인만 수정이 가능합니다.");
		}
		
	}
}
