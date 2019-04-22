// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.os.AsyncTask;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.tracing.Trace;

// Referenced classes of package com.airbnb.lottie:
//			Cancellable

abstract class CompositionLoader extends AsyncTask
	implements Cancellable, TraceFieldInterface
{

	CompositionLoader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void AsyncTask()>
	//    2    4:return          
	}

	public void _nr_setTrace(Trace trace)
	{
		try
		{
			_nr_trace = trace;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field Trace _nr_trace>
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

	public void cancel()
	{
		cancel(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #27  <Method boolean cancel(boolean)>
	//    3    5:pop             
	//    4    6:return          
	}

	public Trace _nr_trace;
}
