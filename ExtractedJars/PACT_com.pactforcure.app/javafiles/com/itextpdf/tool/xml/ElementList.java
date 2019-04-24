// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml;

import com.itextpdf.tool.xml.pipeline.WritableElement;
import java.util.ArrayList;

// Referenced classes of package com.itextpdf.tool.xml:
//			ElementHandler, Writable

public class ElementList extends ArrayList
	implements ElementHandler
{

	public ElementList()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ArrayList()>
	//    2    4:return          
	}

	public void add(Writable writable)
	{
		if(writable instanceof WritableElement)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #20  <Class WritableElement>
	//*   2    4:ifeq            19
			addAll(((java.util.Collection) (((WritableElement)writable).elements())));
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:checkcast       #20  <Class WritableElement>
	//    6   12:invokevirtual   #24  <Method java.util.List WritableElement.elements()>
	//    7   15:invokevirtual   #28  <Method boolean addAll(java.util.Collection)>
	//    8   18:pop             
	//    9   19:return          
	}

	private static final long serialVersionUID = 0x4395a747L;
}
