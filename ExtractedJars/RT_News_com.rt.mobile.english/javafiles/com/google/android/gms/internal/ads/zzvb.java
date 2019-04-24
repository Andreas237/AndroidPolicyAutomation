// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzuw, zzaqw

final class zzvb
	implements Runnable
{

	zzvb(zzuw zzuw1, String s)
	{
		zzbpu = zzuw1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field zzuw zzbpu>
		zzbpt = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field String zzbpt>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		zzuw.zza(zzbpu).loadData(zzbpt, "text/html", "UTF-8");
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzuw zzbpu>
	//    2    4:invokestatic    #27  <Method zzaqw zzuw.zza(zzuw)>
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field String zzbpt>
	//    5   11:ldc1            #29  <String "text/html">
	//    6   13:ldc1            #31  <String "UTF-8">
	//    7   15:invokeinterface #37  <Method void zzaqw.loadData(String, String, String)>
	//    8   20:return          
	}

	private final String zzbpt;
	private final zzuw zzbpu;
}
