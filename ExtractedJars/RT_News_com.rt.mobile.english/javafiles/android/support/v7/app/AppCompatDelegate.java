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
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplN, AppCompatDelegateImplV23, AppCompatDelegateImplV14, AppCompatCallback, 
//			ActionBar

public abstract class AppCompatDelegate
{
	static interface ApplyableNightMode
		extends Annotation
	{
	}

	public static interface NightMode
		extends Annotation
	{
	}


	AppCompatDelegate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
	//    2    4:return          
	}

	public static AppCompatDelegate create(Activity activity, AppCompatCallback appcompatcallback)
	{
		return create(((Context) (activity)), activity.getWindow(), appcompatcallback);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #48  <Method Window Activity.getWindow()>
	//    3    5:aload_1         
	//    4    6:invokestatic    #51  <Method AppCompatDelegate create(Context, Window, AppCompatCallback)>
	//    5    9:areturn         
	}

	public static AppCompatDelegate create(Dialog dialog, AppCompatCallback appcompatcallback)
	{
		return create(dialog.getContext(), dialog.getWindow(), appcompatcallback);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method Context Dialog.getContext()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #59  <Method Window Dialog.getWindow()>
	//    4    8:aload_1         
	//    5    9:invokestatic    #51  <Method AppCompatDelegate create(Context, Window, AppCompatCallback)>
	//    6   12:areturn         
	}

	private static AppCompatDelegate create(Context context, Window window, AppCompatCallback appcompatcallback)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #64  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          19
			return ((AppCompatDelegate) (new AppCompatDelegateImplN(context, window, appcompatcallback)));
	//    3    8:new             #66  <Class AppCompatDelegateImplN>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:aload_2         
	//    8   15:invokespecial   #69  <Method void AppCompatDelegateImplN(Context, Window, AppCompatCallback)>
	//    9   18:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  10   19:getstatic       #64  <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   22:bipush          23
	//*  12   24:icmplt          38
			return ((AppCompatDelegate) (new AppCompatDelegateImplV23(context, window, appcompatcallback)));
	//   13   27:new             #71  <Class AppCompatDelegateImplV23>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokespecial   #72  <Method void AppCompatDelegateImplV23(Context, Window, AppCompatCallback)>
	//   19   37:areturn         
		else
			return ((AppCompatDelegate) (new AppCompatDelegateImplV14(context, window, appcompatcallback)));
	//   20   38:new             #74  <Class AppCompatDelegateImplV14>
	//   21   41:dup             
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:aload_2         
	//   25   45:invokespecial   #75  <Method void AppCompatDelegateImplV14(Context, Window, AppCompatCallback)>
	//   26   48:areturn         
	}

	public static int getDefaultNightMode()
	{
		return sDefaultNightMode;
	//    0    0:getstatic       #79  <Field int sDefaultNightMode>
	//    1    3:ireturn         
	}

	public static boolean isCompatVectorFromResourcesEnabled()
	{
		return sCompatVectorFromResourcesEnabled;
	//    0    0:getstatic       #83  <Field boolean sCompatVectorFromResourcesEnabled>
	//    1    3:ireturn         
	}

	public static void setCompatVectorFromResourcesEnabled(boolean flag)
	{
		sCompatVectorFromResourcesEnabled = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #83  <Field boolean sCompatVectorFromResourcesEnabled>
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
	//    2   32:ldc1            #31  <String "AppCompatDelegate">
	//    3   34:ldc1            #89  <String "setDefaultNightMode() called with an unknown mode">
	//    4   36:invokestatic    #95  <Method int Log.d(String, String)>
	//    5   39:pop             
			return;
	//    6   40:return          

		case -1: 
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
			sDefaultNightMode = i;
	//    7   41:iload_0         
	//    8   42:putstatic       #79  <Field int sDefaultNightMode>
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
	private static boolean sCompatVectorFromResourcesEnabled = false;
	private static int sDefaultNightMode = -1;

	static 
	{
	//    0    0:return          
	}
}
