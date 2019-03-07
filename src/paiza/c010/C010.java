package paiza.c010;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 공사현상
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int R = scanner.nextInt();

        Gongsa gongsa = new Gongsa(a, b, R);

        // 나무
        int N = scanner.nextInt();

        List<Tree> treeArrayList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            Tree tree = new Tree(x, y);
            treeArrayList.add(tree);
        }

        // 공원
        Park park = new Park(gongsa, treeArrayList);
        park.printNoisy();
    }
}
