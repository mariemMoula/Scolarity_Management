package com.scolarity_management.dao;

import com.scolarity_management.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {

    // we are not writing a query since "name" is an attribute of Role entity
    Role findByName(String name);
}