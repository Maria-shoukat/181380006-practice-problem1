package com.HeartRate;

public class Main {

    public static void main(String[] args) {HeartRate hr=new HeartRate("abc","xyz",12,02,1,2020);
        int age=hr.Age();
        System.out.println(age+"age");
        double maxhr=hr.MaxHeartRate();
        System.out.println(maxhr+ " Max HeartRate");
        double thr=hr.TargetHeartRate();
        System.out.println(thr+" Target HearRate");
    }
	// write your code here
    }

