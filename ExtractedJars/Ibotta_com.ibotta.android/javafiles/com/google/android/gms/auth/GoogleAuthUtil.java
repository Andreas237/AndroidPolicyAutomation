// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.*;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//			zzg, GooglePlayServicesAvailabilityException, GoogleAuthException, UserRecoverableAuthException, 
//			UserRecoverableNotifiedException, TokenData

public final class GoogleAuthUtil extends zzg
{

	private GoogleAuthUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void zzg()>
	//    2    4:return          
	}

	public static void clearToken(Context context, String s)
		throws GooglePlayServicesAvailabilityException, GoogleAuthException, IOException
	{
		zzg.clearToken(context, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #47  <Method void zzg.clearToken(Context, String)>
	//    3    5:return          
	}

	public static List getAccountChangeEvents(Context context, int i, String s)
		throws GoogleAuthException, IOException
	{
		return zzg.getAccountChangeEvents(context, i, s);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #52  <Method List zzg.getAccountChangeEvents(Context, int, String)>
	//    4    6:areturn         
	}

	public static String getAccountId(Context context, String s)
		throws GoogleAuthException, IOException
	{
		return zzg.getAccountId(context, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #58  <Method String zzg.getAccountId(Context, String)>
	//    3    5:areturn         
	}

	public static String getToken(Context context, Account account, String s)
		throws IOException, UserRecoverableAuthException, GoogleAuthException
	{
		return zzg.getToken(context, account, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #64  <Method String zzg.getToken(Context, Account, String)>
	//    4    6:areturn         
	}

	public static String getToken(Context context, Account account, String s, Bundle bundle)
		throws IOException, UserRecoverableAuthException, GoogleAuthException
	{
		return zzg.getToken(context, account, s, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #67  <Method String zzg.getToken(Context, Account, String, Bundle)>
	//    5    7:areturn         
	}

	public static String getToken(Context context, String s, String s1)
		throws IOException, UserRecoverableAuthException, GoogleAuthException
	{
		return zzg.getToken(context, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #71  <Method String zzg.getToken(Context, String, String)>
	//    4    6:areturn         
	}

	public static String getToken(Context context, String s, String s1, Bundle bundle)
		throws IOException, UserRecoverableAuthException, GoogleAuthException
	{
		return zzg.getToken(context, s, s1, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #75  <Method String zzg.getToken(Context, String, String, Bundle)>
	//    5    7:areturn         
	}

	public static String getTokenWithNotification(Context context, Account account, String s, Bundle bundle)
		throws IOException, UserRecoverableNotifiedException, GoogleAuthException
	{
		Bundle bundle1 = bundle;
	//    0    0:aload_3         
	//    1    1:astore          4
		if(bundle == null)
	//*   2    3:aload_3         
	//*   3    4:ifnonnull       16
			bundle1 = new Bundle();
	//    4    7:new             #80  <Class Bundle>
	//    5   10:dup             
	//    6   11:invokespecial   #81  <Method void Bundle()>
	//    7   14:astore          4
		bundle1.putBoolean("handle_notification", true);
	//    8   16:aload           4
	//    9   18:ldc1            #83  <String "handle_notification">
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #87  <Method void Bundle.putBoolean(String, boolean)>
		return zzd(context, account, s, bundle1).zze();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:aload           4
	//   16   29:invokestatic    #91  <Method TokenData zzd(Context, Account, String, Bundle)>
	//   17   32:invokevirtual   #97  <Method String TokenData.zze()>
	//   18   35:areturn         
	}

	public static String getTokenWithNotification(Context context, Account account, String s, Bundle bundle, Intent intent)
		throws IOException, UserRecoverableNotifiedException, GoogleAuthException
	{
		if(intent != null)
	//*   0    0:aload           4
	//*   1    2:ifnull          75
		{
			Object obj = ((Object) (intent.toUri(1)));
	//    2    5:aload           4
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #106 <Method String Intent.toUri(int)>
	//    5   11:astore          5
			try
			{
				Intent.parseUri(((String) (obj)), 1);
	//    6   13:aload           5
	//    7   15:iconst_1        
	//    8   16:invokestatic    #110 <Method Intent Intent.parseUri(String, int)>
	//    9   19:pop             
			}
	//*  10   20:aload_3         
	//*  11   21:astore          5
	//*  12   23:aload_3         
	//*  13   24:ifnonnull       36
	//*  14   27:new             #80  <Class Bundle>
	//*  15   30:dup             
	//*  16   31:invokespecial   #81  <Method void Bundle()>
	//*  17   34:astore          5
	//*  18   36:aload           5
	//*  19   38:ldc1            #112 <String "callback_intent">
	//*  20   40:aload           4
	//*  21   42:invokevirtual   #116 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
	//*  22   45:aload           5
	//*  23   47:ldc1            #83  <String "handle_notification">
	//*  24   49:iconst_1        
	//*  25   50:invokevirtual   #87  <Method void Bundle.putBoolean(String, boolean)>
	//*  26   53:aload_0         
	//*  27   54:aload_1         
	//*  28   55:aload_2         
	//*  29   56:aload           5
	//*  30   58:invokestatic    #91  <Method TokenData zzd(Context, Account, String, Bundle)>
	//*  31   61:invokevirtual   #97  <Method String TokenData.zze()>
	//*  32   64:areturn         
	//*  33   65:new             #118 <Class IllegalArgumentException>
	//*  34   68:dup             
	//*  35   69:ldc1            #120 <String "Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().">
	//*  36   71:invokespecial   #123 <Method void IllegalArgumentException(String)>
	//*  37   74:athrow          
	//*  38   75:new             #118 <Class IllegalArgumentException>
	//*  39   78:dup             
	//*  40   79:ldc1            #125 <String "Callback cannot be null.">
	//*  41   81:invokespecial   #123 <Method void IllegalArgumentException(String)>
	//*  42   84:athrow          
			// Misplaced declaration of an exception variable
			catch(Context context)
			{
				throw new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
			}
			obj = ((Object) (bundle));
			if(bundle == null)
				obj = ((Object) (new Bundle()));
			((Bundle) (obj)).putParcelable("callback_intent", ((android.os.Parcelable) (intent)));
			((Bundle) (obj)).putBoolean("handle_notification", true);
			return zzd(context, account, s, ((Bundle) (obj))).zze();
		} else
		{
			throw new IllegalArgumentException("Callback cannot be null.");
		}
	//*  43   85:astore_0        
	//*  44   86:goto            65
	}

	public static String getTokenWithNotification(Context context, Account account, String s, Bundle bundle, String s1, Bundle bundle1)
		throws IOException, UserRecoverableNotifiedException, GoogleAuthException
	{
		Preconditions.checkNotEmpty(s1, "Authority cannot be empty or null.");
	//    0    0:aload           4
	//    1    2:ldc1            #128 <String "Authority cannot be empty or null.">
	//    2    4:invokestatic    #134 <Method String Preconditions.checkNotEmpty(String, Object)>
	//    3    7:pop             
		Bundle bundle2 = bundle;
	//    4    8:aload_3         
	//    5    9:astore          6
		if(bundle == null)
	//*   6   11:aload_3         
	//*   7   12:ifnonnull       24
			bundle2 = new Bundle();
	//    8   15:new             #80  <Class Bundle>
	//    9   18:dup             
	//   10   19:invokespecial   #81  <Method void Bundle()>
	//   11   22:astore          6
		bundle = bundle1;
	//   12   24:aload           5
	//   13   26:astore_3        
		if(bundle1 == null)
	//*  14   27:aload           5
	//*  15   29:ifnonnull       40
			bundle = new Bundle();
	//   16   32:new             #80  <Class Bundle>
	//   17   35:dup             
	//   18   36:invokespecial   #81  <Method void Bundle()>
	//   19   39:astore_3        
		ContentResolver.validateSyncExtrasBundle(bundle);
	//   20   40:aload_3         
	//   21   41:invokestatic    #140 <Method void ContentResolver.validateSyncExtrasBundle(Bundle)>
		bundle2.putString("authority", s1);
	//   22   44:aload           6
	//   23   46:ldc1            #142 <String "authority">
	//   24   48:aload           4
	//   25   50:invokevirtual   #146 <Method void Bundle.putString(String, String)>
		bundle2.putBundle("sync_extras", bundle);
	//   26   53:aload           6
	//   27   55:ldc1            #148 <String "sync_extras">
	//   28   57:aload_3         
	//   29   58:invokevirtual   #152 <Method void Bundle.putBundle(String, Bundle)>
		bundle2.putBoolean("handle_notification", true);
	//   30   61:aload           6
	//   31   63:ldc1            #83  <String "handle_notification">
	//   32   65:iconst_1        
	//   33   66:invokevirtual   #87  <Method void Bundle.putBoolean(String, boolean)>
		return zzd(context, account, s, bundle2).zze();
	//   34   69:aload_0         
	//   35   70:aload_1         
	//   36   71:aload_2         
	//   37   72:aload           6
	//   38   74:invokestatic    #91  <Method TokenData zzd(Context, Account, String, Bundle)>
	//   39   77:invokevirtual   #97  <Method String TokenData.zze()>
	//   40   80:areturn         
	}

	public static String getTokenWithNotification(Context context, String s, String s1, Bundle bundle)
		throws IOException, UserRecoverableNotifiedException, GoogleAuthException
	{
		return getTokenWithNotification(context, new Account(s, "com.google"), s1, bundle);
	//    0    0:aload_0         
	//    1    1:new             #154 <Class Account>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:ldc1            #17  <String "com.google">
	//    5    8:invokespecial   #156 <Method void Account(String, String)>
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:invokestatic    #158 <Method String getTokenWithNotification(Context, Account, String, Bundle)>
	//    9   16:areturn         
	}

	public static String getTokenWithNotification(Context context, String s, String s1, Bundle bundle, Intent intent)
		throws IOException, UserRecoverableNotifiedException, GoogleAuthException
	{
		return getTokenWithNotification(context, new Account(s, "com.google"), s1, bundle, intent);
	//    0    0:aload_0         
	//    1    1:new             #154 <Class Account>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:ldc1            #17  <String "com.google">
	//    5    8:invokespecial   #156 <Method void Account(String, String)>
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:aload           4
	//    9   15:invokestatic    #161 <Method String getTokenWithNotification(Context, Account, String, Bundle, Intent)>
	//   10   18:areturn         
	}

	public static String getTokenWithNotification(Context context, String s, String s1, Bundle bundle, String s2, Bundle bundle1)
		throws IOException, UserRecoverableNotifiedException, GoogleAuthException
	{
		return getTokenWithNotification(context, new Account(s, "com.google"), s1, bundle, s2, bundle1);
	//    0    0:aload_0         
	//    1    1:new             #154 <Class Account>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:ldc1            #17  <String "com.google">
	//    5    8:invokespecial   #156 <Method void Account(String, String)>
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:aload           4
	//    9   15:aload           5
	//   10   17:invokestatic    #164 <Method String getTokenWithNotification(Context, Account, String, Bundle, String, Bundle)>
	//   11   20:areturn         
	}

	public static void invalidateToken(Context context, String s)
	{
		zzg.invalidateToken(context, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #170 <Method void zzg.invalidateToken(Context, String)>
	//    3    5:return          
	}

	public static Bundle removeAccount(Context context, Account account)
		throws GoogleAuthException, IOException
	{
		return zzg.removeAccount(context, account);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #177 <Method Bundle zzg.removeAccount(Context, Account)>
	//    3    5:areturn         
	}

	public static Boolean requestGoogleAccountsAccess(Context context)
		throws GoogleAuthException, IOException
	{
		return zzg.requestGoogleAccountsAccess(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #182 <Method Boolean zzg.requestGoogleAccountsAccess(Context)>
	//    2    4:areturn         
	}

	private static TokenData zzd(Context context, Account account, String s, Bundle bundle)
		throws IOException, GoogleAuthException
	{
		Bundle bundle1 = bundle;
	//    0    0:aload_3         
	//    1    1:astore          4
		if(bundle == null)
	//*   2    3:aload_3         
	//*   3    4:ifnonnull       16
			bundle1 = new Bundle();
	//    4    7:new             #80  <Class Bundle>
	//    5   10:dup             
	//    6   11:invokespecial   #81  <Method void Bundle()>
	//    7   14:astore          4
		try
		{
			account = ((Account) (zzg.zze(context, account, s, bundle1)));
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:aload           4
	//   12   21:invokestatic    #184 <Method TokenData zzg.zze(Context, Account, String, Bundle)>
	//   13   24:astore_1        
			GooglePlayServicesUtil.cancelAvailabilityErrorNotifications(context);
	//   14   25:aload_0         
	//   15   26:invokestatic    #190 <Method void GooglePlayServicesUtil.cancelAvailabilityErrorNotifications(Context)>
		}
	//*  16   29:aload_1         
	//*  17   30:areturn         
	//*  18   31:astore_1        
	//*  19   32:aload_0         
	//*  20   33:invokestatic    #190 <Method void GooglePlayServicesUtil.cancelAvailabilityErrorNotifications(Context)>
	//*  21   36:ldc1            #192 <String "GoogleAuthUtil">
	//*  22   38:ldc1            #194 <String "Error when getting token">
	//*  23   40:aload_1         
	//*  24   41:invokestatic    #200 <Method int Log.w(String, String, Throwable)>
	//*  25   44:pop             
	//*  26   45:new             #78  <Class UserRecoverableNotifiedException>
	//*  27   48:dup             
	//*  28   49:ldc1            #202 <String "User intervention required. Notification has been pushed.">
	//*  29   51:invokespecial   #203 <Method void UserRecoverableNotifiedException(String)>
	//*  30   54:athrow          
		// Misplaced declaration of an exception variable
		catch(Account account)
	//*  31   55:astore_1        
		{
			GooglePlayServicesUtil.showErrorNotification(((GooglePlayServicesAvailabilityException) (account)).getConnectionStatusCode(), context);
	//   32   56:aload_1         
	//   33   57:invokevirtual   #207 <Method int GooglePlayServicesAvailabilityException.getConnectionStatusCode()>
	//   34   60:aload_0         
	//   35   61:invokestatic    #211 <Method void GooglePlayServicesUtil.showErrorNotification(int, Context)>
			Log.w("GoogleAuthUtil", "Error when getting token", ((Throwable) (account)));
	//   36   64:ldc1            #192 <String "GoogleAuthUtil">
	//   37   66:ldc1            #194 <String "Error when getting token">
	//   38   68:aload_1         
	//   39   69:invokestatic    #200 <Method int Log.w(String, String, Throwable)>
	//   40   72:pop             
			throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
	//   41   73:new             #78  <Class UserRecoverableNotifiedException>
	//   42   76:dup             
	//   43   77:ldc1            #202 <String "User intervention required. Notification has been pushed.">
	//   44   79:invokespecial   #203 <Method void UserRecoverableNotifiedException(String)>
	//   45   82:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Account account)
		{
			GooglePlayServicesUtil.cancelAvailabilityErrorNotifications(context);
			Log.w("GoogleAuthUtil", "Error when getting token", ((Throwable) (account)));
			throw new UserRecoverableNotifiedException("User intervention required. Notification has been pushed.");
		}
		return ((TokenData) (account));
	}

	public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
	public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
	public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
	public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
	public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
	private static final String KEY_ANDROID_PACKAGE_NAME;
	private static final String KEY_CALLER_UID;
	public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
	public static final String WORK_ACCOUNT_TYPE = "com.google.work";

	static 
	{
		KEY_CALLER_UID = zzg.KEY_CALLER_UID;
	//    0    0:getstatic       #29  <Field String zzg.KEY_CALLER_UID>
	//    1    3:putstatic       #30  <Field String KEY_CALLER_UID>
		KEY_ANDROID_PACKAGE_NAME = zzg.KEY_ANDROID_PACKAGE_NAME;
	//    2    6:getstatic       #32  <Field String zzg.KEY_ANDROID_PACKAGE_NAME>
	//    3    9:putstatic       #33  <Field String KEY_ANDROID_PACKAGE_NAME>
	//*   4   12:return          
	}
}
