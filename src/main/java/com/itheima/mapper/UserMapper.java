package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from dual")
    public static List<User> list() {
        System.out.println("ll");
        System.out.println("ll");
        System.out.println("ll");
        System.out.println("ll");
        System.out.println("ll");
        System.out.println("ll");
        System.out.println("ll");
        System.out.println("ll");
        System.out.println("llllll");
        System.out.println("llllll666");
        System.out.println("lll777");
        System.out.println("lll888888");
        return null;

    }

}
