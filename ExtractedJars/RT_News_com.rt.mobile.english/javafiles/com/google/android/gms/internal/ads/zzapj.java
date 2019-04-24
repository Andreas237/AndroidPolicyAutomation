// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzapg

final class zzapj
	implements Runnable
{

	private zzapj(zzapg zzapg1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzcyc = zzapg1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field zzapg zzcyc>
	//    5    9:return          
	}

	static Runnable zza(zzapg zzapg1)
	{
		return ((Runnable) (new zzapj(zzapg1)));
	//    0    0:new             #2   <Class zzapj>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void zzapj(zzapg)>
	//    4    8:areturn         
	}

	public final void run()
	{
		zzcyc.stop();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzapg zzcyc>
	//    2    4:invokevirtual   #26  <Method void zzapg.stop()>
	//    3    7:return          
	}

	private final zzapg zzcyc;
}
