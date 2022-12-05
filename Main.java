import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.print("Enter the number of disks: ");  
    Scanner disk = new Scanner(System.in);
    int noOfDisks = disk.nextInt();
    System.out.println("Number of moves of "+noOfDisks+" disks are "+Main.towersOfBrahma(noOfDisks)+".");
  }
  static int towersOfBrahma(int n){
    int result = (int)(Math.pow(2,n)-1);
    return result;
  }
}