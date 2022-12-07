public class Main {
    public static void main(String[] args) {
        int[] num = new int[]{
                5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17, 18, 19, 10, 21, 22, 23, 24, 25
        };

        for(int i = 0; i < num.length; i++){
            int numb = num[i];
            System.out.print(numb + " - ");
        }

        for(int i = 5; i <= 25; i++){
            System.out.print(i + " - ");
        }
    }
}