// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzre;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzex

final class zzez
	implements Runnable
{

	zzez(zzex zzex1, zzre zzre)
	{
		zzbez = zzex1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzex zzbez>
		zzbfa = zzre;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field zzre zzbfa>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		zzbez.zzb(zzbfa);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzex zzbez>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field zzre zzbfa>
	//    4    8:invokevirtual   #27  <Method boolean zzex.zzb(zzre)>
	//    5   11:pop             
	//    6   12:return          
	}

	private final zzex zzbez;
	private final zzre zzbfa;
}
