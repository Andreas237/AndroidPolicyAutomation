// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;

// Referenced classes of package android.support.v7.app:
//			ActionBarDrawerToggle

private static class ActionBarDrawerToggle$IcsDelegate extends egate
{

	public Context getActionBarThemedContext()
	{
		ActionBar actionbar = mActivity.getActionBar();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Activity mActivity>
	//    2    4:invokevirtual   #27  <Method ActionBar Activity.getActionBar()>
	//    3    7:astore_1        
		if(actionbar != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			return actionbar.getThemedContext();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #32  <Method Context ActionBar.getThemedContext()>
	//    8   16:areturn         
		else
			return ((Context) (mActivity));
	//    9   17:aload_0         
	//   10   18:getfield        #21  <Field Activity mActivity>
	//   11   21:areturn         
	}

	ActionBarDrawerToggle$IcsDelegate(Activity activity)
	{
		super(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void ActionBarDrawerToggle$HoneycombDelegate(Activity)>
	//    3    5:return          
	}
}
