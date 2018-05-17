import java.util.Scanner;
public class TriangleExercises {

    private static final String ASTERISK = "*";
    public static void PrintsANumberOfAsterisksHorizontalLine( int number){
        for (int i = 0; i<number; i++){
            System.out.print(ASTERISK);
        }
    }
    public static void PrintsANumberOfAsterisksVerticalLine( int number){
        for (int i = 0; i<number; i++){
            System.out.println(ASTERISK);
        }
    }
    public static void PrintOneAsterisks (){
        System.out.print(ASTERISK);
    }

    public static void main(String[] args) {
        System.out.println("Print one asterisk\n");
        PrintOneAsterisks();
        System.out.println("Print A Number Of Asterisks Horizontal Line \n ");
        PrintsANumberOfAsterisksHorizontalLine(7);
        System.out.println("\nPrint A Number Of Asterisks Vertical Line ");
        PrintsANumberOfAsterisksVerticalLine(7);





    }



}
