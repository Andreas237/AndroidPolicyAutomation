// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//			zzat

final class zzaw
	implements Runnable
{

	zzaw(zzat zzat1, String s)
	{
		zzbbr = zzat1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzat zzbbr>
		zzbbt = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field String zzbbt>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		zzat.zza(zzbbr, zzbbt);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzat zzbbr>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field String zzbbt>
	//    4    8:invokestatic    #26  <Method void zzat.zza(zzat, String)>
	//    5   11:return          
	}

	private final zzat zzbbr;
	private final String zzbbt;
}
