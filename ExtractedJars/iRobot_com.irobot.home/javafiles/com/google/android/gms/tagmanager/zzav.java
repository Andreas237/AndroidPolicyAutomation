// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//			zzat, zzaq

final class zzav
	implements Runnable
{

	zzav(zzat zzat1, zzaq zzaq1)
	{
		zzbbr = zzat1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzat zzbbr>
		zzbbs = zzaq1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field zzaq zzbbs>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		zzbbs.zze(zzat.zza(zzbbr));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field zzaq zzbbs>
	//    2    4:aload_0         
	//    3    5:getfield        #14  <Field zzat zzbbr>
	//    4    8:invokestatic    #27  <Method java.util.List zzat.zza(zzat)>
	//    5   11:invokeinterface #33  <Method void zzaq.zze(java.util.List)>
	//    6   16:return          
	}

	private final zzat zzbbr;
	private final zzaq zzbbs;
}
