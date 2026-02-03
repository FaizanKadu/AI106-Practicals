interface Function {
    int evaluate(int value);
}

class Half implements Function {
    public int evaluate(int value) {
        return value / 2;
    }
}

public class Client {
    public static int[] processArray(int[] input) {
        int[] result = new int[input.length];
        Half halfObj = new Half();

        for (int i = 0; i < input.length; i++) {
            result[i] = halfObj.evaluate(input[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40};
        int[] halvedNums = processArray(nums);

        for (int n : halvedNums) {
            System.out.print(n + " ");
        }
    }
}
