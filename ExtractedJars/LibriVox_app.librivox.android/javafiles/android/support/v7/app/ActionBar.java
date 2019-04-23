// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SpinnerAdapter;

public abstract class ActionBar
{

	public ActionBar()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
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
	//    5    7:new             #96  <Class UnsupportedOperationException>
	//    6   10:dup             
	//    7   11:ldc1            #98  <String "Setting a non-zero elevation is not supported in this action bar configuration.">
	//    8   13:invokespecial   #101 <Method void UnsupportedOperationException(String)>
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
	//    3    5:new             #96  <Class UnsupportedOperationException>
	//    4    8:dup             
	//    5    9:ldc1            #104 <String "Setting an explicit action bar hide offset is not supported in this action bar configuration.">
	//    6   11:invokespecial   #101 <Method void UnsupportedOperationException(String)>
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
	//    3    5:new             #96  <Class UnsupportedOperationException>
	//    4    8:dup             
	//    5    9:ldc1            #107 <String "Hide on content scroll is not supported in this action bar configuration.">
	//    6   11:invokespecial   #101 <Method void UnsupportedOperationException(String)>
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
