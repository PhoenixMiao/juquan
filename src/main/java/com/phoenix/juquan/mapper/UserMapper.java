package com.phoenix.juquan.mapper;

import com.phoenix.juquan.MyMapper;
import com.phoenix.juquan.entity.User;
import org.apache.ibatis.annotations.*;

public interface UserMapper extends MyMapper<User> {
    @Insert("INSERT INTO user(createTime,openId,unionId,sessionKey,sessionId) VALUES (#{createTime},#{openId},#{unionId},#{sessionKey},#{sessionId})")
    @Options(useGeneratedKeys=true, keyProperty="id")
    Long newUser(User user);

    @Update("UPDATE user SET chuangNum=#{chuangNum} WHERE id=#{id}")
    void updateChuangNum(@Param("chuangNum")String chuangNum,@Param("id")Long id);
}
