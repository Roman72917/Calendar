import java.util.Scanner;

class MyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int b = ((year/4 ) - (year/100) + (year/400));
        System.out.print(b);
    }
}