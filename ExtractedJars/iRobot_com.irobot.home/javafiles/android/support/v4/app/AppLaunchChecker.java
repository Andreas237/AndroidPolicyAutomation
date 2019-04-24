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
		if(sharedpreferences.getBoolean("startedFromLauncher", false))
	//*   5    8:aload_1         
	//*   6    9:ldc1            #8   <String "startedFromLauncher">
	//*   7   11:iconst_0        
	//*   8   12:invokeinterface #30  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*   9   17:ifeq            21
			return;
	//   10   20:return          
		activity = ((Activity) (activity.getIntent()));
	//   11   21:aload_0         
	//   12   22:invokevirtual   #39  <Method Intent Activity.getIntent()>
	//   13   25:astore_0        
		if(activity == null)
	//*  14   26:aload_0         
	//*  15   27:ifnonnull       31
			return;
	//   16   30:return          
		if("android.intent.action.MAIN".equals(((Object) (((Intent) (activity)).getAction()))) && (((Intent) (activity)).hasCategory("android.intent.category.LAUNCHER") || ((Intent) (activity)).hasCategory("android.intent.category.LEANBACK_LAUNCHER")))
	//*  17   31:ldc1            #41  <String "android.intent.action.MAIN">
	//*  18   33:aload_0         
	//*  19   34:invokevirtual   #47  <Method String Intent.getAction()>
	//*  20   37:invokevirtual   #53  <Method boolean String.equals(Object)>
	//*  21   40:ifeq            81
	//*  22   43:aload_0         
	//*  23   44:ldc1            #55  <String "android.intent.category.LAUNCHER">
	//*  24   46:invokevirtual   #59  <Method boolean Intent.hasCategory(String)>
	//*  25   49:ifne            61
	//*  26   52:aload_0         
	//*  27   53:ldc1            #61  <String "android.intent.category.LEANBACK_LAUNCHER">
	//*  28   55:invokevirtual   #59  <Method boolean Intent.hasCategory(String)>
	//*  29   58:ifeq            81
			android.support.v4.content.e.a.a().a(sharedpreferences.edit().putBoolean("startedFromLauncher", true));
	//   30   61:invokestatic    #67  <Method android.support.v4.content.e$a android.support.v4.content.e$a.a()>
	//   31   64:aload_1         
	//   32   65:invokeinterface #71  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   33   70:ldc1            #8   <String "startedFromLauncher">
	//   34   72:iconst_1        
	//   35   73:invokeinterface #77  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   36   78:invokevirtual   #80  <Method void android.support.v4.content.e$a.a(android.content.SharedPreferences$Editor)>
	//   37   81:return          
	}

	private static final String KEY_STARTED_FROM_LAUNCHER = "startedFromLauncher";
	private static final String SHARED_PREFS_NAME = "android.support.AppLaunchChecker";
}
