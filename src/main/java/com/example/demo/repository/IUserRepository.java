package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;
@Repository
public interface IUserRepository extends JpaRepository<User,Long > {
	
	@Query("from User where  userId= ?1 and password = ?2")
	List<User> findByUserIdAndPassword(Long userId, String password);
	@Query("from User where userId = ?1")
	List<User> findByuserId(Long userId);

}
