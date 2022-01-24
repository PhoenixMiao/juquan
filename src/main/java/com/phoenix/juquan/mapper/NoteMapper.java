package com.phoenix.juquan.mapper;

import com.github.pagehelper.PageHelper;
import com.phoenix.juquan.MyMapper;
import com.phoenix.juquan.dto.BriefNote;
import com.phoenix.juquan.entity.Note;
import com.phoenix.juquan.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface NoteMapper extends MyMapper<Note> {
    @Insert("INSERT INTO user(createTime,openId,unionId,sessionKey,sessionId) VALUES (#{createTime},#{openId},#{unionId},#{sessionKey},#{sessionId})")
    @Options(useGeneratedKeys=true, keyProperty="id")
    Long newUser(User user);

    @Select("SELECT * FROM note WHERE id=#{id}")
    BriefNote getNoteById(@Param("id") long id);

    @Select("SELECT id FROM note")
    List<BriefNote> getBriefNoteList();

    @Select("SELECT title FROM note")
    List<String> getAllTitle();

    @Select("SELECT * FROM note")
    List<Note> getAllNote();

}
