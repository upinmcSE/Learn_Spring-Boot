package org.example;

public class Main {
    public static void main(String[] args) {
        // VeryComplexService v1 = new VeryComplexService();
        int[] arr = {1,2,3,4};
        // v1.complexBusiness(arr);

        SortAlgorithm quick = new QuickSortAlgorithm();
        SortAlgorithm bubble = new BubbleSortAlgorithm();

        VeryComplexService v2 = new VeryComplexService(quick);
        v2.complexBusiness(arr);

        VeryComplexService v3 = new VeryComplexService(bubble);
        v3.complexBusiness(arr);


    }
}
