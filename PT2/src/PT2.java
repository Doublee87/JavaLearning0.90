
public class PT2 {

	public static void main(String[] args) {
	hello(8);
	hello(3);
	printThis ("Tree", 4);
	printThis ("OSU", 7);
	System.out.println (hypotenuse(3,4));
	System.out.println(maximum(1,6,3,4));
	subStrings("Beavers");
	}
	
	public static void hello(int x){
		for (int i=0; i<x; i++){
			System.out.print("Hello");
		}	
		System.out.println("");
	}


	public static void printThis(String str, int y){
		for (int j=0; j<y; j++){
		System.out.print(str);
		}
		System.out.println("");
		
		
	}
	public static double hypotenuse (int a,int b){
		double h1= Math.pow(a, 2.0);
		double h2= Math.pow(b, 2.0);
		double h3= h1+h2;
		double h4=Math.sqrt(h3);
		return h4;
		
	}
	public static int maximum (int x1,int y1, int x2,int y2){
		int y3 = Math.max(y1, y2);
		int x3 = Math.max(x1, x2);
		int mx = Math.max(y3, x3);
		return mx;
		
	}
	public static void subStrings(String p5){
		int len =p5.length();
		for (int p=0; p<len; p++){
			System.out.println(p5.substring(p, len));
		}
	}
}
