package Subsequence;

import java.util.*;

public class Subset2WithoutRepetation {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,1};
        Arrays.sort(arr);

        List<List<Integer>> res = new ArrayList<>();
        UniqueSubset(0, res, new ArrayList<>(), arr);

        for(List<Integer> i : res) {
            System.out.println(i);
        }
    }

    private static void UniqueSubset(int ind, List<List<Integer>> res, List<Integer> list, int[] arr) {
        
        res.add(new ArrayList<>(list));

        for(int i = ind; i < arr.length; i++) {
            if(i > ind && arr[i] == arr[i - 1]) continue;
            list.add(arr[i]);
            UniqueSubset(i + 1, res, list, arr);
            list.remove(list.size() - 1);
        }
    }
}
