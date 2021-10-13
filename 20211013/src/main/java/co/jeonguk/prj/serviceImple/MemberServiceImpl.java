package co.jeonguk.prj.serviceImple;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.jeonguk.prj.common.DataSource;
import co.jeonguk.prj.memberservice.MemberMapper;
import co.jeonguk.prj.memberservice.MemberService;
import co.jeonguk.prj.memberservice.MemberVO;

public class MemberServiceImpl implements MemberService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private MemberMapper map = sqlSession.getMapper(MemberMapper.class);
	@Override
	
	public List<MemberVO> MemberSelcetList() {
		return map.memberSelcetList();
	}

	@Override
	public MemberVO memberSelect(MemberVO vo) {
		return map.memberSelect(vo);
	}

	@Override
	public int memberInsert(MemberVO vo) {
		return map.memberInsert(vo);
	}

	@Override
	public int memberUpdate(MemberVO vo) {
		return map.memberUpdate(vo);
	}

}
