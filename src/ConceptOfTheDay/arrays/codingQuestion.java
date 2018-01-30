package ConceptOfTheDay.arrays;

class A {
	int i = 10;
}

class B extends A {
	int j = 20;
}

class C extends B {
	int k = 30;
}

class D extends C {
	int m = 40;
}

public class codingQuestion {
	static final int[] a;
	static {
		a = new int[] { 1, 2, 3 };
	}

	public static void main(String[] args) {
		A[] a = {new A(), new B(), new C(), new D()};
		 
        System.out.println(a[3].i);
 
        System.out.println(a[2].j);
 
        System.out.println(a[1].k);
 
        System.out.println(a[0].m);
		// a = new int[5];
		/*int[][] a = { { 1, 2, }, { 3, 4 } };

		int[] b = (int[]) a[1];

		Object o1 = a;

		int[][] a2 = (int[][]) o1;

		int[] b2 = (int[]) o1;

		System.out.println(b[1]);*/
	}
}
