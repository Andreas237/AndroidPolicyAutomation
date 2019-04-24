// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, RemoteInput, NotificationCompatApi24

static class NotificationCompat$NotificationCompatApi24Impl extends NotificationCompat$NotificationCompatApi21Impl
{

	public Notification build(NotificationCompat.Builder builder, NotificationCompat.BuilderExtender builderextender)
	{
		NotificationCompatApi24.Builder builder1 = new NotificationCompatApi24.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mCategory, builder.mPeople, builder.mExtras, builder.mColor, builder.mVisibility, builder.mPublicVersion, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey, builder.mRemoteInputHistory, builder.mContentView, builder.mBigContentView, builder.mHeadsUpContentView, NotificationCompat.Builder.access$000(builder));
	//    0    0:new             #16  <Class NotificationCompatApi24$Builder>
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
	//   41   81:getfield        #88  <Field ArrayList NotificationCompat$Builder.mPeople>
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
	//   65  129:invokestatic    #127 <Method int NotificationCompat$Builder.access$000(NotificationCompat$Builder)>
	//   66  132:invokespecial   #130 <Method void NotificationCompatApi24$Builder(android.content.Context, Notification, CharSequence, CharSequence, CharSequence, android.widget.RemoteViews, int, android.app.PendingIntent, android.app.PendingIntent, android.graphics.Bitmap, int, int, boolean, boolean, boolean, int, CharSequence, boolean, String, ArrayList, android.os.Bundle, int, int, Notification, String, boolean, String, CharSequence[], android.widget.RemoteViews, android.widget.RemoteViews, android.widget.RemoteViews, int)>
	//   67  135:astore_3        
		NotificationCompat.addActionsToBuilder(((NotificationBuilderWithActions) (builder1)), builder.mActions);
	//   68  136:aload_3         
	//   69  137:aload_1         
	//   70  138:getfield        #133 <Field ArrayList NotificationCompat$Builder.mActions>
	//   71  141:invokestatic    #137 <Method void NotificationCompat.addActionsToBuilder(NotificationBuilderWithActions, ArrayList)>
		if(builder.mStyle != null)
	//*  72  144:aload_1         
	//*  73  145:getfield        #141 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  74  148:ifnull          159
			builder.mStyle.apply(((NotificationBuilderWithBuilderAccessor) (builder1)));
	//   75  151:aload_1         
	//   76  152:getfield        #141 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   77  155:aload_3         
	//   78  156:invokevirtual   #147 <Method void NotificationCompat$Style.apply(NotificationBuilderWithBuilderAccessor)>
		builderextender = ((NotificationCompat.BuilderExtender) (builderextender.build(builder, ((NotificationBuilderWithBuilderAccessor) (builder1)))));
	//   79  159:aload_2         
	//   80  160:aload_1         
	//   81  161:aload_3         
	//   82  162:invokevirtual   #152 <Method Notification NotificationCompat$BuilderExtender.build(NotificationCompat$Builder, NotificationBuilderWithBuilderAccessor)>
	//   83  165:astore_2        
		if(builder.mStyle != null)
	//*  84  166:aload_1         
	//*  85  167:getfield        #141 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  86  170:ifnull          184
			builder.mStyle.addCompatExtras(NotificationCompat.getExtras(((Notification) (builderextender))));
	//   87  173:aload_1         
	//   88  174:getfield        #141 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   89  177:aload_2         
	//   90  178:invokestatic    #156 <Method android.os.Bundle NotificationCompat.getExtras(Notification)>
	//   91  181:invokevirtual   #160 <Method void NotificationCompat$Style.addCompatExtras(android.os.Bundle)>
		return ((Notification) (builderextender));
	//   92  184:aload_2         
	//   93  185:areturn         
	}

	public NotificationCompat.Action getAction(Notification notification, int i)
	{
		return (NotificationCompat.Action)NotificationCompatApi24.getAction(notification, i, NotificationCompat.Action.FACTORY, RemoteInput.FACTORY);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #168 <Field NotificationCompatBase$Action$Factory NotificationCompat$Action.FACTORY>
	//    3    5:getstatic       #173 <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
	//    4    8:invokestatic    #178 <Method NotificationCompatBase$Action NotificationCompatApi24.getAction(Notification, int, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//    5   11:checkcast       #164 <Class NotificationCompat$Action>
	//    6   14:areturn         
	}

	public NotificationCompat.Action[] getActionsFromParcelableArrayList(ArrayList arraylist)
	{
		return (NotificationCompat.Action[])NotificationCompatApi24.getActionsFromParcelableArrayList(arraylist, NotificationCompat.Action.FACTORY, RemoteInput.FACTORY);
	//    0    0:aload_1         
	//    1    1:getstatic       #168 <Field NotificationCompatBase$Action$Factory NotificationCompat$Action.FACTORY>
	//    2    4:getstatic       #173 <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
	//    3    7:invokestatic    #183 <Method NotificationCompatBase$Action[] NotificationCompatApi24.getActionsFromParcelableArrayList(ArrayList, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//    4   10:checkcast       #185 <Class NotificationCompat$Action[]>
	//    5   13:areturn         
	}

	public ArrayList getParcelableArrayListForActions(NotificationCompat.Action aaction[])
	{
		return NotificationCompatApi24.getParcelableArrayListForActions(((NotificationCompatBase.Action []) (aaction)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #192 <Method ArrayList NotificationCompatApi24.getParcelableArrayListForActions(NotificationCompatBase$Action[])>
	//    2    4:areturn         
	}

	NotificationCompat$NotificationCompatApi24Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void NotificationCompat$NotificationCompatApi21Impl()>
	//    2    4:return          
	}
}
