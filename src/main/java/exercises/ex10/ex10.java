package exercises.ex10;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */

public class ex10 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex10 example10 = new ex10();

        //input
        String priceItem1 = example10.priceItem1();
        String quanItem1 = example10.quanItem1();

        String priceItem2 = example10.priceItem2();
        String quanItem2= example10.quanItem2();

        String priceItem3 = example10.priceItem3();
        String quanItem3 = example10.quanItem3();

        //Str->Int
        int price1 = example10.price1(priceItem1);
        int quantity1 = example10.quantity1(quanItem1);

        int price2 = example10.price2(priceItem2);
        int quantity2 = example10.quantity2(quanItem2);

        int price3 = example10.price3(priceItem3);
        int quantity3 = example10.quantity3(quanItem3);

        //Calculations
        double subTotal = example10.subTotal(price1,quantity1,price2,quantity2,price3,quantity3);


        double tax = example10.totalTax(subTotal);
        double total = example10.total(subTotal, tax);

        //Output
        String outputString = example10.outputString(subTotal, tax, total);

        example10.printOutput(outputString);
    }

    private void printOutput(String outputString) {
        System.out.print(outputString);
    }

    private String outputString(double subTotal, double tax, double total) {
        return "Subtotal: $" + String.format("%.2f",subTotal) + "\n" +
                "Tax: $" + String.format("%.2f",tax) + "\n" +
                "Total: $" + String.format("%.2f",total);
    }

    private double total(double subTotal, double tax) {
        return subTotal + tax;
    }

    private double totalTax(double subTotal) {
        return (subTotal * .055);
    }

    private double subTotal(int price1, int quantity1, int price2, int quantity2, int price3, int quantity3) {
        int sub1 = (price1 * quantity1);
        int sub2 = (price2 * quantity2);
        int sub3 = (price3 * quantity3);
        double subTotal = sub1 + sub2 + sub3;

        return subTotal;
    }


    private int quantity3(String quanItem3) {
        int quantity3 = Integer.parseInt(quanItem3);
        return quantity3;
    }

    private int price3(String priceItem1) {
        int price1 = Integer.parseInt(priceItem1);
        return price1;
    }
    private int quantity2(String quanItem2) {
        int quantity2 = Integer.parseInt(quanItem2);
        return quantity2;
    }

    private int price2(String priceItem2) {
        int price2 = Integer.parseInt(priceItem2);
        return price2;
    }
    private int quantity1(String quanItem1) {
        int quantity1 = Integer.parseInt(quanItem1);
        return quantity1;
    }

    private int price1(String priceItem1) {
        int price1 = Integer.parseInt(priceItem1);
        return price1;
    }

    private String quanItem3() {
        System.out.print("Enter the quantity of item 3: ");
        String quantity3 = in.nextLine();
        return quantity3;
    }

    private String priceItem3() {
        System.out.print("Enter the price of item 3: ");
        String price3 = in.nextLine();
        return price3;
    }

    private String quanItem2() {
        System.out.print("Enter the quantity of item 2: ");
        String quantity1 = in.nextLine();
        return quantity1;
    }

    private String priceItem2() {
        System.out.print("Enter the price of item 2: ");
        String price1 = in.nextLine();
        return price1;
    }

    private String quanItem1() {
        System.out.print("Enter the quantity of item 1: ");
        String quantity1 = in.nextLine();
        return quantity1;
    }

    private String priceItem1() {
        System.out.print("Enter the price of item 1: ");
        String price1 = in.nextLine();
        return price1;
    }
}
