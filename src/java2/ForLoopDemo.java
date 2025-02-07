package java2;

public class ForLoopDemo {

	public static void main(String[] args) {

		String[] names = { "Mounika", "Pavan", "vivek", "Shama" };

		int[] age = { 1, 2, 3, 4, 5 };
		System.out.println("Names from the class");
		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("Names from the class");
		for (int ag : age) {
			System.out.println(ag);
		}

//	System.out.println("Names from the class");
//	for(int i=0;i<names.length;i++) {
//		System.out.println(names[i]);
//	}
//	System.out.println("Ages from the class");
//	for(int i=0;i<age.length;i++) {
//		System.out.println(age[i]);
//	}

	}

}
