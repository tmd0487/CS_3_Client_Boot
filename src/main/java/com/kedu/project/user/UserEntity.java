package com.kedu.project.user;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="user")
@Getter
@Setter
@NoArgsConstructor
public class UserEntity {
    @Id
    @Column(name = "user_id")
    private String id;
    private String email;
    @Column(name = "password")
    private String pw;
    private String contact; // 연락처
    private String nickname;
    @Column(name = "parent_role")
    private String role; // 부 / 모
    private String birth_date; // 생년월일
    private String family_code;
    @CreationTimestamp
    private String created_at; // 가입 날짜
    private int last_baby; // 마지막 접속 아이 seq
}
