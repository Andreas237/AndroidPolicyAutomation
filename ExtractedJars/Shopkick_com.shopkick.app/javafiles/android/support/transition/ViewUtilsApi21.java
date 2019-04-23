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
	//    1    1:invokespecial   #23  <Method void ViewUtilsApi19()>
	//    2    4:return          
	}

	private void fetchSetAnimationMatrix()
	{
		if(!sSetAnimationMatrixMethodFetched)
	//*   0    0:getstatic       #29  <Field boolean sSetAnimationMatrixMethodFetched>
	//*   1    3:ifne            49
		{
			try
			{
				sSetAnimationMatrixMethod = ((Class) (android/view/View)).getDeclaredMethod("setAnimationMatrix", new Class[] {
					android/graphics/Matrix
				});
	//    2    6:ldc1            #31  <Class View>
	//    3    8:ldc1            #33  <String "setAnimationMatrix">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #37  <Class Matrix>
	//    9   18:aastore         
	//   10   19:invokevirtual   #41  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   22:putstatic       #43  <Field Method sSetAnimationMatrixMethod>
				sSetAnimationMatrixMethod.setAccessible(true);
	//   12   25:getstatic       #43  <Field Method sSetAnimationMatrixMethod>
	//   13   28:iconst_1        
	//   14   29:invokevirtual   #49  <Method void Method.setAccessible(boolean)>
			}
	//*  15   32:goto            45
			catch(NoSuchMethodException nosuchmethodexception)
	//*  16   35:astore_1        
			{
				Log.i("ViewUtilsApi21", "Failed to retrieve setAnimationMatrix method", ((Throwable) (nosuchmethodexception)));
	//   17   36:ldc1            #11  <String "ViewUtilsApi21">
	//   18   38:ldc1            #51  <String "Failed to retrieve setAnimationMatrix method">
	//   19   40:aload_1         
	//   20   41:invokestatic    #57  <Method int Log.i(String, String, Throwable)>
	//   21   44:pop             
			}
			sSetAnimationMatrixMethodFetched = true;
	//   22   45:iconst_1        
	//   23   46:putstatic       #29  <Field boolean sSetAnimationMatrixMethodFetched>
		}
	//   24   49:return          
	}

	private void fetchTransformMatrixToGlobalMethod()
	{
		if(!sTransformMatrixToGlobalMethodFetched)
	//*   0    0:getstatic       #60  <Field boolean sTransformMatrixToGlobalMethodFetched>
	//*   1    3:ifne            49
		{
			try
			{
				sTransformMatrixToGlobalMethod = ((Class) (android/view/View)).getDeclaredMethod("transformMatrixToGlobal", new Class[] {
					android/graphics/Matrix
				});
	//    2    6:ldc1            #31  <Class View>
	//    3    8:ldc1            #62  <String "transformMatrixToGlobal">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #37  <Class Matrix>
	//    9   18:aastore         
	//   10   19:invokevirtual   #41  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   22:putstatic       #64  <Field Method sTransformMatrixToGlobalMethod>
				sTransformMatrixToGlobalMethod.setAccessible(true);
	//   12   25:getstatic       #64  <Field Method sTransformMatrixToGlobalMethod>
	//   13   28:iconst_1        
	//   14   29:invokevirtual   #49  <Method void Method.setAccessible(boolean)>
			}
	//*  15   32:goto            45
			catch(NoSuchMethodException nosuchmethodexception)
	//*  16   35:astore_1        
			{
				Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", ((Throwable) (nosuchmethodexception)));
	//   17   36:ldc1            #11  <String "ViewUtilsApi21">
	//   18   38:ldc1            #66  <String "Failed to retrieve transformMatrixToGlobal method">
	//   19   40:aload_1         
	//   20   41:invokestatic    #57  <Method int Log.i(String, String, Throwable)>
	//   21   44:pop             
			}
			sTransformMatrixToGlobalMethodFetched = true;
	//   22   45:iconst_1        
	//   23   46:putstatic       #60  <Field boolean sTransformMatrixToGlobalMethodFetched>
		}
	//   24   49:return          
	}

	private void fetchTransformMatrixToLocalMethod()
	{
		if(!sTransformMatrixToLocalMethodFetched)
	//*   0    0:getstatic       #69  <Field boolean sTransformMatrixToLocalMethodFetched>
	//*   1    3:ifne            49
		{
			try
			{
				sTransformMatrixToLocalMethod = ((Class) (android/view/View)).getDeclaredMethod("transformMatrixToLocal", new Class[] {
					android/graphics/Matrix
				});
	//    2    6:ldc1            #31  <Class View>
	//    3    8:ldc1            #71  <String "transformMatrixToLocal">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #37  <Class Matrix>
	//    9   18:aastore         
	//   10   19:invokevirtual   #41  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   22:putstatic       #73  <Field Method sTransformMatrixToLocalMethod>
				sTransformMatrixToLocalMethod.setAccessible(true);
	//   12   25:getstatic       #73  <Field Method sTransformMatrixToLocalMethod>
	//   13   28:iconst_1        
	//   14   29:invokevirtual   #49  <Method void Method.setAccessible(boolean)>
			}
	//*  15   32:goto            45
			catch(NoSuchMethodException nosuchmethodexception)
	//*  16   35:astore_1        
			{
				Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", ((Throwable) (nosuchmethodexception)));
	//   17   36:ldc1            #11  <String "ViewUtilsApi21">
	//   18   38:ldc1            #75  <String "Failed to retrieve transformMatrixToLocal method">
	//   19   40:aload_1         
	//   20   41:invokestatic    #57  <Method int Log.i(String, String, Throwable)>
	//   21   44:pop             
			}
			sTransformMatrixToLocalMethodFetched = true;
	//   22   45:iconst_1        
	//   23   46:putstatic       #69  <Field boolean sTransformMatrixToLocalMethodFetched>
		}
	//   24   49:return          
	}

	public void setAnimationMatrix(View view, Matrix matrix)
	{
		fetchSetAnimationMatrix();
	//    0    0:aload_0         
	//    1    1:invokespecial   #83  <Method void fetchSetAnimationMatrix()>
		Method method = sSetAnimationMatrixMethod;
	//    2    4:getstatic       #43  <Field Method sSetAnimationMatrixMethod>
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
	//   14   22:invokevirtual   #89  <Method Object Method.invoke(Object, Object[])>
	//   15   25:pop             
				return;
	//   16   26:return          
			}
	//*  17   27:astore_1        
	//*  18   28:new             #91  <Class RuntimeException>
	//*  19   31:dup             
	//*  20   32:aload_1         
	//*  21   33:invokevirtual   #95  <Method Throwable IllegalAccessException.getCause()>
	//*  22   36:invokespecial   #98  <Method void RuntimeException(Throwable)>
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
				throw new RuntimeException(((IllegalAccessException) (view)).getCause());
			}
		else
			return;
	}

	public void transformMatrixToGlobal(View view, Matrix matrix)
	{
		fetchTransformMatrixToGlobalMethod();
	//    0    0:aload_0         
	//    1    1:invokespecial   #101 <Method void fetchTransformMatrixToGlobalMethod()>
		Method method = sTransformMatrixToGlobalMethod;
	//    2    4:getstatic       #64  <Field Method sTransformMatrixToGlobalMethod>
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
	//   14   22:invokevirtual   #89  <Method Object Method.invoke(Object, Object[])>
	//   15   25:pop             
				return;
	//   16   26:return          
			}
	//*  17   27:astore_1        
	//*  18   28:new             #91  <Class RuntimeException>
	//*  19   31:dup             
	//*  20   32:aload_1         
	//*  21   33:invokevirtual   #102 <Method Throwable InvocationTargetException.getCause()>
	//*  22   36:invokespecial   #98  <Method void RuntimeException(Throwable)>
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
	//    1    1:invokespecial   #104 <Method void fetchTransformMatrixToLocalMethod()>
		Method method = sTransformMatrixToLocalMethod;
	//    2    4:getstatic       #73  <Field Method sTransformMatrixToLocalMethod>
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
	//   14   22:invokevirtual   #89  <Method Object Method.invoke(Object, Object[])>
	//   15   25:pop             
				return;
	//   16   26:return          
			}
	//*  17   27:astore_1        
	//*  18   28:new             #91  <Class RuntimeException>
	//*  19   31:dup             
	//*  20   32:aload_1         
	//*  21   33:invokevirtual   #102 <Method Throwable InvocationTargetException.getCause()>
	//*  22   36:invokespecial   #98  <Method void RuntimeException(Throwable)>
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

	private static final String TAG = "ViewUtilsApi21";
	private static Method sSetAnimationMatrixMethod;
	private static boolean sSetAnimationMatrixMethodFetched;
	private static Method sTransformMatrixToGlobalMethod;
	private static boolean sTransformMatrixToGlobalMethodFetched;
	private static Method sTransformMatrixToLocalMethod;
	private static boolean sTransformMatrixToLocalMethodFetched;
}
