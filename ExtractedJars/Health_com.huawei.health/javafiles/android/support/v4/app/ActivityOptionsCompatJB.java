// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;

class ActivityOptionsCompatJB
{

	private ActivityOptionsCompatJB(ActivityOptions activityoptions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mActivityOptions = activityoptions;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field ActivityOptions mActivityOptions>
	//    5    9:return          
	}

	public static ActivityOptionsCompatJB makeCustomAnimation(Context context, int i, int j)
	{
		return new ActivityOptionsCompatJB(ActivityOptions.makeCustomAnimation(context, i, j));
	//    0    0:new             #2   <Class ActivityOptionsCompatJB>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #24  <Method ActivityOptions ActivityOptions.makeCustomAnimation(Context, int, int)>
	//    6   10:invokespecial   #26  <Method void ActivityOptionsCompatJB(ActivityOptions)>
	//    7   13:areturn         
	}

	public static ActivityOptionsCompatJB makeScaleUpAnimation(View view, int i, int j, int k, int l)
	{
		return new ActivityOptionsCompatJB(ActivityOptions.makeScaleUpAnimation(view, i, j, k, l));
	//    0    0:new             #2   <Class ActivityOptionsCompatJB>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:invokestatic    #31  <Method ActivityOptions ActivityOptions.makeScaleUpAnimation(View, int, int, int, int)>
	//    8   13:invokespecial   #26  <Method void ActivityOptionsCompatJB(ActivityOptions)>
	//    9   16:areturn         
	}

	public static ActivityOptionsCompatJB makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int j)
	{
		return new ActivityOptionsCompatJB(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, j));
	//    0    0:new             #2   <Class ActivityOptionsCompatJB>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokestatic    #36  <Method ActivityOptions ActivityOptions.makeThumbnailScaleUpAnimation(View, Bitmap, int, int)>
	//    7   11:invokespecial   #26  <Method void ActivityOptionsCompatJB(ActivityOptions)>
	//    8   14:areturn         
	}

	public Bundle toBundle()
	{
		return mActivityOptions.toBundle();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ActivityOptions mActivityOptions>
	//    2    4:invokevirtual   #40  <Method Bundle ActivityOptions.toBundle()>
	//    3    7:areturn         
	}

	public void update(ActivityOptionsCompatJB activityoptionscompatjb)
	{
		mActivityOptions.update(activityoptionscompatjb.mActivityOptions);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ActivityOptions mActivityOptions>
	//    2    4:aload_1         
	//    3    5:getfield        #16  <Field ActivityOptions mActivityOptions>
	//    4    8:invokevirtual   #44  <Method void ActivityOptions.update(ActivityOptions)>
	//    5   11:return          
	}

	private final ActivityOptions mActivityOptions;
}
