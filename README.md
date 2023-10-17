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

   

---



### (8장 관련) config 패키지의 WebSecurityConfig 클래스의 filterChain메서드 관련 오류 발생
**문제 상황:** 서버 실행 시 filterChain 관련 오류 발생하며 서버 실행되지 않음

**해결 방법:** 

1. build.gradle의 plugins 설정이 책에 명시된 버전과 달랐는데,(디폴트로 생성 시 업데이트된 버전으로 프로젝트 생성됨) 이를 책과 동일한 버전으로 수정하였음

**수정 전**

   ```java
plugins {
    id 'java'
    id 'org.springframework.boot' version '3.1.4'
    id 'io.spring.dependency-management' version '1.1.3'
}
   ```

**수정 후**

   ```java
plugins {
    id 'java'
    id 'org.springframework.boot' version '3.0.2'
    id 'io.spring.dependency-management' version '1.1.0'
}
   ```
