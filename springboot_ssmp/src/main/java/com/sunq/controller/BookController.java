package com.sunq.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.sunq.controller.utils.R;
import com.sunq.entity.Book;
import com.sunq.service.BookService;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.Console;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;


//    查询
    @GetMapping("{id}")
    public R findById(@PathVariable Integer id){
        R r = new R(true,(bookService.findById(id)));
        return r;
    }
//    分页查询
    @GetMapping("{currentPage}/{pageSize}")
    public R  getPage(@PathVariable int currentPage,@PathVariable int pageSize, Book book){
        System.out.println(book);
        IPage<Book> page = bookService.getPage(currentPage,pageSize,book);
//        如果当前页码值大于总页码值，那么重新执行查询操作，使用最大页码值作为当前页码值
        if (currentPage > page.getPages()){
            page = bookService.getPage((int) page.getPages(),pageSize,book);
        }
        return new R(true,page);
    }
    @GetMapping
    public R getAll(){
        R r = new R(true,bookService.getAll());
        return r;
    }

//    保存
    @PostMapping
    public R save(@RequestBody Book book){
        R r = new R(bookService.saveBook(book));
        return r;
    }

//    更新
    @PutMapping
    public R updataBook(@RequestBody Book book){
        R r = new R(bookService.update(book));
        return r;
    }

//    删除
    @DeleteMapping("{id}")
    public R deleteById(@PathVariable Integer id){
        R r = new R(bookService.delete(id));
        return r;
    }


}
