// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.anrwatchdog;

import java.util.Comparator;

// Referenced classes of package com.github.anrwatchdog:
//			ANRError

static final class ANRError$1
	implements Comparator
{

	public volatile int compare(Object obj, Object obj1)
	{
		return compare((Thread)obj, (Thread)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class Thread>
	//    3    5:aload_2         
	//    4    6:checkcast       #26  <Class Thread>
	//    5    9:invokevirtual   #29  <Method int compare(Thread, Thread)>
	//    6   12:ireturn         
	}

	public int compare(Thread thread, Thread thread1)
	{
		if(thread == thread1)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:if_acmpne       7
			return 0;
	//    3    5:iconst_0        
	//    4    6:ireturn         
		Thread thread2 = val$mainThread;
	//    5    7:aload_0         
	//    6    8:getfield        #18  <Field Thread val$mainThread>
	//    7   11:astore_3        
		if(thread == thread2)
	//*   8   12:aload_1         
	//*   9   13:aload_3         
	//*  10   14:if_acmpne       19
			return 1;
	//   11   17:iconst_1        
	//   12   18:ireturn         
		if(thread1 == thread2)
	//*  13   19:aload_2         
	//*  14   20:aload_3         
	//*  15   21:if_acmpne       26
			return -1;
	//   16   24:iconst_m1       
	//   17   25:ireturn         
		else
			return thread1.getName().compareTo(thread.getName());
	//   18   26:aload_2         
	//   19   27:invokevirtual   #33  <Method String Thread.getName()>
	//   20   30:aload_1         
	//   21   31:invokevirtual   #33  <Method String Thread.getName()>
	//   22   34:invokevirtual   #39  <Method int String.compareTo(String)>
	//   23   37:ireturn         
	}

	final Thread val$mainThread;

	ANRError$1(Thread thread)
	{
		val$mainThread = thread;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field Thread val$mainThread>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
