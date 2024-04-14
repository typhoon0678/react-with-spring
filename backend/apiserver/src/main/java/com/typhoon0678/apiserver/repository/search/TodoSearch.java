package com.typhoon0678.apiserver.repository.search;

import com.typhoon0678.apiserver.domain.Todo;
import com.typhoon0678.apiserver.dto.PageRequestDTO;
import org.springframework.data.domain.Page;

public interface TodoSearch {

    Page<Todo> search1(PageRequestDTO pageRequestDTO);
}
