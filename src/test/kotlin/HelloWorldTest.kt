package com.github.gotardo.o365.Test;

import com.github.gotardo.o365.*;
import org.junit.Assert
import org.junit.Test

class HelloWorldTest {
    @Test
    fun test() { 
        var sut = HelloWorld()
        Assert.assertTrue(sut.hey())
    }
}
