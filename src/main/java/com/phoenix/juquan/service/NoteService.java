package com.phoenix.juquan.service;

import com.phoenix.juquan.common.Page;
import com.phoenix.juquan.common.PageParam;
import com.phoenix.juquan.dto.BriefNote;

public interface NoteService {
    Page<BriefNote> getBriefNotePage(PageParam pageParam);

    BriefNote getBriefNoteInfo(long id);

    void deleteNoteById(long id);
}
