public class Swap {

    public static void main(String[] args) {
        
        // Define your numbers
        float first = 1;
        float second = 2;

        // assigning first variable value to a another float variable
        float temp = first;

        // Assigning value of second is assigned to first
        first = second;

        // Asigning second value from the tempory value which we assigned previously
        second = temp;
        
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}
