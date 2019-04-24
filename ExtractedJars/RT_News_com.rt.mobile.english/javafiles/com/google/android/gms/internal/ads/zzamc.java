// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzy, zzaoj, zzae

final class zzamc
	implements zzy
{

	zzamc(zzaoj zzaoj1)
	{
		zzctq = zzaoj1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzaoj zzctq>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void zzd(zzae zzae)
	{
		zzctq.setException(((Throwable) (zzae)));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field zzaoj zzctq>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method void zzaoj.setException(Throwable)>
	//    4    8:return          
	}

	private final zzaoj zzctq;
}
