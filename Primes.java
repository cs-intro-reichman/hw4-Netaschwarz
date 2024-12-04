public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        boolean[]prime = new boolean[N+1];
        for(int i =2; i<N+1; i++){
            prime[i]= true;
        }
       
        int h =2;
        int count = 0;
        while(h<prime.length){
            for(int j=2; j<h; j++){
                if((prime[j] == true) && (h%j== 0)){
                    prime[h]=false;
                }
            }
            if(prime[h]==true){
                System.out.println(h);
                count++;
            }
            h++;
        }
     int percent = (count*100)/(N);
     System.out.println("There are "+ count + " primes between 2 and "+ N + " (" + percent+ "% are primes)"); 
        }
    }
