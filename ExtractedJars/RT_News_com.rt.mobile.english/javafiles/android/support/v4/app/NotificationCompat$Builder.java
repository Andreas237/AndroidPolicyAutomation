// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//			NotificationCompat, NotificationCompatBuilder

public static class NotificationCompat$Builder
{

	protected static CharSequence limitCharSequenceLength(CharSequence charsequence)
	{
		if(charsequence == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return charsequence;
	//    2    4:aload_0         
	//    3    5:areturn         
		CharSequence charsequence1 = charsequence;
	//    4    6:aload_0         
	//    5    7:astore_1        
		if(charsequence.length() > 5120)
	//*   6    8:aload_0         
	//*   7    9:invokeinterface #132 <Method int CharSequence.length()>
	//*   8   14:sipush          5120
	//*   9   17:icmple          31
			charsequence1 = charsequence.subSequence(0, 5120);
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:sipush          5120
	//   13   25:invokeinterface #136 <Method CharSequence CharSequence.subSequence(int, int)>
	//   14   30:astore_1        
		return charsequence1;
	//   15   31:aload_1         
	//   16   32:areturn         
	}

	private void setFlag(int i, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            20
		{
			Notification notification = mNotification;
	//    2    4:aload_0         
	//    3    5:getfield        #103 <Field Notification mNotification>
	//    4    8:astore_3        
			notification.flags = i | notification.flags;
	//    5    9:aload_3         
	//    6   10:iload_1         
	//    7   11:aload_3         
	//    8   12:getfield        #141 <Field int Notification.flags>
	//    9   15:ior             
	//   10   16:putfield        #141 <Field int Notification.flags>
			return;
	//   11   19:return          
		} else
		{
			Notification notification1 = mNotification;
	//   12   20:aload_0         
	//   13   21:getfield        #103 <Field Notification mNotification>
	//   14   24:astore_3        
			notification1.flags = ~i & notification1.flags;
	//   15   25:aload_3         
	//   16   26:iload_1         
	//   17   27:iconst_m1       
	//   18   28:ixor            
	//   19   29:aload_3         
	//   20   30:getfield        #141 <Field int Notification.flags>
	//   21   33:iand            
	//   22   34:putfield        #141 <Field int Notification.flags>
			return;
	//   23   37:return          
		}
	}

	public NotificationCompat$Builder addAction(int i, CharSequence charsequence, PendingIntent pendingintent)
	{
		mActions.add(((Object) (new NotificationCompat.Action(i, charsequence, pendingintent))));
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field ArrayList mActions>
	//    2    4:new             #145 <Class NotificationCompat$Action>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #148 <Method void NotificationCompat$Action(int, CharSequence, PendingIntent)>
	//    8   14:invokevirtual   #152 <Method boolean ArrayList.add(Object)>
	//    9   17:pop             
		return this;
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	public NotificationCompat$Builder addAction(NotificationCompat.Action action)
	{
		mActions.add(((Object) (action)));
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field ArrayList mActions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #152 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public NotificationCompat$Builder addExtras(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          33
		{
			if(mExtras == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #157 <Field Bundle mExtras>
	//*   4    8:ifnonnull       25
			{
				mExtras = new Bundle(bundle);
	//    5   11:aload_0         
	//    6   12:new             #159 <Class Bundle>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #162 <Method void Bundle(Bundle)>
	//   10   20:putfield        #157 <Field Bundle mExtras>
				return this;
	//   11   23:aload_0         
	//   12   24:areturn         
			}
			mExtras.putAll(bundle);
	//   13   25:aload_0         
	//   14   26:getfield        #157 <Field Bundle mExtras>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #165 <Method void Bundle.putAll(Bundle)>
		}
		return this;
	//   17   33:aload_0         
	//   18   34:areturn         
	}

	public NotificationCompat$Builder addPerson(String s)
	{
		mPeople.add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field ArrayList mPeople>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #152 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Notification build()
	{
		return (new NotificationCompatBuilder(this)).build();
	//    0    0:new             #171 <Class NotificationCompatBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #174 <Method void NotificationCompatBuilder(NotificationCompat$Builder)>
	//    4    8:invokevirtual   #176 <Method Notification NotificationCompatBuilder.build()>
	//    5   11:areturn         
	}

	public NotificationCompat$Builder extend( )
	{
		.extend(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #183 <Method NotificationCompat$Builder NotificationCompat$Extender.extend(NotificationCompat$Builder)>
	//    3    7:pop             
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public RemoteViews getBigContentView()
	{
		return mBigContentView;
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field RemoteViews mBigContentView>
	//    2    4:areturn         
	}

	public int getColor()
	{
		return mColor;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field int mColor>
	//    2    4:ireturn         
	}

	public RemoteViews getContentView()
	{
		return mContentView;
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field RemoteViews mContentView>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		if(mExtras == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #157 <Field Bundle mExtras>
	//*   2    4:ifnonnull       18
			mExtras = new Bundle();
	//    3    7:aload_0         
	//    4    8:new             #159 <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #195 <Method void Bundle()>
	//    7   15:putfield        #157 <Field Bundle mExtras>
		return mExtras;
	//    8   18:aload_0         
	//    9   19:getfield        #157 <Field Bundle mExtras>
	//   10   22:areturn         
	}

	public RemoteViews getHeadsUpContentView()
	{
		return mHeadsUpContentView;
	//    0    0:aload_0         
	//    1    1:getfield        #198 <Field RemoteViews mHeadsUpContentView>
	//    2    4:areturn         
	}

	public Notification getNotification()
	{
		return build();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #200 <Method Notification build()>
	//    2    4:areturn         
	}

	public int getPriority()
	{
		return mPriority;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field int mPriority>
	//    2    4:ireturn         
	}

	public long getWhenIfShowing()
	{
		if(mShowWhen)
	//*   0    0:aload_0         
	//*   1    1:getfield        #88  <Field boolean mShowWhen>
	//*   2    4:ifeq            15
			return mNotification.when;
	//    3    7:aload_0         
	//    4    8:getfield        #103 <Field Notification mNotification>
	//    5   11:getfield        #116 <Field long Notification.when>
	//    6   14:lreturn         
		else
			return 0L;
	//    7   15:lconst_0        
	//    8   16:lreturn         
	}

	public NotificationCompat$Builder setAutoCancel(boolean flag)
	{
		setFlag(16, flag);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:iload_1         
	//    3    4:invokespecial   #206 <Method void setFlag(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public NotificationCompat$Builder setBadgeIconType(int i)
	{
		mBadgeIcon = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #96  <Field int mBadgeIcon>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setCategory(String s)
	{
		mCategory = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #211 <Field String mCategory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setChannelId(String s)
	{
		mChannelId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #107 <Field String mChannelId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setColor(int i)
	{
		mColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #92  <Field int mColor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setColorized(boolean flag)
	{
		mColorized = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #217 <Field boolean mColorized>
		mColorizedSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #219 <Field boolean mColorizedSet>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public NotificationCompat$Builder setContent(RemoteViews remoteviews)
	{
		mNotification.contentView = remoteviews;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Notification mNotification>
	//    2    4:aload_1         
	//    3    5:putfield        #224 <Field RemoteViews Notification.contentView>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setContentInfo(CharSequence charsequence)
	{
		mContentInfo = limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #228 <Method CharSequence limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #230 <Field CharSequence mContentInfo>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setContentIntent(PendingIntent pendingintent)
	{
		mContentIntent = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #234 <Field PendingIntent mContentIntent>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setContentText(CharSequence charsequence)
	{
		mContentText = limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #228 <Method CharSequence limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #237 <Field CharSequence mContentText>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setContentTitle(CharSequence charsequence)
	{
		mContentTitle = limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #228 <Method CharSequence limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #240 <Field CharSequence mContentTitle>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setCustomBigContentView(RemoteViews remoteviews)
	{
		mBigContentView = remoteviews;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #187 <Field RemoteViews mBigContentView>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setCustomContentView(RemoteViews remoteviews)
	{
		mContentView = remoteviews;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #192 <Field RemoteViews mContentView>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setCustomHeadsUpContentView(RemoteViews remoteviews)
	{
		mHeadsUpContentView = remoteviews;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #198 <Field RemoteViews mHeadsUpContentView>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setDefaults(int i)
	{
		mNotification.defaults = i;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Notification mNotification>
	//    2    4:iload_1         
	//    3    5:putfield        #247 <Field int Notification.defaults>
		if((i & 4) != 0)
	//*   4    8:iload_1         
	//*   5    9:iconst_4        
	//*   6   10:iand            
	//*   7   11:ifeq            29
		{
			Notification notification = mNotification;
	//    8   14:aload_0         
	//    9   15:getfield        #103 <Field Notification mNotification>
	//   10   18:astore_2        
			notification.flags = notification.flags | 1;
	//   11   19:aload_2         
	//   12   20:aload_2         
	//   13   21:getfield        #141 <Field int Notification.flags>
	//   14   24:iconst_1        
	//   15   25:ior             
	//   16   26:putfield        #141 <Field int Notification.flags>
		}
		return this;
	//   17   29:aload_0         
	//   18   30:areturn         
	}

	public NotificationCompat$Builder setDeleteIntent(PendingIntent pendingintent)
	{
		mNotification.deleteIntent = pendingintent;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Notification mNotification>
	//    2    4:aload_1         
	//    3    5:putfield        #251 <Field PendingIntent Notification.deleteIntent>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setExtras(Bundle bundle)
	{
		mExtras = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #157 <Field Bundle mExtras>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setFullScreenIntent(PendingIntent pendingintent, boolean flag)
	{
		mFullScreenIntent = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #256 <Field PendingIntent mFullScreenIntent>
		setFlag(128, flag);
	//    3    5:aload_0         
	//    4    6:sipush          128
	//    5    9:iload_2         
	//    6   10:invokespecial   #206 <Method void setFlag(int, boolean)>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public NotificationCompat$Builder setGroup(String s)
	{
		mGroupKey = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #259 <Field String mGroupKey>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setGroupAlertBehavior(int i)
	{
		mGroupAlertBehavior = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #98  <Field int mGroupAlertBehavior>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setGroupSummary(boolean flag)
	{
		mGroupSummary = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #263 <Field boolean mGroupSummary>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setLargeIcon(Bitmap bitmap)
	{
		mLargeIcon = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #267 <Field Bitmap mLargeIcon>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setLights(int i, int j, int k)
	{
		mNotification.ledARGB = i;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Notification mNotification>
	//    2    4:iload_1         
	//    3    5:putfield        #272 <Field int Notification.ledARGB>
		mNotification.ledOnMS = j;
	//    4    8:aload_0         
	//    5    9:getfield        #103 <Field Notification mNotification>
	//    6   12:iload_2         
	//    7   13:putfield        #275 <Field int Notification.ledOnMS>
		mNotification.ledOffMS = k;
	//    8   16:aload_0         
	//    9   17:getfield        #103 <Field Notification mNotification>
	//   10   20:iload_3         
	//   11   21:putfield        #278 <Field int Notification.ledOffMS>
		if(mNotification.ledOnMS != 0 && mNotification.ledOffMS != 0)
	//*  12   24:aload_0         
	//*  13   25:getfield        #103 <Field Notification mNotification>
	//*  14   28:getfield        #275 <Field int Notification.ledOnMS>
	//*  15   31:ifeq            49
	//*  16   34:aload_0         
	//*  17   35:getfield        #103 <Field Notification mNotification>
	//*  18   38:getfield        #278 <Field int Notification.ledOffMS>
	//*  19   41:ifeq            49
			i = 1;
	//   20   44:iconst_1        
	//   21   45:istore_1        
		else
	//*  22   46:goto            51
			i = 0;
	//   23   49:iconst_0        
	//   24   50:istore_1        
		mNotification.flags = i | mNotification.flags & -2;
	//   25   51:aload_0         
	//   26   52:getfield        #103 <Field Notification mNotification>
	//   27   55:iload_1         
	//   28   56:aload_0         
	//   29   57:getfield        #103 <Field Notification mNotification>
	//   30   60:getfield        #141 <Field int Notification.flags>
	//   31   63:bipush          -2
	//   32   65:iand            
	//   33   66:ior             
	//   34   67:putfield        #141 <Field int Notification.flags>
		return this;
	//   35   70:aload_0         
	//   36   71:areturn         
	}

	public NotificationCompat$Builder setLocalOnly(boolean flag)
	{
		mLocalOnly = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #90  <Field boolean mLocalOnly>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setNumber(int i)
	{
		mNumber = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #282 <Field int mNumber>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setOngoing(boolean flag)
	{
		setFlag(2, flag);
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:iload_1         
	//    3    3:invokespecial   #206 <Method void setFlag(int, boolean)>
		return this;
	//    4    6:aload_0         
	//    5    7:areturn         
	}

	public NotificationCompat$Builder setOnlyAlertOnce(boolean flag)
	{
		setFlag(8, flag);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:iload_1         
	//    3    4:invokespecial   #206 <Method void setFlag(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public NotificationCompat$Builder setPriority(int i)
	{
		mPriority = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #121 <Field int mPriority>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setProgress(int i, int j, boolean flag)
	{
		mProgressMax = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #289 <Field int mProgressMax>
		mProgress = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #291 <Field int mProgress>
		mProgressIndeterminate = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #293 <Field boolean mProgressIndeterminate>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public NotificationCompat$Builder setPublicVersion(Notification notification)
	{
		mPublicVersion = notification;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #297 <Field Notification mPublicVersion>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setRemoteInputHistory(CharSequence acharsequence[])
	{
		mRemoteInputHistory = acharsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #301 <Field CharSequence[] mRemoteInputHistory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setShortcutId(String s)
	{
		mShortcutId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #304 <Field String mShortcutId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setShowWhen(boolean flag)
	{
		mShowWhen = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #88  <Field boolean mShowWhen>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setSmallIcon(int i)
	{
		mNotification.icon = i;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Notification mNotification>
	//    2    4:iload_1         
	//    3    5:putfield        #309 <Field int Notification.icon>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setSmallIcon(int i, int j)
	{
		mNotification.icon = i;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Notification mNotification>
	//    2    4:iload_1         
	//    3    5:putfield        #309 <Field int Notification.icon>
		mNotification.iconLevel = j;
	//    4    8:aload_0         
	//    5    9:getfield        #103 <Field Notification mNotification>
	//    6   12:iload_2         
	//    7   13:putfield        #313 <Field int Notification.iconLevel>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public NotificationCompat$Builder setSortKey(String s)
	{
		mSortKey = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #316 <Field String mSortKey>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setSound(Uri uri)
	{
		mNotification.sound = uri;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Notification mNotification>
	//    2    4:aload_1         
	//    3    5:putfield        #322 <Field Uri Notification.sound>
		mNotification.audioStreamType = -1;
	//    4    8:aload_0         
	//    5    9:getfield        #103 <Field Notification mNotification>
	//    6   12:iconst_m1       
	//    7   13:putfield        #119 <Field int Notification.audioStreamType>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   8   16:getstatic       #327 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   19:bipush          21
	//*  10   21:icmplt          49
			mNotification.audioAttributes = (new android.media.AudioAttributes.Builder()).setContentType(4).setUsage(5).build();
	//   11   24:aload_0         
	//   12   25:getfield        #103 <Field Notification mNotification>
	//   13   28:new             #329 <Class android.media.AudioAttributes$Builder>
	//   14   31:dup             
	//   15   32:invokespecial   #330 <Method void android.media.AudioAttributes$Builder()>
	//   16   35:iconst_4        
	//   17   36:invokevirtual   #334 <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setContentType(int)>
	//   18   39:iconst_5        
	//   19   40:invokevirtual   #337 <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setUsage(int)>
	//   20   43:invokevirtual   #340 <Method android.media.AudioAttributes android.media.AudioAttributes$Builder.build()>
	//   21   46:putfield        #344 <Field android.media.AudioAttributes Notification.audioAttributes>
		return this;
	//   22   49:aload_0         
	//   23   50:areturn         
	}

	public NotificationCompat$Builder setSound(Uri uri, int i)
	{
		mNotification.sound = uri;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Notification mNotification>
	//    2    4:aload_1         
	//    3    5:putfield        #322 <Field Uri Notification.sound>
		mNotification.audioStreamType = i;
	//    4    8:aload_0         
	//    5    9:getfield        #103 <Field Notification mNotification>
	//    6   12:iload_2         
	//    7   13:putfield        #119 <Field int Notification.audioStreamType>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   8   16:getstatic       #327 <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   19:bipush          21
	//*  10   21:icmplt          49
			mNotification.audioAttributes = (new android.media.AudioAttributes.Builder()).setContentType(4).setLegacyStreamType(i).build();
	//   11   24:aload_0         
	//   12   25:getfield        #103 <Field Notification mNotification>
	//   13   28:new             #329 <Class android.media.AudioAttributes$Builder>
	//   14   31:dup             
	//   15   32:invokespecial   #330 <Method void android.media.AudioAttributes$Builder()>
	//   16   35:iconst_4        
	//   17   36:invokevirtual   #334 <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setContentType(int)>
	//   18   39:iload_2         
	//   19   40:invokevirtual   #348 <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setLegacyStreamType(int)>
	//   20   43:invokevirtual   #340 <Method android.media.AudioAttributes android.media.AudioAttributes$Builder.build()>
	//   21   46:putfield        #344 <Field android.media.AudioAttributes Notification.audioAttributes>
		return this;
	//   22   49:aload_0         
	//   23   50:areturn         
	}

	public NotificationCompat$Builder setStyle(NotificationCompat.Style style)
	{
		if(mStyle != style)
	//*   0    0:aload_0         
	//*   1    1:getfield        #352 <Field NotificationCompat$Style mStyle>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       28
		{
			mStyle = style;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #352 <Field NotificationCompat$Style mStyle>
			if(mStyle != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #352 <Field NotificationCompat$Style mStyle>
	//*   9   17:ifnull          28
				mStyle.setBuilder(this);
	//   10   20:aload_0         
	//   11   21:getfield        #352 <Field NotificationCompat$Style mStyle>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #357 <Method void NotificationCompat$Style.setBuilder(NotificationCompat$Builder)>
		}
		return this;
	//   14   28:aload_0         
	//   15   29:areturn         
	}

	public NotificationCompat$Builder setSubText(CharSequence charsequence)
	{
		mSubText = limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #228 <Method CharSequence limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #360 <Field CharSequence mSubText>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setTicker(CharSequence charsequence)
	{
		mNotification.tickerText = limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Notification mNotification>
	//    2    4:aload_1         
	//    3    5:invokestatic    #228 <Method CharSequence limitCharSequenceLength(CharSequence)>
	//    4    8:putfield        #364 <Field CharSequence Notification.tickerText>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public NotificationCompat$Builder setTicker(CharSequence charsequence, RemoteViews remoteviews)
	{
		mNotification.tickerText = limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Notification mNotification>
	//    2    4:aload_1         
	//    3    5:invokestatic    #228 <Method CharSequence limitCharSequenceLength(CharSequence)>
	//    4    8:putfield        #364 <Field CharSequence Notification.tickerText>
		mTickerView = remoteviews;
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:putfield        #367 <Field RemoteViews mTickerView>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public NotificationCompat$Builder setTimeoutAfter(long l)
	{
		mTimeout = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #371 <Field long mTimeout>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setUsesChronometer(boolean flag)
	{
		mUseChronometer = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #374 <Field boolean mUseChronometer>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setVibrate(long al[])
	{
		mNotification.vibrate = al;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Notification mNotification>
	//    2    4:aload_1         
	//    3    5:putfield        #380 <Field long[] Notification.vibrate>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setVisibility(int i)
	{
		mVisibility = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #94  <Field int mVisibility>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setWhen(long l)
	{
		mNotification.when = l;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field Notification mNotification>
	//    2    4:lload_1         
	//    3    5:putfield        #116 <Field long Notification.when>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	private static final int MAX_CHARSEQUENCE_LENGTH = 5120;
	public ArrayList mActions;
	int mBadgeIcon;
	RemoteViews mBigContentView;
	String mCategory;
	String mChannelId;
	int mColor;
	boolean mColorized;
	boolean mColorizedSet;
	CharSequence mContentInfo;
	PendingIntent mContentIntent;
	CharSequence mContentText;
	CharSequence mContentTitle;
	RemoteViews mContentView;
	public Context mContext;
	Bundle mExtras;
	PendingIntent mFullScreenIntent;
	int mGroupAlertBehavior;
	String mGroupKey;
	boolean mGroupSummary;
	RemoteViews mHeadsUpContentView;
	Bitmap mLargeIcon;
	boolean mLocalOnly;
	Notification mNotification;
	int mNumber;
	public ArrayList mPeople;
	int mPriority;
	int mProgress;
	boolean mProgressIndeterminate;
	int mProgressMax;
	Notification mPublicVersion;
	CharSequence mRemoteInputHistory[];
	String mShortcutId;
	boolean mShowWhen;
	String mSortKey;
	NotificationCompat.Style mStyle;
	CharSequence mSubText;
	RemoteViews mTickerView;
	long mTimeout;
	boolean mUseChronometer;
	int mVisibility;

	public NotificationCompat$Builder(Context context)
	{
		this(context, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #75  <Method void NotificationCompat$Builder(Context, String)>
	//    4    6:return          
	}

	public NotificationCompat$Builder(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void Object()>
		mActions = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #83  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #84  <Method void ArrayList()>
	//    6   12:putfield        #86  <Field ArrayList mActions>
		mShowWhen = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #88  <Field boolean mShowWhen>
		mLocalOnly = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #90  <Field boolean mLocalOnly>
		mColor = 0;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #92  <Field int mColor>
		mVisibility = 0;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #94  <Field int mVisibility>
		mBadgeIcon = 0;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #96  <Field int mBadgeIcon>
		mGroupAlertBehavior = 0;
	//   22   40:aload_0         
	//   23   41:iconst_0        
	//   24   42:putfield        #98  <Field int mGroupAlertBehavior>
		mNotification = new Notification();
	//   25   45:aload_0         
	//   26   46:new             #100 <Class Notification>
	//   27   49:dup             
	//   28   50:invokespecial   #101 <Method void Notification()>
	//   29   53:putfield        #103 <Field Notification mNotification>
		mContext = context;
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:putfield        #105 <Field Context mContext>
		mChannelId = s;
	//   33   61:aload_0         
	//   34   62:aload_2         
	//   35   63:putfield        #107 <Field String mChannelId>
		mNotification.when = System.currentTimeMillis();
	//   36   66:aload_0         
	//   37   67:getfield        #103 <Field Notification mNotification>
	//   38   70:invokestatic    #113 <Method long System.currentTimeMillis()>
	//   39   73:putfield        #116 <Field long Notification.when>
		mNotification.audioStreamType = -1;
	//   40   76:aload_0         
	//   41   77:getfield        #103 <Field Notification mNotification>
	//   42   80:iconst_m1       
	//   43   81:putfield        #119 <Field int Notification.audioStreamType>
		mPriority = 0;
	//   44   84:aload_0         
	//   45   85:iconst_0        
	//   46   86:putfield        #121 <Field int mPriority>
		mPeople = new ArrayList();
	//   47   89:aload_0         
	//   48   90:new             #83  <Class ArrayList>
	//   49   93:dup             
	//   50   94:invokespecial   #84  <Method void ArrayList()>
	//   51   97:putfield        #123 <Field ArrayList mPeople>
	//   52  100:return          
	}
}
