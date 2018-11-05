package lab1;

import java.util.Date;

/**
 * Test class for first lab of programming course
 * in Sevastopol State University
 *
 *
 * @author Batura Evgenii
 * @version 1.0
 */

public class cat {
    public static void main(String[] args){
        String firstName = "";
        String middleName = "";
        String lastName = "";
        String teacherfirstName = "";
        String teachermiddleName = "";
        String teacherlastName = "";
        String groupCode = "ИВТ/б-12о";
        Date date = new Date();
        int variant = 4;
        int numberSeatsInTheCinema = 1500;
        int numberRooms = 5;
        int numberSeatsInTheRoom = numberSeatsInTheCinema / numberRooms;

        String fullName = fullName(lastName, firstName, middleName);
        String fullTeacherName = fullName(teacherfirstName, teachermiddleName, teacherlastName);

        System.out.println("Программу выполнил:\n" + fullName);
        System.out.println("Шифр группы: \n" + groupCode);
        System.out.println("Дата: \n" + date);
        System.out.println("Вариант номер: \n" + variant);
        System.out.println("Количество мест в Кинотеатре \n" + numberSeatsInTheCinema);
        System.out.println("Количество залов \n" + numberRooms);
        System.out.println("Число мест в зале \n" + numberSeatsInTheRoom);
        System.out.println("Проверил: \n" + fullTeacherName );



    }




    public static String fullName(String a, String b, String c)
    {
        return a + " " + b + " " + c;
    }
}

