package com.edubridge.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.admin.entities.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer>{

	
}
