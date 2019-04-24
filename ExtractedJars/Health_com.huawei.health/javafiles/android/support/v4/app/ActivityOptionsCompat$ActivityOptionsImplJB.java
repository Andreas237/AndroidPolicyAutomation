// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//			ActivityOptionsCompat, ActivityOptionsCompatJB

static class ActivityOptionsCompat$ActivityOptionsImplJB extends ActivityOptionsCompat
{

	public Bundle toBundle()
	{
		return mImpl.toBundle();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ActivityOptionsCompatJB mImpl>
	//    2    4:invokevirtual   #24  <Method Bundle ActivityOptionsCompatJB.toBundle()>
	//    3    7:areturn         
	}

	public void update(ActivityOptionsCompat activityoptionscompat)
	{
		if(activityoptionscompat instanceof ActivityOptionsCompat$ActivityOptionsImplJB)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ActivityOptionsCompat$ActivityOptionsImplJB>
	//*   2    4:ifeq            23
		{
			activityoptionscompat = ((ActivityOptionsCompat) ((ActivityOptionsCompat$ActivityOptionsImplJB)activityoptionscompat));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class ActivityOptionsCompat$ActivityOptionsImplJB>
	//    5   11:astore_1        
			mImpl.update(((ActivityOptionsCompat$ActivityOptionsImplJB) (activityoptionscompat)).mImpl);
	//    6   12:aload_0         
	//    7   13:getfield        #17  <Field ActivityOptionsCompatJB mImpl>
	//    8   16:aload_1         
	//    9   17:getfield        #17  <Field ActivityOptionsCompatJB mImpl>
	//   10   20:invokevirtual   #28  <Method void ActivityOptionsCompatJB.update(ActivityOptionsCompatJB)>
		}
	//   11   23:return          
	}

	private final ActivityOptionsCompatJB mImpl;

	ActivityOptionsCompat$ActivityOptionsImplJB(ActivityOptionsCompatJB activityoptionscompatjb)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void ActivityOptionsCompat()>
		mImpl = activityoptionscompatjb;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field ActivityOptionsCompatJB mImpl>
	//    5    9:return          
	}
}
