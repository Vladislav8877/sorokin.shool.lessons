package school.sorokin.javacore.OOP;

/* public class oopLearn {

    private String name;
    private int age;
    private double gpa;

    public oopLearn(String name, int age, double gpa){
        setName(name);
        setAge(age);
        setGpa(gpa);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name != null && !name.isEmpty()){
            this.name = name;
        }else{
            System.out.println("Некорректный ввод \"имя\"");
        }
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age > 0 && age <=100){
            this.age = age;
        }else{
            System.out.println("Некорректный ввод \"возраст\"");
        }
    }

    public double getGpa(){
        return gpa;
    }
    public void setGpa(double gpa){
        if(gpa > 0 && gpa <= 5.0){
            this.gpa = gpa;
        }else{
            System.out.println("Некорректный ввод \"средний балл\"");
        }
    }
}

class Main{
    public static void main(String[] args){
        oopLearn student = new oopLearn("Vladislav",22,5.0);

        System.out.println("Имя: "+student.getName());
        System.out.println("Возраст: "+student.getAge());
        System.out.println("Средний балл: "+student.getGpa());

        student.setAge(23);
        student.setGpa(4.9);

        student.setAge(-1);
        student.setGpa(-1);
    }
}

class Bank{

    private String accountHolder;
    private String accountNumber;
    private double balance;
    private String pin;

    public Bank(String accountHolder, String accountNumber, String pin, double initialBalance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = initialBalance>0?initialBalance:0;
    }

    public String getAccountHolder(){
        return accountHolder;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Пополнено на: "+amount+"\n"+"Баланс: "+balance);
        }else{
            System.out.println("Некорректный ввод!");
        }
    }

    public void withDraw(double amount, String enteredPin){
        if(!pin.equals(enteredPin)){
            System.out.println("Неправильный пин!");
            return;
        }

        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Снято: "+amount+"\n"+"Баланс: "+balance);
        }else if (amount <= 0){
            System.out.println("Некорректный ввод");
        }else{
            System.out.println("Недостаточно средств!");
        }
    }

    public void info(){
        System.out.println("Владелец "+accountHolder);
        System.out.println("Номер "+accountNumber);
        System.out.println("Баланс "+balance);
    }
}

class user{
    public static void main(String[] args){

        Bank user = new Bank("Vladislav","12345-1233","1990",3.0);

        user.info();
        user.deposit(3000000);
        user.withDraw(0,"199");
    }
}

 class example {
    private double temp;
    private boolean isPoweredOn;

    public example(){
        this.temp = 20.0;
        this.isPoweredOn = false;
    }
    public double getTemp(){
        if(isPoweredOn){
            return temp;
        }else{
            return 0.0;
        }
    }
    public void powerOn(){
        isPoweredOn = true;
        System.out.println("Термометр вкл.");
    }
    public void powerOff(){
        isPoweredOn = false;
        System.out.println("Термометр выкл.");
    }
    public void setTemp(double newTemp) {
        if (isPoweredOn) {
            if (newTemp > 0 && newTemp <= 35) {
                this.temp = newTemp;
                System.out.println("Установлена новая температура: " + newTemp);
            } else {
                System.out.println("Невозможная температура");
            }
        } else {
            System.out.println("Включите термометр!");
        }
    }
    public boolean isPoweredOn() {
        return isPoweredOn;
    }
    public void showStatus(){
        System.out.println("Термометр: "+(isPoweredOn?"ВКЛ":"ВЫКЛ"));
        System.out.println("Температура: "+getTemp()+" градусов");
    }
}

class main{
    public static void main(String[] args){

        example termometr = new example();

        termometr.showStatus();
        termometr.powerOn();
        termometr.setTemp(25.5);
        termometr.showStatus();
        termometr.powerOff();
        termometr.setTemp(35);
        termometr.showStatus();
    }
}
 */
//----------------------------------------------!!!!!!!!!!!!!!!!!!------------------------------------------------------
 /*
class nasledovanie{

    public void parents(){
        System.out.println("Родитель");
    }
}

class naslednik extends nasledovanie{
    public void son(){
        System.out.println("Наследник");
    }
}
class main {
    public static void main (String[] args){

        naslednik Ivan = new naslednik();

        Ivan.parents();
        Ivan.son();
    }
}
//---------------------------------------------------------------------------------------------------------------------
 class Motor{

      public void starts(){
          System.out.println("Машина заводиться");
      }

      public void stop(){
          System.out.println("Машина выкл");
      }
}

class Car extends Motor{

      @Override
    public void starts(){
        System.out.println("Машина заводиться с ключа");
    }
    public void open(){
          System.out.println("Открыт люк");
    }
}

class Moto extends Car{

      @Override
    public void starts(){
    System.out.println("Мотоцикл заводиться с кнопки");
      }
}

class starts {
    public static void main(String[] args) {
        Motor car = new Car();
        Motor moto = new Moto();
        car.starts();
        moto.starts();
        Car car2 = new Car();
        car2.open(); //специфичный метод
        car2 = new Moto();
        car2.starts();

    }
}
//----------------------------------------------------------------------------------------------------------------------

class Work {

    protected String name;
    protected int age;


    public Work(String name, int age) {
        setAge(age);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 55) {
            this.age = age;
        } else {
            System.out.println("Некорректный ввод!");
        }
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Некорректный ввод!");
        }
    }
    public Work(){}
  }

class manager extends Work {

      protected int experience;

      public manager(String name, int age,int experience){
          super.setName(name);
          super.setAge(age);
          this.experience = experience;
      }
}

class starting{
    public static void main(String[] args){
    manager man = new manager("vladislav",22,3);

    man.setAge(23);
    man.setName("vladislav Azarov");

    System.out.println("Name "+man.getName());
    System.out.println("Age "+man.getAge());
    System.out.println("Experience "+man.experience);

    }
}
//----------------------------------------------------------------------------------------------------------------------
class example{

    public void publicMetod(){}
    protected void protectedMetod(){}
    private void privateMetod(){}
    final public void finalMetod(){}
}
class oneExample extends example {

    @Override
    public void publicMetod() {
        //нужно указывать такой же модификатор доступа
    }

    @Override
    public void protectedMetod() {
        //либо более открытый
    }

    //@Override
    private void privateMetod() {
        //приватный метод нельзя переопределить!
        //это новый метод!
    }

     //@Override
     //public void finalMetod(){
     //System.out.println("этот метод нельзя переопределить - final");
}

final class notExtands{
    public void sms(){
        System.out.println("Этот класс нельзя унаследовать - final");
    }
}
//----------------------------------------------------------------------------------------------------------------------

interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}

class animal{
    protected String name;

    public void eat(){
        System.out.println(name+" ест");
    }
}

class duck extends animal implements Flyable, Swimmable{

    @Override
    public void fly(){
        System.out.println(name+" flying");
    }
    @Override
    public void swim(){
        System.out.println(name+" swimming");
    }

    public duck(String name){
        this.name = name;
    }
}

class mains{
    public static void main(String[] args) {

        duck duck = new duck("Bob");

        duck.fly();
        duck.swim();
        duck.eat();
    }
}
 */
//---------------------------------!!!!!!!!!!!!!!!!!!!!!!!!-------------------------------------------------------------
/*
 class Animal{
    protected String name;
    public Animal(String name){
        this.name = name;
    }
    public void eat(){
        System.out.println(name+" eating food");
    }

    public Animal(){}
}

class dog extends Animal{
    public dog(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println(name+" eating dog food");
    }

    public void sleep(){
        System.out.println(name+" sleeping");
    }
}

class cat extends Animal{
    public cat(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println(name+" eating cat food");
    }
}

class bird extends Animal{
    public bird(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println(name+" eating bird food");
    }
}

class main{
    public static void main(String[] args){

        Animal Dog = new dog("rex");
        Animal Cat = new cat("sava");
        Animal Bird = new bird("flyfi");
        Dog.eat();
        Cat.eat();
        Bird.eat();

        Animal[] zoo = {
                new dog("betsi"),
                new cat("sema"),
                new bird("fly")
        };
        for(Animal animal : zoo){
            animal.eat();
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------

interface Flyable {
    void fly();
}
interface Swimmable {
    void swim();
}

class fish implements Swimmable{
    protected String name;

    public fish(String name){
        this.name = name;
    }

    @Override
    public void swim(){
        System.out.println(name+" swimming");
    }
}

class shark extends fish implements Swimmable{
    public shark(String name){
        super(name);
    }

    @Override
    public void swim(){
        System.out.println(name+" swimming alone");
    }
}

class superFly extends fish implements Flyable{
    public superFly(String name){
        super(name);
    }
    @Override
    public void fly(){
        System.out.println(name+" flying");
    }
}

class orel implements Flyable{
    protected String name;

    public orel(String name){
        this.name = name;
    }

    @Override
    public void fly(){
        System.out.println(name+" flying alone");
    }
}

class mains{
    public static void main(String[] args){

        Flyable[] fly = {
                new superFly("goga"),
                new orel("fofa")
        };

        Swimmable[] swim = {
                new fish("mika"),
                new shark("kojo")
        };

        for(Flyable f : fly){
            f.fly();
        }
        for(Swimmable s : swim){
            s.swim();
        }
    }
}
//----------------------------------------------------------------------------------------------------------------------

abstract class Exhibit{
    protected String name;

    public Exhibit(String name){
        this.name = name;
    }

    abstract public void makeSound();
    abstract public void perform();

    public void info(){
        System.out.println("Экспонат "+name);
    }
    public Exhibit(){}
}

class pingvi extends Exhibit{
    public pingvi(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println(name+" крякает");
    }
    @Override
    public void perform(){
        System.out.println(name+" ходит по кругу");
    }
}

class dolphin extends Exhibit{
    public dolphin(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println(name+" булькает");
    }
    @Override
    public void perform(){
        System.out.println(name+" плавает по кругу");
    }
}

class mainExhibit{
    public static void main(String[] args){

        Exhibit[] swimAnimal = {
                new dolphin("kurok"),
                new pingvi("polosatik")
        };
        for(Exhibit e : swimAnimal){
            e.makeSound();
            e.perform();
        }
    }
}
 */
//-----------------------------------------------!!!!!!!!!!!!!!!!!!!----------------------------------------------------
/*
interface switchAble{
    void switchOn();
    void switchOff();
}

class lamp implements switchAble{

    @Override
    public void switchOn(){
        System.out.println("Lamp is on");
    }
    @Override
    public void switchOff(){
        System.out.println("Lamp is off");
    }
}

class fan implements switchAble{
    @Override
    public void switchOn(){
        System.out.println("Fan is on");
    }
    @Override
    public void switchOff(){
        System.out.println("Fan is off");
    }
}

class main{
    public static void main(String[] args) {

        switchAble[] items = {
                new lamp(),
                new fan()
        };
        for(switchAble item : items){
            item.switchOn();
            item.switchOff();
        }
    }
}
 */
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
//======================================================================================================================
/*
class example {
    String name;
    public example(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name+" eating something");
    }
    public void doSomething(){
        System.out.println(name+" doing something");
    }
}

interface fighting{
    void fight();
}
interface hidening{
    void hiden();
}

class tiger extends example implements fighting{
    public tiger(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println(name+" eating zebra");
    }
    @Override
    public void doSomething(){
        System.out.println(name+" relaxing");
    }
    @Override
    public void fight(){
        System.out.println(name+" fighting with animal");
    }
}

class zebra extends example implements hidening{
    public zebra(String name){
        super(name);
    }
    @Override
    public void eat(){
        System.out.println(name+" eating flower");
    }
    public void doSomething(int time){
        System.out.println(name+" hidening "+time+" a day");
    }
    @Override
    public void hiden(){
        System.out.println(name+" hidening");
    }
}

class main{
    public static void main(String[] args){
        example tiger = new tiger("mufasa");
        example zebra = new zebra("jojo");

        if(tiger instanceof tiger){
            ((tiger)tiger).fight();
        }
        tiger.eat();
        tiger.doSomething();

        if(zebra instanceof zebra){
            ((zebra)zebra).hiden();
            ((zebra)zebra).doSomething(10);
        }
        zebra.eat();
        System.out.println("-----------------------");
        example[] animal = {
                new tiger("king"),
                new zebra("fofo")
        };

        for(example anima:animal){
            anima.eat();
            anima.doSomething();
            if(anima instanceof tiger){
                ((tiger)anima).fight();
            }
            if(anima instanceof zebra){
                ((zebra)anima).hiden();
                ((zebra)anima).doSomething(2);
            }
        }
    }
}
 */