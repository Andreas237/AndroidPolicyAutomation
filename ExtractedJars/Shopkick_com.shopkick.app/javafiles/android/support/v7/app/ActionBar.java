// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.view.ActionMode;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SpinnerAdapter;
import java.lang.annotation.Annotation;

public abstract class ActionBar
{
	public static interface DisplayOptions
		extends Annotation
	{
	}

	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		public int gravity;

		public LayoutParams(int i)
		{
			this(-2, -1, i);
		//    0    0:aload_0         
		//    1    1:bipush          -2
		//    2    3:iconst_m1       
		//    3    4:iload_1         
		//    4    5:invokespecial   #14  <Method void ActionBar$LayoutParams(int, int, int)>
		//    5    8:return          
		}

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #18  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
			gravity = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #20  <Field int gravity>
			gravity = 0x800013;
		//    7   11:aload_0         
		//    8   12:ldc1            #21  <Int 0x800013>
		//    9   14:putfield        #20  <Field int gravity>
		//   10   17:return          
		}

		public LayoutParams(int i, int j, int k)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #18  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
			gravity = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #20  <Field int gravity>
			gravity = k;
		//    7   11:aload_0         
		//    8   12:iload_3         
		//    9   13:putfield        #20  <Field int gravity>
		//   10   16:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #25  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
			gravity = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #20  <Field int gravity>
			context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionBarLayout)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #31  <Field int[] android.support.v7.appcompat.R$styleable.ActionBarLayout>
		//   10   16:invokevirtual   #37  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_1        
			gravity = ((TypedArray) (context)).getInt(android.support.v7.appcompat.R.styleable.ActionBarLayout_android_layout_gravity, 0);
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:getstatic       #40  <Field int android.support.v7.appcompat.R$styleable.ActionBarLayout_android_layout_gravity>
		//   15   25:iconst_0        
		//   16   26:invokevirtual   #46  <Method int TypedArray.getInt(int, int)>
		//   17   29:putfield        #20  <Field int gravity>
			((TypedArray) (context)).recycle();
		//   18   32:aload_1         
		//   19   33:invokevirtual   #50  <Method void TypedArray.recycle()>
		//   20   36:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.view.ViewGroup.MarginLayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #55  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			gravity = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #20  <Field int gravity>
			gravity = layoutparams.gravity;
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:getfield        #20  <Field int gravity>
		//    9   15:putfield        #20  <Field int gravity>
		//   10   18:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #58  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
			gravity = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #20  <Field int gravity>
		//    6   10:return          
		}
	}

	public static interface NavigationMode
		extends Annotation
	{
	}

	public static interface OnMenuVisibilityListener
	{

		public abstract void onMenuVisibilityChanged(boolean flag);
	}

	public static interface OnNavigationListener
	{

		public abstract boolean onNavigationItemSelected(int i, long l);
	}

	public static abstract class Tab
	{

		public abstract CharSequence getContentDescription();

		public abstract View getCustomView();

		public abstract Drawable getIcon();

		public abstract int getPosition();

		public abstract Object getTag();

		public abstract CharSequence getText();

		public abstract void select();

		public abstract Tab setContentDescription(int i);

		public abstract Tab setContentDescription(CharSequence charsequence);

		public abstract Tab setCustomView(int i);

		public abstract Tab setCustomView(View view);

		public abstract Tab setIcon(int i);

		public abstract Tab setIcon(Drawable drawable);

		public abstract Tab setTabListener(TabListener tablistener);

		public abstract Tab setTag(Object obj);

		public abstract Tab setText(int i);

		public abstract Tab setText(CharSequence charsequence);

		public static final int INVALID_POSITION = -1;

		public Tab()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface TabListener
	{

		public abstract void onTabReselected(Tab tab, FragmentTransaction fragmenttransaction);

		public abstract void onTabSelected(Tab tab, FragmentTransaction fragmenttransaction);

		public abstract void onTabUnselected(Tab tab, FragmentTransaction fragmenttransaction);
	}


	public ActionBar()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:return          
	}

	public abstract void addOnMenuVisibilityListener(OnMenuVisibilityListener onmenuvisibilitylistener);

	public abstract void addTab(Tab tab);

	public abstract void addTab(Tab tab, int i);

	public abstract void addTab(Tab tab, int i, boolean flag);

	public abstract void addTab(Tab tab, boolean flag);

	public boolean closeOptionsMenu()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean collapseActionView()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void dispatchMenuVisibilityChanged(boolean flag)
	{
	//    0    0:return          
	}

	public abstract View getCustomView();

	public abstract int getDisplayOptions();

	public float getElevation()
	{
		return 0.0F;
	//    0    0:fconst_0        
	//    1    1:freturn         
	}

	public abstract int getHeight();

	public int getHideOffset()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract int getNavigationItemCount();

	public abstract int getNavigationMode();

	public abstract int getSelectedNavigationIndex();

	public abstract Tab getSelectedTab();

	public abstract CharSequence getSubtitle();

	public abstract Tab getTabAt(int i);

	public abstract int getTabCount();

	public Context getThemedContext()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract CharSequence getTitle();

	public abstract void hide();

	public boolean invalidateOptionsMenu()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isHideOnContentScrollEnabled()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract boolean isShowing();

	public boolean isTitleTruncated()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract Tab newTab();

	public void onConfigurationChanged(Configuration configuration)
	{
	//    0    0:return          
	}

	void onDestroy()
	{
	//    0    0:return          
	}

	public boolean onKeyShortcut(int i, KeyEvent keyevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean onMenuKeyEvent(KeyEvent keyevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean openOptionsMenu()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract void removeAllTabs();

	public abstract void removeOnMenuVisibilityListener(OnMenuVisibilityListener onmenuvisibilitylistener);

	public abstract void removeTab(Tab tab);

	public abstract void removeTabAt(int i);

	boolean requestFocus()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public abstract void selectTab(Tab tab);

	public abstract void setBackgroundDrawable(Drawable drawable);

	public abstract void setCustomView(int i);

	public abstract void setCustomView(View view);

	public abstract void setCustomView(View view, LayoutParams layoutparams);

	public void setDefaultDisplayHomeAsUpEnabled(boolean flag)
	{
	//    0    0:return          
	}

	public abstract void setDisplayHomeAsUpEnabled(boolean flag);

	public abstract void setDisplayOptions(int i);

	public abstract void setDisplayOptions(int i, int j);

	public abstract void setDisplayShowCustomEnabled(boolean flag);

	public abstract void setDisplayShowHomeEnabled(boolean flag);

	public abstract void setDisplayShowTitleEnabled(boolean flag);

	public abstract void setDisplayUseLogoEnabled(boolean flag);

	public void setElevation(float f)
	{
		if(f == 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifne            7
			return;
	//    4    6:return          
		else
			throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
	//    5    7:new             #123 <Class UnsupportedOperationException>
	//    6   10:dup             
	//    7   11:ldc1            #125 <String "Setting a non-zero elevation is not supported in this action bar configuration.">
	//    8   13:invokespecial   #128 <Method void UnsupportedOperationException(String)>
	//    9   16:athrow          
	}

	public void setHideOffset(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            5
			return;
	//    2    4:return          
		else
			throw new UnsupportedOperationException("Setting an explicit action bar hide offset is not supported in this action bar configuration.");
	//    3    5:new             #123 <Class UnsupportedOperationException>
	//    4    8:dup             
	//    5    9:ldc1            #131 <String "Setting an explicit action bar hide offset is not supported in this action bar configuration.">
	//    6   11:invokespecial   #128 <Method void UnsupportedOperationException(String)>
	//    7   14:athrow          
	}

	public void setHideOnContentScrollEnabled(boolean flag)
	{
		if(!flag)
	//*   0    0:iload_1         
	//*   1    1:ifne            5
			return;
	//    2    4:return          
		else
			throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
	//    3    5:new             #123 <Class UnsupportedOperationException>
	//    4    8:dup             
	//    5    9:ldc1            #134 <String "Hide on content scroll is not supported in this action bar configuration.">
	//    6   11:invokespecial   #128 <Method void UnsupportedOperationException(String)>
	//    7   14:athrow          
	}

	public void setHomeActionContentDescription(int i)
	{
	//    0    0:return          
	}

	public void setHomeActionContentDescription(CharSequence charsequence)
	{
	//    0    0:return          
	}

	public void setHomeAsUpIndicator(int i)
	{
	//    0    0:return          
	}

	public void setHomeAsUpIndicator(Drawable drawable)
	{
	//    0    0:return          
	}

	public void setHomeButtonEnabled(boolean flag)
	{
	//    0    0:return          
	}

	public abstract void setIcon(int i);

	public abstract void setIcon(Drawable drawable);

	public abstract void setListNavigationCallbacks(SpinnerAdapter spinneradapter, OnNavigationListener onnavigationlistener);

	public abstract void setLogo(int i);

	public abstract void setLogo(Drawable drawable);

	public abstract void setNavigationMode(int i);

	public abstract void setSelectedNavigationItem(int i);

	public void setShowHideAnimationEnabled(boolean flag)
	{
	//    0    0:return          
	}

	public void setSplitBackgroundDrawable(Drawable drawable)
	{
	//    0    0:return          
	}

	public void setStackedBackgroundDrawable(Drawable drawable)
	{
	//    0    0:return          
	}

	public abstract void setSubtitle(int i);

	public abstract void setSubtitle(CharSequence charsequence);

	public abstract void setTitle(int i);

	public abstract void setTitle(CharSequence charsequence);

	public void setWindowTitle(CharSequence charsequence)
	{
	//    0    0:return          
	}

	public abstract void show();

	public ActionMode startActionMode(android.support.v7.view.ActionMode.Callback callback)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public static final int DISPLAY_HOME_AS_UP = 4;
	public static final int DISPLAY_SHOW_CUSTOM = 16;
	public static final int DISPLAY_SHOW_HOME = 2;
	public static final int DISPLAY_SHOW_TITLE = 8;
	public static final int DISPLAY_USE_LOGO = 1;
	public static final int NAVIGATION_MODE_LIST = 1;
	public static final int NAVIGATION_MODE_STANDARD = 0;
	public static final int NAVIGATION_MODE_TABS = 2;
}
