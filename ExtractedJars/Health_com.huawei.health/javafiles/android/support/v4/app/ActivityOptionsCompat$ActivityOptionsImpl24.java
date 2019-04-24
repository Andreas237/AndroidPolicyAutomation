// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.PendingIntent;
import android.graphics.Rect;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//			ActivityOptionsCompat, ActivityOptionsCompat24

static class ActivityOptionsCompat$ActivityOptionsImpl24 extends ActivityOptionsCompat
{

	public Rect getLaunchBounds()
	{
		return mImpl.getLaunchBounds();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ActivityOptionsCompat24 mImpl>
	//    2    4:invokevirtual   #24  <Method Rect ActivityOptionsCompat24.getLaunchBounds()>
	//    3    7:areturn         
	}

	public void requestUsageTimeReport(PendingIntent pendingintent)
	{
		mImpl.requestUsageTimeReport(pendingintent);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ActivityOptionsCompat24 mImpl>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method void ActivityOptionsCompat24.requestUsageTimeReport(PendingIntent)>
	//    4    8:return          
	}

	public ActivityOptionsCompat setLaunchBounds(Rect rect)
	{
		return ((ActivityOptionsCompat) (new ActivityOptionsCompat$ActivityOptionsImpl24(mImpl.setLaunchBounds(rect))));
	//    0    0:new             #2   <Class ActivityOptionsCompat$ActivityOptionsImpl24>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field ActivityOptionsCompat24 mImpl>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #34  <Method ActivityOptionsCompat24 ActivityOptionsCompat24.setLaunchBounds(Rect)>
	//    6   12:invokespecial   #36  <Method void ActivityOptionsCompat$ActivityOptionsImpl24(ActivityOptionsCompat24)>
	//    7   15:areturn         
	}

	public Bundle toBundle()
	{
		return mImpl.toBundle();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ActivityOptionsCompat24 mImpl>
	//    2    4:invokevirtual   #41  <Method Bundle ActivityOptionsCompat24.toBundle()>
	//    3    7:areturn         
	}

	public void update(ActivityOptionsCompat activityoptionscompat)
	{
		if(activityoptionscompat instanceof ActivityOptionsCompat$ActivityOptionsImpl24)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ActivityOptionsCompat$ActivityOptionsImpl24>
	//*   2    4:ifeq            23
		{
			activityoptionscompat = ((ActivityOptionsCompat) ((ActivityOptionsCompat$ActivityOptionsImpl24)activityoptionscompat));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class ActivityOptionsCompat$ActivityOptionsImpl24>
	//    5   11:astore_1        
			mImpl.update(((ActivityOptionsCompat$ActivityOptionsImpl24) (activityoptionscompat)).mImpl);
	//    6   12:aload_0         
	//    7   13:getfield        #17  <Field ActivityOptionsCompat24 mImpl>
	//    8   16:aload_1         
	//    9   17:getfield        #17  <Field ActivityOptionsCompat24 mImpl>
	//   10   20:invokevirtual   #45  <Method void ActivityOptionsCompat24.update(ActivityOptionsCompat24)>
		}
	//   11   23:return          
	}

	private final ActivityOptionsCompat24 mImpl;

	ActivityOptionsCompat$ActivityOptionsImpl24(ActivityOptionsCompat24 activityoptionscompat24)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ActivityOptionsCompat()>
		mImpl = activityoptionscompat24;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field ActivityOptionsCompat24 mImpl>
	//    5    9:return          
	}
}
