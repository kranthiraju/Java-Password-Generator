import java.util.*;

public class GeneratorPassOTP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int option=0;

        System.out.println("Generator Password , OTP");

        String Capticals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String Smalls = "abcdefghijklmnopqrstuvwxyz";
        String Numbers = "0123456789";
        String Symbols = "!@#$%^&*_=+-/.?<>)";

        String values = Capticals + Smalls + Numbers + Symbols;

        Random rndm_method = new Random();

        do{
            System.out.println("1. Password \n2. OTP");
            System.out.print("Enter Option : ");
            option = sc.nextInt();

            switch(option){
                case 1:{
                    char[] password = new char[10];

                    for(int i=0;i<10;i++){
                        password[i] = values.charAt(rndm_method.nextInt(values.length()));
                    }

                    System.out.print("Password : ");
                    System.out.println(password);

                    break;
                }
                case 2:{
                    char[] otp = new char[4];

                    for(int i=0;i<4;i++){
                        otp[i] = Numbers.charAt(rndm_method.nextInt(Numbers.length()));
                    }

                    System.out.print("OTP : ");
                    System.out.println(otp);

                    break;
                }
                default:{
                    System.out.println("Thank You -_-");
                    System.exit(0);

                }
            }

            System.out.println("<< --------------------- >>");
        }while(option!=-1);
    }
}
