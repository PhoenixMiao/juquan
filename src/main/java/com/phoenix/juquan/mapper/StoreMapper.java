package com.phoenix.juquan.mapper;

import com.phoenix.juquan.MyMapper;
import com.phoenix.juquan.entity.Note;
import com.phoenix.juquan.entity.Store;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface StoreMapper extends MyMapper<Store>{
    @Select("SELECT * FROM store WHERE id=#{id}")
    Note getStoreByID(@Param("id") long id);

    @Select("SELECT name FROM store")
    List<String> getAllName();

    @Select("SELECT * FROM store")
    List<Note> getAllStore();
}
