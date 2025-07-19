import java.util.*;
 class q1 
{
    public static void main(String []args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number of monkeys");int n = sc.nextInt(); // number of monkeys
    System.out.println("Enter the total number of bananas");int x = sc.nextInt(); //total number of bananas
    System.out.println("Enter the total number of peanuts");int y = sc.nextInt(); // ttotal number of peanuts
    System.out.println("Banana capacity of monkeys");int b = sc.nextInt(); // capacity of bananas
    System.out.println("Peanut capacity of monkeys");int p = sc.nextInt(); sc.close(); // capacity of peanuts
    while(n>0 && (x>b || y>p)){if(x>b){x = x-b; n--;}else if(y>p){y = y-p;n--;}}x = 0;y=0;n--;System.out.println("Remaining monkeys = "+n);}}
// Day 2 Slot 2 Question 2
// Click on the below button to study Day 2 Slot 2 Question 1 of TCS NQT Coding 2020 exam
// 
// Code
// 
// TCS Coding Questions
// Click on the below button to study more TCS Coding Question
// 
// TCS Coding Question

