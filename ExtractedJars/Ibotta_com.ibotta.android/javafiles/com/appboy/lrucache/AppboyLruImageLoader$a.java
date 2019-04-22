// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.lrucache;

import android.os.AsyncTask;
import bo.app.bd;
import com.appboy.support.AppboyLogger;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;
import java.io.File;

// Referenced classes of package com.appboy.lrucache:
//			AppboyLruImageLoader

class AppboyLruImageLoader$a extends AsyncTask
	implements TraceFieldInterface
{

	public void _nr_setTrace(Trace trace)
	{
		try
		{
			_nr_trace = trace;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field Trace _nr_trace>
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

	protected transient Void a(File afile[])
	{
		Object obj = AppboyLruImageLoader.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field AppboyLruImageLoader a>
	//    2    4:invokestatic    #35  <Method Object AppboyLruImageLoader.a(AppboyLruImageLoader)>
	//    3    7:astore_2        
		obj;
	//    4    8:aload_2         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		afile = ((File []) (afile[0]));
	//    6   10:aload_1         
	//    7   11:iconst_0        
	//    8   12:aaload          
	//    9   13:astore_1        
		try
		{
			AppboyLogger.d(AppboyLruImageLoader.a(), "Initializing disk cache");
	//   10   14:invokestatic    #38  <Method String AppboyLruImageLoader.a()>
	//   11   17:ldc1            #40  <String "Initializing disk cache">
	//   12   19:invokestatic    #46  <Method int AppboyLogger.d(String, String)>
	//   13   22:pop             
			AppboyLruImageLoader.a(a, new bd(((File) (afile)), 1, 1, 0x3200000L));
	//   14   23:aload_0         
	//   15   24:getfield        #18  <Field AppboyLruImageLoader a>
	//   16   27:new             #48  <Class bd>
	//   17   30:dup             
	//   18   31:aload_1         
	//   19   32:iconst_1        
	//   20   33:iconst_1        
	//   21   34:ldc2w           #49  <Long 0x3200000L>
	//   22   37:invokespecial   #53  <Method void bd(File, int, int, long)>
	//   23   40:invokestatic    #56  <Method bd AppboyLruImageLoader.a(AppboyLruImageLoader, bd)>
	//   24   43:pop             
			break MISSING_BLOCK_LABEL_58;
	//   25   44:goto            58
		}
		// Misplaced declaration of an exception variable
		catch(File afile[]) { }
	//   26   47:astore_1        
		AppboyLogger.e(AppboyLruImageLoader.a(), "Caught exception creating new disk cache. Unable to create new disk cache", ((Throwable) (afile)));
	//   27   48:invokestatic    #38  <Method String AppboyLruImageLoader.a()>
	//   28   51:ldc1            #58  <String "Caught exception creating new disk cache. Unable to create new disk cache">
	//   29   53:aload_1         
	//   30   54:invokestatic    #62  <Method int AppboyLogger.e(String, String, Throwable)>
	//   31   57:pop             
		AppboyLruImageLoader.a(a, false);
	//   32   58:aload_0         
	//   33   59:getfield        #18  <Field AppboyLruImageLoader a>
	//   34   62:iconst_0        
	//   35   63:invokestatic    #65  <Method boolean AppboyLruImageLoader.a(AppboyLruImageLoader, boolean)>
	//   36   66:pop             
		AppboyLruImageLoader.a(a).notifyAll();
	//   37   67:aload_0         
	//   38   68:getfield        #18  <Field AppboyLruImageLoader a>
	//   39   71:invokestatic    #35  <Method Object AppboyLruImageLoader.a(AppboyLruImageLoader)>
	//   40   74:invokevirtual   #70  <Method void Object.notifyAll()>
		obj;
	//   41   77:aload_2         
		JVM INSTR monitorexit ;
	//   42   78:monitorexit     
		return null;
	//   43   79:aconst_null     
	//   44   80:areturn         
		afile;
	//   45   81:astore_1        
		obj;
	//   46   82:aload_2         
		JVM INSTR monitorexit ;
	//   47   83:monitorexit     
		throw afile;
	//   48   84:aload_1         
	//   49   85:athrow          
	}

	protected Object doInBackground(Object aobj[])
	{
		TraceMachine.enterMethod(_nr_trace, "AppboyLruImageLoader$a#doInBackground", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Trace _nr_trace>
	//    2    4:ldc1            #76  <String "AppboyLruImageLoader$a#doInBackground">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #82  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "AppboyLruImageLoader$a#doInBackground", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #76  <String "AppboyLruImageLoader$a#doInBackground">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #82  <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		aobj = ((Object []) (a((File[])aobj)));
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:checkcast       #84  <Class File[]>
	//   13   25:invokevirtual   #86  <Method Void a(File[])>
	//   14   28:astore_1        
		TraceMachine.exitMethod();
	//   15   29:invokestatic    #89  <Method void TraceMachine.exitMethod()>
		TraceMachine.unloadTraceContext(((Object) (this)));
	//   16   32:aload_0         
	//   17   33:invokestatic    #93  <Method void TraceMachine.unloadTraceContext(Object)>
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
	final AppboyLruImageLoader a;

	private AppboyLruImageLoader$a(AppboyLruImageLoader appboylruimageloader)
	{
		a = appboylruimageloader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field AppboyLruImageLoader a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void AsyncTask()>
	//    5    9:return          
	}

	AppboyLruImageLoader$a(AppboyLruImageLoader appboylruimageloader, AppboyLruImageLoader$1 appboylruimageloader$1)
	{
		this(appboylruimageloader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void AppboyLruImageLoader$a(AppboyLruImageLoader)>
	//    3    5:return          
	}
}
