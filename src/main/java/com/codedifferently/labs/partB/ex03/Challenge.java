package com.codedifferently.labs.partB.ex03;

public class Challenge {
    public static String challenge(){
        String response = "";
        String [] names = new String[6];
        names[0]= "Kaleb";
        names[1]="Tariq";
        names[2] ="Gio";
        names[3] = "Sam";
        names[4] = "Steph";
        names [5] ="Michael";


        for (int i =0; i< names.length; i++){
            System.out.println(names[i]);

        }
        return response;
    }

    public static void main(String[] args) {

        String outputFromChallenge = challenge();
        System.out.println(outputFromChallenge);
    }
}
