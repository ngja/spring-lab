
### 영속성 컨텍스트

영속성 컨텍스트 (Persistence Context): 엔티티를 영구 저장하는 환경

엔티티 생명주기
* 비영속: 엔티티 생성한 상태. 영속성 컨텍스트와 관계 없다.
* 영속: 영속성 컨텍스트에 저장한 상태, 해당 상태만 변경 감지 후 트랜잭션이 커밋되면 플러시 호출
* 준영속
* 삭제


플러시: 영속성 컨텍스트의 내용을 DB에 반영, entityManager.flush() 하거나 트랜잭션 커밋 시 호출

#### @Transactional 

Spring AOP로 구현

우선순위 class method > class > interface method -> interface

그냥 사용하는 경우 Proxy Mode로 설정 
-> 프록시 객체가 method를 대신 실행시켜주고 전후로 트랜잭션 관리를 해준다.
-> public method 에서만 동작
-> @Transactional이 적용되지 않은 method에서 @Transactional이 적용된 method 호출할 경우 동작하지 않음 