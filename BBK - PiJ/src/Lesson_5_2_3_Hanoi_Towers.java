import java.util.Scanner;

public class Lesson_5_2_3_Hanoi_Towers {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("How many discs do you wish to calculate?");
        int discs = s.nextInt();
        System.out.println(discs + " discs requires "+ hanoiMoves(discs) + " moves.");
        
    }
    
    static int hanoiMoves(int discs){
        if(discs == 1){
            return 1;
        }
        return hanoiMoves(discs-1) + 1 + hanoiMoves(discs-1);
    }

}