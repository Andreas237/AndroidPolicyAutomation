// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzakk, zzapi

final class zzapy
	implements Runnable
{

	zzapy(zzapi zzapi1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzahs = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #18  <Field boolean zzahs>
		zzdap = zzapi1;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #20  <Field zzapi zzdap>
	//    8   14:return          
	}

	private final void zztv()
	{
		zzakk.zzcrm.removeCallbacks(((Runnable) (this)));
	//    0    0:getstatic       #28  <Field Handler zzakk.zzcrm>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #34  <Method void Handler.removeCallbacks(Runnable)>
		zzakk.zzcrm.postDelayed(((Runnable) (this)), 250L);
	//    3    7:getstatic       #28  <Field Handler zzakk.zzcrm>
	//    4   10:aload_0         
	//    5   11:ldc2w           #35  <Long 250L>
	//    6   14:invokevirtual   #40  <Method boolean Handler.postDelayed(Runnable, long)>
	//    7   17:pop             
	//    8   18:return          
	}

	public final void pause()
	{
		zzahs = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #18  <Field boolean zzahs>
	//    3    5:return          
	}

	public final void resume()
	{
		zzahs = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #18  <Field boolean zzahs>
		zztv();
	//    3    5:aload_0         
	//    4    6:invokespecial   #44  <Method void zztv()>
	//    5    9:return          
	}

	public final void run()
	{
		if(!zzahs)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field boolean zzahs>
	//*   2    4:ifne            18
		{
			zzdap.zzte();
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field zzapi zzdap>
	//    5   11:invokevirtual   #50  <Method void zzapi.zzte()>
			zztv();
	//    6   14:aload_0         
	//    7   15:invokespecial   #44  <Method void zztv()>
		}
	//    8   18:return          
	}

	private boolean zzahs;
	private zzapi zzdap;
}
