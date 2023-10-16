# 스프링 부트 3 백엔드 개발자 되기: 자바 편

### (7장 관련) 새로운 글 작성 시 작성 날짜가 null로 보이는 현상 해결

**문제 상황:** 7장까지 작성하고 테스트하던 중, 새로운 글을 작성할 때 작성 날짜가 `null`로 보이는 문제 발생

**해결 방법:** 

1. `domain` 패키지의 `Article` 클래스에 `@EntityListeners(AuditingEntityListener.class)` 어노테이션을 추가하기


   ```java
   import org.springframework.data.jpa.domain.support.AuditingEntityListener;

   // ... 다른 import 문들 ...

   @Entity
   @Getter
   @NoArgsConstructor(access = AccessLevel.PROTECTED)
   @EntityListeners(AuditingEntityListener.class)
   public class Article {
       // Article 클래스의 내용
   }
   ```


