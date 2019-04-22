// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.elements;

import java.util.ArrayList;

// Referenced classes of package com.facebook.stetho.inspector.elements:
//			AttributeAccumulator, Document

public static final class Document$AttributeListAccumulator extends ArrayList
	implements AttributeAccumulator
{

	public void store(String s, String s1)
	{
		add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #21  <Method boolean add(Object)>
	//    3    5:pop             
		add(((Object) (s1)));
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #21  <Method boolean add(Object)>
	//    7   11:pop             
	//    8   12:return          
	}

	public Document$AttributeListAccumulator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ArrayList()>
	//    2    4:return          
	}
}
