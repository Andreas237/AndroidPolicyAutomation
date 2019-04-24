// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.xmp;

import com.itextpdf.text.xml.XMLUtil;
import java.util.ArrayList;
import java.util.Iterator;

public class XmpArray extends ArrayList
{

	public XmpArray(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void ArrayList()>
		type = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field String type>
	//    5    9:return          
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer("<");
	//    0    0:new             #33  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:ldc1            #35  <String "<">
	//    3    6:invokespecial   #37  <Method void StringBuffer(String)>
	//    4    9:astore_1        
		stringbuffer.append(type);
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:getfield        #28  <Field String type>
	//    8   15:invokevirtual   #41  <Method StringBuffer StringBuffer.append(String)>
	//    9   18:pop             
		stringbuffer.append('>');
	//   10   19:aload_1         
	//   11   20:bipush          62
	//   12   22:invokevirtual   #44  <Method StringBuffer StringBuffer.append(char)>
	//   13   25:pop             
		for(Iterator iterator = iterator(); iterator.hasNext(); stringbuffer.append("</rdf:li>"))
	//*  14   26:aload_0         
	//*  15   27:invokevirtual   #48  <Method Iterator iterator()>
	//*  16   30:astore_2        
	//*  17   31:aload_2         
	//*  18   32:invokeinterface #54  <Method boolean Iterator.hasNext()>
	//*  19   37:ifeq            77
		{
			String s = (String)iterator.next();
	//   20   40:aload_2         
	//   21   41:invokeinterface #58  <Method Object Iterator.next()>
	//   22   46:checkcast       #60  <Class String>
	//   23   49:astore_3        
			stringbuffer.append("<rdf:li>");
	//   24   50:aload_1         
	//   25   51:ldc1            #62  <String "<rdf:li>">
	//   26   53:invokevirtual   #41  <Method StringBuffer StringBuffer.append(String)>
	//   27   56:pop             
			stringbuffer.append(XMLUtil.escapeXML(s, false));
	//   28   57:aload_1         
	//   29   58:aload_3         
	//   30   59:iconst_0        
	//   31   60:invokestatic    #68  <Method String XMLUtil.escapeXML(String, boolean)>
	//   32   63:invokevirtual   #41  <Method StringBuffer StringBuffer.append(String)>
	//   33   66:pop             
		}

	//   34   67:aload_1         
	//   35   68:ldc1            #70  <String "</rdf:li>">
	//   36   70:invokevirtual   #41  <Method StringBuffer StringBuffer.append(String)>
	//   37   73:pop             
	//*  38   74:goto            31
		stringbuffer.append("</");
	//   39   77:aload_1         
	//   40   78:ldc1            #72  <String "</">
	//   41   80:invokevirtual   #41  <Method StringBuffer StringBuffer.append(String)>
	//   42   83:pop             
		stringbuffer.append(type);
	//   43   84:aload_1         
	//   44   85:aload_0         
	//   45   86:getfield        #28  <Field String type>
	//   46   89:invokevirtual   #41  <Method StringBuffer StringBuffer.append(String)>
	//   47   92:pop             
		stringbuffer.append('>');
	//   48   93:aload_1         
	//   49   94:bipush          62
	//   50   96:invokevirtual   #44  <Method StringBuffer StringBuffer.append(char)>
	//   51   99:pop             
		return stringbuffer.toString();
	//   52  100:aload_1         
	//   53  101:invokevirtual   #74  <Method String StringBuffer.toString()>
	//   54  104:areturn         
	}

	public static final String ALTERNATIVE = "rdf:Alt";
	public static final String ORDERED = "rdf:Seq";
	public static final String UNORDERED = "rdf:Bag";
	private static final long serialVersionUID = 0x7127f846L;
	protected String type;
}
