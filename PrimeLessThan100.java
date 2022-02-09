public class PrimeLessThan100 {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            if(checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean checkPrime(int x){
        if(x<=1){
            return  false;
        }
        if(x<=3){
            return  true;
        }
        for (int i = 2; i <=Math.sqrt(x) ; i++) {
            if (x % i == 0) return false;

        }
        return true;
    }
}
