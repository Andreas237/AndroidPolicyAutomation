// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class ICUCompat
{

	private static String addLikelySubtags(Locale locale)
	{
		locale = ((Locale) (locale.toString()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method String Locale.toString()>
	//    2    4:astore_0        
		String s;
		if(sAddLikelySubtagsMethod == null)
			break MISSING_BLOCK_LABEL_50;
	//    3    5:getstatic       #35  <Field Method sAddLikelySubtagsMethod>
	//    4    8:ifnull          50
		s = (String)sAddLikelySubtagsMethod.invoke(((Object) (null)), new Object[] {
			locale
		});
	//    5   11:getstatic       #35  <Field Method sAddLikelySubtagsMethod>
	//    6   14:aconst_null     
	//    7   15:iconst_1        
	//    8   16:anewarray       Object[]
	//    9   19:dup             
	//   10   20:iconst_0        
	//   11   21:aload_0         
	//   12   22:aastore         
	//   13   23:invokevirtual   #71  <Method Object Method.invoke(Object, Object[])>
	//   14   26:checkcast       #45  <Class String>
	//   15   29:astore_1        
		return s;
	//   16   30:aload_1         
	//   17   31:areturn         
		Object obj;
		obj;
	//   18   32:astore_1        
		Log.w("ICUCompat", ((Throwable) (obj)));
	//   19   33:ldc1            #49  <String "ICUCompat">
	//   20   35:aload_1         
	//   21   36:invokestatic    #55  <Method int Log.w(String, Throwable)>
	//   22   39:pop             
		return ((String) (locale));
	//   23   40:aload_0         
	//   24   41:areturn         
		obj;
	//   25   42:astore_1        
		Log.w("ICUCompat", ((Throwable) (obj)));
	//   26   43:ldc1            #49  <String "ICUCompat">
	//   27   45:aload_1         
	//   28   46:invokestatic    #55  <Method int Log.w(String, Throwable)>
	//   29   49:pop             
		return ((String) (locale));
	//   30   50:aload_0         
	//   31   51:areturn         
	}

	private static String getScript(String s)
	{
		if(sGetScriptMethod == null)
			break MISSING_BLOCK_LABEL_45;
	//    0    0:getstatic       #47  <Field Method sGetScriptMethod>
	//    1    3:ifnull          45
		s = (String)sGetScriptMethod.invoke(((Object) (null)), new Object[] {
			s
		});
	//    2    6:getstatic       #47  <Field Method sGetScriptMethod>
	//    3    9:aconst_null     
	//    4   10:iconst_1        
	//    5   11:anewarray       Object[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:aload_0         
	//    9   17:aastore         
	//   10   18:invokevirtual   #71  <Method Object Method.invoke(Object, Object[])>
	//   11   21:checkcast       #45  <Class String>
	//   12   24:astore_0        
		return s;
	//   13   25:aload_0         
	//   14   26:areturn         
		s;
	//   15   27:astore_0        
		Log.w("ICUCompat", ((Throwable) (s)));
	//   16   28:ldc1            #49  <String "ICUCompat">
	//   17   30:aload_0         
	//   18   31:invokestatic    #55  <Method int Log.w(String, Throwable)>
	//   19   34:pop             
		return null;
	//   20   35:aconst_null     
	//   21   36:areturn         
		s;
	//   22   37:astore_0        
		Log.w("ICUCompat", ((Throwable) (s)));
	//   23   38:ldc1            #49  <String "ICUCompat">
	//   24   40:aload_0         
	//   25   41:invokestatic    #55  <Method int Log.w(String, Throwable)>
	//   26   44:pop             
		return null;
	//   27   45:aconst_null     
	//   28   46:areturn         
	}

	public static String maximizeAndGetScript(Locale locale)
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
			break MISSING_BLOCK_LABEL_56;
	//    0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          21
	//    2    5:icmplt          56
		String s = ((Locale)sAddLikelySubtagsMethod.invoke(((Object) (null)), new Object[] {
			locale
		})).getScript();
	//    3    8:getstatic       #35  <Field Method sAddLikelySubtagsMethod>
	//    4   11:aconst_null     
	//    5   12:iconst_1        
	//    6   13:anewarray       Object[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:aload_0         
	//   10   19:aastore         
	//   11   20:invokevirtual   #71  <Method Object Method.invoke(Object, Object[])>
	//   12   23:checkcast       #29  <Class Locale>
	//   13   26:invokevirtual   #76  <Method String Locale.getScript()>
	//   14   29:astore_1        
		return s;
	//   15   30:aload_1         
	//   16   31:areturn         
		Object obj;
		obj;
	//   17   32:astore_1        
		Log.w("ICUCompat", ((Throwable) (obj)));
	//   18   33:ldc1            #49  <String "ICUCompat">
	//   19   35:aload_1         
	//   20   36:invokestatic    #55  <Method int Log.w(String, Throwable)>
	//   21   39:pop             
		break MISSING_BLOCK_LABEL_51;
	//   22   40:goto            51
		obj;
	//   23   43:astore_1        
		Log.w("ICUCompat", ((Throwable) (obj)));
	//   24   44:ldc1            #49  <String "ICUCompat">
	//   25   46:aload_1         
	//   26   47:invokestatic    #55  <Method int Log.w(String, Throwable)>
	//   27   50:pop             
		return locale.getScript();
	//   28   51:aload_0         
	//   29   52:invokevirtual   #76  <Method String Locale.getScript()>
	//   30   55:areturn         
		locale = ((Locale) (addLikelySubtags(locale)));
	//   31   56:aload_0         
	//   32   57:invokestatic    #78  <Method String addLikelySubtags(Locale)>
	//   33   60:astore_0        
		if(locale != null)
	//*  34   61:aload_0         
	//*  35   62:ifnull          70
			return getScript(((String) (locale)));
	//   36   65:aload_0         
	//   37   66:invokestatic    #80  <Method String getScript(String)>
	//   38   69:areturn         
		else
			return null;
	//   39   70:aconst_null     
	//   40   71:areturn         
	}

	private static Method sAddLikelySubtagsMethod;
	private static Method sGetScriptMethod;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          41
		{
			try
			{
				sAddLikelySubtagsMethod = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[] {
					java/util/Locale
				});
	//    3    8:ldc1            #19  <String "libcore.icu.ICU">
	//    4   10:invokestatic    #25  <Method Class Class.forName(String)>
	//    5   13:ldc1            #27  <String "addLikelySubtags">
	//    6   15:iconst_1        
	//    7   16:anewarray       Class[]
	//    8   19:dup             
	//    9   20:iconst_0        
	//   10   21:ldc1            #29  <Class Locale>
	//   11   23:aastore         
	//   12   24:invokevirtual   #33  <Method Method Class.getMethod(String, Class[])>
	//   13   27:putstatic       #35  <Field Method sAddLikelySubtagsMethod>
	//   14   30:return          
			}
			catch(Exception exception)
	//*  15   31:astore_0        
			{
				throw new IllegalStateException(((Throwable) (exception)));
	//   16   32:new             #37  <Class IllegalStateException>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:invokespecial   #41  <Method void IllegalStateException(Throwable)>
	//   20   40:athrow          
			}
			break MISSING_BLOCK_LABEL_104;
		}
		Class class1 = Class.forName("libcore.icu.ICU");
	//   21   41:ldc1            #19  <String "libcore.icu.ICU">
	//   22   43:invokestatic    #25  <Method Class Class.forName(String)>
	//   23   46:astore_0        
		if(class1 != null)
	//*  24   47:aload_0         
	//*  25   48:ifnull          104
			try
			{
				sGetScriptMethod = class1.getMethod("getScript", new Class[] {
					java/lang/String
				});
	//   26   51:aload_0         
	//   27   52:ldc1            #43  <String "getScript">
	//   28   54:iconst_1        
	//   29   55:anewarray       Class[]
	//   30   58:dup             
	//   31   59:iconst_0        
	//   32   60:ldc1            #45  <Class String>
	//   33   62:aastore         
	//   34   63:invokevirtual   #33  <Method Method Class.getMethod(String, Class[])>
	//   35   66:putstatic       #47  <Field Method sGetScriptMethod>
				sAddLikelySubtagsMethod = class1.getMethod("addLikelySubtags", new Class[] {
					java/lang/String
				});
	//   36   69:aload_0         
	//   37   70:ldc1            #27  <String "addLikelySubtags">
	//   38   72:iconst_1        
	//   39   73:anewarray       Class[]
	//   40   76:dup             
	//   41   77:iconst_0        
	//   42   78:ldc1            #45  <Class String>
	//   43   80:aastore         
	//   44   81:invokevirtual   #33  <Method Method Class.getMethod(String, Class[])>
	//   45   84:putstatic       #35  <Field Method sAddLikelySubtagsMethod>
	//   46   87:return          
			}
			catch(Exception exception1)
	//*  47   88:astore_0        
			{
				sGetScriptMethod = null;
	//   48   89:aconst_null     
	//   49   90:putstatic       #47  <Field Method sGetScriptMethod>
				sAddLikelySubtagsMethod = null;
	//   50   93:aconst_null     
	//   51   94:putstatic       #35  <Field Method sAddLikelySubtagsMethod>
				Log.w("ICUCompat", ((Throwable) (exception1)));
	//   52   97:ldc1            #49  <String "ICUCompat">
	//   53   99:aload_0         
	//   54  100:invokestatic    #55  <Method int Log.w(String, Throwable)>
	//   55  103:pop             
			}
	//*  56  104:return          
	}
}
