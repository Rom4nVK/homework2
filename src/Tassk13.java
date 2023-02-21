import java.util.Scanner;

public class Tassk13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //вводим класс Scanner
        System.out.println("введите  число");

        int a = scanner.nextInt();// ввод переменного числа классом Scanner
        if (a<100){
            System.out.println("третьей цифры нет"); //условие при котором число на входе не имеет 3 цифры

        }
        else {  //условие при котором запускаем цикл while,который зацикливает число набранное с клавиатуры до тех пор пока оно не станет меньше 1000
            while (a > 999) {
                a /= 10;

            }

            a = a % 10;  //деление которое показывает остаток, он и есть третий символ
            System.out.println(a);
        }


    }

}

