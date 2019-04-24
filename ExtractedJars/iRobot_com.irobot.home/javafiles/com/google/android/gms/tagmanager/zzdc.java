// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.util.LruCache;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzs, zzdb

final class zzdc extends LruCache
{

	zzdc(zzdb zzdb, int i, zzs zzs1)
	{
		zzbdm = zzs1;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:putfield        #11  <Field zzs zzbdm>
		super(i);
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:invokespecial   #14  <Method void LruCache(int)>
	//    6   10:return          
	}

	protected final int sizeOf(Object obj, Object obj1)
	{
		return zzbdm.sizeOf(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #11  <Field zzs zzbdm>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #21  <Method int zzs.sizeOf(Object, Object)>
	//    5   11:ireturn         
	}

	private final zzs zzbdm;
}
