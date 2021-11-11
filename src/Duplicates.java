/*
 * Duplicates.java
 *
 * Computer Science 112, Boston University
 * 
 * modified by:
 *   name: Zack Klappenbach, Sophie
 *   email: Zackklap@bu.edu
 */
import java.util.*;
public class Duplicates {
    public static int removeDups( int[] arr){
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(i+1 == arr.length || arr[i] != arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }
        int count= 1;
        for(int k = 1; k < arr.length; k++){
            if(arr[k] != 0)
                count++;
            else
                break;
        }
        for(int l = j;l< arr.length;l++){
            arr[l]=0;
        }
        /**for(int i =0;i< temp.length; i++){
            arr[i] = temp[i];
        }
         **/
        return j;
    }
    public static void main(String[] args){
        int [] sophi3 = {2, 5, 5, 5, 10, 12, 12};
        System.out.println(removeDups(sophi3));
        System.out.println(Arrays.toString(sophi3));
    }
}
