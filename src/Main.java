import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] nums = {5, 1, 3, 4, 7};
        ArrayAlgorithms.shiftLeftModify(nums);

        // original array IS modified
        System.out.println(Arrays.toString(nums));
    }
}
