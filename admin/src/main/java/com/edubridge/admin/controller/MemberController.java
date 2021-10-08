package com.edubridge.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.admin.entities.Member;
import com.edubridge.admin.exceptiom.InvalidInputException;
import com.edubridge.admin.service.MemberService;

@RestController
public class MemberController {
	
	@Autowired
	MemberService memberService;
	

	@PostMapping("/mem/add")
	public Member saveMember(@RequestBody Member member) {
		return memberService.saveMember(member);
	}
	
	@GetMapping("/mem/member")
	public List<Member> getAllMember() {
	return memberService.getAllMember();
	}
	
	@GetMapping("/mem/{id}")
	public ResponseEntity<Member> getMemberById(@PathVariable int id) {
		if(id <= 0) {
			throw new InvalidInputException(id +" is not a valid User ID");
		}
		Member member = memberService.getMemberById(id);
			return new ResponseEntity<Member>(member , HttpStatus.NOT_FOUND);
		}
	
	
	@DeleteMapping("/mem/{id}")
	public String deleteMember(@PathVariable int id) {
		if(id <= 0) {
			throw new InvalidInputException(id +" is not a valid User ID");
		}
		memberService.deleteMember(id);
		return "Deleted Successfully";
	}
	
	@PutMapping("/mem/{id}")
	public ResponseEntity<Member> updateMember (@PathVariable(value ="id") int userId , @RequestBody Member member) {
		if(userId <= 0) {
			throw new InvalidInputException(userId +" is not a valid User ID");
		}
		Member updatedMember = memberService.updateMember(userId, member);
		return ResponseEntity.ok(updatedMember);
	}

}
