package com.testing.example;

import android.content.Context;

/**
 * Created by Administrator on 8/24/2016.
 */
public class ClassUnderTest {
    private Context CONTEXT;

    //Add in Development Branch 
    public ClassUnderTest(Context context) {
    //HOtFix3 Change
                //Issue 3 Branch Again
        CONTEXT = context;
    }

    public String GetString() {
        return CONTEXT.getString(R.string.hello_word);
    }
}
