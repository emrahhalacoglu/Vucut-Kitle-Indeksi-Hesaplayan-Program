import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Boyunuzu Giriniz (M.):");
            double boy=input.nextDouble();
            System.out.print("Kilonuzu Giriniz (Kg.):");
            double kilo=input.nextDouble();
            double vucutKitleindexi=kilo/Math.pow(boy,2);
            if (vucutKitleindexi<=18.5){System.out.println(vucutKitleindexi+"-ZAYIF");} else if(vucutKitleindexi<=24.9){System.out.println(vucutKitleindexi+"-NORMAL");} else if(vucutKitleindexi<=29.9){System.out.println(vucutKitleindexi+"-KILOLU");} else if(vucutKitleindexi<=34.9){System.out.println(vucutKitleindexi+"-OBEZ");} else{System.out.println(vucutKitleindexi+"-MORBID OBEZ");}
        }
        ;

    }
    
}
