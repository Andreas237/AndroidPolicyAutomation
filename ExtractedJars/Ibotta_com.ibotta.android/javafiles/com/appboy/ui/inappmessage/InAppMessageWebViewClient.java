// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.appboy.models.IInAppMessage;
import com.appboy.support.*;
import com.appboy.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.appboy.ui.support.UriUtils;
import java.util.*;

// Referenced classes of package com.appboy.ui.inappmessage:
//			AppboyInAppMessageManager

public class InAppMessageWebViewClient extends WebViewClient
{

	public InAppMessageWebViewClient(Context context, IInAppMessage iinappmessage, IInAppMessageWebViewClientListener iinappmessagewebviewclientlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void WebViewClient()>
		mInAppMessageWebViewClientListener = iinappmessagewebviewclientlistener;
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:putfield        #53  <Field IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener>
		mInAppMessage = iinappmessage;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #55  <Field IInAppMessage mInAppMessage>
		mContext = context;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #57  <Field Context mContext>
	//   11   19:return          
	}

	private void appendBridgeJavascript(WebView webview)
	{
		String s = AppboyFileUtils.getAssetFileStringContents(mContext.getAssets(), "appboy-html-in-app-message-javascript-component.js");
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field Context mContext>
	//    2    4:invokevirtual   #65  <Method android.content.res.AssetManager Context.getAssets()>
	//    3    7:ldc1            #67  <String "appboy-html-in-app-message-javascript-component.js">
	//    4    9:invokestatic    #73  <Method String AppboyFileUtils.getAssetFileStringContents(android.content.res.AssetManager, String)>
	//    5   12:astore_2        
		if(s == null)
	//*   6   13:aload_2         
	//*   7   14:ifnonnull       34
		{
			AppboyInAppMessageManager.getInstance().hideCurrentlyDisplayingInAppMessage(false);
	//    8   17:invokestatic    #79  <Method AppboyInAppMessageManager AppboyInAppMessageManager.getInstance()>
	//    9   20:iconst_0        
	//   10   21:invokevirtual   #83  <Method void AppboyInAppMessageManager.hideCurrentlyDisplayingInAppMessage(boolean)>
			AppboyLogger.e(TAG, "Failed to get HTML in-app message javascript additions");
	//   11   24:getstatic       #46  <Field String TAG>
	//   12   27:ldc1            #85  <String "Failed to get HTML in-app message javascript additions">
	//   13   29:invokestatic    #89  <Method int AppboyLogger.e(String, String)>
	//   14   32:pop             
			return;
	//   15   33:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   16   34:new             #91  <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #92  <Method void StringBuilder()>
	//   19   41:astore_3        
			stringbuilder.append("javascript:");
	//   20   42:aload_3         
	//   21   43:ldc1            #20  <String "javascript:">
	//   22   45:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
			stringbuilder.append(s);
	//   24   49:aload_3         
	//   25   50:aload_2         
	//   26   51:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
			webview.loadUrl(stringbuilder.toString());
	//   28   55:aload_1         
	//   29   56:aload_3         
	//   30   57:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   31   60:invokevirtual   #106 <Method void WebView.loadUrl(String)>
			return;
	//   32   63:return          
		}
	}

	static Bundle getBundleFromUrl(String s)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #111 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #112 <Method void Bundle()>
	//    3    7:astore_1        
		if(StringUtils.isNullOrBlank(s))
	//*   4    8:aload_0         
	//*   5    9:invokestatic    #118 <Method boolean StringUtils.isNullOrBlank(String)>
	//*   6   12:ifeq            17
			return bundle;
	//    7   15:aload_1         
	//    8   16:areturn         
		s = ((String) (UriUtils.getQueryParameters(Uri.parse(s))));
	//    9   17:aload_0         
	//   10   18:invokestatic    #124 <Method Uri Uri.parse(String)>
	//   11   21:invokestatic    #130 <Method Map UriUtils.getQueryParameters(Uri)>
	//   12   24:astore_0        
		String s1;
		for(Iterator iterator = ((Map) (s)).keySet().iterator(); iterator.hasNext(); bundle.putString(s1, (String)((Map) (s)).get(((Object) (s1)))))
	//*  13   25:aload_0         
	//*  14   26:invokeinterface #136 <Method Set Map.keySet()>
	//*  15   31:invokeinterface #142 <Method Iterator Set.iterator()>
	//*  16   36:astore_2        
	//*  17   37:aload_2         
	//*  18   38:invokeinterface #148 <Method boolean Iterator.hasNext()>
	//*  19   43:ifeq            74
			s1 = (String)iterator.next();
	//   20   46:aload_2         
	//   21   47:invokeinterface #152 <Method Object Iterator.next()>
	//   22   52:checkcast       #154 <Class String>
	//   23   55:astore_3        

	//   24   56:aload_1         
	//   25   57:aload_3         
	//   26   58:aload_0         
	//   27   59:aload_3         
	//   28   60:invokeinterface #158 <Method Object Map.get(Object)>
	//   29   65:checkcast       #154 <Class String>
	//   30   68:invokevirtual   #162 <Method void Bundle.putString(String, String)>
	//*  31   71:goto            37
		return bundle;
	//   32   74:aload_1         
	//   33   75:areturn         
	}

	public void onPageFinished(WebView webview, String s)
	{
		appendBridgeJavascript(webview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #167 <Method void appendBridgeJavascript(WebView)>
	//    3    5:return          
	}

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		if(mInAppMessageWebViewClientListener == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener>
	//*   2    4:ifnonnull       18
		{
			AppboyLogger.i(TAG, "InAppMessageWebViewClient was given null IInAppMessageWebViewClientListener listener. Returning true.");
	//    3    7:getstatic       #46  <Field String TAG>
	//    4   10:ldc1            #171 <String "InAppMessageWebViewClient was given null IInAppMessageWebViewClientListener listener. Returning true.">
	//    5   12:invokestatic    #174 <Method int AppboyLogger.i(String, String)>
	//    6   15:pop             
			return true;
	//    7   16:iconst_1        
	//    8   17:ireturn         
		}
		if(StringUtils.isNullOrBlank(s))
	//*   9   18:aload_2         
	//*  10   19:invokestatic    #118 <Method boolean StringUtils.isNullOrBlank(String)>
	//*  11   22:ifeq            36
		{
			AppboyLogger.i(TAG, "InAppMessageWebViewClient.shouldOverrideUrlLoading was given null or blank url. Returning true.");
	//   12   25:getstatic       #46  <Field String TAG>
	//   13   28:ldc1            #176 <String "InAppMessageWebViewClient.shouldOverrideUrlLoading was given null or blank url. Returning true.">
	//   14   30:invokestatic    #174 <Method int AppboyLogger.i(String, String)>
	//   15   33:pop             
			return true;
	//   16   34:iconst_1        
	//   17   35:ireturn         
		}
		Object obj = ((Object) (Uri.parse(s)));
	//   18   36:aload_2         
	//   19   37:invokestatic    #124 <Method Uri Uri.parse(String)>
	//   20   40:astore_3        
		webview = ((WebView) (getBundleFromUrl(s)));
	//   21   41:aload_2         
	//   22   42:invokestatic    #178 <Method Bundle getBundleFromUrl(String)>
	//   23   45:astore_1        
		if(((Uri) (obj)).getScheme().equals("appboy"))
	//*  24   46:aload_3         
	//*  25   47:invokevirtual   #181 <Method String Uri.getScheme()>
	//*  26   50:ldc1            #8   <String "appboy">
	//*  27   52:invokevirtual   #185 <Method boolean String.equals(Object)>
	//*  28   55:ifeq            141
		{
			obj = ((Object) (((Uri) (obj)).getAuthority()));
	//   29   58:aload_3         
	//   30   59:invokevirtual   #188 <Method String Uri.getAuthority()>
	//   31   62:astore_3        
			if(((String) (obj)).equals("close"))
	//*  32   63:aload_3         
	//*  33   64:ldc1            #11  <String "close">
	//*  34   66:invokevirtual   #185 <Method boolean String.equals(Object)>
	//*  35   69:ifeq            89
			{
				mInAppMessageWebViewClientListener.onCloseAction(mInAppMessage, s, ((Bundle) (webview)));
	//   36   72:aload_0         
	//   37   73:getfield        #53  <Field IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener>
	//   38   76:aload_0         
	//   39   77:getfield        #55  <Field IInAppMessage mInAppMessage>
	//   40   80:aload_2         
	//   41   81:aload_1         
	//   42   82:invokeinterface #194 <Method void IInAppMessageWebViewClientListener.onCloseAction(IInAppMessage, String, Bundle)>
				return true;
	//   43   87:iconst_1        
	//   44   88:ireturn         
			}
			if(((String) (obj)).equals("feed"))
	//*  45   89:aload_3         
	//*  46   90:ldc1            #17  <String "feed">
	//*  47   92:invokevirtual   #185 <Method boolean String.equals(Object)>
	//*  48   95:ifeq            115
			{
				mInAppMessageWebViewClientListener.onNewsfeedAction(mInAppMessage, s, ((Bundle) (webview)));
	//   49   98:aload_0         
	//   50   99:getfield        #53  <Field IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener>
	//   51  102:aload_0         
	//   52  103:getfield        #55  <Field IInAppMessage mInAppMessage>
	//   53  106:aload_2         
	//   54  107:aload_1         
	//   55  108:invokeinterface #197 <Method void IInAppMessageWebViewClientListener.onNewsfeedAction(IInAppMessage, String, Bundle)>
				return true;
	//   56  113:iconst_1        
	//   57  114:ireturn         
			}
			if(((String) (obj)).equals("customEvent"))
	//*  58  115:aload_3         
	//*  59  116:ldc1            #14  <String "customEvent">
	//*  60  118:invokevirtual   #185 <Method boolean String.equals(Object)>
	//*  61  121:ifeq            139
				mInAppMessageWebViewClientListener.onCustomEventAction(mInAppMessage, s, ((Bundle) (webview)));
	//   62  124:aload_0         
	//   63  125:getfield        #53  <Field IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener>
	//   64  128:aload_0         
	//   65  129:getfield        #55  <Field IInAppMessage mInAppMessage>
	//   66  132:aload_2         
	//   67  133:aload_1         
	//   68  134:invokeinterface #200 <Method void IInAppMessageWebViewClientListener.onCustomEventAction(IInAppMessage, String, Bundle)>
			return true;
	//   69  139:iconst_1        
	//   70  140:ireturn         
		} else
		{
			mInAppMessageWebViewClientListener.onOtherUrlAction(mInAppMessage, s, ((Bundle) (webview)));
	//   71  141:aload_0         
	//   72  142:getfield        #53  <Field IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener>
	//   73  145:aload_0         
	//   74  146:getfield        #55  <Field IInAppMessage mInAppMessage>
	//   75  149:aload_2         
	//   76  150:aload_1         
	//   77  151:invokeinterface #203 <Method void IInAppMessageWebViewClientListener.onOtherUrlAction(IInAppMessage, String, Bundle)>
			return true;
	//   78  156:iconst_1        
	//   79  157:ireturn         
		}
	}

	private static final String APPBOY_INAPP_MESSAGE_SCHEME = "appboy";
	private static final String AUTHORITY_NAME_CLOSE = "close";
	private static final String AUTHORITY_NAME_CUSTOM_EVENT = "customEvent";
	private static final String AUTHORITY_NAME_NEWSFEED = "feed";
	public static final String JAVASCRIPT_PREFIX = "javascript:";
	public static final String QUERY_NAME_BUTTON_ID = "abButtonId";
	public static final String QUERY_NAME_DEEPLINK = "abDeepLink";
	public static final String QUERY_NAME_EXTERNAL_OPEN = "abExternalOpen";
	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/inappmessage/InAppMessageWebViewClient);
	private Context mContext;
	private final IInAppMessage mInAppMessage;
	private IInAppMessageWebViewClientListener mInAppMessageWebViewClientListener;

	static 
	{
	//    0    0:ldc1            #2   <Class InAppMessageWebViewClient>
	//    1    2:invokestatic    #44  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #46  <Field String TAG>
	//*   3    8:return          
	}
}
