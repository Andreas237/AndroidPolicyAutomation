// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.zzc;

// Referenced classes of package com.google.android.gms.internal:
//			zzaaj

class zzaaj$1
	implements Runnable
{

	public void run()
	{
		zzaaj.zzb(zzaAa).zzan(zzaaj.zza(zzaAa));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaaj zzaAa>
	//    2    4:invokestatic    #25  <Method zzc zzaaj.zzb(zzaaj)>
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field zzaaj zzaAa>
	//    5   11:invokestatic    #29  <Method android.content.Context zzaaj.zza(zzaaj)>
	//    6   14:invokevirtual   #35  <Method void zzc.zzan(android.content.Context)>
	//    7   17:return          
	}

	final zzaaj zzaAa;

	zzaaj$1(zzaaj zzaaj1)
	{
		zzaAa = zzaaj1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zzaaj zzaAa>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
