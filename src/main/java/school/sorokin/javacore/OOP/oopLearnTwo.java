package school.sorokin.javacore.OOP;

public class oopLearnTwo {

    static int totalCount = 0;
    int id;

    oopLearnTwo(int id){
        this.id = id;
        totalCount++;
    }

    void showInfo(){
        System.out.println("ID: "+id+" || всего объектов: "+totalCount);
    }
}

class start {
    public static void main(String[] args) {
        System.out.println("Начально: " + oopLearnTwo.totalCount);

        oopLearnTwo idOne = new oopLearnTwo(1);
        System.out.println("Продолжение "+oopLearnTwo.totalCount);
        oopLearnTwo idTwo = new oopLearnTwo(2);
        System.out.println("Продолжение "+oopLearnTwo.totalCount);

        idOne.showInfo();
        idTwo.showInfo();
    }
}

class math{
    int plus(int a, int b){
        return a+b;
    }
    static int minus(int a, int b){
        return a-b;
    }
}

class go{
    public static void main(String[] args){
    math student = new math();
    System.out.println(student.plus(10,20));
    System.out.println(math.minus(10,20));
    }
}

class Database{
    static String dbUrl;
    static int dbPort;
    static boolean isConnected;

    static{
        System.out.println("Инициализируем базу данных..."); //static блок выполниться до всех методов класса!
        dbUrl = "jdbc:mysql://localhost:3306/";
        dbPort = 3306;
        isConnected = true;
        System.out.println("База готова!");
    }

    static void showStatus(){
        System.out.println("URL: "+dbUrl+" || PORT: "+dbPort+" || Подключена "+isConnected);
    }
}

class example {
    public static void main(String[] args) {
        System.out.println("Начало программы...");
        Database.showStatus();
        System.out.println("------------------------------------");
        Database.showStatus();
    }
}

class outer{
    String name = "Школа №1";

    class student{
        String name;

        student(String name){
            this.name = name;
        }
        void show(){
            System.out.println("Ученик: "+name+" в "+outer.this.name);
        }
    }

    static class subject{
        String title;

        subject(String title){
            this.title = title;
        }
        void show(){
            System.out.println("Предмет: "+title);
        }
    }
}


class goes{
    public static void main(String[] args) {
        outer school = new outer();
        outer.student student = school.new student("Ivan");
        student.show();

        outer.subject math = new outer.subject("math");
        math.show();
    }
}

class config{
    String apiUrl = "https://api.com"; // обычная переменная (можно менять)
    final String API_KEY = "secret123";  //константа (нельзя поменять)
    static final int MAX_USERS = 1000;// глобальная константа

    void changeConfig(){
        apiUrl = "https://new.com";
        // API_KEY = "secret000";
    }
}

class finalExample {
    public static void main(String[] args) {
        config config = new config();
        System.out.println(config.apiUrl);
        config.changeConfig();
        System.out.println(config.apiUrl);
        System.out.println(config.MAX_USERS);
    }
}

class dog{
    String name;
    dog(String name){
        this.name = name;
    }
    void eat(){
        System.out.println(name+" ест корм");
    }
    final void breather(){
        System.out.println(name+" дышит");
    }
}

class goe{
    public static void main(String[] args) {
    dog dog = new dog("stive");
    dog.eat();
    dog.breather(); //нельзя переопределить final метод!
    }
}

// final class one{}
// class two extends one{} final класс нельзя унаследовать

class app{
    public static final String APP_NAME = "myApp";
    public static final String API_URL = "https://api.example.com";
    public static final int API_PORT = 8080;
    public static final int MAX_REQUEST = 1000;

    public static String currentUser = "admin";
    private final String dbPassword = "secret123";
}

class goApp{
    public static void main(String[] args) {
        System.out.println(app.APP_NAME);
        System.out.println(app.API_URL);
        System.out.println(app.API_PORT);
        System.out.println(app.MAX_REQUEST);
        app.currentUser = "vladislav123";
        System.out.println(app.currentUser);

    }
}
//----------------------------------------------------------------------------------------------------------------------
class exam {

    static int totalScore = 0;

    static void addPoints(int points){
        totalScore+=points;
    }
}

class player extends exam{
    String name;
    int personalScore;

    public player(String name, int points){
        this.name = name;
        this.personalScore=points;
        addPoints(points);
    }
}

class mains{
    public static void main(String[] args) {
        player playerOne = new player("vlad",22);
        player playerTwo = new player("Oleg",20);
        player playerThree = new player("Roma",18);

        System.out.println(exam.totalScore);
        System.out.println(playerOne.personalScore);
        System.out.println(playerTwo.personalScore);
        System.out.println(playerThree.personalScore);
    }
}
//------------------------------------------------------!!!!!!!!!!!!!---------------------------------------------------

