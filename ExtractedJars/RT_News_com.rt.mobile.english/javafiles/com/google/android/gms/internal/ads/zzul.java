// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzuf

final class zzul
	implements Runnable
{

	zzul(zzuf zzuf1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzbpk = zzuf1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzuf zzbpk>
		zzzo = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field String zzzo>
	//    8   14:return          
	}

	public final void run()
	{
		zzbpk.zzbf(zzzo);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzuf zzbpk>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field String zzzo>
	//    4    8:invokevirtual   #27  <Method void zzuf.zzbf(String)>
	//    5   11:return          
	}

	private final zzuf zzbpk;
	private final String zzzo;
}
