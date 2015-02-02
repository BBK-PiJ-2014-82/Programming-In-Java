import java.util.*;

public class Lesson_15_3_a {

    public static void main(String[] args) {
        
        double num;
        int times = 0;
        Scanner scn;
        int i = 0;
        
        System.out.println("Please enter the count of numbers you will enter:");
        
        try{
            scn = new Scanner(System.in);
            times = scn.nextInt();
        } catch(InputMismatchException exc){
            System.out.println("Message: "+exc.getMessage());
        } catch(Exception exc){
            System.out.println("Message: "+exc.getMessage());
        }
        
        double[] array = new double[times];
        
        System.out.println("Please enter " + times + " numbers:");
        System.out.println();
        
        while(i < times){
            System.out.print("Enter   : ");
            try{
                scn = new Scanner(System.in);
                num = scn.nextDouble();
                array[i] = num;
                i++;
            } catch(InputMismatchException exc){
                System.out.println("Message: "+exc.getMessage());
            } catch(Exception exc){
                System.out.println("Message: "+exc.getMessage());
            }
        }
        
        double total = 0;
        double mean;
        
        for(int j = 0; j < times; j++){
            total += array[j];
        }
        
        mean = total / times;
        System.out.println();
        System.out.println("Your mean is: " + mean);
        
    }

}