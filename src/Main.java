public class Main {

    public static void main(String[] args) {
        //1.open new space
        int[] arr = new int[10];

        //2.initialize with content with for or directly with {}
        for(int i=1; i<arr.length; i++)
            arr[i] = i;
        int[] scores = new int[]{100,99,66};

        //3.Output java collection
        for(int i=0;i<scores.length;i++)
            System.out.println(scores[i]);

        scores[0] = 88;

        for(int score:scores)
            System.out.println(score);
    }
}
