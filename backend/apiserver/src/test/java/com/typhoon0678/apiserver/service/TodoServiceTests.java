package com.typhoon0678.apiserver.service;

import com.typhoon0678.apiserver.dto.PageRequestDTO;
import com.typhoon0678.apiserver.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
@Log4j2
public class TodoServiceTests {

    @Autowired
    TodoService todoService;

    @Test
    public void testGet() {

        Long tno = 1L;

        log.info(todoService.get(tno));
    }

    @Test
    public void testRegister() {

        TodoDTO todoDTO = TodoDTO.builder()
                .title("Title...")
                .content("Content...")
                .dueDate(LocalDate.of(2024, 4, 30))
                .build();

        log.info(todoService.register(todoDTO));
    }

    @Test
    public void testModify() {

        Long tno = 1L;

        TodoDTO todoDTO = TodoDTO.builder()
                .tno(tno)
                .title("Update Title...")
                .content("Update Content...")
                .dueDate(LocalDate.of(2024, 4, 30))
                .build();

        todoService.modify(todoDTO);

    }

    @Test
    public void testGetList() {

        PageRequestDTO pageRequestDTO = PageRequestDTO.builder().page(11).build();

        log.info(todoService.getList(pageRequestDTO));
    }
}
