package com.SpicesDryFruitsOnlineStore_Test.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.SpicesDryFruitsOnlineStore_Test.entity.Role;


@Repository
public interface RoleDao extends JpaRepository<Role, String> {

}
