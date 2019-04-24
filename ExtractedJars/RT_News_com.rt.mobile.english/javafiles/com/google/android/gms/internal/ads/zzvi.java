// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzvf, zzvw, zzuu

final class zzvi
	implements Runnable
{

	zzvi(zzvf zzvf1, zzvw zzvw, zzuu zzuu)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzbqc = zzvf1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zzvf zzbqc>
		zzbqf = zzvw;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field zzvw zzbqf>
		zzbqg = zzuu;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field zzuu zzbqg>
	//   11   19:return          
	}

	public final void run()
	{
		zzbqc.zza(zzbqf, zzbqg);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzvf zzbqc>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field zzvw zzbqf>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field zzuu zzbqg>
	//    6   12:invokevirtual   #31  <Method void zzvf.zza(zzvw, zzuu)>
	//    7   15:return          
	}

	private final zzvf zzbqc;
	private final zzvw zzbqf;
	private final zzuu zzbqg;
}
