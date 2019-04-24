// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzarl

final class zzarn
	implements Runnable
{

	zzarn(zzarl zzarl1, int i, int j, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzdel = zzarl1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field zzarl zzdel>
		zzcsi = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int zzcsi>
		zzcsj = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #25  <Field int zzcsj>
		zzdcp = flag;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #27  <Field boolean zzdcp>
		zzdcq = flag1;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #29  <Field boolean zzdcq>
	//   17   31:return          
	}

	public final void run()
	{
		zzdel.zza(zzcsi, zzcsj, zzdcp, zzdcq);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field zzarl zzdel>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field int zzcsi>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field int zzcsj>
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field boolean zzdcp>
	//    8   16:aload_0         
	//    9   17:getfield        #29  <Field boolean zzdcq>
	//   10   20:invokevirtual   #37  <Method void zzarl.zza(int, int, boolean, boolean)>
	//   11   23:return          
	}

	private final int zzcsi;
	private final int zzcsj;
	private final boolean zzdcp;
	private final boolean zzdcq;
	private final zzarl zzdel;
}
