// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.BundleCompat;

public class NotificationCompat extends android.support.v4.app.NotificationCompat
{
	public static class Builder extends android.support.v4.app.Builder
	{

		public Builder(Context context)
		{
			super(context);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #12  <Method void android.support.v4.app.NotificationCompat$Builder(Context)>
		//    3    5:return          
		}
	}

	public static class DecoratedCustomViewStyle extends android.support.v4.app.DecoratedCustomViewStyle
	{

		public DecoratedCustomViewStyle()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void android.support.v4.app.NotificationCompat$DecoratedCustomViewStyle()>
		//    2    4:return          
		}
	}

	public static class DecoratedMediaCustomViewStyle extends android.support.v4.media.app.DecoratedMediaCustomViewStyle
	{

		public DecoratedMediaCustomViewStyle()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void android.support.v4.media.app.NotificationCompat$DecoratedMediaCustomViewStyle()>
		//    2    4:return          
		}
	}

	public static class MediaStyle extends android.support.v4.media.app.MediaStyle
	{

		public volatile android.support.v4.media.app.MediaStyle setCancelButtonIntent(PendingIntent pendingintent)
		{
			return ((android.support.v4.media.app.MediaStyle) (setCancelButtonIntent(pendingintent)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method NotificationCompat$MediaStyle setCancelButtonIntent(PendingIntent)>
		//    3    5:areturn         
		}

		public MediaStyle setCancelButtonIntent(PendingIntent pendingintent)
		{
			return (MediaStyle)super.setCancelButtonIntent(pendingintent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #24  <Method android.support.v4.media.app.NotificationCompat$MediaStyle android.support.v4.media.app.NotificationCompat$MediaStyle.setCancelButtonIntent(PendingIntent)>
		//    3    5:checkcast       #2   <Class NotificationCompat$MediaStyle>
		//    4    8:areturn         
		}

		public volatile android.support.v4.media.app.MediaStyle setMediaSession(android.support.v4.media.session.MediaSessionCompat.Token token)
		{
			return ((android.support.v4.media.app.MediaStyle) (setMediaSession(token)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #29  <Method NotificationCompat$MediaStyle setMediaSession(android.support.v4.media.session.MediaSessionCompat$Token)>
		//    3    5:areturn         
		}

		public MediaStyle setMediaSession(android.support.v4.media.session.MediaSessionCompat.Token token)
		{
			return (MediaStyle)super.setMediaSession(token);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #31  <Method android.support.v4.media.app.NotificationCompat$MediaStyle android.support.v4.media.app.NotificationCompat$MediaStyle.setMediaSession(android.support.v4.media.session.MediaSessionCompat$Token)>
		//    3    5:checkcast       #2   <Class NotificationCompat$MediaStyle>
		//    4    8:areturn         
		}

		public volatile android.support.v4.media.app.MediaStyle setShowActionsInCompactView(int ai[])
		{
			return ((android.support.v4.media.app.MediaStyle) (setShowActionsInCompactView(ai)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #36  <Method NotificationCompat$MediaStyle setShowActionsInCompactView(int[])>
		//    3    5:areturn         
		}

		public transient MediaStyle setShowActionsInCompactView(int ai[])
		{
			return (MediaStyle)super.setShowActionsInCompactView(ai);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #38  <Method android.support.v4.media.app.NotificationCompat$MediaStyle android.support.v4.media.app.NotificationCompat$MediaStyle.setShowActionsInCompactView(int[])>
		//    3    5:checkcast       #2   <Class NotificationCompat$MediaStyle>
		//    4    8:areturn         
		}

		public volatile android.support.v4.media.app.MediaStyle setShowCancelButton(boolean flag)
		{
			return ((android.support.v4.media.app.MediaStyle) (setShowCancelButton(flag)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #43  <Method NotificationCompat$MediaStyle setShowCancelButton(boolean)>
		//    3    5:areturn         
		}

		public MediaStyle setShowCancelButton(boolean flag)
		{
			return (MediaStyle)super.setShowCancelButton(flag);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #45  <Method android.support.v4.media.app.NotificationCompat$MediaStyle android.support.v4.media.app.NotificationCompat$MediaStyle.setShowCancelButton(boolean)>
		//    3    5:checkcast       #2   <Class NotificationCompat$MediaStyle>
		//    4    8:areturn         
		}

		public MediaStyle()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void android.support.v4.media.app.NotificationCompat$MediaStyle()>
		//    2    4:return          
		}

		public MediaStyle(android.support.v4.app.Builder builder)
		{
			super(builder);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #17  <Method void android.support.v4.media.app.NotificationCompat$MediaStyle(android.support.v4.app.NotificationCompat$Builder)>
		//    3    5:return          
		}
	}


	public NotificationCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void android.support.v4.app.NotificationCompat()>
	//    2    4:return          
	}

	public static android.support.v4.media.session.MediaSessionCompat.Token getMediaSession(Notification notification)
	{
		notification = ((Notification) (getExtras(notification)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #29  <Method Bundle getExtras(Notification)>
	//    2    4:astore_0        
		if(notification != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          77
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   5    9:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          21
	//*   7   14:icmplt          33
			{
				notification = ((Notification) (((Bundle) (notification)).getParcelable("android.mediaSession")));
	//    8   17:aload_0         
	//    9   18:ldc1            #37  <String "android.mediaSession">
	//   10   20:invokevirtual   #43  <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   11   23:astore_0        
				if(notification != null)
	//*  12   24:aload_0         
	//*  13   25:ifnull          77
					return android.support.v4.media.session.MediaSessionCompat.Token.fromToken(((Object) (notification)));
	//   14   28:aload_0         
	//   15   29:invokestatic    #49  <Method android.support.v4.media.session.MediaSessionCompat$Token android.support.v4.media.session.MediaSessionCompat$Token.fromToken(Object)>
	//   16   32:areturn         
			} else
			{
				Object obj = ((Object) (BundleCompat.getBinder(((Bundle) (notification)), "android.mediaSession")));
	//   17   33:aload_0         
	//   18   34:ldc1            #37  <String "android.mediaSession">
	//   19   36:invokestatic    #55  <Method android.os.IBinder BundleCompat.getBinder(Bundle, String)>
	//   20   39:astore_1        
				if(obj != null)
	//*  21   40:aload_1         
	//*  22   41:ifnull          77
				{
					notification = ((Notification) (Parcel.obtain()));
	//   23   44:invokestatic    #61  <Method Parcel Parcel.obtain()>
	//   24   47:astore_0        
					((Parcel) (notification)).writeStrongBinder(((android.os.IBinder) (obj)));
	//   25   48:aload_0         
	//   26   49:aload_1         
	//   27   50:invokevirtual   #65  <Method void Parcel.writeStrongBinder(android.os.IBinder)>
					((Parcel) (notification)).setDataPosition(0);
	//   28   53:aload_0         
	//   29   54:iconst_0        
	//   30   55:invokevirtual   #69  <Method void Parcel.setDataPosition(int)>
					obj = ((Object) ((android.support.v4.media.session.MediaSessionCompat.Token)android.support.v4.media.session.MediaSessionCompat.Token.CREATOR.createFromParcel(((Parcel) (notification)))));
	//   31   58:getstatic       #73  <Field android.os.Parcelable$Creator android.support.v4.media.session.MediaSessionCompat$Token.CREATOR>
	//   32   61:aload_0         
	//   33   62:invokeinterface #79  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   34   67:checkcast       #45  <Class android.support.v4.media.session.MediaSessionCompat$Token>
	//   35   70:astore_1        
					((Parcel) (notification)).recycle();
	//   36   71:aload_0         
	//   37   72:invokevirtual   #82  <Method void Parcel.recycle()>
					return ((android.support.v4.media.session.MediaSessionCompat.Token) (obj));
	//   38   75:aload_1         
	//   39   76:areturn         
				}
			}
		return null;
	//   40   77:aconst_null     
	//   41   78:areturn         
	}
}
