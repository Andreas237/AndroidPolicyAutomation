// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.app:
//			ActionBarDrawerToggle, ActionBarDrawerToggleHoneycomb

static class ActionBarDrawerToggle$HoneycombDelegate
	implements ActionBarDrawerToggle.Delegate
{

	public Context getActionBarThemedContext()
	{
		return ((Context) (mActivity));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Activity mActivity>
	//    2    4:areturn         
	}

	public Drawable getThemeUpIndicator()
	{
		return ActionBarDrawerToggleHoneycomb.getThemeUpIndicator(mActivity);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Activity mActivity>
	//    2    4:invokestatic    #33  <Method Drawable ActionBarDrawerToggleHoneycomb.getThemeUpIndicator(Activity)>
	//    3    7:areturn         
	}

	public boolean isNavigationVisible()
	{
		ActionBar actionbar = mActivity.getActionBar();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Activity mActivity>
	//    2    4:invokevirtual   #41  <Method ActionBar Activity.getActionBar()>
	//    3    7:astore_1        
		return actionbar != null && (actionbar.getDisplayOptions() & 4) != 0;
	//    4    8:aload_1         
	//    5    9:ifnull          23
	//    6   12:aload_1         
	//    7   13:invokevirtual   #47  <Method int ActionBar.getDisplayOptions()>
	//    8   16:iconst_4        
	//    9   17:iand            
	//   10   18:ifeq            23
	//   11   21:iconst_1        
	//   12   22:ireturn         
	//   13   23:iconst_0        
	//   14   24:ireturn         
	}

	public void setActionBarDescription(int i)
	{
		mSetIndicatorInfo = ActionBarDrawerToggleHoneycomb.setActionBarDescription(mSetIndicatorInfo, mActivity, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #51  <Field ActionBarDrawerToggleHoneycomb$SetIndicatorInfo mSetIndicatorInfo>
	//    3    5:aload_0         
	//    4    6:getfield        #23  <Field Activity mActivity>
	//    5    9:iload_1         
	//    6   10:invokestatic    #54  <Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo ActionBarDrawerToggleHoneycomb.setActionBarDescription(ActionBarDrawerToggleHoneycomb$SetIndicatorInfo, Activity, int)>
	//    7   13:putfield        #51  <Field ActionBarDrawerToggleHoneycomb$SetIndicatorInfo mSetIndicatorInfo>
	//    8   16:return          
	}

	public void setActionBarUpIndicator(Drawable drawable, int i)
	{
		ActionBar actionbar = mActivity.getActionBar();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Activity mActivity>
	//    2    4:invokevirtual   #41  <Method ActionBar Activity.getActionBar()>
	//    3    7:astore_3        
		if(actionbar != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          39
		{
			actionbar.setDisplayShowHomeEnabled(true);
	//    6   12:aload_3         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #60  <Method void ActionBar.setDisplayShowHomeEnabled(boolean)>
			mSetIndicatorInfo = ActionBarDrawerToggleHoneycomb.setActionBarUpIndicator(mSetIndicatorInfo, mActivity, drawable, i);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #51  <Field ActionBarDrawerToggleHoneycomb$SetIndicatorInfo mSetIndicatorInfo>
	//   12   22:aload_0         
	//   13   23:getfield        #23  <Field Activity mActivity>
	//   14   26:aload_1         
	//   15   27:iload_2         
	//   16   28:invokestatic    #63  <Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo ActionBarDrawerToggleHoneycomb.setActionBarUpIndicator(ActionBarDrawerToggleHoneycomb$SetIndicatorInfo, Activity, Drawable, int)>
	//   17   31:putfield        #51  <Field ActionBarDrawerToggleHoneycomb$SetIndicatorInfo mSetIndicatorInfo>
			actionbar.setDisplayShowHomeEnabled(false);
	//   18   34:aload_3         
	//   19   35:iconst_0        
	//   20   36:invokevirtual   #60  <Method void ActionBar.setDisplayShowHomeEnabled(boolean)>
		}
	//   21   39:return          
	}

	final Activity mActivity;
	torInfo mSetIndicatorInfo;

	ActionBarDrawerToggle$HoneycombDelegate(Activity activity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mActivity = activity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Activity mActivity>
	//    5    9:return          
	}
}
