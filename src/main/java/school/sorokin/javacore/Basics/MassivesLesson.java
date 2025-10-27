package school.sorokin.javacore.Basics;
import java.util.Arrays;
import java.util.Scanner;
public class MassivesLesson {
    public static void main(String[] args){

        // int[] numbers = new int[10]; -> создание массива с заданной длиной.

        // int[] numbers = {10,20,30,40,50,60,70}; -> инициализация при объявлении.

        /* int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){ -> заполнение массива с помощью цикла.
            numbers[i]=i*10;
            System.out.print(numbers[i]+" ");
        }
        */

/* Scanner console = new Scanner(System.in);

int[] numbers = new int[5];
for(int i = 0; i < numbers.length; i++){
    System.out.print("Enter your numbers: ");   -> заполнение массива с помощью ввода с клавиатуры.
    numbers[i] = console.nextInt();
} System.out.println(Arrays.toString(numbers));
*/


        /* int[] numbers = {234,122,67,89,90,456};
        int min = numbers[0];
        int max = numbers[0];

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]<min) {
                min=numbers[i];
            }                                  -> опр. индекс мин и макс элемента.
                if(numbers[i]>max){
                    max=numbers[i];
                }
            }
        System.out.println("Min number is: "+min);
        System.out.println("Max number is: "+max);
        */

/* Scanner console = new Scanner(System.in);

int[] numbers = new int[10];
for(int i = 0; i < numbers.length; i++){
    System.out.print("Enter your numbers: ");
    numbers[i]=console.nextInt();
}

int max = numbers[0];
int min = numbers[0];

for(int i = 0; i < numbers.length; i++){     -> опр. индекс мин и макс элемента с помощью ввода.
    if(numbers[i]>max){
        max=numbers[i];
    }
    if(numbers[i]<min){
        min=numbers[i];
    }
} System.out.println("Max numbers is: "+ max + ", Min numbers is: "+ min);

 */


/* int[] numbers = {3,6,9,12,13,14,2};
for(int i = 0; i < numbers.length-1; i++){
    for(int j = 0; j < numbers.length - 1 - i; j++){ -> сортировка массива по возрастанию "Пузырьком" ;)
        if (numbers[j] > numbers[j+1]){
            int num = numbers[j];
            numbers[j] = numbers[j+1];
            numbers[j+1] = num;
        }
    }
}
for(int number : numbers){
    System.out.print(number+"\t");
}
*/


/*        int[][] numbers = new int[2][5];
        int sum = 1;
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 5; j++){    -> 1-й вариант заполнение таблицы и вывода.
                numbers[i][j]=sum;
                sum++;
                System.out.print(numbers[i][j]+"\t");
            } System.out.println();
        }
*/

/*        int[][] numbers = {
                {1,2,3,4,5},
                {6,7,8,9,10}
        };

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){  -> 2-й варик.
                System.out.print(numbers[i][j]+"\t");
            } System.out.println();
        }
*/

/* Scanner input = new Scanner(System.in);

System.out.print("Введите кол-во строк: ");
int rows = input.nextInt();
System.out.print("Введите кол-во столбцов: ");
int cols = input.nextInt();

int[][] numbers = new int[rows][cols];

for(int i = 0; i<rows; i++){
    System.out.println("Строка: "+(i+1));
    for(int j = 0; j<cols; j++){
        System.out.println("Таблица -> "+(j+1));   -> 3-й варик с вводом.
        numbers[i][j]=input.nextInt();
    }
}


for(int i = 0; i<rows; i++){
    for(int j = 0; j<cols; j++){
        System.out.print(numbers[i][j]+"\t");
    } System.out.println();
}
System.out.println(Arrays.deepToString(numbers));


 */


    }
}
