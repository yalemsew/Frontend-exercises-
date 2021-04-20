package edx;

public class bubbleSort {

	    public static void main(String[]args){
	        int[]intArray={65,78,97,36,41};
	        for(int unsortedLastIndex=intArray.length-1;unsortedLastIndex>0;unsortedLastIndex--){

	            for(int i=0;i<unsortedLastIndex;i++){
	                if(intArray[i]>intArray[i+1]){
	                    swap(intArray,i,i+1);

	                }
	            }

	        }
	        for(int j=0;j<intArray.length;j++)
	                System.out.println(intArray[j]);
	    }


	    public static void swap(int intArray[],int i,int j){
	        if(i==j){
	            return;
	        }
	        int temp=intArray[i];
	        intArray[i]=intArray[j];
	        intArray[j]=temp;
	    }
	}

	

