// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v4.app.*;
import android.util.DisplayMetrics;
import android.view.*;
import android.webkit.*;
import android.widget.*;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.GSResponse;
import com.gigya.socialize.android.event.GSAndroidPermissionListener;
import com.gigya.socialize.android.event.GSDialogListener;
import com.gigya.socialize.android.event.GSPluginListener;
import com.gigya.socialize.android.event.GSWebBridgeListener;
import com.gigya.socialize.android.log.GigyaLog;
import com.gigya.socialize.android.login.LoginProviderFactory;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI, GSWebBridge

public class GSPluginFragment extends DialogFragment
{

	public GSPluginFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void DialogFragment()>
		startedLoadingPlugin = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #68  <Field boolean startedLoadingPlugin>
		showLoadingProgress = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #70  <Field boolean showLoadingProgress>
		showLoginProgress = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #72  <Field boolean showLoginProgress>
		webViewWrapContent = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #74  <Field boolean webViewWrapContent>
		jsLoadingTimeout = 10000;
	//   14   24:aload_0         
	//   15   25:sipush          10000
	//   16   28:putfield        #76  <Field int jsLoadingTimeout>
		mCapturedImageURI = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #78  <Field Uri mCapturedImageURI>
	//   20   36:return          
	}

	public GSPluginFragment(Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #66  <Method void DialogFragment()>
		startedLoadingPlugin = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #68  <Field boolean startedLoadingPlugin>
		showLoadingProgress = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #70  <Field boolean showLoadingProgress>
		showLoginProgress = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #72  <Field boolean showLoginProgress>
		webViewWrapContent = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #74  <Field boolean webViewWrapContent>
		jsLoadingTimeout = 10000;
	//   14   24:aload_0         
	//   15   25:sipush          10000
	//   16   28:putfield        #76  <Field int jsLoadingTimeout>
		mCapturedImageURI = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #78  <Field Uri mCapturedImageURI>
		setArguments(bundle);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:invokevirtual   #83  <Method void setArguments(Bundle)>
	//   23   41:return          
	}

	private String buildPluginHTML()
	{
		prepareParams();
	//    0    0:aload_0         
	//    1    1:invokespecial   #141 <Method void prepareParams()>
		String s = "";
	//    2    4:ldc1            #143 <String "">
	//    3    6:astore_1        
		if(GSAPI.__DEBUG_OPTION_ENABLE_TEST_NETWORKS)
	//*   4    7:getstatic       #148 <Field boolean GSAPI.__DEBUG_OPTION_ENABLE_TEST_NETWORKS>
	//*   5   10:ifeq            16
			s = "gigya._.providers.arProviders.push(new gigya._.providers.Provider(6016, 'testnetwork3', 650, 400, 'login,friends,actions,status,photos,places,checkins', true));gigya._.providers.arProviders.push(new gigya._.providers.Provider(6017, 'testnetwork4', 650, 400, 'login,friends,actions,status,photos,places,checkins', true));";
	//    6   13:ldc1            #150 <String "gigya._.providers.arProviders.push(new gigya._.providers.Provider(6016, 'testnetwork3', 650, 400, 'login,friends,actions,status,photos,places,checkins', true));gigya._.providers.arProviders.push(new gigya._.providers.Provider(6017, 'testnetwork4', 650, 400, 'login,friends,actions,status,photos,places,checkins', true));">
	//    7   15:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    8   16:new             #152 <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #153 <Method void StringBuilder()>
	//   11   23:astore_2        
		stringbuilder.append("<head><meta name='viewport' content='initial-scale=1,maximum-scale=1,user-scalable=no' /><script>function onJSException(ex) {document.location.href = '%s://%s?ex=' + encodeURIComponent(ex);}function onJSLoad() {if (gigya && gigya.isGigya)window.__wasSocializeLoaded = true;}setTimeout(function() {if (!window.__wasSocializeLoaded)document.location.href = '%s://%s';}, %s);</script><script src='https://cdns.");
	//   12   24:aload_2         
	//   13   25:ldc1            #155 <String "<head><meta name='viewport' content='initial-scale=1,maximum-scale=1,user-scalable=no' /><script>function onJSException(ex) {document.location.href = '%s://%s?ex=' + encodeURIComponent(ex);}function onJSLoad() {if (gigya && gigya.isGigya)window.__wasSocializeLoaded = true;}setTimeout(function() {if (!window.__wasSocializeLoaded)document.location.href = '%s://%s';}, %s);</script><script src='https://cdns.">
	//   14   27:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
		stringbuilder.append(GSAPI.getInstance().getAPIDomain());
	//   16   31:aload_2         
	//   17   32:invokestatic    #163 <Method GSAPI GSAPI.getInstance()>
	//   18   35:invokevirtual   #166 <Method String GSAPI.getAPIDomain()>
	//   19   38:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
		stringbuilder.append("/JS/gigya.js?apikey=%s' type='text/javascript' onLoad='onJSLoad();'>{deviceType: 'mobile'}</script></head><body><div id='%s'></div><script>%stry {gigya._.apiAdapters.mobile.showPlugin('%s', %s);} catch (ex) { onJSException(ex); }</script></body>");
	//   21   42:aload_2         
	//   22   43:ldc1            #168 <String "/JS/gigya.js?apikey=%s' type='text/javascript' onLoad='onJSLoad();'>{deviceType: 'mobile'}</script></head><body><div id='%s'></div><script>%stry {gigya._.apiAdapters.mobile.showPlugin('%s', %s);} catch (ex) { onJSException(ex); }</script></body>">
	//   23   45:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
		return String.format(stringbuilder.toString(), new Object[] {
			"gsapi", "on_js_exception", "gsapi", "on_js_load_error", Integer.valueOf(jsLoadingTimeout), GSAPI.getInstance().getAPIKey(), "pluginContainer", s, plugin, params
		});
	//   25   49:aload_2         
	//   26   50:invokevirtual   #171 <Method String StringBuilder.toString()>
	//   27   53:bipush          10
	//   28   55:anewarray       Object[]
	//   29   58:dup             
	//   30   59:iconst_0        
	//   31   60:ldc1            #175 <String "gsapi">
	//   32   62:aastore         
	//   33   63:dup             
	//   34   64:iconst_1        
	//   35   65:ldc1            #25  <String "on_js_exception">
	//   36   67:aastore         
	//   37   68:dup             
	//   38   69:iconst_2        
	//   39   70:ldc1            #175 <String "gsapi">
	//   40   72:aastore         
	//   41   73:dup             
	//   42   74:iconst_3        
	//   43   75:ldc1            #28  <String "on_js_load_error">
	//   44   77:aastore         
	//   45   78:dup             
	//   46   79:iconst_4        
	//   47   80:aload_0         
	//   48   81:getfield        #76  <Field int jsLoadingTimeout>
	//   49   84:invokestatic    #181 <Method Integer Integer.valueOf(int)>
	//   50   87:aastore         
	//   51   88:dup             
	//   52   89:iconst_5        
	//   53   90:invokestatic    #163 <Method GSAPI GSAPI.getInstance()>
	//   54   93:invokevirtual   #184 <Method String GSAPI.getAPIKey()>
	//   55   96:aastore         
	//   56   97:dup             
	//   57   98:bipush          6
	//   58  100:ldc1            #18  <String "pluginContainer">
	//   59  102:aastore         
	//   60  103:dup             
	//   61  104:bipush          7
	//   62  106:aload_1         
	//   63  107:aastore         
	//   64  108:dup             
	//   65  109:bipush          8
	//   66  111:aload_0         
	//   67  112:getfield        #111 <Field String plugin>
	//   68  115:aastore         
	//   69  116:dup             
	//   70  117:bipush          9
	//   71  119:aload_0         
	//   72  120:getfield        #186 <Field GSObject params>
	//   73  123:aastore         
	//   74  124:invokestatic    #192 <Method String String.format(String, Object[])>
	//   75  127:areturn         
	}

	private File createImageFile()
	{
		String s = (new SimpleDateFormat("yyyyMMdd_HHmmss")).format(new Date());
	//    0    0:new             #196 <Class SimpleDateFormat>
	//    1    3:dup             
	//    2    4:ldc1            #198 <String "yyyyMMdd_HHmmss">
	//    3    6:invokespecial   #201 <Method void SimpleDateFormat(String)>
	//    4    9:new             #203 <Class Date>
	//    5   12:dup             
	//    6   13:invokespecial   #204 <Method void Date()>
	//    7   16:invokevirtual   #207 <Method String SimpleDateFormat.format(Date)>
	//    8   19:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    9   20:new             #152 <Class StringBuilder>
	//   10   23:dup             
	//   11   24:invokespecial   #153 <Method void StringBuilder()>
	//   12   27:astore_2        
		stringbuilder.append("JPEG_");
	//   13   28:aload_2         
	//   14   29:ldc1            #209 <String "JPEG_">
	//   15   31:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
		stringbuilder.append(s);
	//   17   35:aload_2         
	//   18   36:aload_1         
	//   19   37:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
		stringbuilder.append("_");
	//   21   41:aload_2         
	//   22   42:ldc1            #211 <String "_">
	//   23   44:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
		return File.createTempFile(stringbuilder.toString(), ".jpg", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
	//   25   48:aload_2         
	//   26   49:invokevirtual   #171 <Method String StringBuilder.toString()>
	//   27   52:ldc1            #213 <String ".jpg">
	//   28   54:getstatic       #218 <Field String Environment.DIRECTORY_PICTURES>
	//   29   57:invokestatic    #222 <Method File Environment.getExternalStoragePublicDirectory(String)>
	//   30   60:invokestatic    #228 <Method File File.createTempFile(String, String, File)>
	//   31   63:areturn         
	}

	private Display getDisplay()
	{
		FragmentActivity fragmentactivity = getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #234 <Method FragmentActivity getActivity()>
	//    2    4:astore_1        
		if(fragmentactivity == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return ((WindowManager)((Activity) (fragmentactivity)).getSystemService("window")).getDefaultDisplay();
	//    7   11:aload_1         
	//    8   12:ldc1            #236 <String "window">
	//    9   14:invokevirtual   #242 <Method Object Activity.getSystemService(String)>
	//   10   17:checkcast       #244 <Class WindowManager>
	//   11   20:invokeinterface #247 <Method Display WindowManager.getDefaultDisplay()>
	//   12   25:areturn         
	}

	private void loadFromBundle(Bundle bundle)
	{
		if(bundle != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          52
		{
			webView.restoreState(bundle);
	//    2    4:aload_0         
	//    3    5:getfield        #107 <Field WebView webView>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #256 <Method android.webkit.WebBackForwardList WebView.restoreState(Bundle)>
	//    6   12:pop             
			plugin = bundle.getString("pluginName");
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:ldc1            #34  <String "pluginName">
	//   10   17:invokevirtual   #262 <Method String Bundle.getString(String)>
	//   11   20:putfield        #111 <Field String plugin>
			try
			{
				params = new GSObject(bundle.getString("pluginParams"));
	//   12   23:aload_0         
	//   13   24:new             #264 <Class GSObject>
	//   14   27:dup             
	//   15   28:aload_1         
	//   16   29:ldc1            #31  <String "pluginParams">
	//   17   31:invokevirtual   #262 <Method String Bundle.getString(String)>
	//   18   34:invokespecial   #265 <Method void GSObject(String)>
	//   19   37:putfield        #186 <Field GSObject params>
				return;
	//   20   40:return          
			}
	//*  21   41:aload_0         
	//*  22   42:new             #264 <Class GSObject>
	//*  23   45:dup             
	//*  24   46:invokespecial   #266 <Method void GSObject()>
	//*  25   49:putfield        #186 <Field GSObject params>
	//*  26   52:return          
			// Misplaced declaration of an exception variable
			catch(Bundle bundle)
			{
				params = new GSObject();
			}
		}
	//*  27   53:astore_1        
	//*  28   54:goto            41
	}

	public static GSPluginFragment newInstance(String s, GSObject gsobject)
	{
		return newInstance(s, gsobject, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #271 <Method GSPluginFragment newInstance(String, GSObject, boolean)>
	//    4    6:areturn         
	}

	public static GSPluginFragment newInstance(String s, GSObject gsobject, boolean flag)
	{
		GSPluginFragment gspluginfragment = new GSPluginFragment();
	//    0    0:new             #2   <Class GSPluginFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #272 <Method void GSPluginFragment()>
	//    3    7:astore          5
		Object obj = ((Object) (gspluginfragment.getArguments()));
	//    4    9:aload           5
	//    5   11:invokevirtual   #276 <Method Bundle getArguments()>
	//    6   14:astore          4
		Bundle bundle = ((Bundle) (obj));
	//    7   16:aload           4
	//    8   18:astore_3        
		if(obj == null)
	//*   9   19:aload           4
	//*  10   21:ifnonnull       32
			bundle = new Bundle();
	//   11   24:new             #258 <Class Bundle>
	//   12   27:dup             
	//   13   28:invokespecial   #277 <Method void Bundle()>
	//   14   31:astore_3        
		obj = ((Object) (gsobject));
	//   15   32:aload_1         
	//   16   33:astore          4
		if(gsobject == null)
	//*  17   35:aload_1         
	//*  18   36:ifnonnull       48
			obj = ((Object) (new GSObject()));
	//   19   39:new             #264 <Class GSObject>
	//   20   42:dup             
	//   21   43:invokespecial   #266 <Method void GSObject()>
	//   22   46:astore          4
		bundle.putString("pluginName", s);
	//   23   48:aload_3         
	//   24   49:ldc1            #34  <String "pluginName">
	//   25   51:aload_0         
	//   26   52:invokevirtual   #281 <Method void Bundle.putString(String, String)>
		bundle.putString("pluginParams", ((GSObject) (obj)).toJsonString());
	//   27   55:aload_3         
	//   28   56:ldc1            #31  <String "pluginParams">
	//   29   58:aload           4
	//   30   60:invokevirtual   #284 <Method String GSObject.toJsonString()>
	//   31   63:invokevirtual   #281 <Method void Bundle.putString(String, String)>
		bundle.putBoolean("showAsDialog", flag);
	//   32   66:aload_3         
	//   33   67:ldc1            #37  <String "showAsDialog">
	//   34   69:iload_2         
	//   35   70:invokevirtual   #288 <Method void Bundle.putBoolean(String, boolean)>
		gspluginfragment.setArguments(bundle);
	//   36   73:aload           5
	//   37   75:aload_3         
	//   38   76:invokevirtual   #83  <Method void setArguments(Bundle)>
		return gspluginfragment;
	//   39   79:aload           5
	//   40   81:areturn         
	}

	private void onError(GSObject gsobject)
	{
		if(listener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field GSPluginListener listener>
	//*   2    4:ifnull          18
			listener.onError(this, gsobject);
	//    3    7:aload_0         
	//    4    8:getfield        #121 <Field GSPluginListener listener>
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokeinterface #292 <Method void GSPluginListener.onError(GSPluginFragment, GSObject)>
	//    8   18:return          
	}

	private void prepareParams()
	{
		params.put("containerID", "pluginContainer");
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field GSObject params>
	//    2    4:ldc2            #294 <String "containerID">
	//    3    7:ldc1            #18  <String "pluginContainer">
	//    4    9:invokevirtual   #297 <Method void GSObject.put(String, String)>
		if(params.getString("deviceType", ((String) (null))) == null)
	//*   5   12:aload_0         
	//*   6   13:getfield        #186 <Field GSObject params>
	//*   7   16:ldc2            #299 <String "deviceType">
	//*   8   19:aconst_null     
	//*   9   20:invokevirtual   #302 <Method String GSObject.getString(String, String)>
	//*  10   23:ifnonnull       39
			params.put("deviceType", "mobile");
	//   11   26:aload_0         
	//   12   27:getfield        #186 <Field GSObject params>
	//   13   30:ldc2            #299 <String "deviceType">
	//   14   33:ldc2            #304 <String "mobile">
	//   15   36:invokevirtual   #297 <Method void GSObject.put(String, String)>
		if(plugin.contains("commentsUI") && params.getInt("version", -1) == -1)
	//*  16   39:aload_0         
	//*  17   40:getfield        #111 <Field String plugin>
	//*  18   43:ldc2            #306 <String "commentsUI">
	//*  19   46:invokevirtual   #310 <Method boolean String.contains(CharSequence)>
	//*  20   49:ifeq            78
	//*  21   52:aload_0         
	//*  22   53:getfield        #186 <Field GSObject params>
	//*  23   56:ldc2            #312 <String "version">
	//*  24   59:iconst_m1       
	//*  25   60:invokevirtual   #316 <Method int GSObject.getInt(String, int)>
	//*  26   63:iconst_m1       
	//*  27   64:icmpne          78
			params.put("version", 2);
	//   28   67:aload_0         
	//   29   68:getfield        #186 <Field GSObject params>
	//   30   71:ldc2            #312 <String "version">
	//   31   74:iconst_2        
	//   32   75:invokevirtual   #319 <Method void GSObject.put(String, int)>
		if(plugin.contains("commentsUI"))
	//*  33   78:aload_0         
	//*  34   79:getfield        #111 <Field String plugin>
	//*  35   82:ldc2            #306 <String "commentsUI">
	//*  36   85:invokevirtual   #310 <Method boolean String.contains(CharSequence)>
	//*  37   88:ifeq            102
			params.put("hideShareButtons", true);
	//   38   91:aload_0         
	//   39   92:getfield        #186 <Field GSObject params>
	//   40   95:ldc2            #321 <String "hideShareButtons">
	//   41   98:iconst_1        
	//   42   99:invokevirtual   #323 <Method void GSObject.put(String, boolean)>
		if(plugin.contains("RatingUI") && params.getString("showCommentButton", ((String) (null))) == null)
	//*  43  102:aload_0         
	//*  44  103:getfield        #111 <Field String plugin>
	//*  45  106:ldc2            #325 <String "RatingUI">
	//*  46  109:invokevirtual   #310 <Method boolean String.contains(CharSequence)>
	//*  47  112:ifeq            140
	//*  48  115:aload_0         
	//*  49  116:getfield        #186 <Field GSObject params>
	//*  50  119:ldc2            #327 <String "showCommentButton">
	//*  51  122:aconst_null     
	//*  52  123:invokevirtual   #302 <Method String GSObject.getString(String, String)>
	//*  53  126:ifnonnull       140
			params.put("showCommentButton", false);
	//   54  129:aload_0         
	//   55  130:getfield        #186 <Field GSObject params>
	//   56  133:ldc2            #327 <String "showCommentButton">
	//   57  136:iconst_0        
	//   58  137:invokevirtual   #323 <Method void GSObject.put(String, boolean)>
		float f = getActivity().getResources().getDisplayMetrics().density;
	//   59  140:aload_0         
	//   60  141:invokevirtual   #234 <Method FragmentActivity getActivity()>
	//   61  144:invokevirtual   #333 <Method Resources FragmentActivity.getResources()>
	//   62  147:invokevirtual   #339 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   63  150:getfield        #345 <Field float DisplayMetrics.density>
	//   64  153:fstore_1        
		params.put("width", (float)getView().getWidth() / f - 16F);
	//   65  154:aload_0         
	//   66  155:getfield        #186 <Field GSObject params>
	//   67  158:ldc2            #347 <String "width">
	//   68  161:aload_0         
	//   69  162:invokevirtual   #351 <Method View getView()>
	//   70  165:invokevirtual   #357 <Method int View.getWidth()>
	//   71  168:i2f             
	//   72  169:fload_1         
	//   73  170:fdiv            
	//   74  171:ldc2            #358 <Float 16F>
	//   75  174:fsub            
	//   76  175:f2d             
	//   77  176:invokevirtual   #361 <Method void GSObject.put(String, double)>
		if(!GSAPI.getInstance().loginProviderFactory.hasLoginProvider("facebook"))
	//*  78  179:invokestatic    #163 <Method GSAPI GSAPI.getInstance()>
	//*  79  182:getfield        #365 <Field LoginProviderFactory GSAPI.loginProviderFactory>
	//*  80  185:ldc2            #367 <String "facebook">
	//*  81  188:invokevirtual   #373 <Method boolean LoginProviderFactory.hasLoginProvider(String)>
	//*  82  191:ifne            245
		{
			String s = params.getString("disabledProviders", "");
	//   83  194:aload_0         
	//   84  195:getfield        #186 <Field GSObject params>
	//   85  198:ldc2            #375 <String "disabledProviders">
	//   86  201:ldc1            #143 <String "">
	//   87  203:invokevirtual   #302 <Method String GSObject.getString(String, String)>
	//   88  206:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   89  207:new             #152 <Class StringBuilder>
	//   90  210:dup             
	//   91  211:invokespecial   #153 <Method void StringBuilder()>
	//   92  214:astore_3        
			stringbuilder.append("facebook,");
	//   93  215:aload_3         
	//   94  216:ldc2            #377 <String "facebook,">
	//   95  219:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   96  222:pop             
			stringbuilder.append(s);
	//   97  223:aload_3         
	//   98  224:aload_2         
	//   99  225:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//  100  228:pop             
			s = stringbuilder.toString();
	//  101  229:aload_3         
	//  102  230:invokevirtual   #171 <Method String StringBuilder.toString()>
	//  103  233:astore_2        
			params.put("disabledProviders", s);
	//  104  234:aload_0         
	//  105  235:getfield        #186 <Field GSObject params>
	//  106  238:ldc2            #375 <String "disabledProviders">
	//  107  241:aload_2         
	//  108  242:invokevirtual   #297 <Method void GSObject.put(String, String)>
		}
	//  109  245:return          
	}

	private void redrawWebViewInDialog(WebView webview)
	{
		Display display = getDisplay();
	//    0    0:aload_0         
	//    1    1:invokespecial   #379 <Method Display getDisplay()>
	//    2    4:astore_2        
		if(display == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			webview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams((Math.min(display.getWidth(), display.getHeight()) * 9) / 10, -2))));
	//    6   10:aload_1         
	//    7   11:new             #381 <Class android.widget.FrameLayout$LayoutParams>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokevirtual   #384 <Method int Display.getWidth()>
	//   11   19:aload_2         
	//   12   20:invokevirtual   #387 <Method int Display.getHeight()>
	//   13   23:invokestatic    #393 <Method int Math.min(int, int)>
	//   14   26:bipush          9
	//   15   28:imul            
	//   16   29:bipush          10
	//   17   31:idiv            
	//   18   32:bipush          -2
	//   19   34:invokespecial   #396 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   20   37:invokevirtual   #400 <Method void WebView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			webViewWrapContent = true;
	//   21   40:aload_0         
	//   22   41:iconst_1        
	//   23   42:putfield        #74  <Field boolean webViewWrapContent>
			return;
	//   24   45:return          
		}
	}

	private void sendImageChooserIntent()
	{
		Object obj;
		Intent intent1;
		intent1 = new Intent("android.media.action.IMAGE_CAPTURE");
	//    0    0:new             #404 <Class Intent>
	//    1    3:dup             
	//    2    4:ldc2            #406 <String "android.media.action.IMAGE_CAPTURE">
	//    3    7:invokespecial   #407 <Method void Intent(String)>
	//    4   10:astore_3        
		obj = ((Object) (intent1));
	//    5   11:aload_3         
	//    6   12:astore_1        
		if(intent1.resolveActivity(getActivity().getPackageManager()) == null)
			break MISSING_BLOCK_LABEL_120;
	//    7   13:aload_3         
	//    8   14:aload_0         
	//    9   15:invokevirtual   #234 <Method FragmentActivity getActivity()>
	//   10   18:invokevirtual   #411 <Method android.content.pm.PackageManager FragmentActivity.getPackageManager()>
	//   11   21:invokevirtual   #415 <Method android.content.ComponentName Intent.resolveActivity(android.content.pm.PackageManager)>
	//   12   24:ifnull          120
		obj = ((Object) (createImageFile()));
	//   13   27:aload_0         
	//   14   28:invokespecial   #417 <Method File createImageFile()>
	//   15   31:astore_1        
		intent1.putExtra("PhotoPath", mCameraPhotoPath);
	//   16   32:aload_3         
	//   17   33:ldc2            #419 <String "PhotoPath">
	//   18   36:aload_0         
	//   19   37:getfield        #421 <Field String mCameraPhotoPath>
	//   20   40:invokevirtual   #425 <Method Intent Intent.putExtra(String, String)>
	//   21   43:pop             
		break MISSING_BLOCK_LABEL_64;
	//   22   44:goto            64
		IOException ioexception;
		ioexception;
	//   23   47:astore_2        
		break MISSING_BLOCK_LABEL_54;
	//   24   48:goto            54
		ioexception;
	//   25   51:astore_2        
		obj = null;
	//   26   52:aconst_null     
	//   27   53:astore_1        
		GigyaLog.e("PHOTO ACTIVITY", "Unable to create Image File", ((Throwable) (ioexception)));
	//   28   54:ldc2            #427 <String "PHOTO ACTIVITY">
	//   29   57:ldc2            #429 <String "Unable to create Image File">
	//   30   60:aload_2         
	//   31   61:invokestatic    #435 <Method void GigyaLog.e(String, String, Throwable)>
		if(obj != null)
	//*  32   64:aload_1         
	//*  33   65:ifnull          118
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   34   68:new             #152 <Class StringBuilder>
	//   35   71:dup             
	//   36   72:invokespecial   #153 <Method void StringBuilder()>
	//   37   75:astore_2        
			stringbuilder.append("file:");
	//   38   76:aload_2         
	//   39   77:ldc2            #437 <String "file:">
	//   40   80:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   41   83:pop             
			stringbuilder.append(((File) (obj)).getAbsolutePath());
	//   42   84:aload_2         
	//   43   85:aload_1         
	//   44   86:invokevirtual   #440 <Method String File.getAbsolutePath()>
	//   45   89:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   46   92:pop             
			mCameraPhotoPath = stringbuilder.toString();
	//   47   93:aload_0         
	//   48   94:aload_2         
	//   49   95:invokevirtual   #171 <Method String StringBuilder.toString()>
	//   50   98:putfield        #421 <Field String mCameraPhotoPath>
			intent1.putExtra("output", ((android.os.Parcelable) (Uri.fromFile(((File) (obj))))));
	//   51  101:aload_3         
	//   52  102:ldc2            #442 <String "output">
	//   53  105:aload_1         
	//   54  106:invokestatic    #448 <Method Uri Uri.fromFile(File)>
	//   55  109:invokevirtual   #451 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   56  112:pop             
			obj = ((Object) (intent1));
	//   57  113:aload_3         
	//   58  114:astore_1        
		} else
	//*  59  115:goto            120
		{
			obj = null;
	//   60  118:aconst_null     
	//   61  119:astore_1        
		}
		Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
	//   62  120:new             #404 <Class Intent>
	//   63  123:dup             
	//   64  124:ldc2            #453 <String "android.intent.action.GET_CONTENT">
	//   65  127:invokespecial   #407 <Method void Intent(String)>
	//   66  130:astore_3        
		intent2.addCategory("android.intent.category.OPENABLE");
	//   67  131:aload_3         
	//   68  132:ldc2            #455 <String "android.intent.category.OPENABLE">
	//   69  135:invokevirtual   #459 <Method Intent Intent.addCategory(String)>
	//   70  138:pop             
		intent2.setType("image/*");
	//   71  139:aload_3         
	//   72  140:ldc2            #461 <String "image/*">
	//   73  143:invokevirtual   #464 <Method Intent Intent.setType(String)>
	//   74  146:pop             
		Intent aintent[];
		if(obj != null)
	//*  75  147:aload_1         
	//*  76  148:ifnull          165
		{
			Intent aintent1[] = new Intent[1];
	//   77  151:iconst_1        
	//   78  152:anewarray       Intent[]
	//   79  155:astore_2        
			aintent1[0] = ((Intent) (obj));
	//   80  156:aload_2         
	//   81  157:iconst_0        
	//   82  158:aload_1         
	//   83  159:aastore         
			aintent = aintent1;
	//   84  160:aload_2         
	//   85  161:astore_1        
		} else
	//*  86  162:goto            170
		{
			aintent = new Intent[0];
	//   87  165:iconst_0        
	//   88  166:anewarray       Intent[]
	//   89  169:astore_1        
		}
		Intent intent = new Intent("android.intent.action.CHOOSER");
	//   90  170:new             #404 <Class Intent>
	//   91  173:dup             
	//   92  174:ldc2            #466 <String "android.intent.action.CHOOSER">
	//   93  177:invokespecial   #407 <Method void Intent(String)>
	//   94  180:astore_2        
		intent.putExtra("android.intent.extra.INTENT", ((android.os.Parcelable) (intent2)));
	//   95  181:aload_2         
	//   96  182:ldc2            #468 <String "android.intent.extra.INTENT">
	//   97  185:aload_3         
	//   98  186:invokevirtual   #451 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   99  189:pop             
		intent.putExtra("android.intent.extra.TITLE", "Image Chooser");
	//  100  190:aload_2         
	//  101  191:ldc2            #470 <String "android.intent.extra.TITLE">
	//  102  194:ldc2            #472 <String "Image Chooser">
	//  103  197:invokevirtual   #425 <Method Intent Intent.putExtra(String, String)>
	//  104  200:pop             
		intent.putExtra("android.intent.extra.INITIAL_INTENTS", ((android.os.Parcelable []) (aintent)));
	//  105  201:aload_2         
	//  106  202:ldc2            #474 <String "android.intent.extra.INITIAL_INTENTS">
	//  107  205:aload_1         
	//  108  206:invokevirtual   #477 <Method Intent Intent.putExtra(String, android.os.Parcelable[])>
	//  109  209:pop             
		startActivityForResult(intent, 1);
	//  110  210:aload_0         
	//  111  211:aload_2         
	//  112  212:iconst_1        
	//  113  213:invokevirtual   #481 <Method void startActivityForResult(Intent, int)>
		return;
	//  114  216:return          
	}

	public GSDialogListener getOnDismissListener()
	{
		return dismissListener;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field GSDialogListener dismissListener>
	//    2    4:areturn         
	}

	public GSPluginListener getPluginListener()
	{
		return listener;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field GSPluginListener listener>
	//    2    4:areturn         
	}

	public boolean getShowLoadingProgress()
	{
		return showLoadingProgress;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field boolean showLoadingProgress>
	//    2    4:ireturn         
	}

	public boolean getShowLoginProgress()
	{
		return showLoginProgress;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field boolean showLoginProgress>
	//    2    4:ireturn         
	}

	public void onActivityCreated(Bundle bundle)
	{
		super.onActivityCreated(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #491 <Method void DialogFragment.onActivityCreated(Bundle)>
		if(!startedLoadingPlugin)
	//*   3    5:aload_0         
	//*   4    6:getfield        #68  <Field boolean startedLoadingPlugin>
	//*   5    9:ifne            30
			getView().getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

				public void onGlobalLayout()
				{
					if(getView() != null && getView().getWidth() > 0 && !startedLoadingPlugin)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field GSPluginFragment this$0>
				//*   2    4:invokevirtual   #26  <Method View GSPluginFragment.getView()>
				//*   3    7:ifnull          82
				//*   4   10:aload_0         
				//*   5   11:getfield        #17  <Field GSPluginFragment this$0>
				//*   6   14:invokevirtual   #26  <Method View GSPluginFragment.getView()>
				//*   7   17:invokevirtual   #32  <Method int View.getWidth()>
				//*   8   20:ifle            82
				//*   9   23:aload_0         
				//*  10   24:getfield        #17  <Field GSPluginFragment this$0>
				//*  11   27:invokestatic    #36  <Method boolean GSPluginFragment.access$1100(GSPluginFragment)>
				//*  12   30:ifne            82
					{
						String s = buildPluginHTML();
				//   13   33:aload_0         
				//   14   34:getfield        #17  <Field GSPluginFragment this$0>
				//   15   37:invokestatic    #40  <Method String GSPluginFragment.access$1200(GSPluginFragment)>
				//   16   40:astore_1        
						webView.loadDataWithBaseURL("http://www.gigya.com", s, "text/html", "utf-8", ((String) (null)));
				//   17   41:aload_0         
				//   18   42:getfield        #17  <Field GSPluginFragment this$0>
				//   19   45:invokestatic    #44  <Method WebView GSPluginFragment.access$1300(GSPluginFragment)>
				//   20   48:ldc1            #46  <String "http://www.gigya.com">
				//   21   50:aload_1         
				//   22   51:ldc1            #48  <String "text/html">
				//   23   53:ldc1            #50  <String "utf-8">
				//   24   55:aconst_null     
				//   25   56:invokevirtual   #56  <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
						startedLoadingPlugin = true;
				//   26   59:aload_0         
				//   27   60:getfield        #17  <Field GSPluginFragment this$0>
				//   28   63:iconst_1        
				//   29   64:invokestatic    #60  <Method boolean GSPluginFragment.access$1102(GSPluginFragment, boolean)>
				//   30   67:pop             
						getView().getViewTreeObserver().removeGlobalOnLayoutListener(((android.view.ViewTreeObserver.OnGlobalLayoutListener) (this)));
				//   31   68:aload_0         
				//   32   69:getfield        #17  <Field GSPluginFragment this$0>
				//   33   72:invokevirtual   #26  <Method View GSPluginFragment.getView()>
				//   34   75:invokevirtual   #64  <Method ViewTreeObserver View.getViewTreeObserver()>
				//   35   78:aload_0         
				//   36   79:invokevirtual   #70  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
					}
				//   37   82:return          
				}

				final GSPluginFragment this$0;

			
			{
				this$0 = GSPluginFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GSPluginFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    6   12:aload_0         
	//    7   13:invokevirtual   #351 <Method View getView()>
	//    8   16:invokevirtual   #495 <Method ViewTreeObserver View.getViewTreeObserver()>
	//    9   19:new             #14  <Class GSPluginFragment$4>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #497 <Method void GSPluginFragment$4(GSPluginFragment)>
	//   13   27:invokevirtual   #503 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//   14   30:return          
	}

	public void onActivityResult(int i, int j, Intent intent)
	{
label0:
		{
label1:
			{
label2:
				{
					if(android.os.Build.VERSION.SDK_INT < 21)
						break label0;
	//    0    0:getstatic       #510 <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          21
	//    2    5:icmplt          108
					if(i != 1 || mImagePathCallback == null)
	//*   3    8:iload_1         
	//*   4    9:iconst_1        
	//*   5   10:icmpne          100
	//*   6   13:aload_0         
	//*   7   14:getfield        #136 <Field ValueCallback mImagePathCallback>
	//*   8   17:ifnonnull       23
						break label1;
	//    9   20:goto            100
					if(j == -1)
	//*  10   23:iload_2         
	//*  11   24:iconst_m1       
	//*  12   25:icmpne          82
					{
						if(intent != null && intent.getDataString() != null)
	//*  13   28:aload_3         
	//*  14   29:ifnull          57
	//*  15   32:aload_3         
	//*  16   33:invokevirtual   #513 <Method String Intent.getDataString()>
	//*  17   36:ifnull          57
						{
							intent = ((Intent) (new Uri[] {
								Uri.parse(intent.getDataString())
							}));
	//   18   39:iconst_1        
	//   19   40:anewarray       Uri[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:aload_3         
	//   23   46:invokevirtual   #513 <Method String Intent.getDataString()>
	//   24   49:invokestatic    #517 <Method Uri Uri.parse(String)>
	//   25   52:aastore         
	//   26   53:astore_3        
							break label2;
	//   27   54:goto            84
						}
						if(mCameraPhotoPath != null)
	//*  28   57:aload_0         
	//*  29   58:getfield        #421 <Field String mCameraPhotoPath>
	//*  30   61:ifnull          82
						{
							intent = ((Intent) (new Uri[1]));
	//   31   64:iconst_1        
	//   32   65:anewarray       Uri[]
	//   33   68:astore_3        
							intent[0] = ((/*<invalid signature>*/java.lang.Object) (Uri.parse(mCameraPhotoPath)));
	//   34   69:aload_3         
	//   35   70:iconst_0        
	//   36   71:aload_0         
	//   37   72:getfield        #421 <Field String mCameraPhotoPath>
	//   38   75:invokestatic    #517 <Method Uri Uri.parse(String)>
	//   39   78:aastore         
							break label2;
	//   40   79:goto            84
						}
					}
					intent = null;
	//   41   82:aconst_null     
	//   42   83:astore_3        
				}
				mImagePathCallback.onReceiveValue(((Object) (intent)));
	//   43   84:aload_0         
	//   44   85:getfield        #136 <Field ValueCallback mImagePathCallback>
	//   45   88:aload_3         
	//   46   89:invokeinterface #523 <Method void ValueCallback.onReceiveValue(Object)>
				mImagePathCallback = null;
	//   47   94:aload_0         
	//   48   95:aconst_null     
	//   49   96:putfield        #136 <Field ValueCallback mImagePathCallback>
				return;
	//   50   99:return          
			}
			super.onActivityResult(i, j, intent);
	//   51  100:aload_0         
	//   52  101:iload_1         
	//   53  102:iload_2         
	//   54  103:aload_3         
	//   55  104:invokespecial   #525 <Method void DialogFragment.onActivityResult(int, int, Intent)>
			return;
	//   56  107:return          
		}
		if(android.os.Build.VERSION.SDK_INT > 19) goto _L2; else goto _L1
	//   57  108:getstatic       #510 <Field int android.os.Build$VERSION.SDK_INT>
	//   58  111:bipush          19
	//   59  113:icmpgt          244
_L1:
		if(i == 1 && mUploadMessage != null) goto _L4; else goto _L3
	//   60  116:iload_1         
	//   61  117:iconst_1        
	//   62  118:icmpne          237
	//   63  121:aload_0         
	//   64  122:getfield        #527 <Field ValueCallback mUploadMessage>
	//   65  125:ifnonnull       131
	//*  66  128:goto            237
_L4:
		if(i != 1) goto _L2; else goto _L5
	//   67  131:iload_1         
	//   68  132:iconst_1        
	//   69  133:icmpne          244
_L5:
		if(mUploadMessage == null)
	//*  70  136:aload_0         
	//*  71  137:getfield        #527 <Field ValueCallback mUploadMessage>
	//*  72  140:ifnonnull       144
			return;
	//   73  143:return          
		if(j == -1) goto _L7; else goto _L6
	//   74  144:iload_2         
	//   75  145:iconst_m1       
	//   76  146:icmpeq          152
	//*  77  149:goto            219
_L7:
		if(intent != null) goto _L9; else goto _L8
	//   78  152:aload_3         
	//   79  153:ifnonnull       164
_L8:
		intent = ((Intent) (mCapturedImageURI));
	//   80  156:aload_0         
	//   81  157:getfield        #78  <Field Uri mCapturedImageURI>
	//   82  160:astore_3        
		  goto _L10
	//*  83  161:goto            221
_L9:
		intent = ((Intent) (intent.getData()));
	//   84  164:aload_3         
	//   85  165:invokevirtual   #531 <Method Uri Intent.getData()>
	//   86  168:astore_3        
		  goto _L10
	//*  87  169:goto            221
_L12:
		Exception exception;
		intent = ((Intent) (getActivity().getApplicationContext()));
	//   88  172:aload_0         
	//   89  173:invokevirtual   #234 <Method FragmentActivity getActivity()>
	//   90  176:invokevirtual   #535 <Method android.content.Context FragmentActivity.getApplicationContext()>
	//   91  179:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   92  180:new             #152 <Class StringBuilder>
	//   93  183:dup             
	//   94  184:invokespecial   #153 <Method void StringBuilder()>
	//   95  187:astore          4
		stringbuilder.append("activity :");
	//   96  189:aload           4
	//   97  191:ldc2            #537 <String "activity :">
	//   98  194:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   99  197:pop             
		stringbuilder.append(((Object) (exception)));
	//  100  198:aload           4
	//  101  200:aload           5
	//  102  202:invokevirtual   #540 <Method StringBuilder StringBuilder.append(Object)>
	//  103  205:pop             
		Toast.makeText(((android.content.Context) (intent)), ((CharSequence) (stringbuilder.toString())), 1).show();
	//  104  206:aload_3         
	//  105  207:aload           4
	//  106  209:invokevirtual   #171 <Method String StringBuilder.toString()>
	//  107  212:iconst_1        
	//  108  213:invokestatic    #546 <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//  109  216:invokevirtual   #549 <Method void Toast.show()>
_L6:
		intent = null;
	//  110  219:aconst_null     
	//  111  220:astore_3        
_L10:
		mUploadMessage.onReceiveValue(((Object) (intent)));
	//  112  221:aload_0         
	//  113  222:getfield        #527 <Field ValueCallback mUploadMessage>
	//  114  225:aload_3         
	//  115  226:invokeinterface #523 <Method void ValueCallback.onReceiveValue(Object)>
		mUploadMessage = null;
	//  116  231:aload_0         
	//  117  232:aconst_null     
	//  118  233:putfield        #527 <Field ValueCallback mUploadMessage>
		return;
	//  119  236:return          
_L3:
		super.onActivityResult(i, j, intent);
	//  120  237:aload_0         
	//  121  238:iload_1         
	//  122  239:iload_2         
	//  123  240:aload_3         
	//  124  241:invokespecial   #525 <Method void DialogFragment.onActivityResult(int, int, Intent)>
_L2:
		return;
	//  125  244:return          
		exception;
	//  126  245:astore          5
		if(true) goto _L12; else goto _L11
	//  127  247:goto            172
_L11:
	}

	public void onCancel(DialogInterface dialoginterface)
	{
		if(dismissListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field GSDialogListener dismissListener>
	//*   2    4:ifnull          18
			dismissListener.onDismiss(true, ((GSObject) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field GSDialogListener dismissListener>
	//    5   11:iconst_1        
	//    6   12:aconst_null     
	//    7   13:invokeinterface #557 <Method void GSDialogListener.onDismiss(boolean, GSObject)>
	//    8   18:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #560 <Method void DialogFragment.onCreate(Bundle)>
		setShowsDialog(getArguments().getBoolean("showAsDialog"));
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #276 <Method Bundle getArguments()>
	//    6   10:ldc1            #37  <String "showAsDialog">
	//    7   12:invokevirtual   #563 <Method boolean Bundle.getBoolean(String)>
	//    8   15:invokevirtual   #567 <Method void setShowsDialog(boolean)>
		bundle = ((Bundle) (getActivity()));
	//    9   18:aload_0         
	//   10   19:invokevirtual   #234 <Method FragmentActivity getActivity()>
	//   11   22:astore_1        
		webView = new WebView(((android.content.Context) (bundle)));
	//   12   23:aload_0         
	//   13   24:new             #252 <Class WebView>
	//   14   27:dup             
	//   15   28:aload_1         
	//   16   29:invokespecial   #570 <Method void WebView(android.content.Context)>
	//   17   32:putfield        #107 <Field WebView webView>
		webView.getSettings().setJavaScriptEnabled(true);
	//   18   35:aload_0         
	//   19   36:getfield        #107 <Field WebView webView>
	//   20   39:invokevirtual   #574 <Method WebSettings WebView.getSettings()>
	//   21   42:iconst_1        
	//   22   43:invokevirtual   #579 <Method void WebSettings.setJavaScriptEnabled(boolean)>
		webView.getSettings().setAllowFileAccess(true);
	//   23   46:aload_0         
	//   24   47:getfield        #107 <Field WebView webView>
	//   25   50:invokevirtual   #574 <Method WebSettings WebView.getSettings()>
	//   26   53:iconst_1        
	//   27   54:invokevirtual   #582 <Method void WebSettings.setAllowFileAccess(boolean)>
		GigyaLog.d("FILE", "ACCESS");
	//   28   57:ldc2            #584 <String "FILE">
	//   29   60:ldc2            #586 <String "ACCESS">
	//   30   63:invokestatic    #589 <Method void GigyaLog.d(String, String)>
		GSWebBridge.attach(((Activity) (bundle)), webView, ((GSWebBridgeListener) (new GSWebBridgeListener() {

			public void beforeLogin(WebView webview, GSLoginRequest.LoginRequestType loginrequesttype, GSObject gsobject)
			{
				if(showLoginProgress)
			//*   0    0:aload_0         
			//*   1    1:getfield        #15  <Field GSPluginFragment this$0>
			//*   2    4:invokestatic    #25  <Method boolean GSPluginFragment.access$000(GSPluginFragment)>
			//*   3    7:ifeq            21
					progressBar.setVisibility(0);
			//    4   10:aload_0         
			//    5   11:getfield        #15  <Field GSPluginFragment this$0>
			//    6   14:invokestatic    #29  <Method ProgressBar GSPluginFragment.access$100(GSPluginFragment)>
			//    7   17:iconst_0        
			//    8   18:invokevirtual   #35  <Method void ProgressBar.setVisibility(int)>
			//    9   21:return          
			}

			public void onLoginResponse(WebView webview, GSResponse gsresponse)
			{
				progressBar.setVisibility(4);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field GSPluginFragment this$0>
			//    2    4:invokestatic    #29  <Method ProgressBar GSPluginFragment.access$100(GSPluginFragment)>
			//    3    7:iconst_4        
			//    4    8:invokevirtual   #35  <Method void ProgressBar.setVisibility(int)>
			//    5   11:return          
			}

			public void onPluginEvent(WebView webview, GSObject gsobject, String s)
			{
				if(s.equals("pluginContainer"))
			//*   0    0:aload_3         
			//*   1    1:ldc1            #41  <String "pluginContainer">
			//*   2    3:invokevirtual   #47  <Method boolean String.equals(Object)>
			//*   3    6:ifeq            249
				{
					s = gsobject.getString("eventName", "");
			//    4    9:aload_2         
			//    5   10:ldc1            #49  <String "eventName">
			//    6   12:ldc1            #51  <String "">
			//    7   14:invokevirtual   #57  <Method String GSObject.getString(String, String)>
			//    8   17:astore_3        
					if(s.equals("load"))
			//*   9   18:aload_3         
			//*  10   19:ldc1            #59  <String "load">
			//*  11   21:invokevirtual   #47  <Method boolean String.equals(Object)>
			//*  12   24:ifeq            38
						progressBar.setVisibility(4);
			//   13   27:aload_0         
			//   14   28:getfield        #15  <Field GSPluginFragment this$0>
			//   15   31:invokestatic    #29  <Method ProgressBar GSPluginFragment.access$100(GSPluginFragment)>
			//   16   34:iconst_4        
			//   17   35:invokevirtual   #35  <Method void ProgressBar.setVisibility(int)>
					if(getShowsDialog() && !webViewWrapContent && (plugin.equals("accounts.screenSet") ? s.equals("afterScreenLoad") : s.equals("load")))
			//*  18   38:aload_0         
			//*  19   39:getfield        #15  <Field GSPluginFragment this$0>
			//*  20   42:invokevirtual   #63  <Method boolean GSPluginFragment.getShowsDialog()>
			//*  21   45:ifeq            105
			//*  22   48:aload_0         
			//*  23   49:getfield        #15  <Field GSPluginFragment this$0>
			//*  24   52:invokestatic    #66  <Method boolean GSPluginFragment.access$200(GSPluginFragment)>
			//*  25   55:ifne            105
			//*  26   58:aload_0         
			//*  27   59:getfield        #15  <Field GSPluginFragment this$0>
			//*  28   62:invokestatic    #70  <Method String GSPluginFragment.access$300(GSPluginFragment)>
			//*  29   65:ldc1            #72  <String "accounts.screenSet">
			//*  30   67:invokevirtual   #47  <Method boolean String.equals(Object)>
			//*  31   70:ifeq            93
			//*  32   73:aload_3         
			//*  33   74:ldc1            #74  <String "afterScreenLoad">
			//*  34   76:invokevirtual   #47  <Method boolean String.equals(Object)>
			//*  35   79:ifeq            105
						redrawWebViewInDialog(webview);
			//   36   82:aload_0         
			//   37   83:getfield        #15  <Field GSPluginFragment this$0>
			//   38   86:aload_1         
			//   39   87:invokestatic    #78  <Method void GSPluginFragment.access$400(GSPluginFragment, WebView)>
			//   40   90:goto            105
			//   41   93:aload_3         
			//   42   94:ldc1            #59  <String "load">
			//   43   96:invokevirtual   #47  <Method boolean String.equals(Object)>
			//   44   99:ifeq            105
			//*  45  102:goto            82
					if(listener != null)
			//*  46  105:aload_0         
			//*  47  106:getfield        #15  <Field GSPluginFragment this$0>
			//*  48  109:invokestatic    #82  <Method GSPluginListener GSPluginFragment.access$500(GSPluginFragment)>
			//*  49  112:ifnull          190
						if(s.equals("load"))
			//*  50  115:aload_3         
			//*  51  116:ldc1            #59  <String "load">
			//*  52  118:invokevirtual   #47  <Method boolean String.equals(Object)>
			//*  53  121:ifeq            144
							listener.onLoad(GSPluginFragment.this, gsobject);
			//   54  124:aload_0         
			//   55  125:getfield        #15  <Field GSPluginFragment this$0>
			//   56  128:invokestatic    #82  <Method GSPluginListener GSPluginFragment.access$500(GSPluginFragment)>
			//   57  131:aload_0         
			//   58  132:getfield        #15  <Field GSPluginFragment this$0>
			//   59  135:aload_2         
			//   60  136:invokeinterface #88  <Method void GSPluginListener.onLoad(GSPluginFragment, GSObject)>
						else
			//*  61  141:goto            190
						if(s.equals("error"))
			//*  62  144:aload_3         
			//*  63  145:ldc1            #90  <String "error">
			//*  64  147:invokevirtual   #47  <Method boolean String.equals(Object)>
			//*  65  150:ifeq            173
							listener.onError(GSPluginFragment.this, gsobject);
			//   66  153:aload_0         
			//   67  154:getfield        #15  <Field GSPluginFragment this$0>
			//   68  157:invokestatic    #82  <Method GSPluginListener GSPluginFragment.access$500(GSPluginFragment)>
			//   69  160:aload_0         
			//   70  161:getfield        #15  <Field GSPluginFragment this$0>
			//   71  164:aload_2         
			//   72  165:invokeinterface #93  <Method void GSPluginListener.onError(GSPluginFragment, GSObject)>
						else
			//*  73  170:goto            190
							listener.onEvent(GSPluginFragment.this, gsobject);
			//   74  173:aload_0         
			//   75  174:getfield        #15  <Field GSPluginFragment this$0>
			//   76  177:invokestatic    #82  <Method GSPluginListener GSPluginFragment.access$500(GSPluginFragment)>
			//   77  180:aload_0         
			//   78  181:getfield        #15  <Field GSPluginFragment this$0>
			//   79  184:aload_2         
			//   80  185:invokeinterface #96  <Method void GSPluginListener.onEvent(GSPluginFragment, GSObject)>
					if((s.equals("hide") || s.equals("close")) && getShowsDialog())
			//*  81  190:aload_3         
			//*  82  191:ldc1            #98  <String "hide">
			//*  83  193:invokevirtual   #47  <Method boolean String.equals(Object)>
			//*  84  196:ifne            208
			//*  85  199:aload_3         
			//*  86  200:ldc1            #100 <String "close">
			//*  87  202:invokevirtual   #47  <Method boolean String.equals(Object)>
			//*  88  205:ifeq            249
			//*  89  208:aload_0         
			//*  90  209:getfield        #15  <Field GSPluginFragment this$0>
			//*  91  212:invokevirtual   #63  <Method boolean GSPluginFragment.getShowsDialog()>
			//*  92  215:ifeq            249
					{
						dismissAllowingStateLoss();
			//   93  218:aload_0         
			//   94  219:getfield        #15  <Field GSPluginFragment this$0>
			//   95  222:invokevirtual   #103 <Method void GSPluginFragment.dismissAllowingStateLoss()>
						if(dismissListener != null)
			//*  96  225:aload_0         
			//*  97  226:getfield        #15  <Field GSPluginFragment this$0>
			//*  98  229:invokestatic    #107 <Method GSDialogListener GSPluginFragment.access$600(GSPluginFragment)>
			//*  99  232:ifnull          249
							dismissListener.onDismiss(false, gsobject);
			//  100  235:aload_0         
			//  101  236:getfield        #15  <Field GSPluginFragment this$0>
			//  102  239:invokestatic    #107 <Method GSDialogListener GSPluginFragment.access$600(GSPluginFragment)>
			//  103  242:iconst_0        
			//  104  243:aload_2         
			//  105  244:invokeinterface #113 <Method void GSDialogListener.onDismiss(boolean, GSObject)>
					}
				}
			//  106  249:return          
			}

			final GSPluginFragment this$0;

			
			{
				this$0 = GSPluginFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field GSPluginFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void GSWebBridgeListener()>
			//    5    9:return          
			}
		}
)));
	//   31   66:aload_1         
	//   32   67:aload_0         
	//   33   68:getfield        #107 <Field WebView webView>
	//   34   71:new             #6   <Class GSPluginFragment$1>
	//   35   74:dup             
	//   36   75:aload_0         
	//   37   76:invokespecial   #590 <Method void GSPluginFragment$1(GSPluginFragment)>
	//   38   79:invokestatic    #596 <Method void GSWebBridge.attach(Activity, WebView, GSWebBridgeListener)>
		webView.setWebViewClient(((WebViewClient) (new WebViewClient() {

			public void onPageStarted(WebView webview, String s, Bitmap bitmap)
			{
				if(showLoadingProgress)
			//*   0    0:aload_0         
			//*   1    1:getfield        #15  <Field GSPluginFragment this$0>
			//*   2    4:invokestatic    #25  <Method boolean GSPluginFragment.access$800(GSPluginFragment)>
			//*   3    7:ifeq            21
					progressBar.setVisibility(0);
			//    4   10:aload_0         
			//    5   11:getfield        #15  <Field GSPluginFragment this$0>
			//    6   14:invokestatic    #29  <Method ProgressBar GSPluginFragment.access$100(GSPluginFragment)>
			//    7   17:iconst_0        
			//    8   18:invokevirtual   #35  <Method void ProgressBar.setVisibility(int)>
			//    9   21:return          
			}

			public void onReceivedError(WebView webview, int i, String s, String s1)
			{
				webview = ((WebView) (new GSObject()));
			//    0    0:new             #39  <Class GSObject>
			//    1    3:dup             
			//    2    4:invokespecial   #40  <Method void GSObject()>
			//    3    7:astore_1        
				((GSObject) (webview)).put("errorCode", 0x7a140);
			//    4    8:aload_1         
			//    5    9:ldc1            #42  <String "errorCode">
			//    6   11:ldc1            #43  <Int 0x7a140>
			//    7   13:invokevirtual   #47  <Method void GSObject.put(String, int)>
				s = ((String) (new StringBuilder()));
			//    8   16:new             #49  <Class StringBuilder>
			//    9   19:dup             
			//   10   20:invokespecial   #50  <Method void StringBuilder()>
			//   11   23:astore_3        
				((StringBuilder) (s)).append("Failed loading ");
			//   12   24:aload_3         
			//   13   25:ldc1            #52  <String "Failed loading ">
			//   14   27:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
			//   15   30:pop             
				((StringBuilder) (s)).append(s1);
			//   16   31:aload_3         
			//   17   32:aload           4
			//   18   34:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
			//   19   37:pop             
				((GSObject) (webview)).put("description", ((StringBuilder) (s)).toString());
			//   20   38:aload_1         
			//   21   39:ldc1            #58  <String "description">
			//   22   41:aload_3         
			//   23   42:invokevirtual   #62  <Method String StringBuilder.toString()>
			//   24   45:invokevirtual   #65  <Method void GSObject.put(String, String)>
				((GSObject) (webview)).put("eventName", "error");
			//   25   48:aload_1         
			//   26   49:ldc1            #67  <String "eventName">
			//   27   51:ldc1            #69  <String "error">
			//   28   53:invokevirtual   #65  <Method void GSObject.put(String, String)>
				onError(((GSObject) (webview)));
			//   29   56:aload_0         
			//   30   57:getfield        #15  <Field GSPluginFragment this$0>
			//   31   60:aload_1         
			//   32   61:invokestatic    #73  <Method void GSPluginFragment.access$700(GSPluginFragment, GSObject)>
			//   33   64:return          
			}

			public boolean shouldOverrideUrlLoading(WebView webview, String s)
			{
				Uri uri = Uri.parse(s);
			//    0    0:aload_2         
			//    1    1:invokestatic    #81  <Method Uri Uri.parse(String)>
			//    2    4:astore_3        
				if(uri.getScheme().equals("gsapi") && uri.getHost().equals("on_js_load_error"))
			//*   3    5:aload_3         
			//*   4    6:invokevirtual   #84  <Method String Uri.getScheme()>
			//*   5    9:ldc1            #86  <String "gsapi">
			//*   6   11:invokevirtual   #92  <Method boolean String.equals(Object)>
			//*   7   14:ifeq            72
			//*   8   17:aload_3         
			//*   9   18:invokevirtual   #95  <Method String Uri.getHost()>
			//*  10   21:ldc1            #97  <String "on_js_load_error">
			//*  11   23:invokevirtual   #92  <Method boolean String.equals(Object)>
			//*  12   26:ifeq            72
				{
					webview = ((WebView) (new GSObject()));
			//   13   29:new             #39  <Class GSObject>
			//   14   32:dup             
			//   15   33:invokespecial   #40  <Method void GSObject()>
			//   16   36:astore_1        
					((GSObject) (webview)).put("errorCode", 0x7a140);
			//   17   37:aload_1         
			//   18   38:ldc1            #42  <String "errorCode">
			//   19   40:ldc1            #43  <Int 0x7a140>
			//   20   42:invokevirtual   #47  <Method void GSObject.put(String, int)>
					((GSObject) (webview)).put("description", "Failed loading socialize.js");
			//   21   45:aload_1         
			//   22   46:ldc1            #58  <String "description">
			//   23   48:ldc1            #99  <String "Failed loading socialize.js">
			//   24   50:invokevirtual   #65  <Method void GSObject.put(String, String)>
					((GSObject) (webview)).put("eventName", "error");
			//   25   53:aload_1         
			//   26   54:ldc1            #67  <String "eventName">
			//   27   56:ldc1            #69  <String "error">
			//   28   58:invokevirtual   #65  <Method void GSObject.put(String, String)>
					onError(((GSObject) (webview)));
			//   29   61:aload_0         
			//   30   62:getfield        #15  <Field GSPluginFragment this$0>
			//   31   65:aload_1         
			//   32   66:invokestatic    #73  <Method void GSPluginFragment.access$700(GSPluginFragment, GSObject)>
				} else
			//*  33   69:goto            198
				if(uri.getScheme().equals("gsapi") && uri.getHost().equals("on_js_exception"))
			//*  34   72:aload_3         
			//*  35   73:invokevirtual   #84  <Method String Uri.getScheme()>
			//*  36   76:ldc1            #86  <String "gsapi">
			//*  37   78:invokevirtual   #92  <Method boolean String.equals(Object)>
			//*  38   81:ifeq            171
			//*  39   84:aload_3         
			//*  40   85:invokevirtual   #95  <Method String Uri.getHost()>
			//*  41   88:ldc1            #101 <String "on_js_exception">
			//*  42   90:invokevirtual   #92  <Method boolean String.equals(Object)>
			//*  43   93:ifeq            171
				{
					webview = ((WebView) (new GSObject()));
			//   44   96:new             #39  <Class GSObject>
			//   45   99:dup             
			//   46  100:invokespecial   #40  <Method void GSObject()>
			//   47  103:astore_1        
					((GSObject) (webview)).parseQueryString(uri.getQuery());
			//   48  104:aload_1         
			//   49  105:aload_3         
			//   50  106:invokevirtual   #104 <Method String Uri.getQuery()>
			//   51  109:invokevirtual   #108 <Method void GSObject.parseQueryString(String)>
					webview = ((WebView) (((GSObject) (webview)).getString("ex", "")));
			//   52  112:aload_1         
			//   53  113:ldc1            #110 <String "ex">
			//   54  115:ldc1            #112 <String "">
			//   55  117:invokevirtual   #116 <Method String GSObject.getString(String, String)>
			//   56  120:astore_1        
					s = ((String) (new GSObject()));
			//   57  121:new             #39  <Class GSObject>
			//   58  124:dup             
			//   59  125:invokespecial   #40  <Method void GSObject()>
			//   60  128:astore_2        
					((GSObject) (s)).put("errorCode", 0x62e09);
			//   61  129:aload_2         
			//   62  130:ldc1            #42  <String "errorCode">
			//   63  132:ldc1            #117 <Int 0x62e09>
			//   64  134:invokevirtual   #47  <Method void GSObject.put(String, int)>
					((GSObject) (s)).put("description", "Javascript error while loading plugin. Please make sure the plugin name is correct.");
			//   65  137:aload_2         
			//   66  138:ldc1            #58  <String "description">
			//   67  140:ldc1            #119 <String "Javascript error while loading plugin. Please make sure the plugin name is correct.">
			//   68  142:invokevirtual   #65  <Method void GSObject.put(String, String)>
					((GSObject) (s)).put("jsError", ((String) (webview)));
			//   69  145:aload_2         
			//   70  146:ldc1            #121 <String "jsError">
			//   71  148:aload_1         
			//   72  149:invokevirtual   #65  <Method void GSObject.put(String, String)>
					((GSObject) (s)).put("eventName", "error");
			//   73  152:aload_2         
			//   74  153:ldc1            #67  <String "eventName">
			//   75  155:ldc1            #69  <String "error">
			//   76  157:invokevirtual   #65  <Method void GSObject.put(String, String)>
					onError(((GSObject) (s)));
			//   77  160:aload_0         
			//   78  161:getfield        #15  <Field GSPluginFragment this$0>
			//   79  164:aload_2         
			//   80  165:invokestatic    #73  <Method void GSPluginFragment.access$700(GSPluginFragment, GSObject)>
				} else
			//*  81  168:goto            198
				if(!GSWebBridge.handleUrl(webview, s))
			//*  82  171:aload_1         
			//*  83  172:aload_2         
			//*  84  173:invokestatic    #126 <Method boolean GSWebBridge.handleUrl(WebView, String)>
			//*  85  176:ifne            198
				{
					webview = ((WebView) (new Intent("android.intent.action.VIEW", uri)));
			//   86  179:new             #128 <Class Intent>
			//   87  182:dup             
			//   88  183:ldc1            #130 <String "android.intent.action.VIEW">
			//   89  185:aload_3         
			//   90  186:invokespecial   #133 <Method void Intent(String, Uri)>
			//   91  189:astore_1        
					startActivity(((Intent) (webview)));
			//   92  190:aload_0         
			//   93  191:getfield        #15  <Field GSPluginFragment this$0>
			//   94  194:aload_1         
			//   95  195:invokevirtual   #137 <Method void GSPluginFragment.startActivity(Intent)>
				}
				return true;
			//   96  198:iconst_1        
			//   97  199:ireturn         
			}

			final GSPluginFragment this$0;

			
			{
				this$0 = GSPluginFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field GSPluginFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void WebViewClient()>
			//    5    9:return          
			}
		}
)));
	//   39   82:aload_0         
	//   40   83:getfield        #107 <Field WebView webView>
	//   41   86:new             #8   <Class GSPluginFragment$2>
	//   42   89:dup             
	//   43   90:aload_0         
	//   44   91:invokespecial   #597 <Method void GSPluginFragment$2(GSPluginFragment)>
	//   45   94:invokevirtual   #601 <Method void WebView.setWebViewClient(WebViewClient)>
		webView.setWebChromeClient(((WebChromeClient) (new WebChromeClient() {

			public boolean onShowFileChooser(WebView webview, ValueCallback valuecallback, android.webkit.WebChromeClient.FileChooserParams filechooserparams)
			{
				GigyaLog.d("FILE", "CHOOSE");
			//    0    0:ldc1            #25  <String "FILE">
			//    1    2:ldc1            #27  <String "CHOOSE">
			//    2    4:invokestatic    #33  <Method void GigyaLog.d(String, String)>
				if(mImagePathCallback != null)
			//*   3    7:aload_0         
			//*   4    8:getfield        #17  <Field GSPluginFragment this$0>
			//*   5   11:invokestatic    #37  <Method ValueCallback GSPluginFragment.access$900(GSPluginFragment)>
			//*   6   14:ifnull          30
					mImagePathCallback.onReceiveValue(((Object) (null)));
			//    7   17:aload_0         
			//    8   18:getfield        #17  <Field GSPluginFragment this$0>
			//    9   21:invokestatic    #37  <Method ValueCallback GSPluginFragment.access$900(GSPluginFragment)>
			//   10   24:aconst_null     
			//   11   25:invokeinterface #43  <Method void ValueCallback.onReceiveValue(Object)>
				mImagePathCallback = valuecallback;
			//   12   30:aload_0         
			//   13   31:getfield        #17  <Field GSPluginFragment this$0>
			//   14   34:aload_2         
			//   15   35:invokestatic    #47  <Method ValueCallback GSPluginFragment.access$902(GSPluginFragment, ValueCallback)>
			//   16   38:pop             
				int i = GSAPI.getInstance().getNextAndroidPermissionsRequestCode(new GSAndroidPermissionListener() {

					public void onAndroidPermissionsResult(String as[], int ai[])
					{
						if(mImagePathCallback != null)
					//*   0    0:aload_0         
					//*   1    1:getfield        #17  <Field GSPluginFragment$3 this$1>
					//*   2    4:getfield        #27  <Field GSPluginFragment GSPluginFragment$3.this$0>
					//*   3    7:invokestatic    #33  <Method ValueCallback GSPluginFragment.access$900(GSPluginFragment)>
					//*   4   10:ifnull          23
							sendImageChooserIntent();
					//    5   13:aload_0         
					//    6   14:getfield        #17  <Field GSPluginFragment$3 this$1>
					//    7   17:getfield        #27  <Field GSPluginFragment GSPluginFragment$3.this$0>
					//    8   20:invokestatic    #37  <Method void GSPluginFragment.access$1000(GSPluginFragment)>
					//    9   23:return          
					}

					final _cls3 this$1;

			
			{
				this$1 = _cls3.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GSPluginFragment$3 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
);
			//   17   39:invokestatic    #53  <Method GSAPI GSAPI.getInstance()>
			//   18   42:new             #11  <Class GSPluginFragment$3$1>
			//   19   45:dup             
			//   20   46:aload_0         
			//   21   47:invokespecial   #56  <Method void GSPluginFragment$3$1(GSPluginFragment$3)>
			//   22   50:invokevirtual   #60  <Method int GSAPI.getNextAndroidPermissionsRequestCode(GSAndroidPermissionListener)>
			//   23   53:istore          4
				webview = ((WebView) (new String[1]));
			//   24   55:iconst_1        
			//   25   56:anewarray       String[]
			//   26   59:astore_1        
				webview[0] = "android.permission.WRITE_EXTERNAL_STORAGE";
			//   27   60:aload_1         
			//   28   61:iconst_0        
			//   29   62:ldc1            #64  <String "android.permission.WRITE_EXTERNAL_STORAGE">
			//   30   64:aastore         
				if(getShowsDialog())
			//*  31   65:aload_0         
			//*  32   66:getfield        #17  <Field GSPluginFragment this$0>
			//*  33   69:invokevirtual   #68  <Method boolean GSPluginFragment.getShowsDialog()>
			//*  34   72:ifeq            91
					ActivityCompat.requestPermissions(((Activity) (getActivity())), ((String []) (webview)), i);
			//   35   75:aload_0         
			//   36   76:getfield        #17  <Field GSPluginFragment this$0>
			//   37   79:invokevirtual   #72  <Method FragmentActivity GSPluginFragment.getActivity()>
			//   38   82:aload_1         
			//   39   83:iload           4
			//   40   85:invokestatic    #78  <Method void ActivityCompat.requestPermissions(Activity, String[], int)>
				else
			//*  41   88:goto            101
					requestPermissions(((String []) (webview)), i);
			//   42   91:aload_0         
			//   43   92:getfield        #17  <Field GSPluginFragment this$0>
			//   44   95:aload_1         
			//   45   96:iload           4
			//   46   98:invokevirtual   #81  <Method void GSPluginFragment.requestPermissions(String[], int)>
				return true;
			//   47  101:iconst_1        
			//   48  102:ireturn         
			}

			final GSPluginFragment this$0;

			
			{
				this$0 = GSPluginFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GSPluginFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void WebChromeClient()>
			//    5    9:return          
			}
		}
)));
	//   46   97:aload_0         
	//   47   98:getfield        #107 <Field WebView webView>
	//   48  101:new             #10  <Class GSPluginFragment$3>
	//   49  104:dup             
	//   50  105:aload_0         
	//   51  106:invokespecial   #602 <Method void GSPluginFragment$3(GSPluginFragment)>
	//   52  109:invokevirtual   #606 <Method void WebView.setWebChromeClient(WebChromeClient)>
		loadFromBundle(getArguments());
	//   53  112:aload_0         
	//   54  113:aload_0         
	//   55  114:invokevirtual   #276 <Method Bundle getArguments()>
	//   56  117:invokespecial   #608 <Method void loadFromBundle(Bundle)>
	//   57  120:return          
	}

	public Dialog onCreateDialog(Bundle bundle)
	{
		bundle = ((Bundle) (super.onCreateDialog(bundle)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #612 <Method Dialog DialogFragment.onCreateDialog(Bundle)>
	//    3    5:astore_1        
		((Dialog) (bundle)).getWindow().setSoftInputMode(2);
	//    4    6:aload_1         
	//    5    7:invokevirtual   #618 <Method Window Dialog.getWindow()>
	//    6   10:iconst_2        
	//    7   11:invokevirtual   #624 <Method void Window.setSoftInputMode(int)>
		String s = params.getString("captionText", ((String) (null)));
	//    8   14:aload_0         
	//    9   15:getfield        #186 <Field GSObject params>
	//   10   18:ldc2            #626 <String "captionText">
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #302 <Method String GSObject.getString(String, String)>
	//   13   25:astore_2        
		if(s == null)
	//*  14   26:aload_2         
	//*  15   27:ifnonnull       38
		{
			((Dialog) (bundle)).requestWindowFeature(1);
	//   16   30:aload_1         
	//   17   31:iconst_1        
	//   18   32:invokevirtual   #630 <Method boolean Dialog.requestWindowFeature(int)>
	//   19   35:pop             
			return ((Dialog) (bundle));
	//   20   36:aload_1         
	//   21   37:areturn         
		} else
		{
			((Dialog) (bundle)).setTitle(((CharSequence) (s)));
	//   22   38:aload_1         
	//   23   39:aload_2         
	//   24   40:invokevirtual   #634 <Method void Dialog.setTitle(CharSequence)>
			return ((Dialog) (bundle));
	//   25   43:aload_1         
	//   26   44:areturn         
		}
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		layoutinflater = ((LayoutInflater) (getActivity()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #234 <Method FragmentActivity getActivity()>
	//    2    4:astore_1        
		viewgroup = ((ViewGroup) (getDisplay()));
	//    3    5:aload_0         
	//    4    6:invokespecial   #379 <Method Display getDisplay()>
	//    5    9:astore_2        
		if(layoutinflater != null && viewgroup != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          228
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       21
	//*  10   18:goto            228
		{
			if(getShowsDialog())
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #639 <Method boolean getShowsDialog()>
	//*  13   25:ifeq            91
			{
				int j = (Math.min(((Display) (viewgroup)).getWidth(), ((Display) (viewgroup)).getHeight()) * 9) / 10;
	//   14   28:aload_2         
	//   15   29:invokevirtual   #384 <Method int Display.getWidth()>
	//   16   32:aload_2         
	//   17   33:invokevirtual   #387 <Method int Display.getHeight()>
	//   18   36:invokestatic    #393 <Method int Math.min(int, int)>
	//   19   39:bipush          9
	//   20   41:imul            
	//   21   42:bipush          10
	//   22   44:idiv            
	//   23   45:istore          5
				int i;
				if(bundle == null)
	//*  24   47:aload_3         
	//*  25   48:ifnonnull       66
					i = (((Display) (viewgroup)).getHeight() * 9) / 10;
	//   26   51:aload_2         
	//   27   52:invokevirtual   #387 <Method int Display.getHeight()>
	//   28   55:bipush          9
	//   29   57:imul            
	//   30   58:bipush          10
	//   31   60:idiv            
	//   32   61:istore          4
				else
	//*  33   63:goto            70
					i = -2;
	//   34   66:bipush          -2
	//   35   68:istore          4
				webView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(j, i))));
	//   36   70:aload_0         
	//   37   71:getfield        #107 <Field WebView webView>
	//   38   74:new             #381 <Class android.widget.FrameLayout$LayoutParams>
	//   39   77:dup             
	//   40   78:iload           5
	//   41   80:iload           4
	//   42   82:invokespecial   #396 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   43   85:invokevirtual   #400 <Method void WebView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			} else
	//*  44   88:goto            107
			{
				webView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//   45   91:aload_0         
	//   46   92:getfield        #107 <Field WebView webView>
	//   47   95:new             #381 <Class android.widget.FrameLayout$LayoutParams>
	//   48   98:dup             
	//   49   99:iconst_m1       
	//   50  100:iconst_m1       
	//   51  101:invokespecial   #396 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   52  104:invokevirtual   #400 <Method void WebView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			}
			viewgroup = ((ViewGroup) (new FrameLayout(((android.content.Context) (layoutinflater)))));
	//   53  107:new             #641 <Class FrameLayout>
	//   54  110:dup             
	//   55  111:aload_1         
	//   56  112:invokespecial   #642 <Method void FrameLayout(android.content.Context)>
	//   57  115:astore_2        
			((FrameLayout) (viewgroup)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//   58  116:aload_2         
	//   59  117:new             #381 <Class android.widget.FrameLayout$LayoutParams>
	//   60  120:dup             
	//   61  121:iconst_m1       
	//   62  122:iconst_m1       
	//   63  123:invokespecial   #396 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   64  126:invokevirtual   #643 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			if(webView.getParent() != null)
	//*  65  129:aload_0         
	//*  66  130:getfield        #107 <Field WebView webView>
	//*  67  133:invokevirtual   #647 <Method android.view.ViewParent WebView.getParent()>
	//*  68  136:ifnull          156
				((FrameLayout)webView.getParent()).removeView(((View) (webView)));
	//   69  139:aload_0         
	//   70  140:getfield        #107 <Field WebView webView>
	//   71  143:invokevirtual   #647 <Method android.view.ViewParent WebView.getParent()>
	//   72  146:checkcast       #641 <Class FrameLayout>
	//   73  149:aload_0         
	//   74  150:getfield        #107 <Field WebView webView>
	//   75  153:invokevirtual   #651 <Method void FrameLayout.removeView(View)>
			((FrameLayout) (viewgroup)).addView(((View) (webView)));
	//   76  156:aload_2         
	//   77  157:aload_0         
	//   78  158:getfield        #107 <Field WebView webView>
	//   79  161:invokevirtual   #654 <Method void FrameLayout.addView(View)>
			bundle = ((Bundle) (new android.widget.FrameLayout.LayoutParams(-2, -2)));
	//   80  164:new             #381 <Class android.widget.FrameLayout$LayoutParams>
	//   81  167:dup             
	//   82  168:bipush          -2
	//   83  170:bipush          -2
	//   84  172:invokespecial   #396 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   85  175:astore_3        
			bundle.gravity = 17;
	//   86  176:aload_3         
	//   87  177:bipush          17
	//   88  179:putfield        #657 <Field int android.widget.FrameLayout$LayoutParams.gravity>
			progressBar = new ProgressBar(((android.content.Context) (layoutinflater)));
	//   89  182:aload_0         
	//   90  183:new             #659 <Class ProgressBar>
	//   91  186:dup             
	//   92  187:aload_1         
	//   93  188:invokespecial   #660 <Method void ProgressBar(android.content.Context)>
	//   94  191:putfield        #89  <Field ProgressBar progressBar>
			progressBar.setIndeterminate(true);
	//   95  194:aload_0         
	//   96  195:getfield        #89  <Field ProgressBar progressBar>
	//   97  198:iconst_1        
	//   98  199:invokevirtual   #663 <Method void ProgressBar.setIndeterminate(boolean)>
			progressBar.setLayoutParams(((android.view.ViewGroup.LayoutParams) (bundle)));
	//   99  202:aload_0         
	//  100  203:getfield        #89  <Field ProgressBar progressBar>
	//  101  206:aload_3         
	//  102  207:invokevirtual   #664 <Method void ProgressBar.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			progressBar.setVisibility(4);
	//  103  210:aload_0         
	//  104  211:getfield        #89  <Field ProgressBar progressBar>
	//  105  214:iconst_4        
	//  106  215:invokevirtual   #667 <Method void ProgressBar.setVisibility(int)>
			((FrameLayout) (viewgroup)).addView(((View) (progressBar)));
	//  107  218:aload_2         
	//  108  219:aload_0         
	//  109  220:getfield        #89  <Field ProgressBar progressBar>
	//  110  223:invokevirtual   #654 <Method void FrameLayout.addView(View)>
			return ((View) (viewgroup));
	//  111  226:aload_2         
	//  112  227:areturn         
		} else
		{
			return null;
	//  113  228:aconst_null     
	//  114  229:areturn         
		}
	}

	public void onDestroy()
	{
		if(webView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field WebView webView>
	//*   2    4:ifnull          40
		{
			webView.loadUrl("about:blank");
	//    3    7:aload_0         
	//    4    8:getfield        #107 <Field WebView webView>
	//    5   11:ldc2            #670 <String "about:blank">
	//    6   14:invokevirtual   #673 <Method void WebView.loadUrl(String)>
			webView.setWebViewClient(((WebViewClient) (null)));
	//    7   17:aload_0         
	//    8   18:getfield        #107 <Field WebView webView>
	//    9   21:aconst_null     
	//   10   22:invokevirtual   #601 <Method void WebView.setWebViewClient(WebViewClient)>
			webView.setWebChromeClient(((WebChromeClient) (null)));
	//   11   25:aload_0         
	//   12   26:getfield        #107 <Field WebView webView>
	//   13   29:aconst_null     
	//   14   30:invokevirtual   #606 <Method void WebView.setWebChromeClient(WebChromeClient)>
			GSWebBridge.detach(webView);
	//   15   33:aload_0         
	//   16   34:getfield        #107 <Field WebView webView>
	//   17   37:invokestatic    #676 <Method void GSWebBridge.detach(WebView)>
		}
		super.onDestroy();
	//   18   40:aload_0         
	//   19   41:invokespecial   #678 <Method void DialogFragment.onDestroy()>
	//   20   44:return          
	}

	public void onDestroyView()
	{
		Dialog dialog = getDialog();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #683 <Method Dialog getDialog()>
	//    2    4:astore_1        
		if(getRetainInstance() && dialog != null)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #686 <Method boolean getRetainInstance()>
	//*   5    9:ifeq            21
	//*   6   12:aload_1         
	//*   7   13:ifnull          21
			dialog.setDismissMessage(((android.os.Message) (null)));
	//    8   16:aload_1         
	//    9   17:aconst_null     
	//   10   18:invokevirtual   #690 <Method void Dialog.setDismissMessage(android.os.Message)>
		super.onDestroyView();
	//   11   21:aload_0         
	//   12   22:invokespecial   #692 <Method void DialogFragment.onDestroyView()>
	//   13   25:return          
	}

	public void onRequestPermissionsResult(int i, String as[], int ai[])
	{
		GSAPI.getInstance().handleAndroidPermissionsResult(i, as, ai);
	//    0    0:invokestatic    #163 <Method GSAPI GSAPI.getInstance()>
	//    1    3:iload_1         
	//    2    4:aload_2         
	//    3    5:aload_3         
	//    4    6:invokevirtual   #698 <Method boolean GSAPI.handleAndroidPermissionsResult(int, String[], int[])>
	//    5    9:pop             
	//    6   10:return          
	}

	public void setOnDismissListener(GSDialogListener gsdialoglistener)
	{
		dismissListener = gsdialoglistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #125 <Field GSDialogListener dismissListener>
	//    3    5:return          
	}

	public void setPluginListener(GSPluginListener gspluginlistener)
	{
		listener = gspluginlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #121 <Field GSPluginListener listener>
	//    3    5:return          
	}

	public void setShowLoadingProgress(boolean flag)
	{
		showLoadingProgress = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #70  <Field boolean showLoadingProgress>
	//    3    5:return          
	}

	public void setShowLoginProgress(boolean flag)
	{
		showLoginProgress = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #72  <Field boolean showLoginProgress>
	//    3    5:return          
	}

	private static final String CONTAINER_ID = "pluginContainer";
	private static final int FILECHOOSER_RESULTCODE = 1;
	private static final int INPUT_FILE_REQUEST_CODE = 1;
	private static final String ON_JS_EXCEPTION = "on_js_exception";
	private static final String ON_JS_LOAD_ERROR = "on_js_load_error";
	private static final String PARAMS_BUNDLE_KEY = "pluginParams";
	private static final String PLUGIN_BUNDLE_KEY = "pluginName";
	private static final String SHOW_DIALOG_BUNDLE_KEY = "showAsDialog";
	private GSDialogListener dismissListener;
	private int jsLoadingTimeout;
	private GSPluginListener listener;
	private String mCameraPhotoPath;
	private Uri mCapturedImageURI;
	private ValueCallback mImagePathCallback;
	private ValueCallback mUploadMessage;
	private GSObject params;
	private String plugin;
	private ProgressBar progressBar;
	private boolean showLoadingProgress;
	private boolean showLoginProgress;
	private boolean startedLoadingPlugin;
	private WebView webView;
	private boolean webViewWrapContent;


/*
	static boolean access$000(GSPluginFragment gspluginfragment)
	{
		return gspluginfragment.showLoginProgress;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field boolean showLoginProgress>
	//    2    4:ireturn         
	}

*/


/*
	static ProgressBar access$100(GSPluginFragment gspluginfragment)
	{
		return gspluginfragment.progressBar;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field ProgressBar progressBar>
	//    2    4:areturn         
	}

*/


/*
	static void access$1000(GSPluginFragment gspluginfragment)
	{
		gspluginfragment.sendImageChooserIntent();
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method void sendImageChooserIntent()>
		return;
	//    2    4:return          
	}

*/


/*
	static boolean access$1100(GSPluginFragment gspluginfragment)
	{
		return gspluginfragment.startedLoadingPlugin;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field boolean startedLoadingPlugin>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$1102(GSPluginFragment gspluginfragment, boolean flag)
	{
		gspluginfragment.startedLoadingPlugin = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #68  <Field boolean startedLoadingPlugin>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static String access$1200(GSPluginFragment gspluginfragment)
	{
		return gspluginfragment.buildPluginHTML();
	//    0    0:aload_0         
	//    1    1:invokespecial   #103 <Method String buildPluginHTML()>
	//    2    4:areturn         
	}

*/


/*
	static WebView access$1300(GSPluginFragment gspluginfragment)
	{
		return gspluginfragment.webView;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field WebView webView>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$200(GSPluginFragment gspluginfragment)
	{
		return gspluginfragment.webViewWrapContent;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field boolean webViewWrapContent>
	//    2    4:ireturn         
	}

*/


/*
	static String access$300(GSPluginFragment gspluginfragment)
	{
		return gspluginfragment.plugin;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field String plugin>
	//    2    4:areturn         
	}

*/


/*
	static void access$400(GSPluginFragment gspluginfragment, WebView webview)
	{
		gspluginfragment.redrawWebViewInDialog(webview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #117 <Method void redrawWebViewInDialog(WebView)>
		return;
	//    3    5:return          
	}

*/


/*
	static GSPluginListener access$500(GSPluginFragment gspluginfragment)
	{
		return gspluginfragment.listener;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field GSPluginListener listener>
	//    2    4:areturn         
	}

*/


/*
	static GSDialogListener access$600(GSPluginFragment gspluginfragment)
	{
		return gspluginfragment.dismissListener;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field GSDialogListener dismissListener>
	//    2    4:areturn         
	}

*/


/*
	static void access$700(GSPluginFragment gspluginfragment, GSObject gsobject)
	{
		gspluginfragment.onError(gsobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #131 <Method void onError(GSObject)>
		return;
	//    3    5:return          
	}

*/


/*
	static boolean access$800(GSPluginFragment gspluginfragment)
	{
		return gspluginfragment.showLoadingProgress;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field boolean showLoadingProgress>
	//    2    4:ireturn         
	}

*/


/*
	static ValueCallback access$900(GSPluginFragment gspluginfragment)
	{
		return gspluginfragment.mImagePathCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field ValueCallback mImagePathCallback>
	//    2    4:areturn         
	}

*/


/*
	static ValueCallback access$902(GSPluginFragment gspluginfragment, ValueCallback valuecallback)
	{
		gspluginfragment.mImagePathCallback = valuecallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #136 <Field ValueCallback mImagePathCallback>
		return valuecallback;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/
}
