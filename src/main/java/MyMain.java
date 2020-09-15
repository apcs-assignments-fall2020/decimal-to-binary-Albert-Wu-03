import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int x = Integer.parseInt(binary);
        int i = 1;
        int d = 0;
        for(int l=0; l < binary.length(); l++){
            d += (x%10)*i;
            x /= 10;
            i*=2;
        }
        return d;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number in binary format");
        String binary = scan.nextLine();     
        System.out.println("That is equal to the decimal value "+binaryToDecimal(binary));
    }
}
