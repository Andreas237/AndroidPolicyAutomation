// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;

import android.util.LruCache;

// Referenced classes of package com.mixpanel.android.b:
//			n

private static class n$b extends LruCache
{

	protected String a(Class class1)
	{
		return class1.getCanonicalName();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method String Class.getCanonicalName()>
	//    2    4:areturn         
	}

	protected Object create(Object obj)
	{
		return ((Object) (a((Class)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #17  <Class Class>
	//    3    5:invokevirtual   #27  <Method String a(Class)>
	//    4    8:areturn         
	}

	public n$b(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #12  <Method void LruCache(int)>
	//    3    5:return          
	}
}
