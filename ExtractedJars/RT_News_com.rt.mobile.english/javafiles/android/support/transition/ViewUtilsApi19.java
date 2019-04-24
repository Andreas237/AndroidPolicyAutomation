// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.transition:
//			ViewUtilsApi18

class ViewUtilsApi19 extends ViewUtilsApi18
{

	ViewUtilsApi19()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void ViewUtilsApi18()>
	//    2    4:return          
	}

	private void fetchGetTransitionAlphaMethod()
	{
		if(!sGetTransitionAlphaMethodFetched)
	//*   0    0:getstatic       #27  <Field boolean sGetTransitionAlphaMethodFetched>
	//*   1    3:ifne            44
		{
			try
			{
				sGetTransitionAlphaMethod = ((Class) (android/view/View)).getDeclaredMethod("getTransitionAlpha", new Class[0]);
	//    2    6:ldc1            #29  <Class View>
	//    3    8:ldc1            #31  <String "getTransitionAlpha">
	//    4   10:iconst_0        
	//    5   11:anewarray       Class[]
	//    6   14:invokevirtual   #37  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    7   17:putstatic       #39  <Field Method sGetTransitionAlphaMethod>
				sGetTransitionAlphaMethod.setAccessible(true);
	//    8   20:getstatic       #39  <Field Method sGetTransitionAlphaMethod>
	//    9   23:iconst_1        
	//   10   24:invokevirtual   #45  <Method void Method.setAccessible(boolean)>
			}
	//*  11   27:goto            40
			catch(NoSuchMethodException nosuchmethodexception)
	//*  12   30:astore_1        
			{
				Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", ((Throwable) (nosuchmethodexception)));
	//   13   31:ldc1            #11  <String "ViewUtilsApi19">
	//   14   33:ldc1            #47  <String "Failed to retrieve getTransitionAlpha method">
	//   15   35:aload_1         
	//   16   36:invokestatic    #53  <Method int Log.i(String, String, Throwable)>
	//   17   39:pop             
			}
			sGetTransitionAlphaMethodFetched = true;
	//   18   40:iconst_1        
	//   19   41:putstatic       #27  <Field boolean sGetTransitionAlphaMethodFetched>
		}
	//   20   44:return          
	}

	private void fetchSetTransitionAlphaMethod()
	{
		if(!sSetTransitionAlphaMethodFetched)
	//*   0    0:getstatic       #56  <Field boolean sSetTransitionAlphaMethodFetched>
	//*   1    3:ifne            50
		{
			try
			{
				sSetTransitionAlphaMethod = ((Class) (android/view/View)).getDeclaredMethod("setTransitionAlpha", new Class[] {
					Float.TYPE
				});
	//    2    6:ldc1            #29  <Class View>
	//    3    8:ldc1            #58  <String "setTransitionAlpha">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:getstatic       #64  <Field Class Float.TYPE>
	//    9   19:aastore         
	//   10   20:invokevirtual   #37  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   23:putstatic       #66  <Field Method sSetTransitionAlphaMethod>
				sSetTransitionAlphaMethod.setAccessible(true);
	//   12   26:getstatic       #66  <Field Method sSetTransitionAlphaMethod>
	//   13   29:iconst_1        
	//   14   30:invokevirtual   #45  <Method void Method.setAccessible(boolean)>
			}
	//*  15   33:goto            46
			catch(NoSuchMethodException nosuchmethodexception)
	//*  16   36:astore_1        
			{
				Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", ((Throwable) (nosuchmethodexception)));
	//   17   37:ldc1            #11  <String "ViewUtilsApi19">
	//   18   39:ldc1            #68  <String "Failed to retrieve setTransitionAlpha method">
	//   19   41:aload_1         
	//   20   42:invokestatic    #53  <Method int Log.i(String, String, Throwable)>
	//   21   45:pop             
			}
			sSetTransitionAlphaMethodFetched = true;
	//   22   46:iconst_1        
	//   23   47:putstatic       #56  <Field boolean sSetTransitionAlphaMethodFetched>
		}
	//   24   50:return          
	}

	public void clearNonTransitionAlpha(View view)
	{
	//    0    0:return          
	}

	public float getTransitionAlpha(View view)
	{
		fetchGetTransitionAlphaMethod();
	//    0    0:aload_0         
	//    1    1:invokespecial   #79  <Method void fetchGetTransitionAlphaMethod()>
		if(sGetTransitionAlphaMethod == null)
			break MISSING_BLOCK_LABEL_43;
	//    2    4:getstatic       #39  <Field Method sGetTransitionAlphaMethod>
	//    3    7:ifnull          43
		float f = ((Float)sGetTransitionAlphaMethod.invoke(((Object) (view)), new Object[0])).floatValue();
	//    4   10:getstatic       #39  <Field Method sGetTransitionAlphaMethod>
	//    5   13:aload_1         
	//    6   14:iconst_0        
	//    7   15:anewarray       Object[]
	//    8   18:invokevirtual   #85  <Method Object Method.invoke(Object, Object[])>
	//    9   21:checkcast       #60  <Class Float>
	//   10   24:invokevirtual   #89  <Method float Float.floatValue()>
	//   11   27:fstore_2        
		return f;
	//   12   28:fload_2         
	//   13   29:freturn         
		view;
	//   14   30:astore_1        
		throw new RuntimeException(((InvocationTargetException) (view)).getCause());
	//   15   31:new             #91  <Class RuntimeException>
	//   16   34:dup             
	//   17   35:aload_1         
	//   18   36:invokevirtual   #95  <Method Throwable InvocationTargetException.getCause()>
	//   19   39:invokespecial   #98  <Method void RuntimeException(Throwable)>
	//   20   42:athrow          
_L2:
		return super.getTransitionAlpha(view);
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:invokespecial   #100 <Method float ViewUtilsApi18.getTransitionAlpha(View)>
	//   24   48:freturn         
		IllegalAccessException illegalaccessexception;
		illegalaccessexception;
	//   25   49:astore_3        
		if(true) goto _L2; else goto _L1
_L1:
	//*  26   50:goto            43
	}

	public void saveNonTransitionAlpha(View view)
	{
	//    0    0:return          
	}

	public void setTransitionAlpha(View view, float f)
	{
		fetchSetTransitionAlphaMethod();
	//    0    0:aload_0         
	//    1    1:invokespecial   #104 <Method void fetchSetTransitionAlphaMethod()>
		if(sSetTransitionAlphaMethod != null)
	//*   2    4:getstatic       #66  <Field Method sSetTransitionAlphaMethod>
	//*   3    7:ifnull          43
		{
			try
			{
				sSetTransitionAlphaMethod.invoke(((Object) (view)), new Object[] {
					Float.valueOf(f)
				});
	//    4   10:getstatic       #66  <Field Method sSetTransitionAlphaMethod>
	//    5   13:aload_1         
	//    6   14:iconst_1        
	//    7   15:anewarray       Object[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:fload_2         
	//   11   21:invokestatic    #108 <Method Float Float.valueOf(float)>
	//   12   24:aastore         
	//   13   25:invokevirtual   #85  <Method Object Method.invoke(Object, Object[])>
	//   14   28:pop             
				return;
	//   15   29:return          
			}
	//*  16   30:astore_1        
	//*  17   31:new             #91  <Class RuntimeException>
	//*  18   34:dup             
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #95  <Method Throwable InvocationTargetException.getCause()>
	//*  21   39:invokespecial   #98  <Method void RuntimeException(Throwable)>
	//*  22   42:athrow          
	//*  23   43:aload_1         
	//*  24   44:fload_2         
	//*  25   45:invokevirtual   #112 <Method void View.setAlpha(float)>
	//*  26   48:return          
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  27   49:astore_1        
			{
				return;
	//   28   50:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				throw new RuntimeException(((InvocationTargetException) (view)).getCause());
			}
		} else
		{
			view.setAlpha(f);
			return;
		}
	}

	private static final String TAG = "ViewUtilsApi19";
	private static Method sGetTransitionAlphaMethod;
	private static boolean sGetTransitionAlphaMethodFetched;
	private static Method sSetTransitionAlphaMethod;
	private static boolean sSetTransitionAlphaMethodFetched;
}
