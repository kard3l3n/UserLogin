package userlogin;
import java.util.Scanner;
import java.math.*;

public class UserLogin {
    public static void main(String[] args) {
        String username,password,yenisifre="12345",cevap,ans;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Giriş yapmak ister misiniz?(e/h):");
        cevap=input.nextLine();
        
        while(cevap.equals("e")){
            System.out.println("Kullanıcı adınızı giriniz:");
            username=input.nextLine();
            System.out.println("Şifrenizi giriniz:");
            password=input.nextLine();
            
            if(username.equals("Kardelen") && password.equals(yenisifre)){
                System.out.println("Şifre doğru");
                cevap="h";
            }
            else if(username.equals("") || password.equals("")){
                System.out.println("Şifre veya kullanıcı adı boş olamaz");
                 System.out.println("Giriş yapmak ister misiniz?(e/h):");
            cevap=input.nextLine();
            }
            else{
                System.out.println("Şifre hatalı yeni şifre girmek ister misiniz?(e/h):");
                ans=input.nextLine();
                if(ans.equals("e")){
                    System.out.println("Yeni şifreyi giriniz:");
                    yenisifre=input.nextLine();
                }
                 System.out.println("Giriş yapmak ister misiniz?(e/h):");
            cevap=input.nextLine();
                
            }
            
           
        }
    }
    
}
