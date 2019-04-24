// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.app.Notification;
import android.app.PendingIntent;
import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.cast:
//			CastRemoteDisplayLocalService, zzu

public static final class CastRemoteDisplayLocalService$NotificationSettings
{
	public static final class Builder
	{

		public final CastRemoteDisplayLocalService.NotificationSettings build()
		{
			if(CastRemoteDisplayLocalService.NotificationSettings.zzb(zzcq) != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//*   2    4:invokestatic    #28  <Method Notification CastRemoteDisplayLocalService$NotificationSettings.zzb(CastRemoteDisplayLocalService$NotificationSettings)>
		//*   3    7:ifnull          76
			{
				if(!TextUtils.isEmpty(((CharSequence) (CastRemoteDisplayLocalService.NotificationSettings.zzc(zzcq)))))
		//*   4   10:aload_0         
		//*   5   11:getfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//*   6   14:invokestatic    #32  <Method String CastRemoteDisplayLocalService$NotificationSettings.zzc(CastRemoteDisplayLocalService$NotificationSettings)>
		//*   7   17:invokestatic    #38  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*   8   20:ifne            33
					throw new IllegalArgumentException("notificationTitle requires using the default notification");
		//    9   23:new             #40  <Class IllegalArgumentException>
		//   10   26:dup             
		//   11   27:ldc1            #42  <String "notificationTitle requires using the default notification">
		//   12   29:invokespecial   #45  <Method void IllegalArgumentException(String)>
		//   13   32:athrow          
				if(!TextUtils.isEmpty(((CharSequence) (CastRemoteDisplayLocalService.NotificationSettings.zzd(zzcq)))))
		//*  14   33:aload_0         
		//*  15   34:getfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//*  16   37:invokestatic    #48  <Method String CastRemoteDisplayLocalService$NotificationSettings.zzd(CastRemoteDisplayLocalService$NotificationSettings)>
		//*  17   40:invokestatic    #38  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  18   43:ifne            56
					throw new IllegalArgumentException("notificationText requires using the default notification");
		//   19   46:new             #40  <Class IllegalArgumentException>
		//   20   49:dup             
		//   21   50:ldc1            #50  <String "notificationText requires using the default notification">
		//   22   52:invokespecial   #45  <Method void IllegalArgumentException(String)>
		//   23   55:athrow          
				if(CastRemoteDisplayLocalService.NotificationSettings.zze(zzcq) != null)
		//*  24   56:aload_0         
		//*  25   57:getfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//*  26   60:invokestatic    #54  <Method PendingIntent CastRemoteDisplayLocalService$NotificationSettings.zze(CastRemoteDisplayLocalService$NotificationSettings)>
		//*  27   63:ifnull          122
					throw new IllegalArgumentException("notificationPendingIntent requires using the default notification");
		//   28   66:new             #40  <Class IllegalArgumentException>
		//   29   69:dup             
		//   30   70:ldc1            #56  <String "notificationPendingIntent requires using the default notification">
		//   31   72:invokespecial   #45  <Method void IllegalArgumentException(String)>
		//   32   75:athrow          
			} else
			if(TextUtils.isEmpty(((CharSequence) (CastRemoteDisplayLocalService.NotificationSettings.zzc(zzcq)))) && TextUtils.isEmpty(((CharSequence) (CastRemoteDisplayLocalService.NotificationSettings.zzd(zzcq)))) && CastRemoteDisplayLocalService.NotificationSettings.zze(zzcq) == null)
		//*  33   76:aload_0         
		//*  34   77:getfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//*  35   80:invokestatic    #32  <Method String CastRemoteDisplayLocalService$NotificationSettings.zzc(CastRemoteDisplayLocalService$NotificationSettings)>
		//*  36   83:invokestatic    #38  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  37   86:ifeq            122
		//*  38   89:aload_0         
		//*  39   90:getfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//*  40   93:invokestatic    #48  <Method String CastRemoteDisplayLocalService$NotificationSettings.zzd(CastRemoteDisplayLocalService$NotificationSettings)>
		//*  41   96:invokestatic    #38  <Method boolean TextUtils.isEmpty(CharSequence)>
		//*  42   99:ifeq            122
		//*  43  102:aload_0         
		//*  44  103:getfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//*  45  106:invokestatic    #54  <Method PendingIntent CastRemoteDisplayLocalService$NotificationSettings.zze(CastRemoteDisplayLocalService$NotificationSettings)>
		//*  46  109:ifnonnull       122
				throw new IllegalArgumentException("At least an argument must be provided");
		//   47  112:new             #40  <Class IllegalArgumentException>
		//   48  115:dup             
		//   49  116:ldc1            #58  <String "At least an argument must be provided">
		//   50  118:invokespecial   #45  <Method void IllegalArgumentException(String)>
		//   51  121:athrow          
			return zzcq;
		//   52  122:aload_0         
		//   53  123:getfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//   54  126:areturn         
		}

		public final Builder setNotification(Notification notification)
		{
			CastRemoteDisplayLocalService.NotificationSettings.zza(zzcq, notification);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//    2    4:aload_1         
		//    3    5:invokestatic    #64  <Method Notification CastRemoteDisplayLocalService$NotificationSettings.zza(CastRemoteDisplayLocalService$NotificationSettings, Notification)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public final Builder setNotificationPendingIntent(PendingIntent pendingintent)
		{
			CastRemoteDisplayLocalService.NotificationSettings.zza(zzcq, pendingintent);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//    2    4:aload_1         
		//    3    5:invokestatic    #69  <Method PendingIntent CastRemoteDisplayLocalService$NotificationSettings.zza(CastRemoteDisplayLocalService$NotificationSettings, PendingIntent)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public final Builder setNotificationText(String s)
		{
			CastRemoteDisplayLocalService.NotificationSettings.zzb(zzcq, s);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//    2    4:aload_1         
		//    3    5:invokestatic    #74  <Method String CastRemoteDisplayLocalService$NotificationSettings.zzb(CastRemoteDisplayLocalService$NotificationSettings, String)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public final Builder setNotificationTitle(String s)
		{
			CastRemoteDisplayLocalService.NotificationSettings.zza(zzcq, s);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//    2    4:aload_1         
		//    3    5:invokestatic    #77  <Method String CastRemoteDisplayLocalService$NotificationSettings.zza(CastRemoteDisplayLocalService$NotificationSettings, String)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		private CastRemoteDisplayLocalService.NotificationSettings zzcq;

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zzcq = new CastRemoteDisplayLocalService.NotificationSettings(((zzu) (null)));
		//    2    4:aload_0         
		//    3    5:new             #6   <Class CastRemoteDisplayLocalService$NotificationSettings>
		//    4    8:dup             
		//    5    9:aconst_null     
		//    6   10:invokespecial   #19  <Method void CastRemoteDisplayLocalService$NotificationSettings(zzu)>
		//    7   13:putfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//    8   16:return          
		}
	}


	static Notification zza(CastRemoteDisplayLocalService$NotificationSettings castremotedisplaylocalservice$notificationsettings, Notification notification)
	{
		castremotedisplaylocalservice$notificationsettings.zzbt = notification;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field Notification zzbt>
		return notification;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static PendingIntent zza(CastRemoteDisplayLocalService$NotificationSettings castremotedisplaylocalservice$notificationsettings, PendingIntent pendingintent)
	{
		castremotedisplaylocalservice$notificationsettings.zzcn = pendingintent;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field PendingIntent zzcn>
		return pendingintent;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static String zza(CastRemoteDisplayLocalService$NotificationSettings castremotedisplaylocalservice$notificationsettings, String s)
	{
		castremotedisplaylocalservice$notificationsettings.zzco = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field String zzco>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Notification zzb(CastRemoteDisplayLocalService$NotificationSettings castremotedisplaylocalservice$notificationsettings)
	{
		return castremotedisplaylocalservice$notificationsettings.zzbt;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Notification zzbt>
	//    2    4:areturn         
	}

	static String zzb(CastRemoteDisplayLocalService$NotificationSettings castremotedisplaylocalservice$notificationsettings, String s)
	{
		castremotedisplaylocalservice$notificationsettings.zzcp = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field String zzcp>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static String zzc(CastRemoteDisplayLocalService$NotificationSettings castremotedisplaylocalservice$notificationsettings)
	{
		return castremotedisplaylocalservice$notificationsettings.zzco;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String zzco>
	//    2    4:areturn         
	}

	static String zzd(CastRemoteDisplayLocalService$NotificationSettings castremotedisplaylocalservice$notificationsettings)
	{
		return castremotedisplaylocalservice$notificationsettings.zzcp;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field String zzcp>
	//    2    4:areturn         
	}

	static PendingIntent zze(CastRemoteDisplayLocalService$NotificationSettings castremotedisplaylocalservice$notificationsettings)
	{
		return castremotedisplaylocalservice$notificationsettings.zzcn;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field PendingIntent zzcn>
	//    2    4:areturn         
	}

	private Notification zzbt;
	private PendingIntent zzcn;
	private String zzco;
	private String zzcp;

	private CastRemoteDisplayLocalService$NotificationSettings()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	private CastRemoteDisplayLocalService$NotificationSettings(CastRemoteDisplayLocalService$NotificationSettings castremotedisplaylocalservice$notificationsettings)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		zzbt = castremotedisplaylocalservice$notificationsettings.zzbt;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #25  <Field Notification zzbt>
	//    5    9:putfield        #25  <Field Notification zzbt>
		zzcn = castremotedisplaylocalservice$notificationsettings.zzcn;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:getfield        #27  <Field PendingIntent zzcn>
	//    9   17:putfield        #27  <Field PendingIntent zzcn>
		zzco = castremotedisplaylocalservice$notificationsettings.zzco;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #29  <Field String zzco>
	//   13   25:putfield        #29  <Field String zzco>
		zzcp = castremotedisplaylocalservice$notificationsettings.zzcp;
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:getfield        #31  <Field String zzcp>
	//   17   33:putfield        #31  <Field String zzcp>
	//   18   36:return          
	}

	CastRemoteDisplayLocalService$NotificationSettings(CastRemoteDisplayLocalService$NotificationSettings castremotedisplaylocalservice$notificationsettings, zzu zzu)
	{
		this(castremotedisplaylocalservice$notificationsettings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method void CastRemoteDisplayLocalService$NotificationSettings(CastRemoteDisplayLocalService$NotificationSettings)>
	//    3    5:return          
	}

	CastRemoteDisplayLocalService$NotificationSettings(zzu zzu)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void CastRemoteDisplayLocalService$NotificationSettings()>
	//    2    4:return          
	}
}
