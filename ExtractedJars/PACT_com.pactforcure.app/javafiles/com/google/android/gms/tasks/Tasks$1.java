// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.tasks:
//			Tasks, zzh

final class Tasks$1
	implements Runnable
{

	public void run()
	{
		try
		{
			zzbLL.setResult(zzWN.call());
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzh zzbLL>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Callable zzWN>
	//    4    8:invokeinterface #33  <Method Object Callable.call()>
	//    5   13:invokevirtual   #39  <Method void zzh.setResult(Object)>
			return;
	//    6   16:return          
		}
		catch(Exception exception)
	//*   7   17:astore_1        
		{
			zzbLL.setException(exception);
	//    8   18:aload_0         
	//    9   19:getfield        #19  <Field zzh zzbLL>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #43  <Method void zzh.setException(Exception)>
		}
	//   12   26:return          
	}

	final Callable zzWN;
	final zzh zzbLL;

	Tasks$1(zzh zzh1, Callable callable)
	{
		zzbLL = zzh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field zzh zzbLL>
		zzWN = callable;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Callable zzWN>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
