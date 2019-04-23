// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.anrwatchdog;


// Referenced classes of package com.github.anrwatchdog:
//			ANRWatchDog

class ANRWatchDog$3
	implements Runnable
{

	public void run()
	{
		ANRWatchDog anrwatchdog = ANRWatchDog.this;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ANRWatchDog this$0>
	//    2    4:astore_1        
		ANRWatchDog.access$002(anrwatchdog, (ANRWatchDog.access$000(anrwatchdog) + 1) % 0x7fffffff);
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokestatic    #23  <Method int ANRWatchDog.access$000(ANRWatchDog)>
	//    6   10:iconst_1        
	//    7   11:iadd            
	//    8   12:ldc1            #24  <Int 0x7fffffff>
	//    9   14:irem            
	//   10   15:invokestatic    #28  <Method int ANRWatchDog.access$002(ANRWatchDog, int)>
	//   11   18:pop             
	//   12   19:return          
	}

	final ANRWatchDog this$0;

	ANRWatchDog$3()
	{
		this$0 = ANRWatchDog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ANRWatchDog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
