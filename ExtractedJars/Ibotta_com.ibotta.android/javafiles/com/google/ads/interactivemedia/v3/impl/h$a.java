// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.impl;

import android.net.Uri;
import android.os.AsyncTask;
import com.google.a.a.f;
import com.google.a.a.g;
import com.google.a.a.h;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.impl.data.k;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

// Referenced classes of package com.google.ads.interactivemedia.v3.impl:
//			h, aa, ab

private class h$a extends AsyncTask
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

	protected transient String a(String as[])
	{
		String s = as[0];
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aaload          
	//    3    3:astore_3        
		Object obj = com.google.ads.interactivemedia.v3.impl.h.f(a);
	//    4    4:aload_0         
	//    5    5:getfield        #22  <Field com.google.ads.interactivemedia.v3.impl.h a>
	//    6    8:invokestatic    #43  <Method Object com.google.ads.interactivemedia.v3.impl.h.f(com.google.ads.interactivemedia.v3.impl.h)>
	//    7   11:astore          4
		obj;
	//    8   13:aload           4
		JVM INSTR monitorenter ;
	//    9   15:monitorenter    
		if(com.google.ads.interactivemedia.v3.impl.h.g(a) == null)
	//*  10   16:aload_0         
	//*  11   17:getfield        #22  <Field com.google.ads.interactivemedia.v3.impl.h a>
	//*  12   20:invokestatic    #47  <Method g com.google.ads.interactivemedia.v3.impl.h.g(com.google.ads.interactivemedia.v3.impl.h)>
	//*  13   23:ifnonnull       53
			h.a(a, new g(((com.google.a.a.c) (f.a("a.3.6.0", h.c(a))))));
	//   14   26:aload_0         
	//   15   27:getfield        #22  <Field com.google.ads.interactivemedia.v3.impl.h a>
	//   16   30:new             #49  <Class g>
	//   17   33:dup             
	//   18   34:ldc1            #51  <String "a.3.6.0">
	//   19   36:aload_0         
	//   20   37:getfield        #22  <Field com.google.ads.interactivemedia.v3.impl.h a>
	//   21   40:invokestatic    #54  <Method android.content.Context h.c(com.google.ads.interactivemedia.v3.impl.h)>
	//   22   43:invokestatic    #59  <Method f f.a(String, android.content.Context)>
	//   23   46:invokespecial   #62  <Method void g(com.google.a.a.c)>
	//   24   49:invokestatic    #65  <Method g h.a(com.google.ads.interactivemedia.v3.impl.h, g)>
	//   25   52:pop             
		as = ((String []) (s));
	//   26   53:aload_3         
	//   27   54:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_107;
	//   28   55:aload_3         
	//   29   56:ifnull          107
		boolean flag;
		Uri uri;
		uri = Uri.parse(s);
	//   30   59:aload_3         
	//   31   60:invokestatic    #71  <Method Uri Uri.parse(String)>
	//   32   63:astore          5
		flag = com.google.ads.interactivemedia.v3.impl.h.g(a).b(uri);
	//   33   65:aload_0         
	//   34   66:getfield        #22  <Field com.google.ads.interactivemedia.v3.impl.h a>
	//   35   69:invokestatic    #47  <Method g com.google.ads.interactivemedia.v3.impl.h.g(com.google.ads.interactivemedia.v3.impl.h)>
	//   36   72:aload           5
	//   37   74:invokevirtual   #74  <Method boolean g.b(Uri)>
	//   38   77:istore_2        
		as = ((String []) (s));
	//   39   78:aload_3         
	//   40   79:astore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_107;
	//   41   80:iload_2         
	//   42   81:ifeq            107
		try
		{
			as = ((String []) (com.google.ads.interactivemedia.v3.impl.h.g(a).a(uri, h.c(a)).toString()));
	//   43   84:aload_0         
	//   44   85:getfield        #22  <Field com.google.ads.interactivemedia.v3.impl.h a>
	//   45   88:invokestatic    #47  <Method g com.google.ads.interactivemedia.v3.impl.h.g(com.google.ads.interactivemedia.v3.impl.h)>
	//   46   91:aload           5
	//   47   93:aload_0         
	//   48   94:getfield        #22  <Field com.google.ads.interactivemedia.v3.impl.h a>
	//   49   97:invokestatic    #54  <Method android.content.Context h.c(com.google.ads.interactivemedia.v3.impl.h)>
	//   50  100:invokevirtual   #77  <Method Uri g.a(Uri, android.content.Context)>
	//   51  103:invokevirtual   #81  <Method String Uri.toString()>
	//   52  106:astore_1        
		}
	//*  53  107:aload           4
	//*  54  109:monitorexit     
	//*  55  110:aload_1         
	//*  56  111:areturn         
	//*  57  112:astore_1        
	//*  58  113:aload           4
	//*  59  115:monitorexit     
	//*  60  116:aload_1         
	//*  61  117:athrow          
		// Misplaced declaration of an exception variable
		catch(String as[])
	//*  62  118:astore_1        
		{
			as = ((String []) (s));
	//   63  119:aload_3         
	//   64  120:astore_1        
		}
		obj;
		JVM INSTR monitorexit ;
		return ((String) (as));
		as;
		obj;
		JVM INSTR monitorexit ;
		throw as;
	//*  65  121:goto            107
	}

	protected void a(String s)
	{
		b.setAdTagUrl(s);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field AdsRequest b>
	//    2    4:aload_1         
	//    3    5:invokeinterface #87  <Method void AdsRequest.setAdTagUrl(String)>
		s = ((String) (k.create(b, com.google.ads.interactivemedia.v3.impl.h.h(a), h.i(a), h.j(a), com.google.ads.interactivemedia.v3.impl.h.k(a), h.l(a))));
	//    4   10:aload_0         
	//    5   11:getfield        #27  <Field AdsRequest b>
	//    6   14:aload_0         
	//    7   15:getfield        #22  <Field com.google.ads.interactivemedia.v3.impl.h a>
	//    8   18:invokestatic    #91  <Method String com.google.ads.interactivemedia.v3.impl.h.h(com.google.ads.interactivemedia.v3.impl.h)>
	//    9   21:aload_0         
	//   10   22:getfield        #22  <Field com.google.ads.interactivemedia.v3.impl.h a>
	//   11   25:invokestatic    #94  <Method String h.i(com.google.ads.interactivemedia.v3.impl.h)>
	//   12   28:aload_0         
	//   13   29:getfield        #22  <Field com.google.ads.interactivemedia.v3.impl.h a>
	//   14   32:invokestatic    #98  <Method com.google.ads.interactivemedia.v3.api.ImaSdkSettings h.j(com.google.ads.interactivemedia.v3.impl.h)>
	//   15   35:aload_0         
	//   16   36:getfield        #22  <Field com.google.ads.interactivemedia.v3.impl.h a>
	//   17   39:invokestatic    #102 <Method h$b com.google.ads.interactivemedia.v3.impl.h.k(com.google.ads.interactivemedia.v3.impl.h)>
	//   18   42:aload_0         
	//   19   43:getfield        #22  <Field com.google.ads.interactivemedia.v3.impl.h a>
	//   20   46:invokestatic    #106 <Method boolean h.l(com.google.ads.interactivemedia.v3.impl.h)>
	//   21   49:invokestatic    #112 <Method k k.create(AdsRequest, String, String, com.google.ads.interactivemedia.v3.api.ImaSdkSettings, h$b, boolean)>
	//   22   52:astore_1        
		s = ((String) (new aa(.adsLoader, .requestAds, c, ((Object) (s)))));
	//   23   53:new             #114 <Class aa>
	//   24   56:dup             
	//   25   57:getstatic       #120 <Field aa$b aa$b.adsLoader>
	//   26   60:getstatic       #126 <Field aa$c aa$c.requestAds>
	//   27   63:aload_0         
	//   28   64:getfield        #29  <Field String c>
	//   29   67:aload_1         
	//   30   68:invokespecial   #129 <Method void aa(aa$b, aa$c, String, Object)>
	//   31   71:astore_1        
		h.b(a).b(((aa) (s)));
	//   32   72:aload_0         
	//   33   73:getfield        #22  <Field com.google.ads.interactivemedia.v3.impl.h a>
	//   34   76:invokestatic    #132 <Method ab h.b(com.google.ads.interactivemedia.v3.impl.h)>
	//   35   79:aload_1         
	//   36   80:invokevirtual   #137 <Method void ab.b(aa)>
	//   37   83:return          
	}

	protected Object doInBackground(Object aobj[])
	{
		TraceMachine.enterMethod(_nr_trace, "h$a#doInBackground", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Trace _nr_trace>
	//    2    4:ldc1            #143 <String "h$a#doInBackground">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #149 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "h$a#doInBackground", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #143 <String "h$a#doInBackground">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #149 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		aobj = ((Object []) (a((String[])aobj)));
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:checkcast       #151 <Class String[]>
	//   13   25:invokevirtual   #153 <Method String a(String[])>
	//   14   28:astore_1        
		TraceMachine.exitMethod();
	//   15   29:invokestatic    #156 <Method void TraceMachine.exitMethod()>
		TraceMachine.unloadTraceContext(((Object) (this)));
	//   16   32:aload_0         
	//   17   33:invokestatic    #160 <Method void TraceMachine.unloadTraceContext(Object)>
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
		TraceMachine.enterMethod(_nr_trace, "h$a#onPostExecute", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Trace _nr_trace>
	//    2    4:ldc1            #163 <String "h$a#onPostExecute">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #149 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "h$a#onPostExecute", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #163 <String "h$a#onPostExecute">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #149 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		a((String)obj);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:checkcast       #165 <Class String>
	//   13   25:invokevirtual   #167 <Method void a(String)>
		TraceMachine.exitMethod();
	//   14   28:invokestatic    #156 <Method void TraceMachine.exitMethod()>
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
	final com.google.ads.interactivemedia.v3.impl.h a;
	private AdsRequest b;
	private String c;

	public h$a(com.google.ads.interactivemedia.v3.impl.h h1, AdsRequest adsrequest, String s)
	{
		a = h1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field com.google.ads.interactivemedia.v3.impl.h a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void AsyncTask()>
		b = adsrequest;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field AdsRequest b>
		c = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field String c>
	//   11   19:return          
	}
}
