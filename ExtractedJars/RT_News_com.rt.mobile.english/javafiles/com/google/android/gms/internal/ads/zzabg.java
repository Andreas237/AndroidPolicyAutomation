// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzabf, zzakb

final class zzabg
	implements Runnable
{

	zzabg(zzabf zzabf1)
	{
		zzbzj = zzabf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field zzabf zzbzj>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void run()
	{
		if(!zzabf.zza(zzbzj).get())
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field zzabf zzbzj>
	//*   2    4:invokestatic    #23  <Method AtomicBoolean zzabf.zza(zzabf)>
	//*   3    7:invokevirtual   #29  <Method boolean AtomicBoolean.get()>
	//*   4   10:ifne            14
		{
			return;
	//    5   13:return          
		} else
		{
			zzakb.e("Timed out waiting for WebView to finish loading.");
	//    6   14:ldc1            #31  <String "Timed out waiting for WebView to finish loading.">
	//    7   16:invokestatic    #37  <Method void zzakb.e(String)>
			zzbzj.cancel();
	//    8   19:aload_0         
	//    9   20:getfield        #12  <Field zzabf zzbzj>
	//   10   23:invokevirtual   #40  <Method void zzabf.cancel()>
			return;
	//   11   26:return          
		}
	}

	private final zzabf zzbzj;
}
