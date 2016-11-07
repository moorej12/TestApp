package com.example.james.testapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TestClass test;

    /**
     * This is a standard function for android that is called by the android operating system when
     * someone starts your app. Use it to set up things up.
     *
     * @param savedInstanceState This is used if you need to change orientation for the display
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (TextView) findViewById(R.id.textView1);
        text2 = (TextView) findViewById(R.id.textView2);
        text3 = (TextView) findViewById(R.id.textView3);
        test = new TestClass();
    }

    /**
     * This is a standard function for android tha tis called by the android operating system just
     * before things a put onto the screen. Use this to do setup that should happen every time this
     * screen comes into view.
     */
    @Override
    public void onResume() {
        String result1, result2, result3;

        try {
            // All we want is for them to return the static string "Hello World!". Whatever they
            // do, display it in the app.
            result1 = test.function1();
            if (result1.equals("Hello World!")) {
                text1.setText("Your function #1 returned the String: '" + result1 + "'");
                text1.setTextColor(0x00ff00);
            } else {
                text1.setText("Your function #1 returned the String: '" + result1 + "'. It should have said 'Hello World!'");
                text1.setTextColor(0xff0000);
            }
        } catch (Exception e) {
            e.printStackTrace();
            text1.setText("Your function #1 gave the error: "+e.getMessage());
            text1.setTextColor(0xff0000);
        }

        // Set up for the second test. Choose one of 2 strings so that they can't just return a
        // static string from function2 to get a correct answer.
        String test2Text;
        double rand = Math.random();
        if(rand < 0.5) {
            test2Text = "Mars Bar";
        } else {
            test2Text = "Crunchie";
        }

        try {
            // The first function we call should be setting a member variable of test. Then
            // function2 should be returning that same value so that they know they can access
            // member variables. Whatever the result, display in on the screen.
            test.setMemberString(test2Text);
            result2 = test.function2();
            if (result2.equals(test2Text)) {
                text2.setText("Your function #2 returned the String: '" + result2 + "'");
                text2.setTextColor(0x00ff00);
            } else {
                text2.setText("Your function #2 returned the String: '" + result2
                        + "'. It should have said '"+test2Text+"'");
                text2.setTextColor(0xff0000);
            }
        } catch (Exception e) {
            e.printStackTrace();
            text2.setText("Your function #2 gave the error: "+e.getMessage());
            text2.setTextColor(0xff0000);
        }

        // Set up for third test. This function stores the result of a random choice so that
        // the string we get here is the same as the string they will be getting in function3
        String expected = test.chooseString();

        try {
            // We want them to return the same string as we got from chooseString. Whatever the
            // result, display it on the screen.
            result3 = test.function3();
            if (result3.equals(expected)) {
                text3.setText("Your function #3 returned the String: '" + result3 + "'");
                text3.setTextColor(0x00ff00);
            } else {
                text3.setText("Your function #3 returned the String: '" + result3
                        + "'. It should have said '"+expected+"'");
                text3.setTextColor(0xff0000);
            }
        } catch (Exception e) {
            e.printStackTrace();
            text3.setText("Your function #3 gave the error: "+e.getMessage());
            text3.setTextColor(0xff0000);
        }
    }
}
