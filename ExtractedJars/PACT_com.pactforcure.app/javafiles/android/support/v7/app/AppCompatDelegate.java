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
//			AppCompatDelegateImplN, AppCompatDelegateImplV23, AppCompatDelegateImplV14, AppCompatDelegateImplV11, 
//			AppCompatDelegateImplV9, AppCompatCallback, ActionBar

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
	//    1    1:invokespecial   #44  <Method void Object()>
	//    2    4:return          
	}

	public static AppCompatDelegate create(Activity activity, AppCompatCallback appcompatcallback)
	{
		return create(((Context) (activity)), activity.getWindow(), appcompatcallback);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #52  <Method Window Activity.getWindow()>
	//    3    5:aload_1         
	//    4    6:invokestatic    #55  <Method AppCompatDelegate create(Context, Window, AppCompatCallback)>
	//    5    9:areturn         
	}

	public static AppCompatDelegate create(Dialog dialog, AppCompatCallback appcompatcallback)
	{
		return create(dialog.getContext(), dialog.getWindow(), appcompatcallback);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method Context Dialog.getContext()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #63  <Method Window Dialog.getWindow()>
	//    4    8:aload_1         
	//    5    9:invokestatic    #55  <Method AppCompatDelegate create(Context, Window, AppCompatCallback)>
	//    6   12:areturn         
	}

	private static AppCompatDelegate create(Context context, Window window, AppCompatCallback appcompatcallback)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #68  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          19
			return ((AppCompatDelegate) (new AppCompatDelegateImplN(context, window, appcompatcallback)));
	//    3    8:new             #70  <Class AppCompatDelegateImplN>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:aload_2         
	//    8   15:invokespecial   #73  <Method void AppCompatDelegateImplN(Context, Window, AppCompatCallback)>
	//    9   18:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  10   19:getstatic       #68  <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   22:bipush          23
	//*  12   24:icmplt          38
			return ((AppCompatDelegate) (new AppCompatDelegateImplV23(context, window, appcompatcallback)));
	//   13   27:new             #75  <Class AppCompatDelegateImplV23>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokespecial   #76  <Method void AppCompatDelegateImplV23(Context, Window, AppCompatCallback)>
	//   19   37:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*  20   38:getstatic       #68  <Field int android.os.Build$VERSION.SDK_INT>
	//*  21   41:bipush          14
	//*  22   43:icmplt          57
			return ((AppCompatDelegate) (new AppCompatDelegateImplV14(context, window, appcompatcallback)));
	//   23   46:new             #78  <Class AppCompatDelegateImplV14>
	//   24   49:dup             
	//   25   50:aload_0         
	//   26   51:aload_1         
	//   27   52:aload_2         
	//   28   53:invokespecial   #79  <Method void AppCompatDelegateImplV14(Context, Window, AppCompatCallback)>
	//   29   56:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*  30   57:getstatic       #68  <Field int android.os.Build$VERSION.SDK_INT>
	//*  31   60:bipush          11
	//*  32   62:icmplt          76
			return ((AppCompatDelegate) (new AppCompatDelegateImplV11(context, window, appcompatcallback)));
	//   33   65:new             #81  <Class AppCompatDelegateImplV11>
	//   34   68:dup             
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:aload_2         
	//   38   72:invokespecial   #82  <Method void AppCompatDelegateImplV11(Context, Window, AppCompatCallback)>
	//   39   75:areturn         
		else
			return ((AppCompatDelegate) (new AppCompatDelegateImplV9(context, window, appcompatcallback)));
	//   40   76:new             #84  <Class AppCompatDelegateImplV9>
	//   41   79:dup             
	//   42   80:aload_0         
	//   43   81:aload_1         
	//   44   82:aload_2         
	//   45   83:invokespecial   #85  <Method void AppCompatDelegateImplV9(Context, Window, AppCompatCallback)>
	//   46   86:areturn         
	}

	public static int getDefaultNightMode()
	{
		return sDefaultNightMode;
	//    0    0:getstatic       #38  <Field int sDefaultNightMode>
	//    1    3:ireturn         
	}

	public static boolean isCompatVectorFromResourcesEnabled()
	{
		return sCompatVectorFromResourcesEnabled;
	//    0    0:getstatic       #40  <Field boolean sCompatVectorFromResourcesEnabled>
	//    1    3:ireturn         
	}

	public static void setCompatVectorFromResourcesEnabled(boolean flag)
	{
		sCompatVectorFromResourcesEnabled = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #40  <Field boolean sCompatVectorFromResourcesEnabled>
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
	//    3   34:ldc1            #95  <String "setDefaultNightMode() called with an unknown mode">
	//    4   36:invokestatic    #101 <Method int Log.d(String, String)>
	//    5   39:pop             
			return;
	//    6   40:return          

		case -1: 
		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
			sDefaultNightMode = i;
	//    7   41:iload_0         
	//    8   42:putstatic       #38  <Field int sDefaultNightMode>
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
	//    0    0:iconst_m1       
	//    1    1:putstatic       #38  <Field int sDefaultNightMode>
	//    2    4:iconst_0        
	//    3    5:putstatic       #40  <Field boolean sCompatVectorFromResourcesEnabled>
	//*   4    8:return          
	}
}
