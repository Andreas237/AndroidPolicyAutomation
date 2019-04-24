// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package o:
//			ei, ez, eg

public class fd
{

	public fd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String c(Context context, String s, String s1)
	{
		o/fd;
	//    0    0:ldc1            #2   <Class fd>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		Object obj;
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore          4
		if(context == null)
			break MISSING_BLOCK_LABEL_26;
	//    4    6:aload_0         
	//    5    7:ifnull          26
		boolean flag;
		if(ei.b(s))
			break MISSING_BLOCK_LABEL_26;
	//    6   10:aload_1         
	//    7   11:invokestatic    #19  <Method boolean ei.b(String)>
	//    8   14:ifne            26
		flag = ei.b(s1);
	//    9   17:aload_2         
	//   10   18:invokestatic    #19  <Method boolean ei.b(String)>
	//   11   21:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_31;
	//   12   22:iload_3         
	//   13   23:ifeq            31
		o/fd;
	//   14   26:ldc1            #2   <Class fd>
		JVM INSTR monitorexit ;
	//   15   28:monitorexit     
		return null;
	//   16   29:aconst_null     
	//   17   30:areturn         
		context = ((Context) (ez.a(context, s, s1, "")));
	//   18   31:aload_0         
	//   19   32:aload_1         
	//   20   33:aload_2         
	//   21   34:ldc1            #21  <String "">
	//   22   36:invokestatic    #27  <Method String ez.a(Context, String, String, String)>
	//   23   39:astore_0        
		flag = ei.b(((String) (context)));
	//   24   40:aload_0         
	//   25   41:invokestatic    #19  <Method boolean ei.b(String)>
	//   26   44:istore_3        
		if(!flag)
			break MISSING_BLOCK_LABEL_54;
	//   27   45:iload_3         
	//   28   46:ifeq            54
		o/fd;
	//   29   49:ldc1            #2   <Class fd>
		JVM INSTR monitorexit ;
	//   30   51:monitorexit     
		return null;
	//   31   52:aconst_null     
	//   32   53:areturn         
		try
		{
			context = ((Context) (eg.d(eg.c(), ((String) (context)))));
	//   33   54:invokestatic    #32  <Method String eg.c()>
	//   34   57:aload_0         
	//   35   58:invokestatic    #36  <Method String eg.d(String, String)>
	//   36   61:astore_0        
		}
	//*  37   62:ldc1            #2   <Class fd>
	//*  38   64:monitorexit     
	//*  39   65:aload_0         
	//*  40   66:areturn         
	//*  41   67:astore_0        
	//*  42   68:ldc1            #2   <Class fd>
	//*  43   70:monitorexit     
	//*  44   71:aload_0         
	//*  45   72:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  46   73:astore_0        
		{
			context = ((Context) (obj));
	//   47   74:aload           4
	//   48   76:astore_0        
		}
		o/fd;
		JVM INSTR monitorexit ;
		return ((String) (context));
		context;
		throw context;
	//*  49   77:goto            62
	}

	public static void d(Context context, String s, String s1, String s2)
	{
		o/fd;
	//    0    0:ldc1            #2   <Class fd>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag;
		if(ei.b(s))
			break MISSING_BLOCK_LABEL_25;
	//    2    3:aload_1         
	//    3    4:invokestatic    #19  <Method boolean ei.b(String)>
	//    4    7:ifne            25
		flag = ei.b(s1);
	//    5   10:aload_2         
	//    6   11:invokestatic    #19  <Method boolean ei.b(String)>
	//    7   14:istore          4
		if(!flag && context != null)
			break MISSING_BLOCK_LABEL_29;
	//    8   16:iload           4
	//    9   18:ifne            25
	//   10   21:aload_0         
	//   11   22:ifnonnull       29
		o/fd;
	//   12   25:ldc1            #2   <Class fd>
		JVM INSTR monitorexit ;
	//   13   27:monitorexit     
		return;
	//   14   28:return          
		try
		{
			s2 = eg.b(eg.c(), s2);
	//   15   29:invokestatic    #32  <Method String eg.c()>
	//   16   32:aload_3         
	//   17   33:invokestatic    #39  <Method String eg.b(String, String)>
	//   18   36:astore_3        
			HashMap hashmap = new HashMap();
	//   19   37:new             #41  <Class HashMap>
	//   20   40:dup             
	//   21   41:invokespecial   #42  <Method void HashMap()>
	//   22   44:astore          5
			((Map) (hashmap)).put(((Object) (s1)), ((Object) (s2)));
	//   23   46:aload           5
	//   24   48:aload_2         
	//   25   49:aload_3         
	//   26   50:invokeinterface #48  <Method Object Map.put(Object, Object)>
	//   27   55:pop             
			ez.d(context, s, ((Map) (hashmap)));
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:aload           5
	//   31   60:invokestatic    #51  <Method void ez.d(Context, String, Map)>
		}
	//*  32   63:ldc1            #2   <Class fd>
	//*  33   65:monitorexit     
	//*  34   66:return          
	//*  35   67:astore_0        
	//*  36   68:ldc1            #2   <Class fd>
	//*  37   70:monitorexit     
	//*  38   71:aload_0         
	//*  39   72:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   40   73:astore_0        
		o/fd;
		JVM INSTR monitorexit ;
		return;
		context;
		throw context;
	//*  41   74:goto            63
	}
}
