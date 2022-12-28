import java.util.Scanner;
public class Main {
  public static void main (String [] args){
    Scanner s=new Scanner(System.in);
    int num =s.nextInt();
    int dec_value = 0;
    int base=1;
    int temp=num;
    
    while (temp>0){
      int last_digit = temp%10;
      temp = temp/10;
      dec_value = last_digit *10;
      base = base *2;
    }
    System.out.println(dec_value);
      }
  }
