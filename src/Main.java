public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] weights = new int[12];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        for (int i = 0; i < 12; i++) {
            System.out.println(weights[i]);
        }
        System.out.println();
        double[] a = {1.57, 7.654, 9.986, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        a[0] = 1.57;
        for (int i = 0; i < 12; i++) {
            System.out.println(a[i]);
        }
        System.out.println();
        int[] beauty = {3, 5, 7, 9, 0, 0, 0};
        beauty[0] = 3;
        for (int i = 0; i < 7; i++) {
            System.out.println(beauty[i]);
        }
        System.out.println();
        for (int i = 0; i < 12; i++) {
            if (i== weights.length - 1) {
                System.out.println(weights[i]);
                break;
            }
            System.out.print(weights[i] + ", ");
        }

        System.out.println();
        for (int i = 0; i < 12; i++) {
            if (i== a.length-1){
                System.out.println(a[i]);
                break;
            }
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < 7; i++) {
            if (i== beauty.length-1) {
                System.out.println(beauty[i]);
                break;
            }
            System.out.print(beauty[i] + ", ");
        }
        System.out.println();

        }
    }

