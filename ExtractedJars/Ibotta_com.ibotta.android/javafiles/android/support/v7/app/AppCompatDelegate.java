// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.VectorEnabledTintResources;
import android.view.MenuInflater;
import android.view.View;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImpl, AppCompatCallback, ActionBar

public abstract class AppCompatDelegate
{
	public static interface NightMode
		extends Annotation
	{
	}


	AppCompatDelegate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	public static AppCompatDelegate create(Activity activity, AppCompatCallback appcompatcallback)
	{
		return ((AppCompatDelegate) (new AppCompatDelegateImpl(((android.content.Context) (activity)), activity.getWindow(), appcompatcallback)));
	//    0    0:new             #20  <Class AppCompatDelegateImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #26  <Method android.view.Window Activity.getWindow()>
	//    5    9:aload_1         
	//    6   10:invokespecial   #29  <Method void AppCompatDelegateImpl(android.content.Context, android.view.Window, AppCompatCallback)>
	//    7   13:areturn         
	}

	public static AppCompatDelegate create(Dialog dialog, AppCompatCallback appcompatcallback)
	{
		return ((AppCompatDelegate) (new AppCompatDelegateImpl(dialog.getContext(), dialog.getWindow(), appcompatcallback)));
	//    0    0:new             #20  <Class AppCompatDelegateImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #36  <Method android.content.Context Dialog.getContext()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #37  <Method android.view.Window Dialog.getWindow()>
	//    6   12:aload_1         
	//    7   13:invokespecial   #29  <Method void AppCompatDelegateImpl(android.content.Context, android.view.Window, AppCompatCallback)>
	//    8   16:areturn         
	}

	public static int getDefaultNightMode()
	{
		return sDefaultNightMode;
	//    0    0:getstatic       #41  <Field int sDefaultNightMode>
	//    1    3:ireturn         
	}

	public static void setCompatVectorFromResourcesEnabled(boolean flag)
	{
		VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(flag);
	//    0    0:iload_0         
	//    1    1:invokestatic    #47  <Method void VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(boolean)>
	//    2    4:return          
	}

	public abstract void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams);

	public abstract boolean applyDayNight();

	public abstract View findViewById(int i);

	public abstract ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();

	public abstract MenuInflater getMenuInflater();

	public abstract ActionBar getSupportActionBar();

	public abstract void installViewFactory();

	public abstract void invalidateOptionsMenu();

	public abstract void onConfigurationChanged(Configuration configuration);

	public abstract void onCreate(Bundle bundle);

	public abstract void onDestroy();

	public abstract void onPostCreate(Bundle bundle);

	public abstract void onPostResume();

	public abstract void onSaveInstanceState(Bundle bundle);

	public abstract void onStart();

	public abstract void onStop();

	public abstract boolean requestWindowFeature(int i);

	public abstract void setContentView(int i);

	public abstract void setContentView(View view);

	public abstract void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams);

	public abstract void setSupportActionBar(Toolbar toolbar);

	public abstract void setTitle(CharSequence charsequence);

	public abstract ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback);

	private static int sDefaultNightMode = -1;

	static 
	{
	//    0    0:return          
	}
}
