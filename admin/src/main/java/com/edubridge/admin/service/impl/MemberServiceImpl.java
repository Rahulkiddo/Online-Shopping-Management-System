package com.edubridge.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.admin.entities.Member;
import com.edubridge.admin.exceptiom.RecordNotFoundException;
import com.edubridge.admin.repository.MemberRepository;
import com.edubridge.admin.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberRepository memberRepo;

	@Override
	public Member saveMember(Member member) {
		return memberRepo.save(member);
	}

	@Override
	public List<Member> getAllMember() {
		return memberRepo.findAll();
	}

	@Override
	public Member getMemberById(int userId) {
		return memberRepo.findById(userId)
				.orElseThrow(() -> new RecordNotFoundException("Member with "+userId+" not Found"));

	}

	@Override
	public Member updateMember(int userId, Member member) {
		Member m1 = getMemberById(userId);
		m1.setUserName(member.getUserName());
		return memberRepo.save(m1);
	}

	@Override
	public void deleteMember(int userId) {
		memberRepo.deleteById(userId);
	}

}
