package com.SpicesDryFruitsOnlineStore_Test.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpicesDryFruitsOnlineStore_Test.entity.User;


@Repository
public interface UserDao extends JpaRepository<User, String> 
{
	
	public User findByUserName(String userName);
}