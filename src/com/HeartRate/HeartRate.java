package com.HeartRate;

public class HeartRate {

        private String firstName;
        private String lastName;
        private int dateOfBirth;
        private int day;
        private int month;
        private int year;

        public HeartRate(String firstName, String lastName, int dateOfBirth, int day, int month, int year) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.dateOfBirth = dateOfBirth;
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(int dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
        public int Age(){
            int age=2020-this.year;
            return age;

        }
        public double MaxHeartRate(){

            double range=Age()-220;
            return range;

        }
        public double TargetHeartRate(){

            int range=(50/100)-(80/100);
            double target=range*MaxHeartRate();
            return target;



        }
    }

