package me.yeonsu.springbootdeveloper.repository;

import me.yeonsu.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
