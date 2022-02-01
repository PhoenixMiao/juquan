package com.phoenix.juquan.service.Impl;

import com.github.pagehelper.PageHelper;


import com.github.pagehelper.PageInfo;
import com.phoenix.juquan.common.Page;
import com.phoenix.juquan.common.PageParam;
import com.phoenix.juquan.dto.BriefNote;
import com.phoenix.juquan.dto.BriefStore;
import com.phoenix.juquan.mapper.StoreMapper;
import com.phoenix.juquan.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreMapper storeMapper;

    @Override
    public Page<BriefStore> getBriefStorePage(PageParam pageParam){
        int pageNum = pageParam.getPageNum();
        int pageSize = pageParam.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<BriefStore> briefStoreList = storeMapper.getBriefStoreList();
        return new Page<>(new PageInfo<>(briefStoreList));
    }

    @Override
    public BriefStore getBriefStoreInfo(Long id){

        return storeMapper.getStoreById(id);
    }

    public void AddToStore(String name, String location, String telephone, String content, String picture){
        storeMapper.addToStore(name, location, telephone, content, picture);
    }

}
