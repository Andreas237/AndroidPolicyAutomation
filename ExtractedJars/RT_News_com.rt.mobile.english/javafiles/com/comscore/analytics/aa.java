// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.analytics;

import com.comscore.applications.KeepAlive;
import com.comscore.utils.ConnectivityChangeReceiver;
import com.comscore.utils.OfflineMeasurementsCache;
import com.comscore.utils.task.TaskExecutor;

// Referenced classes of package com.comscore.analytics:
//			Core

class aa
	implements Runnable
{

	aa(Core core, boolean flag)
	{
		b = core;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field Core b>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #16  <Field boolean a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public void run()
	{
		if(a && !Core.b(b))
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field boolean a>
	//*   2    4:ifeq            71
	//*   3    7:aload_0         
	//*   4    8:getfield        #14  <Field Core b>
	//*   5   11:invokestatic    #26  <Method boolean Core.b(Core)>
	//*   6   14:ifne            71
		{
			Core.a(b, true);
	//    7   17:aload_0         
	//    8   18:getfield        #14  <Field Core b>
	//    9   21:iconst_1        
	//   10   22:invokestatic    #29  <Method boolean Core.a(Core, boolean)>
	//   11   25:pop             
			b.setErrorHandlingEnabled(Core.c(b));
	//   12   26:aload_0         
	//   13   27:getfield        #14  <Field Core b>
	//   14   30:aload_0         
	//   15   31:getfield        #14  <Field Core b>
	//   16   34:invokestatic    #32  <Method boolean Core.c(Core)>
	//   17   37:invokevirtual   #36  <Method void Core.setErrorHandlingEnabled(boolean)>
			b.reset();
	//   18   40:aload_0         
	//   19   41:getfield        #14  <Field Core b>
	//   20   44:invokevirtual   #39  <Method void Core.reset()>
			b.getConnectivityReceiver().start();
	//   21   47:aload_0         
	//   22   48:getfield        #14  <Field Core b>
	//   23   51:invokevirtual   #43  <Method ConnectivityChangeReceiver Core.getConnectivityReceiver()>
	//   24   54:invokevirtual   #48  <Method void ConnectivityChangeReceiver.start()>
			b.getKeepAlive().start(3000);
	//   25   57:aload_0         
	//   26   58:getfield        #14  <Field Core b>
	//   27   61:invokevirtual   #52  <Method KeepAlive Core.getKeepAlive()>
	//   28   64:sipush          3000
	//   29   67:invokevirtual   #57  <Method void KeepAlive.start(int)>
			return;
	//   30   70:return          
		}
		if(!a && Core.b(b))
	//*  31   71:aload_0         
	//*  32   72:getfield        #16  <Field boolean a>
	//*  33   75:ifne            175
	//*  34   78:aload_0         
	//*  35   79:getfield        #14  <Field Core b>
	//*  36   82:invokestatic    #26  <Method boolean Core.b(Core)>
	//*  37   85:ifeq            175
		{
			Core.a(b, false);
	//   38   88:aload_0         
	//   39   89:getfield        #14  <Field Core b>
	//   40   92:iconst_0        
	//   41   93:invokestatic    #29  <Method boolean Core.a(Core, boolean)>
	//   42   96:pop             
			Core.b(b, b.ag);
	//   43   97:aload_0         
	//   44   98:getfield        #14  <Field Core b>
	//   45  101:aload_0         
	//   46  102:getfield        #14  <Field Core b>
	//   47  105:getfield        #60  <Field boolean Core.ag>
	//   48  108:invokestatic    #62  <Method boolean Core.b(Core, boolean)>
	//   49  111:pop             
			if(Thread.getDefaultUncaughtExceptionHandler() != b.ah)
	//*  50  112:invokestatic    #68  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//*  51  115:aload_0         
	//*  52  116:getfield        #14  <Field Core b>
	//*  53  119:getfield        #72  <Field Thread$UncaughtExceptionHandler Core.ah>
	//*  54  122:if_acmpeq       135
				Thread.setDefaultUncaughtExceptionHandler(b.ah);
	//   55  125:aload_0         
	//   56  126:getfield        #14  <Field Core b>
	//   57  129:getfield        #72  <Field Thread$UncaughtExceptionHandler Core.ah>
	//   58  132:invokestatic    #76  <Method void Thread.setDefaultUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
			b.getConnectivityReceiver().stop();
	//   59  135:aload_0         
	//   60  136:getfield        #14  <Field Core b>
	//   61  139:invokevirtual   #43  <Method ConnectivityChangeReceiver Core.getConnectivityReceiver()>
	//   62  142:invokevirtual   #79  <Method void ConnectivityChangeReceiver.stop()>
			b.getKeepAlive().stop();
	//   63  145:aload_0         
	//   64  146:getfield        #14  <Field Core b>
	//   65  149:invokevirtual   #52  <Method KeepAlive Core.getKeepAlive()>
	//   66  152:invokevirtual   #80  <Method void KeepAlive.stop()>
			b.getOfflineCache().clear();
	//   67  155:aload_0         
	//   68  156:getfield        #14  <Field Core b>
	//   69  159:invokevirtual   #84  <Method OfflineMeasurementsCache Core.getOfflineCache()>
	//   70  162:invokevirtual   #89  <Method void OfflineMeasurementsCache.clear()>
			b.f.removeAllEnqueuedTasks();
	//   71  165:aload_0         
	//   72  166:getfield        #14  <Field Core b>
	//   73  169:getfield        #93  <Field TaskExecutor Core.f>
	//   74  172:invokevirtual   #98  <Method void TaskExecutor.removeAllEnqueuedTasks()>
		}
	//   75  175:return          
	}

	final boolean a;
	final Core b;
}
