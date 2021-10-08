package com.edubridge.admin.service;

import java.util.List;

import com.edubridge.admin.entities.Member;


public interface MemberService {
	
   public Member saveMember(Member member);
	
	public List<Member> getAllMember();
	
	public Member getMemberById( int userId);
	
	public Member updateMember(int userId , Member member);
	
	public void deleteMember(int userId);
	

}
