package util;

public class Mat {
	
	public static int MCD(int a, int b) {
		if(a<b) {
			int t = a;
			a = b;
			b = t;
		}
	    int r;
	    while(b != 0){
	         r = a % b;
	         a = b; 
	         b = r;
	    }
	    return a; 
	}
	
	public static int mcm(int a, int b) {
		return (a*b)/MCD(a,b);
	}

}
