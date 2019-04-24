// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.*;

public class AppLaunchChecker
{

	public AppLaunchChecker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static boolean hasStartedFromLauncher(Context context)
	{
		return context.getSharedPreferences("android.support.AppLaunchChecker", 0).getBoolean("startedFromLauncher", false);
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "android.support.AppLaunchChecker">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #25  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    7:ldc1            #8   <String "startedFromLauncher">
	//    5    9:iconst_0        
	//    6   10:invokeinterface #31  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    7   15:ireturn         
	}

	public static void onActivityCreate(Activity activity)
	{
		SharedPreferences sharedpreferences = activity.getSharedPreferences("android.support.AppLaunchChecker", 0);
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "android.support.AppLaunchChecker">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #37  <Method SharedPreferences Activity.getSharedPreferences(String, int)>
	//    4    7:astore_1        
		if(sharedpreferences.getBoolean("startedFromLauncher", false))
	//*   5    8:aload_1         
	//*   6    9:ldc1            #8   <String "startedFromLauncher">
	//*   7   11:iconst_0        
	//*   8   12:invokeinterface #31  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*   9   17:ifeq            21
			return;
	//   10   20:return          
		activity = ((Activity) (activity.getIntent()));
	//   11   21:aload_0         
	//   12   22:invokevirtual   #41  <Method Intent Activity.getIntent()>
	//   13   25:astore_0        
		if(activity == null)
	//*  14   26:aload_0         
	//*  15   27:ifnonnull       31
			return;
	//   16   30:return          
		if("android.intent.action.MAIN".equals(((Object) (((Intent) (activity)).getAction()))) && (((Intent) (activity)).hasCategory("android.intent.category.LAUNCHER") || ((Intent) (activity)).hasCategory("android.intent.category.LEANBACK_LAUNCHER")))
	//*  17   31:ldc1            #43  <String "android.intent.action.MAIN">
	//*  18   33:aload_0         
	//*  19   34:invokevirtual   #49  <Method String Intent.getAction()>
	//*  20   37:invokevirtual   #55  <Method boolean String.equals(Object)>
	//*  21   40:ifeq            80
	//*  22   43:aload_0         
	//*  23   44:ldc1            #57  <String "android.intent.category.LAUNCHER">
	//*  24   46:invokevirtual   #61  <Method boolean Intent.hasCategory(String)>
	//*  25   49:ifne            61
	//*  26   52:aload_0         
	//*  27   53:ldc1            #63  <String "android.intent.category.LEANBACK_LAUNCHER">
	//*  28   55:invokevirtual   #61  <Method boolean Intent.hasCategory(String)>
	//*  29   58:ifeq            80
			sharedpreferences.edit().putBoolean("startedFromLauncher", true).apply();
	//   30   61:aload_1         
	//   31   62:invokeinterface #67  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   32   67:ldc1            #8   <String "startedFromLauncher">
	//   33   69:iconst_1        
	//   34   70:invokeinterface #73  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   35   75:invokeinterface #76  <Method void android.content.SharedPreferences$Editor.apply()>
	//   36   80:return          
	}

	private static final String KEY_STARTED_FROM_LAUNCHER = "startedFromLauncher";
	private static final String SHARED_PREFS_NAME = "android.support.AppLaunchChecker";
}
