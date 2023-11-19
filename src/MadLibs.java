import java.util.Scanner;
public class MadLibs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String color, pastTenseVerb, adjective, playAgain;
        do {
            System.out.println("Добро пожаловать в игру ЧЕПУХА");
            System.out.print("Введите любой цвет: ");
            color = scan.next();
            System.out.print("Введите любой глагол в прошедшем времени: ");
            pastTenseVerb = scan.next();
            System.out.print("Введите любое прилагательное: ");
            adjective = scan.next();
            System.out.println(color + " дракон " + pastTenseVerb + " на " + adjective + " рыцаря!");
            System.out.println("Сыграем еще?(y/n):");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Спасибо за игру! Приходи еще=)");
    }
}
