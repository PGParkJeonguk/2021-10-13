package co.jeonguk.prj.serviceImple;

import java.util.ArrayList;
import java.util.List;

import co.jeonguk.prj.comm.Command;
import co.jeonguk.prj.comm.GB;
import co.jeonguk.prj.memberservice.MemberService;
import co.jeonguk.prj.memberservice.MemberVO;

public class MemberList implements Command {

	@Override
	public void execute() {
		if (GB.AUTHOR.equals("ADMIN")) {
			MemberService dao = new MemberServiceImpl();
			List<MemberVO> member = new ArrayList<MemberVO>();
			member = dao.MemberSelcetList();
			System.out.println("===========================");
			if (member != null) {
				for (MemberVO vo : member) {
					System.out.print(vo.getId() + " : ");
					System.out.print(vo.getName() + " : ");
					System.out.print(vo.getPassword() + " : ");
					System.out.print(vo.getTel() + " : ");
					System.out.print(vo.getAddress() + " : ");
					System.out.println(vo.getAuthor());
					System.out.println("===========================");
				}
			} else {
				System.out.println("등록된 회원이 없습니다.");
			}
		} else {
			System.out.println("ADMIN 계정으로 접속해야 사용할 수 있습니다.");
		}

		System.out.println("===========================");
	}
}
