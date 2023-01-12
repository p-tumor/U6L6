import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] nums = {5, 1, 3, 4, 7};
        int[] shiftedLeftArr = ArrayAlgorithms.shiftLeft(nums);
        System.out.println(Arrays.toString(shiftedLeftArr));

        // original array NOT modified
        System.out.println(Arrays.toString(nums));
    }
}
