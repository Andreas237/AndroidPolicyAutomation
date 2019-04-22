// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.bumptech.glide.load.engine:
//			ActiveResources

class ActiveResources$1
	implements ThreadFactory
{

	public Thread newThread(final Runnable r)
	{
		return new Thread(new Runnable() {

			public void run()
			{
				Process.setThreadPriority(10);
			//    0    0:bipush          10
			//    1    2:invokestatic    #32  <Method void Process.setThreadPriority(int)>
				r.run();
			//    2    5:aload_0         
			//    3    6:getfield        #21  <Field Runnable val$r>
			//    4    9:invokeinterface #34  <Method void Runnable.run()>
			//    5   14:return          
			}

			final ActiveResources._cls1 this$1;
			final Runnable val$r;

			
			{
				this$1 = ActiveResources._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ActiveResources$1 this$1>
				r = runnable;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Runnable val$r>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, "glide-active-resources");
	//    0    0:new             #22  <Class Thread>
	//    1    3:dup             
	//    2    4:new             #13  <Class ActiveResources$1$1>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #25  <Method void ActiveResources$1$1(ActiveResources$1, Runnable)>
	//    7   13:ldc1            #27  <String "glide-active-resources">
	//    8   15:invokespecial   #30  <Method void Thread(Runnable, String)>
	//    9   18:areturn         
	}

	ActiveResources$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
