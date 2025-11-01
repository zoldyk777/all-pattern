public class pattern14 {
    public static void main(String[] args) {
        int rows = 3;   
        int cols = 17;  

        for (int i = 0; i < rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if ((i + j) % 4 == 0 || (i == 1 && j % 4 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
