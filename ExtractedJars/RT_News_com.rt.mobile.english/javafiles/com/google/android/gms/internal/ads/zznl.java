// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzkb, zzni

final class zznl
	implements Callable
{

	zznl(Context context)
	{
		val$context = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field Context val$context>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void Object()>
	//    5    9:return          
	}

	public final Object call()
		throws Exception
	{
		zzkb.zzik().initialize(val$context);
	//    0    0:invokestatic    #27  <Method zzni zzkb.zzik()>
	//    1    3:aload_0         
	//    2    4:getfield        #13  <Field Context val$context>
	//    3    7:invokevirtual   #32  <Method void zzni.initialize(Context)>
		return ((Object) (null));
	//    4   10:aconst_null     
	//    5   11:areturn         
	}

	private final Context val$context;
}
