// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.transition:
//			ViewUtilsApi21

class ViewUtilsApi22 extends ViewUtilsApi21
{

	ViewUtilsApi22()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void ViewUtilsApi21()>
	//    2    4:return          
	}

	private void fetchSetLeftTopRightBottomMethod()
	{
		if(!sSetLeftTopRightBottomMethodFetched)
	//*   0    0:getstatic       #27  <Field boolean sSetLeftTopRightBottomMethodFetched>
	//*   1    3:ifne            68
		{
			try
			{
				sSetLeftTopRightBottomMethod = ((Class) (android/view/View)).getDeclaredMethod("setLeftTopRightBottom", new Class[] {
					Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE
				});
	//    2    6:ldc1            #29  <Class View>
	//    3    8:ldc1            #31  <String "setLeftTopRightBottom">
	//    4   10:iconst_4        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:getstatic       #39  <Field Class Integer.TYPE>
	//    9   19:aastore         
	//   10   20:dup             
	//   11   21:iconst_1        
	//   12   22:getstatic       #39  <Field Class Integer.TYPE>
	//   13   25:aastore         
	//   14   26:dup             
	//   15   27:iconst_2        
	//   16   28:getstatic       #39  <Field Class Integer.TYPE>
	//   17   31:aastore         
	//   18   32:dup             
	//   19   33:iconst_3        
	//   20   34:getstatic       #39  <Field Class Integer.TYPE>
	//   21   37:aastore         
	//   22   38:invokevirtual   #43  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   23   41:putstatic       #45  <Field Method sSetLeftTopRightBottomMethod>
				sSetLeftTopRightBottomMethod.setAccessible(true);
	//   24   44:getstatic       #45  <Field Method sSetLeftTopRightBottomMethod>
	//   25   47:iconst_1        
	//   26   48:invokevirtual   #51  <Method void Method.setAccessible(boolean)>
			}
	//*  27   51:goto            64
			catch(NoSuchMethodException nosuchmethodexception)
	//*  28   54:astore_1        
			{
				Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", ((Throwable) (nosuchmethodexception)));
	//   29   55:ldc1            #11  <String "ViewUtilsApi22">
	//   30   57:ldc1            #53  <String "Failed to retrieve setLeftTopRightBottom method">
	//   31   59:aload_1         
	//   32   60:invokestatic    #59  <Method int Log.i(String, String, Throwable)>
	//   33   63:pop             
			}
			sSetLeftTopRightBottomMethodFetched = true;
	//   34   64:iconst_1        
	//   35   65:putstatic       #27  <Field boolean sSetLeftTopRightBottomMethodFetched>
		}
	//   36   68:return          
	}

	public void setLeftTopRightBottom(View view, int i, int j, int k, int l)
	{
		fetchSetLeftTopRightBottomMethod();
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void fetchSetLeftTopRightBottomMethod()>
		Method method = sSetLeftTopRightBottomMethod;
	//    2    4:getstatic       #45  <Field Method sSetLeftTopRightBottomMethod>
	//    3    7:astore          6
		if(method != null)
	//*   4    9:aload           6
	//*   5   11:ifnull          69
			try
			{
				method.invoke(((Object) (view)), new Object[] {
					Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l)
				});
	//    6   14:aload           6
	//    7   16:aload_1         
	//    8   17:iconst_4        
	//    9   18:anewarray       Object[]
	//   10   21:dup             
	//   11   22:iconst_0        
	//   12   23:iload_2         
	//   13   24:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   14   27:aastore         
	//   15   28:dup             
	//   16   29:iconst_1        
	//   17   30:iload_3         
	//   18   31:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   19   34:aastore         
	//   20   35:dup             
	//   21   36:iconst_2        
	//   22   37:iload           4
	//   23   39:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   24   42:aastore         
	//   25   43:dup             
	//   26   44:iconst_3        
	//   27   45:iload           5
	//   28   47:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   29   50:aastore         
	//   30   51:invokevirtual   #77  <Method Object Method.invoke(Object, Object[])>
	//   31   54:pop             
				return;
	//   32   55:return          
			}
	//*  33   56:astore_1        
	//*  34   57:new             #79  <Class RuntimeException>
	//*  35   60:dup             
	//*  36   61:aload_1         
	//*  37   62:invokevirtual   #83  <Method Throwable InvocationTargetException.getCause()>
	//*  38   65:invokespecial   #86  <Method void RuntimeException(Throwable)>
	//*  39   68:athrow          
	//*  40   69:return          
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  41   70:astore_1        
			{
				return;
	//   42   71:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				throw new RuntimeException(((InvocationTargetException) (view)).getCause());
			}
		else
			return;
	}

	private static final String TAG = "ViewUtilsApi22";
	private static Method sSetLeftTopRightBottomMethod;
	private static boolean sSetLeftTopRightBottomMethodFetched;
}
