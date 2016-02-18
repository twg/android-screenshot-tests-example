package com.snapshots.twg.snapshots3;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */

@RunWith(AndroidJUnit4.class)
public class ApplicationTest {

    @Test
    public void matches() {
        assertTrue(1 == 1);
    }

    @Test
    public void fails() {
        assertTrue(1 == 4);
    }
}