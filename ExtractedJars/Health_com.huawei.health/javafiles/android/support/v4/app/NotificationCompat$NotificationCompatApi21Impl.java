// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, NotificationCompatApi21

static class NotificationCompat$NotificationCompatApi21Impl extends NotificationCompat$NotificationCompatApi20Impl
{

	public Notification build(NotificationCompat.Builder builder, NotificationCompat.BuilderExtender builderextender)
	{
		NotificationCompatApi21.Builder builder1 = new NotificationCompatApi21.Builder(builder.mContext, builder.mNotification, builder.resolveTitle(), builder.resolveText(), builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mCategory, builder.mPeople, builder.mExtras, builder.mColor, builder.mVisibility, builder.mPublicVersion, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey, builder.mContentView, builder.mBigContentView, builder.mHeadsUpContentView);
	//    0    0:new             #19  <Class NotificationCompatApi21$Builder>
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
	//   39   77:getfield        #88  <Field String NotificationCompat$Builder.mCategory>
	//   40   80:aload_1         
	//   41   81:getfield        #92  <Field java.util.ArrayList NotificationCompat$Builder.mPeople>
	//   42   84:aload_1         
	//   43   85:getfield        #96  <Field Bundle NotificationCompat$Builder.mExtras>
	//   44   88:aload_1         
	//   45   89:getfield        #99  <Field int NotificationCompat$Builder.mColor>
	//   46   92:aload_1         
	//   47   93:getfield        #102 <Field int NotificationCompat$Builder.mVisibility>
	//   48   96:aload_1         
	//   49   97:getfield        #105 <Field Notification NotificationCompat$Builder.mPublicVersion>
	//   50  100:aload_1         
	//   51  101:getfield        #108 <Field String NotificationCompat$Builder.mGroupKey>
	//   52  104:aload_1         
	//   53  105:getfield        #111 <Field boolean NotificationCompat$Builder.mGroupSummary>
	//   54  108:aload_1         
	//   55  109:getfield        #114 <Field String NotificationCompat$Builder.mSortKey>
	//   56  112:aload_1         
	//   57  113:getfield        #117 <Field android.widget.RemoteViews NotificationCompat$Builder.mContentView>
	//   58  116:aload_1         
	//   59  117:getfield        #120 <Field android.widget.RemoteViews NotificationCompat$Builder.mBigContentView>
	//   60  120:aload_1         
	//   61  121:getfield        #123 <Field android.widget.RemoteViews NotificationCompat$Builder.mHeadsUpContentView>
	//   62  124:invokespecial   #126 <Method void NotificationCompatApi21$Builder(android.content.Context, Notification, CharSequence, CharSequence, CharSequence, android.widget.RemoteViews, int, android.app.PendingIntent, android.app.PendingIntent, android.graphics.Bitmap, int, int, boolean, boolean, boolean, int, CharSequence, boolean, String, java.util.ArrayList, Bundle, int, int, Notification, String, boolean, String, android.widget.RemoteViews, android.widget.RemoteViews, android.widget.RemoteViews)>
	//   63  127:astore_3        
		NotificationCompat.addActionsToBuilder(((NotificationBuilderWithActions) (builder1)), builder.mActions);
	//   64  128:aload_3         
	//   65  129:aload_1         
	//   66  130:getfield        #129 <Field java.util.ArrayList NotificationCompat$Builder.mActions>
	//   67  133:invokestatic    #133 <Method void NotificationCompat.addActionsToBuilder(NotificationBuilderWithActions, java.util.ArrayList)>
		NotificationCompat.addStyleToBuilderJellybean(((NotificationBuilderWithBuilderAccessor) (builder1)), builder.mStyle);
	//   68  136:aload_3         
	//   69  137:aload_1         
	//   70  138:getfield        #137 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   71  141:invokestatic    #141 <Method void NotificationCompat.addStyleToBuilderJellybean(NotificationBuilderWithBuilderAccessor, NotificationCompat$Style)>
		builderextender = ((NotificationCompat.BuilderExtender) (builderextender.build(builder, ((NotificationBuilderWithBuilderAccessor) (builder1)))));
	//   72  144:aload_2         
	//   73  145:aload_1         
	//   74  146:aload_3         
	//   75  147:invokevirtual   #146 <Method Notification NotificationCompat$BuilderExtender.build(NotificationCompat$Builder, NotificationBuilderWithBuilderAccessor)>
	//   76  150:astore_2        
		if(builder.mStyle != null)
	//*  77  151:aload_1         
	//*  78  152:getfield        #137 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  79  155:ifnull          170
			builder.mStyle.addCompatExtras(getExtras(((Notification) (builderextender))));
	//   80  158:aload_1         
	//   81  159:getfield        #137 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   82  162:aload_0         
	//   83  163:aload_2         
	//   84  164:invokevirtual   #150 <Method Bundle getExtras(Notification)>
	//   85  167:invokevirtual   #156 <Method void NotificationCompat$Style.addCompatExtras(Bundle)>
		return ((Notification) (builderextender));
	//   86  170:aload_2         
	//   87  171:areturn         
	}

	public Bundle getBundleForUnreadConversation(NotificationCompatBase.UnreadConversation unreadconversation)
	{
		return NotificationCompatApi21.getBundleForUnreadConversation(unreadconversation);
	//    0    0:aload_1         
	//    1    1:invokestatic    #162 <Method Bundle NotificationCompatApi21.getBundleForUnreadConversation(NotificationCompatBase$UnreadConversation)>
	//    2    4:areturn         
	}

	public String getCategory(Notification notification)
	{
		return NotificationCompatApi21.getCategory(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #166 <Method String NotificationCompatApi21.getCategory(Notification)>
	//    2    4:areturn         
	}

	public NotificationCompatBase.UnreadConversation getUnreadConversationFromBundle(Bundle bundle, ry ry, RemoteInputCompatBase.RemoteInput.Factory factory)
	{
		return NotificationCompatApi21.getUnreadConversationFromBundle(bundle, ry, factory);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #170 <Method NotificationCompatBase$UnreadConversation NotificationCompatApi21.getUnreadConversationFromBundle(Bundle, NotificationCompatBase$UnreadConversation$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//    4    6:areturn         
	}

	NotificationCompat$NotificationCompatApi21Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void NotificationCompat$NotificationCompatApi20Impl()>
	//    2    4:return          
	}
}
