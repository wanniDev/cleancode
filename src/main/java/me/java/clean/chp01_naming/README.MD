# 의미 있는 이름
- 의도를 분명히 밝혀라
  - 코드 변수명 및 함수 명이 명확하다면, 굳이 주석은 필요없다.
- 그릇된 정보를 피하라
  - list, array와 같이 일반적으로 정보 전달이 어려운 단어는 지양해야 한다.
- 의미 있게 구분하라
    - c1, c2, c3와 같이 연속된 숫자는 피해라
    - 명확한 관례가 없다면 변수 moneyAmount는 money와 구분이 안되며, customerInfo는 customer와 구분이 안된다.
- 발음 하기 쉬운 이름을 사용해라
    - 내가 발음하기 힘든 이름은 남도 힘들다. 검색도 힘들다.
- 검색하기 쉬운 이름을 사용해라
    - 생소한 단어는 검색을 통한 정보 조회를 방해한다.
    - 너무 간소한 단어는 중복 검색을 발생시킨다.
- 인코딩을 피해라
    - 헝가리식 표기법은 쓰지마라.(변수명 앞에 데이터 타입을 약어로 쓰는 표기법)
    - 접두어는 피하라(m_day 와 같은, 그런....)
- 기억력을 믿지마라
- 메서드 이름은 동사나 동사구가 적합하다.
    - postPayment, deletePage, save 등등.
    - 접근자, 변경자, 조건자는 javaBean 표준에 따라 값 앞에 get, set, is를 붙인다.
- 기발한 이름은 나중에는 당사자도 잊어먹는다.
- 말장난은 그만.
    - 만약 add라는 메소드가 두 값을 더하는 것이고, 다른 add 메소드가 기본 값에 더하기를 하는 것이라면, 두 메소드는 필히 다르게 명명해야 한다.
- 해법 영역에서 가져온 이름을 사용하라
    - 디자인 패턴, 수학 용어, 알고리즘 이름 등, 특정 분야의 언어라도, 같은 개발자가 학습하는 영역이라면, 사용해도 무방하다.
- 문제 영역에서 가져온 이름을 사용하라
    - 적절한 개발용어가 없다면, 해당 분야의 전문가가 알아볼 수 있는 용어도 좋다.
- 의미 있는 맥락을 추가하라
    - 코드를 읽는 사람에게 추측을 강요하지 말자
- 불필요한 맥락을 없애라
    - 공통적인 맥락을 반복적으로 사용하는 것은 차라리 없는게 낫다.