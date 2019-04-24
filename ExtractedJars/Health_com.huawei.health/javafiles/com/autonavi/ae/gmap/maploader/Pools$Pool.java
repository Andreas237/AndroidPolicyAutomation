// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.maploader;


// Referenced classes of package com.autonavi.ae.gmap.maploader:
//			Pools

public static interface Pools$Pool
{

	public abstract Object acquire();

	public abstract void destory();

	public abstract boolean release(Object obj);
}
