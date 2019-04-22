// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.snapshot;

import java.util.Comparator;

// Referenced classes of package com.firebase.client.snapshot:
//			ChildrenNode, ChildKey

static final class ChildrenNode$1
	implements Comparator
{

	public int compare(ChildKey childkey, ChildKey childkey1)
	{
		return childkey.compareTo(childkey1);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #22  <Method int ChildKey.compareTo(ChildKey)>
	//    3    5:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((ChildKey)obj, (ChildKey)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class ChildKey>
	//    3    5:aload_2         
	//    4    6:checkcast       #18  <Class ChildKey>
	//    5    9:invokevirtual   #25  <Method int compare(ChildKey, ChildKey)>
	//    6   12:ireturn         
	}

	ChildrenNode$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
