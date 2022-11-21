package com.sunq.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sunq.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Mapper
public interface BookDao extends BaseMapper<Book> {


}
