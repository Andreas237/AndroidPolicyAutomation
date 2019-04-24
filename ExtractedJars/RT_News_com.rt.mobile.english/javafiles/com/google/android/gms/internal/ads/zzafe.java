// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzaa;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaom, zzafa, zzafc

final class zzafe
	implements zzaom
{

	zzafe(zzafc zzafc1)
	{
		zzcgm = zzafc1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzafc zzcgm>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		zzafa.zzod().zzat(zzcgm.zzcgl);
	//    0    0:invokestatic    #23  <Method zzaa zzafa.zzod()>
	//    1    3:aload_0         
	//    2    4:getfield        #12  <Field zzafc zzcgm>
	//    3    7:getfield        #29  <Field String zzafc.zzcgl>
	//    4   10:invokevirtual   #35  <Method void zzaa.zzat(String)>
	//    5   13:return          
	}

	private final zzafc zzcgm;
}
