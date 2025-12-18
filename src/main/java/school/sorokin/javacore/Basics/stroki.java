package school.sorokin.javacore.Basics;

import java.util.Arrays;
import java.util.Scanner;


/* public class stroki {
    public static void main(String[] args) {

        String name = "Vlad";
        int age = 22;
        double balance = 44.568;
        String inf = String.format("Name: %s%nAge: %d%nBalance: %.2f",name,age,balance);
        System.out.println(inf);

        String student = "Vladislav";
        int answered = 96;
        int questions = 100;
        double prosent = (double)answered/questions;
        String result = String.format("Name: %s%nAge: %d%nProsent: %.2f",student,answered,prosent*100);
        System.out.println(result);
    }
}
 */

public class stroki {

    static Scanner sc = new Scanner(System.in);
    static String[] phoneNames = new String[10];
    static String[] phoneNumbers = new String[10];
    static int countNumbers = 0;
    static String choice;
    static boolean notSearch = true;

    static void count() {
        countNumbers++;
    }

    public static void main(String[] args) {


        do{
            System.out.println("||||ТЕЛЕФОННАЯ КНИГА||||");
            System.out.println("      МЕНЮ");
            System.out.println("(1) - Добавить контакт");
            System.out.println("(2) - Просмотреть контакты");
            System.out.println("(3) - Найти контакт");
            System.out.println("(4) - Удалить контакт");
            System.out.println("(0) - Выйти");
            System.out.print("Сделай правильный выбор: ");
            choice = sc.nextLine().trim();

            switch (choice) {

                case "1":
                    for(int i = 0; i < phoneNumbers.length; i++){
                        if(phoneNumbers[i] == null){
                            System.out.print("Введите номер телефона: ");
                            String number = sc.nextLine();
                            if(!number.trim().isEmpty()&&number.matches("[0-9]+")){
                                phoneNumbers[i]=number.trim();
                                count();
                            }else{
                                System.out.println("Некорректный ввод!");
                                continue;
                            }

                            for(int j = 0; j < phoneNames.length; j++){
                                if(phoneNames[i] == null){
                                    System.out.print("Введите имя абонента: ");
                                    phoneNames[i] = sc.nextLine().trim();
                                }
                            }break;
                        }else if (countNumbers==10){
                            System.out.println("Места в телефонной книги нет!\nОсвободите место!");break;}
                    } break;

                case "2":
                    for(int i = 0; i < phoneNumbers.length; i++){
                        System.out.println(String.format((i+1)+". %s - %s", phoneNames[i], phoneNumbers[i]));
                    }System.out.println("Количество абонентов: "+countNumbers); break;

                case "3":
                    System.out.print("Имя для поиска: ");
                    String search = sc.nextLine().trim();
                    for(int i = 0; i < phoneNames.length; i++){
                        if(search.equalsIgnoreCase(phoneNames[i])){
                            System.out.println("Телефон "+phoneNames[i]+": "+phoneNumbers[i]);
                            notSearch = false;
                        }
                    } if(notSearch){
                    System.out.println("Контакт с именем \""+search+"\" не найден.");} break;

                case "4":
                    System.out.print("Введите имя: ");
                    String searchDelete = sc.nextLine().trim();
                    for(int i = 0; i < phoneNames.length; i++){
                        if(searchDelete.equalsIgnoreCase(phoneNames[i])){
                            notSearch = false;
                            System.out.print(String.format("Удалить номер: \"%s - %s\"(да/нет): ",
                                    phoneNames[i], phoneNumbers[i]));
                            String delete = sc.nextLine().trim();

                            switch(delete.toLowerCase()){
                                case "да": phoneNames[i]=null; phoneNumbers[i]=null; break;
                                case "нет": break;
                                default: System.out.println("Некорректный ввод!");
                            }
                        }
                    }if(notSearch){
                    System.out.println("Абонент \""+searchDelete+"\" не найден");} break;

                default:
                    if (choice.equals("0")){
                        System.out.println("OFF");
                    } else {
                        System.out.println("Некорректный ввод!");
                    }

            }
        } while(!choice.equals("0"));
    }
}


/*public class stroki {

    static Scanner sc = new Scanner(System.in);
    static int countNumbers = 0;
    static StringBuilder[] phoneNumbers = new StringBuilder[10];
    static int choice;

    static void count() {
        countNumbers++;
    }

    static void info() {
        System.out.println(Arrays.toString(phoneNumbers));
        System.out.println(countNumbers);
    }

    public static void main(String[] args) {

        do {
            System.out.println("||||ТЕЛЕФОННАЯ КНИГА||||");
            System.out.println("      МЕНЮ");
            System.out.println("(1) - Добавить контакт");
            System.out.println("(2) - Просмотреть контакты");
            System.out.println("(3) - Найти контакт");
            System.out.println("(4) - Удалить контакт");
            System.out.println("(0) - Выйти");
            System.out.println("Сделай правильный выбор: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    for(int i = 0; i < phoneNumbers.length; i++){
                        if(phoneNumbers[i] == null){
                            System.out.print("Введите номер телефона: ");
                            phoneNumbers[i] = new StringBuilder();
                            phoneNumbers[i].append(sc.nextLine());
                            System.out.print("Введите имя абонента: ");
                            phoneNumbers[i].append(" - ").append(sc.nextLine());
                            count();
                            break;
                        }
                    } info(); break;

                case 2:
                    System.out.println("Контакты;");
                    for(int i  = 0; i < phoneNumbers.length - 1; i++){
                        for(int j = 0; j < phoneNumbers.length - 1 - i;  j++){
                            if(phoneNumbers[j].equals(Character.isLetter(phoneNumbers[j+1].charAt(0)))){
                                int temp = phoneNumbers[j+1].charAt(0);
                            }
                        }

                    }




            }
        } while(choice!=0);
    }
}
 */

