// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.app;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.NotificationBuilderWithBuilderAccessor;
import android.widget.RemoteViews;

// Referenced classes of package android.support.v4.media.app:
//			NotificationCompat

public static class NotificationCompat$DecoratedMediaCustomViewStyle extends NotificationCompat.MediaStyle
{

	private void setBackgroundColor(RemoteViews remoteviews)
	{
		int i;
		if(mBuilder.getColor() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//*   2    4:invokevirtual   #24  <Method int android.support.v4.app.NotificationCompat$Builder.getColor()>
	//*   3    7:ifeq            21
			i = mBuilder.getColor();
	//    4   10:aload_0         
	//    5   11:getfield        #18  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//    6   14:invokevirtual   #24  <Method int android.support.v4.app.NotificationCompat$Builder.getColor()>
	//    7   17:istore_2        
		else
	//*   8   18:goto            38
			i = mBuilder.mContext.getResources().getColor(android.support.mediacompat.R.color.notification_material_background_media_default_color);
	//    9   21:aload_0         
	//   10   22:getfield        #18  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//   11   25:getfield        #28  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   12   28:invokevirtual   #34  <Method Resources Context.getResources()>
	//   13   31:getstatic       #40  <Field int android.support.mediacompat.R$color.notification_material_background_media_default_color>
	//   14   34:invokevirtual   #45  <Method int Resources.getColor(int)>
	//   15   37:istore_2        
		remoteviews.setInt(android.support.mediacompat.R.id.status_bar_latest_event_content, "setBackgroundColor", i);
	//   16   38:aload_1         
	//   17   39:getstatic       #50  <Field int android.support.mediacompat.R$id.status_bar_latest_event_content>
	//   18   42:ldc1            #51  <String "setBackgroundColor">
	//   19   44:iload_2         
	//   20   45:invokevirtual   #57  <Method void RemoteViews.setInt(int, String, int)>
	//   21   48:return          
	}

	public void apply(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #68  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          30
		{
			notificationbuilderwithbuilderaccessor.getBuilder().setStyle(((android.app.Notification.Style) (fillInMediaStyle(((android.app.Notification.MediaStyle) (new android.app.Notification.DecoratedMediaCustomViewStyle()))))));
	//    3    8:aload_1         
	//    4    9:invokeinterface #74  <Method android.app.Notification$Builder NotificationBuilderWithBuilderAccessor.getBuilder()>
	//    5   14:aload_0         
	//    6   15:new             #76  <Class android.app.Notification$DecoratedMediaCustomViewStyle>
	//    7   18:dup             
	//    8   19:invokespecial   #77  <Method void android.app.Notification$DecoratedMediaCustomViewStyle()>
	//    9   22:invokevirtual   #81  <Method android.app.Notification$MediaStyle fillInMediaStyle(android.app.Notification$MediaStyle)>
	//   10   25:invokevirtual   #87  <Method android.app.Notification$Builder android.app.Notification$Builder.setStyle(android.app.Notification$Style)>
	//   11   28:pop             
			return;
	//   12   29:return          
		} else
		{
			super.apply(notificationbuilderwithbuilderaccessor);
	//   13   30:aload_0         
	//   14   31:aload_1         
	//   15   32:invokespecial   #89  <Method void NotificationCompat$MediaStyle.apply(NotificationBuilderWithBuilderAccessor)>
			return;
	//   16   35:return          
		}
	}

	int getBigContentViewLayoutResource(int i)
	{
		if(i <= 3)
	//*   0    0:iload_1         
	//*   1    1:iconst_3        
	//*   2    2:icmpgt          9
			return android.support.mediacompat.R.layout.notification_template_big_media_narrow_custom;
	//    3    5:getstatic       #96  <Field int android.support.mediacompat.R$layout.notification_template_big_media_narrow_custom>
	//    4    8:ireturn         
		else
			return android.support.mediacompat.R.layout.notification_template_big_media_custom;
	//    5    9:getstatic       #99  <Field int android.support.mediacompat.R$layout.notification_template_big_media_custom>
	//    6   12:ireturn         
	}

	int getContentViewLayoutResource()
	{
		if(mBuilder.getContentView() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//*   2    4:invokevirtual   #104 <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//*   3    7:ifnull          14
			return android.support.mediacompat.R.layout.notification_template_media_custom;
	//    4   10:getstatic       #107 <Field int android.support.mediacompat.R$layout.notification_template_media_custom>
	//    5   13:ireturn         
		else
			return super.getContentViewLayoutResource();
	//    6   14:aload_0         
	//    7   15:invokespecial   #109 <Method int NotificationCompat$MediaStyle.getContentViewLayoutResource()>
	//    8   18:ireturn         
	}

	public RemoteViews makeBigContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #68  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          10
			return null;
	//    3    8:aconst_null     
	//    4    9:areturn         
		if(mBuilder.getBigContentView() != null)
	//*   5   10:aload_0         
	//*   6   11:getfield        #18  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//*   7   14:invokevirtual   #114 <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getBigContentView()>
	//*   8   17:ifnull          31
			notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (mBuilder.getBigContentView()));
	//    9   20:aload_0         
	//   10   21:getfield        #18  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//   11   24:invokevirtual   #114 <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getBigContentView()>
	//   12   27:astore_1        
		else
	//*  13   28:goto            39
			notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (mBuilder.getContentView()));
	//   14   31:aload_0         
	//   15   32:getfield        #18  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//   16   35:invokevirtual   #104 <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//   17   38:astore_1        
		if(notificationbuilderwithbuilderaccessor == null)
	//*  18   39:aload_1         
	//*  19   40:ifnonnull       45
			return null;
	//   20   43:aconst_null     
	//   21   44:areturn         
		RemoteViews remoteviews = generateBigContentView();
	//   22   45:aload_0         
	//   23   46:invokevirtual   #117 <Method RemoteViews generateBigContentView()>
	//   24   49:astore_2        
		buildIntoRemoteViews(remoteviews, ((RemoteViews) (notificationbuilderwithbuilderaccessor)));
	//   25   50:aload_0         
	//   26   51:aload_2         
	//   27   52:aload_1         
	//   28   53:invokevirtual   #121 <Method void buildIntoRemoteViews(RemoteViews, RemoteViews)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  29   56:getstatic       #68  <Field int android.os.Build$VERSION.SDK_INT>
	//*  30   59:bipush          21
	//*  31   61:icmplt          69
			setBackgroundColor(remoteviews);
	//   32   64:aload_0         
	//   33   65:aload_2         
	//   34   66:invokespecial   #123 <Method void setBackgroundColor(RemoteViews)>
		return remoteviews;
	//   35   69:aload_2         
	//   36   70:areturn         
	}

	public RemoteViews makeContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #68  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          10
			return null;
	//    3    8:aconst_null     
	//    4    9:areturn         
		notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (mBuilder.getContentView()));
	//    5   10:aload_0         
	//    6   11:getfield        #18  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//    7   14:invokevirtual   #104 <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//    8   17:astore_1        
		boolean flag2 = true;
	//    9   18:iconst_1        
	//   10   19:istore          4
		boolean flag;
		if(notificationbuilderwithbuilderaccessor != null)
	//*  11   21:aload_1         
	//*  12   22:ifnull          30
			flag = true;
	//   13   25:iconst_1        
	//   14   26:istore_2        
		else
	//*  15   27:goto            32
			flag = false;
	//   16   30:iconst_0        
	//   17   31:istore_2        
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  18   32:getstatic       #68  <Field int android.os.Build$VERSION.SDK_INT>
	//*  19   35:bipush          21
	//*  20   37:icmplt          97
		{
			boolean flag1 = flag2;
	//   21   40:iload           4
	//   22   42:istore_3        
			if(!flag)
	//*  23   43:iload_2         
	//*  24   44:ifne            65
				if(mBuilder.getBigContentView() != null)
	//*  25   47:aload_0         
	//*  26   48:getfield        #18  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//*  27   51:invokevirtual   #114 <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getBigContentView()>
	//*  28   54:ifnull          63
					flag1 = flag2;
	//   29   57:iload           4
	//   30   59:istore_3        
				else
	//*  31   60:goto            65
					flag1 = false;
	//   32   63:iconst_0        
	//   33   64:istore_3        
			if(flag1)
	//*  34   65:iload_3         
	//*  35   66:ifeq            120
			{
				notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (generateContentView()));
	//   36   69:aload_0         
	//   37   70:invokevirtual   #127 <Method RemoteViews generateContentView()>
	//   38   73:astore_1        
				if(flag)
	//*  39   74:iload_2         
	//*  40   75:ifeq            90
					buildIntoRemoteViews(((RemoteViews) (notificationbuilderwithbuilderaccessor)), mBuilder.getContentView());
	//   41   78:aload_0         
	//   42   79:aload_1         
	//   43   80:aload_0         
	//   44   81:getfield        #18  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//   45   84:invokevirtual   #104 <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//   46   87:invokevirtual   #121 <Method void buildIntoRemoteViews(RemoteViews, RemoteViews)>
				setBackgroundColor(((RemoteViews) (notificationbuilderwithbuilderaccessor)));
	//   47   90:aload_0         
	//   48   91:aload_1         
	//   49   92:invokespecial   #123 <Method void setBackgroundColor(RemoteViews)>
				return ((RemoteViews) (notificationbuilderwithbuilderaccessor));
	//   50   95:aload_1         
	//   51   96:areturn         
			}
		} else
		{
			notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (generateContentView()));
	//   52   97:aload_0         
	//   53   98:invokevirtual   #127 <Method RemoteViews generateContentView()>
	//   54  101:astore_1        
			if(flag)
	//*  55  102:iload_2         
	//*  56  103:ifeq            120
			{
				buildIntoRemoteViews(((RemoteViews) (notificationbuilderwithbuilderaccessor)), mBuilder.getContentView());
	//   57  106:aload_0         
	//   58  107:aload_1         
	//   59  108:aload_0         
	//   60  109:getfield        #18  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//   61  112:invokevirtual   #104 <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//   62  115:invokevirtual   #121 <Method void buildIntoRemoteViews(RemoteViews, RemoteViews)>
				return ((RemoteViews) (notificationbuilderwithbuilderaccessor));
	//   63  118:aload_1         
	//   64  119:areturn         
			}
		}
		return null;
	//   65  120:aconst_null     
	//   66  121:areturn         
	}

	public RemoteViews makeHeadsUpContentView(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #68  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          10
			return null;
	//    3    8:aconst_null     
	//    4    9:areturn         
		if(mBuilder.getHeadsUpContentView() != null)
	//*   5   10:aload_0         
	//*   6   11:getfield        #18  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//*   7   14:invokevirtual   #131 <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getHeadsUpContentView()>
	//*   8   17:ifnull          31
			notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (mBuilder.getHeadsUpContentView()));
	//    9   20:aload_0         
	//   10   21:getfield        #18  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//   11   24:invokevirtual   #131 <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getHeadsUpContentView()>
	//   12   27:astore_1        
		else
	//*  13   28:goto            39
			notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (mBuilder.getContentView()));
	//   14   31:aload_0         
	//   15   32:getfield        #18  <Field android.support.v4.app.NotificationCompat$Builder mBuilder>
	//   16   35:invokevirtual   #104 <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//   17   38:astore_1        
		if(notificationbuilderwithbuilderaccessor == null)
	//*  18   39:aload_1         
	//*  19   40:ifnonnull       45
			return null;
	//   20   43:aconst_null     
	//   21   44:areturn         
		RemoteViews remoteviews = generateBigContentView();
	//   22   45:aload_0         
	//   23   46:invokevirtual   #117 <Method RemoteViews generateBigContentView()>
	//   24   49:astore_2        
		buildIntoRemoteViews(remoteviews, ((RemoteViews) (notificationbuilderwithbuilderaccessor)));
	//   25   50:aload_0         
	//   26   51:aload_2         
	//   27   52:aload_1         
	//   28   53:invokevirtual   #121 <Method void buildIntoRemoteViews(RemoteViews, RemoteViews)>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  29   56:getstatic       #68  <Field int android.os.Build$VERSION.SDK_INT>
	//*  30   59:bipush          21
	//*  31   61:icmplt          69
			setBackgroundColor(remoteviews);
	//   32   64:aload_0         
	//   33   65:aload_2         
	//   34   66:invokespecial   #123 <Method void setBackgroundColor(RemoteViews)>
		return remoteviews;
	//   35   69:aload_2         
	//   36   70:areturn         
	}

	public NotificationCompat$DecoratedMediaCustomViewStyle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void NotificationCompat$MediaStyle()>
	//    2    4:return          
	}
}
