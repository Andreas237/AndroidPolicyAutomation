// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;


// Referenced classes of package com.google.android.gms.internal.cast:
//			zzeh, zzdq, zzdg

final class zzdr extends zzeh
{

	zzdr(zzdq zzdq1)
	{
		zzxu = zzdq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field zzdq zzxu>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void zzeh()>
	//    5    9:return          
	}

	public final void zzr(int i)
	{
		zzdq.zzdd().d("onRemoteDisplayEnded", new Object[0]);
	//    0    0:invokestatic    #22  <Method zzdg zzdq.zzdd()>
	//    1    3:ldc1            #24  <String "onRemoteDisplayEnded">
	//    2    5:iconst_0        
	//    3    6:anewarray       Object[]
	//    4    9:invokevirtual   #32  <Method void zzdg.d(String, Object[])>
		zzdq.zza(zzxu);
	//    5   12:aload_0         
	//    6   13:getfield        #10  <Field zzdq zzxu>
	//    7   16:invokestatic    #35  <Method void zzdq.zza(zzdq)>
	//    8   19:return          
	}

	private final zzdq zzxu;
}
