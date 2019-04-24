// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzamx, zzakk

final class zzakn
	implements zzamx
{

	zzakn(zzakk zzakk1, Context context, String s)
	{
		val$context = context;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #14  <Field Context val$context>
		zzcrv = s;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #16  <Field String zzcrv>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void zzcz(String s)
	{
		zzbv.zzek();
	//    0    0:invokestatic    #28  <Method zzakk zzbv.zzek()>
	//    1    3:pop             
		zzakk.zzd(val$context, zzcrv, s);
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field Context val$context>
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field String zzcrv>
	//    6   12:aload_1         
	//    7   13:invokestatic    #34  <Method void zzakk.zzd(Context, String, String)>
	//    8   16:return          
	}

	private final Context val$context;
	private final String zzcrv;
}
