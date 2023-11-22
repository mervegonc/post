package com.m.dontry.dataAccess;


import org.springframework.data.jpa.repository.JpaRepository;

import com.m.dontry.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
       
}
