import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] nums = {-6, -4, 0, -3, 1, -2, 5};
        boolean positive = ArrayAlgorithms.containsPositive(nums);
        System.out.println(positive);

        // original numbers list NOT modified
        System.out.println(Arrays.toString(nums));

        System.out.println("----");

        int[] nums2 = {-6, -4, 0, -3, -1, -2, -5};
        boolean positive2 = ArrayAlgorithms.containsPositive(nums2);
        System.out.println(positive2);

        // original numbers list NOT modified
        System.out.println(Arrays.toString(nums2));
    }
}
