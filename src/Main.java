import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("1.Sayiyi giriniz:");
        int n1 = inp.nextInt();
        System.out.print("2.Sayiyi giriniz:");
        int n2 = inp.nextInt();
        System.out.println("1-Toplama\n2-Cikarma\n3-Bolme\n4-Carpma");
        System.out.print("Seciminiz:");
        int select =  inp.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam = " + (n1+n2));
                break;
            case 2:
                System.out.println("Cikarma = " + (n1-n2));
                break;
            case 3:
                if(n2!=0){
                    System.out.println("Bolme = " + (n1/n2));
                }
                else{
                    System.out.println("Bir sayi 0'a bolunemez!");
                }
                break;
            case 4:
                System.out.println("Carpma = " + (n1*n2));
                break;
            default:
                System.out.println("Yanlis giris yaptiniz!");
        }
    }
}