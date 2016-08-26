package com.testing.example;

import android.content.Context;

/**
 * Created by Administrator on 8/24/2016.
 */
public class ClassUnderTest {
    private Context CONTEXT;

    public ClassUnderTest(Context context) {
        //Issue 3 Branch
        CONTEXT = context;
    }

    public String GetString() {
        return CONTEXT.getString(R.string.hello_word);
    }
}
