/*
 * Sample program to introduce functional interfaces with lambda notation
 */
package lambdas_01_01;
import java.util.function.*;
/**
 *
 * @author Vishnu Sunkari
 */
public class Lambdas_01_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //using the test method of Predicate
        Predicate<String> stringLen  = s-> s.length() < 10;
        System.out.println(stringLen.test("Apples") + " - Apples is less than 10");

        //Consumer example uses accept method
         Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
         consumerStr.accept("ABCDefghijklmnopQRSTuvWxyZ");
         
        //Function example uses apply method       
        Function<Integer,String> converter = (num)-> Integer.toString(num);
        System.out.println("length of 26: " + converter.apply(26).length());

        //Supplier example uses get method
        Supplier<String> s  = ()-> "Java is fun";
        System.out.println(s.get());
        
        //Binary Operator example uses apply method
        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println("add 10 + 25: " + add.apply(10, 25));
        
        //Unary Operator example uses apply method
        UnaryOperator<String> str  = (msg)-> msg.toUpperCase();
        System.out.println(str.apply("This is my message in upper case"));
    }
    
}
