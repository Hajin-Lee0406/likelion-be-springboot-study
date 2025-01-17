package com.shop.shop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "cart")
@Getter @Setter
@ToString
public class Cart extends BaseEntity{

    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)    // 회원 엔티티와 일대일 매핑
    @JoinColumn(name = "member_id")  // 매핑할 외래키 지정(name을 명시하지 않으면 JPA가 알아서 찾지만 컬럼명이 원하는 대로 생성되지 않을 수 있어 직접 지정)
    private Member member;
}
