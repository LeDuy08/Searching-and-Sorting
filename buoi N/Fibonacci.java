public class Fibonacci {
    // fibonacci : tính giá trị của phần tử n trong dãy Fibonacci :F0=0, F1=1, F2=1
    public static long fib1(int n) {
        long[] f = new long[n+1];
        f[0]=0;
        for(int i=2;i<=n;i++) {
            f[i]=f[i-1]+f[i-2];
        }
        return f[n];
    }

    public static long fib2(int n) {
        if(n<=1) return n;
        return fib2(n-1)+fib2(n-2);

    }
public static void main(String[] args) throws Exception {
    Scanner input=new Scanner(System.in);
    System.out.print(s: "Nhap n=");
    int n=input.nextInt();
    long to System.currentTimeMillis(); //bat dau do thoi gian theo mili giây
    System.out.println("Lap: phan tu thu "+n+ " la:"+ fib1(n));
    long t1=System.currentTimeMillis();
    System.out.println("thoi gian chay cua tt lap: "+(t1-t0));
    System.out.println("De quy: phan tu thu "+n+ la:"+ fib2(n));
    long t2=System.currentTimeMillis();
    System.out.println("thoi gian chay cua tt de quy: "+(t2-t1));
    input.close();

}
