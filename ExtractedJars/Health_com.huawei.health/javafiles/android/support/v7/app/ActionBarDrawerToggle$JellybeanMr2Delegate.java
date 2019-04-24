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
//			ActionBarDrawerToggle

static class ActionBarDrawerToggle$JellybeanMr2Delegate
	implements ActionBarDrawerToggle.Delegate
{

	public Context getActionBarThemedContext()
	{
		ActionBar actionbar = mActivity.getActionBar();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Activity mActivity>
	//    2    4:invokevirtual   #30  <Method ActionBar Activity.getActionBar()>
	//    3    7:astore_1        
		if(actionbar != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          17
			return actionbar.getThemedContext();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #35  <Method Context ActionBar.getThemedContext()>
	//    8   16:areturn         
		else
			return ((Context) (mActivity));
	//    9   17:aload_0         
	//   10   18:getfield        #21  <Field Activity mActivity>
	//   11   21:areturn         
	}

	public Drawable getThemeUpIndicator()
	{
		TypedArray typedarray = getActionBarThemedContext().obtainStyledAttributes(((android.util.AttributeSet) (null)), new int[] {
			0x101030b
		}, 0x10102ce, 0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #39  <Method Context getActionBarThemedContext()>
	//    2    4:aconst_null     
	//    3    5:iconst_1        
	//    4    6:newarray        int[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:ldc1            #40  <Int 0x101030b>
	//    8   12:iastore         
	//    9   13:ldc1            #41  <Int 0x10102ce>
	//   10   15:iconst_0        
	//   11   16:invokevirtual   #47  <Method TypedArray Context.obtainStyledAttributes(android.util.AttributeSet, int[], int, int)>
	//   12   19:astore_1        
		Drawable drawable = typedarray.getDrawable(0);
	//   13   20:aload_1         
	//   14   21:iconst_0        
	//   15   22:invokevirtual   #53  <Method Drawable TypedArray.getDrawable(int)>
	//   16   25:astore_2        
		typedarray.recycle();
	//   17   26:aload_1         
	//   18   27:invokevirtual   #56  <Method void TypedArray.recycle()>
		return drawable;
	//   19   30:aload_2         
	//   20   31:areturn         
	}

	public boolean isNavigationVisible()
	{
		ActionBar actionbar = mActivity.getActionBar();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Activity mActivity>
	//    2    4:invokevirtual   #30  <Method ActionBar Activity.getActionBar()>
	//    3    7:astore_1        
		return actionbar != null && (actionbar.getDisplayOptions() & 4) != 0;
	//    4    8:aload_1         
	//    5    9:ifnull          23
	//    6   12:aload_1         
	//    7   13:invokevirtual   #62  <Method int ActionBar.getDisplayOptions()>
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
		ActionBar actionbar = mActivity.getActionBar();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Activity mActivity>
	//    2    4:invokevirtual   #30  <Method ActionBar Activity.getActionBar()>
	//    3    7:astore_2        
		if(actionbar != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          17
			actionbar.setHomeActionContentDescription(i);
	//    6   12:aload_2         
	//    7   13:iload_1         
	//    8   14:invokevirtual   #67  <Method void ActionBar.setHomeActionContentDescription(int)>
	//    9   17:return          
	}

	public void setActionBarUpIndicator(Drawable drawable, int i)
	{
		ActionBar actionbar = mActivity.getActionBar();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Activity mActivity>
	//    2    4:invokevirtual   #30  <Method ActionBar Activity.getActionBar()>
	//    3    7:astore_3        
		if(actionbar != null)
	//*   4    8:aload_3         
	//*   5    9:ifnull          22
		{
			actionbar.setHomeAsUpIndicator(drawable);
	//    6   12:aload_3         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #73  <Method void ActionBar.setHomeAsUpIndicator(Drawable)>
			actionbar.setHomeActionContentDescription(i);
	//    9   17:aload_3         
	//   10   18:iload_2         
	//   11   19:invokevirtual   #67  <Method void ActionBar.setHomeActionContentDescription(int)>
		}
	//   12   22:return          
	}

	final Activity mActivity;

	ActionBarDrawerToggle$JellybeanMr2Delegate(Activity activity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mActivity = activity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Activity mActivity>
	//    5    9:return          
	}
}
