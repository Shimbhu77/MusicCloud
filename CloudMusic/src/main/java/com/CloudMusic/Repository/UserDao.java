package com.CloudMusic.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CloudMusic.Model.User;

@Repository
public interface UserDao  extends JpaRepository<User, Integer>{

	public User findByEmail(String email);
}
