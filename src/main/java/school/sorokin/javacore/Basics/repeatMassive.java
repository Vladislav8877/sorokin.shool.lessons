package school.sorokin.javacore.Basics;
import java.util.Scanner;
import java.util.Arrays;

public class repeatMassive {
    public static void main(String[] args) {

       int[] marks = {3,3,4,3,5,5,4,5};
       int sum = 0;
       for(int i = 0; i < marks.length; i++){
           sum+=marks[i];
       }
       double total = (double)sum/marks.length;
       System.out.println(Math.round(total));

       int[] marksTwo = {3,3,4,4,5,4,3,5};
       int sumTwo = 0;
       for(int mark: marksTwo){
           sumTwo+=mark;
       }
       double totalTwo = (double)sumTwo/marksTwo.length;
       String studentAzarov = String.format("Mark for \"Russia\": %.2f",totalTwo); System.out.println(studentAzarov);


       Scanner sc = new Scanner(System.in);

       int[] numbers = new int[5];
       int summa = 0;
       for(int i = 0; i < numbers.length; i++){
           System.out.print("Enter number "+(i+1)+" of 5: ");
           numbers[i]=sc.nextInt();
           summa+=numbers[i];
       }System.out.println("Общая сумма: "+summa);

       Scanner sc2 = new Scanner(System.in);
       String[] movies = new String[3];
       String favoriteMovie ="";
       for(int i = 0; i < movies.length; i++){
           System.out.println("Enter movie: "+(i+1)+" of "+movies.length);
           movies[i]=sc2.nextLine();
           favoriteMovie+=movies[i];
       }System.out.println(Arrays.toString(movies));
       System.out.println(favoriteMovie);
       for(String str : movies){
           System.out.print(str+" ");
       }
    }
}



class massiveMaxMin{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] Numbers = new int[5];
        for(int i = 0; i < Numbers.length; i++){
            System.out.print("Enter number "+(i+1)+": ");
            Numbers[i]=scanner.nextInt();
        }

        int max = Numbers[0];
        int min = Numbers[0];

        for(int i = 1 ; i < Numbers.length; i++){
            if(Numbers[i]>max){
                max = Numbers[i];
            }
            if(Numbers[i]<min){
                min = Numbers[i];
            }
        }System.out.println(max+"\n"+min);


        int[] numbers = {10,20,30,40,50};
        int Max = numbers[0];
        int Min = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]>Max){
                Max=numbers[i];
            }
            if(numbers[i]<Min){
                numbers[i]=Min;
            }
        }System.out.println(max+"\n"+min);
    }
}



class different{
    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 110 / 100;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(numbers[numbers.length - 1]);

        int[] original = {12,12,12,13,13};
        int[] copy = new int[original.length];
        for(int i = 0; i < original.length; i++){
            copy[i]=original[i];
        }
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(numbers));

        int[] Numbers = {100,200,300,400,500};
        for(int i = Numbers.length-1; i >=0; i--){
            System.out.print(Numbers[i]+" ");
        }

        String[] movies = {"Marvel","CD","GosFilm"};
        for(int i = movies.length-1; i >= 0; i--){
            System.out.print(movies[i]+" ");
        }
    }
}



class bumble {
    public static void main(String[] args) {

        int[] bumble = {5, 1, 2, 4, 3};
        for(int i = 0; i < bumble.length - 1; i++){
            for(int j = 0; j < bumble.length - 1 - i; j++){
                if(bumble[j] > bumble[j + 1]){
                    int temp = bumble[j];
                    bumble[j] = bumble[j + 1];
                    bumble[j + 1] = temp;
                }
            }
        } System.out.println(Arrays.toString(bumble));
        for(int bumb : bumble){
            System.out.println(bumb+" ");
        }
    }
}



class tasks {
    public static void main(String[] args) {

        int[] degrees = {12,10,11,10,13,12,9,8};
        int sumOfTemp = 0;
        for(int i = 0; i < degrees.length; i++){
            sumOfTemp+=degrees[i];
        }
        double midl = (double)sumOfTemp/degrees.length;
        int midlTemp = (int)Math.round(midl);
        System.out.println((midlTemp)+" средняя температура");

        int upperMidl = 0;
        for(int i = 0; i < degrees.length; i++){
            if(degrees[i]>midlTemp){
                upperMidl++;
            }
        }System.out.println("температура выше среднего: "+upperMidl+" дней");

        int max = degrees[0];
        int min = degrees[0];
        for(int i = 0; i < degrees.length; i++){
            if(degrees[i]>max){
                max = degrees[i];
            }
            if(degrees[i]<min){
                min = degrees[i];
            }
        }System.out.println("Максимальная температура: "+max+"\n"+"Минимальная температура: "+min);


        int[] grades = {3,3,4,5,5,4,3,2,3};

        int countGrades=0;
        for(int i = 0; i < grades.length; i++){
            if(grades[i]<4){
                countGrades++;
            }
        }
        int[] badGrades = new int[countGrades];
        int index = 0;
        for(int i = 0; i < grades.length; i++){
            if(grades[i]<4){
                badGrades[index]=grades[i];
                index++;
            }
        }System.out.println(Arrays.toString(badGrades));


        int[] numbers = {1,4,1,2,3,4,2,6,4,6};
        int maxN = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]>maxN){
                maxN=numbers[i];
            }
        }
        int[] count = new int[maxN+1];
        for(int i = 0; i < numbers.length; i++){
            count[numbers[i]]++;
        }System.out.println(Arrays.toString(count));

        for(int i = 0; i < count.length; i++){
            if(count[i]>=1){
                System.out.println("Число "+ i +"встречается "+count[i]+" раз");
            }
        }

        Scanner sc = new Scanner(System.in);
        int random = (int)(Math.random()*50)+1;
        int number;
        do{
            System.out.println("Enter your number(0/50) OR \"-1\" to EXIT: ");
            number = sc.nextInt();

            if(number>random){
                System.out.println("DOWN");
            }else if(number<random){
                System.out.println("UP");
            }else if(number==random){
                System.out.println("YOU WINNER!");
                random = (int)(Math.random()*50)+1;
            }
        }while(number!=-1);
        //НОД и ФАКТОРИАЛ!
    }
}


