import java.io.*;
import java.util.*;

	abstract class Shapes{
		int x,y;
	    abstract void printArea(int a,int b);
	}

	class Rectangle extends Shapes{

		@Override
		void printArea(int x,int y) {
			double area;
			area =x*y;
			System.out.println("Area Of Rectangle :"+area);
		}
	}
	class Triangle extends Shapes{

		@Override
		void printArea(int x,int y) {
			double area;
			area =0.5*x*y;
			System.out.println("Area Of Triangle :"+area);
		}	
	}
	class Circle extends Shapes{

		@Override
			void printArea(int x,int y) {
			double area1,area2;
			area1 =3.14*x*x;
			area2 =3.14*y*y;
			System.out.println("Area Of Circle :"+area1);
			System.out.println("Area Of Circle :"+area2);
				}	
		
	}

