// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.BundleCompat;
import android.support.v4.app.NotificationBuilderWithBuilderAccessor;
import android.support.v4.text.BidiFormatter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import java.util.List;

// Referenced classes of package android.support.v7.app:
//			NotificationCompatImplBase, NotificationCompatImplJellybean, NotificationCompatImpl21, NotificationCompatImpl24

public class NotificationCompat extends android.support.v4.app.NotificationCompat
{
	static class Api24Extender extends android.support.v4.app.BuilderExtender
	{

		public Notification build(android.support.v4.app.Builder builder, NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			NotificationCompat.addStyleToBuilderApi24(notificationbuilderwithbuilderaccessor, builder);
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:invokestatic    #20  <Method void NotificationCompat.access$900(NotificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationCompat$Builder)>
			return notificationbuilderwithbuilderaccessor.build();
		//    3    5:aload_2         
		//    4    6:invokeinterface #25  <Method Notification NotificationBuilderWithBuilderAccessor.build()>
		//    5   11:areturn         
		}

		private Api24Extender()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void android.support.v4.app.NotificationCompat$BuilderExtender()>
		//    2    4:return          
		}

	}

	public static class Builder extends android.support.v4.app.Builder
	{

		public android.support.v4.app.BuilderExtender getExtender()
		{
			if(android.os.Build.VERSION.SDK_INT >= 24)
		//*   0    0:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          24
		//*   2    5:icmplt          17
				return ((android.support.v4.app.BuilderExtender) (new Api24Extender()));
		//    3    8:new             #26  <Class NotificationCompat$Api24Extender>
		//    4   11:dup             
		//    5   12:aconst_null     
		//    6   13:invokespecial   #29  <Method void NotificationCompat$Api24Extender(NotificationCompat$1)>
		//    7   16:areturn         
			if(android.os.Build.VERSION.SDK_INT >= 21)
		//*   8   17:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
		//*   9   20:bipush          21
		//*  10   22:icmplt          33
				return ((android.support.v4.app.BuilderExtender) (new LollipopExtender()));
		//   11   25:new             #31  <Class NotificationCompat$LollipopExtender>
		//   12   28:dup             
		//   13   29:invokespecial   #34  <Method void NotificationCompat$LollipopExtender()>
		//   14   32:areturn         
			if(android.os.Build.VERSION.SDK_INT >= 16)
		//*  15   33:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
		//*  16   36:bipush          16
		//*  17   38:icmplt          49
				return ((android.support.v4.app.BuilderExtender) (new JellybeanExtender()));
		//   18   41:new             #36  <Class NotificationCompat$JellybeanExtender>
		//   19   44:dup             
		//   20   45:invokespecial   #37  <Method void NotificationCompat$JellybeanExtender()>
		//   21   48:areturn         
			if(android.os.Build.VERSION.SDK_INT >= 14)
		//*  22   49:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
		//*  23   52:bipush          14
		//*  24   54:icmplt          65
				return ((android.support.v4.app.BuilderExtender) (new IceCreamSandwichExtender()));
		//   25   57:new             #39  <Class NotificationCompat$IceCreamSandwichExtender>
		//   26   60:dup             
		//   27   61:invokespecial   #40  <Method void NotificationCompat$IceCreamSandwichExtender()>
		//   28   64:areturn         
			else
				return super.getExtender();
		//   29   65:aload_0         
		//   30   66:invokespecial   #42  <Method android.support.v4.app.NotificationCompat$BuilderExtender android.support.v4.app.NotificationCompat$Builder.getExtender()>
		//   31   69:areturn         
		}

		public CharSequence resolveText()
		{
			if(mStyle instanceof android.support.v4.app.MessagingStyle)
		//*   0    0:aload_0         
		//*   1    1:getfield        #49  <Field android.support.v4.app.NotificationCompat$Style mStyle>
		//*   2    4:instanceof      #51  <Class android.support.v4.app.NotificationCompat$MessagingStyle>
		//*   3    7:ifeq            48
			{
				android.support.v4.app.MessagingStyle messagingstyle = (android.support.v4.app.MessagingStyle)mStyle;
		//    4   10:aload_0         
		//    5   11:getfield        #49  <Field android.support.v4.app.NotificationCompat$Style mStyle>
		//    6   14:checkcast       #51  <Class android.support.v4.app.NotificationCompat$MessagingStyle>
		//    7   17:astore_1        
				android.support.v4.app.MessagingStyle.Message message = NotificationCompat.findLatestIncomingMessage(messagingstyle);
		//    8   18:aload_1         
		//    9   19:invokestatic    #55  <Method android.support.v4.app.NotificationCompat$MessagingStyle$Message NotificationCompat.access$000(android.support.v4.app.NotificationCompat$MessagingStyle)>
		//   10   22:astore_2        
				CharSequence charsequence = messagingstyle.getConversationTitle();
		//   11   23:aload_1         
		//   12   24:invokevirtual   #58  <Method CharSequence android.support.v4.app.NotificationCompat$MessagingStyle.getConversationTitle()>
		//   13   27:astore_3        
				if(message != null)
		//*  14   28:aload_2         
		//*  15   29:ifnull          48
					if(charsequence != null)
		//*  16   32:aload_3         
		//*  17   33:ifnull          43
						return NotificationCompat.makeMessageLine(((android.support.v4.app.Builder) (this)), messagingstyle, message);
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:aload_2         
		//   21   39:invokestatic    #62  <Method CharSequence NotificationCompat.access$100(android.support.v4.app.NotificationCompat$Builder, android.support.v4.app.NotificationCompat$MessagingStyle, android.support.v4.app.NotificationCompat$MessagingStyle$Message)>
		//   22   42:areturn         
					else
						return message.getText();
		//   23   43:aload_2         
		//   24   44:invokevirtual   #67  <Method CharSequence android.support.v4.app.NotificationCompat$MessagingStyle$Message.getText()>
		//   25   47:areturn         
			}
			return super.resolveText();
		//   26   48:aload_0         
		//   27   49:invokespecial   #69  <Method CharSequence android.support.v4.app.NotificationCompat$Builder.resolveText()>
		//   28   52:areturn         
		}

		public CharSequence resolveTitle()
		{
			if(mStyle instanceof android.support.v4.app.MessagingStyle)
		//*   0    0:aload_0         
		//*   1    1:getfield        #49  <Field android.support.v4.app.NotificationCompat$Style mStyle>
		//*   2    4:instanceof      #51  <Class android.support.v4.app.NotificationCompat$MessagingStyle>
		//*   3    7:ifeq            47
			{
				Object obj = ((Object) ((android.support.v4.app.MessagingStyle)mStyle));
		//    4   10:aload_0         
		//    5   11:getfield        #49  <Field android.support.v4.app.NotificationCompat$Style mStyle>
		//    6   14:checkcast       #51  <Class android.support.v4.app.NotificationCompat$MessagingStyle>
		//    7   17:astore_2        
				android.support.v4.app.MessagingStyle.Message message = NotificationCompat.findLatestIncomingMessage(((android.support.v4.app.MessagingStyle) (obj)));
		//    8   18:aload_2         
		//    9   19:invokestatic    #55  <Method android.support.v4.app.NotificationCompat$MessagingStyle$Message NotificationCompat.access$000(android.support.v4.app.NotificationCompat$MessagingStyle)>
		//   10   22:astore_1        
				obj = ((Object) (((android.support.v4.app.MessagingStyle) (obj)).getConversationTitle()));
		//   11   23:aload_2         
		//   12   24:invokevirtual   #58  <Method CharSequence android.support.v4.app.NotificationCompat$MessagingStyle.getConversationTitle()>
		//   13   27:astore_2        
				if(obj != null || message != null)
		//*  14   28:aload_2         
		//*  15   29:ifnonnull       36
		//*  16   32:aload_1         
		//*  17   33:ifnull          47
					if(obj != null)
		//*  18   36:aload_2         
		//*  19   37:ifnull          42
						return ((CharSequence) (obj));
		//   20   40:aload_2         
		//   21   41:areturn         
					else
						return message.getSender();
		//   22   42:aload_1         
		//   23   43:invokevirtual   #73  <Method CharSequence android.support.v4.app.NotificationCompat$MessagingStyle$Message.getSender()>
		//   24   46:areturn         
			}
			return super.resolveTitle();
		//   25   47:aload_0         
		//   26   48:invokespecial   #75  <Method CharSequence android.support.v4.app.NotificationCompat$Builder.resolveTitle()>
		//   27   51:areturn         
		}

		public Builder(Context context)
		{
			super(context);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void android.support.v4.app.NotificationCompat$Builder(Context)>
		//    3    5:return          
		}
	}

	public static class DecoratedCustomViewStyle extends android.support.v4.app.Style
	{

		public DecoratedCustomViewStyle()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void android.support.v4.app.NotificationCompat$Style()>
		//    2    4:return          
		}
	}

	public static class DecoratedMediaCustomViewStyle extends MediaStyle
	{

		public DecoratedMediaCustomViewStyle()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void NotificationCompat$MediaStyle()>
		//    2    4:return          
		}
	}

	static class IceCreamSandwichExtender extends android.support.v4.app.BuilderExtender
	{

		public Notification build(android.support.v4.app.Builder builder, NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			RemoteViews remoteviews = NotificationCompat.addStyleGetContentViewIcs(notificationbuilderwithbuilderaccessor, builder);
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:invokestatic    #18  <Method RemoteViews NotificationCompat.access$300(NotificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationCompat$Builder)>
		//    3    5:astore_3        
			notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (notificationbuilderwithbuilderaccessor.build()));
		//    4    6:aload_2         
		//    5    7:invokeinterface #23  <Method Notification NotificationBuilderWithBuilderAccessor.build()>
		//    6   12:astore_2        
			if(remoteviews != null)
		//*   7   13:aload_3         
		//*   8   14:ifnull          24
			{
				notificationbuilderwithbuilderaccessor.contentView = remoteviews;
		//    9   17:aload_2         
		//   10   18:aload_3         
		//   11   19:putfield        #29  <Field RemoteViews Notification.contentView>
				return ((Notification) (notificationbuilderwithbuilderaccessor));
		//   12   22:aload_2         
		//   13   23:areturn         
			}
			if(builder.getContentView() != null)
		//*  14   24:aload_1         
		//*  15   25:invokevirtual   #35  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
		//*  16   28:ifnull          39
				notificationbuilderwithbuilderaccessor.contentView = builder.getContentView();
		//   17   31:aload_2         
		//   18   32:aload_1         
		//   19   33:invokevirtual   #35  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
		//   20   36:putfield        #29  <Field RemoteViews Notification.contentView>
			return ((Notification) (notificationbuilderwithbuilderaccessor));
		//   21   39:aload_2         
		//   22   40:areturn         
		}

		IceCreamSandwichExtender()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void android.support.v4.app.NotificationCompat$BuilderExtender()>
		//    2    4:return          
		}
	}

	static class JellybeanExtender extends android.support.v4.app.BuilderExtender
	{

		public Notification build(android.support.v4.app.Builder builder, NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			RemoteViews remoteviews = NotificationCompat.addStyleGetContentViewJellybean(notificationbuilderwithbuilderaccessor, builder);
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:invokestatic    #18  <Method RemoteViews NotificationCompat.access$400(NotificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationCompat$Builder)>
		//    3    5:astore_3        
			notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (notificationbuilderwithbuilderaccessor.build()));
		//    4    6:aload_2         
		//    5    7:invokeinterface #23  <Method Notification NotificationBuilderWithBuilderAccessor.build()>
		//    6   12:astore_2        
			if(remoteviews != null)
		//*   7   13:aload_3         
		//*   8   14:ifnull          22
				notificationbuilderwithbuilderaccessor.contentView = remoteviews;
		//    9   17:aload_2         
		//   10   18:aload_3         
		//   11   19:putfield        #29  <Field RemoteViews Notification.contentView>
			NotificationCompat.addBigStyleToBuilderJellybean(((Notification) (notificationbuilderwithbuilderaccessor)), builder);
		//   12   22:aload_2         
		//   13   23:aload_1         
		//   14   24:invokestatic    #33  <Method void NotificationCompat.access$500(Notification, android.support.v4.app.NotificationCompat$Builder)>
			return ((Notification) (notificationbuilderwithbuilderaccessor));
		//   15   27:aload_2         
		//   16   28:areturn         
		}

		JellybeanExtender()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void android.support.v4.app.NotificationCompat$BuilderExtender()>
		//    2    4:return          
		}
	}

	static class LollipopExtender extends android.support.v4.app.BuilderExtender
	{

		public Notification build(android.support.v4.app.Builder builder, NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor)
		{
			RemoteViews remoteviews = NotificationCompat.addStyleGetContentViewLollipop(notificationbuilderwithbuilderaccessor, builder);
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:invokestatic    #18  <Method RemoteViews NotificationCompat.access$600(NotificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationCompat$Builder)>
		//    3    5:astore_3        
			notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (notificationbuilderwithbuilderaccessor.build()));
		//    4    6:aload_2         
		//    5    7:invokeinterface #23  <Method Notification NotificationBuilderWithBuilderAccessor.build()>
		//    6   12:astore_2        
			if(remoteviews != null)
		//*   7   13:aload_3         
		//*   8   14:ifnull          22
				notificationbuilderwithbuilderaccessor.contentView = remoteviews;
		//    9   17:aload_2         
		//   10   18:aload_3         
		//   11   19:putfield        #29  <Field RemoteViews Notification.contentView>
			NotificationCompat.addBigStyleToBuilderLollipop(((Notification) (notificationbuilderwithbuilderaccessor)), builder);
		//   12   22:aload_2         
		//   13   23:aload_1         
		//   14   24:invokestatic    #33  <Method void NotificationCompat.access$700(Notification, android.support.v4.app.NotificationCompat$Builder)>
			NotificationCompat.addHeadsUpToBuilderLollipop(((Notification) (notificationbuilderwithbuilderaccessor)), builder);
		//   15   27:aload_2         
		//   16   28:aload_1         
		//   17   29:invokestatic    #36  <Method void NotificationCompat.access$800(Notification, android.support.v4.app.NotificationCompat$Builder)>
			return ((Notification) (notificationbuilderwithbuilderaccessor));
		//   18   32:aload_2         
		//   19   33:areturn         
		}

		LollipopExtender()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void android.support.v4.app.NotificationCompat$BuilderExtender()>
		//    2    4:return          
		}
	}

	public static class MediaStyle extends android.support.v4.app.Style
	{

		public MediaStyle setCancelButtonIntent(PendingIntent pendingintent)
		{
			mCancelButtonIntent = pendingintent;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #30  <Field PendingIntent mCancelButtonIntent>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public MediaStyle setMediaSession(android.support.v4.media.session.MediaSessionCompat.Token token)
		{
			mToken = token;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #34  <Field android.support.v4.media.session.MediaSessionCompat$Token mToken>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public transient MediaStyle setShowActionsInCompactView(int ai[])
		{
			mActionsToShowInCompact = ai;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field int[] mActionsToShowInCompact>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public MediaStyle setShowCancelButton(boolean flag)
		{
			mShowCancelButton = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #40  <Field boolean mShowCancelButton>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		int mActionsToShowInCompact[];
		PendingIntent mCancelButtonIntent;
		boolean mShowCancelButton;
		android.support.v4.media.session.MediaSessionCompat.Token mToken;

		public MediaStyle()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void android.support.v4.app.NotificationCompat$Style()>
			mActionsToShowInCompact = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #21  <Field int[] mActionsToShowInCompact>
		//    5    9:return          
		}

		public MediaStyle(android.support.v4.app.Builder builder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void android.support.v4.app.NotificationCompat$Style()>
			mActionsToShowInCompact = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #21  <Field int[] mActionsToShowInCompact>
			setBuilder(builder);
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:invokevirtual   #26  <Method void setBuilder(android.support.v4.app.NotificationCompat$Builder)>
		//    8   14:return          
		}
	}


	public NotificationCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void android.support.v4.app.NotificationCompat()>
	//    2    4:return          
	}

	private static void addBigStyleToBuilderJellybean(Notification notification, android.support.v4.app.Builder builder)
	{
		if(builder.mStyle instanceof MediaStyle)
	//*   0    0:aload_1         
	//*   1    1:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//*   2    4:instanceof      #29  <Class NotificationCompat$MediaStyle>
	//*   3    7:ifeq            137
		{
			MediaStyle mediastyle = (MediaStyle)builder.mStyle;
	//    4   10:aload_1         
	//    5   11:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//    6   14:checkcast       #29  <Class NotificationCompat$MediaStyle>
	//    7   17:astore          4
			RemoteViews remoteviews;
			if(builder.getBigContentView() != null)
	//*   8   19:aload_1         
	//*   9   20:invokevirtual   #89  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getBigContentView()>
	//*  10   23:ifnull          34
				remoteviews = builder.getBigContentView();
	//   11   26:aload_1         
	//   12   27:invokevirtual   #89  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getBigContentView()>
	//   13   30:astore_3        
			else
	//*  14   31:goto            39
				remoteviews = builder.getContentView();
	//   15   34:aload_1         
	//   16   35:invokevirtual   #92  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//   17   38:astore_3        
			boolean flag;
			if((builder.mStyle instanceof DecoratedMediaCustomViewStyle) && remoteviews != null)
	//*  18   39:aload_1         
	//*  19   40:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//*  20   43:instanceof      #17  <Class NotificationCompat$DecoratedMediaCustomViewStyle>
	//*  21   46:ifeq            58
	//*  22   49:aload_3         
	//*  23   50:ifnull          58
				flag = true;
	//   24   53:iconst_1        
	//   25   54:istore_2        
			else
	//*  26   55:goto            60
				flag = false;
	//   27   58:iconst_0        
	//   28   59:istore_2        
			NotificationCompatImplBase.overrideMediaBigContentView(notification, builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mNumber, builder.mLargeIcon, builder.mSubText, builder.mUseChronometer, builder.getWhenIfShowing(), builder.getPriority(), 0, ((List) (builder.mActions)), mediastyle.mShowCancelButton, mediastyle.mCancelButtonIntent, flag);
	//   29   60:aload_0         
	//   30   61:aload_1         
	//   31   62:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   32   65:aload_1         
	//   33   66:getfield        #100 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentTitle>
	//   34   69:aload_1         
	//   35   70:getfield        #103 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentText>
	//   36   73:aload_1         
	//   37   74:getfield        #106 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentInfo>
	//   38   77:aload_1         
	//   39   78:getfield        #110 <Field int android.support.v4.app.NotificationCompat$Builder.mNumber>
	//   40   81:aload_1         
	//   41   82:getfield        #114 <Field android.graphics.Bitmap android.support.v4.app.NotificationCompat$Builder.mLargeIcon>
	//   42   85:aload_1         
	//   43   86:getfield        #117 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mSubText>
	//   44   89:aload_1         
	//   45   90:getfield        #121 <Field boolean android.support.v4.app.NotificationCompat$Builder.mUseChronometer>
	//   46   93:aload_1         
	//   47   94:invokevirtual   #125 <Method long android.support.v4.app.NotificationCompat$Builder.getWhenIfShowing()>
	//   48   97:aload_1         
	//   49   98:invokevirtual   #129 <Method int android.support.v4.app.NotificationCompat$Builder.getPriority()>
	//   50  101:iconst_0        
	//   51  102:aload_1         
	//   52  103:getfield        #133 <Field java.util.ArrayList android.support.v4.app.NotificationCompat$Builder.mActions>
	//   53  106:aload           4
	//   54  108:getfield        #136 <Field boolean NotificationCompat$MediaStyle.mShowCancelButton>
	//   55  111:aload           4
	//   56  113:getfield        #140 <Field PendingIntent NotificationCompat$MediaStyle.mCancelButtonIntent>
	//   57  116:iload_2         
	//   58  117:invokestatic    #146 <Method void NotificationCompatImplBase.overrideMediaBigContentView(Notification, Context, CharSequence, CharSequence, CharSequence, int, android.graphics.Bitmap, CharSequence, boolean, long, int, int, List, boolean, PendingIntent, boolean)>
			if(flag)
	//*  59  120:iload_2         
	//*  60  121:ifeq            136
				NotificationCompatImplBase.buildIntoRemoteViews(builder.mContext, notification.bigContentView, remoteviews);
	//   61  124:aload_1         
	//   62  125:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   63  128:aload_0         
	//   64  129:getfield        #152 <Field RemoteViews Notification.bigContentView>
	//   65  132:aload_3         
	//   66  133:invokestatic    #156 <Method void NotificationCompatImplBase.buildIntoRemoteViews(Context, RemoteViews, RemoteViews)>
			return;
	//   67  136:return          
		}
		if(builder.mStyle instanceof DecoratedCustomViewStyle)
	//*  68  137:aload_1         
	//*  69  138:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//*  70  141:instanceof      #14  <Class NotificationCompat$DecoratedCustomViewStyle>
	//*  71  144:ifeq            152
			addDecoratedBigStyleToBuilderJellybean(notification, builder);
	//   72  147:aload_0         
	//   73  148:aload_1         
	//   74  149:invokestatic    #159 <Method void addDecoratedBigStyleToBuilderJellybean(Notification, android.support.v4.app.NotificationCompat$Builder)>
	//   75  152:return          
	}

	private static void addBigStyleToBuilderLollipop(Notification notification, android.support.v4.app.Builder builder)
	{
		RemoteViews remoteviews;
		if(builder.getBigContentView() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #89  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getBigContentView()>
	//*   2    4:ifnull          15
			remoteviews = builder.getBigContentView();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #89  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getBigContentView()>
	//    5   11:astore_2        
		else
	//*   6   12:goto            20
			remoteviews = builder.getContentView();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #92  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//    9   19:astore_2        
		if((builder.mStyle instanceof DecoratedMediaCustomViewStyle) && remoteviews != null)
	//*  10   20:aload_1         
	//*  11   21:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//*  12   24:instanceof      #17  <Class NotificationCompat$DecoratedMediaCustomViewStyle>
	//*  13   27:ifeq            114
	//*  14   30:aload_2         
	//*  15   31:ifnull          114
		{
			NotificationCompatImplBase.overrideMediaBigContentView(notification, builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mNumber, builder.mLargeIcon, builder.mSubText, builder.mUseChronometer, builder.getWhenIfShowing(), builder.getPriority(), 0, ((List) (builder.mActions)), false, ((PendingIntent) (null)), true);
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   19   39:aload_1         
	//   20   40:getfield        #100 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentTitle>
	//   21   43:aload_1         
	//   22   44:getfield        #103 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentText>
	//   23   47:aload_1         
	//   24   48:getfield        #106 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentInfo>
	//   25   51:aload_1         
	//   26   52:getfield        #110 <Field int android.support.v4.app.NotificationCompat$Builder.mNumber>
	//   27   55:aload_1         
	//   28   56:getfield        #114 <Field android.graphics.Bitmap android.support.v4.app.NotificationCompat$Builder.mLargeIcon>
	//   29   59:aload_1         
	//   30   60:getfield        #117 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mSubText>
	//   31   63:aload_1         
	//   32   64:getfield        #121 <Field boolean android.support.v4.app.NotificationCompat$Builder.mUseChronometer>
	//   33   67:aload_1         
	//   34   68:invokevirtual   #125 <Method long android.support.v4.app.NotificationCompat$Builder.getWhenIfShowing()>
	//   35   71:aload_1         
	//   36   72:invokevirtual   #129 <Method int android.support.v4.app.NotificationCompat$Builder.getPriority()>
	//   37   75:iconst_0        
	//   38   76:aload_1         
	//   39   77:getfield        #133 <Field java.util.ArrayList android.support.v4.app.NotificationCompat$Builder.mActions>
	//   40   80:iconst_0        
	//   41   81:aconst_null     
	//   42   82:iconst_1        
	//   43   83:invokestatic    #146 <Method void NotificationCompatImplBase.overrideMediaBigContentView(Notification, Context, CharSequence, CharSequence, CharSequence, int, android.graphics.Bitmap, CharSequence, boolean, long, int, int, List, boolean, PendingIntent, boolean)>
			NotificationCompatImplBase.buildIntoRemoteViews(builder.mContext, notification.bigContentView, remoteviews);
	//   44   86:aload_1         
	//   45   87:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   46   90:aload_0         
	//   47   91:getfield        #152 <Field RemoteViews Notification.bigContentView>
	//   48   94:aload_2         
	//   49   95:invokestatic    #156 <Method void NotificationCompatImplBase.buildIntoRemoteViews(Context, RemoteViews, RemoteViews)>
			setBackgroundColor(builder.mContext, notification.bigContentView, builder.getColor());
	//   50   98:aload_1         
	//   51   99:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   52  102:aload_0         
	//   53  103:getfield        #152 <Field RemoteViews Notification.bigContentView>
	//   54  106:aload_1         
	//   55  107:invokevirtual   #164 <Method int android.support.v4.app.NotificationCompat$Builder.getColor()>
	//   56  110:invokestatic    #168 <Method void setBackgroundColor(Context, RemoteViews, int)>
			return;
	//   57  113:return          
		}
		if(builder.mStyle instanceof DecoratedCustomViewStyle)
	//*  58  114:aload_1         
	//*  59  115:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//*  60  118:instanceof      #14  <Class NotificationCompat$DecoratedCustomViewStyle>
	//*  61  121:ifeq            129
			addDecoratedBigStyleToBuilderJellybean(notification, builder);
	//   62  124:aload_0         
	//   63  125:aload_1         
	//   64  126:invokestatic    #159 <Method void addDecoratedBigStyleToBuilderJellybean(Notification, android.support.v4.app.NotificationCompat$Builder)>
	//   65  129:return          
	}

	private static void addDecoratedBigStyleToBuilderJellybean(Notification notification, android.support.v4.app.Builder builder)
	{
		RemoteViews remoteviews = builder.getBigContentView();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #89  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getBigContentView()>
	//    2    4:astore_2        
		if(remoteviews == null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          12
	//*   5    9:goto            17
			remoteviews = builder.getContentView();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #92  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//    8   16:astore_2        
		if(remoteviews == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       22
		{
			return;
	//   11   21:return          
		} else
		{
			RemoteViews remoteviews1 = NotificationCompatImplBase.applyStandardTemplateWithActions(builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mNumber, notification.icon, builder.mLargeIcon, builder.mSubText, builder.mUseChronometer, builder.getWhenIfShowing(), builder.getPriority(), builder.getColor(), android.support.v7.appcompat.R.layout.notification_template_custom_big, false, builder.mActions);
	//   12   22:aload_1         
	//   13   23:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   14   26:aload_1         
	//   15   27:getfield        #100 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentTitle>
	//   16   30:aload_1         
	//   17   31:getfield        #103 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentText>
	//   18   34:aload_1         
	//   19   35:getfield        #106 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentInfo>
	//   20   38:aload_1         
	//   21   39:getfield        #110 <Field int android.support.v4.app.NotificationCompat$Builder.mNumber>
	//   22   42:aload_0         
	//   23   43:getfield        #171 <Field int Notification.icon>
	//   24   46:aload_1         
	//   25   47:getfield        #114 <Field android.graphics.Bitmap android.support.v4.app.NotificationCompat$Builder.mLargeIcon>
	//   26   50:aload_1         
	//   27   51:getfield        #117 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mSubText>
	//   28   54:aload_1         
	//   29   55:getfield        #121 <Field boolean android.support.v4.app.NotificationCompat$Builder.mUseChronometer>
	//   30   58:aload_1         
	//   31   59:invokevirtual   #125 <Method long android.support.v4.app.NotificationCompat$Builder.getWhenIfShowing()>
	//   32   62:aload_1         
	//   33   63:invokevirtual   #129 <Method int android.support.v4.app.NotificationCompat$Builder.getPriority()>
	//   34   66:aload_1         
	//   35   67:invokevirtual   #164 <Method int android.support.v4.app.NotificationCompat$Builder.getColor()>
	//   36   70:getstatic       #176 <Field int android.support.v7.appcompat.R$layout.notification_template_custom_big>
	//   37   73:iconst_0        
	//   38   74:aload_1         
	//   39   75:getfield        #133 <Field java.util.ArrayList android.support.v4.app.NotificationCompat$Builder.mActions>
	//   40   78:invokestatic    #180 <Method RemoteViews NotificationCompatImplBase.applyStandardTemplateWithActions(Context, CharSequence, CharSequence, CharSequence, int, int, android.graphics.Bitmap, CharSequence, boolean, long, int, int, int, boolean, java.util.ArrayList)>
	//   41   81:astore_3        
			NotificationCompatImplBase.buildIntoRemoteViews(builder.mContext, remoteviews1, remoteviews);
	//   42   82:aload_1         
	//   43   83:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   44   86:aload_3         
	//   45   87:aload_2         
	//   46   88:invokestatic    #156 <Method void NotificationCompatImplBase.buildIntoRemoteViews(Context, RemoteViews, RemoteViews)>
			notification.bigContentView = remoteviews1;
	//   47   91:aload_0         
	//   48   92:aload_3         
	//   49   93:putfield        #152 <Field RemoteViews Notification.bigContentView>
			return;
	//   50   96:return          
		}
	}

	private static void addDecoratedHeadsUpToBuilderLollipop(Notification notification, android.support.v4.app.Builder builder)
	{
		RemoteViews remoteviews1 = builder.getHeadsUpContentView();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #184 <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getHeadsUpContentView()>
	//    2    4:astore_3        
		RemoteViews remoteviews;
		if(remoteviews1 != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          14
			remoteviews = remoteviews1;
	//    5    9:aload_3         
	//    6   10:astore_2        
		else
	//*   7   11:goto            19
			remoteviews = builder.getContentView();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #92  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//   10   18:astore_2        
		if(remoteviews1 == null)
	//*  11   19:aload_3         
	//*  12   20:ifnonnull       24
		{
			return;
	//   13   23:return          
		} else
		{
			RemoteViews remoteviews2 = NotificationCompatImplBase.applyStandardTemplateWithActions(builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mNumber, notification.icon, builder.mLargeIcon, builder.mSubText, builder.mUseChronometer, builder.getWhenIfShowing(), builder.getPriority(), builder.getColor(), android.support.v7.appcompat.R.layout.notification_template_custom_big, false, builder.mActions);
	//   14   24:aload_1         
	//   15   25:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   16   28:aload_1         
	//   17   29:getfield        #100 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentTitle>
	//   18   32:aload_1         
	//   19   33:getfield        #103 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentText>
	//   20   36:aload_1         
	//   21   37:getfield        #106 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentInfo>
	//   22   40:aload_1         
	//   23   41:getfield        #110 <Field int android.support.v4.app.NotificationCompat$Builder.mNumber>
	//   24   44:aload_0         
	//   25   45:getfield        #171 <Field int Notification.icon>
	//   26   48:aload_1         
	//   27   49:getfield        #114 <Field android.graphics.Bitmap android.support.v4.app.NotificationCompat$Builder.mLargeIcon>
	//   28   52:aload_1         
	//   29   53:getfield        #117 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mSubText>
	//   30   56:aload_1         
	//   31   57:getfield        #121 <Field boolean android.support.v4.app.NotificationCompat$Builder.mUseChronometer>
	//   32   60:aload_1         
	//   33   61:invokevirtual   #125 <Method long android.support.v4.app.NotificationCompat$Builder.getWhenIfShowing()>
	//   34   64:aload_1         
	//   35   65:invokevirtual   #129 <Method int android.support.v4.app.NotificationCompat$Builder.getPriority()>
	//   36   68:aload_1         
	//   37   69:invokevirtual   #164 <Method int android.support.v4.app.NotificationCompat$Builder.getColor()>
	//   38   72:getstatic       #176 <Field int android.support.v7.appcompat.R$layout.notification_template_custom_big>
	//   39   75:iconst_0        
	//   40   76:aload_1         
	//   41   77:getfield        #133 <Field java.util.ArrayList android.support.v4.app.NotificationCompat$Builder.mActions>
	//   42   80:invokestatic    #180 <Method RemoteViews NotificationCompatImplBase.applyStandardTemplateWithActions(Context, CharSequence, CharSequence, CharSequence, int, int, android.graphics.Bitmap, CharSequence, boolean, long, int, int, int, boolean, java.util.ArrayList)>
	//   43   83:astore_3        
			NotificationCompatImplBase.buildIntoRemoteViews(builder.mContext, remoteviews2, remoteviews);
	//   44   84:aload_1         
	//   45   85:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   46   88:aload_3         
	//   47   89:aload_2         
	//   48   90:invokestatic    #156 <Method void NotificationCompatImplBase.buildIntoRemoteViews(Context, RemoteViews, RemoteViews)>
			notification.headsUpContentView = remoteviews2;
	//   49   93:aload_0         
	//   50   94:aload_3         
	//   51   95:putfield        #187 <Field RemoteViews Notification.headsUpContentView>
			return;
	//   52   98:return          
		}
	}

	private static void addHeadsUpToBuilderLollipop(Notification notification, android.support.v4.app.Builder builder)
	{
		RemoteViews remoteviews;
		if(builder.getHeadsUpContentView() != null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #184 <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getHeadsUpContentView()>
	//*   2    4:ifnull          15
			remoteviews = builder.getHeadsUpContentView();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #184 <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getHeadsUpContentView()>
	//    5   11:astore_2        
		else
	//*   6   12:goto            20
			remoteviews = builder.getContentView();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #92  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//    9   19:astore_2        
		if((builder.mStyle instanceof DecoratedMediaCustomViewStyle) && remoteviews != null)
	//*  10   20:aload_1         
	//*  11   21:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//*  12   24:instanceof      #17  <Class NotificationCompat$DecoratedMediaCustomViewStyle>
	//*  13   27:ifeq            117
	//*  14   30:aload_2         
	//*  15   31:ifnull          117
		{
			notification.headsUpContentView = NotificationCompatImplBase.generateMediaBigView(builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mNumber, builder.mLargeIcon, builder.mSubText, builder.mUseChronometer, builder.getWhenIfShowing(), builder.getPriority(), 0, ((List) (builder.mActions)), false, ((PendingIntent) (null)), true);
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   19   39:aload_1         
	//   20   40:getfield        #100 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentTitle>
	//   21   43:aload_1         
	//   22   44:getfield        #103 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentText>
	//   23   47:aload_1         
	//   24   48:getfield        #106 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentInfo>
	//   25   51:aload_1         
	//   26   52:getfield        #110 <Field int android.support.v4.app.NotificationCompat$Builder.mNumber>
	//   27   55:aload_1         
	//   28   56:getfield        #114 <Field android.graphics.Bitmap android.support.v4.app.NotificationCompat$Builder.mLargeIcon>
	//   29   59:aload_1         
	//   30   60:getfield        #117 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mSubText>
	//   31   63:aload_1         
	//   32   64:getfield        #121 <Field boolean android.support.v4.app.NotificationCompat$Builder.mUseChronometer>
	//   33   67:aload_1         
	//   34   68:invokevirtual   #125 <Method long android.support.v4.app.NotificationCompat$Builder.getWhenIfShowing()>
	//   35   71:aload_1         
	//   36   72:invokevirtual   #129 <Method int android.support.v4.app.NotificationCompat$Builder.getPriority()>
	//   37   75:iconst_0        
	//   38   76:aload_1         
	//   39   77:getfield        #133 <Field java.util.ArrayList android.support.v4.app.NotificationCompat$Builder.mActions>
	//   40   80:iconst_0        
	//   41   81:aconst_null     
	//   42   82:iconst_1        
	//   43   83:invokestatic    #191 <Method RemoteViews NotificationCompatImplBase.generateMediaBigView(Context, CharSequence, CharSequence, CharSequence, int, android.graphics.Bitmap, CharSequence, boolean, long, int, int, List, boolean, PendingIntent, boolean)>
	//   44   86:putfield        #187 <Field RemoteViews Notification.headsUpContentView>
			NotificationCompatImplBase.buildIntoRemoteViews(builder.mContext, notification.headsUpContentView, remoteviews);
	//   45   89:aload_1         
	//   46   90:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   47   93:aload_0         
	//   48   94:getfield        #187 <Field RemoteViews Notification.headsUpContentView>
	//   49   97:aload_2         
	//   50   98:invokestatic    #156 <Method void NotificationCompatImplBase.buildIntoRemoteViews(Context, RemoteViews, RemoteViews)>
			setBackgroundColor(builder.mContext, notification.headsUpContentView, builder.getColor());
	//   51  101:aload_1         
	//   52  102:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   53  105:aload_0         
	//   54  106:getfield        #187 <Field RemoteViews Notification.headsUpContentView>
	//   55  109:aload_1         
	//   56  110:invokevirtual   #164 <Method int android.support.v4.app.NotificationCompat$Builder.getColor()>
	//   57  113:invokestatic    #168 <Method void setBackgroundColor(Context, RemoteViews, int)>
			return;
	//   58  116:return          
		}
		if(builder.mStyle instanceof DecoratedCustomViewStyle)
	//*  59  117:aload_1         
	//*  60  118:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//*  61  121:instanceof      #14  <Class NotificationCompat$DecoratedCustomViewStyle>
	//*  62  124:ifeq            132
			addDecoratedHeadsUpToBuilderLollipop(notification, builder);
	//   63  127:aload_0         
	//   64  128:aload_1         
	//   65  129:invokestatic    #193 <Method void addDecoratedHeadsUpToBuilderLollipop(Notification, android.support.v4.app.NotificationCompat$Builder)>
	//   66  132:return          
	}

	private static void addMessagingFallBackStyle(android.support.v4.app.MessagingStyle messagingstyle, NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, android.support.v4.app.Builder builder)
	{
		SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
	//    0    0:new             #197 <Class SpannableStringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #198 <Method void SpannableStringBuilder()>
	//    3    7:astore          6
		List list = messagingstyle.getMessages();
	//    4    9:aload_0         
	//    5   10:invokevirtual   #204 <Method List android.support.v4.app.NotificationCompat$MessagingStyle.getMessages()>
	//    6   13:astore          7
		boolean flag;
		if(messagingstyle.getConversationTitle() != null || hasMessagesWithoutSender(messagingstyle.getMessages()))
	//*   7   15:aload_0         
	//*   8   16:invokevirtual   #208 <Method CharSequence android.support.v4.app.NotificationCompat$MessagingStyle.getConversationTitle()>
	//*   9   19:ifnonnull       32
	//*  10   22:aload_0         
	//*  11   23:invokevirtual   #204 <Method List android.support.v4.app.NotificationCompat$MessagingStyle.getMessages()>
	//*  12   26:invokestatic    #212 <Method boolean hasMessagesWithoutSender(List)>
	//*  13   29:ifeq            37
			flag = true;
	//   14   32:iconst_1        
	//   15   33:istore_3        
		else
	//*  16   34:goto            39
			flag = false;
	//   17   37:iconst_0        
	//   18   38:istore_3        
		for(int i = list.size() - 1; i >= 0; i--)
	//*  19   39:aload           7
	//*  20   41:invokeinterface #217 <Method int List.size()>
	//*  21   46:iconst_1        
	//*  22   47:isub            
	//*  23   48:istore          4
	//*  24   50:iload           4
	//*  25   52:iflt            133
		{
			Object obj = ((Object) ((android.support.v4.app.MessagingStyle.Message)list.get(i)));
	//   26   55:aload           7
	//   27   57:iload           4
	//   28   59:invokeinterface #221 <Method Object List.get(int)>
	//   29   64:checkcast       #223 <Class android.support.v4.app.NotificationCompat$MessagingStyle$Message>
	//   30   67:astore          5
			if(flag)
	//*  31   69:iload_3         
	//*  32   70:ifeq            85
				obj = ((Object) (makeMessageLine(builder, messagingstyle, ((android.support.v4.app.MessagingStyle.Message) (obj)))));
	//   33   73:aload_2         
	//   34   74:aload_0         
	//   35   75:aload           5
	//   36   77:invokestatic    #45  <Method CharSequence makeMessageLine(android.support.v4.app.NotificationCompat$Builder, android.support.v4.app.NotificationCompat$MessagingStyle, android.support.v4.app.NotificationCompat$MessagingStyle$Message)>
	//   37   80:astore          5
			else
	//*  38   82:goto            92
				obj = ((Object) (((android.support.v4.app.MessagingStyle.Message) (obj)).getText()));
	//   39   85:aload           5
	//   40   87:invokevirtual   #226 <Method CharSequence android.support.v4.app.NotificationCompat$MessagingStyle$Message.getText()>
	//   41   90:astore          5
			if(i != list.size() - 1)
	//*  42   92:iload           4
	//*  43   94:aload           7
	//*  44   96:invokeinterface #217 <Method int List.size()>
	//*  45  101:iconst_1        
	//*  46  102:isub            
	//*  47  103:icmpeq          115
				spannablestringbuilder.insert(0, "\n");
	//   48  106:aload           6
	//   49  108:iconst_0        
	//   50  109:ldc1            #228 <String "\n">
	//   51  111:invokevirtual   #232 <Method SpannableStringBuilder SpannableStringBuilder.insert(int, CharSequence)>
	//   52  114:pop             
			spannablestringbuilder.insert(0, ((CharSequence) (obj)));
	//   53  115:aload           6
	//   54  117:iconst_0        
	//   55  118:aload           5
	//   56  120:invokevirtual   #232 <Method SpannableStringBuilder SpannableStringBuilder.insert(int, CharSequence)>
	//   57  123:pop             
		}

	//   58  124:iload           4
	//   59  126:iconst_1        
	//   60  127:isub            
	//   61  128:istore          4
	//*  62  130:goto            50
		NotificationCompatImplJellybean.addBigTextStyle(notificationbuilderwithbuilderaccessor, ((CharSequence) (spannablestringbuilder)));
	//   63  133:aload_1         
	//   64  134:aload           6
	//   65  136:invokestatic    #238 <Method void NotificationCompatImplJellybean.addBigTextStyle(NotificationBuilderWithBuilderAccessor, CharSequence)>
	//   66  139:return          
	}

	private static RemoteViews addStyleGetContentViewIcs(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, android.support.v4.app.Builder builder)
	{
		if(builder.mStyle instanceof MediaStyle)
	//*   0    0:aload_1         
	//*   1    1:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//*   2    4:instanceof      #29  <Class NotificationCompat$MediaStyle>
	//*   3    7:ifeq            125
		{
			MediaStyle mediastyle = (MediaStyle)builder.mStyle;
	//    4   10:aload_1         
	//    5   11:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//    6   14:checkcast       #29  <Class NotificationCompat$MediaStyle>
	//    7   17:astore_3        
			boolean flag;
			if((builder.mStyle instanceof DecoratedMediaCustomViewStyle) && builder.getContentView() != null)
	//*   8   18:aload_1         
	//*   9   19:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//*  10   22:instanceof      #17  <Class NotificationCompat$DecoratedMediaCustomViewStyle>
	//*  11   25:ifeq            40
	//*  12   28:aload_1         
	//*  13   29:invokevirtual   #92  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//*  14   32:ifnull          40
				flag = true;
	//   15   35:iconst_1        
	//   16   36:istore_2        
			else
	//*  17   37:goto            42
				flag = false;
	//   18   40:iconst_0        
	//   19   41:istore_2        
			notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (NotificationCompatImplBase.overrideContentViewMedia(notificationbuilderwithbuilderaccessor, builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mNumber, builder.mLargeIcon, builder.mSubText, builder.mUseChronometer, builder.getWhenIfShowing(), builder.getPriority(), ((List) (builder.mActions)), mediastyle.mActionsToShowInCompact, mediastyle.mShowCancelButton, mediastyle.mCancelButtonIntent, flag)));
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   23   47:aload_1         
	//   24   48:getfield        #100 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentTitle>
	//   25   51:aload_1         
	//   26   52:getfield        #103 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentText>
	//   27   55:aload_1         
	//   28   56:getfield        #106 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentInfo>
	//   29   59:aload_1         
	//   30   60:getfield        #110 <Field int android.support.v4.app.NotificationCompat$Builder.mNumber>
	//   31   63:aload_1         
	//   32   64:getfield        #114 <Field android.graphics.Bitmap android.support.v4.app.NotificationCompat$Builder.mLargeIcon>
	//   33   67:aload_1         
	//   34   68:getfield        #117 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mSubText>
	//   35   71:aload_1         
	//   36   72:getfield        #121 <Field boolean android.support.v4.app.NotificationCompat$Builder.mUseChronometer>
	//   37   75:aload_1         
	//   38   76:invokevirtual   #125 <Method long android.support.v4.app.NotificationCompat$Builder.getWhenIfShowing()>
	//   39   79:aload_1         
	//   40   80:invokevirtual   #129 <Method int android.support.v4.app.NotificationCompat$Builder.getPriority()>
	//   41   83:aload_1         
	//   42   84:getfield        #133 <Field java.util.ArrayList android.support.v4.app.NotificationCompat$Builder.mActions>
	//   43   87:aload_3         
	//   44   88:getfield        #243 <Field int[] NotificationCompat$MediaStyle.mActionsToShowInCompact>
	//   45   91:aload_3         
	//   46   92:getfield        #136 <Field boolean NotificationCompat$MediaStyle.mShowCancelButton>
	//   47   95:aload_3         
	//   48   96:getfield        #140 <Field PendingIntent NotificationCompat$MediaStyle.mCancelButtonIntent>
	//   49   99:iload_2         
	//   50  100:invokestatic    #247 <Method RemoteViews NotificationCompatImplBase.overrideContentViewMedia(NotificationBuilderWithBuilderAccessor, Context, CharSequence, CharSequence, CharSequence, int, android.graphics.Bitmap, CharSequence, boolean, long, int, List, int[], boolean, PendingIntent, boolean)>
	//   51  103:astore_0        
			if(flag)
	//*  52  104:iload_2         
	//*  53  105:ifeq            122
			{
				NotificationCompatImplBase.buildIntoRemoteViews(builder.mContext, ((RemoteViews) (notificationbuilderwithbuilderaccessor)), builder.getContentView());
	//   54  108:aload_1         
	//   55  109:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   56  112:aload_0         
	//   57  113:aload_1         
	//   58  114:invokevirtual   #92  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//   59  117:invokestatic    #156 <Method void NotificationCompatImplBase.buildIntoRemoteViews(Context, RemoteViews, RemoteViews)>
				return ((RemoteViews) (notificationbuilderwithbuilderaccessor));
	//   60  120:aload_0         
	//   61  121:areturn         
			}
		} else
	//*  62  122:goto            140
		if(builder.mStyle instanceof DecoratedCustomViewStyle)
	//*  63  125:aload_1         
	//*  64  126:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//*  65  129:instanceof      #14  <Class NotificationCompat$DecoratedCustomViewStyle>
	//*  66  132:ifeq            140
			return getDecoratedContentView(builder);
	//   67  135:aload_1         
	//   68  136:invokestatic    #251 <Method RemoteViews getDecoratedContentView(android.support.v4.app.NotificationCompat$Builder)>
	//   69  139:areturn         
		return null;
	//   70  140:aconst_null     
	//   71  141:areturn         
	}

	private static RemoteViews addStyleGetContentViewJellybean(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, android.support.v4.app.Builder builder)
	{
		if(builder.mStyle instanceof android.support.v4.app.MessagingStyle)
	//*   0    0:aload_1         
	//*   1    1:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//*   2    4:instanceof      #200 <Class android.support.v4.app.NotificationCompat$MessagingStyle>
	//*   3    7:ifeq            22
			addMessagingFallBackStyle((android.support.v4.app.MessagingStyle)builder.mStyle, notificationbuilderwithbuilderaccessor, builder);
	//    4   10:aload_1         
	//    5   11:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//    6   14:checkcast       #200 <Class android.support.v4.app.NotificationCompat$MessagingStyle>
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokestatic    #253 <Method void addMessagingFallBackStyle(android.support.v4.app.NotificationCompat$MessagingStyle, NotificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationCompat$Builder)>
		return addStyleGetContentViewIcs(notificationbuilderwithbuilderaccessor, builder);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokestatic    #50  <Method RemoteViews addStyleGetContentViewIcs(NotificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationCompat$Builder)>
	//   13   27:areturn         
	}

	private static RemoteViews addStyleGetContentViewLollipop(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, android.support.v4.app.Builder builder)
	{
		if(builder.mStyle instanceof MediaStyle)
	//*   0    0:aload_1         
	//*   1    1:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//*   2    4:instanceof      #29  <Class NotificationCompat$MediaStyle>
	//*   3    7:ifeq            220
		{
			MediaStyle mediastyle = (MediaStyle)builder.mStyle;
	//    4   10:aload_1         
	//    5   11:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//    6   14:checkcast       #29  <Class NotificationCompat$MediaStyle>
	//    7   17:astore          5
			int ai[] = mediastyle.mActionsToShowInCompact;
	//    8   19:aload           5
	//    9   21:getfield        #243 <Field int[] NotificationCompat$MediaStyle.mActionsToShowInCompact>
	//   10   24:astore          6
			Object obj;
			if(mediastyle.mToken != null)
	//*  11   26:aload           5
	//*  12   28:getfield        #257 <Field android.support.v4.media.session.MediaSessionCompat$Token NotificationCompat$MediaStyle.mToken>
	//*  13   31:ifnull          47
				obj = mediastyle.mToken.getToken();
	//   14   34:aload           5
	//   15   36:getfield        #257 <Field android.support.v4.media.session.MediaSessionCompat$Token NotificationCompat$MediaStyle.mToken>
	//   16   39:invokevirtual   #263 <Method Object android.support.v4.media.session.MediaSessionCompat$Token.getToken()>
	//   17   42:astore          4
			else
	//*  18   44:goto            50
				obj = null;
	//   19   47:aconst_null     
	//   20   48:astore          4
			NotificationCompatImpl21.addMediaStyle(notificationbuilderwithbuilderaccessor, ai, obj);
	//   21   50:aload_0         
	//   22   51:aload           6
	//   23   53:aload           4
	//   24   55:invokestatic    #269 <Method void NotificationCompatImpl21.addMediaStyle(NotificationBuilderWithBuilderAccessor, int[], Object)>
			boolean flag1;
			if(builder.getContentView() != null)
	//*  25   58:aload_1         
	//*  26   59:invokevirtual   #92  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//*  27   62:ifnull          70
				flag1 = true;
	//   28   65:iconst_1        
	//   29   66:istore_3        
			else
	//*  30   67:goto            72
				flag1 = false;
	//   31   70:iconst_0        
	//   32   71:istore_3        
			boolean flag;
			if(android.os.Build.VERSION.SDK_INT >= 21 && android.os.Build.VERSION.SDK_INT <= 23)
	//*  33   72:getstatic       #274 <Field int android.os.Build$VERSION.SDK_INT>
	//*  34   75:bipush          21
	//*  35   77:icmplt          93
	//*  36   80:getstatic       #274 <Field int android.os.Build$VERSION.SDK_INT>
	//*  37   83:bipush          23
	//*  38   85:icmpgt          93
				flag = true;
	//   39   88:iconst_1        
	//   40   89:istore_2        
			else
	//*  41   90:goto            95
				flag = false;
	//   42   93:iconst_0        
	//   43   94:istore_2        
			if(flag1 || flag && builder.getBigContentView() != null)
	//*  44   95:iload_3         
	//*  45   96:ifne            110
	//*  46   99:iload_2         
	//*  47  100:ifeq            115
	//*  48  103:aload_1         
	//*  49  104:invokevirtual   #89  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getBigContentView()>
	//*  50  107:ifnull          115
				flag = true;
	//   51  110:iconst_1        
	//   52  111:istore_2        
			else
	//*  53  112:goto            117
				flag = false;
	//   54  115:iconst_0        
	//   55  116:istore_2        
			if((builder.mStyle instanceof DecoratedMediaCustomViewStyle) && flag)
	//*  56  117:aload_1         
	//*  57  118:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//*  58  121:instanceof      #17  <Class NotificationCompat$DecoratedMediaCustomViewStyle>
	//*  59  124:ifeq            218
	//*  60  127:iload_2         
	//*  61  128:ifeq            218
			{
				notificationbuilderwithbuilderaccessor = ((NotificationBuilderWithBuilderAccessor) (NotificationCompatImplBase.overrideContentViewMedia(notificationbuilderwithbuilderaccessor, builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mNumber, builder.mLargeIcon, builder.mSubText, builder.mUseChronometer, builder.getWhenIfShowing(), builder.getPriority(), ((List) (builder.mActions)), mediastyle.mActionsToShowInCompact, false, ((PendingIntent) (null)), flag1)));
	//   62  131:aload_0         
	//   63  132:aload_1         
	//   64  133:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   65  136:aload_1         
	//   66  137:getfield        #100 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentTitle>
	//   67  140:aload_1         
	//   68  141:getfield        #103 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentText>
	//   69  144:aload_1         
	//   70  145:getfield        #106 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentInfo>
	//   71  148:aload_1         
	//   72  149:getfield        #110 <Field int android.support.v4.app.NotificationCompat$Builder.mNumber>
	//   73  152:aload_1         
	//   74  153:getfield        #114 <Field android.graphics.Bitmap android.support.v4.app.NotificationCompat$Builder.mLargeIcon>
	//   75  156:aload_1         
	//   76  157:getfield        #117 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mSubText>
	//   77  160:aload_1         
	//   78  161:getfield        #121 <Field boolean android.support.v4.app.NotificationCompat$Builder.mUseChronometer>
	//   79  164:aload_1         
	//   80  165:invokevirtual   #125 <Method long android.support.v4.app.NotificationCompat$Builder.getWhenIfShowing()>
	//   81  168:aload_1         
	//   82  169:invokevirtual   #129 <Method int android.support.v4.app.NotificationCompat$Builder.getPriority()>
	//   83  172:aload_1         
	//   84  173:getfield        #133 <Field java.util.ArrayList android.support.v4.app.NotificationCompat$Builder.mActions>
	//   85  176:aload           5
	//   86  178:getfield        #243 <Field int[] NotificationCompat$MediaStyle.mActionsToShowInCompact>
	//   87  181:iconst_0        
	//   88  182:aconst_null     
	//   89  183:iload_3         
	//   90  184:invokestatic    #247 <Method RemoteViews NotificationCompatImplBase.overrideContentViewMedia(NotificationBuilderWithBuilderAccessor, Context, CharSequence, CharSequence, CharSequence, int, android.graphics.Bitmap, CharSequence, boolean, long, int, List, int[], boolean, PendingIntent, boolean)>
	//   91  187:astore_0        
				if(flag1)
	//*  92  188:iload_3         
	//*  93  189:ifeq            204
					NotificationCompatImplBase.buildIntoRemoteViews(builder.mContext, ((RemoteViews) (notificationbuilderwithbuilderaccessor)), builder.getContentView());
	//   94  192:aload_1         
	//   95  193:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   96  196:aload_0         
	//   97  197:aload_1         
	//   98  198:invokevirtual   #92  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//   99  201:invokestatic    #156 <Method void NotificationCompatImplBase.buildIntoRemoteViews(Context, RemoteViews, RemoteViews)>
				setBackgroundColor(builder.mContext, ((RemoteViews) (notificationbuilderwithbuilderaccessor)), builder.getColor());
	//  100  204:aload_1         
	//  101  205:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//  102  208:aload_0         
	//  103  209:aload_1         
	//  104  210:invokevirtual   #164 <Method int android.support.v4.app.NotificationCompat$Builder.getColor()>
	//  105  213:invokestatic    #168 <Method void setBackgroundColor(Context, RemoteViews, int)>
				return ((RemoteViews) (notificationbuilderwithbuilderaccessor));
	//  106  216:aload_0         
	//  107  217:areturn         
			} else
			{
				return null;
	//  108  218:aconst_null     
	//  109  219:areturn         
			}
		}
		if(builder.mStyle instanceof DecoratedCustomViewStyle)
	//* 110  220:aload_1         
	//* 111  221:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//* 112  224:instanceof      #14  <Class NotificationCompat$DecoratedCustomViewStyle>
	//* 113  227:ifeq            235
			return getDecoratedContentView(builder);
	//  114  230:aload_1         
	//  115  231:invokestatic    #251 <Method RemoteViews getDecoratedContentView(android.support.v4.app.NotificationCompat$Builder)>
	//  116  234:areturn         
		else
			return addStyleGetContentViewJellybean(notificationbuilderwithbuilderaccessor, builder);
	//  117  235:aload_0         
	//  118  236:aload_1         
	//  119  237:invokestatic    #54  <Method RemoteViews addStyleGetContentViewJellybean(NotificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationCompat$Builder)>
	//  120  240:areturn         
	}

	private static void addStyleToBuilderApi24(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, android.support.v4.app.Builder builder)
	{
		if(builder.mStyle instanceof DecoratedCustomViewStyle)
	//*   0    0:aload_1         
	//*   1    1:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//*   2    4:instanceof      #14  <Class NotificationCompat$DecoratedCustomViewStyle>
	//*   3    7:ifeq            15
		{
			NotificationCompatImpl24.addDecoratedCustomViewStyle(notificationbuilderwithbuilderaccessor);
	//    4   10:aload_0         
	//    5   11:invokestatic    #281 <Method void NotificationCompatImpl24.addDecoratedCustomViewStyle(NotificationBuilderWithBuilderAccessor)>
			return;
	//    6   14:return          
		}
		if(builder.mStyle instanceof DecoratedMediaCustomViewStyle)
	//*   7   15:aload_1         
	//*   8   16:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//*   9   19:instanceof      #17  <Class NotificationCompat$DecoratedMediaCustomViewStyle>
	//*  10   22:ifeq            30
		{
			NotificationCompatImpl24.addDecoratedMediaCustomViewStyle(notificationbuilderwithbuilderaccessor);
	//   11   25:aload_0         
	//   12   26:invokestatic    #284 <Method void NotificationCompatImpl24.addDecoratedMediaCustomViewStyle(NotificationBuilderWithBuilderAccessor)>
			return;
	//   13   29:return          
		}
		if(!(builder.mStyle instanceof android.support.v4.app.MessagingStyle))
	//*  14   30:aload_1         
	//*  15   31:getfield        #85  <Field android.support.v4.app.NotificationCompat$Style android.support.v4.app.NotificationCompat$Builder.mStyle>
	//*  16   34:instanceof      #200 <Class android.support.v4.app.NotificationCompat$MessagingStyle>
	//*  17   37:ifne            46
			addStyleGetContentViewLollipop(notificationbuilderwithbuilderaccessor, builder);
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:invokestatic    #63  <Method RemoteViews addStyleGetContentViewLollipop(NotificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationCompat$Builder)>
	//   21   45:pop             
	//   22   46:return          
	}

	private static android.support.v4.app.MessagingStyle.Message findLatestIncomingMessage(android.support.v4.app.MessagingStyle messagingstyle)
	{
		messagingstyle = ((android.support.v4.app.MessagingStyle) (messagingstyle.getMessages()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #204 <Method List android.support.v4.app.NotificationCompat$MessagingStyle.getMessages()>
	//    2    4:astore_0        
		for(int i = ((List) (messagingstyle)).size() - 1; i >= 0; i--)
	//*   3    5:aload_0         
	//*   4    6:invokeinterface #217 <Method int List.size()>
	//*   5   11:iconst_1        
	//*   6   12:isub            
	//*   7   13:istore_1        
	//*   8   14:iload_1         
	//*   9   15:iflt            48
		{
			android.support.v4.app.MessagingStyle.Message message = (android.support.v4.app.MessagingStyle.Message)((List) (messagingstyle)).get(i);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:invokeinterface #221 <Method Object List.get(int)>
	//   13   25:checkcast       #223 <Class android.support.v4.app.NotificationCompat$MessagingStyle$Message>
	//   14   28:astore_2        
			if(!TextUtils.isEmpty(message.getSender()))
	//*  15   29:aload_2         
	//*  16   30:invokevirtual   #287 <Method CharSequence android.support.v4.app.NotificationCompat$MessagingStyle$Message.getSender()>
	//*  17   33:invokestatic    #293 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   36:ifne            41
				return message;
	//   19   39:aload_2         
	//   20   40:areturn         
		}

	//   21   41:iload_1         
	//   22   42:iconst_1        
	//   23   43:isub            
	//   24   44:istore_1        
	//*  25   45:goto            14
		if(!((List) (messagingstyle)).isEmpty())
	//*  26   48:aload_0         
	//*  27   49:invokeinterface #296 <Method boolean List.isEmpty()>
	//*  28   54:ifne            75
			return (android.support.v4.app.MessagingStyle.Message)((List) (messagingstyle)).get(((List) (messagingstyle)).size() - 1);
	//   29   57:aload_0         
	//   30   58:aload_0         
	//   31   59:invokeinterface #217 <Method int List.size()>
	//   32   64:iconst_1        
	//   33   65:isub            
	//   34   66:invokeinterface #221 <Method Object List.get(int)>
	//   35   71:checkcast       #223 <Class android.support.v4.app.NotificationCompat$MessagingStyle$Message>
	//   36   74:areturn         
		else
			return null;
	//   37   75:aconst_null     
	//   38   76:areturn         
	}

	private static RemoteViews getDecoratedContentView(android.support.v4.app.Builder builder)
	{
		if(builder.getContentView() == null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #92  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//*   2    4:ifnonnull       9
		{
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		} else
		{
			RemoteViews remoteviews = NotificationCompatImplBase.applyStandardTemplateWithActions(builder.mContext, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mNumber, builder.mNotification.icon, builder.mLargeIcon, builder.mSubText, builder.mUseChronometer, builder.getWhenIfShowing(), builder.getPriority(), builder.getColor(), android.support.v7.appcompat.R.layout.notification_template_custom_big, false, ((java.util.ArrayList) (null)));
	//    5    9:aload_0         
	//    6   10:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//    7   13:aload_0         
	//    8   14:getfield        #100 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentTitle>
	//    9   17:aload_0         
	//   10   18:getfield        #103 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentText>
	//   11   21:aload_0         
	//   12   22:getfield        #106 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mContentInfo>
	//   13   25:aload_0         
	//   14   26:getfield        #110 <Field int android.support.v4.app.NotificationCompat$Builder.mNumber>
	//   15   29:aload_0         
	//   16   30:getfield        #300 <Field Notification android.support.v4.app.NotificationCompat$Builder.mNotification>
	//   17   33:getfield        #171 <Field int Notification.icon>
	//   18   36:aload_0         
	//   19   37:getfield        #114 <Field android.graphics.Bitmap android.support.v4.app.NotificationCompat$Builder.mLargeIcon>
	//   20   40:aload_0         
	//   21   41:getfield        #117 <Field CharSequence android.support.v4.app.NotificationCompat$Builder.mSubText>
	//   22   44:aload_0         
	//   23   45:getfield        #121 <Field boolean android.support.v4.app.NotificationCompat$Builder.mUseChronometer>
	//   24   48:aload_0         
	//   25   49:invokevirtual   #125 <Method long android.support.v4.app.NotificationCompat$Builder.getWhenIfShowing()>
	//   26   52:aload_0         
	//   27   53:invokevirtual   #129 <Method int android.support.v4.app.NotificationCompat$Builder.getPriority()>
	//   28   56:aload_0         
	//   29   57:invokevirtual   #164 <Method int android.support.v4.app.NotificationCompat$Builder.getColor()>
	//   30   60:getstatic       #176 <Field int android.support.v7.appcompat.R$layout.notification_template_custom_big>
	//   31   63:iconst_0        
	//   32   64:aconst_null     
	//   33   65:invokestatic    #180 <Method RemoteViews NotificationCompatImplBase.applyStandardTemplateWithActions(Context, CharSequence, CharSequence, CharSequence, int, int, android.graphics.Bitmap, CharSequence, boolean, long, int, int, int, boolean, java.util.ArrayList)>
	//   34   68:astore_1        
			NotificationCompatImplBase.buildIntoRemoteViews(builder.mContext, remoteviews, builder.getContentView());
	//   35   69:aload_0         
	//   36   70:getfield        #96  <Field Context android.support.v4.app.NotificationCompat$Builder.mContext>
	//   37   73:aload_1         
	//   38   74:aload_0         
	//   39   75:invokevirtual   #92  <Method RemoteViews android.support.v4.app.NotificationCompat$Builder.getContentView()>
	//   40   78:invokestatic    #156 <Method void NotificationCompatImplBase.buildIntoRemoteViews(Context, RemoteViews, RemoteViews)>
			return remoteviews;
	//   41   81:aload_1         
	//   42   82:areturn         
		}
	}

	public static android.support.v4.media.session.MediaSessionCompat.Token getMediaSession(Notification notification)
	{
		notification = ((Notification) (getExtras(notification)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #306 <Method Bundle getExtras(Notification)>
	//    2    4:astore_0        
		if(notification != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          82
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   5    9:getstatic       #274 <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          21
	//*   7   14:icmplt          37
			{
				notification = ((Notification) (((Bundle) (notification)).getParcelable("android.mediaSession")));
	//    8   17:aload_0         
	//    9   18:ldc2            #308 <String "android.mediaSession">
	//   10   21:invokevirtual   #314 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   11   24:astore_0        
				if(notification != null)
	//*  12   25:aload_0         
	//*  13   26:ifnull          34
					return android.support.v4.media.session.MediaSessionCompat.Token.fromToken(((Object) (notification)));
	//   14   29:aload_0         
	//   15   30:invokestatic    #318 <Method android.support.v4.media.session.MediaSessionCompat$Token android.support.v4.media.session.MediaSessionCompat$Token.fromToken(Object)>
	//   16   33:areturn         
			} else
	//*  17   34:goto            82
			{
				Object obj = ((Object) (BundleCompat.getBinder(((Bundle) (notification)), "android.mediaSession")));
	//   18   37:aload_0         
	//   19   38:ldc2            #308 <String "android.mediaSession">
	//   20   41:invokestatic    #324 <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//   21   44:astore_1        
				if(obj != null)
	//*  22   45:aload_1         
	//*  23   46:ifnull          82
				{
					notification = ((Notification) (Parcel.obtain()));
	//   24   49:invokestatic    #330 <Method Parcel Parcel.obtain()>
	//   25   52:astore_0        
					((Parcel) (notification)).writeStrongBinder(((android.os.IBinder) (obj)));
	//   26   53:aload_0         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #334 <Method void Parcel.writeStrongBinder(android.os.IBinder)>
					((Parcel) (notification)).setDataPosition(0);
	//   29   58:aload_0         
	//   30   59:iconst_0        
	//   31   60:invokevirtual   #338 <Method void Parcel.setDataPosition(int)>
					obj = ((Object) ((android.support.v4.media.session.MediaSessionCompat.Token)android.support.v4.media.session.MediaSessionCompat.Token.CREATOR.createFromParcel(((Parcel) (notification)))));
	//   32   63:getstatic       #342 <Field android.os.Parcelable$Creator android.support.v4.media.session.MediaSessionCompat$Token.CREATOR>
	//   33   66:aload_0         
	//   34   67:invokeinterface #348 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   35   72:checkcast       #259 <Class android.support.v4.media.session.MediaSessionCompat$Token>
	//   36   75:astore_1        
					((Parcel) (notification)).recycle();
	//   37   76:aload_0         
	//   38   77:invokevirtual   #351 <Method void Parcel.recycle()>
					return ((android.support.v4.media.session.MediaSessionCompat.Token) (obj));
	//   39   80:aload_1         
	//   40   81:areturn         
				}
			}
		return null;
	//   41   82:aconst_null     
	//   42   83:areturn         
	}

	private static boolean hasMessagesWithoutSender(List list)
	{
		for(int i = list.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #217 <Method int List.size()>
	//*   2    6:iconst_1        
	//*   3    7:isub            
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:iflt            38
			if(((android.support.v4.app.MessagingStyle.Message)list.get(i)).getSender() == null)
	//*   7   13:aload_0         
	//*   8   14:iload_1         
	//*   9   15:invokeinterface #221 <Method Object List.get(int)>
	//*  10   20:checkcast       #223 <Class android.support.v4.app.NotificationCompat$MessagingStyle$Message>
	//*  11   23:invokevirtual   #287 <Method CharSequence android.support.v4.app.NotificationCompat$MessagingStyle$Message.getSender()>
	//*  12   26:ifnonnull       31
				return true;
	//   13   29:iconst_1        
	//   14   30:ireturn         

	//   15   31:iload_1         
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:istore_1        
	//*  19   35:goto            9
		return false;
	//   20   38:iconst_0        
	//   21   39:ireturn         
	}

	private static TextAppearanceSpan makeFontColorSpan(int i)
	{
		return new TextAppearanceSpan(((String) (null)), 0, 0, ColorStateList.valueOf(i), ((ColorStateList) (null)));
	//    0    0:new             #357 <Class TextAppearanceSpan>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:iload_0         
	//    6    8:invokestatic    #363 <Method ColorStateList ColorStateList.valueOf(int)>
	//    7   11:aconst_null     
	//    8   12:invokespecial   #366 <Method void TextAppearanceSpan(String, int, int, ColorStateList, ColorStateList)>
	//    9   15:areturn         
	}

	private static CharSequence makeMessageLine(android.support.v4.app.Builder builder, android.support.v4.app.MessagingStyle messagingstyle, android.support.v4.app.MessagingStyle.Message message)
	{
		BidiFormatter bidiformatter = BidiFormatter.getInstance();
	//    0    0:invokestatic    #372 <Method BidiFormatter BidiFormatter.getInstance()>
	//    1    3:astore          7
		SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
	//    2    5:new             #197 <Class SpannableStringBuilder>
	//    3    8:dup             
	//    4    9:invokespecial   #198 <Method void SpannableStringBuilder()>
	//    5   12:astore          8
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   6   14:getstatic       #274 <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   17:bipush          21
	//*   8   19:icmplt          28
			flag = true;
	//    9   22:iconst_1        
	//   10   23:istore          4
		else
	//*  11   25:goto            31
			flag = false;
	//   12   28:iconst_0        
	//   13   29:istore          4
		int i;
		if(flag || android.os.Build.VERSION.SDK_INT <= 10)
	//*  14   31:iload           4
	//*  15   33:ifne            44
	//*  16   36:getstatic       #274 <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   39:bipush          10
	//*  18   41:icmpgt          51
			i = 0xff000000;
	//   19   44:ldc2            #373 <Int 0xff000000>
	//   20   47:istore_3        
		else
	//*  21   48:goto            53
			i = -1;
	//   22   51:iconst_m1       
	//   23   52:istore_3        
		Object obj = ((Object) (message.getSender()));
	//   24   53:aload_2         
	//   25   54:invokevirtual   #287 <Method CharSequence android.support.v4.app.NotificationCompat$MessagingStyle$Message.getSender()>
	//   26   57:astore          6
		int j = i;
	//   27   59:iload_3         
	//   28   60:istore          5
		if(TextUtils.isEmpty(message.getSender()))
	//*  29   62:aload_2         
	//*  30   63:invokevirtual   #287 <Method CharSequence android.support.v4.app.NotificationCompat$MessagingStyle$Message.getSender()>
	//*  31   66:invokestatic    #293 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  32   69:ifeq            117
		{
			if(messagingstyle.getUserDisplayName() == null)
	//*  33   72:aload_1         
	//*  34   73:invokevirtual   #376 <Method CharSequence android.support.v4.app.NotificationCompat$MessagingStyle.getUserDisplayName()>
	//*  35   76:ifnonnull       86
				messagingstyle = "";
	//   36   79:ldc2            #378 <String "">
	//   37   82:astore_1        
			else
	//*  38   83:goto            91
				messagingstyle = ((android.support.v4.app.MessagingStyle) (messagingstyle.getUserDisplayName()));
	//   39   86:aload_1         
	//   40   87:invokevirtual   #376 <Method CharSequence android.support.v4.app.NotificationCompat$MessagingStyle.getUserDisplayName()>
	//   41   90:astore_1        
			if(flag && builder.getColor() != 0)
	//*  42   91:iload           4
	//*  43   93:ifeq            111
	//*  44   96:aload_0         
	//*  45   97:invokevirtual   #164 <Method int android.support.v4.app.NotificationCompat$Builder.getColor()>
	//*  46  100:ifeq            111
				i = builder.getColor();
	//   47  103:aload_0         
	//   48  104:invokevirtual   #164 <Method int android.support.v4.app.NotificationCompat$Builder.getColor()>
	//   49  107:istore_3        
	//*  50  108:goto            111
			obj = ((Object) (messagingstyle));
	//   51  111:aload_1         
	//   52  112:astore          6
			j = i;
	//   53  114:iload_3         
	//   54  115:istore          5
		}
		builder = ((android.support.v4.app.Builder) (bidiformatter.unicodeWrap(((CharSequence) (obj)))));
	//   55  117:aload           7
	//   56  119:aload           6
	//   57  121:invokevirtual   #382 <Method CharSequence BidiFormatter.unicodeWrap(CharSequence)>
	//   58  124:astore_0        
		spannablestringbuilder.append(((CharSequence) (builder)));
	//   59  125:aload           8
	//   60  127:aload_0         
	//   61  128:invokevirtual   #386 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   62  131:pop             
		spannablestringbuilder.setSpan(((Object) (makeFontColorSpan(j))), spannablestringbuilder.length() - ((CharSequence) (builder)).length(), spannablestringbuilder.length(), 33);
	//   63  132:aload           8
	//   64  134:iload           5
	//   65  136:invokestatic    #388 <Method TextAppearanceSpan makeFontColorSpan(int)>
	//   66  139:aload           8
	//   67  141:invokevirtual   #391 <Method int SpannableStringBuilder.length()>
	//   68  144:aload_0         
	//   69  145:invokeinterface #394 <Method int CharSequence.length()>
	//   70  150:isub            
	//   71  151:aload           8
	//   72  153:invokevirtual   #391 <Method int SpannableStringBuilder.length()>
	//   73  156:bipush          33
	//   74  158:invokevirtual   #398 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		if(message.getText() == null)
	//*  75  161:aload_2         
	//*  76  162:invokevirtual   #226 <Method CharSequence android.support.v4.app.NotificationCompat$MessagingStyle$Message.getText()>
	//*  77  165:ifnonnull       175
			builder = "";
	//   78  168:ldc2            #378 <String "">
	//   79  171:astore_0        
		else
	//*  80  172:goto            180
			builder = ((android.support.v4.app.Builder) (message.getText()));
	//   81  175:aload_2         
	//   82  176:invokevirtual   #226 <Method CharSequence android.support.v4.app.NotificationCompat$MessagingStyle$Message.getText()>
	//   83  179:astore_0        
		spannablestringbuilder.append("  ").append(bidiformatter.unicodeWrap(((CharSequence) (builder))));
	//   84  180:aload           8
	//   85  182:ldc2            #400 <String "  ">
	//   86  185:invokevirtual   #386 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   87  188:aload           7
	//   88  190:aload_0         
	//   89  191:invokevirtual   #382 <Method CharSequence BidiFormatter.unicodeWrap(CharSequence)>
	//   90  194:invokevirtual   #386 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//   91  197:pop             
		return ((CharSequence) (spannablestringbuilder));
	//   92  198:aload           8
	//   93  200:areturn         
	}

	private static void setBackgroundColor(Context context, RemoteViews remoteviews, int i)
	{
		int j = i;
	//    0    0:iload_2         
	//    1    1:istore_3        
		if(i == 0)
	//*   2    2:iload_2         
	//*   3    3:ifne            17
			j = context.getResources().getColor(android.support.v7.appcompat.R.color.notification_material_background_media_default_color);
	//    4    6:aload_0         
	//    5    7:invokevirtual   #406 <Method Resources Context.getResources()>
	//    6   10:getstatic       #411 <Field int android.support.v7.appcompat.R$color.notification_material_background_media_default_color>
	//    7   13:invokevirtual   #416 <Method int Resources.getColor(int)>
	//    8   16:istore_3        
		remoteviews.setInt(android.support.v7.appcompat.R.id.status_bar_latest_event_content, "setBackgroundColor", j);
	//    9   17:aload_1         
	//   10   18:getstatic       #421 <Field int android.support.v7.appcompat.R$id.status_bar_latest_event_content>
	//   11   21:ldc2            #422 <String "setBackgroundColor">
	//   12   24:iload_3         
	//   13   25:invokevirtual   #428 <Method void RemoteViews.setInt(int, String, int)>
	//   14   28:return          
	}


/*
	static android.support.v4.app.MessagingStyle.Message access$000(android.support.v4.app.MessagingStyle messagingstyle)
	{
		return findLatestIncomingMessage(messagingstyle);
	//    0    0:aload_0         
	//    1    1:invokestatic    #40  <Method android.support.v4.app.NotificationCompat$MessagingStyle$Message findLatestIncomingMessage(android.support.v4.app.NotificationCompat$MessagingStyle)>
	//    2    4:areturn         
	}

*/


/*
	static CharSequence access$100(android.support.v4.app.Builder builder, android.support.v4.app.MessagingStyle messagingstyle, android.support.v4.app.MessagingStyle.Message message)
	{
		return makeMessageLine(builder, messagingstyle, message);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #45  <Method CharSequence makeMessageLine(android.support.v4.app.NotificationCompat$Builder, android.support.v4.app.NotificationCompat$MessagingStyle, android.support.v4.app.NotificationCompat$MessagingStyle$Message)>
	//    4    6:areturn         
	}

*/


/*
	static RemoteViews access$300(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, android.support.v4.app.Builder builder)
	{
		return addStyleGetContentViewIcs(notificationbuilderwithbuilderaccessor, builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #50  <Method RemoteViews addStyleGetContentViewIcs(NotificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationCompat$Builder)>
	//    3    5:areturn         
	}

*/


/*
	static RemoteViews access$400(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, android.support.v4.app.Builder builder)
	{
		return addStyleGetContentViewJellybean(notificationbuilderwithbuilderaccessor, builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #54  <Method RemoteViews addStyleGetContentViewJellybean(NotificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationCompat$Builder)>
	//    3    5:areturn         
	}

*/


/*
	static void access$500(Notification notification, android.support.v4.app.Builder builder)
	{
		addBigStyleToBuilderJellybean(notification, builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #59  <Method void addBigStyleToBuilderJellybean(Notification, android.support.v4.app.NotificationCompat$Builder)>
		return;
	//    3    5:return          
	}

*/


/*
	static RemoteViews access$600(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, android.support.v4.app.Builder builder)
	{
		return addStyleGetContentViewLollipop(notificationbuilderwithbuilderaccessor, builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #63  <Method RemoteViews addStyleGetContentViewLollipop(NotificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationCompat$Builder)>
	//    3    5:areturn         
	}

*/


/*
	static void access$700(Notification notification, android.support.v4.app.Builder builder)
	{
		addBigStyleToBuilderLollipop(notification, builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #67  <Method void addBigStyleToBuilderLollipop(Notification, android.support.v4.app.NotificationCompat$Builder)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$800(Notification notification, android.support.v4.app.Builder builder)
	{
		addHeadsUpToBuilderLollipop(notification, builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #71  <Method void addHeadsUpToBuilderLollipop(Notification, android.support.v4.app.NotificationCompat$Builder)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$900(NotificationBuilderWithBuilderAccessor notificationbuilderwithbuilderaccessor, android.support.v4.app.Builder builder)
	{
		addStyleToBuilderApi24(notificationbuilderwithbuilderaccessor, builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #76  <Method void addStyleToBuilderApi24(NotificationBuilderWithBuilderAccessor, android.support.v4.app.NotificationCompat$Builder)>
		return;
	//    3    5:return          
	}

*/
}
