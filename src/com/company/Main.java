package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " +
                    result);
    }

    public static int binarySearch(int array[], int low, int high, int value){
        if (high>=low)
        {
            //int mid = low + (high - low)/2;
            int mid = (low + high)/2;

            // If the element is present at the  
            // middle itself 
            if (array[mid] == value)
                return mid;

            // If element is smaller than mid, then  
            // it can only be present in left subarray 
            if (array[mid] > value)
                return binarySearch(array, low, high-1, value);

            // Else the element can only be present 
            // in right subarray 
            return binarySearch(array, low+1, high, value);
        }

        // We reach here when element is not present 
        //  in array 
        return -1;
    }
}
