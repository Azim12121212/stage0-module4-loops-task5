package school.mjc.stage0.loops.task5;

public class Cross {
    public static void printCross(int sideLength) {
        char eight = '8';

        if (sideLength==0) {
            System.out.print("");
        } else if (sideLength%2==0) {
            System.out.print("Not possible to build a cross");
        } else {
            for (int i=0; i<sideLength; i++) {
                for (int y=0; y<sideLength; y++) {
                    if (i==sideLength/2) {
                        System.out.print(eight);
                    } else {
                        if (y==sideLength/2) {
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
        printCross(7);
    }
}
