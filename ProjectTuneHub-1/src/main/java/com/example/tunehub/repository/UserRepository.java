package com.example.tunehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.tunehub.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>
{

	public User findByEmail(String email);








}
