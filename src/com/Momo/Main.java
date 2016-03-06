package com.Momo;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Double> runtime = new ArrayList<>();
        HashMap<String, ArrayList<Double>> map = new HashMap<>();
        double runnningTime =0;
       String lake = null  ;

        boolean istrue = true;

        do {
            try {
                System.out.println("what lake did you run around today? ");
                 lake = input.nextLine();

                System.out.println("How many minutes did you run");
                String run =input.nextLine();
                if(lake.equalsIgnoreCase("") && run.equalsIgnoreCase("")){
                    break;
                }
                 runnningTime = Double.parseDouble(run);
                istrue = true;


            }catch (InputMismatchException e){
                input.nextLine();
                System.out.println("Please enter the right number");
                istrue = false;

            }
            map.put(lake, runtime);
            if (map.containsKey(lake)) {//adding the time if the lake is in the haspmap
                runtime.add(runnningTime);
            } else {
                runtime.add(runnningTime);//adding lake if the lake isn't in the hashmap
                map.put(lake, runtime);
            }
        }while (true);
        ArrayList<Double> name = new ArrayList<>();
        String valuekey =null;

        for(Map.Entry<String, ArrayList<Double>> key: map.entrySet()){
             valuekey = key.getKey();
            name = key.getValue();
            System.out.println(valuekey + " "+ name);
            double finalFasted = fastedRun(name);//getting the fasted value from the arraylist
            System.out.println(valuekey + " "+ finalFasted);


        }


       /* for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }*/

     }




    public static double fastedRun (ArrayList<Double> NewArray){
        Double min = 90.00;//A method that return the fasted time
        Double fastRun=0.0;

        for(int i =0; i<NewArray.size(); i++){
            if(NewArray.get(i)< min){
                min= NewArray.get(i);
                fastRun = min;
            }
        }


        return fastRun;
    }



}
