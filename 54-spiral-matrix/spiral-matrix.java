class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList();
        int n=matrix.length;//No. of rows
        int m=matrix[0].length;// No. of columns
        int top=0,left=0,right=m-1,bottom=n-1;

        //Loop until all elements are not traversed
        while(top<=bottom && left<=right){
            // For moving left to right
            for(int i=left; i<=right; i++)
                ans.add(matrix[top][i]);
            top++;

            //For moving top to bottom
            for(int i=top; i<=bottom; i++)
                ans.add(matrix[i][right]);
            right--;

            //For moving right to left
            if(top<=bottom){
                for(int i=right; i>=left;i--)
                    ans.add(matrix[bottom][i]);
                bottom--;
            }

            //For moving bottom to top
            if(left<=right){
                for(int i=bottom; i>=top; i--)
                    ans.add(matrix[i][left]);
                left++;
            }     
            
        }
        return ans;

        
    }
}