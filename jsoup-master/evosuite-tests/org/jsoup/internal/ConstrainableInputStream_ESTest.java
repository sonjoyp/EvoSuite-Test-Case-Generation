/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 02:08:33 GMT 2023
 */

package org.jsoup.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.internal.ConstrainableInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ConstrainableInputStream_ESTest extends ConstrainableInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      System.setCurrentTimeMillis((-2258L));
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(pushbackInputStream0, 2530, 2530);
      constrainableInputStream0.timeout(1282L, 1282L);
      byte[] byteArray0 = new byte[5];
      try { 
        constrainableInputStream0.read(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.PushbackInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Enumeration<ConstrainableInputStream> enumeration0 = (Enumeration<ConstrainableInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(sequenceInputStream0, 1, 2147483644);
      ByteBuffer byteBuffer0 = constrainableInputStream0.readToByteBuffer(2147483644);
      assertEquals(0, byteBuffer0.limit());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(2530);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(pipedInputStream0, 2530, 2530);
      try { 
        constrainableInputStream0.readToByteBuffer(0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Enumeration<ConstrainableInputStream> enumeration0 = (Enumeration<ConstrainableInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0, 1);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(pushbackInputStream0, 1, 1);
      ByteBuffer byteBuffer0 = constrainableInputStream0.readToByteBuffer(1);
      assertEquals(0, byteBuffer0.arrayOffset());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(pipedInputStream0, 552, 552);
      // Undeclared exception!
      try { 
        constrainableInputStream0.readToByteBuffer((-2764));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxSize must be 0 (unlimited) or larger
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap((InputStream) null, 3373, 3373);
      ConstrainableInputStream constrainableInputStream1 = ConstrainableInputStream.wrap(constrainableInputStream0, 4058, 2275);
      assertSame(constrainableInputStream0, constrainableInputStream1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(byteArrayInputStream0, (byte)54, 0);
      // Undeclared exception!
      try { 
        constrainableInputStream0.read(byteArray0, 4715, (int) (byte) (-80));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-1), 0);
      // Undeclared exception!
      try { 
        ConstrainableInputStream.wrap(byteArrayInputStream0, 3283, (-2233));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-108), (-1));
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap(byteArrayInputStream0, 1815, 1815);
      try { 
        constrainableInputStream0.reset();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Resetting to invalid mark
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      ConstrainableInputStream constrainableInputStream0 = ConstrainableInputStream.wrap((InputStream) null, 1313, 1313);
      ConstrainableInputStream constrainableInputStream1 = constrainableInputStream0.timeout((-1273L), 574L);
      try { 
        constrainableInputStream1.read((byte[]) null, 1552, 0);
        fail("Expecting exception: SocketTimeoutException");
      
      } catch(SocketTimeoutException e) {
         //
         // Read timeout
         //
         verifyException("org.jsoup.internal.ConstrainableInputStream", e);
      }
  }
}
