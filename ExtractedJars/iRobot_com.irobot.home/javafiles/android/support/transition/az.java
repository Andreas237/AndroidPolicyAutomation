// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.transition:
//			ay

class az extends ay
{

	az()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void ay()>
	//    2    4:return          
	}

	private void a()
	{
		if(!b)
	//*   0    0:getstatic       #20  <Field boolean b>
	//*   1    3:ifne            68
		{
			try
			{
				a = ((Class) (android/view/View)).getDeclaredMethod("setLeftTopRightBottom", new Class[] {
					Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE
				});
	//    2    6:ldc1            #22  <Class View>
	//    3    8:ldc1            #24  <String "setLeftTopRightBottom">
	//    4   10:iconst_4        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:getstatic       #32  <Field Class Integer.TYPE>
	//    9   19:aastore         
	//   10   20:dup             
	//   11   21:iconst_1        
	//   12   22:getstatic       #32  <Field Class Integer.TYPE>
	//   13   25:aastore         
	//   14   26:dup             
	//   15   27:iconst_2        
	//   16   28:getstatic       #32  <Field Class Integer.TYPE>
	//   17   31:aastore         
	//   18   32:dup             
	//   19   33:iconst_3        
	//   20   34:getstatic       #32  <Field Class Integer.TYPE>
	//   21   37:aastore         
	//   22   38:invokevirtual   #36  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   23   41:putstatic       #38  <Field Method a>
				a.setAccessible(true);
	//   24   44:getstatic       #38  <Field Method a>
	//   25   47:iconst_1        
	//   26   48:invokevirtual   #44  <Method void Method.setAccessible(boolean)>
			}
	//*  27   51:goto            64
			catch(NoSuchMethodException nosuchmethodexception)
	//*  28   54:astore_1        
			{
				Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", ((Throwable) (nosuchmethodexception)));
	//   29   55:ldc1            #46  <String "ViewUtilsApi22">
	//   30   57:ldc1            #48  <String "Failed to retrieve setLeftTopRightBottom method">
	//   31   59:aload_1         
	//   32   60:invokestatic    #54  <Method int Log.i(String, String, Throwable)>
	//   33   63:pop             
			}
			b = true;
	//   34   64:iconst_1        
	//   35   65:putstatic       #20  <Field boolean b>
		}
	//   36   68:return          
	}

	public void a(View view, int i, int j, int k, int l)
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void a()>
		if(a != null)
	//*   2    4:getstatic       #38  <Field Method a>
	//*   3    7:ifnull          66
			try
			{
				a.invoke(((Object) (view)), new Object[] {
					Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l)
				});
	//    4   10:getstatic       #38  <Field Method a>
	//    5   13:aload_1         
	//    6   14:iconst_4        
	//    7   15:anewarray       Object[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:iload_2         
	//   11   21:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   12   24:aastore         
	//   13   25:dup             
	//   14   26:iconst_1        
	//   15   27:iload_3         
	//   16   28:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   17   31:aastore         
	//   18   32:dup             
	//   19   33:iconst_2        
	//   20   34:iload           4
	//   21   36:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   22   39:aastore         
	//   23   40:dup             
	//   24   41:iconst_3        
	//   25   42:iload           5
	//   26   44:invokestatic    #68  <Method Integer Integer.valueOf(int)>
	//   27   47:aastore         
	//   28   48:invokevirtual   #72  <Method Object Method.invoke(Object, Object[])>
	//   29   51:pop             
				return;
	//   30   52:return          
			}
	//*  31   53:astore_1        
	//*  32   54:new             #74  <Class RuntimeException>
	//*  33   57:dup             
	//*  34   58:aload_1         
	//*  35   59:invokevirtual   #78  <Method Throwable InvocationTargetException.getCause()>
	//*  36   62:invokespecial   #81  <Method void RuntimeException(Throwable)>
	//*  37   65:athrow          
	//*  38   66:return          
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  39   67:astore_1        
			{
				return;
	//   40   68:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				throw new RuntimeException(((InvocationTargetException) (view)).getCause());
			}
		else
			return;
	}

	private static Method a;
	private static boolean b;
}
