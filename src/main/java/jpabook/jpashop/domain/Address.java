package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable  // JPA의 내장타입 이라는 의미
@Getter
public class Address {

    private String city;

    private String street;

    private String zipcode;
}
