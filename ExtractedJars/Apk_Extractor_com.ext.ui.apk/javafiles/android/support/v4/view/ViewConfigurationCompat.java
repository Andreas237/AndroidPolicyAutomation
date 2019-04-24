// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

public final class ViewConfigurationCompat
{

	private ViewConfigurationCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:return          
	}

	private static float getLegacyScrollFactor(ViewConfiguration viewconfiguration, Context context)
	{
		if(android.os.Build.VERSION.SDK_INT < 25 || sGetScaledScrollFactorMethod == null)
			break MISSING_BLOCK_LABEL_44;
	//    0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          25
	//    2    5:icmplt          44
	//    3    8:getstatic       #33  <Field Method sGetScaledScrollFactorMethod>
	//    4   11:ifnull          44
		int i = ((Integer)sGetScaledScrollFactorMethod.invoke(((Object) (viewconfiguration)), new Object[0])).intValue();
	//    5   14:getstatic       #33  <Field Method sGetScaledScrollFactorMethod>
	//    6   17:aload_0         
	//    7   18:iconst_0        
	//    8   19:anewarray       Object[]
	//    9   22:invokevirtual   #53  <Method Object Method.invoke(Object, Object[])>
	//   10   25:checkcast       #55  <Class Integer>
	//   11   28:invokevirtual   #59  <Method int Integer.intValue()>
	//   12   31:istore_2        
		return (float)i;
	//   13   32:iload_2         
	//   14   33:i2f             
	//   15   34:freturn         
		viewconfiguration;
	//   16   35:astore_0        
		Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
	//   17   36:ldc1            #9   <String "ViewConfigCompat">
	//   18   38:ldc1            #35  <String "Could not find method getScaledScrollFactor() on ViewConfiguration">
	//   19   40:invokestatic    #41  <Method int Log.i(String, String)>
	//   20   43:pop             
		viewconfiguration = ((ViewConfiguration) (new TypedValue()));
	//   21   44:new             #61  <Class TypedValue>
	//   22   47:dup             
	//   23   48:invokespecial   #62  <Method void TypedValue()>
	//   24   51:astore_0        
		if(context.getTheme().resolveAttribute(0x101004d, ((TypedValue) (viewconfiguration)), true))
	//*  25   52:aload_1         
	//*  26   53:invokevirtual   #68  <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  27   56:ldc1            #69  <Int 0x101004d>
	//*  28   58:aload_0         
	//*  29   59:iconst_1        
	//*  30   60:invokevirtual   #75  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  31   63:ifeq            78
			return ((TypedValue) (viewconfiguration)).getDimension(context.getResources().getDisplayMetrics());
	//   32   66:aload_0         
	//   33   67:aload_1         
	//   34   68:invokevirtual   #79  <Method Resources Context.getResources()>
	//   35   71:invokevirtual   #85  <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   36   74:invokevirtual   #89  <Method float TypedValue.getDimension(android.util.DisplayMetrics)>
	//   37   77:freturn         
		else
			return 0.0F;
	//   38   78:fconst_0        
	//   39   79:freturn         
	}

	public static float getScaledHorizontalScrollFactor(ViewConfiguration viewconfiguration, Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return viewconfiguration.getScaledHorizontalScrollFactor();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #94  <Method float ViewConfiguration.getScaledHorizontalScrollFactor()>
	//    5   12:freturn         
		else
			return getLegacyScrollFactor(viewconfiguration, context);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokestatic    #96  <Method float getLegacyScrollFactor(ViewConfiguration, Context)>
	//    9   18:freturn         
	}

	public static int getScaledPagingTouchSlop(ViewConfiguration viewconfiguration)
	{
		return viewconfiguration.getScaledPagingTouchSlop();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #101 <Method int ViewConfiguration.getScaledPagingTouchSlop()>
	//    2    4:ireturn         
	}

	public static float getScaledVerticalScrollFactor(ViewConfiguration viewconfiguration, Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return viewconfiguration.getScaledVerticalScrollFactor();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #105 <Method float ViewConfiguration.getScaledVerticalScrollFactor()>
	//    5   12:freturn         
		else
			return getLegacyScrollFactor(viewconfiguration, context);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokestatic    #96  <Method float getLegacyScrollFactor(ViewConfiguration, Context)>
	//    9   18:freturn         
	}

	public static boolean hasPermanentMenuKey(ViewConfiguration viewconfiguration)
	{
		return viewconfiguration.hasPermanentMenuKey();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #110 <Method boolean ViewConfiguration.hasPermanentMenuKey()>
	//    2    4:ireturn         
	}

	private static final String TAG = "ViewConfigCompat";
	private static Method sGetScaledScrollFactorMethod = ((Class) (android/view/ViewConfiguration)).getDeclaredMethod("getScaledScrollFactor", new Class[0]);

	static 
	{
		if(android.os.Build.VERSION.SDK_INT != 25)
			break MISSING_BLOCK_LABEL_22;
	//    0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          25
	//    2    5:icmpne          22
	//    3    8:ldc1            #23  <Class ViewConfiguration>
	//    4   10:ldc1            #25  <String "getScaledScrollFactor">
	//    5   12:iconst_0        
	//    6   13:anewarray       Class[]
	//    7   16:invokevirtual   #31  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    8   19:putstatic       #33  <Field Method sGetScaledScrollFactorMethod>
		return;
	//    9   22:return          
		Exception exception;
		exception;
	//   10   23:astore_0        
		Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
	//   11   24:ldc1            #9   <String "ViewConfigCompat">
	//   12   26:ldc1            #35  <String "Could not find method getScaledScrollFactor() on ViewConfiguration">
	//   13   28:invokestatic    #41  <Method int Log.i(String, String)>
	//   14   31:pop             
	//   15   32:return          
	}
}
