// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import com.itextpdf.text.api.WriterOperation;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.itextpdf.text:
//			Element, ElementListener

public abstract class WritableDirectElement
	implements Element, WriterOperation
{

	public WritableDirectElement()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		directElementType = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field int directElementType>
	//    5    9:return          
	}

	public WritableDirectElement(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		directElementType = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field int directElementType>
		directElementType = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #20  <Field int directElementType>
	//    8   14:return          
	}

	public List getChunks()
	{
		return ((List) (new ArrayList(0)));
	//    0    0:new             #26  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #28  <Method void ArrayList(int)>
	//    4    8:areturn         
	}

	public int getDirectElementType()
	{
		return directElementType;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int directElementType>
	//    2    4:ireturn         
	}

	public boolean isContent()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isNestable()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #37  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean process(ElementListener elementlistener)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #37  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public int type()
	{
		return 666;
	//    0    0:sipush          666
	//    1    3:ireturn         
	}

	public static final int DIRECT_ELEMENT_TYPE_HEADER = 1;
	public static final int DIRECT_ELEMENT_TYPE_UNKNOWN = 0;
	protected int directElementType;
}
