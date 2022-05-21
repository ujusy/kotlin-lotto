# kotlin-lotto

## 문자열 계산기

### 기능 요구 사항

- [x] null 혹은 blank인 경우 0을 분리해야한다. 
- [x] "," 로 문자열이 분리되어야한다.
- [x] ":" 로 문자열이 분리되어야한다.
- [x] "//”와 “\n” 사이에 커스텀 구분자를 지정할 수 있다.
- [x] 분리된 수를 덧셈하여야한다.
- [x] 음수일 경우 RuntimeException 예외를 발생시켜야한다.


## Step2: lotto(자동)

### 요구 사항

- [x] 로또 랜덤 번호
  - [x] 1~45 사이의 랜덤 값 이어야한다.
  - [x] 6개의 번호를 반환해야한다.
  - [x] 뽑은 번호가 중복되지 않아야한다.
- [ ] 로또 자동 게임
  - [x] 지불한 금액이 1000원 이상이어야한다.
  - [x] 지불한 금액이 1000원으로 나누어 떨어져야한다.
  - [ ] 지난 주 결과와 일치해야한다.
- [ ] 당첨 통계
  - [ ] 일치 개수를 확인할 수 있어야한다.
  - [ ] 총 수익률을 계산한다.
- [ ] 입력
  - [ ] 금액을 입력받을 수 있어야한다.
  - [ ] 지난주 당첨 번호를 입력받을 수 있어야한다.
- [ ] 출력
  - [ ] 당첨 통계를 출력할 수 있어야한다.
