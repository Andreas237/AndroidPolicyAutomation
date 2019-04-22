// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.Context;
import android.content.res.TypedArray;
import java.lang.reflect.Field;

// Referenced classes of package com.digits.sdk.android:
//			AppCompatClassManagerImp, ActivityClassManagerImp, ActivityClassManager

class ActivityClassManagerFactory
{
	static class ThemeAttributes
	{

		private final int styleableTheme[];
		private final int styleableThemeWindowActionBar;


/*
		static int[] access$000(ThemeAttributes themeattributes)
		{
			return themeattributes.styleableTheme;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field int[] styleableTheme>
		//    2    4:areturn         
		}

*/


/*
		static int access$100(ThemeAttributes themeattributes)
		{
			return themeattributes.styleableThemeWindowActionBar;
		//    0    0:aload_0         
		//    1    1:getfield        #54  <Field int styleableThemeWindowActionBar>
		//    2    4:ireturn         
		}

*/

		public ThemeAttributes()
			throws Exception
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			Object obj = ((Object) (Class.forName("android.support.v7.appcompat.R$styleable")));
		//    2    4:ldc1            #19  <String "android.support.v7.appcompat.R$styleable">
		//    3    6:invokestatic    #25  <Method Class Class.forName(String)>
		//    4    9:astore_1        
			Field field = ((Class) (obj)).getField("Theme");
		//    5   10:aload_1         
		//    6   11:ldc1            #27  <String "Theme">
		//    7   13:invokevirtual   #31  <Method Field Class.getField(String)>
		//    8   16:astore_2        
			styleableTheme = (int[])field.get(((Object) (field.getType())));
		//    9   17:aload_0         
		//   10   18:aload_2         
		//   11   19:aload_2         
		//   12   20:invokevirtual   #37  <Method Class Field.getType()>
		//   13   23:invokevirtual   #41  <Method Object Field.get(Object)>
		//   14   26:checkcast       #42  <Class int[]>
		//   15   29:putfield        #44  <Field int[] styleableTheme>
			obj = ((Object) (((Class) (obj)).getField("Theme_windowActionBar")));
		//   16   32:aload_1         
		//   17   33:ldc1            #46  <String "Theme_windowActionBar">
		//   18   35:invokevirtual   #31  <Method Field Class.getField(String)>
		//   19   38:astore_1        
			styleableThemeWindowActionBar = ((Integer)((Field) (obj)).get(((Object) (((Field) (obj)).getType())))).intValue();
		//   20   39:aload_0         
		//   21   40:aload_1         
		//   22   41:aload_1         
		//   23   42:invokevirtual   #37  <Method Class Field.getType()>
		//   24   45:invokevirtual   #41  <Method Object Field.get(Object)>
		//   25   48:checkcast       #48  <Class Integer>
		//   26   51:invokevirtual   #52  <Method int Integer.intValue()>
		//   27   54:putfield        #54  <Field int styleableThemeWindowActionBar>
		//   28   57:return          
		}
	}


	ActivityClassManagerFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private boolean isAppCompatTheme(Context context, int i, ThemeAttributes themeattributes)
	{
		context = ((Context) (context.obtainStyledAttributes(i, themeattributes.styleableTheme)));
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #18  <Method int[] ActivityClassManagerFactory$ThemeAttributes.access$000(ActivityClassManagerFactory$ThemeAttributes)>
	//    4    6:invokevirtual   #24  <Method TypedArray Context.obtainStyledAttributes(int, int[])>
	//    5    9:astore_1        
		boolean flag = ((TypedArray) (context)).hasValue(themeattributes.styleableThemeWindowActionBar);
	//    6   10:aload_1         
	//    7   11:aload_3         
	//    8   12:invokestatic    #28  <Method int ActivityClassManagerFactory$ThemeAttributes.access$100(ActivityClassManagerFactory$ThemeAttributes)>
	//    9   15:invokevirtual   #34  <Method boolean TypedArray.hasValue(int)>
	//   10   18:istore          4
		((TypedArray) (context)).recycle();
	//   11   20:aload_1         
	//   12   21:invokevirtual   #37  <Method void TypedArray.recycle()>
		return flag;
	//   13   24:iload           4
	//   14   26:ireturn         
	}

	ActivityClassManager createActivityClassManager(Context context, int i)
	{
		try
		{
			Class.forName("android.support.v7.app.ActionBarActivity");
	//    0    0:ldc1            #43  <String "android.support.v7.app.ActionBarActivity">
	//    1    2:invokestatic    #49  <Method Class Class.forName(String)>
	//    2    5:pop             
			if(isAppCompatTheme(context, i, new ThemeAttributes()))
	//*   3    6:aload_0         
	//*   4    7:aload_1         
	//*   5    8:iload_2         
	//*   6    9:new             #6   <Class ActivityClassManagerFactory$ThemeAttributes>
	//*   7   12:dup             
	//*   8   13:invokespecial   #50  <Method void ActivityClassManagerFactory$ThemeAttributes()>
	//*   9   16:invokespecial   #52  <Method boolean isAppCompatTheme(Context, int, ActivityClassManagerFactory$ThemeAttributes)>
	//*  10   19:ifeq            30
				return ((ActivityClassManager) (new AppCompatClassManagerImp()));
	//   11   22:new             #54  <Class AppCompatClassManagerImp>
	//   12   25:dup             
	//   13   26:invokespecial   #55  <Method void AppCompatClassManagerImp()>
	//   14   29:areturn         
			context = ((Context) (new ActivityClassManagerImp()));
	//   15   30:new             #57  <Class ActivityClassManagerImp>
	//   16   33:dup             
	//   17   34:invokespecial   #58  <Method void ActivityClassManagerImp()>
	//   18   37:astore_1        
		}
	//*  19   38:aload_1         
	//*  20   39:areturn         
	//*  21   40:new             #57  <Class ActivityClassManagerImp>
	//*  22   43:dup             
	//*  23   44:invokespecial   #58  <Method void ActivityClassManagerImp()>
	//*  24   47:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return ((ActivityClassManager) (new ActivityClassManagerImp()));
		}
		return ((ActivityClassManager) (context));
	//*  25   48:astore_1        
	//*  26   49:goto            40
	}
}
