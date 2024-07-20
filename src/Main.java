//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1\n");

        int age1 = 19;
        if(age1 >= 18){
            System.out.println("Если возраст человека равен " + age1 + ", то он совершеннолетний.\n");
        }else{
            System.out.println("Если возраст человека равен " + age1 + ", то он не достиг совершеннолетия, нужно немного подождать.\n");
        }

        System.out.println("Задание 2\n");

        int temp = 15;
        if(temp < 5){
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.\n");
        }else{
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.\n");
        }

        System.out.println("Задание 3\n");

        int speed = 75;
        if(speed > 60){
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.\n");
        }else{
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.\n");
        }

        System.out.println("Задание 4\n");

        int age2 = 18;
        if(age2 >= 2 && age2 <= 6){
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад.\n");
        }if(age2 >= 7 && age2 <= 17){
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу.\n");
        }if(age2 >= 18 && age2 <= 24){
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет.\n");
        }if(age2 > 24){
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить на работу.\n");
        }

        System.out.println("Задание 5\n");

        int age3 = 14;
        if(age3 < 5){
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему нельзя кататься на аттракционе.\n");
        }if(age3 >= 5 && age3 < 14){
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе в сопровождении взрослого.\n");
        }else{
            System.out.println("Если возраст ребенка равен " + age3 + ", то ему можно кататься на аттракционе без сопровождения взрослого.\n");
        }

        System.out.println("Задание 6\n");

        int placesAreOccupied = 81;
        if(placesAreOccupied < 60){
            System.out.println("Если в вагоне занято " + placesAreOccupied + " мест, то в вагоне есть свободное сидячее место.\n");
        }if(placesAreOccupied >= 60 && placesAreOccupied < 102){
            System.out.println("Если в вагоне занято " + placesAreOccupied + " мест, то в вагоне есть свободное стоячее место.\n");
        }else{
            System.out.println("Если в вагоне занято " + placesAreOccupied + " мест, то вагон уже полностью забит.\n");
        }

        System.out.println("Задание 7\n");

        int one = 3;
        int two = 7;
        int three = 1;
        if(one > two && one > three){
            System.out.println("Наибольшее число " + one + " оно записано в переменной one.");
        }if(two > one && two > three){
            System.out.println("Наибольшее число " + two + " оно записано в переменной two.");
        }else{
            System.out.println("Наибольшее число " + three + " оно записано в переменной three.");
        }
    }
}