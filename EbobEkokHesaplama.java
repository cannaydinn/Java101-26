import java.util.Scanner;

public class EbobEkokHesaplama{
    public static void main(String[] args) {
        //Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
        Scanner sc = new Scanner(System.in);
        int i=1, n1, n2, ebob=1, ekok=1;

        System.out.println("N1 sayısını giriniz: ");
        n1=sc.nextInt();

        System.out.println("N2 sayısını giriniz: ");
        n2=sc.nextInt();

        while(i<n1){
            i++;
            if(n1%i == 0 && n2%i == 0){
                ebob=i;
            }
        }
        ekok = (n1*n2)/ebob;
        System.out.println("Ebob değeri: "+ebob);
        System.out.println("Ekok değeri: "+ekok);

    }
}