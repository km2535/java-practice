
# 람다식
함수형 프로그래밍의 여러 장점이 대두되어 자바8에서부터 지원

## 구현하기 
람다식은 간단히 설명하면 함수 이름이 없는 익명 함수를 만드는 것입니다. 

### 문법
람다식 문법에서는 매개변수 자료형을 생략할 수 있습니다.
```
str -> {System.out.println(str);}
```
매개변수가 2개인 경우 괄호 생략 불가
```
(x,y) -> {System.out.println(x + y);}
```
중괄호는 구현 부분이 한 문장인 경우 생략 가능
```
(x,y) -> System.out.println(x + y);
```
return 문은 중괄호 생략 할 수 없음
```
str -> {return str.length();}
```
중괄호 안의 구현 부분이 return 문 하나라면 중괄호와 return 을 모두 생략하고 식만 씀
```
(x,y) -> x+y
또는
str -> str.length();
```

## 함수형 인터페이스
람다식은 메서드 이름이 없고 메서드를 실행하는 데 필요한 매개변수와 매개변수를 활용한 실행 코드를 구현하는 것입니다.
람다식을 구현하기 위해 함수형 인터페이스를 만들고 인터페이스에 람다식으로 구현할 메서드를 선언하는 것입니다.
람다식은 하나의 메서드를 구현하여 인터페이스형 변수에 대입하므로 인터페이스가 두 개 이상의 메서드를 가져서는 안됩니다. 
```java

public interface MyNumber {
	int getMax(int num1, int num2);
	// int getMin(int num1, int num2); 두개 이상 시 컴파일 에러
}
```
실수를 방지하기 위해 FunctionalInterface 어노테이션을 붙입니다.
```java
@FunctionalInterface
public interface MyNumber {
	int getMax(int num1, int num2);
	// int getMin(int num1, int num2);
}

```
```java
public class Test{
	public static void main(String[] args){
		int i = 100;
		StringConcat concat2 = (s, v) ->{
		    // i = 200; // 지역변수 변경 시 오류 발생
			System.out.println(i);
			System.out.println(s + " " + v);
        };
    }
}
```
## 왜 오류가 발생할까?
지역 내부 클래스와 마찬가지로 지역 변수는 메서드 호출이 끝나면 메모리에서 사라지기 때문에 익명 내부 클래스에서 사용하는 경우에는 
지역 변수가 상수로 변하고 상수를 변경하려고 해서 오류가 발생하는 것 입니다.


