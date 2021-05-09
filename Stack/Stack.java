import java.util.Scanner;

public class Stack {
    public static void main(String[] args) throws Exception {
        LinkedStackOfStrings stack = new LinkedStackOfStrings();
        while(true) {
            Scanner sc= new Scanner(System.in); 
            System.out.print("Enter a string: ");  
            String str= sc.nextLine();  
            if(str.equals("show last item")) System.out.println(stack.pop());
            else stack.push(str);
        }
    }
}
