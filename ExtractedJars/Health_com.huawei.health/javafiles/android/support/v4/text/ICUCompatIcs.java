// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

class ICUCompatIcs
{

	ICUCompatIcs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
	//    2    4:return          
	}

	private static String addLikelySubtags(Locale locale)
	{
label0:
		{
			locale = ((Locale) (locale.toString()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method String Locale.toString()>
	//    2    4:astore_0        
			String s;
			try
			{
				if(sAddLikelySubtagsMethod == null)
					break label0;
	//    3    5:getstatic       #40  <Field Method sAddLikelySubtagsMethod>
	//    4    8:ifnull          32
				s = (String)sAddLikelySubtagsMethod.invoke(((Object) (null)), new Object[] {
					locale
				});
	//    5   11:getstatic       #40  <Field Method sAddLikelySubtagsMethod>
	//    6   14:aconst_null     
	//    7   15:iconst_1        
	//    8   16:anewarray       Object[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:aload_0         
	//   12   22:aastore         
	//   13   23:invokevirtual   #67  <Method Object Method.invoke(Object, Object[])>
	//   14   26:checkcast       #30  <Class String>
	//   15   29:astore_1        
			}
	//*  16   30:aload_1         
	//*  17   31:areturn         
	//*  18   32:aload_0         
	//*  19   33:areturn         
			catch(IllegalAccessException illegalaccessexception)
	//*  20   34:astore_1        
			{
				Log.w("ICUCompatIcs", ((Throwable) (illegalaccessexception)));
	//   21   35:ldc1            #11  <String "ICUCompatIcs">
	//   22   37:aload_1         
	//   23   38:invokestatic    #46  <Method int Log.w(String, Throwable)>
	//   24   41:pop             
				return ((String) (locale));
	//   25   42:aload_0         
	//   26   43:areturn         
			}
			catch(InvocationTargetException invocationtargetexception)
	//*  27   44:astore_1        
			{
				Log.w("ICUCompatIcs", ((Throwable) (invocationtargetexception)));
	//   28   45:ldc1            #11  <String "ICUCompatIcs">
	//   29   47:aload_1         
	//   30   48:invokestatic    #46  <Method int Log.w(String, Throwable)>
	//   31   51:pop             
				return ((String) (locale));
	//   32   52:aload_0         
	//   33   53:areturn         
			}
			return s;
		}
		return ((String) (locale));
	}

	private static String getScript(String s)
	{
		if(sGetScriptMethod == null)
			break MISSING_BLOCK_LABEL_49;
	//    0    0:getstatic       #36  <Field Method sGetScriptMethod>
	//    1    3:ifnull          27
		s = (String)sGetScriptMethod.invoke(((Object) (null)), new Object[] {
			s
		});
	//    2    6:getstatic       #36  <Field Method sGetScriptMethod>
	//    3    9:aconst_null     
	//    4   10:iconst_1        
	//    5   11:anewarray       Object[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:aload_0         
	//    9   17:aastore         
	//   10   18:invokevirtual   #67  <Method Object Method.invoke(Object, Object[])>
	//   11   21:checkcast       #30  <Class String>
	//   12   24:astore_0        
		return s;
	//   13   25:aload_0         
	//   14   26:areturn         
	//*  15   27:goto            49
		s;
	//   16   30:astore_0        
		Log.w("ICUCompatIcs", ((Throwable) (s)));
	//   17   31:ldc1            #11  <String "ICUCompatIcs">
	//   18   33:aload_0         
	//   19   34:invokestatic    #46  <Method int Log.w(String, Throwable)>
	//   20   37:pop             
		break MISSING_BLOCK_LABEL_49;
	//   21   38:goto            49
		s;
	//   22   41:astore_0        
		Log.w("ICUCompatIcs", ((Throwable) (s)));
	//   23   42:ldc1            #11  <String "ICUCompatIcs">
	//   24   44:aload_0         
	//   25   45:invokestatic    #46  <Method int Log.w(String, Throwable)>
	//   26   48:pop             
		return null;
	//   27   49:aconst_null     
	//   28   50:areturn         
	}

	public static String maximizeAndGetScript(Locale locale)
	{
		locale = ((Locale) (addLikelySubtags(locale)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #71  <Method String addLikelySubtags(Locale)>
	//    2    4:astore_0        
		if(locale != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          14
			return getScript(((String) (locale)));
	//    5    9:aload_0         
	//    6   10:invokestatic    #73  <Method String getScript(String)>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	private static final String TAG = "ICUCompatIcs";
	private static Method sAddLikelySubtagsMethod;
	private static Method sGetScriptMethod;

	static 
	{
		Class class1;
		try
		{
			class1 = Class.forName("libcore.icu.ICU");
	//    0    0:ldc1            #20  <String "libcore.icu.ICU">
	//    1    2:invokestatic    #26  <Method Class Class.forName(String)>
	//    2    5:astore_0        
		}
	//*   3    6:aload_0         
	//*   4    7:ifnull          46
	//*   5   10:aload_0         
	//*   6   11:ldc1            #28  <String "getScript">
	//*   7   13:iconst_1        
	//*   8   14:anewarray       Class[]
	//*   9   17:dup             
	//*  10   18:iconst_0        
	//*  11   19:ldc1            #30  <Class String>
	//*  12   21:aastore         
	//*  13   22:invokevirtual   #34  <Method Method Class.getMethod(String, Class[])>
	//*  14   25:putstatic       #36  <Field Method sGetScriptMethod>
	//*  15   28:aload_0         
	//*  16   29:ldc1            #38  <String "addLikelySubtags">
	//*  17   31:iconst_1        
	//*  18   32:anewarray       Class[]
	//*  19   35:dup             
	//*  20   36:iconst_0        
	//*  21   37:ldc1            #30  <Class String>
	//*  22   39:aastore         
	//*  23   40:invokevirtual   #34  <Method Method Class.getMethod(String, Class[])>
	//*  24   43:putstatic       #40  <Field Method sAddLikelySubtagsMethod>
	//*  25   46:return          
		catch(Exception exception)
	//*  26   47:astore_0        
		{
			sGetScriptMethod = null;
	//   27   48:aconst_null     
	//   28   49:putstatic       #36  <Field Method sGetScriptMethod>
			sAddLikelySubtagsMethod = null;
	//   29   52:aconst_null     
	//   30   53:putstatic       #40  <Field Method sAddLikelySubtagsMethod>
			Log.w("ICUCompatIcs", ((Throwable) (exception)));
	//   31   56:ldc1            #11  <String "ICUCompatIcs">
	//   32   58:aload_0         
	//   33   59:invokestatic    #46  <Method int Log.w(String, Throwable)>
	//   34   62:pop             
	//   35   63:return          
		}
		if(class1 == null)
			break MISSING_BLOCK_LABEL_46;
		sGetScriptMethod = class1.getMethod("getScript", new Class[] {
			java/lang/String
		});
		sAddLikelySubtagsMethod = class1.getMethod("addLikelySubtags", new Class[] {
			java/lang/String
		});
	}
}
