package org.example;

public class VeryComplexService {
    // private BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
    private SortAlgorithm sort;
    public VeryComplexService(SortAlgorithm sortAlgorithm){
        this.sort = sortAlgorithm;
    }
    public void complexBusiness(int[] arr){
        // bubbleSortAlgorithm.sort(arr);
        sort.sort(arr);
    }
}
