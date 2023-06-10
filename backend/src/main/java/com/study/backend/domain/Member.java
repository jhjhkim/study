package com.study.backend.domain;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Member {
    private int MemberId;
    private String MemberName;
    private String MemberEmail;
}
