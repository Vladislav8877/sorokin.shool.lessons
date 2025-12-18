package school.sorokin.javacore.Basics;

class testing{
    static void sum(int a, int b){
        int sum = a+b; System.out.println(sum);
    }
    public static void main(String[] args){
        sum(10,20);
    }
}


public class constructor{
    public static void main(String[] args){
        testing.sum(100,200);
    }
}


class testingTwo{

    private static int totalGameScore = 0;
    static void collect(){
        totalGameScore++;
    }
    static void proses(){
        System.out.println("Proses: "+totalGameScore);
    }

    static void message(String message, int count){
        String res = "";
        for(int i = 0; i < count; i++){
            res+=message;
        }System.out.println(res+"! ");
    }

    void math(int a, int b, int c){
        System.out.println("Math: "+(a+b+c));
    }

    static void massive(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]+"\t");
        }
    }

    void card(String name, int age){
        String card = "Name: "+name+"\nAge: "+ age;
        System.out.println(card);
    }

public static void main(String[] args){
        collect();
        collect();
        collect();
        proses();

        message("УРА",3);

        testingTwo test = new testingTwo();
        test.math(10,10,100);

        int[] numbers = {100,99,98};
        massive(numbers);


        test.card("Vlad",22);
    }
}

class ret{
    int arrays(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
        return sum;
        }

        int col(int a, int b) {
            return a + b;
        }
        boolean even(int a){
        return a%2==0;
    }

    static String hello(String name, int age){
        return "Hello, what is yor name and age? - "+name+", "+age;
    }


    public static void main(String[] args) {
        ret ret = new ret();
        int[] numbers = {12,12,1,2,12};
        int result = ret.arrays(numbers);
        System.out.println(result);

        int res = ret.col(100,99);
        System.out.println(res);
        boolean isEven = ret.even(97);
        System.out.println(isEven);

        String inf = hello("Vladislav",22);
        System.out.println(inf);


    }
}