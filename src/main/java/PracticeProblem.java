public class PracticeProblem {
	public static void main(String args[]) {

	}
	public static int calculate(int a, int b, char c){
	
		switch(c){
			case '+':
				return a+b;
			case '-':
				return a-b;
			case '*':
				return a*b;
			case '/':
				return a/b;
			case '%':
				return a%b;
			case '^':
				return (int) Math.pow(a,b);
			default:
				return 0;
		}

	}
	public static String minString(String a, String b, String c) {

    	String min = a;

    	if (b.compareToIgnoreCase(min) < 0) {
        	min = b;
    	}

    	if (c.compareToIgnoreCase(min) < 0) {
        	min = c;
    	}

    	return min;
	}
	public static boolean totalWordsChecker(String a) {

    	final int MAXIMUM = 10;

    	a = a.trim();

    	if (a.isEmpty()) {
        	return true;
    	}

    	String[] words = a.split(" ");

    	int count = 0;

    	for (String word : words) {
        	if (!word.isEmpty()) {
            	count++;
        	}
    	}

    	return count <= MAXIMUM; 
	}

}
