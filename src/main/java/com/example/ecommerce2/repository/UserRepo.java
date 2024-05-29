package com.example.ecommerce2.repository;

import com.example.ecommerce2.model.entity.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User1,Long> {
}
