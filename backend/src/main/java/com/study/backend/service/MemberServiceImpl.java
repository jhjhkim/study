package com.study.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.study.backend.domain.Member;
import com.study.backend.mapper.MemberMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberMapper memberMapper;

    @Override
    public List<Member> getMemberList() {
        return memberMapper.selectList();
    }
}
