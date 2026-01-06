package school.sorokin.javacore.OOP;

class exa {

    String name;
    int age;

    exa(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person name "+ name + "\nPerson age "+ age; //переопределяю метод из класса Object(родителя)
    }
}

class ma {
    public static void main(String[] args) {

        exa person = new exa("vlad",22);
        System.out.println(person.name); //Не переопределенный вывод метода toString()
        System.out.println(person.age);
        exa person2 = new exa("vova",23);
        exa person3 = new exa("Sweta",24);
        System.out.println(person2);
        System.out.println(person3);
    }
}
//----------------------------------------------------------------------------------------------------------------------

class top{
    String name;
    int age;

    top(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean  equals(Object obj){
        if(this == obj) return true; // сравниваем объект(ссылки) мб это тот же самый(быстрая проверка)
        if(obj == null || getClass() != obj.getClass()) return false; // сравнивание типов (тек. класс не равен классу об)
        top three = (top) obj;
        return age == three.age && (name !=null ? name.equals(three.name) : three.name == null);
    }
}

class zero{
    String name;
    int age;
    zero(String name,int age){
        this.name = name;
        this.age = age;
    }
}

class star{
    public static void main(String[] args) {
        top one = new top("one",30);
        zero two = new zero("one",30); // разные типы false
        System.out.println(one.equals(two)); //false - разные ссылки в памяти(если без Override)
        top three = new top("three",50);
        top four = new top("three",50);
        System.out.println(three.equals(four));

    }
}
//----------------------------------------------------------------------------------------------------------------------

class hash{
    String name;
    int age;
    hash(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        hash three = (hash) obj;
        return age == three.age && (name == null ? name.equals(three.name) : three.name == null);
    }
    @Override
    public int hashCode(){
        int result = (name !=null ? name.hashCode() : 0); //берем хэш(номер) от имени если оно есть, если нету - считаем что 0
        result = 31 * result + age; //31 - просто число - умножение на него позволяет избегать случ. совпадений
        return result;
    }
}
class hashs {
    public static void main(String[] args) {
        hash one = new hash("one", 1);
        hash two = new hash("one", 1);
        System.out.println(one.hashCode()); // одинаковые объекты но разные хэши
        System.out.println(two.hashCode());
        System.out.println(one.equals(two));

    }
}
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

class examples {

    String accountHolder;
    String accountNumber;
    double balance;

    examples(String accountHolder,String accountNumber,double balance){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    @Override
    public String toString(){
        return String.format("Owner: %s%nNumber: %s%nBalance: %.2f",accountHolder,accountNumber,balance);
    }
}

class bank{
    public static void main(String[] args){
        examples owner = new examples("Vladislav","123-321",3000000);
        System.out.println(owner);
    }
}
//----------------------------------------------------------------------------------------------------------------------

class person {
    private String name;
    private int age;
    private String passportNumber;

    public person(String name, int age, String passportNumber){
        this.name = name;
        this.age = age;
        this.passportNumber = passportNumber;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        person person = (person) obj;
        return passportNumber.equals(person.passportNumber);
    }
    @Override
    public int hashCode(){
        int result = (passportNumber != null? passportNumber.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}

class tt{
    public static void main(String[] args) {
        person personOne = new person("vladislav",22,"123-123");
        person personTwo = new person("vladislav",23,"123-123");
        System.out.println(personOne.equals(personTwo));
        System.out.println(personOne.hashCode());
        System.out.println(personTwo.hashCode());
    }
}