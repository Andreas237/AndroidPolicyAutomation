// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;

// Referenced classes of package android.support.v4.app:
//			NavUtils, NavUtilsJB

static class NavUtils$NavUtilsImplJB extends e
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

	NavUtils$NavUtilsImplJB()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void NavUtils$NavUtilsImplBase()>
	//    2    4:return          
	}
}
