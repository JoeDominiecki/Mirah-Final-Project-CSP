

public class Runner {

    public static void main(String[] args) {
        String[] test = {"One", "Two", "Three", "Question"};
        int[] array = {1,2,3,4};
        JFrameMaker j1 = new JFrameMaker(test, array);
        System.out.println("Here " + CounterClass.score);
    }
}
