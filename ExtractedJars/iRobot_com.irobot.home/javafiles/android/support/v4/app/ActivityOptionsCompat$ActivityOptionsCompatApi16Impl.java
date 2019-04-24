// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.ActivityOptions;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//			ActivityOptionsCompat

private static class ActivityOptionsCompat$ActivityOptionsCompatApi16Impl extends ActivityOptionsCompat
{

	public Bundle toBundle()
	{
		return mActivityOptions.toBundle();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ActivityOptions mActivityOptions>
	//    2    4:invokevirtual   #21  <Method Bundle ActivityOptions.toBundle()>
	//    3    7:areturn         
	}

	public void update(ActivityOptionsCompat activityoptionscompat)
	{
		if(activityoptionscompat instanceof ActivityOptionsCompat$ActivityOptionsCompatApi16Impl)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ActivityOptionsCompat$ActivityOptionsCompatApi16Impl>
	//*   2    4:ifeq            23
		{
			activityoptionscompat = ((ActivityOptionsCompat) ((ActivityOptionsCompat$ActivityOptionsCompatApi16Impl)activityoptionscompat));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class ActivityOptionsCompat$ActivityOptionsCompatApi16Impl>
	//    5   11:astore_1        
			mActivityOptions.update(((ActivityOptionsCompat$ActivityOptionsCompatApi16Impl) (activityoptionscompat)).mActivityOptions);
	//    6   12:aload_0         
	//    7   13:getfield        #14  <Field ActivityOptions mActivityOptions>
	//    8   16:aload_1         
	//    9   17:getfield        #14  <Field ActivityOptions mActivityOptions>
	//   10   20:invokevirtual   #25  <Method void ActivityOptions.update(ActivityOptions)>
		}
	//   11   23:return          
	}

	protected final ActivityOptions mActivityOptions;

	ActivityOptionsCompat$ActivityOptionsCompatApi16Impl(ActivityOptions activityoptions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void ActivityOptionsCompat()>
		mActivityOptions = activityoptions;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field ActivityOptions mActivityOptions>
	//    5    9:return          
	}
}
