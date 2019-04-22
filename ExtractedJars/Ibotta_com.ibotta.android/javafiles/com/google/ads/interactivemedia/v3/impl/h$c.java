// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.os.AsyncTask;
import com.google.a.a.*;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import com.google.ads.interactivemedia.v3.impl.data.k;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			h, aa, ab

private class h$c extends AsyncTask
	implements TraceFieldInterface
{

	public void _nr_setTrace(Trace trace)
	{
		try
		{
			_nr_trace = trace;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field Trace _nr_trace>
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

	protected transient String a(Void avoid[])
	{
		String s;
		synchronized(com.google.ads.interactivemedia.v3.impl.h.f(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field h a>
	//*   2    4:invokestatic    #41  <Method Object com.google.ads.interactivemedia.v3.impl.h.f(h)>
	//*   3    7:astore_1        
	//*   4    8:aload_1         
	//*   5    9:monitorenter    
		{
			if(com.google.ads.interactivemedia.v3.impl.h.g(a) == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #22  <Field h a>
	//*   8   14:invokestatic    #45  <Method g com.google.ads.interactivemedia.v3.impl.h.g(h)>
	//*   9   17:ifnonnull       47
				h.a(a, new g(((c) (f.a("a.3.6.0", com.google.ads.interactivemedia.v3.impl.h.c(a))))));
	//   10   20:aload_0         
	//   11   21:getfield        #22  <Field h a>
	//   12   24:new             #47  <Class g>
	//   13   27:dup             
	//   14   28:ldc1            #49  <String "a.3.6.0">
	//   15   30:aload_0         
	//   16   31:getfield        #22  <Field h a>
	//   17   34:invokestatic    #52  <Method android.content.Context com.google.ads.interactivemedia.v3.impl.h.c(h)>
	//   18   37:invokestatic    #57  <Method f f.a(String, android.content.Context)>
	//   19   40:invokespecial   #60  <Method void g(c)>
	//   20   43:invokestatic    #63  <Method g h.a(h, g)>
	//   21   46:pop             
			s = com.google.ads.interactivemedia.v3.impl.h.g(a).a().a(com.google.ads.interactivemedia.v3.impl.h.c(a));
	//   22   47:aload_0         
	//   23   48:getfield        #22  <Field h a>
	//   24   51:invokestatic    #45  <Method g com.google.ads.interactivemedia.v3.impl.h.g(h)>
	//   25   54:invokevirtual   #66  <Method c g.a()>
	//   26   57:aload_0         
	//   27   58:getfield        #22  <Field h a>
	//   28   61:invokestatic    #52  <Method android.content.Context com.google.ads.interactivemedia.v3.impl.h.c(h)>
	//   29   64:invokeinterface #71  <Method String c.a(android.content.Context)>
	//   30   69:astore_2        
		}
	//   31   70:aload_1         
	//   32   71:monitorexit     
		return s;
	//   33   72:aload_2         
	//   34   73:areturn         
		exception;
	//   35   74:astore_2        
		avoid;
	//   36   75:aload_1         
		JVM INSTR monitorexit ;
	//   37   76:monitorexit     
		throw exception;
	//   38   77:aload_2         
	//   39   78:athrow          
	}

	protected void a(String s)
	{
		s = ((String) (k.createFromStreamRequest(b, h.h(a), h.i(a), h.j(a), com.google.ads.interactivemedia.v3.impl.h.k(a), h.l(a), s)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field StreamRequest b>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field h a>
	//    4    8:invokestatic    #76  <Method String h.h(h)>
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field h a>
	//    7   15:invokestatic    #79  <Method String h.i(h)>
	//    8   18:aload_0         
	//    9   19:getfield        #22  <Field h a>
	//   10   22:invokestatic    #83  <Method com.google.ads.interactivemedia.v3.api.ImaSdkSettings h.j(h)>
	//   11   25:aload_0         
	//   12   26:getfield        #22  <Field h a>
	//   13   29:invokestatic    #87  <Method h$b com.google.ads.interactivemedia.v3.impl.h.k(h)>
	//   14   32:aload_0         
	//   15   33:getfield        #22  <Field h a>
	//   16   36:invokestatic    #91  <Method boolean h.l(h)>
	//   17   39:aload_1         
	//   18   40:invokestatic    #97  <Method k k.createFromStreamRequest(StreamRequest, String, String, com.google.ads.interactivemedia.v3.api.ImaSdkSettings, h$b, boolean, String)>
	//   19   43:astore_1        
		s = ((String) (new aa(.adsLoader, .requestStream, c, ((Object) (s)))));
	//   20   44:new             #99  <Class aa>
	//   21   47:dup             
	//   22   48:getstatic       #105 <Field aa$b aa$b.adsLoader>
	//   23   51:getstatic       #111 <Field aa$c aa$c.requestStream>
	//   24   54:aload_0         
	//   25   55:getfield        #29  <Field String c>
	//   26   58:aload_1         
	//   27   59:invokespecial   #114 <Method void aa(aa$b, aa$c, String, Object)>
	//   28   62:astore_1        
		h.b(a).b(((aa) (s)));
	//   29   63:aload_0         
	//   30   64:getfield        #22  <Field h a>
	//   31   67:invokestatic    #117 <Method ab h.b(h)>
	//   32   70:aload_1         
	//   33   71:invokevirtual   #122 <Method void ab.b(aa)>
	//   34   74:return          
	}

	protected Object doInBackground(Object aobj[])
	{
		TraceMachine.enterMethod(_nr_trace, "h$c#doInBackground", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Trace _nr_trace>
	//    2    4:ldc1            #128 <String "h$c#doInBackground">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #134 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "h$c#doInBackground", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #128 <String "h$c#doInBackground">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #134 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		aobj = ((Object []) (a((Void[])aobj)));
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:checkcast       #136 <Class Void[]>
	//   13   25:invokevirtual   #138 <Method String a(Void[])>
	//   14   28:astore_1        
		TraceMachine.exitMethod();
	//   15   29:invokestatic    #141 <Method void TraceMachine.exitMethod()>
		TraceMachine.unloadTraceContext(((Object) (this)));
	//   16   32:aload_0         
	//   17   33:invokestatic    #145 <Method void TraceMachine.unloadTraceContext(Object)>
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

	protected void onPostExecute(Object obj)
	{
		TraceMachine.enterMethod(_nr_trace, "h$c#onPostExecute", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Trace _nr_trace>
	//    2    4:ldc1            #148 <String "h$c#onPostExecute">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #134 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "h$c#onPostExecute", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #148 <String "h$c#onPostExecute">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #134 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		a((String)obj);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:checkcast       #150 <Class String>
	//   13   25:invokevirtual   #152 <Method void a(String)>
		TraceMachine.exitMethod();
	//   14   28:invokestatic    #141 <Method void TraceMachine.exitMethod()>
		return;
	//   15   31:return          
		NoSuchFieldError nosuchfielderror;
		nosuchfielderror;
	//   16   32:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//*  17   33:goto            13
	}

	public Trace _nr_trace;
	final h a;
	private StreamRequest b;
	private String c;

	public h$c(h h1, StreamRequest streamrequest, String s)
	{
		a = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field h a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void AsyncTask()>
		b = streamrequest;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field StreamRequest b>
		c = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field String c>
	//   11   19:return          
	}
}
