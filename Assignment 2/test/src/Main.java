import java.util.*;
public class Main {
    // Section E //
    public static int SpecialAdder(int var1,int var2) {
        int math = var1 + var2;
        if (var1 <= 9999 & var1 >=1000 & var2 <= 9999 & var2 >=1000) {
            return math;
        }
        else {
            return 0;
            // Emd of Section E //
        }
    }


    public static void main(String[] args) {
        /* Section A
        Name: Adam Elliott
        Student Number: 20158881
        Course Number: CP2280
        Section Number: C1
        Date: Sept 26th, 2021
        End Section B
        */

        // Section B //
        System.out.println("Enter an integer between 1 to 8:");
        Scanner input = new Scanner(System.in);
        int InputNumber = input.nextInt();
        for (int y = 1; y <= 8; y++) {
            System.out.print(InputNumber + "\t\t");
        }
        System.out.print("\n");
        {
            System.out.print(InputNumber);
            for (int y = 1; y <= 7; y++) {
                System.out.printf("%8d", InputNumber);
                // End Section B //
            }
            {
                System.out.print("\n");
            }
            {
                // Section C //
                String p1 = ("The path to the file is C:\\usr\\local\\bin");
                String p2 = ("\"");
                System.out.print(p2 + p1 + p2);
                // End of Section C //
            }
            {
                // Start of Section C //
                Weather Forecast = new Weather();
                Forecast.todaysWeather();
                // End of Section C //
            }
            {
                // Section E //
                int Number = SpecialAdder(2015,8881);
                System.out.println("Answer: "+Number);
                // Section E //
            }
        }
    }
}