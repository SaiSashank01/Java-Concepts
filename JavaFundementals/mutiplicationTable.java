// Java program to print table of a number 
import java.util.*;
class mutiplicationTable {
    public static void printTable(int n)  {         
        for (int i = 1; i <= 10; ++i) 
            System.out.println(n + " * " + i +" = " + n * i);
    }
    public static void main(String arg[]){   
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int tableNumber = obj.nextInt(); 
        System.out.println("Enter the Mutiplication of Table is :" +tableNumber);
        printTable(tableNumber);
    }
}
