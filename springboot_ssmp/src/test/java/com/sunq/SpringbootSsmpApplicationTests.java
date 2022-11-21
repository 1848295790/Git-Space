package com.sunq;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sunq.dao.BookDao;
import com.sunq.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootSsmpApplicationTests {

    @Resource
    private BookDao bookDao;

    @Test
    void contextLoads() {
//        分页查询
//        IPage page = new Page(1,5);
//        bookDao.selectPage(page,null);
//        添加数据
//        Book book = new Book();
//        book.setName("骆驼祥子");
//        book.setType("文学");
//        book.setDescription("鲁迅的文学著作");
//        bookDao.insert(book);

//        模糊查询(两种写法LambdaQueryWrapper和QueryWrapper)
        LambdaQueryWrapper<Book> lw = new LambdaQueryWrapper<Book>();
        lw.like(Book::getDescription,"spring");
//        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
//        queryWrapper.like("name","spring");
        bookDao.selectList(lw);


    }

}
