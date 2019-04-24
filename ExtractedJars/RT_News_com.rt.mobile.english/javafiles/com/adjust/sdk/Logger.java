// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import android.util.Log;
import java.util.Arrays;
import java.util.Locale;

// Referenced classes of package com.adjust.sdk:
//			ILogger, LogLevel

public class Logger
	implements ILogger
{

	public Logger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		setLogLevel(LogLevel.INFO);
	//    2    4:aload_0         
	//    3    5:getstatic       #23  <Field LogLevel LogLevel.INFO>
	//    4    8:invokevirtual   #27  <Method void setLogLevel(LogLevel)>
	//    5   11:return          
	}

	public transient void Assert(String s, Object aobj[])
	{
		Exception exception;
		try
		{
			Log.println(7, "Adjust", String.format(Locale.US, s, aobj));
	//    0    0:bipush          7
	//    1    2:ldc1            #33  <String "Adjust">
	//    2    4:getstatic       #39  <Field Locale Locale.US>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:invokestatic    #45  <Method String String.format(Locale, String, Object[])>
	//    6   12:invokestatic    #51  <Method int Log.println(int, String, String)>
	//    7   15:pop             
			return;
	//    8   16:return          
		}
	//*   9   17:ldc1            #33  <String "Adjust">
	//*  10   19:getstatic       #39  <Field Locale Locale.US>
	//*  11   22:getstatic       #53  <Field String formatErrorMessage>
	//*  12   25:iconst_2        
	//*  13   26:anewarray       Object[]
	//*  14   29:dup             
	//*  15   30:iconst_0        
	//*  16   31:aload_1         
	//*  17   32:aastore         
	//*  18   33:dup             
	//*  19   34:iconst_1        
	//*  20   35:aload_2         
	//*  21   36:invokestatic    #59  <Method String Arrays.toString(Object[])>
	//*  22   39:aastore         
	//*  23   40:invokestatic    #45  <Method String String.format(Locale, String, Object[])>
	//*  24   43:invokestatic    #63  <Method int Log.e(String, String)>
	//*  25   46:pop             
	//*  26   47:return          
		// Misplaced declaration of an exception variable
		catch(Exception exception)
		{
			Log.e("Adjust", String.format(Locale.US, formatErrorMessage, new Object[] {
				s, Arrays.toString(aobj)
			}));
		}
	//*  27   48:astore_3        
	//*  28   49:goto            17
	}

	public transient void debug(String s, Object aobj[])
	{
		Exception exception;
		if(logLevel.androidLogLevel <= 3)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field LogLevel logLevel>
	//*   2    4:getfield        #70  <Field int LogLevel.androidLogLevel>
	//*   3    7:iconst_3        
	//*   4    8:icmpgt          56
			try
			{
				Log.d("Adjust", String.format(Locale.US, s, aobj));
	//    5   11:ldc1            #33  <String "Adjust">
	//    6   13:getstatic       #39  <Field Locale Locale.US>
	//    7   16:aload_1         
	//    8   17:aload_2         
	//    9   18:invokestatic    #45  <Method String String.format(Locale, String, Object[])>
	//   10   21:invokestatic    #73  <Method int Log.d(String, String)>
	//   11   24:pop             
				return;
	//   12   25:return          
			}
	//*  13   26:ldc1            #33  <String "Adjust">
	//*  14   28:getstatic       #39  <Field Locale Locale.US>
	//*  15   31:getstatic       #53  <Field String formatErrorMessage>
	//*  16   34:iconst_2        
	//*  17   35:anewarray       Object[]
	//*  18   38:dup             
	//*  19   39:iconst_0        
	//*  20   40:aload_1         
	//*  21   41:aastore         
	//*  22   42:dup             
	//*  23   43:iconst_1        
	//*  24   44:aload_2         
	//*  25   45:invokestatic    #59  <Method String Arrays.toString(Object[])>
	//*  26   48:aastore         
	//*  27   49:invokestatic    #45  <Method String String.format(Locale, String, Object[])>
	//*  28   52:invokestatic    #63  <Method int Log.e(String, String)>
	//*  29   55:pop             
	//*  30   56:return          
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				Log.e("Adjust", String.format(Locale.US, formatErrorMessage, new Object[] {
					s, Arrays.toString(aobj)
				}));
			}
	//*  31   57:astore_3        
	//*  32   58:goto            26
	}

	public transient void error(String s, Object aobj[])
	{
		Exception exception;
		if(logLevel.androidLogLevel <= 6)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field LogLevel logLevel>
	//*   2    4:getfield        #70  <Field int LogLevel.androidLogLevel>
	//*   3    7:bipush          6
	//*   4    9:icmpgt          57
			try
			{
				Log.e("Adjust", String.format(Locale.US, s, aobj));
	//    5   12:ldc1            #33  <String "Adjust">
	//    6   14:getstatic       #39  <Field Locale Locale.US>
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:invokestatic    #45  <Method String String.format(Locale, String, Object[])>
	//   10   22:invokestatic    #63  <Method int Log.e(String, String)>
	//   11   25:pop             
				return;
	//   12   26:return          
			}
	//*  13   27:ldc1            #33  <String "Adjust">
	//*  14   29:getstatic       #39  <Field Locale Locale.US>
	//*  15   32:getstatic       #53  <Field String formatErrorMessage>
	//*  16   35:iconst_2        
	//*  17   36:anewarray       Object[]
	//*  18   39:dup             
	//*  19   40:iconst_0        
	//*  20   41:aload_1         
	//*  21   42:aastore         
	//*  22   43:dup             
	//*  23   44:iconst_1        
	//*  24   45:aload_2         
	//*  25   46:invokestatic    #59  <Method String Arrays.toString(Object[])>
	//*  26   49:aastore         
	//*  27   50:invokestatic    #45  <Method String String.format(Locale, String, Object[])>
	//*  28   53:invokestatic    #63  <Method int Log.e(String, String)>
	//*  29   56:pop             
	//*  30   57:return          
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				Log.e("Adjust", String.format(Locale.US, formatErrorMessage, new Object[] {
					s, Arrays.toString(aobj)
				}));
			}
	//*  31   58:astore_3        
	//*  32   59:goto            27
	}

	public transient void info(String s, Object aobj[])
	{
		Exception exception;
		if(logLevel.androidLogLevel <= 4)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field LogLevel logLevel>
	//*   2    4:getfield        #70  <Field int LogLevel.androidLogLevel>
	//*   3    7:iconst_4        
	//*   4    8:icmpgt          56
			try
			{
				Log.i("Adjust", String.format(Locale.US, s, aobj));
	//    5   11:ldc1            #33  <String "Adjust">
	//    6   13:getstatic       #39  <Field Locale Locale.US>
	//    7   16:aload_1         
	//    8   17:aload_2         
	//    9   18:invokestatic    #45  <Method String String.format(Locale, String, Object[])>
	//   10   21:invokestatic    #78  <Method int Log.i(String, String)>
	//   11   24:pop             
				return;
	//   12   25:return          
			}
	//*  13   26:ldc1            #33  <String "Adjust">
	//*  14   28:getstatic       #39  <Field Locale Locale.US>
	//*  15   31:getstatic       #53  <Field String formatErrorMessage>
	//*  16   34:iconst_2        
	//*  17   35:anewarray       Object[]
	//*  18   38:dup             
	//*  19   39:iconst_0        
	//*  20   40:aload_1         
	//*  21   41:aastore         
	//*  22   42:dup             
	//*  23   43:iconst_1        
	//*  24   44:aload_2         
	//*  25   45:invokestatic    #59  <Method String Arrays.toString(Object[])>
	//*  26   48:aastore         
	//*  27   49:invokestatic    #45  <Method String String.format(Locale, String, Object[])>
	//*  28   52:invokestatic    #63  <Method int Log.e(String, String)>
	//*  29   55:pop             
	//*  30   56:return          
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				Log.e("Adjust", String.format(Locale.US, formatErrorMessage, new Object[] {
					s, Arrays.toString(aobj)
				}));
			}
	//*  31   57:astore_3        
	//*  32   58:goto            26
	}

	public void setLogLevel(LogLevel loglevel)
	{
		logLevel = loglevel;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field LogLevel logLevel>
	//    3    5:return          
	}

	public void setLogLevelString(String s)
	{
		IllegalArgumentException illegalargumentexception;
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
			try
			{
				setLogLevel(LogLevel.valueOf(s.toUpperCase(Locale.US)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getstatic       #39  <Field Locale Locale.US>
	//    5    9:invokevirtual   #86  <Method String String.toUpperCase(Locale)>
	//    6   12:invokestatic    #90  <Method LogLevel LogLevel.valueOf(String)>
	//    7   15:invokevirtual   #27  <Method void setLogLevel(LogLevel)>
				return;
	//    8   18:return          
			}
	//*   9   19:aload_0         
	//*  10   20:ldc1            #92  <String "Malformed logLevel '%s', falling back to 'info'">
	//*  11   22:iconst_1        
	//*  12   23:anewarray       Object[]
	//*  13   26:dup             
	//*  14   27:iconst_0        
	//*  15   28:aload_1         
	//*  16   29:aastore         
	//*  17   30:invokevirtual   #94  <Method void error(String, Object[])>
	//*  18   33:return          
			// Misplaced declaration of an exception variable
			catch(IllegalArgumentException illegalargumentexception)
			{
				error("Malformed logLevel '%s', falling back to 'info'", new Object[] {
					s
				});
			}
	//*  19   34:astore_2        
	//*  20   35:goto            19
	}

	public transient void verbose(String s, Object aobj[])
	{
		Exception exception;
		if(logLevel.androidLogLevel <= 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field LogLevel logLevel>
	//*   2    4:getfield        #70  <Field int LogLevel.androidLogLevel>
	//*   3    7:iconst_2        
	//*   4    8:icmpgt          56
			try
			{
				Log.v("Adjust", String.format(Locale.US, s, aobj));
	//    5   11:ldc1            #33  <String "Adjust">
	//    6   13:getstatic       #39  <Field Locale Locale.US>
	//    7   16:aload_1         
	//    8   17:aload_2         
	//    9   18:invokestatic    #45  <Method String String.format(Locale, String, Object[])>
	//   10   21:invokestatic    #98  <Method int Log.v(String, String)>
	//   11   24:pop             
				return;
	//   12   25:return          
			}
	//*  13   26:ldc1            #33  <String "Adjust">
	//*  14   28:getstatic       #39  <Field Locale Locale.US>
	//*  15   31:getstatic       #53  <Field String formatErrorMessage>
	//*  16   34:iconst_2        
	//*  17   35:anewarray       Object[]
	//*  18   38:dup             
	//*  19   39:iconst_0        
	//*  20   40:aload_1         
	//*  21   41:aastore         
	//*  22   42:dup             
	//*  23   43:iconst_1        
	//*  24   44:aload_2         
	//*  25   45:invokestatic    #59  <Method String Arrays.toString(Object[])>
	//*  26   48:aastore         
	//*  27   49:invokestatic    #45  <Method String String.format(Locale, String, Object[])>
	//*  28   52:invokestatic    #63  <Method int Log.e(String, String)>
	//*  29   55:pop             
	//*  30   56:return          
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				Log.e("Adjust", String.format(Locale.US, formatErrorMessage, new Object[] {
					s, Arrays.toString(aobj)
				}));
			}
	//*  31   57:astore_3        
	//*  32   58:goto            26
	}

	public transient void warn(String s, Object aobj[])
	{
		Exception exception;
		if(logLevel.androidLogLevel <= 5)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field LogLevel logLevel>
	//*   2    4:getfield        #70  <Field int LogLevel.androidLogLevel>
	//*   3    7:iconst_5        
	//*   4    8:icmpgt          56
			try
			{
				Log.w("Adjust", String.format(Locale.US, s, aobj));
	//    5   11:ldc1            #33  <String "Adjust">
	//    6   13:getstatic       #39  <Field Locale Locale.US>
	//    7   16:aload_1         
	//    8   17:aload_2         
	//    9   18:invokestatic    #45  <Method String String.format(Locale, String, Object[])>
	//   10   21:invokestatic    #102 <Method int Log.w(String, String)>
	//   11   24:pop             
				return;
	//   12   25:return          
			}
	//*  13   26:ldc1            #33  <String "Adjust">
	//*  14   28:getstatic       #39  <Field Locale Locale.US>
	//*  15   31:getstatic       #53  <Field String formatErrorMessage>
	//*  16   34:iconst_2        
	//*  17   35:anewarray       Object[]
	//*  18   38:dup             
	//*  19   39:iconst_0        
	//*  20   40:aload_1         
	//*  21   41:aastore         
	//*  22   42:dup             
	//*  23   43:iconst_1        
	//*  24   44:aload_2         
	//*  25   45:invokestatic    #59  <Method String Arrays.toString(Object[])>
	//*  26   48:aastore         
	//*  27   49:invokestatic    #45  <Method String String.format(Locale, String, Object[])>
	//*  28   52:invokestatic    #63  <Method int Log.e(String, String)>
	//*  29   55:pop             
	//*  30   56:return          
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				Log.e("Adjust", String.format(Locale.US, formatErrorMessage, new Object[] {
					s, Arrays.toString(aobj)
				}));
			}
	//*  31   57:astore_3        
	//*  32   58:goto            26
	}

	private static String formatErrorMessage = "Error formating log message: %s, with params: %s";
	private LogLevel logLevel;

	static 
	{
	//    0    0:return          
	}
}
