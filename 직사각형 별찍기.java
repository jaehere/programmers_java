
// [직사각형 별찍기](https://programmers.co.kr/learn/courses/30/lessons/12969)


import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

      //이중 for문 으로 a가 가로개수 b가 세로개수
        for(int i = 0; i< b; i++){
            for(int j=0; j<a; j++){
                System.out.print("*");
            }
            System.out.println(); //단락변경
        }

    }
}
