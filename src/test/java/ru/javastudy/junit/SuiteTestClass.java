package ru.javastudy.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by retinka on 13.01.2016.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({CalculatorTest.class, SecondClassTest.class} )
public class SuiteTestClass {

}
