package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void printHourglassOfGivenSize(int height) {
        char eight = '8';

        if (height==0) {
            System.out.print("");
        } else if (height==1) {
            System.out.print(eight);
        } else if (height==2) {
            System.out.println(eight);
            System.out.print(eight);
        } else {
            for (int i=0; i<height; i++) {
                for (int y=0; y<height; y++) {
                    if (height%2==0) {
                        if (i+1<=height/2) {
                            if (y<i || y>=height-i) {
                                System.out.print(" ");
                            } else {
                                System.out.print(eight);
                            }
                        } else {
                            if (y>i || y<(height-1)-i) {
                                System.out.print(" ");
                            } else {
                                System.out.print(eight);
                            }
                        }
                    } else {
                        if (i<=(height-1)/2) {
                            if (y<i || y>=height-i) {
                                System.out.print(" ");
                            } else {
                                System.out.print(eight);
                            }
                        } else {
                            if (y>i || y<(height-1)-i) {
                                System.out.print(" ");
                            } else {
                                System.out.print(eight);
                            }
                        }
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        printHourglassOfGivenSize(5);
    }
}
