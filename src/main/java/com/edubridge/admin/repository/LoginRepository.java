package com.edubridge.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.admin.entities.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{

}
