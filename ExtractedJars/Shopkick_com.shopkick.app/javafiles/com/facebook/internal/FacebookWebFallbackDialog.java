// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.*;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

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
	//    3    3:invokespecial   #23  <Method void WebDialog(Context, String)>
		setExpectedRedirectUrl(s1);
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #27  <Method void setExpectedRedirectUrl(String)>
	//    7   11:return          
	}

	public static FacebookWebFallbackDialog newInstance(Context context, String s, String s1)
	{
		WebDialog.initDefaultTheme(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #38  <Method void WebDialog.initDefaultTheme(Context)>
		return new FacebookWebFallbackDialog(context, s, s1);
	//    2    4:new             #2   <Class FacebookWebFallbackDialog>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #40  <Method void FacebookWebFallbackDialog(Context, String, String)>
	//    8   14:areturn         
	}

	public void cancel()
	{
		WebView webview = getWebView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #44  <Method WebView getWebView()>
	//    2    4:astore_1        
		if(isPageFinished() && !isListenerCalled() && webview != null && webview.isShown())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #48  <Method boolean isPageFinished()>
	//*   5    9:ifeq            102
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #51  <Method boolean isListenerCalled()>
	//*   8   16:ifne            102
	//*   9   19:aload_1         
	//*  10   20:ifnull          102
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #56  <Method boolean WebView.isShown()>
	//*  13   27:ifne            33
	//*  14   30:goto            102
		{
			if(waitingForDialogToClose)
	//*  15   33:aload_0         
	//*  16   34:getfield        #58  <Field boolean waitingForDialogToClose>
	//*  17   37:ifeq            41
			{
				return;
	//   18   40:return          
			} else
			{
				waitingForDialogToClose = true;
	//   19   41:aload_0         
	//   20   42:iconst_1        
	//   21   43:putfield        #58  <Field boolean waitingForDialogToClose>
				StringBuilder stringbuilder = new StringBuilder();
	//   22   46:new             #60  <Class StringBuilder>
	//   23   49:dup             
	//   24   50:invokespecial   #62  <Method void StringBuilder()>
	//   25   53:astore_2        
				stringbuilder.append("javascript:");
	//   26   54:aload_2         
	//   27   55:ldc1            #64  <String "javascript:">
	//   28   57:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
				stringbuilder.append("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();");
	//   30   61:aload_2         
	//   31   62:ldc1            #70  <String "(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();">
	//   32   64:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   33   67:pop             
				webview.loadUrl(stringbuilder.toString());
	//   34   68:aload_1         
	//   35   69:aload_2         
	//   36   70:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   37   73:invokevirtual   #77  <Method void WebView.loadUrl(String)>
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
	//   38   76:new             #79  <Class Handler>
	//   39   79:dup             
	//   40   80:invokestatic    #85  <Method Looper Looper.getMainLooper()>
	//   41   83:invokespecial   #88  <Method void Handler(Looper)>
	//   42   86:new             #6   <Class FacebookWebFallbackDialog$1>
	//   43   89:dup             
	//   44   90:aload_0         
	//   45   91:invokespecial   #90  <Method void FacebookWebFallbackDialog$1(FacebookWebFallbackDialog)>
	//   46   94:ldc2w           #91  <Long 1500L>
	//   47   97:invokevirtual   #96  <Method boolean Handler.postDelayed(Runnable, long)>
	//   48  100:pop             
				return;
	//   49  101:return          
			}
		} else
		{
			super.cancel();
	//   50  102:aload_0         
	//   51  103:invokespecial   #32  <Method void WebDialog.cancel()>
			return;
	//   52  106:return          
		}
	}

	protected Bundle parseResponseUri(String s)
	{
		Bundle bundle = Utility.parseUrlQueryString(Uri.parse(s).getQuery());
	//    0    0:aload_1         
	//    1    1:invokestatic    #106 <Method Uri Uri.parse(String)>
	//    2    4:invokevirtual   #109 <Method String Uri.getQuery()>
	//    3    7:invokestatic    #114 <Method Bundle Utility.parseUrlQueryString(String)>
	//    4   10:astore_3        
		s = bundle.getString("bridge_args");
	//    5   11:aload_3         
	//    6   12:ldc1            #116 <String "bridge_args">
	//    7   14:invokevirtual   #122 <Method String Bundle.getString(String)>
	//    8   17:astore_1        
		bundle.remove("bridge_args");
	//    9   18:aload_3         
	//   10   19:ldc1            #116 <String "bridge_args">
	//   11   21:invokevirtual   #125 <Method void Bundle.remove(String)>
		if(!Utility.isNullOrEmpty(s))
	//*  12   24:aload_1         
	//*  13   25:invokestatic    #129 <Method boolean Utility.isNullOrEmpty(String)>
	//*  14   28:ifne            61
			try
			{
				bundle.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", BundleJSONConverter.convertToBundle(new JSONObject(s)));
	//   15   31:aload_3         
	//   16   32:ldc1            #131 <String "com.facebook.platform.protocol.BRIDGE_ARGS">
	//   17   34:new             #133 <Class JSONObject>
	//   18   37:dup             
	//   19   38:aload_1         
	//   20   39:invokespecial   #135 <Method void JSONObject(String)>
	//   21   42:invokestatic    #141 <Method Bundle BundleJSONConverter.convertToBundle(JSONObject)>
	//   22   45:invokevirtual   #145 <Method void Bundle.putBundle(String, Bundle)>
			}
	//*  23   48:goto            61
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  24   51:astore_1        
			{
				Utility.logd(TAG, "Unable to parse bridge_args JSON", ((Throwable) (s)));
	//   25   52:getstatic       #147 <Field String TAG>
	//   26   55:ldc1            #149 <String "Unable to parse bridge_args JSON">
	//   27   57:aload_1         
	//   28   58:invokestatic    #153 <Method void Utility.logd(String, String, Throwable)>
			}
		String s1 = bundle.getString("method_results");
	//   29   61:aload_3         
	//   30   62:ldc1            #155 <String "method_results">
	//   31   64:invokevirtual   #122 <Method String Bundle.getString(String)>
	//   32   67:astore_2        
		bundle.remove("method_results");
	//   33   68:aload_3         
	//   34   69:ldc1            #155 <String "method_results">
	//   35   71:invokevirtual   #125 <Method void Bundle.remove(String)>
		if(!Utility.isNullOrEmpty(s1))
	//*  36   74:aload_2         
	//*  37   75:invokestatic    #129 <Method boolean Utility.isNullOrEmpty(String)>
	//*  38   78:ifne            123
		{
			s = s1;
	//   39   81:aload_2         
	//   40   82:astore_1        
			if(Utility.isNullOrEmpty(s1))
	//*  41   83:aload_2         
	//*  42   84:invokestatic    #129 <Method boolean Utility.isNullOrEmpty(String)>
	//*  43   87:ifeq            93
				s = "{}";
	//   44   90:ldc1            #157 <String "{}">
	//   45   92:astore_1        
			try
			{
				bundle.putBundle("com.facebook.platform.protocol.RESULT_ARGS", BundleJSONConverter.convertToBundle(new JSONObject(s)));
	//   46   93:aload_3         
	//   47   94:ldc1            #159 <String "com.facebook.platform.protocol.RESULT_ARGS">
	//   48   96:new             #133 <Class JSONObject>
	//   49   99:dup             
	//   50  100:aload_1         
	//   51  101:invokespecial   #135 <Method void JSONObject(String)>
	//   52  104:invokestatic    #141 <Method Bundle BundleJSONConverter.convertToBundle(JSONObject)>
	//   53  107:invokevirtual   #145 <Method void Bundle.putBundle(String, Bundle)>
			}
	//*  54  110:goto            123
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  55  113:astore_1        
			{
				Utility.logd(TAG, "Unable to parse bridge_args JSON", ((Throwable) (s)));
	//   56  114:getstatic       #147 <Field String TAG>
	//   57  117:ldc1            #149 <String "Unable to parse bridge_args JSON">
	//   58  119:aload_1         
	//   59  120:invokestatic    #153 <Method void Utility.logd(String, String, Throwable)>
			}
		}
		bundle.remove("version");
	//   60  123:aload_3         
	//   61  124:ldc1            #161 <String "version">
	//   62  126:invokevirtual   #125 <Method void Bundle.remove(String)>
		bundle.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", NativeProtocol.getLatestKnownVersion());
	//   63  129:aload_3         
	//   64  130:ldc1            #163 <String "com.facebook.platform.protocol.PROTOCOL_VERSION">
	//   65  132:invokestatic    #169 <Method int NativeProtocol.getLatestKnownVersion()>
	//   66  135:invokevirtual   #173 <Method void Bundle.putInt(String, int)>
		return bundle;
	//   67  138:aload_3         
	//   68  139:areturn         
	}

	private static final int OS_BACK_BUTTON_RESPONSE_TIMEOUT_MILLISECONDS = 1500;
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
	//    1    1:invokespecial   #32  <Method void WebDialog.cancel()>
		return;
	//    2    4:return          
	}

*/
}
