// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.xmp;

import com.itextpdf.text.xml.XMLUtil;
import java.util.Enumeration;
import java.util.Properties;

// Referenced classes of package com.itextpdf.text.xml.xmp:
//			LangAlt, XmpArray

public abstract class XmpSchema extends Properties
{

	public XmpSchema(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Properties()>
		xmlns = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String xmlns>
	//    5    9:return          
	}

	public static String escape(String s)
	{
		return XMLUtil.escapeXML(s, false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #27  <Method String XMLUtil.escapeXML(String, boolean)>
	//    3    5:areturn         
	}

	public Object addProperty(String s, String s1)
	{
		return setProperty(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #32  <Method Object setProperty(String, String)>
	//    4    6:areturn         
	}

	public String getXmlns()
	{
		return xmlns;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String xmlns>
	//    2    4:areturn         
	}

	protected void process(StringBuffer stringbuffer, Object obj)
	{
		stringbuffer.append('<');
	//    0    0:aload_1         
	//    1    1:bipush          60
	//    2    3:invokevirtual   #42  <Method StringBuffer StringBuffer.append(char)>
	//    3    6:pop             
		stringbuffer.append(obj);
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:invokevirtual   #45  <Method StringBuffer StringBuffer.append(Object)>
	//    7   12:pop             
		stringbuffer.append('>');
	//    8   13:aload_1         
	//    9   14:bipush          62
	//   10   16:invokevirtual   #42  <Method StringBuffer StringBuffer.append(char)>
	//   11   19:pop             
		stringbuffer.append(get(obj));
	//   12   20:aload_1         
	//   13   21:aload_0         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #49  <Method Object get(Object)>
	//   16   26:invokevirtual   #45  <Method StringBuffer StringBuffer.append(Object)>
	//   17   29:pop             
		stringbuffer.append("</");
	//   18   30:aload_1         
	//   19   31:ldc1            #51  <String "</">
	//   20   33:invokevirtual   #54  <Method StringBuffer StringBuffer.append(String)>
	//   21   36:pop             
		stringbuffer.append(obj);
	//   22   37:aload_1         
	//   23   38:aload_2         
	//   24   39:invokevirtual   #45  <Method StringBuffer StringBuffer.append(Object)>
	//   25   42:pop             
		stringbuffer.append('>');
	//   26   43:aload_1         
	//   27   44:bipush          62
	//   28   46:invokevirtual   #42  <Method StringBuffer StringBuffer.append(char)>
	//   29   49:pop             
	//   30   50:return          
	}

	public Object setProperty(String s, LangAlt langalt)
	{
		return super.setProperty(s, langalt.toString());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #60  <Method String LangAlt.toString()>
	//    4    6:invokespecial   #61  <Method Object Properties.setProperty(String, String)>
	//    5    9:areturn         
	}

	public Object setProperty(String s, XmpArray xmparray)
	{
		return super.setProperty(s, xmparray.toString());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #65  <Method String XmpArray.toString()>
	//    4    6:invokespecial   #61  <Method Object Properties.setProperty(String, String)>
	//    5    9:areturn         
	}

	public Object setProperty(String s, String s1)
	{
		return super.setProperty(s, XMLUtil.escapeXML(s1, false));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #27  <Method String XMLUtil.escapeXML(String, boolean)>
	//    5    7:invokespecial   #61  <Method Object Properties.setProperty(String, String)>
	//    6   10:areturn         
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #38  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void StringBuffer()>
	//    3    7:astore_1        
		for(Enumeration enumeration = propertyNames(); enumeration.hasMoreElements(); process(stringbuffer, enumeration.nextElement()));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #70  <Method Enumeration propertyNames()>
	//    6   12:astore_2        
	//    7   13:aload_2         
	//    8   14:invokeinterface #76  <Method boolean Enumeration.hasMoreElements()>
	//    9   19:ifeq            36
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokeinterface #80  <Method Object Enumeration.nextElement()>
	//   14   30:invokevirtual   #82  <Method void process(StringBuffer, Object)>
	//*  15   33:goto            13
		return stringbuffer.toString();
	//   16   36:aload_1         
	//   17   37:invokevirtual   #83  <Method String StringBuffer.toString()>
	//   18   40:areturn         
	}

	private static final long serialVersionUID = 0x26741888L;
	protected String xmlns;
}
