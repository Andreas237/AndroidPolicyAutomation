// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml;

import com.itextpdf.text.xml.simpleparser.SimpleXMLDocHandler;
import com.itextpdf.text.xml.simpleparser.SimpleXMLParser;
import java.io.*;
import java.util.Map;

public class XmlToTxt
	implements SimpleXMLDocHandler
{

	protected XmlToTxt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		buf = new StringBuffer();
	//    2    4:aload_0         
	//    3    5:new             #14  <Class StringBuffer>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void StringBuffer()>
	//    6   12:putfield        #17  <Field StringBuffer buf>
	//    7   15:return          
	}

	public static String parse(InputStream inputstream)
		throws IOException
	{
		XmlToTxt xmltotxt = new XmlToTxt();
	//    0    0:new             #2   <Class XmlToTxt>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void XmlToTxt()>
	//    3    7:astore_1        
		SimpleXMLParser.parse(((SimpleXMLDocHandler) (xmltotxt)), ((com.itextpdf.text.xml.simpleparser.SimpleXMLDocHandlerComment) (null)), ((java.io.Reader) (new InputStreamReader(inputstream))), true);
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:new             #25  <Class InputStreamReader>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #28  <Method void InputStreamReader(InputStream)>
	//   10   18:iconst_1        
	//   11   19:invokestatic    #33  <Method void SimpleXMLParser.parse(SimpleXMLDocHandler, com.itextpdf.text.xml.simpleparser.SimpleXMLDocHandlerComment, java.io.Reader, boolean)>
		return xmltotxt.toString();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #37  <Method String toString()>
	//   14   26:areturn         
	}

	public void endDocument()
	{
	//    0    0:return          
	}

	public void endElement(String s)
	{
	//    0    0:return          
	}

	public void startDocument()
	{
	//    0    0:return          
	}

	public void startElement(String s, Map map)
	{
	//    0    0:return          
	}

	public void text(String s)
	{
		buf.append(s);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field StringBuffer buf>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #51  <Method StringBuffer StringBuffer.append(String)>
	//    4    8:pop             
	//    5    9:return          
	}

	public String toString()
	{
		return buf.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field StringBuffer buf>
	//    2    4:invokevirtual   #52  <Method String StringBuffer.toString()>
	//    3    7:areturn         
	}

	protected StringBuffer buf;
}
