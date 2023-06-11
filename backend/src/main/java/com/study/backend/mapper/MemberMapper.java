package com.study.backend.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.study.backend.domain.Member;
import com.study.backend.domain.MemberDetail;

@Mapper
public interface MemberMapper {
    List<Member> selectList();
    MemberDetail getMemberById(int id);
}
