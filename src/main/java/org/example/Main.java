package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    ArrayList<Integer> arrayList = new ArrayList<>();

    public int getMinimumDifference(TreeNode root) {
        //if (root == null) return 0;
        collectVals(root);
        Collections.sort(arrayList);
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < arrayList.size(); i++) {
            int temp = arrayList.get(i) - arrayList.get(i-1);
            if (temp < min) min = temp;
        }
        return min;
    }

    public void collectVals(TreeNode root) {
        if (root == null) return;
        arrayList.add(root.val);
        collectVals(root.left);
        collectVals(root.right);
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}