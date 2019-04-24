// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzvf, zzci, zzvw

final class zzvg
	implements Runnable
{

	zzvg(zzvf zzvf1, zzci zzci, zzvw zzvw)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzbqc = zzvf1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zzvf zzbqc>
		zzbqd = zzci;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field zzci zzbqd>
		zzbqe = zzvw;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field zzvw zzbqe>
	//   11   19:return          
	}

	public final void run()
	{
		zzbqc.zza(zzbqd, zzbqe);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzvf zzbqc>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field zzci zzbqd>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field zzvw zzbqe>
	//    6   12:invokevirtual   #31  <Method void zzvf.zza(zzci, zzvw)>
	//    7   15:return          
	}

	private final zzvf zzbqc;
	private final zzci zzbqd;
	private final zzvw zzbqe;
}
