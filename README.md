# 스트림
## 스트림이란?
자료가 모여 있는 배열이나 컬렉션 또는 특정 범위 안에 있는일련의 숫자를 처리하는 기능이
미리 구현되어 있다면 프로그램의 코드가 훨씬 간결해지고 일관성 있게 다룰 수 있습니다.
이렇게 여러 자료의 처리에 대한 기능을 구현해 놓은 클래스가 스트림입니다. 
스트림을 사용하면 배열, 컬렉션 등의 자료를 일관성 있게 처리할 수 있습니다.
처리해야 할 자료구조가 무엇인지 간에 같은 방식으로 메서드를 호출 할 수 있기 때문에 
자료를 추상화했다고 표현합니다.

## 스트림 연산
스트림 연산의 종류에는 크게 중간 연산과 최종 연산 2가지가 있습니다. 
중간 연산은 자료를 거르거나 변경하여 또 다른 자료로 내부적으로 생성하고 
최종 연산은 생성된 내부 자료를 소모해 가면서 연산을 수행합니다.
따라서 최종 연산은 마지막에 한 번만 호출됩니다.

### 중간연산 - filter(), map()

#### filter()
filer 조건을 넣고 그 조건에 맞는 참인 경우만 추출하는 경우에 사용합니다.
```java
sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.println(s));
//filter : 중간연산 문자열 길이가 5 이상만 
// forEach : 최종연산 중간연산 결과를 출력
```

#### map()
- 클래스가 가진 자료 중 이름만 출력하는 경우에 사용 
```java
customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
```

### 최종 연산 - forEach(), count(), sum(), reduce()

최종 연산을 사용하면 스트림은 더 이상 사용할 수 없습니다. 결과를 만드는 데 주로 사용합니다.

## 스트림 사용하기
```java
import java.util.Arrays;

public class IntArrayTest {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int sumVal = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();

		System.out.println(sumVal);
		System.out.println(count);
	}
}

```

## 스트림의 특징
- 자료의 대상과 관계없이 동일한 연산을 수행한다.
- 한 번 생성하고 사용한 스트림은 재사용 할 수 없다.
- 스트림의 연산은 기존 자료를 변경하지 않는다.
- 스트림의 연산은 중간 연산과 최종 연산이 있다.
- 

