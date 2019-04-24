// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzkf, zzjd

public final class zzje extends zzkf
{

	public zzje(zzjd zzjd1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzkf()>
		zzapt = zzjd1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field zzjd zzapt>
	//    5    9:return          
	}

	public final void onAdClicked()
	{
		zzapt.onAdClicked();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field zzjd zzapt>
	//    2    4:invokeinterface #20  <Method void zzjd.onAdClicked()>
	//    3    9:return          
	}

	private final zzjd zzapt;
}
