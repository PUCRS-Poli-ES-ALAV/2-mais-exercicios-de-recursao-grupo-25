public static void main (String agrs[]) throws Exception{

    int num = 5;
    int num2 = 10;
    String pal = "arara";
    System.out.println("Fatorial = " + fatorial(num)); // 1
    System.out.println("Somatorio = " + soma(num)); // 2
    System.out.println("Fibonacci = " + fibonacci(num)); // 3
    System.out.println("Somatorio entre k e j = " + somaInt(num, num2)); // 4
    System.out.println("Somatorio 2 entre k e j = " + somaInt2(num, num2)); // 4
    System.out.println("Se eh palindrome = " + isPal(pal)); // 5

}

//ex1
public static int fatorial (int n) throws Exception{
	if(n <= 0) {throw new Exception();} 
	if(n == 1) return 1;
	return n * fatorial(n-1);
}

//ex2
public static int soma (int n){
	if(n == 0) return 0;
	if(n > 0) return (n + soma(n-1));
	return (n + soma(n+1)); 
}

//ex3
public static int fibonacci(int n) throws Exception{
	if(n<0) {throw new Exception();} 
	if(n == 0) return 0; 
	if(n == 1) return 1; 
	return fibonacci(n-1) + fibonacci(n-2); 
}

//ex4 
public static int somaInt(int k, int j){
	if(k == j) return k; 
	if(k > j) return somaInt(j,k);
	return k + somaInt(k+1,j);
}
// OU 
public static int somaInt2(int k, int j){
	if(k == j) return k; 
	if(k > j) return k + somaInt(k-1, j);
	return k + somaInt(k+1,j);
}

//ex5
public static boolean isPal(String s) throws Exception{
    if(s == null){throw new Exception();}

    if(s.length() == 0) return true; 
    if(s.length() == 1) return true;
    if(s.charAt(0) != s.charAt(s.length()-1)) return false; 

    return isPal(s.substring(1, s.length()-1));
}

//ex6
