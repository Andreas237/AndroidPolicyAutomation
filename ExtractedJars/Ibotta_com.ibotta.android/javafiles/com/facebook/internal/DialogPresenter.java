// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.*;
import java.util.UUID;

// Referenced classes of package com.facebook.internal:
//			DialogFeature, FetchedAppSettings, NativeProtocol, AppCall, 
//			FragmentWrapper, Validate, ServerProtocol, Utility

public class DialogPresenter
{
	public static interface ParameterProvider
	{

		public abstract Bundle getLegacyParameters();

		public abstract Bundle getParameters();
	}


	public static boolean canPresentNativeDialogWithFeature(DialogFeature dialogfeature)
	{
		return getProtocolVersionForNativeDialog(dialogfeature).getProtocolVersion() != -1;
	//    0    0:aload_0         
	//    1    1:invokestatic    #13  <Method NativeProtocol$ProtocolVersionQueryResult getProtocolVersionForNativeDialog(DialogFeature)>
	//    2    4:invokevirtual   #19  <Method int NativeProtocol$ProtocolVersionQueryResult.getProtocolVersion()>
	//    3    7:iconst_m1       
	//    4    8:icmpeq          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private static Uri getDialogWebFallbackUri(DialogFeature dialogfeature)
	{
		String s = dialogfeature.name();
	//    0    0:aload_0         
	//    1    1:invokeinterface #28  <Method String DialogFeature.name()>
	//    2    6:astore_1        
		dialogfeature = ((DialogFeature) (dialogfeature.getAction()));
	//    3    7:aload_0         
	//    4    8:invokeinterface #31  <Method String DialogFeature.getAction()>
	//    5   13:astore_0        
		dialogfeature = ((DialogFeature) (FetchedAppSettings.getDialogFeatureConfig(FacebookSdk.getApplicationId(), ((String) (dialogfeature)), s)));
	//    6   14:invokestatic    #36  <Method String FacebookSdk.getApplicationId()>
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokestatic    #42  <Method FetchedAppSettings$DialogFeatureConfig FetchedAppSettings.getDialogFeatureConfig(String, String, String)>
	//   10   22:astore_0        
		if(dialogfeature != null)
	//*  11   23:aload_0         
	//*  12   24:ifnull          32
			return ((FetchedAppSettings.DialogFeatureConfig) (dialogfeature)).getFallbackUrl();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #48  <Method Uri FetchedAppSettings$DialogFeatureConfig.getFallbackUrl()>
	//   15   31:areturn         
		else
			return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
	}

	public static NativeProtocol.ProtocolVersionQueryResult getProtocolVersionForNativeDialog(DialogFeature dialogfeature)
	{
		String s = FacebookSdk.getApplicationId();
	//    0    0:invokestatic    #36  <Method String FacebookSdk.getApplicationId()>
	//    1    3:astore_1        
		String s1 = dialogfeature.getAction();
	//    2    4:aload_0         
	//    3    5:invokeinterface #31  <Method String DialogFeature.getAction()>
	//    4   10:astore_2        
		return NativeProtocol.getLatestAvailableProtocolVersionForAction(s1, getVersionSpecForFeature(s, s1, dialogfeature));
	//    5   11:aload_2         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:aload_0         
	//    9   15:invokestatic    #52  <Method int[] getVersionSpecForFeature(String, String, DialogFeature)>
	//   10   18:invokestatic    #58  <Method NativeProtocol$ProtocolVersionQueryResult NativeProtocol.getLatestAvailableProtocolVersionForAction(String, int[])>
	//   11   21:areturn         
	}

	private static int[] getVersionSpecForFeature(String s, String s1, DialogFeature dialogfeature)
	{
		s = ((String) (FetchedAppSettings.getDialogFeatureConfig(s, s1, dialogfeature.name())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokeinterface #28  <Method String DialogFeature.name()>
	//    4    8:invokestatic    #42  <Method FetchedAppSettings$DialogFeatureConfig FetchedAppSettings.getDialogFeatureConfig(String, String, String)>
	//    5   11:astore_0        
		if(s != null)
	//*   6   12:aload_0         
	//*   7   13:ifnull          21
			return ((FetchedAppSettings.DialogFeatureConfig) (s)).getVersionSpec();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #62  <Method int[] FetchedAppSettings$DialogFeatureConfig.getVersionSpec()>
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
	//   16   27:invokeinterface #65  <Method int DialogFeature.getMinVersion()>
	//   17   32:iastore         
	//   18   33:areturn         
	}

	public static void present(AppCall appcall, Activity activity)
	{
		activity.startActivityForResult(appcall.getRequestIntent(), appcall.getRequestCode());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #73  <Method Intent AppCall.getRequestIntent()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #76  <Method int AppCall.getRequestCode()>
	//    5    9:invokevirtual   #82  <Method void Activity.startActivityForResult(Intent, int)>
		appcall.setPending();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #86  <Method boolean AppCall.setPending()>
	//    8   16:pop             
	//    9   17:return          
	}

	public static void present(AppCall appcall, FragmentWrapper fragmentwrapper)
	{
		fragmentwrapper.startActivityForResult(appcall.getRequestIntent(), appcall.getRequestCode());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #73  <Method Intent AppCall.getRequestIntent()>
	//    3    5:aload_0         
	//    4    6:invokevirtual   #76  <Method int AppCall.getRequestCode()>
	//    5    9:invokevirtual   #90  <Method void FragmentWrapper.startActivityForResult(Intent, int)>
		appcall.setPending();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #86  <Method boolean AppCall.setPending()>
	//    8   16:pop             
	//    9   17:return          
	}

	public static void setupAppCallForCannotShowError(AppCall appcall)
	{
		setupAppCallForValidationError(appcall, new FacebookException("Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14."));
	//    0    0:aload_0         
	//    1    1:new             #94  <Class FacebookException>
	//    2    4:dup             
	//    3    5:ldc1            #96  <String "Unable to show the provided content via the web or the installed version of the Facebook app. Some dialogs are only supported starting API 14.">
	//    4    7:invokespecial   #100 <Method void FacebookException(String)>
	//    5   10:invokestatic    #104 <Method void setupAppCallForValidationError(AppCall, FacebookException)>
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
	//    3    5:invokestatic    #109 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    4    8:invokestatic    #115 <Method void Validate.hasFacebookActivity(android.content.Context)>
			Intent intent = new Intent();
	//    5   11:new             #117 <Class Intent>
	//    6   14:dup             
	//    7   15:invokespecial   #120 <Method void Intent()>
	//    8   18:astore_2        
			intent.setClass(FacebookSdk.getApplicationContext(), com/facebook/FacebookActivity);
	//    9   19:aload_2         
	//   10   20:invokestatic    #109 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//   11   23:ldc1            #122 <Class FacebookActivity>
	//   12   25:invokevirtual   #126 <Method Intent Intent.setClass(android.content.Context, Class)>
	//   13   28:pop             
			intent.setAction(FacebookActivity.PASS_THROUGH_CANCEL_ACTION);
	//   14   29:aload_2         
	//   15   30:getstatic       #130 <Field String FacebookActivity.PASS_THROUGH_CANCEL_ACTION>
	//   16   33:invokevirtual   #134 <Method Intent Intent.setAction(String)>
	//   17   36:pop             
			NativeProtocol.setupProtocolRequestIntent(intent, appcall.getCallId().toString(), ((String) (null)), NativeProtocol.getLatestKnownVersion(), NativeProtocol.createBundleForException(facebookexception));
	//   18   37:aload_2         
	//   19   38:aload_0         
	//   20   39:invokevirtual   #138 <Method UUID AppCall.getCallId()>
	//   21   42:invokevirtual   #143 <Method String UUID.toString()>
	//   22   45:aconst_null     
	//   23   46:invokestatic    #146 <Method int NativeProtocol.getLatestKnownVersion()>
	//   24   49:aload_1         
	//   25   50:invokestatic    #150 <Method Bundle NativeProtocol.createBundleForException(FacebookException)>
	//   26   53:invokestatic    #154 <Method void NativeProtocol.setupProtocolRequestIntent(Intent, String, String, int, Bundle)>
			appcall.setRequestIntent(intent);
	//   27   56:aload_0         
	//   28   57:aload_2         
	//   29   58:invokevirtual   #158 <Method void AppCall.setRequestIntent(Intent)>
			return;
	//   30   61:return          
		}
	}

	public static void setupAppCallForNativeDialog(AppCall appcall, ParameterProvider parameterprovider, DialogFeature dialogfeature)
	{
		android.content.Context context = FacebookSdk.getApplicationContext();
	//    0    0:invokestatic    #109 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    1    3:astore          4
		String s = dialogfeature.getAction();
	//    2    5:aload_2         
	//    3    6:invokeinterface #31  <Method String DialogFeature.getAction()>
	//    4   11:astore          5
		NativeProtocol.ProtocolVersionQueryResult protocolversionqueryresult = getProtocolVersionForNativeDialog(dialogfeature);
	//    5   13:aload_2         
	//    6   14:invokestatic    #13  <Method NativeProtocol$ProtocolVersionQueryResult getProtocolVersionForNativeDialog(DialogFeature)>
	//    7   17:astore          6
		int i = protocolversionqueryresult.getProtocolVersion();
	//    8   19:aload           6
	//    9   21:invokevirtual   #19  <Method int NativeProtocol$ProtocolVersionQueryResult.getProtocolVersion()>
	//   10   24:istore_3        
		if(i != -1)
	//*  11   25:iload_3         
	//*  12   26:iconst_m1       
	//*  13   27:icmpeq          106
		{
			if(NativeProtocol.isVersionCompatibleWithBucketedIntent(i))
	//*  14   30:iload_3         
	//*  15   31:invokestatic    #164 <Method boolean NativeProtocol.isVersionCompatibleWithBucketedIntent(int)>
	//*  16   34:ifeq            47
				parameterprovider = ((ParameterProvider) (parameterprovider.getParameters()));
	//   17   37:aload_1         
	//   18   38:invokeinterface #168 <Method Bundle DialogPresenter$ParameterProvider.getParameters()>
	//   19   43:astore_1        
			else
	//*  20   44:goto            54
				parameterprovider = ((ParameterProvider) (parameterprovider.getLegacyParameters()));
	//   21   47:aload_1         
	//   22   48:invokeinterface #171 <Method Bundle DialogPresenter$ParameterProvider.getLegacyParameters()>
	//   23   53:astore_1        
			dialogfeature = ((DialogFeature) (parameterprovider));
	//   24   54:aload_1         
	//   25   55:astore_2        
			if(parameterprovider == null)
	//*  26   56:aload_1         
	//*  27   57:ifnonnull       68
				dialogfeature = ((DialogFeature) (new Bundle()));
	//   28   60:new             #173 <Class Bundle>
	//   29   63:dup             
	//   30   64:invokespecial   #174 <Method void Bundle()>
	//   31   67:astore_2        
			parameterprovider = ((ParameterProvider) (NativeProtocol.createPlatformActivityIntent(context, appcall.getCallId().toString(), s, protocolversionqueryresult, ((Bundle) (dialogfeature)))));
	//   32   68:aload           4
	//   33   70:aload_0         
	//   34   71:invokevirtual   #138 <Method UUID AppCall.getCallId()>
	//   35   74:invokevirtual   #143 <Method String UUID.toString()>
	//   36   77:aload           5
	//   37   79:aload           6
	//   38   81:aload_2         
	//   39   82:invokestatic    #178 <Method Intent NativeProtocol.createPlatformActivityIntent(android.content.Context, String, String, NativeProtocol$ProtocolVersionQueryResult, Bundle)>
	//   40   85:astore_1        
			if(parameterprovider != null)
	//*  41   86:aload_1         
	//*  42   87:ifnull          96
			{
				appcall.setRequestIntent(((Intent) (parameterprovider)));
	//   43   90:aload_0         
	//   44   91:aload_1         
	//   45   92:invokevirtual   #158 <Method void AppCall.setRequestIntent(Intent)>
				return;
	//   46   95:return          
			} else
			{
				throw new FacebookException("Unable to create Intent; this likely means theFacebook app is not installed.");
	//   47   96:new             #94  <Class FacebookException>
	//   48   99:dup             
	//   49  100:ldc1            #180 <String "Unable to create Intent; this likely means theFacebook app is not installed.">
	//   50  102:invokespecial   #100 <Method void FacebookException(String)>
	//   51  105:athrow          
			}
		} else
		{
			throw new FacebookException("Cannot present this dialog. This likely means that the Facebook app is not installed.");
	//   52  106:new             #94  <Class FacebookException>
	//   53  109:dup             
	//   54  110:ldc1            #182 <String "Cannot present this dialog. This likely means that the Facebook app is not installed.">
	//   55  112:invokespecial   #100 <Method void FacebookException(String)>
	//   56  115:athrow          
		}
	}

	public static void setupAppCallForValidationError(AppCall appcall, FacebookException facebookexception)
	{
		setupAppCallForErrorResult(appcall, facebookexception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #184 <Method void setupAppCallForErrorResult(AppCall, FacebookException)>
	//    3    5:return          
	}

	public static void setupAppCallForWebDialog(AppCall appcall, String s, Bundle bundle)
	{
		Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
	//    0    0:invokestatic    #109 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    1    3:invokestatic    #115 <Method void Validate.hasFacebookActivity(android.content.Context)>
		Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
	//    2    6:invokestatic    #109 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    3    9:invokestatic    #189 <Method void Validate.hasInternetPermissions(android.content.Context)>
		Bundle bundle1 = new Bundle();
	//    4   12:new             #173 <Class Bundle>
	//    5   15:dup             
	//    6   16:invokespecial   #174 <Method void Bundle()>
	//    7   19:astore_3        
		bundle1.putString("action", s);
	//    8   20:aload_3         
	//    9   21:ldc1            #191 <String "action">
	//   10   23:aload_1         
	//   11   24:invokevirtual   #195 <Method void Bundle.putString(String, String)>
		bundle1.putBundle("params", bundle);
	//   12   27:aload_3         
	//   13   28:ldc1            #197 <String "params">
	//   14   30:aload_2         
	//   15   31:invokevirtual   #201 <Method void Bundle.putBundle(String, Bundle)>
		bundle = ((Bundle) (new Intent()));
	//   16   34:new             #117 <Class Intent>
	//   17   37:dup             
	//   18   38:invokespecial   #120 <Method void Intent()>
	//   19   41:astore_2        
		NativeProtocol.setupProtocolRequestIntent(((Intent) (bundle)), appcall.getCallId().toString(), s, NativeProtocol.getLatestKnownVersion(), bundle1);
	//   20   42:aload_2         
	//   21   43:aload_0         
	//   22   44:invokevirtual   #138 <Method UUID AppCall.getCallId()>
	//   23   47:invokevirtual   #143 <Method String UUID.toString()>
	//   24   50:aload_1         
	//   25   51:invokestatic    #146 <Method int NativeProtocol.getLatestKnownVersion()>
	//   26   54:aload_3         
	//   27   55:invokestatic    #154 <Method void NativeProtocol.setupProtocolRequestIntent(Intent, String, String, int, Bundle)>
		((Intent) (bundle)).setClass(FacebookSdk.getApplicationContext(), com/facebook/FacebookActivity);
	//   28   58:aload_2         
	//   29   59:invokestatic    #109 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//   30   62:ldc1            #122 <Class FacebookActivity>
	//   31   64:invokevirtual   #126 <Method Intent Intent.setClass(android.content.Context, Class)>
	//   32   67:pop             
		((Intent) (bundle)).setAction("FacebookDialogFragment");
	//   33   68:aload_2         
	//   34   69:ldc1            #203 <String "FacebookDialogFragment">
	//   35   71:invokevirtual   #134 <Method Intent Intent.setAction(String)>
	//   36   74:pop             
		appcall.setRequestIntent(((Intent) (bundle)));
	//   37   75:aload_0         
	//   38   76:aload_2         
	//   39   77:invokevirtual   #158 <Method void AppCall.setRequestIntent(Intent)>
	//   40   80:return          
	}

	public static void setupAppCallForWebFallbackDialog(AppCall appcall, Bundle bundle, DialogFeature dialogfeature)
	{
		Validate.hasFacebookActivity(FacebookSdk.getApplicationContext());
	//    0    0:invokestatic    #109 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    1    3:invokestatic    #115 <Method void Validate.hasFacebookActivity(android.content.Context)>
		Validate.hasInternetPermissions(FacebookSdk.getApplicationContext());
	//    2    6:invokestatic    #109 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    3    9:invokestatic    #189 <Method void Validate.hasInternetPermissions(android.content.Context)>
		Object obj = ((Object) (dialogfeature.name()));
	//    4   12:aload_2         
	//    5   13:invokeinterface #28  <Method String DialogFeature.name()>
	//    6   18:astore          4
		Uri uri = getDialogWebFallbackUri(dialogfeature);
	//    7   20:aload_2         
	//    8   21:invokestatic    #207 <Method Uri getDialogWebFallbackUri(DialogFeature)>
	//    9   24:astore          5
		if(uri != null)
	//*  10   26:aload           5
	//*  11   28:ifnull          182
		{
			int i = NativeProtocol.getLatestKnownVersion();
	//   12   31:invokestatic    #146 <Method int NativeProtocol.getLatestKnownVersion()>
	//   13   34:istore_3        
			bundle = ServerProtocol.getQueryParamsForPlatformActivityIntentWebFallback(appcall.getCallId().toString(), i, bundle);
	//   14   35:aload_0         
	//   15   36:invokevirtual   #138 <Method UUID AppCall.getCallId()>
	//   16   39:invokevirtual   #143 <Method String UUID.toString()>
	//   17   42:iload_3         
	//   18   43:aload_1         
	//   19   44:invokestatic    #213 <Method Bundle ServerProtocol.getQueryParamsForPlatformActivityIntentWebFallback(String, int, Bundle)>
	//   20   47:astore_1        
			if(bundle != null)
	//*  21   48:aload_1         
	//*  22   49:ifnull          172
			{
				if(uri.isRelative())
	//*  23   52:aload           5
	//*  24   54:invokevirtual   #218 <Method boolean Uri.isRelative()>
	//*  25   57:ifeq            76
					bundle = ((Bundle) (Utility.buildUri(ServerProtocol.getDialogAuthority(), uri.toString(), bundle)));
	//   26   60:invokestatic    #221 <Method String ServerProtocol.getDialogAuthority()>
	//   27   63:aload           5
	//   28   65:invokevirtual   #222 <Method String Uri.toString()>
	//   29   68:aload_1         
	//   30   69:invokestatic    #228 <Method Uri Utility.buildUri(String, String, Bundle)>
	//   31   72:astore_1        
				else
	//*  32   73:goto            91
					bundle = ((Bundle) (Utility.buildUri(uri.getAuthority(), uri.getPath(), bundle)));
	//   33   76:aload           5
	//   34   78:invokevirtual   #231 <Method String Uri.getAuthority()>
	//   35   81:aload           5
	//   36   83:invokevirtual   #234 <Method String Uri.getPath()>
	//   37   86:aload_1         
	//   38   87:invokestatic    #228 <Method Uri Utility.buildUri(String, String, Bundle)>
	//   39   90:astore_1        
				obj = ((Object) (new Bundle()));
	//   40   91:new             #173 <Class Bundle>
	//   41   94:dup             
	//   42   95:invokespecial   #174 <Method void Bundle()>
	//   43   98:astore          4
				((Bundle) (obj)).putString("url", ((Uri) (bundle)).toString());
	//   44  100:aload           4
	//   45  102:ldc1            #236 <String "url">
	//   46  104:aload_1         
	//   47  105:invokevirtual   #222 <Method String Uri.toString()>
	//   48  108:invokevirtual   #195 <Method void Bundle.putString(String, String)>
				((Bundle) (obj)).putBoolean("is_fallback", true);
	//   49  111:aload           4
	//   50  113:ldc1            #238 <String "is_fallback">
	//   51  115:iconst_1        
	//   52  116:invokevirtual   #242 <Method void Bundle.putBoolean(String, boolean)>
				bundle = ((Bundle) (new Intent()));
	//   53  119:new             #117 <Class Intent>
	//   54  122:dup             
	//   55  123:invokespecial   #120 <Method void Intent()>
	//   56  126:astore_1        
				NativeProtocol.setupProtocolRequestIntent(((Intent) (bundle)), appcall.getCallId().toString(), dialogfeature.getAction(), NativeProtocol.getLatestKnownVersion(), ((Bundle) (obj)));
	//   57  127:aload_1         
	//   58  128:aload_0         
	//   59  129:invokevirtual   #138 <Method UUID AppCall.getCallId()>
	//   60  132:invokevirtual   #143 <Method String UUID.toString()>
	//   61  135:aload_2         
	//   62  136:invokeinterface #31  <Method String DialogFeature.getAction()>
	//   63  141:invokestatic    #146 <Method int NativeProtocol.getLatestKnownVersion()>
	//   64  144:aload           4
	//   65  146:invokestatic    #154 <Method void NativeProtocol.setupProtocolRequestIntent(Intent, String, String, int, Bundle)>
				((Intent) (bundle)).setClass(FacebookSdk.getApplicationContext(), com/facebook/FacebookActivity);
	//   66  149:aload_1         
	//   67  150:invokestatic    #109 <Method android.content.Context FacebookSdk.getApplicationContext()>
	//   68  153:ldc1            #122 <Class FacebookActivity>
	//   69  155:invokevirtual   #126 <Method Intent Intent.setClass(android.content.Context, Class)>
	//   70  158:pop             
				((Intent) (bundle)).setAction("FacebookDialogFragment");
	//   71  159:aload_1         
	//   72  160:ldc1            #203 <String "FacebookDialogFragment">
	//   73  162:invokevirtual   #134 <Method Intent Intent.setAction(String)>
	//   74  165:pop             
				appcall.setRequestIntent(((Intent) (bundle)));
	//   75  166:aload_0         
	//   76  167:aload_1         
	//   77  168:invokevirtual   #158 <Method void AppCall.setRequestIntent(Intent)>
				return;
	//   78  171:return          
			} else
			{
				throw new FacebookException("Unable to fetch the app's key-hash");
	//   79  172:new             #94  <Class FacebookException>
	//   80  175:dup             
	//   81  176:ldc1            #244 <String "Unable to fetch the app's key-hash">
	//   82  178:invokespecial   #100 <Method void FacebookException(String)>
	//   83  181:athrow          
			}
		} else
		{
			appcall = ((AppCall) (new StringBuilder()));
	//   84  182:new             #246 <Class StringBuilder>
	//   85  185:dup             
	//   86  186:invokespecial   #247 <Method void StringBuilder()>
	//   87  189:astore_0        
			((StringBuilder) (appcall)).append("Unable to fetch the Url for the DialogFeature : '");
	//   88  190:aload_0         
	//   89  191:ldc1            #249 <String "Unable to fetch the Url for the DialogFeature : '">
	//   90  193:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//   91  196:pop             
			((StringBuilder) (appcall)).append(((String) (obj)));
	//   92  197:aload_0         
	//   93  198:aload           4
	//   94  200:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//   95  203:pop             
			((StringBuilder) (appcall)).append("'");
	//   96  204:aload_0         
	//   97  205:ldc1            #255 <String "'">
	//   98  207:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//   99  210:pop             
			throw new FacebookException(((StringBuilder) (appcall)).toString());
	//  100  211:new             #94  <Class FacebookException>
	//  101  214:dup             
	//  102  215:aload_0         
	//  103  216:invokevirtual   #256 <Method String StringBuilder.toString()>
	//  104  219:invokespecial   #100 <Method void FacebookException(String)>
	//  105  222:athrow          
		}
	}
}
