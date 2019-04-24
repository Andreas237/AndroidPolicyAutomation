// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package o:
//			ar, ak, al

class ao extends ar
{

	ao()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ar()>
	//    2    4:return          
	}

	private void d()
	{
		if(!a)
	//*   0    0:getstatic       #21  <Field boolean a>
	//*   1    3:ifne            50
		{
			try
			{
				c = ((Class) (android/view/ViewGroup)).getDeclaredMethod("suppressLayout", new Class[] {
					Boolean.TYPE
				});
	//    2    6:ldc1            #23  <Class ViewGroup>
	//    3    8:ldc1            #25  <String "suppressLayout">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:getstatic       #33  <Field Class Boolean.TYPE>
	//    9   19:aastore         
	//   10   20:invokevirtual   #37  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   23:putstatic       #39  <Field Method c>
				c.setAccessible(true);
	//   12   26:getstatic       #39  <Field Method c>
	//   13   29:iconst_1        
	//   14   30:invokevirtual   #45  <Method void Method.setAccessible(boolean)>
			}
	//*  15   33:goto            46
			catch(NoSuchMethodException nosuchmethodexception)
	//*  16   36:astore_1        
			{
				Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", ((Throwable) (nosuchmethodexception)));
	//   17   37:ldc1            #47  <String "ViewUtilsApi18">
	//   18   39:ldc1            #49  <String "Failed to retrieve suppressLayout method">
	//   19   41:aload_1         
	//   20   42:invokestatic    #55  <Method int Log.i(String, String, Throwable)>
	//   21   45:pop             
			}
			a = true;
	//   22   46:iconst_1        
	//   23   47:putstatic       #21  <Field boolean a>
		}
	//   24   50:return          
	}

	public al d(ViewGroup viewgroup)
	{
		return ((al) (new ak(viewgroup)));
	//    0    0:new             #59  <Class ak>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #62  <Method void ak(ViewGroup)>
	//    4    8:areturn         
	}

	public void e(ViewGroup viewgroup, boolean flag)
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void d()>
		if(c != null)
	//*   2    4:getstatic       #39  <Field Method c>
	//*   3    7:ifnull          51
			try
			{
				c.invoke(((Object) (viewgroup)), new Object[] {
					Boolean.valueOf(flag)
				});
	//    4   10:getstatic       #39  <Field Method c>
	//    5   13:aload_1         
	//    6   14:iconst_1        
	//    7   15:anewarray       Object[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:iload_2         
	//   11   21:invokestatic    #77  <Method Boolean Boolean.valueOf(boolean)>
	//   12   24:aastore         
	//   13   25:invokevirtual   #81  <Method Object Method.invoke(Object, Object[])>
	//   14   28:pop             
				return;
	//   15   29:return          
			}
			// Misplaced declaration of an exception variable
			catch(ViewGroup viewgroup)
	//*  16   30:astore_1        
			{
				Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", ((Throwable) (viewgroup)));
	//   17   31:ldc1            #47  <String "ViewUtilsApi18">
	//   18   33:ldc1            #83  <String "Failed to invoke suppressLayout method">
	//   19   35:aload_1         
	//   20   36:invokestatic    #55  <Method int Log.i(String, String, Throwable)>
	//   21   39:pop             
				return;
	//   22   40:return          
			}
			// Misplaced declaration of an exception variable
			catch(ViewGroup viewgroup)
	//*  23   41:astore_1        
			{
				Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", ((Throwable) (viewgroup)));
	//   24   42:ldc1            #47  <String "ViewUtilsApi18">
	//   25   44:ldc1            #85  <String "Error invoking suppressLayout method">
	//   26   46:aload_1         
	//   27   47:invokestatic    #55  <Method int Log.i(String, String, Throwable)>
	//   28   50:pop             
			}
	//   29   51:return          
	}

	private static boolean a;
	private static Method c;
}
