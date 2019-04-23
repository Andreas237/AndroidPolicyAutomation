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
		if(ai.length != 0)
	//*   4    6:aload           6
	//*   5    8:arraylength     
	//*   6    9:ifeq            65
		{
			context = (Context)Preconditions.checkNotNull(((Object) (context1)), "Context can not be null!");
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:ldc1            #22  <String "Context can not be null!">
	//   10   16:invokestatic    #28  <Method Object Preconditions.checkNotNull(Object, String)>
	//   11   19:checkcast       #30  <Class Context>
	//   12   22:putfield        #32  <Field Context context>
			remoteViews = (RemoteViews)Preconditions.checkNotNull(((Object) (remoteviews)), "RemoteViews object can not be null!");
	//   13   25:aload_0         
	//   14   26:aload           5
	//   15   28:ldc1            #34  <String "RemoteViews object can not be null!">
	//   16   30:invokestatic    #28  <Method Object Preconditions.checkNotNull(Object, String)>
	//   17   33:checkcast       #36  <Class RemoteViews>
	//   18   36:putfield        #38  <Field RemoteViews remoteViews>
			widgetIds = (int[])Preconditions.checkNotNull(((Object) (ai)), "WidgetIds can not be null!");
	//   19   39:aload_0         
	//   20   40:aload           6
	//   21   42:ldc1            #52  <String "WidgetIds can not be null!">
	//   22   44:invokestatic    #28  <Method Object Preconditions.checkNotNull(Object, String)>
	//   23   47:checkcast       #53  <Class int[]>
	//   24   50:putfield        #48  <Field int[] widgetIds>
			viewId = k;
	//   25   53:aload_0         
	//   26   54:iload           4
	//   27   56:putfield        #46  <Field int viewId>
			componentName = null;
	//   28   59:aload_0         
	//   29   60:aconst_null     
	//   30   61:putfield        #44  <Field ComponentName componentName>
			return;
	//   31   64:return          
		} else
		{
			throw new IllegalArgumentException("WidgetIds must have length > 0");
	//   32   65:new             #55  <Class IllegalArgumentException>
	//   33   68:dup             
	//   34   69:ldc1            #57  <String "WidgetIds must have length > 0">
	//   35   71:invokespecial   #60  <Method void IllegalArgumentException(String)>
	//   36   74:athrow          
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
		ComponentName componentname = componentName;
	//    4    8:aload_0         
	//    5    9:getfield        #44  <Field ComponentName componentName>
	//    6   12:astore_2        
		if(componentname != null)
	//*   7   13:aload_2         
	//*   8   14:ifnull          27
		{
			appwidgetmanager.updateAppWidget(componentname, remoteViews);
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:getfield        #38  <Field RemoteViews remoteViews>
	//   13   23:invokevirtual   #79  <Method void AppWidgetManager.updateAppWidget(ComponentName, RemoteViews)>
			return;
	//   14   26:return          
		} else
		{
			appwidgetmanager.updateAppWidget(widgetIds, remoteViews);
	//   15   27:aload_1         
	//   16   28:aload_0         
	//   17   29:getfield        #48  <Field int[] widgetIds>
	//   18   32:aload_0         
	//   19   33:getfield        #38  <Field RemoteViews remoteViews>
	//   20   36:invokevirtual   #82  <Method void AppWidgetManager.updateAppWidget(int[], RemoteViews)>
			return;
	//   21   39:return          
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
	//    5    9:invokevirtual   #90  <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
		update();
	//    6   12:aload_0         
	//    7   13:invokespecial   #92  <Method void update()>
	//    8   16:return          
	}

	public volatile void onResourceReady(Object obj, Transition transition)
	{
		onResourceReady((Bitmap)obj, transition);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #98  <Class Bitmap>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #100 <Method void onResourceReady(Bitmap, Transition)>
	//    5    9:return          
	}

	private final ComponentName componentName;
	private final Context context;
	private final RemoteViews remoteViews;
	private final int viewId;
	private final int widgetIds[];
}
