package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;
//https://www.google.com/search?q=jparepository&oq=JpaRepository&gs_lcrp=EgRlZGdlKg0IABAAGJECGIAEGIoFMg0IABAAGJECGIAEGIoFMgwIARAAGBQYhwIYgAQyDQgCEAAYkQIYgAQYigUyEAgDEAAYkQIYiwMYgAQYigUyCggEEAAYiwMYgAQyDAgFEAAYQxiABBiKBTIKCAYQABiLAxiABDIKCAcQABiLAxiABNIBCDEzODZqMWoxqAIAsAIA&sourceid=chrome&ie=UTF-8#fpstate=ive&vld=cid:98f45bd3,vid:rNrzW6WVggk,st:0
//kobler opp User med Id
public interface UserRespository extends JpaRepository<User, Long> {
    //legger til en metode som lister ut bruker basert på type(admin/user) --> oppg 2c
    List<User> findByType(String type);
}
