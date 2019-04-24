// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaiy

final class zzaja
	implements ThreadFactory
{

	zzaja(zzaiy zzaiy)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #15  <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #18  <Method void AtomicInteger(int)>
	//    7   13:putfield        #20  <Field AtomicInteger zzcnz>
	//    8   16:return          
	}

	public final Thread newThread(Runnable runnable)
	{
		int i = zzcnz.getAndIncrement();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field AtomicInteger zzcnz>
	//    2    4:invokevirtual   #27  <Method int AtomicInteger.getAndIncrement()>
	//    3    7:istore_2        
		StringBuilder stringbuilder = new StringBuilder(42);
	//    4    8:new             #29  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:bipush          42
	//    7   14:invokespecial   #30  <Method void StringBuilder(int)>
	//    8   17:astore_3        
		stringbuilder.append("AdWorker(SCION_TASK_EXECUTOR) #");
	//    9   18:aload_3         
	//   10   19:ldc1            #32  <String "AdWorker(SCION_TASK_EXECUTOR) #">
	//   11   21:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(i);
	//   13   25:aload_3         
	//   14   26:iload_2         
	//   15   27:invokevirtual   #39  <Method StringBuilder StringBuilder.append(int)>
	//   16   30:pop             
		return new Thread(runnable, stringbuilder.toString());
	//   17   31:new             #41  <Class Thread>
	//   18   34:dup             
	//   19   35:aload_1         
	//   20   36:aload_3         
	//   21   37:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   22   40:invokespecial   #48  <Method void Thread(Runnable, String)>
	//   23   43:areturn         
	}

	private final AtomicInteger zzcnz = new AtomicInteger(1);
}
