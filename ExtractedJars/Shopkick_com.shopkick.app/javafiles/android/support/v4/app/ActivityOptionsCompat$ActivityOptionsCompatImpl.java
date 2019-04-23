// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.graphics.Rect;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//			ActivityOptionsCompat

private static class ActivityOptionsCompat$ActivityOptionsCompatImpl extends ActivityOptionsCompat
{

	public Rect getLaunchBounds()
	{
		if(android.os.Build.VERSION.SDK_INT < 24)
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmpge          10
			return null;
	//    3    8:aconst_null     
	//    4    9:areturn         
		else
			return mActivityOptions.getLaunchBounds();
	//    5   10:aload_0         
	//    6   11:getfield        #17  <Field ActivityOptions mActivityOptions>
	//    7   14:invokevirtual   #30  <Method Rect ActivityOptions.getLaunchBounds()>
	//    8   17:areturn         
	}

	public void requestUsageTimeReport(PendingIntent pendingintent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          16
			mActivityOptions.requestUsageTimeReport(pendingintent);
	//    3    8:aload_0         
	//    4    9:getfield        #17  <Field ActivityOptions mActivityOptions>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #34  <Method void ActivityOptions.requestUsageTimeReport(PendingIntent)>
	//    7   16:return          
	}

	public ActivityOptionsCompat setLaunchBounds(Rect rect)
	{
		if(android.os.Build.VERSION.SDK_INT < 24)
	//*   0    0:getstatic       #26  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmpge          10
			return ((ActivityOptionsCompat) (this));
	//    3    8:aload_0         
	//    4    9:areturn         
		else
			return ((ActivityOptionsCompat) (new ActivityOptionsCompat$ActivityOptionsCompatImpl(mActivityOptions.setLaunchBounds(rect))));
	//    5   10:new             #2   <Class ActivityOptionsCompat$ActivityOptionsCompatImpl>
	//    6   13:dup             
	//    7   14:aload_0         
	//    8   15:getfield        #17  <Field ActivityOptions mActivityOptions>
	//    9   18:aload_1         
	//   10   19:invokevirtual   #40  <Method ActivityOptions ActivityOptions.setLaunchBounds(Rect)>
	//   11   22:invokespecial   #42  <Method void ActivityOptionsCompat$ActivityOptionsCompatImpl(ActivityOptions)>
	//   12   25:areturn         
	}

	public Bundle toBundle()
	{
		return mActivityOptions.toBundle();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ActivityOptions mActivityOptions>
	//    2    4:invokevirtual   #47  <Method Bundle ActivityOptions.toBundle()>
	//    3    7:areturn         
	}

	public void update(ActivityOptionsCompat activityoptionscompat)
	{
		if(activityoptionscompat instanceof ActivityOptionsCompat$ActivityOptionsCompatImpl)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ActivityOptionsCompat$ActivityOptionsCompatImpl>
	//*   2    4:ifeq            23
		{
			activityoptionscompat = ((ActivityOptionsCompat) ((ActivityOptionsCompat$ActivityOptionsCompatImpl)activityoptionscompat));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class ActivityOptionsCompat$ActivityOptionsCompatImpl>
	//    5   11:astore_1        
			mActivityOptions.update(((ActivityOptionsCompat$ActivityOptionsCompatImpl) (activityoptionscompat)).mActivityOptions);
	//    6   12:aload_0         
	//    7   13:getfield        #17  <Field ActivityOptions mActivityOptions>
	//    8   16:aload_1         
	//    9   17:getfield        #17  <Field ActivityOptions mActivityOptions>
	//   10   20:invokevirtual   #51  <Method void ActivityOptions.update(ActivityOptions)>
		}
	//   11   23:return          
	}

	private final ActivityOptions mActivityOptions;

	ActivityOptionsCompat$ActivityOptionsCompatImpl(ActivityOptions activityoptions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ActivityOptionsCompat()>
		mActivityOptions = activityoptions;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field ActivityOptions mActivityOptions>
	//    5    9:return          
	}
}
