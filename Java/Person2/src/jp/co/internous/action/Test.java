package jp.co.internous.action;

public class Test {
	public static void main(String[] args) {
		Person taro = new Person();

		taro.name = "taro";
		taro.age = 18;
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println("");

		Person jiro = new Person("jiro", 20);
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println("");

		Person saburo = new Person("saburo", 0);
		System.out.println(saburo.name);
		System.out.println(saburo.age);
		System.out.println("");

		Person a = new Person("名前なし", 25);
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println("");

		Person hanako = new Person(17, "hanako");
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println("");

	}

}
