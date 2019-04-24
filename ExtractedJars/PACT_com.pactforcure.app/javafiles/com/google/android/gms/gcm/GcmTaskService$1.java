// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.gcm:
//			GcmTaskService

class GcmTaskService$1
	implements ThreadFactory
{

	public Thread newThread(Runnable runnable)
	{
		int i = zzbfT.getAndIncrement();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field AtomicInteger zzbfT>
	//    2    4:invokevirtual   #33  <Method int AtomicInteger.getAndIncrement()>
	//    3    7:istore_2        
		runnable = ((Runnable) (new Thread(runnable, (new StringBuilder(20)).append("gcm-task#").append(i).toString())));
	//    4    8:new             #35  <Class Thread>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:new             #37  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:bipush          20
	//   10   19:invokespecial   #38  <Method void StringBuilder(int)>
	//   11   22:ldc1            #40  <String "gcm-task#">
	//   12   24:invokevirtual   #44  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:iload_2         
	//   14   28:invokevirtual   #47  <Method StringBuilder StringBuilder.append(int)>
	//   15   31:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   16   34:invokespecial   #54  <Method void Thread(Runnable, String)>
	//   17   37:astore_1        
		((Thread) (runnable)).setPriority(4);
	//   18   38:aload_1         
	//   19   39:iconst_4        
	//   20   40:invokevirtual   #57  <Method void Thread.setPriority(int)>
		return ((Thread) (runnable));
	//   21   43:aload_1         
	//   22   44:areturn         
	}

	private final AtomicInteger zzbfT = new AtomicInteger(1);

	GcmTaskService$1(GcmTaskService gcmtaskservice)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #20  <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #23  <Method void AtomicInteger(int)>
	//    7   13:putfield        #25  <Field AtomicInteger zzbfT>
	//    8   16:return          
	}
}
