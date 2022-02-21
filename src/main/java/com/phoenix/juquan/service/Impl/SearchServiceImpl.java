package com.phoenix.juquan.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.phoenix.juquan.common.Page;
import com.phoenix.juquan.controller.search.SearchRequest;
import com.phoenix.juquan.controller.search.SearchResponse;
import com.phoenix.juquan.dto.BriefNote;
import com.phoenix.juquan.entity.Note;
import com.phoenix.juquan.entity.SearchRecord;
import com.phoenix.juquan.mapper.NoteMapper;
import com.phoenix.juquan.mapper.SearchRecordMapper;
import com.phoenix.juquan.service.SearchService;
import com.phoenix.juquan.util.SessionUtils;
import com.phoenix.juquan.util.TimeUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    SessionUtils sessionUtils;

    @Autowired
    NoteMapper noteMapper;

    @Autowired
    SearchRecordMapper searchRecordMapper;

    @Override
    public Page<Note> searchNote(SearchRequest searchRequest){
        Example example = new Example(Note.class);
        //example.selectProperties("title","content");

        if (!StringUtils.isEmpty(searchRequest.getContents())) {
            Example.Criteria contentCriteria = example.createCriteria();
            contentCriteria.orLike("title", "%"+searchRequest.getContents()+"%");
            //contentCriteria.orLike("content", "%"+searchRequest.getContents()+"%");
            example.and(contentCriteria);



            SearchRecord searchRecord = SearchRecord.builder()
                    .JuQuanNum(sessionUtils.getUserJuQuanNum())
                    .contents(searchRequest.getContents())
                    .create_time(TimeUtil.getCurrentTimestamp())
                    .build();
            searchRecordMapper.insert(searchRecord);
        }

        PageHelper.startPage(searchRequest.getPageParam().getPageNum(),
                searchRequest.getPageParam().getPageSize(),
                searchRequest.getPageParam().getOrderBy());
        List<Note> noteList = noteMapper.selectByExample(example);
        Page page = new Page(new PageInfo(noteList));

        ArrayList<Note> noteArrayList = new ArrayList<>();
        for (Note ele : noteList) {
            noteArrayList.add(new Note(ele.getId(), ele.getTitle(), ele.getJuQuanNum(),ele.getScriptId(),ele.getStored(),ele.getPublishDate()
            ,ele.getContent(),ele.getLikes(),ele.getComments(),ele.getCollections(), ele.getBrowse()));
        }
        return new Page<>(searchRequest.getPageParam(), page.getTotal(), page.getPages(), noteArrayList);
    }

}
