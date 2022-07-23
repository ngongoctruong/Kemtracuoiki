import java.util.*;

public class Find_All_Duplicates_in_an_Array_442 {

public static List<Integer> findDuplicates(int[] nums) {
    List<Integer> resultSet = new ArrayList<>();
    Map<Integer,Integer> map = new HashMap<>();

    for(int i = 0; i< nums.length; i++){
        if(map.get(nums[i])==null){
            map.put(nums[i], 1);
        }else {
            map.put(nums[i], map.get(nums[i])+1);
        }

    }
    System.out.println(map);
    for (int key: map.keySet()) {
        if(map.get(key)==2){
            resultSet.add(key);
        }
    }
    return resultSet;
}

    public static void main(String[] args) {
        int [] a = {1,2,3,4,3,1,2,3};
        System.out.println(findDuplicates(a));
    }
}
