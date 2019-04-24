// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package o:
//			dz, dh, dt, ei, 
//			dr

public final class dw
{

	public static String a()
	{
		o/dw;
	//    0    0:ldc1            #2   <Class dw>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		String s = e;
	//    2    3:getstatic       #21  <Field String e>
	//    3    6:astore_0        
		o/dw;
	//    4    7:ldc1            #2   <Class dw>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return s;
	//    6   10:aload_0         
	//    7   11:areturn         
		Exception exception;
		exception;
	//    8   12:astore_0        
	//*   9   13:ldc1            #2   <Class dw>
		throw exception;
	//   10   15:monitorexit     
	//   11   16:aload_0         
	//   12   17:athrow          
	}

	public static void a(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #23  <Field String a>
	//    2    4:return          
	}

	public static boolean a(Context context, String s)
	{
		o/dw;
	//    0    0:ldc1            #2   <Class dw>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		long l1 = dz.c(context);
	//    2    3:aload_0         
	//    3    4:invokestatic    #45  <Method long dz.c(Context)>
	//    4    7:lstore          4
		long l;
		l = l1;
	//    5    9:lload           4
	//    6   11:lstore_2        
		if(l1 < 0L)
	//*   7   12:lload           4
	//*   8   14:lconst_0        
	//*   9   15:lcmp            
	//*  10   16:ifge            23
			l = 0x5265c00L;
	//   11   19:ldc2w           #46  <Long 0x5265c00L>
	//   12   22:lstore_2        
		  goto _L1
	//*  13   23:goto            30
_L3:
		l = 0x5265c00L;
	//   14   26:ldc2w           #46  <Long 0x5265c00L>
	//   15   29:lstore_2        
_L1:
		l1 = Math.abs(System.currentTimeMillis() - dz.k(context, s));
	//   16   30:invokestatic    #53  <Method long System.currentTimeMillis()>
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokestatic    #57  <Method long dz.k(Context, String)>
	//   20   38:lsub            
	//   21   39:invokestatic    #63  <Method long Math.abs(long)>
	//   22   42:lstore          4
		if(l1 >= l)
			break MISSING_BLOCK_LABEL_64;
	//   23   44:lload           4
	//   24   46:lload_2         
	//   25   47:lcmp            
	//   26   48:ifge            56
		o/dw;
	//   27   51:ldc1            #2   <Class dw>
		JVM INSTR monitorexit ;
	//   28   53:monitorexit     
		return true;
	//   29   54:iconst_1        
	//   30   55:ireturn         
	//*  31   56:goto            64
		context;
	//   32   59:astore_0        
		dh.a(((Throwable) (context)));
	//   33   60:aload_0         
	//   34   61:invokestatic    #68  <Method void dh.a(Throwable)>
		o/dw;
	//   35   64:ldc1            #2   <Class dw>
		JVM INSTR monitorexit ;
	//   36   66:monitorexit     
		return false;
	//   37   67:iconst_0        
	//   38   68:ireturn         
		context;
	//   39   69:astore_0        
	//*  40   70:ldc1            #2   <Class dw>
		throw context;
	//   41   72:monitorexit     
	//   42   73:aload_0         
	//   43   74:athrow          
		Throwable throwable;
		throwable;
	//   44   75:astore          6
		if(true) goto _L3; else goto _L2
	//   45   77:goto            26
_L2:
	}

	public static String b()
	{
		o/dw;
	//    0    0:ldc1            #2   <Class dw>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		String s = d;
	//    2    3:getstatic       #27  <Field String d>
	//    3    6:astore_0        
		o/dw;
	//    4    7:ldc1            #2   <Class dw>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return s;
	//    6   10:aload_0         
	//    7   11:areturn         
		Exception exception;
		exception;
	//    8   12:astore_0        
	//*   9   13:ldc1            #2   <Class dw>
		throw exception;
	//   10   15:monitorexit     
	//   11   16:aload_0         
	//   12   17:athrow          
	}

	public static void b(String s)
	{
		c = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #25  <Field String c>
	//    2    4:return          
	}

	public static void b(dt dt1)
	{
		o/dw;
	//    0    0:ldc1            #2   <Class dw>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(dt1 == null)
			break MISSING_BLOCK_LABEL_42;
	//    2    3:aload_0         
	//    3    4:ifnull          42
		b = dt1.e();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #73  <Method String dt.e()>
	//    6   11:putstatic       #19  <Field String b>
		e = dt1.b();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #75  <Method String dt.b()>
	//    9   18:putstatic       #21  <Field String e>
		c = dt1.d();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #77  <Method String dt.d()>
	//   12   25:putstatic       #25  <Field String c>
		d = dt1.a();
	//   13   28:aload_0         
	//   14   29:invokevirtual   #79  <Method String dt.a()>
	//   15   32:putstatic       #27  <Field String d>
		a = dt1.c();
	//   16   35:aload_0         
	//   17   36:invokevirtual   #81  <Method String dt.c()>
	//   18   39:putstatic       #23  <Field String a>
		o/dw;
	//   19   42:ldc1            #2   <Class dw>
		JVM INSTR monitorexit ;
	//   20   44:monitorexit     
		return;
	//   21   45:return          
		dt1;
	//   22   46:astore_0        
	//*  23   47:ldc1            #2   <Class dw>
		throw dt1;
	//   24   49:monitorexit     
	//   25   50:aload_0         
	//   26   51:athrow          
	}

	public static void c()
	{
		o/dw;
	//    0    0:ldc1            #2   <Class dw>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
	//*   2    3:ldc1            #2   <Class dw>
	//    3    5:monitorexit     
	//    4    6:return          
	}

	public static void c(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #19  <Field String b>
	//    2    4:return          
	}

	public static String d()
	{
		o/dw;
	//    0    0:ldc1            #2   <Class dw>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		String s = b;
	//    2    3:getstatic       #19  <Field String b>
	//    3    6:astore_0        
		o/dw;
	//    4    7:ldc1            #2   <Class dw>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return s;
	//    6   10:aload_0         
	//    7   11:areturn         
		Exception exception;
		exception;
	//    8   12:astore_0        
	//*   9   13:ldc1            #2   <Class dw>
		throw exception;
	//   10   15:monitorexit     
	//   11   16:aload_0         
	//   12   17:athrow          
	}

	public static String d(String s)
	{
		o/dw;
	//    0    0:ldc1            #2   <Class dw>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag;
		s = (new StringBuilder("apdidTokenCache")).append(s).toString();
	//    2    3:new             #84  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:ldc1            #86  <String "apdidTokenCache">
	//    5    9:invokespecial   #88  <Method void StringBuilder(String)>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:invokevirtual   #95  <Method String StringBuilder.toString()>
	//    9   19:astore_0        
		if(!i.containsKey(((Object) (s))))
			break MISSING_BLOCK_LABEL_59;
	//   10   20:getstatic       #34  <Field Map i>
	//   11   23:aload_0         
	//   12   24:invokeinterface #101 <Method boolean Map.containsKey(Object)>
	//   13   29:ifeq            59
		s = (String)i.get(((Object) (s)));
	//   14   32:getstatic       #34  <Field Map i>
	//   15   35:aload_0         
	//   16   36:invokeinterface #105 <Method Object Map.get(Object)>
	//   17   41:checkcast       #107 <Class String>
	//   18   44:astore_0        
		flag = ei.a(s);
	//   19   45:aload_0         
	//   20   46:invokestatic    #112 <Method boolean ei.a(String)>
	//   21   49:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_59;
	//   22   50:iload_1         
	//   23   51:ifeq            59
		o/dw;
	//   24   54:ldc1            #2   <Class dw>
		JVM INSTR monitorexit ;
	//   25   56:monitorexit     
		return s;
	//   26   57:aload_0         
	//   27   58:areturn         
		o/dw;
	//   28   59:ldc1            #2   <Class dw>
		JVM INSTR monitorexit ;
	//   29   61:monitorexit     
		return "";
	//   30   62:ldc1            #17  <String "">
	//   31   64:areturn         
		s;
	//   32   65:astore_0        
	//*  33   66:ldc1            #2   <Class dw>
		throw s;
	//   34   68:monitorexit     
	//   35   69:aload_0         
	//   36   70:athrow          
	}

	public static String e()
	{
		o/dw;
	//    0    0:ldc1            #2   <Class dw>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		String s = c;
	//    2    3:getstatic       #25  <Field String c>
	//    3    6:astore_0        
		o/dw;
	//    4    7:ldc1            #2   <Class dw>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return s;
	//    6   10:aload_0         
	//    7   11:areturn         
		Exception exception;
		exception;
	//    8   12:astore_0        
	//*   9   13:ldc1            #2   <Class dw>
		throw exception;
	//   10   15:monitorexit     
	//   11   16:aload_0         
	//   12   17:athrow          
	}

	public static void e(String s)
	{
		e = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #21  <Field String e>
	//    2    4:return          
	}

	public static void e(String s, String s1)
	{
		o/dw;
	//    0    0:ldc1            #2   <Class dw>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		s = (new StringBuilder("apdidTokenCache")).append(s).toString();
	//    2    3:new             #84  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:ldc1            #86  <String "apdidTokenCache">
	//    5    9:invokespecial   #88  <Method void StringBuilder(String)>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:invokevirtual   #95  <Method String StringBuilder.toString()>
	//    9   19:astore_0        
		if(i.containsKey(((Object) (s))))
	//*  10   20:getstatic       #34  <Field Map i>
	//*  11   23:aload_0         
	//*  12   24:invokeinterface #101 <Method boolean Map.containsKey(Object)>
	//*  13   29:ifeq            42
			i.remove(((Object) (s)));
	//   14   32:getstatic       #34  <Field Map i>
	//   15   35:aload_0         
	//   16   36:invokeinterface #116 <Method Object Map.remove(Object)>
	//   17   41:pop             
		i.put(((Object) (s)), ((Object) (s1)));
	//   18   42:getstatic       #34  <Field Map i>
	//   19   45:aload_0         
	//   20   46:aload_1         
	//   21   47:invokeinterface #120 <Method Object Map.put(Object, Object)>
	//   22   52:pop             
		o/dw;
	//   23   53:ldc1            #2   <Class dw>
		JVM INSTR monitorexit ;
	//   24   55:monitorexit     
		return;
	//   25   56:return          
		s;
	//   26   57:astore_0        
	//*  27   58:ldc1            #2   <Class dw>
		throw s;
	//   28   60:monitorexit     
	//   29   61:aload_0         
	//   30   62:athrow          
	}

	public static void e(dr dr1)
	{
		o/dw;
	//    0    0:ldc1            #2   <Class dw>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(dr1 == null)
			break MISSING_BLOCK_LABEL_28;
	//    2    3:aload_0         
	//    3    4:ifnull          28
		b = dr1.c();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #124 <Method String dr.c()>
	//    6   11:putstatic       #19  <Field String b>
		e = dr1.b();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #125 <Method String dr.b()>
	//    9   18:putstatic       #21  <Field String e>
		a = dr1.e();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #126 <Method String dr.e()>
	//   12   25:putstatic       #23  <Field String a>
		o/dw;
	//   13   28:ldc1            #2   <Class dw>
		JVM INSTR monitorexit ;
	//   14   30:monitorexit     
		return;
	//   15   31:return          
		dr1;
	//   16   32:astore_0        
	//*  17   33:ldc1            #2   <Class dw>
		throw dr1;
	//   18   35:monitorexit     
	//   19   36:aload_0         
	//   20   37:athrow          
	}

	public static String f()
	{
		o/dw;
	//    0    0:ldc1            #2   <Class dw>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		String s = a;
	//    2    3:getstatic       #23  <Field String a>
	//    3    6:astore_0        
		o/dw;
	//    4    7:ldc1            #2   <Class dw>
		JVM INSTR monitorexit ;
	//    5    9:monitorexit     
		return s;
	//    6   10:aload_0         
	//    7   11:areturn         
		Exception exception;
		exception;
	//    8   12:astore_0        
	//*   9   13:ldc1            #2   <Class dw>
		throw exception;
	//   10   15:monitorexit     
	//   11   16:aload_0         
	//   12   17:athrow          
	}

	public static void f(String s)
	{
		d = s;
	//    0    0:aload_0         
	//    1    1:putstatic       #27  <Field String d>
	//    2    4:return          
	}

	public static void g()
	{
		i.clear();
	//    0    0:getstatic       #34  <Field Map i>
	//    1    3:invokeinterface #131 <Method void Map.clear()>
		b = "";
	//    2    8:ldc1            #17  <String "">
	//    3   10:putstatic       #19  <Field String b>
		e = "";
	//    4   13:ldc1            #17  <String "">
	//    5   15:putstatic       #21  <Field String e>
		c = "";
	//    6   18:ldc1            #17  <String "">
	//    7   20:putstatic       #25  <Field String c>
		d = "";
	//    8   23:ldc1            #17  <String "">
	//    9   25:putstatic       #27  <Field String d>
		a = "";
	//   10   28:ldc1            #17  <String "">
	//   11   30:putstatic       #23  <Field String a>
	//   12   33:return          
	}

	public static dt k()
	{
		o/dw;
	//    0    0:ldc1            #2   <Class dw>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		dt dt1 = new dt(b, e, a, c, d);
	//    2    3:new             #71  <Class dt>
	//    3    6:dup             
	//    4    7:getstatic       #19  <Field String b>
	//    5   10:getstatic       #21  <Field String e>
	//    6   13:getstatic       #23  <Field String a>
	//    7   16:getstatic       #25  <Field String c>
	//    8   19:getstatic       #27  <Field String d>
	//    9   22:invokespecial   #135 <Method void dt(String, String, String, String, String)>
	//   10   25:astore_0        
		o/dw;
	//   11   26:ldc1            #2   <Class dw>
		JVM INSTR monitorexit ;
	//   12   28:monitorexit     
		return dt1;
	//   13   29:aload_0         
	//   14   30:areturn         
		Exception exception;
		exception;
	//   15   31:astore_0        
	//*  16   32:ldc1            #2   <Class dw>
		throw exception;
	//   17   34:monitorexit     
	//   18   35:aload_0         
	//   19   36:athrow          
	}

	private static String a = "";
	private static String b = "";
	private static String c = "";
	private static String d = "";
	private static String e = "";
	private static Map i = new HashMap();

	static 
	{
	//    0    0:ldc1            #17  <String "">
	//    1    2:putstatic       #19  <Field String b>
	//    2    5:ldc1            #17  <String "">
	//    3    7:putstatic       #21  <Field String e>
	//    4   10:ldc1            #17  <String "">
	//    5   12:putstatic       #23  <Field String a>
	//    6   15:ldc1            #17  <String "">
	//    7   17:putstatic       #25  <Field String c>
	//    8   20:ldc1            #17  <String "">
	//    9   22:putstatic       #27  <Field String d>
	//   10   25:new             #29  <Class HashMap>
	//   11   28:dup             
	//   12   29:invokespecial   #32  <Method void HashMap()>
	//   13   32:putstatic       #34  <Field Map i>
	//*  14   35:return          
	}
}
