// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat

static class NotificationCompat$NotificationCompatApi24Impl extends NotificationCompat$NotificationCompatApi21Impl
{

	public Notification build(NotificationCompat.Builder builder, NotificationCompat.BuilderExtender builderextender)
	{
		NotificationCompatApi24.Builder builder1 = new NotificationCompatApi24.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mCategory, builder.mPeople, builder.mExtras, builder.mColor, builder.mVisibility, builder.mPublicVersion, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey, builder.mRemoteInputHistory, builder.mContentView, builder.mBigContentView, builder.mHeadsUpContentView);
	//    0    0:new             #19  <Class NotificationCompatApi24$Builder>
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
	//   39   77:getfield        #87  <Field String NotificationCompat$Builder.mCategory>
	//   40   80:aload_1         
	//   41   81:getfield        #91  <Field java.util.ArrayList NotificationCompat$Builder.mPeople>
	//   42   84:aload_1         
	//   43   85:getfield        #95  <Field android.os.Bundle NotificationCompat$Builder.mExtras>
	//   44   88:aload_1         
	//   45   89:getfield        #98  <Field int NotificationCompat$Builder.mColor>
	//   46   92:aload_1         
	//   47   93:getfield        #101 <Field int NotificationCompat$Builder.mVisibility>
	//   48   96:aload_1         
	//   49   97:getfield        #104 <Field Notification NotificationCompat$Builder.mPublicVersion>
	//   50  100:aload_1         
	//   51  101:getfield        #107 <Field String NotificationCompat$Builder.mGroupKey>
	//   52  104:aload_1         
	//   53  105:getfield        #110 <Field boolean NotificationCompat$Builder.mGroupSummary>
	//   54  108:aload_1         
	//   55  109:getfield        #113 <Field String NotificationCompat$Builder.mSortKey>
	//   56  112:aload_1         
	//   57  113:getfield        #117 <Field CharSequence[] NotificationCompat$Builder.mRemoteInputHistory>
	//   58  116:aload_1         
	//   59  117:getfield        #120 <Field android.widget.RemoteViews NotificationCompat$Builder.mContentView>
	//   60  120:aload_1         
	//   61  121:getfield        #123 <Field android.widget.RemoteViews NotificationCompat$Builder.mBigContentView>
	//   62  124:aload_1         
	//   63  125:getfield        #126 <Field android.widget.RemoteViews NotificationCompat$Builder.mHeadsUpContentView>
	//   64  128:invokespecial   #129 <Method void NotificationCompatApi24$Builder(android.content.Context, Notification, CharSequence, CharSequence, CharSequence, android.widget.RemoteViews, int, android.app.PendingIntent, android.app.PendingIntent, android.graphics.Bitmap, int, int, boolean, boolean, boolean, int, CharSequence, boolean, String, java.util.ArrayList, android.os.Bundle, int, int, Notification, String, boolean, String, CharSequence[], android.widget.RemoteViews, android.widget.RemoteViews, android.widget.RemoteViews)>
	//   65  131:astore_3        
		NotificationCompat.addActionsToBuilder(((NotificationBuilderWithActions) (builder1)), builder.mActions);
	//   66  132:aload_3         
	//   67  133:aload_1         
	//   68  134:getfield        #132 <Field java.util.ArrayList NotificationCompat$Builder.mActions>
	//   69  137:invokestatic    #136 <Method void NotificationCompat.addActionsToBuilder(NotificationBuilderWithActions, java.util.ArrayList)>
		NotificationCompat.addStyleToBuilderApi24(((NotificationBuilderWithBuilderAccessor) (builder1)), builder.mStyle);
	//   70  140:aload_3         
	//   71  141:aload_1         
	//   72  142:getfield        #140 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   73  145:invokestatic    #144 <Method void NotificationCompat.addStyleToBuilderApi24(NotificationBuilderWithBuilderAccessor, NotificationCompat$Style)>
		builderextender = ((NotificationCompat.BuilderExtender) (builderextender.build(builder, ((NotificationBuilderWithBuilderAccessor) (builder1)))));
	//   74  148:aload_2         
	//   75  149:aload_1         
	//   76  150:aload_3         
	//   77  151:invokevirtual   #149 <Method Notification NotificationCompat$BuilderExtender.build(NotificationCompat$Builder, NotificationBuilderWithBuilderAccessor)>
	//   78  154:astore_2        
		if(builder.mStyle != null)
	//*  79  155:aload_1         
	//*  80  156:getfield        #140 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  81  159:ifnull          174
			builder.mStyle.addCompatExtras(getExtras(((Notification) (builderextender))));
	//   82  162:aload_1         
	//   83  163:getfield        #140 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   84  166:aload_0         
	//   85  167:aload_2         
	//   86  168:invokevirtual   #153 <Method android.os.Bundle getExtras(Notification)>
	//   87  171:invokevirtual   #159 <Method void NotificationCompat$Style.addCompatExtras(android.os.Bundle)>
		return ((Notification) (builderextender));
	//   88  174:aload_2         
	//   89  175:areturn         
	}

	NotificationCompat$NotificationCompatApi24Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void NotificationCompat$NotificationCompatApi21Impl()>
	//    2    4:return          
	}
}
