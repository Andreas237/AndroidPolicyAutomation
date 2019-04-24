// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.common;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.startapp.common:
//			g

static final class g$2
	implements ThreadFactory
{

	public Thread newThread(Runnable runnable)
	{
		return new Thread(runnable, (new StringBuilder()).append("defaultPriorityThreadFactory #").append(a.getAndIncrement()).toString());
	//    0    0:new             #26  <Class Thread>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:new             #28  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void StringBuilder()>
	//    6   12:ldc1            #31  <String "defaultPriorityThreadFactory #">
	//    7   14:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:aload_0         
	//    9   18:getfield        #21  <Field AtomicInteger a>
	//   10   21:invokevirtual   #39  <Method int AtomicInteger.getAndIncrement()>
	//   11   24:invokevirtual   #42  <Method StringBuilder StringBuilder.append(int)>
	//   12   27:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   13   30:invokespecial   #49  <Method void Thread(Runnable, String)>
	//   14   33:areturn         
	}

	private final AtomicInteger a = new AtomicInteger(1);

	g$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #19  <Method void AtomicInteger(int)>
	//    7   13:putfield        #21  <Field AtomicInteger a>
	//    8   16:return          
	}
}
