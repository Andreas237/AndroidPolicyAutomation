// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

class ActionBarDrawerToggleJellybeanMR2
{

	ActionBarDrawerToggleJellybeanMR2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static Drawable getThemeUpIndicator(Activity activity)
	{
		Object obj = ((Object) (activity.getActionBar()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method ActionBar Activity.getActionBar()>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			activity = ((Activity) (((ActionBar) (obj)).getThemedContext()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #36  <Method Context ActionBar.getThemedContext()>
	//    7   13:astore_0        
	//*   8   14:goto            17
		activity = ((Activity) (((Context) (activity)).obtainStyledAttributes(((android.util.AttributeSet) (null)), THEME_ATTRS, 0x10102ce, 0)));
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:getstatic       #18  <Field int[] THEME_ATTRS>
	//   12   22:ldc1            #37  <Int 0x10102ce>
	//   13   24:iconst_0        
	//   14   25:invokevirtual   #43  <Method TypedArray Context.obtainStyledAttributes(android.util.AttributeSet, int[], int, int)>
	//   15   28:astore_0        
		obj = ((Object) (((TypedArray) (activity)).getDrawable(0)));
	//   16   29:aload_0         
	//   17   30:iconst_0        
	//   18   31:invokevirtual   #49  <Method Drawable TypedArray.getDrawable(int)>
	//   19   34:astore_1        
		((TypedArray) (activity)).recycle();
	//   20   35:aload_0         
	//   21   36:invokevirtual   #52  <Method void TypedArray.recycle()>
		return ((Drawable) (obj));
	//   22   39:aload_1         
	//   23   40:areturn         
	}

	public static Object setActionBarDescription(Object obj, Activity activity, int i)
	{
		activity = ((Activity) (activity.getActionBar()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #30  <Method ActionBar Activity.getActionBar()>
	//    2    4:astore_1        
		if(activity != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			((ActionBar) (activity)).setHomeActionContentDescription(i);
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:invokevirtual   #58  <Method void ActionBar.setHomeActionContentDescription(int)>
		return obj;
	//    8   14:aload_0         
	//    9   15:areturn         
	}

	public static Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i)
	{
		activity = ((Activity) (activity.getActionBar()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #30  <Method ActionBar Activity.getActionBar()>
	//    2    4:astore_1        
		if(activity != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
		{
			((ActionBar) (activity)).setHomeAsUpIndicator(drawable);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #64  <Method void ActionBar.setHomeAsUpIndicator(Drawable)>
			((ActionBar) (activity)).setHomeActionContentDescription(i);
	//    8   14:aload_1         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #58  <Method void ActionBar.setHomeActionContentDescription(int)>
		}
		return obj;
	//   11   19:aload_0         
	//   12   20:areturn         
	}

	private static final String TAG = "ActionBarDrawerToggleImplJellybeanMR2";
	private static final int THEME_ATTRS[] = {
		0x101030b
	};

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #16  <Int 0x101030b>
	//    5    7:iastore         
	//    6    8:putstatic       #18  <Field int[] THEME_ATTRS>
	//*   7   11:return          
	}
}
