public class TukarDuaDataAngka {
		public static void main (String[] args){
			String x = "1";
			String y = "2";
			int a = 1;
			int b = 2;
			
			a = a+b;
			b = a-b;
			a = a-b;
			
			System.out.println("A adalah "+x);
			System.out.println("B adalah "+y);
			
			System.out.println();
			System.out.println("Berubah Menjadi");
			System.out.println();

			System.out.println("A adalah "+a);
			System.out.println("B adalah "+b);
		}
}	