package school.sorokin.javacore.Basics;
import java.util.Scanner;

public class repeatSwitch {

    double RUB;
    double USD = 78.25;
    double EUR = 90.79;
    double CNY = 11.02;

    double totalUSD;
    double totalEUR;
    double totalCNY;

    static String choice;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
     do {
         repeatSwitch money = new repeatSwitch();

         System.out.print("Enter Cash in RUB: ");
         money.RUB = Double.parseDouble(sc.nextLine());
         System.out.print("Enter your choice -> (USD/EUR/CNY) OR \"q\" to EXIT: ");
         choice = sc.nextLine();

         switch (choice.toLowerCase()) {
             case "usd":
                 money.totalUSD = (money.RUB / money.USD);
                 System.out.println(String.format("Converted RUB to USD: %.3f USD.",money.totalUSD));
                 break;
             case "eur":
                 money.totalEUR = (money.RUB / money.EUR);
                 System.out.println(String.format("Converted RUB to EUR: %.3f EUR.",money.totalEUR));
                 break;
             case "cny":
                 money.totalCNY = (money.RUB / money.CNY);
                 System.out.println(String.format("Converted RUB to CNY: %.3f CNY.",money.totalCNY));
                 break;
             default:
                 System.out.println("Invalid choice");
                 break;
         }
     }while(!choice.equalsIgnoreCase("q"));
    }
}

class swi {

    double numberOne;
    double numberTwo;
    int choice;
    static double resPlus,resMinys,resDel,resUmnoj;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        swi math = new swi();

        System.out.println("=+-КАЛЬКУЛЯТОР*/==");
        System.out.println("      МЕНЮ");
        System.out.println("(1) - сложение.");
        System.out.println("(2) - вычетание.");
        System.out.println("(3) - умножение.");
        System.out.println("(4) - деление.");
        System.out.println("(0) - выход.");
        System.out.println("--------------------------");

        System.out.print("Enter your choice: ");
        math.choice = sc.nextInt();
        System.out.print("Enter number(1): ");
        math.numberOne = Double.parseDouble(sc.nextLine());
        System.out.print("Enter number (2): ");
        math.numberTwo = Double.parseDouble(sc.nextLine());


          switch(math.choice){
             case 1 : resPlus = math.numberOne+math.numberTwo;
             System.out.println("Результат: "+resPlus);break;
             case 2 : resMinys = math.numberOne-math.numberTwo;
             System.out.println("Результат: "+resMinys);break;
             case 3 : resDel = math.numberOne*math.numberTwo;
             System.out.println("Результат: "+resUmnoj);break;
             case 4 : if(math.numberTwo!=0){
                 resUmnoj = math.numberOne/math.numberTwo;
                 System.out.println("Результат: "+resDel);}
                 else{System.out.println("Делить на ноль нельзя!");} break;
             default:System.out.println("Invalid choice");
        }
    }
}

class example {
    static double number;
    static double totalNumber;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number OR \"0\" to EXIT: ");
        number = Double.parseDouble(sc.nextLine());

        while(number>0){
            totalNumber+=number;
            System.out.print("Enter your number OR \"0\" to EXIT: ");
            number = Double.parseDouble(sc.nextLine());
        }System.out.println(totalNumber);

    }
}
