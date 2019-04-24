// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//			ActivityOptionsCompat, ActivityOptionsCompat23

static class ActivityOptionsCompat$ActivityOptionsImpl23 extends ActivityOptionsCompat
{

	public void requestUsageTimeReport(PendingIntent pendingintent)
	{
		mImpl.requestUsageTimeReport(pendingintent);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ActivityOptionsCompat23 mImpl>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method void ActivityOptionsCompat23.requestUsageTimeReport(PendingIntent)>
	//    4    8:return          
	}

	public Bundle toBundle()
	{
		return mImpl.toBundle();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ActivityOptionsCompat23 mImpl>
	//    2    4:invokevirtual   #28  <Method Bundle ActivityOptionsCompat23.toBundle()>
	//    3    7:areturn         
	}

	public void update(ActivityOptionsCompat activityoptionscompat)
	{
		if(activityoptionscompat instanceof ActivityOptionsCompat$ActivityOptionsImpl23)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ActivityOptionsCompat$ActivityOptionsImpl23>
	//*   2    4:ifeq            23
		{
			activityoptionscompat = ((ActivityOptionsCompat) ((ActivityOptionsCompat$ActivityOptionsImpl23)activityoptionscompat));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class ActivityOptionsCompat$ActivityOptionsImpl23>
	//    5   11:astore_1        
			mImpl.update(((ActivityOptionsCompat$ActivityOptionsImpl23) (activityoptionscompat)).mImpl);
	//    6   12:aload_0         
	//    7   13:getfield        #17  <Field ActivityOptionsCompat23 mImpl>
	//    8   16:aload_1         
	//    9   17:getfield        #17  <Field ActivityOptionsCompat23 mImpl>
	//   10   20:invokevirtual   #32  <Method void ActivityOptionsCompat23.update(ActivityOptionsCompat23)>
		}
	//   11   23:return          
	}

	private final ActivityOptionsCompat23 mImpl;

	ActivityOptionsCompat$ActivityOptionsImpl23(ActivityOptionsCompat23 activityoptionscompat23)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ActivityOptionsCompat()>
		mImpl = activityoptionscompat23;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field ActivityOptionsCompat23 mImpl>
	//    5    9:return          
	}
}
