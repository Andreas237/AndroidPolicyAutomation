// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import org.json.JSONObject;

// Referenced classes of package o:
//			dv, ei, dt, dh

public final class du
{

	public static dt b(Context context)
	{
		o/du;
	//    0    0:ldc1            #2   <Class du>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		context = ((Context) (dv.c(context, "vkeyid_profiles_v4", "key_deviceid_v4")));
	//    2    3:aload_0         
	//    3    4:ldc1            #8   <String "vkeyid_profiles_v4">
	//    4    6:ldc1            #10  <String "key_deviceid_v4">
	//    5    8:invokestatic    #16  <Method String dv.c(Context, String, String)>
	//    6   11:astore_0        
		if(!ei.b(((String) (context))))
			break MISSING_BLOCK_LABEL_24;
	//    7   12:aload_0         
	//    8   13:invokestatic    #21  <Method boolean ei.b(String)>
	//    9   16:ifeq            24
		o/du;
	//   10   19:ldc1            #2   <Class du>
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		context = ((Context) (b(((String) (context)))));
	//   14   24:aload_0         
	//   15   25:invokestatic    #24  <Method dt b(String)>
	//   16   28:astore_0        
		o/du;
	//   17   29:ldc1            #2   <Class du>
		JVM INSTR monitorexit ;
	//   18   31:monitorexit     
		return ((dt) (context));
	//   19   32:aload_0         
	//   20   33:areturn         
		context;
	//   21   34:astore_0        
	//*  22   35:ldc1            #2   <Class du>
		throw context;
	//   23   37:monitorexit     
	//   24   38:aload_0         
	//   25   39:athrow          
	}

	private static dt b(String s)
	{
		dt dt1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		try
		{
			if(!ei.b(s))
	//*   2    2:aload_0         
	//*   3    3:invokestatic    #21  <Method boolean ei.b(String)>
	//*   4    6:ifne            56
			{
				s = ((String) (new JSONObject(s)));
	//    5    9:new             #29  <Class JSONObject>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #33  <Method void JSONObject(String)>
	//    9   17:astore_0        
				dt1 = new dt(((JSONObject) (s)).optString("apdid"), ((JSONObject) (s)).optString("deviceInfoHash"), ((JSONObject) (s)).optString("timestamp"), ((JSONObject) (s)).optString("tid"), ((JSONObject) (s)).optString("utdid"));
	//   10   18:new             #35  <Class dt>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:ldc1            #37  <String "apdid">
	//   14   25:invokevirtual   #41  <Method String JSONObject.optString(String)>
	//   15   28:aload_0         
	//   16   29:ldc1            #43  <String "deviceInfoHash">
	//   17   31:invokevirtual   #41  <Method String JSONObject.optString(String)>
	//   18   34:aload_0         
	//   19   35:ldc1            #45  <String "timestamp">
	//   20   37:invokevirtual   #41  <Method String JSONObject.optString(String)>
	//   21   40:aload_0         
	//   22   41:ldc1            #47  <String "tid">
	//   23   43:invokevirtual   #41  <Method String JSONObject.optString(String)>
	//   24   46:aload_0         
	//   25   47:ldc1            #49  <String "utdid">
	//   26   49:invokevirtual   #41  <Method String JSONObject.optString(String)>
	//   27   52:invokespecial   #52  <Method void dt(String, String, String, String, String)>
	//   28   55:astore_1        
			}
		}
	//*  29   56:aload_1         
	//*  30   57:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  31   58:astore_0        
		{
			dh.a(((Throwable) (s)));
	//   32   59:aload_0         
	//   33   60:invokestatic    #58  <Method void dh.a(Throwable)>
			return null;
	//   34   63:aconst_null     
	//   35   64:areturn         
		}
		return dt1;
	}

	public static void b()
	{
		o/du;
	//    0    0:ldc1            #2   <Class du>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
	//*   2    3:ldc1            #2   <Class du>
	//    3    5:monitorexit     
	//    4    6:return          
	}

	public static void c(Context context)
	{
		o/du;
	//    0    0:ldc1            #2   <Class du>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		dv.c(context, "vkeyid_profiles_v4", "key_deviceid_v4", "");
	//    2    3:aload_0         
	//    3    4:ldc1            #8   <String "vkeyid_profiles_v4">
	//    4    6:ldc1            #10  <String "key_deviceid_v4">
	//    5    8:ldc1            #62  <String "">
	//    6   10:invokestatic    #65  <Method void dv.c(Context, String, String, String)>
		dv.c("wxcasxx_v4", "key_wxcasxx_v4", "");
	//    7   13:ldc1            #67  <String "wxcasxx_v4">
	//    8   15:ldc1            #69  <String "key_wxcasxx_v4">
	//    9   17:ldc1            #62  <String "">
	//   10   19:invokestatic    #72  <Method void dv.c(String, String, String)>
		o/du;
	//   11   22:ldc1            #2   <Class du>
		JVM INSTR monitorexit ;
	//   12   24:monitorexit     
		return;
	//   13   25:return          
		context;
	//   14   26:astore_0        
	//*  15   27:ldc1            #2   <Class du>
		throw context;
	//   16   29:monitorexit     
	//   17   30:aload_0         
	//   18   31:athrow          
	}

	public static void c(Context context, dt dt1)
	{
		o/du;
	//    0    0:ldc1            #2   <Class du>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		JSONObject jsonobject = new JSONObject();
	//    2    3:new             #29  <Class JSONObject>
	//    3    6:dup             
	//    4    7:invokespecial   #75  <Method void JSONObject()>
	//    5   10:astore_2        
		jsonobject.put("apdid", ((Object) (dt1.e())));
	//    6   11:aload_2         
	//    7   12:ldc1            #37  <String "apdid">
	//    8   14:aload_1         
	//    9   15:invokevirtual   #79  <Method String dt.e()>
	//   10   18:invokevirtual   #83  <Method JSONObject JSONObject.put(String, Object)>
	//   11   21:pop             
		jsonobject.put("deviceInfoHash", ((Object) (dt1.b())));
	//   12   22:aload_2         
	//   13   23:ldc1            #43  <String "deviceInfoHash">
	//   14   25:aload_1         
	//   15   26:invokevirtual   #85  <Method String dt.b()>
	//   16   29:invokevirtual   #83  <Method JSONObject JSONObject.put(String, Object)>
	//   17   32:pop             
		jsonobject.put("timestamp", ((Object) (dt1.c())));
	//   18   33:aload_2         
	//   19   34:ldc1            #45  <String "timestamp">
	//   20   36:aload_1         
	//   21   37:invokevirtual   #87  <Method String dt.c()>
	//   22   40:invokevirtual   #83  <Method JSONObject JSONObject.put(String, Object)>
	//   23   43:pop             
		jsonobject.put("tid", ((Object) (dt1.d())));
	//   24   44:aload_2         
	//   25   45:ldc1            #47  <String "tid">
	//   26   47:aload_1         
	//   27   48:invokevirtual   #90  <Method String dt.d()>
	//   28   51:invokevirtual   #83  <Method JSONObject JSONObject.put(String, Object)>
	//   29   54:pop             
		jsonobject.put("utdid", ((Object) (dt1.a())));
	//   30   55:aload_2         
	//   31   56:ldc1            #49  <String "utdid">
	//   32   58:aload_1         
	//   33   59:invokevirtual   #92  <Method String dt.a()>
	//   34   62:invokevirtual   #83  <Method JSONObject JSONObject.put(String, Object)>
	//   35   65:pop             
		dt1 = ((dt) (jsonobject.toString()));
	//   36   66:aload_2         
	//   37   67:invokevirtual   #95  <Method String JSONObject.toString()>
	//   38   70:astore_1        
		dv.c(context, "vkeyid_profiles_v4", "key_deviceid_v4", ((String) (dt1)));
	//   39   71:aload_0         
	//   40   72:ldc1            #8   <String "vkeyid_profiles_v4">
	//   41   74:ldc1            #10  <String "key_deviceid_v4">
	//   42   76:aload_1         
	//   43   77:invokestatic    #65  <Method void dv.c(Context, String, String, String)>
		dv.c("wxcasxx_v4", "key_wxcasxx_v4", ((String) (dt1)));
	//   44   80:ldc1            #67  <String "wxcasxx_v4">
	//   45   82:ldc1            #69  <String "key_wxcasxx_v4">
	//   46   84:aload_1         
	//   47   85:invokestatic    #72  <Method void dv.c(String, String, String)>
		o/du;
	//   48   88:ldc1            #2   <Class du>
		JVM INSTR monitorexit ;
	//   49   90:monitorexit     
		return;
	//   50   91:return          
		context;
	//   51   92:astore_0        
		dh.a(((Throwable) (context)));
	//   52   93:aload_0         
	//   53   94:invokestatic    #58  <Method void dh.a(Throwable)>
		o/du;
	//   54   97:ldc1            #2   <Class du>
		JVM INSTR monitorexit ;
	//   55   99:monitorexit     
		return;
	//   56  100:return          
		context;
	//   57  101:astore_0        
	//*  58  102:ldc1            #2   <Class du>
		throw context;
	//   59  104:monitorexit     
	//   60  105:aload_0         
	//   61  106:athrow          
	}

	public static dt d(Context context)
	{
		o/du;
	//    0    0:ldc1            #2   <Class du>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		String s = dv.c(context, "vkeyid_profiles_v4", "key_deviceid_v4");
	//    2    3:aload_0         
	//    3    4:ldc1            #8   <String "vkeyid_profiles_v4">
	//    4    6:ldc1            #10  <String "key_deviceid_v4">
	//    5    8:invokestatic    #16  <Method String dv.c(Context, String, String)>
	//    6   11:astore_1        
		context = ((Context) (s));
	//    7   12:aload_1         
	//    8   13:astore_0        
		if(ei.b(s))
	//*   9   14:aload_1         
	//*  10   15:invokestatic    #21  <Method boolean ei.b(String)>
	//*  11   18:ifeq            29
			context = ((Context) (dv.a("wxcasxx_v4", "key_wxcasxx_v4")));
	//   12   21:ldc1            #67  <String "wxcasxx_v4">
	//   13   23:ldc1            #69  <String "key_wxcasxx_v4">
	//   14   25:invokestatic    #98  <Method String dv.a(String, String)>
	//   15   28:astore_0        
		context = ((Context) (b(((String) (context)))));
	//   16   29:aload_0         
	//   17   30:invokestatic    #24  <Method dt b(String)>
	//   18   33:astore_0        
		o/du;
	//   19   34:ldc1            #2   <Class du>
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return ((dt) (context));
	//   21   37:aload_0         
	//   22   38:areturn         
		context;
	//   23   39:astore_0        
	//*  24   40:ldc1            #2   <Class du>
		throw context;
	//   25   42:monitorexit     
	//   26   43:aload_0         
	//   27   44:athrow          
	}

	public static dt e()
	{
		o/du;
	//    0    0:ldc1            #2   <Class du>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj;
		obj = ((Object) (dv.a("wxcasxx_v4", "key_wxcasxx_v4")));
	//    2    3:ldc1            #67  <String "wxcasxx_v4">
	//    3    5:ldc1            #69  <String "key_wxcasxx_v4">
	//    4    7:invokestatic    #98  <Method String dv.a(String, String)>
	//    5   10:astore_0        
		if(!ei.b(((String) (obj))))
			break MISSING_BLOCK_LABEL_23;
	//    6   11:aload_0         
	//    7   12:invokestatic    #21  <Method boolean ei.b(String)>
	//    8   15:ifeq            23
		o/du;
	//    9   18:ldc1            #2   <Class du>
		JVM INSTR monitorexit ;
	//   10   20:monitorexit     
		return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
		obj = ((Object) (b(((String) (obj)))));
	//   13   23:aload_0         
	//   14   24:invokestatic    #24  <Method dt b(String)>
	//   15   27:astore_0        
		o/du;
	//   16   28:ldc1            #2   <Class du>
		JVM INSTR monitorexit ;
	//   17   30:monitorexit     
		return ((dt) (obj));
	//   18   31:aload_0         
	//   19   32:areturn         
		Exception exception;
		exception;
	//   20   33:astore_0        
	//*  21   34:ldc1            #2   <Class du>
		throw exception;
	//   22   36:monitorexit     
	//   23   37:aload_0         
	//   24   38:athrow          
	}
}
