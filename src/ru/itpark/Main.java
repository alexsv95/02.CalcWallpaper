package ru.itpark;

public class Main {

    public static void main(String[] args) {
        CalcWallPaper service = new CalcWallPaper();
        System.out.println("Для оклейки комнаты необходимо " + service.calculate(5,6,2.75) + " рулонов обоев");
    }
}
