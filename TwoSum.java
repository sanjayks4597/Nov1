package common_questions;

import java.util.ArrayList;

public class TwoSum {

	public static int[] twoSum(int[] nums, int target) {
        int []val=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                   {
                       val[0]=i;
                        val[1]=j;
                   }
            }
        }
        return val;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {4,7,6,9,2,3};
		int target=8;
		ArrayList Al=new ArrayList();
		int val[]=twoSum(x,target);
		
		for(int y:val)
		{
			Al.add(y);
		}
		System.out.println(Al);
		

	}

}
