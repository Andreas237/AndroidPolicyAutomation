// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//			zzfn, zzcb

final class zzfp
	implements Runnable
{

	zzfp(zzfn zzfn1)
	{
		zzbgl = zzfn1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzfn zzbgl>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		zzfn.zze(zzbgl).dispatch();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzfn zzbgl>
	//    2    4:invokestatic    #23  <Method zzcb zzfn.zze(zzfn)>
	//    3    7:invokeinterface #28  <Method void zzcb.dispatch()>
	//    4   12:return          
	}

	private final zzfn zzbgl;
}
