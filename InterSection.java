import java.util.ArrayList;
public class InterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[]= {1,2,2,1};
		int nums2[]= {2,2};
		
	ArrayList<Integer> newArr = new ArrayList<Integer>();
	        
	        for(int i=0;i<nums1.length-1;i++)
	        {
	            int low=0,high=nums2.length-1,mid;
	            if(low<=high)
	            {
	                mid=(low+high)/2;
	                if(nums2[mid] == nums1[i])
	                {
	                    newArr.add(nums1[i]);
	                }
	                else if(nums2[mid]>nums1[i])
	                {
	                    high=mid-1;
	                }
	                else{
	                    low=mid+1;
	                }
	            }
	           
	        }
	       Object x[]=newArr.toArray();
	       int y[]=new int[x.length];
	       for(int i=0;i<x.length-1;i++)
	       {
	    	   y[i]=(int) x[i];
	    	   System.out.println(y[i]);
	       }
	        
	        
	        

	}

}
