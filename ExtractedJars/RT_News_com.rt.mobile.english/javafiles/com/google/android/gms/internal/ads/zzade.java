// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanf, zzadb

final class zzade
	implements Runnable
{

	zzade(zzadb zzadb, zzanf zzanf1, String s)
	{
		zzccd = zzanf1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #14  <Field zzanf zzccd>
		zzcce = s;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #16  <Field String zzcce>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		zzccd.zzcz(zzcce);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzanf zzccd>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field String zzcce>
	//    4    8:invokevirtual   #27  <Method void zzanf.zzcz(String)>
	//    5   11:return          
	}

	private final zzanf zzccd;
	private final String zzcce;
}
