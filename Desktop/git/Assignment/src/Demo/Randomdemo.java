package Demo;

public class Randomdemo {
	public static void main(String[] args) {
	
		int start = 65;
		int end = 125;
		
		for(int i=0; i<10; i++) {
			double b1 = Math.random();
			int b2 = (int)(b1 * ((char)end-(char)start)) + start;
			
			System.out.print((char)b2);
		
		}
		
	}

}
