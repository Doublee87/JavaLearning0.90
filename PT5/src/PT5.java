import java.awt.Color;
import java.util.*;
       

public class PT5 {
       

    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<Bird>();
        // put 1000 birds into the above ArrayList
        for(int i=1; i<=1000; i++){
            if(i%3==0){ // change the 3 to change the % of red birds
                birds.add(new Bird(Color.red, i));
            }else{
                birds.add(new Bird(Color.blue, i));
            }
        }

        // create an Aviary
        Aviary aviary = new Aviary(birds);

        // create an Experiment
        Experiment ex = new Experiment(aviary);

        // run the Experiment 1,000,000 times   
        ex.runExperimentManyTimes(1000000);

        // print out the contents of the results array of ints
        ex.printResults();

    }// end of main

}