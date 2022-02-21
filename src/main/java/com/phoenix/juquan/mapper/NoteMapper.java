package com.phoenix.juquan.mapper;

import com.github.pagehelper.PageHelper;
import com.phoenix.juquan.MyMapper;
import com.phoenix.juquan.dto.BriefNote;
import com.phoenix.juquan.entity.Note;
import com.phoenix.juquan.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NoteMapper extends MyMapper<Note> {
    @Insert("INSERT INTO note VALUES (null,#{status})")
    int insertDriver(@Param("status") Integer status);

    @Select("SELECT * FROM note WHERE id=#{id}")
    BriefNote getNoteById(@Param("id") long id);

    @Select("SELECT id FROM note")
    List<BriefNote> getBriefNoteList();

    @Delete("DELETE FROM note WHERE id=#{id}")
    void deleteNoteById(@Param("id") Long id);

    @Select("SELECT * FROM note")
    List<Note> getAllNote();

}
