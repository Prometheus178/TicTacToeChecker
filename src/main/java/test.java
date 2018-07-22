import java.lang.reflect.Array;

public class test {
    public static void main(String[] args) {
        String result;
        char grid[][] = {{'x', 'o'}, {'o', 'o'} };
        int countX = 0;
        int countO = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] == 'x') {
                    countX++;
                    if (countX == 2) {
                        System.out.println("x wins");
                        break;
                    }
                }
                if (grid[i][j] == 'o') {
                    countO++;
                    if (countO == 2) {
                        System.out.println("o wins");
                        break;
                    }
                }

            }
        }


    }
}
