// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.os.Bundle;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, RemoteInput, NotificationCompatJellybean

static class NotificationCompat$NotificationCompatApi16Impl extends NotificationCompat.NotificationCompatBaseImpl
{

	public Notification build(NotificationCompat.Builder builder, NotificationCompat.BuilderExtender builderextender)
	{
		NotificationCompatJellybean.Builder builder1 = new NotificationCompatJellybean.Builder(builder.mContext, builder.mNotification, builder.resolveTitle(), builder.resolveText(), builder.mContentInfo, builder.mTickerView, builder.mNumber, builder.mContentIntent, builder.mFullScreenIntent, builder.mLargeIcon, builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate, builder.mUseChronometer, builder.mPriority, builder.mSubText, builder.mLocalOnly, builder.mExtras, builder.mGroupKey, builder.mGroupSummary, builder.mSortKey, builder.mContentView, builder.mBigContentView);
	//    0    0:new             #19  <Class NotificationCompatJellybean$Builder>
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
	//   29   57:getfield        #72  <Field boolean NotificationCompat$Builder.mUseChronometer>
	//   30   60:aload_1         
	//   31   61:getfield        #75  <Field int NotificationCompat$Builder.mPriority>
	//   32   64:aload_1         
	//   33   65:getfield        #78  <Field CharSequence NotificationCompat$Builder.mSubText>
	//   34   68:aload_1         
	//   35   69:getfield        #81  <Field boolean NotificationCompat$Builder.mLocalOnly>
	//   36   72:aload_1         
	//   37   73:getfield        #85  <Field Bundle NotificationCompat$Builder.mExtras>
	//   38   76:aload_1         
	//   39   77:getfield        #89  <Field String NotificationCompat$Builder.mGroupKey>
	//   40   80:aload_1         
	//   41   81:getfield        #92  <Field boolean NotificationCompat$Builder.mGroupSummary>
	//   42   84:aload_1         
	//   43   85:getfield        #95  <Field String NotificationCompat$Builder.mSortKey>
	//   44   88:aload_1         
	//   45   89:getfield        #98  <Field android.widget.RemoteViews NotificationCompat$Builder.mContentView>
	//   46   92:aload_1         
	//   47   93:getfield        #101 <Field android.widget.RemoteViews NotificationCompat$Builder.mBigContentView>
	//   48   96:invokespecial   #104 <Method void NotificationCompatJellybean$Builder(android.content.Context, Notification, CharSequence, CharSequence, CharSequence, android.widget.RemoteViews, int, android.app.PendingIntent, android.app.PendingIntent, android.graphics.Bitmap, int, int, boolean, boolean, int, CharSequence, boolean, Bundle, String, boolean, String, android.widget.RemoteViews, android.widget.RemoteViews)>
	//   49   99:astore_3        
		NotificationCompat.addActionsToBuilder(((NotificationBuilderWithActions) (builder1)), builder.mActions);
	//   50  100:aload_3         
	//   51  101:aload_1         
	//   52  102:getfield        #108 <Field ArrayList NotificationCompat$Builder.mActions>
	//   53  105:invokestatic    #112 <Method void NotificationCompat.addActionsToBuilder(NotificationBuilderWithActions, ArrayList)>
		NotificationCompat.addStyleToBuilderJellybean(((NotificationBuilderWithBuilderAccessor) (builder1)), builder.mStyle);
	//   54  108:aload_3         
	//   55  109:aload_1         
	//   56  110:getfield        #116 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   57  113:invokestatic    #120 <Method void NotificationCompat.addStyleToBuilderJellybean(NotificationBuilderWithBuilderAccessor, NotificationCompat$Style)>
		builderextender = ((NotificationCompat.BuilderExtender) (builderextender.build(builder, ((NotificationBuilderWithBuilderAccessor) (builder1)))));
	//   58  116:aload_2         
	//   59  117:aload_1         
	//   60  118:aload_3         
	//   61  119:invokevirtual   #125 <Method Notification NotificationCompat$BuilderExtender.build(NotificationCompat$Builder, NotificationBuilderWithBuilderAccessor)>
	//   62  122:astore_2        
		if(builder.mStyle != null)
	//*  63  123:aload_1         
	//*  64  124:getfield        #116 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//*  65  127:ifnull          148
		{
			Bundle bundle = getExtras(((Notification) (builderextender)));
	//   66  130:aload_0         
	//   67  131:aload_2         
	//   68  132:invokevirtual   #129 <Method Bundle getExtras(Notification)>
	//   69  135:astore_3        
			if(bundle != null)
	//*  70  136:aload_3         
	//*  71  137:ifnull          148
				builder.mStyle.addCompatExtras(bundle);
	//   72  140:aload_1         
	//   73  141:getfield        #116 <Field NotificationCompat$Style NotificationCompat$Builder.mStyle>
	//   74  144:aload_3         
	//   75  145:invokevirtual   #135 <Method void NotificationCompat$Style.addCompatExtras(Bundle)>
		}
		return ((Notification) (builderextender));
	//   76  148:aload_2         
	//   77  149:areturn         
	}

	public NotificationCompat.Action getAction(Notification notification, int i)
	{
		return (NotificationCompat.Action)NotificationCompatJellybean.getAction(notification, i, NotificationCompat.Action.FACTORY, RemoteInput.FACTORY);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:getstatic       #143 <Field NotificationCompatBase$Action$Factory NotificationCompat$Action.FACTORY>
	//    3    5:getstatic       #148 <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
	//    4    8:invokestatic    #153 <Method NotificationCompatBase$Action NotificationCompatJellybean.getAction(Notification, int, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//    5   11:checkcast       #139 <Class NotificationCompat$Action>
	//    6   14:areturn         
	}

	public int getActionCount(Notification notification)
	{
		return NotificationCompatJellybean.getActionCount(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #157 <Method int NotificationCompatJellybean.getActionCount(Notification)>
	//    2    4:ireturn         
	}

	public NotificationCompat.Action[] getActionsFromParcelableArrayList(ArrayList arraylist)
	{
		return (NotificationCompat.Action[])(NotificationCompat.Action[])NotificationCompatJellybean.getActionsFromParcelableArrayList(arraylist, NotificationCompat.Action.FACTORY, RemoteInput.FACTORY);
	//    0    0:aload_1         
	//    1    1:getstatic       #143 <Field NotificationCompatBase$Action$Factory NotificationCompat$Action.FACTORY>
	//    2    4:getstatic       #148 <Field RemoteInputCompatBase$RemoteInput$Factory RemoteInput.FACTORY>
	//    3    7:invokestatic    #162 <Method NotificationCompatBase$Action[] NotificationCompatJellybean.getActionsFromParcelableArrayList(ArrayList, NotificationCompatBase$Action$Factory, RemoteInputCompatBase$RemoteInput$Factory)>
	//    4   10:checkcast       #164 <Class NotificationCompat$Action[]>
	//    5   13:checkcast       #164 <Class NotificationCompat$Action[]>
	//    6   16:areturn         
	}

	public Bundle getExtras(Notification notification)
	{
		return NotificationCompatJellybean.getExtras(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #167 <Method Bundle NotificationCompatJellybean.getExtras(Notification)>
	//    2    4:areturn         
	}

	public String getGroup(Notification notification)
	{
		return NotificationCompatJellybean.getGroup(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #171 <Method String NotificationCompatJellybean.getGroup(Notification)>
	//    2    4:areturn         
	}

	public boolean getLocalOnly(Notification notification)
	{
		return NotificationCompatJellybean.getLocalOnly(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #175 <Method boolean NotificationCompatJellybean.getLocalOnly(Notification)>
	//    2    4:ireturn         
	}

	public ArrayList getParcelableArrayListForActions(NotificationCompat.Action aaction[])
	{
		return NotificationCompatJellybean.getParcelableArrayListForActions(((NotificationCompatBase.Action []) (aaction)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #180 <Method ArrayList NotificationCompatJellybean.getParcelableArrayListForActions(NotificationCompatBase$Action[])>
	//    2    4:areturn         
	}

	public String getSortKey(Notification notification)
	{
		return NotificationCompatJellybean.getSortKey(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #184 <Method String NotificationCompatJellybean.getSortKey(Notification)>
	//    2    4:areturn         
	}

	public boolean isGroupSummary(Notification notification)
	{
		return NotificationCompatJellybean.isGroupSummary(notification);
	//    0    0:aload_1         
	//    1    1:invokestatic    #187 <Method boolean NotificationCompatJellybean.isGroupSummary(Notification)>
	//    2    4:ireturn         
	}

	NotificationCompat$NotificationCompatApi16Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void NotificationCompat$NotificationCompatBaseImpl()>
	//    2    4:return          
	}
}
