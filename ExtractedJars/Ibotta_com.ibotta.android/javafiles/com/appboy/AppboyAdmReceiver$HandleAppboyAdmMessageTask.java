// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.appboy.support.AppboyLogger;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.instrumentation.AsyncTaskInstrumentation;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

// Referenced classes of package com.appboy:
//			AppboyAdmReceiver

public class AppboyAdmReceiver$HandleAppboyAdmMessageTask extends AsyncTask
	implements TraceFieldInterface
{

	public void _nr_setTrace(Trace trace)
	{
		try
		{
			_nr_trace = trace;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field Trace _nr_trace>
			return;
	//    3    5:return          
		}
		// Misplaced declaration of an exception variable
		catch(Trace trace)
	//*   4    6:astore_1        
		{
			return;
	//    5    7:return          
		}
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		TraceMachine.enterMethod(_nr_trace, "AppboyAdmReceiver$HandleAppboyAdmMessageTask#doInBackground", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Trace _nr_trace>
	//    2    4:ldc1            #54  <String "AppboyAdmReceiver$HandleAppboyAdmMessageTask#doInBackground">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #60  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "AppboyAdmReceiver$HandleAppboyAdmMessageTask#doInBackground", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #54  <String "AppboyAdmReceiver$HandleAppboyAdmMessageTask#doInBackground">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #60  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		aobj = ((Object []) (doInBackground((Void[])aobj)));
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:checkcast       #62  <Class Void[]>
	//   13   25:invokevirtual   #65  <Method Void doInBackground(Void[])>
	//   14   28:astore_1        
		TraceMachine.exitMethod();
	//   15   29:invokestatic    #68  <Method void TraceMachine.exitMethod()>
		TraceMachine.unloadTraceContext(((Object) (this)));
	//   16   32:aload_0         
	//   17   33:invokestatic    #72  <Method void TraceMachine.unloadTraceContext(Object)>
		return ((Object) (aobj));
	//   18   36:aload_1         
	//   19   37:areturn         
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   20   38:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  21   39:goto            13
	}

	protected transient Void doInBackground(Void avoid[])
	{
		try
		{
			handleAppboyAdmMessage(mContext, mIntent);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field AppboyAdmReceiver this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field Context mContext>
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field Intent mIntent>
	//    6   12:invokevirtual   #76  <Method boolean AppboyAdmReceiver.handleAppboyAdmMessage(Context, Intent)>
	//    7   15:pop             
		}
	//*   8   16:goto            30
		// Misplaced declaration of an exception variable
		catch(Void avoid[])
	//*   9   19:astore_1        
		{
			AppboyLogger.e(AppboyAdmReceiver.access$000(), "Failed to create and display notification.", ((Throwable) (avoid)));
	//   10   20:invokestatic    #80  <Method String AppboyAdmReceiver.access$000()>
	//   11   23:ldc1            #82  <String "Failed to create and display notification.">
	//   12   25:aload_1         
	//   13   26:invokestatic    #88  <Method int AppboyLogger.e(String, String, Throwable)>
	//   14   29:pop             
		}
		return null;
	//   15   30:aconst_null     
	//   16   31:areturn         
	}

	public Trace _nr_trace;
	private final Context mContext;
	private final Intent mIntent;
	final AppboyAdmReceiver this$0;

	public AppboyAdmReceiver$HandleAppboyAdmMessageTask(Context context, Intent intent)
	{
		this$0 = AppboyAdmReceiver.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field AppboyAdmReceiver this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #26  <Method void AsyncTask()>
		mContext = context;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field Context mContext>
		mIntent = intent;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field Intent mIntent>
		appboyadmreceiver = ((AppboyAdmReceiver) (new Void[0]));
	//   11   19:iconst_0        
	//   12   20:anewarray       Void[]
	//   13   23:astore_1        
		if(!(this instanceof AsyncTask))
	//*  14   24:aload_0         
	//*  15   25:instanceof      #5   <Class AsyncTask>
	//*  16   28:ifne            38
		{
			execute(((Object []) (AppboyAdmReceiver.this)));
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #36  <Method AsyncTask execute(Object[])>
	//   20   36:pop             
			return;
	//   21   37:return          
		} else
		{
			AsyncTaskInstrumentation.execute((AsyncTask)this, ((Object []) (AppboyAdmReceiver.this)));
	//   22   38:aload_0         
	//   23   39:checkcast       #5   <Class AsyncTask>
	//   24   42:aload_1         
	//   25   43:invokestatic    #41  <Method AsyncTask AsyncTaskInstrumentation.execute(AsyncTask, Object[])>
	//   26   46:pop             
			return;
	//   27   47:return          
		}
	}
}
