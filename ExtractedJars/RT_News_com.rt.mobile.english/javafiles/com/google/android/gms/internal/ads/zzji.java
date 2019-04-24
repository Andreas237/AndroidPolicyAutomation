// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.reward.zza;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzky

public final class zzji extends zzky
{

	public zzji(zza zza1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void zzky()>
		zzapv = zza1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field zza zzapv>
	//    5    9:return          
	}

	public final void zzt()
	{
		if(zzapv != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #14  <Field zza zzapv>
	//*   2    4:ifnull          14
			zzapv.zzt();
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field zza zzapv>
	//    5   11:invokevirtual   #20  <Method void zza.zzt()>
	//    6   14:return          
	}

	private final zza zzapv;
}
