class Main {
    public static void main(String[] args) {
        System.out.println("20158881 Adam Elliott");

        System.out.printf("%10s","");

        for (int y = 1; y <= 10; y++) {
            System.out.printf("%10d", y);
        }

        for (int x = 1; x <= 10; x++) {
            System.out.println();
            System.out.printf("%10d", x);

            for (int y = 1; y <= 10; y++) {
                System.out.printf("%10d", (x * (y + 1)));
            }


        }

    }
}