// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import com.startapp.common.a.g;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;
import org.xml.sax.InputSource;

public class p
{

	public static String a(Node node)
	{
		try
		{
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
	//    0    0:invokestatic    #22  <Method TransformerFactory TransformerFactory.newInstance()>
	//    1    3:invokevirtual   #26  <Method Transformer TransformerFactory.newTransformer()>
	//    2    6:astore_1        
			transformer.setOutputProperty("omit-xml-declaration", "yes");
	//    3    7:aload_1         
	//    4    8:ldc1            #28  <String "omit-xml-declaration">
	//    5   10:ldc1            #30  <String "yes">
	//    6   12:invokevirtual   #36  <Method void Transformer.setOutputProperty(String, String)>
			transformer.setOutputProperty("method", "xml");
	//    7   15:aload_1         
	//    8   16:ldc1            #38  <String "method">
	//    9   18:ldc1            #40  <String "xml">
	//   10   20:invokevirtual   #36  <Method void Transformer.setOutputProperty(String, String)>
			transformer.setOutputProperty("indent", "no");
	//   11   23:aload_1         
	//   12   24:ldc1            #42  <String "indent">
	//   13   26:ldc1            #44  <String "no">
	//   14   28:invokevirtual   #36  <Method void Transformer.setOutputProperty(String, String)>
			transformer.setOutputProperty("encoding", "UTF-8");
	//   15   31:aload_1         
	//   16   32:ldc1            #46  <String "encoding">
	//   17   34:ldc1            #48  <String "UTF-8">
	//   18   36:invokevirtual   #36  <Method void Transformer.setOutputProperty(String, String)>
			StringWriter stringwriter = new StringWriter();
	//   19   39:new             #50  <Class StringWriter>
	//   20   42:dup             
	//   21   43:invokespecial   #53  <Method void StringWriter()>
	//   22   46:astore_2        
			transformer.transform(((javax.xml.transform.Source) (new DOMSource(node))), ((javax.xml.transform.Result) (new StreamResult(((java.io.Writer) (stringwriter))))));
	//   23   47:aload_1         
	//   24   48:new             #55  <Class DOMSource>
	//   25   51:dup             
	//   26   52:aload_0         
	//   27   53:invokespecial   #58  <Method void DOMSource(Node)>
	//   28   56:new             #60  <Class StreamResult>
	//   29   59:dup             
	//   30   60:aload_2         
	//   31   61:invokespecial   #63  <Method void StreamResult(java.io.Writer)>
	//   32   64:invokevirtual   #67  <Method void Transformer.transform(javax.xml.transform.Source, javax.xml.transform.Result)>
			node = ((Node) (stringwriter.toString()));
	//   33   67:aload_2         
	//   34   68:invokevirtual   #71  <Method String StringWriter.toString()>
	//   35   71:astore_0        
		}
	//*  36   72:aload_0         
	//*  37   73:areturn         
		// Misplaced declaration of an exception variable
		catch(Node node)
	//*  38   74:astore_0        
		{
			g.a(a, 6, "xmlDocumentToString", ((Throwable) (node)));
	//   39   75:getstatic       #12  <Field String a>
	//   40   78:bipush          6
	//   41   80:ldc1            #73  <String "xmlDocumentToString">
	//   42   82:aload_0         
	//   43   83:invokestatic    #78  <Method void g.a(String, int, String, Throwable)>
			return null;
	//   44   86:aconst_null     
	//   45   87:areturn         
		}
		return ((String) (node));
	}

	public static Document a(String s)
	{
		try
		{
			Object obj = ((Object) (DocumentBuilderFactory.newInstance()));
	//    0    0:invokestatic    #84  <Method DocumentBuilderFactory DocumentBuilderFactory.newInstance()>
	//    1    3:astore_1        
			((DocumentBuilderFactory) (obj)).setIgnoringElementContentWhitespace(true);
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #88  <Method void DocumentBuilderFactory.setIgnoringElementContentWhitespace(boolean)>
			((DocumentBuilderFactory) (obj)).setIgnoringComments(true);
	//    5    9:aload_1         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #91  <Method void DocumentBuilderFactory.setIgnoringComments(boolean)>
			obj = ((Object) (((DocumentBuilderFactory) (obj)).newDocumentBuilder()));
	//    8   14:aload_1         
	//    9   15:invokevirtual   #95  <Method DocumentBuilder DocumentBuilderFactory.newDocumentBuilder()>
	//   10   18:astore_1        
			InputSource inputsource = new InputSource();
	//   11   19:new             #97  <Class InputSource>
	//   12   22:dup             
	//   13   23:invokespecial   #98  <Method void InputSource()>
	//   14   26:astore_2        
			inputsource.setCharacterStream(((java.io.Reader) (new StringReader(s))));
	//   15   27:aload_2         
	//   16   28:new             #100 <Class StringReader>
	//   17   31:dup             
	//   18   32:aload_0         
	//   19   33:invokespecial   #103 <Method void StringReader(String)>
	//   20   36:invokevirtual   #107 <Method void InputSource.setCharacterStream(java.io.Reader)>
			s = ((String) (((DocumentBuilder) (obj)).parse(inputsource)));
	//   21   39:aload_1         
	//   22   40:aload_2         
	//   23   41:invokevirtual   #113 <Method Document DocumentBuilder.parse(InputSource)>
	//   24   44:astore_0        
		}
	//*  25   45:aload_0         
	//*  26   46:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  27   47:astore_0        
		{
			g.a(a, 6, "stringToDocument", ((Throwable) (s)));
	//   28   48:getstatic       #12  <Field String a>
	//   29   51:bipush          6
	//   30   53:ldc1            #115 <String "stringToDocument">
	//   31   55:aload_0         
	//   32   56:invokestatic    #78  <Method void g.a(String, int, String, Throwable)>
			return null;
	//   33   59:aconst_null     
	//   34   60:areturn         
		}
		return ((Document) (s));
	}

	public static String b(Node node)
	{
		Node node1;
label0:
		{
			NodeList nodelist = node.getChildNodes();
	//    0    0:aload_0         
	//    1    1:invokeinterface #122 <Method NodeList Node.getChildNodes()>
	//    2    6:astore_3        
			node = null;
	//    3    7:aconst_null     
	//    4    8:astore_0        
			for(int i = 0; i < nodelist.getLength(); i++)
	//*   5    9:iconst_0        
	//*   6   10:istore_1        
	//*   7   11:iload_1         
	//*   8   12:aload_3         
	//*   9   13:invokeinterface #128 <Method int NodeList.getLength()>
	//*  10   18:icmpge          56
			{
				node = ((Node) (((CharacterData)nodelist.item(i)).getData().trim()));
	//   11   21:aload_3         
	//   12   22:iload_1         
	//   13   23:invokeinterface #132 <Method Node NodeList.item(int)>
	//   14   28:checkcast       #134 <Class CharacterData>
	//   15   31:invokeinterface #137 <Method String CharacterData.getData()>
	//   16   36:invokevirtual   #142 <Method String String.trim()>
	//   17   39:astore_0        
				node1 = node;
	//   18   40:aload_0         
	//   19   41:astore_2        
				if(((String) (node)).length() != 0)
					break label0;
	//   20   42:aload_0         
	//   21   43:invokevirtual   #145 <Method int String.length()>
	//   22   46:ifne            58
			}

	//   23   49:iload_1         
	//   24   50:iconst_1        
	//   25   51:iadd            
	//   26   52:istore_1        
	//*  27   53:goto            11
			node1 = node;
	//   28   56:aload_0         
	//   29   57:astore_2        
		}
		return ((String) (node1));
	//   30   58:aload_2         
	//   31   59:areturn         
	}

	private static String a = "XmlTools";

	static 
	{
	//    0    0:ldc1            #10  <String "XmlTools">
	//    1    2:putstatic       #12  <Field String a>
	//*   2    5:return          
	}
}
