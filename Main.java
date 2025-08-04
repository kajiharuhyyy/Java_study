public class Main {
    public static void main(String[] args) {

        int[] scores = new int[]{20, 30, 40, 50, 60};
        int count = 0;
        for(int i = 0; i < scores.length; i++) {
            if(scores[i] >= 20) {
                count++;
            }
        }
        //int avg = sum / scores.length;
        System.out.println(count);
        //System.out.println(avg);
    }
}
