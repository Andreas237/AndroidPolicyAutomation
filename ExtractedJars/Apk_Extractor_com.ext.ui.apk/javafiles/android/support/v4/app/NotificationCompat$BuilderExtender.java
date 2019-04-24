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
		Notification notification;
		android.widget.RemoteViews remoteviews;
		if(builder.mStyle != null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #24  <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*   2    4:ifnull          105
			remoteviews = builder.mStyle.makeContentView(notificationbuilderwithbuilderaccessor);
	//    3    7:aload_1         
	//    4    8:getfield        #24  <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//    5   11:aload_2         
	//    6   12:invokevirtual   #30  <Method android.widget.RemoteViews NotificationCompat$Style.makeContentView(NotificationBuilderWithBuilderAccessor)>
	//    7   15:astore_3        
		else
	//*   8   16:aload_2         
	//*   9   17:invokeinterface #35  <Method Notification NotificationBuilderWithBuilderAccessor.build()>
	//*  10   22:astore          4
	//*  11   24:aload_3         
	//*  12   25:ifnull          110
	//*  13   28:aload           4
	//*  14   30:aload_3         
	//*  15   31:putfield        #41  <Field android.widget.RemoteViews Notification.contentView>
	//*  16   34:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   37:bipush          16
	//*  18   39:icmplt          68
	//*  19   42:aload_1         
	//*  20   43:getfield        #24  <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  21   46:ifnull          68
	//*  22   49:aload_1         
	//*  23   50:getfield        #24  <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  24   53:aload_2         
	//*  25   54:invokevirtual   #50  <Method android.widget.RemoteViews NotificationCompat$Style.makeBigContentView(NotificationBuilderWithBuilderAccessor)>
	//*  26   57:astore_3        
	//*  27   58:aload_3         
	//*  28   59:ifnull          68
	//*  29   62:aload           4
	//*  30   64:aload_3         
	//*  31   65:putfield        #53  <Field android.widget.RemoteViews Notification.bigContentView>
	//*  32   68:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*  33   71:bipush          21
	//*  34   73:icmplt          102
	//*  35   76:aload_1         
	//*  36   77:getfield        #24  <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  37   80:ifnull          102
	//*  38   83:aload_1         
	//*  39   84:getfield        #24  <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  40   87:aload_2         
	//*  41   88:invokevirtual   #56  <Method android.widget.RemoteViews NotificationCompat$Style.makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor)>
	//*  42   91:astore_1        
	//*  43   92:aload_1         
	//*  44   93:ifnull          102
	//*  45   96:aload           4
	//*  46   98:aload_1         
	//*  47   99:putfield        #59  <Field android.widget.RemoteViews Notification.headsUpContentView>
	//*  48  102:aload           4
	//*  49  104:areturn         
			remoteviews = null;
	//   50  105:aconst_null     
	//   51  106:astore_3        
		notification = notificationbuilderwithbuilderaccessor.build();
		if(remoteviews == null) goto _L2; else goto _L1
_L1:
		notification.contentView = remoteviews;
_L4:
		if(android.os.Build.VERSION.SDK_INT >= 16 && builder.mStyle != null)
		{
			remoteviews = builder.mStyle.makeBigContentView(notificationbuilderwithbuilderaccessor);
			if(remoteviews != null)
				notification.bigContentView = remoteviews;
		}
		if(android.os.Build.VERSION.SDK_INT >= 21 && builder.mStyle != null)
		{
			builder = ((NotificationCompat.Builder) (builder.mStyle.makeHeadsUpContentView(notificationbuilderwithbuilderaccessor)));
			if(builder != null)
				notification.headsUpContentView = ((android.widget.RemoteViews) (builder));
		}
		return notification;
	//*  52  107:goto            16
_L2:
		if(builder.mContentView != null)
	//*  53  110:aload_1         
	//*  54  111:getfield        #62  <Field android.widget.RemoteViews NotificationCompat$Builder.mContentView>
	//*  55  114:ifnull          34
			notification.contentView = builder.mContentView;
	//   56  117:aload           4
	//   57  119:aload_1         
	//   58  120:getfield        #62  <Field android.widget.RemoteViews NotificationCompat$Builder.mContentView>
	//   59  123:putfield        #41  <Field android.widget.RemoteViews Notification.contentView>
		if(true) goto _L4; else goto _L3
	//   60  126:goto            34
_L3:
	}

	protected NotificationCompat$BuilderExtender()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
