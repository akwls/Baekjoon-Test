import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int answer = -1;
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            double length = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

            if(x1 == x2 && y1 == y2 && r1 == r2) {
                answer = -1;
            }
            else if(r1 + r2 == length || Math.abs(r1 -r2) == length) {
                answer = 1;
            }
            else if(r1 + r2 < length || Math.abs(r1 - r2) > length) {
                answer = 0;
            }
            else {
                answer = 2;
            }

            System.out.println(answer);
        }
    }
}
