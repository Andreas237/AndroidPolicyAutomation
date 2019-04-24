// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzajx

final class zzajy
	implements Runnable
{

	zzajy(zzajx zzajx1)
	{
		zzcqt = zzajx1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzajx zzcqt>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		zzajx.zza(zzcqt, Thread.currentThread());
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzajx zzcqt>
	//    2    4:invokestatic    #23  <Method Thread Thread.currentThread()>
	//    3    7:invokestatic    #29  <Method Thread zzajx.zza(zzajx, Thread)>
	//    4   10:pop             
		zzcqt.zzdn();
	//    5   11:aload_0         
	//    6   12:getfield        #12  <Field zzajx zzcqt>
	//    7   15:invokevirtual   #32  <Method void zzajx.zzdn()>
	//    8   18:return          
	}

	private final zzajx zzcqt;
}
