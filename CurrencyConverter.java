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
} else if (code==3){
//euro
usdollar = amount*1.02
System.out.println("Your " + amount + " Euro is : " + f.format(usdollar) + " Usdollar");
japanyen = amount*136.09
System.out.println("Your " + amount + " Euro is : " + f.format(japanyen) + " Japanyen");
indianrupee = amount*81.07
System.out.println("Your " + amount + " Euro is : " + f.format(indianrupee) + " Indianrupees");
chinayuan = amount*6.89
System.out.println("Your " + amount + " Euro is : " + f.format(chinayuan) + " Chinayuan");
poundsterling = amount*0.84
System.out.println("Your " + amount + " Euro is : " + f.format(poundsterling) + " Poundsterling");
} else if (code==4){
//japanyen
usdollar = amount*0.0075
System.out.println("Your " + amount + " Japanyen is : " + f.format(usdollar) + " Usdollar");
euro = amount*0.0073
System.out.println("Your " + amount + " Japanyen is : " + f.format(euro) + " Euro");
indianrupee = amount*0.0073
System.out.println("Your " + amount + " Japanyen is : " + f.format(indianrupee) + " Indianrupee");
chinayuan = amount*0.051
System.out.println("Your " + amount + " Japanyen is : " + f.format(chinayuan) + " Chinayuan");
poundsterling = amount*0.0062
System.out.println("Your " + amount + " Japanyen is : " + f.format(poundsterling) + " Poundsterling");
} else if (code==){
//indianrupee
usdollar = amount*0.013
System.out.println("Your " + amount + " Indianrupee is : " + f.format(usdollar) + " Usdollar");
euro = amount*0.012
System.out.println("Your " + amount + " Indianrupee is : " + f.format(euro) + " Euro");
japanyen = amount*1.68
System.out.println("Your " + amount + " Indianrupee is : " + f.format(japanyen) + " Japanyen");
chinayuan =amount*0.085
System.out.println("Your " + amount + " Indianrupee is : " + f.format(chinayuan) + " Chinayuan");
poundsterling = amount*0.12
System.out.println("Your " + amount + " Indianrupee is : " + f.format(poundsterling) + " Poundsterling");
} else if (code==5){
//chinayuan
usdollar = amount*0.15
System.out.println("Your " + amount + " Chinayuan is : " + f.format(usdollar) + " Usdollar");
euro = amount*0.14
System.out.println("Your " + amount + " Chinayuan is : " + f.format(euro) + " Euro");
japanyen = amount*19.75
System.out.println("Your " + amount + " Chinayuan is : " + f.format(japanyen) + " Japanyen");
indianrupee = amount*11.76
System.out.println("Your " + amount + " Chinayuan is : " + f.format(indianrupee) + " Indianrupee");
poundsterling = amount*0.01
System.out.println("Your " + amount + " Chinayuan is : " + f.format(poundsterling) + " Poundsterling");
} else if (code==6){
//poundsterling
usdollar = amount*1.22
System.out.println("Your " + amount + " Poundsterling is : " + f.format(usdollar) + " Usdollar");
euro = amount*1.19
System.out.println("Your " + amount + " Poundsterling is : " + f.format(euro) + " Euro");
japanyen = amount*162.04
System.out.println("Your " + amount + " Poundsterling is : " + f.format(japanyen) + " Japanyen");
indianrupee = amount*96.52
System.out.println("Your " + amount + " Poundsterling is : " + f.format(indianrupee) + " Indianrupee");
indianrupee = amount*8.2
System.out.println("Your " + amount + " Poundsterling is : " + f.format(chinayuan) + " Chinayuan");
} else {
System.out.println("Error")
System.out.println("Please try again")
System.out.println("Your " + amount + " Poundsterling is : " + f.format(japanyen) + " Japanyen");
  
  
