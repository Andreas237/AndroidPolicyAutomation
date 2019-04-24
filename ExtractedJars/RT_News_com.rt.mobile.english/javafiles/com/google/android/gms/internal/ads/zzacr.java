// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanj, zzaqw, zzacq, zzanz

final class zzacr
	implements zzanj
{

	zzacr(zzacq zzacq1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzcbp = zzacq1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field zzacq zzcbp>
	//    5    9:return          
	}

	public final zzanz zzc(Object obj)
	{
		return zzcbp.zzh((zzaqw)obj);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzacq zzcbp>
	//    2    4:aload_1         
	//    3    5:checkcast       #20  <Class zzaqw>
	//    4    8:invokevirtual   #26  <Method zzanz zzacq.zzh(zzaqw)>
	//    5   11:areturn         
	}

	private final zzacq zzcbp;
}
