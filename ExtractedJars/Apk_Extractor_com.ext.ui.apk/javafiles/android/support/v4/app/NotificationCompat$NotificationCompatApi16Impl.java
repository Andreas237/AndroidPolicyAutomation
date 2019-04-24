// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, RemoteInput, NotificationCompatJellybean

static class NotificationCompat$NotificationCompatApi16Impl extends NotificationCompat.NotificationCompatBaseImpl
{

	public Notification build(NotificationCompat.Builder builder, NotificationCompat.BuilderExtender builderextender)
	{
		NotificationCompatJellybean.Builder builder1 = new NotificationCompatJellybean.Builder(builder.mContext, builder.mNotification, builder.mContentTitle, builder.mContentText, builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey, builder.mContentView, builder.mBigContentView);
	//    0    0:new             #19  <Class NotificationCompatJellybean$Builder>
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
	//   29   57:getfield        #71  <Field boolean NotificationCompat$Builder.mUseChronometer>
	//   30   60:aload_1         
	//   31   61:getfield        #74  <Field int NotificationCompat$Builder.mPriority>
	//   32   64:aload_1         
	//   33   65:getfield        #77  <Field CharSequence NotificationCompat$Builder.mSubText>
	//   34   68:aload_1         
	//   35   69:getfield        #80  <Field boolean NotificationCompat$Builder.mLocalOnly>
	//   36   72:aload_1         
	//   37   73:getfield        #84  <Field android.os.Bundle NotificationCompat$Builder.mExtras>
	//   38   76:aload_1         
	//   39   77:getfield        #88  <Field String NotificationCompat$Builder.mGroupKey>
	//   40   80:aload_1         
	//   41   81:getfield        #91  <Field boolean NotificationCompat$Builder.mGroupSummary>
	//   42   84:aload_1         
	//   43   85:getfield        #94  <Field String NotificationCompat$Builder.mSortKey>
	//   44   88:aload_1         
	//   45   89:getfield        #97  <Field android.widget.RemoteViews NotificationCompat$Builder.mContentView>
	//   46   92:aload_1         
	//   47   93:getfield        #100 <Field android.widget.RemoteViews NotificationCompat$Builder.mBigContentView>
	//   48   96:invokespecial   #103 <Method void NotificationCompatJellybean$Builder(android.content.Context, Notification, CharSequence, CharSequence, CharSequence, android.widget.RemoteViews, int, android.app.PendingIntent, android.app.PendingIntent, android.graphics.Bitmap, int, int, boolean, boolean, int, CharSequence, boolean, android.os.Bundle, String, boolean, String, android.widget.RemoteViews, android.widget.RemoteViews)>
	//   49   99:astore_3        
		NotificationCompat.addActionsToBuilder(((NotificationBuilderWithActions) (builder1)), builder.mActions);
	//   50  100:aload_3         
	//   51  101:aload_1         
	//   52  102:getfield        #107 <Field ArrayList NotificationCompat$Builder.mActions>
	//   53  105:invokestatic    #111 <Method void NotificationCompat.addActionsToBuilder(NotificationBuilderWithActions, ArrayList)>
		if(builder.mStyle != null)
	//*  54  108:aload_1         
	//*  55  109:getfield        #115 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  56  112:ifnull          123
			builder.mStyle.apply(((NotificationBuilderWithBuilderAccessor) (builder1)));
	//   57  115:aload_1         
	//   58  116:getfield        #115 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   59  119:aload_3         
	//   60  120:invokevirtual   #121 <Method void NotificationCompat$Style.apply(NotificationBuilderWithBuilderAccessor)>
		builderextender = ((NotificationCompat.BuilderExtender) (builderextender.build(builder, ((NotificationBuilderWithBuilderAccessor) (builder1)))));
	//   61  123:aload_2         
	//   62  124:aload_1         
	//   63  125:aload_3         
	//   64  126:invokevirtual   #126 <Method Notification NotificationCompat$BuilderExtender.build(NotificationCompat$Builder, NotificationBuilderWithBuilderAccessor)>
	//   65  129:astore_2        
		if(builder.mStyle != null)
	//*  66  130:aload_1         
	//*  67  131:getfield        #115 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  68  134:ifnull          154
		{
			android.os.Bundle bundle = NotificationCompat.getExtras(((Notification) (builderextender)));
	//   69  137:aload_2         
	//   70  138:invokestatic    #130 <Method android.os.Bundle NotificationCompat.getExtras(Notification)>
	//   71  141:astore_3        
			if(bundle != null)
	//*  72  142:aload_3         
	//*  73  143:ifnull          154
				builder.mStyle.addCompatExtras(bundle);
	//   74  146:aload_1         
	//   75  147:getfield        #115 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   76  150:aload_3         
	//   77  151:invokevirtual   #134 <Method void NotificationCompat$Style.addCompatExtras(android.os.Bundle)>
		}
		return ((Notification) (builderextender));
	//   78  154:aload_2         
	//   79  155:areturn         
	}

	public NotificationCompat.Action getAction(Notification notification, int i)
	{
		return (NotificationCompat.Action)NotificationCompatJellybean.getAction(notification, i, NotificationCompat.Action.FACTORY, RemoteInput.FACTORY);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #142 <Field NotificationCompatBase$Action$Factory NotificationCompat$Action.FACTORY>
	//    3    5:getstatic       #147 <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
	//    4    8:invokestatic    #152 <Method NotificationCompatBase$Action NotificationCompatJellybean.getAction(Notification, int, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//    5   11:checkcast       #138 <Class NotificationCompat$Action>
	//    6   14:areturn         
	}

	public NotificationCompat.Action[] getActionsFromParcelableArrayList(ArrayList arraylist)
	{
		return (NotificationCompat.Action[])(NotificationCompat.Action[])NotificationCompatJellybean.getActionsFromParcelableArrayList(arraylist, NotificationCompat.Action.FACTORY, RemoteInput.FACTORY);
	//    0    0:aload_1         
	//    1    1:getstatic       #142 <Field NotificationCompatBase$Action$Factory NotificationCompat$Action.FACTORY>
	//    2    4:getstatic       #147 <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
	//    3    7:invokestatic    #157 <Method NotificationCompatBase$Action[] NotificationCompatJellybean.getActionsFromParcelableArrayList(ArrayList, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//    4   10:checkcast       #159 <Class NotificationCompat$Action[]>
	//    5   13:checkcast       #159 <Class NotificationCompat$Action[]>
	//    6   16:areturn         
	}

	public ArrayList getParcelableArrayListForActions(NotificationCompat.Action aaction[])
	{
		return NotificationCompatJellybean.getParcelableArrayListForActions(((NotificationCompatBase.Action []) (aaction)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #166 <Method ArrayList NotificationCompatJellybean.getParcelableArrayListForActions(NotificationCompatBase$Action[])>
	//    2    4:areturn         
	}

	NotificationCompat$NotificationCompatApi16Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void NotificationCompat$NotificationCompatBaseImpl()>
	//    2    4:return          
	}
}
