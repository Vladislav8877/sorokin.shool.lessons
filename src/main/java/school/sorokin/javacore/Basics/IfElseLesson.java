package school.sorokin.javacore.Basics;
import java.util.Scanner;
public class IfElseLesson {
    public static void main(String[] args){
        Scanner one = new Scanner(System.in);


        System.out.println("Здравствуйте, добро пожаловать в наше кино \"Небесный\".");
        System.out.println("Какой жанр фильма желаете посмотреть?");
        System.out.println("(1-комедия/2-драма/3-фантастика/4-боевик/5-аниме)");
        System.out.print("Введите цифру: ");
        int choice = Integer.parseInt(one.nextLine());

        switch(choice)
        {
            case 1:
                System.out.println("Вы выбрали \"комедия\".");
                System.out.print("Выбирите фильм для просмотра: (1 - окна в полу || 2 - дверь в туалет) -> ");
                int comedy = Integer.parseInt(one.nextLine());

                if(comedy==1){
                    System.out.print("Приятного просмотра --> www.comedy/window.ru");}
                else if(comedy==2){
                    System.out.print("Приятного просмотра --> www.comedy/toilet.ru");}
                else { System.out.print("Неккоректный ввод!"); } break;

            case 2:
                System.out.println("Вы выбрали \"драма\".");
                System.out.print("Выбирите фильм для просмотра: (1 - слёзы на диване || 2 - безумные сопли) -> ");
                int drama = Integer.parseInt(one.nextLine());

                if(drama==1){
                    System.out.print("Приятного просмотра --> www.drama/sofa.ru");}
                else if(drama==2){
                    System.out.print("Приятного просматра --> www.drama/crazy.ru");}
                else { System.out.println("Неккоректный ввод!"); } break;

            case 3:
                System.out.println("Вы выбрали \"фантастика\". ");
                System.out.print("Выбирите фильм для просмотра: (1 - кошка но собака || 2 - Ростов Чемпион) -> ");
                int fantasy = Integer.parseInt(one.nextLine());

                if(fantasy==1){
                    System.out.print("Приятного просмотра --> www.fantasy/catDog.ru");}
                else if(fantasy==2){
                    System.out.print("Приятного просмотра --> www.fantasy/rostovWin.ru");}
                else { System.out.println("Неккоректный ввод!"); }  break;

            case 4:
                System.out.println("Вы выбрали \"боевик\".");
                System.out.print("Выбирите фильм для просмотра: (1 - тропический душ || 2 - пули из корма) -> ");
                int gun =  Integer.parseInt(one.nextLine());

                if (gun==1){
                    System.out.print("Приятного просмотра --> www.gun/shower.ru");}
                else if (gun==2){
                    System.out.print("Приятного просмотра --> www.gun/eat.ru");}
                else { System.out.print("неккоректный ввод!");} break;

            case 5:
                System.out.println("Вы выбрали \"аниме\". ");
                System.out.print("Выбирите фильм для просмотра: (1 - нежный мульт || 2 - красный фильтр) -> ");
                int anime = Integer.parseInt(one.nextLine());

                if(anime==1){
                    System.out.print("Приятного просмотра --> www.anime/polite.ru");}
                else if(anime==2){
                    System.out.print("Приятного просмотра --> www.anime/red.ru");}
                else { System.out.print("Неккоректный ввод!"); } break;

            default: System.out.print("Неккоректный вод, попробуйте ещё раз!"); break;
        }












    }
}
