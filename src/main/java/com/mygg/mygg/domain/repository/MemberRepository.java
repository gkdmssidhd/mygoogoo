package com.mygg.mygg.domain.repository;

import com.mygg.mygg.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface MemberRepository {

    void register(MemberDTO memberDTO) ;
    Map<String, String> login(MemberDTO memberDTO) ;
    Map<String, String> activity(int id);

}