// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import org.json.JSONObject;

// Referenced classes of package o:
//			dv, dr, dh, ei

public final class ds
{

	public static void a(Context context)
	{
		o/ds;
	//    0    0:ldc1            #2   <Class ds>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		dv.c(context, "vkeyid_profiles_v3", "deviceid", "");
	//    2    3:aload_0         
	//    3    4:ldc1            #8   <String "vkeyid_profiles_v3">
	//    4    6:ldc1            #10  <String "deviceid">
	//    5    8:ldc1            #12  <String "">
	//    6   10:invokestatic    #18  <Method void dv.c(Context, String, String, String)>
		dv.c("wxcasxx_v3", "wxcasxx", "");
	//    7   13:ldc1            #20  <String "wxcasxx_v3">
	//    8   15:ldc1            #22  <String "wxcasxx">
	//    9   17:ldc1            #12  <String "">
	//   10   19:invokestatic    #25  <Method void dv.c(String, String, String)>
		o/ds;
	//   11   22:ldc1            #2   <Class ds>
		JVM INSTR monitorexit ;
	//   12   24:monitorexit     
		return;
	//   13   25:return          
		context;
	//   14   26:astore_0        
	//*  15   27:ldc1            #2   <Class ds>
		throw context;
	//   16   29:monitorexit     
	//   17   30:aload_0         
	//   18   31:athrow          
	}

	public static void a(Context context, dr dr1)
	{
		o/ds;
	//    0    0:ldc1            #2   <Class ds>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		JSONObject jsonobject = new JSONObject();
	//    2    3:new             #31  <Class JSONObject>
	//    3    6:dup             
	//    4    7:invokespecial   #35  <Method void JSONObject()>
	//    5   10:astore_2        
		jsonobject.put("apdid", ((Object) (dr1.c())));
	//    6   11:aload_2         
	//    7   12:ldc1            #37  <String "apdid">
	//    8   14:aload_1         
	//    9   15:invokevirtual   #42  <Method String dr.c()>
	//   10   18:invokevirtual   #46  <Method JSONObject JSONObject.put(String, Object)>
	//   11   21:pop             
		jsonobject.put("deviceInfoHash", ((Object) (dr1.b())));
	//   12   22:aload_2         
	//   13   23:ldc1            #48  <String "deviceInfoHash">
	//   14   25:aload_1         
	//   15   26:invokevirtual   #51  <Method String dr.b()>
	//   16   29:invokevirtual   #46  <Method JSONObject JSONObject.put(String, Object)>
	//   17   32:pop             
		jsonobject.put("timestamp", ((Object) (dr1.e())));
	//   18   33:aload_2         
	//   19   34:ldc1            #53  <String "timestamp">
	//   20   36:aload_1         
	//   21   37:invokevirtual   #56  <Method String dr.e()>
	//   22   40:invokevirtual   #46  <Method JSONObject JSONObject.put(String, Object)>
	//   23   43:pop             
		dr1 = ((dr) (jsonobject.toString()));
	//   24   44:aload_2         
	//   25   45:invokevirtual   #59  <Method String JSONObject.toString()>
	//   26   48:astore_1        
		dv.c(context, "vkeyid_profiles_v3", "deviceid", ((String) (dr1)));
	//   27   49:aload_0         
	//   28   50:ldc1            #8   <String "vkeyid_profiles_v3">
	//   29   52:ldc1            #10  <String "deviceid">
	//   30   54:aload_1         
	//   31   55:invokestatic    #18  <Method void dv.c(Context, String, String, String)>
		dv.c("wxcasxx_v3", "wxcasxx", ((String) (dr1)));
	//   32   58:ldc1            #20  <String "wxcasxx_v3">
	//   33   60:ldc1            #22  <String "wxcasxx">
	//   34   62:aload_1         
	//   35   63:invokestatic    #25  <Method void dv.c(String, String, String)>
		o/ds;
	//   36   66:ldc1            #2   <Class ds>
		JVM INSTR monitorexit ;
	//   37   68:monitorexit     
		return;
	//   38   69:return          
		context;
	//   39   70:astore_0        
		dh.a(((Throwable) (context)));
	//   40   71:aload_0         
	//   41   72:invokestatic    #64  <Method void dh.a(Throwable)>
		o/ds;
	//   42   75:ldc1            #2   <Class ds>
		JVM INSTR monitorexit ;
	//   43   77:monitorexit     
		return;
	//   44   78:return          
		context;
	//   45   79:astore_0        
	//*  46   80:ldc1            #2   <Class ds>
		throw context;
	//   47   82:monitorexit     
	//   48   83:aload_0         
	//   49   84:athrow          
	}

	public static void b()
	{
		o/ds;
	//    0    0:ldc1            #2   <Class ds>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
	//*   2    3:ldc1            #2   <Class ds>
	//    3    5:monitorexit     
	//    4    6:return          
	}

	public static dr c(Context context)
	{
		o/ds;
	//    0    0:ldc1            #2   <Class ds>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		String s = dv.c(context, "vkeyid_profiles_v3", "deviceid");
	//    2    3:aload_0         
	//    3    4:ldc1            #8   <String "vkeyid_profiles_v3">
	//    4    6:ldc1            #10  <String "deviceid">
	//    5    8:invokestatic    #68  <Method String dv.c(Context, String, String)>
	//    6   11:astore_1        
		context = ((Context) (s));
	//    7   12:aload_1         
	//    8   13:astore_0        
		if(ei.b(s))
	//*   9   14:aload_1         
	//*  10   15:invokestatic    #73  <Method boolean ei.b(String)>
	//*  11   18:ifeq            29
			context = ((Context) (dv.a("wxcasxx_v3", "wxcasxx")));
	//   12   21:ldc1            #20  <String "wxcasxx_v3">
	//   13   23:ldc1            #22  <String "wxcasxx">
	//   14   25:invokestatic    #76  <Method String dv.a(String, String)>
	//   15   28:astore_0        
		context = ((Context) (d(((String) (context)))));
	//   16   29:aload_0         
	//   17   30:invokestatic    #80  <Method dr d(String)>
	//   18   33:astore_0        
		o/ds;
	//   19   34:ldc1            #2   <Class ds>
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		return ((dr) (context));
	//   21   37:aload_0         
	//   22   38:areturn         
		context;
	//   23   39:astore_0        
	//*  24   40:ldc1            #2   <Class ds>
		throw context;
	//   25   42:monitorexit     
	//   26   43:aload_0         
	//   27   44:athrow          
	}

	private static dr d(String s)
	{
		dr dr1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		try
		{
			if(!ei.b(s))
	//*   2    2:aload_0         
	//*   3    3:invokestatic    #73  <Method boolean ei.b(String)>
	//*   4    6:ifne            44
			{
				s = ((String) (new JSONObject(s)));
	//    5    9:new             #31  <Class JSONObject>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokespecial   #83  <Method void JSONObject(String)>
	//    9   17:astore_0        
				dr1 = new dr(((JSONObject) (s)).optString("apdid"), ((JSONObject) (s)).optString("deviceInfoHash"), ((JSONObject) (s)).optString("timestamp"));
	//   10   18:new             #39  <Class dr>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:ldc1            #37  <String "apdid">
	//   14   25:invokevirtual   #87  <Method String JSONObject.optString(String)>
	//   15   28:aload_0         
	//   16   29:ldc1            #48  <String "deviceInfoHash">
	//   17   31:invokevirtual   #87  <Method String JSONObject.optString(String)>
	//   18   34:aload_0         
	//   19   35:ldc1            #53  <String "timestamp">
	//   20   37:invokevirtual   #87  <Method String JSONObject.optString(String)>
	//   21   40:invokespecial   #89  <Method void dr(String, String, String)>
	//   22   43:astore_1        
			}
		}
	//*  23   44:aload_1         
	//*  24   45:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  25   46:astore_0        
		{
			dh.a(((Throwable) (s)));
	//   26   47:aload_0         
	//   27   48:invokestatic    #64  <Method void dh.a(Throwable)>
			return null;
	//   28   51:aconst_null     
	//   29   52:areturn         
		}
		return dr1;
	}

	public static dr e()
	{
		o/ds;
	//    0    0:ldc1            #2   <Class ds>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj;
		obj = ((Object) (dv.a("wxcasxx_v3", "wxcasxx")));
	//    2    3:ldc1            #20  <String "wxcasxx_v3">
	//    3    5:ldc1            #22  <String "wxcasxx">
	//    4    7:invokestatic    #76  <Method String dv.a(String, String)>
	//    5   10:astore_0        
		if(!ei.b(((String) (obj))))
			break MISSING_BLOCK_LABEL_23;
	//    6   11:aload_0         
	//    7   12:invokestatic    #73  <Method boolean ei.b(String)>
	//    8   15:ifeq            23
		o/ds;
	//    9   18:ldc1            #2   <Class ds>
		JVM INSTR monitorexit ;
	//   10   20:monitorexit     
		return null;
	//   11   21:aconst_null     
	//   12   22:areturn         
		obj = ((Object) (d(((String) (obj)))));
	//   13   23:aload_0         
	//   14   24:invokestatic    #80  <Method dr d(String)>
	//   15   27:astore_0        
		o/ds;
	//   16   28:ldc1            #2   <Class ds>
		JVM INSTR monitorexit ;
	//   17   30:monitorexit     
		return ((dr) (obj));
	//   18   31:aload_0         
	//   19   32:areturn         
		Exception exception;
		exception;
	//   20   33:astore_0        
	//*  21   34:ldc1            #2   <Class ds>
		throw exception;
	//   22   36:monitorexit     
	//   23   37:aload_0         
	//   24   38:athrow          
	}

	public static dr e(Context context)
	{
		o/ds;
	//    0    0:ldc1            #2   <Class ds>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		context = ((Context) (dv.c(context, "vkeyid_profiles_v3", "deviceid")));
	//    2    3:aload_0         
	//    3    4:ldc1            #8   <String "vkeyid_profiles_v3">
	//    4    6:ldc1            #10  <String "deviceid">
	//    5    8:invokestatic    #68  <Method String dv.c(Context, String, String)>
	//    6   11:astore_0        
		if(!ei.b(((String) (context))))
			break MISSING_BLOCK_LABEL_24;
	//    7   12:aload_0         
	//    8   13:invokestatic    #73  <Method boolean ei.b(String)>
	//    9   16:ifeq            24
		o/ds;
	//   10   19:ldc1            #2   <Class ds>
		JVM INSTR monitorexit ;
	//   11   21:monitorexit     
		return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
		context = ((Context) (d(((String) (context)))));
	//   14   24:aload_0         
	//   15   25:invokestatic    #80  <Method dr d(String)>
	//   16   28:astore_0        
		o/ds;
	//   17   29:ldc1            #2   <Class ds>
		JVM INSTR monitorexit ;
	//   18   31:monitorexit     
		return ((dr) (context));
	//   19   32:aload_0         
	//   20   33:areturn         
		context;
	//   21   34:astore_0        
	//*  22   35:ldc1            #2   <Class ds>
		throw context;
	//   23   37:monitorexit     
	//   24   38:aload_0         
	//   25   39:athrow          
	}
}
