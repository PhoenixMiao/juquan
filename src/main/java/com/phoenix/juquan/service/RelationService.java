package com.phoenix.juquan.service;

import com.phoenix.juquan.common.Page;
import com.phoenix.juquan.common.PageParam;
import com.phoenix.juquan.common.Result;
import com.phoenix.juquan.dto.BriefNote;
import com.phoenix.juquan.dto.BriefRelation;

import java.util.List;

public interface RelationService {
    List<BriefRelation> getStoreIdByScriptId(long scriptId);

    List<BriefRelation> getScriptIdByStoreId(long storeId);

    void addRelation(long storeId, long scriptId);
}
