import java.util.Scanner;
    public class ASN3 {
        public static void main(String[] args) {
            methodA();
            methodB();
            methodC();
            methodD();
            methodE();
        }

        public static void methodA() {
            // y = ax3 + 7
            Scanner scan = new Scanner(System.in);
            System.out.print("MethodA - Enter int a: ");
            int a = scan.nextInt();
            System.out.print("MethodA - Enter int x: ");
            int x = scan.nextInt();
            int y = a * (x * x * x) + 7;
            System.out.println("MethodA - " + y + " = " + a + " " + x + "(3)" + " + 7");
        }

        public static void methodB() {
            Scanner scan = new Scanner(System.in);
            System.out.print("MethodB - Enter Array Size 1 - 9: ");
            int input = scan.nextInt();
            if (input > 9) {
                input = 9;
            }
            else if (input < 1) {
                input = 1;
            }
            System.out.println("Method B Start");
                for (int x = 0; x < input; x++) {
                    for (int y = 0; y < input; y++) {
                        if (x == y) {
                            System.out.print("*");
                        } else {
                            System.out.print("-");
                        }
                    }
                    System.out.println();
                }
                System.out.println("Method B End");
            }

        public static void methodC() {
            Scanner scan = new Scanner(System.in);
            System.out.print("MethodC - Enter Integer 1 to 100: ");
            int input = scan.nextInt();
            if (input % 2 == 0) {
                System.out.println("MethodC - Number " + input + " is Even");
            } else {
                System.out.println("MethodC - Number " + input + " is Odd");
            }
        }

        public static void methodD() {
            Scanner scan = new Scanner(System.in);
            System.out.print("Method D - Enter integer d: ");
            int d = scan.nextInt();
            System.out.print("Method D - Enter integer e: ");
            int e = scan.nextInt();
            if (d % e == 0) {
                System.out.println("MethodD - " + d + " is a multiple of " + e);
            } else {
                System.out.println("MethodD - " + d + " is not a multiple of " + e);
            }
        }

        public static void methodE() {
            Scanner scan = new Scanner(System.in);
            int positives = 0;
            int negatives = 0;
            int zeros = 0;
            for (int x = 0; x < 5; x++) {
                System.out.printf("MethodE - Enter number %x: ",+ x + 1);
                int input = scan.nextInt();
                if (input > 0) {
                    positives += 1;
                } else if (input < 0) {
                    negatives += 1;
                } else {
                    zeros += 1;
                }
            }
            System.out.print("MethodE - Totals < 0 : "+negatives+" = 0 : "+zeros+" > 0 : "+positives);
        }
    }

