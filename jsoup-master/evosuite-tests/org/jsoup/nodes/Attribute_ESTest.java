/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 02:04:54 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Attribute_ESTest extends Attribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Attribute attribute0 = new Attribute("I<~B{3M", (String) null);
      attribute0.hashCode();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("muted", "x^T@Q");
      attribute0.hashCode();
      assertEquals("muted", attribute0.getKey());
      assertEquals("x^T@Q", attribute0.getValue());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Attribute attribute0 = new Attribute("I<~Bi{3M", (String) null);
      Attribute attribute1 = attribute0.clone();
      boolean boolean0 = attribute0.equals(attribute1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Attribute attribute0 = new Attribute("I<~B{3M", (String) null);
      Attribute attribute1 = new Attribute("I<~B{3M", "I<~B{3M");
      boolean boolean0 = attribute0.equals(attribute1);
      //  // Unstable assertion: assertFalse(boolean0);
      //  // Unstable assertion: assertTrue(attribute1.equals((Object)attribute0));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("VWkZ964k!r*[f", "VWkZ964k!r*[f", attributes0);
      Attribute attribute1 = attribute0.clone();
      boolean boolean0 = attribute0.equals(attribute1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = Attribute.createFromEncoded("muted", "x^T@Q");
      boolean boolean0 = attribute0.equals(attributes0);
      assertEquals("muted", attribute0.getKey());
      assertFalse(boolean0);
      assertEquals("x^T@Q", attribute0.getValue());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("VWkZ964k!r*[f", "VWkZ964k!r*[f", attributes0);
      boolean boolean0 = attribute0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = Attribute.createFromEncoded("muted", "x^T@Q");
      Attribute attribute1 = new Attribute("0O", " />", attributes0);
      boolean boolean0 = attribute1.equals(attribute0);
      assertFalse(boolean0);
      assertEquals("x^T@Q", attribute0.getValue());
      assertEquals("muted", attribute0.getKey());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Attribute attribute0 = new Attribute("8$2gA gt@O~CGk ;g", (String) null);
      boolean boolean0 = attribute0.isBooleanAttribute();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("VWkZ964k!r*[f", "VWkZ964k!r*[f", attributes0);
      boolean boolean0 = attribute0.isBooleanAttribute();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Attribute attribute0 = Attribute.createFromEncoded("muted", "x^T@Q");
      boolean boolean0 = attribute0.isBooleanAttribute();
      assertEquals("x^T@Q", attribute0.getValue());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Attribute attribute0 = new Attribute("open", "open");
      String string0 = attribute0.toString();
      assertEquals("open", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.put("VWkZ964k!r*[f", "no0a");
      String string0 = attributes0.toString();
      assertEquals(" VWkZ964k!r*[f=\"no0a\"", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      boolean boolean0 = Attribute.shouldCollapseAttribute("", "", document_OutputSettings0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(3289);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      Attribute.html(" 5X(y8:M`<[OM%k", "0O", (Appendable) charBuffer0, document_OutputSettings1);
      assertEquals(3269, charBuffer0.length());
      assertEquals(20, charBuffer0.position());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = Attribute.isDataAttribute("data-");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = Attribute.isDataAttribute("data-h1=\"rHjx+AcZissWQw\nP\"");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("V", "V", attributes0);
      String string0 = attribute0.setValue((String) null);
      assertNotNull(string0);
      
      String string1 = attribute0.toString();
      assertEquals("V", string1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Attribute attribute0 = new Attribute("dMbpcQ7>CQ)a5h.c,E.", "dMbpcQ7>CQ)a5h.c,E.");
      Attributes attributes0 = new Attributes();
      attributes0.put(attribute0);
      attribute0.setValue("disabled");
      assertEquals("disabled", attribute0.getValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Attribute attribute0 = new Attribute("open", "open");
      attribute0.setKey("open");
      assertEquals("open", attribute0.getValue());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Attribute attribute0 = new Attribute("dMbpcQ7>CQ)a5h.c,E.", "dMbpcQ7>CQ)a5h.c,E.");
      // Undeclared exception!
      try { 
        attribute0.shouldCollapseAttribute((Document.OutputSettings) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Attribute", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Attribute attribute0 = new Attribute("dMbpcQ7>CQ)a5h.c,E.", "dMbpcQ7>CQ)a5h.c,E.");
      Attribute attribute1 = attribute0.clone();
      Attributes attributes0 = new Attributes();
      attribute1.parent = attributes0;
      attribute1.setKey("{zljOE");
      assertEquals("{zljOE", attribute1.getKey());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Attribute attribute0 = new Attribute(">C&B/7f4i*Uh`", ">C&B/7f4i*Uh`");
      boolean boolean0 = attribute0.isDataAttribute();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Attribute attribute0 = new Attribute("dMbpcQ7>CQ)a5h.c,E.", "dMbpcQ7>CQ)a5h.c,E.");
      Attributes attributes0 = new Attributes();
      attributes0.put(attribute0);
      attribute0.setKey("{zljOE");
      assertEquals("{zljOE", attribute0.getKey());
  }
}
