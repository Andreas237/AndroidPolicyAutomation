// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.*;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.f.j;
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
		//    1    1:getfield        #14  <Field ActivityOptions mActivityOptions>
		//    2    4:invokevirtual   #21  <Method Bundle ActivityOptions.toBundle()>
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
		//    7   13:getfield        #14  <Field ActivityOptions mActivityOptions>
		//    8   16:aload_1         
		//    9   17:getfield        #14  <Field ActivityOptions mActivityOptions>
		//   10   20:invokevirtual   #25  <Method void ActivityOptions.update(ActivityOptions)>
			}
		//   11   23:return          
		}

		protected final ActivityOptions mActivityOptions;

		ActivityOptionsCompatApi16Impl(ActivityOptions activityoptions)
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

	private static class ActivityOptionsCompatApi23Impl extends ActivityOptionsCompatApi16Impl
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

		ActivityOptionsCompatApi23Impl(ActivityOptions activityoptions)
		{
			super(activityoptions);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void ActivityOptionsCompat$ActivityOptionsCompatApi16Impl(ActivityOptions)>
		//    3    5:return          
		}
	}

	private static class ActivityOptionsCompatApi24Impl extends ActivityOptionsCompatApi23Impl
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
			return ((ActivityOptionsCompat) (new ActivityOptionsCompatApi24Impl(mActivityOptions.setLaunchBounds(rect))));
		//    0    0:new             #2   <Class ActivityOptionsCompat$ActivityOptionsCompatApi24Impl>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field ActivityOptions mActivityOptions>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #27  <Method ActivityOptions ActivityOptions.setLaunchBounds(Rect)>
		//    6   12:invokespecial   #28  <Method void ActivityOptionsCompat$ActivityOptionsCompatApi24Impl(ActivityOptions)>
		//    7   15:areturn         
		}

		ActivityOptionsCompatApi24Impl(ActivityOptions activityoptions)
		{
			super(activityoptions);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void ActivityOptionsCompat$ActivityOptionsCompatApi23Impl(ActivityOptions)>
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
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          17
			return ((ActivityOptionsCompat) (new ActivityOptionsCompatApi24Impl(activityoptions)));
	//    3    8:new             #12  <Class ActivityOptionsCompat$ActivityOptionsCompatApi24Impl>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:invokespecial   #36  <Method void ActivityOptionsCompat$ActivityOptionsCompatApi24Impl(ActivityOptions)>
	//    7   16:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   8   17:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   20:bipush          23
	//*  10   22:icmplt          34
			return ((ActivityOptionsCompat) (new ActivityOptionsCompatApi23Impl(activityoptions)));
	//   11   25:new             #9   <Class ActivityOptionsCompat$ActivityOptionsCompatApi23Impl>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:invokespecial   #37  <Method void ActivityOptionsCompat$ActivityOptionsCompatApi23Impl(ActivityOptions)>
	//   15   33:areturn         
		else
			return ((ActivityOptionsCompat) (new ActivityOptionsCompatApi16Impl(activityoptions)));
	//   16   34:new             #6   <Class ActivityOptionsCompat$ActivityOptionsCompatApi16Impl>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokespecial   #38  <Method void ActivityOptionsCompat$ActivityOptionsCompatApi16Impl(ActivityOptions)>
	//   20   42:areturn         
	}

	public static ActivityOptionsCompat makeBasic()
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          15
			return createImpl(ActivityOptions.makeBasic());
	//    3    8:invokestatic    #45  <Method ActivityOptions ActivityOptions.makeBasic()>
	//    4   11:invokestatic    #47  <Method ActivityOptionsCompat createImpl(ActivityOptions)>
	//    5   14:areturn         
		else
			return new ActivityOptionsCompat();
	//    6   15:new             #2   <Class ActivityOptionsCompat>
	//    7   18:dup             
	//    8   19:invokespecial   #48  <Method void ActivityOptionsCompat()>
	//    9   22:areturn         
	}

	public static ActivityOptionsCompat makeClipRevealAnimation(View view, int i, int k, int l, int i1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          21
			return createImpl(ActivityOptions.makeClipRevealAnimation(view, i, k, l, i1));
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:iload           4
	//    8   14:invokestatic    #53  <Method ActivityOptions ActivityOptions.makeClipRevealAnimation(View, int, int, int, int)>
	//    9   17:invokestatic    #47  <Method ActivityOptionsCompat createImpl(ActivityOptions)>
	//   10   20:areturn         
		else
			return new ActivityOptionsCompat();
	//   11   21:new             #2   <Class ActivityOptionsCompat>
	//   12   24:dup             
	//   13   25:invokespecial   #48  <Method void ActivityOptionsCompat()>
	//   14   28:areturn         
	}

	public static ActivityOptionsCompat makeCustomAnimation(Context context, int i, int k)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          18
			return createImpl(ActivityOptions.makeCustomAnimation(context, i, k));
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:invokestatic    #58  <Method ActivityOptions ActivityOptions.makeCustomAnimation(Context, int, int)>
	//    7   14:invokestatic    #47  <Method ActivityOptionsCompat createImpl(ActivityOptions)>
	//    8   17:areturn         
		else
			return new ActivityOptionsCompat();
	//    9   18:new             #2   <Class ActivityOptionsCompat>
	//   10   21:dup             
	//   11   22:invokespecial   #48  <Method void ActivityOptionsCompat()>
	//   12   25:areturn         
	}

	public static ActivityOptionsCompat makeScaleUpAnimation(View view, int i, int k, int l, int i1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          21
			return createImpl(ActivityOptions.makeScaleUpAnimation(view, i, k, l, i1));
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:iload           4
	//    8   14:invokestatic    #61  <Method ActivityOptions ActivityOptions.makeScaleUpAnimation(View, int, int, int, int)>
	//    9   17:invokestatic    #47  <Method ActivityOptionsCompat createImpl(ActivityOptions)>
	//   10   20:areturn         
		else
			return new ActivityOptionsCompat();
	//   11   21:new             #2   <Class ActivityOptionsCompat>
	//   12   24:dup             
	//   13   25:invokespecial   #48  <Method void ActivityOptionsCompat()>
	//   14   28:areturn         
	}

	public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, View view, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          18
			return createImpl(ActivityOptions.makeSceneTransitionAnimation(activity, view, s));
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:invokestatic    #66  <Method ActivityOptions ActivityOptions.makeSceneTransitionAnimation(Activity, View, String)>
	//    7   14:invokestatic    #47  <Method ActivityOptionsCompat createImpl(ActivityOptions)>
	//    8   17:areturn         
		else
			return new ActivityOptionsCompat();
	//    9   18:new             #2   <Class ActivityOptionsCompat>
	//   10   21:dup             
	//   11   22:invokespecial   #48  <Method void ActivityOptionsCompat()>
	//   12   25:areturn         
	}

	public static transient ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, j aj[])
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          67
		{
			Pair apair[] = null;
	//    3    8:aconst_null     
	//    4    9:astore_3        
			if(aj != null)
	//*   5   10:aload_1         
	//*   6   11:ifnull          58
			{
				Pair apair1[] = new Pair[aj.length];
	//    7   14:aload_1         
	//    8   15:arraylength     
	//    9   16:anewarray       Pair[]
	//   10   19:astore          4
				int i = 0;
	//   11   21:iconst_0        
	//   12   22:istore_2        
				do
				{
					apair = apair1;
	//   13   23:aload           4
	//   14   25:astore_3        
					if(i >= aj.length)
						break;
	//   15   26:iload_2         
	//   16   27:aload_1         
	//   17   28:arraylength     
	//   18   29:icmpge          58
					apair1[i] = Pair.create(aj[i].a, aj[i].b);
	//   19   32:aload           4
	//   20   34:iload_2         
	//   21   35:aload_1         
	//   22   36:iload_2         
	//   23   37:aaload          
	//   24   38:getfield        #75  <Field Object j.a>
	//   25   41:aload_1         
	//   26   42:iload_2         
	//   27   43:aaload          
	//   28   44:getfield        #78  <Field Object j.b>
	//   29   47:invokestatic    #82  <Method Pair Pair.create(Object, Object)>
	//   30   50:aastore         
					i++;
	//   31   51:iload_2         
	//   32   52:iconst_1        
	//   33   53:iadd            
	//   34   54:istore_2        
				} while(true);
	//   35   55:goto            23
			}
			return createImpl(ActivityOptions.makeSceneTransitionAnimation(activity, apair));
	//   36   58:aload_0         
	//   37   59:aload_3         
	//   38   60:invokestatic    #85  <Method ActivityOptions ActivityOptions.makeSceneTransitionAnimation(Activity, Pair[])>
	//   39   63:invokestatic    #47  <Method ActivityOptionsCompat createImpl(ActivityOptions)>
	//   40   66:areturn         
		} else
		{
			return new ActivityOptionsCompat();
	//   41   67:new             #2   <Class ActivityOptionsCompat>
	//   42   70:dup             
	//   43   71:invokespecial   #48  <Method void ActivityOptionsCompat()>
	//   44   74:areturn         
		}
	}

	public static ActivityOptionsCompat makeTaskLaunchBehind()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          15
			return createImpl(ActivityOptions.makeTaskLaunchBehind());
	//    3    8:invokestatic    #90  <Method ActivityOptions ActivityOptions.makeTaskLaunchBehind()>
	//    4   11:invokestatic    #47  <Method ActivityOptionsCompat createImpl(ActivityOptions)>
	//    5   14:areturn         
		else
			return new ActivityOptionsCompat();
	//    6   15:new             #2   <Class ActivityOptionsCompat>
	//    7   18:dup             
	//    8   19:invokespecial   #48  <Method void ActivityOptionsCompat()>
	//    9   22:areturn         
	}

	public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int k)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          19
			return createImpl(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, k));
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:invokestatic    #95  <Method ActivityOptions ActivityOptions.makeThumbnailScaleUpAnimation(View, Bitmap, int, int)>
	//    8   15:invokestatic    #47  <Method ActivityOptionsCompat createImpl(ActivityOptions)>
	//    9   18:areturn         
		else
			return new ActivityOptionsCompat();
	//   10   19:new             #2   <Class ActivityOptionsCompat>
	//   11   22:dup             
	//   12   23:invokespecial   #48  <Method void ActivityOptionsCompat()>
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
