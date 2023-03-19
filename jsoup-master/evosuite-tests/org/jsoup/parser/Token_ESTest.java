/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 02:20:52 GMT 2023
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.Token;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Token_ESTest extends Token_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      boolean boolean0 = token_EOF0.isEOF();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      boolean boolean0 = token_StartTag0.isEOF();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Token.Character token_Character0 = new Token.Character();
      boolean boolean0 = token_Character0.isCharacter();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      boolean boolean0 = token_Doctype0.isCharacter();
      assertFalse(token_Doctype0.isForceQuirks());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Token.Comment token_Comment0 = new Token.Comment();
      boolean boolean0 = token_Comment0.isComment();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      boolean boolean0 = token_EndTag0.isComment();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      boolean boolean0 = token_EndTag0.isEndTag();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      boolean boolean0 = token_StartTag0.isEndTag();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      Token.EOF token_EOF1 = (Token.EOF)token_EOF0.reset();
      Token.TokenType token_TokenType0 = Token.TokenType.Comment;
      token_EOF1.type = token_TokenType0;
      Token.TokenType token_TokenType1 = Token.TokenType.StartTag;
      token_EOF1.type = token_TokenType1;
      boolean boolean0 = token_EOF1.isStartTag();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      boolean boolean0 = token_EndTag0.isStartTag();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      boolean boolean0 = token_StartTag0.isDoctype();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.appendAttributeName('A');
      token_StartTag0.newAttribute();
      // Undeclared exception!
      try { 
        token_StartTag0.toString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be false
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      // Undeclared exception!
      try { 
        token_StartTag0.toString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be false
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.appendAttributeValue("");
      // Undeclared exception!
      try { 
        token_StartTag0.appendAttributeValue((char[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      int[] intArray0 = new int[4];
      token_EndTag0.appendAttributeValue(intArray0);
      assertArrayEquals(new int[] {0, 0, 0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.appendAttributeValue(')');
      token_EndTag0.appendAttributeValue("nowrap");
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.appendAttributeName(' ');
      token_EndTag0.appendAttributeName(')');
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.tagName = ":FCZRn>+1(2h+";
      token_StartTag0.appendTagName("org.jsoup.nodes.Document");
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.tagName = ":FCZRn>+1(2h+";
      String string0 = token_StartTag0.name();
      assertEquals(":FCZRn>+1(2h+", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.finaliseTag();
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.appendAttributeName('+');
      char[] charArray0 = new char[0];
      token_EndTag0.appendAttributeValue(charArray0);
      token_EndTag0.finaliseTag();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.appendAttributeName("");
      token_EndTag0.newAttribute();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.newAttribute();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Token.reset((StringBuilder) null);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      boolean boolean0 = token_Doctype0.isForceQuirks();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.getPublicIdentifier();
      assertFalse(token_Doctype0.isForceQuirks());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.getPubSysKey();
      assertFalse(token_Doctype0.isForceQuirks());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.reset();
      assertFalse(token_Doctype0.isForceQuirks());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.getName();
      assertFalse(token_Doctype0.isForceQuirks());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Token.Doctype token_Doctype0 = new Token.Doctype();
      token_Doctype0.getSystemIdentifier();
      assertFalse(token_Doctype0.isForceQuirks());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Token.Character token_Character0 = new Token.Character();
      String string0 = token_Character0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Token.CData token_CData0 = new Token.CData("1_");
      Token token0 = token_CData0.reset();
      assertSame(token0, token_CData0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Token.CData token_CData0 = new Token.CData("1_");
      String string0 = token_CData0.toString();
      assertEquals("<![CDATA[1_]]>", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Token.Comment token_Comment0 = new Token.Comment();
      Token token0 = token_Comment0.reset();
      assertSame(token_Comment0, token0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Token.Comment token_Comment0 = new Token.Comment();
      String string0 = token_Comment0.toString();
      assertEquals("<!---->", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      boolean boolean0 = token_StartTag0.isSelfClosing();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      token_EndTag0.setEmptyAttributeValue();
      token_EndTag0.appendAttributeName('M');
      token_EndTag0.finaliseTag();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.appendTagName(':');
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      token_StartTag0.appendAttributeValue('n');
      token_StartTag0.appendAttributeName(':');
      token_StartTag0.newAttribute();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      Token.StartTag token_StartTag1 = (Token.StartTag)token_StartTag0.name("");
      // Undeclared exception!
      try { 
        token_StartTag1.name();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be false
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      String string0 = token_StartTag0.normalName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      Attributes attributes0 = token_EndTag0.getAttributes();
      assertNull(attributes0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Token.Comment token_Comment0 = new Token.Comment();
      Token.Comment token_Comment1 = token_Comment0.asComment();
      assertSame(token_Comment1, token_Comment0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Token.Comment token_Comment0 = new Token.Comment();
      // Undeclared exception!
      try { 
        token_Comment0.asDoctype();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$Comment cannot be cast to org.jsoup.parser.Token$Doctype
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      // Undeclared exception!
      try { 
        token_EOF0.asStartTag();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$EOF cannot be cast to org.jsoup.parser.Token$StartTag
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Token.CData token_CData0 = new Token.CData("selected");
      Token.Character token_Character0 = token_CData0.asCharacter();
      assertSame(token_CData0, token_Character0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      // Undeclared exception!
      try { 
        token_EOF0.asEndTag();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.parser.Token$EOF cannot be cast to org.jsoup.parser.Token$EndTag
         //
         verifyException("org.jsoup.parser.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Token.CData token_CData0 = new Token.CData("1_");
      String string0 = token_CData0.tokenType();
      assertEquals("CData", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Token.CData token_CData0 = new Token.CData("1_");
      boolean boolean0 = token_CData0.isCData();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Token.EOF token_EOF0 = new Token.EOF();
      Token token0 = token_EOF0.reset();
      Token.TokenType token_TokenType0 = Token.TokenType.Comment;
      token0.type = token_TokenType0;
      Token.TokenType token_TokenType1 = Token.TokenType.Doctype;
      token0.type = token_TokenType1;
      boolean boolean0 = token_EOF0.isDoctype();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      Token.Tag token_Tag0 = token_StartTag0.reset();
      assertSame(token_Tag0, token_StartTag0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Token.StartTag token_StartTag0 = new Token.StartTag();
      Token.StartTag token_StartTag1 = token_StartTag0.nameAttr("CData", (Attributes) null);
      String string0 = token_StartTag1.toString();
      assertEquals("<CData>", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Token.EndTag token_EndTag0 = new Token.EndTag();
      // Undeclared exception!
      try { 
        token_EndTag0.toString();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be false
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}