// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Preconditions;

// Referenced classes of package com.bumptech.glide.request.target:
//			SimpleTarget

public class NotificationTarget extends SimpleTarget
{

	public NotificationTarget(Context context1, int i, int j, int k, RemoteViews remoteviews, Notification notification1, int l, 
			String s)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokespecial   #21  <Method void SimpleTarget(int, int)>
		context = (Context)Preconditions.checkNotNull(((Object) (context1)), "Context must not be null!");
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:ldc1            #23  <String "Context must not be null!">
	//    7   10:invokestatic    #29  <Method Object Preconditions.checkNotNull(Object, String)>
	//    8   13:checkcast       #31  <Class Context>
	//    9   16:putfield        #33  <Field Context context>
		notification = (Notification)Preconditions.checkNotNull(((Object) (notification1)), "Notification object can not be null!");
	//   10   19:aload_0         
	//   11   20:aload           6
	//   12   22:ldc1            #35  <String "Notification object can not be null!">
	//   13   24:invokestatic    #29  <Method Object Preconditions.checkNotNull(Object, String)>
	//   14   27:checkcast       #37  <Class Notification>
	//   15   30:putfield        #39  <Field Notification notification>
		remoteViews = (RemoteViews)Preconditions.checkNotNull(((Object) (remoteviews)), "RemoteViews object can not be null!");
	//   16   33:aload_0         
	//   17   34:aload           5
	//   18   36:ldc1            #41  <String "RemoteViews object can not be null!">
	//   19   38:invokestatic    #29  <Method Object Preconditions.checkNotNull(Object, String)>
	//   20   41:checkcast       #43  <Class RemoteViews>
	//   21   44:putfield        #45  <Field RemoteViews remoteViews>
		viewId = k;
	//   22   47:aload_0         
	//   23   48:iload           4
	//   24   50:putfield        #47  <Field int viewId>
		notificationId = l;
	//   25   53:aload_0         
	//   26   54:iload           7
	//   27   56:putfield        #49  <Field int notificationId>
		notificationTag = s;
	//   28   59:aload_0         
	//   29   60:aload           8
	//   30   62:putfield        #51  <Field String notificationTag>
	//   31   65:return          
	}

	public NotificationTarget(Context context1, int i, RemoteViews remoteviews, Notification notification1, int j)
	{
		this(context1, i, remoteviews, notification1, j, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:iload           5
	//    6    8:aconst_null     
	//    7    9:invokespecial   #56  <Method void NotificationTarget(Context, int, RemoteViews, Notification, int, String)>
	//    8   12:return          
	}

	public NotificationTarget(Context context1, int i, RemoteViews remoteviews, Notification notification1, int j, String s)
	{
		this(context1, 0x80000000, 0x80000000, i, remoteviews, notification1, j, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #57  <Int 0x80000000>
	//    3    4:ldc1            #57  <Int 0x80000000>
	//    4    6:iload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:iload           5
	//    8   12:aload           6
	//    9   14:invokespecial   #59  <Method void NotificationTarget(Context, int, int, int, RemoteViews, Notification, int, String)>
	//   10   17:return          
	}

	private void update()
	{
		((NotificationManager)context.getSystemService("notification")).notify(notificationTag, notificationId, notification);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Context context>
	//    2    4:ldc1            #62  <String "notification">
	//    3    6:invokevirtual   #66  <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #68  <Class NotificationManager>
	//    5   12:aload_0         
	//    6   13:getfield        #51  <Field String notificationTag>
	//    7   16:aload_0         
	//    8   17:getfield        #49  <Field int notificationId>
	//    9   20:aload_0         
	//   10   21:getfield        #39  <Field Notification notification>
	//   11   24:invokevirtual   #72  <Method void NotificationManager.notify(String, int, Notification)>
	//   12   27:return          
	}

	public void onResourceReady(Bitmap bitmap, Transition transition)
	{
		remoteViews.setImageViewBitmap(viewId, bitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field RemoteViews remoteViews>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field int viewId>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #78  <Method void RemoteViews.setImageViewBitmap(int, Bitmap)>
		update();
	//    6   12:aload_0         
	//    7   13:invokespecial   #80  <Method void update()>
	//    8   16:return          
	}

	public volatile void onResourceReady(Object obj, Transition transition)
	{
		onResourceReady((Bitmap)obj, transition);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #85  <Class Bitmap>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #87  <Method void onResourceReady(Bitmap, Transition)>
	//    5    9:return          
	}

	private final Context context;
	private final Notification notification;
	private final int notificationId;
	private final String notificationTag;
	private final RemoteViews remoteViews;
	private final int viewId;
}
