package com.company;

import java.util.Scanner;

public class Homework {
    static void tofilm(MassMedia film){
        System.out.println(
                "Year:"+ film.year+"\n"+
                        "Country:"+film.country+"\n"+
                        "Genre:"+film.genre+"\n"+
                        "Money:"+film.worldwide_fees + "$" +"\n"+
                        "Time:" + film.time +"minutes"
        );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MassMedia film = new MassMedia();
        int command;
        while (true) {
            System.out.println(" 1--->Baron \n 2--->Comedy club \n 3--->Hulk");
            command = scanner.nextInt();
            switch (command) {
                case 1:
                    film.year = 2020;
                    film.country = "Uzbekistan";
                    film.genre = "action";
                    film.worldwide_fees = 15500;
                    film.time = "165";
                    tofilm(film);
                    break;
                case 2:
                    film.year=2019;
                    film.country="Russia";
                    film.genre="comedy";
                    film.worldwide_fees= 105605;
                    film.time="180";
                    tofilm(film);
                    break;
                case 3:
                    film.year= 2018;
                    film.country="America";
                    film.genre="fantacy";
                    film.worldwide_fees=1656986;
                    film.time="220";
                    tofilm(film);
                    break;
                default:
                    System.out.println("ERROR 404");
            }
        }
    }
}
