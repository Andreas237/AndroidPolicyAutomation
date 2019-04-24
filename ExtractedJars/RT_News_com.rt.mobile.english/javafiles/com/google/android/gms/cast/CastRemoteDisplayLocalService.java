// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.app.*;
import android.content.*;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.*;
import android.support.v7.media.MediaRouter;
import android.text.TextUtils;
import android.view.Display;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.cast.zzdg;
import com.google.android.gms.tasks.Task;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.cast:
//			zzu, zzw, CastRemoteDisplayClient, zzaa, 
//			CastMediaControlIntent, zzz, zzx, CastDevice, 
//			zzv, CastRemoteDisplay, zzy

public abstract class CastRemoteDisplayLocalService extends Service
{
	public static interface Callbacks
	{

		public abstract void onRemoteDisplaySessionEnded(CastRemoteDisplayLocalService castremotedisplaylocalservice);

		public abstract void onRemoteDisplaySessionError(Status status);

		public abstract void onRemoteDisplaySessionStarted(CastRemoteDisplayLocalService castremotedisplaylocalservice);

		public abstract void onServiceCreated(CastRemoteDisplayLocalService castremotedisplaylocalservice);
	}

	public static final class NotificationSettings
	{

		static Notification zza(NotificationSettings notificationsettings, Notification notification)
		{
			notificationsettings.zzbt = notification;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #25  <Field Notification zzbt>
			return notification;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

		static PendingIntent zza(NotificationSettings notificationsettings, PendingIntent pendingintent)
		{
			notificationsettings.zzcn = pendingintent;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #27  <Field PendingIntent zzcn>
			return pendingintent;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

		static String zza(NotificationSettings notificationsettings, String s)
		{
			notificationsettings.zzco = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field String zzco>
			return s;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

		static Notification zzb(NotificationSettings notificationsettings)
		{
			return notificationsettings.zzbt;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Notification zzbt>
		//    2    4:areturn         
		}

		static String zzb(NotificationSettings notificationsettings, String s)
		{
			notificationsettings.zzcp = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field String zzcp>
			return s;
		//    3    5:aload_1         
		//    4    6:areturn         
		}

		static String zzc(NotificationSettings notificationsettings)
		{
			return notificationsettings.zzco;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field String zzco>
		//    2    4:areturn         
		}

		static String zzd(NotificationSettings notificationsettings)
		{
			return notificationsettings.zzcp;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field String zzcp>
		//    2    4:areturn         
		}

		static PendingIntent zze(NotificationSettings notificationsettings)
		{
			return notificationsettings.zzcn;
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field PendingIntent zzcn>
		//    2    4:areturn         
		}

		private Notification zzbt;
		private PendingIntent zzcn;
		private String zzco;
		private String zzcp;

		private NotificationSettings()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}

		private NotificationSettings(NotificationSettings notificationsettings)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			zzbt = notificationsettings.zzbt;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:getfield        #25  <Field Notification zzbt>
		//    5    9:putfield        #25  <Field Notification zzbt>
			zzcn = notificationsettings.zzcn;
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:getfield        #27  <Field PendingIntent zzcn>
		//    9   17:putfield        #27  <Field PendingIntent zzcn>
			zzco = notificationsettings.zzco;
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:getfield        #29  <Field String zzco>
		//   13   25:putfield        #29  <Field String zzco>
			zzcp = notificationsettings.zzcp;
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:getfield        #31  <Field String zzcp>
		//   17   33:putfield        #31  <Field String zzcp>
		//   18   36:return          
		}

		NotificationSettings(NotificationSettings notificationsettings, zzu zzu1)
		{
			this(notificationsettings);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #34  <Method void CastRemoteDisplayLocalService$NotificationSettings(CastRemoteDisplayLocalService$NotificationSettings)>
		//    3    5:return          
		}

		NotificationSettings(zzu zzu1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #36  <Method void CastRemoteDisplayLocalService$NotificationSettings()>
		//    2    4:return          
		}
	}

	public static final class NotificationSettings.Builder
	{

		public final NotificationSettings build()
		{
			if(NotificationSettings.zzb(zzcq) != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//*   2    4:invokestatic    #28  <Method Notification CastRemoteDisplayLocalService$NotificationSettings.zzb(CastRemoteDisplayLocalService$NotificationSettings)>
		//*   3    7:ifnull          76
			{
				if(!TextUtils.isEmpty(((CharSequence) (NotificationSettings.zzc(zzcq)))))
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
				if(!TextUtils.isEmpty(((CharSequence) (NotificationSettings.zzd(zzcq)))))
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
				if(NotificationSettings.zze(zzcq) != null)
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
			if(TextUtils.isEmpty(((CharSequence) (NotificationSettings.zzc(zzcq)))) && TextUtils.isEmpty(((CharSequence) (NotificationSettings.zzd(zzcq)))) && NotificationSettings.zze(zzcq) == null)
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

		public final NotificationSettings.Builder setNotification(Notification notification)
		{
			NotificationSettings.zza(zzcq, notification);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//    2    4:aload_1         
		//    3    5:invokestatic    #64  <Method Notification CastRemoteDisplayLocalService$NotificationSettings.zza(CastRemoteDisplayLocalService$NotificationSettings, Notification)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public final NotificationSettings.Builder setNotificationPendingIntent(PendingIntent pendingintent)
		{
			NotificationSettings.zza(zzcq, pendingintent);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//    2    4:aload_1         
		//    3    5:invokestatic    #69  <Method PendingIntent CastRemoteDisplayLocalService$NotificationSettings.zza(CastRemoteDisplayLocalService$NotificationSettings, PendingIntent)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public final NotificationSettings.Builder setNotificationText(String s)
		{
			NotificationSettings.zzb(zzcq, s);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//    2    4:aload_1         
		//    3    5:invokestatic    #74  <Method String CastRemoteDisplayLocalService$NotificationSettings.zzb(CastRemoteDisplayLocalService$NotificationSettings, String)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		public final NotificationSettings.Builder setNotificationTitle(String s)
		{
			NotificationSettings.zza(zzcq, s);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//    2    4:aload_1         
		//    3    5:invokestatic    #77  <Method String CastRemoteDisplayLocalService$NotificationSettings.zza(CastRemoteDisplayLocalService$NotificationSettings, String)>
		//    4    8:pop             
			return this;
		//    5    9:aload_0         
		//    6   10:areturn         
		}

		private NotificationSettings zzcq;

		public NotificationSettings.Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zzcq = new NotificationSettings(((zzu) (null)));
		//    2    4:aload_0         
		//    3    5:new             #6   <Class CastRemoteDisplayLocalService$NotificationSettings>
		//    4    8:dup             
		//    5    9:aconst_null     
		//    6   10:invokespecial   #19  <Method void CastRemoteDisplayLocalService$NotificationSettings(zzu)>
		//    7   13:putfield        #21  <Field CastRemoteDisplayLocalService$NotificationSettings zzcq>
		//    8   16:return          
		}
	}

	public static class Options
	{

		public int getConfigPreset()
		{
			return zzbb;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field int zzbb>
		//    2    4:ireturn         
		}

		public void setConfigPreset(int i)
		{
			zzbb = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #16  <Field int zzbb>
		//    3    5:return          
		}

		private int zzbb;

		public Options()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			zzbb = 2;
		//    2    4:aload_0         
		//    3    5:iconst_2        
		//    4    6:putfield        #16  <Field int zzbb>
		//    5    9:return          
		}
	}

	final class zza extends Binder
	{

		final CastRemoteDisplayLocalService zzcg;

		zza()
		{
			zzcg = CastRemoteDisplayLocalService.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field CastRemoteDisplayLocalService zzcg>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #17  <Method void Binder()>
		//    5    9:return          
		}
	}

	private static final class zzb extends BroadcastReceiver
	{

		public final void onReceive(Context context, Intent intent)
		{
			if(intent.getAction().equals("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"))
		//*   0    0:aload_2         
		//*   1    1:invokevirtual   #22  <Method String Intent.getAction()>
		//*   2    4:ldc1            #24  <String "com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT">
		//*   3    6:invokevirtual   #30  <Method boolean String.equals(Object)>
		//*   4    9:ifeq            16
			{
				CastRemoteDisplayLocalService.stopService();
		//    5   12:invokestatic    #33  <Method void CastRemoteDisplayLocalService.stopService()>
				return;
		//    6   15:return          
			}
			if(intent.getAction().equals("com.google.android.gms.cast.remote_display.ACTION_SESSION_ENDED"))
		//*   7   16:aload_2         
		//*   8   17:invokevirtual   #22  <Method String Intent.getAction()>
		//*   9   20:ldc1            #35  <String "com.google.android.gms.cast.remote_display.ACTION_SESSION_ENDED">
		//*  10   22:invokevirtual   #30  <Method boolean String.equals(Object)>
		//*  11   25:ifeq            32
				CastRemoteDisplayLocalService.zzd(false);
		//   12   28:iconst_0        
		//   13   29:invokestatic    #39  <Method void CastRemoteDisplayLocalService.zzd(boolean)>
		//   14   32:return          
		}

		private zzb()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void BroadcastReceiver()>
		//    2    4:return          
		}

		zzb(zzu zzu1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void CastRemoteDisplayLocalService$zzb()>
		//    2    4:return          
		}
	}


	public CastRemoteDisplayLocalService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #103 <Method void Service()>
		zzcb = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #105 <Field boolean zzcb>
	//    5    9:aload_0         
	//    6   10:new             #107 <Class zzu>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #110 <Method void zzu(CastRemoteDisplayLocalService)>
	//   10   18:putfield        #112 <Field android.support.v7.media.MediaRouter$Callback zzcd>
	//   11   21:aload_0         
	//   12   22:new             #18  <Class CastRemoteDisplayLocalService$zza>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #113 <Method void CastRemoteDisplayLocalService$zza(CastRemoteDisplayLocalService)>
	//   16   30:putfield        #115 <Field IBinder zzcf>
	//   17   33:return          
	}

	public static CastRemoteDisplayLocalService getInstance()
	{
		CastRemoteDisplayLocalService castremotedisplaylocalservice;
		synchronized(zzbo)
	//*   0    0:getstatic       #94  <Field Object zzbo>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			castremotedisplaylocalservice = zzce;
	//    4    6:getstatic       #119 <Field CastRemoteDisplayLocalService zzce>
	//    5    9:astore_1        
		}
	//    6   10:aload_0         
	//    7   11:monitorexit     
		return castremotedisplaylocalservice;
	//    8   12:aload_1         
	//    9   13:areturn         
		exception;
	//   10   14:astore_1        
		obj;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		throw exception;
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	protected static void setDebugEnabled()
	{
		zzbd.zzk(true);
	//    0    0:getstatic       #81  <Field zzdg zzbd>
	//    1    3:iconst_1        
	//    2    4:invokevirtual   #123 <Method void zzdg.zzk(boolean)>
	//    3    7:return          
	}

	public static void startService(Context context, Class class1, String s, CastDevice castdevice, NotificationSettings notificationsettings, Callbacks callbacks)
	{
		startServiceWithOptions(context, class1, s, castdevice, new Options(), notificationsettings, callbacks);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:new             #15  <Class CastRemoteDisplayLocalService$Options>
	//    5    7:dup             
	//    6    8:invokespecial   #126 <Method void CastRemoteDisplayLocalService$Options()>
	//    7   11:aload           4
	//    8   13:aload           5
	//    9   15:invokestatic    #130 <Method void startServiceWithOptions(Context, Class, String, CastDevice, CastRemoteDisplayLocalService$Options, CastRemoteDisplayLocalService$NotificationSettings, CastRemoteDisplayLocalService$Callbacks)>
	//   10   18:return          
	}

	public static void startServiceWithOptions(Context context, Class class1, String s, CastDevice castdevice, Options options, NotificationSettings notificationsettings, Callbacks callbacks)
	{
		zzbd.d("Starting Service", new Object[0]);
	//    0    0:getstatic       #81  <Field zzdg zzbd>
	//    1    3:ldc1            #137 <String "Starting Service">
	//    2    5:iconst_0        
	//    3    6:anewarray       Object[]
	//    4    9:invokevirtual   #141 <Method void zzdg.d(String, Object[])>
		synchronized(zzbo)
	//*   5   12:getstatic       #94  <Field Object zzbo>
	//*   6   15:astore          7
	//*   7   17:aload           7
	//*   8   19:monitorenter    
		{
			if(zzce != null)
	//*   9   20:getstatic       #119 <Field CastRemoteDisplayLocalService zzce>
	//*  10   23:ifnull          42
			{
				zzbd.w("An existing service had not been stopped before starting one", new Object[0]);
	//   11   26:getstatic       #81  <Field zzdg zzbd>
	//   12   29:ldc1            #143 <String "An existing service had not been stopped before starting one">
	//   13   31:iconst_0        
	//   14   32:anewarray       Object[]
	//   15   35:invokevirtual   #146 <Method void zzdg.w(String, Object[])>
				zzb(true);
	//   16   38:iconst_1        
	//   17   39:invokestatic    #148 <Method void zzb(boolean)>
			}
		}
	//   18   42:aload           7
	//   19   44:monitorexit     
		try
		{
			obj = ((Object) (new ComponentName(context, class1)));
	//   20   45:new             #150 <Class ComponentName>
	//   21   48:dup             
	//   22   49:aload_0         
	//   23   50:aload_1         
	//   24   51:invokespecial   #153 <Method void ComponentName(Context, Class)>
	//   25   54:astore          7
			obj = ((Object) (context.getPackageManager().getServiceInfo(((ComponentName) (obj)), 128)));
	//   26   56:aload_0         
	//   27   57:invokevirtual   #159 <Method PackageManager Context.getPackageManager()>
	//   28   60:aload           7
	//   29   62:sipush          128
	//   30   65:invokevirtual   #165 <Method ServiceInfo PackageManager.getServiceInfo(ComponentName, int)>
	//   31   68:astore          7
		}
	//*  32   70:aload           7
	//*  33   72:ifnull          93
	//*  34   75:aload           7
	//*  35   77:getfield        #170 <Field boolean ServiceInfo.exported>
	//*  36   80:ifeq            93
	//*  37   83:new             #172 <Class IllegalStateException>
	//*  38   86:dup             
	//*  39   87:ldc1            #174 <String "The service must not be exported, verify the manifest configuration">
	//*  40   89:invokespecial   #175 <Method void IllegalStateException(String)>
	//*  41   92:athrow          
	//*  42   93:aload_0         
	//*  43   94:ldc1            #177 <String "activityContext is required.">
	//*  44   96:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, Object)>
	//*  45   99:pop             
	//*  46  100:aload_1         
	//*  47  101:ldc1            #185 <String "serviceClass is required.">
	//*  48  103:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, Object)>
	//*  49  106:pop             
	//*  50  107:aload_2         
	//*  51  108:ldc1            #187 <String "applicationId is required.">
	//*  52  110:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, Object)>
	//*  53  113:pop             
	//*  54  114:aload_3         
	//*  55  115:ldc1            #189 <String "device is required.">
	//*  56  117:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, Object)>
	//*  57  120:pop             
	//*  58  121:aload           4
	//*  59  123:ldc1            #191 <String "options is required.">
	//*  60  125:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, Object)>
	//*  61  128:pop             
	//*  62  129:aload           5
	//*  63  131:ldc1            #193 <String "notificationSettings is required.">
	//*  64  133:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, Object)>
	//*  65  136:pop             
	//*  66  137:aload           6
	//*  67  139:ldc1            #195 <String "callbacks is required.">
	//*  68  141:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, Object)>
	//*  69  144:pop             
	//*  70  145:aload           5
	//*  71  147:invokestatic    #198 <Method Notification CastRemoteDisplayLocalService$NotificationSettings.zzb(CastRemoteDisplayLocalService$NotificationSettings)>
	//*  72  150:ifnonnull       171
	//*  73  153:aload           5
	//*  74  155:invokestatic    #202 <Method PendingIntent CastRemoteDisplayLocalService$NotificationSettings.zze(CastRemoteDisplayLocalService$NotificationSettings)>
	//*  75  158:ifnonnull       171
	//*  76  161:new             #204 <Class IllegalArgumentException>
	//*  77  164:dup             
	//*  78  165:ldc1            #206 <String "notificationSettings: Either the notification or the notificationPendingIntent must be provided">
	//*  79  167:invokespecial   #207 <Method void IllegalArgumentException(String)>
	//*  80  170:athrow          
	//*  81  171:getstatic       #101 <Field AtomicBoolean zzbp>
	//*  82  174:iconst_1        
	//*  83  175:invokevirtual   #211 <Method boolean AtomicBoolean.getAndSet(boolean)>
	//*  84  178:ifeq            194
	//*  85  181:getstatic       #81  <Field zzdg zzbd>
	//*  86  184:ldc1            #213 <String "Service is already being started, startService has been called twice">
	//*  87  186:iconst_0        
	//*  88  187:anewarray       Object[]
	//*  89  190:invokevirtual   #216 <Method void zzdg.e(String, Object[])>
	//*  90  193:return          
	//*  91  194:new             #218 <Class Intent>
	//*  92  197:dup             
	//*  93  198:aload_0         
	//*  94  199:aload_1         
	//*  95  200:invokespecial   #219 <Method void Intent(Context, Class)>
	//*  96  203:astore_1        
	//*  97  204:aload_0         
	//*  98  205:aload_1         
	//*  99  206:invokevirtual   #222 <Method ComponentName Context.startService(Intent)>
	//* 100  209:pop             
	//* 101  210:aload_0         
	//* 102  211:aload_1         
	//* 103  212:new             #224 <Class zzw>
	//* 104  215:dup             
	//* 105  216:aload_2         
	//* 106  217:aload_3         
	//* 107  218:aload           4
	//* 108  220:aload           5
	//* 109  222:aload_0         
	//* 110  223:aload           6
	//* 111  225:invokespecial   #227 <Method void zzw(String, CastDevice, CastRemoteDisplayLocalService$Options, CastRemoteDisplayLocalService$NotificationSettings, Context, CastRemoteDisplayLocalService$Callbacks)>
	//* 112  228:bipush          64
	//* 113  230:invokevirtual   #231 <Method boolean Context.bindService(Intent, ServiceConnection, int)>
	//* 114  233:pop             
	//* 115  234:return          
	//* 116  235:new             #172 <Class IllegalStateException>
	//* 117  238:dup             
	//* 118  239:ldc1            #233 <String "Service not found, did you forget to configure it in the manifest?">
	//* 119  241:invokespecial   #175 <Method void IllegalStateException(String)>
	//* 120  244:athrow          
	//* 121  245:astore_0        
	//* 122  246:aload           7
	//* 123  248:monitorexit     
	//* 124  249:aload_0         
	//* 125  250:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			throw new IllegalStateException("Service not found, did you forget to configure it in the manifest?");
		}
		if(obj == null)
			break MISSING_BLOCK_LABEL_93;
		if(((ServiceInfo) (obj)).exported)
			throw new IllegalStateException("The service must not be exported, verify the manifest configuration");
		Preconditions.checkNotNull(((Object) (context)), "activityContext is required.");
		Preconditions.checkNotNull(((Object) (class1)), "serviceClass is required.");
		Preconditions.checkNotNull(((Object) (s)), "applicationId is required.");
		Preconditions.checkNotNull(((Object) (castdevice)), "device is required.");
		Preconditions.checkNotNull(((Object) (options)), "options is required.");
		Preconditions.checkNotNull(((Object) (notificationsettings)), "notificationSettings is required.");
		Preconditions.checkNotNull(((Object) (callbacks)), "callbacks is required.");
		if(NotificationSettings.zzb(notificationsettings) == null && NotificationSettings.zze(notificationsettings) == null)
			throw new IllegalArgumentException("notificationSettings: Either the notification or the notificationPendingIntent must be provided");
		if(zzbp.getAndSet(true))
		{
			zzbd.e("Service is already being started, startService has been called twice", new Object[0]);
			return;
		} else
		{
			class1 = ((Class) (new Intent(context, class1)));
			context.startService(((Intent) (class1)));
			context.bindService(((Intent) (class1)), ((ServiceConnection) (new zzw(s, castdevice, options, notificationsettings, context, callbacks))), 64);
			return;
		}
		context;
		obj;
		JVM INSTR monitorexit ;
		throw context;
	//* 126  251:astore_0        
	//* 127  252:goto            235
	}

	public static void stopService()
	{
		zzb(false);
	//    0    0:iconst_0        
	//    1    1:invokestatic    #148 <Method void zzb(boolean)>
	//    2    4:return          
	}

	static Context zza(CastRemoteDisplayLocalService castremotedisplaylocalservice, Context context)
	{
		castremotedisplaylocalservice.zzby = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #239 <Field Context zzby>
		return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
	}

	static ServiceConnection zza(CastRemoteDisplayLocalService castremotedisplaylocalservice, ServiceConnection serviceconnection)
	{
		castremotedisplaylocalservice.zzbz = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #242 <Field ServiceConnection zzbz>
		return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
	}

	static CastDevice zza(CastRemoteDisplayLocalService castremotedisplaylocalservice)
	{
		return castremotedisplaylocalservice.zzbw;
	//    0    0:aload_0         
	//    1    1:getfield        #245 <Field CastDevice zzbw>
	//    2    4:areturn         
	}

	private final void zza(Display display)
	{
		zzbx = display;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #248 <Field Display zzbx>
		if(zzbu)
	//*   3    5:aload_0         
	//*   4    6:getfield        #250 <Field boolean zzbu>
	//*   5    9:ifeq            32
		{
			zzbt = zzc(true);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:invokespecial   #254 <Method Notification zzc(boolean)>
	//   10   18:putfield        #256 <Field Notification zzbt>
			startForeground(zzbn, zzbt);
	//   11   21:aload_0         
	//   12   22:getstatic       #88  <Field int zzbn>
	//   13   25:aload_0         
	//   14   26:getfield        #256 <Field Notification zzbt>
	//   15   29:invokevirtual   #260 <Method void startForeground(int, Notification)>
		}
		if(zzbq.get() != null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #262 <Field WeakReference zzbq>
	//*  18   36:invokevirtual   #268 <Method Object WeakReference.get()>
	//*  19   39:ifnull          58
			((Callbacks)zzbq.get()).onRemoteDisplaySessionStarted(this);
	//   20   42:aload_0         
	//   21   43:getfield        #262 <Field WeakReference zzbq>
	//   22   46:invokevirtual   #268 <Method Object WeakReference.get()>
	//   23   49:checkcast       #6   <Class CastRemoteDisplayLocalService$Callbacks>
	//   24   52:aload_0         
	//   25   53:invokeinterface #271 <Method void CastRemoteDisplayLocalService$Callbacks.onRemoteDisplaySessionStarted(CastRemoteDisplayLocalService)>
		onCreatePresentation(zzbx);
	//   26   58:aload_0         
	//   27   59:aload_0         
	//   28   60:getfield        #248 <Field Display zzbx>
	//   29   63:invokevirtual   #274 <Method void onCreatePresentation(Display)>
	//   30   66:return          
	}

	private final void zza(NotificationSettings notificationsettings)
	{
		Preconditions.checkMainThread("updateNotificationSettingsInternal must be called on the main thread");
	//    0    0:ldc2            #277 <String "updateNotificationSettingsInternal must be called on the main thread">
	//    1    3:invokestatic    #280 <Method void Preconditions.checkMainThread(String)>
		if(zzbs == null)
	//*   2    6:aload_0         
	//*   3    7:getfield        #282 <Field CastRemoteDisplayLocalService$NotificationSettings zzbs>
	//*   4   10:ifnonnull       24
			throw new IllegalStateException("No current notification settings to update");
	//    5   13:new             #172 <Class IllegalStateException>
	//    6   16:dup             
	//    7   17:ldc2            #284 <String "No current notification settings to update">
	//    8   20:invokespecial   #175 <Method void IllegalStateException(String)>
	//    9   23:athrow          
		if(zzbu)
	//*  10   24:aload_0         
	//*  11   25:getfield        #250 <Field boolean zzbu>
	//*  12   28:ifeq            124
		{
			if(NotificationSettings.zzb(notificationsettings) != null)
	//*  13   31:aload_1         
	//*  14   32:invokestatic    #198 <Method Notification CastRemoteDisplayLocalService$NotificationSettings.zzb(CastRemoteDisplayLocalService$NotificationSettings)>
	//*  15   35:ifnull          49
				throw new IllegalStateException("Current mode is default notification, notification attribute must not be provided");
	//   16   38:new             #172 <Class IllegalStateException>
	//   17   41:dup             
	//   18   42:ldc2            #286 <String "Current mode is default notification, notification attribute must not be provided">
	//   19   45:invokespecial   #175 <Method void IllegalStateException(String)>
	//   20   48:athrow          
			if(NotificationSettings.zze(notificationsettings) != null)
	//*  21   49:aload_1         
	//*  22   50:invokestatic    #202 <Method PendingIntent CastRemoteDisplayLocalService$NotificationSettings.zze(CastRemoteDisplayLocalService$NotificationSettings)>
	//*  23   53:ifnull          68
				NotificationSettings.zza(zzbs, NotificationSettings.zze(notificationsettings));
	//   24   56:aload_0         
	//   25   57:getfield        #282 <Field CastRemoteDisplayLocalService$NotificationSettings zzbs>
	//   26   60:aload_1         
	//   27   61:invokestatic    #202 <Method PendingIntent CastRemoteDisplayLocalService$NotificationSettings.zze(CastRemoteDisplayLocalService$NotificationSettings)>
	//   28   64:invokestatic    #289 <Method PendingIntent CastRemoteDisplayLocalService$NotificationSettings.zza(CastRemoteDisplayLocalService$NotificationSettings, PendingIntent)>
	//   29   67:pop             
			if(!TextUtils.isEmpty(((CharSequence) (NotificationSettings.zzc(notificationsettings)))))
	//*  30   68:aload_1         
	//*  31   69:invokestatic    #292 <Method String CastRemoteDisplayLocalService$NotificationSettings.zzc(CastRemoteDisplayLocalService$NotificationSettings)>
	//*  32   72:invokestatic    #298 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  33   75:ifne            90
				NotificationSettings.zza(zzbs, NotificationSettings.zzc(notificationsettings));
	//   34   78:aload_0         
	//   35   79:getfield        #282 <Field CastRemoteDisplayLocalService$NotificationSettings zzbs>
	//   36   82:aload_1         
	//   37   83:invokestatic    #292 <Method String CastRemoteDisplayLocalService$NotificationSettings.zzc(CastRemoteDisplayLocalService$NotificationSettings)>
	//   38   86:invokestatic    #301 <Method String CastRemoteDisplayLocalService$NotificationSettings.zza(CastRemoteDisplayLocalService$NotificationSettings, String)>
	//   39   89:pop             
			if(!TextUtils.isEmpty(((CharSequence) (NotificationSettings.zzd(notificationsettings)))))
	//*  40   90:aload_1         
	//*  41   91:invokestatic    #304 <Method String CastRemoteDisplayLocalService$NotificationSettings.zzd(CastRemoteDisplayLocalService$NotificationSettings)>
	//*  42   94:invokestatic    #298 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  43   97:ifne            112
				NotificationSettings.zzb(zzbs, NotificationSettings.zzd(notificationsettings));
	//   44  100:aload_0         
	//   45  101:getfield        #282 <Field CastRemoteDisplayLocalService$NotificationSettings zzbs>
	//   46  104:aload_1         
	//   47  105:invokestatic    #304 <Method String CastRemoteDisplayLocalService$NotificationSettings.zzd(CastRemoteDisplayLocalService$NotificationSettings)>
	//   48  108:invokestatic    #306 <Method String CastRemoteDisplayLocalService$NotificationSettings.zzb(CastRemoteDisplayLocalService$NotificationSettings, String)>
	//   49  111:pop             
			zzbt = zzc(true);
	//   50  112:aload_0         
	//   51  113:aload_0         
	//   52  114:iconst_1        
	//   53  115:invokespecial   #254 <Method Notification zzc(boolean)>
	//   54  118:putfield        #256 <Field Notification zzbt>
		} else
	//*  55  121:goto            155
		{
			Preconditions.checkNotNull(((Object) (NotificationSettings.zzb(notificationsettings))), "notification is required.");
	//   56  124:aload_1         
	//   57  125:invokestatic    #198 <Method Notification CastRemoteDisplayLocalService$NotificationSettings.zzb(CastRemoteDisplayLocalService$NotificationSettings)>
	//   58  128:ldc2            #308 <String "notification is required.">
	//   59  131:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   60  134:pop             
			zzbt = NotificationSettings.zzb(notificationsettings);
	//   61  135:aload_0         
	//   62  136:aload_1         
	//   63  137:invokestatic    #198 <Method Notification CastRemoteDisplayLocalService$NotificationSettings.zzb(CastRemoteDisplayLocalService$NotificationSettings)>
	//   64  140:putfield        #256 <Field Notification zzbt>
			NotificationSettings.zza(zzbs, zzbt);
	//   65  143:aload_0         
	//   66  144:getfield        #282 <Field CastRemoteDisplayLocalService$NotificationSettings zzbs>
	//   67  147:aload_0         
	//   68  148:getfield        #256 <Field Notification zzbt>
	//   69  151:invokestatic    #311 <Method Notification CastRemoteDisplayLocalService$NotificationSettings.zza(CastRemoteDisplayLocalService$NotificationSettings, Notification)>
	//   70  154:pop             
		}
		startForeground(zzbn, zzbt);
	//   71  155:aload_0         
	//   72  156:getstatic       #88  <Field int zzbn>
	//   73  159:aload_0         
	//   74  160:getfield        #256 <Field Notification zzbt>
	//   75  163:invokevirtual   #260 <Method void startForeground(int, Notification)>
	//   76  166:return          
	}

	static void zza(CastRemoteDisplayLocalService castremotedisplaylocalservice, Display display)
	{
		castremotedisplaylocalservice.zza(display);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #314 <Method void zza(Display)>
	//    3    5:return          
	}

	static void zza(CastRemoteDisplayLocalService castremotedisplaylocalservice, NotificationSettings notificationsettings)
	{
		castremotedisplaylocalservice.zza(notificationsettings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #317 <Method void zza(CastRemoteDisplayLocalService$NotificationSettings)>
	//    3    5:return          
	}

	static void zza(CastRemoteDisplayLocalService castremotedisplaylocalservice, String s)
	{
		castremotedisplaylocalservice.zzb(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #320 <Method void zzb(String)>
	//    3    5:return          
	}

	static void zza(CastRemoteDisplayLocalService castremotedisplaylocalservice, boolean flag)
	{
		castremotedisplaylocalservice.zza(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #323 <Method void zza(boolean)>
	//    3    5:return          
	}

	private final void zza(boolean flag)
	{
		IllegalArgumentException illegalargumentexception;
		zzb("Stopping Service");
	//    0    0:aload_0         
	//    1    1:ldc2            #325 <String "Stopping Service">
	//    2    4:invokespecial   #320 <Method void zzb(String)>
		Preconditions.checkMainThread("stopServiceInstanceInternal must be called on the main thread");
	//    3    7:ldc2            #327 <String "stopServiceInstanceInternal must be called on the main thread">
	//    4   10:invokestatic    #280 <Method void Preconditions.checkMainThread(String)>
		if(!flag && zzca != null)
	//*   5   13:iload_1         
	//*   6   14:ifne            45
	//*   7   17:aload_0         
	//*   8   18:getfield        #329 <Field MediaRouter zzca>
	//*   9   21:ifnull          45
		{
			zzb("Setting default route");
	//   10   24:aload_0         
	//   11   25:ldc2            #331 <String "Setting default route">
	//   12   28:invokespecial   #320 <Method void zzb(String)>
			zzca.selectRoute(zzca.getDefaultRoute());
	//   13   31:aload_0         
	//   14   32:getfield        #329 <Field MediaRouter zzca>
	//   15   35:aload_0         
	//   16   36:getfield        #329 <Field MediaRouter zzca>
	//   17   39:invokevirtual   #337 <Method android.support.v7.media.MediaRouter$RouteInfo MediaRouter.getDefaultRoute()>
	//   18   42:invokevirtual   #341 <Method void MediaRouter.selectRoute(android.support.v7.media.MediaRouter$RouteInfo)>
		}
		if(zzbr != null)
	//*  19   45:aload_0         
	//*  20   46:getfield        #343 <Field CastRemoteDisplayLocalService$zzb zzbr>
	//*  21   49:ifnull          67
		{
			zzb("Unregistering notification receiver");
	//   22   52:aload_0         
	//   23   53:ldc2            #345 <String "Unregistering notification receiver">
	//   24   56:invokespecial   #320 <Method void zzb(String)>
			unregisterReceiver(((BroadcastReceiver) (zzbr)));
	//   25   59:aload_0         
	//   26   60:aload_0         
	//   27   61:getfield        #343 <Field CastRemoteDisplayLocalService$zzb zzbr>
	//   28   64:invokevirtual   #349 <Method void unregisterReceiver(BroadcastReceiver)>
		}
		zzb("stopRemoteDisplaySession");
	//   29   67:aload_0         
	//   30   68:ldc2            #351 <String "stopRemoteDisplaySession">
	//   31   71:invokespecial   #320 <Method void zzb(String)>
		zzb("stopRemoteDisplay");
	//   32   74:aload_0         
	//   33   75:ldc2            #353 <String "stopRemoteDisplay">
	//   34   78:invokespecial   #320 <Method void zzb(String)>
		zzcc.stopRemoteDisplay().addOnCompleteListener(((com.google.android.gms.tasks.OnCompleteListener) (new zzaa(this))));
	//   35   81:aload_0         
	//   36   82:getfield        #355 <Field CastRemoteDisplayClient zzcc>
	//   37   85:invokevirtual   #360 <Method Task CastRemoteDisplayClient.stopRemoteDisplay()>
	//   38   88:new             #362 <Class zzaa>
	//   39   91:dup             
	//   40   92:aload_0         
	//   41   93:invokespecial   #363 <Method void zzaa(CastRemoteDisplayLocalService)>
	//   42   96:invokevirtual   #369 <Method Task Task.addOnCompleteListener(com.google.android.gms.tasks.OnCompleteListener)>
	//   43   99:pop             
		if(zzbq.get() != null)
	//*  44  100:aload_0         
	//*  45  101:getfield        #262 <Field WeakReference zzbq>
	//*  46  104:invokevirtual   #268 <Method Object WeakReference.get()>
	//*  47  107:ifnull          126
			((Callbacks)zzbq.get()).onRemoteDisplaySessionEnded(this);
	//   48  110:aload_0         
	//   49  111:getfield        #262 <Field WeakReference zzbq>
	//   50  114:invokevirtual   #268 <Method Object WeakReference.get()>
	//   51  117:checkcast       #6   <Class CastRemoteDisplayLocalService$Callbacks>
	//   52  120:aload_0         
	//   53  121:invokeinterface #372 <Method void CastRemoteDisplayLocalService$Callbacks.onRemoteDisplaySessionEnded(CastRemoteDisplayLocalService)>
		onDismissPresentation();
	//   54  126:aload_0         
	//   55  127:invokevirtual   #375 <Method void onDismissPresentation()>
		zzb("Stopping the remote display Service");
	//   56  130:aload_0         
	//   57  131:ldc2            #377 <String "Stopping the remote display Service">
	//   58  134:invokespecial   #320 <Method void zzb(String)>
		stopForeground(true);
	//   59  137:aload_0         
	//   60  138:iconst_1        
	//   61  139:invokevirtual   #380 <Method void stopForeground(boolean)>
		stopSelf();
	//   62  142:aload_0         
	//   63  143:invokevirtual   #383 <Method void stopSelf()>
		if(zzca != null)
	//*  64  146:aload_0         
	//*  65  147:getfield        #329 <Field MediaRouter zzca>
	//*  66  150:ifnull          177
		{
			Preconditions.checkMainThread("CastRemoteDisplayLocalService calls must be done on the main thread");
	//   67  153:ldc2            #385 <String "CastRemoteDisplayLocalService calls must be done on the main thread">
	//   68  156:invokestatic    #280 <Method void Preconditions.checkMainThread(String)>
			zzb("removeMediaRouterCallback");
	//   69  159:aload_0         
	//   70  160:ldc2            #387 <String "removeMediaRouterCallback">
	//   71  163:invokespecial   #320 <Method void zzb(String)>
			zzca.removeCallback(zzcd);
	//   72  166:aload_0         
	//   73  167:getfield        #329 <Field MediaRouter zzca>
	//   74  170:aload_0         
	//   75  171:getfield        #112 <Field android.support.v7.media.MediaRouter$Callback zzcd>
	//   76  174:invokevirtual   #391 <Method void MediaRouter.removeCallback(android.support.v7.media.MediaRouter$Callback)>
		}
		if(zzby != null && zzbz != null)
	//*  77  177:aload_0         
	//*  78  178:getfield        #239 <Field Context zzby>
	//*  79  181:ifnull          222
	//*  80  184:aload_0         
	//*  81  185:getfield        #242 <Field ServiceConnection zzbz>
	//*  82  188:ifnull          222
		{
			try
			{
				zzby.unbindService(zzbz);
	//   83  191:aload_0         
	//   84  192:getfield        #239 <Field Context zzby>
	//   85  195:aload_0         
	//   86  196:getfield        #242 <Field ServiceConnection zzbz>
	//   87  199:invokevirtual   #395 <Method void Context.unbindService(ServiceConnection)>
			}
	//*  88  202:goto            212
	//*  89  205:aload_0         
	//*  90  206:ldc2            #397 <String "No need to unbind service, already unbound">
	//*  91  209:invokespecial   #320 <Method void zzb(String)>
	//*  92  212:aload_0         
	//*  93  213:aconst_null     
	//*  94  214:putfield        #242 <Field ServiceConnection zzbz>
	//*  95  217:aload_0         
	//*  96  218:aconst_null     
	//*  97  219:putfield        #239 <Field Context zzby>
	//*  98  222:aload_0         
	//*  99  223:aconst_null     
	//* 100  224:putfield        #399 <Field String zzy>
	//* 101  227:aload_0         
	//* 102  228:aconst_null     
	//* 103  229:putfield        #256 <Field Notification zzbt>
	//* 104  232:aload_0         
	//* 105  233:aconst_null     
	//* 106  234:putfield        #248 <Field Display zzbx>
	//* 107  237:return          
			// Misplaced declaration of an exception variable
			catch(IllegalArgumentException illegalargumentexception)
			{
				zzb("No need to unbind service, already unbound");
			}
			zzbz = null;
			zzby = null;
		}
		zzy = null;
		zzbt = null;
		zzbx = null;
	//* 108  238:astore_2        
	//* 109  239:goto            205
	}

	static boolean zza(CastRemoteDisplayLocalService castremotedisplaylocalservice, String s, CastDevice castdevice, Options options, NotificationSettings notificationsettings, Context context, ServiceConnection serviceconnection, Callbacks callbacks)
	{
		return castremotedisplaylocalservice.zza(s, castdevice, options, notificationsettings, context, serviceconnection, callbacks);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:invokespecial   #403 <Method boolean zza(String, CastDevice, CastRemoteDisplayLocalService$Options, CastRemoteDisplayLocalService$NotificationSettings, Context, ServiceConnection, CastRemoteDisplayLocalService$Callbacks)>
	//    9   15:ireturn         
	}

	private final boolean zza(String s, CastDevice castdevice, Options options, NotificationSettings notificationsettings, Context context, ServiceConnection serviceconnection, Callbacks callbacks)
	{
label0:
		{
			zzb("startRemoteDisplaySession");
	//    0    0:aload_0         
	//    1    1:ldc2            #405 <String "startRemoteDisplaySession">
	//    2    4:invokespecial   #320 <Method void zzb(String)>
			Preconditions.checkMainThread("Starting the Cast Remote Display must be done on the main thread");
	//    3    7:ldc2            #407 <String "Starting the Cast Remote Display must be done on the main thread">
	//    4   10:invokestatic    #280 <Method void Preconditions.checkMainThread(String)>
			synchronized(zzbo)
	//*   5   13:getstatic       #94  <Field Object zzbo>
	//*   6   16:astore          8
	//*   7   18:aload           8
	//*   8   20:monitorenter    
			{
				if(zzce == null)
					break label0;
	//    9   21:getstatic       #119 <Field CastRemoteDisplayLocalService zzce>
	//   10   24:ifnull          44
				zzbd.w("An existing service had not been stopped before starting one", new Object[0]);
	//   11   27:getstatic       #81  <Field zzdg zzbd>
	//   12   30:ldc1            #143 <String "An existing service had not been stopped before starting one">
	//   13   32:iconst_0        
	//   14   33:anewarray       Object[]
	//   15   36:invokevirtual   #146 <Method void zzdg.w(String, Object[])>
			}
	//   16   39:aload           8
	//   17   41:monitorexit     
			return false;
	//   18   42:iconst_0        
	//   19   43:ireturn         
		}
		zzce = this;
	//   20   44:aload_0         
	//   21   45:putstatic       #119 <Field CastRemoteDisplayLocalService zzce>
		obj;
	//   22   48:aload           8
		JVM INSTR monitorexit ;
	//   23   50:monitorexit     
		zzbq = new WeakReference(((Object) (callbacks)));
	//   24   51:aload_0         
	//   25   52:new             #264 <Class WeakReference>
	//   26   55:dup             
	//   27   56:aload           7
	//   28   58:invokespecial   #410 <Method void WeakReference(Object)>
	//   29   61:putfield        #262 <Field WeakReference zzbq>
		zzy = s;
	//   30   64:aload_0         
	//   31   65:aload_1         
	//   32   66:putfield        #399 <Field String zzy>
		zzbw = castdevice;
	//   33   69:aload_0         
	//   34   70:aload_2         
	//   35   71:putfield        #245 <Field CastDevice zzbw>
		zzby = context;
	//   36   74:aload_0         
	//   37   75:aload           5
	//   38   77:putfield        #239 <Field Context zzby>
		zzbz = serviceconnection;
	//   39   80:aload_0         
	//   40   81:aload           6
	//   41   83:putfield        #242 <Field ServiceConnection zzbz>
		if(zzca == null)
	//*  42   86:aload_0         
	//*  43   87:getfield        #329 <Field MediaRouter zzca>
	//*  44   90:ifnonnull       104
			zzca = MediaRouter.getInstance(getApplicationContext());
	//   45   93:aload_0         
	//   46   94:aload_0         
	//   47   95:invokevirtual   #414 <Method Context getApplicationContext()>
	//   48   98:invokestatic    #417 <Method MediaRouter MediaRouter.getInstance(Context)>
	//   49  101:putfield        #329 <Field MediaRouter zzca>
		s = ((String) ((new android.support.v7.media.MediaRouteSelector.Builder()).addControlCategory(CastMediaControlIntent.categoryForCast(zzy)).build()));
	//   50  104:new             #419 <Class android.support.v7.media.MediaRouteSelector$Builder>
	//   51  107:dup             
	//   52  108:invokespecial   #420 <Method void android.support.v7.media.MediaRouteSelector$Builder()>
	//   53  111:aload_0         
	//   54  112:getfield        #399 <Field String zzy>
	//   55  115:invokestatic    #426 <Method String CastMediaControlIntent.categoryForCast(String)>
	//   56  118:invokevirtual   #430 <Method android.support.v7.media.MediaRouteSelector$Builder android.support.v7.media.MediaRouteSelector$Builder.addControlCategory(String)>
	//   57  121:invokevirtual   #434 <Method android.support.v7.media.MediaRouteSelector android.support.v7.media.MediaRouteSelector$Builder.build()>
	//   58  124:astore_1        
		zzb("addMediaRouterCallback");
	//   59  125:aload_0         
	//   60  126:ldc2            #436 <String "addMediaRouterCallback">
	//   61  129:invokespecial   #320 <Method void zzb(String)>
		zzca.addCallback(((android.support.v7.media.MediaRouteSelector) (s)), zzcd, 4);
	//   62  132:aload_0         
	//   63  133:getfield        #329 <Field MediaRouter zzca>
	//   64  136:aload_1         
	//   65  137:aload_0         
	//   66  138:getfield        #112 <Field android.support.v7.media.MediaRouter$Callback zzcd>
	//   67  141:iconst_4        
	//   68  142:invokevirtual   #440 <Method void MediaRouter.addCallback(android.support.v7.media.MediaRouteSelector, android.support.v7.media.MediaRouter$Callback, int)>
		zzbt = NotificationSettings.zzb(notificationsettings);
	//   69  145:aload_0         
	//   70  146:aload           4
	//   71  148:invokestatic    #198 <Method Notification CastRemoteDisplayLocalService$NotificationSettings.zzb(CastRemoteDisplayLocalService$NotificationSettings)>
	//   72  151:putfield        #256 <Field Notification zzbt>
		zzbr = new zzb(((zzu) (null)));
	//   73  154:aload_0         
	//   74  155:new             #21  <Class CastRemoteDisplayLocalService$zzb>
	//   75  158:dup             
	//   76  159:aconst_null     
	//   77  160:invokespecial   #443 <Method void CastRemoteDisplayLocalService$zzb(zzu)>
	//   78  163:putfield        #343 <Field CastRemoteDisplayLocalService$zzb zzbr>
		s = ((String) (new IntentFilter()));
	//   79  166:new             #445 <Class IntentFilter>
	//   80  169:dup             
	//   81  170:invokespecial   #446 <Method void IntentFilter()>
	//   82  173:astore_1        
		((IntentFilter) (s)).addAction("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT");
	//   83  174:aload_1         
	//   84  175:ldc2            #448 <String "com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT">
	//   85  178:invokevirtual   #451 <Method void IntentFilter.addAction(String)>
		((IntentFilter) (s)).addAction("com.google.android.gms.cast.remote_display.ACTION_SESSION_ENDED");
	//   86  181:aload_1         
	//   87  182:ldc2            #453 <String "com.google.android.gms.cast.remote_display.ACTION_SESSION_ENDED">
	//   88  185:invokevirtual   #451 <Method void IntentFilter.addAction(String)>
		registerReceiver(((BroadcastReceiver) (zzbr)), ((IntentFilter) (s)));
	//   89  188:aload_0         
	//   90  189:aload_0         
	//   91  190:getfield        #343 <Field CastRemoteDisplayLocalService$zzb zzbr>
	//   92  193:aload_1         
	//   93  194:invokevirtual   #457 <Method Intent registerReceiver(BroadcastReceiver, IntentFilter)>
	//   94  197:pop             
		zzbs = new NotificationSettings(notificationsettings, ((zzu) (null)));
	//   95  198:aload_0         
	//   96  199:new             #9   <Class CastRemoteDisplayLocalService$NotificationSettings>
	//   97  202:dup             
	//   98  203:aload           4
	//   99  205:aconst_null     
	//  100  206:invokespecial   #460 <Method void CastRemoteDisplayLocalService$NotificationSettings(CastRemoteDisplayLocalService$NotificationSettings, zzu)>
	//  101  209:putfield        #282 <Field CastRemoteDisplayLocalService$NotificationSettings zzbs>
		if(NotificationSettings.zzb(zzbs) == null)
	//* 102  212:aload_0         
	//* 103  213:getfield        #282 <Field CastRemoteDisplayLocalService$NotificationSettings zzbs>
	//* 104  216:invokestatic    #198 <Method Notification CastRemoteDisplayLocalService$NotificationSettings.zzb(CastRemoteDisplayLocalService$NotificationSettings)>
	//* 105  219:ifnonnull       241
		{
			zzbu = true;
	//  106  222:aload_0         
	//  107  223:iconst_1        
	//  108  224:putfield        #250 <Field boolean zzbu>
			s = ((String) (zzc(false)));
	//  109  227:aload_0         
	//  110  228:iconst_0        
	//  111  229:invokespecial   #254 <Method Notification zzc(boolean)>
	//  112  232:astore_1        
		} else
	//* 113  233:aload_0         
	//* 114  234:aload_1         
	//* 115  235:putfield        #256 <Field Notification zzbt>
	//* 116  238:goto            257
		{
			zzbu = false;
	//  117  241:aload_0         
	//  118  242:iconst_0        
	//  119  243:putfield        #250 <Field boolean zzbu>
			s = ((String) (NotificationSettings.zzb(zzbs)));
	//  120  246:aload_0         
	//  121  247:getfield        #282 <Field CastRemoteDisplayLocalService$NotificationSettings zzbs>
	//  122  250:invokestatic    #198 <Method Notification CastRemoteDisplayLocalService$NotificationSettings.zzb(CastRemoteDisplayLocalService$NotificationSettings)>
	//  123  253:astore_1        
		}
		zzbt = ((Notification) (s));
	//* 124  254:goto            233
		startForeground(zzbn, zzbt);
	//  125  257:aload_0         
	//  126  258:getstatic       #88  <Field int zzbn>
	//  127  261:aload_0         
	//  128  262:getfield        #256 <Field Notification zzbt>
	//  129  265:invokevirtual   #260 <Method void startForeground(int, Notification)>
		zzb("startRemoteDisplay");
	//  130  268:aload_0         
	//  131  269:ldc2            #462 <String "startRemoteDisplay">
	//  132  272:invokespecial   #320 <Method void zzb(String)>
		s = ((String) (new Intent("com.google.android.gms.cast.remote_display.ACTION_SESSION_ENDED")));
	//  133  275:new             #218 <Class Intent>
	//  134  278:dup             
	//  135  279:ldc2            #453 <String "com.google.android.gms.cast.remote_display.ACTION_SESSION_ENDED">
	//  136  282:invokespecial   #463 <Method void Intent(String)>
	//  137  285:astore_1        
		((Intent) (s)).setPackage(zzby.getPackageName());
	//  138  286:aload_1         
	//  139  287:aload_0         
	//  140  288:getfield        #239 <Field Context zzby>
	//  141  291:invokevirtual   #467 <Method String Context.getPackageName()>
	//  142  294:invokevirtual   #471 <Method Intent Intent.setPackage(String)>
	//  143  297:pop             
		s = ((String) (PendingIntent.getBroadcast(((Context) (this)), 0, ((Intent) (s)), 0)));
	//  144  298:aload_0         
	//  145  299:iconst_0        
	//  146  300:aload_1         
	//  147  301:iconst_0        
	//  148  302:invokestatic    #477 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//  149  305:astore_1        
		zzcc.startRemoteDisplay(castdevice, zzy, options.getConfigPreset(), ((PendingIntent) (s))).addOnCompleteListener(((com.google.android.gms.tasks.OnCompleteListener) (new zzz(this))));
	//  150  306:aload_0         
	//  151  307:getfield        #355 <Field CastRemoteDisplayClient zzcc>
	//  152  310:aload_2         
	//  153  311:aload_0         
	//  154  312:getfield        #399 <Field String zzy>
	//  155  315:aload_3         
	//  156  316:invokevirtual   #481 <Method int CastRemoteDisplayLocalService$Options.getConfigPreset()>
	//  157  319:aload_1         
	//  158  320:invokevirtual   #484 <Method Task CastRemoteDisplayClient.startRemoteDisplay(CastDevice, String, int, PendingIntent)>
	//  159  323:new             #486 <Class zzz>
	//  160  326:dup             
	//  161  327:aload_0         
	//  162  328:invokespecial   #487 <Method void zzz(CastRemoteDisplayLocalService)>
	//  163  331:invokevirtual   #369 <Method Task Task.addOnCompleteListener(com.google.android.gms.tasks.OnCompleteListener)>
	//  164  334:pop             
		if(zzbq.get() != null)
	//* 165  335:aload_0         
	//* 166  336:getfield        #262 <Field WeakReference zzbq>
	//* 167  339:invokevirtual   #268 <Method Object WeakReference.get()>
	//* 168  342:ifnull          361
			((Callbacks)zzbq.get()).onServiceCreated(this);
	//  169  345:aload_0         
	//  170  346:getfield        #262 <Field WeakReference zzbq>
	//  171  349:invokevirtual   #268 <Method Object WeakReference.get()>
	//  172  352:checkcast       #6   <Class CastRemoteDisplayLocalService$Callbacks>
	//  173  355:aload_0         
	//  174  356:invokeinterface #490 <Method void CastRemoteDisplayLocalService$Callbacks.onServiceCreated(CastRemoteDisplayLocalService)>
		return true;
	//  175  361:iconst_1        
	//  176  362:ireturn         
		s;
	//  177  363:astore_1        
		obj;
	//  178  364:aload           8
		JVM INSTR monitorexit ;
	//  179  366:monitorexit     
		throw s;
	//  180  367:aload_1         
	//  181  368:athrow          
	}

	static Display zzb(CastRemoteDisplayLocalService castremotedisplaylocalservice, Display display)
	{
		castremotedisplaylocalservice.zzbx = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #248 <Field Display zzbx>
		return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
	}

	static void zzb(CastRemoteDisplayLocalService castremotedisplaylocalservice, String s)
	{
		castremotedisplaylocalservice.zzc(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #493 <Method void zzc(String)>
	//    3    5:return          
	}

	private final void zzb(String s)
	{
		zzbd.d("[Instance: %s] %s", new Object[] {
			this, s
		});
	//    0    0:getstatic       #81  <Field zzdg zzbd>
	//    1    3:ldc2            #495 <String "[Instance: %s] %s">
	//    2    6:iconst_2        
	//    3    7:anewarray       Object[]
	//    4   10:dup             
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_1         
	//   11   17:aastore         
	//   12   18:invokevirtual   #141 <Method void zzdg.d(String, Object[])>
	//   13   21:return          
	}

	private static void zzb(boolean flag)
	{
label0:
		{
			zzbd.d("Stopping Service", new Object[0]);
	//    0    0:getstatic       #81  <Field zzdg zzbd>
	//    1    3:ldc2            #325 <String "Stopping Service">
	//    2    6:iconst_0        
	//    3    7:anewarray       Object[]
	//    4   10:invokevirtual   #141 <Method void zzdg.d(String, Object[])>
			zzbp.set(false);
	//    5   13:getstatic       #101 <Field AtomicBoolean zzbp>
	//    6   16:iconst_0        
	//    7   17:invokevirtual   #498 <Method void AtomicBoolean.set(boolean)>
			synchronized(zzbo)
	//*   8   20:getstatic       #94  <Field Object zzbo>
	//*   9   23:astore_1        
	//*  10   24:aload_1         
	//*  11   25:monitorenter    
			{
				if(zzce != null)
					break label0;
	//   12   26:getstatic       #119 <Field CastRemoteDisplayLocalService zzce>
	//   13   29:ifnonnull       48
				zzbd.e("Service is already being stopped", new Object[0]);
	//   14   32:getstatic       #81  <Field zzdg zzbd>
	//   15   35:ldc2            #500 <String "Service is already being stopped">
	//   16   38:iconst_0        
	//   17   39:anewarray       Object[]
	//   18   42:invokevirtual   #216 <Method void zzdg.e(String, Object[])>
			}
	//   19   45:aload_1         
	//   20   46:monitorexit     
			return;
	//   21   47:return          
		}
		CastRemoteDisplayLocalService castremotedisplaylocalservice;
		castremotedisplaylocalservice = zzce;
	//   22   48:getstatic       #119 <Field CastRemoteDisplayLocalService zzce>
	//   23   51:astore_2        
		zzce = null;
	//   24   52:aconst_null     
	//   25   53:putstatic       #119 <Field CastRemoteDisplayLocalService zzce>
		obj;
	//   26   56:aload_1         
		JVM INSTR monitorexit ;
	//   27   57:monitorexit     
		if(castremotedisplaylocalservice.handler != null)
	//*  28   58:aload_2         
	//*  29   59:getfield        #502 <Field Handler handler>
	//*  30   62:ifnull          97
		{
			if(Looper.myLooper() != Looper.getMainLooper())
	//*  31   65:invokestatic    #508 <Method Looper Looper.myLooper()>
	//*  32   68:invokestatic    #511 <Method Looper Looper.getMainLooper()>
	//*  33   71:if_acmpeq       92
			{
				castremotedisplaylocalservice.handler.post(((Runnable) (new zzx(castremotedisplaylocalservice, flag))));
	//   34   74:aload_2         
	//   35   75:getfield        #502 <Field Handler handler>
	//   36   78:new             #513 <Class zzx>
	//   37   81:dup             
	//   38   82:aload_2         
	//   39   83:iload_0         
	//   40   84:invokespecial   #515 <Method void zzx(CastRemoteDisplayLocalService, boolean)>
	//   41   87:invokevirtual   #521 <Method boolean Handler.post(Runnable)>
	//   42   90:pop             
				return;
	//   43   91:return          
			}
			castremotedisplaylocalservice.zza(flag);
	//   44   92:aload_2         
	//   45   93:iload_0         
	//   46   94:invokespecial   #323 <Method void zza(boolean)>
		}
		return;
	//   47   97:return          
		exception;
	//   48   98:astore_2        
		obj;
	//   49   99:aload_1         
		JVM INSTR monitorexit ;
	//   50  100:monitorexit     
		throw exception;
	//   51  101:aload_2         
	//   52  102:athrow          
	}

	static boolean zzb(CastRemoteDisplayLocalService castremotedisplaylocalservice)
	{
		return castremotedisplaylocalservice.zzcb;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field boolean zzcb>
	//    2    4:ireturn         
	}

	private final Notification zzc(boolean flag)
	{
		zzb("createDefaultNotification");
	//    0    0:aload_0         
	//    1    1:ldc2            #524 <String "createDefaultNotification">
	//    2    4:invokespecial   #320 <Method void zzb(String)>
		String s = NotificationSettings.zzc(zzbs);
	//    3    7:aload_0         
	//    4    8:getfield        #282 <Field CastRemoteDisplayLocalService$NotificationSettings zzbs>
	//    5   11:invokestatic    #292 <Method String CastRemoteDisplayLocalService$NotificationSettings.zzc(CastRemoteDisplayLocalService$NotificationSettings)>
	//    6   14:astore          5
		String s1 = NotificationSettings.zzd(zzbs);
	//    7   16:aload_0         
	//    8   17:getfield        #282 <Field CastRemoteDisplayLocalService$NotificationSettings zzbs>
	//    9   20:invokestatic    #304 <Method String CastRemoteDisplayLocalService$NotificationSettings.zzd(CastRemoteDisplayLocalService$NotificationSettings)>
	//   10   23:astore          6
		int i;
		int j;
		if(flag)
	//*  11   25:iload_1         
	//*  12   26:ifeq            40
		{
			j = R.string.cast_notification_connected_message;
	//   13   29:getstatic       #529 <Field int R$string.cast_notification_connected_message>
	//   14   32:istore_3        
			i = R.drawable.cast_ic_notification_on;
	//   15   33:getstatic       #534 <Field int R$drawable.cast_ic_notification_on>
	//   16   36:istore_2        
		} else
	//*  17   37:goto            48
		{
			j = R.string.cast_notification_connecting_message;
	//   18   40:getstatic       #537 <Field int R$string.cast_notification_connecting_message>
	//   19   43:istore_3        
			i = R.drawable.cast_ic_notification_connecting;
	//   20   44:getstatic       #540 <Field int R$drawable.cast_ic_notification_connecting>
	//   21   47:istore_2        
		}
		Object obj = ((Object) (s));
	//   22   48:aload           5
	//   23   50:astore          4
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  24   52:aload           5
	//*  25   54:invokestatic    #298 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  26   57:ifeq            76
			obj = ((Object) ((String)getPackageManager().getApplicationLabel(getApplicationInfo())));
	//   27   60:aload_0         
	//   28   61:invokevirtual   #541 <Method PackageManager getPackageManager()>
	//   29   64:aload_0         
	//   30   65:invokevirtual   #545 <Method android.content.pm.ApplicationInfo getApplicationInfo()>
	//   31   68:invokevirtual   #549 <Method CharSequence PackageManager.getApplicationLabel(android.content.pm.ApplicationInfo)>
	//   32   71:checkcast       #551 <Class String>
	//   33   74:astore          4
		s = s1;
	//   34   76:aload           6
	//   35   78:astore          5
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*  36   80:aload           6
	//*  37   82:invokestatic    #298 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  38   85:ifeq            109
			s = getString(j, new Object[] {
				zzbw.getFriendlyName()
			});
	//   39   88:aload_0         
	//   40   89:iload_3         
	//   41   90:iconst_1        
	//   42   91:anewarray       Object[]
	//   43   94:dup             
	//   44   95:iconst_0        
	//   45   96:aload_0         
	//   46   97:getfield        #245 <Field CastDevice zzbw>
	//   47  100:invokevirtual   #556 <Method String CastDevice.getFriendlyName()>
	//   48  103:aastore         
	//   49  104:invokevirtual   #560 <Method String getString(int, Object[])>
	//   50  107:astore          5
		obj = ((Object) ((new android.support.v4.app.NotificationCompat.Builder(((Context) (this)), "cast_remote_display_local_service")).setContentTitle(((CharSequence) (obj))).setContentText(((CharSequence) (s))).setContentIntent(NotificationSettings.zze(zzbs)).setSmallIcon(i).setOngoing(true)));
	//   51  109:new             #562 <Class android.support.v4.app.NotificationCompat$Builder>
	//   52  112:dup             
	//   53  113:aload_0         
	//   54  114:ldc2            #564 <String "cast_remote_display_local_service">
	//   55  117:invokespecial   #567 <Method void android.support.v4.app.NotificationCompat$Builder(Context, String)>
	//   56  120:aload           4
	//   57  122:invokevirtual   #571 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentTitle(CharSequence)>
	//   58  125:aload           5
	//   59  127:invokevirtual   #574 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentText(CharSequence)>
	//   60  130:aload_0         
	//   61  131:getfield        #282 <Field CastRemoteDisplayLocalService$NotificationSettings zzbs>
	//   62  134:invokestatic    #202 <Method PendingIntent CastRemoteDisplayLocalService$NotificationSettings.zze(CastRemoteDisplayLocalService$NotificationSettings)>
	//   63  137:invokevirtual   #578 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentIntent(PendingIntent)>
	//   64  140:iload_2         
	//   65  141:invokevirtual   #582 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setSmallIcon(int)>
	//   66  144:iconst_1        
	//   67  145:invokevirtual   #586 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setOngoing(boolean)>
	//   68  148:astore          4
		s = getString(R.string.cast_notification_disconnect);
	//   69  150:aload_0         
	//   70  151:getstatic       #589 <Field int R$string.cast_notification_disconnect>
	//   71  154:invokevirtual   #592 <Method String getString(int)>
	//   72  157:astore          5
		if(zzbv == null)
	//*  73  159:aload_0         
	//*  74  160:getfield        #594 <Field PendingIntent zzbv>
	//*  75  163:ifnonnull       205
		{
			Intent intent = new Intent("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT");
	//   76  166:new             #218 <Class Intent>
	//   77  169:dup             
	//   78  170:ldc2            #448 <String "com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT">
	//   79  173:invokespecial   #463 <Method void Intent(String)>
	//   80  176:astore          6
			intent.setPackage(zzby.getPackageName());
	//   81  178:aload           6
	//   82  180:aload_0         
	//   83  181:getfield        #239 <Field Context zzby>
	//   84  184:invokevirtual   #467 <Method String Context.getPackageName()>
	//   85  187:invokevirtual   #471 <Method Intent Intent.setPackage(String)>
	//   86  190:pop             
			zzbv = PendingIntent.getBroadcast(((Context) (this)), 0, intent, 0x8000000);
	//   87  191:aload_0         
	//   88  192:aload_0         
	//   89  193:iconst_0        
	//   90  194:aload           6
	//   91  196:ldc2            #595 <Int 0x8000000>
	//   92  199:invokestatic    #477 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   93  202:putfield        #594 <Field PendingIntent zzbv>
		}
		return ((android.support.v4.app.NotificationCompat.Builder) (obj)).addAction(0x1080038, ((CharSequence) (s)), zzbv).build();
	//   94  205:aload           4
	//   95  207:ldc2            #596 <Int 0x1080038>
	//   96  210:aload           5
	//   97  212:aload_0         
	//   98  213:getfield        #594 <Field PendingIntent zzbv>
	//   99  216:invokevirtual   #599 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.addAction(int, CharSequence, PendingIntent)>
	//  100  219:invokevirtual   #602 <Method Notification android.support.v4.app.NotificationCompat$Builder.build()>
	//  101  222:areturn         
	}

	static void zzc(CastRemoteDisplayLocalService castremotedisplaylocalservice)
	{
		castremotedisplaylocalservice.zzd();
	//    0    0:aload_0         
	//    1    1:invokespecial   #604 <Method void zzd()>
	//    2    4:return          
	}

	private final void zzc(String s)
	{
		zzbd.e("[Instance: %s] %s", new Object[] {
			this, s
		});
	//    0    0:getstatic       #81  <Field zzdg zzbd>
	//    1    3:ldc2            #495 <String "[Instance: %s] %s">
	//    2    6:iconst_2        
	//    3    7:anewarray       Object[]
	//    4   10:dup             
	//    5   11:iconst_0        
	//    6   12:aload_0         
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_1         
	//   11   17:aastore         
	//   12   18:invokevirtual   #216 <Method void zzdg.e(String, Object[])>
	//   13   21:return          
	}

	static Context zzd(CastRemoteDisplayLocalService castremotedisplaylocalservice)
	{
		return castremotedisplaylocalservice.zzby;
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field Context zzby>
	//    2    4:areturn         
	}

	private final void zzd()
	{
		if(zzbq.get() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #262 <Field WeakReference zzbq>
	//*   2    4:invokevirtual   #268 <Method Object WeakReference.get()>
	//*   3    7:ifnull          35
			((Callbacks)zzbq.get()).onRemoteDisplaySessionError(new Status(2200));
	//    4   10:aload_0         
	//    5   11:getfield        #262 <Field WeakReference zzbq>
	//    6   14:invokevirtual   #268 <Method Object WeakReference.get()>
	//    7   17:checkcast       #6   <Class CastRemoteDisplayLocalService$Callbacks>
	//    8   20:new             #607 <Class Status>
	//    9   23:dup             
	//   10   24:sipush          2200
	//   11   27:invokespecial   #610 <Method void Status(int)>
	//   12   30:invokeinterface #614 <Method void CastRemoteDisplayLocalService$Callbacks.onRemoteDisplaySessionError(Status)>
		stopService();
	//   13   35:invokestatic    #616 <Method void stopService()>
	//   14   38:return          
	}

	static void zzd(boolean flag)
	{
		zzb(false);
	//    0    0:iconst_0        
	//    1    1:invokestatic    #148 <Method void zzb(boolean)>
	//    2    4:return          
	}

	static ServiceConnection zze(CastRemoteDisplayLocalService castremotedisplaylocalservice)
	{
		return castremotedisplaylocalservice.zzbz;
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field ServiceConnection zzbz>
	//    2    4:areturn         
	}

	static zzdg zze()
	{
		return zzbd;
	//    0    0:getstatic       #81  <Field zzdg zzbd>
	//    1    3:areturn         
	}

	static WeakReference zzf(CastRemoteDisplayLocalService castremotedisplaylocalservice)
	{
		return castremotedisplaylocalservice.zzbq;
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field WeakReference zzbq>
	//    2    4:areturn         
	}

	static AtomicBoolean zzf()
	{
		return zzbp;
	//    0    0:getstatic       #101 <Field AtomicBoolean zzbp>
	//    1    3:areturn         
	}

	static Object zzg()
	{
		return zzbo;
	//    0    0:getstatic       #94  <Field Object zzbo>
	//    1    3:areturn         
	}

	static CastRemoteDisplayLocalService zzh()
	{
		return zzce;
	//    0    0:getstatic       #119 <Field CastRemoteDisplayLocalService zzce>
	//    1    3:areturn         
	}

	protected Display getDisplay()
	{
		return zzbx;
	//    0    0:aload_0         
	//    1    1:getfield        #248 <Field Display zzbx>
	//    2    4:areturn         
	}

	public IBinder onBind(Intent intent)
	{
		zzb("onBind");
	//    0    0:aload_0         
	//    1    1:ldc2            #628 <String "onBind">
	//    2    4:invokespecial   #320 <Method void zzb(String)>
		return zzcf;
	//    3    7:aload_0         
	//    4    8:getfield        #115 <Field IBinder zzcf>
	//    5   11:areturn         
	}

	public void onCreate()
	{
		zzb("onCreate");
	//    0    0:aload_0         
	//    1    1:ldc2            #630 <String "onCreate">
	//    2    4:invokespecial   #320 <Method void zzb(String)>
		super.onCreate();
	//    3    7:aload_0         
	//    4    8:invokespecial   #632 <Method void Service.onCreate()>
		handler = new Handler(getMainLooper());
	//    5   11:aload_0         
	//    6   12:new             #517 <Class Handler>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokevirtual   #633 <Method Looper getMainLooper()>
	//   10   20:invokespecial   #636 <Method void Handler(Looper)>
	//   11   23:putfield        #502 <Field Handler handler>
		handler.postDelayed(((Runnable) (new zzv(this))), 100L);
	//   12   26:aload_0         
	//   13   27:getfield        #502 <Field Handler handler>
	//   14   30:new             #638 <Class zzv>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:invokespecial   #639 <Method void zzv(CastRemoteDisplayLocalService)>
	//   18   38:ldc2w           #640 <Long 100L>
	//   19   41:invokevirtual   #645 <Method boolean Handler.postDelayed(Runnable, long)>
	//   20   44:pop             
		if(zzcc == null)
	//*  21   45:aload_0         
	//*  22   46:getfield        #355 <Field CastRemoteDisplayClient zzcc>
	//*  23   49:ifnonnull       60
			zzcc = CastRemoteDisplay.getClient(((Context) (this)));
	//   24   52:aload_0         
	//   25   53:aload_0         
	//   26   54:invokestatic    #651 <Method CastRemoteDisplayClient CastRemoteDisplay.getClient(Context)>
	//   27   57:putfield        #355 <Field CastRemoteDisplayClient zzcc>
		if(PlatformVersion.isAtLeastO())
	//*  28   60:invokestatic    #657 <Method boolean PlatformVersion.isAtLeastO()>
	//*  29   63:ifeq            106
		{
			NotificationManager notificationmanager = (NotificationManager)getSystemService(android/app/NotificationManager);
	//   30   66:aload_0         
	//   31   67:ldc2            #659 <Class NotificationManager>
	//   32   70:invokevirtual   #663 <Method Object getSystemService(Class)>
	//   33   73:checkcast       #659 <Class NotificationManager>
	//   34   76:astore_1        
			NotificationChannel notificationchannel = new NotificationChannel("cast_remote_display_local_service", ((CharSequence) (getString(R.string.cast_notification_default_channel_name))), 2);
	//   35   77:new             #665 <Class NotificationChannel>
	//   36   80:dup             
	//   37   81:ldc2            #564 <String "cast_remote_display_local_service">
	//   38   84:aload_0         
	//   39   85:getstatic       #668 <Field int R$string.cast_notification_default_channel_name>
	//   40   88:invokevirtual   #592 <Method String getString(int)>
	//   41   91:iconst_2        
	//   42   92:invokespecial   #671 <Method void NotificationChannel(String, CharSequence, int)>
	//   43   95:astore_2        
			notificationchannel.setShowBadge(false);
	//   44   96:aload_2         
	//   45   97:iconst_0        
	//   46   98:invokevirtual   #674 <Method void NotificationChannel.setShowBadge(boolean)>
			notificationmanager.createNotificationChannel(notificationchannel);
	//   47  101:aload_1         
	//   48  102:aload_2         
	//   49  103:invokevirtual   #678 <Method void NotificationManager.createNotificationChannel(NotificationChannel)>
		}
	//   50  106:return          
	}

	public abstract void onCreatePresentation(Display display);

	public abstract void onDismissPresentation();

	public int onStartCommand(Intent intent, int i, int j)
	{
		zzb("onStartCommand");
	//    0    0:aload_0         
	//    1    1:ldc2            #681 <String "onStartCommand">
	//    2    4:invokespecial   #320 <Method void zzb(String)>
		zzcb = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #105 <Field boolean zzcb>
		return 2;
	//    6   12:iconst_2        
	//    7   13:ireturn         
	}

	public void updateNotificationSettings(NotificationSettings notificationsettings)
	{
		Preconditions.checkNotNull(((Object) (notificationsettings)), "notificationSettings is required.");
	//    0    0:aload_1         
	//    1    1:ldc1            #193 <String "notificationSettings is required.">
	//    2    3:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    6:pop             
		Preconditions.checkNotNull(((Object) (handler)), "Service is not ready yet.");
	//    4    7:aload_0         
	//    5    8:getfield        #502 <Field Handler handler>
	//    6   11:ldc2            #684 <String "Service is not ready yet.">
	//    7   14:invokestatic    #183 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    8   17:pop             
		handler.post(((Runnable) (new zzy(this, notificationsettings))));
	//    9   18:aload_0         
	//   10   19:getfield        #502 <Field Handler handler>
	//   11   22:new             #686 <Class zzy>
	//   12   25:dup             
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:invokespecial   #688 <Method void zzy(CastRemoteDisplayLocalService, CastRemoteDisplayLocalService$NotificationSettings)>
	//   16   31:invokevirtual   #521 <Method boolean Handler.post(Runnable)>
	//   17   34:pop             
	//   18   35:return          
	}

	private static final zzdg zzbd = new zzdg("CastRemoteDisplayLocalService");
	private static final int zzbn;
	private static final Object zzbo = new Object();
	private static AtomicBoolean zzbp = new AtomicBoolean(false);
	private static CastRemoteDisplayLocalService zzce;
	private Handler handler;
	private WeakReference zzbq;
	private zzb zzbr;
	private NotificationSettings zzbs;
	private Notification zzbt;
	private boolean zzbu;
	private PendingIntent zzbv;
	private CastDevice zzbw;
	private Display zzbx;
	private Context zzby;
	private ServiceConnection zzbz;
	private MediaRouter zzca;
	private boolean zzcb;
	private CastRemoteDisplayClient zzcc;
	private final android.support.v7.media.MediaRouter.Callback zzcd = new zzu(this);
	private final IBinder zzcf = new zza();
	private String zzy;

	static 
	{
	//    0    0:new             #73  <Class zzdg>
	//    1    3:dup             
	//    2    4:ldc1            #75  <String "CastRemoteDisplayLocalService">
	//    3    6:invokespecial   #79  <Method void zzdg(String)>
	//    4    9:putstatic       #81  <Field zzdg zzbd>
		zzbn = R.id.cast_notification_id;
	//    5   12:getstatic       #86  <Field int R$id.cast_notification_id>
	//    6   15:putstatic       #88  <Field int zzbn>
	//    7   18:new             #90  <Class Object>
	//    8   21:dup             
	//    9   22:invokespecial   #92  <Method void Object()>
	//   10   25:putstatic       #94  <Field Object zzbo>
	//   11   28:new             #96  <Class AtomicBoolean>
	//   12   31:dup             
	//   13   32:iconst_0        
	//   14   33:invokespecial   #99  <Method void AtomicBoolean(boolean)>
	//   15   36:putstatic       #101 <Field AtomicBoolean zzbp>
	//*  16   39:return          
	}
}
