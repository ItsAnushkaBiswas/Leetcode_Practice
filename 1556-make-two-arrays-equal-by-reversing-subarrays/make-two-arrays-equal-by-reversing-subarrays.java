class Solution {

    public boolean canBeEqual(int[] target, int[] arr) {
        // Sort the target array in-place
        Arrays.sort(target);
        // Sort the arr array in-place
        Arrays.sort(arr);
      
        // Check if the sorted arrays are equal
        // The equals method checks if the two arrays have the same elements in the same order
        return Arrays.equals(target, arr);
    }
 
}