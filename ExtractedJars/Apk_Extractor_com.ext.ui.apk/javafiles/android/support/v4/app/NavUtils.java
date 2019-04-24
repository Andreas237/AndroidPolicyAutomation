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

public final class NavUtils
{

	private NavUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static Intent getParentActivityIntent(Activity activity)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          19
		{
			Intent intent = activity.getParentActivityIntent();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #31  <Method Intent Activity.getParentActivityIntent()>
	//    5   12:astore_1        
			if(intent != null)
	//*   6   13:aload_1         
	//*   7   14:ifnull          19
				return intent;
	//    8   17:aload_1         
	//    9   18:areturn         
		}
		String s = getParentActivityName(activity);
	//   10   19:aload_0         
	//   11   20:invokestatic    #35  <Method String getParentActivityName(Activity)>
	//   12   23:astore_1        
		if(s == null)
	//*  13   24:aload_1         
	//*  14   25:ifnonnull       30
			return null;
	//   15   28:aconst_null     
	//   16   29:areturn         
		ComponentName componentname = new ComponentName(((Context) (activity)), s);
	//   17   30:new             #37  <Class ComponentName>
	//   18   33:dup             
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:invokespecial   #40  <Method void ComponentName(Context, String)>
	//   22   39:astore_2        
		try
		{
			if(getParentActivityName(((Context) (activity)), componentname) == null)
	//*  23   40:aload_0         
	//*  24   41:aload_2         
	//*  25   42:invokestatic    #43  <Method String getParentActivityName(Context, ComponentName)>
	//*  26   45:ifnonnull       53
				return Intent.makeMainActivity(componentname);
	//   27   48:aload_2         
	//   28   49:invokestatic    #49  <Method Intent Intent.makeMainActivity(ComponentName)>
	//   29   52:areturn         
			activity = ((Activity) ((new Intent()).setComponent(componentname)));
	//   30   53:new             #45  <Class Intent>
	//   31   56:dup             
	//   32   57:invokespecial   #50  <Method void Intent()>
	//   33   60:aload_2         
	//   34   61:invokevirtual   #53  <Method Intent Intent.setComponent(ComponentName)>
	//   35   64:astore_0        
		}
	//*  36   65:aload_0         
	//*  37   66:areturn         
		// Misplaced declaration of an exception variable
		catch(Activity activity)
	//*  38   67:astore_0        
		{
			Log.e("NavUtils", (new StringBuilder()).append("getParentActivityIntent: bad parentActivityName '").append(s).append("' in manifest").toString());
	//   39   68:ldc1            #11  <String "NavUtils">
	//   40   70:new             #55  <Class StringBuilder>
	//   41   73:dup             
	//   42   74:invokespecial   #56  <Method void StringBuilder()>
	//   43   77:ldc1            #58  <String "getParentActivityIntent: bad parentActivityName '">
	//   44   79:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   45   82:aload_1         
	//   46   83:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   47   86:ldc1            #64  <String "' in manifest">
	//   48   88:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   49   91:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   50   94:invokestatic    #74  <Method int Log.e(String, String)>
	//   51   97:pop             
			return null;
	//   52   98:aconst_null     
	//   53   99:areturn         
		}
		return ((Intent) (activity));
	}

	public static Intent getParentActivityIntent(Context context, ComponentName componentname)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		String s = getParentActivityName(context, componentname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #43  <Method String getParentActivityName(Context, ComponentName)>
	//    3    5:astore_2        
		if(s == null)
	//*   4    6:aload_2         
	//*   5    7:ifnonnull       12
			return null;
	//    6   10:aconst_null     
	//    7   11:areturn         
		componentname = new ComponentName(componentname.getPackageName(), s);
	//    8   12:new             #37  <Class ComponentName>
	//    9   15:dup             
	//   10   16:aload_1         
	//   11   17:invokevirtual   #78  <Method String ComponentName.getPackageName()>
	//   12   20:aload_2         
	//   13   21:invokespecial   #81  <Method void ComponentName(String, String)>
	//   14   24:astore_1        
		if(getParentActivityName(context, componentname) == null)
	//*  15   25:aload_0         
	//*  16   26:aload_1         
	//*  17   27:invokestatic    #43  <Method String getParentActivityName(Context, ComponentName)>
	//*  18   30:ifnonnull       38
			return Intent.makeMainActivity(componentname);
	//   19   33:aload_1         
	//   20   34:invokestatic    #49  <Method Intent Intent.makeMainActivity(ComponentName)>
	//   21   37:areturn         
		else
			return (new Intent()).setComponent(componentname);
	//   22   38:new             #45  <Class Intent>
	//   23   41:dup             
	//   24   42:invokespecial   #50  <Method void Intent()>
	//   25   45:aload_1         
	//   26   46:invokevirtual   #53  <Method Intent Intent.setComponent(ComponentName)>
	//   27   49:areturn         
	}

	public static Intent getParentActivityIntent(Context context, Class class1)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		class1 = ((Class) (getParentActivityName(context, new ComponentName(context, class1))));
	//    0    0:aload_0         
	//    1    1:new             #37  <Class ComponentName>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #86  <Method void ComponentName(Context, Class)>
	//    6   10:invokestatic    #43  <Method String getParentActivityName(Context, ComponentName)>
	//    7   13:astore_1        
		if(class1 == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       20
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		class1 = ((Class) (new ComponentName(context, ((String) (class1)))));
	//   12   20:new             #37  <Class ComponentName>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:invokespecial   #40  <Method void ComponentName(Context, String)>
	//   17   29:astore_1        
		if(getParentActivityName(context, ((ComponentName) (class1))) == null)
	//*  18   30:aload_0         
	//*  19   31:aload_1         
	//*  20   32:invokestatic    #43  <Method String getParentActivityName(Context, ComponentName)>
	//*  21   35:ifnonnull       43
			return Intent.makeMainActivity(((ComponentName) (class1)));
	//   22   38:aload_1         
	//   23   39:invokestatic    #49  <Method Intent Intent.makeMainActivity(ComponentName)>
	//   24   42:areturn         
		else
			return (new Intent()).setComponent(((ComponentName) (class1)));
	//   25   43:new             #45  <Class Intent>
	//   26   46:dup             
	//   27   47:invokespecial   #50  <Method void Intent()>
	//   28   50:aload_1         
	//   29   51:invokevirtual   #53  <Method Intent Intent.setComponent(ComponentName)>
	//   30   54:areturn         
	}

	public static String getParentActivityName(Activity activity)
	{
		try
		{
			activity = ((Activity) (getParentActivityName(((Context) (activity)), activity.getComponentName())));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #93  <Method ComponentName Activity.getComponentName()>
	//    3    5:invokestatic    #43  <Method String getParentActivityName(Context, ComponentName)>
	//    4    8:astore_0        
		}
	//*   5    9:aload_0         
	//*   6   10:areturn         
		// Misplaced declaration of an exception variable
		catch(Activity activity)
	//*   7   11:astore_0        
		{
			throw new IllegalArgumentException(((Throwable) (activity)));
	//    8   12:new             #95  <Class IllegalArgumentException>
	//    9   15:dup             
	//   10   16:aload_0         
	//   11   17:invokespecial   #98  <Method void IllegalArgumentException(Throwable)>
	//   12   20:athrow          
		}
		return ((String) (activity));
	}

	public static String getParentActivityName(Context context, ComponentName componentname)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		Object obj = ((Object) (context.getPackageManager().getActivityInfo(componentname, 128)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_1         
	//    3    5:sipush          128
	//    4    8:invokevirtual   #111 <Method ActivityInfo PackageManager.getActivityInfo(ComponentName, int)>
	//    5   11:astore_2        
		if(android.os.Build.VERSION.SDK_INT < 16) goto _L2; else goto _L1
	//    6   12:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//    7   15:bipush          16
	//    8   17:icmplt          31
_L1:
		componentname = ((ComponentName) (((ActivityInfo) (obj)).parentActivityName));
	//    9   20:aload_2         
	//   10   21:getfield        #116 <Field String ActivityInfo.parentActivityName>
	//   11   24:astore_1        
		if(componentname == null) goto _L2; else goto _L3
	//   12   25:aload_1         
	//   13   26:ifnull          31
_L3:
		return ((String) (componentname));
	//   14   29:aload_1         
	//   15   30:areturn         
_L2:
		if(((ActivityInfo) (obj)).metaData == null)
	//*  16   31:aload_2         
	//*  17   32:getfield        #120 <Field Bundle ActivityInfo.metaData>
	//*  18   35:ifnonnull       40
			return null;
	//   19   38:aconst_null     
	//   20   39:areturn         
		obj = ((Object) (((ActivityInfo) (obj)).metaData.getString("android.support.PARENT_ACTIVITY")));
	//   21   40:aload_2         
	//   22   41:getfield        #120 <Field Bundle ActivityInfo.metaData>
	//   23   44:ldc1            #8   <String "android.support.PARENT_ACTIVITY">
	//   24   46:invokevirtual   #126 <Method String Bundle.getString(String)>
	//   25   49:astore_2        
		if(obj == null)
	//*  26   50:aload_2         
	//*  27   51:ifnonnull       56
			return null;
	//   28   54:aconst_null     
	//   29   55:areturn         
		componentname = ((ComponentName) (obj));
	//   30   56:aload_2         
	//   31   57:astore_1        
		if(((String) (obj)).charAt(0) == '.')
	//*  32   58:aload_2         
	//*  33   59:iconst_0        
	//*  34   60:invokevirtual   #132 <Method char String.charAt(int)>
	//*  35   63:bipush          46
	//*  36   65:icmpne          29
			return (new StringBuilder()).append(context.getPackageName()).append(((String) (obj))).toString();
	//   37   68:new             #55  <Class StringBuilder>
	//   38   71:dup             
	//   39   72:invokespecial   #56  <Method void StringBuilder()>
	//   40   75:aload_0         
	//   41   76:invokevirtual   #133 <Method String Context.getPackageName()>
	//   42   79:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   43   82:aload_2         
	//   44   83:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   45   86:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   46   89:areturn         
		if(true) goto _L3; else goto _L4
_L4:
	}

	public static void navigateUpFromSameTask(Activity activity)
	{
		Intent intent = getParentActivityIntent(activity);
	//    0    0:aload_0         
	//    1    1:invokestatic    #137 <Method Intent getParentActivityIntent(Activity)>
	//    2    4:astore_1        
		if(intent == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       57
		{
			throw new IllegalArgumentException((new StringBuilder()).append("Activity ").append(((Object) (activity)).getClass().getSimpleName()).append(" does not have a parent activity name specified.").append(" (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> ").append(" element in your manifest?)").toString());
	//    5    9:new             #95  <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:new             #55  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #56  <Method void StringBuilder()>
	//   10   20:ldc1            #139 <String "Activity ">
	//   11   22:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:aload_0         
	//   13   26:invokevirtual   #143 <Method Class Object.getClass()>
	//   14   29:invokevirtual   #148 <Method String Class.getSimpleName()>
	//   15   32:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:ldc1            #150 <String " does not have a parent activity name specified.">
	//   17   37:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   18   40:ldc1            #152 <String " (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> ">
	//   19   42:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   20   45:ldc1            #154 <String " element in your manifest?)">
	//   21   47:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   22   50:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   23   53:invokespecial   #157 <Method void IllegalArgumentException(String)>
	//   24   56:athrow          
		} else
		{
			navigateUpTo(activity, intent);
	//   25   57:aload_0         
	//   26   58:aload_1         
	//   27   59:invokestatic    #161 <Method void navigateUpTo(Activity, Intent)>
			return;
	//   28   62:return          
		}
	}

	public static void navigateUpTo(Activity activity, Intent intent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          15
		{
			activity.navigateUpTo(intent);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #164 <Method boolean Activity.navigateUpTo(Intent)>
	//    6   13:pop             
			return;
	//    7   14:return          
		} else
		{
			intent.addFlags(0x4000000);
	//    8   15:aload_1         
	//    9   16:ldc1            #165 <Int 0x4000000>
	//   10   18:invokevirtual   #169 <Method Intent Intent.addFlags(int)>
	//   11   21:pop             
			activity.startActivity(intent);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #173 <Method void Activity.startActivity(Intent)>
			activity.finish();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #176 <Method void Activity.finish()>
			return;
	//   17   31:return          
		}
	}

	public static boolean shouldUpRecreateTask(Activity activity, Intent intent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          14
			return activity.shouldUpRecreateTask(intent);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #180 <Method boolean Activity.shouldUpRecreateTask(Intent)>
	//    6   13:ireturn         
		activity = ((Activity) (activity.getIntent().getAction()));
	//    7   14:aload_0         
	//    8   15:invokevirtual   #183 <Method Intent Activity.getIntent()>
	//    9   18:invokevirtual   #186 <Method String Intent.getAction()>
	//   10   21:astore_0        
		return activity != null && !((String) (activity)).equals("android.intent.action.MAIN");
	//   11   22:aload_0         
	//   12   23:ifnull          37
	//   13   26:aload_0         
	//   14   27:ldc1            #188 <String "android.intent.action.MAIN">
	//   15   29:invokevirtual   #192 <Method boolean String.equals(Object)>
	//   16   32:ifne            37
	//   17   35:iconst_1        
	//   18   36:ireturn         
	//   19   37:iconst_0        
	//   20   38:ireturn         
	}

	public static final String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";
	private static final String TAG = "NavUtils";
}
