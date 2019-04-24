// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.xmp;

import com.itextpdf.text.xml.XMLUtil;
import java.util.Enumeration;
import java.util.Properties;

public class LangAlt extends Properties
{

	public LangAlt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Properties()>
	//    2    4:return          
	}

	public LangAlt(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Properties()>
		addLanguage("x-default", s);
	//    2    4:aload_0         
	//    3    5:ldc1            #9   <String "x-default">
	//    4    7:aload_1         
	//    5    8:invokevirtual   #23  <Method void addLanguage(String, String)>
	//    6   11:return          
	}

	public void addLanguage(String s, String s1)
	{
		setProperty(s, XMLUtil.escapeXML(s1, false));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #29  <Method String XMLUtil.escapeXML(String, boolean)>
	//    5    7:invokevirtual   #33  <Method Object setProperty(String, String)>
	//    6   10:pop             
	//    7   11:return          
	}

	protected void process(StringBuffer stringbuffer, Object obj)
	{
		stringbuffer.append("<rdf:li xml:lang=\"");
	//    0    0:aload_1         
	//    1    1:ldc1            #37  <String "<rdf:li xml:lang=\"">
	//    2    3:invokevirtual   #43  <Method StringBuffer StringBuffer.append(String)>
	//    3    6:pop             
		stringbuffer.append(obj);
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:invokevirtual   #46  <Method StringBuffer StringBuffer.append(Object)>
	//    7   12:pop             
		stringbuffer.append("\" >");
	//    8   13:aload_1         
	//    9   14:ldc1            #48  <String "\" >">
	//   10   16:invokevirtual   #43  <Method StringBuffer StringBuffer.append(String)>
	//   11   19:pop             
		stringbuffer.append(get(obj));
	//   12   20:aload_1         
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #52  <Method Object get(Object)>
	//   16   26:invokevirtual   #46  <Method StringBuffer StringBuffer.append(Object)>
	//   17   29:pop             
		stringbuffer.append("</rdf:li>");
	//   18   30:aload_1         
	//   19   31:ldc1            #54  <String "</rdf:li>">
	//   20   33:invokevirtual   #43  <Method StringBuffer StringBuffer.append(String)>
	//   21   36:pop             
	//   22   37:return          
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #39  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #57  <Method void StringBuffer()>
	//    3    7:astore_1        
		stringbuffer.append("<rdf:Alt>");
	//    4    8:aload_1         
	//    5    9:ldc1            #59  <String "<rdf:Alt>">
	//    6   11:invokevirtual   #43  <Method StringBuffer StringBuffer.append(String)>
	//    7   14:pop             
		for(Enumeration enumeration = propertyNames(); enumeration.hasMoreElements(); process(stringbuffer, enumeration.nextElement()));
	//    8   15:aload_0         
	//    9   16:invokevirtual   #63  <Method Enumeration propertyNames()>
	//   10   19:astore_2        
	//   11   20:aload_2         
	//   12   21:invokeinterface #69  <Method boolean Enumeration.hasMoreElements()>
	//   13   26:ifeq            43
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:aload_2         
	//   17   32:invokeinterface #73  <Method Object Enumeration.nextElement()>
	//   18   37:invokevirtual   #75  <Method void process(StringBuffer, Object)>
	//*  19   40:goto            20
		stringbuffer.append("</rdf:Alt>");
	//   20   43:aload_1         
	//   21   44:ldc1            #77  <String "</rdf:Alt>">
	//   22   46:invokevirtual   #43  <Method StringBuffer StringBuffer.append(String)>
	//   23   49:pop             
		return stringbuffer.toString();
	//   24   50:aload_1         
	//   25   51:invokevirtual   #79  <Method String StringBuffer.toString()>
	//   26   54:areturn         
	}

	public static final String DEFAULT = "x-default";
	private static final long serialVersionUID = 0x7e20955bL;
}
