// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.gson.internal;

import java.util.Comparator;

// Referenced classes of package com.google.gson.internal:
//			LinkedTreeMap

static final class LinkedTreeMap$1
	implements Comparator
{

	public int compare(Comparable comparable, Comparable comparable1)
	{
		return comparable.compareTo(((Object) (comparable1)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #22  <Method int Comparable.compareTo(Object)>
	//    3    7:ireturn         
	}

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((Comparable)obj, (Comparable)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class Comparable>
	//    3    5:aload_2         
	//    4    6:checkcast       #18  <Class Comparable>
	//    5    9:invokevirtual   #25  <Method int compare(Comparable, Comparable)>
	//    6   12:ireturn         
	}

	LinkedTreeMap$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
