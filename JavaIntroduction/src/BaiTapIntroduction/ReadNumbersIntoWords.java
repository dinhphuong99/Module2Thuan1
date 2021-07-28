package BaiTapIntroduction;

import java.util.Scanner;

public class ReadNumbersIntoWords {
    public static void main(String[] args) {
        System.out.printf("Enter a number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if(number ==0){
            System.out.println("zero");
        } else if(number > 0 && number <1000){

            int[] arrNumber = new int[3];

            arrNumber[0] = (int)(number/100);

            arrNumber[1] = (int)((number%100)/10);

            arrNumber[2] = (int)(number%10);

            String []textNumber = new String[3];

            if(arrNumber[0] == 0) {
                textNumber[0] = "";
            } else if (arrNumber[0] !=0){
                switch (arrNumber[0]){
                    case 1:
                        textNumber[0] = "one hundred ";
                        break;

                    case 2:
                        textNumber[0] = "two hundred ";
                        break;

                    case 3:
                        textNumber[0] = "three hundred ";
                        break;

                    case 4:
                        textNumber[0] = "four hundred ";
                        break;

                    case 5:
                        textNumber[0] = "five hundred ";
                        break;

                    case 6:
                        textNumber[0] = "six hundred ";
                        break;

                    case 7:
                        textNumber[0] = "seven hundred ";
                        break;

                    case 8:
                        textNumber[0] = "eight hundred ";
                        break;

                    case 9:
                        textNumber[0] = "nine hundred ";
                        break;
                }
            }

            if(arrNumber[1] == 0){
                textNumber[1] = "";
            } else if(arrNumber[1]== 1 && arrNumber[2] == 1){
                textNumber[1] = "eleven";
                textNumber[2] = "";
            } else if(arrNumber[1]== 1 && arrNumber[2] == 2){
                textNumber[1] = "twelve";
                textNumber[2] = "";
            }else if(arrNumber[1]== 1 && arrNumber[2] == 0){
                textNumber[1] = "ten";
                textNumber[2] = "";
            }else if(arrNumber[1]== 1 && arrNumber[2] != 1 && arrNumber[2] != 2){
                switch (arrNumber[2]){
                    case 3:
                        textNumber[1] = "thirteen";
                        textNumber[2] = "";
                        break;

                    case 4:
                        textNumber[1] = "fourteen";
                        textNumber[2] = "";
                        break;

                    case 5:
                        textNumber[1] = "fifteen";
                        textNumber[2] = "";
                        break;

                    case 6:
                        textNumber[1] = "sixteen";
                        textNumber[2] = "";
                        break;

                    case 7:
                        textNumber[1] = "seventeen";
                        textNumber[2] = "";
                        break;

                    case 8:
                        textNumber[1] = "eighteen";
                        textNumber[2] = "";
                        break;

                    case 9:
                        textNumber[1] = "nineteen";
                        textNumber[2] = "";
                        break;
                }
            }else if (arrNumber[1] != 1){
                switch (arrNumber[1]){
                    case 2:
                        textNumber[1] = "twenty ";
                        break;

                    case 3:
                        textNumber[1] = "thirty ";
                        break;

                    case 4:
                        textNumber[1] = "forty ";
                        break;

                    case 5:
                        textNumber[1] = "fifty ";
                        break;

                    case 6:
                        textNumber[1] = "sixty ";
                        break;

                    case 7:
                        textNumber[1] = "seventy ";
                        break;

                    case 8:
                        textNumber[1] = "eighty ";
                        break;

                    case 9:
                        textNumber[1] = "ninety ";
                        break;
                }
            }

            if(arrNumber[1] != 1){
                switch (arrNumber[2]){
                    case 0:
                        textNumber[2] = "";
                        break;
                    case 1:
                        textNumber[2] = "one";
                        break;

                    case 2:
                        textNumber[2] = "two";
                        break;

                    case 3:
                        textNumber[2] = "three";
                        break;

                    case 4:
                        textNumber[2] = "four";
                        break;

                    case 5:
                        textNumber[2] = "five";
                        break;

                    case 6:
                        textNumber[2] = "six";
                        break;

                    case 7:
                        textNumber[2] = "seven";
                        break;

                    case 8:
                        textNumber[2] = "eight";
                        break;

                    case 9:
                        textNumber[2] = "nine";
                        break;
                }
            }

            String and = "";
            if(arrNumber[0] != 0 &&(arrNumber[1]!=0 || arrNumber[2]!=0)){
                and = " and ";
            }

            System.out.printf(String.valueOf(textNumber[0] +  and + textNumber[1] + textNumber[2]));
        }else {
            System.out.println("");
            System.out.printf("Invalid input");
        }
    }
}
