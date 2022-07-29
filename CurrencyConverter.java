import java.util.*;
import java.text.DecimalFormat;
public class Money {
public static void main(String[] args) {
double amount, usdollar, euro, japanyen, indianrupee, chinayuan, poundsterling, code;
DecimalFormat f = new DecimalFormat("##.##");
Scanner scan = new Scanner(System.in);
System.out.println("This is a currency converter");
System.out.out.println("Type in what currency you want to convert from the avaible currencies below");
System.out.println("1:usdollar \t2:euro \t3:japanyen \t4:indianrupee \t5:chinayuan \t6:poundsterling ");
code = scan.nextInt();
System.out.println("Insert the amount of money you want converted");
amount = scan.nextDouble();
} else if (code==2) {
//dollar
euro = amount*0.98
System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euros");
japanyen = amount*133.28
System.out.println("Your " + amount + " Dollar is : " + f.format(japanyen) + " Japanyen");
indianrupee = amount*79.35
System.out.println("Your " + amount + " Dollar is : " + f.format(indianrupee) + " Indianrupees");
chinayuan = amount*6.74
System.out.println("Your " + amount + " Dollar is : " + f.format(chinayuan) + " Chinayuan");
poundsterling = amount*0.82
System.out.println("Your " + amount + " Dollar is : " + f.format(poundsterling) + " Poundsterling");
} else if (code==)3{
//euro
dollar = amount*1.02
System.out.println("Your " + amount + " Euro is : " + f.format(usdollar) + " Usdollar");
