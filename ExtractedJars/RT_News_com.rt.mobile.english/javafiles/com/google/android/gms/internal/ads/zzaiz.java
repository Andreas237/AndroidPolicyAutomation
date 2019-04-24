// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaiy

final class zzaiz
	implements Callable
{

	zzaiz(zzaiy zzaiy1, Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzcnx = zzaiy1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzaiy zzcnx>
		zzcny = context;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field Context zzcny>
	//    8   14:return          
	}

	public final Object call()
	{
		return ((Object) (zzcnx.zzad(zzcny)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaiy zzcnx>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Context zzcny>
	//    4    8:invokevirtual   #28  <Method String zzaiy.zzad(Context)>
	//    5   11:areturn         
	}

	private final zzaiy zzcnx;
	private final Context zzcny;
}
