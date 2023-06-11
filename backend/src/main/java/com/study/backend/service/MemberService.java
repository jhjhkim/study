package com.study.backend.service;

import java.util.List;

import com.study.backend.domain.Member;
import com.study.backend.domain.MemberDetail;

public interface MemberService {
    public List<Member> getMemberList();
    public MemberDetail getMemberById(int id);
}
