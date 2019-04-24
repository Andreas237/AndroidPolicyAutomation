// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//			zzary, zzarz

static class zzary$zzb extends zzasc$zza
{

	public void zza(zzarz zzarz1)
	{
		zzaGN.setResult(((Object) (zzarz1.getStatus())));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaad$zzb zzaGN>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method com.google.android.gms.common.api.Status zzarz.getStatus()>
	//    4    8:invokeinterface #34  <Method void zzaad$zzb.setResult(Object)>
	//    5   13:return          
	}

	private final zzaad$zzb zzaGN;

	public zzary$zzb(zzaad$zzb zzaad$zzb1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void zzasc$zza()>
		zzaGN = zzaad$zzb1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzaad$zzb zzaGN>
	//    5    9:return          
	}
}
