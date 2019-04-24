// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, RemoteInput, NotificationCompatKitKat

static class NotificationCompat$NotificationCompatApi19Impl extends NotificationCompat$NotificationCompatApi16Impl
{

	public Notification build(NotificationCompat.Builder builder, NotificationCompat.BuilderExtender builderextender)
	{
		NotificationCompatKitKat.Builder builder1 = new NotificationCompatKitKat.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mPeople, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey, builder.mContentView, builder.mBigContentView);
	//    0    0:new             #19  <Class NotificationCompatKitKat$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #25  <Field android.content.Context NotificationCompat$Builder.mContext>
	//    4    8:aload_1         
	//    5    9:getfield        #29  <Field Notification NotificationCompat$Builder.mNotification>
	//    6   12:aload_1         
	//    7   13:getfield        #33  <Field CharSequence NotificationCompat$Builder.mContentTitle>
	//    8   16:aload_1         
	//    9   17:getfield        #36  <Field CharSequence NotificationCompat$Builder.mContentText>
	//   10   20:aload_1         
	//   11   21:getfield        #39  <Field CharSequence NotificationCompat$Builder.mContentInfo>
	//   12   24:aload_1         
	//   13   25:getfield        #43  <Field android.widget.RemoteViews NotificationCompat$Builder.mTickerView>
	//   14   28:aload_1         
	//   15   29:getfield        #47  <Field int NotificationCompat$Builder.mNumber>
	//   16   32:aload_1         
	//   17   33:getfield        #51  <Field android.app.PendingIntent NotificationCompat$Builder.mContentIntent>
	//   18   36:aload_1         
	//   19   37:getfield        #54  <Field android.app.PendingIntent NotificationCompat$Builder.mFullScreenIntent>
	//   20   40:aload_1         
	//   21   41:getfield        #58  <Field android.graphics.Bitmap NotificationCompat$Builder.mLargeIcon>
	//   22   44:aload_1         
	//   23   45:getfield        #61  <Field int NotificationCompat$Builder.mProgressMax>
	//   24   48:aload_1         
	//   25   49:getfield        #64  <Field int NotificationCompat$Builder.mProgress>
	//   26   52:aload_1         
	//   27   53:getfield        #68  <Field boolean NotificationCompat$Builder.mProgressIndeterminate>
	//   28   56:aload_1         
	//   29   57:getfield        #71  <Field boolean NotificationCompat$Builder.mShowWhen>
	//   30   60:aload_1         
	//   31   61:getfield        #74  <Field boolean NotificationCompat$Builder.mUseChronometer>
	//   32   64:aload_1         
	//   33   65:getfield        #77  <Field int NotificationCompat$Builder.mPriority>
	//   34   68:aload_1         
	//   35   69:getfield        #80  <Field CharSequence NotificationCompat$Builder.mSubText>
	//   36   72:aload_1         
	//   37   73:getfield        #83  <Field boolean NotificationCompat$Builder.mLocalOnly>
	//   38   76:aload_1         
	//   39   77:getfield        #87  <Field java.util.ArrayList NotificationCompat$Builder.mPeople>
	//   40   80:aload_1         
	//   41   81:getfield        #91  <Field android.os.Bundle NotificationCompat$Builder.mExtras>
	//   42   84:aload_1         
	//   43   85:getfield        #95  <Field String NotificationCompat$Builder.mGroupKey>
	//   44   88:aload_1         
	//   45   89:getfield        #98  <Field boolean NotificationCompat$Builder.mGroupSummary>
	//   46   92:aload_1         
	//   47   93:getfield        #101 <Field String NotificationCompat$Builder.mSortKey>
	//   48   96:aload_1         
	//   49   97:getfield        #104 <Field android.widget.RemoteViews NotificationCompat$Builder.mContentView>
	//   50  100:aload_1         
	//   51  101:getfield        #107 <Field android.widget.RemoteViews NotificationCompat$Builder.mBigContentView>
	//   52  104:invokespecial   #110 <Method void NotificationCompatKitKat$Builder(android.content.Context, Notification, CharSequence, CharSequence, CharSequence, android.widget.RemoteViews, int, android.app.PendingIntent, android.app.PendingIntent, android.graphics.Bitmap, int, int, boolean, boolean, boolean, int, CharSequence, boolean, java.util.ArrayList, android.os.Bundle, String, boolean, String, android.widget.RemoteViews, android.widget.RemoteViews)>
	//   53  107:astore_3        
		NotificationCompat.addActionsToBuilder(((NotificationBuilderWithActions) (builder1)), builder.mActions);
	//   54  108:aload_3         
	//   55  109:aload_1         
	//   56  110:getfield        #113 <Field java.util.ArrayList NotificationCompat$Builder.mActions>
	//   57  113:invokestatic    #117 <Method void NotificationCompat.addActionsToBuilder(NotificationBuilderWithActions, java.util.ArrayList)>
		if(builder.mStyle != null)
	//*  58  116:aload_1         
	//*  59  117:getfield        #121 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  60  120:ifnull          131
			builder.mStyle.apply(((NotificationBuilderWithBuilderAccessor) (builder1)));
	//   61  123:aload_1         
	//   62  124:getfield        #121 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   63  127:aload_3         
	//   64  128:invokevirtual   #127 <Method void NotificationCompat$Style.apply(NotificationBuilderWithBuilderAccessor)>
		return builderextender.build(builder, ((NotificationBuilderWithBuilderAccessor) (builder1)));
	//   65  131:aload_2         
	//   66  132:aload_1         
	//   67  133:aload_3         
	//   68  134:invokevirtual   #132 <Method Notification NotificationCompat$BuilderExtender.build(NotificationCompat$Builder, NotificationBuilderWithBuilderAccessor)>
	//   69  137:areturn         
	}

	public NotificationCompat.Action getAction(Notification notification, int i)
	{
		return (NotificationCompat.Action)NotificationCompatKitKat.getAction(notification, i, NotificationCompat.Action.FACTORY, RemoteInput.FACTORY);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #140 <Field NotificationCompatBase$Action$Factory NotificationCompat$Action.FACTORY>
	//    3    5:getstatic       #145 <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
	//    4    8:invokestatic    #150 <Method NotificationCompatBase$Action NotificationCompatKitKat.getAction(Notification, int, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//    5   11:checkcast       #136 <Class NotificationCompat$Action>
	//    6   14:areturn         
	}

	NotificationCompat$NotificationCompatApi19Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void NotificationCompat$NotificationCompatApi16Impl()>
	//    2    4:return          
	}
}
