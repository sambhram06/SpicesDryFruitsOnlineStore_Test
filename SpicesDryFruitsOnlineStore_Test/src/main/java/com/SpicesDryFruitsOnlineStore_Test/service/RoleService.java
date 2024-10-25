package com.SpicesDryFruitsOnlineStore_Test.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpicesDryFruitsOnlineStore_Test.dao.RoleDao;
import com.SpicesDryFruitsOnlineStore_Test.entity.Role;



@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}