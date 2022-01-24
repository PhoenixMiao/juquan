package com.phoenix.juquan.service;

import com.phoenix.juquan.common.Page;
import com.phoenix.juquan.common.PageParam;
import com.phoenix.juquan.dto.BriefNote;
import com.phoenix.juquan.dto.BriefScript;
import com.phoenix.juquan.dto.BriefStore;

public interface ScriptService {
    Page<BriefScript> getBriefScriptPage(PageParam pageParam);

    BriefScript getBriefScriptInfo(Long id);
}
