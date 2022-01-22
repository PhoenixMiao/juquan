package com.phoenix.juquan.mapper;

import com.phoenix.juquan.MyMapper;
import com.phoenix.juquan.entity.Note;
import com.phoenix.juquan.entity.Script;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ScriptMapper extends  MyMapper<Script>{
    @Select("SELECT * FROM script WHERE id=#{id}")
    Note getStoreByID(@Param("id") long id);

    @Select("SELECT name FROM script")
    List<String> getAllName();

    @Select("SELECT * FROM script")
    List<Note> getAllStore();
}
