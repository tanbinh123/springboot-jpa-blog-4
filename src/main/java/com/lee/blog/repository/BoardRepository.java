package com.lee.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lee.blog.model.Board;

public interface BoardRepository extends JpaRepository<Board,Integer> {
}
