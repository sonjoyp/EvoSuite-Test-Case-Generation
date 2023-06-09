/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 19 02:34:51 GMT 2023
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeTraversor_ESTest extends NodeTraversor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeFilter.FilterResult.STOP;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn(nodeFilter_FilterResult1).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Tag tag0 = Tag.valueOf("map", parseSettings0);
      Element element0 = new Element(tag0, "vWJ-<2'kQ4\b]?c");
      Elements elements0 = element0.parents();
      elements0.add(element0);
      NodeTraversor.filter(nodeFilter0, elements0);
      assertEquals(1, elements0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Document document0 = Document.createShell("");
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn(nodeFilter_FilterResult0).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      TextNode textNode0 = new TextNode("@D2<0u", "SKIP_CHILDREN");
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeTraversor.filter(nodeFilter0, (Node) textNode0);
      NodeFilter.FilterResult nodeFilter_FilterResult2 = NodeFilter.FilterResult.REMOVE;
      NodeFilter.FilterResult nodeFilter_FilterResult3 = NodeFilter.FilterResult.STOP;
      NodeFilter nodeFilter1 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0, nodeFilter_FilterResult0, nodeFilter_FilterResult2, nodeFilter_FilterResult1).when(nodeFilter1).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn(nodeFilter_FilterResult3).when(nodeFilter1).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      NodeFilter.FilterResult nodeFilter_FilterResult4 = NodeTraversor.filter(nodeFilter1, (Node) document0);
      assertEquals(NodeFilter.FilterResult.STOP, nodeFilter_FilterResult4);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeFilter.FilterResult.SKIP_CHILDREN;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0, (NodeFilter.FilterResult) null).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn((NodeFilter.FilterResult) null).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      Document document0 = new Document("org.jsoup.select.NodeTraversor");
      Document document1 = document0.normalise();
      NodeFilter.FilterResult nodeFilter_FilterResult2 = NodeTraversor.filter(nodeFilter0, (Node) document1);
      //  // Unstable assertion: assertEquals(1, document0.childNodeSize());
      //  // Unstable assertion: assertEquals(NodeFilter.FilterResult.SKIP_CHILDREN, nodeFilter_FilterResult2);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Document document0 = Document.createShell("org.jsoup.select.NodeTraversor");
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeFilter.FilterResult.REMOVE;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0, nodeFilter_FilterResult1, nodeFilter_FilterResult1, nodeFilter_FilterResult1, (NodeFilter.FilterResult) null).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn((NodeFilter.FilterResult) null).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      Elements elements0 = document0.getAllElements();
      NodeTraversor.filter(nodeFilter0, elements0);
      assertEquals(0, document0.childNodeSize());
      assertEquals(4, elements0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeTraversor.filter(nodeFilter0, (Node) null);
      assertEquals(NodeFilter.FilterResult.CONTINUE, nodeFilter_FilterResult0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Element element0 = new Element("<iL>{8_");
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.STOP;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeTraversor.filter(nodeFilter0, (Node) element0);
      assertEquals(NodeFilter.FilterResult.STOP, nodeFilter_FilterResult1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Document document0 = Document.createShell("");
      Elements elements0 = document0.children();
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      NodeTraversor.traverse(nodeVisitor0, elements0);
      assertFalse(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      NodeTraversor nodeTraversor0 = new NodeTraversor(nodeVisitor0);
      Document document0 = Document.createShell("org.jsoup.select.NodeTraversor");
      nodeTraversor0.traverse((Node) document0);
      assertFalse(document0.hasParent());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      NodeTraversor nodeTraversor0 = new NodeTraversor(nodeVisitor0);
      nodeTraversor0.traverse((Node) null);
  }
}
