package com.SpicesDryFruitsOnlineStore_Test.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.SpicesDryFruitsOnlineStore_Test.entity.Cart;
import com.SpicesDryFruitsOnlineStore_Test.entity.User;



public interface CartDao extends CrudRepository<Cart, Integer>
{
	public List<Cart> findByUser(User user);

}
