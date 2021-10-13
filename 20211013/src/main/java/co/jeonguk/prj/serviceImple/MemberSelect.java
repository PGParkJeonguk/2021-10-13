package co.jeonguk.prj.serviceImple;

import co.jeonguk.prj.comm.Command;
import co.jeonguk.prj.comm.GB;
import co.jeonguk.prj.memberservice.MemberService;
import co.jeonguk.prj.memberservice.MemberVO;

public class MemberSelect implements Command {
	private MemberService dao = new MemberServiceImpl();

	@Override
	public void execute() {
		MemberVO member = new MemberVO();
		System.out.println("사용자의 이름을 입력하세요.");
		if(GB.NAME.equals(scn.nextLine())) {
			System.out.println("=========================");
			member.setId(GB.ID);
			member = dao.memberSelect(member);
			System.out.println("ID : " + member.getId());
			System.out.println("이름 : " + member.getName());
			System.out.println("PASSWORD : " + member.getPassword());
			System.out.println("전화번호 : " + member.getTel());
			System.out.println("주소 : " + member.getAddress());
			System.out.println("권환 : " + member.getAuthor());
		}else {
			System.out.println("이름이 일치하지 않습니다.");
		}
		
	}

}
