// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.facebook.*;
import com.facebook.appevents.AppEventsLogger;
import java.util.UUID;

// Referenced classes of package com.facebook.internal:
//			DialogFeature, Utility, NativeProtocol, AppCall, 
//			Validate, ServerProtocol

public class DialogPresenter
{
	public static interface ParameterProvider
	{

		public abstract Bundle getLegacyParameters();

		public abstract Bundle getParameters();
	}


	public DialogPresenter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static boolean canPresentNativeDialogWithFeature(DialogFeature dialogfeature)
	{
		return getProtocolVersionForNativeDialog(dialogfeature) != -1;
	//    0    0:aload_0         
	//    1    1:invokestatic    #18  <Method int getProtocolVersionForNativeDialog(DialogFeature)>
	//    2    4:iconst_m1       
	//    3    5:icmpeq          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public static boolean canPresentWebFallbackDialogWithFeature(DialogFeature dialogfeature)
	{
		return getDialogWebFallbackUri(dialogfeature) != null;
	//    0    0:aload_0         
	//    1    1:invokestatic    #23  <Method Uri getDialogWebFallbackUri(DialogFeature)>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private static Uri getDialogWebFallbackUri(DialogFeature dialogfeature)
	{
		String s = dialogfeature.name();
	//    0    0:aload_0         
	//    1    1:invokeinterface #29  <Method String DialogFeature.name()>
	//    2    6:astore_1        
		dialogfeature = ((DialogFeature) (dialogfeature.getAction()));
	//    3    7:aload_0         
	//    4    8:invokeinterface #32  <Method String DialogFeature.getAction()>
	//    5   13:astore_0        
		dialogfeature = ((DialogFeature) (Utility.getDialogFeatureConfig(FacebookSdk.getApplicationId(), ((String) (dialogfeature)), s)));
	//    6   14:invokestatic    #37  <Method String FacebookSdk.getApplicationId()>
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokestatic    #43  <Method Utility$DialogFeatureConfig Utility.getDialogFeatureConfig(String, String, String)>
	//   10   22:astore_0        
		if(dialogfeature != null)
	//*  11   23:aload_0         
	//*  12   24:ifnull          32
			return ((Utility.DialogFeatureConfig) (dialogfeature)).getFallbackUrl();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #49  <Method Uri Utility$DialogFeatureConfig.getFallbackUrl()>
	//   15   31:areturn         
		else
			return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
	}

	public static int getProtocolVersionForNativeDialog(DialogFeature dialogfeature)
	{
		String s = FacebookSdk.getApplicationId();
	//    0    0:invokestatic    #37  <Method String FacebookSdk.getApplicationId()>
	//    1    3:astore_1        
		String s1 = dialogfeature.getAction();
	//    2    4:aload_0         
	//    3    5:invokeinterface #32  <Method String DialogFeature.getAction()>
	//    4   10:astore_2        
		return NativeProtocol.getLatestAvailableProtocolVersionForAction(s1, getVersionSpecForFeature(s, s1, dialogfeature));
	//    5   11:aload_2         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_0         
	//    9   15:invokestatic    #53  <Method int[] getVersionSpecForFeature(String, String, DialogFeature)>
	//   10   18:invokestatic    #59  <Method int NativeProtocol.getLatestAvailableProtocolVersionForAction(String, int[])>
	//   11   21:ireturn         
	}

	private static int[] getVersionSpecForFeature(String s, String s1, DialogFeature dialogfeature)
	{
		s = ((String) (Utility.getDialogFeatureConfig(s, s1, dialogfeature.name())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokeinterface #29  <Method String DialogFeature.name()>
	//    4    8:invokestatic    #43  <Method Utility$DialogFeatureConfig Utility.getDialogFeatureConfig(String, String, String)>
	//    5   11:astore_0        
		if(s != null)
	//*   6   12:aload_0         
	//*   7   13:ifnull          21
			return ((Utility.DialogFeatureConfig) (s)).getVersionSpec();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #63  <Method int[] Utility$DialogFeatureConfig.getVersionSpec()>
	//   10   20:areturn         
		else
			return (new int[] {
				dialogfeature.getMinVersion()
			});
	//   11   21:iconst_1        
	//   12   22:newarray        int[]
	//   13   24:dup             
	//   14   25:iconst_0        
	//   15   26:aload_2         
	//   16   27:invokeinterface #67  <Method int DialogFeature.getMinVersion()>
	//   17   32:iastore         
	//   18   33:areturn         
	}

	public static void logDialogActivity(Context context, String s, String s1)
	{
		context = ((Context) (AppEventsLogger.newLogger(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #75  <Method AppEventsLogger AppEventsLogger.newLogger(Context)>
	//    2    4:astore_0        
		Bundle bundle = new Bundle();
	//    3    5:new             #77  <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #78  <Method void Bundle()>
	//    6   12:astore_3        
		bundle.putString("fb_dialog_outcome", s1);
	//    7   13:aload_3         
	//    8   14:ldc1            #80  <String "fb_dialog_outcome">
	//    9   16:aload_2         
	//   10   17:invokevirtual   #84  <Method void Bundle.putString(String, String)>
		((AppEventsLogger) (context)).logSdkEvent(s, ((Double) (null)), bundle);
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:aconst_null     
	//   14   23:aload_3         
	//   15   24:invokevirtual   #88  <Method void AppEventsLogger.logSdkEvent(String, Double, Bundle)>
	//   16   27:return          
	}

	public static void present(AppCall appcall, Activity activity)
	{
		activity.startActivityForResult(appcall.getRequestIntent(), appcall.getRequestCode());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #96  <Method Intent AppCall.getRequestIntent()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #99  <Method int AppCall.getRequestCode()>
	//    5    9:invokevirtual   #105 <Method void Activity.startActivityForResult(Intent, int)>
		appcall.setPending();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #109 <Method boolean AppCall.setPending()>
	//    8   16:pop             
	//    9   17:return          
	}

	public static void present(AppCall appcall, Fragment fragment)
	{
		fragment.startActivityForResult(appcall.getRequestIntent(), appcall.getRequestCode());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #96  <Method Intent AppCall.getRequestIntent()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #99  <Method int AppCall.getRequestCode()>
	//    5    9:invokevirtual   #113 <Method void Fragment.startActivityForResult(Intent, int)>
		appcall.setPending();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #109 <Method boolean AppCall.setPending()>
	//    8   16:pop             
	//    9   17:return          
	}

	public static void setupAppCallForCannotShowError(AppCall appcall)
	{
		setupAppCallForValidationError(appcall, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
	//    0    0:aload_0         
	//    1    1:new             #117 <Class FacebookException>
	//    2    4:dup             
	//    3    5:ldc1            #119 <String "Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14.">
	//    4    7:invokespecial   #122 <Method void FacebookException(String)>
	//    5   10:invokestatic    #126 <Method void setupAppCallForValidationError(AppCall, FacebookException)>
	//    6   13:return          
	}

	public static void setupAppCallForErrorResult(AppCall appcall, FacebookException facebookexception)
	{
		if(facebookexception == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
	//    3    5:invokestatic    #131 <Method Context FacebookSdk.getApplicationContext()>
	//    4    8:invokestatic    #137 <Method void Validate.hasFacebookActivity(Context)>
			Intent intent = new Intent();
	//    5   11:new             #139 <Class Intent>
	//    6   14:dup             
	//    7   15:invokespecial   #140 <Method void Intent()>
	//    8   18:astore_2        
			intent.setClass(FacebookSdk.getApplicationContext(), com/facebook/FacebookActivity);
	//    9   19:aload_2         
	//   10   20:invokestatic    #131 <Method Context FacebookSdk.getApplicationContext()>
	//   11   23:ldc1            #142 <Class FacebookActivity>
	//   12   25:invokevirtual   #146 <Method Intent Intent.setClass(Context, Class)>
	//   13   28:pop             
			intent.setAction(FacebookActivity.PASS_THROUGH_CANCEL_ACTION);
	//   14   29:aload_2         
	//   15   30:getstatic       #150 <Field String FacebookActivity.PASS_THROUGH_CANCEL_ACTION>
	//   16   33:invokevirtual   #154 <Method Intent Intent.setAction(String)>
	//   17   36:pop             
			NativeProtocol.setupProtocolRequestIntent(intent, appcall.getCallId().toString(), ((String) (null)), NativeProtocol.getLatestKnownVersion(), NativeProtocol.createBundleForException(facebookexception));
	//   18   37:aload_2         
	//   19   38:aload_0         
	//   20   39:invokevirtual   #158 <Method UUID AppCall.getCallId()>
	//   21   42:invokevirtual   #163 <Method String UUID.toString()>
	//   22   45:aconst_null     
	//   23   46:invokestatic    #166 <Method int NativeProtocol.getLatestKnownVersion()>
	//   24   49:aload_1         
	//   25   50:invokestatic    #170 <Method Bundle NativeProtocol.createBundleForException(FacebookException)>
	//   26   53:invokestatic    #174 <Method void NativeProtocol.setupProtocolRequestIntent(Intent, String, String, int, Bundle)>
			appcall.setRequestIntent(intent);
	//   27   56:aload_0         
	//   28   57:aload_2         
	//   29   58:invokevirtual   #178 <Method void AppCall.setRequestIntent(Intent)>
			return;
	//   30   61:return          
		}
	}

	public static void setupAppCallForNativeDialog(AppCall appcall, ParameterProvider parameterprovider, DialogFeature dialogfeature)
	{
		Context context = FacebookSdk.getApplicationContext();
	//    0    0:invokestatic    #131 <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:astore          4
		String s = dialogfeature.getAction();
	//    2    5:aload_2         
	//    3    6:invokeinterface #32  <Method String DialogFeature.getAction()>
	//    4   11:astore          5
		int i = getProtocolVersionForNativeDialog(dialogfeature);
	//    5   13:aload_2         
	//    6   14:invokestatic    #18  <Method int getProtocolVersionForNativeDialog(DialogFeature)>
	//    7   17:istore_3        
		if(i == -1)
	//*   8   18:iload_3         
	//*   9   19:iconst_m1       
	//*  10   20:icmpne          33
			throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
	//   11   23:new             #117 <Class FacebookException>
	//   12   26:dup             
	//   13   27:ldc1            #182 <String "Cannot present this dialog. This likely means that the Facebook app is not installed.">
	//   14   29:invokespecial   #122 <Method void FacebookException(String)>
	//   15   32:athrow          
		if(NativeProtocol.isVersionCompatibleWithBucketedIntent(i))
	//*  16   33:iload_3         
	//*  17   34:invokestatic    #186 <Method boolean NativeProtocol.isVersionCompatibleWithBucketedIntent(int)>
	//*  18   37:ifeq            50
			parameterprovider = ((ParameterProvider) (parameterprovider.getParameters()));
	//   19   40:aload_1         
	//   20   41:invokeinterface #190 <Method Bundle DialogPresenter$ParameterProvider.getParameters()>
	//   21   46:astore_1        
		else
	//*  22   47:goto            57
			parameterprovider = ((ParameterProvider) (parameterprovider.getLegacyParameters()));
	//   23   50:aload_1         
	//   24   51:invokeinterface #193 <Method Bundle DialogPresenter$ParameterProvider.getLegacyParameters()>
	//   25   56:astore_1        
		dialogfeature = ((DialogFeature) (parameterprovider));
	//   26   57:aload_1         
	//   27   58:astore_2        
		if(parameterprovider == null)
	//*  28   59:aload_1         
	//*  29   60:ifnonnull       71
			dialogfeature = ((DialogFeature) (new Bundle()));
	//   30   63:new             #77  <Class Bundle>
	//   31   66:dup             
	//   32   67:invokespecial   #78  <Method void Bundle()>
	//   33   70:astore_2        
		parameterprovider = ((ParameterProvider) (NativeProtocol.createPlatformActivityIntent(context, appcall.getCallId().toString(), s, i, ((Bundle) (dialogfeature)))));
	//   34   71:aload           4
	//   35   73:aload_0         
	//   36   74:invokevirtual   #158 <Method UUID AppCall.getCallId()>
	//   37   77:invokevirtual   #163 <Method String UUID.toString()>
	//   38   80:aload           5
	//   39   82:iload_3         
	//   40   83:aload_2         
	//   41   84:invokestatic    #197 <Method Intent NativeProtocol.createPlatformActivityIntent(Context, String, String, int, Bundle)>
	//   42   87:astore_1        
		if(parameterprovider == null)
	//*  43   88:aload_1         
	//*  44   89:ifnonnull       102
		{
			throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
	//   45   92:new             #117 <Class FacebookException>
	//   46   95:dup             
	//   47   96:ldc1            #199 <String "Unable to create Intent; this likely means theFacebook app is not installed.">
	//   48   98:invokespecial   #122 <Method void FacebookException(String)>
	//   49  101:athrow          
		} else
		{
			appcall.setRequestIntent(((Intent) (parameterprovider)));
	//   50  102:aload_0         
	//   51  103:aload_1         
	//   52  104:invokevirtual   #178 <Method void AppCall.setRequestIntent(Intent)>
			return;
	//   53  107:return          
		}
	}

	public static void setupAppCallForValidationError(AppCall appcall, FacebookException facebookexception)
	{
		setupAppCallForErrorResult(appcall, facebookexception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #201 <Method void setupAppCallForErrorResult(AppCall, FacebookException)>
	//    3    5:return          
	}

	public static void setupAppCallForWebDialog(AppCall appcall, String s, Bundle bundle)
	{
		Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
	//    0    0:invokestatic    #131 <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:invokestatic    #137 <Method void Validate.hasFacebookActivity(Context)>
		Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
	//    2    6:invokestatic    #131 <Method Context FacebookSdk.getApplicationContext()>
	//    3    9:invokestatic    #206 <Method void Validate.hasInternetPermissions(Context)>
		Bundle bundle1 = new Bundle();
	//    4   12:new             #77  <Class Bundle>
	//    5   15:dup             
	//    6   16:invokespecial   #78  <Method void Bundle()>
	//    7   19:astore_3        
		bundle1.putString("action", s);
	//    8   20:aload_3         
	//    9   21:ldc1            #208 <String "action">
	//   10   23:aload_1         
	//   11   24:invokevirtual   #84  <Method void Bundle.putString(String, String)>
		bundle1.putBundle("params", bundle);
	//   12   27:aload_3         
	//   13   28:ldc1            #210 <String "params">
	//   14   30:aload_2         
	//   15   31:invokevirtual   #214 <Method void Bundle.putBundle(String, Bundle)>
		bundle = ((Bundle) (new Intent()));
	//   16   34:new             #139 <Class Intent>
	//   17   37:dup             
	//   18   38:invokespecial   #140 <Method void Intent()>
	//   19   41:astore_2        
		NativeProtocol.setupProtocolRequestIntent(((Intent) (bundle)), appcall.getCallId().toString(), s, NativeProtocol.getLatestKnownVersion(), bundle1);
	//   20   42:aload_2         
	//   21   43:aload_0         
	//   22   44:invokevirtual   #158 <Method UUID AppCall.getCallId()>
	//   23   47:invokevirtual   #163 <Method String UUID.toString()>
	//   24   50:aload_1         
	//   25   51:invokestatic    #166 <Method int NativeProtocol.getLatestKnownVersion()>
	//   26   54:aload_3         
	//   27   55:invokestatic    #174 <Method void NativeProtocol.setupProtocolRequestIntent(Intent, String, String, int, Bundle)>
		((Intent) (bundle)).setClass(FacebookSdk.getApplicationContext(), com/facebook/FacebookActivity);
	//   28   58:aload_2         
	//   29   59:invokestatic    #131 <Method Context FacebookSdk.getApplicationContext()>
	//   30   62:ldc1            #142 <Class FacebookActivity>
	//   31   64:invokevirtual   #146 <Method Intent Intent.setClass(Context, Class)>
	//   32   67:pop             
		((Intent) (bundle)).setAction("FacebookDialogFragment");
	//   33   68:aload_2         
	//   34   69:ldc1            #216 <String "FacebookDialogFragment">
	//   35   71:invokevirtual   #154 <Method Intent Intent.setAction(String)>
	//   36   74:pop             
		appcall.setRequestIntent(((Intent) (bundle)));
	//   37   75:aload_0         
	//   38   76:aload_2         
	//   39   77:invokevirtual   #178 <Method void AppCall.setRequestIntent(Intent)>
	//   40   80:return          
	}

	public static void setupAppCallForWebFallbackDialog(AppCall appcall, Bundle bundle, DialogFeature dialogfeature)
	{
		Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
	//    0    0:invokestatic    #131 <Method Context FacebookSdk.getApplicationContext()>
	//    1    3:invokestatic    #137 <Method void Validate.hasFacebookActivity(Context)>
		Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
	//    2    6:invokestatic    #131 <Method Context FacebookSdk.getApplicationContext()>
	//    3    9:invokestatic    #206 <Method void Validate.hasInternetPermissions(Context)>
		Object obj = ((Object) (dialogfeature.name()));
	//    4   12:aload_2         
	//    5   13:invokeinterface #29  <Method String DialogFeature.name()>
	//    6   18:astore          4
		Uri uri = getDialogWebFallbackUri(dialogfeature);
	//    7   20:aload_2         
	//    8   21:invokestatic    #23  <Method Uri getDialogWebFallbackUri(DialogFeature)>
	//    9   24:astore          5
		if(uri == null)
	//*  10   26:aload           5
	//*  11   28:ifnonnull       72
		{
			appcall = ((AppCall) (new StringBuilder()));
	//   12   31:new             #220 <Class StringBuilder>
	//   13   34:dup             
	//   14   35:invokespecial   #221 <Method void StringBuilder()>
	//   15   38:astore_0        
			((StringBuilder) (appcall)).append("Unable to fetch the Url for the DialogFeature : '");
	//   16   39:aload_0         
	//   17   40:ldc1            #223 <String "Unable to fetch the Url for the DialogFeature : '">
	//   18   42:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   19   45:pop             
			((StringBuilder) (appcall)).append(((String) (obj)));
	//   20   46:aload_0         
	//   21   47:aload           4
	//   22   49:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   23   52:pop             
			((StringBuilder) (appcall)).append("'");
	//   24   53:aload_0         
	//   25   54:ldc1            #229 <String "'">
	//   26   56:invokevirtual   #227 <Method StringBuilder StringBuilder.append(String)>
	//   27   59:pop             
			throw new FacebookException(((StringBuilder) (appcall)).toString());
	//   28   60:new             #117 <Class FacebookException>
	//   29   63:dup             
	//   30   64:aload_0         
	//   31   65:invokevirtual   #230 <Method String StringBuilder.toString()>
	//   32   68:invokespecial   #122 <Method void FacebookException(String)>
	//   33   71:athrow          
		}
		int i = NativeProtocol.getLatestKnownVersion();
	//   34   72:invokestatic    #166 <Method int NativeProtocol.getLatestKnownVersion()>
	//   35   75:istore_3        
		bundle = ServerProtocol.getQueryParamsForPlatformActivityIntentWebFallback(appcall.getCallId().toString(), i, bundle);
	//   36   76:aload_0         
	//   37   77:invokevirtual   #158 <Method UUID AppCall.getCallId()>
	//   38   80:invokevirtual   #163 <Method String UUID.toString()>
	//   39   83:iload_3         
	//   40   84:aload_1         
	//   41   85:invokestatic    #236 <Method Bundle ServerProtocol.getQueryParamsForPlatformActivityIntentWebFallback(String, int, Bundle)>
	//   42   88:astore_1        
		if(bundle == null)
	//*  43   89:aload_1         
	//*  44   90:ifnonnull       103
			throw new FacebookException("Unable to fetch the app's key-hash");
	//   45   93:new             #117 <Class FacebookException>
	//   46   96:dup             
	//   47   97:ldc1            #238 <String "Unable to fetch the app's key-hash">
	//   48   99:invokespecial   #122 <Method void FacebookException(String)>
	//   49  102:athrow          
		if(uri.isRelative())
	//*  50  103:aload           5
	//*  51  105:invokevirtual   #243 <Method boolean Uri.isRelative()>
	//*  52  108:ifeq            127
			bundle = ((Bundle) (Utility.buildUri(ServerProtocol.getDialogAuthority(), uri.toString(), bundle)));
	//   53  111:invokestatic    #246 <Method String ServerProtocol.getDialogAuthority()>
	//   54  114:aload           5
	//   55  116:invokevirtual   #247 <Method String Uri.toString()>
	//   56  119:aload_1         
	//   57  120:invokestatic    #251 <Method Uri Utility.buildUri(String, String, Bundle)>
	//   58  123:astore_1        
		else
	//*  59  124:goto            142
			bundle = ((Bundle) (Utility.buildUri(uri.getAuthority(), uri.getPath(), bundle)));
	//   60  127:aload           5
	//   61  129:invokevirtual   #254 <Method String Uri.getAuthority()>
	//   62  132:aload           5
	//   63  134:invokevirtual   #257 <Method String Uri.getPath()>
	//   64  137:aload_1         
	//   65  138:invokestatic    #251 <Method Uri Utility.buildUri(String, String, Bundle)>
	//   66  141:astore_1        
		obj = ((Object) (new Bundle()));
	//   67  142:new             #77  <Class Bundle>
	//   68  145:dup             
	//   69  146:invokespecial   #78  <Method void Bundle()>
	//   70  149:astore          4
		((Bundle) (obj)).putString("url", ((Uri) (bundle)).toString());
	//   71  151:aload           4
	//   72  153:ldc2            #259 <String "url">
	//   73  156:aload_1         
	//   74  157:invokevirtual   #247 <Method String Uri.toString()>
	//   75  160:invokevirtual   #84  <Method void Bundle.putString(String, String)>
		((Bundle) (obj)).putBoolean("is_fallback", true);
	//   76  163:aload           4
	//   77  165:ldc2            #261 <String "is_fallback">
	//   78  168:iconst_1        
	//   79  169:invokevirtual   #265 <Method void Bundle.putBoolean(String, boolean)>
		bundle = ((Bundle) (new Intent()));
	//   80  172:new             #139 <Class Intent>
	//   81  175:dup             
	//   82  176:invokespecial   #140 <Method void Intent()>
	//   83  179:astore_1        
		NativeProtocol.setupProtocolRequestIntent(((Intent) (bundle)), appcall.getCallId().toString(), dialogfeature.getAction(), NativeProtocol.getLatestKnownVersion(), ((Bundle) (obj)));
	//   84  180:aload_1         
	//   85  181:aload_0         
	//   86  182:invokevirtual   #158 <Method UUID AppCall.getCallId()>
	//   87  185:invokevirtual   #163 <Method String UUID.toString()>
	//   88  188:aload_2         
	//   89  189:invokeinterface #32  <Method String DialogFeature.getAction()>
	//   90  194:invokestatic    #166 <Method int NativeProtocol.getLatestKnownVersion()>
	//   91  197:aload           4
	//   92  199:invokestatic    #174 <Method void NativeProtocol.setupProtocolRequestIntent(Intent, String, String, int, Bundle)>
		((Intent) (bundle)).setClass(FacebookSdk.getApplicationContext(), com/facebook/FacebookActivity);
	//   93  202:aload_1         
	//   94  203:invokestatic    #131 <Method Context FacebookSdk.getApplicationContext()>
	//   95  206:ldc1            #142 <Class FacebookActivity>
	//   96  208:invokevirtual   #146 <Method Intent Intent.setClass(Context, Class)>
	//   97  211:pop             
		((Intent) (bundle)).setAction("FacebookDialogFragment");
	//   98  212:aload_1         
	//   99  213:ldc1            #216 <String "FacebookDialogFragment">
	//  100  215:invokevirtual   #154 <Method Intent Intent.setAction(String)>
	//  101  218:pop             
		appcall.setRequestIntent(((Intent) (bundle)));
	//  102  219:aload_0         
	//  103  220:aload_1         
	//  104  221:invokevirtual   #178 <Method void AppCall.setRequestIntent(Intent)>
	//  105  224:return          
	}
}
