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
	//*  38   67:new             #55  <Class StringBuilder>
	//*  39   70:dup             
	//*  40   71:invokespecial   #56  <Method void StringBuilder()>
	//*  41   74:astore_0        
	//*  42   75:aload_0         
	//*  43   76:ldc1            #58  <String "getParentActivityIntent: bad parentActivityName '">
	//*  44   78:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  45   81:pop             
	//*  46   82:aload_0         
	//*  47   83:aload_1         
	//*  48   84:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  49   87:pop             
	//*  50   88:aload_0         
	//*  51   89:ldc1            #64  <String "' in manifest">
	//*  52   91:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  53   94:pop             
	//*  54   95:ldc1            #11  <String "NavUtils">
	//*  55   97:aload_0         
	//*  56   98:invokevirtual   #68  <Method String StringBuilder.toString()>
	//*  57  101:invokestatic    #74  <Method int Log.e(String, String)>
	//*  58  104:pop             
	//*  59  105:aconst_null     
	//*  60  106:areturn         
		// Misplaced declaration of an exception variable
		catch(Activity activity)
		{
			activity = ((Activity) (new StringBuilder()));
			((StringBuilder) (activity)).append("getParentActivityIntent: bad parentActivityName '");
			((StringBuilder) (activity)).append(s);
			((StringBuilder) (activity)).append("' in manifest");
			Log.e("NavUtils", ((StringBuilder) (activity)).toString());
			return null;
		}
		return ((Intent) (activity));
	//*  61  107:astore_0        
	//*  62  108:goto            67
	}

	public static Intent getParentActivityIntent(Context context, ComponentName componentname)
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
	{
		class1 = ((Class) (getParentActivityName(context, new ComponentName(context, class1))));
	//    0    0:aload_0         
	//    1    1:new             #37  <Class ComponentName>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #85  <Method void ComponentName(Context, Class)>
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
	//    2    2:invokevirtual   #91  <Method ComponentName Activity.getComponentName()>
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
	//    8   12:new             #93  <Class IllegalArgumentException>
	//    9   15:dup             
	//   10   16:aload_0         
	//   11   17:invokespecial   #96  <Method void IllegalArgumentException(Throwable)>
	//   12   20:athrow          
		}
		return ((String) (activity));
	}

	public static String getParentActivityName(Context context, ComponentName componentname)
	{
		componentname = ((ComponentName) (context.getPackageManager().getActivityInfo(componentname, 128)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_1         
	//    3    5:sipush          128
	//    4    8:invokevirtual   #108 <Method ActivityInfo PackageManager.getActivityInfo(ComponentName, int)>
	//    5   11:astore_1        
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   6   12:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   15:bipush          16
	//*   8   17:icmplt          31
		{
			String s = ((ActivityInfo) (componentname)).parentActivityName;
	//    9   20:aload_1         
	//   10   21:getfield        #113 <Field String ActivityInfo.parentActivityName>
	//   11   24:astore_2        
			if(s != null)
	//*  12   25:aload_2         
	//*  13   26:ifnull          31
				return s;
	//   14   29:aload_2         
	//   15   30:areturn         
		}
		if(((ActivityInfo) (componentname)).metaData == null)
	//*  16   31:aload_1         
	//*  17   32:getfield        #117 <Field Bundle ActivityInfo.metaData>
	//*  18   35:ifnonnull       40
			return null;
	//   19   38:aconst_null     
	//   20   39:areturn         
		String s1 = ((ActivityInfo) (componentname)).metaData.getString("android.support.PARENT_ACTIVITY");
	//   21   40:aload_1         
	//   22   41:getfield        #117 <Field Bundle ActivityInfo.metaData>
	//   23   44:ldc1            #8   <String "android.support.PARENT_ACTIVITY">
	//   24   46:invokevirtual   #123 <Method String Bundle.getString(String)>
	//   25   49:astore_2        
		if(s1 == null)
	//*  26   50:aload_2         
	//*  27   51:ifnonnull       56
			return null;
	//   28   54:aconst_null     
	//   29   55:areturn         
		componentname = ((ComponentName) (s1));
	//   30   56:aload_2         
	//   31   57:astore_1        
		if(s1.charAt(0) == '.')
	//*  32   58:aload_2         
	//*  33   59:iconst_0        
	//*  34   60:invokevirtual   #129 <Method char String.charAt(int)>
	//*  35   63:bipush          46
	//*  36   65:icmpne          96
		{
			componentname = ((ComponentName) (new StringBuilder()));
	//   37   68:new             #55  <Class StringBuilder>
	//   38   71:dup             
	//   39   72:invokespecial   #56  <Method void StringBuilder()>
	//   40   75:astore_1        
			((StringBuilder) (componentname)).append(context.getPackageName());
	//   41   76:aload_1         
	//   42   77:aload_0         
	//   43   78:invokevirtual   #130 <Method String Context.getPackageName()>
	//   44   81:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   45   84:pop             
			((StringBuilder) (componentname)).append(s1);
	//   46   85:aload_1         
	//   47   86:aload_2         
	//   48   87:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   49   90:pop             
			componentname = ((ComponentName) (((StringBuilder) (componentname)).toString()));
	//   50   91:aload_1         
	//   51   92:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   52   95:astore_1        
		}
		return ((String) (componentname));
	//   53   96:aload_1         
	//   54   97:areturn         
	}

	public static void navigateUpFromSameTask(Activity activity)
	{
		Object obj = ((Object) (getParentActivityIntent(activity)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #134 <Method Intent getParentActivityIntent(Activity)>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       69
		{
			obj = ((Object) (new StringBuilder()));
	//    5    9:new             #55  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #56  <Method void StringBuilder()>
	//    8   16:astore_1        
			((StringBuilder) (obj)).append("Activity ");
	//    9   17:aload_1         
	//   10   18:ldc1            #136 <String "Activity ">
	//   11   20:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
			((StringBuilder) (obj)).append(((Object) (activity)).getClass().getSimpleName());
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:invokevirtual   #140 <Method Class Object.getClass()>
	//   16   29:invokevirtual   #145 <Method String Class.getSimpleName()>
	//   17   32:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
			((StringBuilder) (obj)).append(" does not have a parent activity name specified.");
	//   19   36:aload_1         
	//   20   37:ldc1            #147 <String " does not have a parent activity name specified.">
	//   21   39:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
			((StringBuilder) (obj)).append(" (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> ");
	//   23   43:aload_1         
	//   24   44:ldc1            #149 <String " (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data> ">
	//   25   46:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
			((StringBuilder) (obj)).append(" element in your manifest?)");
	//   27   50:aload_1         
	//   28   51:ldc1            #151 <String " element in your manifest?)">
	//   29   53:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   30   56:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   31   57:new             #93  <Class IllegalArgumentException>
	//   32   60:dup             
	//   33   61:aload_1         
	//   34   62:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   35   65:invokespecial   #154 <Method void IllegalArgumentException(String)>
	//   36   68:athrow          
		} else
		{
			navigateUpTo(activity, ((Intent) (obj)));
	//   37   69:aload_0         
	//   38   70:aload_1         
	//   39   71:invokestatic    #158 <Method void navigateUpTo(Activity, Intent)>
			return;
	//   40   74:return          
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
	//    5   10:invokevirtual   #161 <Method boolean Activity.navigateUpTo(Intent)>
	//    6   13:pop             
			return;
	//    7   14:return          
		} else
		{
			intent.addFlags(0x4000000);
	//    8   15:aload_1         
	//    9   16:ldc1            #162 <Int 0x4000000>
	//   10   18:invokevirtual   #166 <Method Intent Intent.addFlags(int)>
	//   11   21:pop             
			activity.startActivity(intent);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #170 <Method void Activity.startActivity(Intent)>
			activity.finish();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #173 <Method void Activity.finish()>
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
	//    5   10:invokevirtual   #177 <Method boolean Activity.shouldUpRecreateTask(Intent)>
	//    6   13:ireturn         
		activity = ((Activity) (activity.getIntent().getAction()));
	//    7   14:aload_0         
	//    8   15:invokevirtual   #180 <Method Intent Activity.getIntent()>
	//    9   18:invokevirtual   #183 <Method String Intent.getAction()>
	//   10   21:astore_0        
		return activity != null && !((String) (activity)).equals("android.intent.action.MAIN");
	//   11   22:aload_0         
	//   12   23:ifnull          37
	//   13   26:aload_0         
	//   14   27:ldc1            #185 <String "android.intent.action.MAIN">
	//   15   29:invokevirtual   #189 <Method boolean String.equals(Object)>
	//   16   32:ifne            37
	//   17   35:iconst_1        
	//   18   36:ireturn         
	//   19   37:iconst_0        
	//   20   38:ireturn         
	}

	public static final String PARENT_ACTIVITY = "android.support.PARENT_ACTIVITY";
	private static final String TAG = "NavUtils";
}
