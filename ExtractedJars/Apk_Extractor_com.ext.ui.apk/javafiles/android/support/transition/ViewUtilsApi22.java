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
	//*   1    3:ifne            55
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
	//*  27   51:iconst_1        
	//*  28   52:putstatic       #27  <Field boolean sSetLeftTopRightBottomMethodFetched>
	//*  29   55:return          
			catch(NoSuchMethodException nosuchmethodexception)
	//*  30   56:astore_1        
			{
				Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", ((Throwable) (nosuchmethodexception)));
	//   31   57:ldc1            #11  <String "ViewUtilsApi22">
	//   32   59:ldc1            #53  <String "Failed to retrieve setLeftTopRightBottom method">
	//   33   61:aload_1         
	//   34   62:invokestatic    #59  <Method int Log.i(String, String, Throwable)>
	//   35   65:pop             
			}
			sSetLeftTopRightBottomMethodFetched = true;
		}
	//*  36   66:goto            51
	}

	public void setLeftTopRightBottom(View view, int i, int j, int k, int l)
	{
		fetchSetLeftTopRightBottomMethod();
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void fetchSetLeftTopRightBottomMethod()>
		if(sSetLeftTopRightBottomMethod == null)
			break MISSING_BLOCK_LABEL_52;
	//    2    4:getstatic       #45  <Field Method sSetLeftTopRightBottomMethod>
	//    3    7:ifnull          52
		sSetLeftTopRightBottomMethod.invoke(((Object) (view)), new Object[] {
			Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l)
		});
	//    4   10:getstatic       #45  <Field Method sSetLeftTopRightBottomMethod>
	//    5   13:aload_1         
	//    6   14:iconst_4        
	//    7   15:anewarray       Object[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:iload_2         
	//   11   21:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   12   24:aastore         
	//   13   25:dup             
	//   14   26:iconst_1        
	//   15   27:iload_3         
	//   16   28:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   17   31:aastore         
	//   18   32:dup             
	//   19   33:iconst_2        
	//   20   34:iload           4
	//   21   36:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   22   39:aastore         
	//   23   40:dup             
	//   24   41:iconst_3        
	//   25   42:iload           5
	//   26   44:invokestatic    #73  <Method Integer Integer.valueOf(int)>
	//   27   47:aastore         
	//   28   48:invokevirtual   #77  <Method Object Method.invoke(Object, Object[])>
	//   29   51:pop             
		return;
	//   30   52:return          
		view;
	//   31   53:astore_1        
		throw new RuntimeException(((InvocationTargetException) (view)).getCause());
	//   32   54:new             #79  <Class RuntimeException>
	//   33   57:dup             
	//   34   58:aload_1         
	//   35   59:invokevirtual   #83  <Method Throwable InvocationTargetException.getCause()>
	//   36   62:invokespecial   #86  <Method void RuntimeException(Throwable)>
	//   37   65:athrow          
		view;
	//   38   66:astore_1        
	//   39   67:return          
	}

	private static final String TAG = "ViewUtilsApi22";
	private static Method sSetLeftTopRightBottomMethod;
	private static boolean sSetLeftTopRightBottomMethodFetched;
}
