// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
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
	//*   7    9:invokeinterface #133 <Method int CharSequence.length()>
	//*   8   14:sipush          5120
	//*   9   17:icmple          31
			charsequence1 = charsequence.subSequence(0, 5120);
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:sipush          5120
	//   13   25:invokeinterface #137 <Method CharSequence CharSequence.subSequence(int, int)>
	//   14   30:astore_1        
		return charsequence1;
	//   15   31:aload_1         
	//   16   32:areturn         
	}

	private Bitmap reduceLargeIconSize(Bitmap bitmap)
	{
		if(bitmap != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          121
		{
			if(android.os.Build.VERSION.SDK_INT >= 27)
	//*   2    4:getstatic       #144 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          27
	//*   4    9:icmplt          14
				return bitmap;
	//    5   12:aload_1         
	//    6   13:areturn         
			Resources resources = mContext.getResources();
	//    7   14:aload_0         
	//    8   15:getfield        #106 <Field Context mContext>
	//    9   18:invokevirtual   #150 <Method Resources Context.getResources()>
	//   10   21:astore          6
			int i = resources.getDimensionPixelSize(android.support.compat.R.dimen.compat_notification_large_icon_max_width);
	//   11   23:aload           6
	//   12   25:getstatic       #155 <Field int android.support.compat.R$dimen.compat_notification_large_icon_max_width>
	//   13   28:invokevirtual   #161 <Method int Resources.getDimensionPixelSize(int)>
	//   14   31:istore          4
			int j = resources.getDimensionPixelSize(android.support.compat.R.dimen.compat_notification_large_icon_max_height);
	//   15   33:aload           6
	//   16   35:getstatic       #164 <Field int android.support.compat.R$dimen.compat_notification_large_icon_max_height>
	//   17   38:invokevirtual   #161 <Method int Resources.getDimensionPixelSize(int)>
	//   18   41:istore          5
			if(bitmap.getWidth() <= i && bitmap.getHeight() <= j)
	//*  19   43:aload_1         
	//*  20   44:invokevirtual   #169 <Method int Bitmap.getWidth()>
	//*  21   47:iload           4
	//*  22   49:icmpgt          63
	//*  23   52:aload_1         
	//*  24   53:invokevirtual   #172 <Method int Bitmap.getHeight()>
	//*  25   56:iload           5
	//*  26   58:icmpgt          63
			{
				return bitmap;
	//   27   61:aload_1         
	//   28   62:areturn         
			} else
			{
				double d = Math.min((double)i / (double)Math.max(1, bitmap.getWidth()), (double)j / (double)Math.max(1, bitmap.getHeight()));
	//   29   63:iload           4
	//   30   65:i2d             
	//   31   66:iconst_1        
	//   32   67:aload_1         
	//   33   68:invokevirtual   #169 <Method int Bitmap.getWidth()>
	//   34   71:invokestatic    #178 <Method int Math.max(int, int)>
	//   35   74:i2d             
	//   36   75:ddiv            
	//   37   76:iload           5
	//   38   78:i2d             
	//   39   79:iconst_1        
	//   40   80:aload_1         
	//   41   81:invokevirtual   #172 <Method int Bitmap.getHeight()>
	//   42   84:invokestatic    #178 <Method int Math.max(int, int)>
	//   43   87:i2d             
	//   44   88:ddiv            
	//   45   89:invokestatic    #182 <Method double Math.min(double, double)>
	//   46   92:dstore_2        
				return Bitmap.createScaledBitmap(bitmap, (int)Math.ceil((double)bitmap.getWidth() * d), (int)Math.ceil((double)bitmap.getHeight() * d), true);
	//   47   93:aload_1         
	//   48   94:aload_1         
	//   49   95:invokevirtual   #169 <Method int Bitmap.getWidth()>
	//   50   98:i2d             
	//   51   99:dload_2         
	//   52  100:dmul            
	//   53  101:invokestatic    #186 <Method double Math.ceil(double)>
	//   54  104:d2i             
	//   55  105:aload_1         
	//   56  106:invokevirtual   #172 <Method int Bitmap.getHeight()>
	//   57  109:i2d             
	//   58  110:dload_2         
	//   59  111:dmul            
	//   60  112:invokestatic    #186 <Method double Math.ceil(double)>
	//   61  115:d2i             
	//   62  116:iconst_1        
	//   63  117:invokestatic    #190 <Method Bitmap Bitmap.createScaledBitmap(Bitmap, int, int, boolean)>
	//   64  120:areturn         
			}
		} else
		{
			return bitmap;
	//   65  121:aload_1         
	//   66  122:areturn         
		}
	}

	private void setFlag(int i, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            20
		{
			Notification notification = mNotification;
	//    2    4:aload_0         
	//    3    5:getfield        #104 <Field Notification mNotification>
	//    4    8:astore_3        
			notification.flags = i | notification.flags;
	//    5    9:aload_3         
	//    6   10:iload_1         
	//    7   11:aload_3         
	//    8   12:getfield        #195 <Field int Notification.flags>
	//    9   15:ior             
	//   10   16:putfield        #195 <Field int Notification.flags>
			return;
	//   11   19:return          
		} else
		{
			Notification notification1 = mNotification;
	//   12   20:aload_0         
	//   13   21:getfield        #104 <Field Notification mNotification>
	//   14   24:astore_3        
			notification1.flags = i & notification1.flags;
	//   15   25:aload_3         
	//   16   26:iload_1         
	//   17   27:aload_3         
	//   18   28:getfield        #195 <Field int Notification.flags>
	//   19   31:iand            
	//   20   32:putfield        #195 <Field int Notification.flags>
			return;
	//   21   35:return          
		}
	}

	public NotificationCompat$Builder addAction(NotificationCompat.Action action)
	{
		mActions.add(((Object) (action)));
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field ArrayList mActions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #201 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public Notification build()
	{
		return (new NotificationCompatBuilder(this)).build();
	//    0    0:new             #205 <Class NotificationCompatBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #208 <Method void NotificationCompatBuilder(NotificationCompat$Builder)>
	//    4    8:invokevirtual   #210 <Method Notification NotificationCompatBuilder.build()>
	//    5   11:areturn         
	}

	public RemoteViews getBigContentView()
	{
		return mBigContentView;
	//    0    0:aload_0         
	//    1    1:getfield        #214 <Field RemoteViews mBigContentView>
	//    2    4:areturn         
	}

	public int getColor()
	{
		return mColor;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field int mColor>
	//    2    4:ireturn         
	}

	public RemoteViews getContentView()
	{
		return mContentView;
	//    0    0:aload_0         
	//    1    1:getfield        #219 <Field RemoteViews mContentView>
	//    2    4:areturn         
	}

	public Bundle getExtras()
	{
		if(mExtras == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #223 <Field Bundle mExtras>
	//*   2    4:ifnonnull       18
			mExtras = new Bundle();
	//    3    7:aload_0         
	//    4    8:new             #225 <Class Bundle>
	//    5   11:dup             
	//    6   12:invokespecial   #226 <Method void Bundle()>
	//    7   15:putfield        #223 <Field Bundle mExtras>
		return mExtras;
	//    8   18:aload_0         
	//    9   19:getfield        #223 <Field Bundle mExtras>
	//   10   22:areturn         
	}

	public RemoteViews getHeadsUpContentView()
	{
		return mHeadsUpContentView;
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field RemoteViews mHeadsUpContentView>
	//    2    4:areturn         
	}

	public int getPriority()
	{
		return mPriority;
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field int mPriority>
	//    2    4:ireturn         
	}

	public long getWhenIfShowing()
	{
		if(mShowWhen)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field boolean mShowWhen>
	//*   2    4:ifeq            15
			return mNotification.when;
	//    3    7:aload_0         
	//    4    8:getfield        #104 <Field Notification mNotification>
	//    5   11:getfield        #117 <Field long Notification.when>
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
	//    3    4:invokespecial   #235 <Method void setFlag(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public NotificationCompat$Builder setCategory(String s)
	{
		mCategory = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #239 <Field String mCategory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setChannelId(String s)
	{
		mChannelId = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #108 <Field String mChannelId>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setColor(int i)
	{
		mColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #93  <Field int mColor>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setContentIntent(PendingIntent pendingintent)
	{
		mContentIntent = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #247 <Field PendingIntent mContentIntent>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setContentText(CharSequence charsequence)
	{
		mContentText = limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #251 <Method CharSequence limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #253 <Field CharSequence mContentText>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setContentTitle(CharSequence charsequence)
	{
		mContentTitle = limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #251 <Method CharSequence limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #256 <Field CharSequence mContentTitle>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setCustomBigContentView(RemoteViews remoteviews)
	{
		mBigContentView = remoteviews;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #214 <Field RemoteViews mBigContentView>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setDefaults(int i)
	{
		Notification notification = mNotification;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Notification mNotification>
	//    2    4:astore_2        
		notification.defaults = i;
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:putfield        #262 <Field int Notification.defaults>
		if((i & 4) != 0)
	//*   6   10:iload_1         
	//*   7   11:iconst_4        
	//*   8   12:iand            
	//*   9   13:ifeq            26
			notification.flags = notification.flags | 1;
	//   10   16:aload_2         
	//   11   17:aload_2         
	//   12   18:getfield        #195 <Field int Notification.flags>
	//   13   21:iconst_1        
	//   14   22:ior             
	//   15   23:putfield        #195 <Field int Notification.flags>
		return this;
	//   16   26:aload_0         
	//   17   27:areturn         
	}

	public NotificationCompat$Builder setDeleteIntent(PendingIntent pendingintent)
	{
		mNotification.deleteIntent = pendingintent;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Notification mNotification>
	//    2    4:aload_1         
	//    3    5:putfield        #266 <Field PendingIntent Notification.deleteIntent>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setLargeIcon(Bitmap bitmap)
	{
		mLargeIcon = reduceLargeIconSize(bitmap);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokespecial   #270 <Method Bitmap reduceLargeIconSize(Bitmap)>
	//    4    6:putfield        #272 <Field Bitmap mLargeIcon>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public NotificationCompat$Builder setLocalOnly(boolean flag)
	{
		mLocalOnly = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #91  <Field boolean mLocalOnly>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setNumber(int i)
	{
		mNumber = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #276 <Field int mNumber>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setOnlyAlertOnce(boolean flag)
	{
		setFlag(8, flag);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:iload_1         
	//    3    4:invokespecial   #235 <Method void setFlag(int, boolean)>
		return this;
	//    4    7:aload_0         
	//    5    8:areturn         
	}

	public NotificationCompat$Builder setPriority(int i)
	{
		mPriority = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #122 <Field int mPriority>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setPublicVersion(Notification notification)
	{
		mPublicVersion = notification;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #282 <Field Notification mPublicVersion>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setShowWhen(boolean flag)
	{
		mShowWhen = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #89  <Field boolean mShowWhen>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setSmallIcon(int i)
	{
		mNotification.icon = i;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Notification mNotification>
	//    2    4:iload_1         
	//    3    5:putfield        #287 <Field int Notification.icon>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setSound(Uri uri)
	{
		Notification notification = mNotification;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Notification mNotification>
	//    2    4:astore_2        
		notification.sound = uri;
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:putfield        #293 <Field Uri Notification.sound>
		notification.audioStreamType = -1;
	//    6   10:aload_2         
	//    7   11:iconst_m1       
	//    8   12:putfield        #120 <Field int Notification.audioStreamType>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   9   15:getstatic       #144 <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   18:bipush          21
	//*  11   20:icmplt          48
			mNotification.audioAttributes = (new android.media.AudioAttributes.Builder()).setContentType(4).setUsage(5).build();
	//   12   23:aload_0         
	//   13   24:getfield        #104 <Field Notification mNotification>
	//   14   27:new             #295 <Class android.media.AudioAttributes$Builder>
	//   15   30:dup             
	//   16   31:invokespecial   #296 <Method void android.media.AudioAttributes$Builder()>
	//   17   34:iconst_4        
	//   18   35:invokevirtual   #300 <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setContentType(int)>
	//   19   38:iconst_5        
	//   20   39:invokevirtual   #303 <Method android.media.AudioAttributes$Builder android.media.AudioAttributes$Builder.setUsage(int)>
	//   21   42:invokevirtual   #306 <Method android.media.AudioAttributes android.media.AudioAttributes$Builder.build()>
	//   22   45:putfield        #310 <Field android.media.AudioAttributes Notification.audioAttributes>
		return this;
	//   23   48:aload_0         
	//   24   49:areturn         
	}

	public NotificationCompat$Builder setStyle(NotificationCompat.Style style)
	{
		if(mStyle != style)
	//*   0    0:aload_0         
	//*   1    1:getfield        #314 <Field NotificationCompat$Style mStyle>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       27
		{
			mStyle = style;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #314 <Field NotificationCompat$Style mStyle>
			style = mStyle;
	//    7   13:aload_0         
	//    8   14:getfield        #314 <Field NotificationCompat$Style mStyle>
	//    9   17:astore_1        
			if(style != null)
	//*  10   18:aload_1         
	//*  11   19:ifnull          27
				style.setBuilder(this);
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #319 <Method void NotificationCompat$Style.setBuilder(NotificationCompat$Builder)>
		}
		return this;
	//   15   27:aload_0         
	//   16   28:areturn         
	}

	public NotificationCompat$Builder setSubText(CharSequence charsequence)
	{
		mSubText = limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #251 <Method CharSequence limitCharSequenceLength(CharSequence)>
	//    3    5:putfield        #322 <Field CharSequence mSubText>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setTicker(CharSequence charsequence)
	{
		mNotification.tickerText = limitCharSequenceLength(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Notification mNotification>
	//    2    4:aload_1         
	//    3    5:invokestatic    #251 <Method CharSequence limitCharSequenceLength(CharSequence)>
	//    4    8:putfield        #326 <Field CharSequence Notification.tickerText>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public NotificationCompat$Builder setVibrate(long al[])
	{
		mNotification.vibrate = al;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Notification mNotification>
	//    2    4:aload_1         
	//    3    5:putfield        #332 <Field long[] Notification.vibrate>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public NotificationCompat$Builder setVisibility(int i)
	{
		mVisibility = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #95  <Field int mVisibility>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$Builder setWhen(long l)
	{
		mNotification.when = l;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field Notification mNotification>
	//    2    4:lload_1         
	//    3    5:putfield        #117 <Field long Notification.when>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

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
	ArrayList mInvisibleActions;
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
	//    3    3:invokespecial   #74  <Method void NotificationCompat$Builder(Context, String)>
	//    4    6:return          
	}

	public NotificationCompat$Builder(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void Object()>
		mActions = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #82  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #83  <Method void ArrayList()>
	//    6   12:putfield        #85  <Field ArrayList mActions>
		mInvisibleActions = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #82  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #83  <Method void ArrayList()>
	//   11   23:putfield        #87  <Field ArrayList mInvisibleActions>
		mShowWhen = true;
	//   12   26:aload_0         
	//   13   27:iconst_1        
	//   14   28:putfield        #89  <Field boolean mShowWhen>
		mLocalOnly = false;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #91  <Field boolean mLocalOnly>
		mColor = 0;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #93  <Field int mColor>
		mVisibility = 0;
	//   21   41:aload_0         
	//   22   42:iconst_0        
	//   23   43:putfield        #95  <Field int mVisibility>
		mBadgeIcon = 0;
	//   24   46:aload_0         
	//   25   47:iconst_0        
	//   26   48:putfield        #97  <Field int mBadgeIcon>
		mGroupAlertBehavior = 0;
	//   27   51:aload_0         
	//   28   52:iconst_0        
	//   29   53:putfield        #99  <Field int mGroupAlertBehavior>
		mNotification = new Notification();
	//   30   56:aload_0         
	//   31   57:new             #101 <Class Notification>
	//   32   60:dup             
	//   33   61:invokespecial   #102 <Method void Notification()>
	//   34   64:putfield        #104 <Field Notification mNotification>
		mContext = context;
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:putfield        #106 <Field Context mContext>
		mChannelId = s;
	//   38   72:aload_0         
	//   39   73:aload_2         
	//   40   74:putfield        #108 <Field String mChannelId>
		mNotification.when = System.currentTimeMillis();
	//   41   77:aload_0         
	//   42   78:getfield        #104 <Field Notification mNotification>
	//   43   81:invokestatic    #114 <Method long System.currentTimeMillis()>
	//   44   84:putfield        #117 <Field long Notification.when>
		mNotification.audioStreamType = -1;
	//   45   87:aload_0         
	//   46   88:getfield        #104 <Field Notification mNotification>
	//   47   91:iconst_m1       
	//   48   92:putfield        #120 <Field int Notification.audioStreamType>
		mPriority = 0;
	//   49   95:aload_0         
	//   50   96:iconst_0        
	//   51   97:putfield        #122 <Field int mPriority>
		mPeople = new ArrayList();
	//   52  100:aload_0         
	//   53  101:new             #82  <Class ArrayList>
	//   54  104:dup             
	//   55  105:invokespecial   #83  <Method void ArrayList()>
	//   56  108:putfield        #124 <Field ArrayList mPeople>
	//   57  111:return          
	}
}
