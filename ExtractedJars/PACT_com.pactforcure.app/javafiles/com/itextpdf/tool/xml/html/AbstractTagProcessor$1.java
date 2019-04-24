// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import java.util.HashSet;

// Referenced classes of package com.itextpdf.tool.xml.html:
//			AbstractTagProcessor

class AbstractTagProcessor$1 extends HashSet
{

	final AbstractTagProcessor this$0;

	AbstractTagProcessor$1()
	{
		this$0 = AbstractTagProcessor.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field AbstractTagProcessor this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void HashSet()>
		add("p");
	//    5    9:aload_0         
	//    6   10:ldc1            #18  <String "p">
	//    7   12:invokevirtual   #22  <Method boolean add(Object)>
	//    8   15:pop             
		add("span");
	//    9   16:aload_0         
	//   10   17:ldc1            #24  <String "span">
	//   11   19:invokevirtual   #22  <Method boolean add(Object)>
	//   12   22:pop             
	//   13   23:return          
	}
}
