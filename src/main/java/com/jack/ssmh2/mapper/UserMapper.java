package com.jack.ssmh2.mapper;

import com.jack.ssmh2.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from User where id = #{id}")
    User selectUserById(@Param("id") Long id);
}
