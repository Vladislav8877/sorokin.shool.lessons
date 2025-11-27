package school.sorokin.javacore.Basics;
import java.util.Scanner;
public class StringOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("Enter a string: ");
        sb.append(sc.nextLine());

        int length = sb.length();
        System.out.println("The length of the string is: " + length);

        System.out.println(sb.toString().toUpperCase());

        boolean find = sb.toString().contains("Java");
        if(find){
            int index = sb.indexOf("Java");
            System.out.println("Первое вхождения слова \"Java\" на индексе: "+index);
        }

        String[] info = sb.toString().split(" ");
        for(String inf : info){
            System.out.println(inf.trim());
        }



    }
}
