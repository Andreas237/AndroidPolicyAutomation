// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common;

import java.util.ArrayList;

// Referenced classes of package com.facebook.stetho.common:
//			Accumulator

public final class ArrayListAccumulator extends ArrayList
	implements Accumulator
{

	public ArrayListAccumulator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ArrayList()>
	//    2    4:return          
	}

	public void store(Object obj)
	{
		add(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #18  <Method boolean add(Object)>
	//    3    5:pop             
	//    4    6:return          
	}
}
