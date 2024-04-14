package com.typhoon0678.apiserver.repository;

import com.typhoon0678.apiserver.domain.Todo;
import com.typhoon0678.apiserver.repository.search.TodoSearch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long>, TodoSearch {
}
