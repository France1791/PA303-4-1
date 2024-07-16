import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        lessThan();
        ifElse();
        grades();
    }

    public static void lessThan(){
        int a = 7;
        if(a < 10){
            System.out.println("less than 10!");
        }
    }

    public static void ifElse(){
        int b = 15;
        if(b < 10){
            System.out.println("less than 10");
        }else if(b > 10 || b < 20){
            System.out.println("greater than 10 but less or equal to 20!");
        }else if( b > 20){
            System.out.println("greater or equal to 20");
        }
    }

    public static void grades(){
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        if(n1 < 60){
            System.out.println('F');
        } else if (n1 >=60 && n1 <= 69) {
            System.out.println('D');
        }else if(n1 >=70 && n1 <= 79){
            System.out.println('C');
        }else if(n1 >=80 && n1 <= 89){
            System.out.println('B');
        }else if(n1 >=90 && n1 <= 100) {
            System.out.println('A');
        }else {
                System.out.println("Error!");
            }
        }
    }
