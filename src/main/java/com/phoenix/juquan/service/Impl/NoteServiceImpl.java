package com.phoenix.juquan.service.Impl;

import com.github.pagehelper.PageHelper;


import com.github.pagehelper.PageInfo;
import com.phoenix.juquan.common.Page;
import com.phoenix.juquan.common.PageParam;
import com.phoenix.juquan.dto.BriefNote;
import com.phoenix.juquan.mapper.NoteMapper;
import com.phoenix.juquan.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {
    @Autowired
    private NoteMapper noteMapper;

    @Override
    public Page<BriefNote> getBriefNotePage(PageParam pageParam){
        int pageNum = pageParam.getPageNum();
        int pageSize = pageParam.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<BriefNote> briefNoteList = noteMapper.getBriefNoteList();
        return new Page<>(new PageInfo<>(briefNoteList));
    }

    @Override
    public  BriefNote getBriefNoteInfo(long id){
        BriefNote briefNote = noteMapper.getNoteById(id);
        return briefNote;
    }
}
