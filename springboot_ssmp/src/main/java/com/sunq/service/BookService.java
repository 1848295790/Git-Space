package com.sunq.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sunq.entity.Book;

import java.util.List;

public interface BookService {
    //查询用户
    Book findById(Integer id);

    List<Book> getAll();

//    分页查询
    IPage<Book> getPage(int currentPage, int pageSize);

    //    根据条件查询
    IPage<Book> getPage(int currentPage, int pageSize, Book book);

    //保存用户
    Boolean saveBook(Book book);
    //修改用户
    Boolean update(Book book);
    //根据id删除用户
    Boolean delete(Integer id);
}
