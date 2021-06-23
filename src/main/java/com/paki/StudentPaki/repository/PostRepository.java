package com.paki.StudentPaki.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paki.StudentPaki.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
