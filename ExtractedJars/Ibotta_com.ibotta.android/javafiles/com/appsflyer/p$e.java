// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.os.AsyncTask;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

// Referenced classes of package com.appsflyer:
//			p, AFLogger

final class p$e extends AsyncTask
	implements TraceFieldInterface
{

	private transient Void _mth02CE()
	{
		try
		{
			Thread.sleep(500L);
	//    0    0:ldc2w           #37  <Long 500L>
	//    1    3:invokestatic    #44  <Method void Thread.sleep(long)>
		}
	//*   2    6:goto            16
		catch(InterruptedException interruptedexception)
	//*   3    9:astore_1        
		{
			AFLogger.afErrorLog("Sleeping attempt failed (essential for background state verification)\n", ((Throwable) (interruptedexception)));
	//    4   10:ldc1            #46  <String "Sleeping attempt failed (essential for background state verification)\n">
	//    5   12:aload_1         
	//    6   13:invokestatic    #52  <Method void AFLogger.afErrorLog(String, Throwable)>
		}
		if(p._mth02CE(_fld02CB) && p._mth02CA(_fld02CB))
	//*   7   16:aload_0         
	//*   8   17:getfield        #22  <Field p _fld02CB>
	//*   9   20:invokestatic    #55  <Method boolean p._mth02CE(p)>
	//*  10   23:ifeq            76
	//*  11   26:aload_0         
	//*  12   27:getfield        #22  <Field p _fld02CB>
	//*  13   30:invokestatic    #58  <Method boolean p._mth02CA(p)>
	//*  14   33:ifeq            76
		{
			p._mth0971(_fld02CB);
	//   15   36:aload_0         
	//   16   37:getfield        #22  <Field p _fld02CB>
	//   17   40:invokestatic    #60  <Method boolean p._mth0971(p)>
	//   18   43:pop             
			try
			{
				p._mth02CB(_fld02CB)._mth02CA(_fld0971);
	//   19   44:aload_0         
	//   20   45:getfield        #22  <Field p _fld02CB>
	//   21   48:invokestatic    #63  <Method p$b p._mth02CB(p)>
	//   22   51:aload_0         
	//   23   52:getfield        #27  <Field WeakReference _fld0971>
	//   24   55:invokeinterface #68  <Method void p$b._mth02CA(WeakReference)>
			}
	//*  25   60:goto            76
			catch(Exception exception)
	//*  26   63:astore_1        
			{
				AFLogger.afErrorLog("Listener threw exception! ", ((Throwable) (exception)));
	//   27   64:ldc1            #70  <String "Listener threw exception! ">
	//   28   66:aload_1         
	//   29   67:invokestatic    #52  <Method void AFLogger.afErrorLog(String, Throwable)>
				((AsyncTask)this).cancel(true);
	//   30   70:aload_0         
	//   31   71:iconst_1        
	//   32   72:invokevirtual   #74  <Method boolean AsyncTask.cancel(boolean)>
	//   33   75:pop             
			}
		}
		((Reference) (_fld0971)).clear();
	//   34   76:aload_0         
	//   35   77:getfield        #27  <Field WeakReference _fld0971>
	//   36   80:invokevirtual   #79  <Method void Reference.clear()>
		return null;
	//   37   83:aconst_null     
	//   38   84:areturn         
	}

	public void _nr_setTrace(Trace trace)
	{
		try
		{
			_nr_trace = trace;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #83  <Field Trace _nr_trace>
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

	protected final Object doInBackground(Object aobj[])
	{
		TraceMachine.enterMethod(_nr_trace, "p$e#doInBackground", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Trace _nr_trace>
	//    2    4:ldc1            #89  <String "p$e#doInBackground">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #95  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "p$e#doInBackground", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #89  <String "p$e#doInBackground">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #95  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		aobj = ((Object []) (_mth02CE()));
	//   10   20:aload_0         
	//   11   21:invokespecial   #97  <Method Void _mth02CE()>
	//   12   24:astore_1        
		TraceMachine.exitMethod();
	//   13   25:invokestatic    #100 <Method void TraceMachine.exitMethod()>
		TraceMachine.unloadTraceContext(((Object) (this)));
	//   14   28:aload_0         
	//   15   29:invokestatic    #104 <Method void TraceMachine.unloadTraceContext(Object)>
		return ((Object) (aobj));
	//   16   32:aload_1         
	//   17   33:areturn         
		aobj;
	//   18   34:astore_1        
		if(true) goto _L3; else goto _L2
_L2:
	//*  19   35:goto            13
	}

	public Trace _nr_trace;
	private p _fld02CB;
	private WeakReference _fld0971;

	public p$e(p p1, WeakReference weakreference)
	{
		_fld02CB = p1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field p _fld02CB>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void AsyncTask()>
		_fld0971 = weakreference;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field WeakReference _fld0971>
	//    8   14:return          
	}
}
