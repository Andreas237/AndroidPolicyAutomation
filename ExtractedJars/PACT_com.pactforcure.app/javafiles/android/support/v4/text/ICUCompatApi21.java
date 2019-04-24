// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

class ICUCompatApi21
{

	ICUCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:return          
	}

	public static String maximizeAndGetScript(Locale locale)
	{
		String s = ((Locale)sAddLikelySubtagsMethod.invoke(((Object) (null)), new Object[] {
			locale
		})).getScript();
	//    0    0:getstatic       #35  <Field Method sAddLikelySubtagsMethod>
	//    1    3:aconst_null     
	//    2    4:iconst_1        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:aastore         
	//    8   12:invokevirtual   #56  <Method Object Method.invoke(Object, Object[])>
	//    9   15:checkcast       #29  <Class Locale>
	//   10   18:invokevirtual   #60  <Method String Locale.getScript()>
	//   11   21:astore_1        
		return s;
	//   12   22:aload_1         
	//   13   23:areturn         
		Object obj;
		obj;
	//   14   24:astore_1        
		Log.w("ICUCompatApi21", ((Throwable) (obj)));
	//   15   25:ldc1            #11  <String "ICUCompatApi21">
	//   16   27:aload_1         
	//   17   28:invokestatic    #66  <Method int Log.w(String, Throwable)>
	//   18   31:pop             
_L2:
		return locale.getScript();
	//   19   32:aload_0         
	//   20   33:invokevirtual   #60  <Method String Locale.getScript()>
	//   21   36:areturn         
		obj;
	//   22   37:astore_1        
		Log.w("ICUCompatApi21", ((Throwable) (obj)));
	//   23   38:ldc1            #11  <String "ICUCompatApi21">
	//   24   40:aload_1         
	//   25   41:invokestatic    #66  <Method int Log.w(String, Throwable)>
	//   26   44:pop             
		if(true) goto _L2; else goto _L1
	//   27   45:goto            32
_L1:
	}

	private static final String TAG = "ICUCompatApi21";
	private static Method sAddLikelySubtagsMethod;

	static 
	{
		try
		{
			sAddLikelySubtagsMethod = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", new Class[] {
				java/util/Locale
			});
	//    0    0:ldc1            #19  <String "libcore.icu.ICU">
	//    1    2:invokestatic    #25  <Method Class Class.forName(String)>
	//    2    5:ldc1            #27  <String "addLikelySubtags">
	//    3    7:iconst_1        
	//    4    8:anewarray       Class[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:ldc1            #29  <Class Locale>
	//    8   15:aastore         
	//    9   16:invokevirtual   #33  <Method Method Class.getMethod(String, Class[])>
	//   10   19:putstatic       #35  <Field Method sAddLikelySubtagsMethod>
	//   11   22:return          
		}
		catch(Exception exception)
	//*  12   23:astore_0        
		{
			throw new IllegalStateException(((Throwable) (exception)));
	//   13   24:new             #37  <Class IllegalStateException>
	//   14   27:dup             
	//   15   28:aload_0         
	//   16   29:invokespecial   #41  <Method void IllegalStateException(Throwable)>
	//   17   32:athrow          
		}
	}
}
