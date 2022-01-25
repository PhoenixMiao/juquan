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

    @Select("SELECT id FROM store")
    List<BriefStore> getBriefStoreList();

    @Select("SELECT name FROM store")
    List<String> getAllName();

    @Select("SELECT * FROM store")
    List<Note> getAllStore();
}
