package school.sorokin.javacore.Basics;
import java.util.Scanner;

 class repeatIfElse { // repeat if-else

    public static Scanner sc=new Scanner(System.in);
    public static String subscription;
    static String codeFlex = "abc123";

    public static void main(String[] args) {

       do{ System.out.println("    MENU    ");
        System.out.println("Enter your subscription (DAY/FLEX/NIGHT)");
        System.out.println("Enter (Q) for \"EXIT\"");
        subscription = sc.nextLine();

        if(subscription.equalsIgnoreCase("DAY")){
            System.out.print("Enter your time: ");
            double time = Double.parseDouble(sc.nextLine());

            if(time>=6.00&&time<=18.00){
                System.out.println("Welcome in our club!");
            }else{System.out.println("Invalid time!");
        }
    }else if(subscription.equalsIgnoreCase("NIGHT")){
            System.out.print("Enter your time: ");
            double time = Double.parseDouble(sc.nextLine());

            if(time>=18.00&&time<=23.00){
                System.out.println("Welcome in our club!");
            }else{System.out.println("Invalid time!");}
        }
        else if(subscription.equalsIgnoreCase("FLEX")){
            System.out.println("Enter your code: ");
            String password = sc.nextLine();

            if(password.equals(codeFlex)){
                System.out.println("Welcome in our club!");
            }else{System.out.println("Invalid code!");}
        }else{System.out.println("Invalid subscription!");}

    }while(!subscription.equalsIgnoreCase("Q"));

    }
}


