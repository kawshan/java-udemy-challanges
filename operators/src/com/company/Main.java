package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        int i = 20;
//       System.out.println(i/3);
//        System.out.println((double) i/3);

//        BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2);    //to fixed wage metath dashama thith dekak thiyena eka thama karanne
//        BigDecimal amountOfPeople = BigDecimal.valueOf(3);
//        BigDecimal chargePerPerson = rideFee.divide(amountOfPeople, RoundingMode.HALF_UP);
//        System.out.println(chargePerPerson);
/*

        double d = 3.1;
        double d2 = 1.21;

        System.out.println(d-d2);
        BigDecimal bd3 = BigDecimal.valueOf(3.1).setScale(2);
        BigDecimal bd4 = BigDecimal.valueOf(1.21).setScale(2);
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd3.subtract(bd4));*/

        //big decimal is finished


        //math class and NAN infinity
//        System.out.println(Math.PI);
//
//        System.out.println(Math.max(10,3));
//        System.out.println(Math.min(10,3));
//        System.out.println(Math.sqrt(25));
//        System.out.println(Math.abs(-100)); //math .abs method in java returns the absolute value of a given number. the absolute value of a number is its non negative value which means it removes any negative sign in front of the number
//
//        System.out.println(Math.sqrt(-1)); //not a number
//        System.out.println(0/0.0); //nan
//        System.out.println((0/0.0)+5); //nan
//
//        System.out.println(5/0.0);
//        System.out.println(-5 / 0.0);

//        System.out.println(Math.round(20.0/3.00));
//        System.out.println(Math.round(20.0 * 100.0 / 3.0) / 100.00);
//
//        System.out.println(Math.random());
//        System.out.println((double) (Math.random()*100));
//        System.out.println((int) (Math.random()*100)+100);

        //compare primitive type and reference types and jva memory model

/*        System.out.println(128==128);
        System.out.println(65=='A');

        Integer i5 =Integer.valueOf(127);
        Integer i6 =Integer.valueOf(127);
        System.out.println(i5==i6);

        int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3};

        //those are happening because those arrays are also reference types
        System.out.println("arrays "+(arr1==arr2));
        System.out.println("arrays .equals() "+arr1.equals(arr2));
        System.out.println("Arrays.equals() "+ Arrays.equals(arr1,arr2));

        */

        //read user input from console
/*        Scanner sc = new Scanner(System.in);
        System.out.println("please enter any word");
        String word = sc.next();
        System.out.println("you entered "+word);
        System.out.println("enter number");
        int iii = sc.nextInt();
        System.out.println("number is "+iii);*/

//        System.out.println("lets find ara of a triangle");
//        Scanner scanner = new Scanner(System.in);
/*        System.out.println("enter base of triangle");
        double base = scanner.nextDouble();
        System.out.println("enter height of triangle");
        Double height = scanner.nextDouble();
        double area = (0.5)*base*height;
        System.out.println("area of the triangle is "+area);*/

/*      System.out.println("lets Circumference ara of a circle");
        System.out.println("enter radius");
        Double radius = scanner.nextDouble();
        double res = Math.round(2*Math.PI*radius);
        System.out.println(res);*/

/*        String s = "hello";
        System.out.println("length "+s.length());
        System.out.println("contains "+s.contains("he"));
        System.out.println("upper "+s.toUpperCase());
        System.out.println("lower "+s.toLowerCase());
        System.out.println("starts with "+s.startsWith("he"));
        System.out.println("ends with "+s.endsWith("W"));
        System.out.println("replace "+s.replace("ll","ff"));
        System.out.println("substring "+s.substring(0,4));
        System.out.println("get bytes"+Arrays.toString(s.toCharArray()));
        System.out.println(Arrays.toString(s.split("e")));

        System.out.println("my favorite book is \"potha\" \n  by gray killer");

        String firstname="kawshan";

        String greetingsTemplate = "hello dear %s! good %s";

        String morning="morning";
        String afternoon = "afternoon";
        String evening = "evening";

        String formattedString = String.format(greetingsTemplate,firstname,morning);
        System.out.println(formattedString);*/


/*      String gmailPattern="[A-Za-z-\\d]+@gmail\\.com";    //      \\d will match all the digits \\ we will look exactly . thats why we use double slash
        Pattern p = Pattern.compile(gmailPattern);
        String sampleText  = "some random text that contains gmail address like this one some-email@gmail.com and some random text";
        Matcher m =p.matcher(sampleText);
        m.find();
        String gmailAddress = m.group();
        System.out.println(gmailAddress);*/


//        for (int i = 0; i <5; i++) {
//            double piValue = Math.PI;
//            String strPI = String.valueOf(piValue);
//            System.out.println(strPI.substring(0,1+i));
//
//        }

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first and second number");
        String num = scanner.nextLine();
        String [] numArr = num.split(" ");
        System.out.println("your numbers are "+Arrays.toString(numArr));

        if (numArr.length>2){
            System.out.println("please enter only two numbers");
        }else {
            addNumbers(numArr[0], numArr[1]);
        }*/
//main eken passe method eka define karanawa
        /*    public static void addNumbers(String num1, String num2) {
        float res = Float.parseFloat(String.valueOf(num1)) + Float.parseFloat(String.valueOf(num2));
        System.out.println(res);
    }*/
        //finish eka

/*        System.out.println("option 1    login");
        System.out.println("option 2    sign_up");
        System.out.println("option 3    terminate_program");
        System.out.println("option 4    main_menu");
        System.out.println("option 5    about_app");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your option");
        int op = scanner.nextInt();


        switch (op){
            case 1:
                System.out.println("enter your username and password");
                break;
            case 2:
                System.out.println("welcome");
                break;
            case 3:
                System.out.println("thank you good bye");
                System.exit(0);
            case 4:
                System.out.println("main menu");
                break;
            case 5:
                System.out.println("about app");
                break;
        }*/


/*        Random r = new Random();
        System.out.println(r.nextInt());
        System.out.println(r.nextInt(100));
        System.out.println(r.nextInt(100)+1);*/

/*    int[] arr = {1,2,3};
    int sum=0;

        for (int number : arr) {
            sum+=number;
            System.out.println(sum);
        }
    */
/*        System.out.println(sum(1,2,3,3,4,4,4,4,4,4,4,4));

        //variable length arguments
        private static  int sum(int ... ints){
            int sum = 0;
            for (int i:ints) {
                sum+=i;
            }
            return sum;
        }*/


/*        Find max int in array
        Implement console program which will meet the following requirements:

        Program starts and asks user to input integer numbers separated by space.

        Program creates array object with entered numbers.

                Program calls specific method which takes int[] as an parameter and returns max value in this array.*/


//find max int in array
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("enter numbers with space");
        String numbers = scanner.nextLine();
        System.out.println(numbers);
        String [] strNumArr = numbers.split(" ");

        Arrays.sort(strNumArr);
        System.out.println(strNumArr[strNumArr.length-1]);*/


/*        Scanner scanner = new Scanner(System.in);
        System.out.println("enter height and width separated by space");
        String userInput = scanner.nextLine();
        String [] hAnWidthArr = userInput.split(" ");
        System.out.println("your height is "+hAnWidthArr[0]+" your width is "+hAnWidthArr[1]);

        for (int i = 0; i < Integer.parseInt(hAnWidthArr[0]); i++) {
            System.out.println("*");
            for (int j = 0; j < Integer.parseInt(hAnWidthArr[1]); j++) {
                System.out.print("*");
            }

        }*/

//word count challage
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your paragraph");
        String paragraph = scanner.nextLine();
        String [] paraArr = paragraph.split(" ");
        System.out.println(Arrays.toString(paraArr));
        System.out.println("your word count is "+paraArr.length);*/

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your paragraph");
        String text = scanner.nextLine();
        String[] textArr = text.split(" ");

        System.out.println("how much words do you need");
        int wordCount = scanner.nextInt();


        if (wordCount<textArr.length){
            for (int i = 0; i < wordCount; i++) {
                System.out.print(textArr[i]);
                System.out.print(" ");
            }
        }else {
            System.out.println("selected word count is greater than your paragraph word count please select actual value");
        }*/


/*        Scanner scanner  = new Scanner(System.in);
        System.out.println("enter some length");
        int arrSize = scanner.nextInt();
        int[] numbArr = new int[arrSize];



        for (int i = 0; i < numbArr.length; i++) {
            numbArr[i]=(int) (Math.random()*100);
        }

        System.out.println("first array "+Arrays.toString(numbArr));


        //start of second array
        //need to define second array which is twice as length as first array
        int[] secondArr = new int[arrSize*2];

        for (int i = 0; i < secondArr.length ; i++) {
            if (i< numbArr.length){
                secondArr[i]=numbArr[i];
            }else {
                secondArr[i]=numbArr[i - numbArr.length]*2;
            }
        }

        System.out.println("second array "+Arrays.toString(secondArr));*/

    

        

    }

}
