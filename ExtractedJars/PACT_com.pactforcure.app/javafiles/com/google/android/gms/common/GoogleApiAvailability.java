// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
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
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzh;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.common.util.zzs;
import com.google.android.gms.internal.zzaar;
import com.google.android.gms.internal.zzaax;
import com.google.android.gms.internal.zzabb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.gms.common:
//			zzc, ConnectionResult, SupportErrorDialogFragment, ErrorDialogFragment, 
//			zze

public class GoogleApiAvailability extends zzc
{
	private class zza extends Handler
	{

		public void handleMessage(Message message)
		{
			message.what;
		//    0    0:aload_1         
		//    1    1:getfield        #47  <Field int Message.what>
			JVM INSTR tableswitch 1 1: default 24
		//		               1 57;
		//    2    4:tableswitch     1 1: default 24
		//		               1 57
			   goto _L1 _L2
_L1:
			int i = message.what;
		//    3   24:aload_1         
		//    4   25:getfield        #47  <Field int Message.what>
		//    5   28:istore_2        
			Log.w("GoogleApiAvailability", (new StringBuilder(50)).append("Don't know how to handle this message: ").append(i).toString());
		//    6   29:ldc1            #49  <String "GoogleApiAvailability">
		//    7   31:new             #51  <Class StringBuilder>
		//    8   34:dup             
		//    9   35:bipush          50
		//   10   37:invokespecial   #54  <Method void StringBuilder(int)>
		//   11   40:ldc1            #56  <String "Don't know how to handle this message: ">
		//   12   42:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
		//   13   45:iload_2         
		//   14   46:invokevirtual   #63  <Method StringBuilder StringBuilder.append(int)>
		//   15   49:invokevirtual   #67  <Method String StringBuilder.toString()>
		//   16   52:invokestatic    #73  <Method int Log.w(String, String)>
		//   17   55:pop             
_L4:
			return;
		//   18   56:return          
_L2:
			int j = zzaxb.isGooglePlayServicesAvailable(zzvZ);
		//   19   57:aload_0         
		//   20   58:getfield        #18  <Field GoogleApiAvailability zzaxb>
		//   21   61:aload_0         
		//   22   62:getfield        #38  <Field Context zzvZ>
		//   23   65:invokevirtual   #77  <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(Context)>
		//   24   68:istore_2        
			if(zzaxb.isUserResolvableError(j))
		//*  25   69:aload_0         
		//*  26   70:getfield        #18  <Field GoogleApiAvailability zzaxb>
		//*  27   73:iload_2         
		//*  28   74:invokevirtual   #81  <Method boolean GoogleApiAvailability.isUserResolvableError(int)>
		//*  29   77:ifeq            56
			{
				zzaxb.showErrorNotification(zzvZ, j);
		//   30   80:aload_0         
		//   31   81:getfield        #18  <Field GoogleApiAvailability zzaxb>
		//   32   84:aload_0         
		//   33   85:getfield        #38  <Field Context zzvZ>
		//   34   88:iload_2         
		//   35   89:invokevirtual   #85  <Method void GoogleApiAvailability.showErrorNotification(Context, int)>
				return;
		//   36   92:return          
			}
			if(true) goto _L4; else goto _L3
_L3:
		}

		final GoogleApiAvailability zzaxb;
		private final Context zzvZ;

		public zza(Context context)
		{
			zzaxb = GoogleApiAvailability.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field GoogleApiAvailability zzaxb>
			if(Looper.myLooper() == null)
		//*   3    5:invokestatic    #24  <Method Looper Looper.myLooper()>
		//*   4    8:ifnonnull       29
				googleapiavailability = ((GoogleApiAvailability) (Looper.getMainLooper()));
		//    5   11:invokestatic    #27  <Method Looper Looper.getMainLooper()>
		//    6   14:astore_1        
			else
		//*   7   15:aload_0         
		//*   8   16:aload_1         
		//*   9   17:invokespecial   #30  <Method void Handler(Looper)>
		//*  10   20:aload_0         
		//*  11   21:aload_2         
		//*  12   22:invokevirtual   #36  <Method Context Context.getApplicationContext()>
		//*  13   25:putfield        #38  <Field Context zzvZ>
		//*  14   28:return          
				googleapiavailability = ((GoogleApiAvailability) (Looper.myLooper()));
		//   15   29:invokestatic    #24  <Method Looper Looper.myLooper()>
		//   16   32:astore_1        
			super(((Looper) (GoogleApiAvailability.this)));
			zzvZ = context.getApplicationContext();
		//*  17   33:goto            15
		}
	}


	GoogleApiAvailability()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void zzc()>
	//    2    4:return          
	}

	public static GoogleApiAvailability getInstance()
	{
		return zzaxa;
	//    0    0:getstatic       #22  <Field GoogleApiAvailability zzaxa>
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
	//    4    4:invokespecial   #53  <Method PendingIntent zzc.getErrorResolutionPendingIntent(Context, int, int)>
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
	//    2    2:invokespecial   #74  <Method String zzc.getErrorString(int)>
	//    3    5:areturn         
	}

	public String getOpenSourceSoftwareLicenseInfo(Context context)
	{
		return super.getOpenSourceSoftwareLicenseInfo(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #78  <Method String zzc.getOpenSourceSoftwareLicenseInfo(Context)>
	//    3    5:areturn         
	}

	public int isGooglePlayServicesAvailable(Context context)
	{
		return super.isGooglePlayServicesAvailable(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #82  <Method int zzc.isGooglePlayServicesAvailable(Context)>
	//    3    5:ireturn         
	}

	public final boolean isUserResolvableError(int i)
	{
		return super.isUserResolvableError(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #86  <Method boolean zzc.isUserResolvableError(int)>
	//    3    5:ireturn         
	}

	public Task makeGooglePlayServicesAvailable(Activity activity)
	{
		zzac.zzdn("makeGooglePlayServicesAvailable must be called from the main thread");
	//    0    0:ldc1            #91  <String "makeGooglePlayServicesAvailable must be called from the main thread">
	//    1    2:invokestatic    #97  <Method void zzac.zzdn(String)>
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
			activity = ((Activity) (zzabb.zzu(activity)));
	//   11   20:aload_1         
	//   12   21:invokestatic    #110 <Method zzabb zzabb.zzu(Activity)>
	//   13   24:astore_1        
			((zzabb) (activity)).zzk(new ConnectionResult(i, ((PendingIntent) (null))));
	//   14   25:aload_1         
	//   15   26:new             #57  <Class ConnectionResult>
	//   16   29:dup             
	//   17   30:iload_2         
	//   18   31:aconst_null     
	//   19   32:invokespecial   #113 <Method void ConnectionResult(int, PendingIntent)>
	//   20   35:invokevirtual   #117 <Method void zzabb.zzk(ConnectionResult)>
			return ((zzabb) (activity)).getTask();
	//   21   38:aload_1         
	//   22   39:invokevirtual   #121 <Method Task zzabb.getTask()>
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
		android.app.AlertDialog.Builder builder1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		if(i == 0)
	//*   2    3:iload_2         
	//*   3    4:ifne            9
			return null;
	//    4    7:aconst_null     
	//    5    8:areturn         
		android.app.AlertDialog.Builder builder = builder1;
	//    6    9:aload           6
	//    7   11:astore          5
		if(zzs.zzyA())
	//*   8   13:invokestatic    #198 <Method boolean zzs.zzyA()>
	//*   9   16:ifeq            76
		{
			TypedValue typedvalue = new TypedValue();
	//   10   19:new             #200 <Class TypedValue>
	//   11   22:dup             
	//   12   23:invokespecial   #201 <Method void TypedValue()>
	//   13   26:astore          7
			context.getTheme().resolveAttribute(0x1010309, typedvalue, true);
	//   14   28:aload_1         
	//   15   29:invokevirtual   #207 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   16   32:ldc1            #208 <Int 0x1010309>
	//   17   34:aload           7
	//   18   36:iconst_1        
	//   19   37:invokevirtual   #214 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   20   40:pop             
			builder = builder1;
	//   21   41:aload           6
	//   22   43:astore          5
			if("Theme.Dialog.Alert".equals(((Object) (context.getResources().getResourceEntryName(typedvalue.resourceId)))))
	//*  23   45:ldc1            #216 <String "Theme.Dialog.Alert">
	//*  24   47:aload_1         
	//*  25   48:invokevirtual   #220 <Method Resources Context.getResources()>
	//*  26   51:aload           7
	//*  27   53:getfield        #223 <Field int TypedValue.resourceId>
	//*  28   56:invokevirtual   #228 <Method String Resources.getResourceEntryName(int)>
	//*  29   59:invokevirtual   #234 <Method boolean String.equals(Object)>
	//*  30   62:ifeq            76
				builder = new android.app.AlertDialog.Builder(context, 5);
	//   31   65:new             #161 <Class android.app.AlertDialog$Builder>
	//   32   68:dup             
	//   33   69:aload_1         
	//   34   70:iconst_5        
	//   35   71:invokespecial   #236 <Method void android.app.AlertDialog$Builder(Context, int)>
	//   36   74:astore          5
		}
		builder1 = builder;
	//   37   76:aload           5
	//   38   78:astore          6
		if(builder == null)
	//*  39   80:aload           5
	//*  40   82:ifnonnull       95
			builder1 = new android.app.AlertDialog.Builder(context);
	//   41   85:new             #161 <Class android.app.AlertDialog$Builder>
	//   42   88:dup             
	//   43   89:aload_1         
	//   44   90:invokespecial   #164 <Method void android.app.AlertDialog$Builder(Context)>
	//   45   93:astore          6
		builder1.setMessage(((CharSequence) (zzh.zzi(context, i))));
	//   46   95:aload           6
	//   47   97:aload_1         
	//   48   98:iload_2         
	//   49   99:invokestatic    #174 <Method String zzh.zzi(Context, int)>
	//   50  102:invokevirtual   #178 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   51  105:pop             
		if(oncancellistener != null)
	//*  52  106:aload           4
	//*  53  108:ifnull          119
			builder1.setOnCancelListener(oncancellistener);
	//   54  111:aload           6
	//   55  113:aload           4
	//   56  115:invokevirtual   #240 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setOnCancelListener(android.content.DialogInterface$OnCancelListener)>
	//   57  118:pop             
		oncancellistener = ((android.content.DialogInterface.OnCancelListener) (zzh.zzk(context, i)));
	//   58  119:aload_1         
	//   59  120:iload_2         
	//   60  121:invokestatic    #242 <Method String zzh.zzk(Context, int)>
	//   61  124:astore          4
		if(oncancellistener != null)
	//*  62  126:aload           4
	//*  63  128:ifnull          140
			builder1.setPositiveButton(((CharSequence) (oncancellistener)), ((android.content.DialogInterface.OnClickListener) (zzi1)));
	//   64  131:aload           6
	//   65  133:aload           4
	//   66  135:aload_3         
	//   67  136:invokevirtual   #184 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(CharSequence, android.content.DialogInterface$OnClickListener)>
	//   68  139:pop             
		context = ((Context) (zzh.zzg(context, i)));
	//   69  140:aload_1         
	//   70  141:iload_2         
	//   71  142:invokestatic    #245 <Method String zzh.zzg(Context, int)>
	//   72  145:astore_1        
		if(context != null)
	//*  73  146:aload_1         
	//*  74  147:ifnull          157
			builder1.setTitle(((CharSequence) (context)));
	//   75  150:aload           6
	//   76  152:aload_1         
	//   77  153:invokevirtual   #248 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   78  156:pop             
		return ((Dialog) (builder1.create()));
	//   79  157:aload           6
	//   80  159:invokevirtual   #188 <Method android.app.AlertDialog android.app.AlertDialog$Builder.create()>
	//   81  162:areturn         
	}

	public PendingIntent zza(Context context, int i, int j, String s)
	{
		return super.zza(context, i, j, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #251 <Method PendingIntent zzc.zza(Context, int, int, String)>
	//    6    9:areturn         
	}

	public zzaar zza(Context context, com.google.android.gms.internal.zzaar.zza zza1)
	{
		Object obj = ((Object) (new IntentFilter("android.intent.action.PACKAGE_ADDED")));
	//    0    0:new             #255 <Class IntentFilter>
	//    1    3:dup             
	//    2    4:ldc2            #257 <String "android.intent.action.PACKAGE_ADDED">
	//    3    7:invokespecial   #259 <Method void IntentFilter(String)>
	//    4   10:astore_3        
		((IntentFilter) (obj)).addDataScheme("package");
	//    5   11:aload_3         
	//    6   12:ldc2            #261 <String "package">
	//    7   15:invokevirtual   #264 <Method void IntentFilter.addDataScheme(String)>
		zzaar zzaar1 = new zzaar(zza1);
	//    8   18:new             #266 <Class zzaar>
	//    9   21:dup             
	//   10   22:aload_2         
	//   11   23:invokespecial   #269 <Method void zzaar(com.google.android.gms.internal.zzaar$zza)>
	//   12   26:astore          4
		context.registerReceiver(((android.content.BroadcastReceiver) (zzaar1)), ((IntentFilter) (obj)));
	//   13   28:aload_1         
	//   14   29:aload           4
	//   15   31:aload_3         
	//   16   32:invokevirtual   #273 <Method Intent Context.registerReceiver(android.content.BroadcastReceiver, IntentFilter)>
	//   17   35:pop             
		zzaar1.setContext(context);
	//   18   36:aload           4
	//   19   38:aload_1         
	//   20   39:invokevirtual   #276 <Method void zzaar.setContext(Context)>
		obj = ((Object) (zzaar1));
	//   21   42:aload           4
	//   22   44:astore_3        
		if(!zzs(context, "com.google.android.gms"))
	//*  23   45:aload_0         
	//*  24   46:aload_1         
	//*  25   47:ldc1            #11  <String "com.google.android.gms">
	//*  26   49:invokevirtual   #280 <Method boolean zzs(Context, String)>
	//*  27   52:ifne            66
		{
			zza1.zzvb();
	//   28   55:aload_2         
	//   29   56:invokevirtual   #285 <Method void com.google.android.gms.internal.zzaar$zza.zzvb()>
			zzaar1.unregister();
	//   30   59:aload           4
	//   31   61:invokevirtual   #288 <Method void zzaar.unregister()>
			obj = null;
	//   32   64:aconst_null     
	//   33   65:astore_3        
		}
		return ((zzaar) (obj));
	//   34   66:aload_3         
	//   35   67:areturn         
	}

	void zza(Activity activity, Dialog dialog, String s, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		boolean flag;
		try
		{
			flag = activity instanceof FragmentActivity;
	//    0    0:aload_1         
	//    1    1:instanceof      #293 <Class FragmentActivity>
	//    2    4:istore          5
		}
	//*   3    6:iload           5
	//*   4    8:ifeq            39
	//*   5   11:aload_1         
	//*   6   12:checkcast       #293 <Class FragmentActivity>
	//*   7   15:invokevirtual   #297 <Method android.support.v4.app.FragmentManager FragmentActivity.getSupportFragmentManager()>
	//*   8   18:astore_1        
	//*   9   19:aload_2         
	//*  10   20:aload           4
	//*  11   22:invokestatic    #303 <Method SupportErrorDialogFragment SupportErrorDialogFragment.newInstance(Dialog, android.content.DialogInterface$OnCancelListener)>
	//*  12   25:aload_1         
	//*  13   26:aload_3         
	//*  14   27:invokevirtual   #307 <Method void SupportErrorDialogFragment.show(android.support.v4.app.FragmentManager, String)>
	//*  15   30:return          
		catch(NoClassDefFoundError noclassdeffounderror)
	//*  16   31:astore          6
		{
			flag = false;
	//   17   33:iconst_0        
	//   18   34:istore          5
		}
		if(flag)
		{
			activity = ((Activity) (((FragmentActivity)activity).getSupportFragmentManager()));
			SupportErrorDialogFragment.newInstance(dialog, oncancellistener).show(((android.support.v4.app.FragmentManager) (activity)), s);
			return;
		}
	//*  19   36:goto            6
		if(zzs.zzyx())
	//*  20   39:invokestatic    #310 <Method boolean zzs.zzyx()>
	//*  21   42:ifeq            62
		{
			activity = ((Activity) (activity.getFragmentManager()));
	//   22   45:aload_1         
	//   23   46:invokevirtual   #316 <Method android.app.FragmentManager Activity.getFragmentManager()>
	//   24   49:astore_1        
			ErrorDialogFragment.newInstance(dialog, oncancellistener).show(((android.app.FragmentManager) (activity)), s);
	//   25   50:aload_2         
	//   26   51:aload           4
	//   27   53:invokestatic    #321 <Method ErrorDialogFragment ErrorDialogFragment.newInstance(Dialog, android.content.DialogInterface$OnCancelListener)>
	//   28   56:aload_1         
	//   29   57:aload_3         
	//   30   58:invokevirtual   #324 <Method void ErrorDialogFragment.show(android.app.FragmentManager, String)>
			return;
	//   31   61:return          
		} else
		{
			throw new RuntimeException("This Activity does not support Fragments.");
	//   32   62:new             #326 <Class RuntimeException>
	//   33   65:dup             
	//   34   66:ldc2            #328 <String "This Activity does not support Fragments.">
	//   35   69:invokespecial   #329 <Method void RuntimeException(String)>
	//   36   72:athrow          
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
	//    8    8:ldc2            #331 <String "n">
	//    9   11:invokevirtual   #332 <Method PendingIntent zza(Context, int, int, String)>
	//   10   14:invokevirtual   #144 <Method void zza(Context, int, String, PendingIntent)>
	//   11   17:return          
	}

	void zza(Context context, int i, String s, PendingIntent pendingintent)
	{
		if(i != 18) goto _L2; else goto _L1
	//    0    0:iload_2         
	//    1    1:bipush          18
	//    2    3:icmpne          12
_L1:
		zzal(context);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #336 <Method void zzal(Context)>
_L4:
		return;
	//    6   11:return          
_L2:
		if(pendingintent != null)
			break; /* Loop/switch isn't completed */
	//    7   12:aload           4
	//    8   14:ifnonnull       34
		if(i == 6)
	//*   9   17:iload_2         
	//*  10   18:bipush          6
	//*  11   20:icmpne          11
		{
			Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
	//   12   23:ldc2            #338 <String "GoogleApiAvailability">
	//   13   26:ldc2            #340 <String "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.">
	//   14   29:invokestatic    #346 <Method int Log.w(String, String)>
	//   15   32:pop             
			return;
	//   16   33:return          
		}
		if(true) goto _L4; else goto _L3
_L3:
		String s1 = zzh.zzh(context, i);
	//   17   34:aload_1         
	//   18   35:iload_2         
	//   19   36:invokestatic    #349 <Method String zzh.zzh(Context, int)>
	//   20   39:astore          5
		String s2 = zzh.zzj(context, i);
	//   21   41:aload_1         
	//   22   42:iload_2         
	//   23   43:invokestatic    #352 <Method String zzh.zzj(Context, int)>
	//   24   46:astore          6
		Resources resources = context.getResources();
	//   25   48:aload_1         
	//   26   49:invokevirtual   #220 <Method Resources Context.getResources()>
	//   27   52:astore          7
		if(com.google.android.gms.common.util.zzi.zzaJ(context))
	//*  28   54:aload_1         
	//*  29   55:invokestatic    #358 <Method boolean com.google.android.gms.common.util.zzi.zzaJ(Context)>
	//*  30   58:ifeq            187
		{
			zzac.zzar(zzs.zzyG());
	//   31   61:invokestatic    #361 <Method boolean zzs.zzyG()>
	//   32   64:invokestatic    #364 <Method void zzac.zzar(boolean)>
			pendingintent = ((PendingIntent) ((new android.app.Notification.Builder(context)).setSmallIcon(context.getApplicationInfo().icon).setPriority(2).setAutoCancel(true).setContentTitle(((CharSequence) (s1))).setStyle(((android.app.Notification.Style) ((new android.app.Notification.BigTextStyle()).bigText(((CharSequence) (s2)))))).addAction(com.google.android.gms.R.drawable.common_full_open_on_phone, ((CharSequence) (resources.getString(com.google.android.gms.R.string.common_open_on_phone))), pendingintent).build()));
	//   33   67:new             #366 <Class android.app.Notification$Builder>
	//   34   70:dup             
	//   35   71:aload_1         
	//   36   72:invokespecial   #367 <Method void android.app.Notification$Builder(Context)>
	//   37   75:aload_1         
	//   38   76:invokevirtual   #371 <Method ApplicationInfo Context.getApplicationInfo()>
	//   39   79:getfield        #376 <Field int ApplicationInfo.icon>
	//   40   82:invokevirtual   #380 <Method android.app.Notification$Builder android.app.Notification$Builder.setSmallIcon(int)>
	//   41   85:iconst_2        
	//   42   86:invokevirtual   #383 <Method android.app.Notification$Builder android.app.Notification$Builder.setPriority(int)>
	//   43   89:iconst_1        
	//   44   90:invokevirtual   #387 <Method android.app.Notification$Builder android.app.Notification$Builder.setAutoCancel(boolean)>
	//   45   93:aload           5
	//   46   95:invokevirtual   #391 <Method android.app.Notification$Builder android.app.Notification$Builder.setContentTitle(CharSequence)>
	//   47   98:new             #393 <Class android.app.Notification$BigTextStyle>
	//   48  101:dup             
	//   49  102:invokespecial   #394 <Method void android.app.Notification$BigTextStyle()>
	//   50  105:aload           6
	//   51  107:invokevirtual   #398 <Method android.app.Notification$BigTextStyle android.app.Notification$BigTextStyle.bigText(CharSequence)>
	//   52  110:invokevirtual   #402 <Method android.app.Notification$Builder android.app.Notification$Builder.setStyle(android.app.Notification$Style)>
	//   53  113:getstatic       #407 <Field int com.google.android.gms.R$drawable.common_full_open_on_phone>
	//   54  116:aload           7
	//   55  118:getstatic       #412 <Field int com.google.android.gms.R$string.common_open_on_phone>
	//   56  121:invokevirtual   #415 <Method String Resources.getString(int)>
	//   57  124:aload           4
	//   58  126:invokevirtual   #419 <Method android.app.Notification$Builder android.app.Notification$Builder.addAction(int, CharSequence, PendingIntent)>
	//   59  129:invokevirtual   #423 <Method android.app.Notification android.app.Notification$Builder.build()>
	//   60  132:astore          4
		} else
	//*  61  134:iload_2         
	//*  62  135:tableswitch     1 3: default 160
	//	               1 264
	//	               2 264
	//	               3 264
	//*  63  160:ldc2            #424 <Int 39789>
	//*  64  163:istore_2        
	//*  65  164:aload_1         
	//*  66  165:ldc2            #426 <String "notification">
	//*  67  168:invokevirtual   #430 <Method Object Context.getSystemService(String)>
	//*  68  171:checkcast       #432 <Class NotificationManager>
	//*  69  174:astore_1        
	//*  70  175:aload_3         
	//*  71  176:ifnonnull       278
	//*  72  179:aload_1         
	//*  73  180:iload_2         
	//*  74  181:aload           4
	//*  75  183:invokevirtual   #436 <Method void NotificationManager.notify(int, android.app.Notification)>
	//*  76  186:return          
		{
			pendingintent = ((PendingIntent) ((new android.support.v4.app.NotificationCompat.Builder(context)).setSmallIcon(0x108008a).setTicker(((CharSequence) (resources.getString(com.google.android.gms.R.string.common_google_play_services_notification_ticker)))).setWhen(System.currentTimeMillis()).setAutoCancel(true).setContentIntent(pendingintent).setContentTitle(((CharSequence) (s1))).setContentText(((CharSequence) (s2))).setLocalOnly(true).setStyle(((android.support.v4.app.NotificationCompat.Style) ((new android.support.v4.app.NotificationCompat.BigTextStyle()).bigText(((CharSequence) (s2)))))).build()));
	//   77  187:new             #438 <Class android.support.v4.app.NotificationCompat$Builder>
	//   78  190:dup             
	//   79  191:aload_1         
	//   80  192:invokespecial   #439 <Method void android.support.v4.app.NotificationCompat$Builder(Context)>
	//   81  195:ldc2            #440 <Int 0x108008a>
	//   82  198:invokevirtual   #443 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setSmallIcon(int)>
	//   83  201:aload           7
	//   84  203:getstatic       #446 <Field int com.google.android.gms.R$string.common_google_play_services_notification_ticker>
	//   85  206:invokevirtual   #415 <Method String Resources.getString(int)>
	//   86  209:invokevirtual   #450 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setTicker(CharSequence)>
	//   87  212:invokestatic    #456 <Method long System.currentTimeMillis()>
	//   88  215:invokevirtual   #460 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setWhen(long)>
	//   89  218:iconst_1        
	//   90  219:invokevirtual   #463 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setAutoCancel(boolean)>
	//   91  222:aload           4
	//   92  224:invokevirtual   #467 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentIntent(PendingIntent)>
	//   93  227:aload           5
	//   94  229:invokevirtual   #469 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentTitle(CharSequence)>
	//   95  232:aload           6
	//   96  234:invokevirtual   #472 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setContentText(CharSequence)>
	//   97  237:iconst_1        
	//   98  238:invokevirtual   #475 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setLocalOnly(boolean)>
	//   99  241:new             #477 <Class android.support.v4.app.NotificationCompat$BigTextStyle>
	//  100  244:dup             
	//  101  245:invokespecial   #478 <Method void android.support.v4.app.NotificationCompat$BigTextStyle()>
	//  102  248:aload           6
	//  103  250:invokevirtual   #481 <Method android.support.v4.app.NotificationCompat$BigTextStyle android.support.v4.app.NotificationCompat$BigTextStyle.bigText(CharSequence)>
	//  104  253:invokevirtual   #484 <Method android.support.v4.app.NotificationCompat$Builder android.support.v4.app.NotificationCompat$Builder.setStyle(android.support.v4.app.NotificationCompat$Style)>
	//  105  256:invokevirtual   #485 <Method android.app.Notification android.support.v4.app.NotificationCompat$Builder.build()>
	//  106  259:astore          4
		}
		switch(i)
		{
		default:
			i = 39789;
			break;

		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
			break MISSING_BLOCK_LABEL_264;
		}
_L5:
		context = ((Context) ((NotificationManager)context.getSystemService("notification")));
		if(s == null)
		{
			((NotificationManager) (context)).notify(i, ((android.app.Notification) (pendingintent)));
			return;
		} else
	//* 107  261:goto            134
	//* 108  264:getstatic       #491 <Field AtomicBoolean zze.zzaxp>
	//* 109  267:iconst_0        
	//* 110  268:invokevirtual   #496 <Method void AtomicBoolean.set(boolean)>
	//* 111  271:sipush          10436
	//* 112  274:istore_2        
	//* 113  275:goto            164
		{
			((NotificationManager) (context)).notify(s, i, ((android.app.Notification) (pendingintent)));
	//  114  278:aload_1         
	//  115  279:aload_3         
	//  116  280:iload_2         
	//  117  281:aload           4
	//  118  283:invokevirtual   #499 <Method void NotificationManager.notify(String, int, android.app.Notification)>
			return;
	//  119  286:return          
		}
		zze.zzaxp.set(false);
		i = 10436;
		  goto _L5
	}

	public void zza(Context context, ConnectionResult connectionresult, int i)
	{
		PendingIntent pendingintent = getErrorResolutionPendingIntent(context, connectionresult);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #141 <Method PendingIntent getErrorResolutionPendingIntent(Context, ConnectionResult)>
	//    4    6:astore          4
		if(pendingintent != null)
	//*   5    8:aload           4
	//*   6   10:ifnull          30
			zza(context, connectionresult.getErrorCode(), ((String) (null)), GoogleApiActivity.zza(context, pendingintent, i));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #69  <Method int ConnectionResult.getErrorCode()>
	//   11   19:aconst_null     
	//   12   20:aload_1         
	//   13   21:aload           4
	//   14   23:iload_3         
	//   15   24:invokestatic    #505 <Method PendingIntent GoogleApiActivity.zza(Context, PendingIntent, int)>
	//   16   27:invokevirtual   #144 <Method void zza(Context, int, String, PendingIntent)>
	//   17   30:return          
	}

	public boolean zza(Activity activity, zzaax zzaax, int i, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		zzaax = ((zzaax) (zza(((Context) (activity)), i, zzi.zza(zzaax, zzb(((Context) (activity)), i, "d"), j), oncancellistener)));
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
	//   10   14:invokestatic    #510 <Method zzi zzi.zza(zzaax, Intent, int)>
	//   11   17:aload           5
	//   12   19:invokevirtual   #48  <Method Dialog zza(Context, int, zzi, android.content.DialogInterface$OnCancelListener)>
	//   13   22:astore_2        
		if(zzaax == null)
	//*  14   23:aload_2         
	//*  15   24:ifnonnull       29
		{
			return false;
	//   16   27:iconst_0        
	//   17   28:ireturn         
		} else
		{
			zza(activity, ((Dialog) (zzaax)), "GooglePlayServicesErrorDialog", oncancellistener);
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

	public int zzak(Context context)
	{
		return super.zzak(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #513 <Method int zzc.zzak(Context)>
	//    3    5:ireturn         
	}

	void zzal(Context context)
	{
		((Handler) (new zza(context))).sendEmptyMessageDelayed(1, 0x1d4c0L);
	//    0    0:new             #6   <Class GoogleApiAvailability$zza>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #516 <Method void GoogleApiAvailability$zza(GoogleApiAvailability, Context)>
	//    5    9:iconst_1        
	//    6   10:ldc2w           #517 <Long 0x1d4c0L>
	//    7   13:invokevirtual   #524 <Method boolean Handler.sendEmptyMessageDelayed(int, long)>
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
	//    4    4:invokespecial   #525 <Method Intent zzc.zzb(Context, int, String)>
	//    5    7:areturn         
	}

	public Intent zzcr(int i)
	{
		return super.zzcr(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #530 <Method Intent zzc.zzcr(int)>
	//    3    5:areturn         
	}

	public boolean zzd(Context context, int i)
	{
		return super.zzd(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #535 <Method boolean zzc.zzd(Context, int)>
	//    4    6:ireturn         
	}

	public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
	public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
	private static final GoogleApiAvailability zzaxa = new GoogleApiAvailability();

	static 
	{
	//    0    0:new             #2   <Class GoogleApiAvailability>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void GoogleApiAvailability()>
	//    3    7:putstatic       #22  <Field GoogleApiAvailability zzaxa>
		GOOGLE_PLAY_SERVICES_VERSION_CODE = zzc.GOOGLE_PLAY_SERVICES_VERSION_CODE;
	//    4   10:getstatic       #24  <Field int zzc.GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    5   13:putstatic       #25  <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//*   6   16:return          
	}
}
