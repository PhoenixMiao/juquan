package com.phoenix.juquan.mapper;

import com.phoenix.juquan.MyMapper;
import com.phoenix.juquan.dto.BriefNote;
import com.phoenix.juquan.dto.BriefStore;
import com.phoenix.juquan.entity.Note;
import com.phoenix.juquan.entity.Store;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface StoreMapper extends MyMapper<Store>{
    @Select("SELECT * FROM store WHERE id=#{id}")
    BriefStore getStoreById(@Param("id") long id);

    @Insert("INSERT INTO store VALUE(null,#{name},#{location},#{telephone},0,0,0,0,#{content},0,0,0,#{picture})")
    void addToStore(@Param("name")String name,
                     @Param("location")String location,
                     @Param("telephone")String telephone,
                     @Param("content")String content,
                     @Param("picture")String picture);

    @Select("SELECT id FROM store")
    List<BriefStore> getBriefStoreList();

    @Select("SELECT name FROM store")
    List<String> getAllName();

    @Select("SELECT * FROM store")
    List<Note> getAllStore();
}
