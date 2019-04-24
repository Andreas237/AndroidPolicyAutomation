// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, RemoteInput, NotificationCompatKitKat

static class NotificationCompat$NotificationCompatApi19Impl extends NotificationCompat$NotificationCompatApi16Impl
{

	public Notification build(NotificationCompat.Builder builder, NotificationCompat.BuilderExtender builderextender)
	{
		NotificationCompatKitKat.Builder builder1 = new NotificationCompatKitKat.Builder(builder.mContext, builder.mNotification, builder.resolveTitle(), builder.resolveText(), builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mPeople, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey, builder.mContentView, builder.mBigContentView);
	//    0    0:new             #19  <Class NotificationCompatKitKat$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #25  <Field android.content.Context NotificationCompat$Builder.mContext>
	//    4    8:aload_1         
	//    5    9:getfield        #29  <Field Notification NotificationCompat$Builder.mNotification>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #33  <Method CharSequence NotificationCompat$Builder.resolveTitle()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #36  <Method CharSequence NotificationCompat$Builder.resolveText()>
	//   10   20:aload_1         
	//   11   21:getfield        #40  <Field CharSequence NotificationCompat$Builder.mContentInfo>
	//   12   24:aload_1         
	//   13   25:getfield        #44  <Field android.widget.RemoteViews NotificationCompat$Builder.mTickerView>
	//   14   28:aload_1         
	//   15   29:getfield        #48  <Field int NotificationCompat$Builder.mNumber>
	//   16   32:aload_1         
	//   17   33:getfield        #52  <Field android.app.PendingIntent NotificationCompat$Builder.mContentIntent>
	//   18   36:aload_1         
	//   19   37:getfield        #55  <Field android.app.PendingIntent NotificationCompat$Builder.mFullScreenIntent>
	//   20   40:aload_1         
	//   21   41:getfield        #59  <Field android.graphics.Bitmap NotificationCompat$Builder.mLargeIcon>
	//   22   44:aload_1         
	//   23   45:getfield        #62  <Field int NotificationCompat$Builder.mProgressMax>
	//   24   48:aload_1         
	//   25   49:getfield        #65  <Field int NotificationCompat$Builder.mProgress>
	//   26   52:aload_1         
	//   27   53:getfield        #69  <Field boolean NotificationCompat$Builder.mProgressIndeterminate>
	//   28   56:aload_1         
	//   29   57:getfield        #72  <Field boolean NotificationCompat$Builder.mShowWhen>
	//   30   60:aload_1         
	//   31   61:getfield        #75  <Field boolean NotificationCompat$Builder.mUseChronometer>
	//   32   64:aload_1         
	//   33   65:getfield        #78  <Field int NotificationCompat$Builder.mPriority>
	//   34   68:aload_1         
	//   35   69:getfield        #81  <Field CharSequence NotificationCompat$Builder.mSubText>
	//   36   72:aload_1         
	//   37   73:getfield        #84  <Field boolean NotificationCompat$Builder.mLocalOnly>
	//   38   76:aload_1         
	//   39   77:getfield        #88  <Field java.util.ArrayList NotificationCompat$Builder.mPeople>
	//   40   80:aload_1         
	//   41   81:getfield        #92  <Field Bundle NotificationCompat$Builder.mExtras>
	//   42   84:aload_1         
	//   43   85:getfield        #96  <Field String NotificationCompat$Builder.mGroupKey>
	//   44   88:aload_1         
	//   45   89:getfield        #99  <Field boolean NotificationCompat$Builder.mGroupSummary>
	//   46   92:aload_1         
	//   47   93:getfield        #102 <Field String NotificationCompat$Builder.mSortKey>
	//   48   96:aload_1         
	//   49   97:getfield        #105 <Field android.widget.RemoteViews NotificationCompat$Builder.mContentView>
	//   50  100:aload_1         
	//   51  101:getfield        #108 <Field android.widget.RemoteViews NotificationCompat$Builder.mBigContentView>
	//   52  104:invokespecial   #111 <Method void NotificationCompatKitKat$Builder(android.content.Context, Notification, CharSequence, CharSequence, CharSequence, android.widget.RemoteViews, int, android.app.PendingIntent, android.app.PendingIntent, android.graphics.Bitmap, int, int, boolean, boolean, boolean, int, CharSequence, boolean, java.util.ArrayList, Bundle, String, boolean, String, android.widget.RemoteViews, android.widget.RemoteViews)>
	//   53  107:astore_3        
		NotificationCompat.addActionsToBuilder(((NotificationBuilderWithActions) (builder1)), builder.mActions);
	//   54  108:aload_3         
	//   55  109:aload_1         
	//   56  110:getfield        #114 <Field java.util.ArrayList NotificationCompat$Builder.mActions>
	//   57  113:invokestatic    #118 <Method void NotificationCompat.addActionsToBuilder(NotificationBuilderWithActions, java.util.ArrayList)>
		NotificationCompat.addStyleToBuilderJellybean(((NotificationBuilderWithBuilderAccessor) (builder1)), builder.mStyle);
	//   58  116:aload_3         
	//   59  117:aload_1         
	//   60  118:getfield        #122 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   61  121:invokestatic    #126 <Method void NotificationCompat.addStyleToBuilderJellybean(NotificationBuilderWithBuilderAccessor, NotificationCompat$Style)>
		return builderextender.build(builder, ((NotificationBuilderWithBuilderAccessor) (builder1)));
	//   62  124:aload_2         
	//   63  125:aload_1         
	//   64  126:aload_3         
	//   65  127:invokevirtual   #131 <Method Notification NotificationCompat$BuilderExtender.build(NotificationCompat$Builder, NotificationBuilderWithBuilderAccessor)>
	//   66  130:areturn         
	}

	public NotificationCompat.Action getAction(Notification notification, int i)
	{
		return (NotificationCompat.Action)NotificationCompatKitKat.getAction(notification, i, NotificationCompat.Action.FACTORY, RemoteInput.FACTORY);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #139 <Field NotificationCompatBase$Action$Factory NotificationCompat$Action.FACTORY>
	//    3    5:getstatic       #144 <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
	//    4    8:invokestatic    #149 <Method NotificationCompatBase$Action NotificationCompatKitKat.getAction(Notification, int, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//    5   11:checkcast       #135 <Class NotificationCompat$Action>
	//    6   14:areturn         
	}

	public int getActionCount(Notification notification)
	{
		return NotificationCompatKitKat.getActionCount(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #153 <Method int NotificationCompatKitKat.getActionCount(Notification)>
	//    2    4:ireturn         
	}

	public Bundle getExtras(Notification notification)
	{
		return NotificationCompatKitKat.getExtras(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #157 <Method Bundle NotificationCompatKitKat.getExtras(Notification)>
	//    2    4:areturn         
	}

	public String getGroup(Notification notification)
	{
		return NotificationCompatKitKat.getGroup(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #161 <Method String NotificationCompatKitKat.getGroup(Notification)>
	//    2    4:areturn         
	}

	public boolean getLocalOnly(Notification notification)
	{
		return NotificationCompatKitKat.getLocalOnly(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #165 <Method boolean NotificationCompatKitKat.getLocalOnly(Notification)>
	//    2    4:ireturn         
	}

	public String getSortKey(Notification notification)
	{
		return NotificationCompatKitKat.getSortKey(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #168 <Method String NotificationCompatKitKat.getSortKey(Notification)>
	//    2    4:areturn         
	}

	public boolean isGroupSummary(Notification notification)
	{
		return NotificationCompatKitKat.isGroupSummary(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #171 <Method boolean NotificationCompatKitKat.isGroupSummary(Notification)>
	//    2    4:ireturn         
	}

	NotificationCompat$NotificationCompatApi19Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void NotificationCompat$NotificationCompatApi16Impl()>
	//    2    4:return          
	}
}
