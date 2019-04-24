// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzahn, zzxq, zzjj

final class zzaho
	implements Runnable
{

	zzaho(zzahn zzahn1, zzjj zzjj, zzxq zzxq)
	{
		zzclv = zzahn1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzahn zzclv>
		zzyh = zzjj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field zzjj zzyh>
		zzclu = zzxq;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field zzxq zzclu>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public final void run()
	{
		zzahn.zza(zzclv, zzyh, zzclu);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzahn zzclv>
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field zzjj zzyh>
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field zzxq zzclu>
	//    6   12:invokestatic    #30  <Method void zzahn.zza(zzahn, zzjj, zzxq)>
	//    7   15:return          
	}

	private final zzxq zzclu;
	private final zzahn zzclv;
	private final zzjj zzyh;
}
