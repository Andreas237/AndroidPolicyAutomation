// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzn;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaqw

final class zzarb
	implements zzn
{

	public zzarb(zzaqw zzaqw1, zzn zzn1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzdcj = zzaqw1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzaqw zzdcj>
		zzbnc = zzn1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field zzn zzbnc>
	//    8   14:return          
	}

	public final void onPause()
	{
	//    0    0:return          
	}

	public final void onResume()
	{
	//    0    0:return          
	}

	public final void zzcb()
	{
		zzbnc.zzcb();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzn zzbnc>
	//    2    4:invokeinterface #25  <Method void zzn.zzcb()>
		zzdcj.zzty();
	//    3    9:aload_0         
	//    4   10:getfield        #17  <Field zzaqw zzdcj>
	//    5   13:invokeinterface #30  <Method void zzaqw.zzty()>
	//    6   18:return          
	}

	public final void zzcc()
	{
		zzbnc.zzcc();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzn zzbnc>
	//    2    4:invokeinterface #33  <Method void zzn.zzcc()>
		zzdcj.zzno();
	//    3    9:aload_0         
	//    4   10:getfield        #17  <Field zzaqw zzdcj>
	//    5   13:invokeinterface #36  <Method void zzaqw.zzno()>
	//    6   18:return          
	}

	private zzn zzbnc;
	private zzaqw zzdcj;
}
