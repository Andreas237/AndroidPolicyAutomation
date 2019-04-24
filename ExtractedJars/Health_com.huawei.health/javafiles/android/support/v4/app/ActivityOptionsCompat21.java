// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

class ActivityOptionsCompat21
{

	private ActivityOptionsCompat21(ActivityOptions activityoptions)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mActivityOptions = activityoptions;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field ActivityOptions mActivityOptions>
	//    5    9:return          
	}

	public static ActivityOptionsCompat21 makeCustomAnimation(Context context, int i, int j)
	{
		return new ActivityOptionsCompat21(ActivityOptions.makeCustomAnimation(context, i, j));
	//    0    0:new             #2   <Class ActivityOptionsCompat21>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #24  <Method ActivityOptions ActivityOptions.makeCustomAnimation(Context, int, int)>
	//    6   10:invokespecial   #26  <Method void ActivityOptionsCompat21(ActivityOptions)>
	//    7   13:areturn         
	}

	public static ActivityOptionsCompat21 makeScaleUpAnimation(View view, int i, int j, int k, int l)
	{
		return new ActivityOptionsCompat21(ActivityOptions.makeScaleUpAnimation(view, i, j, k, l));
	//    0    0:new             #2   <Class ActivityOptionsCompat21>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:iload           4
	//    7   10:invokestatic    #31  <Method ActivityOptions ActivityOptions.makeScaleUpAnimation(View, int, int, int, int)>
	//    8   13:invokespecial   #26  <Method void ActivityOptionsCompat21(ActivityOptions)>
	//    9   16:areturn         
	}

	public static ActivityOptionsCompat21 makeSceneTransitionAnimation(Activity activity, View view, String s)
	{
		return new ActivityOptionsCompat21(ActivityOptions.makeSceneTransitionAnimation(activity, view, s));
	//    0    0:new             #2   <Class ActivityOptionsCompat21>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokestatic    #36  <Method ActivityOptions ActivityOptions.makeSceneTransitionAnimation(Activity, View, String)>
	//    6   10:invokespecial   #26  <Method void ActivityOptionsCompat21(ActivityOptions)>
	//    7   13:areturn         
	}

	public static ActivityOptionsCompat21 makeSceneTransitionAnimation(Activity activity, View aview[], String as[])
	{
		Pair apair[] = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		if(aview != null)
	//*   2    3:aload_1         
	//*   3    4:ifnull          47
		{
			Pair apair1[] = new Pair[aview.length];
	//    4    7:aload_1         
	//    5    8:arraylength     
	//    6    9:anewarray       Pair[]
	//    7   12:astore          5
			int i = 0;
	//    8   14:iconst_0        
	//    9   15:istore_3        
			do
			{
				apair = apair1;
	//   10   16:aload           5
	//   11   18:astore          4
				if(i >= apair1.length)
					break;
	//   12   20:iload_3         
	//   13   21:aload           5
	//   14   23:arraylength     
	//   15   24:icmpge          47
				apair1[i] = Pair.create(((Object) (aview[i])), ((Object) (as[i])));
	//   16   27:aload           5
	//   17   29:iload_3         
	//   18   30:aload_1         
	//   19   31:iload_3         
	//   20   32:aaload          
	//   21   33:aload_2         
	//   22   34:iload_3         
	//   23   35:aaload          
	//   24   36:invokestatic    #43  <Method Pair Pair.create(Object, Object)>
	//   25   39:aastore         
				i++;
	//   26   40:iload_3         
	//   27   41:iconst_1        
	//   28   42:iadd            
	//   29   43:istore_3        
			} while(true);
	//   30   44:goto            16
		}
		return new ActivityOptionsCompat21(ActivityOptions.makeSceneTransitionAnimation(activity, apair));
	//   31   47:new             #2   <Class ActivityOptionsCompat21>
	//   32   50:dup             
	//   33   51:aload_0         
	//   34   52:aload           4
	//   35   54:invokestatic    #46  <Method ActivityOptions ActivityOptions.makeSceneTransitionAnimation(Activity, Pair[])>
	//   36   57:invokespecial   #26  <Method void ActivityOptionsCompat21(ActivityOptions)>
	//   37   60:areturn         
	}

	public static ActivityOptionsCompat21 makeTaskLaunchBehind()
	{
		return new ActivityOptionsCompat21(ActivityOptions.makeTaskLaunchBehind());
	//    0    0:new             #2   <Class ActivityOptionsCompat21>
	//    1    3:dup             
	//    2    4:invokestatic    #51  <Method ActivityOptions ActivityOptions.makeTaskLaunchBehind()>
	//    3    7:invokespecial   #26  <Method void ActivityOptionsCompat21(ActivityOptions)>
	//    4   10:areturn         
	}

	public static ActivityOptionsCompat21 makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int j)
	{
		return new ActivityOptionsCompat21(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, j));
	//    0    0:new             #2   <Class ActivityOptionsCompat21>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokestatic    #56  <Method ActivityOptions ActivityOptions.makeThumbnailScaleUpAnimation(View, Bitmap, int, int)>
	//    7   11:invokespecial   #26  <Method void ActivityOptionsCompat21(ActivityOptions)>
	//    8   14:areturn         
	}

	public Bundle toBundle()
	{
		return mActivityOptions.toBundle();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ActivityOptions mActivityOptions>
	//    2    4:invokevirtual   #60  <Method Bundle ActivityOptions.toBundle()>
	//    3    7:areturn         
	}

	public void update(ActivityOptionsCompat21 activityoptionscompat21)
	{
		mActivityOptions.update(activityoptionscompat21.mActivityOptions);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field ActivityOptions mActivityOptions>
	//    2    4:aload_1         
	//    3    5:getfield        #16  <Field ActivityOptions mActivityOptions>
	//    4    8:invokevirtual   #64  <Method void ActivityOptions.update(ActivityOptions)>
	//    5   11:return          
	}

	private final ActivityOptions mActivityOptions;
}
