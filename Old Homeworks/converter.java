// Необходимо написать программу конвертер физических
//величин.
//Масса:
//кг<->грамм<->фунт(lb)<->карат в любую сторону
//Длина (расстояние):
//метр<->миля<->ярд<->фут в любую сторону
//
//Пользователю сначала предлагается выбрать что
//переводить (масса или расстояние), затем предлагается
//выбрать единицу измерения. Далее пользователь должен ввести
//число. В результате программа должна вывести 4 строки с
//переведенными величинами.
//Пример:
//
//> Выберите что переводить:
//> [1] - масса
//> [2] - расстояние
//> 2
//> Выберите единицу измерения:
//> [1] - метр
//> [2] - миля
//> [3] - ярд
//> [4] - фут
//> 1
//> Введите число:
//> 10
//> Результат:
//> метры: 10
//> мили: 0.006214
//> ярды: 10.94
//> футы: 32.81


//Մինչև սկսելը կցանկանայի գրել որ փոփոխել եմ մի քանի մեծություն և օրինակ կարատի փոխարեն ավելացրել եմ ցենտներ
import java.util.Scanner;
public class converter {
    public static void main(String[] args) {
        String e = "Выберите единицу измерения";
        Scanner s = new Scanner(System.in);
        System.out.println("Выберите что переводить \n1-Weight\n2-Distance");
        int WorD = s.nextInt();
        if (WorD > 2) {
            System.out.println("Bыберите правильное значение");
            System.exit(1);
        }
        if (WorD < 1) {
            System.out.println("Bыберите правильное значение");
            System.exit(1);
        }
        if (WorD == 1) {
            System.out.println(e + "\n1-Kilogram\n2-Tonn\n3-Gramm\n4-Centner");
            int num1 = s.nextInt();
            if (num1 <= 4) {
                System.out.println("Вы выбрали параметр веса под номером" + " " + num1);
            } else {
                System.out.println("Выберите правильное значение");
                System.exit(1);
            }
            System.out.println("Please Enter quantity");
            int cal = s.nextInt();
            switch (num1) {
                case 1:
                    System.out.println("It equals \n" + cal + " " + "kg\n" + ((cal) * 0.001) + " " + "Tonn\n" + cal * 1000 + " " + "Gramm\n" + cal * 0.01 + " " + "Centner");
                    break;
                case 2:
                    System.out.println("It equals\n" + cal * 1000 + " " + "kg \n" + cal + " " + "Tonn\n" + cal * 1000000 + " " + "Gramm\n" + cal * 10 + " " + "Centner");
                    break;
                case 3:
                    System.out.println("It equals\n" + cal * 0.01 + " " + "kg\n" + (cal * 0.000001) + " " + "Tonn\n" + cal + " " + "Gramm\n" + cal * 0.00001 + " " + "Centner");
                    break;
                case 4:
                    System.out.println("It equals\n" + cal * 100 + " " + "kg\n" + (cal * 0.1) + " " + "Tonn\n" + cal * 100000 + " " + "Gramm\n" + cal + " " + "Centner");
                default:
                    System.out.println("Please select numbers from 1 to 4");
            }
        } else if (WorD == 2) {
            System.out.println("Выберите что переводить\n1-Meter\n2-Mile\n3-Kilometer\n4-Yard\n5-Cantimeter");
            int num2 = s.nextInt();
            if (num2 < 1) {
                System.out.println("Bыберите правильное значение");
                System.exit(1);
            }
            if (num2 > 5) {
                System.out.println("Bыберите правильное значение");
                System.exit(1);
            }
            System.out.println("Вы выбрали параметр дистанции под номером" + " " + num2);
            System.out.println("Please enter quantity");
            int CAL = s.nextInt();
            switch (num2) {
                case 1:
                    System.out.println("It equals \n" + CAL + " " + "Meter\n" + CAL * 0.00062 + " " + "Mile\n" + CAL * 0.001 + " " + "Kilometer\n" + CAL * 1.09361 + " " + "Yard\n" + CAL * 100 + " " + "Cantimeter");
                    break;
                case 2:
                    System.out.println("It equals \n" + CAL * 1609.34401 + " " + "Meter\n" + CAL + " " + "Mile\n" + CAL * 1.60934 + " " + "Kilometer\n" + CAL * 1760.00001 + " " + "Yard\n" + CAL * 160934.40058 + " " + "Cantimeter");
                    break;
                case 3:
                    System.out.println("It equals \n" + CAL * 1000 + " " + "Meter\n" + CAL * 0.62137 + " " + "Mile\n" + CAL + " " + "Kilometer\n" + CAL * 1093.6133 + " " + "Yard\n" + CAL * 100000 + " " + "Cantimeter");
                    break;
                case 4:
                    System.out.println("It equals \n" + CAL * 0.9144 + " " + "Meter\n" + CAL * 0.00057 + " " + "Mile\n" + CAL * 0.00091 + " " + "Kilometer\n" + CAL + " " + "Yard\n" + CAL * 91.44 + " " + "Cantimeter");
                    break;
                case 5:
                    System.out.println("It equals \n" + CAL * 0.01 + " " + "Meter\n" + CAL * 0.000006 + " " + "Mile\n" + CAL * 0.00001 + " " + "Kilometer\n" + CAL * 0.01094 + " " + "Yard\n" + CAL + " " + "Cantimeter");
            }
        }
    }
}



