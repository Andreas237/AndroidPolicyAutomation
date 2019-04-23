// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;

class ActionBarDrawerToggle$ToolbarCompatDelegate
	implements ActionBarDrawerToggle.Delegate
{

	public Context getActionBarThemedContext()
	{
		return mToolbar.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #39  <Method Context Toolbar.getContext()>
	//    3    7:areturn         
	}

	public Drawable getThemeUpIndicator()
	{
		return mDefaultUpIndicator;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Drawable mDefaultUpIndicator>
	//    2    4:areturn         
	}

	public boolean isNavigationVisible()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void setActionBarDescription(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            16
		{
			mToolbar.setNavigationContentDescription(mDefaultContentDescription);
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Toolbar mToolbar>
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field CharSequence mDefaultContentDescription>
	//    6   12:invokevirtual   #48  <Method void Toolbar.setNavigationContentDescription(CharSequence)>
			return;
	//    7   15:return          
		} else
		{
			mToolbar.setNavigationContentDescription(i);
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field Toolbar mToolbar>
	//   10   20:iload_1         
	//   11   21:invokevirtual   #50  <Method void Toolbar.setNavigationContentDescription(int)>
			return;
	//   12   24:return          
		}
	}

	public void setActionBarUpIndicator(Drawable drawable, int i)
	{
		mToolbar.setNavigationIcon(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Toolbar mToolbar>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #56  <Method void Toolbar.setNavigationIcon(Drawable)>
		setActionBarDescription(i);
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #58  <Method void setActionBarDescription(int)>
	//    7   13:return          
	}

	final CharSequence mDefaultContentDescription;
	final Drawable mDefaultUpIndicator;
	final Toolbar mToolbar;

	ActionBarDrawerToggle$ToolbarCompatDelegate(Toolbar toolbar)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mToolbar = toolbar;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Toolbar mToolbar>
		mDefaultUpIndicator = toolbar.getNavigationIcon();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #25  <Method Drawable Toolbar.getNavigationIcon()>
	//    8   14:putfield        #27  <Field Drawable mDefaultUpIndicator>
		mDefaultContentDescription = toolbar.getNavigationContentDescription();
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #31  <Method CharSequence Toolbar.getNavigationContentDescription()>
	//   12   22:putfield        #33  <Field CharSequence mDefaultContentDescription>
	//   13   25:return          
	}
}
