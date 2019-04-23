// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.VectorEnabledTintResources;
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
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
	//    1    1:invokespecial   #35  <Method void Object()>
	//    2    4:return          
	}

	public static AppCompatDelegate create(Activity activity, AppCompatCallback appcompatcallback)
	{
		return ((AppCompatDelegate) (new AppCompatDelegateImpl(((Context) (activity)), activity.getWindow(), appcompatcallback)));
	//    0    0:new             #39  <Class AppCompatDelegateImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #45  <Method Window Activity.getWindow()>
	//    5    9:aload_1         
	//    6   10:invokespecial   #48  <Method void AppCompatDelegateImpl(Context, Window, AppCompatCallback)>
	//    7   13:areturn         
	}

	public static AppCompatDelegate create(Dialog dialog, AppCompatCallback appcompatcallback)
	{
		return ((AppCompatDelegate) (new AppCompatDelegateImpl(dialog.getContext(), dialog.getWindow(), appcompatcallback)));
	//    0    0:new             #39  <Class AppCompatDelegateImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #55  <Method Context Dialog.getContext()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #56  <Method Window Dialog.getWindow()>
	//    6   12:aload_1         
	//    7   13:invokespecial   #48  <Method void AppCompatDelegateImpl(Context, Window, AppCompatCallback)>
	//    8   16:areturn         
	}

	public static AppCompatDelegate create(Context context, Window window, AppCompatCallback appcompatcallback)
	{
		return ((AppCompatDelegate) (new AppCompatDelegateImpl(context, window, appcompatcallback)));
	//    0    0:new             #39  <Class AppCompatDelegateImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #48  <Method void AppCompatDelegateImpl(Context, Window, AppCompatCallback)>
	//    6   10:areturn         
	}

	public static int getDefaultNightMode()
	{
		return sDefaultNightMode;
	//    0    0:getstatic       #61  <Field int sDefaultNightMode>
	//    1    3:ireturn         
	}

	public static boolean isCompatVectorFromResourcesEnabled()
	{
		return VectorEnabledTintResources.isCompatVectorFromResourcesEnabled();
	//    0    0:invokestatic    #67  <Method boolean VectorEnabledTintResources.isCompatVectorFromResourcesEnabled()>
	//    1    3:ireturn         
	}

	public static void setCompatVectorFromResourcesEnabled(boolean flag)
	{
		VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(flag);
	//    0    0:iload_0         
	//    1    1:invokestatic    #71  <Method void VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(boolean)>
	//    2    4:return          
	}

	public static void setDefaultNightMode(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     -1 2: default 32
	//	               -1 41
	//	               0 41
	//	               1 41
	//	               2 41
		default:
			Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
	//    2   32:ldc1            #28  <String "AppCompatDelegate">
	//    3   34:ldc1            #75  <String "setDefaultNightMode() called with an unknown mode">
	//    4   36:invokestatic    #81  <Method int Log.d(String, String)>
	//    5   39:pop             
			return;
	//    6   40:return          

		case -1: 
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
			sDefaultNightMode = i;
	//    7   41:iload_0         
	//    8   42:putstatic       #61  <Field int sDefaultNightMode>
			break;
		}
	//    9   45:return          
	}

	public abstract void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams);

	public abstract boolean applyDayNight();

	public abstract View createView(View view, String s, Context context, AttributeSet attributeset);

	public abstract View findViewById(int i);

	public abstract ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();

	public abstract MenuInflater getMenuInflater();

	public abstract ActionBar getSupportActionBar();

	public abstract boolean hasWindowFeature(int i);

	public abstract void installViewFactory();

	public abstract void invalidateOptionsMenu();

	public abstract boolean isHandleNativeActionModesEnabled();

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

	public abstract void setHandleNativeActionModesEnabled(boolean flag);

	public abstract void setLocalNightMode(int i);

	public abstract void setSupportActionBar(Toolbar toolbar);

	public abstract void setTitle(CharSequence charsequence);

	public abstract ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback);

	public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
	public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
	public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;
	public static final int MODE_NIGHT_AUTO = 0;
	public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
	public static final int MODE_NIGHT_NO = 1;
	static final int MODE_NIGHT_UNSPECIFIED = -100;
	public static final int MODE_NIGHT_YES = 2;
	static final String TAG = "AppCompatDelegate";
	private static int sDefaultNightMode = -1;

	static 
	{
	//    0    0:return          
	}
}
