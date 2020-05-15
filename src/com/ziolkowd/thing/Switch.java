package com.ziolkowd.thing;

public class Switch {

    public static void main(String[] args) {

        //Using this switch statement is the most preferred way when dealing with multiple
        // if else statements that can easily be split apart!
        int switchValue = 5;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("You can do this and it will execute all case 3,4,5");
                System.out.println("The actual value is:" + switchValue);
                break;

            default:
                System.out.println("Value Was not 1 or 2");
                break;
        }

        //Doing this is the same as the switch statement above, its just nicer to look at the switch when you
        // have multiple cases like this that your going to be dealing with!
        int normalValue = 1;
        if (normalValue == 1) {
            System.out.println("Value was 1");
        } else if (normalValue == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value Was not 1 or 2");
        }

        char thingVar = 'A';
        switch (thingVar) {
            case 'A':
                System.out.println("The value of A was found!");
                break;
            case 'B':
                System.out.println("The value of B was found!");
                break;
            case 'C':
                System.out.println("The value of C was found!");
                break;
            case 'D':
                System.out.println("The value of D was found!");
                break;
            case 'E':
                System.out.println("The value of E was found!");
                break;
            default:
                System.out.println("None of the specific values were found!");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "January":
                System.out.println("The current month is January");
                break;
            case "February":
                System.out.println("The current month is February");
                break;
            case "March":
                System.out.println("The current month is March");
                break;
            case "April":
                System.out.println("The current month is April");
                break;
            case "May":
                System.out.println("The current month is May");
                break;
            case "June":
                System.out.println("The current month is June");
                break;
            case "July":
                System.out.println("The current month is July");
                break;
            case "August":
                System.out.println("The current month is August");
                break;
            case "September":
                System.out.println("The current month is September");
                break;
            case "October":
                System.out.println("The current month is October");
                break;
            case "November":
                System.out.println("The current month is November");
                break;
            case "December":
                System.out.println("The current month is December");
                break;
            default:
                System.out.println("This is not a valid month!");
                break;
        }


    }


}
