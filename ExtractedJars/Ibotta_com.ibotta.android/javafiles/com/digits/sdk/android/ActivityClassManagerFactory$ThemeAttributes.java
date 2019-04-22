// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import java.lang.reflect.Field;

// Referenced classes of package com.digits.sdk.android:
//			ActivityClassManagerFactory

static class ActivityClassManagerFactory$ThemeAttributes
{

	private final int styleableTheme[];
	private final int styleableThemeWindowActionBar;


/*
	static int[] access$000(ActivityClassManagerFactory$ThemeAttributes activityclassmanagerfactory$themeattributes)
	{
		return activityclassmanagerfactory$themeattributes.styleableTheme;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int[] styleableTheme>
	//    2    4:areturn         
	}

*/


/*
	static int access$100(ActivityClassManagerFactory$ThemeAttributes activityclassmanagerfactory$themeattributes)
	{
		return activityclassmanagerfactory$themeattributes.styleableThemeWindowActionBar;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int styleableThemeWindowActionBar>
	//    2    4:ireturn         
	}

*/

	public ActivityClassManagerFactory$ThemeAttributes()
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
