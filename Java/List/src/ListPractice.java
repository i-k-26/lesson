import java.util.ArrayList;

public class ListPractice {

	public static void main(String[] args) {

		Person sato = new Person("sato", 28);
		Person monzen = new Person("monzen", 22);
		Person suzuki = new Person("suzuki", 31);

		ArrayList<Person> personList = new ArrayList<Person>();

		personList.add(sato);
		personList.add(monzen);
		personList.add(suzuki);

		for (Person p : personList) {
			System.out.println(p.getName() + "は" + p.getAge() + "才");
		}

		for (int i = 0; i < personList.size(); i++) {
			System.out.println(i+1 + "件目は" + personList.get(i).getName() + "さんです");
		}
	}
}
