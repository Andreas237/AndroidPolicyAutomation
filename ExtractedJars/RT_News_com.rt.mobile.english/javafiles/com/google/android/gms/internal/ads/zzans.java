// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaoj

final class zzans
	implements Runnable
{

	zzans(zzaoj zzaoj1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		zzbnu = zzaoj1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field zzaoj zzbnu>
	//    5    9:return          
	}

	public final void run()
	{
		zzbnu.setException(((Throwable) (new TimeoutException())));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzaoj zzbnu>
	//    2    4:new             #19  <Class TimeoutException>
	//    3    7:dup             
	//    4    8:invokespecial   #20  <Method void TimeoutException()>
	//    5   11:invokevirtual   #26  <Method void zzaoj.setException(Throwable)>
	//    6   14:return          
	}

	private final zzaoj zzbnu;
}
