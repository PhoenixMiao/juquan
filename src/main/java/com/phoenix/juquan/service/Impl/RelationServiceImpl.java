package com.phoenix.juquan.service.Impl;

import com.phoenix.juquan.dto.BriefRelation;
import com.phoenix.juquan.mapper.RelationMapper;
import com.phoenix.juquan.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationServiceImpl implements RelationService {
    @Autowired
    private RelationMapper relationMapper;

    @Override
    public List<BriefRelation> getStoreIdByScriptId(long scriptId){
        return relationMapper.getStoreIdByScriptId(scriptId);
    }

    @Override
    public void addRelation(long storeId, long scriptId){
        relationMapper.addRelation(storeId, scriptId);
    }

    @Override
    public List<BriefRelation> getScriptIdByStoreId(long storeId){
        return relationMapper.getScriptIdByStoreId(storeId);
    }
}
