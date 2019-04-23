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
	private static class ActivityOptionsCompatImpl extends ActivityOptionsCompat
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
				return ((ActivityOptionsCompat) (new ActivityOptionsCompatImpl(mActivityOptions.setLaunchBounds(rect))));
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
			if(activityoptionscompat instanceof ActivityOptionsCompatImpl)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class ActivityOptionsCompat$ActivityOptionsCompatImpl>
		//*   2    4:ifeq            23
			{
				activityoptionscompat = ((ActivityOptionsCompat) ((ActivityOptionsCompatImpl)activityoptionscompat));
		//    3    7:aload_1         
		//    4    8:checkcast       #2   <Class ActivityOptionsCompat$ActivityOptionsCompatImpl>
		//    5   11:astore_1        
				mActivityOptions.update(((ActivityOptionsCompatImpl) (activityoptionscompat)).mActivityOptions);
		//    6   12:aload_0         
		//    7   13:getfield        #17  <Field ActivityOptions mActivityOptions>
		//    8   16:aload_1         
		//    9   17:getfield        #17  <Field ActivityOptions mActivityOptions>
		//   10   20:invokevirtual   #51  <Method void ActivityOptions.update(ActivityOptions)>
			}
		//   11   23:return          
		}

		private final ActivityOptions mActivityOptions;

		ActivityOptionsCompatImpl(ActivityOptions activityoptions)
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


	protected ActivityOptionsCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static ActivityOptionsCompat makeBasic()
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          19
			return ((ActivityOptionsCompat) (new ActivityOptionsCompatImpl(ActivityOptions.makeBasic())));
	//    3    8:new             #6   <Class ActivityOptionsCompat$ActivityOptionsCompatImpl>
	//    4   11:dup             
	//    5   12:invokestatic    #33  <Method ActivityOptions ActivityOptions.makeBasic()>
	//    6   15:invokespecial   #36  <Method void ActivityOptionsCompat$ActivityOptionsCompatImpl(ActivityOptions)>
	//    7   18:areturn         
		else
			return new ActivityOptionsCompat();
	//    8   19:new             #2   <Class ActivityOptionsCompat>
	//    9   22:dup             
	//   10   23:invokespecial   #37  <Method void ActivityOptionsCompat()>
	//   11   26:areturn         
	}

	public static ActivityOptionsCompat makeClipRevealAnimation(View view, int i, int j, int k, int l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          25
			return ((ActivityOptionsCompat) (new ActivityOptionsCompatImpl(ActivityOptions.makeClipRevealAnimation(view, i, j, k, l))));
	//    3    8:new             #6   <Class ActivityOptionsCompat$ActivityOptionsCompatImpl>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:iload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:iload           4
	//   10   18:invokestatic    #43  <Method ActivityOptions ActivityOptions.makeClipRevealAnimation(View, int, int, int, int)>
	//   11   21:invokespecial   #36  <Method void ActivityOptionsCompat$ActivityOptionsCompatImpl(ActivityOptions)>
	//   12   24:areturn         
		else
			return new ActivityOptionsCompat();
	//   13   25:new             #2   <Class ActivityOptionsCompat>
	//   14   28:dup             
	//   15   29:invokespecial   #37  <Method void ActivityOptionsCompat()>
	//   16   32:areturn         
	}

	public static ActivityOptionsCompat makeCustomAnimation(Context context, int i, int j)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          22
			return ((ActivityOptionsCompat) (new ActivityOptionsCompatImpl(ActivityOptions.makeCustomAnimation(context, i, j))));
	//    3    8:new             #6   <Class ActivityOptionsCompat$ActivityOptionsCompatImpl>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:iload_1         
	//    7   14:iload_2         
	//    8   15:invokestatic    #49  <Method ActivityOptions ActivityOptions.makeCustomAnimation(Context, int, int)>
	//    9   18:invokespecial   #36  <Method void ActivityOptionsCompat$ActivityOptionsCompatImpl(ActivityOptions)>
	//   10   21:areturn         
		else
			return new ActivityOptionsCompat();
	//   11   22:new             #2   <Class ActivityOptionsCompat>
	//   12   25:dup             
	//   13   26:invokespecial   #37  <Method void ActivityOptionsCompat()>
	//   14   29:areturn         
	}

	public static ActivityOptionsCompat makeScaleUpAnimation(View view, int i, int j, int k, int l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          25
			return ((ActivityOptionsCompat) (new ActivityOptionsCompatImpl(ActivityOptions.makeScaleUpAnimation(view, i, j, k, l))));
	//    3    8:new             #6   <Class ActivityOptionsCompat$ActivityOptionsCompatImpl>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:iload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:iload           4
	//   10   18:invokestatic    #52  <Method ActivityOptions ActivityOptions.makeScaleUpAnimation(View, int, int, int, int)>
	//   11   21:invokespecial   #36  <Method void ActivityOptionsCompat$ActivityOptionsCompatImpl(ActivityOptions)>
	//   12   24:areturn         
		else
			return new ActivityOptionsCompat();
	//   13   25:new             #2   <Class ActivityOptionsCompat>
	//   14   28:dup             
	//   15   29:invokespecial   #37  <Method void ActivityOptionsCompat()>
	//   16   32:areturn         
	}

	public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, View view, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          22
			return ((ActivityOptionsCompat) (new ActivityOptionsCompatImpl(ActivityOptions.makeSceneTransitionAnimation(activity, view, s))));
	//    3    8:new             #6   <Class ActivityOptionsCompat$ActivityOptionsCompatImpl>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:aload_2         
	//    8   15:invokestatic    #57  <Method ActivityOptions ActivityOptions.makeSceneTransitionAnimation(Activity, View, String)>
	//    9   18:invokespecial   #36  <Method void ActivityOptionsCompat$ActivityOptionsCompatImpl(ActivityOptions)>
	//   10   21:areturn         
		else
			return new ActivityOptionsCompat();
	//   11   22:new             #2   <Class ActivityOptionsCompat>
	//   12   25:dup             
	//   13   26:invokespecial   #37  <Method void ActivityOptionsCompat()>
	//   14   29:areturn         
	}

	public static transient ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, android.support.v4.util.Pair apair[])
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          71
		{
			Pair apair1[] = null;
	//    3    8:aconst_null     
	//    4    9:astore_3        
			if(apair != null)
	//*   5   10:aload_1         
	//*   6   11:ifnull          58
			{
				Pair apair2[] = new Pair[apair.length];
	//    7   14:aload_1         
	//    8   15:arraylength     
	//    9   16:anewarray       Pair[]
	//   10   19:astore          4
				int i = 0;
	//   11   21:iconst_0        
	//   12   22:istore_2        
				do
				{
					apair1 = apair2;
	//   13   23:aload           4
	//   14   25:astore_3        
					if(i >= apair.length)
						break;
	//   15   26:iload_2         
	//   16   27:aload_1         
	//   17   28:arraylength     
	//   18   29:icmpge          58
					apair2[i] = Pair.create(apair[i].first, apair[i].second);
	//   19   32:aload           4
	//   20   34:iload_2         
	//   21   35:aload_1         
	//   22   36:iload_2         
	//   23   37:aaload          
	//   24   38:getfield        #66  <Field Object android.support.v4.util.Pair.first>
	//   25   41:aload_1         
	//   26   42:iload_2         
	//   27   43:aaload          
	//   28   44:getfield        #69  <Field Object android.support.v4.util.Pair.second>
	//   29   47:invokestatic    #73  <Method Pair Pair.create(Object, Object)>
	//   30   50:aastore         
					i++;
	//   31   51:iload_2         
	//   32   52:iconst_1        
	//   33   53:iadd            
	//   34   54:istore_2        
				} while(true);
	//   35   55:goto            23
			}
			return ((ActivityOptionsCompat) (new ActivityOptionsCompatImpl(ActivityOptions.makeSceneTransitionAnimation(activity, apair1))));
	//   36   58:new             #6   <Class ActivityOptionsCompat$ActivityOptionsCompatImpl>
	//   37   61:dup             
	//   38   62:aload_0         
	//   39   63:aload_3         
	//   40   64:invokestatic    #76  <Method ActivityOptions ActivityOptions.makeSceneTransitionAnimation(Activity, Pair[])>
	//   41   67:invokespecial   #36  <Method void ActivityOptionsCompat$ActivityOptionsCompatImpl(ActivityOptions)>
	//   42   70:areturn         
		} else
		{
			return new ActivityOptionsCompat();
	//   43   71:new             #2   <Class ActivityOptionsCompat>
	//   44   74:dup             
	//   45   75:invokespecial   #37  <Method void ActivityOptionsCompat()>
	//   46   78:areturn         
		}
	}

	public static ActivityOptionsCompat makeTaskLaunchBehind()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return ((ActivityOptionsCompat) (new ActivityOptionsCompatImpl(ActivityOptions.makeTaskLaunchBehind())));
	//    3    8:new             #6   <Class ActivityOptionsCompat$ActivityOptionsCompatImpl>
	//    4   11:dup             
	//    5   12:invokestatic    #81  <Method ActivityOptions ActivityOptions.makeTaskLaunchBehind()>
	//    6   15:invokespecial   #36  <Method void ActivityOptionsCompat$ActivityOptionsCompatImpl(ActivityOptions)>
	//    7   18:areturn         
		else
			return new ActivityOptionsCompat();
	//    8   19:new             #2   <Class ActivityOptionsCompat>
	//    9   22:dup             
	//   10   23:invokespecial   #37  <Method void ActivityOptionsCompat()>
	//   11   26:areturn         
	}

	public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int j)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          23
			return ((ActivityOptionsCompat) (new ActivityOptionsCompatImpl(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i, j))));
	//    3    8:new             #6   <Class ActivityOptionsCompat$ActivityOptionsCompatImpl>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:invokestatic    #86  <Method ActivityOptions ActivityOptions.makeThumbnailScaleUpAnimation(View, Bitmap, int, int)>
	//   10   19:invokespecial   #36  <Method void ActivityOptionsCompat$ActivityOptionsCompatImpl(ActivityOptions)>
	//   11   22:areturn         
		else
			return new ActivityOptionsCompat();
	//   12   23:new             #2   <Class ActivityOptionsCompat>
	//   13   26:dup             
	//   14   27:invokespecial   #37  <Method void ActivityOptionsCompat()>
	//   15   30:areturn         
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
		return this;
	//    0    0:aload_0         
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
