package school.mjc.stage0.loops.task5;

public class Square {
    public static void printSquareFrom8s(int sideLength){
        char eight = '8';

        if (sideLength==0) {
            System.out.print("");
        } else if (sideLength==1) {
            System.out.print(eight);
        } else {
            for (int i=0; i<sideLength; i++) {
                for (int y=0; y<sideLength; y++) {
                    if (i==0 || i==sideLength-1) {
                        System.out.print(eight);
                    } else {
                        if (y==0 || y==sideLength-1) {
                            System.out.print(eight);
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        printSquareFrom8s(5);
    }
}
