package com.psl.miniproject21.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psl.miniproject21.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
