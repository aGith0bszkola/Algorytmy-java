public class Main {
    public static void main(String[] args) {
        int[] NewArray = new int[]{1,4,9,16,25,36,49,64,81,100};
        for (int Sqrt : NewArray) {
            System.out.println(Sqrt);
            double Wyniki = Math.sqrt(Sqrt);
            System.out.println(Wyniki);
        }

    }
}