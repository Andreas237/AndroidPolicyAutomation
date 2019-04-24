// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.app.*;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.Fragment;
import com.google.android.gms.common.internal.zzi;

// Referenced classes of package com.google.android.gms.common:
//			zze, GoogleApiAvailability

public final class GooglePlayServicesUtil extends zze
{

	private GooglePlayServicesUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void zze()>
	//    2    4:return          
	}

	public static Dialog getErrorDialog(int i, Activity activity, int j)
	{
		return getErrorDialog(i, activity, j, ((android.content.DialogInterface.OnCancelListener) (null)));
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokestatic    #31  <Method Dialog getErrorDialog(int, Activity, int, android.content.DialogInterface$OnCancelListener)>
	//    5    7:areturn         
	}

	public static Dialog getErrorDialog(int i, Activity activity, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		int k = i;
	//    0    0:iload_0         
	//    1    1:istore          4
		if(zzd(((Context) (activity)), i))
	//*   2    3:aload_1         
	//*   3    4:iload_0         
	//*   4    5:invokestatic    #36  <Method boolean zzd(Context, int)>
	//*   5    8:ifeq            15
			k = 18;
	//    6   11:bipush          18
	//    7   13:istore          4
		return GoogleApiAvailability.getInstance().getErrorDialog(activity, k, j, oncancellistener);
	//    8   15:invokestatic    #42  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//    9   18:aload_1         
	//   10   19:iload           4
	//   11   21:iload_2         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #45  <Method Dialog GoogleApiAvailability.getErrorDialog(Activity, int, int, android.content.DialogInterface$OnCancelListener)>
	//   14   26:areturn         
	}

	public static PendingIntent getErrorPendingIntent(int i, Context context, int j)
	{
		return com.google.android.gms.common.zze.getErrorPendingIntent(i, context, j);
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #49  <Method PendingIntent zze.getErrorPendingIntent(int, Context, int)>
	//    4    6:areturn         
	}

	public static String getErrorString(int i)
	{
		return com.google.android.gms.common.zze.getErrorString(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #53  <Method String zze.getErrorString(int)>
	//    2    4:areturn         
	}

	public static String getOpenSourceSoftwareLicenseInfo(Context context)
	{
		return com.google.android.gms.common.zze.getOpenSourceSoftwareLicenseInfo(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #57  <Method String zze.getOpenSourceSoftwareLicenseInfo(Context)>
	//    2    4:areturn         
	}

	public static Context getRemoteContext(Context context)
	{
		return com.google.android.gms.common.zze.getRemoteContext(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #61  <Method Context zze.getRemoteContext(Context)>
	//    2    4:areturn         
	}

	public static Resources getRemoteResource(Context context)
	{
		return com.google.android.gms.common.zze.getRemoteResource(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #65  <Method Resources zze.getRemoteResource(Context)>
	//    2    4:areturn         
	}

	public static int isGooglePlayServicesAvailable(Context context)
	{
		return com.google.android.gms.common.zze.isGooglePlayServicesAvailable(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #69  <Method int zze.isGooglePlayServicesAvailable(Context)>
	//    2    4:ireturn         
	}

	public static boolean isUserRecoverableError(int i)
	{
		return com.google.android.gms.common.zze.isUserRecoverableError(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #73  <Method boolean zze.isUserRecoverableError(int)>
	//    2    4:ireturn         
	}

	public static boolean showErrorDialogFragment(int i, Activity activity, int j)
	{
		return showErrorDialogFragment(i, activity, j, ((android.content.DialogInterface.OnCancelListener) (null)));
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokestatic    #78  <Method boolean showErrorDialogFragment(int, Activity, int, android.content.DialogInterface$OnCancelListener)>
	//    5    7:ireturn         
	}

	public static boolean showErrorDialogFragment(int i, Activity activity, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		return showErrorDialogFragment(i, activity, ((Fragment) (null)), j, oncancellistener);
	//    0    0:iload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:iload_2         
	//    4    4:aload_3         
	//    5    5:invokestatic    #81  <Method boolean showErrorDialogFragment(int, Activity, Fragment, int, android.content.DialogInterface$OnCancelListener)>
	//    6    8:ireturn         
	}

	public static boolean showErrorDialogFragment(int i, Activity activity, Fragment fragment, int j, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		int k = i;
	//    0    0:iload_0         
	//    1    1:istore          5
		if(zzd(((Context) (activity)), i))
	//*   2    3:aload_1         
	//*   3    4:iload_0         
	//*   4    5:invokestatic    #36  <Method boolean zzd(Context, int)>
	//*   5    8:ifeq            15
			k = 18;
	//    6   11:bipush          18
	//    7   13:istore          5
		GoogleApiAvailability googleapiavailability = GoogleApiAvailability.getInstance();
	//    8   15:invokestatic    #42  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//    9   18:astore          6
		if(fragment == null)
	//*  10   20:aload_2         
	//*  11   21:ifnonnull       36
			return googleapiavailability.showErrorDialogFragment(activity, k, j, oncancellistener);
	//   12   24:aload           6
	//   13   26:aload_1         
	//   14   27:iload           5
	//   15   29:iload_3         
	//   16   30:aload           4
	//   17   32:invokevirtual   #84  <Method boolean GoogleApiAvailability.showErrorDialogFragment(Activity, int, int, android.content.DialogInterface$OnCancelListener)>
	//   18   35:ireturn         
		fragment = ((Fragment) (googleapiavailability.zza(((Context) (activity)), k, zzi.zza(fragment, GoogleApiAvailability.getInstance().zzb(((Context) (activity)), k, "d"), j), oncancellistener)));
	//   19   36:aload           6
	//   20   38:aload_1         
	//   21   39:iload           5
	//   22   41:aload_2         
	//   23   42:invokestatic    #42  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//   24   45:aload_1         
	//   25   46:iload           5
	//   26   48:ldc1            #86  <String "d">
	//   27   50:invokevirtual   #90  <Method android.content.Intent GoogleApiAvailability.zzb(Context, int, String)>
	//   28   53:iload_3         
	//   29   54:invokestatic    #96  <Method zzi zzi.zza(Fragment, android.content.Intent, int)>
	//   30   57:aload           4
	//   31   59:invokevirtual   #99  <Method Dialog GoogleApiAvailability.zza(Context, int, zzi, android.content.DialogInterface$OnCancelListener)>
	//   32   62:astore_2        
		if(fragment == null)
	//*  33   63:aload_2         
	//*  34   64:ifnonnull       69
		{
			return false;
	//   35   67:iconst_0        
	//   36   68:ireturn         
		} else
		{
			googleapiavailability.zza(activity, ((Dialog) (fragment)), "GooglePlayServicesErrorDialog", oncancellistener);
	//   37   69:aload           6
	//   38   71:aload_1         
	//   39   72:aload_2         
	//   40   73:ldc1            #8   <String "GooglePlayServicesErrorDialog">
	//   41   75:aload           4
	//   42   77:invokevirtual   #102 <Method void GoogleApiAvailability.zza(Activity, Dialog, String, android.content.DialogInterface$OnCancelListener)>
			return true;
	//   43   80:iconst_1        
	//   44   81:ireturn         
		}
	}

	public static void showErrorNotification(int i, Context context)
	{
		GoogleApiAvailability googleapiavailability = GoogleApiAvailability.getInstance();
	//    0    0:invokestatic    #42  <Method GoogleApiAvailability GoogleApiAvailability.getInstance()>
	//    1    3:astore_2        
		if(zzd(context, i) || zze(context, i))
	//*   2    4:aload_1         
	//*   3    5:iload_0         
	//*   4    6:invokestatic    #36  <Method boolean zzd(Context, int)>
	//*   5    9:ifne            20
	//*   6   12:aload_1         
	//*   7   13:iload_0         
	//*   8   14:invokestatic    #107 <Method boolean zze(Context, int)>
	//*   9   17:ifeq            26
		{
			googleapiavailability.zzal(context);
	//   10   20:aload_2         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #111 <Method void GoogleApiAvailability.zzal(Context)>
			return;
	//   13   25:return          
		} else
		{
			googleapiavailability.showErrorNotification(context, i);
	//   14   26:aload_2         
	//   15   27:aload_1         
	//   16   28:iload_0         
	//   17   29:invokevirtual   #114 <Method void GoogleApiAvailability.showErrorNotification(Context, int)>
			return;
	//   18   32:return          
		}
	}

	public static boolean zzd(Context context, int i)
	{
		return com.google.android.gms.common.zze.zzd(context, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #115 <Method boolean zze.zzd(Context, int)>
	//    3    5:ireturn         
	}

	public static boolean zze(Context context, int i)
	{
		return com.google.android.gms.common.zze.zze(context, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #116 <Method boolean zze.zze(Context, int)>
	//    3    5:ireturn         
	}

	public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
	public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
	public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
	public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

	static 
	{
		GOOGLE_PLAY_SERVICES_VERSION_CODE = zze.GOOGLE_PLAY_SERVICES_VERSION_CODE;
	//    0    0:getstatic       #21  <Field int zze.GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    1    3:putstatic       #22  <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//*   2    6:return          
	}
}
