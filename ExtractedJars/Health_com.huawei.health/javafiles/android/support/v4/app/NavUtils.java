// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.*;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package android.support.v4.app:
//			NavUtilsJB

public final class NavUtils
{
	static interface NavUtilsImpl
	{

		public abstract Intent getParentActivityIntent(Activity activity);

		public abstract String getParentActivityName(Context context, ActivityInfo activityinfo);

		public abstract void navigateUpTo(Activity activity, Intent intent);

		public abstract boolean shouldUpRecreateTask(Activity activity, Intent intent);
	}

	static class NavUtilsImplBase
		implements NavUtilsImpl
	{

		public Intent getParentActivityIntent(Activity activity)
		{
			String s = NavUtils.getParentActivityName(activity);
		//    0    0:aload_1         
		//    1    1:invokestatic    #22  <Method String NavUtils.getParentActivityName(Activity)>
		//    2    4:astore_2        
			if(s == null)
		//*   3    5:aload_2         
		//*   4    6:ifnonnull       11
				return null;
		//    5    9:aconst_null     
		//    6   10:areturn         
			ComponentName componentname = new ComponentName(((Context) (activity)), s);
		//    7   11:new             #24  <Class ComponentName>
		//    8   14:dup             
		//    9   15:aload_1         
		//   10   16:aload_2         
		//   11   17:invokespecial   #27  <Method void ComponentName(Context, String)>
		//   12   20:astore_3        
			try
			{
				if(NavUtils.getParentActivityName(((Context) (activity)), componentname) == null)
		//*  13   21:aload_1         
		//*  14   22:aload_3         
		//*  15   23:invokestatic    #30  <Method String NavUtils.getParentActivityName(Context, ComponentName)>
		//*  16   26:ifnonnull       34
					return Intent.makeMainActivity(componentname);
		//   17   29:aload_3         
		//   18   30:invokestatic    #36  <Method Intent Intent.makeMainActivity(ComponentName)>
		//   19   33:areturn         
				activity = ((Activity) ((new Intent()).setComponent(componentname)));
		//   20   34:new             #32  <Class Intent>
		//   21   37:dup             
		//   22   38:invokespecial   #37  <Method void Intent()>
		//   23   41:aload_3         
		//   24   42:invokevirtual   #40  <Method Intent Intent.setComponent(ComponentName)>
		//   25   45:astore_1        
			}
		//*  26   46:aload_1         
		//*  27   47:areturn         
			// Misplaced declaration of an exception variable
			catch(Activity activity)
		//*  28   48:astore_1        
			{
				Log.e("NavUtils", (new StringBuilder()).append("getParentActivityIntent: bad parentActivityName '").append(s).append("' in manifest").toString());
		//   29   49:ldc1            #42  <String "NavUtils">
		//   30   51:new             #44  <Class StringBuilder>
		//   31   54:dup             
		//   32   55:invokespecial   #45  <Method void StringBuilder()>
		//   33   58:ldc1            #47  <String "getParentActivityIntent: bad parentActivityName '">
		//   34   60:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   35   63:aload_2         
		//   36   64:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   37   67:ldc1            #53  <String "' in manifest">
		//   38   69:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   39   72:invokevirtual   #57  <Method String StringBuilder.toString()>
		//   40   75:invokestatic    #63  <Method int Log.e(String, String)>
		//   41   78:pop             
				return null;
		//   42   79:aconst_null     
		//   43   80:areturn         
			}
			return ((Intent) (activity));
		}

		public String getParentActivityName(Context context, ActivityInfo activityinfo)
		{
			if(activityinfo.metaData == null)
		//*   0    0:aload_2         
		//*   1    1:getfield        #70  <Field Bundle ActivityInfo.metaData>
		//*   2    4:ifnonnull       9
				return null;
		//    3    7:aconst_null     
		//    4    8:areturn         
			String s = activityinfo.metaData.getString("android.support.PARENT_ACTIVITY");
		//    5    9:aload_2         
		//    6   10:getfield        #70  <Field Bundle ActivityInfo.metaData>
		//    7   13:ldc1            #72  <String "android.support.PARENT_ACTIVITY">
		//    8   15:invokevirtual   #78  <Method String Bundle.getString(String)>
		//    9   18:astore_3        
			if(s == null)
		//*  10   19:aload_3         
		//*  11   20:ifnonnull       25
				return null;
		//   12   23:aconst_null     
		//   13   24:areturn         
			activityinfo = ((ActivityInfo) (s));
		//   14   25:aload_3         
		//   15   26:astore_2        
			if(s.charAt(0) == '.')
		//*  16   27:aload_3         
		//*  17   28:iconst_0        
		//*  18   29:invokevirtual   #84  <Method char String.charAt(int)>
		//*  19   32:bipush          46
		//*  20   34:icmpne          59
				activityinfo = ((ActivityInfo) ((new StringBuilder()).append(context.getPackageName()).append(s).toString()));
		//   21   37:new             #44  <Class StringBuilder>
		//   22   40:dup             
		//   23   41:invokespecial   #45  <Method void StringBuilder()>
		//   24   44:aload_1         
		//   25   45:invokevirtual   #89  <Method String Context.getPackageName()>
		//   26   48:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   27   51:aload_3         
		//   28   52:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
		//   29   55:invokevirtual   #57  <Method String StringBuilder.toString()>
		//   30   58:astore_2        
			return ((String) (activityinfo));
		//   31   59:aload_2         
		//   32   60:areturn         
		}

		public void navigateUpTo(Activity activity, Intent intent)
		{
			intent.addFlags(0x4000000);
		//    0    0:aload_2         
		//    1    1:ldc1            #92  <Int 0x4000000>
		//    2    3:invokevirtual   #96  <Method Intent Intent.addFlags(int)>
		//    3    6:pop             
			activity.startActivity(intent);
		//    4    7:aload_1         
		//    5    8:aload_2         
		//    6    9:invokevirtual   #102 <Method void Activity.startActivity(Intent)>
			activity.finish();
		//    7   12:aload_1         
		//    8   13:invokevirtual   #105 <Method void Activity.finish()>
		//    9   16:return          
		}

		public boolean shouldUpRecreateTask(Activity activity, Intent intent)
		{
			activity = ((Activity) (activity.getIntent().getAction()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #111 <Method Intent Activity.getIntent()>
		//    2    4:invokevirtual   #114 <Method String Intent.getAction()>
		//    3    7:astore_1        
			return activity != null && !((String) (activity)).equals("android.intent.action.MAIN");
		//    4    8:aload_1         
		//    5    9:ifnull          23
		//    6   12:aload_1         
		//    7   13:ldc1            #116 <String "android.intent.action.MAIN">
		//    8   15:invokevirtual   #120 <Method boolean String.equals(Object)>
		//    9   18:ifne            23
		//   10   21:iconst_1        
		//   11   22:ireturn         
		//   12   23:iconst_0        
		//   13   24:ireturn         
		}

		NavUtilsImplBase()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class NavUtilsImplJB extends NavUtilsImplBase
	{

		public Intent getParentActivityIntent(Activity activity)
		{
			Intent intent1 = NavUtilsJB.getParentActivityIntent(activity);
		//    0    0:aload_1         
		//    1    1:invokestatic    #21  <Method Intent NavUtilsJB.getParentActivityIntent(Activity)>
		//    2    4:astore_3        
			Intent intent = intent1;
		//    3    5:aload_3         
		//    4    6:astore_2        
			if(intent1 == null)
		//*   5    7:aload_3         
		//*   6    8:ifnonnull       17
				intent = superGetParentActivityIntent(activity);
		//    7   11:aload_0         
		//    8   12:aload_1         
		//    9   13:invokevirtual   #24  <Method Intent superGetParentActivityIntent(Activity)>
		//   10   16:astore_2        
			return intent;
		//   11   17:aload_2         
		//   12   18:areturn         
		}

		public String getParentActivityName(Context context, ActivityInfo activityinfo)
		{
			String s1 = NavUtilsJB.getParentActivityName(activityinfo);
		//    0    0:aload_2         
		//    1    1:invokestatic    #29  <Method String NavUtilsJB.getParentActivityName(ActivityInfo)>
		//    2    4:astore          4
			String s = s1;
		//    3    6:aload           4
		//    4    8:astore_3        
			if(s1 == null)
		//*   5    9:aload           4
		//*   6   11:ifnonnull       21
				s = super.getParentActivityName(context, activityinfo);
		//    7   14:aload_0         
		//    8   15:aload_1         
		//    9   16:aload_2         
		//   10   17:invokespecial   #31  <Method String NavUtils$NavUtilsImplBase.getParentActivityName(Context, ActivityInfo)>
		//   11   20:astore_3        
			return s;
		//   12   21:aload_3         
		//   13   22:areturn         
		}

		public void navigateUpTo(Activity activity, Intent intent)
		{
			NavUtilsJB.navigateUpTo(activity, intent);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #35  <Method void NavUtilsJB.navigateUpTo(Activity, Intent)>
		//    3    5:return          
		}

		public boolean shouldUpRecreateTask(Activity activity, Intent intent)
		{
			return NavUtilsJB.shouldUpRecreateTask(activity, intent);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #39  <Method boolean NavUtilsJB.shouldUpRecreateTask(Activity, Intent)>
		//    3    5:ireturn         
		}

		Intent superGetParentActivityIntent(Activity activity)
		{
			return super.getParentActivityIntent(activity);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #40  <Method Intent NavUtils$NavUtilsImplBase.getParentActivityIntent(Activity)>
		//    3    5:areturn         
		}

		NavUtilsImplJB()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void NavUtils$NavUtilsImplBase()>
		//    2    4:return          
		}
	}


	private NavUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:return          
	}

	public static Intent getParentActivityIntent(Activity activity)
	{
		return IMPL.getParentActivityIntent(activity);
	//    0    0:getstatic       #35  <Field NavUtils$NavUtilsImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #42  <Method Intent NavUtils$NavUtilsImpl.getParentActivityIntent(Activity)>
	//    3    9:areturn         
	}

	public static Intent getParentActivityIntent(Context context, ComponentName componentname)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		String s = getParentActivityName(context, componentname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #49  <Method String getParentActivityName(Context, ComponentName)>
	//    3    5:astore_2        
		if(s == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		componentname = new ComponentName(componentname.getPackageName(), s);
	//    8   12:new             #51  <Class ComponentName>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokevirtual   #55  <Method String ComponentName.getPackageName()>
	//   12   20:aload_2         
	//   13   21:invokespecial   #58  <Method void ComponentName(String, String)>
	//   14   24:astore_1        
		if(getParentActivityName(context, componentname) == null)
	//*  15   25:aload_0         
	//*  16   26:aload_1         
	//*  17   27:invokestatic    #49  <Method String getParentActivityName(Context, ComponentName)>
	//*  18   30:ifnonnull       38
			return Intent.makeMainActivity(componentname);
	//   19   33:aload_1         
	//   20   34:invokestatic    #64  <Method Intent Intent.makeMainActivity(ComponentName)>
	//   21   37:areturn         
		else
			return (new Intent()).setComponent(componentname);
	//   22   38:new             #60  <Class Intent>
	//   23   41:dup             
	//   24   42:invokespecial   #65  <Method void Intent()>
	//   25   45:aload_1         
	//   26   46:invokevirtual   #68  <Method Intent Intent.setComponent(ComponentName)>
	//   27   49:areturn         
	}

	public static Intent getParentActivityIntent(Context context, Class class1)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		class1 = ((Class) (getParentActivityName(context, new ComponentName(context, class1))));
	//    0    0:aload_0         
	//    1    1:new             #51  <Class ComponentName>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #73  <Method void ComponentName(Context, Class)>
	//    6   10:invokestatic    #49  <Method String getParentActivityName(Context, ComponentName)>
	//    7   13:astore_1        
		if(class1 == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       20
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		class1 = ((Class) (new ComponentName(context, ((String) (class1)))));
	//   12   20:new             #51  <Class ComponentName>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokespecial   #76  <Method void ComponentName(Context, String)>
	//   17   29:astore_1        
		if(getParentActivityName(context, ((ComponentName) (class1))) == null)
	//*  18   30:aload_0         
	//*  19   31:aload_1         
	//*  20   32:invokestatic    #49  <Method String getParentActivityName(Context, ComponentName)>
	//*  21   35:ifnonnull       43
			return Intent.makeMainActivity(((ComponentName) (class1)));
	//   22   38:aload_1         
	//   23   39:invokestatic    #64  <Method Intent Intent.makeMainActivity(ComponentName)>
	//   24   42:areturn         
		else
			return (new Intent()).setComponent(((ComponentName) (class1)));
	//   25   43:new             #60  <Class Intent>
	//   26   46:dup             
	//   27   47:invokespecial   #65  <Method void Intent()>
	//   28   50:aload_1         
	//   29   51:invokevirtual   #68  <Method Intent Intent.setComponent(ComponentName)>
	//   30   54:areturn         
	}

	public static String getParentActivityName(Activity activity)
	{
		try
		{
			activity = ((Activity) (getParentActivityName(((Context) (activity)), activity.getComponentName())));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #86  <Method ComponentName Activity.getComponentName()>
	//    3    5:invokestatic    #49  <Method String getParentActivityName(Context, ComponentName)>
	//    4    8:astore_0        
		}
	//*   5    9:aload_0         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(Activity activity)
	//*   7   11:astore_0        
		{
			throw new IllegalArgumentException(((Throwable) (activity)));
	//    8   12:new             #88  <Class IllegalArgumentException>
	//    9   15:dup             
	//   10   16:aload_0         
	//   11   17:invokespecial   #91  <Method void IllegalArgumentException(Throwable)>
	//   12   20:athrow          
		}
		return ((String) (activity));
	}

	public static String getParentActivityName(Context context, ComponentName componentname)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		componentname = ((ComponentName) (context.getPackageManager().getActivityInfo(componentname, 128)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #98  <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_1         
	//    3    5:sipush          128
	//    4    8:invokevirtual   #104 <Method ActivityInfo PackageManager.getActivityInfo(ComponentName, int)>
	//    5   11:astore_1        
		return IMPL.getParentActivityName(context, ((ActivityInfo) (componentname)));
	//    6   12:getstatic       #35  <Field NavUtils$NavUtilsImpl IMPL>
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokeinterface #107 <Method String NavUtils$NavUtilsImpl.getParentActivityName(Context, ActivityInfo)>
	//   10   22:areturn         
	}

	public static void navigateUpFromSameTask(Activity activity)
	{
		Intent intent = getParentActivityIntent(activity);
	//    0    0:aload_0         
	//    1    1:invokestatic    #110 <Method Intent getParentActivityIntent(Activity)>
	//    2    4:astore_1        
		if(intent == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       57
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Activity ").append(((Object) (activity)).getClass().getSimpleName()).append(" does not have a parent activity name specified.").append(" (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> ").append(" element in your manifest?)").toString());
	//    5    9:new             #88  <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:new             #112 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #113 <Method void StringBuilder()>
	//   10   20:ldc1            #115 <String "Activity ">
	//   11   22:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:aload_0         
	//   13   26:invokevirtual   #123 <Method Class Object.getClass()>
	//   14   29:invokevirtual   #128 <Method String Class.getSimpleName()>
	//   15   32:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   16   35:ldc1            #130 <String " does not have a parent activity name specified.">
	//   17   37:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   18   40:ldc1            #132 <String " (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> ">
	//   19   42:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   20   45:ldc1            #134 <String " element in your manifest?)">
	//   21   47:invokevirtual   #119 <Method StringBuilder StringBuilder.append(String)>
	//   22   50:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   23   53:invokespecial   #140 <Method void IllegalArgumentException(String)>
	//   24   56:athrow          
		} else
		{
			navigateUpTo(activity, intent);
	//   25   57:aload_0         
	//   26   58:aload_1         
	//   27   59:invokestatic    #144 <Method void navigateUpTo(Activity, Intent)>
			return;
	//   28   62:return          
		}
	}

	public static void navigateUpTo(Activity activity, Intent intent)
	{
		IMPL.navigateUpTo(activity, intent);
	//    0    0:getstatic       #35  <Field NavUtils$NavUtilsImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #145 <Method void NavUtils$NavUtilsImpl.navigateUpTo(Activity, Intent)>
	//    4   10:return          
	}

	public static boolean shouldUpRecreateTask(Activity activity, Intent intent)
	{
		return IMPL.shouldUpRecreateTask(activity, intent);
	//    0    0:getstatic       #35  <Field NavUtils$NavUtilsImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #149 <Method boolean NavUtils$NavUtilsImpl.shouldUpRecreateTask(Activity, Intent)>
	//    4   10:ireturn         
	}

	private static final NavUtilsImpl IMPL;
	public static final String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";
	private static final String TAG = "NavUtils";

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          19
			IMPL = ((NavUtilsImpl) (new NavUtilsImplJB()));
	//    3    8:new             #12  <Class NavUtils$NavUtilsImplJB>
	//    4   11:dup             
	//    5   12:invokespecial   #33  <Method void NavUtils$NavUtilsImplJB()>
	//    6   15:putstatic       #35  <Field NavUtils$NavUtilsImpl IMPL>
	//    7   18:return          
		else
			IMPL = ((NavUtilsImpl) (new NavUtilsImplBase()));
	//    8   19:new             #9   <Class NavUtils$NavUtilsImplBase>
	//    9   22:dup             
	//   10   23:invokespecial   #36  <Method void NavUtils$NavUtilsImplBase()>
	//   11   26:putstatic       #35  <Field NavUtils$NavUtilsImpl IMPL>
	//*  12   29:return          
	}
}
