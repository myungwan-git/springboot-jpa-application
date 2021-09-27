package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded  // JPA에서 내장타입 이라는 의미 ( Address에 써주던가, 여기써주던가 둘중 하나만 써도 된다. )
    private Address address;

    @OneToMany(mappedBy = "member") // 연관관계의 주인이 아니고 Order의 member라는 필드에 의해 매핑이 됬다는 얘기 .
                                    // 따라서 여기에 무슨 값을 넣는다고 해서 저쪽의 포린키 값이 변경되지 않는다.
    private List<Order> orders = new ArrayList<>();
}
