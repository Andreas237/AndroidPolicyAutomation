// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.support.v7.app.ActionBarActivity;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.tracing.Trace;

public abstract class DigitsActionBarActivity extends ActionBarActivity
	implements TraceFieldInterface
{

	public DigitsActionBarActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void ActionBarActivity()>
	//    2    4:return          
	}

	public void _nr_setTrace(Trace trace)
	{
		try
		{
			_nr_trace = trace;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Trace _nr_trace>
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

	public Trace _nr_trace;
}
