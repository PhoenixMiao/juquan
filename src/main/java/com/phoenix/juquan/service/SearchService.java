package com.phoenix.juquan.service;

import com.phoenix.juquan.common.Page;
import com.phoenix.juquan.controller.search.SearchRequest;
import com.phoenix.juquan.entity.Note;

public interface SearchService {
    Page<Note> searchNote(SearchRequest searchRequest);

}
