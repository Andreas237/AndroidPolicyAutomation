// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.util.pool;

import java.util.List;

// Referenced classes of package com.bumptech.glide.util.pool:
//			FactoryPools

class FactoryPools$3
	implements setter
{

	public volatile void reset(Object obj)
	{
		reset((List)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #22  <Class List>
	//    3    5:invokevirtual   #25  <Method void reset(List)>
	//    4    8:return          
	}

	public void reset(List list)
	{
		list.clear();
	//    0    0:aload_1         
	//    1    1:invokeinterface #29  <Method void List.clear()>
	//    2    6:return          
	}

	FactoryPools$3()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
