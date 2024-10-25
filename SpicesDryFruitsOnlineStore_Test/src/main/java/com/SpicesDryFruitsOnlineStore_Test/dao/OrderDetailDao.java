package com.SpicesDryFruitsOnlineStore_Test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpicesDryFruitsOnlineStore_Test.entity.OrderDetail;
import com.SpicesDryFruitsOnlineStore_Test.entity.User;



public interface OrderDetailDao extends JpaRepository<OrderDetail, Integer>
{

	public List<OrderDetail> findByUser(User user);
	
	public List<OrderDetail> findByOrderStatus(String status);
}
