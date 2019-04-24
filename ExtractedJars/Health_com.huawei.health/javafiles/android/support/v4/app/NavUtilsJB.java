// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;

class NavUtilsJB
{

	NavUtilsJB()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static Intent getParentActivityIntent(Activity activity)
	{
		return activity.getParentActivityIntent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method Intent Activity.getParentActivityIntent()>
	//    2    4:areturn         
	}

	public static String getParentActivityName(ActivityInfo activityinfo)
	{
		return activityinfo.parentActivityName;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String ActivityInfo.parentActivityName>
	//    2    4:areturn         
	}

	public static void navigateUpTo(Activity activity, Intent intent)
	{
		activity.navigateUpTo(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #32  <Method boolean Activity.navigateUpTo(Intent)>
	//    3    5:pop             
	//    4    6:return          
	}

	public static boolean shouldUpRecreateTask(Activity activity, Intent intent)
	{
		return activity.shouldUpRecreateTask(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #36  <Method boolean Activity.shouldUpRecreateTask(Intent)>
	//    3    5:ireturn         
	}
}
