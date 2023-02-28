package rikkei.academy;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//thuc hanh

//        Scanner resul = new Scanner(System.in);
//        System.out.println("nhap thang ");
//        int moth = resul.nextInt();
//
//        switch (moth){
//            case 1 :
//            case 3 :
//            case 5 :
//            case 7 :
//            case 10 :
//            case 12 :
//                System.out.println("co 31 ngay");
//                break;
//            case 2 :
//                System.out.println("co 28 hoac 29 ngay");
//                break;
//            case 4 :
//            case 6 :
//            case 8 :
//            case 9 :
//            case 11 :
//                System.out.println("co 30 ngay");
//                break;
//            default:
//                System.out.println("ban nhap sai roi");
//
//        }




//        Scanner resul = new Scanner(System.in);
//        System.out.println("nhap chieu cao");
//          double heigh = resul.nextDouble();
//        System.out.println("nhap can nang");
//        double with = resul.nextDouble();
//            double BMI = with/(heigh*heigh);
//
//        if(BMI < 18.5){
//            System.out.println("gay qua !"+ BMI);
//        }else if(BMI < 25){
//            System.out.println("hoi gay !" + BMI);
//        }else if(BMI < 30){
//            System.out.println("binh thuong!" + BMI);
//        }else if(BMI > 30){
//            System.out.println("beo qua !" + BMI);
//        }




//      Date resul = new Date();
//        System.out.println("tg la " + resul);




//        int i = 10;
//        float f = 20.5f;
//        double d = 20.5;
//        boolean b = false;
//        char c = 'e';
//        String s = "ha dong";
//
//        System.out.println("i"+i);
//        System.out.println("f"+f);
//        System.out.println("d"+d);
//        System.out.println("b"+b);
//        System.out.println("c"+c);




//            Scanner resul = new  Scanner(System.in);
//            double with = 20.1;
//        System.out.println("nhap chieu rong :");
//            double heigh = 30.5;
//        System.out.println("nhap chieu cao :");
//        double area = with*heigh;
//        System.out.println("dien tich la :" + area);




//        Scanner resul = new Scanner(System.in);
//        System.out.println("nhap nam");
//        int year = resul.nextInt();
//        if(year>0){
//            if((year%4==0&&year%100!=0)||(year%100==0&&year%400==0)){
//                System.out.println(year+"la nam nhuan");
//            }else {
//                System.out.println(year+"khong phai la nam nhuan");
//            }
//        }else {
//            System.out.println(year + "khong phai la nam nhuan");
//        }


        // bai tap
//        Scanner resul = new Scanner(System.in);
//        System.out.println("nhap ten");
//        String a = resul.nextLine();
//        System.out.println("hello " + a) ;
//
//        Scanner resul = new Scanner(System.in);
//        System.out.println("nhap tien usd");
//        double usd = resul.nextDouble();
//        double vnd = usd * 25;
//        System.out.println(usd + "usd se bang " + vnd + "vnd" );

// abc

         Scanner resul = new Scanner(System.in);
        System.out.println("nhap so");
         int number = resul.nextInt();
    if(number>0&&number<10){
        switch (number){
            case 1 :
                System.out.println("one");
                break;
            case 2 :
                System.out.println("two");
                break;
            case 3 :
                System.out.println("three");
                break;
            case 4 :
                System.out.println("for");
                break;
            case 5 :
                System.out.println("fire");
                break;
            case 6 :
                System.out.println("six");
                break;
            case 7 :
                System.out.println("seven");
                break;
                case 8 :
                System.out.println("age");
                    break;
            case 9 :
                System.out.println("nigthe");
                break;
        }
    }



    }
}
