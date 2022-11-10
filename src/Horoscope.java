import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
/*  Koç Burcu : 21 Mart - 20 Nisan  o

Boğa Burcu : 21 Nisan - 21 Mayıs o

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak    o

Kova Burcu : 22 Ocak (yapıldı)- 19 Şubat  o

Balık Burcu : 20 Şubat(yapıldı) - 20 Mart    o */
        int month, day;


        Scanner scanner = new Scanner(System.in);
        System.out.println("doğduğunuz ayı giriniz");
        month = scanner.nextInt();
        System.out.println("doğduğunuz günü giriniz");
        day = scanner.nextInt();
        if ((month==1 && day>=20)|| (month==12 && day<=21)) {
            System.out.println("oğlak");


        }
            else if ((month==1 && day>=21)|| (month==2 && day<=19)){
                System.out.println("kova");
            }
            else if ((month==2 && day>=20)|| (month==3 && day<=20)){
                System.out.println("balık");
            }
            else if ((month==3 && day>=21)|| (month==4 && day<=20)){
                System.out.println("koç");
            }
            else if ((month==4 && day>=21)|| (month==5 && day<=21)){
                System.out.println("boğa");
            }
            else if ((month==5 && day>=22)|| (month==6 && day<=22)){
                System.out.println("ikizler");
            }
            else if ((month==6 && day>=23)|| (month==7 && day<=22)){
                System.out.println("yengeç");
            }
            else if ((month==7 && day>=23)|| (month==8 && day<=22)){
                System.out.println("aslan");
            }
            else if ((month==8 && day>=23)|| (month==9 && day<=22)){
                System.out.println("başak");
            }
            else if ((month==9 && day>=23)|| (month==10 && day<=22)){
                System.out.println("terazi");
            }
            else if ((month==10 && day>=23)|| (month==11 && day<=21)){
                System.out.println("akrep");
            }
            else if ((month==11 && day>=22)|| (month==12 && day<=21)){
                System.out.println("yay");
            }
        
        }

    }
