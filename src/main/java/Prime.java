
public class Prime {//Prime class to find the prime numbers
     boolean prime[]=new boolean[1000];//array of 1000 numbers
     
     public void range(){//method with for loop to find the numbers that are prime and vise versa
         for(int i = 0; i < 1000; i++){
           prime[i] = true;
       }
          for(int i = 2; i < 1000; i++){
           if(prime[i] == true){
               for(int j = i + 1; j < 1000; j++){
                   if(j % i == 0) prime[j] = false;
               }
                   
           }       
       }
          System.out.println("The prime numbers in from range 2 to 1000 are:");
       for(int i = 2; i < 1000; i++){
           if(prime[i] == true) 
             System.out.println(i + " ");//print the prime numbers from 2-1000
       }
                   
     }
     public static void main(String[] args){
         Prime primeNum = new Prime();
         primeNum.range();//calling the range() method to print it out in screen
       }  
     }
    

