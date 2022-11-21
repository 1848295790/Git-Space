package com.sunq.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//lombok
@Data

//当实体类名与数据库表名不一致时，加入一下代码
@TableName("tbl_book")
public class Book {

    private Integer id;
    private String type;
    private String name;
    private String description;
}
