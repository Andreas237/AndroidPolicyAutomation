// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.AccountPicker;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.api.Scope;
import java.util.Locale;

public class GmsIntents
{

	private GmsIntents()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void Object()>
	//    2    4:return          
	}

	public static Intent createAndroidWearUpdateIntent()
	{
		Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
	//    0    0:new             #102 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #104 <String "com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION">
	//    3    6:invokespecial   #107 <Method void Intent(String)>
	//    4    9:astore_0        
		intent.setPackage("com.google.android.wearable.app");
	//    5   10:aload_0         
	//    6   11:ldc1            #109 <String "com.google.android.wearable.app">
	//    7   13:invokevirtual   #113 <Method Intent Intent.setPackage(String)>
	//    8   16:pop             
		return intent;
	//    9   17:aload_0         
	//   10   18:areturn         
	}

	public static Intent createChooseGmsAccountIntent()
	{
		return AccountPicker.newChooseAccountIntent(((android.accounts.Account) (null)), ((java.util.ArrayList) (null)), new String[] {
			"com.google"
		}, true, ((String) (null)), ((String) (null)), ((String []) (null)), ((android.os.Bundle) (null)), true);
	//    0    0:aconst_null     
	//    1    1:aconst_null     
	//    2    2:iconst_1        
	//    3    3:anewarray       String[]
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:ldc1            #118 <String "com.google">
	//    7   10:aastore         
	//    8   11:iconst_1        
	//    9   12:aconst_null     
	//   10   13:aconst_null     
	//   11   14:aconst_null     
	//   12   15:aconst_null     
	//   13   16:iconst_1        
	//   14   17:invokestatic    #124 <Method Intent AccountPicker.newChooseAccountIntent(android.accounts.Account, java.util.ArrayList, String[], boolean, String, String, String[], android.os.Bundle, boolean)>
	//   15   20:areturn         
	}

	public static Intent createChooseGmsAccountWithConsentIntent(String s, Scope ascope[], boolean flag)
	{
		Intent intent = new Intent("com.google.android.gms.signin.action.SIGN_IN");
	//    0    0:new             #102 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #128 <String "com.google.android.gms.signin.action.SIGN_IN">
	//    3    6:invokespecial   #107 <Method void Intent(String)>
	//    4    9:astore_3        
		intent.putExtra("SIGN_IN_PACKAGE_NAME", s);
	//    5   10:aload_3         
	//    6   11:ldc1            #23  <String "SIGN_IN_PACKAGE_NAME">
	//    7   13:aload_0         
	//    8   14:invokevirtual   #132 <Method Intent Intent.putExtra(String, String)>
	//    9   17:pop             
		intent.putExtra("SIGN_IN_SCOPE_ARRAY", ((android.os.Parcelable []) (ascope)));
	//   10   18:aload_3         
	//   11   19:ldc1            #29  <String "SIGN_IN_SCOPE_ARRAY">
	//   12   21:aload_1         
	//   13   22:invokevirtual   #135 <Method Intent Intent.putExtra(String, android.os.Parcelable[])>
	//   14   25:pop             
		intent.putExtra("SIGN_IN_SAVE_DEFAULT_ACCOUNT", flag);
	//   15   26:aload_3         
	//   16   27:ldc1            #26  <String "SIGN_IN_SAVE_DEFAULT_ACCOUNT">
	//   17   29:iload_2         
	//   18   30:invokevirtual   #138 <Method Intent Intent.putExtra(String, boolean)>
	//   19   33:pop             
		return intent;
	//   20   34:aload_3         
	//   21   35:areturn         
	}

	public static Intent createDateSettingsIntent()
	{
		return new Intent("android.settings.DATE_SETTINGS");
	//    0    0:new             #102 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #141 <String "android.settings.DATE_SETTINGS">
	//    3    6:invokespecial   #107 <Method void Intent(String)>
	//    4    9:areturn         
	}

	public static Intent createFindPeopleIntent(Context context)
	{
		return zza(context, zzua);
	//    0    0:aload_0         
	//    1    1:getstatic       #94  <Field Uri zzua>
	//    2    4:invokestatic    #147 <Method Intent zza(Context, Uri)>
	//    3    7:areturn         
	}

	public static Intent createPlayStoreGamesIntent(Context context)
	{
		Intent intent = new Intent("android.intent.action.VIEW");
	//    0    0:new             #102 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #150 <String "android.intent.action.VIEW">
	//    3    6:invokespecial   #107 <Method void Intent(String)>
	//    4    9:astore_1        
		intent.setData(Uri.parse("http://play.google.com/store/apps/category/GAME"));
	//    5   10:aload_1         
	//    6   11:ldc1            #152 <String "http://play.google.com/store/apps/category/GAME">
	//    7   13:invokestatic    #72  <Method Uri Uri.parse(String)>
	//    8   16:invokevirtual   #156 <Method Intent Intent.setData(Uri)>
	//    9   19:pop             
		intent.addFlags(0x80000);
	//   10   20:aload_1         
	//   11   21:ldc1            #157 <Int 0x80000>
	//   12   23:invokevirtual   #161 <Method Intent Intent.addFlags(int)>
	//   13   26:pop             
		intent.setPackage("com.android.vending");
	//   14   27:aload_1         
	//   15   28:ldc1            #163 <String "com.android.vending">
	//   16   30:invokevirtual   #113 <Method Intent Intent.setPackage(String)>
	//   17   33:pop             
		if(context.getPackageManager().resolveActivity(intent, 0x10000) == null)
	//*  18   34:aload_0         
	//*  19   35:invokevirtual   #169 <Method PackageManager Context.getPackageManager()>
	//*  20   38:aload_1         
	//*  21   39:ldc1            #170 <Int 0x10000>
	//*  22   41:invokevirtual   #176 <Method android.content.pm.ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//*  23   44:ifnonnull       74
		{
			context = ((Context) (new Intent(intent.getAction(), intent.getData())));
	//   24   47:new             #102 <Class Intent>
	//   25   50:dup             
	//   26   51:aload_1         
	//   27   52:invokevirtual   #180 <Method String Intent.getAction()>
	//   28   55:aload_1         
	//   29   56:invokevirtual   #183 <Method Uri Intent.getData()>
	//   30   59:invokespecial   #186 <Method void Intent(String, Uri)>
	//   31   62:astore_0        
			((Intent) (context)).setFlags(intent.getFlags());
	//   32   63:aload_0         
	//   33   64:aload_1         
	//   34   65:invokevirtual   #190 <Method int Intent.getFlags()>
	//   35   68:invokevirtual   #193 <Method Intent Intent.setFlags(int)>
	//   36   71:pop             
			return ((Intent) (context));
	//   37   72:aload_0         
	//   38   73:areturn         
		} else
		{
			return intent;
	//   39   74:aload_1         
	//   40   75:areturn         
		}
	}

	public static Intent createPlayStoreIntent(String s)
	{
		return createPlayStoreIntent(s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #196 <Method Intent createPlayStoreIntent(String, String)>
	//    3    5:areturn         
	}

	public static Intent createPlayStoreIntent(String s, String s1)
	{
		Intent intent = new Intent("android.intent.action.VIEW");
	//    0    0:new             #102 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #150 <String "android.intent.action.VIEW">
	//    3    6:invokespecial   #107 <Method void Intent(String)>
	//    4    9:astore_2        
		s = ((String) (Uri.parse("market://details").buildUpon().appendQueryParameter("id", s)));
	//    5   10:ldc1            #199 <String "market://details">
	//    6   12:invokestatic    #72  <Method Uri Uri.parse(String)>
	//    7   15:invokevirtual   #78  <Method android.net.Uri$Builder Uri.buildUpon()>
	//    8   18:ldc1            #201 <String "id">
	//    9   20:aload_0         
	//   10   21:invokevirtual   #205 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   11   24:astore_0        
		if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*  12   25:aload_1         
	//*  13   26:invokestatic    #211 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  14   29:ifne            40
			((android.net.Uri.Builder) (s)).appendQueryParameter("pcampaignid", s1);
	//   15   32:aload_0         
	//   16   33:ldc1            #213 <String "pcampaignid">
	//   17   35:aload_1         
	//   18   36:invokevirtual   #205 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   19   39:pop             
		intent.setData(((android.net.Uri.Builder) (s)).build());
	//   20   40:aload_2         
	//   21   41:aload_0         
	//   22   42:invokevirtual   #92  <Method Uri android.net.Uri$Builder.build()>
	//   23   45:invokevirtual   #156 <Method Intent Intent.setData(Uri)>
	//   24   48:pop             
		intent.setPackage("com.android.vending");
	//   25   49:aload_2         
	//   26   50:ldc1            #163 <String "com.android.vending">
	//   27   52:invokevirtual   #113 <Method Intent Intent.setPackage(String)>
	//   28   55:pop             
		intent.addFlags(0x80000);
	//   29   56:aload_2         
	//   30   57:ldc1            #157 <Int 0x80000>
	//   31   59:invokevirtual   #161 <Method Intent Intent.addFlags(int)>
	//   32   62:pop             
		return intent;
	//   33   63:aload_2         
	//   34   64:areturn         
	}

	public static Intent createPlayStoreLightPurchaseFlowIntent(Context context, String s, String s1)
	{
		Intent intent = new Intent("com.android.vending.billing.PURCHASE");
	//    0    0:new             #102 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #218 <String "com.android.vending.billing.PURCHASE">
	//    3    6:invokespecial   #107 <Method void Intent(String)>
	//    4    9:astore_3        
		intent.addCategory("android.intent.category.DEFAULT");
	//    5   10:aload_3         
	//    6   11:ldc1            #220 <String "android.intent.category.DEFAULT">
	//    7   13:invokevirtual   #223 <Method Intent Intent.addCategory(String)>
	//    8   16:pop             
		intent.setPackage("com.android.vending");
	//    9   17:aload_3         
	//   10   18:ldc1            #163 <String "com.android.vending">
	//   11   20:invokevirtual   #113 <Method Intent Intent.setPackage(String)>
	//   12   23:pop             
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  13   24:aload_1         
	//*  14   25:invokestatic    #211 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   28:ifne            39
			intent.putExtra("authAccount", s);
	//   16   31:aload_3         
	//   17   32:ldc1            #225 <String "authAccount">
	//   18   34:aload_1         
	//   19   35:invokevirtual   #132 <Method Intent Intent.putExtra(String, String)>
	//   20   38:pop             
		intent.putExtra("backend", 3);
	//   21   39:aload_3         
	//   22   40:ldc1            #227 <String "backend">
	//   23   42:iconst_3        
	//   24   43:invokevirtual   #230 <Method Intent Intent.putExtra(String, int)>
	//   25   46:pop             
		intent.putExtra("document_type", 1);
	//   26   47:aload_3         
	//   27   48:ldc1            #232 <String "document_type">
	//   28   50:iconst_1        
	//   29   51:invokevirtual   #230 <Method Intent Intent.putExtra(String, int)>
	//   30   54:pop             
		intent.putExtra("full_docid", s1);
	//   31   55:aload_3         
	//   32   56:ldc1            #234 <String "full_docid">
	//   33   58:aload_2         
	//   34   59:invokevirtual   #132 <Method Intent Intent.putExtra(String, String)>
	//   35   62:pop             
		intent.putExtra("backend_docid", s1);
	//   36   63:aload_3         
	//   37   64:ldc1            #236 <String "backend_docid">
	//   38   66:aload_2         
	//   39   67:invokevirtual   #132 <Method Intent Intent.putExtra(String, String)>
	//   40   70:pop             
		intent.putExtra("offer_type", 1);
	//   41   71:aload_3         
	//   42   72:ldc1            #238 <String "offer_type">
	//   43   74:iconst_1        
	//   44   75:invokevirtual   #230 <Method Intent Intent.putExtra(String, int)>
	//   45   78:pop             
		s = ((String) (intent));
	//   46   79:aload_3         
	//   47   80:astore_1        
		if(!isIntentResolvable(context.getPackageManager(), intent))
	//*  48   81:aload_0         
	//*  49   82:invokevirtual   #169 <Method PackageManager Context.getPackageManager()>
	//*  50   85:aload_3         
	//*  51   86:invokestatic    #242 <Method boolean isIntentResolvable(PackageManager, Intent)>
	//*  52   89:ifne            149
		{
			s = ((String) (new Intent("android.intent.action.VIEW")));
	//   53   92:new             #102 <Class Intent>
	//   54   95:dup             
	//   55   96:ldc1            #150 <String "android.intent.action.VIEW">
	//   56   98:invokespecial   #107 <Method void Intent(String)>
	//   57  101:astore_1        
			((Intent) (s)).setData(Uri.parse(String.format(Locale.US, "https://play.google.com/store/apps/details?id=%1$s&rdid=%1$s&rdot=%2$d", new Object[] {
				s1, Integer.valueOf(1)
			})));
	//   58  102:aload_1         
	//   59  103:getstatic       #248 <Field Locale Locale.US>
	//   60  106:ldc1            #250 <String "https://play.google.com/store/apps/details?id=%1$s&rdid=%1$s&rdot=%2$d">
	//   61  108:iconst_2        
	//   62  109:anewarray       Object[]
	//   63  112:dup             
	//   64  113:iconst_0        
	//   65  114:aload_2         
	//   66  115:aastore         
	//   67  116:dup             
	//   68  117:iconst_1        
	//   69  118:iconst_1        
	//   70  119:invokestatic    #256 <Method Integer Integer.valueOf(int)>
	//   71  122:aastore         
	//   72  123:invokestatic    #260 <Method String String.format(Locale, String, Object[])>
	//   73  126:invokestatic    #72  <Method Uri Uri.parse(String)>
	//   74  129:invokevirtual   #156 <Method Intent Intent.setData(Uri)>
	//   75  132:pop             
			((Intent) (s)).setPackage("com.android.vending");
	//   76  133:aload_1         
	//   77  134:ldc1            #163 <String "com.android.vending">
	//   78  136:invokevirtual   #113 <Method Intent Intent.setPackage(String)>
	//   79  139:pop             
			((Intent) (s)).putExtra("use_direct_purchase", true);
	//   80  140:aload_1         
	//   81  141:ldc2            #262 <String "use_direct_purchase">
	//   82  144:iconst_1        
	//   83  145:invokevirtual   #138 <Method Intent Intent.putExtra(String, boolean)>
	//   84  148:pop             
		}
		return ((Intent) (s));
	//   85  149:aload_1         
	//   86  150:areturn         
	}

	public static Intent createSettingsIntent(String s)
	{
		s = ((String) (Uri.fromParts("package", s, ((String) (null)))));
	//    0    0:ldc2            #265 <String "package">
	//    1    3:aload_0         
	//    2    4:aconst_null     
	//    3    5:invokestatic    #269 <Method Uri Uri.fromParts(String, String, String)>
	//    4    8:astore_0        
		Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
	//    5    9:new             #102 <Class Intent>
	//    6   12:dup             
	//    7   13:ldc2            #271 <String "android.settings.APPLICATION_DETAILS_SETTINGS">
	//    8   16:invokespecial   #107 <Method void Intent(String)>
	//    9   19:astore_1        
		intent.setData(((Uri) (s)));
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #156 <Method Intent Intent.setData(Uri)>
	//   13   25:pop             
		return intent;
	//   14   26:aload_1         
	//   15   27:areturn         
	}

	public static Intent createShareOnPlusIntent(Activity activity, String s, String s1)
	{
		s = ((String) (android.support.v4.app.ShareCompat.IntentBuilder.from(activity).setSubject(s).setText(((CharSequence) (s1))).setType("text/plain").getIntent()));
	//    0    0:aload_0         
	//    1    1:invokestatic    #279 <Method android.support.v4.app.ShareCompat$IntentBuilder android.support.v4.app.ShareCompat$IntentBuilder.from(Activity)>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #283 <Method android.support.v4.app.ShareCompat$IntentBuilder android.support.v4.app.ShareCompat$IntentBuilder.setSubject(String)>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #287 <Method android.support.v4.app.ShareCompat$IntentBuilder android.support.v4.app.ShareCompat$IntentBuilder.setText(CharSequence)>
	//    6   12:ldc2            #289 <String "text/plain">
	//    7   15:invokevirtual   #292 <Method android.support.v4.app.ShareCompat$IntentBuilder android.support.v4.app.ShareCompat$IntentBuilder.setType(String)>
	//    8   18:invokevirtual   #295 <Method Intent android.support.v4.app.ShareCompat$IntentBuilder.getIntent()>
	//    9   21:astore_1        
		((Intent) (s)).setPackage("com.google.android.apps.plus");
	//   10   22:aload_1         
	//   11   23:ldc2            #297 <String "com.google.android.apps.plus">
	//   12   26:invokevirtual   #113 <Method Intent Intent.setPackage(String)>
	//   13   29:pop             
		if(isIntentResolvable(activity.getPackageManager(), ((Intent) (s))))
	//*  14   30:aload_0         
	//*  15   31:invokevirtual   #300 <Method PackageManager Activity.getPackageManager()>
	//*  16   34:aload_1         
	//*  17   35:invokestatic    #242 <Method boolean isIntentResolvable(PackageManager, Intent)>
	//*  18   38:ifeq            43
			return ((Intent) (s));
	//   19   41:aload_1         
	//   20   42:areturn         
		else
			return createPlayStoreIntent("com.google.android.apps.plus");
	//   21   43:ldc2            #297 <String "com.google.android.apps.plus">
	//   22   46:invokestatic    #302 <Method Intent createPlayStoreIntent(String)>
	//   23   49:areturn         
	}

	public static Intent createShowProfileIntent(Context context, String s)
	{
		return zza(context, Uri.parse(String.format("https://plus.google.com/%s/about", new Object[] {
			s
		})));
	//    0    0:aload_0         
	//    1    1:ldc2            #306 <String "https://plus.google.com/%s/about">
	//    2    4:iconst_1        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_1         
	//    7   11:aastore         
	//    8   12:invokestatic    #309 <Method String String.format(String, Object[])>
	//    9   15:invokestatic    #72  <Method Uri Uri.parse(String)>
	//   10   18:invokestatic    #147 <Method Intent zza(Context, Uri)>
	//   11   21:areturn         
	}

	public static Intent getFitnessAppDisconnectedIntent(String s, String s1)
	{
		Intent intent = new Intent();
	//    0    0:new             #102 <Class Intent>
	//    1    3:dup             
	//    2    4:invokespecial   #311 <Method void Intent()>
	//    3    7:astore_2        
		intent.setPackage("com.google.android.gms");
	//    4    8:aload_2         
	//    5    9:ldc2            #313 <String "com.google.android.gms">
	//    6   12:invokevirtual   #113 <Method Intent Intent.setPackage(String)>
	//    7   15:pop             
		intent.setAction("com.google.android.gms.fitness.app_disconnected");
	//    8   16:aload_2         
	//    9   17:ldc1            #8   <String "com.google.android.gms.fitness.app_disconnected">
	//   10   19:invokevirtual   #316 <Method Intent Intent.setAction(String)>
	//   11   22:pop             
		intent.setType("vnd.google.android.fitness/app_disconnect");
	//   12   23:aload_2         
	//   13   24:ldc1            #56  <String "vnd.google.android.fitness/app_disconnect">
	//   14   26:invokevirtual   #318 <Method Intent Intent.setType(String)>
	//   15   29:pop             
		intent.putExtra("com.google.android.gms.fitness.disconnected_app", s);
	//   16   30:aload_2         
	//   17   31:ldc1            #35  <String "com.google.android.gms.fitness.disconnected_app">
	//   18   33:aload_0         
	//   19   34:invokevirtual   #132 <Method Intent Intent.putExtra(String, String)>
	//   20   37:pop             
		intent.putExtra("com.google.android.gms.fitness.disconnected_account", s1);
	//   21   38:aload_2         
	//   22   39:ldc1            #32  <String "com.google.android.gms.fitness.disconnected_account">
	//   23   41:aload_1         
	//   24   42:invokevirtual   #132 <Method Intent Intent.putExtra(String, String)>
	//   25   45:pop             
		return intent;
	//   26   46:aload_2         
	//   27   47:areturn         
	}

	public static Uri getPlayStoreUri(String s)
	{
		return Uri.parse("https://play.google.com/store/apps/details").buildUpon().appendQueryParameter("id", s).build();
	//    0    0:ldc2            #321 <String "https://play.google.com/store/apps/details">
	//    1    3:invokestatic    #72  <Method Uri Uri.parse(String)>
	//    2    6:invokevirtual   #78  <Method android.net.Uri$Builder Uri.buildUpon()>
	//    3    9:ldc1            #201 <String "id">
	//    4   11:aload_0         
	//    5   12:invokevirtual   #205 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//    6   15:invokevirtual   #92  <Method Uri android.net.Uri$Builder.build()>
	//    7   18:areturn         
	}

	public static boolean isIntentResolvable(PackageManager packagemanager, Intent intent)
	{
		return packagemanager.resolveActivity(intent, 0x10000) != null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #170 <Int 0x10000>
	//    3    4:invokevirtual   #176 <Method android.content.pm.ResolveInfo PackageManager.resolveActivity(Intent, int)>
	//    4    7:ifnull          12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	public static void sendIcingContactChangedBroadcast(Context context, boolean flag)
	{
		Intent intent = (new Intent("com.google.android.gms.icing.action.CONTACT_CHANGED")).setPackage("com.google.android.gms").putExtra("com.google.android.gms.icing.extra.isSignificant", flag);
	//    0    0:new             #102 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #11  <String "com.google.android.gms.icing.action.CONTACT_CHANGED">
	//    3    6:invokespecial   #107 <Method void Intent(String)>
	//    4    9:ldc2            #313 <String "com.google.android.gms">
	//    5   12:invokevirtual   #113 <Method Intent Intent.setPackage(String)>
	//    6   15:ldc1            #38  <String "com.google.android.gms.icing.extra.isSignificant">
	//    7   17:iload_1         
	//    8   18:invokevirtual   #138 <Method Intent Intent.putExtra(String, boolean)>
	//    9   21:astore_2        
		if(Log.isLoggable("GmsIntents", 2))
	//*  10   22:ldc2            #325 <String "GmsIntents">
	//*  11   25:iconst_2        
	//*  12   26:invokestatic    #331 <Method boolean Log.isLoggable(String, int)>
	//*  13   29:ifeq            100
		{
			String s = intent.getAction();
	//   14   32:aload_2         
	//   15   33:invokevirtual   #180 <Method String Intent.getAction()>
	//   16   36:astore_3        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 98);
	//   17   37:new             #333 <Class StringBuilder>
	//   18   40:dup             
	//   19   41:aload_3         
	//   20   42:invokestatic    #336 <Method String String.valueOf(Object)>
	//   21   45:invokevirtual   #339 <Method int String.length()>
	//   22   48:bipush          98
	//   23   50:iadd            
	//   24   51:invokespecial   #342 <Method void StringBuilder(int)>
	//   25   54:astore          4
			stringbuilder.append("Icing detected contact change, broadcasting it with intent action: ");
	//   26   56:aload           4
	//   27   58:ldc2            #344 <String "Icing detected contact change, broadcasting it with intent action: ">
	//   28   61:invokevirtual   #348 <Method StringBuilder StringBuilder.append(String)>
	//   29   64:pop             
			stringbuilder.append(s);
	//   30   65:aload           4
	//   31   67:aload_3         
	//   32   68:invokevirtual   #348 <Method StringBuilder StringBuilder.append(String)>
	//   33   71:pop             
			stringbuilder.append(" and isSignificant extra: ");
	//   34   72:aload           4
	//   35   74:ldc2            #350 <String " and isSignificant extra: ">
	//   36   77:invokevirtual   #348 <Method StringBuilder StringBuilder.append(String)>
	//   37   80:pop             
			stringbuilder.append(flag);
	//   38   81:aload           4
	//   39   83:iload_1         
	//   40   84:invokevirtual   #353 <Method StringBuilder StringBuilder.append(boolean)>
	//   41   87:pop             
			Log.v("GmsIntents", stringbuilder.toString());
	//   42   88:ldc2            #325 <String "GmsIntents">
	//   43   91:aload           4
	//   44   93:invokevirtual   #356 <Method String StringBuilder.toString()>
	//   45   96:invokestatic    #360 <Method int Log.v(String, String)>
	//   46   99:pop             
		}
		context.sendBroadcast(intent);
	//   47  100:aload_0         
	//   48  101:aload_2         
	//   49  102:invokevirtual   #364 <Method void Context.sendBroadcast(Intent)>
	//   50  105:return          
	}

	public static void sendSetGmsAccountIntent(Context context, String s, String s1)
	{
		Intent intent = new Intent("com.google.android.gms.common.SET_GMS_ACCOUNT");
	//    0    0:new             #102 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "com.google.android.gms.common.SET_GMS_ACCOUNT">
	//    3    6:invokespecial   #107 <Method void Intent(String)>
	//    4    9:astore_3        
		intent.putExtra("ACCOUNT_NAME", s);
	//    5   10:aload_3         
	//    6   11:ldc1            #41  <String "ACCOUNT_NAME">
	//    7   13:aload_1         
	//    8   14:invokevirtual   #132 <Method Intent Intent.putExtra(String, String)>
	//    9   17:pop             
		intent.putExtra("PACKAGE_NAME", s1);
	//   10   18:aload_3         
	//   11   19:ldc1            #44  <String "PACKAGE_NAME">
	//   12   21:aload_2         
	//   13   22:invokevirtual   #132 <Method Intent Intent.putExtra(String, String)>
	//   14   25:pop             
		intent.setPackage("com.google.android.gms");
	//   15   26:aload_3         
	//   16   27:ldc2            #313 <String "com.google.android.gms">
	//   17   30:invokevirtual   #113 <Method Intent Intent.setPackage(String)>
	//   18   33:pop             
		context.sendBroadcast(intent, "com.google.android.gms.permission.INTERNAL_BROADCAST");
	//   19   34:aload_0         
	//   20   35:aload_3         
	//   21   36:ldc1            #59  <String "com.google.android.gms.permission.INTERNAL_BROADCAST">
	//   22   38:invokevirtual   #369 <Method void Context.sendBroadcast(Intent, String)>
	//   23   41:return          
	}

	public static void sendUdcSettingsChangedBroadcast(Context context, String s, int ai[])
	{
		zza("com.google.android.gms", context, s, ai);
	//    0    0:ldc2            #313 <String "com.google.android.gms">
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #374 <Method void zza(String, Context, String, int[])>
		if(!GoogleSignatureVerifier.getInstance(context).isPackageGoogleSigned("com.google.android.googlequicksearchbox"))
	//*   5    9:aload_0         
	//*   6   10:invokestatic    #380 <Method GoogleSignatureVerifier GoogleSignatureVerifier.getInstance(Context)>
	//*   7   13:ldc1            #53  <String "com.google.android.googlequicksearchbox">
	//*   8   15:invokevirtual   #384 <Method boolean GoogleSignatureVerifier.isPackageGoogleSigned(String)>
	//*   9   18:ifne            42
		{
			if(Log.isLoggable("GmsIntents", 5))
	//*  10   21:ldc2            #325 <String "GmsIntents">
	//*  11   24:iconst_5        
	//*  12   25:invokestatic    #331 <Method boolean Log.isLoggable(String, int)>
	//*  13   28:ifeq            41
				Log.w("GmsIntents", "Google now certificate not valid. UDC settings broadcast will not be sent.");
	//   14   31:ldc2            #325 <String "GmsIntents">
	//   15   34:ldc2            #386 <String "Google now certificate not valid. UDC settings broadcast will not be sent.">
	//   16   37:invokestatic    #389 <Method int Log.w(String, String)>
	//   17   40:pop             
			return;
	//   18   41:return          
		} else
		{
			zza("com.google.android.googlequicksearchbox", context, s, ai);
	//   19   42:ldc1            #53  <String "com.google.android.googlequicksearchbox">
	//   20   44:aload_0         
	//   21   45:aload_1         
	//   22   46:aload_2         
	//   23   47:invokestatic    #374 <Method void zza(String, Context, String, int[])>
			return;
	//   24   50:return          
		}
	}

	private static Intent zza(Context context, Uri uri)
	{
		Intent intent = new Intent("android.intent.action.VIEW");
	//    0    0:new             #102 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #150 <String "android.intent.action.VIEW">
	//    3    6:invokespecial   #107 <Method void Intent(String)>
	//    4    9:astore_2        
		intent.setData(uri);
	//    5   10:aload_2         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #156 <Method Intent Intent.setData(Uri)>
	//    8   15:pop             
		intent.setPackage("com.google.android.apps.plus");
	//    9   16:aload_2         
	//   10   17:ldc2            #297 <String "com.google.android.apps.plus">
	//   11   20:invokevirtual   #113 <Method Intent Intent.setPackage(String)>
	//   12   23:pop             
		if(isIntentResolvable(context.getPackageManager(), intent))
	//*  13   24:aload_0         
	//*  14   25:invokevirtual   #169 <Method PackageManager Context.getPackageManager()>
	//*  15   28:aload_2         
	//*  16   29:invokestatic    #242 <Method boolean isIntentResolvable(PackageManager, Intent)>
	//*  17   32:ifeq            37
			return intent;
	//   18   35:aload_2         
	//   19   36:areturn         
		else
			return createPlayStoreIntent("com.google.android.apps.plus");
	//   20   37:ldc2            #297 <String "com.google.android.apps.plus">
	//   21   40:invokestatic    #302 <Method Intent createPlayStoreIntent(String)>
	//   22   43:areturn         
	}

	private static void zza(String s, Context context, String s1, int ai[])
	{
		s1 = ((String) ((new Intent("com.google.android.gms.udc.action.SETTING_CHANGED")).setPackage(s).putExtra("com.google.android.gms.udc.extra.accountName", s1).putExtra("com.google.android.gms.udc.extra.settingIdList", ai)));
	//    0    0:new             #102 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "com.google.android.gms.udc.action.SETTING_CHANGED">
	//    3    6:invokespecial   #107 <Method void Intent(String)>
	//    4    9:aload_0         
	//    5   10:invokevirtual   #113 <Method Intent Intent.setPackage(String)>
	//    6   13:ldc1            #47  <String "com.google.android.gms.udc.extra.accountName">
	//    7   15:aload_2         
	//    8   16:invokevirtual   #132 <Method Intent Intent.putExtra(String, String)>
	//    9   19:ldc1            #50  <String "com.google.android.gms.udc.extra.settingIdList">
	//   10   21:aload_3         
	//   11   22:invokevirtual   #392 <Method Intent Intent.putExtra(String, int[])>
	//   12   25:astore_2        
		if(Log.isLoggable("GmsIntents", 3))
	//*  13   26:ldc2            #325 <String "GmsIntents">
	//*  14   29:iconst_3        
	//*  15   30:invokestatic    #331 <Method boolean Log.isLoggable(String, int)>
	//*  16   33:ifeq            112
		{
			ai = ((int []) (((Intent) (s1)).getAction()));
	//   17   36:aload_2         
	//   18   37:invokevirtual   #180 <Method String Intent.getAction()>
	//   19   40:astore_3        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 72 + String.valueOf(((Object) (ai))).length());
	//   20   41:new             #333 <Class StringBuilder>
	//   21   44:dup             
	//   22   45:aload_0         
	//   23   46:invokestatic    #336 <Method String String.valueOf(Object)>
	//   24   49:invokevirtual   #339 <Method int String.length()>
	//   25   52:bipush          72
	//   26   54:iadd            
	//   27   55:aload_3         
	//   28   56:invokestatic    #336 <Method String String.valueOf(Object)>
	//   29   59:invokevirtual   #339 <Method int String.length()>
	//   30   62:iadd            
	//   31   63:invokespecial   #342 <Method void StringBuilder(int)>
	//   32   66:astore          4
			stringbuilder.append("UDC settings changed, sending broadcast to package ");
	//   33   68:aload           4
	//   34   70:ldc2            #394 <String "UDC settings changed, sending broadcast to package ">
	//   35   73:invokevirtual   #348 <Method StringBuilder StringBuilder.append(String)>
	//   36   76:pop             
			stringbuilder.append(s);
	//   37   77:aload           4
	//   38   79:aload_0         
	//   39   80:invokevirtual   #348 <Method StringBuilder StringBuilder.append(String)>
	//   40   83:pop             
			stringbuilder.append(" with intent action: ");
	//   41   84:aload           4
	//   42   86:ldc2            #396 <String " with intent action: ">
	//   43   89:invokevirtual   #348 <Method StringBuilder StringBuilder.append(String)>
	//   44   92:pop             
			stringbuilder.append(((String) (ai)));
	//   45   93:aload           4
	//   46   95:aload_3         
	//   47   96:invokevirtual   #348 <Method StringBuilder StringBuilder.append(String)>
	//   48   99:pop             
			Log.d("GmsIntents", stringbuilder.toString());
	//   49  100:ldc2            #325 <String "GmsIntents">
	//   50  103:aload           4
	//   51  105:invokevirtual   #356 <Method String StringBuilder.toString()>
	//   52  108:invokestatic    #399 <Method int Log.d(String, String)>
	//   53  111:pop             
		}
		context.sendBroadcast(((Intent) (s1)));
	//   54  112:aload_1         
	//   55  113:aload_2         
	//   56  114:invokevirtual   #364 <Method void Context.sendBroadcast(Intent)>
	//   57  117:return          
	}

	public static final String ACTION_FITNESS_APP_DISCONNECTED = "com.google.android.gms.fitness.app_disconnected";
	public static final String ACTION_ICING_CONTACT_CHANGED = "com.google.android.gms.icing.action.CONTACT_CHANGED";
	public static final String ACTION_SET_GMS_ACCOUNT = "com.google.android.gms.common.SET_GMS_ACCOUNT";
	public static final String ACTION_UDC_SETTING_CHANGED = "com.google.android.gms.udc.action.SETTING_CHANGED";
	public static final String BROADCAST_CIRCLES_CHANGED = "com.google.android.gms.people.BROADCAST_CIRCLES_CHANGED";
	public static final String COMMON_SIGN_IN_EXTRA_PACKAGE_NAME = "SIGN_IN_PACKAGE_NAME";
	public static final String COMMON_SIGN_IN_EXTRA_SAVE_DEFAULT_ACCOUNT = "SIGN_IN_SAVE_DEFAULT_ACCOUNT";
	public static final String COMMON_SIGN_IN_EXTRA_SCOPE_ARRAY = "SIGN_IN_SCOPE_ARRAY";
	public static final String EXTRA_ACCOUNT = "com.google.android.gms.fitness.disconnected_account";
	public static final String EXTRA_APP = "com.google.android.gms.fitness.disconnected_app";
	public static final String EXTRA_ICING_CONTACT_CHANGED_IS_SIGNIFICANT = "com.google.android.gms.icing.extra.isSignificant";
	public static final String EXTRA_SET_GMS_ACCOUNT_NAME = "ACCOUNT_NAME";
	public static final String EXTRA_SET_GMS_ACCOUNT_PACKAGE_NAME = "PACKAGE_NAME";
	public static final String EXTRA_UDC_ACCOUNT_NAME = "com.google.android.gms.udc.extra.accountName";
	public static final String EXTRA_UDC_SETTING_ID_LIST = "com.google.android.gms.udc.extra.settingIdList";
	public static final String GOOGLE_NOW_PACKAGE_NAME = "com.google.android.googlequicksearchbox";
	public static final String MIME_ACTIVITY_DISCONNECT_TYPE = "vnd.google.android.fitness/app_disconnect";
	public static final String PERMISSION_GMS_INTERNAL_BROADCAST = "com.google.android.gms.permission.INTERNAL_BROADCAST";
	private static final Uri zztz;
	private static final Uri zzua;

	static 
	{
		Uri uri = Uri.parse("https://plus.google.com/");
	//    0    0:ldc1            #66  <String "https://plus.google.com/">
	//    1    2:invokestatic    #72  <Method Uri Uri.parse(String)>
	//    2    5:astore_0        
		zztz = uri;
	//    3    6:aload_0         
	//    4    7:putstatic       #74  <Field Uri zztz>
		zzua = uri.buildUpon().appendPath("circles").appendPath("find").build();
	//    5   10:aload_0         
	//    6   11:invokevirtual   #78  <Method android.net.Uri$Builder Uri.buildUpon()>
	//    7   14:ldc1            #80  <String "circles">
	//    8   16:invokevirtual   #86  <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//    9   19:ldc1            #88  <String "find">
	//   10   21:invokevirtual   #86  <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//   11   24:invokevirtual   #92  <Method Uri android.net.Uri$Builder.build()>
	//   12   27:putstatic       #94  <Field Uri zzua>
	//*  13   30:return          
	}
}
