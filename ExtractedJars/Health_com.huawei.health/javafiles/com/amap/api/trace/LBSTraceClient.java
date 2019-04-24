// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.trace;

import android.content.Context;
import com.amap.api.mapcore.util.*;
import java.util.List;

// Referenced classes of package com.amap.api.trace:
//			LBSTraceBase, TraceListener, TraceStatusListener

public class LBSTraceClient
{

	private LBSTraceClient()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}

	public LBSTraceClient(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		a(context);
	//    2    4:aload_1         
	//    3    5:invokestatic    #33  <Method void a(Context)>
	//    4    8:return          
	}

	private static void a()
	{
		a = null;
	//    0    0:aconst_null     
	//    1    1:putstatic       #35  <Field LBSTraceBase a>
		b = null;
	//    2    4:aconst_null     
	//    3    5:putstatic       #37  <Field LBSTraceClient b>
	//    4    8:return          
	}

	private static void a(Context context)
	{
		if(context != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          66
			try
			{
				com.amap.api.mapcore.util.gy gy = fd.e();
	//    2    4:invokestatic    #45  <Method com.amap.api.mapcore.util.gy fd.e()>
	//    3    7:astore_1        
				Context context1 = context.getApplicationContext();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #51  <Method Context Context.getApplicationContext()>
	//    6   12:astore_2        
				Context context2 = context.getApplicationContext();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #51  <Method Context Context.getApplicationContext()>
	//    9   17:astore_3        
				a = (LBSTraceBase)hy.a(context1, gy, "com.amap.api.wrapper.LBSTraceClientWrapper", com/amap/api/mapcore/util/gk, new Class[] {
					android/content/Context
				}, new Object[] {
					context2
				});
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:ldc1            #53  <String "com.amap.api.wrapper.LBSTraceClientWrapper">
	//   13   22:ldc1            #55  <Class gk>
	//   14   24:iconst_1        
	//   15   25:anewarray       Class[]
	//   16   28:dup             
	//   17   29:iconst_0        
	//   18   30:ldc1            #47  <Class Context>
	//   19   32:aastore         
	//   20   33:iconst_1        
	//   21   34:anewarray       Object[]
	//   22   37:dup             
	//   23   38:iconst_0        
	//   24   39:aload_3         
	//   25   40:aastore         
	//   26   41:invokestatic    #62  <Method Object hy.a(Context, com.amap.api.mapcore.util.gy, String, Class, Class[], Object[])>
	//   27   44:checkcast       #64  <Class LBSTraceBase>
	//   28   47:putstatic       #35  <Field LBSTraceBase a>
				return;
	//   29   50:return          
			}
			catch(Throwable throwable)
	//*  30   51:astore_1        
			{
				a = ((LBSTraceBase) (new gk(context.getApplicationContext())));
	//   31   52:new             #55  <Class gk>
	//   32   55:dup             
	//   33   56:aload_0         
	//   34   57:invokevirtual   #51  <Method Context Context.getApplicationContext()>
	//   35   60:invokespecial   #66  <Method void gk(Context)>
	//   36   63:putstatic       #35  <Field LBSTraceBase a>
			}
	//   37   66:return          
	}

	public static LBSTraceClient getInstance(Context context)
	{
		if(b != null)
			break MISSING_BLOCK_LABEL_41;
	//    0    0:getstatic       #37  <Field LBSTraceClient b>
	//    1    3:ifnonnull       41
		com/amap/api/trace/LBSTraceClient;
	//    2    6:ldc1            #2   <Class LBSTraceClient>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(b == null)
	//*   4    9:getstatic       #37  <Field LBSTraceClient b>
	//*   5   12:ifnonnull       29
		{
			a(context);
	//    6   15:aload_0         
	//    7   16:invokestatic    #33  <Method void a(Context)>
			b = new LBSTraceClient();
	//    8   19:new             #2   <Class LBSTraceClient>
	//    9   22:dup             
	//   10   23:invokespecial   #69  <Method void LBSTraceClient()>
	//   11   26:putstatic       #37  <Field LBSTraceClient b>
		}
		com/amap/api/trace/LBSTraceClient;
	//   12   29:ldc1            #2   <Class LBSTraceClient>
		JVM INSTR monitorexit ;
	//   13   31:monitorexit     
		break MISSING_BLOCK_LABEL_41;
	//   14   32:goto            41
		context;
	//   15   35:astore_0        
	//*  16   36:ldc1            #2   <Class LBSTraceClient>
		throw context;
	//   17   38:monitorexit     
	//   18   39:aload_0         
	//   19   40:athrow          
		return b;
	//   20   41:getstatic       #37  <Field LBSTraceClient b>
	//   21   44:areturn         
	}

	public void destroy()
	{
		if(a != null)
	//*   0    0:getstatic       #35  <Field LBSTraceBase a>
	//*   1    3:ifnull          17
		{
			a.destroy();
	//    2    6:getstatic       #35  <Field LBSTraceBase a>
	//    3    9:invokeinterface #72  <Method void LBSTraceBase.destroy()>
			a();
	//    4   14:invokestatic    #74  <Method void a()>
		}
	//    5   17:return          
	}

	public void queryProcessedTrace(int i, List list, int j, TraceListener tracelistener)
	{
		if(a != null)
	//*   0    0:getstatic       #35  <Field LBSTraceBase a>
	//*   1    3:ifnull          19
			a.queryProcessedTrace(i, list, j, tracelistener);
	//    2    6:getstatic       #35  <Field LBSTraceBase a>
	//    3    9:iload_1         
	//    4   10:aload_2         
	//    5   11:iload_3         
	//    6   12:aload           4
	//    7   14:invokeinterface #78  <Method void LBSTraceBase.queryProcessedTrace(int, List, int, TraceListener)>
	//    8   19:return          
	}

	public void startTrace(TraceStatusListener tracestatuslistener)
	{
		if(a != null)
	//*   0    0:getstatic       #35  <Field LBSTraceBase a>
	//*   1    3:ifnull          15
			a.startTrace(tracestatuslistener);
	//    2    6:getstatic       #35  <Field LBSTraceBase a>
	//    3    9:aload_1         
	//    4   10:invokeinterface #84  <Method void LBSTraceBase.startTrace(TraceStatusListener)>
	//    5   15:return          
	}

	public void stopTrace()
	{
		if(a != null)
	//*   0    0:getstatic       #35  <Field LBSTraceBase a>
	//*   1    3:ifnull          14
			a.stopTrace();
	//    2    6:getstatic       #35  <Field LBSTraceBase a>
	//    3    9:invokeinterface #87  <Method void LBSTraceBase.stopTrace()>
	//    4   14:return          
	}

	public static final String LOCATE_TIMEOUT_ERROR = "\u5B9A\u4F4D\u8D85\u65F6";
	public static final String MIN_GRASP_POINT_ERROR = "\u8F68\u8FF9\u70B9\u592A\u5C11\u6216\u8DDD\u79BB\u592A\u8FD1,\u8F68\u8FF9\u7EA0\u504F\u5931\u8D25";
	public static final String TRACE_SUCCESS = "\u7EA0\u504F\u6210\u529F";
	public static final int TYPE_AMAP = 1;
	public static final int TYPE_BAIDU = 3;
	public static final int TYPE_GPS = 2;
	private static LBSTraceBase a;
	private static volatile LBSTraceClient b;
}
