package com.phoenix.juquan.service;

import com.phoenix.juquan.common.Page;
import com.phoenix.juquan.common.PageParam;
import com.phoenix.juquan.dto.BriefNote;
import com.phoenix.juquan.dto.BriefStore;

public interface StoreService {
    Page<BriefStore> getBriefStorePage(PageParam pageParam);

    BriefStore getBriefStoreInfo(Long id);

    void AddToStore(String name, String location, String telephone, String content, String picture);
}
