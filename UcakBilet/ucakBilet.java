package UcakBilet;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class ucakBilet{

    public static void main(String[] args) {

        Scanner tar=new Scanner(System.in);
        
        System.out.println("Mesafeyi Km Cinsinden Giriniz:");

        int mesafe=tar.nextInt();

        System.out.println("Yaşınızı Giriniz:");

        int yas=tar.nextInt();

        System.out.println("Yolculuk Tipi Giriniz\n1-Tek Yön\n2-Çift Yön");

        int tip=tar.nextInt();

        int tutar,normaltutar=mesafe*10/100;

        if(mesafe>=0){
            
            if( 0<tip&&tip<3){

                switch(tip){

                    case 1:

                    if(0<=yas&&yas<12){

                        tutar=normaltutar*50/100;

                        System.out.println("Toplam Tutar ="+tutar+" TL");

                    }
                    else if(12<=yas&&yas<24){

                         tutar=normaltutar*90/100;

                         System.out.println("Toplam Tutar ="+tutar+" TL");

                    }
                    else if(24<=yas&&yas<65){

                        tutar=normaltutar;

                        System.out.println("Toplam Tutar ="+tutar+" TL");
                    }
                    else if(65<=yas){

                        tutar=normaltutar*70/100;

                        System.out.println("Toplam Tutar ="+tutar+" TL");
                    }
                    else{

                        System.out.println("Hatalı Veri Girdiniz !");
                        
                    }
                    break;
                
                    case 2:

                    if(0<=yas&&yas<12){

                        tutar=normaltutar*50/100*80/100*2;

                        System.out.println("Toplam Tutar ="+tutar+" TL");

                    }
                    else if(12<=yas&&yas<24){

                         tutar=normaltutar*90/100*80/100*2;

                         System.out.println("Toplam Tutar ="+tutar+" TL");

                    }
                    else if(24<=yas&&yas<65){

                        tutar=normaltutar*80/100*2;

                        System.out.println("Toplam Tutar ="+tutar+" TL");
                    }
                    else if(65<=yas){

                        tutar=normaltutar*70/100*80/100*2;

                        System.out.println("Toplam Tutar ="+tutar+" TL");
                    }
                    else{

                        System.out.println("Hatalı Veri Girdiniz !");

                    }
                    break;
                }


        }
        else {

            System.out.println("Hatalı Veri Girdiniz !");

        }
    }
    else {

        System.out.println("Hatalı Veri Girdiniz !");
    }

    }
}