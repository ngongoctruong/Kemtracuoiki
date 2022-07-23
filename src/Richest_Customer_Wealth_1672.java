import java.util.ArrayList;

public class Richest_Customer_Wealth_1672 {
    public static int maximumWealth(int[][] accounts) {
        int a =0;
        int [] b = new int[accounts.length];

        for(int i=0;i< accounts.length;i++){
            for(int j=0;j<accounts[0].length;j++){
                 a += accounts[i][j];
            }
            b[i] =a;
            a=0;
        }

        int max =0;
        for(int i= 0;i<b.length;i++){
            if (max < b[i]){
                max = b[i];
            }
        }
        return max;
    }

}
