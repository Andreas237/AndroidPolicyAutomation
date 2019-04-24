// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzuv, zzakk, zzvi, zzvq, 
//			zzvf, zzvw, zzuu

final class zzvh
	implements zzuv
{

	zzvh(zzvf zzvf, zzvw zzvw, zzuu zzuu)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzbqc = zzvf;
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

	public final void zzlx()
	{
		zzvf zzvf = zzbqc;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzvf zzbqc>
	//    2    4:astore_1        
		zzvw zzvw = zzbqf;
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field zzvw zzbqf>
	//    5    9:astore_2        
		zzuu zzuu = zzbqg;
	//    6   10:aload_0         
	//    7   11:getfield        #23  <Field zzuu zzbqg>
	//    8   14:astore_3        
		zzakk.zzcrm.postDelayed(((Runnable) (new zzvi(zzvf, zzvw, zzuu))), zzvq.zzbqp);
	//    9   15:getstatic       #31  <Field Handler zzakk.zzcrm>
	//   10   18:new             #33  <Class zzvi>
	//   11   21:dup             
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:invokespecial   #35  <Method void zzvi(zzvf, zzvw, zzuu)>
	//   16   28:getstatic       #41  <Field int zzvq.zzbqp>
	//   17   31:i2l             
	//   18   32:invokevirtual   #47  <Method boolean Handler.postDelayed(Runnable, long)>
	//   19   35:pop             
	//   20   36:return          
	}

	private final zzvf zzbqc;
	private final zzvw zzbqf;
	private final zzuu zzbqg;
}
