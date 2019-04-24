// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.*;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package android.support.v4.app:
//			NavUtils

static class NavUtils$NavUtilsImplBase
	implements NavUtils.NavUtilsImpl
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

	NavUtils$NavUtilsImplBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
