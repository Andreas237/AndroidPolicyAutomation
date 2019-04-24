// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.ActivityOptions;
import android.graphics.Rect;

// Referenced classes of package android.support.v4.app:
//			ActivityOptionsCompat

private static class ActivityOptionsCompat$ActivityOptionsCompatApi24Impl extends ActivityOptionsCompat$ActivityOptionsCompatApi23Impl
{

	public Rect getLaunchBounds()
	{
		return mActivityOptions.getLaunchBounds();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ActivityOptions mActivityOptions>
	//    2    4:invokevirtual   #22  <Method Rect ActivityOptions.getLaunchBounds()>
	//    3    7:areturn         
	}

	public ActivityOptionsCompat setLaunchBounds(Rect rect)
	{
		return ((ActivityOptionsCompat) (new ActivityOptionsCompat$ActivityOptionsCompatApi24Impl(mActivityOptions.setLaunchBounds(rect))));
	//    0    0:new             #2   <Class ActivityOptionsCompat$ActivityOptionsCompatApi24Impl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field ActivityOptions mActivityOptions>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #27  <Method ActivityOptions ActivityOptions.setLaunchBounds(Rect)>
	//    6   12:invokespecial   #28  <Method void ActivityOptionsCompat$ActivityOptionsCompatApi24Impl(ActivityOptions)>
	//    7   15:areturn         
	}

	ActivityOptionsCompat$ActivityOptionsCompatApi24Impl(ActivityOptions activityoptions)
	{
		super(activityoptions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void ActivityOptionsCompat$ActivityOptionsCompatApi23Impl(ActivityOptions)>
	//    3    5:return          
	}
}
