package com.testing.example;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;

/**
 * Created by Administrator on 8/24/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class MockUnitTestSample {

    private static final String FAKE_STRING = "HELLO WORLD";
    @Mock
    Context mMockContext;

    @Test
    public void readStringFromContext_LocalizedString() {
        // Given a mocked Context injected into the object under test...
        when(mMockContext.getString(R.string.hello_word))
                .thenReturn(FAKE_STRING);
        ClassUnderTest myObjectUnderTest = new ClassUnderTest(mMockContext);

        // ...when the string is returned from the object under test...
        String _str = myObjectUnderTest.GetString();
//        Log.d(":::::", _str);
        String result = myObjectUnderTest.GetString();

        // ...then the result should be the expected one.
        assertThat(result, is(FAKE_STRING));
    }
}
