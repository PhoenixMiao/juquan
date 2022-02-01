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
    @Select("SELECT storeId FROM relation WHERE scriptId = #{scriptId}")
    List<BriefRelation> getStoreIdByScriptId(@Param("scriptId")long scriptId);

    @Insert("INSERT INTO relation VALUE(null,#{storeId},#{scriptId})")
    void addRelation(@Param("storeId") long storeId,
                     @Param("scriptId") long scriptId);

    @Select("SELECT scriptId FROM relation WHERE storeId = #{storeId}")
    List<BriefRelation> getScriptIdByStoreId(@Param("storeId")long storeId);
}
