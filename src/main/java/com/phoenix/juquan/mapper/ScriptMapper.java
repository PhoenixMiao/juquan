package com.phoenix.juquan.mapper;

import com.phoenix.juquan.MyMapper;
import com.phoenix.juquan.dto.BriefScript;
import com.phoenix.juquan.entity.Note;
import com.phoenix.juquan.entity.Script;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ScriptMapper extends  MyMapper<Script>{
    @Select("SELECT * FROM script WHERE id=#{id}")
    BriefScript getScriptById(@Param("id") long id);

    @Select("SELECT id FROM script")
    List<BriefScript> getBriefScriptList();

    @Select("SELECT * FROM script")
    List<BriefScript> getAllStore();
}
