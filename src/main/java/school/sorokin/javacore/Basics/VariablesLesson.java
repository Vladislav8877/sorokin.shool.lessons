package school.sorokin.javacore.Basics;

public class VariablesLesson {
    public static void main(String[] args) {
// это примитивные типы данных в Java;)

        byte peopleInCar = 5;
        short animalInZoo = 458;
        int peopleInRostov = 1500000;
        long chickenEgsInWord = 4555732123L;
        float maksFloat = 3.333333F;
        double minDouble = 3.3;
        boolean iLiveInUsa = false;
        char myDickIs = 'A';

        // тут я объявил все переменные,но через условие "if()" в консоле, и описал их по типам.

        int f = 1;
        if (f>10) {
        System.out.println(peopleInCar + " " + animalInZoo + " " + peopleInRostov + " " + chickenEgsInWord + " " + " - это целочисленные типы примитивных данных" );
        System.out.println(maksFloat + " " + minDouble + " - это вещественные типы примитивных данных");
        System.out.println(iLiveInUsa + " " + " - это логический тип примитивных данных");
        System.out.println(myDickIs + " " + " - это символьный тип примитивнных данных");
        }
        // тут я сделал явное присваивание переменной int, это я умею делать)))

        long one = 999999999L;
        int two = (int) one;
        System.out.println(two);

        // тут я объявляю символьный тип и даю ему значения посл чего увеличиваю с помощью переменной int.

        char a = 'A';
        int b = a + 1;
        System.out.println(b);
        char c = 'M';
        int d = c + 2;
        System.out.println(d);
        char e = 'H';
        int g = e + 3;
        System.out.println(g);
    }
}

