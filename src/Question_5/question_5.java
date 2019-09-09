package Question_5;

import java.util.Scanner;

public class question_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int size = scanner.nextInt();
        int n = size;
        int[][] a = new int[size][size];
        System.out.println("Enter matrix elements: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i==0) {
                    a[i][j]= 1;
                }else if (i==1) {
                    a[i][j] = 2;
                }else if(i!=1) {
                    a[i][j] = i + 1;
                }else if (j==0) {
                    a[i][j] = j + 1;
                }if(i==n) {
                    a[i][j]=i;
                }else if (i+j-n>n-i-j-1) {
                    a[i][j] = 0;
                }
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}