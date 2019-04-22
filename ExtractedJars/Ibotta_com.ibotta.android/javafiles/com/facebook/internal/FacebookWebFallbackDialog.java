// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.*;
import android.webkit.WebView;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import org.json.JSONException;

// Referenced classes of package com.facebook.internal:
//			WebDialog, Utility, BundleJSONConverter, NativeProtocol

public class FacebookWebFallbackDialog extends WebDialog
{

	private FacebookWebFallbackDialog(Context context, String s, String s1)
	{
		super(context, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void WebDialog(Context, String)>
		setExpectedRedirectUrl(s1);
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #25  <Method void setExpectedRedirectUrl(String)>
	//    7   11:return          
	}

	public static FacebookWebFallbackDialog newInstance(Context context, String s, String s1)
	{
		WebDialog.initDefaultTheme(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #36  <Method void WebDialog.initDefaultTheme(Context)>
		return new FacebookWebFallbackDialog(context, s, s1);
	//    2    4:new             #2   <Class FacebookWebFallbackDialog>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #38  <Method void FacebookWebFallbackDialog(Context, String, String)>
	//    8   14:areturn         
	}

	public void cancel()
	{
		WebView webview = getWebView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method WebView getWebView()>
	//    2    4:astore_1        
		if(isPageFinished() && !isListenerCalled() && webview != null && webview.isShown())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #46  <Method boolean isPageFinished()>
	//*   5    9:ifeq            102
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #49  <Method boolean isListenerCalled()>
	//*   8   16:ifne            102
	//*   9   19:aload_1         
	//*  10   20:ifnull          102
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #54  <Method boolean WebView.isShown()>
	//*  13   27:ifne            33
	//*  14   30:goto            102
		{
			if(waitingForDialogToClose)
	//*  15   33:aload_0         
	//*  16   34:getfield        #56  <Field boolean waitingForDialogToClose>
	//*  17   37:ifeq            41
			{
				return;
	//   18   40:return          
			} else
			{
				waitingForDialogToClose = true;
	//   19   41:aload_0         
	//   20   42:iconst_1        
	//   21   43:putfield        #56  <Field boolean waitingForDialogToClose>
				StringBuilder stringbuilder = new StringBuilder();
	//   22   46:new             #58  <Class StringBuilder>
	//   23   49:dup             
	//   24   50:invokespecial   #60  <Method void StringBuilder()>
	//   25   53:astore_2        
				stringbuilder.append("javascript:");
	//   26   54:aload_2         
	//   27   55:ldc1            #62  <String "javascript:">
	//   28   57:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
				stringbuilder.append("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
	//   30   61:aload_2         
	//   31   62:ldc1            #68  <String "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();">
	//   32   64:invokevirtual   #66  <Method StringBuilder StringBuilder.append(String)>
	//   33   67:pop             
				webview.loadUrl(stringbuilder.toString());
	//   34   68:aload_1         
	//   35   69:aload_2         
	//   36   70:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   37   73:invokevirtual   #75  <Method void WebView.loadUrl(String)>
				(new Handler(Looper.getMainLooper())).postDelayed(new Runnable() {

					public void run()
					{
						cancel();
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field FacebookWebFallbackDialog this$0>
					//    2    4:invokestatic    #24  <Method void FacebookWebFallbackDialog.access$001(FacebookWebFallbackDialog)>
					//    3    7:return          
					}

					final FacebookWebFallbackDialog this$0;

			
			{
				this$0 = FacebookWebFallbackDialog.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FacebookWebFallbackDialog this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
, 1500L);
	//   38   76:new             #77  <Class Handler>
	//   39   79:dup             
	//   40   80:invokestatic    #83  <Method Looper Looper.getMainLooper()>
	//   41   83:invokespecial   #86  <Method void Handler(Looper)>
	//   42   86:new             #6   <Class FacebookWebFallbackDialog$1>
	//   43   89:dup             
	//   44   90:aload_0         
	//   45   91:invokespecial   #88  <Method void FacebookWebFallbackDialog$1(FacebookWebFallbackDialog)>
	//   46   94:ldc2w           #89  <Long 1500L>
	//   47   97:invokevirtual   #94  <Method boolean Handler.postDelayed(Runnable, long)>
	//   48  100:pop             
				return;
	//   49  101:return          
			}
		} else
		{
			super.cancel();
	//   50  102:aload_0         
	//   51  103:invokespecial   #30  <Method void WebDialog.cancel()>
			return;
	//   52  106:return          
		}
	}

	protected Bundle parseResponseUri(String s)
	{
		Bundle bundle = Utility.parseUrlQueryString(Uri.parse(s).getQuery());
	//    0    0:aload_1         
	//    1    1:invokestatic    #104 <Method Uri Uri.parse(String)>
	//    2    4:invokevirtual   #107 <Method String Uri.getQuery()>
	//    3    7:invokestatic    #112 <Method Bundle Utility.parseUrlQueryString(String)>
	//    4   10:astore_3        
		s = bundle.getString("bridge_args");
	//    5   11:aload_3         
	//    6   12:ldc1            #114 <String "bridge_args">
	//    7   14:invokevirtual   #120 <Method String Bundle.getString(String)>
	//    8   17:astore_1        
		bundle.remove("bridge_args");
	//    9   18:aload_3         
	//   10   19:ldc1            #114 <String "bridge_args">
	//   11   21:invokevirtual   #123 <Method void Bundle.remove(String)>
		if(!Utility.isNullOrEmpty(s))
	//*  12   24:aload_1         
	//*  13   25:invokestatic    #127 <Method boolean Utility.isNullOrEmpty(String)>
	//*  14   28:ifne            57
			try
			{
				bundle.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", BundleJSONConverter.convertToBundle(JSONObjectInstrumentation.init(s)));
	//   15   31:aload_3         
	//   16   32:ldc1            #129 <String "com.facebook.platform.protocol.BRIDGE_ARGS">
	//   17   34:aload_1         
	//   18   35:invokestatic    #135 <Method org.json.JSONObject JSONObjectInstrumentation.init(String)>
	//   19   38:invokestatic    #141 <Method Bundle BundleJSONConverter.convertToBundle(org.json.JSONObject)>
	//   20   41:invokevirtual   #145 <Method void Bundle.putBundle(String, Bundle)>
			}
	//*  21   44:goto            57
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  22   47:astore_1        
			{
				Utility.logd(TAG, "Unable to parse bridge_args JSON", ((Throwable) (s)));
	//   23   48:getstatic       #147 <Field String TAG>
	//   24   51:ldc1            #149 <String "Unable to parse bridge_args JSON">
	//   25   53:aload_1         
	//   26   54:invokestatic    #153 <Method void Utility.logd(String, String, Throwable)>
			}
		String s1 = bundle.getString("method_results");
	//   27   57:aload_3         
	//   28   58:ldc1            #155 <String "method_results">
	//   29   60:invokevirtual   #120 <Method String Bundle.getString(String)>
	//   30   63:astore_2        
		bundle.remove("method_results");
	//   31   64:aload_3         
	//   32   65:ldc1            #155 <String "method_results">
	//   33   67:invokevirtual   #123 <Method void Bundle.remove(String)>
		if(!Utility.isNullOrEmpty(s1))
	//*  34   70:aload_2         
	//*  35   71:invokestatic    #127 <Method boolean Utility.isNullOrEmpty(String)>
	//*  36   74:ifne            115
		{
			s = s1;
	//   37   77:aload_2         
	//   38   78:astore_1        
			if(Utility.isNullOrEmpty(s1))
	//*  39   79:aload_2         
	//*  40   80:invokestatic    #127 <Method boolean Utility.isNullOrEmpty(String)>
	//*  41   83:ifeq            89
				s = "{}";
	//   42   86:ldc1            #157 <String "{}">
	//   43   88:astore_1        
			try
			{
				bundle.putBundle("com.facebook.platform.protocol.RESULT_ARGS", BundleJSONConverter.convertToBundle(JSONObjectInstrumentation.init(s)));
	//   44   89:aload_3         
	//   45   90:ldc1            #159 <String "com.facebook.platform.protocol.RESULT_ARGS">
	//   46   92:aload_1         
	//   47   93:invokestatic    #135 <Method org.json.JSONObject JSONObjectInstrumentation.init(String)>
	//   48   96:invokestatic    #141 <Method Bundle BundleJSONConverter.convertToBundle(org.json.JSONObject)>
	//   49   99:invokevirtual   #145 <Method void Bundle.putBundle(String, Bundle)>
			}
	//*  50  102:goto            115
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  51  105:astore_1        
			{
				Utility.logd(TAG, "Unable to parse bridge_args JSON", ((Throwable) (s)));
	//   52  106:getstatic       #147 <Field String TAG>
	//   53  109:ldc1            #149 <String "Unable to parse bridge_args JSON">
	//   54  111:aload_1         
	//   55  112:invokestatic    #153 <Method void Utility.logd(String, String, Throwable)>
			}
		}
		bundle.remove("version");
	//   56  115:aload_3         
	//   57  116:ldc1            #161 <String "version">
	//   58  118:invokevirtual   #123 <Method void Bundle.remove(String)>
		bundle.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", NativeProtocol.getLatestKnownVersion());
	//   59  121:aload_3         
	//   60  122:ldc1            #163 <String "com.facebook.platform.protocol.PROTOCOL_VERSION">
	//   61  124:invokestatic    #169 <Method int NativeProtocol.getLatestKnownVersion()>
	//   62  127:invokevirtual   #173 <Method void Bundle.putInt(String, int)>
		return bundle;
	//   63  130:aload_3         
	//   64  131:areturn         
	}

	private static final String TAG = "com.facebook.internal.FacebookWebFallbackDialog";
	private boolean waitingForDialogToClose;

	static 
	{
	//    0    0:return          
	}


/*
	static void access$001(FacebookWebFallbackDialog facebookwebfallbackdialog)
	{
		((WebDialog) (facebookwebfallbackdialog)).WebDialog.cancel();
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void WebDialog.cancel()>
		return;
	//    2    4:return          
	}

*/
}
