package com.edubridge.admin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.edubridge.admin.entities.Admin;
import com.edubridge.admin.entities.Member;
import com.edubridge.admin.repository.AdminRepository;
import com.edubridge.admin.repository.MemberRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class RepositoryTests {
 
 @Autowired
 private TestEntityManager testEntityManager;
 
 @Autowired
 AdminRepository adminRespository;
 
 @Autowired
 MemberRepository memberRepository;
 
 @Test
 public void testCreateAdmin() {
     Admin admin = new Admin();
     admin.setDealerEmail("admin@gmail.com");
     admin.setDealerName("admin");
     Admin savedAdmin = adminRespository.save(admin);
      
 }
 
 @Test
 public void testCreateMember() {
  Member member = new Member();
  member.setUserEmail("tom@gmail.com");
  member.setUserName("Tom");
  member.setUserPhone("1212112212");
  
  Member savedEmployee = memberRepository.save(member);
   
 }
}