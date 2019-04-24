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
//			ax

class ay extends ax
{

	ay()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void ax()>
	//    2    4:return          
	}

	private void a()
	{
		if(!b)
	//*   0    0:getstatic       #21  <Field boolean b>
	//*   1    3:ifne            49
		{
			try
			{
				a = ((Class) (android/view/View)).getDeclaredMethod("transformMatrixToGlobal", new Class[] {
					android/graphics/Matrix
				});
	//    2    6:ldc1            #23  <Class View>
	//    3    8:ldc1            #25  <String "transformMatrixToGlobal">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #29  <Class Matrix>
	//    9   18:aastore         
	//   10   19:invokevirtual   #33  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   22:putstatic       #35  <Field Method a>
				a.setAccessible(true);
	//   12   25:getstatic       #35  <Field Method a>
	//   13   28:iconst_1        
	//   14   29:invokevirtual   #41  <Method void Method.setAccessible(boolean)>
			}
	//*  15   32:goto            45
			catch(NoSuchMethodException nosuchmethodexception)
	//*  16   35:astore_1        
			{
				Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", ((Throwable) (nosuchmethodexception)));
	//   17   36:ldc1            #43  <String "ViewUtilsApi21">
	//   18   38:ldc1            #45  <String "Failed to retrieve transformMatrixToGlobal method">
	//   19   40:aload_1         
	//   20   41:invokestatic    #51  <Method int Log.i(String, String, Throwable)>
	//   21   44:pop             
			}
			b = true;
	//   22   45:iconst_1        
	//   23   46:putstatic       #21  <Field boolean b>
		}
	//   24   49:return          
	}

	private void b()
	{
		if(!d)
	//*   0    0:getstatic       #53  <Field boolean d>
	//*   1    3:ifne            49
		{
			try
			{
				c = ((Class) (android/view/View)).getDeclaredMethod("transformMatrixToLocal", new Class[] {
					android/graphics/Matrix
				});
	//    2    6:ldc1            #23  <Class View>
	//    3    8:ldc1            #55  <String "transformMatrixToLocal">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #29  <Class Matrix>
	//    9   18:aastore         
	//   10   19:invokevirtual   #33  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   22:putstatic       #57  <Field Method c>
				c.setAccessible(true);
	//   12   25:getstatic       #57  <Field Method c>
	//   13   28:iconst_1        
	//   14   29:invokevirtual   #41  <Method void Method.setAccessible(boolean)>
			}
	//*  15   32:goto            45
			catch(NoSuchMethodException nosuchmethodexception)
	//*  16   35:astore_1        
			{
				Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", ((Throwable) (nosuchmethodexception)));
	//   17   36:ldc1            #43  <String "ViewUtilsApi21">
	//   18   38:ldc1            #59  <String "Failed to retrieve transformMatrixToLocal method">
	//   19   40:aload_1         
	//   20   41:invokestatic    #51  <Method int Log.i(String, String, Throwable)>
	//   21   44:pop             
			}
			d = true;
	//   22   45:iconst_1        
	//   23   46:putstatic       #53  <Field boolean d>
		}
	//   24   49:return          
	}

	private void c()
	{
		if(!f)
	//*   0    0:getstatic       #61  <Field boolean f>
	//*   1    3:ifne            49
		{
			try
			{
				e = ((Class) (android/view/View)).getDeclaredMethod("setAnimationMatrix", new Class[] {
					android/graphics/Matrix
				});
	//    2    6:ldc1            #23  <Class View>
	//    3    8:ldc1            #63  <String "setAnimationMatrix">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #29  <Class Matrix>
	//    9   18:aastore         
	//   10   19:invokevirtual   #33  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   22:putstatic       #65  <Field Method e>
				e.setAccessible(true);
	//   12   25:getstatic       #65  <Field Method e>
	//   13   28:iconst_1        
	//   14   29:invokevirtual   #41  <Method void Method.setAccessible(boolean)>
			}
	//*  15   32:goto            45
			catch(NoSuchMethodException nosuchmethodexception)
	//*  16   35:astore_1        
			{
				Log.i("ViewUtilsApi21", "Failed to retrieve setAnimationMatrix method", ((Throwable) (nosuchmethodexception)));
	//   17   36:ldc1            #43  <String "ViewUtilsApi21">
	//   18   38:ldc1            #67  <String "Failed to retrieve setAnimationMatrix method">
	//   19   40:aload_1         
	//   20   41:invokestatic    #51  <Method int Log.i(String, String, Throwable)>
	//   21   44:pop             
			}
			f = true;
	//   22   45:iconst_1        
	//   23   46:putstatic       #61  <Field boolean f>
		}
	//   24   49:return          
	}

	public void a(View view, Matrix matrix)
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void a()>
		if(a != null)
	//*   2    4:getstatic       #35  <Field Method a>
	//*   3    7:ifnull          40
			try
			{
				a.invoke(((Object) (view)), new Object[] {
					matrix
				});
	//    4   10:getstatic       #35  <Field Method a>
	//    5   13:aload_1         
	//    6   14:iconst_1        
	//    7   15:anewarray       Object[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:aload_2         
	//   11   21:aastore         
	//   12   22:invokevirtual   #80  <Method Object Method.invoke(Object, Object[])>
	//   13   25:pop             
				return;
	//   14   26:return          
			}
	//*  15   27:astore_1        
	//*  16   28:new             #82  <Class RuntimeException>
	//*  17   31:dup             
	//*  18   32:aload_1         
	//*  19   33:invokevirtual   #86  <Method Throwable InvocationTargetException.getCause()>
	//*  20   36:invokespecial   #89  <Method void RuntimeException(Throwable)>
	//*  21   39:athrow          
	//*  22   40:return          
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  23   41:astore_1        
			{
				return;
	//   24   42:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				throw new RuntimeException(((InvocationTargetException) (view)).getCause());
			}
		else
			return;
	}

	public void b(View view, Matrix matrix)
	{
		b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #91  <Method void b()>
		if(c != null)
	//*   2    4:getstatic       #57  <Field Method c>
	//*   3    7:ifnull          40
			try
			{
				c.invoke(((Object) (view)), new Object[] {
					matrix
				});
	//    4   10:getstatic       #57  <Field Method c>
	//    5   13:aload_1         
	//    6   14:iconst_1        
	//    7   15:anewarray       Object[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:aload_2         
	//   11   21:aastore         
	//   12   22:invokevirtual   #80  <Method Object Method.invoke(Object, Object[])>
	//   13   25:pop             
				return;
	//   14   26:return          
			}
	//*  15   27:astore_1        
	//*  16   28:new             #82  <Class RuntimeException>
	//*  17   31:dup             
	//*  18   32:aload_1         
	//*  19   33:invokevirtual   #86  <Method Throwable InvocationTargetException.getCause()>
	//*  20   36:invokespecial   #89  <Method void RuntimeException(Throwable)>
	//*  21   39:athrow          
	//*  22   40:return          
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  23   41:astore_1        
			{
				return;
	//   24   42:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				throw new RuntimeException(((InvocationTargetException) (view)).getCause());
			}
		else
			return;
	}

	public void c(View view, Matrix matrix)
	{
		c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method void c()>
		if(e != null)
	//*   2    4:getstatic       #65  <Field Method e>
	//*   3    7:ifnull          40
			try
			{
				e.invoke(((Object) (view)), new Object[] {
					matrix
				});
	//    4   10:getstatic       #65  <Field Method e>
	//    5   13:aload_1         
	//    6   14:iconst_1        
	//    7   15:anewarray       Object[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:aload_2         
	//   11   21:aastore         
	//   12   22:invokevirtual   #80  <Method Object Method.invoke(Object, Object[])>
	//   13   25:pop             
				return;
	//   14   26:return          
			}
	//*  15   27:astore_1        
	//*  16   28:new             #82  <Class RuntimeException>
	//*  17   31:dup             
	//*  18   32:aload_1         
	//*  19   33:invokevirtual   #94  <Method Throwable IllegalAccessException.getCause()>
	//*  20   36:invokespecial   #89  <Method void RuntimeException(Throwable)>
	//*  21   39:athrow          
	//*  22   40:return          
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  23   41:astore_1        
			{
				return;
	//   24   42:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				throw new RuntimeException(((IllegalAccessException) (view)).getCause());
			}
		else
			return;
	}

	private static Method a;
	private static boolean b;
	private static Method c;
	private static boolean d;
	private static Method e;
	private static boolean f;
}
