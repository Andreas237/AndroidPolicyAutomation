// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzagd, zzaki

public final class zzagc
{

	public zzagc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		zzckj = new WeakHashMap();
	//    2    4:aload_0         
	//    3    5:new             #14  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #15  <Method void WeakHashMap()>
	//    6   12:putfield        #17  <Field WeakHashMap zzckj>
	//    7   15:return          
	}

	static WeakHashMap zza(zzagc zzagc1)
	{
		return zzagc1.zzckj;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field WeakHashMap zzckj>
	//    2    4:areturn         
	}

	public final Future zzq(Context context)
	{
		return ((Future) (zzaki.zza(((java.util.concurrent.Callable) (new zzagd(this, context))))));
	//    0    0:new             #24  <Class zzagd>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #27  <Method void zzagd(zzagc, Context)>
	//    5    9:invokestatic    #32  <Method zzanz zzaki.zza(java.util.concurrent.Callable)>
	//    6   12:areturn         
	}

	private WeakHashMap zzckj;
}
