// There are the Four types of Function inthe Java 
// With return type and with parameter
// With return type and without parameter
// Without return type and with parameter
// Without return type and without parameter
// Method overloading is a feature that allows a class to have more than one method having the same name, if their parameter lists are different. It is related to compile-time (or static) polymorphism.
//  Mthod overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. It is related to run-time (or dynamic) polymorphism.
import java.util.*;
public class fun {
    public static void add(int a, int b) {
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        add(a,b);
        mul(a, b);
    }
    public static void mul(int a,int b){
        int mul = a * b;
        System.out.println("The multiplication is: " + mul);
    }
}