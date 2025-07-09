package dayone;

public class PrimitiveDataTypesDemo {

	public static void main(String[] args) {
		
		//bytentakes 1 byte
		//256/2
		//iff you enter the number more then 127 then it will give error
		//even in negavtive you have to give -127
		byte byteMax=120;
		System.out.println(+byteMax);
		//byte bytemin=130;
		//short ----2 byte
		short shortMax= 32767;
		System.out.println(shortMax);
		//short shortMin=32768;
		//System.out.println(shortMin);
		
int maxInt=2147483647;
int minInt=-2147483648;

System.out.println("max int"+maxInt+"min number"+minInt);
long maxlong=9223372036854775807L;
long minlong=92233720368547808L;
System.out.println("longmax"+maxlong+"longmin"+minlong);
	}

}
