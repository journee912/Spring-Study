package com.example.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.domain.Criteria;
import com.example.domain.ReplyVO;

@Repository
public class ReplyDAOImpl implements ReplyDAO {
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.example.mapper.ReplyMapper";

	@Override
	public List<ReplyVO> list(Integer bno) throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".list", bno);
	}

	@Override
	public void create(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.insert(namespace+".create", vo);
		
	}

	@Override
	public void update(ReplyVO vo) throws Exception {
		// TODO Auto-generated method stub
		session.update(namespace+".update", vo);
	}

	@Override
	public void delete(Integer rno) throws Exception {
		// TODO Auto-generated method stub
		session.update(namespace+".delete", rno);
		
	}
	@Override
	public List<ReplyVO> listPage(Integer bno, Criteria cri) throws Exception{
		Map<String, Object> paramMap = new HashMap<>();
		
		paramMap.put("bno", bno);
		paramMap.put("cri", cri);
		
		return session.selectList(namespace+".listPage", paramMap);
	}
	
	@Override
	public int count(Integer bno) throws Exception{
		return session.selectOne(namespace + ".count", bno);
	}

}
