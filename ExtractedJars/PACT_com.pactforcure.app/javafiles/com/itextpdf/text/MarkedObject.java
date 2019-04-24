// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import java.util.List;
import java.util.Properties;

// Referenced classes of package com.itextpdf.text:
//			Element, DocumentException, ElementListener

public class MarkedObject
	implements Element
{

	protected MarkedObject()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		markupAttributes = new Properties();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class Properties>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void Properties()>
	//    6   12:putfield        #20  <Field Properties markupAttributes>
		element = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #22  <Field Element element>
	//   10   20:return          
	}

	public MarkedObject(Element element1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		markupAttributes = new Properties();
	//    2    4:aload_0         
	//    3    5:new             #17  <Class Properties>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void Properties()>
	//    6   12:putfield        #20  <Field Properties markupAttributes>
		element = element1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #22  <Field Element element>
	//   10   20:return          
	}

	public List getChunks()
	{
		return element.getChunks();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Element element>
	//    2    4:invokeinterface #28  <Method List Element.getChunks()>
	//    3    9:areturn         
	}

	public Properties getMarkupAttributes()
	{
		return markupAttributes;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Properties markupAttributes>
	//    2    4:areturn         
	}

	public boolean isContent()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isNestable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean process(ElementListener elementlistener)
	{
		boolean flag;
		try
		{
			flag = elementlistener.add(element);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field Element element>
	//    3    5:invokeinterface #45  <Method boolean ElementListener.add(Element)>
	//    4   10:istore_2        
		}
	//*   5   11:iload_2         
	//*   6   12:ireturn         
		// Misplaced declaration of an exception variable
		catch(ElementListener elementlistener)
	//*   7   13:astore_1        
		{
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		}
		return flag;
	}

	public void setMarkupAttribute(String s, String s1)
	{
		markupAttributes.setProperty(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Properties markupAttributes>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #51  <Method Object Properties.setProperty(String, String)>
	//    5    9:pop             
	//    6   10:return          
	}

	public int type()
	{
		return 50;
	//    0    0:bipush          50
	//    1    2:ireturn         
	}

	protected Element element;
	protected Properties markupAttributes;
}
