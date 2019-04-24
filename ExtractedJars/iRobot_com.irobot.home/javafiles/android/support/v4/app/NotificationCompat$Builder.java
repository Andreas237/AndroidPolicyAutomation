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
//			NotificationCompat

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
	//*   7    9:invokeinterface #128 <Method int CharSequence.length()>
	//*   8   14:sipush          5120
	//*   9   17:icmple          31
			charsequence1 = charsequence.subSequence(0, 5120);
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:sipush          5120
	//   13   25:invokeinterface #132 <Method CharSequence CharSequence.subSequence(int, int)>
	//   14   30:astore_1        
		return charsequence1;
	//   15   31:aload_1         
	//   16   32:areturn         
	}

	private void setFlag(int i, boolean flag)
	{
		Notification notification;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            22
		{
			notification = mNotification;
	//    2    4:aload_0         
	//    3    5:getfield        #98  <Field Notification mNotification>
	//    4    8:astore_3        
			i |= notification.flags;
	//    5    9:iload_1         
	//    6   10:aload_3         
	//    7   11:getfield        #137 <Field int Notification.flags>
	//    8   14:ior             
	//    9   15:istore_1        
		} else
	//*  10   16:aload_3         
	//*  11   17:iload_1         
	//*  12   18:putfield        #137 <Field int Notification.flags>
	//*  13   21:return          
		{
			notification = mNotification;
	//   14   22:aload_0         
	//   15   23:getfield        #98  <Field Notification mNotification>
	//   16   26:astore_3        
			i &= notification.flags;
	//   17   27:iload_1         
	//   18   28:aload_3         
	//   19   29:getfield        #137 <Field int Notification.flags>
	//   20   32:iand            
	//   21   33:istore_1        
		}
		notification.flags = i;
	//*  22   34:goto            16
	}

	public NotificationCompat$Builder addAction(int i, CharSequence charsequence, PendingIntent pendingintent)
	{
		mActions.add(((Object) (new NotificationCompat.Action(i, charsequence, pendingintent))));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field ArrayList mActions>
	//    2    4:new             #141 <Class NotificationCompat$Action>
	//    3    7:dup             
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokespecial   #144 <Method void NotificationCompat$Action(int, CharSequence, PendingIntent)>
	//    8   14:invokevirtual   #148 <Method boolean ArrayList.add(Object)>
	//    9   17:pop             
		return this;
	//   10   18:aload_0         
	//   11   19:areturn         
	}

	public NotificationCompat$Builder addAction(NotificationCompat.Action action)
	{
		mActions.add(((Object) (action)));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field ArrayList mActions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #148 <Method boolean ArrayList.add(Object)>
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
	//*   3    5:getfield        #153 <Field Bundle mExtras>
	//*   4    8:ifnonnull       25
			{
				mExtras = new Bundle(bundle);
	//    5   11:aload_0         
	//    6   12:new             #155 <Class Bundle>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #158 <Method void Bundle(Bundle)>
	//   10   20:putfield        #153 <Field Bundle mExtras>
				return this;
	//   11   23:aload_0         
	//   12   24:areturn         
			}
			mExtras.putAll(bundle);
	//   13   25:aload_0         
	//   14   26:getfield        #153 <Field Bundle mExtras>
	//   15   29:aload_1         
	//   16   30:invokevirtual   #161 <Method void Bundle.putAll(Bundle)>
		}
		return this;
	//   17   33:aload_0         
	//   18   34:areturn         
	}

	public NotificationCompat$Builder addPerson(String s)
	{
		mPeople.add(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field ArrayList mPeople>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #148 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Notification build()
	{
		return NotificationCompat.IMPL.build(this, getExtender());
	//    0    0:getstatic       #169 <Field NotificationCompat$NotificationCompatImpl NotificationCompat.IMPL>
	//    1    3:aload_0         
	//    2    4:aload_0         
	//    3    5:invokevirtual   #173 <Method NotificationCompat$BuilderExtender getExtender()>
	//    4    8:invokeinterface #178 <Method Notification NotificationCompat$NotificationCompatImpl.build(NotificationCompat$Builder, NotificationCompat$BuilderExtender)>
	//    5   13:areturn         
	}

	public NotificationCompat$Builder extend( )
	{
		.extend(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #185 <Method NotificationCompat$Builder NotificationCompat$Extender.extend(NotificationCompat$Builder)>
	//    3    7:pop             
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public RemoteViews getBigContentView()
	{
		return mBigContentView;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field RemoteViews mBigContentView>
	//    2    4:areturn         
	}

	public int getColor()
	{
		return mColor;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int mColor>
	//    2    4:ireturn         
	}

	public RemoteViews getContentView()
	{
		return mContentView;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field RemoteViews mContentView>
	//    2    4:areturn         
	}

	protected xtender getExtender()
	{
		return new xtender();
	//    0    0:new             #195 <Class NotificationCompat$BuilderExtender>
	//    1    3:dup             
	//    2    4:invokespecial   #196 <Method void NotificationCompat$BuilderExtender()>
	//    3    7:areturn         
	}

	public Bundle getExtras()
	{
		if(mExtras == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field Bundle mExtras>
	//*   2    4:ifnonnull       18
			mExtras = new Bundle();
	//    3    7:aload_0         
	//    4    8:new             #155 <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #199 <Method void Bundle()>
	//    7   15:putfield        #153 <Field Bundle mExtras>
		return mExtras;
	//    8   18:aload_0         
	//    9   19:getfield        #153 <Field Bundle mExtras>
	//   10   22:areturn         
	}

	public RemoteViews getHeadsUpContentView()
	{
		return mHeadsUpContentView;
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field RemoteViews mHeadsUpContentView>
	//    2    4:areturn         
	}

	public Notification getNotification()
	{
		return build();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #205 <Method Notification build()>
	//    2    4:areturn         
	}

	public int getPriority()
	{
		return mPriority;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int mPriority>
	//    2    4:ireturn         
	}

	public long getWhenIfShowing()
	{
		if(mShowWhen)
	//*   0    0:aload_0         
	//*   1    1:getfield        #78  <Field boolean mShowWhen>
	//*   2    4:ifeq            15
			return mNotification.when;
	//    3    7:aload_0         
	//    4    8:getfield        #98  <Field Notification mNotification>
	//    5   11:getfield        #111 <Field long Notification.when>
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
	//    3    4:invokespecial   #211 <Method void setFlag(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public NotificationCompat$Builder setBadgeIconType(int i)
	{
		mBadgeIcon = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #91  <Field int mBadgeIcon>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setCategory(String s)
	{
		mCategory = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #216 <Field String mCategory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setChannelId(String s)
	{
		mChannelId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #102 <Field String mChannelId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setColor(int i)
	{
		mColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #87  <Field int mColor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setColorized(boolean flag)
	{
		mColorized = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #221 <Field boolean mColorized>
		mColorizedSet = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #223 <Field boolean mColorizedSet>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public NotificationCompat$Builder setContent(RemoteViews remoteviews)
	{
		mNotification.contentView = remoteviews;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Notification mNotification>
	//    2    4:aload_1         
	//    3    5:putfield        #228 <Field RemoteViews Notification.contentView>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setContentInfo(CharSequence charsequence)
	{
		mContentInfo = limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #232 <Method CharSequence limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #234 <Field CharSequence mContentInfo>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setContentIntent(PendingIntent pendingintent)
	{
		mContentIntent = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #238 <Field PendingIntent mContentIntent>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setContentText(CharSequence charsequence)
	{
		mContentText = limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #232 <Method CharSequence limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #241 <Field CharSequence mContentText>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setContentTitle(CharSequence charsequence)
	{
		mContentTitle = limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #232 <Method CharSequence limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #244 <Field CharSequence mContentTitle>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setCustomBigContentView(RemoteViews remoteviews)
	{
		mBigContentView = remoteviews;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #189 <Field RemoteViews mBigContentView>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setCustomContentView(RemoteViews remoteviews)
	{
		mContentView = remoteviews;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #193 <Field RemoteViews mContentView>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setCustomHeadsUpContentView(RemoteViews remoteviews)
	{
		mHeadsUpContentView = remoteviews;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #202 <Field RemoteViews mHeadsUpContentView>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setDefaults(int i)
	{
		mNotification.defaults = i;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Notification mNotification>
	//    2    4:iload_1         
	//    3    5:putfield        #251 <Field int Notification.defaults>
		if((i & 4) != 0)
	//*   4    8:iload_1         
	//*   5    9:iconst_4        
	//*   6   10:iand            
	//*   7   11:ifeq            29
		{
			Notification notification = mNotification;
	//    8   14:aload_0         
	//    9   15:getfield        #98  <Field Notification mNotification>
	//   10   18:astore_2        
			notification.flags = notification.flags | 1;
	//   11   19:aload_2         
	//   12   20:aload_2         
	//   13   21:getfield        #137 <Field int Notification.flags>
	//   14   24:iconst_1        
	//   15   25:ior             
	//   16   26:putfield        #137 <Field int Notification.flags>
		}
		return this;
	//   17   29:aload_0         
	//   18   30:areturn         
	}

	public NotificationCompat$Builder setDeleteIntent(PendingIntent pendingintent)
	{
		mNotification.deleteIntent = pendingintent;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Notification mNotification>
	//    2    4:aload_1         
	//    3    5:putfield        #255 <Field PendingIntent Notification.deleteIntent>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setExtras(Bundle bundle)
	{
		mExtras = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #153 <Field Bundle mExtras>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setFullScreenIntent(PendingIntent pendingintent, boolean flag)
	{
		mFullScreenIntent = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #260 <Field PendingIntent mFullScreenIntent>
		setFlag(128, flag);
	//    3    5:aload_0         
	//    4    6:sipush          128
	//    5    9:iload_2         
	//    6   10:invokespecial   #211 <Method void setFlag(int, boolean)>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public NotificationCompat$Builder setGroup(String s)
	{
		mGroupKey = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #263 <Field String mGroupKey>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setGroupAlertBehavior(int i)
	{
		mGroupAlertBehavior = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #93  <Field int mGroupAlertBehavior>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setGroupSummary(boolean flag)
	{
		mGroupSummary = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #267 <Field boolean mGroupSummary>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setLargeIcon(Bitmap bitmap)
	{
		mLargeIcon = bitmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #271 <Field Bitmap mLargeIcon>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setLights(int i, int j, int k)
	{
		mNotification.ledARGB = i;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Notification mNotification>
	//    2    4:iload_1         
	//    3    5:putfield        #276 <Field int Notification.ledARGB>
		mNotification.ledOnMS = j;
	//    4    8:aload_0         
	//    5    9:getfield        #98  <Field Notification mNotification>
	//    6   12:iload_2         
	//    7   13:putfield        #279 <Field int Notification.ledOnMS>
		mNotification.ledOffMS = k;
	//    8   16:aload_0         
	//    9   17:getfield        #98  <Field Notification mNotification>
	//   10   20:iload_3         
	//   11   21:putfield        #282 <Field int Notification.ledOffMS>
		if(mNotification.ledOnMS != 0 && mNotification.ledOffMS != 0)
	//*  12   24:aload_0         
	//*  13   25:getfield        #98  <Field Notification mNotification>
	//*  14   28:getfield        #279 <Field int Notification.ledOnMS>
	//*  15   31:ifeq            49
	//*  16   34:aload_0         
	//*  17   35:getfield        #98  <Field Notification mNotification>
	//*  18   38:getfield        #282 <Field int Notification.ledOffMS>
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
	//   26   52:getfield        #98  <Field Notification mNotification>
	//   27   55:iload_1         
	//   28   56:aload_0         
	//   29   57:getfield        #98  <Field Notification mNotification>
	//   30   60:getfield        #137 <Field int Notification.flags>
	//   31   63:bipush          -2
	//   32   65:iand            
	//   33   66:ior             
	//   34   67:putfield        #137 <Field int Notification.flags>
		return this;
	//   35   70:aload_0         
	//   36   71:areturn         
	}

	public NotificationCompat$Builder setLocalOnly(boolean flag)
	{
		mLocalOnly = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #85  <Field boolean mLocalOnly>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setNumber(int i)
	{
		mNumber = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #286 <Field int mNumber>
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
	//    3    3:invokespecial   #211 <Method void setFlag(int, boolean)>
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
	//    3    4:invokespecial   #211 <Method void setFlag(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public NotificationCompat$Builder setPriority(int i)
	{
		mPriority = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #116 <Field int mPriority>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setProgress(int i, int j, boolean flag)
	{
		mProgressMax = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #293 <Field int mProgressMax>
		mProgress = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #295 <Field int mProgress>
		mProgressIndeterminate = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #297 <Field boolean mProgressIndeterminate>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public NotificationCompat$Builder setPublicVersion(Notification notification)
	{
		mPublicVersion = notification;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #301 <Field Notification mPublicVersion>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setRemoteInputHistory(CharSequence acharsequence[])
	{
		mRemoteInputHistory = acharsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #305 <Field CharSequence[] mRemoteInputHistory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setShortcutId(String s)
	{
		mShortcutId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #308 <Field String mShortcutId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setShowWhen(boolean flag)
	{
		mShowWhen = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field boolean mShowWhen>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setSmallIcon(int i)
	{
		mNotification.icon = i;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Notification mNotification>
	//    2    4:iload_1         
	//    3    5:putfield        #313 <Field int Notification.icon>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setSmallIcon(int i, int j)
	{
		mNotification.icon = i;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Notification mNotification>
	//    2    4:iload_1         
	//    3    5:putfield        #313 <Field int Notification.icon>
		mNotification.iconLevel = j;
	//    4    8:aload_0         
	//    5    9:getfield        #98  <Field Notification mNotification>
	//    6   12:iload_2         
	//    7   13:putfield        #317 <Field int Notification.iconLevel>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public NotificationCompat$Builder setSortKey(String s)
	{
		mSortKey = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #320 <Field String mSortKey>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setSound(Uri uri)
	{
		mNotification.sound = uri;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Notification mNotification>
	//    2    4:aload_1         
	//    3    5:putfield        #326 <Field Uri Notification.sound>
		mNotification.audioStreamType = -1;
	//    4    8:aload_0         
	//    5    9:getfield        #98  <Field Notification mNotification>
	//    6   12:iconst_m1       
	//    7   13:putfield        #114 <Field int Notification.audioStreamType>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public NotificationCompat$Builder setSound(Uri uri, int i)
	{
		mNotification.sound = uri;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Notification mNotification>
	//    2    4:aload_1         
	//    3    5:putfield        #326 <Field Uri Notification.sound>
		mNotification.audioStreamType = i;
	//    4    8:aload_0         
	//    5    9:getfield        #98  <Field Notification mNotification>
	//    6   12:iload_2         
	//    7   13:putfield        #114 <Field int Notification.audioStreamType>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public NotificationCompat$Builder setStyle(NotificationCompat.Style style)
	{
		if(mStyle != style)
	//*   0    0:aload_0         
	//*   1    1:getfield        #331 <Field NotificationCompat$Style mStyle>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       28
		{
			mStyle = style;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #331 <Field NotificationCompat$Style mStyle>
			if(mStyle != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #331 <Field NotificationCompat$Style mStyle>
	//*   9   17:ifnull          28
				mStyle.setBuilder(this);
	//   10   20:aload_0         
	//   11   21:getfield        #331 <Field NotificationCompat$Style mStyle>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #337 <Method void NotificationCompat$Style.setBuilder(NotificationCompat$Builder)>
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
	//    2    2:invokestatic    #232 <Method CharSequence limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #340 <Field CharSequence mSubText>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setTicker(CharSequence charsequence)
	{
		mNotification.tickerText = limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Notification mNotification>
	//    2    4:aload_1         
	//    3    5:invokestatic    #232 <Method CharSequence limitCharSequenceLength(CharSequence)>
	//    4    8:putfield        #344 <Field CharSequence Notification.tickerText>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public NotificationCompat$Builder setTicker(CharSequence charsequence, RemoteViews remoteviews)
	{
		mNotification.tickerText = limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Notification mNotification>
	//    2    4:aload_1         
	//    3    5:invokestatic    #232 <Method CharSequence limitCharSequenceLength(CharSequence)>
	//    4    8:putfield        #344 <Field CharSequence Notification.tickerText>
		mTickerView = remoteviews;
	//    5   11:aload_0         
	//    6   12:aload_2         
	//    7   13:putfield        #347 <Field RemoteViews mTickerView>
		return this;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public NotificationCompat$Builder setTimeoutAfter(long l)
	{
		mTimeout = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #351 <Field long mTimeout>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setUsesChronometer(boolean flag)
	{
		mUseChronometer = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #354 <Field boolean mUseChronometer>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setVibrate(long al[])
	{
		mNotification.vibrate = al;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Notification mNotification>
	//    2    4:aload_1         
	//    3    5:putfield        #360 <Field long[] Notification.vibrate>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setVisibility(int i)
	{
		mVisibility = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #89  <Field int mVisibility>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setWhen(long l)
	{
		mNotification.when = l;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Notification mNotification>
	//    2    4:lload_1         
	//    3    5:putfield        #111 <Field long Notification.when>
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
	public CharSequence mContentInfo;
	PendingIntent mContentIntent;
	public CharSequence mContentText;
	public CharSequence mContentTitle;
	RemoteViews mContentView;
	public Context mContext;
	Bundle mExtras;
	PendingIntent mFullScreenIntent;
	private int mGroupAlertBehavior;
	String mGroupKey;
	boolean mGroupSummary;
	RemoteViews mHeadsUpContentView;
	public Bitmap mLargeIcon;
	boolean mLocalOnly;
	public Notification mNotification;
	public int mNumber;
	public ArrayList mPeople;
	int mPriority;
	int mProgress;
	boolean mProgressIndeterminate;
	int mProgressMax;
	Notification mPublicVersion;
	public CharSequence mRemoteInputHistory[];
	String mShortcutId;
	boolean mShowWhen;
	String mSortKey;
	public NotificationCompat.Style mStyle;
	public CharSequence mSubText;
	RemoteViews mTickerView;
	long mTimeout;
	public boolean mUseChronometer;
	int mVisibility;


/*
	static int access$000(NotificationCompat$Builder notificationcompat$builder)
	{
		return notificationcompat$builder.mGroupAlertBehavior;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field int mGroupAlertBehavior>
	//    2    4:ireturn         
	}

*/

	public NotificationCompat$Builder(Context context)
	{
		this(context, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #71  <Method void NotificationCompat$Builder(Context, String)>
	//    4    6:return          
	}

	public NotificationCompat$Builder(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void Object()>
		mShowWhen = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #78  <Field boolean mShowWhen>
		mActions = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #80  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #81  <Method void ArrayList()>
	//    9   17:putfield        #83  <Field ArrayList mActions>
		mLocalOnly = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #85  <Field boolean mLocalOnly>
		mColor = 0;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #87  <Field int mColor>
		mVisibility = 0;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #89  <Field int mVisibility>
		mBadgeIcon = 0;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #91  <Field int mBadgeIcon>
		mGroupAlertBehavior = 0;
	//   22   40:aload_0         
	//   23   41:iconst_0        
	//   24   42:putfield        #93  <Field int mGroupAlertBehavior>
		mNotification = new Notification();
	//   25   45:aload_0         
	//   26   46:new             #95  <Class Notification>
	//   27   49:dup             
	//   28   50:invokespecial   #96  <Method void Notification()>
	//   29   53:putfield        #98  <Field Notification mNotification>
		mContext = context;
	//   30   56:aload_0         
	//   31   57:aload_1         
	//   32   58:putfield        #100 <Field Context mContext>
		mChannelId = s;
	//   33   61:aload_0         
	//   34   62:aload_2         
	//   35   63:putfield        #102 <Field String mChannelId>
		mNotification.when = System.currentTimeMillis();
	//   36   66:aload_0         
	//   37   67:getfield        #98  <Field Notification mNotification>
	//   38   70:invokestatic    #108 <Method long System.currentTimeMillis()>
	//   39   73:putfield        #111 <Field long Notification.when>
		mNotification.audioStreamType = -1;
	//   40   76:aload_0         
	//   41   77:getfield        #98  <Field Notification mNotification>
	//   42   80:iconst_m1       
	//   43   81:putfield        #114 <Field int Notification.audioStreamType>
		mPriority = 0;
	//   44   84:aload_0         
	//   45   85:iconst_0        
	//   46   86:putfield        #116 <Field int mPriority>
		mPeople = new ArrayList();
	//   47   89:aload_0         
	//   48   90:new             #80  <Class ArrayList>
	//   49   93:dup             
	//   50   94:invokespecial   #81  <Method void ArrayList()>
	//   51   97:putfield        #118 <Field ArrayList mPeople>
	//   52  100:return          
	}
}
