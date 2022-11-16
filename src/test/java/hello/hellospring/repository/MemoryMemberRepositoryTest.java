package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemoryMemberRepositoryTest {

    MemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findByID(member.getId()).get();
        Assertions.assertThat(member).isEqualTo(result);
//        System.out.println("result = " + (result == member));
//        Assertions.assertEquals(member, result);
//        Assertions.assertEquals(member, null);
    }
}
