// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//			zzapp

static class zzapp$zzb extends zzapf$zza
{

	public void zzp(Status status)
	{
		if(zzaVg != null && status.isSuccess())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field zzapp$zza zzaVg>
	//*   2    4:ifnull          23
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #35  <Method boolean Status.isSuccess()>
	//*   5   11:ifeq            23
			zzaVg.zzCJ();
	//    6   14:aload_0         
	//    7   15:getfield        #21  <Field zzapp$zza zzaVg>
	//    8   18:invokeinterface #40  <Method void zzapp$zza.zzCJ()>
		zzaGN.setResult(((Object) (status)));
	//    9   23:aload_0         
	//   10   24:getfield        #19  <Field zzaad$zzb zzaGN>
	//   11   27:aload_1         
	//   12   28:invokeinterface #46  <Method void zzaad$zzb.setResult(Object)>
	//   13   33:return          
	}

	private final zzaad$zzb zzaGN;
	private final zzapp$zza zzaVg;

	private zzapp$zzb(zzaad$zzb zzaad$zzb1, zzapp$zza zzapp$zza1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void zzapf$zza()>
		zzaGN = zzaad$zzb1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zzaad$zzb zzaGN>
		zzaVg = zzapp$zza1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field zzapp$zza zzaVg>
	//    8   14:return          
	}

	zzapp$zzb(zzaad$zzb zzaad$zzb1, zzapp$zza zzapp$zza1, zzapp._cls1 _pcls1)
	{
		this(zzaad$zzb1, zzapp$zza1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void zzapp$zzb(zzaad$zzb, zzapp$zza)>
	//    4    6:return          
	}
}
