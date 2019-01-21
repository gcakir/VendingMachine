package example;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ConstructorTest.class, FillTest.class, InsertCoinTest.class, GetSoftDrinkTest.class })
public class TestAll {

}
