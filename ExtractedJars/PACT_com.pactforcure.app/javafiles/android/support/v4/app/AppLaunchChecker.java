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
	//    3    4:invokevirtual   #24  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    7:ldc1            #8   <String "startedFromLauncher">
	//    5    9:iconst_0        
	//    6   10:invokeinterface #30  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    7   15:ireturn         
	}

	public static void onActivityCreate(Activity activity)
	{
		SharedPreferences sharedpreferences = activity.getSharedPreferences("android.support.AppLaunchChecker", 0);
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "android.support.AppLaunchChecker">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #35  <Method SharedPreferences Activity.getSharedPreferences(String, int)>
	//    4    7:astore_1        
		if(!sharedpreferences.getBoolean("startedFromLauncher", false))
	//*   5    8:aload_1         
	//*   6    9:ldc1            #8   <String "startedFromLauncher">
	//*   7   11:iconst_0        
	//*   8   12:invokeinterface #30  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*   9   17:ifeq            21
	//*  10   20:return          
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #39  <Method Intent Activity.getIntent()>
	//*  13   25:astore_0        
			if((activity = ((Activity) (activity.getIntent()))) != null && "android.intent.action.MAIN".equals(((Object) (((Intent) (activity)).getAction()))) && (((Intent) (activity)).hasCategory("android.intent.category.LAUNCHER") || ((Intent) (activity)).hasCategory("android.intent.category.LEANBACK_LAUNCHER")))
	//*  14   26:aload_0         
	//*  15   27:ifnull          20
	//*  16   30:ldc1            #41  <String "android.intent.action.MAIN">
	//*  17   32:aload_0         
	//*  18   33:invokevirtual   #47  <Method String Intent.getAction()>
	//*  19   36:invokevirtual   #53  <Method boolean String.equals(Object)>
	//*  20   39:ifeq            20
	//*  21   42:aload_0         
	//*  22   43:ldc1            #55  <String "android.intent.category.LAUNCHER">
	//*  23   45:invokevirtual   #59  <Method boolean Intent.hasCategory(String)>
	//*  24   48:ifne            60
	//*  25   51:aload_0         
	//*  26   52:ldc1            #61  <String "android.intent.category.LEANBACK_LAUNCHER">
	//*  27   54:invokevirtual   #59  <Method boolean Intent.hasCategory(String)>
	//*  28   57:ifeq            20
			{
				android.support.v4.content.SharedPreferencesCompat.EditorCompat.getInstance().apply(sharedpreferences.edit().putBoolean("startedFromLauncher", true));
	//   29   60:invokestatic    #67  <Method android.support.v4.content.SharedPreferencesCompat$EditorCompat android.support.v4.content.SharedPreferencesCompat$EditorCompat.getInstance()>
	//   30   63:aload_1         
	//   31   64:invokeinterface #71  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   32   69:ldc1            #8   <String "startedFromLauncher">
	//   33   71:iconst_1        
	//   34   72:invokeinterface #77  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   35   77:invokevirtual   #81  <Method void android.support.v4.content.SharedPreferencesCompat$EditorCompat.apply(android.content.SharedPreferences$Editor)>
				return;
	//   36   80:return          
			}
	}

	private static final String KEY_STARTED_FROM_LAUNCHER = "startedFromLauncher";
	private static final String SHARED_PREFS_NAME = "android.support.AppLaunchChecker";
}
