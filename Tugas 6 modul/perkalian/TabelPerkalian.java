public class TabelPerkalian {
    public void tampilkanTabel(int n) {
        System.out.print("    ");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%4d", i);
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}