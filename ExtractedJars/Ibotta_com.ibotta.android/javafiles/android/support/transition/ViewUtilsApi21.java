// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.transition:
//			ViewUtilsApi19

class ViewUtilsApi21 extends ViewUtilsApi19
{

	ViewUtilsApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void ViewUtilsApi19()>
	//    2    4:return          
	}

	private void fetchTransformMatrixToGlobalMethod()
	{
		if(!sTransformMatrixToGlobalMethodFetched)
	//*   0    0:getstatic       #23  <Field boolean sTransformMatrixToGlobalMethodFetched>
	//*   1    3:ifne            49
		{
			try
			{
				sTransformMatrixToGlobalMethod = ((Class) (android/view/View)).getDeclaredMethod("transformMatrixToGlobal", new Class[] {
					android/graphics/Matrix
				});
	//    2    6:ldc1            #25  <Class View>
	//    3    8:ldc1            #27  <String "transformMatrixToGlobal">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #31  <Class Matrix>
	//    9   18:aastore         
	//   10   19:invokevirtual   #35  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   22:putstatic       #37  <Field Method sTransformMatrixToGlobalMethod>
				sTransformMatrixToGlobalMethod.setAccessible(true);
	//   12   25:getstatic       #37  <Field Method sTransformMatrixToGlobalMethod>
	//   13   28:iconst_1        
	//   14   29:invokevirtual   #43  <Method void Method.setAccessible(boolean)>
			}
	//*  15   32:goto            45
			catch(NoSuchMethodException nosuchmethodexception)
	//*  16   35:astore_1        
			{
				Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", ((Throwable) (nosuchmethodexception)));
	//   17   36:ldc1            #45  <String "ViewUtilsApi21">
	//   18   38:ldc1            #47  <String "Failed to retrieve transformMatrixToGlobal method">
	//   19   40:aload_1         
	//   20   41:invokestatic    #53  <Method int Log.i(String, String, Throwable)>
	//   21   44:pop             
			}
			sTransformMatrixToGlobalMethodFetched = true;
	//   22   45:iconst_1        
	//   23   46:putstatic       #23  <Field boolean sTransformMatrixToGlobalMethodFetched>
		}
	//   24   49:return          
	}

	private void fetchTransformMatrixToLocalMethod()
	{
		if(!sTransformMatrixToLocalMethodFetched)
	//*   0    0:getstatic       #56  <Field boolean sTransformMatrixToLocalMethodFetched>
	//*   1    3:ifne            49
		{
			try
			{
				sTransformMatrixToLocalMethod = ((Class) (android/view/View)).getDeclaredMethod("transformMatrixToLocal", new Class[] {
					android/graphics/Matrix
				});
	//    2    6:ldc1            #25  <Class View>
	//    3    8:ldc1            #58  <String "transformMatrixToLocal">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #31  <Class Matrix>
	//    9   18:aastore         
	//   10   19:invokevirtual   #35  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   22:putstatic       #60  <Field Method sTransformMatrixToLocalMethod>
				sTransformMatrixToLocalMethod.setAccessible(true);
	//   12   25:getstatic       #60  <Field Method sTransformMatrixToLocalMethod>
	//   13   28:iconst_1        
	//   14   29:invokevirtual   #43  <Method void Method.setAccessible(boolean)>
			}
	//*  15   32:goto            45
			catch(NoSuchMethodException nosuchmethodexception)
	//*  16   35:astore_1        
			{
				Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", ((Throwable) (nosuchmethodexception)));
	//   17   36:ldc1            #45  <String "ViewUtilsApi21">
	//   18   38:ldc1            #62  <String "Failed to retrieve transformMatrixToLocal method">
	//   19   40:aload_1         
	//   20   41:invokestatic    #53  <Method int Log.i(String, String, Throwable)>
	//   21   44:pop             
			}
			sTransformMatrixToLocalMethodFetched = true;
	//   22   45:iconst_1        
	//   23   46:putstatic       #56  <Field boolean sTransformMatrixToLocalMethodFetched>
		}
	//   24   49:return          
	}

	public void transformMatrixToGlobal(View view, Matrix matrix)
	{
		fetchTransformMatrixToGlobalMethod();
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void fetchTransformMatrixToGlobalMethod()>
		Method method = sTransformMatrixToGlobalMethod;
	//    2    4:getstatic       #37  <Field Method sTransformMatrixToGlobalMethod>
	//    3    7:astore_3        
		if(method != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          40
			try
			{
				method.invoke(((Object) (view)), new Object[] {
					matrix
				});
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:iconst_1        
	//    9   15:anewarray       Object[]
	//   10   18:dup             
	//   11   19:iconst_0        
	//   12   20:aload_2         
	//   13   21:aastore         
	//   14   22:invokevirtual   #76  <Method Object Method.invoke(Object, Object[])>
	//   15   25:pop             
				return;
	//   16   26:return          
			}
	//*  17   27:astore_1        
	//*  18   28:new             #78  <Class RuntimeException>
	//*  19   31:dup             
	//*  20   32:aload_1         
	//*  21   33:invokevirtual   #82  <Method Throwable InvocationTargetException.getCause()>
	//*  22   36:invokespecial   #85  <Method void RuntimeException(Throwable)>
	//*  23   39:athrow          
	//*  24   40:return          
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  25   41:astore_1        
			{
				return;
	//   26   42:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				throw new RuntimeException(((InvocationTargetException) (view)).getCause());
			}
		else
			return;
	}

	public void transformMatrixToLocal(View view, Matrix matrix)
	{
		fetchTransformMatrixToLocalMethod();
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method void fetchTransformMatrixToLocalMethod()>
		Method method = sTransformMatrixToLocalMethod;
	//    2    4:getstatic       #60  <Field Method sTransformMatrixToLocalMethod>
	//    3    7:astore_3        
		if(method != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          40
			try
			{
				method.invoke(((Object) (view)), new Object[] {
					matrix
				});
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:iconst_1        
	//    9   15:anewarray       Object[]
	//   10   18:dup             
	//   11   19:iconst_0        
	//   12   20:aload_2         
	//   13   21:aastore         
	//   14   22:invokevirtual   #76  <Method Object Method.invoke(Object, Object[])>
	//   15   25:pop             
				return;
	//   16   26:return          
			}
	//*  17   27:astore_1        
	//*  18   28:new             #78  <Class RuntimeException>
	//*  19   31:dup             
	//*  20   32:aload_1         
	//*  21   33:invokevirtual   #82  <Method Throwable InvocationTargetException.getCause()>
	//*  22   36:invokespecial   #85  <Method void RuntimeException(Throwable)>
	//*  23   39:athrow          
	//*  24   40:return          
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  25   41:astore_1        
			{
				return;
	//   26   42:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				throw new RuntimeException(((InvocationTargetException) (view)).getCause());
			}
		else
			return;
	}

	private static Method sTransformMatrixToGlobalMethod;
	private static boolean sTransformMatrixToGlobalMethodFetched;
	private static Method sTransformMatrixToLocalMethod;
	private static boolean sTransformMatrixToLocalMethodFetched;
}
