package ConceptOfTheDay;

import ConceptOfTheDay.X.Y;
import ConceptOfTheDay.X.Y.Z;
public class MainClass {
public static void main(String[] args) {
	System.out.println(new ABC().new XYZ().i);
	System.out.println(X.x);
	System.out.println(X.Y.y);
	System.out.println(X.Y.Z.z);
	System.out.println(X.x);
	System.out.println(Y.y);
	System.out.println(Z.z);

}
}

class 
class X {
	static int x = 3131;
	static class Y {
		static int y = x++;
		static class Z {
			static int z = y++;
		}
	}
}

class ABC
{
    class XYZ
    {
        int i = 111;
    }
}


