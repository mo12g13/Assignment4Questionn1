package com.Momo;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Double> cedarrunTime = new ArrayList<>();
        ArrayList<Double> harrietrunTime = new ArrayList<>();
        ArrayList<Double> comoRunTime = new ArrayList<>();
        ArrayList<Double> otherRunTime = new ArrayList<>();


        String lake;
        String time;



        boolean bool = true;
        Double min = 89.0;
        String othersLakes =null;

        do {
            System.out.println("Enter the lake name");
            lake = input.nextLine();

            System.out.println("How many minutes did you run: ");
            time = input.nextLine();
            if (lake.equals("") || time.equals(""))
                break;
            double runTime = Double.parseDouble(time);

            if (lake.equalsIgnoreCase("Cedar")) {
                cedarrunTime.add(runTime);

            } else if (lake.equalsIgnoreCase("Harriet")) {
                harrietrunTime.add(runTime);

            } else if (lake.equalsIgnoreCase("Como")) {
                comoRunTime.add(runTime);
            } else {
                otherRunTime.add(runTime);
                othersLakes = lake;

            }


        } while (true);


        double harriet = fastedRun(lake,harrietrunTime);
        double cedar = fastedRun(lake, cedarrunTime);
        double como = fastedRun(lake, comoRunTime);
        double others = fastedRun(lake, otherRunTime);

        System.out.println("Harriet fasted run: "+ harriet);
        System.out.println("Como fasted run: "+ como);
        System.out.println("Cedar fasted run: "+ cedar);
        System.out.println(othersLakes + " fasted run: "+ others);


    }

    public static double fastedRun (String lake, ArrayList<Double> NewArray){
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
