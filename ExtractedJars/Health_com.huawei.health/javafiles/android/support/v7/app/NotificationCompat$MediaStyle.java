// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.PendingIntent;

// Referenced classes of package android.support.v7.app:
//			NotificationCompat

public static class NotificationCompat$MediaStyle extends android.support.v4.app.NotificationCompat.Style
{

	public NotificationCompat$MediaStyle setCancelButtonIntent(PendingIntent pendingintent)
	{
		mCancelButtonIntent = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field PendingIntent mCancelButtonIntent>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$MediaStyle setMediaSession(android.support.v4.media.session.MediaSessionCompat.Token token)
	{
		mToken = token;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #34  <Field android.support.v4.media.session.MediaSessionCompat$Token mToken>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public transient NotificationCompat$MediaStyle setShowActionsInCompactView(int ai[])
	{
		mActionsToShowInCompact = ai;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field int[] mActionsToShowInCompact>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NotificationCompat$MediaStyle setShowCancelButton(boolean flag)
	{
		mShowCancelButton = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #40  <Field boolean mShowCancelButton>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	int mActionsToShowInCompact[];
	PendingIntent mCancelButtonIntent;
	boolean mShowCancelButton;
	android.support.v4.media.session.MediaSessionCompat.Token mToken;

	public NotificationCompat$MediaStyle()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void android.support.v4.app.NotificationCompat$Style()>
		mActionsToShowInCompact = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field int[] mActionsToShowInCompact>
	//    5    9:return          
	}

	public NotificationCompat$MediaStyle(android.support.v4.app.NotificationCompat.Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void android.support.v4.app.NotificationCompat$Style()>
		mActionsToShowInCompact = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #21  <Field int[] mActionsToShowInCompact>
		setBuilder(builder);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #26  <Method void setBuilder(android.support.v4.app.NotificationCompat$Builder)>
	//    8   14:return          
	}
}
