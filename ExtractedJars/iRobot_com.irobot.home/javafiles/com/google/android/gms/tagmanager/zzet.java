// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzew, zzes

final class zzet
	implements zzew
{

	zzet(zzes zzes)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final ScheduledExecutorService zzpq()
	{
		return Executors.newSingleThreadScheduledExecutor();
	//    0    0:invokestatic    #19  <Method ScheduledExecutorService Executors.newSingleThreadScheduledExecutor()>
	//    1    3:areturn         
	}
}
