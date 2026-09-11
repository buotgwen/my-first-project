import java.util.Scanner;

public class BuotQueue {

    public static void main(String[] args) {

        
        try (Scanner scanner = new Scanner(System.in)) {
            
            LinkedList<String> myQueue = new LinkedList<>();
            System.out.print("How many items do you want to add? ");
            int number = scanner.nextInt();
            scanner.nextLine();
            
            for (int i = 1; i <= number; i++) {
                System.out.print("Enter item " + i + ": ");
                String item = scanner.nextLine();
                myQueue.add(item);
            }
            
            System.out.println("\nQueue: " + myQueue);
            
            if (!myQueue.isEmpty()) {
                System.out.println("First element: " + myQueue.peek());
                System.out.println("Removed: " + myQueue.poll());
            }
            
            // Display the Queue after removing an element
            System.out.println("Queue after poll: " + myQueue);
            
            // Check if the Queue is empty
            System.out.println("Is the queue empty? " + myQueue.isEmpty());
        }
    }

    public void add(String item) {
        System.out.println("Adding item: " + item);
    }
}
