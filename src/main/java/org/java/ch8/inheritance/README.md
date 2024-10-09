# 상속
## 상속을 사용하여 고객 관리 프로그램 구현 
- 고객이 점점 늘어나고 판매도 많아지면서 단골 고객이 생길 때 단골 고객은 회사 매출에 가장 큰 기여를 합니다.
  따라서 우수 고객을 관리하기 위해 등급을 나누고 다음 혜택을 제공할 때 기존에 만든 클래스를 이용해 vip 클래스가 기존 클래스를 상속 받아
  사용할 수 있습니다. 

![img.png](img.png)

### 부모클래스 
```java
package org.java.ch8.inheritance;

public class Customer {
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;

	public Customer(){
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	public Customer(int customerId, String customerName){
		this.customerId = customerId;
		this.customerName = customerName;
		customerGrade = "VIP";
		bonusRatio = 0.01;
		System.out.println("Customer(int , String) 생성자 호출");
	}

	public int calcPrice(int price){
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String showCustomerInfo(){
		return customerName + "님의 등급은 " + customerGrade + "이며 보너스 포인트는 "+ bonusPoint+"입니다.";
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}

```

### 자식 클래스
```java
package org.java.ch8.inheritance;

public class VIPCustomerExtendParent extends Customer{
  private int agentId;
  double saleRatio;

  public VIPCustomerExtendParent(){
    super();
    customerGrade = "VIP";
    bonusRatio = 0.05;
    saleRatio = 0.1;
  }

  public VIPCustomerExtendParent(int customerId, String agentId){
    super(customerId, agentId);
    customerGrade = "VIP";
    bonusRatio = 0.05;
    saleRatio = 0.1;
  }

  public VIPCustomerExtendParent(int customerId, String customerName, int agentId) {
    super(customerId, customerName);
    customerGrade = "VIP";
    bonusRatio = 0.05;
    saleRatio = 0.1;
    this.agentId = agentId;
    System.out.println("Vip customer extend parent created");
  }

  @Override
  public int calcPrice(int price){
    bonusPoint += (int)(price * bonusRatio);
    return price - (int)(price * saleRatio);
  }

  public int getAgentId() {
    return agentId;
  }
}

```
### 사용
```java

package org.java.ch8.inheritance;

public class OverridingTest1 {
	public static void main(String[] args) {
		Customer customer = new Customer(10010, "이순신");
		customer.bonusPoint = 1000;

		VIPCustomerExtendParent customerExtendParent = new VIPCustomerExtendParent(10020, "김유신", 12345);
		customerExtendParent.bonusPoint = 1000;

		int price = 10000;
		System.out.println(customer.getCustomerName() + "님이 지불해야 하는 금액은 " + customer.calcPrice(price) + "원 입니다.");
		System.out.println(customerExtendParent.getCustomerName() + "님이 지불해야 하는 금액은 " + customerExtendParent.calcPrice(price) + "원 입니다.");
	}
}

```

## 상속 간 주의사항
- 상위 클래스에서 private 으로 선언된 변수에 접근 시 에러가 발생한다. 
- 상속 받아야 하는 클래스에서 변수를 사용해야한다면 protected 도 고려한다.

- 자식 클래스가 부모타입으로 선언될 때 customer2 객체는 Customer 를 가르키게 된다.
```java
		Customer customer2 = new VIPCustomerExtendParent();
		//customer2.getAgentId(); 자식 클래스가 부모 타입으로 선언되어 자식 내부의 메소드 호출은 되지 않음
```

## 가상 메서드
```java
public class TestA{
	int num;
	
	void aaa(){
      System.out.println("aaa() 출력");
    }
	
	public static void main(String[] args){
		TestA a1 = new TestA();
		a1.aaa();
		
		TestA a2 = new TestA();
		a2.aaa();
    }
}
// 출력
// aaa() 출력
// aaa() 출력
```
JVM 환경에서 클래스 로더에 의해 메모리가 할당되는데 이 때 클래스의 인스턴스 변수와 객체는 힙영역에 할당되고 a1과 같이 참조 변수들은 
스택메모리에 할당됩니다. 또한 클래스 내부에 정의한 메소드들은 여러 클래스에서 사용할 수 있으므로 메서드 영역에 할당됩니다.
위 프로젝트에서 재정의 된 calcPrice 메서드는 자식 클래스에서 재정의 된 메서드를 참조하고 재정의 되어 있지 않은 메서드들은 부모 클래스의 
메서드들을 참조하게 됩니다.

부모 타입으로 참조한 클래스라도 자식 클래스에서 오버라이드하였다면 오버라이드된 메서드를 참조하여 실행합니다.

## 다형성
다형성이란 하나의 코드가 여러 자료형으로 구현되어 실행되는 것을 말합니다.
예를 들어 생성자 오버로딩하면 다른 타입과 매개변수로 생성자가 실행 될 수 있습니다.

## 상속은 언제 사용할까?
 - 분기처리가 증가할때
 - Is-a 관계에서 사용하는 것이 좋습니다. 
   - 일반적인 개념과 구체적인 개념의 관계 
 - 단순 코드 재사용 목적이라면 상속은 피해야합니다.

## 다중 상속을 받지 않은 이유
- 다중 상속으로 인한 모호성 발생
- 두 개 이상의 상위 클래스에 같은 이름의 메서드가 정의되어 있다면, 다준 상속을 받는 하위 클래스는 어떤 메서드를 상속 받을지 모호해집니다.

## 다운 캐스팅과 instance of
```java
package org.java.ch8.inheritance;

import java.util.ArrayList;

class Animal{
	public void move(){
		System.out.println("동물이 움직입");
	}
}

class Human extends Animal{
	public void move(){
		System.out.println("사람이 두발로 걷습니다.");
	}

	public void read(){
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move(){
		System.out.println("호랑이가 움직인다.");
	}
	public void hunting(){
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move(){
		System.out.println("독수리이가 움직인다.");
	}
	public void flying(){
		System.out.println("독수리가가 날아 다닙니다.");
	}
}

public class AnimalTest {
	ArrayList<Animal> animals = new ArrayList<>();
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println("원래 형으로 다운 캐스팅");
		aTest.testCasting();
	}

	private void testCasting() {
		for (Animal ani : animals) {
			if (ani instanceof Tiger) {
				Tiger tiger = (Tiger)ani;
				tiger.hunting();
				continue;
			}
			if (ani instanceof Eagle) {
				Eagle eagle = (Eagle)ani;
				eagle.flying();
				continue;
			}
			if (ani instanceof Human) {
				Human human = (Human)ani;
				human.read();
				continue;
			}
			System.out.println("지원되지 않는 형식입니다.");
		}
	}

	private void addAnimal() {
		animals.add(new Tiger());
		animals.add(new Eagle());
		animals.add(new Human());

		for(Animal animal : animals) {
			animal.move();
		}
	}
}

```

다운캐스팅을 통해 원래의 메소드에 접근하는 모습

### 상속의 예시
```java
// 상위 클래스: Product (상품)
class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("이 제품은: " + name + ", 가격은 " + price);
    }
}

// 하위 클래스: Electronics (전자제품)
// Electronics is-a Product
class Electronics extends Product {
    private int warrantyPeriod; // 보증 기간 (개월)

    public Electronics(String name, int price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("품질 보증 기간 : " + warrantyPeriod + " 월");
    }
}

// 하위 클래스: Furniture (가구)
// Furniture is-a Product
class Furniture extends Product {
    private String material;

    public Furniture(String name, int price, String material) {
        super(name, price);
        this.material = material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("재질 : " + material);
    }
}

```

```java
public class Main {
    public static void main(String[] args) {
        Product phone = new Electronics("Smartphone", 2000, 24);
        Product chair = new Furniture("Office Chair", 3000, "Leather");

        phone.displayDetails();  
        chair.displayDetails(); 
    }
}
```