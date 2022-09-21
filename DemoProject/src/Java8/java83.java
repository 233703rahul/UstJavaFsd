package Java8;


import java.util.Random;

class java83 {
 
    public static void main(String[] args) {
 
        Random random = new Random();
        random.ints().limit(5).sorted().forEach(System.out::println);
        
      
 
    }
}