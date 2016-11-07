package com.example.james.testapp;

import android.util.Log;

/**
 * This is a simple class to encapsulate some of the functions that will be used to test your
 * knowledge. All your code should go in this class where the comments indicate.
 *
 * Created by James on 2016-11-06.
 */

public class TestClass {

    private String memberString;
    private int choiceCode;

    /**
     * This function is to test your understanding of how to store information in variables;
     *
     * @return Should return the exact string "Hello World!"
     */
    public String function1() {
        String returnThis;

        /* Put your code for function1 between this and the next comment.
         * Your code here should set returnThis to the string "Hello World!", and that will be
         * returned at the end of the function.
         *
         * Beginning of your code
         */

        /* End of your Code */

        return returnThis;
    }

    /**
     * This function and function2 work together to show how to use member variables to remember
     * information from one function and use it in another function.
     * This function shows how to store information in a member variable
     *
     * @param inputString This is the string that you should store in memberString
     */
    public void setMemberString(String inputString) {
        /*
         * This function is used to set up function 2. Your should store the parameter passed to
         * this function in the member variable called memberString. This will be needed so that
         * function2 knows what to return. You can put your code anywhere in this function
         */
    }

    /**
     * This function and setMemberString work together to show how to use member variables to
     * remember information from one function and use it in another function.
     * This function shows how to use a member variable.
     *
     * @return The value currently stored in memberString
     */
    public String function2() {
        Log.d("Test function2", "memberString is currently set to: "+memberString);
        /*
         * This function should return the value stored in memberString by the function
         * setMemberString. Put your code after this comment in this function.
         */
    }

    /**
     * This function shows you how to use functions from within the same class.
     *
     * @return The output of the function chooseString
     */
    public String function3() {
        String returnThis;

        /*
         * In this function you should call chooseString and store the value it returns in the
         * local variable returnThis, which is then returned at the end of the function.
         * Put your code between this and the next comment.
         * Begin you code here
         */

        /* End you code before this line */

        return returnThis;
    }

    /**
     * A simple function that randomly chooses one of three strings to return, but remembers it's
     * choice so that the choice can be accessed later. It is intended to be called once by the
     * activity so the activity knows if function3 is returning the correct result. Then the
     * student should call this function in function3
     *
     * @return A random one of three strings (Elephant, Giraffe, or Rhino)
     */
    public String chooseString() {
        // if the code is 0 then it hasn't been set yet, so we set it here
        if(choiceCode == 0) {
            choiceCode = (int) ((Math.random()*3)+1);
        }

        // Depending on what the code is, return one of three Strings;
        switch (choiceCode) {
            case 1:
                return "Elephant";
            case 2:
                return "Giraffe";
            case 3:
                return "Rhino";
            default:
                return "Error";
        }
    }

}
