// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.*;

// Referenced classes of package o:
//			fk, ft, hj, gj, 
//			gr

public final class gp
{

	private gp()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		b = "sdk-and-lite";
	//    2    4:aload_0         
	//    3    5:ldc1            #16  <String "sdk-and-lite">
	//    4    7:putfield        #18  <Field String b>
	//    5   10:return          
	}

	public static String d()
	{
		String s = Long.toHexString(System.currentTimeMillis());
	//    0    0:invokestatic    #26  <Method long System.currentTimeMillis()>
	//    1    3:invokestatic    #32  <Method String Long.toHexString(long)>
	//    2    6:astore_0        
		Random random = new Random();
	//    3    7:new             #34  <Class Random>
	//    4   10:dup             
	//    5   11:invokespecial   #35  <Method void Random()>
	//    6   14:astore_1        
		return (new StringBuilder()).append(s).append(random.nextInt(9000) + 1000).toString();
	//    7   15:new             #37  <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #38  <Method void StringBuilder()>
	//   10   22:aload_0         
	//   11   23:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:aload_1         
	//   13   27:sipush          9000
	//   14   30:invokevirtual   #46  <Method int Random.nextInt(int)>
	//   15   33:sipush          1000
	//   16   36:iadd            
	//   17   37:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   18   40:invokevirtual   #52  <Method String StringBuilder.toString()>
	//   19   43:areturn         
	}

	static String d(Context context, HashMap hashmap)
	{
		String s = "";
	//    0    0:ldc1            #57  <String "">
	//    1    2:astore_2        
		try
		{
			context = ((Context) (fk.e(context, ((java.util.Map) (hashmap)))));
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:invokestatic    #62  <Method String fk.e(Context, java.util.Map)>
	//    5    8:astore_0        
		}
	//*   6    9:goto            23
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   7   12:astore_0        
		{
			ft.e("third", "GetApdidEx", ((Throwable) (context)));
	//    8   13:ldc1            #64  <String "third">
	//    9   15:ldc1            #66  <String "GetApdidEx">
	//   10   17:aload_0         
	//   11   18:invokestatic    #71  <Method void ft.e(String, String, Throwable)>
			context = ((Context) (s));
	//   12   21:aload_2         
	//   13   22:astore_0        
		}
		if(TextUtils.isEmpty(((CharSequence) (context))))
	//*  14   23:aload_0         
	//*  15   24:invokestatic    #77  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   27:ifeq            39
			ft.b("third", "GetApdidNull", "apdid == null");
	//   17   30:ldc1            #64  <String "third">
	//   18   32:ldc1            #79  <String "GetApdidNull">
	//   19   34:ldc1            #81  <String "apdid == null">
	//   20   36:invokestatic    #84  <Method void ft.b(String, String, String)>
		return ((String) (context));
	//   21   39:aload_0         
	//   22   40:areturn         
	}

	public static gp e()
	{
		o/gp;
	//    0    0:ldc1            #2   <Class gp>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		gp gp1;
		if(a == null)
	//*   2    3:getstatic       #89  <Field gp a>
	//*   3    6:ifnonnull       19
			a = new gp();
	//    4    9:new             #2   <Class gp>
	//    5   12:dup             
	//    6   13:invokespecial   #90  <Method void gp()>
	//    7   16:putstatic       #89  <Field gp a>
		gp1 = a;
	//    8   19:getstatic       #89  <Field gp a>
	//    9   22:astore_0        
		o/gp;
	//   10   23:ldc1            #2   <Class gp>
		JVM INSTR monitorexit ;
	//   11   25:monitorexit     
		return gp1;
	//   12   26:aload_0         
	//   13   27:areturn         
		Exception exception;
		exception;
	//   14   28:astore_0        
	//*  15   29:ldc1            #2   <Class gp>
		throw exception;
	//   16   31:monitorexit     
	//   17   32:aload_0         
	//   18   33:athrow          
	}

	public final void a(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(!TextUtils.isEmpty(((CharSequence) (s))))
			break MISSING_BLOCK_LABEL_12;
	//    2    2:aload_1         
	//    3    3:invokestatic    #77  <Method boolean TextUtils.isEmpty(CharSequence)>
	//    4    6:ifeq            12
		this;
	//    5    9:aload_0         
		JVM INSTR monitorexit ;
	//    6   10:monitorexit     
		return;
	//    7   11:return          
		PreferenceManager.getDefaultSharedPreferences(hj.d().c).edit().putString("trideskey", s).commit();
	//    8   12:invokestatic    #96  <Method hj hj.d()>
	//    9   15:getfield        #100 <Field Context hj.c>
	//   10   18:invokestatic    #106 <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//   11   21:invokeinterface #112 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   12   26:ldc1            #114 <String "trideskey">
	//   13   28:aload_1         
	//   14   29:invokeinterface #120 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   15   34:invokeinterface #124 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   16   39:pop             
		gj.b = s;
	//   17   40:aload_1         
	//   18   41:putstatic       #127 <Field String gj.b>
		this;
	//   19   44:aload_0         
		JVM INSTR monitorexit ;
	//   20   45:monitorexit     
		return;
	//   21   46:return          
		s;
	//   22   47:astore_1        
	//*  23   48:aload_0         
		throw s;
	//   24   49:monitorexit     
	//   25   50:aload_1         
	//   26   51:athrow          
	}

	public final String b(Context context, HashMap hashmap)
	{
		context = ((Context) (Executors.newFixedThreadPool(2).submit(((java.util.concurrent.Callable) (new gr(this, context, hashmap))))));
	//    0    0:iconst_2        
	//    1    1:invokestatic    #133 <Method ExecutorService Executors.newFixedThreadPool(int)>
	//    2    4:new             #135 <Class gr>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #138 <Method void gr(gp, Context, HashMap)>
	//    8   14:invokeinterface #144 <Method Future ExecutorService.submit(java.util.concurrent.Callable)>
	//    9   19:astore_1        
		try
		{
			context = ((Context) ((String)((Future) (context)).get(3000L, TimeUnit.MILLISECONDS)));
	//   10   20:aload_1         
	//   11   21:ldc2w           #145 <Long 3000L>
	//   12   24:getstatic       #152 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   13   27:invokeinterface #158 <Method Object Future.get(long, TimeUnit)>
	//   14   32:checkcast       #160 <Class String>
	//   15   35:astore_1        
		}
	//*  16   36:aload_1         
	//*  17   37:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  18   38:astore_1        
		{
			ft.e("third", "GetApdidTimeout", ((Throwable) (context)));
	//   19   39:ldc1            #64  <String "third">
	//   20   41:ldc1            #162 <String "GetApdidTimeout">
	//   21   43:aload_1         
	//   22   44:invokestatic    #71  <Method void ft.e(String, String, Throwable)>
			return "";
	//   23   47:ldc1            #57  <String "">
	//   24   49:areturn         
		}
		return ((String) (context));
	}

	private static gp a;
	public String b;
	public String d;
	public String e;
}
