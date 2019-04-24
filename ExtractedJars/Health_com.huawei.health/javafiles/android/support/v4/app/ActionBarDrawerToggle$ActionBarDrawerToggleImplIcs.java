// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.app:
//			ActionBarDrawerToggle, ActionBarDrawerToggleIcs

static class ActionBarDrawerToggle$ActionBarDrawerToggleImplIcs
	implements ActionBarDrawerToggle.ActionBarDrawerToggleImpl
{

	public Drawable getThemeUpIndicator(Activity activity)
	{
		return ActionBarDrawerToggleIcs.getThemeUpIndicator(activity);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method Drawable ActionBarDrawerToggleIcs.getThemeUpIndicator(Activity)>
	//    2    4:areturn         
	}

	public Object setActionBarDescription(Object obj, Activity activity, int i)
	{
		return ActionBarDrawerToggleIcs.setActionBarDescription(obj, activity, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #27  <Method Object ActionBarDrawerToggleIcs.setActionBarDescription(Object, Activity, int)>
	//    4    6:areturn         
	}

	public Object setActionBarUpIndicator(Object obj, Activity activity, Drawable drawable, int i)
	{
		return ActionBarDrawerToggleIcs.setActionBarUpIndicator(obj, activity, drawable, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:iload           4
	//    4    5:invokestatic    #31  <Method Object ActionBarDrawerToggleIcs.setActionBarUpIndicator(Object, Activity, Drawable, int)>
	//    5    8:areturn         
	}

	ActionBarDrawerToggle$ActionBarDrawerToggleImplIcs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}
}
