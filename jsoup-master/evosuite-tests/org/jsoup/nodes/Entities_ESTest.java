/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 01:52:34 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.CharArrayWriter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Entities_ESTest extends Entities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Entities.CoreCharset.byName("(}`Y!U\"xYT[w|5v");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Entities.CoreCharset.byName("US-ASCII");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("(? ;'\"@;L9b<");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.CoreCharset entities_CoreCharset0 = Entities.CoreCharset.ascii;
      Entities.escape((Appendable) mockPrintWriter0, "(? ;'\"@;L9b<", document_OutputSettings0, true, true, true);
      document_OutputSettings0.coreCharset = entities_CoreCharset0;
      Entities.escape((Appendable) mockPrintWriter0, "PIVj>8CEq_4.Wv;", document_OutputSettings0, true, true, true);
      assertTrue(document_OutputSettings0.prettyPrint());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("(? ;'\"@;L9b<");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      document_OutputSettings0.escapeMode(entities_EscapeMode0);
      Entities.escape((Appendable) mockPrintWriter0, "(? ;'\"@;L9b<", document_OutputSettings0, true, true, true);
      assertFalse(document_OutputSettings0.outline());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = Entities.escape("0<j+ULu");
      assertEquals("0&lt;j+ULu", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      String string0 = Entities.escape("k6I>n7&tt", document_OutputSettings0);
      assertEquals("k6I&gt;n7&amp;tt", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(" ;'\";L9b<");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) mockPrintWriter0, " ;'\";L9b<", document_OutputSettings0, true, true, true);
      assertEquals(1, document_OutputSettings0.indentAmount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) charArrayWriter0, "UTF-                 ", document_OutputSettings0, true, true, false);
      assertEquals(5, charArrayWriter0.size());
      assertEquals("UTF- ", charArrayWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      StringWriter stringWriter0 = new StringWriter();
      Entities.escape((Appendable) stringWriter0, "[E?Mk-\"", document_OutputSettings0, false, true, false);
      assertEquals("[E?Mk-\"", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape("[E?Mk-\"", document_OutputSettings0);
      StringWriter stringWriter0 = new StringWriter();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.indentAmount(46);
      Entities.CoreCharset entities_CoreCharset0 = Entities.CoreCharset.fallback;
      document_OutputSettings1.coreCharset = entities_CoreCharset0;
      Entities.escape((Appendable) stringWriter0, "[E?Mk-\"", document_OutputSettings1, false, true, false);
      assertEquals("[E?Mk-\"", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      int[] intArray0 = new int[0];
      int int0 = Entities.codepointsForName("", intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = Entities.getByName("Rcaron");
      assertNotNull(string0);
      assertEquals("\u0158", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = Entities.getByName("(? ;'\"@;L9b<");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = Entities.isBaseNamedEntity("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = Entities.isNamedEntity("lt");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = Entities.isNamedEntity("\u00A0");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.extended;
      String string0 = entities_EscapeMode0.nameForCodepoint(711);
      assertEquals("caron", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      String string0 = entities_EscapeMode0.nameForCodepoint(62);
      assertEquals("gt", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.extended;
      String string0 = entities_EscapeMode0.nameForCodepoint(342);
      assertEquals("Rcedil", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.base;
      String string0 = entities_EscapeMode0.nameForCodepoint(0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String string0 = Entities.escape((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String string0 = Entities.unescape("&quot;");
      assertEquals("\"", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Character character0 = Entities.getCharacterByName("amp=12;1&gt=1q;3&lt=1o;2&quot=y;0&");
      assertEquals('\uFFFF', (char)character0);
  }
}
