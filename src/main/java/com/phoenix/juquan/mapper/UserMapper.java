package com.phoenix.juquan.mapper;

import com.phoenix.juquan.MyMapper;
import com.phoenix.juquan.entity.User;
import org.apache.ibatis.annotations.*;

public interface UserMapper extends MyMapper<User> {
    @Insert("INSERT INTO user(createTime,openId,unionId,sessionKey,sessionId) VALUES (#{createTime},#{openId},#{unionId},#{sessionKey},#{sessionId})")
    @Options(useGeneratedKeys=true, keyProperty="id")
    Long newUser(User user);

    @Update("UPDATE user SET nickname = #{nickname},gender = #{gender},portrait = #{portrait},allLikes = #{allLikes},followNum=#{followNum},followerNum=#{followerNum},notesNum,juQuanNum = #{juQuanNum} WHERE id=#{id};")
    void updateUserById(@Param("nickname")String nickname,
                        @Param("gender")int gender,
                        @Param("portrait")String portrait,
                        @Param("allLikes")int allLikes,
                        @Param("followNum")int followNum,
                        @Param("followerNum")int followerNum,
                        @Param("juQuanNum")String juQuanNum,
                        @Param("notesNum")int notesNum,
                        @Param("id")Long id);

    @Update("UPDATE user SET juQuanNum=#{juQuanNum} WHERE id=#{id}")
    void updateJuQuanNum(@Param("juQuanNum")String juQuanNum,@Param("id")Long id);

    @Update("UPDATE user SET password=#{password} WHERE juQuanNum=#{juQuanNum}")
    int updatePasswordByJuQuanNum(@Param("password")String password,@Param("juQuanNum")String juQuanNum);

    @Select("SELECT password FROM user WHERE juQuanNum=#{juQuanNum}")
    String getPasswordByJuQuanNum(@Param("juQuanNum")String juQuanNum);

    @Select("SELECT id,juQuanNum,nickname,gender,schoolId,companyId,allLikes,follwerNum,followNum,notesNum,portrait FROM user WHERE juQuanNum=#{juQuanNum}")
    User getUserByJuQuanNum(String juQuanNum);

    @Select("SELECT * FROM user WHERE id=#{id}")
    User getUserById(Integer id);

}
