// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.app.*;
import android.content.*;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.*;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.GooglePlayServicesUpdatedReceiver;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zzbt;
import com.google.android.gms.common.api.internal.zzk;
import com.google.android.gms.common.internal.ConnectionErrorMessages;
import com.google.android.gms.common.internal.DialogRedirect;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.common:
//			GoogleApiAvailabilityLight, SupportErrorDialogFragment, ErrorDialogFragment, GooglePlayServicesUtilLight, 
//			zza, ConnectionResult

public class GoogleApiAvailability extends GoogleApiAvailabilityLight
{
	private final class zza extends Handler
	{

		public final void handleMessage(Message message)
		{
			if(message.what != 1)
		//*   0    0:aload_1         
		//*   1    1:getfield        #47  <Field int Message.what>
		//*   2    4:iconst_1        
		//*   3    5:icmpeq          47
			{
				int i = message.what;
		//    4    8:aload_1         
		//    5    9:getfield        #47  <Field int Message.what>
		//    6   12:istore_2        
				message = ((Message) (new StringBuilder(50)));
		//    7   13:new             #49  <Class StringBuilder>
		//    8   16:dup             
		//    9   17:bipush          50
		//   10   19:invokespecial   #52  <Method void StringBuilder(int)>
		//   11   22:astore_1        
				((StringBuilder) (message)).append("Don't know how to handle this message: ");
		//   12   23:aload_1         
		//   13   24:ldc1            #54  <String "Don't know how to handle this message: ">
		//   14   26:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
		//   15   29:pop             
				((StringBuilder) (message)).append(i);
		//   16   30:aload_1         
		//   17   31:iload_2         
		//   18   32:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
		//   19   35:pop             
				Log.w("GoogleApiAvailability", ((StringBuilder) (message)).toString());
		//   20   36:ldc1            #63  <String "GoogleApiAvailability">
		//   21   38:aload_1         
		//   22   39:invokevirtual   #67  <Method String StringBuilder.toString()>
		//   23   42:invokestatic    #73  <Method int Log.w(String, String)>
		//   24   45:pop             
				return;
		//   25   46:return          
			}
			int j = ((GoogleApiAvailabilityLight) (zzav)).isGooglePlayServicesAvailable(zzau);
		//   26   47:aload_0         
		//   27   48:getfield        #18  <Field GoogleApiAvailability zzav>
		//   28   51:aload_0         
		//   29   52:getfield        #38  <Field Context zzau>
		//   30   55:invokevirtual   #79  <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context)>
		//   31   58:istore_2        
			if(((GoogleApiAvailabilityLight) (zzav)).isUserResolvableError(j))
		//*  32   59:aload_0         
		//*  33   60:getfield        #18  <Field GoogleApiAvailability zzav>
		//*  34   63:iload_2         
		//*  35   64:invokevirtual   #83  <Method boolean GoogleApiAvailabilityLight.isUserResolvableError(int)>
		//*  36   67:ifeq            82
				zzav.showErrorNotification(zzau, j);
		//   37   70:aload_0         
		//   38   71:getfield        #18  <Field GoogleApiAvailability zzav>
		//   39   74:aload_0         
		//   40   75:getfield        #38  <Field Context zzau>
		//   41   78:iload_2         
		//   42   79:invokevirtual   #87  <Method void GoogleApiAvailability.showErrorNotification(Context, int)>
		//   43   82:return          
		}

		private final Context zzau;
		private final GoogleApiAvailability zzav;

		public zza(Context context)
		{
			zzav = GoogleApiAvailability.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field GoogleApiAvailability zzav>
			if(Looper.myLooper() == null)
		//*   3    5:invokestatic    #24  <Method Looper Looper.myLooper()>
		//*   4    8:ifnonnull       18
				googleapiavailability = ((GoogleApiAvailability) (Looper.getMainLooper()));
		//    5   11:invokestatic    #27  <Method Looper Looper.getMainLooper()>
		//    6   14:astore_1        
			else
		//*   7   15:goto            22
				googleapiavailability = ((GoogleApiAvailability) (Looper.myLooper()));
		//    8   18:invokestatic    #24  <Method Looper Looper.myLooper()>
		//    9   21:astore_1        
			super(((Looper) (GoogleApiAvailability.this)));
		//   10   22:aload_0         
		//   11   23:aload_1         
		//   12   24:invokespecial   #30  <Method void Handler(Looper)>
			zzau = context.getApplicationContext();
		//   13   27:aload_0         
		//   14   28:aload_2         
		//   15   29:invokevirtual   #36  <Method Context Context.getApplicationContext()>
		//   16   32:putfield        #38  <Field Context zzau>
		//   17   35:return          
		}
	}


	GoogleApiAvailability()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void GoogleApiAvailabilityLight()>
	//    2    4:return          
	}

	public static GoogleApiAvailability getInstance()
	{
		return zzas;
	//    0    0:getstatic       #32  <Field GoogleApiAvailability zzas>
	//    1    3:areturn         
	}

	static Dialog zza(Context context, int i, DialogRedirect dialogredirect, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		android.app.AlertDialog.Builder builder = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		if(i == 0)
	//*   2    3:iload_1         
	//*   3    4:ifne            9
			return null;
	//    4    7:aconst_null     
	//    5    8:areturn         
		Object obj = ((Object) (new TypedValue()));
	//    6    9:new             #42  <Class TypedValue>
	//    7   12:dup             
	//    8   13:invokespecial   #43  <Method void TypedValue()>
	//    9   16:astore          5
		context.getTheme().resolveAttribute(0x1010309, ((TypedValue) (obj)), true);
	//   10   18:aload_0         
	//   11   19:invokevirtual   #49  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   12   22:ldc1            #50  <Int 0x1010309>
	//   13   24:aload           5
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #56  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   16   30:pop             
		if("Theme.Dialog.Alert".equals(((Object) (context.getResources().getResourceEntryName(((TypedValue) (obj)).resourceId)))))
	//*  17   31:ldc1            #58  <String "Theme.Dialog.Alert">
	//*  18   33:aload_0         
	//*  19   34:invokevirtual   #62  <Method Resources Context.getResources()>
	//*  20   37:aload           5
	//*  21   39:getfield        #65  <Field int TypedValue.resourceId>
	//*  22   42:invokevirtual   #71  <Method String Resources.getResourceEntryName(int)>
	//*  23   45:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  24   48:ifeq            62
			builder = new android.app.AlertDialog.Builder(context, 5);
	//   25   51:new             #79  <Class android.app.AlertDialog$Builder>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:iconst_5        
	//   29   57:invokespecial   #82  <Method void android.app.AlertDialog$Builder(Context, int)>
	//   30   60:astore          4
		obj = ((Object) (builder));
	//   31   62:aload           4
	//   32   64:astore          5
		if(builder == null)
	//*  33   66:aload           4
	//*  34   68:ifnonnull       81
			obj = ((Object) (new android.app.AlertDialog.Builder(context)));
	//   35   71:new             #79  <Class android.app.AlertDialog$Builder>
	//   36   74:dup             
	//   37   75:aload_0         
	//   38   76:invokespecial   #85  <Method void android.app.AlertDialog$Builder(Context)>
	//   39   79:astore          5
		((android.app.AlertDialog.Builder) (obj)).setMessage(((CharSequence) (ConnectionErrorMessages.getErrorMessage(context, i))));
	//   40   81:aload           5
	//   41   83:aload_0         
	//   42   84:iload_1         
	//   43   85:invokestatic    #91  <Method String ConnectionErrorMessages.getErrorMessage(Context, int)>
	//   44   88:invokevirtual   #95  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   45   91:pop             
		if(oncancellistener != null)
	//*  46   92:aload_3         
	//*  47   93:ifnull          103
			((android.app.AlertDialog.Builder) (obj)).setOnCancelListener(oncancellistener);
	//   48   96:aload           5
	//   49   98:aload_3         
	//   50   99:invokevirtual   #99  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
	//   51  102:pop             
		oncancellistener = ((android.content.DialogInterface.OnCancelListener) (ConnectionErrorMessages.getErrorDialogButtonMessage(context, i)));
	//   52  103:aload_0         
	//   53  104:iload_1         
	//   54  105:invokestatic    #102 <Method String ConnectionErrorMessages.getErrorDialogButtonMessage(Context, int)>
	//   55  108:astore_3        
		if(oncancellistener != null)
	//*  56  109:aload_3         
	//*  57  110:ifnull          121
			((android.app.AlertDialog.Builder) (obj)).setPositiveButton(((CharSequence) (oncancellistener)), ((android.content.DialogInterface.OnClickListener) (dialogredirect)));
	//   58  113:aload           5
	//   59  115:aload_3         
	//   60  116:aload_2         
	//   61  117:invokevirtual   #106 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   62  120:pop             
		context = ((Context) (ConnectionErrorMessages.getErrorTitle(context, i)));
	//   63  121:aload_0         
	//   64  122:iload_1         
	//   65  123:invokestatic    #109 <Method String ConnectionErrorMessages.getErrorTitle(Context, int)>
	//   66  126:astore_0        
		if(context != null)
	//*  67  127:aload_0         
	//*  68  128:ifnull          138
			((android.app.AlertDialog.Builder) (obj)).setTitle(((CharSequence) (context)));
	//   69  131:aload           5
	//   70  133:aload_0         
	//   71  134:invokevirtual   #112 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   72  137:pop             
		return ((Dialog) (((android.app.AlertDialog.Builder) (obj)).create()));
	//   73  138:aload           5
	//   74  140:invokevirtual   #116 <Method android.app.AlertDialog android.app.AlertDialog$Builder.create()>
	//   75  143:areturn         
	}

	private final String zza(Context context, NotificationManager notificationmanager)
	{
		String s;
		Object obj;
		Preconditions.checkState(PlatformVersion.isAtLeastO());
	//    0    0:invokestatic    #125 <Method boolean PlatformVersion.isAtLeastO()>
	//    1    3:invokestatic    #131 <Method void Preconditions.checkState(boolean)>
		obj = ((Object) (zzb()));
	//    2    6:aload_0         
	//    3    7:invokespecial   #135 <Method String zzb()>
	//    4   10:astore          4
		s = ((String) (obj));
	//    5   12:aload           4
	//    6   14:astore_3        
		if(obj != null) goto _L2; else goto _L1
	//    7   15:aload           4
	//    8   17:ifnonnull       85
_L1:
		s = "com.google.android.gms.availability";
	//    9   20:ldc1            #137 <String "com.google.android.gms.availability">
	//   10   22:astore_3        
		obj = ((Object) (notificationmanager.getNotificationChannel("com.google.android.gms.availability")));
	//   11   23:aload_2         
	//   12   24:ldc1            #137 <String "com.google.android.gms.availability">
	//   13   26:invokevirtual   #143 <Method NotificationChannel NotificationManager.getNotificationChannel(String)>
	//   14   29:astore          4
		context = ((Context) (ConnectionErrorMessages.getDefaultNotificationChannelName(context)));
	//   15   31:aload_1         
	//   16   32:invokestatic    #147 <Method String ConnectionErrorMessages.getDefaultNotificationChannelName(Context)>
	//   17   35:astore_1        
		if(obj != null) goto _L4; else goto _L3
	//   18   36:aload           4
	//   19   38:ifnonnull       61
_L3:
		context = ((Context) (new NotificationChannel("com.google.android.gms.availability", ((CharSequence) (context)), 4)));
	//   20   41:new             #149 <Class NotificationChannel>
	//   21   44:dup             
	//   22   45:ldc1            #137 <String "com.google.android.gms.availability">
	//   23   47:aload_1         
	//   24   48:iconst_4        
	//   25   49:invokespecial   #152 <Method void NotificationChannel(String, CharSequence, int)>
	//   26   52:astore_1        
_L5:
		notificationmanager.createNotificationChannel(((NotificationChannel) (context)));
	//   27   53:aload_2         
	//   28   54:aload_1         
	//   29   55:invokevirtual   #156 <Method void NotificationManager.createNotificationChannel(NotificationChannel)>
		return "com.google.android.gms.availability";
	//   30   58:ldc1            #137 <String "com.google.android.gms.availability">
	//   31   60:areturn         
_L4:
		if(((String) (context)).equals(((Object) (((NotificationChannel) (obj)).getName()))))
			break; /* Loop/switch isn't completed */
	//   32   61:aload_1         
	//   33   62:aload           4
	//   34   64:invokevirtual   #160 <Method CharSequence NotificationChannel.getName()>
	//   35   67:invokevirtual   #77  <Method boolean String.equals(Object)>
	//   36   70:ifne            85
		((NotificationChannel) (obj)).setName(((CharSequence) (context)));
	//   37   73:aload           4
	//   38   75:aload_1         
	//   39   76:invokevirtual   #164 <Method void NotificationChannel.setName(CharSequence)>
		context = ((Context) (obj));
	//   40   79:aload           4
	//   41   81:astore_1        
		if(true) goto _L5; else goto _L2
	//   42   82:goto            53
_L2:
		return s;
	//   43   85:aload_3         
	//   44   86:areturn         
	}

	static void zza(Activity activity, Dialog dialog, String s, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		if(activity instanceof FragmentActivity)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #168 <Class FragmentActivity>
	//*   2    4:ifeq            26
		{
			activity = ((Activity) (((FragmentActivity)activity).getSupportFragmentManager()));
	//    3    7:aload_0         
	//    4    8:checkcast       #168 <Class FragmentActivity>
	//    5   11:invokevirtual   #172 <Method android.support.v4.app.FragmentManager FragmentActivity.getSupportFragmentManager()>
	//    6   14:astore_0        
			SupportErrorDialogFragment.newInstance(dialog, oncancellistener).show(((android.support.v4.app.FragmentManager) (activity)), s);
	//    7   15:aload_1         
	//    8   16:aload_3         
	//    9   17:invokestatic    #178 <Method SupportErrorDialogFragment SupportErrorDialogFragment.newInstance(Dialog, android.content.DialogInterface$OnCancelListener)>
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #182 <Method void SupportErrorDialogFragment.show(android.support.v4.app.FragmentManager, String)>
			return;
	//   13   25:return          
		} else
		{
			activity = ((Activity) (activity.getFragmentManager()));
	//   14   26:aload_0         
	//   15   27:invokevirtual   #188 <Method android.app.FragmentManager Activity.getFragmentManager()>
	//   16   30:astore_0        
			ErrorDialogFragment.newInstance(dialog, oncancellistener).show(((android.app.FragmentManager) (activity)), s);
	//   17   31:aload_1         
	//   18   32:aload_3         
	//   19   33:invokestatic    #193 <Method ErrorDialogFragment ErrorDialogFragment.newInstance(Dialog, android.content.DialogInterface$OnCancelListener)>
	//   20   36:aload_0         
	//   21   37:aload_2         
	//   22   38:invokevirtual   #196 <Method void ErrorDialogFragment.show(android.app.FragmentManager, String)>
			return;
	//   23   41:return          
		}
	}

	private final void zza(Context context, int i, String s, PendingIntent pendingintent)
	{
		if(i == 18)
	//*   0    0:iload_2         
	//*   1    1:bipush          18
	//*   2    3:icmpne          12
		{
			zza(context);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #200 <Method void zza(Context)>
			return;
	//    6   11:return          
		}
		if(pendingintent == null)
	//*   7   12:aload           4
	//*   8   14:ifnonnull       32
		{
			if(i == 6)
	//*   9   17:iload_2         
	//*  10   18:bipush          6
	//*  11   20:icmpne          31
				Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
	//   12   23:ldc1            #202 <String "GoogleApiAvailability">
	//   13   25:ldc1            #204 <String "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.">
	//   14   27:invokestatic    #210 <Method int Log.w(String, String)>
	//   15   30:pop             
			return;
	//   16   31:return          
		}
		Object obj = ((Object) (ConnectionErrorMessages.getErrorNotificationTitle(context, i)));
	//   17   32:aload_1         
	//   18   33:iload_2         
	//   19   34:invokestatic    #213 <Method String ConnectionErrorMessages.getErrorNotificationTitle(Context, int)>
	//   20   37:astore          7
		String s1 = ConnectionErrorMessages.getErrorNotificationMessage(context, i);
	//   21   39:aload_1         
	//   22   40:iload_2         
	//   23   41:invokestatic    #216 <Method String ConnectionErrorMessages.getErrorNotificationMessage(Context, int)>
	//   24   44:astore          8
		Resources resources = context.getResources();
	//   25   46:aload_1         
	//   26   47:invokevirtual   #62  <Method Resources Context.getResources()>
	//   27   50:astore          6
		NotificationManager notificationmanager = (NotificationManager)context.getSystemService("notification");
	//   28   52:aload_1         
	//   29   53:ldc1            #218 <String "notification">
	//   30   55:invokevirtual   #222 <Method Object Context.getSystemService(String)>
	//   31   58:checkcast       #139 <Class NotificationManager>
	//   32   61:astore          5
		if(DeviceProperties.isWearable(context))
	//*  33   63:aload_1         
	//*  34   64:invokestatic    #228 <Method boolean DeviceProperties.isWearable(Context)>
	//*  35   67:ifeq            195
		{
			Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
	//   36   70:invokestatic    #231 <Method boolean PlatformVersion.isAtLeastKitKatWatch()>
	//   37   73:invokestatic    #131 <Method void Preconditions.checkState(boolean)>
			obj = ((Object) ((new android.app.Notification.Builder(context)).setSmallIcon(context.getApplicationInfo().icon).setPriority(2).setAutoCancel(true).setContentTitle(((CharSequence) (obj))).setStyle(((android.app.Notification.Style) ((new android.app.Notification.BigTextStyle()).bigText(((CharSequence) (s1))))))));
	//   38   76:new             #233 <Class android.app.Notification$Builder>
	//   39   79:dup             
	//   40   80:aload_1         
	//   41   81:invokespecial   #234 <Method void android.app.Notification$Builder(Context)>
	//   42   84:aload_1         
	//   43   85:invokevirtual   #238 <Method ApplicationInfo Context.getApplicationInfo()>
	//   44   88:getfield        #243 <Field int ApplicationInfo.icon>
	//   45   91:invokevirtual   #247 <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int)>
	//   46   94:iconst_2        
	//   47   95:invokevirtual   #250 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
	//   48   98:iconst_1        
	//   49   99:invokevirtual   #254 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//   50  102:aload           7
	//   51  104:invokevirtual   #258 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   52  107:new             #260 <Class android.app.Notification$BigTextStyle>
	//   53  110:dup             
	//   54  111:invokespecial   #261 <Method void android.app.Notification$BigTextStyle()>
	//   55  114:aload           8
	//   56  116:invokevirtual   #265 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.bigText(CharSequence)>
	//   57  119:invokevirtual   #269 <Method android.app.Notification$Builder android.app.Notification$Builder.setStyle(android.app.Notification$Style)>
	//   58  122:astore          7
			if(DeviceProperties.isWearableWithoutPlayStore(context))
	//*  59  124:aload_1         
	//*  60  125:invokestatic    #272 <Method boolean DeviceProperties.isWearableWithoutPlayStore(Context)>
	//*  61  128:ifeq            153
				((android.app.Notification.Builder) (obj)).addAction(com.google.android.gms.base.R.drawable.common_full_open_on_phone, ((CharSequence) (resources.getString(com.google.android.gms.base.R.string.common_open_on_phone))), pendingintent);
	//   62  131:aload           7
	//   63  133:getstatic       #277 <Field int com.google.android.gms.base.R$drawable.common_full_open_on_phone>
	//   64  136:aload           6
	//   65  138:getstatic       #282 <Field int com.google.android.gms.base.R$string.common_open_on_phone>
	//   66  141:invokevirtual   #285 <Method String Resources.getString(int)>
	//   67  144:aload           4
	//   68  146:invokevirtual   #289 <Method android.app.Notification$Builder android.app.Notification$Builder.addAction(int, CharSequence, PendingIntent)>
	//   69  149:pop             
			else
	//*  70  150:goto            161
				((android.app.Notification.Builder) (obj)).setContentIntent(pendingintent);
	//   71  153:aload           7
	//   72  155:aload           4
	//   73  157:invokevirtual   #293 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentIntent(PendingIntent)>
	//   74  160:pop             
			if(PlatformVersion.isAtLeastO() && PlatformVersion.isAtLeastO())
	//*  75  161:invokestatic    #125 <Method boolean PlatformVersion.isAtLeastO()>
	//*  76  164:ifeq            186
	//*  77  167:invokestatic    #125 <Method boolean PlatformVersion.isAtLeastO()>
	//*  78  170:ifeq            186
				((android.app.Notification.Builder) (obj)).setChannelId(zza(context, notificationmanager));
	//   79  173:aload           7
	//   80  175:aload_0         
	//   81  176:aload_1         
	//   82  177:aload           5
	//   83  179:invokespecial   #295 <Method String zza(Context, NotificationManager)>
	//   84  182:invokevirtual   #299 <Method android.app.Notification$Builder android.app.Notification$Builder.setChannelId(String)>
	//   85  185:pop             
			context = ((Context) (((android.app.Notification.Builder) (obj)).build()));
	//   86  186:aload           7
	//   87  188:invokevirtual   #303 <Method android.app.Notification android.app.Notification$Builder.build()>
	//   88  191:astore_1        
		} else
	//*  89  192:goto            297
		{
			pendingintent = ((PendingIntent) ((new android.support.v4.app.NotificationCompat.Builder(context)).setSmallIcon(0x108008a).setTicker(((CharSequence) (resources.getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker)))).setWhen(System.currentTimeMillis()).setAutoCancel(true).setContentIntent(pendingintent).setContentTitle(((CharSequence) (obj))).setContentText(((CharSequence) (s1))).setLocalOnly(true).setStyle(((android.support.v4.app.NotificationCompat.Style) ((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(((CharSequence) (s1))))))));
	//   90  195:new             #305 <Class android.support.v4.app.NotificationCompat$Builder>
	//   91  198:dup             
	//   92  199:aload_1         
	//   93  200:invokespecial   #306 <Method void android.support.v4.app.NotificationCompat$Builder(Context)>
	//   94  203:ldc2            #307 <Int 0x108008a>
	//   95  206:invokevirtual   #310 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setSmallIcon(int)>
	//   96  209:aload           6
	//   97  211:getstatic       #313 <Field int com.google.android.gms.base.R$string.common_google_play_services_notification_ticker>
	//   98  214:invokevirtual   #285 <Method String Resources.getString(int)>
	//   99  217:invokevirtual   #317 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setTicker(CharSequence)>
	//  100  220:invokestatic    #323 <Method long System.currentTimeMillis()>
	//  101  223:invokevirtual   #327 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setWhen(long)>
	//  102  226:iconst_1        
	//  103  227:invokevirtual   #330 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setAutoCancel(boolean)>
	//  104  230:aload           4
	//  105  232:invokevirtual   #333 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentIntent(PendingIntent)>
	//  106  235:aload           7
	//  107  237:invokevirtual   #335 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentTitle(CharSequence)>
	//  108  240:aload           8
	//  109  242:invokevirtual   #338 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentText(CharSequence)>
	//  110  245:iconst_1        
	//  111  246:invokevirtual   #341 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setLocalOnly(boolean)>
	//  112  249:new             #343 <Class android.support.v4.app.NotificationCompat$BigTextStyle>
	//  113  252:dup             
	//  114  253:invokespecial   #344 <Method void android.support.v4.app.NotificationCompat$BigTextStyle()>
	//  115  256:aload           8
	//  116  258:invokevirtual   #347 <Method android.support.v4.app.NotificationCompat$BigTextStyle android.support.v4.app.NotificationCompat$BigTextStyle.bigText(CharSequence)>
	//  117  261:invokevirtual   #350 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setStyle(android.support.v4.app.NotificationCompat$Style)>
	//  118  264:astore          4
			if(PlatformVersion.isAtLeastO() && PlatformVersion.isAtLeastO())
	//* 119  266:invokestatic    #125 <Method boolean PlatformVersion.isAtLeastO()>
	//* 120  269:ifeq            291
	//* 121  272:invokestatic    #125 <Method boolean PlatformVersion.isAtLeastO()>
	//* 122  275:ifeq            291
				((android.support.v4.app.NotificationCompat.Builder) (pendingintent)).setChannelId(zza(context, notificationmanager));
	//  123  278:aload           4
	//  124  280:aload_0         
	//  125  281:aload_1         
	//  126  282:aload           5
	//  127  284:invokespecial   #295 <Method String zza(Context, NotificationManager)>
	//  128  287:invokevirtual   #353 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setChannelId(String)>
	//  129  290:pop             
			context = ((Context) (((android.support.v4.app.NotificationCompat.Builder) (pendingintent)).build()));
	//  130  291:aload           4
	//  131  293:invokevirtual   #354 <Method android.app.Notification android.support.v4.app.NotificationCompat$Builder.build()>
	//  132  296:astore_1        
		}
		switch(i)
	//* 133  297:iload_2         
		{
	//* 134  298:tableswitch     1 3: default 324
	//	               1 331
	//	               2 331
	//	               3 331
		default:
			i = 39789;
	//  135  324:ldc2            #355 <Int 39789>
	//  136  327:istore_2        
			break;

	//* 137  328:goto            342
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
			i = 10436;
	//  138  331:sipush          10436
	//  139  334:istore_2        
			com.google.android.gms.common.GooglePlayServicesUtilLight.zzbt.set(false);
	//  140  335:getstatic       #361 <Field AtomicBoolean com.google.android.gms.common.GooglePlayServicesUtilLight.zzbt>
	//  141  338:iconst_0        
	//  142  339:invokevirtual   #366 <Method void AtomicBoolean.set(boolean)>
			break;
		}
		if(s == null)
	//* 143  342:aload_3         
	//* 144  343:ifnonnull       354
		{
			notificationmanager.notify(i, ((android.app.Notification) (context)));
	//  145  346:aload           5
	//  146  348:iload_2         
	//  147  349:aload_1         
	//  148  350:invokevirtual   #370 <Method void NotificationManager.notify(int, android.app.Notification)>
			return;
	//  149  353:return          
		} else
		{
			notificationmanager.notify(s, i, ((android.app.Notification) (context)));
	//  150  354:aload           5
	//  151  356:aload_3         
	//  152  357:iload_2         
	//  153  358:aload_1         
	//  154  359:invokevirtual   #373 <Method void NotificationManager.notify(String, int, android.app.Notification)>
			return;
	//  155  362:return          
		}
	}

	private final String zzb()
	{
		String s;
		synchronized(mLock)
	//*   0    0:getstatic       #29  <Field Object mLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			s = zzat;
	//    4    6:aload_0         
	//    5    7:getfield        #378 <Field String zzat>
	//    6   10:astore_2        
		}
	//    7   11:aload_1         
	//    8   12:monitorexit     
		return s;
	//    9   13:aload_2         
	//   10   14:areturn         
		exception;
	//   11   15:astore_2        
		obj;
	//   12   16:aload_1         
		JVM INSTR monitorexit ;
	//   13   17:monitorexit     
		throw exception;
	//   14   18:aload_2         
	//   15   19:athrow          
	}

	public transient Task checkApiAvailability(GoogleApi googleapi, GoogleApi agoogleapi[])
	{
		return checkApiAvailabilityAndPackages(googleapi, agoogleapi).continueWith(((com.google.android.gms.tasks.Continuation) (new com.google.android.gms.common.zza(this))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #383 <Method Task checkApiAvailabilityAndPackages(GoogleApi, GoogleApi[])>
	//    4    6:new             #385 <Class zza>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #388 <Method void zza(GoogleApiAvailability)>
	//    8   14:invokevirtual   #394 <Method Task Task.continueWith(com.google.android.gms.tasks.Continuation)>
	//    9   17:areturn         
	}

	public transient Task checkApiAvailabilityAndPackages(GoogleApi googleapi, GoogleApi agoogleapi[])
	{
		Preconditions.checkNotNull(((Object) (googleapi)), "Requested API must not be null.");
	//    0    0:aload_1         
	//    1    1:ldc2            #398 <String "Requested API must not be null.">
	//    2    4:invokestatic    #402 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    3    7:pop             
		int j = agoogleapi.length;
	//    4    8:aload_2         
	//    5    9:arraylength     
	//    6   10:istore          4
		for(int i = 0; i < j; i++)
	//*   7   12:iconst_0        
	//*   8   13:istore_3        
	//*   9   14:iload_3         
	//*  10   15:iload           4
	//*  11   17:icmpge          37
			Preconditions.checkNotNull(((Object) (agoogleapi[i])), "Requested API must not be null.");
	//   12   20:aload_2         
	//   13   21:iload_3         
	//   14   22:aaload          
	//   15   23:ldc2            #398 <String "Requested API must not be null.">
	//   16   26:invokestatic    #402 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   17   29:pop             

	//   18   30:iload_3         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:istore_3        
	//*  22   34:goto            14
		ArrayList arraylist = new ArrayList(agoogleapi.length + 1);
	//   23   37:new             #404 <Class ArrayList>
	//   24   40:dup             
	//   25   41:aload_2         
	//   26   42:arraylength     
	//   27   43:iconst_1        
	//   28   44:iadd            
	//   29   45:invokespecial   #407 <Method void ArrayList(int)>
	//   30   48:astore          5
		((List) (arraylist)).add(((Object) (googleapi)));
	//   31   50:aload           5
	//   32   52:aload_1         
	//   33   53:invokeinterface #412 <Method boolean List.add(Object)>
	//   34   58:pop             
		((List) (arraylist)).addAll(((java.util.Collection) (Arrays.asList(((Object []) (agoogleapi))))));
	//   35   59:aload           5
	//   36   61:aload_2         
	//   37   62:invokestatic    #418 <Method List Arrays.asList(Object[])>
	//   38   65:invokeinterface #422 <Method boolean List.addAll(java.util.Collection)>
	//   39   70:pop             
		return GoogleApiManager.zzbf().zza(((Iterable) (arraylist)));
	//   40   71:invokestatic    #428 <Method GoogleApiManager GoogleApiManager.zzbf()>
	//   41   74:aload           5
	//   42   76:invokevirtual   #431 <Method Task GoogleApiManager.zza(Iterable)>
	//   43   79:areturn         
	}

	public int getApkVersion(Context context)
	{
		return super.getApkVersion(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #436 <Method int GoogleApiAvailabilityLight.getApkVersion(Context)>
	//    3    5:ireturn         
	}

	public int getClientVersion(Context context)
	{
		return super.getClientVersion(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #439 <Method int GoogleApiAvailabilityLight.getClientVersion(Context)>
	//    3    5:ireturn         
	}

	public Dialog getErrorDialog(Activity activity, int i, int j)
	{
		return getErrorDialog(activity, i, j, ((android.content.DialogInterface.OnCancelListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #444 <Method Dialog getErrorDialog(Activity, int, int, android.content.DialogInterface$OnCancelListener)>
	//    6    8:areturn         
	}

	public Dialog getErrorDialog(Activity activity, int i, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		return zza(((Context) (activity)), i, DialogRedirect.getInstance(activity, ((GoogleApiAvailabilityLight)this).getErrorResolutionIntent(((Context) (activity)), i, "d"), j), oncancellistener);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:aload_1         
	//    5    5:iload_2         
	//    6    6:ldc2            #446 <String "d">
	//    7    9:invokevirtual   #450 <Method Intent GoogleApiAvailabilityLight.getErrorResolutionIntent(Context, int, String)>
	//    8   12:iload_3         
	//    9   13:invokestatic    #455 <Method DialogRedirect DialogRedirect.getInstance(Activity, Intent, int)>
	//   10   16:aload           4
	//   11   18:invokestatic    #457 <Method Dialog zza(Context, int, DialogRedirect, android.content.DialogInterface$OnCancelListener)>
	//   12   21:areturn         
	}

	public Intent getErrorResolutionIntent(int i)
	{
		return super.getErrorResolutionIntent(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #462 <Method Intent GoogleApiAvailabilityLight.getErrorResolutionIntent(int)>
	//    3    5:areturn         
	}

	public Intent getErrorResolutionIntent(Context context, int i, String s)
	{
		return super.getErrorResolutionIntent(context, i, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #450 <Method Intent GoogleApiAvailabilityLight.getErrorResolutionIntent(Context, int, String)>
	//    5    7:areturn         
	}

	public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int j)
	{
		return super.getErrorResolutionPendingIntent(context, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #468 <Method PendingIntent GoogleApiAvailabilityLight.getErrorResolutionPendingIntent(Context, int, int)>
	//    5    7:areturn         
	}

	public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int j, String s)
	{
		return super.getErrorResolutionPendingIntent(context, i, j, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #471 <Method PendingIntent GoogleApiAvailabilityLight.getErrorResolutionPendingIntent(Context, int, int, String)>
	//    6    9:areturn         
	}

	public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionresult)
	{
		if(connectionresult.hasResolution())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #477 <Method boolean ConnectionResult.hasResolution()>
	//*   2    4:ifeq            12
			return connectionresult.getResolution();
	//    3    7:aload_2         
	//    4    8:invokevirtual   #481 <Method PendingIntent ConnectionResult.getResolution()>
	//    5   11:areturn         
		else
			return ((GoogleApiAvailabilityLight)this).getErrorResolutionPendingIntent(context, connectionresult.getErrorCode(), 0);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #485 <Method int ConnectionResult.getErrorCode()>
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #468 <Method PendingIntent GoogleApiAvailabilityLight.getErrorResolutionPendingIntent(Context, int, int)>
	//   12   22:areturn         
	}

	public final String getErrorString(int i)
	{
		return super.getErrorString(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #488 <Method String GoogleApiAvailabilityLight.getErrorString(int)>
	//    3    5:areturn         
	}

	public int isGooglePlayServicesAvailable(Context context)
	{
		return super.isGooglePlayServicesAvailable(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #491 <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context)>
	//    3    5:ireturn         
	}

	public int isGooglePlayServicesAvailable(Context context, int i)
	{
		return super.isGooglePlayServicesAvailable(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #494 <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context, int)>
	//    4    6:ireturn         
	}

	public boolean isPlayServicesPossiblyUpdating(Context context, int i)
	{
		return super.isPlayServicesPossiblyUpdating(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #498 <Method boolean GoogleApiAvailabilityLight.isPlayServicesPossiblyUpdating(Context, int)>
	//    4    6:ireturn         
	}

	public boolean isPlayStorePossiblyUpdating(Context context, int i)
	{
		return super.isPlayStorePossiblyUpdating(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #501 <Method boolean GoogleApiAvailabilityLight.isPlayStorePossiblyUpdating(Context, int)>
	//    4    6:ireturn         
	}

	public final boolean isUserResolvableError(int i)
	{
		return super.isUserResolvableError(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #505 <Method boolean GoogleApiAvailabilityLight.isUserResolvableError(int)>
	//    3    5:ireturn         
	}

	public Task makeGooglePlayServicesAvailable(Activity activity)
	{
		Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
	//    0    0:ldc2            #510 <String "makeGooglePlayServicesAvailable must be called from the main thread">
	//    1    3:invokestatic    #514 <Method void Preconditions.checkMainThread(String)>
		int i = ((GoogleApiAvailabilityLight)this).isGooglePlayServicesAvailable(((Context) (activity)));
	//    2    6:aload_0         
	//    3    7:aload_1         
	//    4    8:invokevirtual   #491 <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context)>
	//    5   11:istore_2        
		if(i == 0)
	//*   6   12:iload_2         
	//*   7   13:ifne            21
		{
			return Tasks.forResult(((Object) (null)));
	//    8   16:aconst_null     
	//    9   17:invokestatic    #520 <Method Task Tasks.forResult(Object)>
	//   10   20:areturn         
		} else
		{
			activity = ((Activity) (zzbt.zzd(activity)));
	//   11   21:aload_1         
	//   12   22:invokestatic    #526 <Method zzbt zzbt.zzd(Activity)>
	//   13   25:astore_1        
			((zzk) (activity)).zzb(new ConnectionResult(i, ((PendingIntent) (null))), 0);
	//   14   26:aload_1         
	//   15   27:new             #474 <Class ConnectionResult>
	//   16   30:dup             
	//   17   31:iload_2         
	//   18   32:aconst_null     
	//   19   33:invokespecial   #529 <Method void ConnectionResult(int, PendingIntent)>
	//   20   36:iconst_0        
	//   21   37:invokevirtual   #534 <Method void zzk.zzb(ConnectionResult, int)>
			return ((zzbt) (activity)).getTask();
	//   22   40:aload_1         
	//   23   41:invokevirtual   #538 <Method Task zzbt.getTask()>
	//   24   44:areturn         
		}
	}

	public GooglePlayServicesUpdatedReceiver registerCallbackOnUpdate(Context context, com.google.android.gms.common.api.internal.GooglePlayServicesUpdatedReceiver.Callback callback)
	{
		IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
	//    0    0:new             #543 <Class IntentFilter>
	//    1    3:dup             
	//    2    4:ldc2            #545 <String "android.intent.action.PACKAGE_ADDED">
	//    3    7:invokespecial   #547 <Method void IntentFilter(String)>
	//    4   10:astore_3        
		intentfilter.addDataScheme("package");
	//    5   11:aload_3         
	//    6   12:ldc2            #549 <String "package">
	//    7   15:invokevirtual   #552 <Method void IntentFilter.addDataScheme(String)>
		GooglePlayServicesUpdatedReceiver googleplayservicesupdatedreceiver = new GooglePlayServicesUpdatedReceiver(callback);
	//    8   18:new             #554 <Class GooglePlayServicesUpdatedReceiver>
	//    9   21:dup             
	//   10   22:aload_2         
	//   11   23:invokespecial   #557 <Method void GooglePlayServicesUpdatedReceiver(com.google.android.gms.common.api.internal.GooglePlayServicesUpdatedReceiver$Callback)>
	//   12   26:astore          4
		context.registerReceiver(((android.content.BroadcastReceiver) (googleplayservicesupdatedreceiver)), intentfilter);
	//   13   28:aload_1         
	//   14   29:aload           4
	//   15   31:aload_3         
	//   16   32:invokevirtual   #561 <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   17   35:pop             
		googleplayservicesupdatedreceiver.zzc(context);
	//   18   36:aload           4
	//   19   38:aload_1         
	//   20   39:invokevirtual   #564 <Method void GooglePlayServicesUpdatedReceiver.zzc(Context)>
		if(!((GoogleApiAvailabilityLight)this).isUninstalledAppPossiblyUpdating(context, "com.google.android.gms"))
	//*  21   42:aload_0         
	//*  22   43:aload_1         
	//*  23   44:ldc1            #11  <String "com.google.android.gms">
	//*  24   46:invokevirtual   #568 <Method boolean GoogleApiAvailabilityLight.isUninstalledAppPossiblyUpdating(Context, String)>
	//*  25   49:ifne            63
		{
			callback.zzv();
	//   26   52:aload_2         
	//   27   53:invokevirtual   #573 <Method void com.google.android.gms.common.api.internal.GooglePlayServicesUpdatedReceiver$Callback.zzv()>
			googleplayservicesupdatedreceiver.unregister();
	//   28   56:aload           4
	//   29   58:invokevirtual   #576 <Method void GooglePlayServicesUpdatedReceiver.unregister()>
			return null;
	//   30   61:aconst_null     
	//   31   62:areturn         
		} else
		{
			return googleplayservicesupdatedreceiver;
	//   32   63:aload           4
	//   33   65:areturn         
		}
	}

	public void setDefaultNotificationChannelId(Context context, String s)
	{
		if(PlatformVersion.isAtLeastO())
	//*   0    0:invokestatic    #125 <Method boolean PlatformVersion.isAtLeastO()>
	//*   1    3:ifeq            23
			Preconditions.checkNotNull(((Object) (((NotificationManager)context.getSystemService("notification")).getNotificationChannel(s))));
	//    2    6:aload_1         
	//    3    7:ldc1            #218 <String "notification">
	//    4    9:invokevirtual   #222 <Method Object Context.getSystemService(String)>
	//    5   12:checkcast       #139 <Class NotificationManager>
	//    6   15:aload_2         
	//    7   16:invokevirtual   #143 <Method NotificationChannel NotificationManager.getNotificationChannel(String)>
	//    8   19:invokestatic    #582 <Method Object Preconditions.checkNotNull(Object)>
	//    9   22:pop             
		synchronized(mLock)
	//*  10   23:getstatic       #29  <Field Object mLock>
	//*  11   26:astore_1        
	//*  12   27:aload_1         
	//*  13   28:monitorenter    
		{
			zzat = s;
	//   14   29:aload_0         
	//   15   30:aload_2         
	//   16   31:putfield        #378 <Field String zzat>
		}
	//   17   34:aload_1         
	//   18   35:monitorexit     
		return;
	//   19   36:return          
		s;
	//   20   37:astore_2        
		context;
	//   21   38:aload_1         
		JVM INSTR monitorexit ;
	//   22   39:monitorexit     
		throw s;
	//   23   40:aload_2         
	//   24   41:athrow          
	}

	public boolean showErrorDialogFragment(Activity activity, int i, int j)
	{
		return showErrorDialogFragment(activity, i, j, ((android.content.DialogInterface.OnCancelListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #587 <Method boolean showErrorDialogFragment(Activity, int, int, android.content.DialogInterface$OnCancelListener)>
	//    6    8:ireturn         
	}

	public boolean showErrorDialogFragment(Activity activity, int i, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		Dialog dialog = getErrorDialog(activity, i, j, oncancellistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:invokevirtual   #444 <Method Dialog getErrorDialog(Activity, int, int, android.content.DialogInterface$OnCancelListener)>
	//    6    9:astore          5
		if(dialog == null)
	//*   7   11:aload           5
	//*   8   13:ifnonnull       18
		{
			return false;
	//    9   16:iconst_0        
	//   10   17:ireturn         
		} else
		{
			zza(activity, dialog, "GooglePlayServicesErrorDialog", oncancellistener);
	//   11   18:aload_1         
	//   12   19:aload           5
	//   13   21:ldc2            #589 <String "GooglePlayServicesErrorDialog">
	//   14   24:aload           4
	//   15   26:invokestatic    #591 <Method void zza(Activity, Dialog, String, android.content.DialogInterface$OnCancelListener)>
			return true;
	//   16   29:iconst_1        
	//   17   30:ireturn         
		}
	}

	public boolean showErrorDialogFragment(Activity activity, LifecycleFragment lifecyclefragment, int i, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		lifecyclefragment = ((LifecycleFragment) (zza(((Context) (activity)), i, DialogRedirect.getInstance(lifecyclefragment, ((GoogleApiAvailabilityLight)this).getErrorResolutionIntent(((Context) (activity)), i, "d"), j), oncancellistener)));
	//    0    0:aload_1         
	//    1    1:iload_3         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:aload_1         
	//    5    5:iload_3         
	//    6    6:ldc2            #446 <String "d">
	//    7    9:invokevirtual   #450 <Method Intent GoogleApiAvailabilityLight.getErrorResolutionIntent(Context, int, String)>
	//    8   12:iload           4
	//    9   14:invokestatic    #595 <Method DialogRedirect DialogRedirect.getInstance(LifecycleFragment, Intent, int)>
	//   10   17:aload           5
	//   11   19:invokestatic    #457 <Method Dialog zza(Context, int, DialogRedirect, android.content.DialogInterface$OnCancelListener)>
	//   12   22:astore_2        
		if(lifecyclefragment == null)
	//*  13   23:aload_2         
	//*  14   24:ifnonnull       29
		{
			return false;
	//   15   27:iconst_0        
	//   16   28:ireturn         
		} else
		{
			zza(activity, ((Dialog) (lifecyclefragment)), "GooglePlayServicesErrorDialog", oncancellistener);
	//   17   29:aload_1         
	//   18   30:aload_2         
	//   19   31:ldc2            #589 <String "GooglePlayServicesErrorDialog">
	//   20   34:aload           5
	//   21   36:invokestatic    #591 <Method void zza(Activity, Dialog, String, android.content.DialogInterface$OnCancelListener)>
			return true;
	//   22   39:iconst_1        
	//   23   40:ireturn         
		}
	}

	public void showErrorNotification(Context context, int i)
	{
		showErrorNotification(context, i, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #599 <Method void showErrorNotification(Context, int, String)>
	//    5    7:return          
	}

	public void showErrorNotification(Context context, int i, String s)
	{
		zza(context, i, s, ((GoogleApiAvailabilityLight)this).getErrorResolutionPendingIntent(context, i, 0, "n"));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload_0         
	//    5    5:aload_1         
	//    6    6:iload_2         
	//    7    7:iconst_0        
	//    8    8:ldc2            #601 <String "n">
	//    9   11:invokevirtual   #471 <Method PendingIntent GoogleApiAvailabilityLight.getErrorResolutionPendingIntent(Context, int, int, String)>
	//   10   14:invokespecial   #603 <Method void zza(Context, int, String, PendingIntent)>
	//   11   17:return          
	}

	public void showErrorNotification(Context context, ConnectionResult connectionresult)
	{
		PendingIntent pendingintent = getErrorResolutionPendingIntent(context, connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #606 <Method PendingIntent getErrorResolutionPendingIntent(Context, ConnectionResult)>
	//    4    6:astore_3        
		zza(context, connectionresult.getErrorCode(), ((String) (null)), pendingintent);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:invokevirtual   #485 <Method int ConnectionResult.getErrorCode()>
	//    9   13:aconst_null     
	//   10   14:aload_3         
	//   11   15:invokespecial   #603 <Method void zza(Context, int, String, PendingIntent)>
	//   12   18:return          
	}

	public Dialog showUpdatingDialog(Activity activity, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		Object obj = ((Object) (new ProgressBar(((Context) (activity)), ((android.util.AttributeSet) (null)), 0x101007a)));
	//    0    0:new             #610 <Class ProgressBar>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:ldc2            #611 <Int 0x101007a>
	//    5    9:invokespecial   #614 <Method void ProgressBar(Context, android.util.AttributeSet, int)>
	//    6   12:astore_3        
		((ProgressBar) (obj)).setIndeterminate(true);
	//    7   13:aload_3         
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #617 <Method void ProgressBar.setIndeterminate(boolean)>
		((ProgressBar) (obj)).setVisibility(0);
	//   10   18:aload_3         
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #620 <Method void ProgressBar.setVisibility(int)>
		android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((Context) (activity)));
	//   13   23:new             #79  <Class android.app.AlertDialog$Builder>
	//   14   26:dup             
	//   15   27:aload_1         
	//   16   28:invokespecial   #85  <Method void android.app.AlertDialog$Builder(Context)>
	//   17   31:astore          4
		builder.setView(((android.view.View) (obj)));
	//   18   33:aload           4
	//   19   35:aload_3         
	//   20   36:invokevirtual   #624 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setView(android.view.View)>
	//   21   39:pop             
		builder.setMessage(((CharSequence) (ConnectionErrorMessages.getErrorMessage(((Context) (activity)), 18))));
	//   22   40:aload           4
	//   23   42:aload_1         
	//   24   43:bipush          18
	//   25   45:invokestatic    #91  <Method String ConnectionErrorMessages.getErrorMessage(Context, int)>
	//   26   48:invokevirtual   #95  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   27   51:pop             
		builder.setPositiveButton("", ((android.content.DialogInterface.OnClickListener) (null)));
	//   28   52:aload           4
	//   29   54:ldc2            #626 <String "">
	//   30   57:aconst_null     
	//   31   58:invokevirtual   #106 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   32   61:pop             
		obj = ((Object) (builder.create()));
	//   33   62:aload           4
	//   34   64:invokevirtual   #116 <Method android.app.AlertDialog android.app.AlertDialog$Builder.create()>
	//   35   67:astore_3        
		zza(activity, ((Dialog) (obj)), "GooglePlayServicesUpdatingDialog", oncancellistener);
	//   36   68:aload_1         
	//   37   69:aload_3         
	//   38   70:ldc2            #628 <String "GooglePlayServicesUpdatingDialog">
	//   39   73:aload_2         
	//   40   74:invokestatic    #591 <Method void zza(Activity, Dialog, String, android.content.DialogInterface$OnCancelListener)>
		return ((Dialog) (obj));
	//   41   77:aload_3         
	//   42   78:areturn         
	}

	public boolean showWrappedErrorNotification(Context context, ConnectionResult connectionresult, int i)
	{
		PendingIntent pendingintent = getErrorResolutionPendingIntent(context, connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #606 <Method PendingIntent getErrorResolutionPendingIntent(Context, ConnectionResult)>
	//    4    6:astore          4
		if(pendingintent != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          32
		{
			zza(context, connectionresult.getErrorCode(), ((String) (null)), GoogleApiActivity.zza(context, pendingintent, i));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #485 <Method int ConnectionResult.getErrorCode()>
	//   11   19:aconst_null     
	//   12   20:aload_1         
	//   13   21:aload           4
	//   14   23:iload_3         
	//   15   24:invokestatic    #635 <Method PendingIntent GoogleApiActivity.zza(Context, PendingIntent, int)>
	//   16   27:invokespecial   #603 <Method void zza(Context, int, String, PendingIntent)>
			return true;
	//   17   30:iconst_1        
	//   18   31:ireturn         
		} else
		{
			return false;
	//   19   32:iconst_0        
	//   20   33:ireturn         
		}
	}

	final void zza(Context context)
	{
		((Handler) (new zza(context))).sendEmptyMessageDelayed(1, 0x1d4c0L);
	//    0    0:new             #6   <Class GoogleApiAvailability$zza>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #638 <Method void GoogleApiAvailability$zza(GoogleApiAvailability, Context)>
	//    5    9:iconst_1        
	//    6   10:ldc2w           #639 <Long 0x1d4c0L>
	//    7   13:invokevirtual   #646 <Method boolean Handler.sendEmptyMessageDelayed(int, long)>
	//    8   16:pop             
	//    9   17:return          
	}

	public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
	public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
	private static final Object mLock = new Object();
	private static final GoogleApiAvailability zzas = new GoogleApiAvailability();
	private String zzat;

	static 
	{
	//    0    0:new             #24  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void Object()>
	//    3    7:putstatic       #29  <Field Object mLock>
	//    4   10:new             #2   <Class GoogleApiAvailability>
	//    5   13:dup             
	//    6   14:invokespecial   #30  <Method void GoogleApiAvailability()>
	//    7   17:putstatic       #32  <Field GoogleApiAvailability zzas>
		GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
	//    8   20:getstatic       #34  <Field int GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    9   23:putstatic       #35  <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//*  10   26:return          
	}
}
