// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.marketing;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.facebook.marketing:
//			ViewIndexer

class ViewIndexer$2
	implements Runnable
{

	public void run()
	{
		try
		{
			if(ViewIndexer.access$400(ViewIndexer.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ViewIndexer this$0>
	//*   2    4:invokestatic    #31  <Method Timer ViewIndexer.access$400(ViewIndexer)>
	//*   3    7:ifnull          20
				ViewIndexer.access$400(ViewIndexer.this).cancel();
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field ViewIndexer this$0>
	//    6   14:invokestatic    #31  <Method Timer ViewIndexer.access$400(ViewIndexer)>
	//    7   17:invokevirtual   #36  <Method void Timer.cancel()>
			ViewIndexer.access$502(ViewIndexer.this, ((String) (null)));
	//    8   20:aload_0         
	//    9   21:getfield        #19  <Field ViewIndexer this$0>
	//   10   24:aconst_null     
	//   11   25:invokestatic    #40  <Method String ViewIndexer.access$502(ViewIndexer, String)>
	//   12   28:pop             
			ViewIndexer.access$402(ViewIndexer.this, new Timer());
	//   13   29:aload_0         
	//   14   30:getfield        #19  <Field ViewIndexer this$0>
	//   15   33:new             #33  <Class Timer>
	//   16   36:dup             
	//   17   37:invokespecial   #41  <Method void Timer()>
	//   18   40:invokestatic    #45  <Method Timer ViewIndexer.access$402(ViewIndexer, Timer)>
	//   19   43:pop             
			ViewIndexer.access$400(ViewIndexer.this).scheduleAtFixedRate(val$indexingTask, 0L, 1000L);
	//   20   44:aload_0         
	//   21   45:getfield        #19  <Field ViewIndexer this$0>
	//   22   48:invokestatic    #31  <Method Timer ViewIndexer.access$400(ViewIndexer)>
	//   23   51:aload_0         
	//   24   52:getfield        #21  <Field TimerTask val$indexingTask>
	//   25   55:lconst_0        
	//   26   56:ldc2w           #46  <Long 1000L>
	//   27   59:invokevirtual   #51  <Method void Timer.scheduleAtFixedRate(TimerTask, long, long)>
			return;
	//   28   62:return          
		}
		catch(Exception exception)
	//*  29   63:astore_1        
		{
			Log.e(ViewIndexer.access$200(), "Error scheduling indexing job", ((Throwable) (exception)));
	//   30   64:invokestatic    #55  <Method String ViewIndexer.access$200()>
	//   31   67:ldc1            #57  <String "Error scheduling indexing job">
	//   32   69:aload_1         
	//   33   70:invokestatic    #63  <Method int Log.e(String, String, Throwable)>
	//   34   73:pop             
		}
	//   35   74:return          
	}

	final ViewIndexer this$0;
	final TimerTask val$indexingTask;

	ViewIndexer$2()
	{
		this$0 = final_viewindexer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ViewIndexer this$0>
		val$indexingTask = TimerTask.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field TimerTask val$indexingTask>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
