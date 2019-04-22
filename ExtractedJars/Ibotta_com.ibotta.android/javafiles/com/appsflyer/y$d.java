// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

// Referenced classes of package com.appsflyer:
//			y, AFLogger, AppsFlyerProperties, d

static final class y$d extends AsyncTask
	implements TraceFieldInterface
{

	private transient String _mth02CE()
	{
		String s = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		try
		{
			if(_fld02CE != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #33  <Field String _fld02CE>
	//*   4    6:ifnull          21
				s = y._mth0971(_fld02CB, _fld02CE);
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field WeakReference _fld02CB>
	//    7   13:aload_0         
	//    8   14:getfield        #33  <Field String _fld02CE>
	//    9   17:invokestatic    #37  <Method String y._mth0971(WeakReference, String)>
	//   10   20:astore_1        
		}
	//*  11   21:aload_1         
	//*  12   22:areturn         
		catch(Throwable throwable)
	//*  13   23:astore_1        
		{
			AFLogger.afErrorLog("Error registering for uninstall feature", throwable);
	//   14   24:ldc1            #39  <String "Error registering for uninstall feature">
	//   15   26:aload_1         
	//   16   27:invokestatic    #45  <Method void AFLogger.afErrorLog(String, Throwable)>
			return null;
	//   17   30:aconst_null     
	//   18   31:areturn         
		}
		return s;
	}

	public void _nr_setTrace(Trace trace)
	{
		try
		{
			_nr_trace = trace;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field Trace _nr_trace>
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
		TraceMachine.enterMethod(_nr_trace, "y$d#doInBackground", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Trace _nr_trace>
	//    2    4:ldc1            #57  <String "y$d#doInBackground">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #63  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "y$d#doInBackground", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #57  <String "y$d#doInBackground">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #63  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		aobj = ((Object []) (_mth02CE()));
	//   10   20:aload_0         
	//   11   21:invokespecial   #65  <Method String _mth02CE()>
	//   12   24:astore_1        
		TraceMachine.exitMethod();
	//   13   25:invokestatic    #68  <Method void TraceMachine.exitMethod()>
		TraceMachine.unloadTraceContext(((Object) (this)));
	//   14   28:aload_0         
	//   15   29:invokestatic    #72  <Method void TraceMachine.unloadTraceContext(Object)>
		return ((Object) (aobj));
	//   16   32:aload_1         
	//   17   33:areturn         
		aobj;
	//   18   34:astore_1        
		if(true) goto _L3; else goto _L2
_L2:
	//*  19   35:goto            13
	}

	protected final void onPostExecute(Object obj)
	{
		TraceMachine.enterMethod(_nr_trace, "y$d#onPostExecute", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Trace _nr_trace>
	//    2    4:ldc1            #75  <String "y$d#onPostExecute">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #63  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "y$d#onPostExecute", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #75  <String "y$d#onPostExecute">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #63  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		Object obj1 = ((Object) ((String)obj));
	//   10   20:aload_1         
	//   11   21:checkcast       #77  <Class String>
	//   12   24:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (obj1))))
	//*  13   25:aload_2         
	//*  14   26:invokestatic    #83  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   29:ifne            99
		{
			obj = ((Object) (AppsFlyerProperties.getInstance().getString("afUninstallToken")));
	//   16   32:invokestatic    #89  <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   17   35:ldc1            #91  <String "afUninstallToken">
	//   18   37:invokevirtual   #95  <Method String AppsFlyerProperties.getString(String)>
	//   19   40:astore_1        
			obj1 = ((Object) (new d(((String) (obj1)))));
	//   20   41:new             #97  <Class d>
	//   21   44:dup             
	//   22   45:aload_2         
	//   23   46:invokespecial   #100 <Method void d(String)>
	//   24   49:astore_2        
			if(obj == null)
	//*  25   50:aload_1         
	//*  26   51:ifnonnull       72
			{
				y._mth02CA((Context)((Reference) (_fld02CB)).get(), ((d) (obj1)));
	//   27   54:aload_0         
	//   28   55:getfield        #25  <Field WeakReference _fld02CB>
	//   29   58:invokevirtual   #106 <Method Object Reference.get()>
	//   30   61:checkcast       #108 <Class Context>
	//   31   64:aload_2         
	//   32   65:invokestatic    #112 <Method void y._mth02CA(Context, d)>
				TraceMachine.exitMethod();
	//   33   68:invokestatic    #68  <Method void TraceMachine.exitMethod()>
				return;
	//   34   71:return          
			}
			obj = ((Object) (com.appsflyer.d._mth02CA(((String) (obj)))));
	//   35   72:aload_1         
	//   36   73:invokestatic    #115 <Method d d._mth02CA(String)>
	//   37   76:astore_1        
			if(((d) (obj))._mth02CF(((d) (obj1))))
	//*  38   77:aload_1         
	//*  39   78:aload_2         
	//*  40   79:invokevirtual   #119 <Method boolean d._mth02CF(d)>
	//*  41   82:ifeq            99
				y._mth02CA((Context)((Reference) (_fld02CB)).get(), ((d) (obj)));
	//   42   85:aload_0         
	//   43   86:getfield        #25  <Field WeakReference _fld02CB>
	//   44   89:invokevirtual   #106 <Method Object Reference.get()>
	//   45   92:checkcast       #108 <Class Context>
	//   46   95:aload_1         
	//   47   96:invokestatic    #112 <Method void y._mth02CA(Context, d)>
		}
		TraceMachine.exitMethod();
	//   48   99:invokestatic    #68  <Method void TraceMachine.exitMethod()>
		return;
	//   49  102:return          
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   50  103:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  51  104:goto            13
	}

	protected final void onPreExecute()
	{
		super.onPreExecute();
	//    0    0:aload_0         
	//    1    1:invokespecial   #122 <Method void AsyncTask.onPreExecute()>
		_fld02CE = AppsFlyerProperties.getInstance().getString("gcmProjectNumber");
	//    2    4:aload_0         
	//    3    5:invokestatic    #89  <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//    4    8:ldc1            #124 <String "gcmProjectNumber">
	//    5   10:invokevirtual   #95  <Method String AppsFlyerProperties.getString(String)>
	//    6   13:putfield        #33  <Field String _fld02CE>
	//    7   16:return          
	}

	public Trace _nr_trace;
	private final WeakReference _fld02CB;
	private String _fld02CE;

	y$d(WeakReference weakreference)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void AsyncTask()>
		_fld02CB = weakreference;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field WeakReference _fld02CB>
	//    5    9:return          
	}
}
