// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Looper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzapr

final class zzaps
	implements Runnable
{

	zzaps(zzapr zzapr)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final void run()
	{
		Looper.myLooper().quit();
	//    0    0:invokestatic    #19  <Method Looper Looper.myLooper()>
	//    1    3:invokevirtual   #22  <Method void Looper.quit()>
	//    2    6:return          
	}
}
