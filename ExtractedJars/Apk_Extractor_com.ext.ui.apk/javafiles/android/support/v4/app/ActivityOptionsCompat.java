// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

public class ActivityOptionsCompat
{
	private static class ActivityOptionsCompatApi16Impl extends ActivityOptionsCompat
	{

		public Bundle toBundle()
		{
			return mActivityOptions.toBundle();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ActivityOptions mActivityOptions>
		//    2    4:invokevirtual   #24  <Method Bundle ActivityOptions.toBundle()>
		//    3    7:areturn         
		}

		public void update(ActivityOptionsCompat activityoptionscompat)
		{
			if(activityoptionscompat instanceof ActivityOptionsCompatApi16Impl)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class ActivityOptionsCompat$ActivityOptionsCompatApi16Impl>
		//*   2    4:ifeq            23
			{
				activityoptionscompat = ((ActivityOptionsCompat) ((ActivityOptionsCompatApi16Impl)activityoptionscompat));
		//    3    7:aload_1         
		//    4    8:checkcast       #2   <Class ActivityOptionsCompat$ActivityOptionsCompatApi16Impl>
		//    5   11:astore_1        
				mActivityOptions.update(((ActivityOptionsCompatApi16Impl) (activityoptionscompat)).mActivityOptions);
		//    6   12:aload_0         
		//    7   13:getfield        #17  <Field ActivityOptions mActivityOptions>
		//    8   16:aload_1         
		//    9   17:getfield        #17  <Field ActivityOptions mActivityOptions>
		//   10   20:invokevirtual   #28  <Method void ActivityOptions.update(ActivityOptions)>
			}
		//   11   23:return          
		}

		protected final ActivityOptions mActivityOptions;

		ActivityOptionsCompatApi16Impl(ActivityOptions activityoptions)
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

	private static class ActivityOptionsCompatApi23Impl extends ActivityOptionsCompatApi16Impl
	{

		public void requestUsageTimeReport(PendingIntent pendingintent)
		{
			mActivityOptions.requestUsageTimeReport(pendingintent);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field ActivityOptions mActivityOptions>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #25  <Method void ActivityOptions.requestUsageTimeReport(PendingIntent)>
		//    4    8:return          
		}

		ActivityOptionsCompatApi23Impl(ActivityOptions activityoptions)
		{
			super(activityoptions);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void ActivityOptionsCompat$ActivityOptionsCompatApi16Impl(ActivityOptions)>
		//    3    5:return          
		}
	}

	private static class ActivityOptionsCompatApi24Impl extends ActivityOptionsCompatApi23Impl
	{

		public Rect getLaunchBounds()
		{
			return mActivityOptions.getLaunchBounds();
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field ActivityOptions mActivityOptions>
		//    2    4:invokevirtual   #25  <Method Rect ActivityOptions.getLaunchBounds()>
		//    3    7:areturn         
		}

		public ActivityOptionsCompat setLaunchBounds(Rect rect)
		{
			return ((ActivityOptionsCompat) (new ActivityOptionsCompatApi24Impl(mActivityOptions.setLaunchBounds(rect))));
		//    0    0:new             #2   <Class ActivityOptionsCompat$ActivityOptionsCompatApi24Impl>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #21  <Field ActivityOptions mActivityOptions>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #31  <Method ActivityOptions ActivityOptions.setLaunchBounds(Rect)>
		//    6   12:invokespecial   #32  <Method void ActivityOptionsCompat$ActivityOptionsCompatApi24Impl(ActivityOptions)>
		//    7   15:areturn         
		}

		ActivityOptionsCompatApi24Impl(ActivityOptions activityoptions)
		{
			super(activityoptions);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void ActivityOptionsCompat$ActivityOptionsCompatApi23Impl(ActivityOptions)>
		//    3    5:return          
		}
	}


	protected ActivityOptionsCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	private static ActivityOptionsCompat createImpl(ActivityOptions activityoptions)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          17
			return ((ActivityOptionsCompat) (new ActivityOptionsCompatApi24Impl(activityoptions)));
	//    3    8:new             #12  <Class ActivityOptionsCompat$ActivityOptionsCompatApi24Impl>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:invokespecial   #39  <Method void ActivityOptionsCompat$ActivityOptionsCompatApi24Impl(ActivityOptions)>
	//    7   16:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   8   17:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   20:bipush          23
	//*  10   22:icmplt          34
			return ((ActivityOptionsCompat) (new ActivityOptionsCompatApi23Impl(activityoptions)));
	//   11   25:new             #9   <Class ActivityOptionsCompat$ActivityOptionsCompatApi23Impl>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:invokespecial   #40  <Method void ActivityOptionsCompat$ActivityOptionsCompatApi23Impl(ActivityOptions)>
	//   15   33:areturn         
		else
			return ((ActivityOptionsCompat) (new ActivityOptionsCompatApi16Impl(activityoptions)));
	//   16   34:new             #6   <Class ActivityOptionsCompat$ActivityOptionsCompatApi16Impl>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #41  <Method void ActivityOptionsCompat$ActivityOptionsCompatApi16Impl(ActivityOptions)>
	//   20   42:areturn         
	}

	public static ActivityOptionsCompat makeBasic()
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          15
			return createImpl(ActivityOptions.makeBasic());
	//    3    8:invokestatic    #49  <Method ActivityOptions ActivityOptions.makeBasic()>
	//    4   11:invokestatic    #51  <Method ActivityOptionsCompat createImpl(ActivityOptions)>
	//    5   14:areturn         
		else
			return new ActivityOptionsCompat();
	//    6   15:new             #2   <Class ActivityOptionsCompat>
	//    7   18:dup             
	//    8   19:invokespecial   #52  <Method void ActivityOptionsCompat()>
	//    9   22:areturn         
	}

	public static ActivityOptionsCompat makeClipRevealAnimation(View view, int i, int j, int k, int l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          21
			return createImpl(ActivityOptions.makeClipRevealAnimation(view, i, j, k, l));
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:iload           4
	//    8   14:invokestatic    #57  <Method ActivityOptions ActivityOptions.makeClipRevealAnimation(View, int, int, int, int)>
	//    9   17:invokestatic    #51  <Method ActivityOptionsCompat createImpl(ActivityOptions)>
	//   10   20:areturn         
		else
			return new ActivityOptionsCompat();
	//   11   21:new             #2   <Class ActivityOptionsCompat>
	//   12   24:dup             
	//   13   25:invokespecial   #52  <Method void ActivityOptionsCompat()>
	//   14   28:areturn         
	}

	public static ActivityOptionsCompat makeCustomAnimation(Context context, int i, int j)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          18
			return createImpl(ActivityOptions.makeCustomAnimation(context, i, j));
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:invokestatic    #62  <Method ActivityOptions ActivityOptions.makeCustomAnimation(Context, int, int)>
	//    7   14:invokestatic    #51  <Method ActivityOptionsCompat createImpl(ActivityOptions)>
	//    8   17:areturn         
		else
			return new ActivityOptionsCompat();
	//    9   18:new             #2   <Class ActivityOptionsCompat>
	//   10   21:dup             
	//   11   22:invokespecial   #52  <Method void ActivityOptionsCompat()>
	//   12   25:areturn         
	}

	public static ActivityOptionsCompat makeScaleUpAnimation(View view, int i, int j, int k, int l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          21
			return createImpl(ActivityOptions.makeScaleUpAnimation(view, i, j, k, l));
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:iload           4
	//    8   14:invokestatic    #65  <Method ActivityOptions ActivityOptions.makeScaleUpAnimation(View, int, int, int, int)>
	//    9   17:invokestatic    #51  <Method ActivityOptionsCompat createImpl(ActivityOptions)>
	//   10   20:areturn         
		else
			return new ActivityOptionsCompat();
	//   11   21:new             #2   <Class ActivityOptionsCompat>
	//   12   24:dup             
	//   13   25:invokespecial   #52  <Method void ActivityOptionsCompat()>
	//   14   28:areturn         
	}

	public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, View view, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          18
			return createImpl(ActivityOptions.makeSceneTransitionAnimation(activity, view, s));
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:invokestatic    #70  <Method ActivityOptions ActivityOptions.makeSceneTransitionAnimation(Activity, View, String)>
	//    7   14:invokestatic    #51  <Method ActivityOptionsCompat createImpl(ActivityOptions)>
	//    8   17:areturn         
		else
			return new ActivityOptionsCompat();
	//    9   18:new             #2   <Class ActivityOptionsCompat>
	//   10   21:dup             
	//   11   22:invokespecial   #52  <Method void ActivityOptionsCompat()>
	//   12   25:areturn         
	}

	public static transient ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, android.support.v4.util.Pair apair[])
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          62
		{
			Pair apair1[] = null;
	//    3    8:aconst_null     
	//    4    9:astore_3        
			if(apair != null)
	//*   5   10:aload_1         
	//*   6   11:ifnull          53
			{
				apair1 = new Pair[apair.length];
	//    7   14:aload_1         
	//    8   15:arraylength     
	//    9   16:anewarray       Pair[]
	//   10   19:astore_3        
				for(int i = 0; i < apair.length; i++)
	//*  11   20:iconst_0        
	//*  12   21:istore_2        
	//*  13   22:iload_2         
	//*  14   23:aload_1         
	//*  15   24:arraylength     
	//*  16   25:icmpge          53
					apair1[i] = Pair.create(apair[i].first, apair[i].second);
	//   17   28:aload_3         
	//   18   29:iload_2         
	//   19   30:aload_1         
	//   20   31:iload_2         
	//   21   32:aaload          
	//   22   33:getfield        #79  <Field Object android.support.v4.util.Pair.first>
	//   23   36:aload_1         
	//   24   37:iload_2         
	//   25   38:aaload          
	//   26   39:getfield        #82  <Field Object android.support.v4.util.Pair.second>
	//   27   42:invokestatic    #86  <Method Pair Pair.create(Object, Object)>
	//   28   45:aastore         

	//   29   46:iload_2         
	//   30   47:iconst_1        
	//   31   48:iadd            
	//   32   49:istore_2        
			}
	//*  33   50:goto            22
			return createImpl(ActivityOptions.makeSceneTransitionAnimation(activity, apair1));
	//   34   53:aload_0         
	//   35   54:aload_3         
	//   36   55:invokestatic    #89  <Method ActivityOptions ActivityOptions.makeSceneTransitionAnimation(Activity, Pair[])>
	//   37   58:invokestatic    #51  <Method ActivityOptionsCompat createImpl(ActivityOptions)>
	//   38   61:areturn         
		} else
		{
			return new ActivityOptionsCompat();
	//   39   62:new             #2   <Class ActivityOptionsCompat>
	//   40   65:dup             
	//   41   66:invokespecial   #52  <Method void ActivityOptionsCompat()>
	//   42   69:areturn         
		}
	}

	public static ActivityOptionsCompat makeTaskLaunchBehind()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          15
			return createImpl(ActivityOptions.makeTaskLaunchBehind());
	//    3    8:invokestatic    #94  <Method ActivityOptions ActivityOptions.makeTaskLaunchBehind()>
	//    4   11:invokestatic    #51  <Method ActivityOptionsCompat createImpl(ActivityOptions)>
	//    5   14:areturn         
		else
			return new ActivityOptionsCompat();
	//    6   15:new             #2   <Class ActivityOptionsCompat>
	//    7   18:dup             
	//    8   19:invokespecial   #52  <Method void ActivityOptionsCompat()>
	//    9   22:areturn         
	}

	public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int j)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          19
			return createImpl(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, j));
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:invokestatic    #99  <Method ActivityOptions ActivityOptions.makeThumbnailScaleUpAnimation(View, Bitmap, int, int)>
	//    8   15:invokestatic    #51  <Method ActivityOptionsCompat createImpl(ActivityOptions)>
	//    9   18:areturn         
		else
			return new ActivityOptionsCompat();
	//   10   19:new             #2   <Class ActivityOptionsCompat>
	//   11   22:dup             
	//   12   23:invokespecial   #52  <Method void ActivityOptionsCompat()>
	//   13   26:areturn         
	}

	public Rect getLaunchBounds()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void requestUsageTimeReport(PendingIntent pendingintent)
	{
	//    0    0:return          
	}

	public ActivityOptionsCompat setLaunchBounds(Rect rect)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Bundle toBundle()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void update(ActivityOptionsCompat activityoptionscompat)
	{
	//    0    0:return          
	}

	public static final String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
	public static final String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";
}
