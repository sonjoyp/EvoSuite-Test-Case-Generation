/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 02:08:40 GMT 2023
 */

package org.jsoup.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.internal.Normalizer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Normalizer_ESTest extends Normalizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = Normalizer.lowerCase("]");
      assertEquals("]", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Normalizer normalizer0 = new Normalizer();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = Normalizer.normalize((String) null);
      assertEquals("", string0);
  }
}
