package school.sorokin.javacore.Basics;

public class OperatorsLesson {
    public static void main(String[] args) {

        double mark = (4 + 5 + 2) / 3.0; // "double" - потому-что есть вещественное число (3.0)
        System.out.println(mark); // (скобки) - потому-что расставил правильно приоритеты для получения нужного рез.

        // через if проверяю средний бал студента. Который меньше 5, соответсвенно else.
        if (mark >= 5) {
            System.out.println("У студента удовлетворительная успеваемость");
        } else {
            System.out.println("У студента неудовлетворительная успеваемость");
        }

        // Объявляю оценки по предметам. Нужно выявить макс значение оценки и мин. Моя максимальная шкала - это 5!
        int math = 5;
        int rus = 4;
        int ang = 5;

        if (math >= 5 && ang >= 5 && rus >= 5) { //false
            System.out.println("У студента все оценки максимальные!");
        } else {
            System.out.println("Нужно вызывать родителей!!!");
        }

        int history = 2;
        int fizRa = 5;
        int IZO = 3;

        if (IZO <= 2 || fizRa <= 2 || history <= 2) { //true
            System.out.println("Встречается очень низкая оценка!");
        } else {
            System.out.println("Все оценки удовлетворительные");
        }

        boolean history1 = (history >= 0 && history <= 10);
        if (history1){
            System.out.println("Число " + history + " входит в диапазон [0..10]");
        } else {
            System.out.println("Число " + history + " вне диапазона!!!");
        }

        boolean fizRa1 = (fizRa >= 0 && fizRa <= 10);
        if (fizRa1){
            System.out.println("Число " + fizRa + " входит в диапазон [0..10]");
        } else {
            System.out.println("Число " + fizRa + " вне диапазона!!!");
        }

        boolean IZO1 = (IZO >= 0 && IZO <= 10);
        if (IZO1){
            System.out.println("Число " + IZO + " входит в диапазон [0..10]");
        } else {
            System.out.println("Число " + IZO + " вне диапазона!!!");
        }


    }
}
