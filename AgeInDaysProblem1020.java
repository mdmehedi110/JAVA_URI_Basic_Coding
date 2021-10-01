
package uriproblem;

import java.util.Scanner;

public class AgeInDaysProblem1020 {
    public static void main(String[] args) {
        
        int days, years, months, days2, finaldays;
        
        Scanner input = new Scanner(System.in);
        days = input.nextInt();
        
        years = days / 365;
        days2 = days % 365;
        
        months = days2 / 30;
        finaldays = days2 % 30;
        
        System.out.println(years+" ano(s)");
        System.out.println(months+" mes(es)");
        System.out.println(finaldays+" dia(s)");
    }
    
}
