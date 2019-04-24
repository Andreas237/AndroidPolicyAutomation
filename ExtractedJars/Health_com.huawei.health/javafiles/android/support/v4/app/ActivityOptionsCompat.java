// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.view.View;

// Referenced classes of package android.support.v4.app:
//			ActivityOptionsCompat24, ActivityOptionsCompat23, ActivityOptionsCompat21, ActivityOptionsCompatJB

public class ActivityOptionsCompat
{
	static class ActivityOptionsImpl21 extends ActivityOptionsCompat
	{

		public Bundle toBundle()
		{
			return mImpl.toBundle();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ActivityOptionsCompat21 mImpl>
		//    2    4:invokevirtual   #24  <Method Bundle ActivityOptionsCompat21.toBundle()>
		//    3    7:areturn         
		}

		public void update(ActivityOptionsCompat activityoptionscompat)
		{
			if(activityoptionscompat instanceof ActivityOptionsImpl21)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class ActivityOptionsCompat$ActivityOptionsImpl21>
		//*   2    4:ifeq            23
			{
				activityoptionscompat = ((ActivityOptionsCompat) ((ActivityOptionsImpl21)activityoptionscompat));
		//    3    7:aload_1         
		//    4    8:checkcast       #2   <Class ActivityOptionsCompat$ActivityOptionsImpl21>
		//    5   11:astore_1        
				mImpl.update(((ActivityOptionsImpl21) (activityoptionscompat)).mImpl);
		//    6   12:aload_0         
		//    7   13:getfield        #17  <Field ActivityOptionsCompat21 mImpl>
		//    8   16:aload_1         
		//    9   17:getfield        #17  <Field ActivityOptionsCompat21 mImpl>
		//   10   20:invokevirtual   #28  <Method void ActivityOptionsCompat21.update(ActivityOptionsCompat21)>
			}
		//   11   23:return          
		}

		private final ActivityOptionsCompat21 mImpl;

		ActivityOptionsImpl21(ActivityOptionsCompat21 activityoptionscompat21)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void ActivityOptionsCompat()>
			mImpl = activityoptionscompat21;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #17  <Field ActivityOptionsCompat21 mImpl>
		//    5    9:return          
		}
	}

	static class ActivityOptionsImpl23 extends ActivityOptionsCompat
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
			if(activityoptionscompat instanceof ActivityOptionsImpl23)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class ActivityOptionsCompat$ActivityOptionsImpl23>
		//*   2    4:ifeq            23
			{
				activityoptionscompat = ((ActivityOptionsCompat) ((ActivityOptionsImpl23)activityoptionscompat));
		//    3    7:aload_1         
		//    4    8:checkcast       #2   <Class ActivityOptionsCompat$ActivityOptionsImpl23>
		//    5   11:astore_1        
				mImpl.update(((ActivityOptionsImpl23) (activityoptionscompat)).mImpl);
		//    6   12:aload_0         
		//    7   13:getfield        #17  <Field ActivityOptionsCompat23 mImpl>
		//    8   16:aload_1         
		//    9   17:getfield        #17  <Field ActivityOptionsCompat23 mImpl>
		//   10   20:invokevirtual   #32  <Method void ActivityOptionsCompat23.update(ActivityOptionsCompat23)>
			}
		//   11   23:return          
		}

		private final ActivityOptionsCompat23 mImpl;

		ActivityOptionsImpl23(ActivityOptionsCompat23 activityoptionscompat23)
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

	static class ActivityOptionsImpl24 extends ActivityOptionsCompat
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
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl24(mImpl.setLaunchBounds(rect))));
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
			if(activityoptionscompat instanceof ActivityOptionsImpl24)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class ActivityOptionsCompat$ActivityOptionsImpl24>
		//*   2    4:ifeq            23
			{
				activityoptionscompat = ((ActivityOptionsCompat) ((ActivityOptionsImpl24)activityoptionscompat));
		//    3    7:aload_1         
		//    4    8:checkcast       #2   <Class ActivityOptionsCompat$ActivityOptionsImpl24>
		//    5   11:astore_1        
				mImpl.update(((ActivityOptionsImpl24) (activityoptionscompat)).mImpl);
		//    6   12:aload_0         
		//    7   13:getfield        #17  <Field ActivityOptionsCompat24 mImpl>
		//    8   16:aload_1         
		//    9   17:getfield        #17  <Field ActivityOptionsCompat24 mImpl>
		//   10   20:invokevirtual   #45  <Method void ActivityOptionsCompat24.update(ActivityOptionsCompat24)>
			}
		//   11   23:return          
		}

		private final ActivityOptionsCompat24 mImpl;

		ActivityOptionsImpl24(ActivityOptionsCompat24 activityoptionscompat24)
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

	static class ActivityOptionsImplJB extends ActivityOptionsCompat
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
			if(activityoptionscompat instanceof ActivityOptionsImplJB)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #2   <Class ActivityOptionsCompat$ActivityOptionsImplJB>
		//*   2    4:ifeq            23
			{
				activityoptionscompat = ((ActivityOptionsCompat) ((ActivityOptionsImplJB)activityoptionscompat));
		//    3    7:aload_1         
		//    4    8:checkcast       #2   <Class ActivityOptionsCompat$ActivityOptionsImplJB>
		//    5   11:astore_1        
				mImpl.update(((ActivityOptionsImplJB) (activityoptionscompat)).mImpl);
		//    6   12:aload_0         
		//    7   13:getfield        #17  <Field ActivityOptionsCompatJB mImpl>
		//    8   16:aload_1         
		//    9   17:getfield        #17  <Field ActivityOptionsCompatJB mImpl>
		//   10   20:invokevirtual   #28  <Method void ActivityOptionsCompatJB.update(ActivityOptionsCompatJB)>
			}
		//   11   23:return          
		}

		private final ActivityOptionsCompatJB mImpl;

		ActivityOptionsImplJB(ActivityOptionsCompatJB activityoptionscompatjb)
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


	protected ActivityOptionsCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}

	public static ActivityOptionsCompat makeBasic()
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          19
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl24(ActivityOptionsCompat24.makeBasic())));
	//    3    8:new             #12  <Class ActivityOptionsCompat$ActivityOptionsImpl24>
	//    4   11:dup             
	//    5   12:invokestatic    #41  <Method ActivityOptionsCompat24 ActivityOptionsCompat24.makeBasic()>
	//    6   15:invokespecial   #44  <Method void ActivityOptionsCompat$ActivityOptionsImpl24(ActivityOptionsCompat24)>
	//    7   18:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   8   19:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          23
	//*  10   24:icmplt          38
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl23(ActivityOptionsCompat23.makeBasic())));
	//   11   27:new             #9   <Class ActivityOptionsCompat$ActivityOptionsImpl23>
	//   12   30:dup             
	//   13   31:invokestatic    #49  <Method ActivityOptionsCompat23 ActivityOptionsCompat23.makeBasic()>
	//   14   34:invokespecial   #52  <Method void ActivityOptionsCompat$ActivityOptionsImpl23(ActivityOptionsCompat23)>
	//   15   37:areturn         
		else
			return new ActivityOptionsCompat();
	//   16   38:new             #2   <Class ActivityOptionsCompat>
	//   17   41:dup             
	//   18   42:invokespecial   #53  <Method void ActivityOptionsCompat()>
	//   19   45:areturn         
	}

	public static ActivityOptionsCompat makeClipRevealAnimation(View view, int i, int j, int k, int l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          25
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl24(ActivityOptionsCompat24.makeClipRevealAnimation(view, i, j, k, l))));
	//    3    8:new             #12  <Class ActivityOptionsCompat$ActivityOptionsImpl24>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:iload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:iload           4
	//   10   18:invokestatic    #58  <Method ActivityOptionsCompat24 ActivityOptionsCompat24.makeClipRevealAnimation(View, int, int, int, int)>
	//   11   21:invokespecial   #44  <Method void ActivityOptionsCompat$ActivityOptionsImpl24(ActivityOptionsCompat24)>
	//   12   24:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  13   25:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   28:bipush          23
	//*  15   30:icmplt          50
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl23(ActivityOptionsCompat23.makeClipRevealAnimation(view, i, j, k, l))));
	//   16   33:new             #9   <Class ActivityOptionsCompat$ActivityOptionsImpl23>
	//   17   36:dup             
	//   18   37:aload_0         
	//   19   38:iload_1         
	//   20   39:iload_2         
	//   21   40:iload_3         
	//   22   41:iload           4
	//   23   43:invokestatic    #61  <Method ActivityOptionsCompat23 ActivityOptionsCompat23.makeClipRevealAnimation(View, int, int, int, int)>
	//   24   46:invokespecial   #52  <Method void ActivityOptionsCompat$ActivityOptionsImpl23(ActivityOptionsCompat23)>
	//   25   49:areturn         
		else
			return new ActivityOptionsCompat();
	//   26   50:new             #2   <Class ActivityOptionsCompat>
	//   27   53:dup             
	//   28   54:invokespecial   #53  <Method void ActivityOptionsCompat()>
	//   29   57:areturn         
	}

	public static ActivityOptionsCompat makeCustomAnimation(Context context, int i, int j)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          22
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl24(ActivityOptionsCompat24.makeCustomAnimation(context, i, j))));
	//    3    8:new             #12  <Class ActivityOptionsCompat$ActivityOptionsImpl24>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:iload_1         
	//    7   14:iload_2         
	//    8   15:invokestatic    #66  <Method ActivityOptionsCompat24 ActivityOptionsCompat24.makeCustomAnimation(Context, int, int)>
	//    9   18:invokespecial   #44  <Method void ActivityOptionsCompat$ActivityOptionsImpl24(ActivityOptionsCompat24)>
	//   10   21:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  11   22:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   25:bipush          23
	//*  13   27:icmplt          44
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl23(ActivityOptionsCompat23.makeCustomAnimation(context, i, j))));
	//   14   30:new             #9   <Class ActivityOptionsCompat$ActivityOptionsImpl23>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:iload_1         
	//   18   36:iload_2         
	//   19   37:invokestatic    #69  <Method ActivityOptionsCompat23 ActivityOptionsCompat23.makeCustomAnimation(Context, int, int)>
	//   20   40:invokespecial   #52  <Method void ActivityOptionsCompat$ActivityOptionsImpl23(ActivityOptionsCompat23)>
	//   21   43:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  22   44:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*  23   47:bipush          21
	//*  24   49:icmplt          66
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl21(ActivityOptionsCompat21.makeCustomAnimation(context, i, j))));
	//   25   52:new             #6   <Class ActivityOptionsCompat$ActivityOptionsImpl21>
	//   26   55:dup             
	//   27   56:aload_0         
	//   28   57:iload_1         
	//   29   58:iload_2         
	//   30   59:invokestatic    #74  <Method ActivityOptionsCompat21 ActivityOptionsCompat21.makeCustomAnimation(Context, int, int)>
	//   31   62:invokespecial   #77  <Method void ActivityOptionsCompat$ActivityOptionsImpl21(ActivityOptionsCompat21)>
	//   32   65:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  33   66:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*  34   69:bipush          16
	//*  35   71:icmplt          88
			return ((ActivityOptionsCompat) (new ActivityOptionsImplJB(ActivityOptionsCompatJB.makeCustomAnimation(context, i, j))));
	//   36   74:new             #15  <Class ActivityOptionsCompat$ActivityOptionsImplJB>
	//   37   77:dup             
	//   38   78:aload_0         
	//   39   79:iload_1         
	//   40   80:iload_2         
	//   41   81:invokestatic    #82  <Method ActivityOptionsCompatJB ActivityOptionsCompatJB.makeCustomAnimation(Context, int, int)>
	//   42   84:invokespecial   #85  <Method void ActivityOptionsCompat$ActivityOptionsImplJB(ActivityOptionsCompatJB)>
	//   43   87:areturn         
		else
			return new ActivityOptionsCompat();
	//   44   88:new             #2   <Class ActivityOptionsCompat>
	//   45   91:dup             
	//   46   92:invokespecial   #53  <Method void ActivityOptionsCompat()>
	//   47   95:areturn         
	}

	public static ActivityOptionsCompat makeScaleUpAnimation(View view, int i, int j, int k, int l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          25
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl24(ActivityOptionsCompat24.makeScaleUpAnimation(view, i, j, k, l))));
	//    3    8:new             #12  <Class ActivityOptionsCompat$ActivityOptionsImpl24>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:iload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:iload           4
	//   10   18:invokestatic    #88  <Method ActivityOptionsCompat24 ActivityOptionsCompat24.makeScaleUpAnimation(View, int, int, int, int)>
	//   11   21:invokespecial   #44  <Method void ActivityOptionsCompat$ActivityOptionsImpl24(ActivityOptionsCompat24)>
	//   12   24:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  13   25:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   28:bipush          23
	//*  15   30:icmplt          50
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl23(ActivityOptionsCompat23.makeScaleUpAnimation(view, i, j, k, l))));
	//   16   33:new             #9   <Class ActivityOptionsCompat$ActivityOptionsImpl23>
	//   17   36:dup             
	//   18   37:aload_0         
	//   19   38:iload_1         
	//   20   39:iload_2         
	//   21   40:iload_3         
	//   22   41:iload           4
	//   23   43:invokestatic    #90  <Method ActivityOptionsCompat23 ActivityOptionsCompat23.makeScaleUpAnimation(View, int, int, int, int)>
	//   24   46:invokespecial   #52  <Method void ActivityOptionsCompat$ActivityOptionsImpl23(ActivityOptionsCompat23)>
	//   25   49:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  26   50:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*  27   53:bipush          21
	//*  28   55:icmplt          75
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl21(ActivityOptionsCompat21.makeScaleUpAnimation(view, i, j, k, l))));
	//   29   58:new             #6   <Class ActivityOptionsCompat$ActivityOptionsImpl21>
	//   30   61:dup             
	//   31   62:aload_0         
	//   32   63:iload_1         
	//   33   64:iload_2         
	//   34   65:iload_3         
	//   35   66:iload           4
	//   36   68:invokestatic    #93  <Method ActivityOptionsCompat21 ActivityOptionsCompat21.makeScaleUpAnimation(View, int, int, int, int)>
	//   37   71:invokespecial   #77  <Method void ActivityOptionsCompat$ActivityOptionsImpl21(ActivityOptionsCompat21)>
	//   38   74:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  39   75:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*  40   78:bipush          16
	//*  41   80:icmplt          100
			return ((ActivityOptionsCompat) (new ActivityOptionsImplJB(ActivityOptionsCompatJB.makeScaleUpAnimation(view, i, j, k, l))));
	//   42   83:new             #15  <Class ActivityOptionsCompat$ActivityOptionsImplJB>
	//   43   86:dup             
	//   44   87:aload_0         
	//   45   88:iload_1         
	//   46   89:iload_2         
	//   47   90:iload_3         
	//   48   91:iload           4
	//   49   93:invokestatic    #96  <Method ActivityOptionsCompatJB ActivityOptionsCompatJB.makeScaleUpAnimation(View, int, int, int, int)>
	//   50   96:invokespecial   #85  <Method void ActivityOptionsCompat$ActivityOptionsImplJB(ActivityOptionsCompatJB)>
	//   51   99:areturn         
		else
			return new ActivityOptionsCompat();
	//   52  100:new             #2   <Class ActivityOptionsCompat>
	//   53  103:dup             
	//   54  104:invokespecial   #53  <Method void ActivityOptionsCompat()>
	//   55  107:areturn         
	}

	public static ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, View view, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          22
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl24(ActivityOptionsCompat24.makeSceneTransitionAnimation(activity, view, s))));
	//    3    8:new             #12  <Class ActivityOptionsCompat$ActivityOptionsImpl24>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:aload_2         
	//    8   15:invokestatic    #101 <Method ActivityOptionsCompat24 ActivityOptionsCompat24.makeSceneTransitionAnimation(Activity, View, String)>
	//    9   18:invokespecial   #44  <Method void ActivityOptionsCompat$ActivityOptionsImpl24(ActivityOptionsCompat24)>
	//   10   21:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  11   22:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   25:bipush          23
	//*  13   27:icmplt          44
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl23(ActivityOptionsCompat23.makeSceneTransitionAnimation(activity, view, s))));
	//   14   30:new             #9   <Class ActivityOptionsCompat$ActivityOptionsImpl23>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:aload_2         
	//   19   37:invokestatic    #104 <Method ActivityOptionsCompat23 ActivityOptionsCompat23.makeSceneTransitionAnimation(Activity, View, String)>
	//   20   40:invokespecial   #52  <Method void ActivityOptionsCompat$ActivityOptionsImpl23(ActivityOptionsCompat23)>
	//   21   43:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  22   44:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*  23   47:bipush          21
	//*  24   49:icmplt          66
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl21(ActivityOptionsCompat21.makeSceneTransitionAnimation(activity, view, s))));
	//   25   52:new             #6   <Class ActivityOptionsCompat$ActivityOptionsImpl21>
	//   26   55:dup             
	//   27   56:aload_0         
	//   28   57:aload_1         
	//   29   58:aload_2         
	//   30   59:invokestatic    #107 <Method ActivityOptionsCompat21 ActivityOptionsCompat21.makeSceneTransitionAnimation(Activity, View, String)>
	//   31   62:invokespecial   #77  <Method void ActivityOptionsCompat$ActivityOptionsImpl21(ActivityOptionsCompat21)>
	//   32   65:areturn         
		else
			return new ActivityOptionsCompat();
	//   33   66:new             #2   <Class ActivityOptionsCompat>
	//   34   69:dup             
	//   35   70:invokespecial   #53  <Method void ActivityOptionsCompat()>
	//   36   73:areturn         
	}

	public static transient ActivityOptionsCompat makeSceneTransitionAnimation(Activity activity, Pair apair[])
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          140
		{
			View aview[] = null;
	//    3    8:aconst_null     
	//    4    9:astore_3        
			String as[] = null;
	//    5   10:aconst_null     
	//    6   11:astore          4
			if(apair != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          79
			{
				View aview1[] = new View[apair.length];
	//    9   17:aload_1         
	//   10   18:arraylength     
	//   11   19:anewarray       View[]
	//   12   22:astore          5
				String as1[] = new String[apair.length];
	//   13   24:aload_1         
	//   14   25:arraylength     
	//   15   26:anewarray       String[]
	//   16   29:astore          6
				int i = 0;
	//   17   31:iconst_0        
	//   18   32:istore_2        
				do
				{
					aview = aview1;
	//   19   33:aload           5
	//   20   35:astore_3        
					as = as1;
	//   21   36:aload           6
	//   22   38:astore          4
					if(i >= apair.length)
						break;
	//   23   40:iload_2         
	//   24   41:aload_1         
	//   25   42:arraylength     
	//   26   43:icmpge          79
					aview1[i] = (View)apair[i].first;
	//   27   46:aload           5
	//   28   48:iload_2         
	//   29   49:aload_1         
	//   30   50:iload_2         
	//   31   51:aaload          
	//   32   52:getfield        #118 <Field Object Pair.first>
	//   33   55:checkcast       #110 <Class View>
	//   34   58:aastore         
					as1[i] = (String)apair[i].second;
	//   35   59:aload           6
	//   36   61:iload_2         
	//   37   62:aload_1         
	//   38   63:iload_2         
	//   39   64:aaload          
	//   40   65:getfield        #121 <Field Object Pair.second>
	//   41   68:checkcast       #112 <Class String>
	//   42   71:aastore         
					i++;
	//   43   72:iload_2         
	//   44   73:iconst_1        
	//   45   74:iadd            
	//   46   75:istore_2        
				} while(true);
	//   47   76:goto            33
			}
			if(android.os.Build.VERSION.SDK_INT >= 24)
	//*  48   79:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*  49   82:bipush          24
	//*  50   84:icmplt          102
				return ((ActivityOptionsCompat) (new ActivityOptionsImpl24(ActivityOptionsCompat24.makeSceneTransitionAnimation(activity, aview, as))));
	//   51   87:new             #12  <Class ActivityOptionsCompat$ActivityOptionsImpl24>
	//   52   90:dup             
	//   53   91:aload_0         
	//   54   92:aload_3         
	//   55   93:aload           4
	//   56   95:invokestatic    #124 <Method ActivityOptionsCompat24 ActivityOptionsCompat24.makeSceneTransitionAnimation(Activity, View[], String[])>
	//   57   98:invokespecial   #44  <Method void ActivityOptionsCompat$ActivityOptionsImpl24(ActivityOptionsCompat24)>
	//   58  101:areturn         
			if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  59  102:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*  60  105:bipush          23
	//*  61  107:icmplt          125
				return ((ActivityOptionsCompat) (new ActivityOptionsImpl23(ActivityOptionsCompat23.makeSceneTransitionAnimation(activity, aview, as))));
	//   62  110:new             #9   <Class ActivityOptionsCompat$ActivityOptionsImpl23>
	//   63  113:dup             
	//   64  114:aload_0         
	//   65  115:aload_3         
	//   66  116:aload           4
	//   67  118:invokestatic    #127 <Method ActivityOptionsCompat23 ActivityOptionsCompat23.makeSceneTransitionAnimation(Activity, View[], String[])>
	//   68  121:invokespecial   #52  <Method void ActivityOptionsCompat$ActivityOptionsImpl23(ActivityOptionsCompat23)>
	//   69  124:areturn         
			else
				return ((ActivityOptionsCompat) (new ActivityOptionsImpl21(ActivityOptionsCompat21.makeSceneTransitionAnimation(activity, aview, as))));
	//   70  125:new             #6   <Class ActivityOptionsCompat$ActivityOptionsImpl21>
	//   71  128:dup             
	//   72  129:aload_0         
	//   73  130:aload_3         
	//   74  131:aload           4
	//   75  133:invokestatic    #130 <Method ActivityOptionsCompat21 ActivityOptionsCompat21.makeSceneTransitionAnimation(Activity, View[], String[])>
	//   76  136:invokespecial   #77  <Method void ActivityOptionsCompat$ActivityOptionsImpl21(ActivityOptionsCompat21)>
	//   77  139:areturn         
		} else
		{
			return new ActivityOptionsCompat();
	//   78  140:new             #2   <Class ActivityOptionsCompat>
	//   79  143:dup             
	//   80  144:invokespecial   #53  <Method void ActivityOptionsCompat()>
	//   81  147:areturn         
		}
	}

	public static ActivityOptionsCompat makeTaskLaunchBehind()
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          19
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl24(ActivityOptionsCompat24.makeTaskLaunchBehind())));
	//    3    8:new             #12  <Class ActivityOptionsCompat$ActivityOptionsImpl24>
	//    4   11:dup             
	//    5   12:invokestatic    #135 <Method ActivityOptionsCompat24 ActivityOptionsCompat24.makeTaskLaunchBehind()>
	//    6   15:invokespecial   #44  <Method void ActivityOptionsCompat$ActivityOptionsImpl24(ActivityOptionsCompat24)>
	//    7   18:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   8   19:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          23
	//*  10   24:icmplt          38
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl23(ActivityOptionsCompat23.makeTaskLaunchBehind())));
	//   11   27:new             #9   <Class ActivityOptionsCompat$ActivityOptionsImpl23>
	//   12   30:dup             
	//   13   31:invokestatic    #137 <Method ActivityOptionsCompat23 ActivityOptionsCompat23.makeTaskLaunchBehind()>
	//   14   34:invokespecial   #52  <Method void ActivityOptionsCompat$ActivityOptionsImpl23(ActivityOptionsCompat23)>
	//   15   37:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  16   38:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   41:bipush          21
	//*  18   43:icmplt          57
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl21(ActivityOptionsCompat21.makeTaskLaunchBehind())));
	//   19   46:new             #6   <Class ActivityOptionsCompat$ActivityOptionsImpl21>
	//   20   49:dup             
	//   21   50:invokestatic    #140 <Method ActivityOptionsCompat21 ActivityOptionsCompat21.makeTaskLaunchBehind()>
	//   22   53:invokespecial   #77  <Method void ActivityOptionsCompat$ActivityOptionsImpl21(ActivityOptionsCompat21)>
	//   23   56:areturn         
		else
			return new ActivityOptionsCompat();
	//   24   57:new             #2   <Class ActivityOptionsCompat>
	//   25   60:dup             
	//   26   61:invokespecial   #53  <Method void ActivityOptionsCompat()>
	//   27   64:areturn         
	}

	public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i, int j)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          23
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl24(ActivityOptionsCompat24.makeThumbnailScaleUpAnimation(view, bitmap, i, j))));
	//    3    8:new             #12  <Class ActivityOptionsCompat$ActivityOptionsImpl24>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:invokestatic    #145 <Method ActivityOptionsCompat24 ActivityOptionsCompat24.makeThumbnailScaleUpAnimation(View, Bitmap, int, int)>
	//   10   19:invokespecial   #44  <Method void ActivityOptionsCompat$ActivityOptionsImpl24(ActivityOptionsCompat24)>
	//   11   22:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  12   23:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*  13   26:bipush          23
	//*  14   28:icmplt          46
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl23(ActivityOptionsCompat23.makeThumbnailScaleUpAnimation(view, bitmap, i, j))));
	//   15   31:new             #9   <Class ActivityOptionsCompat$ActivityOptionsImpl23>
	//   16   34:dup             
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:iload_2         
	//   20   38:iload_3         
	//   21   39:invokestatic    #148 <Method ActivityOptionsCompat23 ActivityOptionsCompat23.makeThumbnailScaleUpAnimation(View, Bitmap, int, int)>
	//   22   42:invokespecial   #52  <Method void ActivityOptionsCompat$ActivityOptionsImpl23(ActivityOptionsCompat23)>
	//   23   45:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  24   46:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*  25   49:bipush          21
	//*  26   51:icmplt          69
			return ((ActivityOptionsCompat) (new ActivityOptionsImpl21(ActivityOptionsCompat21.makeThumbnailScaleUpAnimation(view, bitmap, i, j))));
	//   27   54:new             #6   <Class ActivityOptionsCompat$ActivityOptionsImpl21>
	//   28   57:dup             
	//   29   58:aload_0         
	//   30   59:aload_1         
	//   31   60:iload_2         
	//   32   61:iload_3         
	//   33   62:invokestatic    #151 <Method ActivityOptionsCompat21 ActivityOptionsCompat21.makeThumbnailScaleUpAnimation(View, Bitmap, int, int)>
	//   34   65:invokespecial   #77  <Method void ActivityOptionsCompat$ActivityOptionsImpl21(ActivityOptionsCompat21)>
	//   35   68:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*  36   69:getstatic       #36  <Field int android.os.Build$VERSION.SDK_INT>
	//*  37   72:bipush          16
	//*  38   74:icmplt          92
			return ((ActivityOptionsCompat) (new ActivityOptionsImplJB(ActivityOptionsCompatJB.makeThumbnailScaleUpAnimation(view, bitmap, i, j))));
	//   39   77:new             #15  <Class ActivityOptionsCompat$ActivityOptionsImplJB>
	//   40   80:dup             
	//   41   81:aload_0         
	//   42   82:aload_1         
	//   43   83:iload_2         
	//   44   84:iload_3         
	//   45   85:invokestatic    #154 <Method ActivityOptionsCompatJB ActivityOptionsCompatJB.makeThumbnailScaleUpAnimation(View, Bitmap, int, int)>
	//   46   88:invokespecial   #85  <Method void ActivityOptionsCompat$ActivityOptionsImplJB(ActivityOptionsCompatJB)>
	//   47   91:areturn         
		else
			return new ActivityOptionsCompat();
	//   48   92:new             #2   <Class ActivityOptionsCompat>
	//   49   95:dup             
	//   50   96:invokespecial   #53  <Method void ActivityOptionsCompat()>
	//   51   99:areturn         
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
