package com.Momo;

import java.util.ArrayList;

/**
 * Created by Sheveil Johnson on 2/28/2016.
 */
public class fastRun {
    public static double amy (String lake, ArrayList<Double> NewArray){
        Double HarrietMin = 90.00;
        Double fastRun=0.0;

        for(int i =0; i<NewArray.size(); i++){
            if(NewArray.get(i)< HarrietMin){
                HarrietMin= NewArray.get(i);
                fastRun = HarrietMin;
            }
        }


        return fastRun;
    }

}
