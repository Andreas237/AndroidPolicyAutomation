// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.content.Context;
import android.content.Intent;
import android.content.pm.*;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.support.v4.app.Fragment;
import com.facebook.*;
import com.facebook.internal.*;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.login:
//			WebLoginMethodHandler, LoginClient

public class CustomTabLoginMethodHandler extends WebLoginMethodHandler
{

	CustomTabLoginMethodHandler(Parcel parcel)
	{
		super(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #45  <Method void WebLoginMethodHandler(Parcel)>
		expectedChallenge = parcel.readString();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #51  <Method String Parcel.readString()>
	//    6   10:putfield        #53  <Field String expectedChallenge>
	//    7   13:return          
	}

	CustomTabLoginMethodHandler(LoginClient loginclient)
	{
		super(loginclient);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void WebLoginMethodHandler(LoginClient)>
		expectedChallenge = Utility.generateRandomString(20);
	//    3    5:aload_0         
	//    4    6:bipush          20
	//    5    8:invokestatic    #62  <Method String Utility.generateRandomString(int)>
	//    6   11:putfield        #53  <Field String expectedChallenge>
	//    7   14:return          
	}

	private String getChromePackage()
	{
label0:
		{
			Object obj = ((Object) (currentPackage));
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field String currentPackage>
	//    2    4:astore_1        
			if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
				return ((String) (obj));
	//    5    9:aload_1         
	//    6   10:areturn         
			obj = ((Object) (loginClient.getActivity()));
	//    7   11:aload_0         
	//    8   12:getfield        #69  <Field LoginClient loginClient>
	//    9   15:invokevirtual   #75  <Method android.support.v4.app.FragmentActivity LoginClient.getActivity()>
	//   10   18:astore_1        
			Object obj1 = ((Object) (new Intent("android.support.customtabs.action.CustomTabsService")));
	//   11   19:new             #77  <Class Intent>
	//   12   22:dup             
	//   13   23:ldc1            #20  <String "android.support.customtabs.action.CustomTabsService">
	//   14   25:invokespecial   #80  <Method void Intent(String)>
	//   15   28:astore_2        
			obj1 = ((Object) (((Context) (obj)).getPackageManager().queryIntentServices(((Intent) (obj1)), 0)));
	//   16   29:aload_1         
	//   17   30:invokevirtual   #86  <Method PackageManager Context.getPackageManager()>
	//   18   33:aload_2         
	//   19   34:iconst_0        
	//   20   35:invokevirtual   #92  <Method List PackageManager.queryIntentServices(Intent, int)>
	//   21   38:astore_2        
			if(obj1 == null)
				break label0;
	//   22   39:aload_2         
	//   23   40:ifnull          116
			obj = ((Object) (new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (CHROME_PACKAGES))))))));
	//   24   43:new             #94  <Class HashSet>
	//   25   46:dup             
	//   26   47:getstatic       #36  <Field String[] CHROME_PACKAGES>
	//   27   50:invokestatic    #100 <Method List Arrays.asList(Object[])>
	//   28   53:invokespecial   #103 <Method void HashSet(java.util.Collection)>
	//   29   56:astore_1        
			obj1 = ((Object) (((List) (obj1)).iterator()));
	//   30   57:aload_2         
	//   31   58:invokeinterface #109 <Method Iterator List.iterator()>
	//   32   63:astore_2        
			ServiceInfo serviceinfo;
			do
			{
				if(!((Iterator) (obj1)).hasNext())
					break label0;
	//   33   64:aload_2         
	//   34   65:invokeinterface #115 <Method boolean Iterator.hasNext()>
	//   35   70:ifeq            116
				serviceinfo = ((ResolveInfo)((Iterator) (obj1)).next()).serviceInfo;
	//   36   73:aload_2         
	//   37   74:invokeinterface #119 <Method Object Iterator.next()>
	//   38   79:checkcast       #121 <Class ResolveInfo>
	//   39   82:getfield        #125 <Field ServiceInfo ResolveInfo.serviceInfo>
	//   40   85:astore_3        
			} while(serviceinfo == null || !((Set) (obj)).contains(((Object) (serviceinfo.packageName))));
	//   41   86:aload_3         
	//   42   87:ifnull          64
	//   43   90:aload_1         
	//   44   91:aload_3         
	//   45   92:getfield        #130 <Field String ServiceInfo.packageName>
	//   46   95:invokeinterface #136 <Method boolean Set.contains(Object)>
	//   47  100:ifeq            64
			currentPackage = serviceinfo.packageName;
	//   48  103:aload_0         
	//   49  104:aload_3         
	//   50  105:getfield        #130 <Field String ServiceInfo.packageName>
	//   51  108:putfield        #65  <Field String currentPackage>
			return currentPackage;
	//   52  111:aload_0         
	//   53  112:getfield        #65  <Field String currentPackage>
	//   54  115:areturn         
		}
		return null;
	//   55  116:aconst_null     
	//   56  117:areturn         
	}

	private boolean isCustomTabsAllowed()
	{
		return isCustomTabsEnabled() && getChromePackage() != null && isCustomTabsCompatibleWithAutofill() && Validate.hasCustomTabRedirectActivity(FacebookSdk.getApplicationContext());
	//    0    0:aload_0         
	//    1    1:invokespecial   #140 <Method boolean isCustomTabsEnabled()>
	//    2    4:ifeq            32
	//    3    7:aload_0         
	//    4    8:invokespecial   #142 <Method String getChromePackage()>
	//    5   11:ifnull          32
	//    6   14:aload_0         
	//    7   15:invokespecial   #145 <Method boolean isCustomTabsCompatibleWithAutofill()>
	//    8   18:ifeq            32
	//    9   21:invokestatic    #151 <Method Context FacebookSdk.getApplicationContext()>
	//   10   24:invokestatic    #157 <Method boolean Validate.hasCustomTabRedirectActivity(Context)>
	//   11   27:ifeq            32
	//   12   30:iconst_1        
	//   13   31:ireturn         
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	private boolean isCustomTabsCompatibleWithAutofill()
	{
		return !Utility.isAutofillAvailable(((Context) (loginClient.getActivity())));
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field LoginClient loginClient>
	//    2    4:invokevirtual   #75  <Method android.support.v4.app.FragmentActivity LoginClient.getActivity()>
	//    3    7:invokestatic    #160 <Method boolean Utility.isAutofillAvailable(Context)>
	//    4   10:ifne            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	private boolean isCustomTabsEnabled()
	{
		FetchedAppSettings fetchedappsettings = FetchedAppSettingsManager.getAppSettingsWithoutQuery(Utility.getMetadataApplicationId(((Context) (loginClient.getActivity()))));
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field LoginClient loginClient>
	//    2    4:invokevirtual   #75  <Method android.support.v4.app.FragmentActivity LoginClient.getActivity()>
	//    3    7:invokestatic    #164 <Method String Utility.getMetadataApplicationId(Context)>
	//    4   10:invokestatic    #170 <Method FetchedAppSettings FetchedAppSettingsManager.getAppSettingsWithoutQuery(String)>
	//    5   13:astore_1        
		return fetchedappsettings != null && fetchedappsettings.getCustomTabsEnabled();
	//    6   14:aload_1         
	//    7   15:ifnull          27
	//    8   18:aload_1         
	//    9   19:invokevirtual   #175 <Method boolean FetchedAppSettings.getCustomTabsEnabled()>
	//   10   22:ifeq            27
	//   11   25:iconst_1        
	//   12   26:ireturn         
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	private void onCustomTabComplete(String s, LoginClient.Request request)
	{
		if(s != null && s.startsWith(CustomTabMainActivity.getRedirectUrl()))
	//*   0    0:aload_1         
	//*   1    1:ifnull          277
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #184 <Method String CustomTabMainActivity.getRedirectUrl()>
	//*   4    8:invokevirtual   #188 <Method boolean String.startsWith(String)>
	//*   5   11:ifeq            277
		{
			s = ((String) (Uri.parse(s)));
	//    6   14:aload_1         
	//    7   15:invokestatic    #194 <Method Uri Uri.parse(String)>
	//    8   18:astore_1        
			Bundle bundle = Utility.parseUrlQueryString(((Uri) (s)).getQuery());
	//    9   19:aload_1         
	//   10   20:invokevirtual   #197 <Method String Uri.getQuery()>
	//   11   23:invokestatic    #201 <Method Bundle Utility.parseUrlQueryString(String)>
	//   12   26:astore          6
			bundle.putAll(Utility.parseUrlQueryString(((Uri) (s)).getFragment()));
	//   13   28:aload           6
	//   14   30:aload_1         
	//   15   31:invokevirtual   #204 <Method String Uri.getFragment()>
	//   16   34:invokestatic    #201 <Method Bundle Utility.parseUrlQueryString(String)>
	//   17   37:invokevirtual   #210 <Method void Bundle.putAll(Bundle)>
			if(!validateChallengeParam(bundle))
	//*  18   40:aload_0         
	//*  19   41:aload           6
	//*  20   43:invokespecial   #214 <Method boolean validateChallengeParam(Bundle)>
	//*  21   46:ifne            65
			{
				super.onComplete(request, ((Bundle) (null)), new FacebookException("Invalid state parameter"));
	//   22   49:aload_0         
	//   23   50:aload_2         
	//   24   51:aconst_null     
	//   25   52:new             #216 <Class FacebookException>
	//   26   55:dup             
	//   27   56:ldc1            #218 <String "Invalid state parameter">
	//   28   58:invokespecial   #219 <Method void FacebookException(String)>
	//   29   61:invokespecial   #223 <Method void WebLoginMethodHandler.onComplete(LoginClient$Request, Bundle, FacebookException)>
				return;
	//   30   64:return          
			}
			s = bundle.getString("error");
	//   31   65:aload           6
	//   32   67:ldc1            #225 <String "error">
	//   33   69:invokevirtual   #229 <Method String Bundle.getString(String)>
	//   34   72:astore_1        
			String s1 = s;
	//   35   73:aload_1         
	//   36   74:astore          4
			if(s == null)
	//*  37   76:aload_1         
	//*  38   77:ifnonnull       89
				s1 = bundle.getString("error_type");
	//   39   80:aload           6
	//   40   82:ldc1            #231 <String "error_type">
	//   41   84:invokevirtual   #229 <Method String Bundle.getString(String)>
	//   42   87:astore          4
			String s2 = bundle.getString("error_msg");
	//   43   89:aload           6
	//   44   91:ldc1            #233 <String "error_msg">
	//   45   93:invokevirtual   #229 <Method String Bundle.getString(String)>
	//   46   96:astore          5
			s = s2;
	//   47   98:aload           5
	//   48  100:astore_1        
			if(s2 == null)
	//*  49  101:aload           5
	//*  50  103:ifnonnull       114
				s = bundle.getString("error_message");
	//   51  106:aload           6
	//   52  108:ldc1            #235 <String "error_message">
	//   53  110:invokevirtual   #229 <Method String Bundle.getString(String)>
	//   54  113:astore_1        
			s2 = s;
	//   55  114:aload_1         
	//   56  115:astore          5
			if(s == null)
	//*  57  117:aload_1         
	//*  58  118:ifnonnull       130
				s2 = bundle.getString("error_description");
	//   59  121:aload           6
	//   60  123:ldc1            #237 <String "error_description">
	//   61  125:invokevirtual   #229 <Method String Bundle.getString(String)>
	//   62  128:astore          5
			s = bundle.getString("error_code");
	//   63  130:aload           6
	//   64  132:ldc1            #239 <String "error_code">
	//   65  134:invokevirtual   #229 <Method String Bundle.getString(String)>
	//   66  137:astore_1        
			int i;
			if(!Utility.isNullOrEmpty(s))
	//*  67  138:aload_1         
	//*  68  139:invokestatic    #242 <Method boolean Utility.isNullOrEmpty(String)>
	//*  69  142:ifne            158
				try
				{
					i = Integer.parseInt(s);
	//   70  145:aload_1         
	//   71  146:invokestatic    #248 <Method int Integer.parseInt(String)>
	//   72  149:istore_3        
				}
	//*  73  150:goto            160
	//*  74  153:iconst_m1       
	//*  75  154:istore_3        
	//*  76  155:goto            160
	//*  77  158:iconst_m1       
	//*  78  159:istore_3        
	//*  79  160:aload           4
	//*  80  162:invokestatic    #242 <Method boolean Utility.isNullOrEmpty(String)>
	//*  81  165:ifeq            190
	//*  82  168:aload           5
	//*  83  170:invokestatic    #242 <Method boolean Utility.isNullOrEmpty(String)>
	//*  84  173:ifeq            190
	//*  85  176:iload_3         
	//*  86  177:iconst_m1       
	//*  87  178:icmpne          190
	//*  88  181:aload_0         
	//*  89  182:aload_2         
	//*  90  183:aload           6
	//*  91  185:aconst_null     
	//*  92  186:invokespecial   #223 <Method void WebLoginMethodHandler.onComplete(LoginClient$Request, Bundle, FacebookException)>
	//*  93  189:return          
	//*  94  190:aload           4
	//*  95  192:ifnull          229
	//*  96  195:aload           4
	//*  97  197:ldc1            #250 <String "access_denied">
	//*  98  199:invokevirtual   #253 <Method boolean String.equals(Object)>
	//*  99  202:ifne            215
	//* 100  205:aload           4
	//* 101  207:ldc1            #255 <String "OAuthAccessDeniedException">
	//* 102  209:invokevirtual   #253 <Method boolean String.equals(Object)>
	//* 103  212:ifeq            229
	//* 104  215:aload_0         
	//* 105  216:aload_2         
	//* 106  217:aconst_null     
	//* 107  218:new             #257 <Class FacebookOperationCanceledException>
	//* 108  221:dup             
	//* 109  222:invokespecial   #258 <Method void FacebookOperationCanceledException()>
	//* 110  225:invokespecial   #223 <Method void WebLoginMethodHandler.onComplete(LoginClient$Request, Bundle, FacebookException)>
	//* 111  228:return          
	//* 112  229:iload_3         
	//* 113  230:sipush          4201
	//* 114  233:icmpne          250
	//* 115  236:aload_0         
	//* 116  237:aload_2         
	//* 117  238:aconst_null     
	//* 118  239:new             #257 <Class FacebookOperationCanceledException>
	//* 119  242:dup             
	//* 120  243:invokespecial   #258 <Method void FacebookOperationCanceledException()>
	//* 121  246:invokespecial   #223 <Method void WebLoginMethodHandler.onComplete(LoginClient$Request, Bundle, FacebookException)>
	//* 122  249:return          
	//* 123  250:aload_0         
	//* 124  251:aload_2         
	//* 125  252:aconst_null     
	//* 126  253:new             #260 <Class FacebookServiceException>
	//* 127  256:dup             
	//* 128  257:new             #262 <Class FacebookRequestError>
	//* 129  260:dup             
	//* 130  261:iload_3         
	//* 131  262:aload           4
	//* 132  264:aload           5
	//* 133  266:invokespecial   #265 <Method void FacebookRequestError(int, String, String)>
	//* 134  269:aload           5
	//* 135  271:invokespecial   #268 <Method void FacebookServiceException(FacebookRequestError, String)>
	//* 136  274:invokespecial   #223 <Method void WebLoginMethodHandler.onComplete(LoginClient$Request, Bundle, FacebookException)>
	//* 137  277:return          
				// Misplaced declaration of an exception variable
				catch(String s)
				{
					i = -1;
				}
			else
				i = -1;
			if(Utility.isNullOrEmpty(s1) && Utility.isNullOrEmpty(s2) && i == -1)
			{
				super.onComplete(request, bundle, ((FacebookException) (null)));
				return;
			}
			if(s1 != null && (s1.equals("access_denied") || s1.equals("OAuthAccessDeniedException")))
			{
				super.onComplete(request, ((Bundle) (null)), ((FacebookException) (new FacebookOperationCanceledException())));
				return;
			}
			if(i == 4201)
			{
				super.onComplete(request, ((Bundle) (null)), ((FacebookException) (new FacebookOperationCanceledException())));
				return;
			}
			super.onComplete(request, ((Bundle) (null)), ((FacebookException) (new FacebookServiceException(new FacebookRequestError(i, s1, s2), s2))));
		}
	//* 138  278:astore_1        
	//* 139  279:goto            153
	}

	private boolean validateChallengeParam(Bundle bundle)
	{
		boolean flag;
		try
		{
			bundle = ((Bundle) (bundle.getString("state")));
	//    0    0:aload_1         
	//    1    1:ldc2            #272 <String "state">
	//    2    4:invokevirtual   #229 <Method String Bundle.getString(String)>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       14
	//*   6   12:iconst_0        
	//*   7   13:ireturn         
	//*   8   14:new             #274 <Class JSONObject>
	//*   9   17:dup             
	//*  10   18:aload_1         
	//*  11   19:invokespecial   #275 <Method void JSONObject(String)>
	//*  12   22:ldc2            #277 <String "7_challenge">
	//*  13   25:invokevirtual   #278 <Method String JSONObject.getString(String)>
	//*  14   28:aload_0         
	//*  15   29:getfield        #53  <Field String expectedChallenge>
	//*  16   32:invokevirtual   #253 <Method boolean String.equals(Object)>
	//*  17   35:istore_2        
	//*  18   36:iload_2         
	//*  19   37:ireturn         
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  20   38:astore_1        
		{
			return false;
	//   21   39:iconst_0        
	//   22   40:ireturn         
		}
		if(bundle == null)
			return false;
		flag = (new JSONObject(((String) (bundle)))).getString("7_challenge").equals(((Object) (expectedChallenge)));
		return flag;
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	String getNameForLogging()
	{
		return "custom_tab";
	//    0    0:ldc2            #283 <String "custom_tab">
	//    1    3:areturn         
	}

	protected String getSSODevice()
	{
		return "chrome_custom_tab";
	//    0    0:ldc2            #286 <String "chrome_custom_tab">
	//    1    3:areturn         
	}

	AccessTokenSource getTokenSource()
	{
		return AccessTokenSource.CHROME_CUSTOM_TAB;
	//    0    0:getstatic       #294 <Field AccessTokenSource AccessTokenSource.CHROME_CUSTOM_TAB>
	//    1    3:areturn         
	}

	boolean onActivityResult(int i, int j, Intent intent)
	{
		if(i != 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpeq          13
			return super.onActivityResult(i, j, intent);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #298 <Method boolean WebLoginMethodHandler.onActivityResult(int, int, Intent)>
	//    8   12:ireturn         
		LoginClient.Request request = loginClient.getPendingRequest();
	//    9   13:aload_0         
	//   10   14:getfield        #69  <Field LoginClient loginClient>
	//   11   17:invokevirtual   #302 <Method LoginClient$Request LoginClient.getPendingRequest()>
	//   12   20:astore          4
		if(j == -1)
	//*  13   22:iload_2         
	//*  14   23:iconst_m1       
	//*  15   24:icmpne          42
		{
			onCustomTabComplete(intent.getStringExtra(CustomTabMainActivity.EXTRA_URL), request);
	//   16   27:aload_0         
	//   17   28:aload_3         
	//   18   29:getstatic       #305 <Field String CustomTabMainActivity.EXTRA_URL>
	//   19   32:invokevirtual   #308 <Method String Intent.getStringExtra(String)>
	//   20   35:aload           4
	//   21   37:invokespecial   #310 <Method void onCustomTabComplete(String, LoginClient$Request)>
			return true;
	//   22   40:iconst_1        
	//   23   41:ireturn         
		} else
		{
			super.onComplete(request, ((Bundle) (null)), ((FacebookException) (new FacebookOperationCanceledException())));
	//   24   42:aload_0         
	//   25   43:aload           4
	//   26   45:aconst_null     
	//   27   46:new             #257 <Class FacebookOperationCanceledException>
	//   28   49:dup             
	//   29   50:invokespecial   #258 <Method void FacebookOperationCanceledException()>
	//   30   53:invokespecial   #223 <Method void WebLoginMethodHandler.onComplete(LoginClient$Request, Bundle, FacebookException)>
			return false;
	//   31   56:iconst_0        
	//   32   57:ireturn         
		}
	}

	protected void putChallengeParam(JSONObject jsonobject)
		throws JSONException
	{
		jsonobject.put("7_challenge", ((Object) (expectedChallenge)));
	//    0    0:aload_1         
	//    1    1:ldc2            #277 <String "7_challenge">
	//    2    4:aload_0         
	//    3    5:getfield        #53  <Field String expectedChallenge>
	//    4    8:invokevirtual   #316 <Method JSONObject JSONObject.put(String, Object)>
	//    5   11:pop             
	//    6   12:return          
	}

	boolean tryAuthorize(LoginClient.Request request)
	{
		if(!isCustomTabsAllowed())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #321 <Method boolean isCustomTabsAllowed()>
	//*   2    4:ifne            9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			request = ((LoginClient.Request) (addExtraParameters(getParameters(request), request)));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #325 <Method Bundle getParameters(LoginClient$Request)>
	//    9   15:aload_1         
	//   10   16:invokevirtual   #329 <Method Bundle addExtraParameters(Bundle, LoginClient$Request)>
	//   11   19:astore_1        
			Intent intent = new Intent(((Context) (loginClient.getActivity())), com/facebook/CustomTabMainActivity);
	//   12   20:new             #77  <Class Intent>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:getfield        #69  <Field LoginClient loginClient>
	//   16   28:invokevirtual   #75  <Method android.support.v4.app.FragmentActivity LoginClient.getActivity()>
	//   17   31:ldc1            #181 <Class CustomTabMainActivity>
	//   18   33:invokespecial   #332 <Method void Intent(Context, Class)>
	//   19   36:astore_2        
			intent.putExtra(CustomTabMainActivity.EXTRA_PARAMS, ((Bundle) (request)));
	//   20   37:aload_2         
	//   21   38:getstatic       #335 <Field String CustomTabMainActivity.EXTRA_PARAMS>
	//   22   41:aload_1         
	//   23   42:invokevirtual   #339 <Method Intent Intent.putExtra(String, Bundle)>
	//   24   45:pop             
			intent.putExtra(CustomTabMainActivity.EXTRA_CHROME_PACKAGE, getChromePackage());
	//   25   46:aload_2         
	//   26   47:getstatic       #342 <Field String CustomTabMainActivity.EXTRA_CHROME_PACKAGE>
	//   27   50:aload_0         
	//   28   51:invokespecial   #142 <Method String getChromePackage()>
	//   29   54:invokevirtual   #345 <Method Intent Intent.putExtra(String, String)>
	//   30   57:pop             
			loginClient.getFragment().startActivityForResult(intent, 1);
	//   31   58:aload_0         
	//   32   59:getfield        #69  <Field LoginClient loginClient>
	//   33   62:invokevirtual   #348 <Method Fragment LoginClient.getFragment()>
	//   34   65:aload_2         
	//   35   66:iconst_1        
	//   36   67:invokevirtual   #354 <Method void Fragment.startActivityForResult(Intent, int)>
			return true;
	//   37   70:iconst_1        
	//   38   71:ireturn         
		}
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		super.writeToParcel(parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #358 <Method void WebLoginMethodHandler.writeToParcel(Parcel, int)>
		parcel.writeString(expectedChallenge);
	//    4    6:aload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #53  <Field String expectedChallenge>
	//    7   11:invokevirtual   #361 <Method void Parcel.writeString(String)>
	//    8   14:return          
	}

	private static final int API_EC_DIALOG_CANCEL = 4201;
	private static final int CHALLENGE_LENGTH = 20;
	private static final String CHROME_PACKAGES[] = {
		"com.android.chrome", "com.chrome.beta", "com.chrome.dev"
	};
	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public CustomTabLoginMethodHandler createFromParcel(Parcel parcel)
		{
			return new CustomTabLoginMethodHandler(parcel);
		//    0    0:new             #8   <Class CustomTabLoginMethodHandler>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #18  <Method void CustomTabLoginMethodHandler(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #21  <Method CustomTabLoginMethodHandler createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public CustomTabLoginMethodHandler[] newArray(int i)
		{
			return new CustomTabLoginMethodHandler[i];
		//    0    0:iload_1         
		//    1    1:anewarray       CustomTabLoginMethodHandler[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #26  <Method CustomTabLoginMethodHandler[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private static final String CUSTOM_TABS_SERVICE_ACTION = "android.support.customtabs.action.CustomTabsService";
	private static final int CUSTOM_TAB_REQUEST_CODE = 1;
	private String currentPackage;
	private String expectedChallenge;

	static 
	{
	//    0    0:iconst_3        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #30  <String "com.android.chrome">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #32  <String "com.chrome.beta">
	//    9   13:aastore         
	//   10   14:dup             
	//   11   15:iconst_2        
	//   12   16:ldc1            #34  <String "com.chrome.dev">
	//   13   18:aastore         
	//   14   19:putstatic       #36  <Field String[] CHROME_PACKAGES>
	//   15   22:new             #6   <Class CustomTabLoginMethodHandler$1>
	//   16   25:dup             
	//   17   26:invokespecial   #39  <Method void CustomTabLoginMethodHandler$1()>
	//   18   29:putstatic       #41  <Field android.os.Parcelable$Creator CREATOR>
	//*  19   32:return          
	}
}
