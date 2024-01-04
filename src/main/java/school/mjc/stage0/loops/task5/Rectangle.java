package school.mjc.stage0.loops.task5;

public class Rectangle {
    public static void printRectangleFrom8s(int length, int height){
        char eight = '8';

        if (length<=1 || height<=1) {
            if (length==1 && height==1) {
                System.out.print(eight);
            } else {
                System.out.print("");
            }
        } else {
            for (int i=0; i<height; i++) {
                for (int j=0; j<length; j++) {
                    if (length>=3 && height>=3) {
                        if (i==0 || i==height-1) {
                            System.out.print(eight);
                        } else if (j==0 || j==length-1) {
                            System.out.print(eight);
                        } else {
                            System.out.print(" ");
                        }
                    } else {
                        System.out.print(eight);
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        printRectangleFrom8s(6, 2);
    }
}
