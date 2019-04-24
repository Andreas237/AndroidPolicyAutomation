// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzagr

final class zzags
	implements Runnable
{

	zzags(zzagr zzagr1)
	{
		zzclh = zzagr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzagr zzclh>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		zzagr.zza(zzclh, 1);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzagr zzclh>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #23  <Method void zzagr.zza(zzagr, int)>
	//    4    8:return          
	}

	private final zzagr zzclh;
}
