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
// this takes in an array and returns the duplicates. it gives you the length of the array and then returns the length.
//it has a complexity of O(n) and a memory complexity of O(1)
public class Duplicates {
    public static int removeDups( int[] arr){
        int j = 0;// keeps count for when remove
        for(int i = 0; i < arr.length; i++){
            if(i+1 == arr.length || arr[i] != arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args){
        int [] sophi3 = {2, 5, 5, 5, 10, 12, 12};
        System.out.println(removeDups(sophi3));
        System.out.println(Arrays.toString(sophi3));
    }
}
