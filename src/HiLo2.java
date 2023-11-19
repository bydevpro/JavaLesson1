import java.util.Scanner;

public class HiLo2 {
    //Игра больше-меньше
    public static void main(String[] args) {
        //создаем объект который будет принимать данные от пользователя
        Scanner scan = new Scanner(System.in);
        //переменная для повторной игры
        String playAgain;
        //Цикл повтороной игры
        do {
            //генерируем число от 0,0 до 0,99999 прибавляем 1 = 100,99999 и выводим int(отсекаем дробную часть)
            int theNumber =(int)(Math.random() * 200 - 100);
            //вывод сгенерированного числа для тестирования работы генератора
            System.out.println(theNumber);
            //переменная для хранения данных от пользователя
            int guess = 0;
            //главный игровой цикл
            while (guess != theNumber) {
                System.out.println("Введите целое число от -100 до 100:");
                //преобразуем строку от пользователя в целое число и записываем в переменную
                guess = scan.nextInt();
                //System.out.println("Вы ввели " + guess + ".\n");
                //Условия для подсказок пользователю
                if (guess < theNumber) {
                    System.out.println(guess + " меньше, чем загаданное.\n Попробуйте еще раз!");
                } else if (guess > theNumber) {
                    System.out.println(guess + " больше, чем загаданное.\nПопробуйте еще раз!");
                } else {
                    System.out.println("Все верно! Это число " + guess + "!\n Поздарвляю с победой!!!");
                }
            }
            System.out.println("сыграем еще раз?(y/n): ");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Спасибо за игру! Приходи еще=)");
        scan.close();

    }
}
