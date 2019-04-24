// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabr;
import com.google.android.gms.common.api.internal.zabu;
import com.google.android.gms.common.api.internal.zal;
import com.google.android.gms.common.internal.ConnectionErrorMessages;
import com.google.android.gms.common.internal.DialogRedirect;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.common:
//			GoogleApiAvailabilityLight, SupportErrorDialogFragment, ErrorDialogFragment, GooglePlayServicesUtilLight, 
//			zaa, ConnectionResult

public class GoogleApiAvailability extends GoogleApiAvailabilityLight
{
	private final class zaa extends com.google.android.gms.internal.base.zal
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
			int j = zaar.isGooglePlayServicesAvailable(zaaq);
		//   26   47:aload_0         
		//   27   48:getfield        #18  <Field GoogleApiAvailability zaar>
		//   28   51:aload_0         
		//   29   52:getfield        #38  <Field Context zaaq>
		//   30   55:invokevirtual   #77  <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(Context)>
		//   31   58:istore_2        
			if(zaar.isUserResolvableError(j))
		//*  32   59:aload_0         
		//*  33   60:getfield        #18  <Field GoogleApiAvailability zaar>
		//*  34   63:iload_2         
		//*  35   64:invokevirtual   #81  <Method boolean GoogleApiAvailability.isUserResolvableError(int)>
		//*  36   67:ifeq            82
				zaar.showErrorNotification(zaaq, j);
		//   37   70:aload_0         
		//   38   71:getfield        #18  <Field GoogleApiAvailability zaar>
		//   39   74:aload_0         
		//   40   75:getfield        #38  <Field Context zaaq>
		//   41   78:iload_2         
		//   42   79:invokevirtual   #85  <Method void GoogleApiAvailability.showErrorNotification(Context, int)>
		//   43   82:return          
		}

		private final Context zaaq;
		private final GoogleApiAvailability zaar;

		public zaa(Context context)
		{
			zaar = GoogleApiAvailability.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field GoogleApiAvailability zaar>
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
		//   12   24:invokespecial   #30  <Method void com.google.android.gms.internal.base.zal(Looper)>
			zaaq = context.getApplicationContext();
		//   13   27:aload_0         
		//   14   28:aload_2         
		//   15   29:invokevirtual   #36  <Method Context Context.getApplicationContext()>
		//   16   32:putfield        #38  <Field Context zaaq>
		//   17   35:return          
		}
	}


	GoogleApiAvailability()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void GoogleApiAvailabilityLight()>
	//    2    4:return          
	}

	public static GoogleApiAvailability getInstance()
	{
		return zaao;
	//    0    0:getstatic       #30  <Field GoogleApiAvailability zaao>
	//    1    3:areturn         
	}

	public static Dialog zaa(Activity activity, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		Object obj = ((Object) (new ProgressBar(((Context) (activity)), ((android.util.AttributeSet) (null)), 0x101007a)));
	//    0    0:new             #40  <Class ProgressBar>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:ldc1            #41  <Int 0x101007a>
	//    5    8:invokespecial   #44  <Method void ProgressBar(Context, android.util.AttributeSet, int)>
	//    6   11:astore_2        
		((ProgressBar) (obj)).setIndeterminate(true);
	//    7   12:aload_2         
	//    8   13:iconst_1        
	//    9   14:invokevirtual   #48  <Method void ProgressBar.setIndeterminate(boolean)>
		((ProgressBar) (obj)).setVisibility(0);
	//   10   17:aload_2         
	//   11   18:iconst_0        
	//   12   19:invokevirtual   #52  <Method void ProgressBar.setVisibility(int)>
		android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((Context) (activity)));
	//   13   22:new             #54  <Class android.app.AlertDialog$Builder>
	//   14   25:dup             
	//   15   26:aload_0         
	//   16   27:invokespecial   #57  <Method void android.app.AlertDialog$Builder(Context)>
	//   17   30:astore_3        
		builder.setView(((android.view.View) (obj)));
	//   18   31:aload_3         
	//   19   32:aload_2         
	//   20   33:invokevirtual   #61  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setView(android.view.View)>
	//   21   36:pop             
		builder.setMessage(((CharSequence) (ConnectionErrorMessages.getErrorMessage(((Context) (activity)), 18))));
	//   22   37:aload_3         
	//   23   38:aload_0         
	//   24   39:bipush          18
	//   25   41:invokestatic    #67  <Method String ConnectionErrorMessages.getErrorMessage(Context, int)>
	//   26   44:invokevirtual   #71  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   27   47:pop             
		builder.setPositiveButton("", ((android.content.DialogInterface.OnClickListener) (null)));
	//   28   48:aload_3         
	//   29   49:ldc1            #73  <String "">
	//   30   51:aconst_null     
	//   31   52:invokevirtual   #77  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   32   55:pop             
		obj = ((Object) (builder.create()));
	//   33   56:aload_3         
	//   34   57:invokevirtual   #81  <Method android.app.AlertDialog android.app.AlertDialog$Builder.create()>
	//   35   60:astore_2        
		zaa(activity, ((Dialog) (obj)), "GooglePlayServicesUpdatingDialog", oncancellistener);
	//   36   61:aload_0         
	//   37   62:aload_2         
	//   38   63:ldc1            #83  <String "GooglePlayServicesUpdatingDialog">
	//   39   65:aload_1         
	//   40   66:invokestatic    #86  <Method void zaa(Activity, Dialog, String, android.content.DialogInterface$OnCancelListener)>
		return ((Dialog) (obj));
	//   41   69:aload_2         
	//   42   70:areturn         
	}

	static Dialog zaa(Context context, int i, DialogRedirect dialogredirect, android.content.DialogInterface.OnCancelListener oncancellistener)
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
	//    6    9:new             #89  <Class TypedValue>
	//    7   12:dup             
	//    8   13:invokespecial   #90  <Method void TypedValue()>
	//    9   16:astore          5
		context.getTheme().resolveAttribute(0x1010309, ((TypedValue) (obj)), true);
	//   10   18:aload_0         
	//   11   19:invokevirtual   #96  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   12   22:ldc1            #97  <Int 0x1010309>
	//   13   24:aload           5
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #103 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   16   30:pop             
		if("Theme.Dialog.Alert".equals(((Object) (context.getResources().getResourceEntryName(((TypedValue) (obj)).resourceId)))))
	//*  17   31:ldc1            #105 <String "Theme.Dialog.Alert">
	//*  18   33:aload_0         
	//*  19   34:invokevirtual   #109 <Method Resources Context.getResources()>
	//*  20   37:aload           5
	//*  21   39:getfield        #112 <Field int TypedValue.resourceId>
	//*  22   42:invokevirtual   #118 <Method String Resources.getResourceEntryName(int)>
	//*  23   45:invokevirtual   #124 <Method boolean String.equals(Object)>
	//*  24   48:ifeq            62
			builder = new android.app.AlertDialog.Builder(context, 5);
	//   25   51:new             #54  <Class android.app.AlertDialog$Builder>
	//   26   54:dup             
	//   27   55:aload_0         
	//   28   56:iconst_5        
	//   29   57:invokespecial   #127 <Method void android.app.AlertDialog$Builder(Context, int)>
	//   30   60:astore          4
		obj = ((Object) (builder));
	//   31   62:aload           4
	//   32   64:astore          5
		if(builder == null)
	//*  33   66:aload           4
	//*  34   68:ifnonnull       81
			obj = ((Object) (new android.app.AlertDialog.Builder(context)));
	//   35   71:new             #54  <Class android.app.AlertDialog$Builder>
	//   36   74:dup             
	//   37   75:aload_0         
	//   38   76:invokespecial   #57  <Method void android.app.AlertDialog$Builder(Context)>
	//   39   79:astore          5
		((android.app.AlertDialog.Builder) (obj)).setMessage(((CharSequence) (ConnectionErrorMessages.getErrorMessage(context, i))));
	//   40   81:aload           5
	//   41   83:aload_0         
	//   42   84:iload_1         
	//   43   85:invokestatic    #67  <Method String ConnectionErrorMessages.getErrorMessage(Context, int)>
	//   44   88:invokevirtual   #71  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   45   91:pop             
		if(oncancellistener != null)
	//*  46   92:aload_3         
	//*  47   93:ifnull          103
			((android.app.AlertDialog.Builder) (obj)).setOnCancelListener(oncancellistener);
	//   48   96:aload           5
	//   49   98:aload_3         
	//   50   99:invokevirtual   #131 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
	//   51  102:pop             
		oncancellistener = ((android.content.DialogInterface.OnCancelListener) (ConnectionErrorMessages.getErrorDialogButtonMessage(context, i)));
	//   52  103:aload_0         
	//   53  104:iload_1         
	//   54  105:invokestatic    #134 <Method String ConnectionErrorMessages.getErrorDialogButtonMessage(Context, int)>
	//   55  108:astore_3        
		if(oncancellistener != null)
	//*  56  109:aload_3         
	//*  57  110:ifnull          121
			((android.app.AlertDialog.Builder) (obj)).setPositiveButton(((CharSequence) (oncancellistener)), ((android.content.DialogInterface.OnClickListener) (dialogredirect)));
	//   58  113:aload           5
	//   59  115:aload_3         
	//   60  116:aload_2         
	//   61  117:invokevirtual   #77  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   62  120:pop             
		context = ((Context) (ConnectionErrorMessages.getErrorTitle(context, i)));
	//   63  121:aload_0         
	//   64  122:iload_1         
	//   65  123:invokestatic    #137 <Method String ConnectionErrorMessages.getErrorTitle(Context, int)>
	//   66  126:astore_0        
		if(context != null)
	//*  67  127:aload_0         
	//*  68  128:ifnull          138
			((android.app.AlertDialog.Builder) (obj)).setTitle(((CharSequence) (context)));
	//   69  131:aload           5
	//   70  133:aload_0         
	//   71  134:invokevirtual   #140 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   72  137:pop             
		return ((Dialog) (((android.app.AlertDialog.Builder) (obj)).create()));
	//   73  138:aload           5
	//   74  140:invokevirtual   #81  <Method android.app.AlertDialog android.app.AlertDialog$Builder.create()>
	//   75  143:areturn         
	}

	static void zaa(Activity activity, Dialog dialog, String s, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		if(activity instanceof FragmentActivity)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #142 <Class FragmentActivity>
	//*   2    4:ifeq            26
		{
			activity = ((Activity) (((FragmentActivity)activity).getSupportFragmentManager()));
	//    3    7:aload_0         
	//    4    8:checkcast       #142 <Class FragmentActivity>
	//    5   11:invokevirtual   #146 <Method android.support.v4.app.FragmentManager FragmentActivity.getSupportFragmentManager()>
	//    6   14:astore_0        
			SupportErrorDialogFragment.newInstance(dialog, oncancellistener).show(((android.support.v4.app.FragmentManager) (activity)), s);
	//    7   15:aload_1         
	//    8   16:aload_3         
	//    9   17:invokestatic    #152 <Method SupportErrorDialogFragment SupportErrorDialogFragment.newInstance(Dialog, android.content.DialogInterface$OnCancelListener)>
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #156 <Method void SupportErrorDialogFragment.show(android.support.v4.app.FragmentManager, String)>
			return;
	//   13   25:return          
		} else
		{
			activity = ((Activity) (activity.getFragmentManager()));
	//   14   26:aload_0         
	//   15   27:invokevirtual   #162 <Method android.app.FragmentManager Activity.getFragmentManager()>
	//   16   30:astore_0        
			ErrorDialogFragment.newInstance(dialog, oncancellistener).show(((android.app.FragmentManager) (activity)), s);
	//   17   31:aload_1         
	//   18   32:aload_3         
	//   19   33:invokestatic    #167 <Method ErrorDialogFragment ErrorDialogFragment.newInstance(Dialog, android.content.DialogInterface$OnCancelListener)>
	//   20   36:aload_0         
	//   21   37:aload_2         
	//   22   38:invokevirtual   #170 <Method void ErrorDialogFragment.show(android.app.FragmentManager, String)>
			return;
	//   23   41:return          
		}
	}

	private final void zaa(Context context, int i, String s, PendingIntent pendingintent)
	{
		NotificationManager notificationmanager;
		Object obj;
		if(i == 18)
	//*   0    0:iload_2         
	//*   1    1:bipush          18
	//*   2    3:icmpne          12
		{
			zaa(context);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #176 <Method void zaa(Context)>
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
	//   12   23:ldc1            #178 <String "GoogleApiAvailability">
	//   13   25:ldc1            #180 <String "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.">
	//   14   27:invokestatic    #186 <Method int Log.w(String, String)>
	//   15   30:pop             
			return;
	//   16   31:return          
		}
		obj = ((Object) (ConnectionErrorMessages.getErrorNotificationTitle(context, i)));
	//   17   32:aload_1         
	//   18   33:iload_2         
	//   19   34:invokestatic    #189 <Method String ConnectionErrorMessages.getErrorNotificationTitle(Context, int)>
	//   20   37:astore          7
		s = ConnectionErrorMessages.getErrorNotificationMessage(context, i);
	//   21   39:aload_1         
	//   22   40:iload_2         
	//   23   41:invokestatic    #192 <Method String ConnectionErrorMessages.getErrorNotificationMessage(Context, int)>
	//   24   44:astore_3        
		Resources resources = context.getResources();
	//   25   45:aload_1         
	//   26   46:invokevirtual   #109 <Method Resources Context.getResources()>
	//   27   49:astore          5
		notificationmanager = (NotificationManager)context.getSystemService("notification");
	//   28   51:aload_1         
	//   29   52:ldc1            #194 <String "notification">
	//   30   54:invokevirtual   #198 <Method Object Context.getSystemService(String)>
	//   31   57:checkcast       #200 <Class NotificationManager>
	//   32   60:astore          6
		obj = ((Object) ((new android.support.v4.app.NotificationCompat.Builder(context)).setLocalOnly(true).setAutoCancel(true).setContentTitle(((CharSequence) (obj))).setStyle(((android.support.v4.app.NotificationCompat.Style) ((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(((CharSequence) (s))))))));
	//   33   62:new             #202 <Class android.support.v4.app.NotificationCompat$Builder>
	//   34   65:dup             
	//   35   66:aload_1         
	//   36   67:invokespecial   #203 <Method void android.support.v4.app.NotificationCompat$Builder(Context)>
	//   37   70:iconst_1        
	//   38   71:invokevirtual   #207 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setLocalOnly(boolean)>
	//   39   74:iconst_1        
	//   40   75:invokevirtual   #210 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setAutoCancel(boolean)>
	//   41   78:aload           7
	//   42   80:invokevirtual   #214 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentTitle(CharSequence)>
	//   43   83:new             #216 <Class android.support.v4.app.NotificationCompat$BigTextStyle>
	//   44   86:dup             
	//   45   87:invokespecial   #217 <Method void android.support.v4.app.NotificationCompat$BigTextStyle()>
	//   46   90:aload_3         
	//   47   91:invokevirtual   #221 <Method android.support.v4.app.NotificationCompat$BigTextStyle android.support.v4.app.NotificationCompat$BigTextStyle.bigText(CharSequence)>
	//   48   94:invokevirtual   #225 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setStyle(android.support.v4.app.NotificationCompat$Style)>
	//   49   97:astore          7
		if(DeviceProperties.isWearable(context))
	//*  50   99:aload_1         
	//*  51  100:invokestatic    #231 <Method boolean DeviceProperties.isWearable(Context)>
	//*  52  103:ifeq            169
		{
			Preconditions.checkState(PlatformVersion.isAtLeastKitKatWatch());
	//   53  106:invokestatic    #237 <Method boolean PlatformVersion.isAtLeastKitKatWatch()>
	//   54  109:invokestatic    #242 <Method void Preconditions.checkState(boolean)>
			((android.support.v4.app.NotificationCompat.Builder) (obj)).setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
	//   55  112:aload           7
	//   56  114:aload_1         
	//   57  115:invokevirtual   #246 <Method ApplicationInfo Context.getApplicationInfo()>
	//   58  118:getfield        #251 <Field int ApplicationInfo.icon>
	//   59  121:invokevirtual   #255 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setSmallIcon(int)>
	//   60  124:iconst_2        
	//   61  125:invokevirtual   #258 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setPriority(int)>
	//   62  128:pop             
			if(DeviceProperties.isWearableWithoutPlayStore(context))
	//*  63  129:aload_1         
	//*  64  130:invokestatic    #261 <Method boolean DeviceProperties.isWearableWithoutPlayStore(Context)>
	//*  65  133:ifeq            158
				((android.support.v4.app.NotificationCompat.Builder) (obj)).addAction(com.google.android.gms.base.R.drawable.common_full_open_on_phone, ((CharSequence) (resources.getString(com.google.android.gms.base.R.string.common_open_on_phone))), pendingintent);
	//   66  136:aload           7
	//   67  138:getstatic       #266 <Field int com.google.android.gms.base.R$drawable.common_full_open_on_phone>
	//   68  141:aload           5
	//   69  143:getstatic       #271 <Field int com.google.android.gms.base.R$string.common_open_on_phone>
	//   70  146:invokevirtual   #274 <Method String Resources.getString(int)>
	//   71  149:aload           4
	//   72  151:invokevirtual   #278 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.addAction(int, CharSequence, PendingIntent)>
	//   73  154:pop             
			else
	//*  74  155:goto            204
				((android.support.v4.app.NotificationCompat.Builder) (obj)).setContentIntent(pendingintent);
	//   75  158:aload           7
	//   76  160:aload           4
	//   77  162:invokevirtual   #282 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentIntent(PendingIntent)>
	//   78  165:pop             
		} else
	//*  79  166:goto            204
		{
			((android.support.v4.app.NotificationCompat.Builder) (obj)).setSmallIcon(0x108008a).setTicker(((CharSequence) (resources.getString(com.google.android.gms.base.R.string.common_google_play_services_notification_ticker)))).setWhen(System.currentTimeMillis()).setContentIntent(pendingintent).setContentText(((CharSequence) (s)));
	//   80  169:aload           7
	//   81  171:ldc2            #283 <Int 0x108008a>
	//   82  174:invokevirtual   #255 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setSmallIcon(int)>
	//   83  177:aload           5
	//   84  179:getstatic       #286 <Field int com.google.android.gms.base.R$string.common_google_play_services_notification_ticker>
	//   85  182:invokevirtual   #274 <Method String Resources.getString(int)>
	//   86  185:invokevirtual   #289 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setTicker(CharSequence)>
	//   87  188:invokestatic    #295 <Method long System.currentTimeMillis()>
	//   88  191:invokevirtual   #299 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setWhen(long)>
	//   89  194:aload           4
	//   90  196:invokevirtual   #282 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentIntent(PendingIntent)>
	//   91  199:aload_3         
	//   92  200:invokevirtual   #302 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentText(CharSequence)>
	//   93  203:pop             
		}
		if(!PlatformVersion.isAtLeastO())
			break MISSING_BLOCK_LABEL_314;
	//   94  204:invokestatic    #305 <Method boolean PlatformVersion.isAtLeastO()>
	//   95  207:ifeq            314
		Preconditions.checkState(PlatformVersion.isAtLeastO());
	//   96  210:invokestatic    #305 <Method boolean PlatformVersion.isAtLeastO()>
	//   97  213:invokestatic    #242 <Method void Preconditions.checkState(boolean)>
		pendingintent = ((PendingIntent) (zag()));
	//   98  216:aload_0         
	//   99  217:invokespecial   #309 <Method String zag()>
	//  100  220:astore          4
		s = ((String) (pendingintent));
	//  101  222:aload           4
	//  102  224:astore_3        
		if(pendingintent != null) goto _L2; else goto _L1
	//  103  225:aload           4
	//  104  227:ifnonnull       307
_L1:
		NotificationChannel notificationchannel;
		pendingintent = "com.google.android.gms.availability";
	//  105  230:ldc2            #311 <String "com.google.android.gms.availability">
	//  106  233:astore          4
		notificationchannel = notificationmanager.getNotificationChannel("com.google.android.gms.availability");
	//  107  235:aload           6
	//  108  237:ldc2            #311 <String "com.google.android.gms.availability">
	//  109  240:invokevirtual   #315 <Method NotificationChannel NotificationManager.getNotificationChannel(String)>
	//  110  243:astore          5
		context = ((Context) (ConnectionErrorMessages.getDefaultNotificationChannelName(context)));
	//  111  245:aload_1         
	//  112  246:invokestatic    #319 <Method String ConnectionErrorMessages.getDefaultNotificationChannelName(Context)>
	//  113  249:astore_1        
		if(notificationchannel != null) goto _L4; else goto _L3
	//  114  250:aload           5
	//  115  252:ifnonnull       280
_L3:
		context = ((Context) (new NotificationChannel("com.google.android.gms.availability", ((CharSequence) (context)), 4)));
	//  116  255:new             #321 <Class NotificationChannel>
	//  117  258:dup             
	//  118  259:ldc2            #311 <String "com.google.android.gms.availability">
	//  119  262:aload_1         
	//  120  263:iconst_4        
	//  121  264:invokespecial   #324 <Method void NotificationChannel(String, CharSequence, int)>
	//  122  267:astore_1        
_L5:
		notificationmanager.createNotificationChannel(((NotificationChannel) (context)));
	//  123  268:aload           6
	//  124  270:aload_1         
	//  125  271:invokevirtual   #328 <Method void NotificationManager.createNotificationChannel(NotificationChannel)>
		s = ((String) (pendingintent));
	//  126  274:aload           4
	//  127  276:astore_3        
		break; /* Loop/switch isn't completed */
	//  128  277:goto            307
_L4:
		s = ((String) (pendingintent));
	//  129  280:aload           4
	//  130  282:astore_3        
		if(((String) (context)).equals(((Object) (notificationchannel.getName()))))
			break; /* Loop/switch isn't completed */
	//  131  283:aload_1         
	//  132  284:aload           5
	//  133  286:invokevirtual   #332 <Method CharSequence NotificationChannel.getName()>
	//  134  289:invokevirtual   #124 <Method boolean String.equals(Object)>
	//  135  292:ifne            307
		notificationchannel.setName(((CharSequence) (context)));
	//  136  295:aload           5
	//  137  297:aload_1         
	//  138  298:invokevirtual   #336 <Method void NotificationChannel.setName(CharSequence)>
		context = ((Context) (notificationchannel));
	//  139  301:aload           5
	//  140  303:astore_1        
		if(true) goto _L5; else goto _L2
	//  141  304:goto            268
_L2:
		((android.support.v4.app.NotificationCompat.Builder) (obj)).setChannelId(s);
	//  142  307:aload           7
	//  143  309:aload_3         
	//  144  310:invokevirtual   #340 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setChannelId(String)>
	//  145  313:pop             
		context = ((Context) (((android.support.v4.app.NotificationCompat.Builder) (obj)).build()));
	//  146  314:aload           7
	//  147  316:invokevirtual   #344 <Method android.app.Notification android.support.v4.app.NotificationCompat$Builder.build()>
	//  148  319:astore_1        
		switch(i)
	//* 149  320:iload_2         
		{
	//* 150  321:tableswitch     1 3: default 348
	//	               1 355
	//	               2 355
	//	               3 355
		default:
			i = 39789;
	//  151  348:ldc2            #345 <Int 39789>
	//  152  351:istore_2        
			break;

	//* 153  352:goto            366
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
			i = 10436;
	//  154  355:sipush          10436
	//  155  358:istore_2        
			GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
	//  156  359:getstatic       #351 <Field AtomicBoolean GooglePlayServicesUtilLight.sCanceledAvailabilityNotification>
	//  157  362:iconst_0        
	//  158  363:invokevirtual   #356 <Method void AtomicBoolean.set(boolean)>
			break;
		}
		notificationmanager.notify(i, ((android.app.Notification) (context)));
	//  159  366:aload           6
	//  160  368:iload_2         
	//  161  369:aload_1         
	//  162  370:invokevirtual   #360 <Method void NotificationManager.notify(int, android.app.Notification)>
		return;
	//  163  373:return          
	}

	private final String zag()
	{
		String s;
		synchronized(mLock)
	//*   0    0:getstatic       #27  <Field Object mLock>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			s = zaap;
	//    4    6:aload_0         
	//    5    7:getfield        #363 <Field String zaap>
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
		Preconditions.checkNotNull(((Object) (googleapi)), "Requested API must not be null.");
	//    0    0:aload_1         
	//    1    1:ldc2            #367 <String "Requested API must not be null.">
	//    2    4:invokestatic    #371 <Method Object Preconditions.checkNotNull(Object, Object)>
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
	//   15   23:ldc2            #367 <String "Requested API must not be null.">
	//   16   26:invokestatic    #371 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   17   29:pop             

	//   18   30:iload_3         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:istore_3        
	//*  22   34:goto            14
		ArrayList arraylist = new ArrayList(agoogleapi.length + 1);
	//   23   37:new             #373 <Class ArrayList>
	//   24   40:dup             
	//   25   41:aload_2         
	//   26   42:arraylength     
	//   27   43:iconst_1        
	//   28   44:iadd            
	//   29   45:invokespecial   #375 <Method void ArrayList(int)>
	//   30   48:astore          5
		((List) (arraylist)).add(((Object) (googleapi)));
	//   31   50:aload           5
	//   32   52:aload_1         
	//   33   53:invokeinterface #380 <Method boolean List.add(Object)>
	//   34   58:pop             
		((List) (arraylist)).addAll(((java.util.Collection) (Arrays.asList(((Object []) (agoogleapi))))));
	//   35   59:aload           5
	//   36   61:aload_2         
	//   37   62:invokestatic    #386 <Method List Arrays.asList(Object[])>
	//   38   65:invokeinterface #390 <Method boolean List.addAll(java.util.Collection)>
	//   39   70:pop             
		return GoogleApiManager.zabc().zaa(((Iterable) (arraylist))).continueWith(((com.google.android.gms.tasks.Continuation) (new com.google.android.gms.common.zaa(this))));
	//   40   71:invokestatic    #396 <Method GoogleApiManager GoogleApiManager.zabc()>
	//   41   74:aload           5
	//   42   76:invokevirtual   #399 <Method Task GoogleApiManager.zaa(Iterable)>
	//   43   79:new             #401 <Class zaa>
	//   44   82:dup             
	//   45   83:aload_0         
	//   46   84:invokespecial   #404 <Method void zaa(GoogleApiAvailability)>
	//   47   87:invokevirtual   #410 <Method Task Task.continueWith(com.google.android.gms.tasks.Continuation)>
	//   48   90:areturn         
	}

	public int getClientVersion(Context context)
	{
		return super.getClientVersion(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #418 <Method int GoogleApiAvailabilityLight.getClientVersion(Context)>
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
	//    5    5:invokevirtual   #423 <Method Dialog getErrorDialog(Activity, int, int, android.content.DialogInterface$OnCancelListener)>
	//    6    8:areturn         
	}

	public Dialog getErrorDialog(Activity activity, int i, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		return zaa(((Context) (activity)), i, DialogRedirect.getInstance(activity, getErrorResolutionIntent(((Context) (activity)), i, "d"), j), oncancellistener);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:aload_1         
	//    5    5:iload_2         
	//    6    6:ldc2            #425 <String "d">
	//    7    9:invokevirtual   #429 <Method Intent getErrorResolutionIntent(Context, int, String)>
	//    8   12:iload_3         
	//    9   13:invokestatic    #434 <Method DialogRedirect DialogRedirect.getInstance(Activity, Intent, int)>
	//   10   16:aload           4
	//   11   18:invokestatic    #436 <Method Dialog zaa(Context, int, DialogRedirect, android.content.DialogInterface$OnCancelListener)>
	//   12   21:areturn         
	}

	public Intent getErrorResolutionIntent(Context context, int i, String s)
	{
		return super.getErrorResolutionIntent(context, i, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #437 <Method Intent GoogleApiAvailabilityLight.getErrorResolutionIntent(Context, int, String)>
	//    5    7:areturn         
	}

	public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int j)
	{
		return super.getErrorResolutionPendingIntent(context, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #441 <Method PendingIntent GoogleApiAvailabilityLight.getErrorResolutionPendingIntent(Context, int, int)>
	//    5    7:areturn         
	}

	public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionresult)
	{
		if(connectionresult.hasResolution())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #447 <Method boolean ConnectionResult.hasResolution()>
	//*   2    4:ifeq            12
			return connectionresult.getResolution();
	//    3    7:aload_2         
	//    4    8:invokevirtual   #451 <Method PendingIntent ConnectionResult.getResolution()>
	//    5   11:areturn         
		else
			return getErrorResolutionPendingIntent(context, connectionresult.getErrorCode(), 0);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #455 <Method int ConnectionResult.getErrorCode()>
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #456 <Method PendingIntent getErrorResolutionPendingIntent(Context, int, int)>
	//   12   22:areturn         
	}

	public final String getErrorString(int i)
	{
		return super.getErrorString(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #459 <Method String GoogleApiAvailabilityLight.getErrorString(int)>
	//    3    5:areturn         
	}

	public int isGooglePlayServicesAvailable(Context context)
	{
		return super.isGooglePlayServicesAvailable(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #463 <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context)>
	//    3    5:ireturn         
	}

	public int isGooglePlayServicesAvailable(Context context, int i)
	{
		return super.isGooglePlayServicesAvailable(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #466 <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context, int)>
	//    4    6:ireturn         
	}

	public final boolean isUserResolvableError(int i)
	{
		return super.isUserResolvableError(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #470 <Method boolean GoogleApiAvailabilityLight.isUserResolvableError(int)>
	//    3    5:ireturn         
	}

	public Task makeGooglePlayServicesAvailable(Activity activity)
	{
		int i = GOOGLE_PLAY_SERVICES_VERSION_CODE;
	//    0    0:getstatic       #33  <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    1    3:istore_2        
		Preconditions.checkMainThread("makeGooglePlayServicesAvailable must be called from the main thread");
	//    2    4:ldc2            #474 <String "makeGooglePlayServicesAvailable must be called from the main thread">
	//    3    7:invokestatic    #478 <Method void Preconditions.checkMainThread(String)>
		i = isGooglePlayServicesAvailable(((Context) (activity)), i);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:invokevirtual   #479 <Method int isGooglePlayServicesAvailable(Context, int)>
	//    8   16:istore_2        
		if(i == 0)
	//*   9   17:iload_2         
	//*  10   18:ifne            26
		{
			return Tasks.forResult(((Object) (null)));
	//   11   21:aconst_null     
	//   12   22:invokestatic    #485 <Method Task Tasks.forResult(Object)>
	//   13   25:areturn         
		} else
		{
			activity = ((Activity) (zabu.zac(activity)));
	//   14   26:aload_1         
	//   15   27:invokestatic    #491 <Method zabu zabu.zac(Activity)>
	//   16   30:astore_1        
			((zal) (activity)).zab(new ConnectionResult(i, ((PendingIntent) (null))), 0);
	//   17   31:aload_1         
	//   18   32:new             #444 <Class ConnectionResult>
	//   19   35:dup             
	//   20   36:iload_2         
	//   21   37:aconst_null     
	//   22   38:invokespecial   #494 <Method void ConnectionResult(int, PendingIntent)>
	//   23   41:iconst_0        
	//   24   42:invokevirtual   #500 <Method void zal.zab(ConnectionResult, int)>
			return ((zabu) (activity)).getTask();
	//   25   45:aload_1         
	//   26   46:invokevirtual   #504 <Method Task zabu.getTask()>
	//   27   49:areturn         
		}
	}

	public void setDefaultNotificationChannelId(Context context, String s)
	{
		if(PlatformVersion.isAtLeastO())
	//*   0    0:invokestatic    #305 <Method boolean PlatformVersion.isAtLeastO()>
	//*   1    3:ifeq            23
			Preconditions.checkNotNull(((Object) (((NotificationManager)context.getSystemService("notification")).getNotificationChannel(s))));
	//    2    6:aload_1         
	//    3    7:ldc1            #194 <String "notification">
	//    4    9:invokevirtual   #198 <Method Object Context.getSystemService(String)>
	//    5   12:checkcast       #200 <Class NotificationManager>
	//    6   15:aload_2         
	//    7   16:invokevirtual   #315 <Method NotificationChannel NotificationManager.getNotificationChannel(String)>
	//    8   19:invokestatic    #511 <Method Object Preconditions.checkNotNull(Object)>
	//    9   22:pop             
		synchronized(mLock)
	//*  10   23:getstatic       #27  <Field Object mLock>
	//*  11   26:astore_1        
	//*  12   27:aload_1         
	//*  13   28:monitorenter    
		{
			zaap = s;
	//   14   29:aload_0         
	//   15   30:aload_2         
	//   16   31:putfield        #363 <Field String zaap>
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
	//    5    5:invokevirtual   #516 <Method boolean showErrorDialogFragment(Activity, int, int, android.content.DialogInterface$OnCancelListener)>
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
	//    5    6:invokevirtual   #423 <Method Dialog getErrorDialog(Activity, int, int, android.content.DialogInterface$OnCancelListener)>
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
			zaa(activity, dialog, "GooglePlayServicesErrorDialog", oncancellistener);
	//   11   18:aload_1         
	//   12   19:aload           5
	//   13   21:ldc2            #518 <String "GooglePlayServicesErrorDialog">
	//   14   24:aload           4
	//   15   26:invokestatic    #86  <Method void zaa(Activity, Dialog, String, android.content.DialogInterface$OnCancelListener)>
			return true;
	//   16   29:iconst_1        
	//   17   30:ireturn         
		}
	}

	public void showErrorNotification(Context context, int i)
	{
		zaa(context, i, ((String) (null)), ((GoogleApiAvailabilityLight)this).getErrorResolutionPendingIntent(context, i, 0, "n"));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:aload_0         
	//    5    5:aload_1         
	//    6    6:iload_2         
	//    7    7:iconst_0        
	//    8    8:ldc2            #521 <String "n">
	//    9   11:invokevirtual   #524 <Method PendingIntent GoogleApiAvailabilityLight.getErrorResolutionPendingIntent(Context, int, int, String)>
	//   10   14:invokespecial   #526 <Method void zaa(Context, int, String, PendingIntent)>
	//   11   17:return          
	}

	public void showErrorNotification(Context context, ConnectionResult connectionresult)
	{
		PendingIntent pendingintent = getErrorResolutionPendingIntent(context, connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #529 <Method PendingIntent getErrorResolutionPendingIntent(Context, ConnectionResult)>
	//    4    6:astore_3        
		zaa(context, connectionresult.getErrorCode(), ((String) (null)), pendingintent);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:invokevirtual   #455 <Method int ConnectionResult.getErrorCode()>
	//    9   13:aconst_null     
	//   10   14:aload_3         
	//   11   15:invokespecial   #526 <Method void zaa(Context, int, String, PendingIntent)>
	//   12   18:return          
	}

	public final zabq zaa(Context context, zabr zabr1)
	{
		IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
	//    0    0:new             #532 <Class IntentFilter>
	//    1    3:dup             
	//    2    4:ldc2            #534 <String "android.intent.action.PACKAGE_ADDED">
	//    3    7:invokespecial   #536 <Method void IntentFilter(String)>
	//    4   10:astore_3        
		intentfilter.addDataScheme("package");
	//    5   11:aload_3         
	//    6   12:ldc2            #538 <String "package">
	//    7   15:invokevirtual   #541 <Method void IntentFilter.addDataScheme(String)>
		zabq zabq1 = new zabq(zabr1);
	//    8   18:new             #543 <Class zabq>
	//    9   21:dup             
	//   10   22:aload_2         
	//   11   23:invokespecial   #546 <Method void zabq(zabr)>
	//   12   26:astore          4
		context.registerReceiver(((android.content.BroadcastReceiver) (zabq1)), intentfilter);
	//   13   28:aload_1         
	//   14   29:aload           4
	//   15   31:aload_3         
	//   16   32:invokevirtual   #550 <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   17   35:pop             
		zabq1.zac(context);
	//   18   36:aload           4
	//   19   38:aload_1         
	//   20   39:invokevirtual   #552 <Method void zabq.zac(Context)>
		if(!isUninstalledAppPossiblyUpdating(context, "com.google.android.gms"))
	//*  21   42:aload_0         
	//*  22   43:aload_1         
	//*  23   44:ldc1            #11  <String "com.google.android.gms">
	//*  24   46:invokevirtual   #556 <Method boolean isUninstalledAppPossiblyUpdating(Context, String)>
	//*  25   49:ifne            63
		{
			zabr1.zas();
	//   26   52:aload_2         
	//   27   53:invokevirtual   #561 <Method void zabr.zas()>
			zabq1.unregister();
	//   28   56:aload           4
	//   29   58:invokevirtual   #564 <Method void zabq.unregister()>
			return null;
	//   30   61:aconst_null     
	//   31   62:areturn         
		} else
		{
			return zabq1;
	//   32   63:aload           4
	//   33   65:areturn         
		}
	}

	final void zaa(Context context)
	{
		((Handler) (new zaa(context))).sendEmptyMessageDelayed(1, 0x1d4c0L);
	//    0    0:new             #6   <Class GoogleApiAvailability$zaa>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #567 <Method void GoogleApiAvailability$zaa(GoogleApiAvailability, Context)>
	//    5    9:iconst_1        
	//    6   10:ldc2w           #568 <Long 0x1d4c0L>
	//    7   13:invokevirtual   #575 <Method boolean Handler.sendEmptyMessageDelayed(int, long)>
	//    8   16:pop             
	//    9   17:return          
	}

	public final boolean zaa(Activity activity, LifecycleFragment lifecyclefragment, int i, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		lifecyclefragment = ((LifecycleFragment) (zaa(((Context) (activity)), i, DialogRedirect.getInstance(lifecyclefragment, getErrorResolutionIntent(((Context) (activity)), i, "d"), 2), oncancellistener)));
	//    0    0:aload_1         
	//    1    1:iload_3         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:aload_1         
	//    5    5:iload_3         
	//    6    6:ldc2            #425 <String "d">
	//    7    9:invokevirtual   #429 <Method Intent getErrorResolutionIntent(Context, int, String)>
	//    8   12:iconst_2        
	//    9   13:invokestatic    #579 <Method DialogRedirect DialogRedirect.getInstance(LifecycleFragment, Intent, int)>
	//   10   16:aload           5
	//   11   18:invokestatic    #436 <Method Dialog zaa(Context, int, DialogRedirect, android.content.DialogInterface$OnCancelListener)>
	//   12   21:astore_2        
		if(lifecyclefragment == null)
	//*  13   22:aload_2         
	//*  14   23:ifnonnull       28
		{
			return false;
	//   15   26:iconst_0        
	//   16   27:ireturn         
		} else
		{
			zaa(activity, ((Dialog) (lifecyclefragment)), "GooglePlayServicesErrorDialog", oncancellistener);
	//   17   28:aload_1         
	//   18   29:aload_2         
	//   19   30:ldc2            #518 <String "GooglePlayServicesErrorDialog">
	//   20   33:aload           5
	//   21   35:invokestatic    #86  <Method void zaa(Activity, Dialog, String, android.content.DialogInterface$OnCancelListener)>
			return true;
	//   22   38:iconst_1        
	//   23   39:ireturn         
		}
	}

	public final boolean zaa(Context context, ConnectionResult connectionresult, int i)
	{
		PendingIntent pendingintent = getErrorResolutionPendingIntent(context, connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #529 <Method PendingIntent getErrorResolutionPendingIntent(Context, ConnectionResult)>
	//    4    6:astore          4
		if(pendingintent != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          32
		{
			zaa(context, connectionresult.getErrorCode(), ((String) (null)), GoogleApiActivity.zaa(context, pendingintent, i));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #455 <Method int ConnectionResult.getErrorCode()>
	//   11   19:aconst_null     
	//   12   20:aload_1         
	//   13   21:aload           4
	//   14   23:iload_3         
	//   15   24:invokestatic    #585 <Method PendingIntent GoogleApiActivity.zaa(Context, PendingIntent, int)>
	//   16   27:invokespecial   #526 <Method void zaa(Context, int, String, PendingIntent)>
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

	public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
	public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
	private static final Object mLock = new Object();
	private static final GoogleApiAvailability zaao = new GoogleApiAvailability();
	private String zaap;

	static 
	{
	//    0    0:new             #22  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void Object()>
	//    3    7:putstatic       #27  <Field Object mLock>
	//    4   10:new             #2   <Class GoogleApiAvailability>
	//    5   13:dup             
	//    6   14:invokespecial   #28  <Method void GoogleApiAvailability()>
	//    7   17:putstatic       #30  <Field GoogleApiAvailability zaao>
		GOOGLE_PLAY_SERVICES_VERSION_CODE = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
	//    8   20:getstatic       #32  <Field int GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    9   23:putstatic       #33  <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//*  10   26:return          
	}
}
