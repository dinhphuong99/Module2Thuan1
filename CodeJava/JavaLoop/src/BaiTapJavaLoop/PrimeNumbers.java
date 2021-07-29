package BaiTapJavaLoop;

public class PrimeNumbers {
    public static void main(String[] args) {
        int i = 0, count = 0;

        while (count < 20){
            if(isPrime(i)){
                System.out.printf(" " + i);
                count ++;
            }
            i++;
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
