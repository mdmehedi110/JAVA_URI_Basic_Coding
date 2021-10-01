package uriproblem;

import java.util.Scanner;

public class Banknotes1018 {
    public static void main(String[] args) {
        int money;
        
        Scanner input = new Scanner(System.in);
        money = input.nextInt();
        
        int a,b,c,d,e,f,g,h,i,j,k,l,m,n;
        
        a = money % 100;
        h = money / 100;
        
        b = a % 50;
        i = a / 50;
        
        c = b % 20;
        j = b / 20;
        
        d = c % 10;
        k = c / 10;
        
        e = d % 5;
        l = d / 5;
        
        f = e % 2;
        m = e / 2;
        
        g = f % 1;
        n = f / 1;
        
        System.out.println(money+"");
        System.out.println(h+" nota(s) de R$ 100,00");
        System.out.println(i+" nota(s) de R$ 50,00");
        System.out.println(j+" nota(s) de R$ 20,00");
        System.out.println(k+" nota(s) de R$ 10,00");
        System.out.println(l+" nota(s) de R$ 5,00");
        System.out.println(m+" nota(s) de R$ 2,00");
        System.out.println(n+" nota(s) de R$ 1,00");
    }
    
}
