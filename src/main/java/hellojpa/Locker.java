package hellojpa;

import javax.persistence.*;

@Entity
public class Locker {
    @Id @GeneratedValue
    private Long id;

    private String name;

    //만약에 양방향으로 만들고싶다. 그럼 얘는 읽기 전용이 됨
    @OneToOne(mappedBy = "locker")
    private Member member;

}
