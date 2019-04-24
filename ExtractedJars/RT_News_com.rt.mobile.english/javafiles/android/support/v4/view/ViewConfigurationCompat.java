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
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:return          
	}

	private static float getLegacyScrollFactor(ViewConfiguration viewconfiguration, Context context)
	{
		if(android.os.Build.VERSION.SDK_INT < 25 || sGetScaledScrollFactorMethod == null) goto _L2; else goto _L1
	//    0    0:getstatic       #20  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          25
	//    2    5:icmplt          43
	//    3    8:getstatic       #32  <Field Method sGetScaledScrollFactorMethod>
	//    4   11:ifnull          43
_L1:
		int i = ((Integer)sGetScaledScrollFactorMethod.invoke(((Object) (viewconfiguration)), new Object[0])).intValue();
	//    5   14:getstatic       #32  <Field Method sGetScaledScrollFactorMethod>
	//    6   17:aload_0         
	//    7   18:iconst_0        
	//    8   19:anewarray       Object[]
	//    9   22:invokevirtual   #52  <Method Object Method.invoke(Object, Object[])>
	//   10   25:checkcast       #54  <Class Integer>
	//   11   28:invokevirtual   #58  <Method int Integer.intValue()>
	//   12   31:istore_2        
		return (float)i;
	//   13   32:iload_2         
	//   14   33:i2f             
	//   15   34:freturn         
_L4:
		Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
	//   16   35:ldc1            #8   <String "ViewConfigCompat">
	//   17   37:ldc1            #34  <String "Could not find method getScaledScrollFactor() on ViewConfiguration">
	//   18   39:invokestatic    #40  <Method int Log.i(String, String)>
	//   19   42:pop             
_L2:
		viewconfiguration = ((ViewConfiguration) (new TypedValue()));
	//   20   43:new             #60  <Class TypedValue>
	//   21   46:dup             
	//   22   47:invokespecial   #61  <Method void TypedValue()>
	//   23   50:astore_0        
		if(context.getTheme().resolveAttribute(0x101004d, ((TypedValue) (viewconfiguration)), true))
	//*  24   51:aload_1         
	//*  25   52:invokevirtual   #67  <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  26   55:ldc1            #68  <Int 0x101004d>
	//*  27   57:aload_0         
	//*  28   58:iconst_1        
	//*  29   59:invokevirtual   #74  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  30   62:ifeq            77
			return ((TypedValue) (viewconfiguration)).getDimension(context.getResources().getDisplayMetrics());
	//   31   65:aload_0         
	//   32   66:aload_1         
	//   33   67:invokevirtual   #78  <Method Resources Context.getResources()>
	//   34   70:invokevirtual   #84  <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   35   73:invokevirtual   #88  <Method float TypedValue.getDimension(android.util.DisplayMetrics)>
	//   36   76:freturn         
		else
			return 0.0F;
	//   37   77:fconst_0        
	//   38   78:freturn         
		viewconfiguration;
	//   39   79:astore_0        
		if(true) goto _L4; else goto _L3
_L3:
	//*  40   80:goto            35
	}

	public static float getScaledHorizontalScrollFactor(ViewConfiguration viewconfiguration, Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #20  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return viewconfiguration.getScaledHorizontalScrollFactor();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #93  <Method float ViewConfiguration.getScaledHorizontalScrollFactor()>
	//    5   12:freturn         
		else
			return getLegacyScrollFactor(viewconfiguration, context);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokestatic    #95  <Method float getLegacyScrollFactor(ViewConfiguration, Context)>
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
	//*   0    0:getstatic       #20  <Field int android.os.Build$VERSION.SDK_INT>
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
	//    8   15:invokestatic    #95  <Method float getLegacyScrollFactor(ViewConfiguration, Context)>
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
	private static Method sGetScaledScrollFactorMethod;

	static 
	{
		Exception exception;
		if(android.os.Build.VERSION.SDK_INT == 25)
	//*   0    0:getstatic       #20  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          25
	//*   2    5:icmpne          31
			try
			{
				sGetScaledScrollFactorMethod = ((Class) (android/view/ViewConfiguration)).getDeclaredMethod("getScaledScrollFactor", new Class[0]);
	//    3    8:ldc1            #22  <Class ViewConfiguration>
	//    4   10:ldc1            #24  <String "getScaledScrollFactor">
	//    5   12:iconst_0        
	//    6   13:anewarray       Class[]
	//    7   16:invokevirtual   #30  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    8   19:putstatic       #32  <Field Method sGetScaledScrollFactorMethod>
				return;
	//    9   22:return          
			}
	//*  10   23:ldc1            #8   <String "ViewConfigCompat">
	//*  11   25:ldc1            #34  <String "Could not find method getScaledScrollFactor() on ViewConfiguration">
	//*  12   27:invokestatic    #40  <Method int Log.i(String, String)>
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
