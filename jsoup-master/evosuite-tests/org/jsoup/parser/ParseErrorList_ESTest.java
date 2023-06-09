/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 02:20:02 GMT 2023
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.ParseErrorList;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParseErrorList_ESTest extends ParseErrorList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(2751);
      boolean boolean0 = parseErrorList0.canAddError();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(2751);
      int int0 = parseErrorList0.getMaxSize();
      assertEquals(2751, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      boolean boolean0 = parseErrorList0.canAddError();
      assertFalse(boolean0);
  }
}
