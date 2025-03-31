package control;

public class PrimeGenerator {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        int count = 0;
        int num = 2;
        while(count < 100) {
            if(isPrime(num)) {
                System.out.println(num + " ");
                count++;
            }
            num++;
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (fim - inicio) + "ms");
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i+= 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}