package com.vmware.cloud.demo.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vmware.cloud.demo.user.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

}
