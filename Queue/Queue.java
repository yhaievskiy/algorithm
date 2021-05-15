import java.util.Scanner;

public class Queue {
    public static void main(String[] args) throws Exception {
        LinkedQueueOfStrings queue = new LinkedQueueOfStrings();
        while(true) {
            Scanner sc= new Scanner(System.in); 
            System.out.print("Enter a string: ");  
            String str= sc.nextLine();  
            if(str.equals("show last item")) System.out.println(queue.dequeue());
            else queue.enqueue(str);
        }
    }
}