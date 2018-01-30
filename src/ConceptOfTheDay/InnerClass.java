package ConceptOfTheDay;

import ConceptOfTheDay.AnotherClassOne.AnotherInnerClass;

class OuterClass {
	int x;

	void methodOfOuterClass() {
		 int i=10;
		System.out.println("From OuterClass");
	}

	// Class as a member
	class InnerClass {
		int y;
	}

	static class InnerClassOne {
		int y = 10;
		static {
			System.out.println("inside inner class");
		}
	}

	class InnerClassTwo {
	}
}

class AnotherClassOne extends OuterClass {

	class AnotherInnerClass extends InnerClass {

	}
}

public class InnerClass {
	public static void main(String[] args) {
		AnotherClassOne anotherClassOne = new AnotherClassOne();
		System.out.println(anotherClassOne.x);
		anotherClassOne.methodOfOuterClass();
		AnotherClassOne.AnotherInnerClass anotherInnerClass = anotherClassOne.new AnotherInnerClass();
		System.out.println("inner class : "+anotherInnerClass);
	}
}

class AnotherClassTwo extends OuterClass.InnerClassTwo {

	public AnotherClassTwo() {
		
		new OuterClass().super();
	}
}
