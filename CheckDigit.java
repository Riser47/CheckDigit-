import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your credit card number: ");
    String place = in.next(); 
    int tran = 0, total = 0;
    int sum = 0, sumTwo = 0;
    int sumOne = 0, sumThree = 0;
    String sub = "";
    
    for(int i = place.length(); i > 0; i=i-2){
        sub = place.substring(i-1, i);
        tran = Integer.parseInt(sub);
        sum += tran;
    }
    for(int i = place.length() - 1; i > 0; i=i-2){
        sub = place.substring(i-1, i);
        tran = Integer.parseInt(sub);
        sumOne = sumOne + (tran * 2);
       
    }
    total = (sum + (sumOne/2));
    String conv = place.substring(place.length() - 1, place.length());
    sumTwo = Integer.parseInt(conv);
    if(total%10 == 0){
        System.out.println("Credit Card is valid");
    } else{
        sumThree = Math.abs((sumTwo - total%10));
        System.out.println("The last digit should be a " + sumThree);
    }
    }
}