// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			ab

class ab$1 extends AsyncTask
	implements TraceFieldInterface
{

	public void _nr_setTrace(Trace trace)
	{
		try
		{
			_nr_trace = trace;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field Trace _nr_trace>
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

	protected transient Void a(Void avoid[])
	{
		avoid = ((Void []) (new Intent("android.intent.action.VIEW", Uri.parse(a))));
	//    0    0:new             #38  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #40  <String "android.intent.action.VIEW">
	//    3    6:aload_0         
	//    4    7:getfield        #25  <Field String a>
	//    5   10:invokestatic    #46  <Method Uri Uri.parse(String)>
	//    6   13:invokespecial   #49  <Method void Intent(String, Uri)>
	//    7   16:astore_1        
		if(!(ab.a(b) instanceof Activity))
	//*   8   17:aload_0         
	//*   9   18:getfield        #23  <Field ab b>
	//*  10   21:invokestatic    #52  <Method Context ab.a(ab)>
	//*  11   24:instanceof      #54  <Class Activity>
	//*  12   27:ifne            37
			((Intent) (avoid)).setFlags(0x10000000);
	//   13   30:aload_1         
	//   14   31:ldc1            #55  <Int 0x10000000>
	//   15   33:invokevirtual   #59  <Method Intent Intent.setFlags(int)>
	//   16   36:pop             
		ab.a(b).startActivity(((Intent) (avoid)));
	//   17   37:aload_0         
	//   18   38:getfield        #23  <Field ab b>
	//   19   41:invokestatic    #52  <Method Context ab.a(ab)>
	//   20   44:aload_1         
	//   21   45:invokevirtual   #65  <Method void Context.startActivity(Intent)>
		return null;
	//   22   48:aconst_null     
	//   23   49:areturn         
	}

	protected Object doInBackground(Object aobj[])
	{
		TraceMachine.enterMethod(_nr_trace, "ab$1#doInBackground", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Trace _nr_trace>
	//    2    4:ldc1            #71  <String "ab$1#doInBackground">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #77  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "ab$1#doInBackground", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #71  <String "ab$1#doInBackground">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #77  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		aobj = ((Object []) (a((Void[])aobj)));
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:checkcast       #79  <Class Void[]>
	//   13   25:invokevirtual   #81  <Method Void a(Void[])>
	//   14   28:astore_1        
		TraceMachine.exitMethod();
	//   15   29:invokestatic    #84  <Method void TraceMachine.exitMethod()>
		TraceMachine.unloadTraceContext(((Object) (this)));
	//   16   32:aload_0         
	//   17   33:invokestatic    #88  <Method void TraceMachine.unloadTraceContext(Object)>
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

	public Trace _nr_trace;
	final String a;
	final ab b;

	ab$1(ab ab1, String s)
	{
		b = ab1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field ab b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #28  <Method void AsyncTask()>
	//    8   14:return          
	}
}
