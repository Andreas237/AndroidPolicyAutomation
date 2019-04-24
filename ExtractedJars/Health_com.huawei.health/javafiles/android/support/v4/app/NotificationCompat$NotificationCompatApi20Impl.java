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
		NotificationCompatApi20.Builder builder1 = new NotificationCompatApi20.Builder(builder.mContext, builder.mNotification, builder.resolveTitle(), builder.resolveText(), builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mShowWhen, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mPeople, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey, builder.mContentView, builder.mBigContentView);
	//    0    0:new             #19  <Class NotificationCompatApi20$Builder>
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
	//   39   77:getfield        #88  <Field ArrayList NotificationCompat$Builder.mPeople>
	//   40   80:aload_1         
	//   41   81:getfield        #92  <Field android.os.Bundle NotificationCompat$Builder.mExtras>
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
	//   52  104:invokespecial   #111 <Method void NotificationCompatApi20$Builder(android.content.Context, Notification, CharSequence, CharSequence, CharSequence, android.widget.RemoteViews, int, android.app.PendingIntent, android.app.PendingIntent, android.graphics.Bitmap, int, int, boolean, boolean, boolean, int, CharSequence, boolean, ArrayList, android.os.Bundle, String, boolean, String, android.widget.RemoteViews, android.widget.RemoteViews)>
	//   53  107:astore_3        
		NotificationCompat.addActionsToBuilder(((NotificationBuilderWithActions) (builder1)), builder.mActions);
	//   54  108:aload_3         
	//   55  109:aload_1         
	//   56  110:getfield        #114 <Field ArrayList NotificationCompat$Builder.mActions>
	//   57  113:invokestatic    #118 <Method void NotificationCompat.addActionsToBuilder(NotificationBuilderWithActions, ArrayList)>
		NotificationCompat.addStyleToBuilderJellybean(((NotificationBuilderWithBuilderAccessor) (builder1)), builder.mStyle);
	//   58  116:aload_3         
	//   59  117:aload_1         
	//   60  118:getfield        #122 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   61  121:invokestatic    #126 <Method void NotificationCompat.addStyleToBuilderJellybean(NotificationBuilderWithBuilderAccessor, NotificationCompat$Style)>
		builderextender = ((NotificationCompat.BuilderExtender) (builderextender.build(builder, ((NotificationBuilderWithBuilderAccessor) (builder1)))));
	//   62  124:aload_2         
	//   63  125:aload_1         
	//   64  126:aload_3         
	//   65  127:invokevirtual   #131 <Method Notification NotificationCompat$BuilderExtender.build(NotificationCompat$Builder, NotificationBuilderWithBuilderAccessor)>
	//   66  130:astore_2        
		if(builder.mStyle != null)
	//*  67  131:aload_1         
	//*  68  132:getfield        #122 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  69  135:ifnull          150
			builder.mStyle.addCompatExtras(getExtras(((Notification) (builderextender))));
	//   70  138:aload_1         
	//   71  139:getfield        #122 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   72  142:aload_0         
	//   73  143:aload_2         
	//   74  144:invokevirtual   #135 <Method android.os.Bundle getExtras(Notification)>
	//   75  147:invokevirtual   #141 <Method void NotificationCompat$Style.addCompatExtras(android.os.Bundle)>
		return ((Notification) (builderextender));
	//   76  150:aload_2         
	//   77  151:areturn         
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
		return (NotificationCompat.Action[])(NotificationCompat.Action[])NotificationCompatApi20.getActionsFromParcelableArrayList(arraylist, NotificationCompat.Action.FACTORY, RemoteInput.FACTORY);
	//    0    0:aload_1         
	//    1    1:getstatic       #149 <Field NotificationCompatBase$Action$Factory NotificationCompat$Action.FACTORY>
	//    2    4:getstatic       #154 <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
	//    3    7:invokestatic    #164 <Method NotificationCompatBase$Action[] NotificationCompatApi20.getActionsFromParcelableArrayList(ArrayList, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//    4   10:checkcast       #166 <Class NotificationCompat$Action[]>
	//    5   13:checkcast       #166 <Class NotificationCompat$Action[]>
	//    6   16:areturn         
	}

	public String getGroup(Notification notification)
	{
		return NotificationCompatApi20.getGroup(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #172 <Method String NotificationCompatApi20.getGroup(Notification)>
	//    2    4:areturn         
	}

	public boolean getLocalOnly(Notification notification)
	{
		return NotificationCompatApi20.getLocalOnly(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #176 <Method boolean NotificationCompatApi20.getLocalOnly(Notification)>
	//    2    4:ireturn         
	}

	public ArrayList getParcelableArrayListForActions(NotificationCompat.Action aaction[])
	{
		return NotificationCompatApi20.getParcelableArrayListForActions(((NotificationCompatBase.Action []) (aaction)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #181 <Method ArrayList NotificationCompatApi20.getParcelableArrayListForActions(NotificationCompatBase$Action[])>
	//    2    4:areturn         
	}

	public String getSortKey(Notification notification)
	{
		return NotificationCompatApi20.getSortKey(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #185 <Method String NotificationCompatApi20.getSortKey(Notification)>
	//    2    4:areturn         
	}

	public boolean isGroupSummary(Notification notification)
	{
		return NotificationCompatApi20.isGroupSummary(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #188 <Method boolean NotificationCompatApi20.isGroupSummary(Notification)>
	//    2    4:ireturn         
	}

	NotificationCompat$NotificationCompatApi20Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void NotificationCompat$NotificationCompatApi19Impl()>
	//    2    4:return          
	}
}
