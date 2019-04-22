// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.facebook:
//			FacebookSdk

static final class FacebookSdk$1
	implements ThreadFactory
{

	public Thread newThread(Runnable runnable)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #26  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("FacebookSdk #");
	//    4    8:aload_2         
	//    5    9:ldc1            #29  <String "FacebookSdk #">
	//    6   11:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(counter.incrementAndGet());
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:getfield        #21  <Field AtomicInteger counter>
	//   11   20:invokevirtual   #37  <Method int AtomicInteger.incrementAndGet()>
	//   12   23:invokevirtual   #40  <Method StringBuilder StringBuilder.append(int)>
	//   13   26:pop             
		return new Thread(runnable, stringbuilder.toString());
	//   14   27:new             #42  <Class Thread>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:aload_2         
	//   18   33:invokevirtual   #46  <Method String StringBuilder.toString()>
	//   19   36:invokespecial   #49  <Method void Thread(Runnable, String)>
	//   20   39:areturn         
	}

	private final AtomicInteger counter = new AtomicInteger(0);

	FacebookSdk$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class AtomicInteger>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #19  <Method void AtomicInteger(int)>
	//    7   13:putfield        #21  <Field AtomicInteger counter>
	//    8   16:return          
	}
}
