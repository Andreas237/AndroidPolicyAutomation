// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ViewUtils
{

	private ViewUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Object()>
	//    2    4:return          
	}

	public static void computeFitSystemWindows(View view, Rect rect, Rect rect1)
	{
		if(sComputeFitSystemWindowsMethod == null)
			break MISSING_BLOCK_LABEL_26;
	//    0    0:getstatic       #38  <Field Method sComputeFitSystemWindowsMethod>
	//    1    3:ifnull          26
		sComputeFitSystemWindowsMethod.invoke(((Object) (view)), new Object[] {
			rect, rect1
		});
	//    2    6:getstatic       #38  <Field Method sComputeFitSystemWindowsMethod>
	//    3    9:aload_0         
	//    4   10:iconst_2        
	//    5   11:anewarray       Object[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:aload_1         
	//    9   17:aastore         
	//   10   18:dup             
	//   11   19:iconst_1        
	//   12   20:aload_2         
	//   13   21:aastore         
	//   14   22:invokevirtual   #67  <Method Object Method.invoke(Object, Object[])>
	//   15   25:pop             
		return;
	//   16   26:return          
		view;
	//   17   27:astore_0        
		Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", ((Throwable) (view)));
	//   18   28:ldc1            #12  <String "ViewUtils">
	//   19   30:ldc1            #69  <String "Could not invoke computeFitSystemWindows">
	//   20   32:aload_0         
	//   21   33:invokestatic    #72  <Method int Log.d(String, String, Throwable)>
	//   22   36:pop             
		return;
	//   23   37:return          
	}

	public static boolean isLayoutRtl(View view)
	{
		return ViewCompat.getLayoutDirection(view) == 1;
	//    0    0:aload_0         
	//    1    1:invokestatic    #80  <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public static void makeOptionalFitsSystemWindows(View view)
	{
		if(android.os.Build.VERSION.SDK_INT < 16)
			break MISSING_BLOCK_LABEL_44;
	//    0    0:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          16
	//    2    5:icmplt          44
		Method method = ((Object) (view)).getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
	//    3    8:aload_0         
	//    4    9:invokevirtual   #90  <Method Class Object.getClass()>
	//    5   12:ldc1            #91  <String "makeOptionalFitsSystemWindows">
	//    6   14:iconst_0        
	//    7   15:anewarray       Class[]
	//    8   18:invokevirtual   #94  <Method Method Class.getMethod(String, Class[])>
	//    9   21:astore_1        
		if(!method.isAccessible())
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #44  <Method boolean Method.isAccessible()>
	//*  12   26:ifne            34
			method.setAccessible(true);
	//   13   29:aload_1         
	//   14   30:iconst_1        
	//   15   31:invokevirtual   #48  <Method void Method.setAccessible(boolean)>
		method.invoke(((Object) (view)), new Object[0]);
	//   16   34:aload_1         
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:anewarray       Object[]
	//   20   40:invokevirtual   #67  <Method Object Method.invoke(Object, Object[])>
	//   21   43:pop             
		return;
	//   22   44:return          
		view;
	//   23   45:astore_0        
		Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
	//   24   46:ldc1            #12  <String "ViewUtils">
	//   25   48:ldc1            #96  <String "Could not find method makeOptionalFitsSystemWindows. Oh well...">
	//   26   50:invokestatic    #56  <Method int Log.d(String, String)>
	//   27   53:pop             
		return;
	//   28   54:return          
		view;
	//   29   55:astore_0        
		Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", ((Throwable) (view)));
	//   30   56:ldc1            #12  <String "ViewUtils">
	//   31   58:ldc1            #98  <String "Could not invoke makeOptionalFitsSystemWindows">
	//   32   60:aload_0         
	//   33   61:invokestatic    #72  <Method int Log.d(String, String, Throwable)>
	//   34   64:pop             
		return;
	//   35   65:return          
		view;
	//   36   66:astore_0        
		Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", ((Throwable) (view)));
	//   37   67:ldc1            #12  <String "ViewUtils">
	//   38   69:ldc1            #98  <String "Could not invoke makeOptionalFitsSystemWindows">
	//   39   71:aload_0         
	//   40   72:invokestatic    #72  <Method int Log.d(String, String, Throwable)>
	//   41   75:pop             
		return;
	//   42   76:return          
	}

	private static final String TAG = "ViewUtils";
	private static Method sComputeFitSystemWindowsMethod;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT < 18)
			break MISSING_BLOCK_LABEL_48;
	//    0    0:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          18
	//    2    5:icmplt          48
		sComputeFitSystemWindowsMethod = ((Class) (android/view/View)).getDeclaredMethod("computeFitSystemWindows", new Class[] {
			android/graphics/Rect, android/graphics/Rect
		});
	//    3    8:ldc1            #26  <Class View>
	//    4   10:ldc1            #28  <String "computeFitSystemWindows">
	//    5   12:iconst_2        
	//    6   13:anewarray       Class[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:ldc1            #32  <Class Rect>
	//   10   20:aastore         
	//   11   21:dup             
	//   12   22:iconst_1        
	//   13   23:ldc1            #32  <Class Rect>
	//   14   25:aastore         
	//   15   26:invokevirtual   #36  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   16   29:putstatic       #38  <Field Method sComputeFitSystemWindowsMethod>
		if(!sComputeFitSystemWindowsMethod.isAccessible())
	//*  17   32:getstatic       #38  <Field Method sComputeFitSystemWindowsMethod>
	//*  18   35:invokevirtual   #44  <Method boolean Method.isAccessible()>
	//*  19   38:ifne            48
			sComputeFitSystemWindowsMethod.setAccessible(true);
	//   20   41:getstatic       #38  <Field Method sComputeFitSystemWindowsMethod>
	//   21   44:iconst_1        
	//   22   45:invokevirtual   #48  <Method void Method.setAccessible(boolean)>
		return;
	//   23   48:return          
		NoSuchMethodException nosuchmethodexception;
		nosuchmethodexception;
	//   24   49:astore_0        
		Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
	//   25   50:ldc1            #12  <String "ViewUtils">
	//   26   52:ldc1            #50  <String "Could not find method computeFitSystemWindows. Oh well.">
	//   27   54:invokestatic    #56  <Method int Log.d(String, String)>
	//   28   57:pop             
	//   29   58:return          
	}
}
