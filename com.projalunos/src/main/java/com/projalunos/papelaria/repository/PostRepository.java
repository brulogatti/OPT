package com.projalunos.papelaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projalunos.papelaria.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> { }


