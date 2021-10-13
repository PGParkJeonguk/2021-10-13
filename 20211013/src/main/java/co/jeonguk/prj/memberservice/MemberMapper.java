package co.jeonguk.prj.memberservice;

import java.util.List;

public interface MemberMapper {
	List<MemberVO> memberSelcetList();
	MemberVO memberSelect(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
}
