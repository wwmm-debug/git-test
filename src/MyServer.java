import java.io.*;
import java.util.Scanner;

public class MyServer{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String f = scanner.nextLine();
        String s = scanner.nextLine();
        int fA_number=0;
        int fT_number=0;
        int sA_number=0;
        int sT_number=0;
        int s_number=0;
        int thrid=0;
        char[] chars = f.toCharArray();
        char[] chars1 = s.toCharArray();
        for (int i = 0; i <chars.length; i++) {
            if (chars[i]=='A'){
                fA_number++;
            }else {
                fT_number++;
            }

            if (chars1[i]=='A'){
                sA_number++;
            }else {
                sT_number++;
            }

        }
        int n1=0;
        int n2=0;
        n1=fA_number>sA_number?fA_number:sA_number;
        n2=fT_number>sT_number?fT_number:sT_number;

        if (n1>n2){
           if (fT_number>sT_number){
               System.out.println(fT_number);
           }else {
               System.out.println(sT_number);
           }
        }else {
            if (fA_number>sA_number){
                System.out.println(fA_number);
            }else {
                System.out.println(sA_number);
            }
        }

    }

}
