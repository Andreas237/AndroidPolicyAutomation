// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.ActivityOptions;
import android.app.PendingIntent;

// Referenced classes of package android.support.v4.app:
//			ActivityOptionsCompat

private static class ActivityOptionsCompat$ActivityOptionsCompatApi23Impl extends ActivityOptionsCompat$ActivityOptionsCompatApi16Impl
{

	public void requestUsageTimeReport(PendingIntent pendingintent)
	{
		mActivityOptions.requestUsageTimeReport(pendingintent);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ActivityOptions mActivityOptions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #22  <Method void ActivityOptions.requestUsageTimeReport(PendingIntent)>
	//    4    8:return          
	}

	ActivityOptionsCompat$ActivityOptionsCompatApi23Impl(ActivityOptions activityoptions)
	{
		super(activityoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void ActivityOptionsCompat$ActivityOptionsCompatApi16Impl(ActivityOptions)>
	//    3    5:return          
	}
}
