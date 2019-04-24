// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, NotificationBuilderWithBuilderAccessor

protected static class NotificationCompat$BuilderExtender
{

	public Notification build(NotificationCompat.Builder builder, NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		android.widget.RemoteViews remoteviews;
		Notification notification;
		if(builder.mStyle != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #20  <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*   2    4:ifnull          19
			remoteviews = builder.mStyle.makeContentView(notificationbuilderwithbuilderaccessor);
	//    3    7:aload_1         
	//    4    8:getfield        #20  <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #26  <Method android.widget.RemoteViews NotificationCompat$Style.makeContentView(NotificationBuilderWithBuilderAccessor)>
	//    7   15:astore_3        
		else
	//*   8   16:goto            21
			remoteviews = null;
	//    9   19:aconst_null     
	//   10   20:astore_3        
		notification = notificationbuilderwithbuilderaccessor.build();
	//   11   21:aload_2         
	//   12   22:invokeinterface #31  <Method Notification NotificationBuilderWithBuilderAccessor.build()>
	//   13   27:astore          4
		if(remoteviews == null) goto _L2; else goto _L1
	//   14   29:aload_3         
	//   15   30:ifnull          42
_L1:
		notification.contentView = remoteviews;
	//   16   33:aload           4
	//   17   35:aload_3         
	//   18   36:putfield        #37  <Field android.widget.RemoteViews Notification.contentView>
		break; /* Loop/switch isn't completed */
	//   19   39:goto            57
_L2:
		if(builder.mContentView == null)
			break; /* Loop/switch isn't completed */
	//   20   42:aload_1         
	//   21   43:getfield        #40  <Field android.widget.RemoteViews NotificationCompat$Builder.mContentView>
	//   22   46:ifnull          57
		remoteviews = builder.mContentView;
	//   23   49:aload_1         
	//   24   50:getfield        #40  <Field android.widget.RemoteViews NotificationCompat$Builder.mContentView>
	//   25   53:astore_3        
		if(true) goto _L1; else goto _L3
	//   26   54:goto            33
_L3:
		if(android.os.Build.VERSION.SDK_INT >= 16 && builder.mStyle != null)
	//*  27   57:getstatic       #46  <Field int android.os.Build$VERSION.SDK_INT>
	//*  28   60:bipush          16
	//*  29   62:icmplt          91
	//*  30   65:aload_1         
	//*  31   66:getfield        #20  <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  32   69:ifnull          91
		{
			android.widget.RemoteViews remoteviews1 = builder.mStyle.makeBigContentView(notificationbuilderwithbuilderaccessor);
	//   33   72:aload_1         
	//   34   73:getfield        #20  <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   35   76:aload_2         
	//   36   77:invokevirtual   #49  <Method android.widget.RemoteViews NotificationCompat$Style.makeBigContentView(NotificationBuilderWithBuilderAccessor)>
	//   37   80:astore_3        
			if(remoteviews1 != null)
	//*  38   81:aload_3         
	//*  39   82:ifnull          91
				notification.bigContentView = remoteviews1;
	//   40   85:aload           4
	//   41   87:aload_3         
	//   42   88:putfield        #52  <Field android.widget.RemoteViews Notification.bigContentView>
		}
		if(android.os.Build.VERSION.SDK_INT >= 21 && builder.mStyle != null)
	//*  43   91:getstatic       #46  <Field int android.os.Build$VERSION.SDK_INT>
	//*  44   94:bipush          21
	//*  45   96:icmplt          125
	//*  46   99:aload_1         
	//*  47  100:getfield        #20  <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  48  103:ifnull          125
		{
			builder = ((NotificationCompat.Builder) (builder.mStyle.makeHeadsUpContentView(notificationbuilderwithbuilderaccessor)));
	//   49  106:aload_1         
	//   50  107:getfield        #20  <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   51  110:aload_2         
	//   52  111:invokevirtual   #55  <Method android.widget.RemoteViews NotificationCompat$Style.makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor)>
	//   53  114:astore_1        
			if(builder != null)
	//*  54  115:aload_1         
	//*  55  116:ifnull          125
				notification.headsUpContentView = ((android.widget.RemoteViews) (builder));
	//   56  119:aload           4
	//   57  121:aload_1         
	//   58  122:putfield        #58  <Field android.widget.RemoteViews Notification.headsUpContentView>
		}
		return notification;
	//   59  125:aload           4
	//   60  127:areturn         
	}

	protected NotificationCompat$BuilderExtender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
