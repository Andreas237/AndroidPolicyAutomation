// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;

// Referenced classes of package com.google.android.gms.common:
//			GooglePlayServicesUtilLight

public class GoogleApiAvailabilityLight
{

	GoogleApiAvailabilityLight()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
	//    2    4:return          
	}

	public static GoogleApiAvailabilityLight getInstance()
	{
		return zzm;
	//    0    0:getstatic       #35  <Field GoogleApiAvailabilityLight zzm>
	//    1    3:areturn         
	}

	private static String zza(Context context, String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #47  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("gcore_");
	//    4    8:aload_2         
	//    5    9:ldc1            #50  <String "gcore_">
	//    6   11:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
	//    8   15:aload_2         
	//    9   16:getstatic       #30  <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//   10   19:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   11   22:pop             
		stringbuilder.append("-");
	//   12   23:aload_2         
	//   13   24:ldc1            #59  <String "-">
	//   14   26:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  16   30:aload_1         
	//*  17   31:invokestatic    #65  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   34:ifne            43
			stringbuilder.append(s);
	//   19   37:aload_2         
	//   20   38:aload_1         
	//   21   39:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		stringbuilder.append("-");
	//   23   43:aload_2         
	//   24   44:ldc1            #59  <String "-">
	//   25   46:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		if(context != null)
	//*  27   50:aload_0         
	//*  28   51:ifnull          63
			stringbuilder.append(context.getPackageName());
	//   29   54:aload_2         
	//   30   55:aload_0         
	//   31   56:invokevirtual   #71  <Method String Context.getPackageName()>
	//   32   59:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   33   62:pop             
		stringbuilder.append("-");
	//   34   63:aload_2         
	//   35   64:ldc1            #59  <String "-">
	//   36   66:invokevirtual   #54  <Method StringBuilder StringBuilder.append(String)>
	//   37   69:pop             
		if(context != null)
	//*  38   70:aload_0         
	//*  39   71:ifnull          94
			try
			{
				stringbuilder.append(Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionCode);
	//   40   74:aload_2         
	//   41   75:aload_0         
	//   42   76:invokestatic    #77  <Method PackageManagerWrapper Wrappers.packageManager(Context)>
	//   43   79:aload_0         
	//   44   80:invokevirtual   #71  <Method String Context.getPackageName()>
	//   45   83:iconst_0        
	//   46   84:invokevirtual   #83  <Method PackageInfo PackageManagerWrapper.getPackageInfo(String, int)>
	//   47   87:getfield        #88  <Field int PackageInfo.versionCode>
	//   48   90:invokevirtual   #57  <Method StringBuilder StringBuilder.append(int)>
	//   49   93:pop             
			}
	//*  50   94:aload_2         
	//*  51   95:invokevirtual   #91  <Method String StringBuilder.toString()>
	//*  52   98:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context) { }
	//   53   99:astore_0        
		return stringbuilder.toString();
	//*  54  100:goto            94
	}

	public void cancelAvailabilityErrorNotifications(Context context)
	{
		GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(context);
	//    0    0:aload_1         
	//    1    1:invokestatic    #95  <Method void GooglePlayServicesUtilLight.cancelAvailabilityErrorNotifications(Context)>
	//    2    4:return          
	}

	public int getApkVersion(Context context)
	{
		return GooglePlayServicesUtilLight.getApkVersion(context);
	//    0    0:aload_1         
	//    1    1:invokestatic    #99  <Method int GooglePlayServicesUtilLight.getApkVersion(Context)>
	//    2    4:ireturn         
	}

	public int getClientVersion(Context context)
	{
		return GooglePlayServicesUtilLight.getClientVersion(context);
	//    0    0:aload_1         
	//    1    1:invokestatic    #102 <Method int GooglePlayServicesUtilLight.getClientVersion(Context)>
	//    2    4:ireturn         
	}

	public Intent getErrorResolutionIntent(int i)
	{
		return getErrorResolutionIntent(((Context) (null)), i, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iload_1         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #108 <Method Intent getErrorResolutionIntent(Context, int, String)>
	//    5    7:areturn         
	}

	public Intent getErrorResolutionIntent(Context context, int i, String s)
	{
		switch(i)
	//*   0    0:iload_2         
		{
	//*   1    1:tableswitch     1 3: default 28
	//	               1 36
	//	               2 36
	//	               3 30
		default:
			return null;
	//    2   28:aconst_null     
	//    3   29:areturn         

		case 3: // '\003'
			return zzg.zzg("com.google.android.gms");
	//    4   30:ldc1            #10  <String "com.google.android.gms">
	//    5   32:invokestatic    #115 <Method Intent zzg.zzg(String)>
	//    6   35:areturn         

		case 1: // '\001'
		case 2: // '\002'
			break;
		}
		if(context != null && DeviceProperties.isWearableWithoutPlayStore(context))
	//*   7   36:aload_1         
	//*   8   37:ifnull          51
	//*   9   40:aload_1         
	//*  10   41:invokestatic    #121 <Method boolean DeviceProperties.isWearableWithoutPlayStore(Context)>
	//*  11   44:ifeq            51
			return zzg.zzs();
	//   12   47:invokestatic    #125 <Method Intent zzg.zzs()>
	//   13   50:areturn         
		else
			return zzg.zza("com.google.android.gms", zza(context, s));
	//   14   51:ldc1            #10  <String "com.google.android.gms">
	//   15   53:aload_1         
	//   16   54:aload_3         
	//   17   55:invokestatic    #127 <Method String zza(Context, String)>
	//   18   58:invokestatic    #130 <Method Intent zzg.zza(String, String)>
	//   19   61:areturn         
	}

	public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int j)
	{
		return getErrorResolutionPendingIntent(context, i, j, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #135 <Method PendingIntent getErrorResolutionPendingIntent(Context, int, int, String)>
	//    6    8:areturn         
	}

	public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int j, String s)
	{
		s = ((String) (getErrorResolutionIntent(context, i, s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload           4
	//    4    5:invokevirtual   #108 <Method Intent getErrorResolutionIntent(Context, int, String)>
	//    5    8:astore          4
		if(s == null)
	//*   6   10:aload           4
	//*   7   12:ifnonnull       17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		else
			return PendingIntent.getActivity(context, j, ((Intent) (s)), 0x8000000);
	//   10   17:aload_1         
	//   11   18:iload_3         
	//   12   19:aload           4
	//   13   21:ldc1            #136 <Int 0x8000000>
	//   14   23:invokestatic    #142 <Method PendingIntent PendingIntent.getActivity(Context, int, Intent, int)>
	//   15   26:areturn         
	}

	public String getErrorString(int i)
	{
		return GooglePlayServicesUtilLight.getErrorString(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #146 <Method String GooglePlayServicesUtilLight.getErrorString(int)>
	//    2    4:areturn         
	}

	public int isGooglePlayServicesAvailable(Context context)
	{
		return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #30  <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    3    5:invokevirtual   #151 <Method int isGooglePlayServicesAvailable(Context, int)>
	//    4    8:ireturn         
	}

	public int isGooglePlayServicesAvailable(Context context, int i)
	{
		int j = GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #152 <Method int GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(Context, int)>
	//    3    5:istore_3        
		i = j;
	//    4    6:iload_3         
	//    5    7:istore_2        
		if(GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, j))
	//*   6    8:aload_1         
	//*   7    9:iload_3         
	//*   8   10:invokestatic    #156 <Method boolean GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(Context, int)>
	//*   9   13:ifeq            19
			i = 18;
	//   10   16:bipush          18
	//   11   18:istore_2        
		return i;
	//   12   19:iload_2         
	//   13   20:ireturn         
	}

	public boolean isPlayServicesPossiblyUpdating(Context context, int i)
	{
		return GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #156 <Method boolean GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(Context, int)>
	//    3    5:ireturn         
	}

	public boolean isPlayStorePossiblyUpdating(Context context, int i)
	{
		return GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #159 <Method boolean GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(Context, int)>
	//    3    5:ireturn         
	}

	public boolean isUninstalledAppPossiblyUpdating(Context context, String s)
	{
		return GooglePlayServicesUtilLight.isUninstalledAppPossiblyUpdating(context, s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #163 <Method boolean GooglePlayServicesUtilLight.isUninstalledAppPossiblyUpdating(Context, String)>
	//    3    5:ireturn         
	}

	public boolean isUserResolvableError(int i)
	{
		return GooglePlayServicesUtilLight.isUserRecoverableError(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #168 <Method boolean GooglePlayServicesUtilLight.isUserRecoverableError(int)>
	//    2    4:ireturn         
	}

	public void verifyGooglePlayServicesIsAvailable(Context context, int i)
	{
		GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #173 <Method void GooglePlayServicesUtilLight.ensurePlayServicesAvailable(Context, int)>
	//    3    5:return          
	}

	public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
	public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE;
	public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
	static final String TRACKING_SOURCE_DIALOG = "d";
	static final String TRACKING_SOURCE_NOTIFICATION = "n";
	private static final GoogleApiAvailabilityLight zzm = new GoogleApiAvailabilityLight();

	static 
	{
		GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
	//    0    0:getstatic       #29  <Field int GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    1    3:putstatic       #30  <Field int GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    2    6:new             #2   <Class GoogleApiAvailabilityLight>
	//    3    9:dup             
	//    4   10:invokespecial   #33  <Method void GoogleApiAvailabilityLight()>
	//    5   13:putstatic       #35  <Field GoogleApiAvailabilityLight zzm>
	//*   6   16:return          
	}
}
