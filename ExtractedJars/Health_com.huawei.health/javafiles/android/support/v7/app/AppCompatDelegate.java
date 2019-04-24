// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.os.BuildCompat;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplN, AppCompatDelegateImplV23, AppCompatDelegateImplV14, AppCompatDelegateImplV11, 
//			AppCompatDelegateImplV9, AppCompatCallback, ActionBar

public abstract class AppCompatDelegate
{
	public static interface NightMode
		extends Annotation
	{
	}


	AppCompatDelegate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
	//    2    4:return          
	}

	public static AppCompatDelegate create(Activity activity, AppCompatCallback appcompatcallback)
	{
		return create(((Context) (activity)), activity.getWindow(), appcompatcallback);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #49  <Method Window Activity.getWindow()>
	//    3    5:aload_1         
	//    4    6:invokestatic    #52  <Method AppCompatDelegate create(Context, Window, AppCompatCallback)>
	//    5    9:areturn         
	}

	public static AppCompatDelegate create(Dialog dialog, AppCompatCallback appcompatcallback)
	{
		return create(dialog.getContext(), dialog.getWindow(), appcompatcallback);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method Context Dialog.getContext()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #60  <Method Window Dialog.getWindow()>
	//    4    8:aload_1         
	//    5    9:invokestatic    #52  <Method AppCompatDelegate create(Context, Window, AppCompatCallback)>
	//    6   12:areturn         
	}

	private static AppCompatDelegate create(Context context, Window window, AppCompatCallback appcompatcallback)
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_3        
		if(BuildCompat.isAtLeastN())
	//*   2    4:invokestatic    #71  <Method boolean BuildCompat.isAtLeastN()>
	//*   3    7:ifeq            21
			return ((AppCompatDelegate) (new AppCompatDelegateImplN(context, window, appcompatcallback)));
	//    4   10:new             #73  <Class AppCompatDelegateImplN>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:invokespecial   #76  <Method void AppCompatDelegateImplN(Context, Window, AppCompatCallback)>
	//   10   20:areturn         
		if(i >= 23)
	//*  11   21:iload_3         
	//*  12   22:bipush          23
	//*  13   24:icmplt          38
			return ((AppCompatDelegate) (new AppCompatDelegateImplV23(context, window, appcompatcallback)));
	//   14   27:new             #78  <Class AppCompatDelegateImplV23>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:aload_2         
	//   19   34:invokespecial   #79  <Method void AppCompatDelegateImplV23(Context, Window, AppCompatCallback)>
	//   20   37:areturn         
		if(i >= 14)
	//*  21   38:iload_3         
	//*  22   39:bipush          14
	//*  23   41:icmplt          55
			return ((AppCompatDelegate) (new AppCompatDelegateImplV14(context, window, appcompatcallback)));
	//   24   44:new             #81  <Class AppCompatDelegateImplV14>
	//   25   47:dup             
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:aload_2         
	//   29   51:invokespecial   #82  <Method void AppCompatDelegateImplV14(Context, Window, AppCompatCallback)>
	//   30   54:areturn         
		if(i >= 11)
	//*  31   55:iload_3         
	//*  32   56:bipush          11
	//*  33   58:icmplt          72
			return ((AppCompatDelegate) (new AppCompatDelegateImplV11(context, window, appcompatcallback)));
	//   34   61:new             #84  <Class AppCompatDelegateImplV11>
	//   35   64:dup             
	//   36   65:aload_0         
	//   37   66:aload_1         
	//   38   67:aload_2         
	//   39   68:invokespecial   #85  <Method void AppCompatDelegateImplV11(Context, Window, AppCompatCallback)>
	//   40   71:areturn         
		else
			return ((AppCompatDelegate) (new AppCompatDelegateImplV9(context, window, appcompatcallback)));
	//   41   72:new             #87  <Class AppCompatDelegateImplV9>
	//   42   75:dup             
	//   43   76:aload_0         
	//   44   77:aload_1         
	//   45   78:aload_2         
	//   46   79:invokespecial   #88  <Method void AppCompatDelegateImplV9(Context, Window, AppCompatCallback)>
	//   47   82:areturn         
	}

	public static int getDefaultNightMode()
	{
		return sDefaultNightMode;
	//    0    0:getstatic       #35  <Field int sDefaultNightMode>
	//    1    3:ireturn         
	}

	public static boolean isCompatVectorFromResourcesEnabled()
	{
		return sCompatVectorFromResourcesEnabled;
	//    0    0:getstatic       #37  <Field boolean sCompatVectorFromResourcesEnabled>
	//    1    3:ireturn         
	}

	public static void setCompatVectorFromResourcesEnabled(boolean flag)
	{
		sCompatVectorFromResourcesEnabled = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #37  <Field boolean sCompatVectorFromResourcesEnabled>
	//    2    4:return          
	}

	public static void setDefaultNightMode(int i)
	{
		switch(i)
	//*   0    0:iload_0         
		{
	//*   1    1:tableswitch     -1 2: default 32
	//	               -1 35
	//	               0 35
	//	               1 35
	//	               2 35
	//*   2   32:goto            40
		case -1: 
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
			sDefaultNightMode = i;
	//    3   35:iload_0         
	//    4   36:putstatic       #35  <Field int sDefaultNightMode>
			return;
	//    5   39:return          
		}
		Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
	//    6   40:ldc1            #28  <String "AppCompatDelegate">
	//    7   42:ldc1            #97  <String "setDefaultNightMode() called with an unknown mode">
	//    8   44:invokestatic    #103 <Method int Log.d(String, String)>
	//    9   47:pop             
	//   10   48:return          
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
	private static int sDefaultNightMode = 0;

	static 
	{
		sDefaultNightMode = -1;
	//    0    0:iconst_m1       
	//    1    1:putstatic       #35  <Field int sDefaultNightMode>
		sCompatVectorFromResourcesEnabled = false;
	//    2    4:iconst_0        
	//    3    5:putstatic       #37  <Field boolean sCompatVectorFromResourcesEnabled>
	//*   4    8:return          
	}
}
