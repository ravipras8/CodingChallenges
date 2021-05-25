package Test;

import java.util.stream.IntStream;

public class Knapsack {
    public static void main(String[] args) {
        int val[] = {60,100,120}; //{10,15,40}; //{60,100,120};
        int weight[] = {10,20,30};// {1,2,3}; //{10,20,30};
        int w = 50; 
        knapsack(val, weight, w);
        
    }

    public static void knapsack(int val[],int weight[], int w){
        int tempvalSum = 0, tempweightSum =0, valSum = 0, weightSum =0;
        for (int i = 0; i < weight.length; i++) {
            tempvalSum = val[i];
            tempweightSum = weight[i];
            for (int j = i+1; j < weight.length; j++) {
                if(w < tempweightSum + weight[j]) break;
                    tempvalSum += val[j];
                    tempweightSum += weight[j];
            }
            if(w <= tempweightSum && weightSum < tempweightSum){
                weightSum = tempweightSum;
                valSum = tempvalSum;
            }
        }
        System.out.println(valSum);
    }
}