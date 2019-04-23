// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Rect;
import android.support.v4.view.ac;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ViewUtils
{

	private ViewUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void Object()>
	//    2    4:return          
	}

	public static void computeFitSystemWindows(View view, Rect rect, Rect rect1)
	{
		Method method = sComputeFitSystemWindowsMethod;
	//    0    0:getstatic       #34  <Field Method sComputeFitSystemWindowsMethod>
	//    1    3:astore_3        
		if(method != null)
	//*   2    4:aload_3         
	//*   3    5:ifnull          37
			try
			{
				method.invoke(((Object) (view)), new Object[] {
					rect, rect1
				});
	//    4    8:aload_3         
	//    5    9:aload_0         
	//    6   10:iconst_2        
	//    7   11:anewarray       Object[]
	//    8   14:dup             
	//    9   15:iconst_0        
	//   10   16:aload_1         
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_1        
	//   14   20:aload_2         
	//   15   21:aastore         
	//   16   22:invokevirtual   #63  <Method Object Method.invoke(Object, Object[])>
	//   17   25:pop             
				return;
	//   18   26:return          
			}
			// Misplaced declaration of an exception variable
			catch(View view)
	//*  19   27:astore_0        
			{
				Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", ((Throwable) (view)));
	//   20   28:ldc1            #8   <String "ViewUtils">
	//   21   30:ldc1            #65  <String "Could not invoke computeFitSystemWindows">
	//   22   32:aload_0         
	//   23   33:invokestatic    #68  <Method int Log.d(String, String, Throwable)>
	//   24   36:pop             
			}
	//   25   37:return          
	}

	public static boolean isLayoutRtl(View view)
	{
		return ac.f(view) == 1;
	//    0    0:aload_0         
	//    1    1:invokestatic    #76  <Method int ac.f(View)>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public static void makeOptionalFitsSystemWindows(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #20  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          75
			try
			{
				Method method = ((Object) (view)).getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
	//    3    8:aload_0         
	//    4    9:invokevirtual   #86  <Method Class Object.getClass()>
	//    5   12:ldc1            #87  <String "makeOptionalFitsSystemWindows">
	//    6   14:iconst_0        
	//    7   15:anewarray       Class[]
	//    8   18:invokevirtual   #90  <Method Method Class.getMethod(String, Class[])>
	//    9   21:astore_1        
				if(!method.isAccessible())
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #40  <Method boolean Method.isAccessible()>
	//*  12   26:ifne            34
					method.setAccessible(true);
	//   13   29:aload_1         
	//   14   30:iconst_1        
	//   15   31:invokevirtual   #44  <Method void Method.setAccessible(boolean)>
				method.invoke(((Object) (view)), new Object[0]);
	//   16   34:aload_1         
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:anewarray       Object[]
	//   20   40:invokevirtual   #63  <Method Object Method.invoke(Object, Object[])>
	//   21   43:pop             
				return;
	//   22   44:return          
			}
	//*  23   45:astore_0        
	//*  24   46:ldc1            #8   <String "ViewUtils">
	//*  25   48:ldc1            #92  <String "Could not invoke makeOptionalFitsSystemWindows">
	//*  26   50:aload_0         
	//*  27   51:invokestatic    #68  <Method int Log.d(String, String, Throwable)>
	//*  28   54:pop             
	//*  29   55:return          
	//*  30   56:astore_0        
	//*  31   57:ldc1            #8   <String "ViewUtils">
	//*  32   59:ldc1            #92  <String "Could not invoke makeOptionalFitsSystemWindows">
	//*  33   61:aload_0         
	//*  34   62:invokestatic    #68  <Method int Log.d(String, String, Throwable)>
	//*  35   65:pop             
	//*  36   66:return          
	//*  37   67:ldc1            #8   <String "ViewUtils">
	//*  38   69:ldc1            #94  <String "Could not find method makeOptionalFitsSystemWindows. Oh well...">
	//*  39   71:invokestatic    #52  <Method int Log.d(String, String)>
	//*  40   74:pop             
	//*  41   75:return          
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
			}
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", ((Throwable) (view)));
				return;
			}
			// Misplaced declaration of an exception variable
			catch(View view)
			{
				Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", ((Throwable) (view)));
				return;
			}
	//*  42   76:astore_0        
	//*  43   77:goto            67
	}

	private static final String TAG = "ViewUtils";
	private static Method sComputeFitSystemWindowsMethod;

	static 
	{
		NoSuchMethodException nosuchmethodexception;
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #20  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          57
			try
			{
				sComputeFitSystemWindowsMethod = ((Class) (android/view/View)).getDeclaredMethod("computeFitSystemWindows", new Class[] {
					android/graphics/Rect, android/graphics/Rect
				});
	//    3    8:ldc1            #22  <Class View>
	//    4   10:ldc1            #24  <String "computeFitSystemWindows">
	//    5   12:iconst_2        
	//    6   13:anewarray       Class[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:ldc1            #28  <Class Rect>
	//   10   20:aastore         
	//   11   21:dup             
	//   12   22:iconst_1        
	//   13   23:ldc1            #28  <Class Rect>
	//   14   25:aastore         
	//   15   26:invokevirtual   #32  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   16   29:putstatic       #34  <Field Method sComputeFitSystemWindowsMethod>
				if(!sComputeFitSystemWindowsMethod.isAccessible())
	//*  17   32:getstatic       #34  <Field Method sComputeFitSystemWindowsMethod>
	//*  18   35:invokevirtual   #40  <Method boolean Method.isAccessible()>
	//*  19   38:ifne            57
				{
					sComputeFitSystemWindowsMethod.setAccessible(true);
	//   20   41:getstatic       #34  <Field Method sComputeFitSystemWindowsMethod>
	//   21   44:iconst_1        
	//   22   45:invokevirtual   #44  <Method void Method.setAccessible(boolean)>
					return;
	//   23   48:return          
				}
			}
	//*  24   49:ldc1            #8   <String "ViewUtils">
	//*  25   51:ldc1            #46  <String "Could not find method computeFitSystemWindows. Oh well.">
	//*  26   53:invokestatic    #52  <Method int Log.d(String, String)>
	//*  27   56:pop             
	//*  28   57:return          
			// Misplaced declaration of an exception variable
			catch(NoSuchMethodException nosuchmethodexception)
			{
				Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
			}
	//*  29   58:astore_0        
	//*  30   59:goto            49
	}
}
