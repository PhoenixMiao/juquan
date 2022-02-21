package com.phoenix.juquan.mapper;

import com.phoenix.juquan.MyMapper;
import com.phoenix.juquan.dto.BriefRelation;
import com.phoenix.juquan.entity.Relation;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RelationMapper {
    @Select("SELECT store_id FROM relation WHERE script_id = #{script_id}")
    List<BriefRelation> getStoreIdByScriptId(@Param("script_id")long scriptId);

    @Insert("INSERT INTO relation VALUE(null,#{store_id},#{script_id})")
    void addRelation(@Param("store_id") long storeId,
                     @Param("script_id") long scriptId);

    @Select("SELECT script_id FROM relation WHERE store_id = #{store_id}")
    List<BriefRelation> getScriptIdByStoreId(@Param("store_id")long storeId);
}
