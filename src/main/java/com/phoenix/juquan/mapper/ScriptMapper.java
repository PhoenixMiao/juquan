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

    @Insert("INSERT INTO script VALUE(null,#{name},#{type},#{traits},0,0,0,0,#{content},0,0,0,#{picture})")
    void addToScript(@Param("name")String name,
                         @Param("type")String type,
                         @Param("traits")String traits,
                         @Param("content")String content,
                         @Param("picture")String picture);

    @Delete("DELETE FROM script WHERE id=#{id}")
    void deleteScriptById(@Param("id") Long id);
}
