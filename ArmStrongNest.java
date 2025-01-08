// Armstrong useing nested loop

class ArmStrongNest {
    public static void main(String[] args) {
        
        for (int i = 10; i <= 1000; i++) {
            int n = i; 
            int sum = 0;

           
            while (n > 0) {
                int rem = n % 10;                 
		sum = sum + rem * rem * rem; 
                n = n / 10;
            }

       if (i == sum) {
                System.out.println(i); 
            }
        }
    }
}
