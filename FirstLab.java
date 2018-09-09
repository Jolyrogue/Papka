package lab1;

import java.util.Date;

/**
 * class for first lab of programming course
 * in Sevastopol State University
 *
 *
 * @author Batura Evgenii
 * @version 1.0
 */

public class FirstLab {
    public static void main(String[] args){
        String firstName = "Евгений";
        String middleName = "Валерьевич";
        String lastName = "Батура";
        String teacherFirstName = "Елена";
        String teacherMiddleName = "Сергеевна";
        String teacherLastName = "Владимирова";
        String groupCode = "ИВТ/б-12о";
        Date date = new Date();
        int variant = 4;
        int numberSeatsInTheCinema = 1500;
        int numberRooms = 5;
        int numberSeatsInTheRoom = numberSeatsInTheCinema / numberRooms;

        String fullName = fullName(lastName, firstName, middleName);
        String fullTeacherName = fullName(teacherFirstName, teacherMiddleName, teacherLastName);

        System.out.println("Программу выполнил:\n" + fullName);
        System.out.println("Шифр группы: \n" + groupCode);
        System.out.println("Дата: \n" + date);
        System.out.println("Вариант номер: \n" + variant);
        System.out.println("Количество мест в Кинотеатре \n" + numberSeatsInTheCinema);
        System.out.println("Количество залов \n" + numberRooms);
        System.out.println("Число мест в зале \n" + numberSeatsInTheRoom);
        System.out.println("Проверил: \n" + fullTeacherName );



    }




    private static String fullName(String a, String b, String c)
    {
        return a + " " +  b + " " + c;
    }
}

