// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//			zzabr, zzbaw

class zzabr$1
	implements Runnable
{

	public void run()
	{
		zzabr.zza(zzaDj, zzaBI);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzabr zzaDj>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field zzbaw zzaBI>
	//    4    8:invokestatic    #29  <Method void zzabr.zza(zzabr, zzbaw)>
	//    5   11:return          
	}

	final zzbaw zzaBI;
	final zzabr zzaDj;

	zzabr$1(zzabr zzabr1, zzbaw zzbaw)
	{
		zzaDj = zzabr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field zzabr zzaDj>
		zzaBI = zzbaw;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field zzbaw zzaBI>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
