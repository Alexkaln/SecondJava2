import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String name=in.next();
        System.out.println("Введите ваше отчество:");
        String middleName=in.next();
        System.out.println("Введите вашу фамилию:");
        String surName=in.next();
        System.out.println("Ваше ФИО:"+name+" "+middleName+" "+surName);
    }
}
