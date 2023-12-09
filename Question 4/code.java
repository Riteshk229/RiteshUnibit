import java.util.*;

class unibitQuestion4 {
    public static int[][] pairs(int [] array, int target){
        int [][] pairs = new int[array.length - 1][2];
        int index = 0;
        
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] + array[j] == target){
                    pairs[index][0] = array[i];
                    pairs[index][1] = array[j];
                    index++;
                    break;
                }
            }
        }
        
        return Arrays.copyOf(pairs,index);
    }
    
    public static int[] mergedArray(int[][] array){
        int mergedLength = array[1].length*array.length;
        
        int mergedArray[] = new int[mergedLength];
        int index = 0;
        
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j <array[0].length; j++){
                mergedArray[index] = array[i][j];
                index++;
            }
        }
        Arrays.sort(mergedArray);
        return mergedArray;
    }
    
    public static List<List<Integer>> findDoublePairs(int []arr, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        findDoublePairs(arr,target,0,0, new ArrayList<>(),result);
        
        return result;
    }
    
    public static void findDoublePairs(int []arr, int target, int index,int sum,List<Integer> current, List<List<Integer>> result){
        if(sum == target){
            result.add(new ArrayList<>(current));
            return;
        }
        
        if(index >= arr.length || sum > target){
            return;
        }
        
        for(int i = index; i < arr.length; i++){
            current.add(arr[i]);
            findDoublePairs(arr,target,i + 1,sum + arr[i] ,current,result);
            current.remove(current.size() -1);
        }
    }
    
    public static void main(String[] args) {
        int array [] = {1,3,2,2,-4,-6,-2,8};
        int  target = 4;
        
        int [][]pairs = pairs(array,target);
        
        System.out.println(" First combination For " + target + " : " + Arrays.deepToString(pairs));
        
        int [] mergedArray = mergedArray(pairs);
        System.out.println("Merged Array : " + Arrays.toString(mergedArray));
        
        target = target*2;
        
        List<List<Integer>> answer = findDoublePairs(array,target);
        System.out.println("Second combination for "  + target + " : " +  answer);
        
    }
}
