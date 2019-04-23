// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ViewGroupUtilsApi18
{

	private ViewGroupUtilsApi18()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	private static void fetchSuppressLayoutMethod()
	{
		if(!sSuppressLayoutMethodFetched)
	//*   0    0:getstatic       #25  <Field boolean sSuppressLayoutMethodFetched>
	//*   1    3:ifne            50
		{
			try
			{
				sSuppressLayoutMethod = ((Class) (android/view/ViewGroup)).getDeclaredMethod("suppressLayout", new Class[] {
					Boolean.TYPE
				});
	//    2    6:ldc1            #27  <Class ViewGroup>
	//    3    8:ldc1            #29  <String "suppressLayout">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:getstatic       #37  <Field Class Boolean.TYPE>
	//    9   19:aastore         
	//   10   20:invokevirtual   #41  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   23:putstatic       #43  <Field Method sSuppressLayoutMethod>
				sSuppressLayoutMethod.setAccessible(true);
	//   12   26:getstatic       #43  <Field Method sSuppressLayoutMethod>
	//   13   29:iconst_1        
	//   14   30:invokevirtual   #49  <Method void Method.setAccessible(boolean)>
			}
	//*  15   33:goto            46
			catch(NoSuchMethodException nosuchmethodexception)
	//*  16   36:astore_0        
			{
				Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", ((Throwable) (nosuchmethodexception)));
	//   17   37:ldc1            #11  <String "ViewUtilsApi18">
	//   18   39:ldc1            #51  <String "Failed to retrieve suppressLayout method">
	//   19   41:aload_0         
	//   20   42:invokestatic    #57  <Method int Log.i(String, String, Throwable)>
	//   21   45:pop             
			}
			sSuppressLayoutMethodFetched = true;
	//   22   46:iconst_1        
	//   23   47:putstatic       #25  <Field boolean sSuppressLayoutMethodFetched>
		}
	//   24   50:return          
	}

	static void suppressLayout(ViewGroup viewgroup, boolean flag)
	{
		fetchSuppressLayoutMethod();
	//    0    0:invokestatic    #65  <Method void fetchSuppressLayoutMethod()>
		Method method = sSuppressLayoutMethod;
	//    1    3:getstatic       #43  <Field Method sSuppressLayoutMethod>
	//    2    6:astore_2        
		if(method != null)
	//*   3    7:aload_2         
	//*   4    8:ifnull          50
			try
			{
				method.invoke(((Object) (viewgroup)), new Object[] {
					Boolean.valueOf(flag)
				});
	//    5   11:aload_2         
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:anewarray       Object[]
	//    9   17:dup             
	//   10   18:iconst_0        
	//   11   19:iload_1         
	//   12   20:invokestatic    #69  <Method Boolean Boolean.valueOf(boolean)>
	//   13   23:aastore         
	//   14   24:invokevirtual   #73  <Method Object Method.invoke(Object, Object[])>
	//   15   27:pop             
				return;
	//   16   28:return          
			}
	//*  17   29:astore_0        
	//*  18   30:ldc1            #11  <String "ViewUtilsApi18">
	//*  19   32:ldc1            #75  <String "Error invoking suppressLayout method">
	//*  20   34:aload_0         
	//*  21   35:invokestatic    #57  <Method int Log.i(String, String, Throwable)>
	//*  22   38:pop             
	//*  23   39:return          
			// Misplaced declaration of an exception variable
			catch(ViewGroup viewgroup)
	//*  24   40:astore_0        
			{
				Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", ((Throwable) (viewgroup)));
	//   25   41:ldc1            #11  <String "ViewUtilsApi18">
	//   26   43:ldc1            #77  <String "Failed to invoke suppressLayout method">
	//   27   45:aload_0         
	//   28   46:invokestatic    #57  <Method int Log.i(String, String, Throwable)>
	//   29   49:pop             
			}
			// Misplaced declaration of an exception variable
			catch(ViewGroup viewgroup)
			{
				Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", ((Throwable) (viewgroup)));
				return;
			}
	//   30   50:return          
	}

	private static final String TAG = "ViewUtilsApi18";
	private static Method sSuppressLayoutMethod;
	private static boolean sSuppressLayoutMethodFetched;
}
