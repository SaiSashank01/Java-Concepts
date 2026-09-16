import java.util.*;
public class evenOdd {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Value : ");
        int Number = obj.nextInt();
        if (Number % 2 == 0){
            System.out.println("This is Even. "+Number);
        }else{
            System.out.println("This is Odd. "+Number);
        }
    }
}
