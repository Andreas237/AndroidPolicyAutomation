// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzfp

final class zzfq
	implements Runnable
{

	zzfq(zzfp zzfp1)
	{
		zzagk = zzfp1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzfp zzagk>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		zzfp.zza(zzagk, 3);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzfp zzagk>
	//    2    4:iconst_3        
	//    3    5:invokestatic    #23  <Method void zzfp.zza(zzfp, int)>
	//    4    8:return          
	}

	private final zzfp zzagk;
}
