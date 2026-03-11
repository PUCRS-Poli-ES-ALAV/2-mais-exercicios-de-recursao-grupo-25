public static void main (String agrs[]){

    int num = 5;
    int num2 = 10;
    System.out.println(fatorial(num));
    System.out.println(soma(num));
    System.out.println(fibonacci(num));
    System.out.println(somaInt(num, num2));
    System.out.println(somaInt2(num, num2));

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