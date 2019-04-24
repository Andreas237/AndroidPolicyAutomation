// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Preconditions;

// Referenced classes of package com.bumptech.glide.request.target:
//			SimpleTarget

public class AppWidgetTarget extends SimpleTarget
{

	public AppWidgetTarget(Context context1, int i, int j, int k, RemoteViews remoteviews, ComponentName componentname)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokespecial   #20  <Method void SimpleTarget(int, int)>
		context = (Context)Preconditions.checkNotNull(((Object) (context1)), "Context can not be null!");
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:ldc1            #22  <String "Context can not be null!">
	//    7   10:invokestatic    #28  <Method Object Preconditions.checkNotNull(Object, String)>
	//    8   13:checkcast       #30  <Class Context>
	//    9   16:putfield        #32  <Field Context context>
		remoteViews = (RemoteViews)Preconditions.checkNotNull(((Object) (remoteviews)), "RemoteViews object can not be null!");
	//   10   19:aload_0         
	//   11   20:aload           5
	//   12   22:ldc1            #34  <String "RemoteViews object can not be null!">
	//   13   24:invokestatic    #28  <Method Object Preconditions.checkNotNull(Object, String)>
	//   14   27:checkcast       #36  <Class RemoteViews>
	//   15   30:putfield        #38  <Field RemoteViews remoteViews>
		componentName = (ComponentName)Preconditions.checkNotNull(((Object) (componentname)), "ComponentName can not be null!");
	//   16   33:aload_0         
	//   17   34:aload           6
	//   18   36:ldc1            #40  <String "ComponentName can not be null!">
	//   19   38:invokestatic    #28  <Method Object Preconditions.checkNotNull(Object, String)>
	//   20   41:checkcast       #42  <Class ComponentName>
	//   21   44:putfield        #44  <Field ComponentName componentName>
		viewId = k;
	//   22   47:aload_0         
	//   23   48:iload           4
	//   24   50:putfield        #46  <Field int viewId>
		widgetIds = null;
	//   25   53:aload_0         
	//   26   54:aconst_null     
	//   27   55:putfield        #48  <Field int[] widgetIds>
	//   28   58:return          
	}

	public transient AppWidgetTarget(Context context1, int i, int j, int k, RemoteViews remoteviews, int ai[])
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokespecial   #20  <Method void SimpleTarget(int, int)>
		if(ai.length == 0)
	//*   4    6:aload           6
	//*   5    8:arraylength     
	//*   6    9:ifne            22
		{
			throw new IllegalArgumentException("WidgetIds must have length > 0");
	//    7   12:new             #52  <Class IllegalArgumentException>
	//    8   15:dup             
	//    9   16:ldc1            #54  <String "WidgetIds must have length > 0">
	//   10   18:invokespecial   #57  <Method void IllegalArgumentException(String)>
	//   11   21:athrow          
		} else
		{
			context = (Context)Preconditions.checkNotNull(((Object) (context1)), "Context can not be null!");
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:ldc1            #22  <String "Context can not be null!">
	//   15   26:invokestatic    #28  <Method Object Preconditions.checkNotNull(Object, String)>
	//   16   29:checkcast       #30  <Class Context>
	//   17   32:putfield        #32  <Field Context context>
			remoteViews = (RemoteViews)Preconditions.checkNotNull(((Object) (remoteviews)), "RemoteViews object can not be null!");
	//   18   35:aload_0         
	//   19   36:aload           5
	//   20   38:ldc1            #34  <String "RemoteViews object can not be null!">
	//   21   40:invokestatic    #28  <Method Object Preconditions.checkNotNull(Object, String)>
	//   22   43:checkcast       #36  <Class RemoteViews>
	//   23   46:putfield        #38  <Field RemoteViews remoteViews>
			widgetIds = (int[])Preconditions.checkNotNull(((Object) (ai)), "WidgetIds can not be null!");
	//   24   49:aload_0         
	//   25   50:aload           6
	//   26   52:ldc1            #59  <String "WidgetIds can not be null!">
	//   27   54:invokestatic    #28  <Method Object Preconditions.checkNotNull(Object, String)>
	//   28   57:checkcast       #60  <Class int[]>
	//   29   60:putfield        #48  <Field int[] widgetIds>
			viewId = k;
	//   30   63:aload_0         
	//   31   64:iload           4
	//   32   66:putfield        #46  <Field int viewId>
			componentName = null;
	//   33   69:aload_0         
	//   34   70:aconst_null     
	//   35   71:putfield        #44  <Field ComponentName componentName>
			return;
	//   36   74:return          
		}
	}

	public AppWidgetTarget(Context context1, int i, RemoteViews remoteviews, ComponentName componentname)
	{
		this(context1, 0x80000000, 0x80000000, i, remoteviews, componentname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #62  <Int 0x80000000>
	//    3    4:ldc1            #62  <Int 0x80000000>
	//    4    6:iload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #64  <Method void AppWidgetTarget(Context, int, int, int, RemoteViews, ComponentName)>
	//    8   13:return          
	}

	public transient AppWidgetTarget(Context context1, int i, RemoteViews remoteviews, int ai[])
	{
		this(context1, 0x80000000, 0x80000000, i, remoteviews, ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #62  <Int 0x80000000>
	//    3    4:ldc1            #62  <Int 0x80000000>
	//    4    6:iload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:invokespecial   #67  <Method void AppWidgetTarget(Context, int, int, int, RemoteViews, int[])>
	//    8   13:return          
	}

	private void update()
	{
		AppWidgetManager appwidgetmanager = AppWidgetManager.getInstance(context);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Context context>
	//    2    4:invokestatic    #75  <Method AppWidgetManager AppWidgetManager.getInstance(Context)>
	//    3    7:astore_1        
		if(componentName != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #44  <Field ComponentName componentName>
	//*   6   12:ifnull          28
		{
			appwidgetmanager.updateAppWidget(componentName, remoteViews);
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #44  <Field ComponentName componentName>
	//   10   20:aload_0         
	//   11   21:getfield        #38  <Field RemoteViews remoteViews>
	//   12   24:invokevirtual   #79  <Method void AppWidgetManager.updateAppWidget(ComponentName, RemoteViews)>
			return;
	//   13   27:return          
		} else
		{
			appwidgetmanager.updateAppWidget(widgetIds, remoteViews);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #48  <Field int[] widgetIds>
	//   17   33:aload_0         
	//   18   34:getfield        #38  <Field RemoteViews remoteViews>
	//   19   37:invokevirtual   #82  <Method void AppWidgetManager.updateAppWidget(int[], RemoteViews)>
			return;
	//   20   40:return          
		}
	}

	public void onResourceReady(Bitmap bitmap, Transition transition)
	{
		remoteViews.setImageViewBitmap(viewId, bitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field RemoteViews remoteViews>
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field int viewId>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #88  <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
		update();
	//    6   12:aload_0         
	//    7   13:invokespecial   #90  <Method void update()>
	//    8   16:return          
	}

	public volatile void onResourceReady(Object obj, Transition transition)
	{
		onResourceReady((Bitmap)obj, transition);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #95  <Class Bitmap>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #97  <Method void onResourceReady(Bitmap, Transition)>
	//    5    9:return          
	}

	private final ComponentName componentName;
	private final Context context;
	private final RemoteViews remoteViews;
	private final int viewId;
	private final int widgetIds[];
}
