class pattern{
    public static void main(String[] args) {
        int n=5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
    }
    for (int i = 1; i <= n; i++) {

            // loop to print the number of spaces before the star
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }

            // loop to print the number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
    }
}
}