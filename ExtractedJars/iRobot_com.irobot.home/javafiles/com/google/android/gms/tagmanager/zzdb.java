// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.util.LruCache;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzp, zzdc, zzs

final class zzdb
	implements zzp
{

	zzdb(int i, zzs zzs)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzbdl = ((LruCache) (new zzdc(this, 0x100000, zzs)));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class zzdc>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:ldc1            #21  <Int 0x100000>
	//    7   12:aload_2         
	//    8   13:invokespecial   #24  <Method void zzdc(zzdb, int, zzs)>
	//    9   16:putfield        #26  <Field LruCache zzbdl>
	//   10   19:return          
	}

	public final Object get(Object obj)
	{
		return zzbdl.get(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field LruCache zzbdl>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method Object LruCache.get(Object)>
	//    4    8:areturn         
	}

	public final void zza(Object obj, Object obj1)
	{
		zzbdl.put(obj, obj1);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field LruCache zzbdl>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #42  <Method Object LruCache.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	private LruCache zzbdl;
}
