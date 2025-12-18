package school.sorokin.javacore.Basics;
import java.util.Arrays;

public class repeatMassiveThree {
    public static void main(String[] args) {

        int[][][] numbers = new int[3][10][10];
        numbers[0][1][2] = 101;

        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers[i].length; j++){
                for(int k = 0; k < numbers[i][j].length; k++){
                    System.out.print(numbers[i][j][k]+"\t");
                }System.out.println();
            }System.out.println("------------------");
        }

        int[][][] massa = new int[2][3][3];
        int sum = 33;
        for(int i = 0; i < massa.length; i++){
            for(int j = 0; j < massa[i].length; j++){
                for(int k = 0; k < massa[i][j].length; k++){
                    massa[i][j][k]+=sum;
                    sum+=3;
                    System.out.print(massa[i][j][k]+"\t");
                }System.out.println();
            }System.out.println("-------------------");
        }

        int[][][] massive = {
                {{100,200,300},{400,500,600,700},{700,600,500,400,300}},
                {{300,400,500,600,700},{700,800,900,800},{600,500,400}},
                {{400,300,200},{200,100},{100,0}}};

        for(int[][] mass : massive){
            for(int[] mas : mass){
                for(int ma : mas){
                    System.out.print(ma+"\t");
                }System.out.println();
            }System.out.println("------------");
        }
        for(int i = massive.length - 1; i>=0; i--){
            for(int j = massive[i].length -1; j>=0; j--){
                for(int k = massive[i][j].length-1; k>=0; k--){
                    System.out.print(massive[i][j][k]+"\t");
                }System.out.println();
            }System.out.println("--------");
        }
    }
}

class task {
    public static void main(String[] args) {

        int[][][] numbers = new int[3][5][5];
        int count = 1;
        for(int i = 0; i < numbers.length; i++){
            int sum = 0;
            for(int j = 0; j < numbers[i].length; j++){
                for(int k = 0; k < numbers[i][j].length; k++){
                    numbers[i][j][k]=count++;
                    sum+=numbers[i][j][k];
                    System.out.print(numbers[i][j][k]+"\t");
                }System.out.println();
            }System.out.println("Сумма чисел "+(i+1)+" слоя = "+sum);
            System.out.println("-------------------");
        }System.out.println("Конец;)");
        System.out.println("******************************");


        int[][][] massive = new int[3][5][5];
        int random;

        for(int i = 0; i < massive.length; i++){
            int max = 0;
            for(int j = 0; j < massive[i].length; j++){
                for(int k = 0; k < massive[i][j].length; k++){
                    random = (int)(Math.random()*100)+1;
                    massive[i][j][k]=random;
                    System.out.print(massive[i][j][k]+"\t");
                    if(massive[i][j][k]>max){
                        max = massive[i][j][k];
                    }
                }System.out.println();
            }System.out.println("самое большое число в "+(i+1)+" слое = "+max);
            System.out.println("-------------");
        }System.out.println("Конец;)");
        System.out.println("*************************");
    }
}

class factorial {
    public static void main(String[] args) {

        int number = 5;
        long factorial = 1;
        for(int i = 1; i<=number; i++){
            factorial*=i;
            System.out.println(factorial);
        }System.out.println("***************************");

        System.out.println(Math.abs(-100));
        System.out.println(Math.abs(-500));

        int numbers = -555;
        int sum = 0;
        int newNumber = Math.abs(numbers);

        while(newNumber>0){
            int last = newNumber % 10;
            sum+=last;
            newNumber/=10;
        } System.out.println("Сумма чисел числа "+numbers+" = "+sum);


        int a = 12;
        int b = 18;
        int origA = a;
        int origB = b;
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        } System.out.println("НОД("+origA+","+origB+ ") = "+a);
    }
}

class metods{
    public static void main(String[] args) {

        int[] numb = {10,20,30};
        int[] numbTwo = numb.clone();
        System.out.println(Arrays.toString(numbTwo));
        System.out.println(Arrays.toString(numb));

        int[] numbers = {6,1,2,4,3,5};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        String[] fruits = {"Banana","Orange","Apple","Watermelon"};
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));
        char[] at = {'b','t','i','p','q','a'};
        Arrays.sort(at);
        System.out.println(Arrays.toString(at));
        int[] numbersTwo = {9,4,1,6,3,7,2,8,5};
        Arrays.sort(numbersTwo,0,5);
        System.out.println(Arrays.toString(numbersTwo));
        Arrays.sort(numbersTwo,0,numbersTwo.length-1);
        System.out.println(Arrays.toString(numbersTwo));

        int[] fill = new int[10];
        Arrays.fill(fill,10);
        System.out.println(Arrays.toString(fill));
        Arrays.fill(fill,0,5,99);
        System.out.println(Arrays.toString(fill));

        int[] orig = {33,22,11,99,88,77};
        int[] copy = Arrays.copyOf(orig,orig.length);
        System.out.println(Arrays.toString(orig));
        System.out.println(Arrays.toString(copy));
        int[] copyTwo = Arrays.copyOfRange(orig,0,5);
        System.out.println(Arrays.toString(copyTwo));

        int[] one = {10,20,30,40};
        int[] two = one;
        System.out.println(Arrays.equals(one,two));

        int[][] three = {{1,2},{3,4}};
        int[][] four = {{100,200},{300}};
        System.out.println(Arrays.deepEquals(four,three));
    }
}