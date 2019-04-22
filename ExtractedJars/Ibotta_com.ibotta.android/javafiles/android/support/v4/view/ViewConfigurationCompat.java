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

	private static float getLegacyScrollFactor(ViewConfiguration viewconfiguration, Context context)
	{
		if(android.os.Build.VERSION.SDK_INT < 25) goto _L2; else goto _L1
	//    0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          25
	//    2    5:icmplt          43
_L1:
		Method method = sGetScaledScrollFactorMethod;
	//    3    8:getstatic       #28  <Field Method sGetScaledScrollFactorMethod>
	//    4   11:astore_3        
		if(method == null) goto _L2; else goto _L3
	//    5   12:aload_3         
	//    6   13:ifnull          43
_L3:
		int i = ((Integer)method.invoke(((Object) (viewconfiguration)), new Object[0])).intValue();
	//    7   16:aload_3         
	//    8   17:aload_0         
	//    9   18:iconst_0        
	//   10   19:anewarray       Object[]
	//   11   22:invokevirtual   #47  <Method Object Method.invoke(Object, Object[])>
	//   12   25:checkcast       #49  <Class Integer>
	//   13   28:invokevirtual   #53  <Method int Integer.intValue()>
	//   14   31:istore_2        
		return (float)i;
	//   15   32:iload_2         
	//   16   33:i2f             
	//   17   34:freturn         
_L5:
		Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
	//   18   35:ldc1            #30  <String "ViewConfigCompat">
	//   19   37:ldc1            #32  <String "Could not find method getScaledScrollFactor() on ViewConfiguration">
	//   20   39:invokestatic    #38  <Method int Log.i(String, String)>
	//   21   42:pop             
_L2:
		viewconfiguration = ((ViewConfiguration) (new TypedValue()));
	//   22   43:new             #55  <Class TypedValue>
	//   23   46:dup             
	//   24   47:invokespecial   #58  <Method void TypedValue()>
	//   25   50:astore_0        
		if(context.getTheme().resolveAttribute(0x101004d, ((TypedValue) (viewconfiguration)), true))
	//*  26   51:aload_1         
	//*  27   52:invokevirtual   #64  <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  28   55:ldc1            #65  <Int 0x101004d>
	//*  29   57:aload_0         
	//*  30   58:iconst_1        
	//*  31   59:invokevirtual   #71  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  32   62:ifeq            77
			return ((TypedValue) (viewconfiguration)).getDimension(context.getResources().getDisplayMetrics());
	//   33   65:aload_0         
	//   34   66:aload_1         
	//   35   67:invokevirtual   #75  <Method Resources Context.getResources()>
	//   36   70:invokevirtual   #81  <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   37   73:invokevirtual   #85  <Method float TypedValue.getDimension(android.util.DisplayMetrics)>
	//   38   76:freturn         
		else
			return 0.0F;
	//   39   77:fconst_0        
	//   40   78:freturn         
		viewconfiguration;
	//   41   79:astore_0        
		if(true) goto _L5; else goto _L4
_L4:
	//*  42   80:goto            35
	}

	public static float getScaledHorizontalScrollFactor(ViewConfiguration viewconfiguration, Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return viewconfiguration.getScaledHorizontalScrollFactor();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #90  <Method float ViewConfiguration.getScaledHorizontalScrollFactor()>
	//    5   12:freturn         
		else
			return getLegacyScrollFactor(viewconfiguration, context);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokestatic    #92  <Method float getLegacyScrollFactor(ViewConfiguration, Context)>
	//    9   18:freturn         
	}

	public static int getScaledHoverSlop(ViewConfiguration viewconfiguration)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          13
			return viewconfiguration.getScaledHoverSlop();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #97  <Method int ViewConfiguration.getScaledHoverSlop()>
	//    5   12:ireturn         
		else
			return viewconfiguration.getScaledTouchSlop() / 2;
	//    6   13:aload_0         
	//    7   14:invokevirtual   #100 <Method int ViewConfiguration.getScaledTouchSlop()>
	//    8   17:iconst_2        
	//    9   18:idiv            
	//   10   19:ireturn         
	}

	public static int getScaledPagingTouchSlop(ViewConfiguration viewconfiguration)
	{
		return viewconfiguration.getScaledPagingTouchSlop();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #104 <Method int ViewConfiguration.getScaledPagingTouchSlop()>
	//    2    4:ireturn         
	}

	public static float getScaledVerticalScrollFactor(ViewConfiguration viewconfiguration, Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return viewconfiguration.getScaledVerticalScrollFactor();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #108 <Method float ViewConfiguration.getScaledVerticalScrollFactor()>
	//    5   12:freturn         
		else
			return getLegacyScrollFactor(viewconfiguration, context);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokestatic    #92  <Method float getLegacyScrollFactor(ViewConfiguration, Context)>
	//    9   18:freturn         
	}

	public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(ViewConfiguration viewconfiguration, Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          13
			return viewconfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #113 <Method boolean ViewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent()>
	//    5   12:ireturn         
		viewconfiguration = ((ViewConfiguration) (context.getResources()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #75  <Method Resources Context.getResources()>
	//    8   17:astore_0        
		int i = ((Resources) (viewconfiguration)).getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
	//    9   18:aload_0         
	//   10   19:ldc1            #115 <String "config_showMenuShortcutsWhenKeyboardPresent">
	//   11   21:ldc1            #117 <String "bool">
	//   12   23:ldc1            #119 <String "android">
	//   13   25:invokevirtual   #123 <Method int Resources.getIdentifier(String, String, String)>
	//   14   28:istore_2        
		return i != 0 && ((Resources) (viewconfiguration)).getBoolean(i);
	//   15   29:iload_2         
	//   16   30:ifeq            43
	//   17   33:aload_0         
	//   18   34:iload_2         
	//   19   35:invokevirtual   #127 <Method boolean Resources.getBoolean(int)>
	//   20   38:ifeq            43
	//   21   41:iconst_1        
	//   22   42:ireturn         
	//   23   43:iconst_0        
	//   24   44:ireturn         
	}

	private static Method sGetScaledScrollFactorMethod;

	static 
	{
		Exception exception;
		if(android.os.Build.VERSION.SDK_INT == 25)
	//*   0    0:getstatic       #16  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          25
	//*   2    5:icmpne          31
			try
			{
				sGetScaledScrollFactorMethod = ((Class) (android/view/ViewConfiguration)).getDeclaredMethod("getScaledScrollFactor", new Class[0]);
	//    3    8:ldc1            #18  <Class ViewConfiguration>
	//    4   10:ldc1            #20  <String "getScaledScrollFactor">
	//    5   12:iconst_0        
	//    6   13:anewarray       Class[]
	//    7   16:invokevirtual   #26  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    8   19:putstatic       #28  <Field Method sGetScaledScrollFactorMethod>
				return;
	//    9   22:return          
			}
	//*  10   23:ldc1            #30  <String "ViewConfigCompat">
	//*  11   25:ldc1            #32  <String "Could not find method getScaledScrollFactor() on ViewConfiguration">
	//*  12   27:invokestatic    #38  <Method int Log.i(String, String)>
	//*  13   30:pop             
	//*  14   31:return          
			// Misplaced declaration of an exception variable
			catch(Exception exception)
			{
				Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
			}
	//*  15   32:astore_0        
	//*  16   33:goto            23
	}
}
