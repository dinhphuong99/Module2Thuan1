package BaiTapJavaLoop;

public class PrimeNumbersLessThan100 {
    public static void main(String[] args) {
        for (int i = 2; i<100; i++){
            if(isPrime(i)){
                System.out.printf(" " + i);
            }
        }
    }

    public static boolean isPrime(int number){
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime && number>=2)
            isPrime = true;
        else
            isPrime = false;

        return isPrime;
    }
}
