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
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzh;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.util.zzj;
import com.google.android.gms.common.util.zzt;
import com.google.android.gms.internal.*;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.common:
//			zze, ConnectionResult, SupportErrorDialogFragment, ErrorDialogFragment, 
//			zzg

public class GoogleApiAvailability extends zze
{
	class zza extends Handler
	{

		public void handleMessage(Message message)
		{
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #47  <Field int Message.what>
			{
		//*   2    4:lookupswitch    1: default 24
		//		               1: 27
		//*   3   24:goto            63
			case 1: // '\001'
				int i = zzayn.isGooglePlayServicesAvailable(zzwi);
		//    4   27:aload_0         
		//    5   28:getfield        #18  <Field GoogleApiAvailability zzayn>
		//    6   31:aload_0         
		//    7   32:getfield        #38  <Field Context zzwi>
		//    8   35:invokevirtual   #51  <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(Context)>
		//    9   38:istore_2        
				if(zzayn.isUserResolvableError(i))
		//*  10   39:aload_0         
		//*  11   40:getfield        #18  <Field GoogleApiAvailability zzayn>
		//*  12   43:iload_2         
		//*  13   44:invokevirtual   #55  <Method boolean GoogleApiAvailability.isUserResolvableError(int)>
		//*  14   47:ifeq            95
				{
					zzayn.showErrorNotification(zzwi, i);
		//   15   50:aload_0         
		//   16   51:getfield        #18  <Field GoogleApiAvailability zzayn>
		//   17   54:aload_0         
		//   18   55:getfield        #38  <Field Context zzwi>
		//   19   58:iload_2         
		//   20   59:invokevirtual   #59  <Method void GoogleApiAvailability.showErrorNotification(Context, int)>
					return;
		//   21   62:return          
				}
				break;

			default:
				int j = message.what;
		//   22   63:aload_1         
		//   23   64:getfield        #47  <Field int Message.what>
		//   24   67:istore_2        
				Log.w("GoogleApiAvailability", (new StringBuilder(50)).append("Don't know how to handle this message: ").append(j).toString());
		//   25   68:ldc1            #61  <String "GoogleApiAvailability">
		//   26   70:new             #63  <Class StringBuilder>
		//   27   73:dup             
		//   28   74:bipush          50
		//   29   76:invokespecial   #66  <Method void StringBuilder(int)>
		//   30   79:ldc1            #68  <String "Don't know how to handle this message: ">
		//   31   81:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//   32   84:iload_2         
		//   33   85:invokevirtual   #75  <Method StringBuilder StringBuilder.append(int)>
		//   34   88:invokevirtual   #79  <Method String StringBuilder.toString()>
		//   35   91:invokestatic    #85  <Method int Log.w(String, String)>
		//   36   94:pop             
				break;
			}
		//   37   95:return          
		}

		final GoogleApiAvailability zzayn;
		private final Context zzwi;

		public zza(Context context)
		{
			zzayn = GoogleApiAvailability.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field GoogleApiAvailability zzayn>
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
			zzwi = context.getApplicationContext();
		//   13   27:aload_0         
		//   14   28:aload_2         
		//   15   29:invokevirtual   #36  <Method Context Context.getApplicationContext()>
		//   16   32:putfield        #38  <Field Context zzwi>
		//   17   35:return          
		}
	}


	GoogleApiAvailability()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void zze()>
	//    2    4:return          
	}

	public static GoogleApiAvailability getInstance()
	{
		return zzaym;
	//    0    0:getstatic       #22  <Field GoogleApiAvailability zzaym>
	//    1    3:areturn         
	}

	public Dialog getErrorDialog(Activity activity, int i, int j)
	{
		return getErrorDialog(activity, i, j, ((android.content.DialogInterface.OnCancelListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #34  <Method Dialog getErrorDialog(Activity, int, int, android.content.DialogInterface$OnCancelListener)>
	//    6    8:areturn         
	}

	public Dialog getErrorDialog(Activity activity, int i, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		return zza(((Context) (activity)), i, zzi.zza(activity, zzb(((Context) (activity)), i, "d"), j), oncancellistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_1         
	//    4    4:aload_0         
	//    5    5:aload_1         
	//    6    6:iload_2         
	//    7    7:ldc1            #36  <String "d">
	//    8    9:invokevirtual   #40  <Method Intent zzb(Context, int, String)>
	//    9   12:iload_3         
	//   10   13:invokestatic    #45  <Method zzi zzi.zza(Activity, Intent, int)>
	//   11   16:aload           4
	//   12   18:invokevirtual   #48  <Method Dialog zza(Context, int, zzi, android.content.DialogInterface$OnCancelListener)>
	//   13   21:areturn         
	}

	public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int j)
	{
		return super.getErrorResolutionPendingIntent(context, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #53  <Method PendingIntent zze.getErrorResolutionPendingIntent(Context, int, int)>
	//    5    7:areturn         
	}

	public PendingIntent getErrorResolutionPendingIntent(Context context, ConnectionResult connectionresult)
	{
		if(connectionresult.hasResolution())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #61  <Method boolean ConnectionResult.hasResolution()>
	//*   2    4:ifeq            12
			return connectionresult.getResolution();
	//    3    7:aload_2         
	//    4    8:invokevirtual   #65  <Method PendingIntent ConnectionResult.getResolution()>
	//    5   11:areturn         
		else
			return getErrorResolutionPendingIntent(context, connectionresult.getErrorCode(), 0);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokevirtual   #69  <Method int ConnectionResult.getErrorCode()>
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #70  <Method PendingIntent getErrorResolutionPendingIntent(Context, int, int)>
	//   12   22:areturn         
	}

	public final String getErrorString(int i)
	{
		return super.getErrorString(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #74  <Method String zze.getErrorString(int)>
	//    3    5:areturn         
	}

	public String getOpenSourceSoftwareLicenseInfo(Context context)
	{
		return super.getOpenSourceSoftwareLicenseInfo(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #78  <Method String zze.getOpenSourceSoftwareLicenseInfo(Context)>
	//    3    5:areturn         
	}

	public int isGooglePlayServicesAvailable(Context context)
	{
		return super.isGooglePlayServicesAvailable(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #82  <Method int zze.isGooglePlayServicesAvailable(Context)>
	//    3    5:ireturn         
	}

	public final boolean isUserResolvableError(int i)
	{
		return super.isUserResolvableError(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #86  <Method boolean zze.isUserResolvableError(int)>
	//    3    5:ireturn         
	}

	public Task makeGooglePlayServicesAvailable(Activity activity)
	{
		zzac.zzdj("makeGooglePlayServicesAvailable must be called from the main thread");
	//    0    0:ldc1            #91  <String "makeGooglePlayServicesAvailable must be called from the main thread">
	//    1    2:invokestatic    #97  <Method void zzac.zzdj(String)>
		int i = isGooglePlayServicesAvailable(((Context) (activity)));
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:invokevirtual   #98  <Method int isGooglePlayServicesAvailable(Context)>
	//    5   10:istore_2        
		if(i == 0)
	//*   6   11:iload_2         
	//*   7   12:ifne            20
		{
			return Tasks.forResult(((Object) (null)));
	//    8   15:aconst_null     
	//    9   16:invokestatic    #104 <Method Task Tasks.forResult(Object)>
	//   10   19:areturn         
		} else
		{
			activity = ((Activity) (zzabj.zzu(activity)));
	//   11   20:aload_1         
	//   12   21:invokestatic    #110 <Method zzabj zzabj.zzu(Activity)>
	//   13   24:astore_1        
			((zzabj) (activity)).zzk(new ConnectionResult(i, ((PendingIntent) (null))));
	//   14   25:aload_1         
	//   15   26:new             #57  <Class ConnectionResult>
	//   16   29:dup             
	//   17   30:iload_2         
	//   18   31:aconst_null     
	//   19   32:invokespecial   #113 <Method void ConnectionResult(int, PendingIntent)>
	//   20   35:invokevirtual   #117 <Method void zzabj.zzk(ConnectionResult)>
			return ((zzabj) (activity)).getTask();
	//   21   38:aload_1         
	//   22   39:invokevirtual   #121 <Method Task zzabj.getTask()>
	//   23   42:areturn         
		}
	}

	public boolean showErrorDialogFragment(Activity activity, int i, int j)
	{
		return showErrorDialogFragment(activity, i, j, ((android.content.DialogInterface.OnCancelListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #128 <Method boolean showErrorDialogFragment(Activity, int, int, android.content.DialogInterface$OnCancelListener)>
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
	//    5    6:invokevirtual   #34  <Method Dialog getErrorDialog(Activity, int, int, android.content.DialogInterface$OnCancelListener)>
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
	//   11   18:aload_0         
	//   12   19:aload_1         
	//   13   20:aload           5
	//   14   22:ldc1            #130 <String "GooglePlayServicesErrorDialog">
	//   15   24:aload           4
	//   16   26:invokevirtual   #133 <Method void zza(Activity, Dialog, String, android.content.DialogInterface$OnCancelListener)>
			return true;
	//   17   29:iconst_1        
	//   18   30:ireturn         
		}
	}

	public void showErrorNotification(Context context, int i)
	{
		zza(context, i, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #138 <Method void zza(Context, int, String)>
	//    5    7:return          
	}

	public void showErrorNotification(Context context, ConnectionResult connectionresult)
	{
		PendingIntent pendingintent = getErrorResolutionPendingIntent(context, connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #141 <Method PendingIntent getErrorResolutionPendingIntent(Context, ConnectionResult)>
	//    4    6:astore_3        
		zza(context, connectionresult.getErrorCode(), ((String) (null)), pendingintent);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:invokevirtual   #69  <Method int ConnectionResult.getErrorCode()>
	//    9   13:aconst_null     
	//   10   14:aload_3         
	//   11   15:invokevirtual   #144 <Method void zza(Context, int, String, PendingIntent)>
	//   12   18:return          
	}

	public Dialog zza(Activity activity, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		Object obj = ((Object) (new ProgressBar(((Context) (activity)), ((android.util.AttributeSet) (null)), 0x101007a)));
	//    0    0:new             #147 <Class ProgressBar>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:ldc1            #148 <Int 0x101007a>
	//    5    8:invokespecial   #151 <Method void ProgressBar(Context, android.util.AttributeSet, int)>
	//    6   11:astore_3        
		((ProgressBar) (obj)).setIndeterminate(true);
	//    7   12:aload_3         
	//    8   13:iconst_1        
	//    9   14:invokevirtual   #155 <Method void ProgressBar.setIndeterminate(boolean)>
		((ProgressBar) (obj)).setVisibility(0);
	//   10   17:aload_3         
	//   11   18:iconst_0        
	//   12   19:invokevirtual   #159 <Method void ProgressBar.setVisibility(int)>
		android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((Context) (activity)));
	//   13   22:new             #161 <Class android.app.AlertDialog$Builder>
	//   14   25:dup             
	//   15   26:aload_1         
	//   16   27:invokespecial   #164 <Method void android.app.AlertDialog$Builder(Context)>
	//   17   30:astore          4
		builder.setView(((android.view.View) (obj)));
	//   18   32:aload           4
	//   19   34:aload_3         
	//   20   35:invokevirtual   #168 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setView(android.view.View)>
	//   21   38:pop             
		builder.setMessage(((CharSequence) (zzh.zzi(((Context) (activity)), 18))));
	//   22   39:aload           4
	//   23   41:aload_1         
	//   24   42:bipush          18
	//   25   44:invokestatic    #174 <Method String zzh.zzi(Context, int)>
	//   26   47:invokevirtual   #178 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   27   50:pop             
		builder.setPositiveButton("", ((android.content.DialogInterface.OnClickListener) (null)));
	//   28   51:aload           4
	//   29   53:ldc1            #180 <String "">
	//   30   55:aconst_null     
	//   31   56:invokevirtual   #184 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   32   59:pop             
		obj = ((Object) (builder.create()));
	//   33   60:aload           4
	//   34   62:invokevirtual   #188 <Method android.app.AlertDialog android.app.AlertDialog$Builder.create()>
	//   35   65:astore_3        
		zza(activity, ((Dialog) (obj)), "GooglePlayServicesUpdatingDialog", oncancellistener);
	//   36   66:aload_0         
	//   37   67:aload_1         
	//   38   68:aload_3         
	//   39   69:ldc1            #190 <String "GooglePlayServicesUpdatingDialog">
	//   40   71:aload_2         
	//   41   72:invokevirtual   #133 <Method void zza(Activity, Dialog, String, android.content.DialogInterface$OnCancelListener)>
		return ((Dialog) (obj));
	//   42   75:aload_3         
	//   43   76:areturn         
	}

	Dialog zza(Context context, int i, zzi zzi1, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		if(i == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.app.AlertDialog.Builder builder = null;
	//    4    6:aconst_null     
	//    5    7:astore          5
		Object obj = ((Object) (new TypedValue()));
	//    6    9:new             #192 <Class TypedValue>
	//    7   12:dup             
	//    8   13:invokespecial   #193 <Method void TypedValue()>
	//    9   16:astore          6
		context.getTheme().resolveAttribute(0x1010309, ((TypedValue) (obj)), true);
	//   10   18:aload_1         
	//   11   19:invokevirtual   #199 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   12   22:ldc1            #200 <Int 0x1010309>
	//   13   24:aload           6
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #206 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   16   30:pop             
		if("Theme.Dialog.Alert".equals(((Object) (context.getResources().getResourceEntryName(((TypedValue) (obj)).resourceId)))))
	//*  17   31:ldc1            #208 <String "Theme.Dialog.Alert">
	//*  18   33:aload_1         
	//*  19   34:invokevirtual   #212 <Method Resources Context.getResources()>
	//*  20   37:aload           6
	//*  21   39:getfield        #215 <Field int TypedValue.resourceId>
	//*  22   42:invokevirtual   #220 <Method String Resources.getResourceEntryName(int)>
	//*  23   45:invokevirtual   #226 <Method boolean String.equals(Object)>
	//*  24   48:ifeq            62
			builder = new android.app.AlertDialog.Builder(context, 5);
	//   25   51:new             #161 <Class android.app.AlertDialog$Builder>
	//   26   54:dup             
	//   27   55:aload_1         
	//   28   56:iconst_5        
	//   29   57:invokespecial   #228 <Method void android.app.AlertDialog$Builder(Context, int)>
	//   30   60:astore          5
		obj = ((Object) (builder));
	//   31   62:aload           5
	//   32   64:astore          6
		if(builder == null)
	//*  33   66:aload           5
	//*  34   68:ifnonnull       81
			obj = ((Object) (new android.app.AlertDialog.Builder(context)));
	//   35   71:new             #161 <Class android.app.AlertDialog$Builder>
	//   36   74:dup             
	//   37   75:aload_1         
	//   38   76:invokespecial   #164 <Method void android.app.AlertDialog$Builder(Context)>
	//   39   79:astore          6
		((android.app.AlertDialog.Builder) (obj)).setMessage(((CharSequence) (zzh.zzi(context, i))));
	//   40   81:aload           6
	//   41   83:aload_1         
	//   42   84:iload_2         
	//   43   85:invokestatic    #174 <Method String zzh.zzi(Context, int)>
	//   44   88:invokevirtual   #178 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   45   91:pop             
		if(oncancellistener != null)
	//*  46   92:aload           4
	//*  47   94:ifnull          105
			((android.app.AlertDialog.Builder) (obj)).setOnCancelListener(oncancellistener);
	//   48   97:aload           6
	//   49   99:aload           4
	//   50  101:invokevirtual   #232 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
	//   51  104:pop             
		oncancellistener = ((android.content.DialogInterface.OnCancelListener) (zzh.zzk(context, i)));
	//   52  105:aload_1         
	//   53  106:iload_2         
	//   54  107:invokestatic    #234 <Method String zzh.zzk(Context, int)>
	//   55  110:astore          4
		if(oncancellistener != null)
	//*  56  112:aload           4
	//*  57  114:ifnull          126
			((android.app.AlertDialog.Builder) (obj)).setPositiveButton(((CharSequence) (oncancellistener)), ((android.content.DialogInterface.OnClickListener) (zzi1)));
	//   58  117:aload           6
	//   59  119:aload           4
	//   60  121:aload_3         
	//   61  122:invokevirtual   #184 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   62  125:pop             
		context = ((Context) (zzh.zzg(context, i)));
	//   63  126:aload_1         
	//   64  127:iload_2         
	//   65  128:invokestatic    #237 <Method String zzh.zzg(Context, int)>
	//   66  131:astore_1        
		if(context != null)
	//*  67  132:aload_1         
	//*  68  133:ifnull          143
			((android.app.AlertDialog.Builder) (obj)).setTitle(((CharSequence) (context)));
	//   69  136:aload           6
	//   70  138:aload_1         
	//   71  139:invokevirtual   #240 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   72  142:pop             
		return ((Dialog) (((android.app.AlertDialog.Builder) (obj)).create()));
	//   73  143:aload           6
	//   74  145:invokevirtual   #188 <Method android.app.AlertDialog android.app.AlertDialog$Builder.create()>
	//   75  148:areturn         
	}

	public PendingIntent zza(Context context, int i, int j, String s)
	{
		return super.zza(context, i, j, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #243 <Method PendingIntent zze.zza(Context, int, int, String)>
	//    6    9:areturn         
	}

	public zzaaz zza(Context context, com.google.android.gms.internal.zzaaz.zza zza1)
	{
		IntentFilter intentfilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
	//    0    0:new             #247 <Class IntentFilter>
	//    1    3:dup             
	//    2    4:ldc1            #249 <String "android.intent.action.PACKAGE_ADDED">
	//    3    6:invokespecial   #251 <Method void IntentFilter(String)>
	//    4    9:astore_3        
		intentfilter.addDataScheme("package");
	//    5   10:aload_3         
	//    6   11:ldc1            #253 <String "package">
	//    7   13:invokevirtual   #256 <Method void IntentFilter.addDataScheme(String)>
		zzaaz zzaaz1 = new zzaaz(zza1);
	//    8   16:new             #258 <Class zzaaz>
	//    9   19:dup             
	//   10   20:aload_2         
	//   11   21:invokespecial   #261 <Method void zzaaz(com.google.android.gms.internal.zzaaz$zza)>
	//   12   24:astore          4
		context.registerReceiver(((android.content.BroadcastReceiver) (zzaaz1)), intentfilter);
	//   13   26:aload_1         
	//   14   27:aload           4
	//   15   29:aload_3         
	//   16   30:invokevirtual   #265 <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   17   33:pop             
		zzaaz1.setContext(context);
	//   18   34:aload           4
	//   19   36:aload_1         
	//   20   37:invokevirtual   #268 <Method void zzaaz.setContext(Context)>
		if(!zzz(context, "com.google.android.gms"))
	//*  21   40:aload_0         
	//*  22   41:aload_1         
	//*  23   42:ldc1            #11  <String "com.google.android.gms">
	//*  24   44:invokevirtual   #272 <Method boolean zzz(Context, String)>
	//*  25   47:ifne            61
		{
			zza1.zzvE();
	//   26   50:aload_2         
	//   27   51:invokevirtual   #277 <Method void com.google.android.gms.internal.zzaaz$zza.zzvE()>
			zzaaz1.unregister();
	//   28   54:aload           4
	//   29   56:invokevirtual   #280 <Method void zzaaz.unregister()>
			return null;
	//   30   59:aconst_null     
	//   31   60:areturn         
		} else
		{
			return zzaaz1;
	//   32   61:aload           4
	//   33   63:areturn         
		}
	}

	void zza(Activity activity, Dialog dialog, String s, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		if(activity instanceof FragmentActivity)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #282 <Class FragmentActivity>
	//*   2    4:ifeq            27
		{
			activity = ((Activity) (((FragmentActivity)activity).getSupportFragmentManager()));
	//    3    7:aload_1         
	//    4    8:checkcast       #282 <Class FragmentActivity>
	//    5   11:invokevirtual   #286 <Method android.support.v4.app.FragmentManager FragmentActivity.getSupportFragmentManager()>
	//    6   14:astore_1        
			SupportErrorDialogFragment.newInstance(dialog, oncancellistener).show(((android.support.v4.app.FragmentManager) (activity)), s);
	//    7   15:aload_2         
	//    8   16:aload           4
	//    9   18:invokestatic    #292 <Method SupportErrorDialogFragment SupportErrorDialogFragment.newInstance(Dialog, android.content.DialogInterface$OnCancelListener)>
	//   10   21:aload_1         
	//   11   22:aload_3         
	//   12   23:invokevirtual   #296 <Method void SupportErrorDialogFragment.show(android.support.v4.app.FragmentManager, String)>
			return;
	//   13   26:return          
		} else
		{
			activity = ((Activity) (activity.getFragmentManager()));
	//   14   27:aload_1         
	//   15   28:invokevirtual   #302 <Method android.app.FragmentManager Activity.getFragmentManager()>
	//   16   31:astore_1        
			ErrorDialogFragment.newInstance(dialog, oncancellistener).show(((android.app.FragmentManager) (activity)), s);
	//   17   32:aload_2         
	//   18   33:aload           4
	//   19   35:invokestatic    #307 <Method ErrorDialogFragment ErrorDialogFragment.newInstance(Dialog, android.content.DialogInterface$OnCancelListener)>
	//   20   38:aload_1         
	//   21   39:aload_3         
	//   22   40:invokevirtual   #310 <Method void ErrorDialogFragment.show(android.app.FragmentManager, String)>
			return;
	//   23   43:return          
		}
	}

	public void zza(Context context, int i, String s)
	{
		zza(context, i, s, zza(context, i, 0, "n"));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload_0         
	//    5    5:aload_1         
	//    6    6:iload_2         
	//    7    7:iconst_0        
	//    8    8:ldc2            #312 <String "n">
	//    9   11:invokevirtual   #313 <Method PendingIntent zza(Context, int, int, String)>
	//   10   14:invokevirtual   #144 <Method void zza(Context, int, String, PendingIntent)>
	//   11   17:return          
	}

	void zza(Context context, int i, String s, PendingIntent pendingintent)
	{
		if(i == 18)
	//*   0    0:iload_2         
	//*   1    1:bipush          18
	//*   2    3:icmpne          12
		{
			zzaD(context);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #319 <Method void zzaD(Context)>
			return;
	//    6   11:return          
		}
		if(pendingintent == null)
	//*   7   12:aload           4
	//*   8   14:ifnonnull       34
		{
			if(i == 6)
	//*   9   17:iload_2         
	//*  10   18:bipush          6
	//*  11   20:icmpne          33
				Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
	//   12   23:ldc2            #321 <String "GoogleApiAvailability">
	//   13   26:ldc2            #323 <String "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.">
	//   14   29:invokestatic    #329 <Method int Log.w(String, String)>
	//   15   32:pop             
			return;
	//   16   33:return          
		}
		String s1 = zzh.zzh(context, i);
	//   17   34:aload_1         
	//   18   35:iload_2         
	//   19   36:invokestatic    #332 <Method String zzh.zzh(Context, int)>
	//   20   39:astore          5
		String s2 = zzh.zzj(context, i);
	//   21   41:aload_1         
	//   22   42:iload_2         
	//   23   43:invokestatic    #335 <Method String zzh.zzj(Context, int)>
	//   24   46:astore          6
		Resources resources = context.getResources();
	//   25   48:aload_1         
	//   26   49:invokevirtual   #212 <Method Resources Context.getResources()>
	//   27   52:astore          7
		if(zzj.zzba(context))
	//*  28   54:aload_1         
	//*  29   55:invokestatic    #341 <Method boolean zzj.zzba(Context)>
	//*  30   58:ifeq            137
		{
			zzac.zzaw(zzt.zzzm());
	//   31   61:invokestatic    #346 <Method boolean zzt.zzzm()>
	//   32   64:invokestatic    #349 <Method void zzac.zzaw(boolean)>
			pendingintent = ((PendingIntent) ((new android.app.Notification.Builder(context)).setSmallIcon(context.getApplicationInfo().icon).setPriority(2).setAutoCancel(true).setContentTitle(((CharSequence) (s1))).setStyle(((android.app.Notification.Style) ((new android.app.Notification.BigTextStyle()).bigText(((CharSequence) (s2)))))).addAction(com.google.android.gms.R.drawable.common_full_open_on_phone, ((CharSequence) (resources.getString(com.google.android.gms.R.string.common_open_on_phone))), pendingintent).build()));
	//   33   67:new             #351 <Class android.app.Notification$Builder>
	//   34   70:dup             
	//   35   71:aload_1         
	//   36   72:invokespecial   #352 <Method void android.app.Notification$Builder(Context)>
	//   37   75:aload_1         
	//   38   76:invokevirtual   #356 <Method ApplicationInfo Context.getApplicationInfo()>
	//   39   79:getfield        #361 <Field int ApplicationInfo.icon>
	//   40   82:invokevirtual   #365 <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int)>
	//   41   85:iconst_2        
	//   42   86:invokevirtual   #368 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
	//   43   89:iconst_1        
	//   44   90:invokevirtual   #372 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//   45   93:aload           5
	//   46   95:invokevirtual   #376 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   47   98:new             #378 <Class android.app.Notification$BigTextStyle>
	//   48  101:dup             
	//   49  102:invokespecial   #379 <Method void android.app.Notification$BigTextStyle()>
	//   50  105:aload           6
	//   51  107:invokevirtual   #383 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.bigText(CharSequence)>
	//   52  110:invokevirtual   #387 <Method android.app.Notification$Builder android.app.Notification$Builder.setStyle(android.app.Notification$Style)>
	//   53  113:getstatic       #392 <Field int com.google.android.gms.R$drawable.common_full_open_on_phone>
	//   54  116:aload           7
	//   55  118:getstatic       #397 <Field int com.google.android.gms.R$string.common_open_on_phone>
	//   56  121:invokevirtual   #400 <Method String Resources.getString(int)>
	//   57  124:aload           4
	//   58  126:invokevirtual   #404 <Method android.app.Notification$Builder android.app.Notification$Builder.addAction(int, CharSequence, PendingIntent)>
	//   59  129:invokevirtual   #408 <Method android.app.Notification android.app.Notification$Builder.build()>
	//   60  132:astore          4
		} else
	//*  61  134:goto            211
		{
			pendingintent = ((PendingIntent) ((new android.support.v4.app.NotificationCompat.Builder(context)).setSmallIcon(0x108008a).setTicker(((CharSequence) (resources.getString(com.google.android.gms.R.string.common_google_play_services_notification_ticker)))).setWhen(System.currentTimeMillis()).setAutoCancel(true).setContentIntent(pendingintent).setContentTitle(((CharSequence) (s1))).setContentText(((CharSequence) (s2))).setLocalOnly(true).setStyle(((android.support.v4.app.NotificationCompat.Style) ((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(((CharSequence) (s2)))))).build()));
	//   62  137:new             #410 <Class android.support.v4.app.NotificationCompat$Builder>
	//   63  140:dup             
	//   64  141:aload_1         
	//   65  142:invokespecial   #411 <Method void android.support.v4.app.NotificationCompat$Builder(Context)>
	//   66  145:ldc2            #412 <Int 0x108008a>
	//   67  148:invokevirtual   #415 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setSmallIcon(int)>
	//   68  151:aload           7
	//   69  153:getstatic       #418 <Field int com.google.android.gms.R$string.common_google_play_services_notification_ticker>
	//   70  156:invokevirtual   #400 <Method String Resources.getString(int)>
	//   71  159:invokevirtual   #422 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setTicker(CharSequence)>
	//   72  162:invokestatic    #428 <Method long System.currentTimeMillis()>
	//   73  165:invokevirtual   #432 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setWhen(long)>
	//   74  168:iconst_1        
	//   75  169:invokevirtual   #435 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setAutoCancel(boolean)>
	//   76  172:aload           4
	//   77  174:invokevirtual   #439 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentIntent(PendingIntent)>
	//   78  177:aload           5
	//   79  179:invokevirtual   #441 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentTitle(CharSequence)>
	//   80  182:aload           6
	//   81  184:invokevirtual   #444 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentText(CharSequence)>
	//   82  187:iconst_1        
	//   83  188:invokevirtual   #447 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setLocalOnly(boolean)>
	//   84  191:new             #449 <Class android.support.v4.app.NotificationCompat$BigTextStyle>
	//   85  194:dup             
	//   86  195:invokespecial   #450 <Method void android.support.v4.app.NotificationCompat$BigTextStyle()>
	//   87  198:aload           6
	//   88  200:invokevirtual   #453 <Method android.support.v4.app.NotificationCompat$BigTextStyle android.support.v4.app.NotificationCompat$BigTextStyle.bigText(CharSequence)>
	//   89  203:invokevirtual   #456 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setStyle(android.support.v4.app.NotificationCompat$Style)>
	//   90  206:invokevirtual   #457 <Method android.app.Notification android.support.v4.app.NotificationCompat$Builder.build()>
	//   91  209:astore          4
		}
		switch(i)
	//*  92  211:iload_2         
		{
	//*  93  212:tableswitch     1 3: default 240
	//	               1 243
	//	               2 243
	//	               3 243
	//*  94  240:goto            257
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
			i = 10436;
	//   95  243:sipush          10436
	//   96  246:istore_2        
			zzg.zzayB.set(false);
	//   97  247:getstatic       #463 <Field AtomicBoolean zzg.zzayB>
	//   98  250:iconst_0        
	//   99  251:invokevirtual   #468 <Method void AtomicBoolean.set(boolean)>
			break;

	//* 100  254:goto            261
		default:
			i = 39789;
	//  101  257:ldc2            #469 <Int 39789>
	//  102  260:istore_2        
			break;
		}
		context = ((Context) ((NotificationManager)context.getSystemService("notification")));
	//  103  261:aload_1         
	//  104  262:ldc2            #471 <String "notification">
	//  105  265:invokevirtual   #475 <Method Object Context.getSystemService(String)>
	//  106  268:checkcast       #477 <Class NotificationManager>
	//  107  271:astore_1        
		if(s == null)
	//* 108  272:aload_3         
	//* 109  273:ifnonnull       284
		{
			((NotificationManager) (context)).notify(i, ((android.app.Notification) (pendingintent)));
	//  110  276:aload_1         
	//  111  277:iload_2         
	//  112  278:aload           4
	//  113  280:invokevirtual   #481 <Method void NotificationManager.notify(int, android.app.Notification)>
			return;
	//  114  283:return          
		} else
		{
			((NotificationManager) (context)).notify(s, i, ((android.app.Notification) (pendingintent)));
	//  115  284:aload_1         
	//  116  285:aload_3         
	//  117  286:iload_2         
	//  118  287:aload           4
	//  119  289:invokevirtual   #484 <Method void NotificationManager.notify(String, int, android.app.Notification)>
			return;
	//  120  292:return          
		}
	}

	public boolean zza(Activity activity, zzabf zzabf, int i, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		zzabf = ((zzabf) (zza(((Context) (activity)), i, zzi.zza(zzabf, zzb(((Context) (activity)), i, "d"), j), oncancellistener)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_3         
	//    3    3:aload_2         
	//    4    4:aload_0         
	//    5    5:aload_1         
	//    6    6:iload_3         
	//    7    7:ldc1            #36  <String "d">
	//    8    9:invokevirtual   #40  <Method Intent zzb(Context, int, String)>
	//    9   12:iload           4
	//   10   14:invokestatic    #489 <Method zzi zzi.zza(zzabf, Intent, int)>
	//   11   17:aload           5
	//   12   19:invokevirtual   #48  <Method Dialog zza(Context, int, zzi, android.content.DialogInterface$OnCancelListener)>
	//   13   22:astore_2        
		if(zzabf == null)
	//*  14   23:aload_2         
	//*  15   24:ifnonnull       29
		{
			return false;
	//   16   27:iconst_0        
	//   17   28:ireturn         
		} else
		{
			zza(activity, ((Dialog) (zzabf)), "GooglePlayServicesErrorDialog", oncancellistener);
	//   18   29:aload_0         
	//   19   30:aload_1         
	//   20   31:aload_2         
	//   21   32:ldc1            #130 <String "GooglePlayServicesErrorDialog">
	//   22   34:aload           5
	//   23   36:invokevirtual   #133 <Method void zza(Activity, Dialog, String, android.content.DialogInterface$OnCancelListener)>
			return true;
	//   24   39:iconst_1        
	//   25   40:ireturn         
		}
	}

	public boolean zza(Context context, ConnectionResult connectionresult, int i)
	{
		PendingIntent pendingintent = getErrorResolutionPendingIntent(context, connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #141 <Method PendingIntent getErrorResolutionPendingIntent(Context, ConnectionResult)>
	//    4    6:astore          4
		if(pendingintent != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          32
		{
			zza(context, connectionresult.getErrorCode(), ((String) (null)), GoogleApiActivity.zza(context, pendingintent, i));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #69  <Method int ConnectionResult.getErrorCode()>
	//   11   19:aconst_null     
	//   12   20:aload_1         
	//   13   21:aload           4
	//   14   23:iload_3         
	//   15   24:invokestatic    #495 <Method PendingIntent GoogleApiActivity.zza(Context, PendingIntent, int)>
	//   16   27:invokevirtual   #144 <Method void zza(Context, int, String, PendingIntent)>
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

	public int zzaC(Context context)
	{
		return super.zzaC(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #498 <Method int zze.zzaC(Context)>
	//    3    5:ireturn         
	}

	void zzaD(Context context)
	{
		((Handler) (new zza(context))).sendEmptyMessageDelayed(1, 0x1d4c0L);
	//    0    0:new             #6   <Class GoogleApiAvailability$zza>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #501 <Method void GoogleApiAvailability$zza(GoogleApiAvailability, Context)>
	//    5    9:iconst_1        
	//    6   10:ldc2w           #502 <Long 0x1d4c0L>
	//    7   13:invokevirtual   #509 <Method boolean Handler.sendEmptyMessageDelayed(int, long)>
	//    8   16:pop             
	//    9   17:return          
	}

	public Intent zzb(Context context, int i, String s)
	{
		return super.zzb(context, i, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #510 <Method Intent zze.zzb(Context, int, String)>
	//    5    7:areturn         
	}

	public Intent zzcw(int i)
	{
		return super.zzcw(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #515 <Method Intent zze.zzcw(int)>
	//    3    5:areturn         
	}

	public boolean zzd(Context context, int i)
	{
		return super.zzd(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #520 <Method boolean zze.zzd(Context, int)>
	//    4    6:ireturn         
	}

	public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
	public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
	private static final GoogleApiAvailability zzaym = new GoogleApiAvailability();

	static 
	{
	//    0    0:new             #2   <Class GoogleApiAvailability>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void GoogleApiAvailability()>
	//    3    7:putstatic       #22  <Field GoogleApiAvailability zzaym>
		GOOGLE_PLAY_SERVICES_VERSION_CODE = zze.GOOGLE_PLAY_SERVICES_VERSION_CODE;
	//    4   10:getstatic       #24  <Field int zze.GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    5   13:putstatic       #25  <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//*   6   16:return          
	}
}
