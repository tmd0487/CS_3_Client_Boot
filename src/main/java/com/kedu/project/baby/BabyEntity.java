package com.kedu.project.baby;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="baby")
@Getter
@Setter
@NoArgsConstructor
public class BabyEntity {
    /*
        baby 테이블 entity 매핑 사용 
        DB에 직접 연결이라 보면됨
    */

    @Id
    @Column(name = "baby_seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seq;
    private String name;
    @Column(name = "birth_date")
    private String birthDate; // 출산예정일 또는 생일
    @Column(name = "family_code")
    private String familyCode; // 가족 코드
    private String status; // 출산 여부
    @Column(name = "created_at")
    private String createdAt; // 생성 날짜
    @Column(name = "updated_at")
    private String updateAt; // 최근 업데이트 날짜
}