// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.app:
//			ActionBarDrawerToggle, ActionBarDrawerToggleHoneycomb

private static class ActionBarDrawerToggle$FrameworkActionBarDelegate
	implements ActionBarDrawerToggle.Delegate
{

	public Context getActionBarThemedContext()
	{
		ActionBar actionbar = mActivity.getActionBar();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Activity mActivity>
	//    2    4:invokevirtual   #29  <Method ActionBar Activity.getActionBar()>
	//    3    7:astore_1        
		if(actionbar != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			return actionbar.getThemedContext();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #34  <Method Context ActionBar.getThemedContext()>
	//    8   16:areturn         
		else
			return ((Context) (mActivity));
	//    9   17:aload_0         
	//   10   18:getfield        #20  <Field Activity mActivity>
	//   11   21:areturn         
	}

	public Drawable getThemeUpIndicator()
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #42  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          40
		{
			TypedArray typedarray = getActionBarThemedContext().obtainStyledAttributes(((android.util.AttributeSet) (null)), new int[] {
				0x101030b
			}, 0x10102ce, 0);
	//    3    8:aload_0         
	//    4    9:invokevirtual   #44  <Method Context getActionBarThemedContext()>
	//    5   12:aconst_null     
	//    6   13:iconst_1        
	//    7   14:newarray        int[]
	//    8   16:dup             
	//    9   17:iconst_0        
	//   10   18:ldc1            #45  <Int 0x101030b>
	//   11   20:iastore         
	//   12   21:ldc1            #46  <Int 0x10102ce>
	//   13   23:iconst_0        
	//   14   24:invokevirtual   #52  <Method TypedArray Context.obtainStyledAttributes(android.util.AttributeSet, int[], int, int)>
	//   15   27:astore_1        
			Drawable drawable = typedarray.getDrawable(0);
	//   16   28:aload_1         
	//   17   29:iconst_0        
	//   18   30:invokevirtual   #58  <Method Drawable TypedArray.getDrawable(int)>
	//   19   33:astore_2        
			typedarray.recycle();
	//   20   34:aload_1         
	//   21   35:invokevirtual   #61  <Method void TypedArray.recycle()>
			return drawable;
	//   22   38:aload_2         
	//   23   39:areturn         
		} else
		{
			return ActionBarDrawerToggleHoneycomb.getThemeUpIndicator(mActivity);
	//   24   40:aload_0         
	//   25   41:getfield        #20  <Field Activity mActivity>
	//   26   44:invokestatic    #66  <Method Drawable ActionBarDrawerToggleHoneycomb.getThemeUpIndicator(Activity)>
	//   27   47:areturn         
		}
	}

	public boolean isNavigationVisible()
	{
		ActionBar actionbar = mActivity.getActionBar();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Activity mActivity>
	//    2    4:invokevirtual   #29  <Method ActionBar Activity.getActionBar()>
	//    3    7:astore_1        
		return actionbar != null && (actionbar.getDisplayOptions() & 4) != 0;
	//    4    8:aload_1         
	//    5    9:ifnull          23
	//    6   12:aload_1         
	//    7   13:invokevirtual   #72  <Method int ActionBar.getDisplayOptions()>
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
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #42  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          26
		{
			ActionBar actionbar = mActivity.getActionBar();
	//    3    8:aload_0         
	//    4    9:getfield        #20  <Field Activity mActivity>
	//    5   12:invokevirtual   #29  <Method ActionBar Activity.getActionBar()>
	//    6   15:astore_2        
			if(actionbar != null)
	//*   7   16:aload_2         
	//*   8   17:ifnull          42
			{
				actionbar.setHomeActionContentDescription(i);
	//    9   20:aload_2         
	//   10   21:iload_1         
	//   11   22:invokevirtual   #77  <Method void ActionBar.setHomeActionContentDescription(int)>
				return;
	//   12   25:return          
			}
		} else
		{
			mSetIndicatorInfo = ActionBarDrawerToggleHoneycomb.setActionBarDescription(mSetIndicatorInfo, mActivity, i);
	//   13   26:aload_0         
	//   14   27:aload_0         
	//   15   28:getfield        #79  <Field ActionBarDrawerToggleHoneycomb$SetIndicatorInfo mSetIndicatorInfo>
	//   16   31:aload_0         
	//   17   32:getfield        #20  <Field Activity mActivity>
	//   18   35:iload_1         
	//   19   36:invokestatic    #82  <Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo ActionBarDrawerToggleHoneycomb.setActionBarDescription(ActionBarDrawerToggleHoneycomb$SetIndicatorInfo, Activity, int)>
	//   20   39:putfield        #79  <Field ActionBarDrawerToggleHoneycomb$SetIndicatorInfo mSetIndicatorInfo>
		}
	//   21   42:return          
	}

	public void setActionBarUpIndicator(Drawable drawable, int i)
	{
		ActionBar actionbar = mActivity.getActionBar();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Activity mActivity>
	//    2    4:invokevirtual   #29  <Method ActionBar Activity.getActionBar()>
	//    3    7:astore_3        
		if(actionbar != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          58
		{
			if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   6   12:getstatic       #42  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   15:bipush          18
	//*   8   17:icmplt          31
			{
				actionbar.setHomeAsUpIndicator(drawable);
	//    9   20:aload_3         
	//   10   21:aload_1         
	//   11   22:invokevirtual   #88  <Method void ActionBar.setHomeAsUpIndicator(Drawable)>
				actionbar.setHomeActionContentDescription(i);
	//   12   25:aload_3         
	//   13   26:iload_2         
	//   14   27:invokevirtual   #77  <Method void ActionBar.setHomeActionContentDescription(int)>
				return;
	//   15   30:return          
			}
			actionbar.setDisplayShowHomeEnabled(true);
	//   16   31:aload_3         
	//   17   32:iconst_1        
	//   18   33:invokevirtual   #92  <Method void ActionBar.setDisplayShowHomeEnabled(boolean)>
			mSetIndicatorInfo = ActionBarDrawerToggleHoneycomb.setActionBarUpIndicator(mSetIndicatorInfo, mActivity, drawable, i);
	//   19   36:aload_0         
	//   20   37:aload_0         
	//   21   38:getfield        #79  <Field ActionBarDrawerToggleHoneycomb$SetIndicatorInfo mSetIndicatorInfo>
	//   22   41:aload_0         
	//   23   42:getfield        #20  <Field Activity mActivity>
	//   24   45:aload_1         
	//   25   46:iload_2         
	//   26   47:invokestatic    #95  <Method ActionBarDrawerToggleHoneycomb$SetIndicatorInfo ActionBarDrawerToggleHoneycomb.setActionBarUpIndicator(ActionBarDrawerToggleHoneycomb$SetIndicatorInfo, Activity, Drawable, int)>
	//   27   50:putfield        #79  <Field ActionBarDrawerToggleHoneycomb$SetIndicatorInfo mSetIndicatorInfo>
			actionbar.setDisplayShowHomeEnabled(false);
	//   28   53:aload_3         
	//   29   54:iconst_0        
	//   30   55:invokevirtual   #92  <Method void ActionBar.setDisplayShowHomeEnabled(boolean)>
		}
	//   31   58:return          
	}

	private final Activity mActivity;
	private ActionBarDrawerToggleHoneycomb.SetIndicatorInfo mSetIndicatorInfo;

	ActionBarDrawerToggle$FrameworkActionBarDelegate(Activity activity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		mActivity = activity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Activity mActivity>
	//    5    9:return          
	}
}
