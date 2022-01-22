package com.example.Biblio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Biblio.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
