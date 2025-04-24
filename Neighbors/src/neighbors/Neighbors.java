import java.util.Scanner;

public class Neighbors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.nextLine(); 

        char[][] grid = new char[n][m];

        for (int i = 0; i < n; i++) {
            String line = scan.nextLine();
            for (int j = 0; j < m; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        int x = scan.nextInt() - 1;
        int y = scan.nextInt() - 1;

        int[] dx = {-1, -1, -1,  0, 0, 1, 1, 1};
        int[] dy = {-1,  0,  1, -1, 1, -1, 0, 1};

        boolean allX = true;

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                if (grid[nx][ny] != 'x') {
                    allX = false;
                    break;
                }
            }
        }

        System.out.println(allX ? "yes" : "no");
    }
}
