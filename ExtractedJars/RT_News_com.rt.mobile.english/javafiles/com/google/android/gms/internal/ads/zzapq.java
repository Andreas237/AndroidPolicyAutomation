// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzapf, zzapp

final class zzapq
	implements Runnable
{

	zzapq(zzapp zzapp, zzapf zzapf1)
	{
		zzcym = zzapf1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #12  <Field zzapf zzcym>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		zzcym.zzsz();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzapf zzcym>
	//    2    4:invokeinterface #22  <Method void zzapf.zzsz()>
	//    3    9:return          
	}

	private final zzapf zzcym;
}
