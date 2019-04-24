// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.content.SharedPreferences;

// Referenced classes of package o:
//			ez, ei, eg

public final class dy
{

	public static String b(Context context, String s)
	{
		o/dy;
	//    0    0:ldc1            #2   <Class dy>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		context = ((Context) (ez.a(context, "openapi_file_pri", (new StringBuilder("openApi")).append(s).toString(), "")));
	//    2    3:aload_0         
	//    3    4:ldc1            #8   <String "openapi_file_pri">
	//    4    6:new             #10  <Class StringBuilder>
	//    5    9:dup             
	//    6   10:ldc1            #12  <String "openApi">
	//    7   12:invokespecial   #16  <Method void StringBuilder(String)>
	//    8   15:aload_1         
	//    9   16:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//   10   19:invokevirtual   #24  <Method String StringBuilder.toString()>
	//   11   22:ldc1            #26  <String "">
	//   12   24:invokestatic    #32  <Method String ez.a(Context, String, String, String)>
	//   13   27:astore_0        
		if(!ei.b(((String) (context))))
			break MISSING_BLOCK_LABEL_41;
	//   14   28:aload_0         
	//   15   29:invokestatic    #37  <Method boolean ei.b(String)>
	//   16   32:ifeq            41
		o/dy;
	//   17   35:ldc1            #2   <Class dy>
		JVM INSTR monitorexit ;
	//   18   37:monitorexit     
		return "";
	//   19   38:ldc1            #26  <String "">
	//   20   40:areturn         
		boolean flag;
		context = ((Context) (eg.d(eg.c(), ((String) (context)))));
	//   21   41:invokestatic    #42  <Method String eg.c()>
	//   22   44:aload_0         
	//   23   45:invokestatic    #46  <Method String eg.d(String, String)>
	//   24   48:astore_0        
		flag = ei.b(((String) (context)));
	//   25   49:aload_0         
	//   26   50:invokestatic    #37  <Method boolean ei.b(String)>
	//   27   53:istore_2        
		if(!flag)
			break MISSING_BLOCK_LABEL_64;
	//   28   54:iload_2         
	//   29   55:ifeq            64
		o/dy;
	//   30   58:ldc1            #2   <Class dy>
		JVM INSTR monitorexit ;
	//   31   60:monitorexit     
		return "";
	//   32   61:ldc1            #26  <String "">
	//   33   63:areturn         
		o/dy;
	//   34   64:ldc1            #2   <Class dy>
		JVM INSTR monitorexit ;
	//   35   66:monitorexit     
		return ((String) (context));
	//   36   67:aload_0         
	//   37   68:areturn         
		context;
	//   38   69:astore_0        
	//*  39   70:ldc1            #2   <Class dy>
		throw context;
	//   40   72:monitorexit     
	//   41   73:aload_0         
	//   42   74:athrow          
	}

	public static void b()
	{
		o/dy;
	//    0    0:ldc1            #2   <Class dy>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
	//*   2    3:ldc1            #2   <Class dy>
	//    3    5:monitorexit     
	//    4    6:return          
	}

	public static void c(Context context)
	{
		o/dy;
	//    0    0:ldc1            #2   <Class dy>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		context = ((Context) (context.getSharedPreferences("openapi_file_pri", 0).edit()));
	//    2    3:aload_0         
	//    3    4:ldc1            #8   <String "openapi_file_pri">
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #55  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    6   10:invokeinterface #61  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    7   15:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_34;
	//    8   16:aload_0         
	//    9   17:ifnull          34
		((android.content.SharedPreferences.Editor) (context)).clear();
	//   10   20:aload_0         
	//   11   21:invokeinterface #66  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//   12   26:pop             
		((android.content.SharedPreferences.Editor) (context)).commit();
	//   13   27:aload_0         
	//   14   28:invokeinterface #70  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   15   33:pop             
		o/dy;
	//   16   34:ldc1            #2   <Class dy>
		JVM INSTR monitorexit ;
	//   17   36:monitorexit     
		return;
	//   18   37:return          
		context;
	//   19   38:astore_0        
	//*  20   39:ldc1            #2   <Class dy>
		throw context;
	//   21   41:monitorexit     
	//   22   42:aload_0         
	//   23   43:athrow          
	}

	public static void e(Context context, String s, String s1)
	{
		o/dy;
	//    0    0:ldc1            #2   <Class dy>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		try
		{
			context = ((Context) (context.getSharedPreferences("openapi_file_pri", 0).edit()));
	//    2    3:aload_0         
	//    3    4:ldc1            #8   <String "openapi_file_pri">
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #55  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    6   10:invokeinterface #61  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    7   15:astore_0        
		}
	//*   8   16:aload_0         
	//*   9   17:ifnull          57
	//*  10   20:aload_0         
	//*  11   21:new             #10  <Class StringBuilder>
	//*  12   24:dup             
	//*  13   25:ldc1            #12  <String "openApi">
	//*  14   27:invokespecial   #16  <Method void StringBuilder(String)>
	//*  15   30:aload_1         
	//*  16   31:invokevirtual   #20  <Method StringBuilder StringBuilder.append(String)>
	//*  17   34:invokevirtual   #24  <Method String StringBuilder.toString()>
	//*  18   37:invokestatic    #42  <Method String eg.c()>
	//*  19   40:aload_2         
	//*  20   41:invokestatic    #76  <Method String eg.b(String, String)>
	//*  21   44:invokeinterface #80  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//*  22   49:pop             
	//*  23   50:aload_0         
	//*  24   51:invokeinterface #70  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//*  25   56:pop             
	//*  26   57:ldc1            #2   <Class dy>
	//*  27   59:monitorexit     
	//*  28   60:return          
	//*  29   61:ldc1            #2   <Class dy>
	//*  30   63:monitorexit     
	//*  31   64:return          
	//*  32   65:astore_0        
	//*  33   66:ldc1            #2   <Class dy>
	//*  34   68:monitorexit     
	//*  35   69:aload_0         
	//*  36   70:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return;
		}
		if(context == null)
			break MISSING_BLOCK_LABEL_57;
		((android.content.SharedPreferences.Editor) (context)).putString((new StringBuilder("openApi")).append(s).toString(), eg.b(eg.c(), s1));
		((android.content.SharedPreferences.Editor) (context)).commit();
		o/dy;
		JVM INSTR monitorexit ;
		return;
		context;
		throw context;
	//*  37   71:astore_0        
	//*  38   72:goto            61
	}
}
