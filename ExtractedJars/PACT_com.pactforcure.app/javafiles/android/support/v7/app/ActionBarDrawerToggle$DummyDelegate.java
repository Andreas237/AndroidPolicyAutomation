// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.app:
//			ActionBarDrawerToggle

static class ActionBarDrawerToggle$DummyDelegate
	implements ActionBarDrawerToggle.Delegate
{

	public Context getActionBarThemedContext()
	{
		return ((Context) (mActivity));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Activity mActivity>
	//    2    4:areturn         
	}

	public Drawable getThemeUpIndicator()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean isNavigationVisible()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void setActionBarDescription(int i)
	{
	//    0    0:return          
	}

	public void setActionBarUpIndicator(Drawable drawable, int i)
	{
	//    0    0:return          
	}

	final Activity mActivity;

	ActionBarDrawerToggle$DummyDelegate(Activity activity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mActivity = activity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Activity mActivity>
	//    5    9:return          
	}
}
