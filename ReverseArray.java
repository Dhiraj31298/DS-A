package com.dhiraj.dsa.array;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;

        reverse(arr, n);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    static void reverse(int[] arr, int n) {

        int low =0,high=n-1;
        for (int i=0;i<n;i++){
            while (low<high){
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;
                low++;
                high--;
            }
        }
    }
}
