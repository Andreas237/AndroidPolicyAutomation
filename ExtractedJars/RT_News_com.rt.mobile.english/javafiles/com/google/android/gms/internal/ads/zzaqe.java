// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzajx, zzaqg, zzaqh, zzakk, 
//			zzaqf, zzapw

public final class zzaqe extends zzajx
{

	zzaqe(zzapw zzapw, zzaqh zzaqh1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void zzajx()>
		zzcyg = zzapw;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field zzapw zzcyg>
		zzdav = zzaqh1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field zzaqh zzdav>
		zzdaw = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #22  <Field String zzdaw>
		zzbv.zzff().zza(this);
	//   11   19:invokestatic    #28  <Method zzaqg zzbv.zzff()>
	//   12   22:aload_0         
	//   13   23:invokevirtual   #34  <Method void zzaqg.zza(zzaqe)>
	//   14   26:return          
	}

	public final void onStop()
	{
		zzdav.abort();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field zzaqh zzdav>
	//    2    4:invokevirtual   #41  <Method void zzaqh.abort()>
	//    3    7:return          
	}

	public final void zzdn()
	{
		zzdav.zzdp(zzdaw);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field zzaqh zzdav>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field String zzdaw>
	//    4    8:invokevirtual   #46  <Method boolean zzaqh.zzdp(String)>
	//    5   11:pop             
		zzakk.zzcrm.post(((Runnable) (new zzaqf(this))));
	//    6   12:getstatic       #52  <Field Handler zzakk.zzcrm>
	//    7   15:new             #54  <Class zzaqf>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #56  <Method void zzaqf(zzaqe)>
	//   11   23:invokevirtual   #62  <Method boolean Handler.post(Runnable)>
	//   12   26:pop             
		return;
	//   13   27:return          
		Exception exception;
		exception;
	//   14   28:astore_1        
		zzakk.zzcrm.post(((Runnable) (new zzaqf(this))));
	//   15   29:getstatic       #52  <Field Handler zzakk.zzcrm>
	//   16   32:new             #54  <Class zzaqf>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokespecial   #56  <Method void zzaqf(zzaqe)>
	//   20   40:invokevirtual   #62  <Method boolean Handler.post(Runnable)>
	//   21   43:pop             
		throw exception;
	//   22   44:aload_1         
	//   23   45:athrow          
	}

	final zzapw zzcyg;
	final zzaqh zzdav;
	private final String zzdaw;
}
