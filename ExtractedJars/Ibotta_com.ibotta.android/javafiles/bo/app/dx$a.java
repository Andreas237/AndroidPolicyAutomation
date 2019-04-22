// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.os.AsyncTask;
import com.newrelic.agent.android.api.v2.TraceFieldInterface;
import com.newrelic.agent.android.tracing.Trace;
import com.newrelic.agent.android.tracing.TraceMachine;

// Referenced classes of package bo.app:
//			dx, ct

class dx$a extends AsyncTask
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

	protected transient Void a(Void avoid[])
	{
		ct ct1 = new ct();
	//    0    0:new             #34  <Class ct>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void ct()>
	//    3    7:astore_2        
		ct1.b(a.i());
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field dx a>
	//    7   13:invokevirtual   #39  <Method java.util.Set dx.i()>
	//    8   16:invokevirtual   #43  <Method void ct.b(java.util.Set)>
		ct1.a(a.h());
	//    9   19:aload_2         
	//   10   20:aload_0         
	//   11   21:getfield        #18  <Field dx a>
	//   12   24:invokevirtual   #46  <Method java.util.Set dx.h()>
	//   13   27:invokevirtual   #48  <Method void ct.a(java.util.Set)>
		ct1.c(a.j());
	//   14   30:aload_2         
	//   15   31:aload_0         
	//   16   32:getfield        #18  <Field dx a>
	//   17   35:invokevirtual   #51  <Method java.util.Set dx.j()>
	//   18   38:invokevirtual   #54  <Method void ct.c(java.util.Set)>
		ct1.a(a.g());
	//   19   41:aload_2         
	//   20   42:aload_0         
	//   21   43:getfield        #18  <Field dx a>
	//   22   46:invokevirtual   #58  <Method long dx.g()>
	//   23   49:invokevirtual   #61  <Method void ct.a(long)>
		ct1.b(a.f());
	//   24   52:aload_2         
	//   25   53:aload_0         
	//   26   54:getfield        #18  <Field dx a>
	//   27   57:invokevirtual   #64  <Method long dx.f()>
	//   28   60:invokevirtual   #66  <Method void ct.b(long)>
		ct1.a(a.c());
	//   29   63:aload_2         
	//   30   64:aload_0         
	//   31   65:getfield        #18  <Field dx a>
	//   32   68:invokevirtual   #69  <Method int dx.c()>
	//   33   71:invokevirtual   #72  <Method void ct.a(int)>
		ct1.b(a.d());
	//   34   74:aload_2         
	//   35   75:aload_0         
	//   36   76:getfield        #18  <Field dx a>
	//   37   79:invokevirtual   #75  <Method int dx.d()>
	//   38   82:invokevirtual   #77  <Method void ct.b(int)>
		ct1.c(a.e());
	//   39   85:aload_2         
	//   40   86:aload_0         
	//   41   87:getfield        #18  <Field dx a>
	//   42   90:invokevirtual   #80  <Method int dx.e()>
	//   43   93:invokevirtual   #82  <Method void ct.c(int)>
		ct1.a(a.b());
	//   44   96:aload_2         
	//   45   97:aload_0         
	//   46   98:getfield        #18  <Field dx a>
	//   47  101:invokevirtual   #85  <Method boolean dx.b()>
	//   48  104:invokevirtual   #88  <Method void ct.a(boolean)>
		ct1.b(a.a());
	//   49  107:aload_2         
	//   50  108:aload_0         
	//   51  109:getfield        #18  <Field dx a>
	//   52  112:invokevirtual   #90  <Method boolean dx.a()>
	//   53  115:invokevirtual   #92  <Method void ct.b(boolean)>
		ct1.c(a.k());
	//   54  118:aload_2         
	//   55  119:aload_0         
	//   56  120:getfield        #18  <Field dx a>
	//   57  123:invokevirtual   #95  <Method boolean dx.k()>
	//   58  126:invokevirtual   #97  <Method void ct.c(boolean)>
		synchronized(dx.a(a))
	//*  59  129:aload_0         
	//*  60  130:getfield        #18  <Field dx a>
	//*  61  133:invokestatic    #100 <Method Object dx.a(dx)>
	//*  62  136:astore_1        
	//*  63  137:aload_1         
	//*  64  138:monitorenter    
		{
			dx.a(a, ct1);
	//   65  139:aload_0         
	//   66  140:getfield        #18  <Field dx a>
	//   67  143:aload_2         
	//   68  144:invokestatic    #103 <Method ct dx.a(dx, ct)>
	//   69  147:pop             
		}
	//   70  148:aload_1         
	//   71  149:monitorexit     
		return null;
	//   72  150:aconst_null     
	//   73  151:areturn         
		exception;
	//   74  152:astore_2        
		avoid;
	//   75  153:aload_1         
		JVM INSTR monitorexit ;
	//   76  154:monitorexit     
		throw exception;
	//   77  155:aload_2         
	//   78  156:athrow          
	}

	protected Object doInBackground(Object aobj[])
	{
		TraceMachine.enterMethod(_nr_trace, "dx$a#doInBackground", ((java.util.ArrayList) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Trace _nr_trace>
	//    2    4:ldc1            #109 <String "dx$a#doInBackground">
	//    3    6:aconst_null     
	//    4    7:invokestatic    #115 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
		  goto _L1
	//*   5   10:goto            20
_L3:
		TraceMachine.enterMethod(((Trace) (null)), "dx$a#doInBackground", ((java.util.ArrayList) (null)));
	//    6   13:aconst_null     
	//    7   14:ldc1            #109 <String "dx$a#doInBackground">
	//    8   16:aconst_null     
	//    9   17:invokestatic    #115 <Method void TraceMachine.enterMethod(Trace, String, java.util.ArrayList)>
_L1:
		aobj = ((Object []) (a((Void[])aobj)));
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:checkcast       #117 <Class Void[]>
	//   13   25:invokevirtual   #119 <Method Void a(Void[])>
	//   14   28:astore_1        
		TraceMachine.exitMethod();
	//   15   29:invokestatic    #122 <Method void TraceMachine.exitMethod()>
		TraceMachine.unloadTraceContext(((Object) (this)));
	//   16   32:aload_0         
	//   17   33:invokestatic    #126 <Method void TraceMachine.unloadTraceContext(Object)>
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
	final dx a;

	private dx$a(dx dx1)
	{
		a = dx1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field dx a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void AsyncTask()>
	//    5    9:return          
	}

	dx$a(dx dx1, dx$1 dx$1)
	{
		this(dx1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #25  <Method void dx$a(dx)>
	//    3    5:return          
	}
}
