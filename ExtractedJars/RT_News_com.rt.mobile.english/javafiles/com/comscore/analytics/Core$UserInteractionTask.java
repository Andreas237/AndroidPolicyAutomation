// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.analytics;

import com.comscore.utils.task.TaskExecutor;

// Referenced classes of package com.comscore.analytics:
//			Core

public class Core$UserInteractionTask
	implements Runnable
{

	public void run()
	{
		if(!Core.b(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #12  <Field Core a>
	//*   2    4:invokestatic    #23  <Method boolean Core.b(Core)>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		if(a.Y != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #12  <Field Core a>
	//*   7   15:getfield        #27  <Field Runnable Core.Y>
	//*   8   18:ifnull          53
		{
			a.f.removeEnqueuedTask(a.Y);
	//    9   21:aload_0         
	//   10   22:getfield        #12  <Field Core a>
	//   11   25:getfield        #31  <Field TaskExecutor Core.f>
	//   12   28:aload_0         
	//   13   29:getfield        #12  <Field Core a>
	//   14   32:getfield        #27  <Field Runnable Core.Y>
	//   15   35:invokevirtual   #37  <Method void TaskExecutor.removeEnqueuedTask(Runnable)>
			a.Y = null;
	//   16   38:aload_0         
	//   17   39:getfield        #12  <Field Core a>
	//   18   42:aconst_null     
	//   19   43:putfield        #27  <Field Runnable Core.Y>
			a.n();
	//   20   46:aload_0         
	//   21   47:getfield        #12  <Field Core a>
	//   22   50:invokevirtual   #40  <Method void Core.n()>
		}
	//   23   53:return          
	}

	final Core a;

	public Core$UserInteractionTask(Core core)
	{
		a = core;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field Core a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
