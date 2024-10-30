# 인스턴스 내부 클래스 
```java
package org.java.ch13;

class OutClass {
	private int num = 10;
	private static int sNum = 20;

	private InClass inClass;

	public OutClass(){
		inClass = new InClass();
	}

	class InClass{
		int inNum = 20;
		// 왜 컴파일 에러가 발생하지?
		//static int sInNum = 200;
		void inTest(){
			System.out.println("OutClass inNum = " + inNum);
			System.out.println("OutClass sNum = " + sNum);
		}
	}
	public void usingClass(){
		inClass.inTest();
	}
}

public class InnerTest{
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.usingClass();
	}
}

```

## 언제 사용?
- 인스턴스 내부 클래스는 인스턴스 변수를 선언할 때와 같은 위치에 선언하며, 외부 클래스 내부에서만 생성하여 사용하는 객체를 선언할 때 씁니다.
- 외부 클래스를 먼저 생성하지 않고 인스턴스 내부 클래스를 사용할 수 없다. 
#### 내부 클래스에서 선언한 static 변수가 에러가 나는 이유?
- 외부 클래스를 선언하고 사용할 수 있기 때문에 내부 클래스에 에러가 발생함
- 마찬가지로 정적 메서드도 내부 클래스 내부에서 선언 할 수 없음

인스턴스 내부 클래스의 메서드느 ㄴ외부 클래스의 메서드가 호출될 때 사용할 수 있다.

## 다른 클래스에서 인스턴스 내부 클래스 생성하기
내부 클래스를 생성하는 이유는 외부 클래스에서만 사용하기 위해 사용하지만 외부에서 사용하려면 접근제어자를 public 으로 사용함
```java
OutClass outClass = new OutClass();
OutClass.InClass inClass = outClass.new InClass();
```

# 정적 내부 클래스
 외부 클래스 생성과 무관하게 사용할 수 있어야 하고 정적 변수도 사용할 수 있어야한다면 정적 내부 클래스를 사용합니다.
 
```java
package org.java.ch13;


class OutClass2 {
	private int num = 10;
	private static int sNum = 20;

	private InClass inClass;

	public OutClass2(){
		inClass = new InClass();
	}

	static class InClass{
		int inNum = 20;
		static int sInNum = 200;
		void inTest(){
			// num += 20; 외부 클래스 인스턴스 변수 사용 X
			System.out.println("InClass inNum = " + inNum);
			System.out.println("InClass sInNum = " + sInNum); // 정적 && 인스턴스 모두 가능
			System.out.println("OutClass sNum = " + sNum); // 외부 클래스 정적 변수 가능
		}

		static void sTest(){
			// num += 20; 외부 클래스 인스턴스 변수 사용 X
			// System.out.println("OutClass inNum = " + inNum); // 정적 내부 인스턴스 변수 사용 불가
			System.out.println("OutClass sNum = " + sNum); // 외부 클래스의 정적 변수 가능 
			System.out.println("InClass sInNum =  " + sInNum); // 정적 내부 클래스의 정적 변수 가능
		}
	}
	public void usingClass(){
		inClass.inTest();
	}
}


public class InnerTest2 {
	public static void main(String[] args) {
		OutClass2.InClass outClass = new OutClass2.InClass();
		System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
		outClass.inTest();
		OutClass2.InClass.sTest();

	}
}

```

## 다른 클래스에서 정적 내부 클래스 사용하기
- 정적 내부 클래스는 외부 클래스를 생성하지 않고 내부 클래스 자료형으로 바로 선언하여 생성 가능
 ```java
		OutClass2.InClass outClass = new OutClass2.InClass();
```
또 정적 내부 클래스에 선언한 메서드나 변수는 private 이 아닌 경우에 바로 클래스에서 사용 가능하다.
```java
OutClass2.InClass.sTest();
```

# 지역 내부 클래스
지역 내부 클래스는 지역 변수처럼 메서드 내부에 클래스를 정의하여 사용하는 것을 말합니다. 
따라서 이 클래스는 메서드 안에서만 사용 가능합니다.

```java
package org.java.ch13;

class Outer{
	int outNum = 20;
	static int sNum = 200;

	Runnable getRunnable(int i){
		int num = 100;

		// 지역 내부 클래스 정의
		class MyRunnable implements Runnable{
			int localNum = 10;

			@Override
			public void run() {
				// num = 200; // 지역변수는 상수로 바뀌므로 값을 변경할 수 없어 오류 발생
				// i = 100; // 매개변수도 지역 변수처럼 상수로 바뀌므로 값을 변경 할 수 없어 오류 발생
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum);
				System.out.println("sNum = " + sNum);
				System.out.println("Outer.sNum = " + Outer.sNum);
			}
		}
		return new MyRunnable();
	}
}

public class LocalInnerTest {
	public static void main(String[] args) {
		Outer out = new Outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}

```

Outer 클래스를 생성한 후 Runnable 형 객체로 getRunnable() 호출합니다.
MyRunnable 를 사용하려면 이 클래스를 직접 생성하는 것이 아니라 getRunnable() 메서드 호출을 통해 생성된 객체를 반환받아야 합니다.

지역변수는 메서드가 호출될 때 스택 메모리에 생성되고 메서드의 수행이 끝나면 메모리에서 사라집니다.
이때 지역 내부 클래스에 포함된 getRunnable() 메서드의 매개변수 i와 메서드 내부에 선언한 변수 num 은 지역 변수입니다. 
```java
Runnable runner = out.getRunnable(10); // 호출 끝
		runner.run(); // run 이 실행되면서 getRunnable 메서드의 지역변수가 사용
```

위 코드가 정상적으로 동작할 수 있다는 것은 스택 메모리에 지워진 변수를 이후에 또 참조 할 수 있다는 것입니다. 
즉 지역 내부 클래스에서 사용하느 지역 변수는 **상수**로 처리가 됩니다. 

--> 지역 내부 클래스에서 사용하는 메서드의 지역 변수는 모두 상수로 바뀝니다.

# 익명 내부 클래스 
클래스 이름을 사용하지 않은 클래스를 익명 클래스라고 합니다. 
```java
Runnable getRunnable(int i){
		int num = 100;

		// 지역 내부 클래스 정의
		class MyRunnable implements Runnable{
			int localNum = 10;

			@Override
			public void run() {
				// num = 200; // 지역변수는 상수로 바뀌므로 값을 변경할 수 없어 오류 발생
				// i = 100; // 매개변수도 지역 변수처럼 상수로 바뀌므로 값을 변경 할 수 없어 오류 발생
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum);
				System.out.println("sNum = " + sNum);
				System.out.println("Outer.sNum = " + Outer.sNum);
			}
		}
		return new MyRunnable(); // 지역 내부 클래스 이름은 클래스를 생성하여 반환할 때만 사용
	}
```

아래와 같이 이름을 생략하여 작성 할 수 있음

```java
package org.java.ch13;

class Outer2{
	int outNum = 20;
	static int sNum = 200;

	Runnable getRunnable(int i){
		int num = 100;

		// 지역 내부 익명 클래스 정의
		 return new Runnable(){
			int localNum = 10;

			@Override
			public void run() {
				// num = 200; // 지역변수는 상수로 바뀌므로 값을 변경할 수 없어 오류 발생
				// i = 100; // 매개변수도 지역 변수처럼 상수로 바뀌므로 값을 변경 할 수 없어 오류 발생
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum);
				System.out.println("sNum = " + sNum);
				System.out.println("Outer.sNum = " + Outer.sNum);
			}
		};
	}
}

public class LocalInnerTest2 {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}
}

```

익명 내부 클래스는 단 하나의 인터페이스 또는 단 하나의 추상 클래스를 바로 생성 할 수 있습니다.
인터페이스를 생성하려면 인터페이스 몸체가 필요합니다. 

### 언제 사용?
익명 내부 클래스는 예전 자바 UI 에서 이벤트를 처리하는 데 많이 사용하고 현재는 아드로이드 프로그래밍에서 
위젯의 이벤트를 처리하는 핸들러를 구현할 때 많이 사용합니다. 

