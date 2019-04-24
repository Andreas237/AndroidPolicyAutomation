// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import android.app.*;
import android.content.*;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.*;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.gigya.socialize.*;
import com.gigya.socialize.android.event.GSAccountsEventListener;
import com.gigya.socialize.android.event.GSAndroidPermissionListener;
import com.gigya.socialize.android.event.GSConnectUIListener;
import com.gigya.socialize.android.event.GSDialogListener;
import com.gigya.socialize.android.event.GSEventListener;
import com.gigya.socialize.android.event.GSLoginUIListener;
import com.gigya.socialize.android.event.GSPluginListener;
import com.gigya.socialize.android.event.GSSocializeEventListener;
import com.gigya.socialize.android.event.GSUIListener;
import com.gigya.socialize.android.lifecycle.GSActivityLifecycleCallbacks;
import com.gigya.socialize.android.log.GigyaLog;
import com.gigya.socialize.android.login.LoginProviderFactory;
import com.gigya.socialize.android.login.ProviderSelection;
import com.gigya.socialize.android.login.providers.FacebookProvider;
import com.gigya.socialize.android.login.providers.LoginProvider;
import com.gigya.socialize.android.managers.GigyaFingerprintManager;
import com.gigya.socialize.android.managers.SessionManager;
import com.gigya.socialize.android.ui.HostActivity;
import com.gigya.socialize.android.ui.PluginPresentor;
import com.gigya.socialize.android.utils.GSEncryptedPrefs;
import com.gigya.socialize.android.utils.SimpleRunnableQueue;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

// Referenced classes of package com.gigya.socialize.android:
//			GSSessionVerification, GSLoginRequest, GSPermissionResultHandler, GSSession, 
//			GSAsyncRequest

public class GSAPI
{
	public static final class LoginBehavior extends Enum
	{

		public static LoginBehavior valueOf(String s)
		{
			return (LoginBehavior)Enum.valueOf(com/gigya/socialize/android/GSAPI$LoginBehavior, s);
		//    0    0:ldc1            #2   <Class GSAPI$LoginBehavior>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class GSAPI$LoginBehavior>
		//    4    9:areturn         
		}

		public static LoginBehavior[] values()
		{
			return (LoginBehavior[])((LoginBehavior []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field GSAPI$LoginBehavior[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.gigya.socialize.android.GSAPI$LoginBehavior_3B_.clone()>
		//    2    6:checkcast       #38  <Class GSAPI$LoginBehavior[]>
		//    3    9:areturn         
		}

		private static final LoginBehavior $VALUES[];
		public static final LoginBehavior BROWSER;
		public static final LoginBehavior WEBVIEW_DIALOG;

		static 
		{
			BROWSER = new LoginBehavior("BROWSER", 0);
		//    0    0:new             #2   <Class GSAPI$LoginBehavior>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "BROWSER">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void GSAPI$LoginBehavior(String, int)>
		//    5   10:putstatic       #22  <Field GSAPI$LoginBehavior BROWSER>
			WEBVIEW_DIALOG = new LoginBehavior("WEBVIEW_DIALOG", 1);
		//    6   13:new             #2   <Class GSAPI$LoginBehavior>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "WEBVIEW_DIALOG">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void GSAPI$LoginBehavior(String, int)>
		//   11   23:putstatic       #25  <Field GSAPI$LoginBehavior WEBVIEW_DIALOG>
			$VALUES = (new LoginBehavior[] {
				BROWSER, WEBVIEW_DIALOG
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       LoginBehavior[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field GSAPI$LoginBehavior BROWSER>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field GSAPI$LoginBehavior WEBVIEW_DIALOG>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field GSAPI$LoginBehavior[] $VALUES>
		//*  23   45:return          
		}

		private LoginBehavior(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	private GSAPI()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #122 <Method void Object()>
		loginBehavior = LoginBehavior.BROWSER;
	//    2    4:aload_0         
	//    3    5:getstatic       #125 <Field GSAPI$LoginBehavior GSAPI$LoginBehavior.BROWSER>
	//    4    8:putfield        #127 <Field GSAPI$LoginBehavior loginBehavior>
		androidPermissionsRequestCode = 6000;
	//    5   11:aload_0         
	//    6   12:sipush          6000
	//    7   15:putfield        #129 <Field int androidPermissionsRequestCode>
		_isInitialized = false;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #131 <Field boolean _isInitialized>
		socializeEventListenersArray = new ArrayList();
	//   11   23:aload_0         
	//   12   24:new             #133 <Class ArrayList>
	//   13   27:dup             
	//   14   28:invokespecial   #134 <Method void ArrayList()>
	//   15   31:putfield        #136 <Field ArrayList socializeEventListenersArray>
		accountsEventListenersArray = new ArrayList();
	//   16   34:aload_0         
	//   17   35:new             #133 <Class ArrayList>
	//   18   38:dup             
	//   19   39:invokespecial   #134 <Method void ArrayList()>
	//   20   42:putfield        #138 <Field ArrayList accountsEventListenersArray>
		requestsQueue = new SimpleRunnableQueue();
	//   21   45:aload_0         
	//   22   46:new             #140 <Class SimpleRunnableQueue>
	//   23   49:dup             
	//   24   50:invokespecial   #141 <Method void SimpleRunnableQueue()>
	//   25   53:putfield        #143 <Field SimpleRunnableQueue requestsQueue>
		androidPermissionListeners = ((Map) (new HashMap()));
	//   26   56:aload_0         
	//   27   57:new             #145 <Class HashMap>
	//   28   60:dup             
	//   29   61:invokespecial   #146 <Method void HashMap()>
	//   30   64:putfield        #148 <Field Map androidPermissionListeners>
		mSessionManager = new SessionManager();
	//   31   67:aload_0         
	//   32   68:new             #150 <Class SessionManager>
	//   33   71:dup             
	//   34   72:invokespecial   #151 <Method void SessionManager()>
	//   35   75:putfield        #153 <Field SessionManager mSessionManager>
	//   36   78:return          
	}

	private void cancelSessionVerification()
	{
		if(mSessionVerification != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #211 <Field GSSessionVerification mSessionVerification>
	//*   2    4:ifnull          14
			mSessionVerification.stop();
	//    3    7:aload_0         
	//    4    8:getfield        #211 <Field GSSessionVerification mSessionVerification>
	//    5   11:invokevirtual   #216 <Method void GSSessionVerification.stop()>
	//    6   14:return          
	}

	private void checkDisabledProviders(GSObject gsobject)
	{
		if(!loginProviderFactory.hasLoginProvider("facebook"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #220 <Field LoginProviderFactory loginProviderFactory>
	//*   2    4:ldc1            #222 <String "facebook">
	//*   3    6:invokevirtual   #228 <Method boolean LoginProviderFactory.hasLoginProvider(String)>
	//*   4    9:ifne            71
		{
			String s = gsobject.getString("disabledProviders", "");
	//    5   12:aload_1         
	//    6   13:ldc1            #230 <String "disabledProviders">
	//    7   15:ldc1            #232 <String "">
	//    8   17:invokevirtual   #238 <Method String GSObject.getString(String, String)>
	//    9   20:astore_3        
			Object obj = "facebook";
	//   10   21:ldc1            #222 <String "facebook">
	//   11   23:astore_2        
			if(s.length() > 0)
	//*  12   24:aload_3         
	//*  13   25:invokevirtual   #244 <Method int String.length()>
	//*  14   28:ifle            64
			{
				obj = ((Object) (new StringBuilder()));
	//   15   31:new             #246 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:invokespecial   #247 <Method void StringBuilder()>
	//   18   38:astore_2        
				((StringBuilder) (obj)).append("facebook");
	//   19   39:aload_2         
	//   20   40:ldc1            #222 <String "facebook">
	//   21   42:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   22   45:pop             
				((StringBuilder) (obj)).append(",");
	//   23   46:aload_2         
	//   24   47:ldc1            #253 <String ",">
	//   25   49:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
				((StringBuilder) (obj)).append(s);
	//   27   53:aload_2         
	//   28   54:aload_3         
	//   29   55:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   31   59:aload_2         
	//   32   60:invokevirtual   #256 <Method String StringBuilder.toString()>
	//   33   63:astore_2        
			}
			gsobject.put("disabledProviders", ((String) (obj)));
	//   34   64:aload_1         
	//   35   65:ldc1            #230 <String "disabledProviders">
	//   36   67:aload_2         
	//   37   68:invokevirtual   #260 <Method void GSObject.put(String, String)>
		}
	//   38   71:return          
	}

	private Method findMethodInClass(Class class1, String s)
	{
		class1 = ((Class) (class1.getMethods()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #268 <Method Method[] Class.getMethods()>
	//    2    4:astore_1        
		int j = class1.length;
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:istore          4
		for(int i = 0; i < j; i++)
	//*   6    9:iconst_0        
	//*   7   10:istore_3        
	//*   8   11:iload_3         
	//*   9   12:iload           4
	//*  10   14:icmpge          44
		{
			Method method = ((Method) (class1[i]));
	//   11   17:aload_1         
	//   12   18:iload_3         
	//   13   19:aaload          
	//   14   20:astore          5
			if(method.getName().equals(((Object) (s))))
	//*  15   22:aload           5
	//*  16   24:invokevirtual   #273 <Method String Method.getName()>
	//*  17   27:aload_2         
	//*  18   28:invokevirtual   #277 <Method boolean String.equals(Object)>
	//*  19   31:ifeq            37
				return method;
	//   20   34:aload           5
	//   21   36:areturn         
		}

	//   22   37:iload_3         
	//   23   38:iconst_1        
	//   24   39:iadd            
	//   25   40:istore_3        
	//*  26   41:goto            11
		return null;
	//   27   44:aconst_null     
	//   28   45:areturn         
	}

	public static GSAPI getInstance()
	{
		if(instance != null)
			break MISSING_BLOCK_LABEL_37;
	//    0    0:getstatic       #281 <Field GSAPI instance>
	//    1    3:ifnonnull       37
		com/gigya/socialize/android/GSAPI;
	//    2    6:ldc1            #2   <Class GSAPI>
		JVM INSTR monitorenter ;
	//    3    8:monitorenter    
		if(instance == null)
	//*   4    9:getstatic       #281 <Field GSAPI instance>
	//*   5   12:ifnonnull       25
			instance = new GSAPI();
	//    6   15:new             #2   <Class GSAPI>
	//    7   18:dup             
	//    8   19:invokespecial   #282 <Method void GSAPI()>
	//    9   22:putstatic       #281 <Field GSAPI instance>
		com/gigya/socialize/android/GSAPI;
	//   10   25:ldc1            #2   <Class GSAPI>
		JVM INSTR monitorexit ;
	//   11   27:monitorexit     
		break MISSING_BLOCK_LABEL_37;
	//   12   28:goto            37
		Exception exception;
		exception;
	//   13   31:astore_0        
		com/gigya/socialize/android/GSAPI;
	//   14   32:ldc1            #2   <Class GSAPI>
		JVM INSTR monitorexit ;
	//   15   34:monitorexit     
		throw exception;
	//   16   35:aload_0         
	//   17   36:athrow          
		return instance;
	//   18   37:getstatic       #281 <Field GSAPI instance>
	//   19   40:areturn         
	}

	private void invalidateSessionVerification()
	{
		if(mSessionVerification != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #211 <Field GSSessionVerification mSessionVerification>
	//*   2    4:ifnull          14
			mSessionVerification.invalidate();
	//    3    7:aload_0         
	//    4    8:getfield        #211 <Field GSSessionVerification mSessionVerification>
	//    5   11:invokevirtual   #286 <Method void GSSessionVerification.invalidate()>
	//    6   14:return          
	}

	private void readSessionVerificationMetaData(Context context)
	{
		try
		{
			int i = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getInt("com.gigya.android.verifySessionInterval", 0);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #296 <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #299 <Method String Context.getPackageName()>
	//    4    8:sipush          128
	//    5   11:invokevirtual   #305 <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//    6   14:getfield        #311 <Field Bundle ApplicationInfo.metaData>
	//    7   17:ldc1            #52  <String "com.gigya.android.verifySessionInterval">
	//    8   19:iconst_0        
	//    9   20:invokevirtual   #317 <Method int Bundle.getInt(String, int)>
	//   10   23:istore_2        
			context = ((Context) (TAG));
	//   11   24:getstatic       #157 <Field String TAG>
	//   12   27:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   13   28:new             #246 <Class StringBuilder>
	//   14   31:dup             
	//   15   32:invokespecial   #247 <Method void StringBuilder()>
	//   16   35:astore_3        
			stringbuilder.append("Verify interval = ");
	//   17   36:aload_3         
	//   18   37:ldc2            #319 <String "Verify interval = ">
	//   19   40:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   20   43:pop             
			stringbuilder.append(i);
	//   21   44:aload_3         
	//   22   45:iload_2         
	//   23   46:invokevirtual   #322 <Method StringBuilder StringBuilder.append(int)>
	//   24   49:pop             
			GigyaLog.d(((String) (context)), stringbuilder.toString());
	//   25   50:aload_1         
	//   26   51:aload_3         
	//   27   52:invokevirtual   #256 <Method String StringBuilder.toString()>
	//   28   55:invokestatic    #327 <Method void GigyaLog.d(String, String)>
			if(mSessionVerification == null)
	//*  29   58:aload_0         
	//*  30   59:getfield        #211 <Field GSSessionVerification mSessionVerification>
	//*  31   62:ifnonnull       88
			{
				mSessionVerification = new GSSessionVerification(i);
	//   32   65:aload_0         
	//   33   66:new             #213 <Class GSSessionVerification>
	//   34   69:dup             
	//   35   70:iload_2         
	//   36   71:invokespecial   #330 <Method void GSSessionVerification(int)>
	//   37   74:putfield        #211 <Field GSSessionVerification mSessionVerification>
				return;
	//   38   77:return          
			}
		}
	//*  39   78:getstatic       #157 <Field String TAG>
	//*  40   81:ldc2            #332 <String "In order to configure session validation check, Don't forget to configure <meta-data android:name=\"com.gigya.android.pendingSessionInterval\" android:value=\"intervalValueInSeconds\"/> in your AndroidManifest.xml file.">
	//*  41   84:invokestatic    #338 <Method int Log.e(String, String)>
	//*  42   87:pop             
	//*  43   88:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			Log.e(TAG, "In order to configure session validation check, Don't forget to configure <meta-data android:name=\"com.gigya.android.pendingSessionInterval\" android:value=\"intervalValueInSeconds\"/> in your AndroidManifest.xml file.");
		}
	//*  44   89:astore_1        
	//*  45   90:goto            78
	}

	private void setGMID(String s)
	{
		mSessionManager.setGMID(s);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field SessionManager mSessionManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #339 <Method void SessionManager.setGMID(String)>
	//    4    8:return          
	}

	private void setUCID(String s)
	{
		mSessionManager.setUCID(s);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field SessionManager mSessionManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #340 <Method void SessionManager.setUCID(String)>
	//    4    8:return          
	}

	private void showUI(final String method, final GSLoginRequest.LoginRequestType mode, final GSObject params, final GSUIListener uiListener, final Object context)
	{
		if(OPTION_CHECK_CONNECTIVITY && !isInetConnected())
	//*   0    0:getstatic       #344 <Field boolean OPTION_CHECK_CONNECTIVITY>
	//*   1    3:ifeq            55
	//*   2    6:aload_0         
	//*   3    7:invokevirtual   #348 <Method boolean isInetConnected()>
	//*   4   10:ifne            55
		{
			if(uiListener != null)
	//*   5   13:aload           4
	//*   6   15:ifnull          54
				uiListener.onError(new GSResponse("showLoginUI", new GSObject(), 0x7a13a, GSResponse.getErrorMessage(0x7a13a), ((GSLogger) (null))), context);
	//    7   18:aload           4
	//    8   20:new             #350 <Class GSResponse>
	//    9   23:dup             
	//   10   24:ldc2            #352 <String "showLoginUI">
	//   11   27:new             #234 <Class GSObject>
	//   12   30:dup             
	//   13   31:invokespecial   #353 <Method void GSObject()>
	//   14   34:ldc2            #354 <Int 0x7a13a>
	//   15   37:ldc2            #354 <Int 0x7a13a>
	//   16   40:invokestatic    #358 <Method String GSResponse.getErrorMessage(int)>
	//   17   43:aconst_null     
	//   18   44:invokespecial   #361 <Method void GSResponse(String, GSObject, int, String, GSLogger)>
	//   19   47:aload           5
	//   20   49:invokeinterface #367 <Method void GSUIListener.onError(GSResponse, Object)>
			return;
	//   21   54:return          
		}
		if(params == null)
	//*  22   55:aload_3         
	//*  23   56:ifnull          62
	//*  24   59:goto            70
			params = new GSObject();
	//   25   62:new             #234 <Class GSObject>
	//   26   65:dup             
	//   27   66:invokespecial   #353 <Method void GSObject()>
	//   28   69:astore_3        
		checkDisabledProviders(params);
	//   29   70:aload_0         
	//   30   71:aload_3         
	//   31   72:invokespecial   #369 <Method void checkDisabledProviders(GSObject)>
		method = ((String) (new com.gigya.socialize.android.login.ProviderSelection.ProviderSelectionHandler() {

			public void onCancel(ProviderSelection providerselection, FragmentActivity fragmentactivity)
			{
				fragmentactivity.finish();
			//    0    0:aload_2         
			//    1    1:invokevirtual   #50  <Method void FragmentActivity.finish()>
				if(uiListener != null)
			//*   2    4:aload_0         
			//*   3    5:getfield        #33  <Field GSUIListener val$uiListener>
			//*   4    8:ifnull          25
					uiListener.onClose(true, context);
			//    5   11:aload_0         
			//    6   12:getfield        #33  <Field GSUIListener val$uiListener>
			//    7   15:iconst_1        
			//    8   16:aload_0         
			//    9   17:getfield        #37  <Field Object val$context>
			//   10   20:invokeinterface #56  <Method void GSUIListener.onClose(boolean, Object)>
			//   11   25:return          
			}

			public void onError(ProviderSelection providerselection, FragmentActivity fragmentactivity, GSObject gsobject)
			{
				fragmentactivity.finish();
			//    0    0:aload_2         
			//    1    1:invokevirtual   #50  <Method void FragmentActivity.finish()>
				if(uiListener != null)
			//*   2    4:aload_0         
			//*   3    5:getfield        #33  <Field GSUIListener val$uiListener>
			//*   4    8:ifnull          25
					uiListener.onClose(false, context);
			//    5   11:aload_0         
			//    6   12:getfield        #33  <Field GSUIListener val$uiListener>
			//    7   15:iconst_0        
			//    8   16:aload_0         
			//    9   17:getfield        #37  <Field Object val$context>
			//   10   20:invokeinterface #56  <Method void GSUIListener.onClose(boolean, Object)>
			//   11   25:return          
			}

			public void onSelect(final ProviderSelection selector, FragmentActivity fragmentactivity, String s, String s1)
			{
				if(s == null)
					break MISSING_BLOCK_LABEL_154;
			//    0    0:aload_3         
			//    1    1:ifnull          154
				if(s.length() == 0)
			//*   2    4:aload_3         
			//*   3    5:invokevirtual   #68  <Method int String.length()>
			//*   4    8:ifne            12
					return;
			//    5   11:return          
				selector.showProgressDialog("Logging In");
			//    6   12:aload_1         
			//    7   13:ldc1            #70  <String "Logging In">
			//    8   15:invokevirtual   #76  <Method void ProviderSelection.showProgressDialog(String)>
				selector.setDisableSelection(true);
			//    9   18:aload_1         
			//   10   19:iconst_1        
			//   11   20:invokevirtual   #80  <Method void ProviderSelection.setDisableSelection(boolean)>
				params.put("provider", s);
			//   12   23:aload_0         
			//   13   24:getfield        #31  <Field GSObject val$params>
			//   14   27:ldc1            #82  <String "provider">
			//   15   29:aload_3         
			//   16   30:invokevirtual   #88  <Method void GSObject.put(String, String)>
				params.put("captionText", s1);
			//   17   33:aload_0         
			//   18   34:getfield        #31  <Field GSObject val$params>
			//   19   37:ldc1            #90  <String "captionText">
			//   20   39:aload           4
			//   21   41:invokevirtual   #88  <Method void GSObject.put(String, String)>
				s = ((String) (((_cls1) (s)). new GSResponseListener() {

					public void onGSResponse(String s, GSResponse gsresponse, Object obj)
					{
						selector.dismissProgressDialog();
					//    0    0:aload_0         
					//    1    1:getfield        #23  <Field ProviderSelection val$selector>
					//    2    4:invokevirtual   #36  <Method void ProviderSelection.dismissProgressDialog()>
						boolean flag;
						if(gsresponse.getErrorCode() == 0x30d41)
					//*   3    7:aload_2         
					//*   4    8:invokevirtual   #42  <Method int GSResponse.getErrorCode()>
					//*   5   11:ldc1            #43  <Int 0x30d41>
					//*   6   13:icmpne          22
							flag = true;
					//    7   16:iconst_1        
					//    8   17:istore          4
						else
					//*   9   19:goto            25
							flag = false;
					//   10   22:iconst_0        
					//   11   23:istore          4
						if(flag)
					//*  12   25:iload           4
					//*  13   27:ifeq            40
						{
							selector.show();
					//   14   30:aload_0         
					//   15   31:getfield        #23  <Field ProviderSelection val$selector>
					//   16   34:invokevirtual   #46  <Method void ProviderSelection.show()>
						} else
					//*  17   37:goto            71
						{
							selector.finish();
					//   18   40:aload_0         
					//   19   41:getfield        #23  <Field ProviderSelection val$selector>
					//   20   44:invokevirtual   #49  <Method void ProviderSelection.finish()>
							if(uiListener != null)
					//*  21   47:aload_0         
					//*  22   48:getfield        #21  <Field GSAPI$5 this$1>
					//*  23   51:getfield        #53  <Field GSUIListener GSAPI$5.val$uiListener>
					//*  24   54:ifnull          71
								uiListener.onClose(false, obj);
					//   25   57:aload_0         
					//   26   58:getfield        #21  <Field GSAPI$5 this$1>
					//   27   61:getfield        #53  <Field GSUIListener GSAPI$5.val$uiListener>
					//   28   64:iconst_0        
					//   29   65:aload_3         
					//   30   66:invokeinterface #59  <Method void GSUIListener.onClose(boolean, Object)>
						}
						if(uiListener != null)
					//*  31   71:aload_0         
					//*  32   72:getfield        #21  <Field GSAPI$5 this$1>
					//*  33   75:getfield        #53  <Field GSUIListener GSAPI$5.val$uiListener>
					//*  34   78:ifnull          187
							if(gsresponse.getErrorCode() == 0)
					//*  35   81:aload_2         
					//*  36   82:invokevirtual   #42  <Method int GSResponse.getErrorCode()>
					//*  37   85:ifne            168
							{
								if(mode == GSLoginRequest.LoginRequestType.login)
					//*  38   88:aload_0         
					//*  39   89:getfield        #21  <Field GSAPI$5 this$1>
					//*  40   92:getfield        #63  <Field GSLoginRequest$LoginRequestType GSAPI$5.val$mode>
					//*  41   95:getstatic       #68  <Field GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.login>
					//*  42   98:if_acmpne       128
									((GSLoginUIListener)uiListener).onLogin(provider, gsresponse.getData(), obj);
					//   43  101:aload_0         
					//   44  102:getfield        #21  <Field GSAPI$5 this$1>
					//   45  105:getfield        #53  <Field GSUIListener GSAPI$5.val$uiListener>
					//   46  108:checkcast       #70  <Class GSLoginUIListener>
					//   47  111:aload_0         
					//   48  112:getfield        #25  <Field String val$provider>
					//   49  115:aload_2         
					//   50  116:invokevirtual   #74  <Method GSObject GSResponse.getData()>
					//   51  119:aload_3         
					//   52  120:invokeinterface #78  <Method void GSLoginUIListener.onLogin(String, GSObject, Object)>
								else
					//*  53  125:goto            187
								if(mode == GSLoginRequest.LoginRequestType.addConnection)
					//*  54  128:aload_0         
					//*  55  129:getfield        #21  <Field GSAPI$5 this$1>
					//*  56  132:getfield        #63  <Field GSLoginRequest$LoginRequestType GSAPI$5.val$mode>
					//*  57  135:getstatic       #81  <Field GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.addConnection>
					//*  58  138:if_acmpne       187
									((GSConnectUIListener)uiListener).onConnectionAdded(provider, gsresponse.getData(), obj);
					//   59  141:aload_0         
					//   60  142:getfield        #21  <Field GSAPI$5 this$1>
					//   61  145:getfield        #53  <Field GSUIListener GSAPI$5.val$uiListener>
					//   62  148:checkcast       #83  <Class GSConnectUIListener>
					//   63  151:aload_0         
					//   64  152:getfield        #25  <Field String val$provider>
					//   65  155:aload_2         
					//   66  156:invokevirtual   #74  <Method GSObject GSResponse.getData()>
					//   67  159:aload_3         
					//   68  160:invokeinterface #86  <Method void GSConnectUIListener.onConnectionAdded(String, GSObject, Object)>
							} else
					//*  69  165:goto            187
							if(!flag)
					//*  70  168:iload           4
					//*  71  170:ifne            187
								uiListener.onError(gsresponse, obj);
					//   72  173:aload_0         
					//   73  174:getfield        #21  <Field GSAPI$5 this$1>
					//   74  177:getfield        #53  <Field GSUIListener GSAPI$5.val$uiListener>
					//   75  180:aload_2         
					//   76  181:aload_3         
					//   77  182:invokeinterface #90  <Method void GSUIListener.onError(GSResponse, Object)>
						selector.setDisableSelection(false);
					//   78  187:aload_0         
					//   79  188:getfield        #23  <Field ProviderSelection val$selector>
					//   80  191:iconst_0        
					//   81  192:invokevirtual   #94  <Method void ProviderSelection.setDisableSelection(boolean)>
					//   82  195:return          
					}

					final _cls5 this$1;
					final String val$provider;
					final ProviderSelection val$selector;

			
			{
				this$1 = final__pcls5;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field GSAPI$5 this$1>
				selector = providerselection;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ProviderSelection val$selector>
				provider = String.this;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field String val$provider>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
				}
));
			//   22   44:new             #13  <Class GSAPI$5$1>
			//   23   47:dup             
			//   24   48:aload_0         
			//   25   49:aload_1         
			//   26   50:aload_3         
			//   27   51:invokespecial   #93  <Method void GSAPI$5$1(GSAPI$5, ProviderSelection, String)>
			//   28   54:astore_3        
				if(mode == GSLoginRequest.LoginRequestType.addConnection)
			//*  29   55:aload_0         
			//*  30   56:getfield        #35  <Field GSLoginRequest$LoginRequestType val$mode>
			//*  31   59:getstatic       #98  <Field GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.addConnection>
			//*  32   62:if_acmpne       84
				{
					addConnection(((Activity) (fragmentactivity)), params, ((GSResponseListener) (s)), context);
			//   33   65:aload_0         
			//   34   66:getfield        #29  <Field GSAPI this$0>
			//   35   69:aload_2         
			//   36   70:aload_0         
			//   37   71:getfield        #31  <Field GSObject val$params>
			//   38   74:aload_3         
			//   39   75:aload_0         
			//   40   76:getfield        #37  <Field Object val$context>
			//   41   79:invokevirtual   #101 <Method GSLoginRequest GSAPI.addConnection(Activity, GSObject, GSResponseListener, Object)>
			//   42   82:pop             
					return;
			//   43   83:return          
				}
				try
				{
					login(((Activity) (fragmentactivity)), params, ((GSResponseListener) (s)), context);
			//   44   84:aload_0         
			//   45   85:getfield        #29  <Field GSAPI this$0>
			//   46   88:aload_2         
			//   47   89:aload_0         
			//   48   90:getfield        #31  <Field GSObject val$params>
			//   49   93:aload_3         
			//   50   94:aload_0         
			//   51   95:getfield        #37  <Field Object val$context>
			//   52   98:invokevirtual   #104 <Method GSLoginRequest GSAPI.login(Activity, GSObject, GSResponseListener, Object)>
			//   53  101:pop             
					return;
			//   54  102:return          
				}
			//*  55  103:aload_0         
			//*  56  104:getfield        #33  <Field GSUIListener val$uiListener>
			//*  57  107:ifnull          149
			//*  58  110:aload_0         
			//*  59  111:getfield        #33  <Field GSUIListener val$uiListener>
			//*  60  114:new             #106 <Class GSResponse>
			//*  61  117:dup             
			//*  62  118:aload_0         
			//*  63  119:getfield        #39  <Field String val$method>
			//*  64  122:new             #84  <Class GSObject>
			//*  65  125:dup             
			//*  66  126:invokespecial   #107 <Method void GSObject()>
			//*  67  129:ldc1            #108 <Int 0x7a121>
			//*  68  131:ldc1            #108 <Int 0x7a121>
			//*  69  133:invokestatic    #112 <Method String GSResponse.getErrorMessage(int)>
			//*  70  136:aconst_null     
			//*  71  137:invokespecial   #115 <Method void GSResponse(String, GSObject, int, String, GSLogger)>
			//*  72  140:aload_0         
			//*  73  141:getfield        #37  <Field Object val$context>
			//*  74  144:invokeinterface #118 <Method void GSUIListener.onError(GSResponse, Object)>
			//*  75  149:aload_1         
			//*  76  150:iconst_0        
			//*  77  151:invokevirtual   #80  <Method void ProviderSelection.setDisableSelection(boolean)>
			//*  78  154:return          
				// Misplaced declaration of an exception variable
				catch(FragmentActivity fragmentactivity) { }
			//   79  155:astore_2        
				if(uiListener != null)
					uiListener.onError(new GSResponse(method, new GSObject(), 0x7a121, GSResponse.getErrorMessage(0x7a121), ((GSLogger) (null))), context);
				selector.setDisableSelection(false);
			//*  80  156:goto            103
			}

			public void onShow(ProviderSelection providerselection, FragmentActivity fragmentactivity)
			{
				if(uiListener != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #33  <Field GSUIListener val$uiListener>
			//*   2    4:ifnull          20
					uiListener.onLoad(context);
			//    3    7:aload_0         
			//    4    8:getfield        #33  <Field GSUIListener val$uiListener>
			//    5   11:aload_0         
			//    6   12:getfield        #37  <Field Object val$context>
			//    7   15:invokeinterface #123 <Method void GSUIListener.onLoad(Object)>
			//    8   20:return          
			}

			final GSAPI this$0;
			final Object val$context;
			final String val$method;
			final GSLoginRequest.LoginRequestType val$mode;
			final GSObject val$params;
			final GSUIListener val$uiListener;

			
			{
				this$0 = GSAPI.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #29  <Field GSAPI this$0>
				params = gsobject;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #31  <Field GSObject val$params>
				uiListener = gsuilistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #33  <Field GSUIListener val$uiListener>
				mode = loginrequesttype;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #35  <Field GSLoginRequest$LoginRequestType val$mode>
				context = obj;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #37  <Field Object val$context>
				method = s;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #39  <Field String val$method>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #42  <Method void Object()>
			//   20   37:return          
			}
		}
));
	//   32   75:new             #32  <Class GSAPI$5>
	//   33   78:dup             
	//   34   79:aload_0         
	//   35   80:aload_3         
	//   36   81:aload           4
	//   37   83:aload_2         
	//   38   84:aload           5
	//   39   86:aload_1         
	//   40   87:invokespecial   #372 <Method void GSAPI$5(GSAPI, GSObject, GSUIListener, GSLoginRequest$LoginRequestType, Object, String)>
	//   41   90:astore_1        
		(new ProviderSelection()).show(mode, params, ((com.gigya.socialize.android.login.ProviderSelection.ProviderSelectionHandler) (method)));
	//   42   91:new             #374 <Class ProviderSelection>
	//   43   94:dup             
	//   44   95:invokespecial   #375 <Method void ProviderSelection()>
	//   45   98:aload_2         
	//   46   99:aload_3         
	//   47  100:aload_1         
	//   48  101:invokevirtual   #379 <Method void ProviderSelection.show(GSLoginRequest$LoginRequestType, GSObject, com.gigya.socialize.android.login.ProviderSelection$ProviderSelectionHandler)>
	//   49  104:return          
	}

	private void startSessionVerification()
	{
		if(mSessionVerification != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #211 <Field GSSessionVerification mSessionVerification>
	//*   2    4:ifnull          15
			mSessionVerification.start(this);
	//    3    7:aload_0         
	//    4    8:getfield        #211 <Field GSSessionVerification mSessionVerification>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #382 <Method void GSSessionVerification.start(GSAPI)>
	//    7   15:return          
	}

	private void updateSDKVersion(Context context)
	{
		context.getSharedPreferences("GSLIB", 0).edit().putString("sdk_version", "android_3.3.26").apply();
	//    0    0:aload_1         
	//    1    1:ldc2            #385 <String "GSLIB">
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #389 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    8:invokeinterface #395 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   13:ldc1            #66  <String "sdk_version">
	//    6   15:ldc1            #72  <String "android_3.3.26">
	//    7   17:invokeinterface #401 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    8   22:invokeinterface #404 <Method void android.content.SharedPreferences$Editor.apply()>
	//    9   27:return          
	}

	protected void addAccountsListener(GSAccountsEventListener gsaccountseventlistener)
	{
		if(!accountsEventListenersArray.contains(((Object) (gsaccountseventlistener))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #138 <Field ArrayList accountsEventListenersArray>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #409 <Method boolean ArrayList.contains(Object)>
	//*   4    8:ifne            20
			accountsEventListenersArray.add(((Object) (gsaccountseventlistener)));
	//    5   11:aload_0         
	//    6   12:getfield        #138 <Field ArrayList accountsEventListenersArray>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #412 <Method boolean ArrayList.add(Object)>
	//    9   19:pop             
	//   10   20:return          
	}

	public GSLoginRequest addConnection(final Activity req, final GSObject params, final GSResponseListener listener, final Object context)
	{
		if(OPTION_CHECK_CONNECTIVITY && !isInetConnected())
	//*   0    0:getstatic       #344 <Field boolean OPTION_CHECK_CONNECTIVITY>
	//*   1    3:ifeq            42
	//*   2    6:aload_0         
	//*   3    7:invokevirtual   #348 <Method boolean isInetConnected()>
	//*   4   10:ifne            42
			req = ((Activity) (new GSResponse("addConnection", params, 0x7a13a, ((GSLogger) (null)))));
	//    5   13:new             #350 <Class GSResponse>
	//    6   16:dup             
	//    7   17:ldc2            #415 <String "addConnection">
	//    8   20:aload_2         
	//    9   21:ldc2            #354 <Int 0x7a13a>
	//   10   24:aconst_null     
	//   11   25:invokespecial   #418 <Method void GSResponse(String, GSObject, int, GSLogger)>
	//   12   28:astore_1        
		else
	//*  13   29:aload_0         
	//*  14   30:aload_3         
	//*  15   31:ldc2            #415 <String "addConnection">
	//*  16   34:aload_1         
	//*  17   35:aload           4
	//*  18   37:invokevirtual   #422 <Method void notifyResponse(GSResponseListener, String, GSResponse, Object)>
	//*  19   40:aconst_null     
	//*  20   41:areturn         
		if(!gotValidSession())
	//*  21   42:aload_0         
	//*  22   43:invokevirtual   #425 <Method boolean gotValidSession()>
	//*  23   46:ifne            68
		{
			req = ((Activity) (new GSResponse("addConnection", params, 0x62638, ((GSLogger) (null)))));
	//   24   49:new             #350 <Class GSResponse>
	//   25   52:dup             
	//   26   53:ldc2            #415 <String "addConnection">
	//   27   56:aload_2         
	//   28   57:ldc2            #426 <Int 0x62638>
	//   29   60:aconst_null     
	//   30   61:invokespecial   #418 <Method void GSResponse(String, GSObject, int, GSLogger)>
	//   31   64:astore_1        
		} else
	//*  32   65:goto            29
		{
			req = ((Activity) (new GSLoginRequest(GSLoginRequest.LoginRequestType.addConnection, req, params, listener, context)));
	//   33   68:new             #428 <Class GSLoginRequest>
	//   34   71:dup             
	//   35   72:getstatic       #433 <Field GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.addConnection>
	//   36   75:aload_1         
	//   37   76:aload_2         
	//   38   77:aload_3         
	//   39   78:aload           4
	//   40   80:invokespecial   #436 <Method void GSLoginRequest(GSLoginRequest$LoginRequestType, Activity, GSObject, GSResponseListener, Object)>
	//   41   83:astore_1        
			requestsQueue.enqueue(new Runnable() {

				public void run()
				{
					try
					{
						req.send();
				//    0    0:aload_0         
				//    1    1:getfield        #27  <Field GSLoginRequest val$req>
				//    2    4:invokevirtual   #47  <Method void GSLoginRequest.send()>
						return;
				//    3    7:return          
					}
				//*   4    8:astore_1        
				//*   5    9:aload_1         
				//*   6   10:invokevirtual   #50  <Method void android.content.pm.PackageManager$NameNotFoundException.printStackTrace()>
				//*   7   13:return          
					catch(IllegalArgumentException illegalargumentexception)
				//*   8   14:astore_1        
					{
						notifyResponse(listener, "login", new GSResponse("login", params, 0x61a86, illegalargumentexception.getMessage(), ((GSLogger) (null))), context);
				//    9   15:aload_0         
				//   10   16:getfield        #25  <Field GSAPI this$0>
				//   11   19:aload_0         
				//   12   20:getfield        #29  <Field GSResponseListener val$listener>
				//   13   23:ldc1            #52  <String "login">
				//   14   25:new             #54  <Class GSResponse>
				//   15   28:dup             
				//   16   29:ldc1            #52  <String "login">
				//   17   31:aload_0         
				//   18   32:getfield        #31  <Field GSObject val$params>
				//   19   35:ldc1            #55  <Int 0x61a86>
				//   20   37:aload_1         
				//   21   38:invokevirtual   #59  <Method String IllegalArgumentException.getMessage()>
				//   22   41:aconst_null     
				//   23   42:invokespecial   #62  <Method void GSResponse(String, GSObject, int, String, GSLogger)>
				//   24   45:aload_0         
				//   25   46:getfield        #33  <Field Object val$context>
				//   26   49:invokevirtual   #66  <Method void GSAPI.notifyResponse(GSResponseListener, String, GSResponse, Object)>
					}
					catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
					{
						namenotfoundexception.printStackTrace();
						return;
					}
				//   27   52:return          
				}

				final GSAPI this$0;
				final Object val$context;
				final GSResponseListener val$listener;
				final GSObject val$params;
				final GSLoginRequest val$req;

			
			{
				this$0 = GSAPI.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field GSAPI this$0>
				req = gsloginrequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field GSLoginRequest val$req>
				listener = gsresponselistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #29  <Field GSResponseListener val$listener>
				params = gsobject;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #31  <Field GSObject val$params>
				context = obj;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #33  <Field Object val$context>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #36  <Method void Object()>
			//   17   31:return          
			}
			}
);
	//   42   84:aload_0         
	//   43   85:getfield        #143 <Field SimpleRunnableQueue requestsQueue>
	//   44   88:new             #40  <Class GSAPI$8>
	//   45   91:dup             
	//   46   92:aload_0         
	//   47   93:aload_1         
	//   48   94:aload_3         
	//   49   95:aload_2         
	//   50   96:aload           4
	//   51   98:invokespecial   #439 <Method void GSAPI$8(GSAPI, GSLoginRequest, GSResponseListener, GSObject, Object)>
	//   52  101:invokevirtual   #443 <Method void SimpleRunnableQueue.enqueue(Runnable)>
			return ((GSLoginRequest) (req));
	//   53  104:aload_1         
	//   54  105:areturn         
		}
		notifyResponse(listener, "addConnection", ((GSResponse) (req)), context);
		return null;
	}

	protected void addSocializeListener(GSSocializeEventListener gssocializeeventlistener)
	{
		if(!socializeEventListenersArray.contains(((Object) (gssocializeeventlistener))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #136 <Field ArrayList socializeEventListenersArray>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #409 <Method boolean ArrayList.contains(Object)>
	//*   4    8:ifne            20
			socializeEventListenersArray.add(((Object) (gssocializeeventlistener)));
	//    5   11:aload_0         
	//    6   12:getfield        #136 <Field ArrayList socializeEventListenersArray>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #412 <Method boolean ArrayList.add(Object)>
	//    9   19:pop             
	//   10   20:return          
	}

	protected void clearSession()
	{
		GigyaLog.i(TAG, "clearSession");
	//    0    0:getstatic       #157 <Field String TAG>
	//    1    3:ldc2            #447 <String "clearSession">
	//    2    6:invokestatic    #450 <Method void GigyaLog.i(String, String)>
		mSessionManager.clearSession(true);
	//    3    9:aload_0         
	//    4   10:getfield        #153 <Field SessionManager mSessionManager>
	//    5   13:iconst_1        
	//    6   14:invokevirtual   #453 <Method void SessionManager.clearSession(boolean)>
		for(Iterator iterator = loginProviderFactory.getLoginProviders().values().iterator(); iterator.hasNext(); ((LoginProvider)iterator.next()).clearSession());
	//    7   17:aload_0         
	//    8   18:getfield        #220 <Field LoginProviderFactory loginProviderFactory>
	//    9   21:invokevirtual   #457 <Method ConcurrentHashMap LoginProviderFactory.getLoginProviders()>
	//   10   24:invokevirtual   #463 <Method Collection ConcurrentHashMap.values()>
	//   11   27:invokeinterface #469 <Method Iterator Collection.iterator()>
	//   12   32:astore_1        
	//   13   33:aload_1         
	//   14   34:invokeinterface #474 <Method boolean Iterator.hasNext()>
	//   15   39:ifeq            57
	//   16   42:aload_1         
	//   17   43:invokeinterface #478 <Method Object Iterator.next()>
	//   18   48:checkcast       #480 <Class LoginProvider>
	//   19   51:invokevirtual   #482 <Method void LoginProvider.clearSession()>
	//*  20   54:goto            33
	//   21   57:return          
	}

	public String getAPIDomain()
	{
		return apiDomain;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field String apiDomain>
	//    2    4:areturn         
	}

	public String getAPIKey()
	{
		return apiKey;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field String apiKey>
	//    2    4:areturn         
	}

	public GSAccountsEventListener getAccountsEventListener()
	{
		return accountsEventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #488 <Field GSAccountsEventListener accountsEventListener>
	//    2    4:areturn         
	}

	protected GSObject getConfig()
	{
		return config;
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field GSObject config>
	//    2    4:areturn         
	}

	public Context getContext()
	{
		return appContext;
	//    0    0:aload_0         
	//    1    1:getfield        #494 <Field Context appContext>
	//    2    4:areturn         
	}

	protected HashMap getCookies(String s)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #145 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #146 <Method void HashMap()>
	//    3    7:astore          4
		s = CookieManager.getInstance().getCookie(s);
	//    4    9:invokestatic    #501 <Method CookieManager CookieManager.getInstance()>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #505 <Method String CookieManager.getCookie(String)>
	//    7   16:astore_1        
		if(s == null)
	//*   8   17:aload_1         
	//*   9   18:ifnonnull       24
			return hashmap;
	//   10   21:aload           4
	//   11   23:areturn         
		String as[] = s.split(";");
	//   12   24:aload_1         
	//   13   25:ldc2            #507 <String ";">
	//   14   28:invokevirtual   #511 <Method String[] String.split(String)>
	//   15   31:astore          5
		int j = as.length;
	//   16   33:aload           5
	//   17   35:arraylength     
	//   18   36:istore_3        
		for(int i = 0; i < j; i++)
	//*  19   37:iconst_0        
	//*  20   38:istore_2        
	//*  21   39:iload_2         
	//*  22   40:iload_3         
	//*  23   41:icmpge          93
		{
			String as1[] = as[i].split("=");
	//   24   44:aload           5
	//   25   46:iload_2         
	//   26   47:aaload          
	//   27   48:ldc2            #513 <String "=">
	//   28   51:invokevirtual   #511 <Method String[] String.split(String)>
	//   29   54:astore          7
			String s1 = as1[0];
	//   30   56:aload           7
	//   31   58:iconst_0        
	//   32   59:aaload          
	//   33   60:astore          6
			s = "";
	//   34   62:ldc1            #232 <String "">
	//   35   64:astore_1        
			if(as1.length > 1)
	//*  36   65:aload           7
	//*  37   67:arraylength     
	//*  38   68:iconst_1        
	//*  39   69:icmple          77
				s = as1[1];
	//   40   72:aload           7
	//   41   74:iconst_1        
	//   42   75:aaload          
	//   43   76:astore_1        
			hashmap.put(((Object) (s1)), ((Object) (s)));
	//   44   77:aload           4
	//   45   79:aload           6
	//   46   81:aload_1         
	//   47   82:invokevirtual   #516 <Method Object HashMap.put(Object, Object)>
	//   48   85:pop             
		}

	//   49   86:iload_2         
	//   50   87:iconst_1        
	//   51   88:iadd            
	//   52   89:istore_2        
	//*  53   90:goto            39
		return hashmap;
	//   54   93:aload           4
	//   55   95:areturn         
	}

	protected String getGMID()
	{
		return mSessionManager.getGMID();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field SessionManager mSessionManager>
	//    2    4:invokevirtual   #521 <Method String SessionManager.getGMID()>
	//    3    7:areturn         
	}

	public String getLastLoginProvider()
	{
		return mSessionManager.getSessionLastLoginProvider();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field SessionManager mSessionManager>
	//    2    4:invokevirtual   #525 <Method String SessionManager.getSessionLastLoginProvider()>
	//    3    7:areturn         
	}

	public LoginBehavior getLoginBehavior()
	{
		return loginBehavior;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field GSAPI$LoginBehavior loginBehavior>
	//    2    4:areturn         
	}

	public int getNextAndroidPermissionsRequestCode(GSAndroidPermissionListener gsandroidpermissionlistener)
	{
		int i = androidPermissionsRequestCode;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field int androidPermissionsRequestCode>
	//    2    4:istore_2        
		androidPermissionsRequestCode = i + 1;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #129 <Field int androidPermissionsRequestCode>
		androidPermissionListeners.put(((Object) (Integer.valueOf(i))), ((Object) (gsandroidpermissionlistener)));
	//    8   12:aload_0         
	//    9   13:getfield        #148 <Field Map androidPermissionListeners>
	//   10   16:iload_2         
	//   11   17:invokestatic    #535 <Method Integer Integer.valueOf(int)>
	//   12   20:aload_1         
	//   13   21:invokeinterface #538 <Method Object Map.put(Object, Object)>
	//   14   26:pop             
		return i;
	//   15   27:iload_2         
	//   16   28:ireturn         
	}

	public String getResumedActivityName()
	{
		return mResumedActivityName;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field String mResumedActivityName>
	//    2    4:areturn         
	}

	public GSSession getSession()
	{
		return mSessionManager.getSession();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field SessionManager mSessionManager>
	//    2    4:invokevirtual   #543 <Method GSSession SessionManager.getSession()>
	//    3    7:areturn         
	}

	public GSSocializeEventListener getSocializeEventListener()
	{
		return socializeEventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #547 <Field GSSocializeEventListener socializeEventListener>
	//    2    4:areturn         
	}

	protected String getUCID()
	{
		return mSessionManager.getUCID();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field SessionManager mSessionManager>
	//    2    4:invokevirtual   #550 <Method String SessionManager.getUCID()>
	//    3    7:areturn         
	}

	protected boolean gotValidSession()
	{
		return mSessionManager.isValidSession();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field SessionManager mSessionManager>
	//    2    4:invokevirtual   #553 <Method boolean SessionManager.isValidSession()>
	//    3    7:ireturn         
	}

	public boolean handleAndroidPermissionsResult(int i, String as[], int ai[])
	{
		if(androidPermissionListeners.containsKey(((Object) (Integer.valueOf(i)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field Map androidPermissionListeners>
	//*   2    4:iload_1         
	//*   3    5:invokestatic    #535 <Method Integer Integer.valueOf(int)>
	//*   4    8:invokeinterface #558 <Method boolean Map.containsKey(Object)>
	//*   5   13:ifeq            41
		{
			((GSAndroidPermissionListener)androidPermissionListeners.get(((Object) (Integer.valueOf(i))))).onAndroidPermissionsResult(as, ai);
	//    6   16:aload_0         
	//    7   17:getfield        #148 <Field Map androidPermissionListeners>
	//    8   20:iload_1         
	//    9   21:invokestatic    #535 <Method Integer Integer.valueOf(int)>
	//   10   24:invokeinterface #562 <Method Object Map.get(Object)>
	//   11   29:checkcast       #564 <Class GSAndroidPermissionListener>
	//   12   32:aload_2         
	//   13   33:aload_3         
	//   14   34:invokeinterface #568 <Method void GSAndroidPermissionListener.onAndroidPermissionsResult(String[], int[])>
			return true;
	//   15   39:iconst_1        
	//   16   40:ireturn         
		} else
		{
			return false;
	//   17   41:iconst_0        
	//   18   42:ireturn         
		}
	}

	public void initialize(Context context, String s)
	{
		initialize(context, s, "us1.gigya.com");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #49  <String "us1.gigya.com">
	//    4    5:invokevirtual   #573 <Method void initialize(Context, String, String)>
	//    5    8:return          
	}

	public void initialize(Context context, String s, String s1)
	{
		boolean flag;
		try
		{
			((Activity)context).getWindow().requestFeature(2);
	//    0    0:aload_1         
	//    1    1:checkcast       #577 <Class Activity>
	//    2    4:invokevirtual   #581 <Method Window Activity.getWindow()>
	//    3    7:iconst_2        
	//    4    8:invokevirtual   #587 <Method boolean Window.requestFeature(int)>
	//    5   11:pop             
		}
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       27
	//*   8   16:new             #589 <Class IllegalArgumentException>
	//*   9   19:dup             
	//*  10   20:ldc2            #591 <String "Gigya API key must be specified.">
	//*  11   23:invokespecial   #593 <Method void IllegalArgumentException(String)>
	//*  12   26:athrow          
	//*  13   27:aload_0         
	//*  14   28:aload_2         
	//*  15   29:putfield        #188 <Field String apiKey>
	//*  16   32:aload_0         
	//*  17   33:aload_3         
	//*  18   34:putfield        #193 <Field String apiDomain>
	//*  19   37:aload_0         
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #596 <Method Context Context.getApplicationContext()>
	//*  22   42:putfield        #494 <Field Context appContext>
	//*  23   45:aload_0         
	//*  24   46:new             #224 <Class LoginProviderFactory>
	//*  25   49:dup             
	//*  26   50:invokespecial   #597 <Method void LoginProviderFactory()>
	//*  27   53:putfield        #220 <Field LoginProviderFactory loginProviderFactory>
	//*  28   56:aload_0         
	//*  29   57:aload_1         
	//*  30   58:invokestatic    #602 <Method GSEncryptedPrefs GSEncryptedPrefs.getInstance(Context)>
	//*  31   61:putfield        #604 <Field GSEncryptedPrefs preferences>
	//*  32   64:aload_0         
	//*  33   65:new             #606 <Class GigyaFingerprintManager>
	//*  34   68:dup             
	//*  35   69:aload_0         
	//*  36   70:getfield        #153 <Field SessionManager mSessionManager>
	//*  37   73:aload_0         
	//*  38   74:getfield        #494 <Field Context appContext>
	//*  39   77:invokestatic    #610 <Method android.hardware.fingerprint.FingerprintManager GigyaFingerprintManager.getSystemFingerprintManager(Context)>
	//*  40   80:invokespecial   #613 <Method void GigyaFingerprintManager(SessionManager, android.hardware.fingerprint.FingerprintManager)>
	//*  41   83:putfield        #615 <Field GigyaFingerprintManager fingerprint>
	//*  42   86:aload_0         
	//*  43   87:aload_1         
	//*  44   88:invokespecial   #617 <Method void readSessionVerificationMetaData(Context)>
	//*  45   91:aload_0         
	//*  46   92:getfield        #153 <Field SessionManager mSessionManager>
	//*  47   95:invokevirtual   #620 <Method void SessionManager.loadSession()>
	//*  48   98:aload_0         
	//*  49   99:invokespecial   #162 <Method void startSessionVerification()>
	//*  50  102:aload_0         
	//*  51  103:invokevirtual   #623 <Method void loadConfig()>
	//*  52  106:aload_0         
	//*  53  107:aload_1         
	//*  54  108:invokespecial   #625 <Method void updateSDKVersion(Context)>
	//*  55  111:iconst_1        
	//*  56  112:istore          4
	//*  57  114:aload_0         
	//*  58  115:iload           4
	//*  59  117:putfield        #131 <Field boolean _isInitialized>
	//*  60  120:return          
	//*  61  121:getstatic       #157 <Field String TAG>
	//*  62  124:ldc2            #627 <String "Failed to initialize SDK | Failed to generate/load secret key">
	//*  63  127:invokestatic    #338 <Method int Log.e(String, String)>
	//*  64  130:pop             
	//*  65  131:iconst_0        
	//*  66  132:istore          4
	//*  67  134:goto            114
		catch(Exception exception) { }
	//   68  137:astore          5
		if(s == null)
			throw new IllegalArgumentException("Gigya API key must be specified.");
		apiKey = s;
		apiDomain = s1;
		appContext = context.getApplicationContext();
		loginProviderFactory = new LoginProviderFactory();
		preferences = GSEncryptedPrefs.getInstance(context);
		fingerprint = new GigyaFingerprintManager(mSessionManager, GigyaFingerprintManager.getSystemFingerprintManager(appContext));
		readSessionVerificationMetaData(context);
		mSessionManager.loadSession();
		startSessionVerification();
		loadConfig();
		updateSDKVersion(context);
		flag = true;
_L2:
		_isInitialized = flag;
		return;
_L3:
		Log.e(TAG, "Failed to initialize SDK | Failed to generate/load secret key");
		flag = false;
		if(true) goto _L2; else goto _L1
	//*  69  139:goto            12
_L1:
		context;
	//   70  142:astore_1        
		  goto _L3
	//*  71  143:goto            121
	}

	protected transient void invokeAccountsListeners(String s, Object aobj[])
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #246 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #247 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("on");
	//    4    8:aload_3         
	//    5    9:ldc2            #631 <String "on">
	//    6   12:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(s.substring(0, 1).toUpperCase());
	//    8   16:aload_3         
	//    9   17:aload_1         
	//   10   18:iconst_0        
	//   11   19:iconst_1        
	//   12   20:invokevirtual   #635 <Method String String.substring(int, int)>
	//   13   23:invokevirtual   #638 <Method String String.toUpperCase()>
	//   14   26:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		stringbuilder.append(s.substring(1));
	//   16   30:aload_3         
	//   17   31:aload_1         
	//   18   32:iconst_1        
	//   19   33:invokevirtual   #640 <Method String String.substring(int)>
	//   20   36:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		s = ((String) (findMethodInClass(com/gigya/socialize/android/event/GSAccountsEventListener, stringbuilder.toString())));
	//   22   40:aload_0         
	//   23   41:ldc2            #642 <Class GSAccountsEventListener>
	//   24   44:aload_3         
	//   25   45:invokevirtual   #256 <Method String StringBuilder.toString()>
	//   26   48:invokespecial   #644 <Method Method findMethodInClass(Class, String)>
	//   27   51:astore_1        
		for(Iterator iterator = accountsEventListenersArray.iterator(); iterator.hasNext();)
	//*  28   52:aload_0         
	//*  29   53:getfield        #138 <Field ArrayList accountsEventListenersArray>
	//*  30   56:invokevirtual   #645 <Method Iterator ArrayList.iterator()>
	//*  31   59:astore_3        
	//*  32   60:aload_3         
	//*  33   61:invokeinterface #474 <Method boolean Iterator.hasNext()>
	//*  34   66:ifeq            91
		{
			GSAccountsEventListener gsaccountseventlistener = (GSAccountsEventListener)iterator.next();
	//   35   69:aload_3         
	//   36   70:invokeinterface #478 <Method Object Iterator.next()>
	//   37   75:checkcast       #642 <Class GSAccountsEventListener>
	//   38   78:astore          4
			try
			{
				((Method) (s)).invoke(((Object) (gsaccountseventlistener)), aobj);
	//   39   80:aload_1         
	//   40   81:aload           4
	//   41   83:aload_2         
	//   42   84:invokevirtual   #649 <Method Object Method.invoke(Object, Object[])>
	//   43   87:pop             
			}
	//*  44   88:goto            60
	//*  45   91:return          
			catch(Exception exception) { }
	//   46   92:astore          4
		}

	//*  47   94:goto            60
	}

	protected transient void invokeSocializeListeners(String s, Object aobj[])
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #246 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #247 <Method void StringBuilder()>
	//    3    7:astore_3        
		((StringBuilder) (obj)).append("on");
	//    4    8:aload_3         
	//    5    9:ldc2            #631 <String "on">
	//    6   12:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(s.substring(0, 1).toUpperCase());
	//    8   16:aload_3         
	//    9   17:aload_1         
	//   10   18:iconst_0        
	//   11   19:iconst_1        
	//   12   20:invokevirtual   #635 <Method String String.substring(int, int)>
	//   13   23:invokevirtual   #638 <Method String String.toUpperCase()>
	//   14   26:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
		((StringBuilder) (obj)).append(s.substring(1));
	//   16   30:aload_3         
	//   17   31:aload_1         
	//   18   32:iconst_1        
	//   19   33:invokevirtual   #640 <Method String String.substring(int)>
	//   20   36:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		s = ((String) (findMethodInClass(com/gigya/socialize/android/event/GSSocializeEventListener, ((StringBuilder) (obj)).toString())));
	//   22   40:aload_0         
	//   23   41:ldc2            #652 <Class GSSocializeEventListener>
	//   24   44:aload_3         
	//   25   45:invokevirtual   #256 <Method String StringBuilder.toString()>
	//   26   48:invokespecial   #644 <Method Method findMethodInClass(Class, String)>
	//   27   51:astore_1        
		if(eventListener != null)
	//*  28   52:aload_0         
	//*  29   53:getfield        #654 <Field GSEventListener eventListener>
	//*  30   56:ifnull          69
			try
			{
				((Method) (s)).invoke(((Object) (eventListener)), aobj);
	//   31   59:aload_1         
	//   32   60:aload_0         
	//   33   61:getfield        #654 <Field GSEventListener eventListener>
	//   34   64:aload_2         
	//   35   65:invokevirtual   #649 <Method Object Method.invoke(Object, Object[])>
	//   36   68:pop             
			}
	//*  37   69:aload_0         
	//*  38   70:getfield        #136 <Field ArrayList socializeEventListenersArray>
	//*  39   73:invokevirtual   #645 <Method Iterator ArrayList.iterator()>
	//*  40   76:astore_3        
	//*  41   77:aload_3         
	//*  42   78:invokeinterface #474 <Method boolean Iterator.hasNext()>
	//*  43   83:ifeq            108
	//*  44   86:aload_3         
	//*  45   87:invokeinterface #478 <Method Object Iterator.next()>
	//*  46   92:checkcast       #652 <Class GSSocializeEventListener>
	//*  47   95:astore          4
	//*  48   97:aload_1         
	//*  49   98:aload           4
	//*  50  100:aload_2         
	//*  51  101:invokevirtual   #649 <Method Object Method.invoke(Object, Object[])>
	//*  52  104:pop             
	//*  53  105:goto            77
	//*  54  108:return          
			catch(Exception exception) { }
	//   55  109:astore_3        
		for(obj = ((Object) (socializeEventListenersArray.iterator())); ((Iterator) (obj)).hasNext();)
		{
			GSSocializeEventListener gssocializeeventlistener = (GSSocializeEventListener)((Iterator) (obj)).next();
			try
			{
				((Method) (s)).invoke(((Object) (gssocializeeventlistener)), aobj);
			}
	//*  56  110:goto            69
			catch(Exception exception1) { }
	//   57  113:astore          4
		}

	//*  58  115:goto            77
	}

	protected boolean isInetConnected()
	{
		boolean flag;
		NetworkInfo networkinfo;
		try
		{
			networkinfo = ((ConnectivityManager)appContext.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #494 <Field Context appContext>
	//    2    4:invokevirtual   #596 <Method Context Context.getApplicationContext()>
	//    3    7:ldc2            #656 <String "connectivity">
	//    4   10:invokevirtual   #660 <Method Object Context.getSystemService(String)>
	//    5   13:checkcast       #662 <Class ConnectivityManager>
	//    6   16:invokevirtual   #666 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    7   19:astore_2        
		}
	//*   8   20:aload_2         
	//*   9   21:ifnull          35
	//*  10   24:aload_2         
	//*  11   25:invokevirtual   #671 <Method boolean NetworkInfo.isConnected()>
	//*  12   28:istore_1        
	//*  13   29:iload_1         
	//*  14   30:ifeq            35
	//*  15   33:iconst_1        
	//*  16   34:ireturn         
	//*  17   35:iconst_0        
	//*  18   36:ireturn         
		catch(Exception exception)
	//*  19   37:astore_2        
		{
			GigyaLog.e(TAG, "Unable to detect inet connection status", ((Throwable) (exception)));
	//   20   38:getstatic       #157 <Field String TAG>
	//   21   41:ldc2            #673 <String "Unable to detect inet connection status">
	//   22   44:aload_2         
	//   23   45:invokestatic    #676 <Method void GigyaLog.e(String, String, Throwable)>
			return true;
	//   24   48:iconst_1        
	//   25   49:ireturn         
		}
		if(networkinfo == null)
			break MISSING_BLOCK_LABEL_35;
		flag = networkinfo.isConnected();
		if(flag)
			return true;
		return false;
	}

	public boolean isInitialized()
	{
		return _isInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field boolean _isInitialized>
	//    2    4:ireturn         
	}

	protected void loadConfig()
	{
		Object obj = "permissions";
	//    0    0:ldc2            #679 <String "permissions">
	//    1    3:astore_2        
		boolean flag;
		if(getGMID() != null && getUCID() != null)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #680 <Method String getGMID()>
	//*   4    8:ifnull          26
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #681 <Method String getUCID()>
	//*   7   15:ifnonnull       21
	//*   8   18:goto            26
		{
			flag = true;
	//    9   21:iconst_1        
	//   10   22:istore_1        
		} else
	//*  11   23:goto            57
		{
			obj = ((Object) (new StringBuilder()));
	//   12   26:new             #246 <Class StringBuilder>
	//   13   29:dup             
	//   14   30:invokespecial   #247 <Method void StringBuilder()>
	//   15   33:astore_2        
			((StringBuilder) (obj)).append("permissions");
	//   16   34:aload_2         
	//   17   35:ldc2            #679 <String "permissions">
	//   18   38:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:pop             
			((StringBuilder) (obj)).append(",ids");
	//   20   42:aload_2         
	//   21   43:ldc2            #683 <String ",ids">
	//   22   46:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   24   50:aload_2         
	//   25   51:invokevirtual   #256 <Method String StringBuilder.toString()>
	//   26   54:astore_2        
			flag = false;
	//   27   55:iconst_0        
	//   28   56:istore_1        
		}
		GSObject gsobject = new GSObject();
	//   29   57:new             #234 <Class GSObject>
	//   30   60:dup             
	//   31   61:invokespecial   #353 <Method void GSObject()>
	//   32   64:astore_3        
		gsobject.put("include", ((String) (obj)));
	//   33   65:aload_3         
	//   34   66:ldc2            #685 <String "include">
	//   35   69:aload_2         
	//   36   70:invokevirtual   #260 <Method void GSObject.put(String, String)>
		gsobject.put("apiKey", apiKey);
	//   37   73:aload_3         
	//   38   74:ldc2            #686 <String "apiKey">
	//   39   77:aload_0         
	//   40   78:getfield        #188 <Field String apiKey>
	//   41   81:invokevirtual   #260 <Method void GSObject.put(String, String)>
		gsobject.put("noAuth", true);
	//   42   84:aload_3         
	//   43   85:ldc2            #688 <String "noAuth">
	//   44   88:iconst_1        
	//   45   89:invokevirtual   #691 <Method void GSObject.put(String, boolean)>
		gsobject.put("enabledProviders", "");
	//   46   92:aload_3         
	//   47   93:ldc2            #693 <String "enabledProviders">
	//   48   96:ldc1            #232 <String "">
	//   49   98:invokevirtual   #260 <Method void GSObject.put(String, String)>
		sendRequest("getSDKConfig", gsobject, true, 5000, new GSResponseListener() {

			public void onGSResponse(String s, GSResponse gsresponse, Object obj1)
			{
				if(gsresponse.getErrorCode() == 0 && gsresponse.getData() != null)
			//*   0    0:aload_2         
			//*   1    1:invokevirtual   #28  <Method int GSResponse.getErrorCode()>
			//*   2    4:ifne            78
			//*   3    7:aload_2         
			//*   4    8:invokevirtual   #32  <Method GSObject GSResponse.getData()>
			//*   5   11:ifnonnull       17
			//*   6   14:goto            78
				{
					config = gsresponse.getData();
			//    7   17:aload_0         
			//    8   18:getfield        #17  <Field GSAPI this$0>
			//    9   21:aload_2         
			//   10   22:invokevirtual   #32  <Method GSObject GSResponse.getData()>
			//   11   25:invokestatic    #36  <Method GSObject GSAPI.access$702(GSAPI, GSObject)>
			//   12   28:pop             
					s = ((String) (config.getObject("ids", ((GSObject) (null)))));
			//   13   29:aload_0         
			//   14   30:getfield        #17  <Field GSAPI this$0>
			//   15   33:invokestatic    #40  <Method GSObject GSAPI.access$700(GSAPI)>
			//   16   36:ldc1            #42  <String "ids">
			//   17   38:aconst_null     
			//   18   39:invokevirtual   #48  <Method GSObject GSObject.getObject(String, GSObject)>
			//   19   42:astore_1        
					if(s != null)
			//*  20   43:aload_1         
			//*  21   44:ifnull          129
					{
						setUCID(((GSObject) (s)).getString("ucid", ((String) (null))));
			//   22   47:aload_0         
			//   23   48:getfield        #17  <Field GSAPI this$0>
			//   24   51:aload_1         
			//   25   52:ldc1            #50  <String "ucid">
			//   26   54:aconst_null     
			//   27   55:invokevirtual   #54  <Method String GSObject.getString(String, String)>
			//   28   58:invokestatic    #58  <Method void GSAPI.access$800(GSAPI, String)>
						setGMID(((GSObject) (s)).getString("gmid", ((String) (null))));
			//   29   61:aload_0         
			//   30   62:getfield        #17  <Field GSAPI this$0>
			//   31   65:aload_1         
			//   32   66:ldc1            #60  <String "gmid">
			//   33   68:aconst_null     
			//   34   69:invokevirtual   #54  <Method String GSObject.getString(String, String)>
			//   35   72:invokestatic    #63  <Method void GSAPI.access$900(GSAPI, String)>
					}
				} else
			//*  36   75:goto            129
				{
					config = new GSObject();
			//   37   78:aload_0         
			//   38   79:getfield        #17  <Field GSAPI this$0>
			//   39   82:new             #44  <Class GSObject>
			//   40   85:dup             
			//   41   86:invokespecial   #64  <Method void GSObject()>
			//   42   89:invokestatic    #36  <Method GSObject GSAPI.access$702(GSAPI, GSObject)>
			//   43   92:pop             
					s = GSAPI.TAG;
			//   44   93:invokestatic    #68  <Method String GSAPI.access$000()>
			//   45   96:astore_1        
					obj1 = ((Object) (new StringBuilder()));
			//   46   97:new             #70  <Class StringBuilder>
			//   47  100:dup             
			//   48  101:invokespecial   #71  <Method void StringBuilder()>
			//   49  104:astore_3        
					((StringBuilder) (obj1)).append("Unable to load config from server:");
			//   50  105:aload_3         
			//   51  106:ldc1            #73  <String "Unable to load config from server:">
			//   52  108:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
			//   53  111:pop             
					((StringBuilder) (obj1)).append(gsresponse.getLog());
			//   54  112:aload_3         
			//   55  113:aload_2         
			//   56  114:invokevirtual   #80  <Method String GSResponse.getLog()>
			//   57  117:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
			//   58  120:pop             
					GigyaLog.e(s, ((StringBuilder) (obj1)).toString());
			//   59  121:aload_1         
			//   60  122:aload_3         
			//   61  123:invokevirtual   #83  <Method String StringBuilder.toString()>
			//   62  126:invokestatic    #89  <Method void GigyaLog.e(String, String)>
				}
				loginProviderFactory.validatePermissions(config);
			//   63  129:aload_0         
			//   64  130:getfield        #17  <Field GSAPI this$0>
			//   65  133:getfield        #93  <Field LoginProviderFactory GSAPI.loginProviderFactory>
			//   66  136:aload_0         
			//   67  137:getfield        #17  <Field GSAPI this$0>
			//   68  140:invokestatic    #40  <Method GSObject GSAPI.access$700(GSAPI)>
			//   69  143:invokevirtual   #99  <Method void LoginProviderFactory.validatePermissions(GSObject)>
				requestsQueue.release();
			//   70  146:aload_0         
			//   71  147:getfield        #17  <Field GSAPI this$0>
			//   72  150:invokestatic    #103 <Method SimpleRunnableQueue GSAPI.access$1000(GSAPI)>
			//   73  153:invokevirtual   #108 <Method void SimpleRunnableQueue.release()>
			//   74  156:return          
			}

			final GSAPI this$0;

			
			{
				this$0 = GSAPI.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GSAPI this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, ((Object) (null)), ((GSLogger) (null)), flag);
	//   50  101:aload_0         
	//   51  102:ldc2            #695 <String "getSDKConfig">
	//   52  105:aload_3         
	//   53  106:iconst_1        
	//   54  107:sipush          5000
	//   55  110:new             #12  <Class GSAPI$11>
	//   56  113:dup             
	//   57  114:aload_0         
	//   58  115:invokespecial   #697 <Method void GSAPI$11(GSAPI)>
	//   59  118:aconst_null     
	//   60  119:aconst_null     
	//   61  120:iload_1         
	//   62  121:invokevirtual   #701 <Method void sendRequest(String, GSObject, boolean, int, GSResponseListener, Object, GSLogger, boolean)>
	//   63  124:return          
	}

	protected long loadTimestampOffset()
	{
		return mSessionManager.getTimestampOffset();
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field SessionManager mSessionManager>
	//    2    4:invokevirtual   #706 <Method long SessionManager.getTimestampOffset()>
	//    3    7:lreturn         
	}

	public GSLoginRequest login(Activity activity, GSObject gsobject, GSResponseListener gsresponselistener, Object obj)
	{
		return login(activity, gsobject, gsresponselistener, false, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:aload           4
	//    6    7:invokevirtual   #710 <Method GSLoginRequest login(Activity, GSObject, GSResponseListener, boolean, Object)>
	//    7   10:areturn         
	}

	public GSLoginRequest login(final Activity req, final GSObject params, final GSResponseListener listener, boolean flag, final Object context)
	{
		if(OPTION_CHECK_CONNECTIVITY && !isInetConnected())
	//*   0    0:getstatic       #344 <Field boolean OPTION_CHECK_CONNECTIVITY>
	//*   1    3:ifeq            40
	//*   2    6:aload_0         
	//*   3    7:invokevirtual   #348 <Method boolean isInetConnected()>
	//*   4   10:ifne            40
		{
			notifyResponse(listener, "login", new GSResponse("login", params, 0x7a13a, ((GSLogger) (null))), context);
	//    5   13:aload_0         
	//    6   14:aload_3         
	//    7   15:ldc2            #711 <String "login">
	//    8   18:new             #350 <Class GSResponse>
	//    9   21:dup             
	//   10   22:ldc2            #711 <String "login">
	//   11   25:aload_2         
	//   12   26:ldc2            #354 <Int 0x7a13a>
	//   13   29:aconst_null     
	//   14   30:invokespecial   #418 <Method void GSResponse(String, GSObject, int, GSLogger)>
	//   15   33:aload           5
	//   16   35:invokevirtual   #422 <Method void notifyResponse(GSResponseListener, String, GSResponse, Object)>
			return null;
	//   17   38:aconst_null     
	//   18   39:areturn         
		} else
		{
			req = ((Activity) (new GSLoginRequest(GSLoginRequest.LoginRequestType.login, req, params, listener, Boolean.valueOf(flag), context)));
	//   19   40:new             #428 <Class GSLoginRequest>
	//   20   43:dup             
	//   21   44:getstatic       #713 <Field GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.login>
	//   22   47:aload_1         
	//   23   48:aload_2         
	//   24   49:aload_3         
	//   25   50:iload           4
	//   26   52:invokestatic    #718 <Method Boolean Boolean.valueOf(boolean)>
	//   27   55:aload           5
	//   28   57:invokespecial   #721 <Method void GSLoginRequest(GSLoginRequest$LoginRequestType, Activity, GSObject, GSResponseListener, Boolean, Object)>
	//   29   60:astore_1        
			requestsQueue.enqueue(new Runnable() {

				public void run()
				{
					String s = params.getString("loginMode", ((String) (null)));
				//    0    0:aload_0         
				//    1    1:getfield        #27  <Field GSObject val$params>
				//    2    4:ldc1            #44  <String "loginMode">
				//    3    6:aconst_null     
				//    4    7:invokevirtual   #50  <Method String GSObject.getString(String, String)>
				//    5   10:astore_1        
					if(s == null || !s.equals("reAuth"))
				//*   6   11:aload_1         
				//*   7   12:ifnull          24
				//*   8   15:aload_1         
				//*   9   16:ldc1            #52  <String "reAuth">
				//*  10   18:invokevirtual   #58  <Method boolean String.equals(Object)>
				//*  11   21:ifne            31
						clearSession();
				//   12   24:aload_0         
				//   13   25:getfield        #25  <Field GSAPI this$0>
				//   14   28:invokevirtual   #61  <Method void GSAPI.clearSession()>
					try
					{
						req.send();
				//   15   31:aload_0         
				//   16   32:getfield        #29  <Field GSLoginRequest val$req>
				//   17   35:invokevirtual   #66  <Method void GSLoginRequest.send()>
						return;
				//   18   38:return          
					}
				//*  19   39:astore_1        
				//*  20   40:aload_1         
				//*  21   41:invokevirtual   #69  <Method void android.content.pm.PackageManager$NameNotFoundException.printStackTrace()>
				//*  22   44:return          
					catch(IllegalArgumentException illegalargumentexception)
				//*  23   45:astore_1        
					{
						notifyResponse(listener, "login", new GSResponse("login", params, 0x61a86, illegalargumentexception.getMessage(), ((GSLogger) (null))), context);
				//   24   46:aload_0         
				//   25   47:getfield        #25  <Field GSAPI this$0>
				//   26   50:aload_0         
				//   27   51:getfield        #31  <Field GSResponseListener val$listener>
				//   28   54:ldc1            #70  <String "login">
				//   29   56:new             #72  <Class GSResponse>
				//   30   59:dup             
				//   31   60:ldc1            #70  <String "login">
				//   32   62:aload_0         
				//   33   63:getfield        #27  <Field GSObject val$params>
				//   34   66:ldc1            #73  <Int 0x61a86>
				//   35   68:aload_1         
				//   36   69:invokevirtual   #77  <Method String IllegalArgumentException.getMessage()>
				//   37   72:aconst_null     
				//   38   73:invokespecial   #80  <Method void GSResponse(String, GSObject, int, String, GSLogger)>
				//   39   76:aload_0         
				//   40   77:getfield        #33  <Field Object val$context>
				//   41   80:invokevirtual   #84  <Method void GSAPI.notifyResponse(GSResponseListener, String, GSResponse, Object)>
					}
					catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
					{
						namenotfoundexception.printStackTrace();
						return;
					}
				//   42   83:return          
				}

				final GSAPI this$0;
				final Object val$context;
				final GSResponseListener val$listener;
				final GSObject val$params;
				final GSLoginRequest val$req;

			
			{
				this$0 = GSAPI.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field GSAPI this$0>
				params = gsobject;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field GSObject val$params>
				req = gsloginrequest;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #29  <Field GSLoginRequest val$req>
				listener = gsresponselistener;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #31  <Field GSResponseListener val$listener>
				context = obj;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #33  <Field Object val$context>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #36  <Method void Object()>
			//   17   31:return          
			}
			}
);
	//   30   61:aload_0         
	//   31   62:getfield        #143 <Field SimpleRunnableQueue requestsQueue>
	//   32   65:new             #30  <Class GSAPI$4>
	//   33   68:dup             
	//   34   69:aload_0         
	//   35   70:aload_2         
	//   36   71:aload_1         
	//   37   72:aload_3         
	//   38   73:aload           5
	//   39   75:invokespecial   #724 <Method void GSAPI$4(GSAPI, GSObject, GSLoginRequest, GSResponseListener, Object)>
	//   40   78:invokevirtual   #443 <Method void SimpleRunnableQueue.enqueue(Runnable)>
			return ((GSLoginRequest) (req));
	//   41   81:aload_1         
	//   42   82:areturn         
		}
	}

	public void logout()
	{
		invalidateSessionVerification();
	//    0    0:aload_0         
	//    1    1:invokespecial   #727 <Method void invalidateSessionVerification()>
		CookieSyncManager.createInstance(appContext);
	//    2    4:aload_0         
	//    3    5:getfield        #494 <Field Context appContext>
	//    4    8:invokestatic    #733 <Method CookieSyncManager CookieSyncManager.createInstance(Context)>
	//    5   11:pop             
		CookieManager.getInstance().removeAllCookie();
	//    6   12:invokestatic    #501 <Method CookieManager CookieManager.getInstance()>
	//    7   15:invokevirtual   #736 <Method void CookieManager.removeAllCookie()>
		if(gotValidSession())
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #425 <Method boolean gotValidSession()>
	//*  10   22:ifeq            35
			sendRequest("socialize.logout", ((GSObject) (null)), ((GSResponseListener) (null)), ((Object) (null)));
	//   11   25:aload_0         
	//   12   26:ldc2            #738 <String "socialize.logout">
	//   13   29:aconst_null     
	//   14   30:aconst_null     
	//   15   31:aconst_null     
	//   16   32:invokevirtual   #741 <Method void sendRequest(String, GSObject, GSResponseListener, Object)>
		clearSession();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #742 <Method void clearSession()>
		mSessionManager.invalidateSessionEncryption();
	//   19   39:aload_0         
	//   20   40:getfield        #153 <Field SessionManager mSessionManager>
	//   21   43:invokevirtual   #745 <Method void SessionManager.invalidateSessionEncryption()>
	//   22   46:return          
	}

	protected void notifyResponse(final GSResponseListener listener, final String method, final GSResponse response, final Object context)
	{
		if(listener != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          27
			(new Thread(new Runnable() {

				public void run()
				{
					if(response.getErrorCode() != 0)
				//*   0    0:aload_0         
				//*   1    1:getfield        #27  <Field GSResponse val$response>
				//*   2    4:invokevirtual   #44  <Method int GSResponse.getErrorCode()>
				//*   3    7:ifeq            49
					{
						String s = GSAPI.TAG;
				//    4   10:invokestatic    #48  <Method String GSAPI.access$000()>
				//    5   13:astore_1        
						StringBuilder stringbuilder = new StringBuilder();
				//    6   14:new             #50  <Class StringBuilder>
				//    7   17:dup             
				//    8   18:invokespecial   #51  <Method void StringBuilder()>
				//    9   21:astore_2        
						stringbuilder.append("Error Response: \n");
				//   10   22:aload_2         
				//   11   23:ldc1            #53  <String "Error Response: \n">
				//   12   25:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
				//   13   28:pop             
						stringbuilder.append(response.getLog());
				//   14   29:aload_2         
				//   15   30:aload_0         
				//   16   31:getfield        #27  <Field GSResponse val$response>
				//   17   34:invokevirtual   #60  <Method String GSResponse.getLog()>
				//   18   37:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
				//   19   40:pop             
						GigyaLog.e(s, stringbuilder.toString());
				//   20   41:aload_1         
				//   21   42:aload_2         
				//   22   43:invokevirtual   #63  <Method String StringBuilder.toString()>
				//   23   46:invokestatic    #69  <Method void GigyaLog.e(String, String)>
					}
					listener.onGSResponse(method, response, context);
				//   24   49:aload_0         
				//   25   50:getfield        #29  <Field GSResponseListener val$listener>
				//   26   53:aload_0         
				//   27   54:getfield        #31  <Field String val$method>
				//   28   57:aload_0         
				//   29   58:getfield        #27  <Field GSResponse val$response>
				//   30   61:aload_0         
				//   31   62:getfield        #33  <Field Object val$context>
				//   32   65:invokeinterface #75  <Method void GSResponseListener.onGSResponse(String, GSResponse, Object)>
				//   33   70:return          
				}

				final GSAPI this$0;
				final Object val$context;
				final GSResponseListener val$listener;
				final String val$method;
				final GSResponse val$response;

			
			{
				this$0 = GSAPI.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field GSAPI this$0>
				response = gsresponse;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field GSResponse val$response>
				listener = gsresponselistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #29  <Field GSResponseListener val$listener>
				method = s;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #31  <Field String val$method>
				context = obj;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #33  <Field Object val$context>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #36  <Method void Object()>
			//   17   31:return          
			}
			}
)).run();
	//    2    4:new             #747 <Class Thread>
	//    3    7:dup             
	//    4    8:new             #16  <Class GSAPI$13>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:aload_3         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:aload           4
	//   11   18:invokespecial   #750 <Method void GSAPI$13(GSAPI, GSResponse, GSResponseListener, String, Object)>
	//   12   21:invokespecial   #752 <Method void Thread(Runnable)>
	//   13   24:invokevirtual   #755 <Method void Thread.run()>
	//   14   27:return          
	}

	public void onSessionVerificationFailed()
	{
		invalidateSessionVerification();
	//    0    0:aload_0         
	//    1    1:invokespecial   #727 <Method void invalidateSessionVerification()>
		clearSession();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #742 <Method void clearSession()>
	//    4    8:return          
	}

	public void registerActivityLifecycleCallbacks(Application application)
	{
		application.registerActivityLifecycleCallbacks(((android.app.Application.ActivityLifecycleCallbacks) (new GSActivityLifecycleCallbacks() {

			public void onActivityResumed(Activity activity)
			{
				mResumedActivityName = activity.getComponentName().getClassName();
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field GSAPI this$0>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #35  <Method ComponentName Activity.getComponentName()>
			//    4    8:invokevirtual   #41  <Method String ComponentName.getClassName()>
			//    5   11:invokestatic    #45  <Method String GSAPI.access$202(GSAPI, String)>
			//    6   14:pop             
			//    7   15:return          
			}

			public void onActivityStarted(Activity activity)
			{
				int i = activityReferences + 1;
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field int activityReferences>
			//    2    4:iconst_1        
			//    3    5:iadd            
			//    4    6:istore_2        
				activityReferences = i;
			//    5    7:aload_0         
			//    6    8:iload_2         
			//    7    9:putfield        #24  <Field int activityReferences>
				if(i == 1 && !isActivityChangingConfigurations)
			//*   8   12:iload_2         
			//*   9   13:iconst_1        
			//*  10   14:icmpne          39
			//*  11   17:aload_0         
			//*  12   18:getfield        #26  <Field boolean isActivityChangingConfigurations>
			//*  13   21:ifne            39
				{
					GigyaLog.d(GSAPI.TAG, "App enters foreground");
			//   14   24:invokestatic    #49  <Method String GSAPI.access$000()>
			//   15   27:ldc1            #51  <String "App enters foreground">
			//   16   29:invokestatic    #57  <Method void GigyaLog.d(String, String)>
					startSessionVerification();
			//   17   32:aload_0         
			//   18   33:getfield        #19  <Field GSAPI this$0>
			//   19   36:invokestatic    #60  <Method void GSAPI.access$100(GSAPI)>
				}
			//   20   39:return          
			}

			public void onActivityStopped(Activity activity)
			{
				isActivityChangingConfigurations = activity.isChangingConfigurations();
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #65  <Method boolean Activity.isChangingConfigurations()>
			//    3    5:putfield        #26  <Field boolean isActivityChangingConfigurations>
				int i = activityReferences - 1;
			//    4    8:aload_0         
			//    5    9:getfield        #24  <Field int activityReferences>
			//    6   12:iconst_1        
			//    7   13:isub            
			//    8   14:istore_2        
				activityReferences = i;
			//    9   15:aload_0         
			//   10   16:iload_2         
			//   11   17:putfield        #24  <Field int activityReferences>
				if(i == 0 && !isActivityChangingConfigurations)
			//*  12   20:iload_2         
			//*  13   21:ifne            46
			//*  14   24:aload_0         
			//*  15   25:getfield        #26  <Field boolean isActivityChangingConfigurations>
			//*  16   28:ifne            46
				{
					GigyaLog.d(GSAPI.TAG, "App enters background");
			//   17   31:invokestatic    #49  <Method String GSAPI.access$000()>
			//   18   34:ldc1            #67  <String "App enters background">
			//   19   36:invokestatic    #57  <Method void GigyaLog.d(String, String)>
					cancelSessionVerification();
			//   20   39:aload_0         
			//   21   40:getfield        #19  <Field GSAPI this$0>
			//   22   43:invokestatic    #70  <Method void GSAPI.access$300(GSAPI)>
				}
			//   23   46:return          
			}

			private int activityReferences;
			private boolean isActivityChangingConfigurations;
			final GSAPI this$0;

			
			{
				this$0 = GSAPI.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GSAPI this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void GSActivityLifecycleCallbacks()>
				activityReferences = 0;
			//    5    9:aload_0         
			//    6   10:iconst_0        
			//    7   11:putfield        #24  <Field int activityReferences>
				isActivityChangingConfigurations = false;
			//    8   14:aload_0         
			//    9   15:iconst_0        
			//   10   16:putfield        #26  <Field boolean isActivityChangingConfigurations>
			//   11   19:return          
			}
		}
)));
	//    0    0:aload_1         
	//    1    1:new             #28  <Class GSAPI$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #759 <Method void GSAPI$3(GSAPI)>
	//    5    9:invokevirtual   #764 <Method void Application.registerActivityLifecycleCallbacks(android.app.Application$ActivityLifecycleCallbacks)>
	//    6   12:return          
	}

	protected void removeAccountsListener(GSAccountsEventListener gsaccountseventlistener)
	{
		accountsEventListenersArray.remove(((Object) (gsaccountseventlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field ArrayList accountsEventListenersArray>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #768 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void removeConnection(GSObject gsobject, GSResponseListener gsresponselistener, Object obj)
	{
		if(OPTION_CHECK_CONNECTIVITY && !isInetConnected())
	//*   0    0:getstatic       #344 <Field boolean OPTION_CHECK_CONNECTIVITY>
	//*   1    3:ifeq            38
	//*   2    6:aload_0         
	//*   3    7:invokevirtual   #348 <Method boolean isInetConnected()>
	//*   4   10:ifne            38
		{
			notifyResponse(gsresponselistener, "removeConnection", new GSResponse("removeConnection", gsobject, 0x7a13a, ((GSLogger) (null))), obj);
	//    5   13:aload_0         
	//    6   14:aload_2         
	//    7   15:ldc2            #771 <String "removeConnection">
	//    8   18:new             #350 <Class GSResponse>
	//    9   21:dup             
	//   10   22:ldc2            #771 <String "removeConnection">
	//   11   25:aload_1         
	//   12   26:ldc2            #354 <Int 0x7a13a>
	//   13   29:aconst_null     
	//   14   30:invokespecial   #418 <Method void GSResponse(String, GSObject, int, GSLogger)>
	//   15   33:aload_3         
	//   16   34:invokevirtual   #422 <Method void notifyResponse(GSResponseListener, String, GSResponse, Object)>
			return;
	//   17   37:return          
		}
		if(!gotValidSession())
	//*  18   38:aload_0         
	//*  19   39:invokevirtual   #425 <Method boolean gotValidSession()>
	//*  20   42:ifne            70
		{
			notifyResponse(gsresponselistener, "removeConnection", new GSResponse("removeConnection", gsobject, 0x62638, ((GSLogger) (null))), obj);
	//   21   45:aload_0         
	//   22   46:aload_2         
	//   23   47:ldc2            #771 <String "removeConnection">
	//   24   50:new             #350 <Class GSResponse>
	//   25   53:dup             
	//   26   54:ldc2            #771 <String "removeConnection">
	//   27   57:aload_1         
	//   28   58:ldc2            #426 <Int 0x62638>
	//   29   61:aconst_null     
	//   30   62:invokespecial   #418 <Method void GSResponse(String, GSObject, int, GSLogger)>
	//   31   65:aload_3         
	//   32   66:invokevirtual   #422 <Method void notifyResponse(GSResponseListener, String, GSResponse, Object)>
			return;
	//   33   69:return          
		}
		if(!gsobject.containsKey("provider"))
	//*  34   70:aload_1         
	//*  35   71:ldc2            #773 <String "provider">
	//*  36   74:invokevirtual   #775 <Method boolean GSObject.containsKey(String)>
	//*  37   77:ifne            105
		{
			notifyResponse(gsresponselistener, "removeConnection", new GSResponse("removeConnection", gsobject, 0x61a82, ((GSLogger) (null))), obj);
	//   38   80:aload_0         
	//   39   81:aload_2         
	//   40   82:ldc2            #771 <String "removeConnection">
	//   41   85:new             #350 <Class GSResponse>
	//   42   88:dup             
	//   43   89:ldc2            #771 <String "removeConnection">
	//   44   92:aload_1         
	//   45   93:ldc2            #776 <Int 0x61a82>
	//   46   96:aconst_null     
	//   47   97:invokespecial   #418 <Method void GSResponse(String, GSObject, int, GSLogger)>
	//   48  100:aload_3         
	//   49  101:invokevirtual   #422 <Method void notifyResponse(GSResponseListener, String, GSResponse, Object)>
			return;
	//   50  104:return          
		} else
		{
			sendRequest("socialize.removeConnection", gsobject, new GSResponseListener() {

				public void onGSResponse(String s, GSResponse gsresponse, Object obj1)
				{
					if(gsresponse.getErrorCode() == 0)
				//*   0    0:aload_2         
				//*   1    1:invokevirtual   #41  <Method int GSResponse.getErrorCode()>
				//*   2    4:ifne            34
						invokeSocializeListeners("connectionRemoved", new Object[] {
							provider, ctx
						});
				//    3    7:aload_0         
				//    4    8:getfield        #23  <Field GSAPI this$0>
				//    5   11:ldc1            #43  <String "connectionRemoved">
				//    6   13:iconst_2        
				//    7   14:anewarray       Object[]
				//    8   17:dup             
				//    9   18:iconst_0        
				//   10   19:aload_0         
				//   11   20:getfield        #25  <Field String val$provider>
				//   12   23:aastore         
				//   13   24:dup             
				//   14   25:iconst_1        
				//   15   26:aload_0         
				//   16   27:getfield        #27  <Field Object val$ctx>
				//   17   30:aastore         
				//   18   31:invokevirtual   #47  <Method void GSAPI.invokeSocializeListeners(String, Object[])>
					notifyResponse(listener, "removeConnection", gsresponse, obj1);
				//   19   34:aload_0         
				//   20   35:getfield        #23  <Field GSAPI this$0>
				//   21   38:aload_0         
				//   22   39:getfield        #29  <Field GSResponseListener val$listener>
				//   23   42:ldc1            #48  <String "removeConnection">
				//   24   44:aload_2         
				//   25   45:aload_3         
				//   26   46:invokevirtual   #52  <Method void GSAPI.notifyResponse(GSResponseListener, String, GSResponse, Object)>
				//   27   49:return          
				}

				final GSAPI this$0;
				final Object val$ctx;
				final GSResponseListener val$listener;
				final String val$provider;

			
			{
				this$0 = GSAPI.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field GSAPI this$0>
				provider = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field String val$provider>
				ctx = obj;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field Object val$ctx>
				listener = gsresponselistener;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field GSResponseListener val$listener>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
, ((Object) (null)));
	//   51  105:aload_0         
	//   52  106:ldc2            #778 <String "socialize.removeConnection">
	//   53  109:aload_1         
	//   54  110:new             #42  <Class GSAPI$9>
	//   55  113:dup             
	//   56  114:aload_0         
	//   57  115:aload_1         
	//   58  116:ldc2            #773 <String "provider">
	//   59  119:aconst_null     
	//   60  120:invokevirtual   #238 <Method String GSObject.getString(String, String)>
	//   61  123:aload_3         
	//   62  124:aload_2         
	//   63  125:invokespecial   #781 <Method void GSAPI$9(GSAPI, String, Object, GSResponseListener)>
	//   64  128:aconst_null     
	//   65  129:invokevirtual   #741 <Method void sendRequest(String, GSObject, GSResponseListener, Object)>
			return;
	//   66  132:return          
		}
	}

	protected void removeSocializeListener(GSSocializeEventListener gssocializeeventlistener)
	{
		socializeEventListenersArray.remove(((Object) (gssocializeeventlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field ArrayList socializeEventListenersArray>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #768 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void reportDeepLink(final Intent intent)
	{
		requestsQueue.enqueue(new Runnable() {

			public void run()
			{
				LoginProvider loginprovider = loginProviderFactory.getLoginProvider("facebook");
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field GSAPI this$0>
			//    2    4:getfield        #30  <Field LoginProviderFactory GSAPI.loginProviderFactory>
			//    3    7:ldc1            #32  <String "facebook">
			//    4    9:invokevirtual   #38  <Method LoginProvider LoginProviderFactory.getLoginProvider(String)>
			//    5   12:astore_1        
				if(((Object) (loginprovider)).getClass() == com/gigya/socialize/android/login/providers/FacebookProvider)
			//*   6   13:aload_1         
			//*   7   14:invokevirtual   #42  <Method Class Object.getClass()>
			//*   8   17:ldc1            #44  <Class FacebookProvider>
			//*   9   19:if_acmpne       33
					((FacebookProvider)loginprovider).reportDeepLink(intent);
			//   10   22:aload_1         
			//   11   23:checkcast       #44  <Class FacebookProvider>
			//   12   26:aload_0         
			//   13   27:getfield        #21  <Field Intent val$intent>
			//   14   30:invokevirtual   #45  <Method void FacebookProvider.reportDeepLink(Intent)>
			//   15   33:return          
			}

			final GSAPI this$0;
			final Intent val$intent;

			
			{
				this$0 = GSAPI.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GSAPI this$0>
				intent = intent1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Intent val$intent>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field SimpleRunnableQueue requestsQueue>
	//    2    4:new             #36  <Class GSAPI$6>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #787 <Method void GSAPI$6(GSAPI, Intent)>
	//    7   13:invokevirtual   #443 <Method void SimpleRunnableQueue.enqueue(Runnable)>
	//    8   16:return          
	}

	protected void reportError(String s, GSResponse gsresponse)
	{
		if(config == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #197 <Field GSObject config>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		GSArray gsarray;
		s = s.toLowerCase();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #792 <Method String String.toLowerCase()>
	//    6   12:astore_1        
		gsarray = config.getArray("errorReportRules");
	//    7   13:aload_0         
	//    8   14:getfield        #197 <Field GSObject config>
	//    9   17:ldc2            #794 <String "errorReportRules">
	//   10   20:invokevirtual   #798 <Method GSArray GSObject.getArray(String)>
	//   11   23:astore          4
		if(gsarray == null)
	//*  12   25:aload           4
	//*  13   27:ifnonnull       31
			return;
	//   14   30:return          
		String s1 = Integer.toString(gsresponse.getErrorCode());
	//   15   31:aload_2         
	//   16   32:invokevirtual   #801 <Method int GSResponse.getErrorCode()>
	//   17   35:invokestatic    #803 <Method String Integer.toString(int)>
	//   18   38:astore          5
		int i = 0;
	//   19   40:iconst_0        
	//   20   41:istore_3        
_L6:
		if(i >= gsarray.length()) goto _L2; else goto _L1
	//   21   42:iload_3         
	//   22   43:aload           4
	//   23   45:invokevirtual   #806 <Method int GSArray.length()>
	//   24   48:icmpge          256
_L1:
		String s2;
		Object obj;
		obj = ((Object) (gsarray.getObject(i)));
	//   25   51:aload           4
	//   26   53:iload_3         
	//   27   54:invokevirtual   #810 <Method GSObject GSArray.getObject(int)>
	//   28   57:astore          7
		s2 = ((GSObject) (obj)).getString("method");
	//   29   59:aload           7
	//   30   61:ldc2            #812 <String "method">
	//   31   64:invokevirtual   #814 <Method String GSObject.getString(String)>
	//   32   67:astore          6
		obj = ((Object) (((GSObject) (obj)).getString("error")));
	//   33   69:aload           7
	//   34   71:ldc2            #816 <String "error">
	//   35   74:invokevirtual   #814 <Method String GSObject.getString(String)>
	//   36   77:astore          7
		boolean flag;
		StringBuilder stringbuilder;
		if(!s2.toLowerCase().equals(((Object) (s))) && !s2.equals("*") || !((String) (obj)).equals(((Object) (s1))) && !((String) (obj)).equals("*"))
	//*  37   79:aload           6
	//*  38   81:invokevirtual   #792 <Method String String.toLowerCase()>
	//*  39   84:aload_1         
	//*  40   85:invokevirtual   #277 <Method boolean String.equals(Object)>
	//*  41   88:ifne            102
	//*  42   91:aload           6
	//*  43   93:ldc2            #818 <String "*">
	//*  44   96:invokevirtual   #277 <Method boolean String.equals(Object)>
	//*  45   99:ifeq            244
	//*  46  102:aload           7
	//*  47  104:aload           5
	//*  48  106:invokevirtual   #277 <Method boolean String.equals(Object)>
	//*  49  109:ifne            251
	//*  50  112:aload           7
	//*  51  114:ldc2            #818 <String "*">
	//*  52  117:invokevirtual   #277 <Method boolean String.equals(Object)>
	//*  53  120:ifeq            244
	//*  54  123:goto            251
	//*  55  126:new             #234 <Class GSObject>
	//*  56  129:dup             
	//*  57  130:invokespecial   #353 <Method void GSObject()>
	//*  58  133:astore_1        
	//*  59  134:aload_1         
	//*  60  135:ldc2            #686 <String "apiKey">
	//*  61  138:aload_0         
	//*  62  139:getfield        #188 <Field String apiKey>
	//*  63  142:invokevirtual   #260 <Method void GSObject.put(String, String)>
	//*  64  145:aload_1         
	//*  65  146:ldc2            #820 <String "log">
	//*  66  149:aload_2         
	//*  67  150:invokevirtual   #823 <Method String GSResponse.getLog()>
	//*  68  153:invokevirtual   #260 <Method void GSObject.put(String, String)>
	//*  69  156:aload_1         
	//*  70  157:ldc2            #825 <String "info">
	//*  71  160:aload_2         
	//*  72  161:invokevirtual   #801 <Method int GSResponse.getErrorCode()>
	//*  73  164:invokevirtual   #828 <Method void GSObject.put(String, int)>
	//*  74  167:aload_1         
	//*  75  168:ldc2            #829 <String "reportError">
	//*  76  171:iconst_0        
	//*  77  172:invokevirtual   #691 <Method void GSObject.put(String, boolean)>
	//*  78  175:aload_0         
	//*  79  176:ldc2            #831 <String "reportSDKError">
	//*  80  179:aload_1         
	//*  81  180:new             #14  <Class GSAPI$12>
	//*  82  183:dup             
	//*  83  184:aload_0         
	//*  84  185:invokespecial   #832 <Method void GSAPI$12(GSAPI)>
	//*  85  188:aconst_null     
	//*  86  189:invokevirtual   #741 <Method void sendRequest(String, GSObject, GSResponseListener, Object)>
	//*  87  192:return          
	//*  88  193:astore_1        
	//*  89  194:getstatic       #157 <Field String TAG>
	//*  90  197:astore_2        
	//*  91  198:new             #246 <Class StringBuilder>
	//*  92  201:dup             
	//*  93  202:invokespecial   #247 <Method void StringBuilder()>
	//*  94  205:astore          4
	//*  95  207:aload           4
	//*  96  209:ldc2            #834 <String "Error: ">
	//*  97  212:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//*  98  215:pop             
	//*  99  216:aload           4
	//* 100  218:aload_1         
	//* 101  219:invokevirtual   #837 <Method String Exception.getMessage()>
	//* 102  222:invokevirtual   #251 <Method StringBuilder StringBuilder.append(String)>
	//* 103  225:pop             
	//* 104  226:aload_2         
	//* 105  227:aload           4
	//* 106  229:invokevirtual   #256 <Method String StringBuilder.toString()>
	//* 107  232:invokestatic    #839 <Method void GigyaLog.e(String, String)>
	//* 108  235:aload_0         
	//* 109  236:iconst_0        
	//* 110  237:invokestatic    #718 <Method Boolean Boolean.valueOf(boolean)>
	//* 111  240:invokevirtual   #843 <Method void showProgress(Boolean)>
	//* 112  243:return          
		{
			i++;
	//  113  244:iload_3         
	//  114  245:iconst_1        
	//  115  246:iadd            
	//  116  247:istore_3        
		} else
	//* 117  248:goto            42
		{
			flag = true;
	//  118  251:iconst_1        
	//  119  252:istore_3        
			continue; /* Loop/switch isn't completed */
	//  120  253:goto            258
		}
		continue; /* Loop/switch isn't completed */
_L4:
		try
		{
			s = ((String) (new GSObject()));
			((GSObject) (s)).put("apiKey", apiKey);
			((GSObject) (s)).put("log", gsresponse.getLog());
			((GSObject) (s)).put("info", gsresponse.getErrorCode());
			((GSObject) (s)).put("reportError", false);
			sendRequest("reportSDKError", ((GSObject) (s)), new GSResponseListener() {

				public void onGSResponse(String s3, GSResponse gsresponse1, Object obj1)
				{
					if(gsresponse1.getErrorCode() != 0)
				//*   0    0:aload_2         
				//*   1    1:invokevirtual   #29  <Method int GSResponse.getErrorCode()>
				//*   2    4:ifeq            43
					{
						s3 = GSAPI.TAG;
				//    3    7:invokestatic    #33  <Method String GSAPI.access$000()>
				//    4   10:astore_1        
						obj1 = ((Object) (new StringBuilder()));
				//    5   11:new             #35  <Class StringBuilder>
				//    6   14:dup             
				//    7   15:invokespecial   #36  <Method void StringBuilder()>
				//    8   18:astore_3        
						((StringBuilder) (obj1)).append("Unable to report SDK error.");
				//    9   19:aload_3         
				//   10   20:ldc1            #38  <String "Unable to report SDK error.">
				//   11   22:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
				//   12   25:pop             
						((StringBuilder) (obj1)).append(gsresponse1.getLog());
				//   13   26:aload_3         
				//   14   27:aload_2         
				//   15   28:invokevirtual   #45  <Method String GSResponse.getLog()>
				//   16   31:invokevirtual   #42  <Method StringBuilder StringBuilder.append(String)>
				//   17   34:pop             
						GigyaLog.e(s3, ((StringBuilder) (obj1)).toString());
				//   18   35:aload_1         
				//   19   36:aload_3         
				//   20   37:invokevirtual   #48  <Method String StringBuilder.toString()>
				//   21   40:invokestatic    #54  <Method void GigyaLog.e(String, String)>
					}
				//   22   43:return          
				}

				final GSAPI this$0;

			
			{
				this$0 = GSAPI.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GSAPI this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
, ((Object) (null)));
			return;
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			gsresponse = ((GSResponse) (TAG));
		}
		stringbuilder = new StringBuilder();
		stringbuilder.append("Error: ");
		stringbuilder.append(((Exception) (s)).getMessage());
		GigyaLog.e(((String) (gsresponse)), stringbuilder.toString());
		showProgress(Boolean.valueOf(false));
		return;
_L2:
		flag = false;
	//  121  256:iconst_0        
	//  122  257:istore_3        
		if(flag) goto _L4; else goto _L3
	//  123  258:iload_3         
	//  124  259:ifne            126
_L3:
		return;
	//  125  262:return          
		if(true) goto _L6; else goto _L5
_L5:
	}

	public void reportURIReferral(Uri uri, String s)
	{
		GSObject gsobject = new GSObject();
	//    0    0:new             #234 <Class GSObject>
	//    1    3:dup             
	//    2    4:invokespecial   #353 <Method void GSObject()>
	//    3    7:astore_3        
		gsobject.put("f", "re");
	//    4    8:aload_3         
	//    5    9:ldc2            #847 <String "f">
	//    6   12:ldc2            #849 <String "re">
	//    7   15:invokevirtual   #260 <Method void GSObject.put(String, String)>
		gsobject.put("e", "linkback");
	//    8   18:aload_3         
	//    9   19:ldc2            #850 <String "e">
	//   10   22:ldc2            #852 <String "linkback">
	//   11   25:invokevirtual   #260 <Method void GSObject.put(String, String)>
		gsobject.put("url", uri.toString());
	//   12   28:aload_3         
	//   13   29:ldc2            #854 <String "url">
	//   14   32:aload_1         
	//   15   33:invokevirtual   #857 <Method String Uri.toString()>
	//   16   36:invokevirtual   #260 <Method void GSObject.put(String, String)>
		gsobject.put("sn", s);
	//   17   39:aload_3         
	//   18   40:ldc2            #859 <String "sn">
	//   19   43:aload_2         
	//   20   44:invokevirtual   #260 <Method void GSObject.put(String, String)>
		gsobject.put("sdk", "android_3.3.26");
	//   21   47:aload_3         
	//   22   48:ldc2            #861 <String "sdk">
	//   23   51:ldc1            #72  <String "android_3.3.26">
	//   24   53:invokevirtual   #260 <Method void GSObject.put(String, String)>
		gsobject.put("ak", getAPIKey());
	//   25   56:aload_3         
	//   26   57:ldc2            #863 <String "ak">
	//   27   60:aload_0         
	//   28   61:invokevirtual   #865 <Method String getAPIKey()>
	//   29   64:invokevirtual   #260 <Method void GSObject.put(String, String)>
		uri = ((Uri) (String.format("http://gscounters.%s/gs/api.ashx?%s", new Object[] {
			getAPIDomain(), GSRequest.buildQS(gsobject)
		})));
	//   30   67:ldc2            #867 <String "http://gscounters.%s/gs/api.ashx?%s">
	//   31   70:iconst_2        
	//   32   71:anewarray       Object[]
	//   33   74:dup             
	//   34   75:iconst_0        
	//   35   76:aload_0         
	//   36   77:invokevirtual   #869 <Method String getAPIDomain()>
	//   37   80:aastore         
	//   38   81:dup             
	//   39   82:iconst_1        
	//   40   83:aload_3         
	//   41   84:invokestatic    #875 <Method String GSRequest.buildQS(GSObject)>
	//   42   87:aastore         
	//   43   88:invokestatic    #879 <Method String String.format(String, Object[])>
	//   44   91:astore_1        
		((_cls7) (new AsyncTask() {

			protected volatile Object doInBackground(Object aobj[])
			{
				return ((Object) (doInBackground((String[])aobj)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #24  <Class String[]>
			//    3    5:invokevirtual   #27  <Method Void doInBackground(String[])>
			//    4    8:areturn         
			}

			protected Void doInBackground(String as[])
			{
				DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
			//    0    0:new             #31  <Class DefaultHttpClient>
			//    1    3:dup             
			//    2    4:invokespecial   #32  <Method void DefaultHttpClient()>
			//    3    7:astore_2        
				as = ((String []) (new HttpGet(as[0])));
			//    4    8:new             #34  <Class HttpGet>
			//    5   11:dup             
			//    6   12:aload_1         
			//    7   13:iconst_0        
			//    8   14:aaload          
			//    9   15:invokespecial   #37  <Method void HttpGet(String)>
			//   10   18:astore_1        
				try
				{
					((HttpClient) (defaulthttpclient)).execute(((org.apache.http.client.methods.HttpUriRequest) (as)));
			//   11   19:aload_2         
			//   12   20:aload_1         
			//   13   21:invokeinterface #43  <Method org.apache.http.HttpResponse HttpClient.execute(org.apache.http.client.methods.HttpUriRequest)>
			//   14   26:pop             
				}
			//*  15   27:goto            38
			//*  16   30:invokestatic    #47  <Method String GSAPI.access$000()>
			//*  17   33:ldc1            #49  <String "Error reporting deeplink referral">
			//*  18   35:invokestatic    #55  <Method void GigyaLog.e(String, String)>
			//*  19   38:aconst_null     
			//*  20   39:areturn         
				// Misplaced declaration of an exception variable
				catch(String as[])
				{
					GigyaLog.e(GSAPI.TAG, "Error reporting deeplink referral");
				}
				return null;
			//*  21   40:astore_1        
			//*  22   41:goto            30
			}

			final GSAPI this$0;

			
			{
				this$0 = GSAPI.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field GSAPI this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void AsyncTask()>
			//    5    9:return          
			}
		}
)).execute(((Object []) (new String[] {
			uri
		})));
	//   45   92:new             #38  <Class GSAPI$7>
	//   46   95:dup             
	//   47   96:aload_0         
	//   48   97:invokespecial   #880 <Method void GSAPI$7(GSAPI)>
	//   49  100:iconst_1        
	//   50  101:anewarray       String[]
	//   51  104:dup             
	//   52  105:iconst_0        
	//   53  106:aload_1         
	//   54  107:aastore         
	//   55  108:invokevirtual   #884 <Method AsyncTask GSAPI$7.execute(Object[])>
	//   56  111:pop             
	//   57  112:return          
	}

	public void requestNewFacebookPublishPermissions(final List permissions, final GSPermissionResultHandler callback)
	{
		requestsQueue.enqueue(new Runnable() {

			public void run()
			{
				LoginProvider loginprovider = loginProviderFactory.getLoginProvider("facebook");
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field GSAPI this$0>
			//    2    4:getfield        #34  <Field LoginProviderFactory GSAPI.loginProviderFactory>
			//    3    7:ldc1            #36  <String "facebook">
			//    4    9:invokevirtual   #42  <Method LoginProvider LoginProviderFactory.getLoginProvider(String)>
			//    5   12:astore_1        
				if(((Object) (loginProviderFactory.getLoginProvider("facebook"))).getClass() == com/gigya/socialize/android/login/providers/FacebookProvider)
			//*   6   13:aload_0         
			//*   7   14:getfield        #21  <Field GSAPI this$0>
			//*   8   17:getfield        #34  <Field LoginProviderFactory GSAPI.loginProviderFactory>
			//*   9   20:ldc1            #36  <String "facebook">
			//*  10   22:invokevirtual   #42  <Method LoginProvider LoginProviderFactory.getLoginProvider(String)>
			//*  11   25:invokevirtual   #46  <Method Class Object.getClass()>
			//*  12   28:ldc1            #48  <Class FacebookProvider>
			//*  13   30:if_acmpne       51
				{
					((FacebookProvider)loginprovider).requestPermissions("publish", permissions, callback);
			//   14   33:aload_1         
			//   15   34:checkcast       #48  <Class FacebookProvider>
			//   16   37:ldc1            #50  <String "publish">
			//   17   39:aload_0         
			//   18   40:getfield        #23  <Field List val$permissions>
			//   19   43:aload_0         
			//   20   44:getfield        #25  <Field GSPermissionResultHandler val$callback>
			//   21   47:invokevirtual   #54  <Method void FacebookProvider.requestPermissions(String, List, GSPermissionResultHandler)>
					return;
			//   22   50:return          
				}
				if(callback != null)
			//*  23   51:aload_0         
			//*  24   52:getfield        #25  <Field GSPermissionResultHandler val$callback>
			//*  25   55:ifnull          78
					callback.onResult(false, new Exception("App isn't configured for Facebook native login."), ((List) (null)));
			//   26   58:aload_0         
			//   27   59:getfield        #25  <Field GSPermissionResultHandler val$callback>
			//   28   62:iconst_0        
			//   29   63:new             #56  <Class Exception>
			//   30   66:dup             
			//   31   67:ldc1            #58  <String "App isn't configured for Facebook native login.">
			//   32   69:invokespecial   #61  <Method void Exception(String)>
			//   33   72:aconst_null     
			//   34   73:invokeinterface #67  <Method void GSPermissionResultHandler.onResult(boolean, Exception, List)>
			//   35   78:return          
			}

			final GSAPI this$0;
			final GSPermissionResultHandler val$callback;
			final List val$permissions;

			
			{
				this$0 = GSAPI.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field GSAPI this$0>
				permissions = list;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field List val$permissions>
				callback = gspermissionresulthandler;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field GSPermissionResultHandler val$callback>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field SimpleRunnableQueue requestsQueue>
	//    2    4:new             #18  <Class GSAPI$14>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #889 <Method void GSAPI$14(GSAPI, List, GSPermissionResultHandler)>
	//    8   14:invokevirtual   #443 <Method void SimpleRunnableQueue.enqueue(Runnable)>
	//    9   17:return          
	}

	public void requestNewFacebookReadPermissions(final List permissions, final GSPermissionResultHandler callback)
	{
		requestsQueue.enqueue(new Runnable() {

			public void run()
			{
				LoginProvider loginprovider = loginProviderFactory.getLoginProvider("facebook");
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field GSAPI this$0>
			//    2    4:getfield        #34  <Field LoginProviderFactory GSAPI.loginProviderFactory>
			//    3    7:ldc1            #36  <String "facebook">
			//    4    9:invokevirtual   #42  <Method LoginProvider LoginProviderFactory.getLoginProvider(String)>
			//    5   12:astore_1        
				if(((Object) (loginProviderFactory.getLoginProvider("facebook"))).getClass() == com/gigya/socialize/android/login/providers/FacebookProvider)
			//*   6   13:aload_0         
			//*   7   14:getfield        #21  <Field GSAPI this$0>
			//*   8   17:getfield        #34  <Field LoginProviderFactory GSAPI.loginProviderFactory>
			//*   9   20:ldc1            #36  <String "facebook">
			//*  10   22:invokevirtual   #42  <Method LoginProvider LoginProviderFactory.getLoginProvider(String)>
			//*  11   25:invokevirtual   #46  <Method Class Object.getClass()>
			//*  12   28:ldc1            #48  <Class FacebookProvider>
			//*  13   30:if_acmpne       51
				{
					((FacebookProvider)loginprovider).requestPermissions("read", permissions, callback);
			//   14   33:aload_1         
			//   15   34:checkcast       #48  <Class FacebookProvider>
			//   16   37:ldc1            #50  <String "read">
			//   17   39:aload_0         
			//   18   40:getfield        #23  <Field List val$permissions>
			//   19   43:aload_0         
			//   20   44:getfield        #25  <Field GSPermissionResultHandler val$callback>
			//   21   47:invokevirtual   #54  <Method void FacebookProvider.requestPermissions(String, List, GSPermissionResultHandler)>
					return;
			//   22   50:return          
				}
				if(callback != null)
			//*  23   51:aload_0         
			//*  24   52:getfield        #25  <Field GSPermissionResultHandler val$callback>
			//*  25   55:ifnull          78
					callback.onResult(false, new Exception("App isn't configured for Facebook native login."), ((List) (null)));
			//   26   58:aload_0         
			//   27   59:getfield        #25  <Field GSPermissionResultHandler val$callback>
			//   28   62:iconst_0        
			//   29   63:new             #56  <Class Exception>
			//   30   66:dup             
			//   31   67:ldc1            #58  <String "App isn't configured for Facebook native login.">
			//   32   69:invokespecial   #61  <Method void Exception(String)>
			//   33   72:aconst_null     
			//   34   73:invokeinterface #67  <Method void GSPermissionResultHandler.onResult(boolean, Exception, List)>
			//   35   78:return          
			}

			final GSAPI this$0;
			final GSPermissionResultHandler val$callback;
			final List val$permissions;

			
			{
				this$0 = GSAPI.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field GSAPI this$0>
				permissions = list;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field List val$permissions>
				callback = gspermissionresulthandler;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field GSPermissionResultHandler val$callback>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field SimpleRunnableQueue requestsQueue>
	//    2    4:new             #20  <Class GSAPI$15>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #892 <Method void GSAPI$15(GSAPI, List, GSPermissionResultHandler)>
	//    8   14:invokevirtual   #443 <Method void SimpleRunnableQueue.enqueue(Runnable)>
	//    9   17:return          
	}

	protected void requestPermissionsIfNeeded(String s, GSObject gsobject, GSPermissionResultHandler gspermissionresulthandler)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #133 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #134 <Method void ArrayList()>
	//    3    7:astore          4
		gsobject = ((GSObject) (gsobject.getString("enabledProviders", "*")));
	//    4    9:aload_2         
	//    5   10:ldc2            #693 <String "enabledProviders">
	//    6   13:ldc2            #818 <String "*">
	//    7   16:invokevirtual   #238 <Method String GSObject.getString(String, String)>
	//    8   19:astore_2        
		if(((String) (gsobject)).indexOf("facebook") != -1 || ((String) (gsobject)).indexOf("*") != -1)
	//*   9   20:aload_2         
	//*  10   21:ldc1            #222 <String "facebook">
	//*  11   23:invokevirtual   #898 <Method int String.indexOf(String)>
	//*  12   26:iconst_m1       
	//*  13   27:icmpne          41
	//*  14   30:aload_2         
	//*  15   31:ldc2            #818 <String "*">
	//*  16   34:invokevirtual   #898 <Method int String.indexOf(String)>
	//*  17   37:iconst_m1       
	//*  18   38:icmpeq          122
		{
			gsobject = ((GSObject) (loginProviderFactory.getLoginProvider("facebook")));
	//   19   41:aload_0         
	//   20   42:getfield        #220 <Field LoginProviderFactory loginProviderFactory>
	//   21   45:ldc1            #222 <String "facebook">
	//   22   47:invokevirtual   #902 <Method LoginProvider LoginProviderFactory.getLoginProvider(String)>
	//   23   50:astore_2        
			if(((Object) (gsobject)).getClass() == com/gigya/socialize/android/login/providers/FacebookProvider && FacebookProvider.isLoggedIn())
	//*  24   51:aload_2         
	//*  25   52:invokevirtual   #906 <Method Class Object.getClass()>
	//*  26   55:ldc2            #908 <Class FacebookProvider>
	//*  27   58:if_acmpne       122
	//*  28   61:invokestatic    #911 <Method boolean FacebookProvider.isLoggedIn()>
	//*  29   64:ifeq            122
			{
				if(s.contains("publishUserAction") || s.contains("setStatus") || s.contains("checkin"))
	//*  30   67:aload_1         
	//*  31   68:ldc2            #913 <String "publishUserAction">
	//*  32   71:invokevirtual   #916 <Method boolean String.contains(CharSequence)>
	//*  33   74:ifne            97
	//*  34   77:aload_1         
	//*  35   78:ldc2            #918 <String "setStatus">
	//*  36   81:invokevirtual   #916 <Method boolean String.contains(CharSequence)>
	//*  37   84:ifne            97
	//*  38   87:aload_1         
	//*  39   88:ldc2            #920 <String "checkin">
	//*  40   91:invokevirtual   #916 <Method boolean String.contains(CharSequence)>
	//*  41   94:ifeq            108
					((List) (arraylist)).add("publish_actions");
	//   42   97:aload           4
	//   43   99:ldc2            #922 <String "publish_actions">
	//   44  102:invokeinterface #925 <Method boolean List.add(Object)>
	//   45  107:pop             
				((FacebookProvider)gsobject).requestPermissions("publish", ((List) (arraylist)), gspermissionresulthandler);
	//   46  108:aload_2         
	//   47  109:checkcast       #908 <Class FacebookProvider>
	//   48  112:ldc2            #927 <String "publish">
	//   49  115:aload           4
	//   50  117:aload_3         
	//   51  118:invokevirtual   #931 <Method void FacebookProvider.requestPermissions(String, List, GSPermissionResultHandler)>
				return;
	//   52  121:return          
			}
		}
		gspermissionresulthandler.onResult(true, ((Exception) (null)), ((List) (new ArrayList())));
	//   53  122:aload_3         
	//   54  123:iconst_1        
	//   55  124:aconst_null     
	//   56  125:new             #133 <Class ArrayList>
	//   57  128:dup             
	//   58  129:invokespecial   #134 <Method void ArrayList()>
	//   59  132:invokeinterface #937 <Method void GSPermissionResultHandler.onResult(boolean, Exception, List)>
	//   60  137:return          
	}

	protected void saveTimestampOffset(long l)
	{
		mSessionManager.setTimestampOffset(l);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field SessionManager mSessionManager>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #942 <Method void SessionManager.setTimestampOffset(long)>
	//    4    8:return          
	}

	public void sendRequest(String s, GSObject gsobject, GSResponseListener gsresponselistener, Object obj)
	{
		sendRequest(s, gsobject, OPTION_HTTPS_ENABLED, gsresponselistener, obj, OPTION_REQUEST_TIMEOUT_MS);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #944 <Field boolean OPTION_HTTPS_ENABLED>
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:getstatic       #946 <Field int OPTION_REQUEST_TIMEOUT_MS>
	//    7   12:invokevirtual   #949 <Method void sendRequest(String, GSObject, boolean, GSResponseListener, Object, int)>
	//    8   15:return          
	}

	public void sendRequest(String s, GSObject gsobject, GSResponseListener gsresponselistener, Object obj, int i)
	{
		sendRequest(s, gsobject, OPTION_HTTPS_ENABLED, gsresponselistener, obj, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #944 <Field boolean OPTION_HTTPS_ENABLED>
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:iload           5
	//    7   11:invokevirtual   #949 <Method void sendRequest(String, GSObject, boolean, GSResponseListener, Object, int)>
	//    8   14:return          
	}

	protected void sendRequest(final String method, final GSObject params, final boolean useHTTPS, final int timeoutMS, final GSResponseListener listener, final Object context, final GSLogger trace, 
			final boolean forceHttpGet)
	{
		if(listener != null && OPTION_CHECK_CONNECTIVITY && !isInetConnected())
	//*   0    0:aload           5
	//*   1    2:ifnull          43
	//*   2    5:getstatic       #344 <Field boolean OPTION_CHECK_CONNECTIVITY>
	//*   3    8:ifeq            43
	//*   4   11:aload_0         
	//*   5   12:invokevirtual   #348 <Method boolean isInetConnected()>
	//*   6   15:ifne            43
		{
			params = ((GSObject) (new GSResponse(method, params, 0x7a13a, ((GSLogger) (null)))));
	//    7   18:new             #350 <Class GSResponse>
	//    8   21:dup             
	//    9   22:aload_1         
	//   10   23:aload_2         
	//   11   24:ldc2            #354 <Int 0x7a13a>
	//   12   27:aconst_null     
	//   13   28:invokespecial   #418 <Method void GSResponse(String, GSObject, int, GSLogger)>
	//   14   31:astore_2        
		} else
	//*  15   32:aload_0         
	//*  16   33:aload           5
	//*  17   35:aload_1         
	//*  18   36:aload_2         
	//*  19   37:aload           6
	//*  20   39:invokevirtual   #422 <Method void notifyResponse(GSResponseListener, String, GSResponse, Object)>
	//*  21   42:return          
		{
			if(method != null && method.length() != 0)
	//*  22   43:aload_1         
	//*  23   44:ifnull          148
	//*  24   47:aload_1         
	//*  25   48:invokevirtual   #244 <Method int String.length()>
	//*  26   51:ifne            57
	//*  27   54:goto            148
			{
				if(OPTION_SHOW_PROGRESS_ON_REQUEST && !method.toLowerCase().equals("reportsdkerror") && !method.toLowerCase().equals("getsdkconfig"))
	//*  28   57:getstatic       #952 <Field boolean OPTION_SHOW_PROGRESS_ON_REQUEST>
	//*  29   60:ifeq            97
	//*  30   63:aload_1         
	//*  31   64:invokevirtual   #792 <Method String String.toLowerCase()>
	//*  32   67:ldc2            #954 <String "reportsdkerror">
	//*  33   70:invokevirtual   #277 <Method boolean String.equals(Object)>
	//*  34   73:ifne            97
	//*  35   76:aload_1         
	//*  36   77:invokevirtual   #792 <Method String String.toLowerCase()>
	//*  37   80:ldc2            #956 <String "getsdkconfig">
	//*  38   83:invokevirtual   #277 <Method boolean String.equals(Object)>
	//*  39   86:ifne            97
					showProgress(Boolean.valueOf(true));
	//   40   89:aload_0         
	//   41   90:iconst_1        
	//   42   91:invokestatic    #718 <Method Boolean Boolean.valueOf(boolean)>
	//   43   94:invokevirtual   #843 <Method void showProgress(Boolean)>
				params = ((GSObject) (new Runnable() {

					public void run()
					{
						GSObject gsobject;
						if(params == null)
					//*   0    0:aload_0         
					//*   1    1:getfield        #36  <Field GSObject val$params>
					//*   2    4:ifnonnull       18
							gsobject = new GSObject();
					//    3    7:new             #57  <Class GSObject>
					//    4   10:dup             
					//    5   11:invokespecial   #58  <Method void GSObject()>
					//    6   14:astore_1        
						else
					//*   7   15:goto            23
							gsobject = params;
					//    8   18:aload_0         
					//    9   19:getfield        #36  <Field GSObject val$params>
					//   10   22:astore_1        
						requestPermissionsIfNeeded(method, gsobject, ((_cls1) (gsobject)). new GSPermissionResultHandler() {

							public void onResult(boolean flag, Exception exception, List list)
							{
								params2.put("sdk", "android_3.3.26");
							//    0    0:aload_0         
							//    1    1:getfield        #21  <Field GSObject val$params2>
							//    2    4:ldc1            #28  <String "sdk">
							//    3    6:ldc1            #30  <String "android_3.3.26">
							//    4    8:invokevirtual   #36  <Method void GSObject.put(String, String)>
								params2.put("targetEnv", "mobile");
							//    5   11:aload_0         
							//    6   12:getfield        #21  <Field GSObject val$params2>
							//    7   15:ldc1            #38  <String "targetEnv">
							//    8   17:ldc1            #40  <String "mobile">
							//    9   19:invokevirtual   #36  <Method void GSObject.put(String, String)>
								params2.put("ucid", getUCID());
							//   10   22:aload_0         
							//   11   23:getfield        #21  <Field GSObject val$params2>
							//   12   26:ldc1            #42  <String "ucid">
							//   13   28:aload_0         
							//   14   29:getfield        #19  <Field GSAPI$10 this$1>
							//   15   32:getfield        #46  <Field GSAPI GSAPI$10.this$0>
							//   16   35:invokevirtual   #52  <Method String GSAPI.getUCID()>
							//   17   38:invokevirtual   #36  <Method void GSObject.put(String, String)>
								if(params2.getBool("noAuth", false))
							//*  18   41:aload_0         
							//*  19   42:getfield        #21  <Field GSObject val$params2>
							//*  20   45:ldc1            #54  <String "noAuth">
							//*  21   47:iconst_0        
							//*  22   48:invokevirtual   #58  <Method boolean GSObject.getBool(String, boolean)>
							//*  23   51:ifeq            162
								{
									params2.remove("noAuth");
							//   24   54:aload_0         
							//   25   55:getfield        #21  <Field GSObject val$params2>
							//   26   58:ldc1            #54  <String "noAuth">
							//   27   60:invokevirtual   #62  <Method void GSObject.remove(String)>
									flag = params2.getString("include", "").contains(",ids");
							//   28   63:aload_0         
							//   29   64:getfield        #21  <Field GSObject val$params2>
							//   30   67:ldc1            #64  <String "include">
							//   31   69:ldc1            #66  <String "">
							//   32   71:invokevirtual   #70  <Method String GSObject.getString(String, String)>
							//   33   74:ldc1            #72  <String ",ids">
							//   34   76:invokevirtual   #78  <Method boolean String.contains(CharSequence)>
							//   35   79:istore_1        
									exception = ((Exception) (GSAPI.getInstance().apiKey));
							//   36   80:invokestatic    #82  <Method GSAPI GSAPI.getInstance()>
							//   37   83:invokestatic    #86  <Method String GSAPI.access$400(GSAPI)>
							//   38   86:astore_2        
									list = ((List) (method));
							//   39   87:aload_0         
							//   40   88:getfield        #19  <Field GSAPI$10 this$1>
							//   41   91:getfield        #90  <Field String GSAPI$10.val$method>
							//   42   94:astore_3        
									GSObject gsobject = params2;
							//   43   95:aload_0         
							//   44   96:getfield        #21  <Field GSObject val$params2>
							//   45   99:astore          5
									if(!useHTTPS && !Boolean.valueOf(flag).booleanValue())
							//*  46  101:aload_0         
							//*  47  102:getfield        #19  <Field GSAPI$10 this$1>
							//*  48  105:getfield        #94  <Field boolean GSAPI$10.val$useHTTPS>
							//*  49  108:ifne            129
							//*  50  111:iload_1         
							//*  51  112:invokestatic    #100 <Method Boolean Boolean.valueOf(boolean)>
							//*  52  115:invokevirtual   #104 <Method boolean Boolean.booleanValue()>
							//*  53  118:ifeq            124
							//*  54  121:goto            129
										flag = false;
							//   55  124:iconst_0        
							//   56  125:istore_1        
									else
							//*  57  126:goto            131
										flag = true;
							//   58  129:iconst_1        
							//   59  130:istore_1        
									exception = ((Exception) (new GSAsyncRequest(((String) (exception)), ((String) (null)), ((String) (list)), gsobject, flag, timeoutMS, trace)));
							//   60  131:new             #106 <Class GSAsyncRequest>
							//   61  134:dup             
							//   62  135:aload_2         
							//   63  136:aconst_null     
							//   64  137:aload_3         
							//   65  138:aload           5
							//   66  140:iload_1         
							//   67  141:aload_0         
							//   68  142:getfield        #19  <Field GSAPI$10 this$1>
							//   69  145:getfield        #110 <Field int GSAPI$10.val$timeoutMS>
							//   70  148:aload_0         
							//   71  149:getfield        #19  <Field GSAPI$10 this$1>
							//   72  152:getfield        #114 <Field GSLogger GSAPI$10.val$trace>
							//   73  155:invokespecial   #117 <Method void GSAsyncRequest(String, String, String, GSObject, boolean, int, GSLogger)>
							//   74  158:astore_2        
								} else
							//*  75  159:goto            560
								{
									boolean flag1;
									if(params2.getString("regToken", ((String) (null))) != null)
							//*  76  162:aload_0         
							//*  77  163:getfield        #21  <Field GSObject val$params2>
							//*  78  166:ldc1            #119 <String "regToken">
							//*  79  168:aconst_null     
							//*  80  169:invokevirtual   #70  <Method String GSObject.getString(String, String)>
							//*  81  172:ifnull          181
										flag1 = true;
							//   82  175:iconst_1        
							//   83  176:istore          4
									else
							//*  84  178:goto            184
										flag1 = false;
							//   85  181:iconst_0        
							//   86  182:istore          4
									if(useHTTPS || flag1)
							//*  87  184:aload_0         
							//*  88  185:getfield        #19  <Field GSAPI$10 this$1>
							//*  89  188:getfield        #94  <Field boolean GSAPI$10.val$useHTTPS>
							//*  90  191:ifne            199
							//*  91  194:iload           4
							//*  92  196:ifeq            218
										params2.put("gmid", getGMID());
							//   93  199:aload_0         
							//   94  200:getfield        #21  <Field GSObject val$params2>
							//   95  203:ldc1            #121 <String "gmid">
							//   96  205:aload_0         
							//   97  206:getfield        #19  <Field GSAPI$10 this$1>
							//   98  209:getfield        #46  <Field GSAPI GSAPI$10.this$0>
							//   99  212:invokevirtual   #124 <Method String GSAPI.getGMID()>
							//  100  215:invokevirtual   #36  <Method void GSObject.put(String, String)>
									if(mSessionManager.isValidSession())
							//* 101  218:aload_0         
							//* 102  219:getfield        #19  <Field GSAPI$10 this$1>
							//* 103  222:getfield        #46  <Field GSAPI GSAPI$10.this$0>
							//* 104  225:invokestatic    #128 <Method SessionManager GSAPI.access$500(GSAPI)>
							//* 105  228:invokevirtual   #133 <Method boolean SessionManager.isValidSession()>
							//* 106  231:ifeq            486
									{
										exception = ((Exception) (params2.getString("loginMode", ((String) (null)))));
							//  107  234:aload_0         
							//  108  235:getfield        #21  <Field GSObject val$params2>
							//  109  238:ldc1            #135 <String "loginMode">
							//  110  240:aconst_null     
							//  111  241:invokevirtual   #70  <Method String GSObject.getString(String, String)>
							//  112  244:astore_2        
										params2.put("oauth_token", mSessionManager.getSession().getToken());
							//  113  245:aload_0         
							//  114  246:getfield        #21  <Field GSObject val$params2>
							//  115  249:ldc1            #137 <String "oauth_token">
							//  116  251:aload_0         
							//  117  252:getfield        #19  <Field GSAPI$10 this$1>
							//  118  255:getfield        #46  <Field GSAPI GSAPI$10.this$0>
							//  119  258:invokestatic    #128 <Method SessionManager GSAPI.access$500(GSAPI)>
							//  120  261:invokevirtual   #141 <Method GSSession SessionManager.getSession()>
							//  121  264:invokevirtual   #146 <Method String GSSession.getToken()>
							//  122  267:invokevirtual   #36  <Method void GSObject.put(String, String)>
										if(exception != null && ((String) (exception)).equals("reAuth"))
							//* 123  270:aload_2         
							//* 124  271:ifnull          390
							//* 125  274:aload_2         
							//* 126  275:ldc1            #148 <String "reAuth">
							//* 127  277:invokevirtual   #152 <Method boolean String.equals(Object)>
							//* 128  280:ifeq            390
										{
											params2.put("secret_type", "oauth1");
							//  129  283:aload_0         
							//  130  284:getfield        #21  <Field GSObject val$params2>
							//  131  287:ldc1            #154 <String "secret_type">
							//  132  289:ldc1            #156 <String "oauth1">
							//  133  291:invokevirtual   #36  <Method void GSObject.put(String, String)>
											exception = ((Exception) (GSAPI.getInstance().apiKey));
							//  134  294:invokestatic    #82  <Method GSAPI GSAPI.getInstance()>
							//  135  297:invokestatic    #86  <Method String GSAPI.access$400(GSAPI)>
							//  136  300:astore_2        
											list = ((List) (mSessionManager.getSession().getSecret()));
							//  137  301:aload_0         
							//  138  302:getfield        #19  <Field GSAPI$10 this$1>
							//  139  305:getfield        #46  <Field GSAPI GSAPI$10.this$0>
							//  140  308:invokestatic    #128 <Method SessionManager GSAPI.access$500(GSAPI)>
							//  141  311:invokevirtual   #141 <Method GSSession SessionManager.getSession()>
							//  142  314:invokevirtual   #159 <Method String GSSession.getSecret()>
							//  143  317:astore_3        
											String s = method;
							//  144  318:aload_0         
							//  145  319:getfield        #19  <Field GSAPI$10 this$1>
							//  146  322:getfield        #90  <Field String GSAPI$10.val$method>
							//  147  325:astore          5
											GSObject gsobject2 = params2;
							//  148  327:aload_0         
							//  149  328:getfield        #21  <Field GSObject val$params2>
							//  150  331:astore          6
											if(!useHTTPS && !flag1)
							//* 151  333:aload_0         
							//* 152  334:getfield        #19  <Field GSAPI$10 this$1>
							//* 153  337:getfield        #94  <Field boolean GSAPI$10.val$useHTTPS>
							//* 154  340:ifne            356
							//* 155  343:iload           4
							//* 156  345:ifeq            351
							//* 157  348:goto            356
												flag = false;
							//  158  351:iconst_0        
							//  159  352:istore_1        
											else
							//* 160  353:goto            358
												flag = true;
							//  161  356:iconst_1        
							//  162  357:istore_1        
											exception = ((Exception) (new GSAsyncRequest(((String) (exception)), ((String) (list)), s, gsobject2, flag, timeoutMS, trace)));
							//  163  358:new             #106 <Class GSAsyncRequest>
							//  164  361:dup             
							//  165  362:aload_2         
							//  166  363:aload_3         
							//  167  364:aload           5
							//  168  366:aload           6
							//  169  368:iload_1         
							//  170  369:aload_0         
							//  171  370:getfield        #19  <Field GSAPI$10 this$1>
							//  172  373:getfield        #110 <Field int GSAPI$10.val$timeoutMS>
							//  173  376:aload_0         
							//  174  377:getfield        #19  <Field GSAPI$10 this$1>
							//  175  380:getfield        #114 <Field GSLogger GSAPI$10.val$trace>
							//  176  383:invokespecial   #117 <Method void GSAsyncRequest(String, String, String, GSObject, boolean, int, GSLogger)>
							//  177  386:astore_2        
										} else
							//* 178  387:goto            483
										{
											exception = ((Exception) (GSAPI.getInstance().apiKey));
							//  179  390:invokestatic    #82  <Method GSAPI GSAPI.getInstance()>
							//  180  393:invokestatic    #86  <Method String GSAPI.access$400(GSAPI)>
							//  181  396:astore_2        
											list = ((List) (mSessionManager.getSession().getSecret()));
							//  182  397:aload_0         
							//  183  398:getfield        #19  <Field GSAPI$10 this$1>
							//  184  401:getfield        #46  <Field GSAPI GSAPI$10.this$0>
							//  185  404:invokestatic    #128 <Method SessionManager GSAPI.access$500(GSAPI)>
							//  186  407:invokevirtual   #141 <Method GSSession SessionManager.getSession()>
							//  187  410:invokevirtual   #159 <Method String GSSession.getSecret()>
							//  188  413:astore_3        
											String s1 = method;
							//  189  414:aload_0         
							//  190  415:getfield        #19  <Field GSAPI$10 this$1>
							//  191  418:getfield        #90  <Field String GSAPI$10.val$method>
							//  192  421:astore          5
											GSObject gsobject3 = params2;
							//  193  423:aload_0         
							//  194  424:getfield        #21  <Field GSObject val$params2>
							//  195  427:astore          6
											if(!useHTTPS && !flag1)
							//* 196  429:aload_0         
							//* 197  430:getfield        #19  <Field GSAPI$10 this$1>
							//* 198  433:getfield        #94  <Field boolean GSAPI$10.val$useHTTPS>
							//* 199  436:ifne            452
							//* 200  439:iload           4
							//* 201  441:ifeq            447
							//* 202  444:goto            452
												flag = false;
							//  203  447:iconst_0        
							//  204  448:istore_1        
											else
							//* 205  449:goto            454
												flag = true;
							//  206  452:iconst_1        
							//  207  453:istore_1        
											exception = ((Exception) (new GSAsyncRequest(((String) (exception)), ((String) (list)), s1, gsobject3, flag, timeoutMS, trace)));
							//  208  454:new             #106 <Class GSAsyncRequest>
							//  209  457:dup             
							//  210  458:aload_2         
							//  211  459:aload_3         
							//  212  460:aload           5
							//  213  462:aload           6
							//  214  464:iload_1         
							//  215  465:aload_0         
							//  216  466:getfield        #19  <Field GSAPI$10 this$1>
							//  217  469:getfield        #110 <Field int GSAPI$10.val$timeoutMS>
							//  218  472:aload_0         
							//  219  473:getfield        #19  <Field GSAPI$10 this$1>
							//  220  476:getfield        #114 <Field GSLogger GSAPI$10.val$trace>
							//  221  479:invokespecial   #117 <Method void GSAsyncRequest(String, String, String, GSObject, boolean, int, GSLogger)>
							//  222  482:astore_2        
										}
									} else
							//* 223  483:goto            560
									{
										exception = ((Exception) (GSAPI.getInstance().apiKey));
							//  224  486:invokestatic    #82  <Method GSAPI GSAPI.getInstance()>
							//  225  489:invokestatic    #86  <Method String GSAPI.access$400(GSAPI)>
							//  226  492:astore_2        
										list = ((List) (method));
							//  227  493:aload_0         
							//  228  494:getfield        #19  <Field GSAPI$10 this$1>
							//  229  497:getfield        #90  <Field String GSAPI$10.val$method>
							//  230  500:astore_3        
										GSObject gsobject1 = params2;
							//  231  501:aload_0         
							//  232  502:getfield        #21  <Field GSObject val$params2>
							//  233  505:astore          5
										if(!useHTTPS && !flag1)
							//* 234  507:aload_0         
							//* 235  508:getfield        #19  <Field GSAPI$10 this$1>
							//* 236  511:getfield        #94  <Field boolean GSAPI$10.val$useHTTPS>
							//* 237  514:ifne            530
							//* 238  517:iload           4
							//* 239  519:ifeq            525
							//* 240  522:goto            530
											flag = false;
							//  241  525:iconst_0        
							//  242  526:istore_1        
										else
							//* 243  527:goto            532
											flag = true;
							//  244  530:iconst_1        
							//  245  531:istore_1        
										exception = ((Exception) (new GSAsyncRequest(((String) (exception)), ((String) (null)), ((String) (list)), gsobject1, flag, timeoutMS, trace)));
							//  246  532:new             #106 <Class GSAsyncRequest>
							//  247  535:dup             
							//  248  536:aload_2         
							//  249  537:aconst_null     
							//  250  538:aload_3         
							//  251  539:aload           5
							//  252  541:iload_1         
							//  253  542:aload_0         
							//  254  543:getfield        #19  <Field GSAPI$10 this$1>
							//  255  546:getfield        #110 <Field int GSAPI$10.val$timeoutMS>
							//  256  549:aload_0         
							//  257  550:getfield        #19  <Field GSAPI$10 this$1>
							//  258  553:getfield        #114 <Field GSLogger GSAPI$10.val$trace>
							//  259  556:invokespecial   #117 <Method void GSAsyncRequest(String, String, String, GSObject, boolean, int, GSLogger)>
							//  260  559:astore_2        
									}
								}
								if(forceHttpGet)
							//* 261  560:aload_0         
							//* 262  561:getfield        #19  <Field GSAPI$10 this$1>
							//* 263  564:getfield        #162 <Field boolean GSAPI$10.val$forceHttpGet>
							//* 264  567:ifeq            576
									((GSAsyncRequest) (exception)).setHttpMethod("GET");
							//  265  570:aload_2         
							//  266  571:ldc1            #164 <String "GET">
							//  267  573:invokevirtual   #167 <Method void GSAsyncRequest.setHttpMethod(String)>
								((GSAsyncRequest) (exception)).setAPIDomain(apiDomain);
							//  268  576:aload_2         
							//  269  577:aload_0         
							//  270  578:getfield        #19  <Field GSAPI$10 this$1>
							//  271  581:getfield        #46  <Field GSAPI GSAPI$10.this$0>
							//  272  584:invokestatic    #170 <Method String GSAPI.access$600(GSAPI)>
							//  273  587:invokevirtual   #173 <Method void GSAsyncRequest.setAPIDomain(String)>
								((GSAsyncRequest) (exception)).send(listener, context);
							//  274  590:aload_2         
							//  275  591:aload_0         
							//  276  592:getfield        #19  <Field GSAPI$10 this$1>
							//  277  595:getfield        #177 <Field GSResponseListener GSAPI$10.val$listener>
							//  278  598:aload_0         
							//  279  599:getfield        #19  <Field GSAPI$10 this$1>
							//  280  602:getfield        #181 <Field Object GSAPI$10.val$context>
							//  281  605:invokevirtual   #185 <Method void GSAsyncRequest.send(GSResponseListener, Object)>
							//  282  608:return          
							}

							final _cls10 this$1;
							final GSObject val$params2;

			
			{
				this$1 = final__pcls10;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GSAPI$10 this$1>
				params2 = GSObject.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field GSObject val$params2>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
						}
);
					//   11   23:aload_0         
					//   12   24:getfield        #34  <Field GSAPI this$0>
					//   13   27:aload_0         
					//   14   28:getfield        #38  <Field String val$method>
					//   15   31:aload_1         
					//   16   32:new             #13  <Class GSAPI$10$1>
					//   17   35:dup             
					//   18   36:aload_0         
					//   19   37:aload_1         
					//   20   38:invokespecial   #61  <Method void GSAPI$10$1(GSAPI$10, GSObject)>
					//   21   41:invokevirtual   #65  <Method void GSAPI.requestPermissionsIfNeeded(String, GSObject, GSPermissionResultHandler)>
					//   22   44:return          
					}

					final GSAPI this$0;
					final Object val$context;
					final boolean val$forceHttpGet;
					final GSResponseListener val$listener;
					final String val$method;
					final GSObject val$params;
					final int val$timeoutMS;
					final GSLogger val$trace;
					final boolean val$useHTTPS;

			
			{
				this$0 = GSAPI.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #34  <Field GSAPI this$0>
				params = gsobject;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #36  <Field GSObject val$params>
				method = s;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #38  <Field String val$method>
				useHTTPS = flag;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #40  <Field boolean val$useHTTPS>
				timeoutMS = i;
			//   12   21:aload_0         
			//   13   22:iload           5
			//   14   24:putfield        #42  <Field int val$timeoutMS>
				trace = gslogger;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #44  <Field GSLogger val$trace>
				forceHttpGet = flag1;
			//   18   33:aload_0         
			//   19   34:iload           7
			//   20   36:putfield        #46  <Field boolean val$forceHttpGet>
				listener = gsresponselistener;
			//   21   39:aload_0         
			//   22   40:aload           8
			//   23   42:putfield        #48  <Field GSResponseListener val$listener>
				context = obj;
			//   24   45:aload_0         
			//   25   46:aload           9
			//   26   48:putfield        #50  <Field Object val$context>
				super();
			//   27   51:aload_0         
			//   28   52:invokespecial   #53  <Method void Object()>
			//   29   55:return          
			}
				}
));
	//   44   97:new             #8   <Class GSAPI$10>
	//   45  100:dup             
	//   46  101:aload_0         
	//   47  102:aload_2         
	//   48  103:aload_1         
	//   49  104:iload_3         
	//   50  105:iload           4
	//   51  107:aload           7
	//   52  109:iload           8
	//   53  111:aload           5
	//   54  113:aload           6
	//   55  115:invokespecial   #959 <Method void GSAPI$10(GSAPI, GSObject, String, boolean, int, GSLogger, boolean, GSResponseListener, Object)>
	//   56  118:astore_2        
				if(!method.toLowerCase().equals("getsdkconfig"))
	//*  57  119:aload_1         
	//*  58  120:invokevirtual   #792 <Method String String.toLowerCase()>
	//*  59  123:ldc2            #956 <String "getsdkconfig">
	//*  60  126:invokevirtual   #277 <Method boolean String.equals(Object)>
	//*  61  129:ifne            141
				{
					requestsQueue.enqueue(((Runnable) (params)));
	//   62  132:aload_0         
	//   63  133:getfield        #143 <Field SimpleRunnableQueue requestsQueue>
	//   64  136:aload_2         
	//   65  137:invokevirtual   #443 <Method void SimpleRunnableQueue.enqueue(Runnable)>
					return;
	//   66  140:return          
				} else
				{
					((Runnable) (params)).run();
	//   67  141:aload_2         
	//   68  142:invokeinterface #962 <Method void Runnable.run()>
					return;
	//   69  147:return          
				}
			}
			params = ((GSObject) (new GSResponse(method, params, 0x61a82, ((GSLogger) (null)))));
	//   70  148:new             #350 <Class GSResponse>
	//   71  151:dup             
	//   72  152:aload_1         
	//   73  153:aload_2         
	//   74  154:ldc2            #776 <Int 0x61a82>
	//   75  157:aconst_null     
	//   76  158:invokespecial   #418 <Method void GSResponse(String, GSObject, int, GSLogger)>
	//   77  161:astore_2        
		}
		notifyResponse(listener, method, ((GSResponse) (params)), context);
	//*  78  162:goto            32
	}

	public void sendRequest(String s, GSObject gsobject, boolean flag, GSResponseListener gsresponselistener, Object obj)
	{
		sendRequest(s, gsobject, flag, OPTION_REQUEST_TIMEOUT_MS, gsresponselistener, obj, ((GSLogger) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:getstatic       #946 <Field int OPTION_REQUEST_TIMEOUT_MS>
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:aconst_null     
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #701 <Method void sendRequest(String, GSObject, boolean, int, GSResponseListener, Object, GSLogger, boolean)>
	//   10   16:return          
	}

	public void sendRequest(String s, GSObject gsobject, boolean flag, GSResponseListener gsresponselistener, Object obj, int i)
	{
		sendRequest(s, gsobject, flag, i, gsresponselistener, obj, ((GSLogger) (null)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iload           6
	//    5    6:aload           4
	//    6    8:aload           5
	//    7   10:aconst_null     
	//    8   11:iconst_0        
	//    9   12:invokevirtual   #701 <Method void sendRequest(String, GSObject, boolean, int, GSResponseListener, Object, GSLogger, boolean)>
	//   10   15:return          
	}

	public void setAccountsEventListener(GSAccountsEventListener gsaccountseventlistener)
	{
		removeAccountsListener(accountsEventListener);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #488 <Field GSAccountsEventListener accountsEventListener>
	//    3    5:invokevirtual   #966 <Method void removeAccountsListener(GSAccountsEventListener)>
		if(gsaccountseventlistener != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          22
		{
			addAccountsListener(gsaccountseventlistener);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #968 <Method void addAccountsListener(GSAccountsEventListener)>
			accountsEventListener = gsaccountseventlistener;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #488 <Field GSAccountsEventListener accountsEventListener>
		}
	//   12   22:return          
	}

	public void setEventListener(GSEventListener gseventlistener)
	{
		eventListener = gseventlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #654 <Field GSEventListener eventListener>
	//    3    5:return          
	}

	protected void setLastLoginProvider(String s)
	{
		mSessionManager.setSessionLastLoginProvider(s);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field SessionManager mSessionManager>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #974 <Method void SessionManager.setSessionLastLoginProvider(String)>
	//    4    8:return          
	}

	public void setLoginBehavior(LoginBehavior loginbehavior)
	{
		loginBehavior = loginbehavior;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #127 <Field GSAPI$LoginBehavior loginBehavior>
		loginProviderFactory.updateWebProvider();
	//    3    5:aload_0         
	//    4    6:getfield        #220 <Field LoginProviderFactory loginProviderFactory>
	//    5    9:invokevirtual   #979 <Method void LoginProviderFactory.updateWebProvider()>
	//    6   12:return          
	}

	public void setSession(GSSession gssession)
	{
		GigyaLog.i(TAG, "setSession with no params");
	//    0    0:getstatic       #157 <Field String TAG>
	//    1    3:ldc2            #983 <String "setSession with no params">
	//    2    6:invokestatic    #450 <Method void GigyaLog.i(String, String)>
		setSession(gssession, ((String) (null)), ((GSResponseListener) (null)), ((Object) (null)));
	//    3    9:aload_0         
	//    4   10:aload_1         
	//    5   11:aconst_null     
	//    6   12:aconst_null     
	//    7   13:aconst_null     
	//    8   14:invokevirtual   #986 <Method void setSession(GSSession, String, GSResponseListener, Object)>
	//    9   17:return          
	}

	public void setSession(GSSession gssession, final String loginProvider, final GSResponseListener userInfoListener, Object obj)
	{
		GigyaLog.i(TAG, "setSession with params");
	//    0    0:getstatic       #157 <Field String TAG>
	//    1    3:ldc2            #988 <String "setSession with params">
	//    2    6:invokestatic    #450 <Method void GigyaLog.i(String, String)>
		GSSession gssession1 = mSessionManager.getSession();
	//    3    9:aload_0         
	//    4   10:getfield        #153 <Field SessionManager mSessionManager>
	//    5   13:invokevirtual   #543 <Method GSSession SessionManager.getSession()>
	//    6   16:astore          6
		final boolean sessionChanged;
		if(gssession1 != null && gssession != null && gssession1.isValid() && gssession1.getToken().equals(((Object) (gssession.getToken()))))
	//*   7   18:aload           6
	//*   8   20:ifnull          59
	//*   9   23:aload_1         
	//*  10   24:ifnull          59
	//*  11   27:aload           6
	//*  12   29:invokevirtual   #993 <Method boolean GSSession.isValid()>
	//*  13   32:ifeq            59
	//*  14   35:aload           6
	//*  15   37:invokevirtual   #996 <Method String GSSession.getToken()>
	//*  16   40:aload_1         
	//*  17   41:invokevirtual   #996 <Method String GSSession.getToken()>
	//*  18   44:invokevirtual   #277 <Method boolean String.equals(Object)>
	//*  19   47:ifne            53
	//*  20   50:goto            59
			sessionChanged = false;
	//   21   53:iconst_0        
	//   22   54:istore          5
		else
	//*  23   56:goto            62
			sessionChanged = true;
	//   24   59:iconst_1        
	//   25   60:istore          5
		mSessionManager.saveSession(gssession, true);
	//   26   62:aload_0         
	//   27   63:getfield        #153 <Field SessionManager mSessionManager>
	//   28   66:aload_1         
	//   29   67:iconst_1        
	//   30   68:invokevirtual   #1000 <Method void SessionManager.saveSession(GSSession, boolean)>
		startSessionVerification();
	//   31   71:aload_0         
	//   32   72:invokespecial   #162 <Method void startSessionVerification()>
		if(userInfoListener != null || eventListener != null || !socializeEventListenersArray.isEmpty())
	//*  33   75:aload_3         
	//*  34   76:ifnonnull       96
	//*  35   79:aload_0         
	//*  36   80:getfield        #654 <Field GSEventListener eventListener>
	//*  37   83:ifnonnull       96
	//*  38   86:aload_0         
	//*  39   87:getfield        #136 <Field ArrayList socializeEventListenersArray>
	//*  40   90:invokevirtual   #1003 <Method boolean ArrayList.isEmpty()>
	//*  41   93:ifne            151
		{
			gssession = ((GSSession) (new GSObject()));
	//   42   96:new             #234 <Class GSObject>
	//   43   99:dup             
	//   44  100:invokespecial   #353 <Method void GSObject()>
	//   45  103:astore_1        
			if(__DEBUG_OPTION_ENABLE_TEST_NETWORKS)
	//*  46  104:getstatic       #1005 <Field boolean __DEBUG_OPTION_ENABLE_TEST_NETWORKS>
	//*  47  107:ifeq            120
				((GSObject) (gssession)).put("enabledProviders", "*,testnetwork3,testnetwork4");
	//   48  110:aload_1         
	//   49  111:ldc2            #693 <String "enabledProviders">
	//   50  114:ldc2            #1007 <String "*,testnetwork3,testnetwork4">
	//   51  117:invokevirtual   #260 <Method void GSObject.put(String, String)>
			GigyaLog.i(TAG, "Sending getUserInfo request after setSession");
	//   52  120:getstatic       #157 <Field String TAG>
	//   53  123:ldc2            #1009 <String "Sending getUserInfo request after setSession">
	//   54  126:invokestatic    #450 <Method void GigyaLog.i(String, String)>
			sendRequest("socialize.getUserInfo", ((GSObject) (gssession)), new GSResponseListener() {

				public void onGSResponse(String s, GSResponse gsresponse, Object obj1)
				{
					if(userInfoListener != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #25  <Field GSResponseListener val$userInfoListener>
				//*   2    4:ifnull          19
						userInfoListener.onGSResponse(s, gsresponse, obj1);
				//    3    7:aload_0         
				//    4    8:getfield        #25  <Field GSResponseListener val$userInfoListener>
				//    5   11:aload_1         
				//    6   12:aload_2         
				//    7   13:aload_3         
				//    8   14:invokeinterface #37  <Method void GSResponseListener.onGSResponse(String, GSResponse, Object)>
					if(gsresponse.getErrorCode() == 0 && sessionChanged)
				//*   9   19:aload_2         
				//*  10   20:invokevirtual   #43  <Method int GSResponse.getErrorCode()>
				//*  11   23:ifne            64
				//*  12   26:aload_0         
				//*  13   27:getfield        #27  <Field boolean val$sessionChanged>
				//*  14   30:ifeq            64
						invokeSocializeListeners("login", new Object[] {
							loginProvider, gsresponse.getData(), obj1
						});
				//   15   33:aload_0         
				//   16   34:getfield        #23  <Field GSAPI this$0>
				//   17   37:ldc1            #45  <String "login">
				//   18   39:iconst_3        
				//   19   40:anewarray       Object[]
				//   20   43:dup             
				//   21   44:iconst_0        
				//   22   45:aload_0         
				//   23   46:getfield        #29  <Field String val$loginProvider>
				//   24   49:aastore         
				//   25   50:dup             
				//   26   51:iconst_1        
				//   27   52:aload_2         
				//   28   53:invokevirtual   #49  <Method GSObject GSResponse.getData()>
				//   29   56:aastore         
				//   30   57:dup             
				//   31   58:iconst_2        
				//   32   59:aload_3         
				//   33   60:aastore         
				//   34   61:invokevirtual   #53  <Method void GSAPI.invokeSocializeListeners(String, Object[])>
				//   35   64:return          
				}

				final GSAPI this$0;
				final String val$loginProvider;
				final boolean val$sessionChanged;
				final GSResponseListener val$userInfoListener;

			
			{
				this$0 = GSAPI.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field GSAPI this$0>
				userInfoListener = gsresponselistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field GSResponseListener val$userInfoListener>
				sessionChanged = flag;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #27  <Field boolean val$sessionChanged>
				loginProvider = s;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field String val$loginProvider>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
, obj);
	//   55  129:aload_0         
	//   56  130:ldc2            #1011 <String "socialize.getUserInfo">
	//   57  133:aload_1         
	//   58  134:new             #6   <Class GSAPI$1>
	//   59  137:dup             
	//   60  138:aload_0         
	//   61  139:aload_3         
	//   62  140:iload           5
	//   63  142:aload_2         
	//   64  143:invokespecial   #1014 <Method void GSAPI$1(GSAPI, GSResponseListener, boolean, String)>
	//   65  146:aload           4
	//   66  148:invokevirtual   #741 <Method void sendRequest(String, GSObject, GSResponseListener, Object)>
		}
		if(!accountsEventListenersArray.isEmpty())
	//*  67  151:aload_0         
	//*  68  152:getfield        #138 <Field ArrayList accountsEventListenersArray>
	//*  69  155:invokevirtual   #1003 <Method boolean ArrayList.isEmpty()>
	//*  70  158:ifne            205
		{
			gssession = ((GSSession) (new GSObject()));
	//   71  161:new             #234 <Class GSObject>
	//   72  164:dup             
	//   73  165:invokespecial   #353 <Method void GSObject()>
	//   74  168:astore_1        
			if(__DEBUG_OPTION_ENABLE_TEST_NETWORKS)
	//*  75  169:getstatic       #1005 <Field boolean __DEBUG_OPTION_ENABLE_TEST_NETWORKS>
	//*  76  172:ifeq            185
				((GSObject) (gssession)).put("enabledProviders", "*,testnetwork3,testnetwork4");
	//   77  175:aload_1         
	//   78  176:ldc2            #693 <String "enabledProviders">
	//   79  179:ldc2            #1007 <String "*,testnetwork3,testnetwork4">
	//   80  182:invokevirtual   #260 <Method void GSObject.put(String, String)>
			sendRequest("accounts.getAccountInfo", ((GSObject) (gssession)), new GSResponseListener() {

				public void onGSResponse(String s, GSResponse gsresponse, Object obj1)
				{
					if(gsresponse.getErrorCode() == 0 && sessionChanged)
				//*   0    0:aload_2         
				//*   1    1:invokevirtual   #33  <Method int GSResponse.getErrorCode()>
				//*   2    4:ifne            38
				//*   3    7:aload_0         
				//*   4    8:getfield        #21  <Field boolean val$sessionChanged>
				//*   5   11:ifeq            38
						invokeAccountsListeners("login", new Object[] {
							gsresponse.getData(), obj1
						});
				//    6   14:aload_0         
				//    7   15:getfield        #19  <Field GSAPI this$0>
				//    8   18:ldc1            #35  <String "login">
				//    9   20:iconst_2        
				//   10   21:anewarray       Object[]
				//   11   24:dup             
				//   12   25:iconst_0        
				//   13   26:aload_2         
				//   14   27:invokevirtual   #39  <Method GSObject GSResponse.getData()>
				//   15   30:aastore         
				//   16   31:dup             
				//   17   32:iconst_1        
				//   18   33:aload_3         
				//   19   34:aastore         
				//   20   35:invokevirtual   #43  <Method void GSAPI.invokeAccountsListeners(String, Object[])>
				//   21   38:return          
				}

				final GSAPI this$0;
				final boolean val$sessionChanged;

			
			{
				this$0 = GSAPI.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GSAPI this$0>
				sessionChanged = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean val$sessionChanged>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
, obj);
	//   81  185:aload_0         
	//   82  186:ldc2            #1016 <String "accounts.getAccountInfo">
	//   83  189:aload_1         
	//   84  190:new             #26  <Class GSAPI$2>
	//   85  193:dup             
	//   86  194:aload_0         
	//   87  195:iload           5
	//   88  197:invokespecial   #1019 <Method void GSAPI$2(GSAPI, boolean)>
	//   89  200:aload           4
	//   90  202:invokevirtual   #741 <Method void sendRequest(String, GSObject, GSResponseListener, Object)>
		}
	//   91  205:return          
	}

	public void setSocializeEventListener(GSSocializeEventListener gssocializeeventlistener)
	{
		removeSocializeListener(socializeEventListener);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #547 <Field GSSocializeEventListener socializeEventListener>
	//    3    5:invokevirtual   #1022 <Method void removeSocializeListener(GSSocializeEventListener)>
		if(gssocializeeventlistener != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          22
		{
			addSocializeListener(gssocializeeventlistener);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #1024 <Method void addSocializeListener(GSSocializeEventListener)>
			socializeEventListener = gssocializeeventlistener;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #547 <Field GSSocializeEventListener socializeEventListener>
		}
	//   12   22:return          
	}

	public void showAddConnectionsUI(GSObject gsobject, GSConnectUIListener gsconnectuilistener, Object obj)
	{
		if(!gotValidSession())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #425 <Method boolean gotValidSession()>
	//*   2    4:ifne            48
		{
			gsobject = ((GSObject) (new GSResponse("showAddConnectionsUI", new GSObject(), 0x62638, GSResponse.getErrorMessage(0x62638), ((GSLogger) (null)))));
	//    3    7:new             #350 <Class GSResponse>
	//    4   10:dup             
	//    5   11:ldc2            #1027 <String "showAddConnectionsUI">
	//    6   14:new             #234 <Class GSObject>
	//    7   17:dup             
	//    8   18:invokespecial   #353 <Method void GSObject()>
	//    9   21:ldc2            #426 <Int 0x62638>
	//   10   24:ldc2            #426 <Int 0x62638>
	//   11   27:invokestatic    #358 <Method String GSResponse.getErrorMessage(int)>
	//   12   30:aconst_null     
	//   13   31:invokespecial   #361 <Method void GSResponse(String, GSObject, int, String, GSLogger)>
	//   14   34:astore_1        
			if(gsconnectuilistener != null)
	//*  15   35:aload_2         
	//*  16   36:ifnull          47
				gsconnectuilistener.onError(((GSResponse) (gsobject)), obj);
	//   17   39:aload_2         
	//   18   40:aload_1         
	//   19   41:aload_3         
	//   20   42:invokeinterface #1030 <Method void GSConnectUIListener.onError(GSResponse, Object)>
			return;
	//   21   47:return          
		} else
		{
			showUI("showAddConnectionsUI", GSLoginRequest.LoginRequestType.addConnection, gsobject, ((GSUIListener) (gsconnectuilistener)), obj);
	//   22   48:aload_0         
	//   23   49:ldc2            #1027 <String "showAddConnectionsUI">
	//   24   52:getstatic       #433 <Field GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.addConnection>
	//   25   55:aload_1         
	//   26   56:aload_2         
	//   27   57:aload_3         
	//   28   58:invokespecial   #1032 <Method void showUI(String, GSLoginRequest$LoginRequestType, GSObject, GSUIListener, Object)>
			return;
	//   29   61:return          
		}
	}

	public void showLoginUI(GSObject gsobject, GSLoginUIListener gsloginuilistener, Object obj)
	{
		showUI("showLoginUI", GSLoginRequest.LoginRequestType.login, gsobject, ((GSUIListener) (gsloginuilistener)), obj);
	//    0    0:aload_0         
	//    1    1:ldc2            #352 <String "showLoginUI">
	//    2    4:getstatic       #713 <Field GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.login>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:invokespecial   #1032 <Method void showUI(String, GSLoginRequest$LoginRequestType, GSObject, GSUIListener, Object)>
	//    7   13:return          
	}

	public void showPluginDialog(String s, GSObject gsobject, GSPluginListener gspluginlistener, GSDialogListener gsdialoglistener)
	{
		(new PluginPresentor()).show(s, gsobject, gspluginlistener, gsdialoglistener);
	//    0    0:new             #1037 <Class PluginPresentor>
	//    1    3:dup             
	//    2    4:invokespecial   #1038 <Method void PluginPresentor()>
	//    3    7:aload_1         
	//    4    8:aload_2         
	//    5    9:aload_3         
	//    6   10:aload           4
	//    7   12:invokevirtual   #1040 <Method void PluginPresentor.show(String, GSObject, GSPluginListener, GSDialogListener)>
	//    8   15:return          
	}

	protected void showProgress(Boolean boolean1)
	{
		showProgress(boolean1.booleanValue(), ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1043 <Method boolean Boolean.booleanValue()>
	//    3    5:aconst_null     
	//    4    6:invokevirtual   #1046 <Method void showProgress(boolean, String)>
	//    5    9:return          
	}

	protected void showProgress(boolean flag, final String text)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            29
		{
			if(progressActivity == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #168 <Field FragmentActivity progressActivity>
	//*   4    8:ifnonnull       62
			{
				HostActivity.create(appContext, new com.gigya.socialize.android.ui.HostActivity.HostActivityHandler() {

					public void onActivityResult(FragmentActivity fragmentactivity, int i, int j, Intent intent)
					{
					//    0    0:return          
					}

					public void onCancel(FragmentActivity fragmentactivity)
					{
						progress.dismiss();
					//    0    0:aload_0         
					//    1    1:getfield        #21  <Field GSAPI this$0>
					//    2    4:invokestatic    #35  <Method ProgressDialog GSAPI.access$1200(GSAPI)>
					//    3    7:invokevirtual   #40  <Method void ProgressDialog.dismiss()>
						progressActivity = null;
					//    4   10:aload_0         
					//    5   11:getfield        #21  <Field GSAPI this$0>
					//    6   14:aconst_null     
					//    7   15:invokestatic    #44  <Method FragmentActivity GSAPI.access$1102(GSAPI, FragmentActivity)>
					//    8   18:pop             
					//    9   19:return          
					}

					public void onCreate(FragmentActivity fragmentactivity, Bundle bundle)
					{
						if(progressActivity != null)
					//*   0    0:aload_0         
					//*   1    1:getfield        #21  <Field GSAPI this$0>
					//*   2    4:invokestatic    #52  <Method FragmentActivity GSAPI.access$1100(GSAPI)>
					//*   3    7:ifnull          21
							showProgress(Boolean.valueOf(false));
					//    4   10:aload_0         
					//    5   11:getfield        #21  <Field GSAPI this$0>
					//    6   14:iconst_0        
					//    7   15:invokestatic    #58  <Method Boolean Boolean.valueOf(boolean)>
					//    8   18:invokevirtual   #61  <Method void GSAPI.showProgress(Boolean)>
						progressActivity = fragmentactivity;
					//    9   21:aload_0         
					//   10   22:getfield        #21  <Field GSAPI this$0>
					//   11   25:aload_1         
					//   12   26:invokestatic    #44  <Method FragmentActivity GSAPI.access$1102(GSAPI, FragmentActivity)>
					//   13   29:pop             
						FragmentActivity fragmentactivity1;
						bundle = ((Bundle) (GSAPI.this));
					//   14   30:aload_0         
					//   15   31:getfield        #21  <Field GSAPI this$0>
					//   16   34:astore_2        
						fragmentactivity1 = progressActivity;
					//   17   35:aload_0         
					//   18   36:getfield        #21  <Field GSAPI this$0>
					//   19   39:invokestatic    #52  <Method FragmentActivity GSAPI.access$1100(GSAPI)>
					//   20   42:astore_3        
						if(text == null || text.equals("")) goto _L2; else goto _L1
					//   21   43:aload_0         
					//   22   44:getfield        #23  <Field String val$text>
					//   23   47:ifnull          104
					//   24   50:aload_0         
					//   25   51:getfield        #23  <Field String val$text>
					//   26   54:ldc1            #63  <String "">
					//   27   56:invokevirtual   #69  <Method boolean String.equals(Object)>
					//   28   59:ifne            104
_L1:
						fragmentactivity = ((FragmentActivity) (text));
					//   29   62:aload_0         
					//   30   63:getfield        #23  <Field String val$text>
					//   31   66:astore_1        
					//*  32   67:goto            70
_L4:
						try
						{
							bundle.progress = ProgressDialog.show(((Context) (fragmentactivity1)), "", ((CharSequence) (fragmentactivity)), true);
					//   33   70:aload_2         
					//   34   71:aload_3         
					//   35   72:ldc1            #63  <String "">
					//   36   74:aload_1         
					//   37   75:iconst_1        
					//   38   76:invokestatic    #73  <Method ProgressDialog ProgressDialog.show(Context, CharSequence, CharSequence, boolean)>
					//   39   79:invokestatic    #77  <Method ProgressDialog GSAPI.access$1202(GSAPI, ProgressDialog)>
					//   40   82:pop             
							progress.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() {

								public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
								{
									if(i == 4 && keyevent.getRepeatCount() == 0)
								//*   0    0:iload_2         
								//*   1    1:iconst_4        
								//*   2    2:icmpne          66
								//*   3    5:aload_3         
								//*   4    6:invokevirtual   #29  <Method int KeyEvent.getRepeatCount()>
								//*   5    9:ifne            66
									{
										if(progress != null)
								//*   6   12:aload_0         
								//*   7   13:getfield        #17  <Field GSAPI$16 this$1>
								//*   8   16:getfield        #33  <Field GSAPI GSAPI$16.this$0>
								//*   9   19:invokestatic    #39  <Method ProgressDialog GSAPI.access$1200(GSAPI)>
								//*  10   22:ifnull          38
											progress.dismiss();
								//   11   25:aload_0         
								//   12   26:getfield        #17  <Field GSAPI$16 this$1>
								//   13   29:getfield        #33  <Field GSAPI GSAPI$16.this$0>
								//   14   32:invokestatic    #39  <Method ProgressDialog GSAPI.access$1200(GSAPI)>
								//   15   35:invokevirtual   #44  <Method void ProgressDialog.dismiss()>
										if(progressActivity != null)
								//*  16   38:aload_0         
								//*  17   39:getfield        #17  <Field GSAPI$16 this$1>
								//*  18   42:getfield        #33  <Field GSAPI GSAPI$16.this$0>
								//*  19   45:invokestatic    #48  <Method FragmentActivity GSAPI.access$1100(GSAPI)>
								//*  20   48:ifnull          64
											progressActivity.finish();
								//   21   51:aload_0         
								//   22   52:getfield        #17  <Field GSAPI$16 this$1>
								//   23   55:getfield        #33  <Field GSAPI GSAPI$16.this$0>
								//   24   58:invokestatic    #48  <Method FragmentActivity GSAPI.access$1100(GSAPI)>
								//   25   61:invokevirtual   #53  <Method void FragmentActivity.finish()>
										return true;
								//   26   64:iconst_1        
								//   27   65:ireturn         
									} else
									{
										return false;
								//   28   66:iconst_0        
								//   29   67:ireturn         
									}
								}

								final _cls16 this$1;

			
			{
				this$1 = _cls16.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GSAPI$16 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
							}
);
					//   41   83:aload_0         
					//   42   84:getfield        #21  <Field GSAPI this$0>
					//   43   87:invokestatic    #35  <Method ProgressDialog GSAPI.access$1200(GSAPI)>
					//   44   90:new             #13  <Class GSAPI$16$1>
					//   45   93:dup             
					//   46   94:aload_0         
					//   47   95:invokespecial   #80  <Method void GSAPI$16$1(GSAPI$16)>
					//   48   98:invokevirtual   #84  <Method void ProgressDialog.setOnKeyListener(android.content.DialogInterface$OnKeyListener)>
							return;
					//   49  101:return          
						}
						// Misplaced declaration of an exception variable
						catch(FragmentActivity fragmentactivity)
					//*  50  102:astore_1        
						{
							return;
					//   51  103:return          
						}
_L2:
						fragmentactivity = "Please wait...";
					//   52  104:ldc1            #86  <String "Please wait...">
					//   53  106:astore_1        
						if(true) goto _L4; else goto _L3
					//   54  107:goto            70
_L3:
					}

					public void onResume(FragmentActivity fragmentactivity)
					{
					//    0    0:return          
					}

					public void onStart(FragmentActivity fragmentactivity)
					{
					//    0    0:return          
					}

					final GSAPI this$0;
					final String val$text;

			
			{
				this$0 = GSAPI.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field GSAPI this$0>
				text = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String val$text>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
				}
);
	//    5   11:aload_0         
	//    6   12:getfield        #494 <Field Context appContext>
	//    7   15:new             #22  <Class GSAPI$16>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:aload_2         
	//   11   21:invokespecial   #1048 <Method void GSAPI$16(GSAPI, String)>
	//   12   24:invokestatic    #1054 <Method Integer HostActivity.create(Context, com.gigya.socialize.android.ui.HostActivity$HostActivityHandler)>
	//   13   27:pop             
				return;
	//   14   28:return          
			}
		} else
		{
			if(progress != null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #174 <Field ProgressDialog progress>
	//*  17   33:ifnull          43
				progress.dismiss();
	//   18   36:aload_0         
	//   19   37:getfield        #174 <Field ProgressDialog progress>
	//   20   40:invokevirtual   #1059 <Method void ProgressDialog.dismiss()>
			if(progressActivity != null)
	//*  21   43:aload_0         
	//*  22   44:getfield        #168 <Field FragmentActivity progressActivity>
	//*  23   47:ifnull          57
				progressActivity.finish();
	//   24   50:aload_0         
	//   25   51:getfield        #168 <Field FragmentActivity progressActivity>
	//   26   54:invokevirtual   #1064 <Method void FragmentActivity.finish()>
			progressActivity = null;
	//   27   57:aload_0         
	//   28   58:aconst_null     
	//   29   59:putfield        #168 <Field FragmentActivity progressActivity>
		}
	//   30   62:return          
	}

	private static final String DEFAULT_API_DOMAIN = "us1.gigya.com";
	private static final String META_SESSION_VERIFICATION = "com.gigya.android.verifySessionInterval";
	public static boolean OPTION_CHECK_CONNECTIVITY = true;
	public static boolean OPTION_HTTPS_ENABLED = true;
	public static boolean OPTION_OBFUSCATION_ENABLED = false;
	public static int OPTION_REQUEST_TIMEOUT_MS = 20000;
	public static boolean OPTION_SHOW_PROGRESS_ON_REQUEST = false;
	public static boolean OPTION_TRACE = false;
	private static final String SETTINGS_SDK_VERSION = "sdk_version";
	private static String TAG = "GSAPI";
	public static final String VERSION = "android_3.3.26";
	public static boolean __DEBUG_OPTION_ENABLE_TEST_NETWORKS = false;
	private static volatile GSAPI instance;
	private boolean _isInitialized;
	private GSAccountsEventListener accountsEventListener;
	private ArrayList accountsEventListenersArray;
	private Map androidPermissionListeners;
	private int androidPermissionsRequestCode;
	private String apiDomain;
	private String apiKey;
	private Context appContext;
	private GSObject config;
	private GSEventListener eventListener;
	public GigyaFingerprintManager fingerprint;
	private LoginBehavior loginBehavior;
	protected LoginProviderFactory loginProviderFactory;
	private String mResumedActivityName;
	private SessionManager mSessionManager;
	private GSSessionVerification mSessionVerification;
	private GSEncryptedPrefs preferences;
	private ProgressDialog progress;
	private FragmentActivity progressActivity;
	private SimpleRunnableQueue requestsQueue;
	private GSSocializeEventListener socializeEventListener;
	private ArrayList socializeEventListenersArray;

	static 
	{
	//    0    0:return          
	}


/*
	static String access$000()
	{
		return TAG;
	//    0    0:getstatic       #157 <Field String TAG>
	//    1    3:areturn         
	}

*/


/*
	static void access$100(GSAPI gsapi)
	{
		gsapi.startSessionVerification();
	//    0    0:aload_0         
	//    1    1:invokespecial   #162 <Method void startSessionVerification()>
		return;
	//    2    4:return          
	}

*/


/*
	static SimpleRunnableQueue access$1000(GSAPI gsapi)
	{
		return gsapi.requestsQueue;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field SimpleRunnableQueue requestsQueue>
	//    2    4:areturn         
	}

*/


/*
	static FragmentActivity access$1100(GSAPI gsapi)
	{
		return gsapi.progressActivity;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field FragmentActivity progressActivity>
	//    2    4:areturn         
	}

*/


/*
	static FragmentActivity access$1102(GSAPI gsapi, FragmentActivity fragmentactivity)
	{
		gsapi.progressActivity = fragmentactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #168 <Field FragmentActivity progressActivity>
		return fragmentactivity;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static ProgressDialog access$1200(GSAPI gsapi)
	{
		return gsapi.progress;
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field ProgressDialog progress>
	//    2    4:areturn         
	}

*/


/*
	static ProgressDialog access$1202(GSAPI gsapi, ProgressDialog progressdialog)
	{
		gsapi.progress = progressdialog;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #174 <Field ProgressDialog progress>
		return progressdialog;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static String access$202(GSAPI gsapi, String s)
	{
		gsapi.mResumedActivityName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #180 <Field String mResumedActivityName>
		return s;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static void access$300(GSAPI gsapi)
	{
		gsapi.cancelSessionVerification();
	//    0    0:aload_0         
	//    1    1:invokespecial   #184 <Method void cancelSessionVerification()>
		return;
	//    2    4:return          
	}

*/


/*
	static String access$400(GSAPI gsapi)
	{
		return gsapi.apiKey;
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field String apiKey>
	//    2    4:areturn         
	}

*/


/*
	static SessionManager access$500(GSAPI gsapi)
	{
		return gsapi.mSessionManager;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field SessionManager mSessionManager>
	//    2    4:areturn         
	}

*/


/*
	static String access$600(GSAPI gsapi)
	{
		return gsapi.apiDomain;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field String apiDomain>
	//    2    4:areturn         
	}

*/


/*
	static GSObject access$700(GSAPI gsapi)
	{
		return gsapi.config;
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field GSObject config>
	//    2    4:areturn         
	}

*/


/*
	static GSObject access$702(GSAPI gsapi, GSObject gsobject)
	{
		gsapi.config = gsobject;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #197 <Field GSObject config>
		return gsobject;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static void access$800(GSAPI gsapi, String s)
	{
		gsapi.setUCID(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #205 <Method void setUCID(String)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$900(GSAPI gsapi, String s)
	{
		gsapi.setGMID(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #209 <Method void setGMID(String)>
		return;
	//    3    5:return          
	}

*/
}
