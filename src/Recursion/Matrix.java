package Recursion;

/* Find number of ways to go from upper left cell in matrix to lower right cell.
   You can go only in right and bottom direction
 */

public class Matrix {

    public static void main(String[] args) {
        System.out.println(path(2, 2));
    }

    static int path(int m, int n){
        if(m == 1 || n == 1){
            return 1;
        }
        return path(m, n -1) + path(m - 1, n);
    }

}
