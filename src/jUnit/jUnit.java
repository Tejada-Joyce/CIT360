package jUnit;

public class jUnit {
	
	int a;
	int b;
	
	public jUnit(int a, int b) {
		this.a = a;
		this.b = b;		
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
	
	public static boolean firstIsGreater(int a, int b){
        
        boolean result = false;
        if(a > b){
            result = true;
        }
        return result;
    }
}
