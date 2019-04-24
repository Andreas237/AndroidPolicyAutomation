// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaov

final class zzaow
	implements Runnable
{

	zzaow(zzaov zzaov1, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzcxe = zzaov1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field zzaov zzcxe>
		zzcsi = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int zzcsi>
	//    8   14:return          
	}

	public final void run()
	{
		zzcxe.zzah(zzcsi);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field zzaov zzcxe>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field int zzcsi>
	//    4    8:invokevirtual   #27  <Method void zzaov.zzah(int)>
	//    5   11:return          
	}

	private final int zzcsi;
	private final zzaov zzcxe;
}
