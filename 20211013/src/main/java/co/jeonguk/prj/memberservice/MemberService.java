package co.jeonguk.prj.memberservice;

import java.util.List;

public interface MemberService {
	List<MemberVO> MemberSelcetList();
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
}
