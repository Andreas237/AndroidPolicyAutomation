// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat

static class NotificationCompat$NotificationCompatApi26Impl extends NotificationCompat$NotificationCompatApi24Impl
{

	public Notification build(NotificationCompat.Builder builder, NotificationCompat.BuilderExtender builderextender)
	{
		NotificationCompatApi26.Builder builder1 = new NotificationCompatApi26.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mCategory, builder.mPeople, builder.mExtras, builder.mColor, builder.mVisibility, builder.mPublicVersion, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey, builder.mRemoteInputHistory, builder.mContentView, builder.mBigContentView, builder.mHeadsUpContentView, builder.mChannelId, builder.mBadgeIcon, builder.mShortcutId, builder.mTimeout, builder.mColorized, builder.mColorizedSet, NotificationCompat.Builder.access$000(builder));
	//    0    0:new             #16  <Class NotificationCompatApi26$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #22  <Field android.content.Context NotificationCompat$Builder.mContext>
	//    4    8:aload_1         
	//    5    9:getfield        #26  <Field Notification NotificationCompat$Builder.mNotification>
	//    6   12:aload_1         
	//    7   13:getfield        #30  <Field CharSequence NotificationCompat$Builder.mContentTitle>
	//    8   16:aload_1         
	//    9   17:getfield        #33  <Field CharSequence NotificationCompat$Builder.mContentText>
	//   10   20:aload_1         
	//   11   21:getfield        #36  <Field CharSequence NotificationCompat$Builder.mContentInfo>
	//   12   24:aload_1         
	//   13   25:getfield        #40  <Field android.widget.RemoteViews NotificationCompat$Builder.mTickerView>
	//   14   28:aload_1         
	//   15   29:getfield        #44  <Field int NotificationCompat$Builder.mNumber>
	//   16   32:aload_1         
	//   17   33:getfield        #48  <Field android.app.PendingIntent NotificationCompat$Builder.mContentIntent>
	//   18   36:aload_1         
	//   19   37:getfield        #51  <Field android.app.PendingIntent NotificationCompat$Builder.mFullScreenIntent>
	//   20   40:aload_1         
	//   21   41:getfield        #55  <Field android.graphics.Bitmap NotificationCompat$Builder.mLargeIcon>
	//   22   44:aload_1         
	//   23   45:getfield        #58  <Field int NotificationCompat$Builder.mProgressMax>
	//   24   48:aload_1         
	//   25   49:getfield        #61  <Field int NotificationCompat$Builder.mProgress>
	//   26   52:aload_1         
	//   27   53:getfield        #65  <Field boolean NotificationCompat$Builder.mProgressIndeterminate>
	//   28   56:aload_1         
	//   29   57:getfield        #68  <Field boolean NotificationCompat$Builder.mShowWhen>
	//   30   60:aload_1         
	//   31   61:getfield        #71  <Field boolean NotificationCompat$Builder.mUseChronometer>
	//   32   64:aload_1         
	//   33   65:getfield        #74  <Field int NotificationCompat$Builder.mPriority>
	//   34   68:aload_1         
	//   35   69:getfield        #77  <Field CharSequence NotificationCompat$Builder.mSubText>
	//   36   72:aload_1         
	//   37   73:getfield        #80  <Field boolean NotificationCompat$Builder.mLocalOnly>
	//   38   76:aload_1         
	//   39   77:getfield        #84  <Field String NotificationCompat$Builder.mCategory>
	//   40   80:aload_1         
	//   41   81:getfield        #88  <Field java.util.ArrayList NotificationCompat$Builder.mPeople>
	//   42   84:aload_1         
	//   43   85:getfield        #92  <Field android.os.Bundle NotificationCompat$Builder.mExtras>
	//   44   88:aload_1         
	//   45   89:getfield        #95  <Field int NotificationCompat$Builder.mColor>
	//   46   92:aload_1         
	//   47   93:getfield        #98  <Field int NotificationCompat$Builder.mVisibility>
	//   48   96:aload_1         
	//   49   97:getfield        #101 <Field Notification NotificationCompat$Builder.mPublicVersion>
	//   50  100:aload_1         
	//   51  101:getfield        #104 <Field String NotificationCompat$Builder.mGroupKey>
	//   52  104:aload_1         
	//   53  105:getfield        #107 <Field boolean NotificationCompat$Builder.mGroupSummary>
	//   54  108:aload_1         
	//   55  109:getfield        #110 <Field String NotificationCompat$Builder.mSortKey>
	//   56  112:aload_1         
	//   57  113:getfield        #114 <Field CharSequence[] NotificationCompat$Builder.mRemoteInputHistory>
	//   58  116:aload_1         
	//   59  117:getfield        #117 <Field android.widget.RemoteViews NotificationCompat$Builder.mContentView>
	//   60  120:aload_1         
	//   61  121:getfield        #120 <Field android.widget.RemoteViews NotificationCompat$Builder.mBigContentView>
	//   62  124:aload_1         
	//   63  125:getfield        #123 <Field android.widget.RemoteViews NotificationCompat$Builder.mHeadsUpContentView>
	//   64  128:aload_1         
	//   65  129:getfield        #126 <Field String NotificationCompat$Builder.mChannelId>
	//   66  132:aload_1         
	//   67  133:getfield        #129 <Field int NotificationCompat$Builder.mBadgeIcon>
	//   68  136:aload_1         
	//   69  137:getfield        #132 <Field String NotificationCompat$Builder.mShortcutId>
	//   70  140:aload_1         
	//   71  141:getfield        #136 <Field long NotificationCompat$Builder.mTimeout>
	//   72  144:aload_1         
	//   73  145:getfield        #139 <Field boolean NotificationCompat$Builder.mColorized>
	//   74  148:aload_1         
	//   75  149:getfield        #142 <Field boolean NotificationCompat$Builder.mColorizedSet>
	//   76  152:aload_1         
	//   77  153:invokestatic    #146 <Method int NotificationCompat$Builder.access$000(NotificationCompat$Builder)>
	//   78  156:invokespecial   #149 <Method void NotificationCompatApi26$Builder(android.content.Context, Notification, CharSequence, CharSequence, CharSequence, android.widget.RemoteViews, int, android.app.PendingIntent, android.app.PendingIntent, android.graphics.Bitmap, int, int, boolean, boolean, boolean, int, CharSequence, boolean, String, java.util.ArrayList, android.os.Bundle, int, int, Notification, String, boolean, String, CharSequence[], android.widget.RemoteViews, android.widget.RemoteViews, android.widget.RemoteViews, String, int, String, long, boolean, boolean, int)>
	//   79  159:astore_3        
		NotificationCompat.addActionsToBuilder(((NotificationBuilderWithActions) (builder1)), builder.mActions);
	//   80  160:aload_3         
	//   81  161:aload_1         
	//   82  162:getfield        #152 <Field java.util.ArrayList NotificationCompat$Builder.mActions>
	//   83  165:invokestatic    #156 <Method void NotificationCompat.addActionsToBuilder(NotificationBuilderWithActions, java.util.ArrayList)>
		if(builder.mStyle != null)
	//*  84  168:aload_1         
	//*  85  169:getfield        #160 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  86  172:ifnull          183
			builder.mStyle.apply(((NotificationBuilderWithBuilderAccessor) (builder1)));
	//   87  175:aload_1         
	//   88  176:getfield        #160 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   89  179:aload_3         
	//   90  180:invokevirtual   #166 <Method void NotificationCompat$Style.apply(NotificationBuilderWithBuilderAccessor)>
		builderextender = ((NotificationCompat.BuilderExtender) (builderextender.build(builder, ((NotificationBuilderWithBuilderAccessor) (builder1)))));
	//   91  183:aload_2         
	//   92  184:aload_1         
	//   93  185:aload_3         
	//   94  186:invokevirtual   #171 <Method Notification NotificationCompat$BuilderExtender.build(NotificationCompat$Builder, NotificationBuilderWithBuilderAccessor)>
	//   95  189:astore_2        
		if(builder.mStyle != null)
	//*  96  190:aload_1         
	//*  97  191:getfield        #160 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  98  194:ifnull          208
			builder.mStyle.addCompatExtras(NotificationCompat.getExtras(((Notification) (builderextender))));
	//   99  197:aload_1         
	//  100  198:getfield        #160 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//  101  201:aload_2         
	//  102  202:invokestatic    #175 <Method android.os.Bundle NotificationCompat.getExtras(Notification)>
	//  103  205:invokevirtual   #179 <Method void NotificationCompat$Style.addCompatExtras(android.os.Bundle)>
		return ((Notification) (builderextender));
	//  104  208:aload_2         
	//  105  209:areturn         
	}

	NotificationCompat$NotificationCompatApi26Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void NotificationCompat$NotificationCompatApi24Impl()>
	//    2    4:return          
	}
}
