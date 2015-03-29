/**
 * Created by cdandu16 on 3/29/15.
 */
public class FizzBuzz {
    public static void main(String[] args){
        for(int i = 0; i<100; i++){
            if(i%3==0 && i%5==0)//prints out fizzbuz if number is divisible by both 3 and 5
                System.out.println("FizzBuzz");
            else if(i%3==0)//prints out Fizz if only divisible by three
                System.out.println("Fizz");
            else if(i%5==0)//prints out Buzz if only divisible by five
                System.out.println("Buzz");
            else//prints out number if not divisible by 3 or 5
                System.out.println(i);
        }
    }
}
