package com.mygg.mygg.dto;

import com.mygg.mygg.domain.entity.MemberEntity;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MemberDTO {
    private Long id;
    private String email;
    private String password;
    private String name;
    private String nickname;
    private String phone_number;
    private String gender;
    private int age;
    private String location;
    private String photo;
    private int authority = 1;
    private String role;

    public MemberEntity toEntity(){
        return MemberEntity.builder()
                .id(id)
                .email(email)
                .password(password)
                .name(name)
                .nickname(nickname)
                .phone_number(phone_number)
                .gender(gender)
                .age(age)
                .location(location)
                .photo(photo)
                .authority("1")
                .role(role)
                .build();
    }

    @Builder
    public MemberDTO(Long id, String email, String password, String name, String nickname, String phone_number, String gender, int age, String location, String photo, String authority, String join_date, String role) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.nickname = nickname;
        this.phone_number = phone_number;
        this.gender = gender;
        this.age = age;
        this.location = location;
        this.photo = photo;
        this.authority = 1;
        this.role = role;
    }
}