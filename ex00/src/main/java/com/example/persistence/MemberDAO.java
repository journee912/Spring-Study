package com.example.persistence;

import com.example.domain.MemberVO;
public interface MemberDAO {
	public String getTime();
	
	public void insertMember(MemberVO vo);
	
	public MemberVO readMember(String userid) throws Exception;
	
	public MemberVO	readWithPW(String userid, String userpw) throws Exception;
}
