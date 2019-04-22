// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.support;

import android.util.Log;
import bo.app.bz;
import bo.app.eo;

// Referenced classes of package com.appboy.support:
//			StringUtils

public class AppboyLogger
{

	public AppboyLogger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
	//    2    4:return          
	}

	private static void a(String s, String s1, Throwable throwable)
	{
		bz bz1 = a;
	//    0    0:getstatic       #37  <Field bz a>
	//    1    3:astore_3        
		if(bz1 != null && bz1.a() && s != null)
	//*   2    4:aload_3         
	//*   3    5:ifnull          28
	//*   4    8:aload_3         
	//*   5    9:invokevirtual   #42  <Method boolean bz.a()>
	//*   6   12:ifeq            28
	//*   7   15:aload_0         
	//*   8   16:ifnull          28
			a.a(s, s1, throwable);
	//    9   19:getstatic       #37  <Field bz a>
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #44  <Method void bz.a(String, String, Throwable)>
	//   14   28:return          
	}

	public static void checkForSystemLogLevelProperty()
	{
		com/appboy/support/AppboyLogger;
	//    0    0:ldc1            #2   <Class AppboyLogger>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		String s = eo.a("log.tag.APPBOY", "");
	//    2    3:ldc1            #47  <String "log.tag.APPBOY">
	//    3    5:ldc1            #49  <String "">
	//    4    7:invokestatic    #54  <Method String eo.a(String, String)>
	//    5   10:astore_0        
		if(!StringUtils.isNullOrBlank(s) && s.trim().equalsIgnoreCase("verbose"))
	//*   6   11:aload_0         
	//*   7   12:invokestatic    #60  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   8   15:ifne            79
	//*   9   18:aload_0         
	//*  10   19:invokevirtual   #66  <Method String String.trim()>
	//*  11   22:ldc1            #68  <String "verbose">
	//*  12   24:invokevirtual   #71  <Method boolean String.equalsIgnoreCase(String)>
	//*  13   27:ifeq            79
		{
			c = true;
	//   14   30:iconst_1        
	//   15   31:putstatic       #73  <Field boolean c>
			d = 2;
	//   16   34:iconst_2        
	//   17   35:putstatic       #26  <Field int d>
			String s1 = b;
	//   18   38:getstatic       #24  <Field String b>
	//   19   41:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   20   42:new             #75  <Class StringBuilder>
	//   21   45:dup             
	//   22   46:invokespecial   #76  <Method void StringBuilder()>
	//   23   49:astore_2        
			stringbuilder.append("AppboyLogger log level set to ");
	//   24   50:aload_2         
	//   25   51:ldc1            #78  <String "AppboyLogger log level set to ">
	//   26   53:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   27   56:pop             
			stringbuilder.append(s);
	//   28   57:aload_2         
	//   29   58:aload_0         
	//   30   59:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
			stringbuilder.append(" via device system property. Note that subsequent calls to AppboyLogger.setLogLevel() will have no effect.");
	//   32   63:aload_2         
	//   33   64:ldc1            #84  <String " via device system property. Note that subsequent calls to AppboyLogger.setLogLevel() will have no effect.">
	//   34   66:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   35   69:pop             
			i(s1, stringbuilder.toString());
	//   36   70:aload_1         
	//   37   71:aload_2         
	//   38   72:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   39   75:invokestatic    #91  <Method int i(String, String)>
	//   40   78:pop             
		}
		com/appboy/support/AppboyLogger;
	//   41   79:ldc1            #2   <Class AppboyLogger>
		JVM INSTR monitorexit ;
	//   42   81:monitorexit     
		return;
	//   43   82:return          
		Exception exception;
		exception;
	//   44   83:astore_0        
	//*  45   84:ldc1            #2   <Class AppboyLogger>
		throw exception;
	//   46   86:monitorexit     
	//   47   87:aload_0         
	//   48   88:athrow          
	}

	public static int d(String s, String s1)
	{
		return d(s, s1, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokestatic    #94  <Method int d(String, String, boolean)>
	//    4    6:ireturn         
	}

	public static int d(String s, String s1, Throwable throwable)
	{
		return d(s, s1, throwable, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokestatic    #98  <Method int d(String, String, Throwable, boolean)>
	//    5    7:ireturn         
	}

	public static int d(String s, String s1, Throwable throwable, boolean flag)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            10
			a(s, s1, ((Throwable) (null)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokestatic    #99  <Method void a(String, String, Throwable)>
		if(d <= 3)
	//*   6   10:getstatic       #26  <Field int d>
	//*   7   13:iconst_3        
	//*   8   14:icmpgt          34
		{
			if(throwable != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          28
				return Log.d(s, s1, throwable);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokestatic    #103 <Method int Log.d(String, String, Throwable)>
	//   15   27:ireturn         
			else
				return Log.d(s, s1);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokestatic    #105 <Method int Log.d(String, String)>
	//   19   33:ireturn         
		} else
		{
			return 0;
	//   20   34:iconst_0        
	//   21   35:ireturn         
		}
	}

	public static int d(String s, String s1, boolean flag)
	{
		return d(s, s1, ((Throwable) (null)), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iload_2         
	//    4    4:invokestatic    #98  <Method int d(String, String, Throwable, boolean)>
	//    5    7:ireturn         
	}

	public static int e(String s, String s1)
	{
		a(s, s1, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #99  <Method void a(String, String, Throwable)>
		if(d <= 6)
	//*   4    6:getstatic       #26  <Field int d>
	//*   5    9:bipush          6
	//*   6   11:icmpgt          20
			return Log.e(s, s1);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokestatic    #107 <Method int Log.e(String, String)>
	//   10   19:ireturn         
		else
			return 0;
	//   11   20:iconst_0        
	//   12   21:ireturn         
	}

	public static int e(String s, String s1, Throwable throwable)
	{
		a(s, s1, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #99  <Method void a(String, String, Throwable)>
		if(d <= 6)
	//*   4    6:getstatic       #26  <Field int d>
	//*   5    9:bipush          6
	//*   6   11:icmpgt          21
			return Log.e(s, s1, throwable);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:invokestatic    #109 <Method int Log.e(String, String, Throwable)>
	//   11   20:ireturn         
		else
			return 0;
	//   12   21:iconst_0        
	//   13   22:ireturn         
	}

	public static String getAppboyLogTag(Class class1)
	{
		class1 = ((Class) (class1.getName()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #114 <Method String Class.getName()>
	//    2    4:astore_0        
		int j = ((String) (class1)).length();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #118 <Method int String.length()>
	//    5    9:istore_1        
		int k = f;
	//    6   10:getstatic       #30  <Field int f>
	//    7   13:istore_2        
		if(j > k)
	//*   8   14:iload_1         
	//*   9   15:iload_2         
	//*  10   16:icmpgt          22
	//*  11   19:goto            30
			class1 = ((Class) (((String) (class1)).substring(j - k)));
	//   12   22:aload_0         
	//   13   23:iload_1         
	//   14   24:iload_2         
	//   15   25:isub            
	//   16   26:invokevirtual   #122 <Method String String.substring(int)>
	//   17   29:astore_0        
		StringBuilder stringbuilder = new StringBuilder();
	//   18   30:new             #75  <Class StringBuilder>
	//   19   33:dup             
	//   20   34:invokespecial   #76  <Method void StringBuilder()>
	//   21   37:astore_3        
		stringbuilder.append("Appboy v3.1.0 .");
	//   22   38:aload_3         
	//   23   39:ldc1            #124 <String "Appboy v3.1.0 .">
	//   24   41:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   25   44:pop             
		stringbuilder.append(((String) (class1)));
	//   26   45:aload_3         
	//   27   46:aload_0         
	//   28   47:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   29   50:pop             
		return stringbuilder.toString();
	//   30   51:aload_3         
	//   31   52:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   32   55:areturn         
	}

	public static int getLogLevel()
	{
		return d;
	//    0    0:getstatic       #26  <Field int d>
	//    1    3:ireturn         
	}

	public static int i(String s, String s1)
	{
		return i(s, s1, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokestatic    #127 <Method int i(String, String, boolean)>
	//    4    6:ireturn         
	}

	public static int i(String s, String s1, Throwable throwable)
	{
		return i(s, s1, throwable, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokestatic    #129 <Method int i(String, String, Throwable, boolean)>
	//    5    7:ireturn         
	}

	public static int i(String s, String s1, Throwable throwable, boolean flag)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            10
			a(s, s1, ((Throwable) (null)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokestatic    #99  <Method void a(String, String, Throwable)>
		if(d <= 4)
	//*   6   10:getstatic       #26  <Field int d>
	//*   7   13:iconst_4        
	//*   8   14:icmpgt          34
		{
			if(throwable != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          28
				return Log.i(s, s1, throwable);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:invokestatic    #131 <Method int Log.i(String, String, Throwable)>
	//   15   27:ireturn         
			else
				return Log.i(s, s1);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokestatic    #132 <Method int Log.i(String, String)>
	//   19   33:ireturn         
		} else
		{
			return 0;
	//   20   34:iconst_0        
	//   21   35:ireturn         
		}
	}

	public static int i(String s, String s1, boolean flag)
	{
		return i(s, s1, ((Throwable) (null)), flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iload_2         
	//    4    4:invokestatic    #129 <Method int i(String, String, Throwable, boolean)>
	//    5    7:ireturn         
	}

	public static void setLogLevel(int j)
	{
		com/appboy/support/AppboyLogger;
	//    0    0:ldc1            #2   <Class AppboyLogger>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(!c)
	//*   2    3:getstatic       #73  <Field boolean c>
	//*   3    6:ifne            16
		{
			d = j;
	//    4    9:iload_0         
	//    5   10:putstatic       #26  <Field int d>
			break MISSING_BLOCK_LABEL_50;
	//    6   13:goto            50
		}
		String s = b;
	//    7   16:getstatic       #24  <Field String b>
	//    8   19:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    9   20:new             #75  <Class StringBuilder>
	//   10   23:dup             
	//   11   24:invokespecial   #76  <Method void StringBuilder()>
	//   12   27:astore_2        
		stringbuilder.append("Log level already set via system property. AppboyLogger.setLogLevel() ignored for level: ");
	//   13   28:aload_2         
	//   14   29:ldc1            #136 <String "Log level already set via system property. AppboyLogger.setLogLevel() ignored for level: ">
	//   15   31:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
		stringbuilder.append(j);
	//   17   35:aload_2         
	//   18   36:iload_0         
	//   19   37:invokevirtual   #139 <Method StringBuilder StringBuilder.append(int)>
	//   20   40:pop             
		w(s, stringbuilder.toString());
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   24   46:invokestatic    #142 <Method int w(String, String)>
	//   25   49:pop             
		com/appboy/support/AppboyLogger;
	//   26   50:ldc1            #2   <Class AppboyLogger>
		JVM INSTR monitorexit ;
	//   27   52:monitorexit     
		return;
	//   28   53:return          
		Exception exception;
		exception;
	//   29   54:astore_1        
	//*  30   55:ldc1            #2   <Class AppboyLogger>
		throw exception;
	//   31   57:monitorexit     
	//   32   58:aload_1         
	//   33   59:athrow          
	}

	public static void setTestUserDeviceLoggingManager(bz bz1)
	{
		a = bz1;
	//    0    0:aload_0         
	//    1    1:putstatic       #37  <Field bz a>
	//    2    4:return          
	}

	public static int v(String s, String s1)
	{
		if(d <= 2)
	//*   0    0:getstatic       #26  <Field int d>
	//*   1    3:iconst_2        
	//*   2    4:icmpgt          13
			return Log.v(s, s1);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokestatic    #147 <Method int Log.v(String, String)>
	//    6   12:ireturn         
		else
			return 0;
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public static int v(String s, String s1, Throwable throwable)
	{
		if(d <= 2)
	//*   0    0:getstatic       #26  <Field int d>
	//*   1    3:iconst_2        
	//*   2    4:icmpgt          14
			return Log.v(s, s1, throwable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokestatic    #149 <Method int Log.v(String, String, Throwable)>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public static int w(String s, String s1)
	{
		a(s, s1, ((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #99  <Method void a(String, String, Throwable)>
		if(d <= 5)
	//*   4    6:getstatic       #26  <Field int d>
	//*   5    9:iconst_5        
	//*   6   10:icmpgt          19
			return Log.w(s, s1);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokestatic    #150 <Method int Log.w(String, String)>
	//   10   18:ireturn         
		else
			return 0;
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	public static int w(String s, String s1, Throwable throwable)
	{
		a(s, s1, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #99  <Method void a(String, String, Throwable)>
		if(d <= 5)
	//*   4    6:getstatic       #26  <Field int d>
	//*   5    9:iconst_5        
	//*   6   10:icmpgt          20
			return Log.w(s, s1, throwable);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokestatic    #152 <Method int Log.w(String, String, Throwable)>
	//   11   19:ireturn         
		else
			return 0;
	//   12   20:iconst_0        
	//   13   21:ireturn         
	}

	public static int w(String s, Throwable throwable)
	{
		a(s, ((String) (null)), throwable);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokestatic    #99  <Method void a(String, String, Throwable)>
		if(d <= 5)
	//*   4    6:getstatic       #26  <Field int d>
	//*   5    9:iconst_5        
	//*   6   10:icmpgt          19
			return Log.w(s, throwable);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokestatic    #155 <Method int Log.w(String, Throwable)>
	//   10   18:ireturn         
		else
			return 0;
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	public static final int SUPPRESS = 0x7fffffff;
	private static bz a;
	private static final String b = getAppboyLogTag(com/appboy/support/AppboyLogger);
	private static boolean c;
	private static int d = 4;
	private static final int e;
	private static final int f;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyLogger>
	//    1    2:invokestatic    #22  <Method String getAppboyLogTag(Class)>
	//    2    5:putstatic       #24  <Field String b>
	//    3    8:iconst_4        
	//    4    9:putstatic       #26  <Field int d>
		e = 15;
	//    5   12:bipush          15
	//    6   14:putstatic       #28  <Field int e>
		f = 80 - e;
	//    7   17:bipush          80
	//    8   19:getstatic       #28  <Field int e>
	//    9   22:isub            
	//   10   23:putstatic       #30  <Field int f>
	//*  11   26:return          
	}
}
