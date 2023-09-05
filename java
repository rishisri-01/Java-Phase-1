// PRogram to find occurrence in a sentence

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence: ");
        String str=sc.nextLine();
        System.out.println("Enter the word: ");
        String str1=sc.nextLine();
        String[] w= str.split(" ");
        int c=0;
        for (String w1 : w) {
            if (w1.equalsIgnoreCase(str1)) {
                c++;
            }
        }
        System.out.println("The no. of occurrence of "+str1+" is "+c);
    }
}



// WAP to find birth by seat no.

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n>0 && n<=72){
            if (n==1 || n%8==1){
                System.out.println("Lower Birth");
            }
            if (n==2 || n%8==2){
                System.out.println("Middle Birth");
            }
            if (n==3 || n%8==3){
                System.out.println("upper Birth");
            }
            if (n==4 || n%8==4){
                System.out.println("Lower Birth");
            }
            if (n==5 || n%8==5){
                System.out.println("middle Birth");
            }
            if (n==6 || n%8==6){
                System.out.println("upper Birth");
                
            }
            if (n==7 || n%8==7){
                System.out.println("S.Lower Birth");
            }
            if (n==8 || n%8==0){
                System.out.println("S.upper Birth");
            }
            
        }
        else{
            System.out.println("Enter Valid Seat no.");
        }
    }
}

//binary to dec and dec to bin

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice 1 for B to D or 2 for D to B: ");
        int n1=sc.nextInt();
        switch(n1){
            case 1:
                String bs=sc.nextLine();
                System.out.println(Integer.parseInt(bs,2));
                break;
            case 2:
                int n=sc.nextInt();
                System.out.println(Integer.toBinaryString(n));
                break;
        }
    }
}
