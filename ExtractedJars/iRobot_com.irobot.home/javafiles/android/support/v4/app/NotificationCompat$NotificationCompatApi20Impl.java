// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, RemoteInput, NotificationCompatApi20

static class NotificationCompat$NotificationCompatApi20Impl extends NotificationCompat$NotificationCompatApi19Impl
{

	public Notification build(NotificationCompat.Builder builder, NotificationCompat.BuilderExtender builderextender)
	{
		NotificationCompatApi20.Builder builder1 = new NotificationCompatApi20.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mPeople, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey, builder.mContentView, builder.mBigContentView, NotificationCompat.Builder.access$000(builder));
	//    0    0:new             #16  <Class NotificationCompatApi20$Builder>
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
	//   39   77:getfield        #84  <Field ArrayList NotificationCompat$Builder.mPeople>
	//   40   80:aload_1         
	//   41   81:getfield        #88  <Field android.os.Bundle NotificationCompat$Builder.mExtras>
	//   42   84:aload_1         
	//   43   85:getfield        #92  <Field String NotificationCompat$Builder.mGroupKey>
	//   44   88:aload_1         
	//   45   89:getfield        #95  <Field boolean NotificationCompat$Builder.mGroupSummary>
	//   46   92:aload_1         
	//   47   93:getfield        #98  <Field String NotificationCompat$Builder.mSortKey>
	//   48   96:aload_1         
	//   49   97:getfield        #101 <Field android.widget.RemoteViews NotificationCompat$Builder.mContentView>
	//   50  100:aload_1         
	//   51  101:getfield        #104 <Field android.widget.RemoteViews NotificationCompat$Builder.mBigContentView>
	//   52  104:aload_1         
	//   53  105:invokestatic    #108 <Method int NotificationCompat$Builder.access$000(NotificationCompat$Builder)>
	//   54  108:invokespecial   #111 <Method void NotificationCompatApi20$Builder(android.content.Context, Notification, CharSequence, CharSequence, CharSequence, android.widget.RemoteViews, int, android.app.PendingIntent, android.app.PendingIntent, android.graphics.Bitmap, int, int, boolean, boolean, boolean, int, CharSequence, boolean, ArrayList, android.os.Bundle, String, boolean, String, android.widget.RemoteViews, android.widget.RemoteViews, int)>
	//   55  111:astore_3        
		NotificationCompat.addActionsToBuilder(((NotificationBuilderWithActions) (builder1)), builder.mActions);
	//   56  112:aload_3         
	//   57  113:aload_1         
	//   58  114:getfield        #114 <Field ArrayList NotificationCompat$Builder.mActions>
	//   59  117:invokestatic    #118 <Method void NotificationCompat.addActionsToBuilder(NotificationBuilderWithActions, ArrayList)>
		if(builder.mStyle != null)
	//*  60  120:aload_1         
	//*  61  121:getfield        #122 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  62  124:ifnull          135
			builder.mStyle.apply(((NotificationBuilderWithBuilderAccessor) (builder1)));
	//   63  127:aload_1         
	//   64  128:getfield        #122 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   65  131:aload_3         
	//   66  132:invokevirtual   #128 <Method void NotificationCompat$Style.apply(NotificationBuilderWithBuilderAccessor)>
		builderextender = ((NotificationCompat.BuilderExtender) (builderextender.build(builder, ((NotificationBuilderWithBuilderAccessor) (builder1)))));
	//   67  135:aload_2         
	//   68  136:aload_1         
	//   69  137:aload_3         
	//   70  138:invokevirtual   #133 <Method Notification NotificationCompat$BuilderExtender.build(NotificationCompat$Builder, NotificationBuilderWithBuilderAccessor)>
	//   71  141:astore_2        
		if(builder.mStyle != null)
	//*  72  142:aload_1         
	//*  73  143:getfield        #122 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  74  146:ifnull          160
			builder.mStyle.addCompatExtras(NotificationCompat.getExtras(((Notification) (builderextender))));
	//   75  149:aload_1         
	//   76  150:getfield        #122 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   77  153:aload_2         
	//   78  154:invokestatic    #137 <Method android.os.Bundle NotificationCompat.getExtras(Notification)>
	//   79  157:invokevirtual   #141 <Method void NotificationCompat$Style.addCompatExtras(android.os.Bundle)>
		return ((Notification) (builderextender));
	//   80  160:aload_2         
	//   81  161:areturn         
	}

	public NotificationCompat.Action getAction(Notification notification, int i)
	{
		return (NotificationCompat.Action)NotificationCompatApi20.getAction(notification, i, NotificationCompat.Action.FACTORY, RemoteInput.FACTORY);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #149 <Field NotificationCompatBase$Action$Factory NotificationCompat$Action.FACTORY>
	//    3    5:getstatic       #154 <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
	//    4    8:invokestatic    #159 <Method NotificationCompatBase$Action NotificationCompatApi20.getAction(Notification, int, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//    5   11:checkcast       #145 <Class NotificationCompat$Action>
	//    6   14:areturn         
	}

	public NotificationCompat.Action[] getActionsFromParcelableArrayList(ArrayList arraylist)
	{
		return (NotificationCompat.Action[])NotificationCompatApi20.getActionsFromParcelableArrayList(arraylist, NotificationCompat.Action.FACTORY, RemoteInput.FACTORY);
	//    0    0:aload_1         
	//    1    1:getstatic       #149 <Field NotificationCompatBase$Action$Factory NotificationCompat$Action.FACTORY>
	//    2    4:getstatic       #154 <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
	//    3    7:invokestatic    #164 <Method NotificationCompatBase$Action[] NotificationCompatApi20.getActionsFromParcelableArrayList(ArrayList, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//    4   10:checkcast       #166 <Class NotificationCompat$Action[]>
	//    5   13:areturn         
	}

	public ArrayList getParcelableArrayListForActions(NotificationCompat.Action aaction[])
	{
		return NotificationCompatApi20.getParcelableArrayListForActions(((NotificationCompatBase.Action []) (aaction)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #173 <Method ArrayList NotificationCompatApi20.getParcelableArrayListForActions(NotificationCompatBase$Action[])>
	//    2    4:areturn         
	}

	NotificationCompat$NotificationCompatApi20Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void NotificationCompat$NotificationCompatApi19Impl()>
	//    2    4:return          
	}
}
