package student;

import java.util.Scanner;

public class Exceptions {
    Scanner scanner = new Scanner(System.in);
    Integer number;
    String userInput,userInputClass;
    public String erorrName(String name) {

        boolean option = false;
        do {
            System.out.println("Pleas Input  Enter Name:");
            try {
                 userInput = scanner.nextLine();
                option = true;
            } catch (Exception ex) {
                System.out.println("Pleas Input again false..!");
            }
        } while (!option);
        return userInput;
    }
    //==================================
//    public String erorrClass(String classname) {
//
//        boolean option = false;
//        do {
//            System.out.println("Pleas Input  Enter Class:");
//            try {
//                userInputClass = scanner.nextLine();
//                option = true;
//            } catch (Exception ex) {
//                System.out.println("Pleas Input again false..!");
//            }
//        } while (!option);
//        return userInputClass;
//    }

    public Integer erorrInteger(String value){
            boolean options=false;
            do {
                System.out.println("Pleas Input Enter Enter "+value+":");
                try {
                    String userInput = scanner.nextLine();
                    number =Integer.parseInt(userInput);
                    if(number<=0){
                        System.out.println("Pleas Input again false..!");
                    }else {
                        options=true;
                    }
                } catch (Exception ex) {
                    System.out.println("Pleas Input again false..!");
                }
            }while (!options);
            return number;
        }
    public Integer erorrScore(String value){
        boolean options=false;
        do {
            System.out.println("Pleas Input Enter Enter "+value+":");
            try {
                String userInput = scanner.nextLine();
                number =Integer.parseInt(userInput);
                if(number<=0){
                    System.out.println("Pleas Input again false..!");
                }else {
                    options=true;
                }
            } catch (Exception ex) {
                System.out.println("Pleas Input again false..!");
            }
        }while (!options);
        return number;
    }

}



