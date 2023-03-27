import java.util.Scanner;

public class Testcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean option=false;
        do {
            System.out.println("Enter Number:");
            try {
                String userInput = scanner.nextLine();
                Integer number =Integer.parseInt(userInput);
                if(number<=0){
                    System.out.println("can't input ..!");
                }else {
                    option=true;
                }
            } catch (Exception ex) {
                System.out.println("false..!");
            }
        }while (!option);
    }
}
