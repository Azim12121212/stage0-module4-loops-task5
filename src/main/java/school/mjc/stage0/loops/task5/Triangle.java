package school.mjc.stage0.loops.task5;

public class Triangle {
    public static void printTriangle(int cathetusLength) {
        char eight = '8';

        if (cathetusLength==0) {
            System.out.println("");
        } else if (cathetusLength==1) {
            System.out.println(eight);
        } else {
            for (int i=0; i<cathetusLength; i++) {
                for (int y=0; y<cathetusLength; y++) {
                    if (y<=i) {
                        System.out.print(eight);
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        printTriangle(5);
    }
}
