// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android;

import android.app.Activity;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.gigya.socialize.*;
import com.gigya.socialize.android.event.GSAccountsEventListener;
import com.gigya.socialize.android.event.GSSocializeEventListener;
import com.gigya.socialize.android.event.GSWebBridgeListener;
import com.gigya.socialize.android.event.GSWebBridgeListenerProxy;
import com.gigya.socialize.android.log.GigyaLog;
import java.util.*;
import org.json.JSONArray;

// Referenced classes of package com.gigya.socialize.android:
//			GSAPI, GSLoginRequest, GSSession

public class GSWebBridge
{
	private static final class GSWebBridgeActions extends Enum
	{

		public static GSWebBridgeActions valueOf(String s)
		{
			return (GSWebBridgeActions)Enum.valueOf(com/gigya/socialize/android/GSWebBridge$GSWebBridgeActions, s);
		//    0    0:ldc1            #2   <Class GSWebBridge$GSWebBridgeActions>
		//    1    2:aload_0         
		//    2    3:invokestatic    #59  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class GSWebBridge$GSWebBridgeActions>
		//    4    9:areturn         
		}

		public static GSWebBridgeActions[] values()
		{
			return (GSWebBridgeActions[])((GSWebBridgeActions []) ($VALUES)).clone();
		//    0    0:getstatic       #51  <Field GSWebBridge$GSWebBridgeActions[] $VALUES>
		//    1    3:invokevirtual   #66  <Method Object _5B_Lcom.gigya.socialize.android.GSWebBridge$GSWebBridgeActions_3B_.clone()>
		//    2    6:checkcast       #62  <Class GSWebBridge$GSWebBridgeActions[]>
		//    3    9:areturn         
		}

		private static final GSWebBridgeActions $VALUES[];
		public static final GSWebBridgeActions GET_IDS;
		public static final GSWebBridgeActions IS_SESSION_VALID;
		public static final GSWebBridgeActions ON_CUSTOM_EVENT;
		public static final GSWebBridgeActions ON_JS_EXCEPTION;
		public static final GSWebBridgeActions ON_PLUGIN_EVENT;
		public static final GSWebBridgeActions REGISTER_FOR_NAMESPACE_EVENTS;
		public static final GSWebBridgeActions SEND_OAUTH_REQUEST;
		public static final GSWebBridgeActions SEND_REQUEST;

		static 
		{
			IS_SESSION_VALID = new GSWebBridgeActions("IS_SESSION_VALID", 0);
		//    0    0:new             #2   <Class GSWebBridge$GSWebBridgeActions>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "IS_SESSION_VALID">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #26  <Method void GSWebBridge$GSWebBridgeActions(String, int)>
		//    5   10:putstatic       #28  <Field GSWebBridge$GSWebBridgeActions IS_SESSION_VALID>
			SEND_REQUEST = new GSWebBridgeActions("SEND_REQUEST", 1);
		//    6   13:new             #2   <Class GSWebBridge$GSWebBridgeActions>
		//    7   16:dup             
		//    8   17:ldc1            #29  <String "SEND_REQUEST">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #26  <Method void GSWebBridge$GSWebBridgeActions(String, int)>
		//   11   23:putstatic       #31  <Field GSWebBridge$GSWebBridgeActions SEND_REQUEST>
			SEND_OAUTH_REQUEST = new GSWebBridgeActions("SEND_OAUTH_REQUEST", 2);
		//   12   26:new             #2   <Class GSWebBridge$GSWebBridgeActions>
		//   13   29:dup             
		//   14   30:ldc1            #32  <String "SEND_OAUTH_REQUEST">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #26  <Method void GSWebBridge$GSWebBridgeActions(String, int)>
		//   17   36:putstatic       #34  <Field GSWebBridge$GSWebBridgeActions SEND_OAUTH_REQUEST>
			GET_IDS = new GSWebBridgeActions("GET_IDS", 3);
		//   18   39:new             #2   <Class GSWebBridge$GSWebBridgeActions>
		//   19   42:dup             
		//   20   43:ldc1            #35  <String "GET_IDS">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #26  <Method void GSWebBridge$GSWebBridgeActions(String, int)>
		//   23   49:putstatic       #37  <Field GSWebBridge$GSWebBridgeActions GET_IDS>
			ON_PLUGIN_EVENT = new GSWebBridgeActions("ON_PLUGIN_EVENT", 4);
		//   24   52:new             #2   <Class GSWebBridge$GSWebBridgeActions>
		//   25   55:dup             
		//   26   56:ldc1            #38  <String "ON_PLUGIN_EVENT">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #26  <Method void GSWebBridge$GSWebBridgeActions(String, int)>
		//   29   62:putstatic       #40  <Field GSWebBridge$GSWebBridgeActions ON_PLUGIN_EVENT>
			ON_CUSTOM_EVENT = new GSWebBridgeActions("ON_CUSTOM_EVENT", 5);
		//   30   65:new             #2   <Class GSWebBridge$GSWebBridgeActions>
		//   31   68:dup             
		//   32   69:ldc1            #41  <String "ON_CUSTOM_EVENT">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #26  <Method void GSWebBridge$GSWebBridgeActions(String, int)>
		//   35   75:putstatic       #43  <Field GSWebBridge$GSWebBridgeActions ON_CUSTOM_EVENT>
			REGISTER_FOR_NAMESPACE_EVENTS = new GSWebBridgeActions("REGISTER_FOR_NAMESPACE_EVENTS", 6);
		//   36   78:new             #2   <Class GSWebBridge$GSWebBridgeActions>
		//   37   81:dup             
		//   38   82:ldc1            #44  <String "REGISTER_FOR_NAMESPACE_EVENTS">
		//   39   84:bipush          6
		//   40   86:invokespecial   #26  <Method void GSWebBridge$GSWebBridgeActions(String, int)>
		//   41   89:putstatic       #46  <Field GSWebBridge$GSWebBridgeActions REGISTER_FOR_NAMESPACE_EVENTS>
			ON_JS_EXCEPTION = new GSWebBridgeActions("ON_JS_EXCEPTION", 7);
		//   42   92:new             #2   <Class GSWebBridge$GSWebBridgeActions>
		//   43   95:dup             
		//   44   96:ldc1            #47  <String "ON_JS_EXCEPTION">
		//   45   98:bipush          7
		//   46  100:invokespecial   #26  <Method void GSWebBridge$GSWebBridgeActions(String, int)>
		//   47  103:putstatic       #49  <Field GSWebBridge$GSWebBridgeActions ON_JS_EXCEPTION>
			$VALUES = (new GSWebBridgeActions[] {
				IS_SESSION_VALID, SEND_REQUEST, SEND_OAUTH_REQUEST, GET_IDS, ON_PLUGIN_EVENT, ON_CUSTOM_EVENT, REGISTER_FOR_NAMESPACE_EVENTS, ON_JS_EXCEPTION
			});
		//   48  106:bipush          8
		//   49  108:anewarray       GSWebBridgeActions[]
		//   50  111:dup             
		//   51  112:iconst_0        
		//   52  113:getstatic       #28  <Field GSWebBridge$GSWebBridgeActions IS_SESSION_VALID>
		//   53  116:aastore         
		//   54  117:dup             
		//   55  118:iconst_1        
		//   56  119:getstatic       #31  <Field GSWebBridge$GSWebBridgeActions SEND_REQUEST>
		//   57  122:aastore         
		//   58  123:dup             
		//   59  124:iconst_2        
		//   60  125:getstatic       #34  <Field GSWebBridge$GSWebBridgeActions SEND_OAUTH_REQUEST>
		//   61  128:aastore         
		//   62  129:dup             
		//   63  130:iconst_3        
		//   64  131:getstatic       #37  <Field GSWebBridge$GSWebBridgeActions GET_IDS>
		//   65  134:aastore         
		//   66  135:dup             
		//   67  136:iconst_4        
		//   68  137:getstatic       #40  <Field GSWebBridge$GSWebBridgeActions ON_PLUGIN_EVENT>
		//   69  140:aastore         
		//   70  141:dup             
		//   71  142:iconst_5        
		//   72  143:getstatic       #43  <Field GSWebBridge$GSWebBridgeActions ON_CUSTOM_EVENT>
		//   73  146:aastore         
		//   74  147:dup             
		//   75  148:bipush          6
		//   76  150:getstatic       #46  <Field GSWebBridge$GSWebBridgeActions REGISTER_FOR_NAMESPACE_EVENTS>
		//   77  153:aastore         
		//   78  154:dup             
		//   79  155:bipush          7
		//   80  157:getstatic       #49  <Field GSWebBridge$GSWebBridgeActions ON_JS_EXCEPTION>
		//   81  160:aastore         
		//   82  161:putstatic       #51  <Field GSWebBridge$GSWebBridgeActions[] $VALUES>
		//*  83  164:return          
		}

		private GSWebBridgeActions(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #53  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	private GSWebBridge(Activity activity1, WebView webview, GSWebBridgeListener gswebbridgelistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void Object()>
		activity = activity1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #75  <Field Activity activity>
		webView = webview;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #77  <Field WebView webView>
		listener = new GSWebBridgeListenerProxy(gswebbridgelistener);
	//    8   14:aload_0         
	//    9   15:new             #79  <Class GSWebBridgeListenerProxy>
	//   10   18:dup             
	//   11   19:aload_3         
	//   12   20:invokespecial   #82  <Method void GSWebBridgeListenerProxy(GSWebBridgeListener)>
	//   13   23:putfield        #84  <Field GSWebBridgeListenerProxy listener>
		activity1 = ((Activity) (new StringBuilder()));
	//   14   26:new             #86  <Class StringBuilder>
	//   15   29:dup             
	//   16   30:invokespecial   #87  <Method void StringBuilder()>
	//   17   33:astore_1        
		((StringBuilder) (activity1)).append("js_");
	//   18   34:aload_1         
	//   19   35:ldc1            #39  <String "js_">
	//   20   37:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
		((StringBuilder) (activity1)).append(UUID.randomUUID().toString());
	//   22   41:aload_1         
	//   23   42:invokestatic    #97  <Method UUID UUID.randomUUID()>
	//   24   45:invokevirtual   #100 <Method String UUID.toString()>
	//   25   48:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
		bridgeId = ((StringBuilder) (activity1)).toString();
	//   27   52:aload_0         
	//   28   53:aload_1         
	//   29   54:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   30   57:putfield        #103 <Field String bridgeId>
	//   31   60:return          
	}

	public static void attach(Activity activity1, WebView webview, GSWebBridgeListener gswebbridgelistener)
	{
		if(findBridgeForWebView(webview) == null)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #126 <Method GSWebBridge findBridgeForWebView(WebView)>
	//*   2    4:ifnonnull       40
		{
			activity1 = ((Activity) (new GSWebBridge(activity1, webview, gswebbridgelistener)));
	//    3    7:new             #2   <Class GSWebBridge>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokespecial   #128 <Method void GSWebBridge(Activity, WebView, GSWebBridgeListener)>
	//    9   17:astore_0        
			bridges.add(((Object) (activity1)));
	//   10   18:getstatic       #70  <Field ArrayList bridges>
	//   11   21:aload_0         
	//   12   22:invokevirtual   #132 <Method boolean ArrayList.add(Object)>
	//   13   25:pop             
			webview.addJavascriptInterface(((Object) (new Object(((GSWebBridge) (activity1))) {

				public String getAPIKey()
				{
					return GSAPI.getInstance().getAPIKey();
				//    0    0:invokestatic    #28  <Method GSAPI GSAPI.getInstance()>
				//    1    3:invokevirtual   #30  <Method String GSAPI.getAPIKey()>
				//    2    6:areturn         
				}

				public String getAdapterName()
				{
					return "mobile";
				//    0    0:ldc1            #34  <String "mobile">
				//    1    2:areturn         
				}

				public String getFeatures()
				{
					JSONArray jsonarray = new JSONArray();
				//    0    0:new             #37  <Class JSONArray>
				//    1    3:dup             
				//    2    4:invokespecial   #38  <Method void JSONArray()>
				//    3    7:astore_3        
					GSWebBridgeActions agswebbridgeactions[] = GSWebBridgeActions.values();
				//    4    8:invokestatic    #44  <Method GSWebBridge$GSWebBridgeActions[] GSWebBridge$GSWebBridgeActions.values()>
				//    5   11:astore          4
					int j = agswebbridgeactions.length;
				//    6   13:aload           4
				//    7   15:arraylength     
				//    8   16:istore_2        
					for(int i = 0; i < j; i++)
				//*   9   17:iconst_0        
				//*  10   18:istore_1        
				//*  11   19:iload_1         
				//*  12   20:iload_2         
				//*  13   21:icmpge          49
						jsonarray.put(((Object) (agswebbridgeactions[i].toString().toLowerCase(Locale.ROOT))));
				//   14   24:aload_3         
				//   15   25:aload           4
				//   16   27:iload_1         
				//   17   28:aaload          
				//   18   29:invokevirtual   #47  <Method String GSWebBridge$GSWebBridgeActions.toString()>
				//   19   32:getstatic       #53  <Field Locale Locale.ROOT>
				//   20   35:invokevirtual   #59  <Method String String.toLowerCase(Locale)>
				//   21   38:invokevirtual   #63  <Method JSONArray JSONArray.put(Object)>
				//   22   41:pop             

				//   23   42:iload_1         
				//   24   43:iconst_1        
				//   25   44:iadd            
				//   26   45:istore_1        
				//*  27   46:goto            19
					return jsonarray.toString();
				//   28   49:aload_3         
				//   29   50:invokevirtual   #64  <Method String JSONArray.toString()>
				//   30   53:areturn         
				}

				public String getObfuscationStrategy()
				{
					GSAPI.getInstance();
				//    0    0:invokestatic    #28  <Method GSAPI GSAPI.getInstance()>
				//    1    3:pop             
					if(GSAPI.OPTION_OBFUSCATION_ENABLED)
				//*   2    4:getstatic       #69  <Field boolean GSAPI.OPTION_OBFUSCATION_ENABLED>
				//*   3    7:ifeq            13
						return "base64";
				//    4   10:ldc1            #71  <String "base64">
				//    5   12:areturn         
					else
						return "";
				//    6   13:ldc1            #73  <String "">
				//    7   15:areturn         
				}

				public boolean sendToMobile(String s, String s1, String s2)
				{
					return bridge.invoke(s, s1, s2);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field GSWebBridge val$bridge>
				//    2    4:aload_1         
				//    3    5:aload_2         
				//    4    6:aload_3         
				//    5    7:invokevirtual   #78  <Method boolean GSWebBridge.invoke(String, String, String)>
				//    6   10:ireturn         
				}

				final GSWebBridge val$bridge;

			
			{
				bridge = gswebbridge;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field GSWebBridge val$bridge>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Object()>
			//    5    9:return          
			}
			}
)), "__gigAPIAdapterSettings");
	//   14   26:aload_1         
	//   15   27:new             #6   <Class GSWebBridge$1>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:invokespecial   #135 <Method void GSWebBridge$1(GSWebBridge)>
	//   19   35:ldc1            #137 <String "__gigAPIAdapterSettings">
	//   20   37:invokevirtual   #143 <Method void WebView.addJavascriptInterface(Object, String)>
		}
	//   21   40:return          
	}

	public static void detach(WebView webview)
	{
		webview = ((WebView) (findBridgeForWebView(webview)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #126 <Method GSWebBridge findBridgeForWebView(WebView)>
	//    2    4:astore_0        
		bridges.remove(((Object) (webview)));
	//    3    5:getstatic       #70  <Field ArrayList bridges>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #148 <Method boolean ArrayList.remove(Object)>
	//    6   12:pop             
		GSAPI.getInstance().removeAccountsListener(((GSWebBridge) (webview)).accountsListener);
	//    7   13:invokestatic    #154 <Method GSAPI GSAPI.getInstance()>
	//    8   16:aload_0         
	//    9   17:getfield        #156 <Field GSAccountsEventListener accountsListener>
	//   10   20:invokevirtual   #160 <Method void GSAPI.removeAccountsListener(GSAccountsEventListener)>
		GSAPI.getInstance().removeSocializeListener(((GSWebBridge) (webview)).socializeListener);
	//   11   23:invokestatic    #154 <Method GSAPI GSAPI.getInstance()>
	//   12   26:aload_0         
	//   13   27:getfield        #162 <Field GSSocializeEventListener socializeListener>
	//   14   30:invokevirtual   #166 <Method void GSAPI.removeSocializeListener(GSSocializeEventListener)>
	//   15   33:return          
	}

	private static GSWebBridge findBridgeForWebView(WebView webview)
	{
		for(Iterator iterator = bridges.iterator(); iterator.hasNext();)
	//*   0    0:getstatic       #70  <Field ArrayList bridges>
	//*   1    3:invokevirtual   #170 <Method Iterator ArrayList.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #176 <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            36
		{
			GSWebBridge gswebbridge = (GSWebBridge)iterator.next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #180 <Method Object Iterator.next()>
	//    8   22:checkcast       #2   <Class GSWebBridge>
	//    9   25:astore_2        
			if(gswebbridge.webView == webview)
	//*  10   26:aload_2         
	//*  11   27:getfield        #77  <Field WebView webView>
	//*  12   30:aload_0         
	//*  13   31:if_acmpne       7
				return gswebbridge;
	//   14   34:aload_2         
	//   15   35:areturn         
		}

		return null;
	//   16   36:aconst_null     
	//   17   37:areturn         
	}

	private void getIDs(String s)
	{
		GSObject gsobject = new GSObject();
	//    0    0:new             #184 <Class GSObject>
	//    1    3:dup             
	//    2    4:invokespecial   #185 <Method void GSObject()>
	//    3    7:astore_2        
		gsobject.put("ucid", GSAPI.getInstance().getUCID());
	//    4    8:aload_2         
	//    5    9:ldc1            #187 <String "ucid">
	//    6   11:invokestatic    #154 <Method GSAPI GSAPI.getInstance()>
	//    7   14:invokevirtual   #190 <Method String GSAPI.getUCID()>
	//    8   17:invokevirtual   #194 <Method void GSObject.put(String, String)>
		gsobject.put("gcid", GSAPI.getInstance().getGMID());
	//    9   20:aload_2         
	//   10   21:ldc1            #196 <String "gcid">
	//   11   23:invokestatic    #154 <Method GSAPI GSAPI.getInstance()>
	//   12   26:invokevirtual   #199 <Method String GSAPI.getGMID()>
	//   13   29:invokevirtual   #194 <Method void GSObject.put(String, String)>
		invokeCallback(s, ((Object) (gsobject)));
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:aload_2         
	//   17   35:invokespecial   #109 <Method void invokeCallback(String, Object)>
	//   18   38:return          
	}

	public static boolean handleUrl(WebView webview, String s)
	{
		if(s.startsWith("gsapi://"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #203 <String "gsapi://">
	//*   2    3:invokevirtual   #209 <Method boolean String.startsWith(String)>
	//*   3    6:ifeq            47
		{
			webview = ((WebView) (findBridgeForWebView(webview)));
	//    4    9:aload_0         
	//    5   10:invokestatic    #126 <Method GSWebBridge findBridgeForWebView(WebView)>
	//    6   13:astore_0        
			if(webview != null)
	//*   7   14:aload_0         
	//*   8   15:ifnull          47
			{
				s = ((String) (Uri.parse(s)));
	//    9   18:aload_1         
	//   10   19:invokestatic    #215 <Method Uri Uri.parse(String)>
	//   11   22:astore_1        
				return ((GSWebBridge) (webview)).invoke(((Uri) (s)).getHost(), ((Uri) (s)).getPath().replace("/", ""), ((Uri) (s)).getEncodedQuery());
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokevirtual   #218 <Method String Uri.getHost()>
	//   15   28:aload_1         
	//   16   29:invokevirtual   #221 <Method String Uri.getPath()>
	//   17   32:ldc1            #223 <String "/">
	//   18   34:ldc1            #225 <String "">
	//   19   36:invokevirtual   #229 <Method String String.replace(CharSequence, CharSequence)>
	//   20   39:aload_1         
	//   21   40:invokevirtual   #232 <Method String Uri.getEncodedQuery()>
	//   22   43:invokevirtual   #236 <Method boolean invoke(String, String, String)>
	//   23   46:ireturn         
			}
		}
		return false;
	//   24   47:iconst_0        
	//   25   48:ireturn         
	}

	private void invokeCallback(final String invocation, Object obj)
	{
		String s;
		if(obj instanceof GSResponse)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #238 <Class GSResponse>
	//*   2    4:ifeq            31
			s = ((GSResponse)obj).getData().toJsonString();
	//    3    7:aload_2         
	//    4    8:checkcast       #238 <Class GSResponse>
	//    5   11:invokevirtual   #242 <Method GSObject GSResponse.getData()>
	//    6   14:invokevirtual   #245 <Method String GSObject.toJsonString()>
	//    7   17:astore_3        
		else
	//*   8   18:aload_0         
	//*   9   19:aload_3         
	//*  10   20:iconst_1        
	//*  11   21:invokestatic    #251 <Method Boolean Boolean.valueOf(boolean)>
	//*  12   24:invokespecial   #255 <Method String obfuscate(String, Boolean)>
	//*  13   27:astore_3        
	//*  14   28:goto            39
			s = obj.toString();
	//   15   31:aload_2         
	//   16   32:invokevirtual   #256 <Method String Object.toString()>
	//   17   35:astore_3        
		s = obfuscate(s, Boolean.valueOf(true));
	//*  18   36:goto            18
		GigyaLog.d("URL-STRING2", obj.toString());
	//   19   39:ldc2            #258 <String "URL-STRING2">
	//   20   42:aload_2         
	//   21   43:invokevirtual   #256 <Method String Object.toString()>
	//   22   46:invokestatic    #263 <Method void GigyaLog.d(String, String)>
		invocation = String.format("javascript:%s['%s'](%s);", new Object[] {
			"gigya._.apiAdapters.mobile.mobileCallbacks", invocation, s
		});
	//   23   49:ldc2            #265 <String "javascript:%s['%s'](%s);">
	//   24   52:iconst_3        
	//   25   53:anewarray       Object[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:ldc1            #29  <String "gigya._.apiAdapters.mobile.mobileCallbacks">
	//   29   60:aastore         
	//   30   61:dup             
	//   31   62:iconst_1        
	//   32   63:aload_1         
	//   33   64:aastore         
	//   34   65:dup             
	//   35   66:iconst_2        
	//   36   67:aload_3         
	//   37   68:aastore         
	//   38   69:invokestatic    #269 <Method String String.format(String, Object[])>
	//   39   72:astore_1        
		webView.post(new Runnable() {

			public void run()
			{
				if(android.os.Build.VERSION.SDK_INT > 18)
			//*   0    0:getstatic       #34  <Field int android.os.Build$VERSION.SDK_INT>
			//*   1    3:bipush          18
			//*   2    5:icmple          31
				{
					webView.evaluateJavascript(invocation, new ValueCallback() {

						public volatile void onReceiveValue(Object obj)
						{
							onReceiveValue((String)obj);
						//    0    0:aload_0         
						//    1    1:aload_1         
						//    2    2:checkcast       #25  <Class String>
						//    3    5:invokevirtual   #28  <Method void onReceiveValue(String)>
						//    4    8:return          
						}

						public void onReceiveValue(String s)
						{
							GigyaLog.d("Callback", s);
						//    0    0:ldc1            #30  <String "Callback">
						//    1    2:aload_1         
						//    2    3:invokestatic    #36  <Method void GigyaLog.d(String, String)>
						//    3    6:return          
						}

						final _cls6 this$1;

			
			{
				this$1 = _cls6.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field GSWebBridge$6 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
					}
);
			//    3    8:aload_0         
			//    4    9:getfield        #21  <Field GSWebBridge this$0>
			//    5   12:invokestatic    #38  <Method WebView GSWebBridge.access$100(GSWebBridge)>
			//    6   15:aload_0         
			//    7   16:getfield        #23  <Field String val$invocation>
			//    8   19:new             #13  <Class GSWebBridge$6$1>
			//    9   22:dup             
			//   10   23:aload_0         
			//   11   24:invokespecial   #41  <Method void GSWebBridge$6$1(GSWebBridge$6)>
			//   12   27:invokevirtual   #47  <Method void WebView.evaluateJavascript(String, ValueCallback)>
					return;
			//   13   30:return          
				} else
				{
					webView.loadUrl(invocation);
			//   14   31:aload_0         
			//   15   32:getfield        #21  <Field GSWebBridge this$0>
			//   16   35:invokestatic    #38  <Method WebView GSWebBridge.access$100(GSWebBridge)>
			//   17   38:aload_0         
			//   18   39:getfield        #23  <Field String val$invocation>
			//   19   42:invokevirtual   #51  <Method void WebView.loadUrl(String)>
					return;
			//   20   45:return          
				}
			}

			final GSWebBridge this$0;
			final String val$invocation;

			
			{
				this$0 = GSWebBridge.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field GSWebBridge this$0>
				invocation = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field String val$invocation>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #26  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   40   73:aload_0         
	//   41   74:getfield        #77  <Field WebView webView>
	//   42   77:new             #16  <Class GSWebBridge$6>
	//   43   80:dup             
	//   44   81:aload_0         
	//   45   82:aload_1         
	//   46   83:invokespecial   #272 <Method void GSWebBridge$6(GSWebBridge, String)>
	//   47   86:invokevirtual   #276 <Method boolean WebView.post(Runnable)>
	//   48   89:pop             
	//   49   90:return          
	}

	private void invokeGlobalEvent(final String invocation, GSObject gsobject)
	{
		GSObject gsobject1 = gsobject;
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(gsobject == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       14
			gsobject1 = new GSObject();
	//    4    6:new             #184 <Class GSObject>
	//    5    9:dup             
	//    6   10:invokespecial   #185 <Method void GSObject()>
	//    7   13:astore_3        
		gsobject1.put("eventName", invocation);
	//    8   14:aload_3         
	//    9   15:ldc2            #278 <String "eventName">
	//   10   18:aload_1         
	//   11   19:invokevirtual   #194 <Method void GSObject.put(String, String)>
		invocation = String.format("javascript:%s(%s);", new Object[] {
			"gigya._.apiAdapter.onSDKEvent", gsobject1
		});
	//   12   22:ldc2            #280 <String "javascript:%s(%s);">
	//   13   25:iconst_2        
	//   14   26:anewarray       Object[]
	//   15   29:dup             
	//   16   30:iconst_0        
	//   17   31:ldc1            #32  <String "gigya._.apiAdapter.onSDKEvent">
	//   18   33:aastore         
	//   19   34:dup             
	//   20   35:iconst_1        
	//   21   36:aload_3         
	//   22   37:aastore         
	//   23   38:invokestatic    #269 <Method String String.format(String, Object[])>
	//   24   41:astore_1        
		webView.post(new Runnable() {

			public void run()
			{
				webView.loadUrl(invocation);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field GSWebBridge this$0>
			//    2    4:invokestatic    #30  <Method WebView GSWebBridge.access$100(GSWebBridge)>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field String val$invocation>
			//    5   11:invokevirtual   #36  <Method void WebView.loadUrl(String)>
			//    6   14:return          
			}

			final GSWebBridge this$0;
			final String val$invocation;

			
			{
				this$0 = GSWebBridge.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GSWebBridge this$0>
				invocation = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String val$invocation>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   25   42:aload_0         
	//   26   43:getfield        #77  <Field WebView webView>
	//   27   46:new             #20  <Class GSWebBridge$7>
	//   28   49:dup             
	//   29   50:aload_0         
	//   30   51:aload_1         
	//   31   52:invokespecial   #281 <Method void GSWebBridge$7(GSWebBridge, String)>
	//   32   55:invokevirtual   #276 <Method boolean WebView.post(Runnable)>
	//   33   58:pop             
	//   34   59:return          
	}

	private String obfuscate(String s, Boolean boolean1)
	{
label0:
		{
label1:
			{
				GSAPI.getInstance();
	//    0    0:invokestatic    #154 <Method GSAPI GSAPI.getInstance()>
	//    1    3:pop             
				if(!GSAPI.OPTION_OBFUSCATION_ENABLED)
					break label0;
	//    2    4:getstatic       #287 <Field boolean GSAPI.OPTION_OBFUSCATION_ENABLED>
	//    3    7:ifeq            68
				String s1;
				try
				{
					s1 = Base64.encodeToString(s.getBytes("UTF-8"), false);
	//    4   10:aload_1         
	//    5   11:ldc2            #289 <String "UTF-8">
	//    6   14:invokevirtual   #293 <Method byte[] String.getBytes(String)>
	//    7   17:iconst_0        
	//    8   18:invokestatic    #299 <Method String Base64.encodeToString(byte[], boolean)>
	//    9   21:astore_3        
					if(!boolean1.booleanValue())
						break label1;
	//   10   22:aload_2         
	//   11   23:invokevirtual   #302 <Method boolean Boolean.booleanValue()>
	//   12   26:ifeq            66
					boolean1 = ((Boolean) (new StringBuilder()));
	//   13   29:new             #86  <Class StringBuilder>
	//   14   32:dup             
	//   15   33:invokespecial   #87  <Method void StringBuilder()>
	//   16   36:astore_2        
					((StringBuilder) (boolean1)).append("\"");
	//   17   37:aload_2         
	//   18   38:ldc2            #304 <String "\"">
	//   19   41:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   20   44:pop             
					((StringBuilder) (boolean1)).append(s1);
	//   21   45:aload_2         
	//   22   46:aload_3         
	//   23   47:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   24   50:pop             
					((StringBuilder) (boolean1)).append("\"");
	//   25   51:aload_2         
	//   26   52:ldc2            #304 <String "\"">
	//   27   55:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   28   58:pop             
					boolean1 = ((Boolean) (((StringBuilder) (boolean1)).toString()));
	//   29   59:aload_2         
	//   30   60:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   31   63:astore_2        
				}
	//*  32   64:aload_2         
	//*  33   65:areturn         
	//*  34   66:aload_3         
	//*  35   67:areturn         
	//*  36   68:aload_1         
	//*  37   69:areturn         
				// Misplaced declaration of an exception variable
				catch(Boolean boolean1)
	//*  38   70:astore_2        
				{
					return s;
	//   39   71:aload_1         
	//   40   72:areturn         
				}
				return ((String) (boolean1));
			}
			return s1;
		}
		return s;
	}

	private void receivePluginEvent(GSObject gsobject)
	{
		String s = gsobject.getString("sourceContainerID", ((String) (null)));
	//    0    0:aload_1         
	//    1    1:ldc2            #308 <String "sourceContainerID">
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #312 <Method String GSObject.getString(String, String)>
	//    4    8:astore_2        
		if(s != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          26
			listener.onPluginEvent(webView, gsobject, s);
	//    7   13:aload_0         
	//    8   14:getfield        #84  <Field GSWebBridgeListenerProxy listener>
	//    9   17:aload_0         
	//   10   18:getfield        #77  <Field WebView webView>
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #316 <Method void GSWebBridgeListenerProxy.onPluginEvent(WebView, GSObject, String)>
	//   14   26:return          
	}

	private void registerForNamespaceEvents(GSObject gsobject)
	{
		gsobject = ((GSObject) (gsobject.getString("namespace", "")));
	//    0    0:aload_1         
	//    1    1:ldc2            #319 <String "namespace">
	//    2    4:ldc1            #225 <String "">
	//    3    6:invokevirtual   #312 <Method String GSObject.getString(String, String)>
	//    4    9:astore_1        
		if("socialize".equals(((Object) (gsobject))) && socializeListener == null)
	//*   5   10:ldc2            #321 <String "socialize">
	//*   6   13:aload_1         
	//*   7   14:invokevirtual   #324 <Method boolean String.equals(Object)>
	//*   8   17:ifeq            50
	//*   9   20:aload_0         
	//*  10   21:getfield        #162 <Field GSSocializeEventListener socializeListener>
	//*  11   24:ifnonnull       50
		{
			socializeListener = new GSSocializeEventListener() {

				public void onConnectionAdded(String s, GSObject gsobject1, Object obj)
				{
					if(obj == null || !obj.equals(((Object) (bridgeId))))
				//*   0    0:aload_3         
				//*   1    1:ifnull          18
				//*   2    4:aload_3         
				//*   3    5:aload_0         
				//*   4    6:getfield        #17  <Field GSWebBridge this$0>
				//*   5    9:invokestatic    #27  <Method String GSWebBridge.access$300(GSWebBridge)>
				//*   6   12:invokevirtual   #31  <Method boolean Object.equals(Object)>
				//*   7   15:ifne            50
					{
						obj = ((Object) (new GSObject()));
				//    8   18:new             #33  <Class GSObject>
				//    9   21:dup             
				//   10   22:invokespecial   #34  <Method void GSObject()>
				//   11   25:astore_3        
						((GSObject) (obj)).put("user", gsobject1);
				//   12   26:aload_3         
				//   13   27:ldc1            #36  <String "user">
				//   14   29:aload_2         
				//   15   30:invokevirtual   #40  <Method void GSObject.put(String, GSObject)>
						((GSObject) (obj)).put("provider", s);
				//   16   33:aload_3         
				//   17   34:ldc1            #42  <String "provider">
				//   18   36:aload_1         
				//   19   37:invokevirtual   #45  <Method void GSObject.put(String, String)>
						invokeGlobalEvent("socialize.connectionAdded", ((GSObject) (obj)));
				//   20   40:aload_0         
				//   21   41:getfield        #17  <Field GSWebBridge this$0>
				//   22   44:ldc1            #47  <String "socialize.connectionAdded">
				//   23   46:aload_3         
				//   24   47:invokestatic    #51  <Method void GSWebBridge.access$400(GSWebBridge, String, GSObject)>
					}
				//   25   50:return          
				}

				public void onConnectionRemoved(String s, Object obj)
				{
					if(obj == null || !obj.equals(((Object) (bridgeId))))
				//*   0    0:aload_2         
				//*   1    1:ifnull          18
				//*   2    4:aload_2         
				//*   3    5:aload_0         
				//*   4    6:getfield        #17  <Field GSWebBridge this$0>
				//*   5    9:invokestatic    #27  <Method String GSWebBridge.access$300(GSWebBridge)>
				//*   6   12:invokevirtual   #31  <Method boolean Object.equals(Object)>
				//*   7   15:ifne            43
					{
						obj = ((Object) (new GSObject()));
				//    8   18:new             #33  <Class GSObject>
				//    9   21:dup             
				//   10   22:invokespecial   #34  <Method void GSObject()>
				//   11   25:astore_2        
						((GSObject) (obj)).put("provider", s);
				//   12   26:aload_2         
				//   13   27:ldc1            #42  <String "provider">
				//   14   29:aload_1         
				//   15   30:invokevirtual   #45  <Method void GSObject.put(String, String)>
						invokeGlobalEvent("socialize.connectionRemoved", ((GSObject) (obj)));
				//   16   33:aload_0         
				//   17   34:getfield        #17  <Field GSWebBridge this$0>
				//   18   37:ldc1            #55  <String "socialize.connectionRemoved">
				//   19   39:aload_2         
				//   20   40:invokestatic    #51  <Method void GSWebBridge.access$400(GSWebBridge, String, GSObject)>
					}
				//   21   43:return          
				}

				public void onLogin(String s, GSObject gsobject1, Object obj)
				{
					if(obj == null || !obj.equals(((Object) (bridgeId))))
				//*   0    0:aload_3         
				//*   1    1:ifnull          18
				//*   2    4:aload_3         
				//*   3    5:aload_0         
				//*   4    6:getfield        #17  <Field GSWebBridge this$0>
				//*   5    9:invokestatic    #27  <Method String GSWebBridge.access$300(GSWebBridge)>
				//*   6   12:invokevirtual   #31  <Method boolean Object.equals(Object)>
				//*   7   15:ifne            50
					{
						obj = ((Object) (new GSObject()));
				//    8   18:new             #33  <Class GSObject>
				//    9   21:dup             
				//   10   22:invokespecial   #34  <Method void GSObject()>
				//   11   25:astore_3        
						((GSObject) (obj)).put("user", gsobject1);
				//   12   26:aload_3         
				//   13   27:ldc1            #36  <String "user">
				//   14   29:aload_2         
				//   15   30:invokevirtual   #40  <Method void GSObject.put(String, GSObject)>
						((GSObject) (obj)).put("provider", s);
				//   16   33:aload_3         
				//   17   34:ldc1            #42  <String "provider">
				//   18   36:aload_1         
				//   19   37:invokevirtual   #45  <Method void GSObject.put(String, String)>
						invokeGlobalEvent("socialize.login", ((GSObject) (obj)));
				//   20   40:aload_0         
				//   21   41:getfield        #17  <Field GSWebBridge this$0>
				//   22   44:ldc1            #58  <String "socialize.login">
				//   23   46:aload_3         
				//   24   47:invokestatic    #51  <Method void GSWebBridge.access$400(GSWebBridge, String, GSObject)>
					}
				//   25   50:return          
				}

				public void onLogout(Object obj)
				{
					if(obj == null || !obj.equals(((Object) (bridgeId))))
				//*   0    0:aload_1         
				//*   1    1:ifnull          18
				//*   2    4:aload_1         
				//*   3    5:aload_0         
				//*   4    6:getfield        #17  <Field GSWebBridge this$0>
				//*   5    9:invokestatic    #27  <Method String GSWebBridge.access$300(GSWebBridge)>
				//*   6   12:invokevirtual   #31  <Method boolean Object.equals(Object)>
				//*   7   15:ifne            38
					{
						invokeGlobalEvent("socialize.logout", ((GSObject) (null)));
				//    8   18:aload_0         
				//    9   19:getfield        #17  <Field GSWebBridge this$0>
				//   10   22:ldc1            #62  <String "socialize.logout">
				//   11   24:aconst_null     
				//   12   25:invokestatic    #51  <Method void GSWebBridge.access$400(GSWebBridge, String, GSObject)>
						invokeGlobalEvent("accounts.logout", ((GSObject) (null)));
				//   13   28:aload_0         
				//   14   29:getfield        #17  <Field GSWebBridge this$0>
				//   15   32:ldc1            #64  <String "accounts.logout">
				//   16   34:aconst_null     
				//   17   35:invokestatic    #51  <Method void GSWebBridge.access$400(GSWebBridge, String, GSObject)>
					}
				//   18   38:return          
				}

				final GSWebBridge this$0;

			
			{
				this$0 = GSWebBridge.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GSWebBridge this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//   12   27:aload_0         
	//   13   28:new             #12  <Class GSWebBridge$4>
	//   14   31:dup             
	//   15   32:aload_0         
	//   16   33:invokespecial   #325 <Method void GSWebBridge$4(GSWebBridge)>
	//   17   36:putfield        #162 <Field GSSocializeEventListener socializeListener>
			GSAPI.getInstance().addSocializeListener(socializeListener);
	//   18   39:invokestatic    #154 <Method GSAPI GSAPI.getInstance()>
	//   19   42:aload_0         
	//   20   43:getfield        #162 <Field GSSocializeEventListener socializeListener>
	//   21   46:invokevirtual   #328 <Method void GSAPI.addSocializeListener(GSSocializeEventListener)>
			return;
	//   22   49:return          
		}
		if("accounts".equals(((Object) (gsobject))) && accountsListener == null)
	//*  23   50:ldc2            #330 <String "accounts">
	//*  24   53:aload_1         
	//*  25   54:invokevirtual   #324 <Method boolean String.equals(Object)>
	//*  26   57:ifeq            89
	//*  27   60:aload_0         
	//*  28   61:getfield        #156 <Field GSAccountsEventListener accountsListener>
	//*  29   64:ifnonnull       89
		{
			accountsListener = new GSAccountsEventListener() {

				public void onLogin(GSObject gsobject1, Object obj)
				{
					if(obj == null || !obj.equals(((Object) (bridgeId))))
				//*   0    0:aload_2         
				//*   1    1:ifnull          18
				//*   2    4:aload_2         
				//*   3    5:aload_0         
				//*   4    6:getfield        #17  <Field GSWebBridge this$0>
				//*   5    9:invokestatic    #27  <Method String GSWebBridge.access$300(GSWebBridge)>
				//*   6   12:invokevirtual   #31  <Method boolean Object.equals(Object)>
				//*   7   15:ifne            31
						invokeGlobalEvent("accounts.login", gsobject1.clone());
				//    8   18:aload_0         
				//    9   19:getfield        #17  <Field GSWebBridge this$0>
				//   10   22:ldc1            #33  <String "accounts.login">
				//   11   24:aload_1         
				//   12   25:invokevirtual   #39  <Method GSObject GSObject.clone()>
				//   13   28:invokestatic    #43  <Method void GSWebBridge.access$400(GSWebBridge, String, GSObject)>
				//   14   31:return          
				}

				public void onLogout(Object obj)
				{
					if(obj == null || !obj.equals(((Object) (bridgeId))))
				//*   0    0:aload_1         
				//*   1    1:ifnull          18
				//*   2    4:aload_1         
				//*   3    5:aload_0         
				//*   4    6:getfield        #17  <Field GSWebBridge this$0>
				//*   5    9:invokestatic    #27  <Method String GSWebBridge.access$300(GSWebBridge)>
				//*   6   12:invokevirtual   #31  <Method boolean Object.equals(Object)>
				//*   7   15:ifne            38
					{
						invokeGlobalEvent("socialize.logout", ((GSObject) (null)));
				//    8   18:aload_0         
				//    9   19:getfield        #17  <Field GSWebBridge this$0>
				//   10   22:ldc1            #47  <String "socialize.logout">
				//   11   24:aconst_null     
				//   12   25:invokestatic    #43  <Method void GSWebBridge.access$400(GSWebBridge, String, GSObject)>
						invokeGlobalEvent("accounts.logout", ((GSObject) (null)));
				//   13   28:aload_0         
				//   14   29:getfield        #17  <Field GSWebBridge this$0>
				//   15   32:ldc1            #49  <String "accounts.logout">
				//   16   34:aconst_null     
				//   17   35:invokestatic    #43  <Method void GSWebBridge.access$400(GSWebBridge, String, GSObject)>
					}
				//   18   38:return          
				}

				final GSWebBridge this$0;

			
			{
				this$0 = GSWebBridge.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GSWebBridge this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//   30   67:aload_0         
	//   31   68:new             #14  <Class GSWebBridge$5>
	//   32   71:dup             
	//   33   72:aload_0         
	//   34   73:invokespecial   #331 <Method void GSWebBridge$5(GSWebBridge)>
	//   35   76:putfield        #156 <Field GSAccountsEventListener accountsListener>
			GSAPI.getInstance().addAccountsListener(accountsListener);
	//   36   79:invokestatic    #154 <Method GSAPI GSAPI.getInstance()>
	//   37   82:aload_0         
	//   38   83:getfield        #156 <Field GSAccountsEventListener accountsListener>
	//   39   86:invokevirtual   #334 <Method void GSAPI.addAccountsListener(GSAccountsEventListener)>
		}
	//   40   89:return          
	}

	private void sendOAuthRequest(String s, GSObject gsobject, GSObject gsobject1, final String callbackId)
	{
		gsobject1 = ((GSObject) (s.split("\\.")));
	//    0    0:aload_1         
	//    1    1:ldc2            #338 <String "\\.">
	//    2    4:invokevirtual   #342 <Method String[] String.split(String)>
	//    3    7:astore_3        
		try
		{
			gsobject1 = ((GSObject) (GSLoginRequest.LoginRequestType.valueOf(((String) (gsobject1[gsobject1.length - 1])))));
	//    4    8:aload_3         
	//    5    9:aload_3         
	//    6   10:arraylength     
	//    7   11:iconst_1        
	//    8   12:isub            
	//    9   13:aaload          
	//   10   14:invokestatic    #347 <Method GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.valueOf(String)>
	//   11   17:astore_3        
		}
	//*  12   18:goto            25
	//*  13   21:getstatic       #351 <Field GSLoginRequest$LoginRequestType GSLoginRequest$LoginRequestType.login>
	//*  14   24:astore_3        
	//*  15   25:aload_0         
	//*  16   26:getfield        #84  <Field GSWebBridgeListenerProxy listener>
	//*  17   29:aload_0         
	//*  18   30:getfield        #77  <Field WebView webView>
	//*  19   33:aload_3         
	//*  20   34:aload_2         
	//*  21   35:invokevirtual   #355 <Method void GSWebBridgeListenerProxy.beforeLogin(WebView, GSLoginRequest$LoginRequestType, GSObject)>
	//*  22   38:new             #357 <Class GSLoginRequest>
	//*  23   41:dup             
	//*  24   42:aload_3         
	//*  25   43:aload_0         
	//*  26   44:getfield        #75  <Field Activity activity>
	//*  27   47:aload_2         
	//*  28   48:new             #10  <Class GSWebBridge$3>
	//*  29   51:dup             
	//*  30   52:aload_0         
	//*  31   53:aload           4
	//*  32   55:invokespecial   #358 <Method void GSWebBridge$3(GSWebBridge, String)>
	//*  33   58:aload_0         
	//*  34   59:getfield        #103 <Field String bridgeId>
	//*  35   62:invokespecial   #361 <Method void GSLoginRequest(GSLoginRequest$LoginRequestType, Activity, GSObject, GSResponseListener, Object)>
	//*  36   65:astore_3        
	//*  37   66:aload_3         
	//*  38   67:invokevirtual   #364 <Method void GSLoginRequest.send()>
	//*  39   70:return          
	//*  40   71:astore_3        
	//*  41   72:new             #238 <Class GSResponse>
	//*  42   75:dup             
	//*  43   76:aload_1         
	//*  44   77:aload_2         
	//*  45   78:ldc2            #365 <Int 0x61afa>
	//*  46   81:aload_3         
	//*  47   82:invokevirtual   #368 <Method String Exception.getMessage()>
	//*  48   85:aconst_null     
	//*  49   86:invokespecial   #371 <Method void GSResponse(String, GSObject, int, String, com.gigya.socialize.GSLogger)>
	//*  50   89:astore_1        
	//*  51   90:aload_0         
	//*  52   91:aload           4
	//*  53   93:aload_1         
	//*  54   94:invokespecial   #109 <Method void invokeCallback(String, Object)>
	//*  55   97:aload_0         
	//*  56   98:getfield        #84  <Field GSWebBridgeListenerProxy listener>
	//*  57  101:aload_0         
	//*  58  102:getfield        #77  <Field WebView webView>
	//*  59  105:aload_1         
	//*  60  106:invokevirtual   #375 <Method void GSWebBridgeListenerProxy.onLoginResponse(WebView, GSResponse)>
	//*  61  109:return          
		// Misplaced declaration of an exception variable
		catch(GSObject gsobject1)
		{
			gsobject1 = ((GSObject) (GSLoginRequest.LoginRequestType.login));
		}
		listener.beforeLogin(webView, ((GSLoginRequest.LoginRequestType) (gsobject1)), gsobject);
		gsobject1 = ((GSObject) (new GSLoginRequest(((GSLoginRequest.LoginRequestType) (gsobject1)), activity, gsobject, new GSResponseListener() {

			public void onGSResponse(String s1, GSResponse gsresponse, Object obj)
			{
				if(gsresponse.getErrorCode() != 0)
			//*   0    0:aload_2         
			//*   1    1:invokevirtual   #33  <Method int GSResponse.getErrorCode()>
			//*   2    4:ifeq            35
				{
					gsresponse.getData().put("errorCode", gsresponse.getErrorCode());
			//    3    7:aload_2         
			//    4    8:invokevirtual   #37  <Method GSObject GSResponse.getData()>
			//    5   11:ldc1            #39  <String "errorCode">
			//    6   13:aload_2         
			//    7   14:invokevirtual   #33  <Method int GSResponse.getErrorCode()>
			//    8   17:invokevirtual   #45  <Method void GSObject.put(String, int)>
					invokeCallback(callbackId, ((Object) (gsresponse)));
			//    9   20:aload_0         
			//   10   21:getfield        #19  <Field GSWebBridge this$0>
			//   11   24:aload_0         
			//   12   25:getfield        #21  <Field String val$callbackId>
			//   13   28:aload_2         
			//   14   29:invokestatic    #49  <Method void GSWebBridge.access$000(GSWebBridge, String, Object)>
				} else
			//*  15   32:goto            75
				{
					s1 = ((String) (new GSObject()));
			//   16   35:new             #41  <Class GSObject>
			//   17   38:dup             
			//   18   39:invokespecial   #50  <Method void GSObject()>
			//   19   42:astore_1        
					((GSObject) (s1)).put("userInfo", gsresponse.getData());
			//   20   43:aload_1         
			//   21   44:ldc1            #52  <String "userInfo">
			//   22   46:aload_2         
			//   23   47:invokevirtual   #37  <Method GSObject GSResponse.getData()>
			//   24   50:invokevirtual   #55  <Method void GSObject.put(String, GSObject)>
					((GSObject) (s1)).put("errorCode", gsresponse.getErrorCode());
			//   25   53:aload_1         
			//   26   54:ldc1            #39  <String "errorCode">
			//   27   56:aload_2         
			//   28   57:invokevirtual   #33  <Method int GSResponse.getErrorCode()>
			//   29   60:invokevirtual   #45  <Method void GSObject.put(String, int)>
					invokeCallback(callbackId, ((Object) (s1)));
			//   30   63:aload_0         
			//   31   64:getfield        #19  <Field GSWebBridge this$0>
			//   32   67:aload_0         
			//   33   68:getfield        #21  <Field String val$callbackId>
			//   34   71:aload_1         
			//   35   72:invokestatic    #49  <Method void GSWebBridge.access$000(GSWebBridge, String, Object)>
				}
				listener.onLoginResponse(webView, gsresponse);
			//   36   75:aload_0         
			//   37   76:getfield        #19  <Field GSWebBridge this$0>
			//   38   79:invokestatic    #59  <Method GSWebBridgeListenerProxy GSWebBridge.access$200(GSWebBridge)>
			//   39   82:aload_0         
			//   40   83:getfield        #19  <Field GSWebBridge this$0>
			//   41   86:invokestatic    #63  <Method WebView GSWebBridge.access$100(GSWebBridge)>
			//   42   89:aload_2         
			//   43   90:invokevirtual   #69  <Method void GSWebBridgeListenerProxy.onLoginResponse(WebView, GSResponse)>
			//   44   93:return          
			}

			final GSWebBridge this$0;
			final String val$callbackId;

			
			{
				this$0 = GSWebBridge.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GSWebBridge this$0>
				callbackId = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String val$callbackId>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, ((Object) (bridgeId)))));
		try
		{
			((GSLoginRequest) (gsobject1)).send();
			return;
		}
		// Misplaced declaration of an exception variable
		catch(GSObject gsobject1)
		{
			s = ((String) (new GSResponse(s, gsobject, 0x61afa, ((Exception) (gsobject1)).getMessage(), ((com.gigya.socialize.GSLogger) (null)))));
		}
		invokeCallback(callbackId, ((Object) (s)));
		listener.onLoginResponse(webView, ((GSResponse) (s)));
	//*  62  110:astore_3        
	//*  63  111:goto            21
	}

	private void sendRequest(String s, GSObject gsobject, GSObject gsobject1, final String callbackId)
	{
		boolean flag;
		if(!gsobject1.getBool("forceHttps", false) && !gsobject1.getBool("requiresSession", false))
	//*   0    0:aload_3         
	//*   1    1:ldc2            #378 <String "forceHttps">
	//*   2    4:iconst_0        
	//*   3    5:invokevirtual   #382 <Method boolean GSObject.getBool(String, boolean)>
	//*   4    8:ifne            31
	//*   5   11:aload_3         
	//*   6   12:ldc2            #384 <String "requiresSession">
	//*   7   15:iconst_0        
	//*   8   16:invokevirtual   #382 <Method boolean GSObject.getBool(String, boolean)>
	//*   9   19:ifeq            25
	//*  10   22:goto            31
			flag = false;
	//   11   25:iconst_0        
	//   12   26:istore          5
		else
	//*  13   28:goto            34
			flag = true;
	//   14   31:iconst_1        
	//   15   32:istore          5
		gsobject.put("ctag", "webbridge");
	//   16   34:aload_2         
	//   17   35:ldc2            #386 <String "ctag">
	//   18   38:ldc2            #388 <String "webbridge">
	//   19   41:invokevirtual   #194 <Method void GSObject.put(String, String)>
		gsobject1 = ((GSObject) (GSAPI.getInstance().getSession()));
	//   20   44:invokestatic    #154 <Method GSAPI GSAPI.getInstance()>
	//   21   47:invokevirtual   #392 <Method GSSession GSAPI.getSession()>
	//   22   50:astore_3        
		if(s.equals("accounts.getAccountInfo") && gsobject1 != null && ((GSSession) (gsobject1)).isValid())
	//*  23   51:aload_1         
	//*  24   52:ldc2            #394 <String "accounts.getAccountInfo">
	//*  25   55:invokevirtual   #324 <Method boolean String.equals(Object)>
	//*  26   58:ifeq            79
	//*  27   61:aload_3         
	//*  28   62:ifnull          79
	//*  29   65:aload_3         
	//*  30   66:invokevirtual   #399 <Method boolean GSSession.isValid()>
	//*  31   69:ifeq            79
			gsobject.remove("regToken");
	//   32   72:aload_2         
	//   33   73:ldc2            #401 <String "regToken">
	//   34   76:invokevirtual   #403 <Method void GSObject.remove(String)>
		gsobject1 = ((GSObject) (GSAPI.getInstance()));
	//   35   79:invokestatic    #154 <Method GSAPI GSAPI.getInstance()>
	//   36   82:astore_3        
		boolean flag1;
		if(!GSAPI.OPTION_HTTPS_ENABLED && !flag)
	//*  37   83:getstatic       #406 <Field boolean GSAPI.OPTION_HTTPS_ENABLED>
	//*  38   86:ifne            103
	//*  39   89:iload           5
	//*  40   91:ifeq            97
	//*  41   94:goto            103
			flag1 = false;
	//   42   97:iconst_0        
	//   43   98:istore          6
		else
	//*  44  100:goto            106
			flag1 = true;
	//   45  103:iconst_1        
	//   46  104:istore          6
		((GSAPI) (gsobject1)).sendRequest(s, gsobject, flag1, new GSResponseListener() {

			public void onGSResponse(String s1, GSResponse gsresponse, Object obj)
			{
				invokeCallback(callbackId, ((Object) (gsresponse)));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field GSWebBridge this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field String val$callbackId>
			//    4    8:aload_2         
			//    5    9:invokestatic    #31  <Method void GSWebBridge.access$000(GSWebBridge, String, Object)>
			//    6   12:return          
			}

			final GSWebBridge this$0;
			final String val$callbackId;

			
			{
				this$0 = GSWebBridge.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GSWebBridge this$0>
				callbackId = s;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String val$callbackId>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
, ((Object) (bridgeId)));
	//   47  106:aload_3         
	//   48  107:aload_1         
	//   49  108:aload_2         
	//   50  109:iload           6
	//   51  111:new             #8   <Class GSWebBridge$2>
	//   52  114:dup             
	//   53  115:aload_0         
	//   54  116:aload           4
	//   55  118:invokespecial   #407 <Method void GSWebBridge$2(GSWebBridge, String)>
	//   56  121:aload_0         
	//   57  122:getfield        #103 <Field String bridgeId>
	//   58  125:invokevirtual   #410 <Method void GSAPI.sendRequest(String, GSObject, boolean, GSResponseListener, Object)>
	//   59  128:return          
	}

	private String unobfuscate(String s)
	{
		GSAPI.getInstance();
	//    0    0:invokestatic    #154 <Method GSAPI GSAPI.getInstance()>
	//    1    3:pop             
		if(GSAPI.OPTION_OBFUSCATION_ENABLED)
	//*   2    4:getstatic       #287 <Field boolean GSAPI.OPTION_OBFUSCATION_ENABLED>
	//*   3    7:ifeq            27
		{
			String s1;
			try
			{
				s1 = new String(Base64.decode(s), "UTF-8");
	//    4   10:new             #205 <Class String>
	//    5   13:dup             
	//    6   14:aload_1         
	//    7   15:invokestatic    #415 <Method byte[] Base64.decode(String)>
	//    8   18:ldc2            #289 <String "UTF-8">
	//    9   21:invokespecial   #418 <Method void String(byte[], String)>
	//   10   24:astore_2        
			}
	//*  11   25:aload_2         
	//*  12   26:areturn         
	//*  13   27:aload_1         
	//*  14   28:areturn         
			catch(Exception exception)
	//*  15   29:astore_2        
			{
				return s;
	//   16   30:aload_1         
	//   17   31:areturn         
			}
			return s1;
		} else
		{
			return s;
		}
	}

	public boolean invoke(String s, String s1, String s2)
	{
		GSObject gsobject2 = new GSObject();
	//    0    0:new             #184 <Class GSObject>
	//    1    3:dup             
	//    2    4:invokespecial   #185 <Method void GSObject()>
	//    3    7:astore          10
		gsobject2.parseQueryString(s2);
	//    4    9:aload           10
	//    5   11:aload_3         
	//    6   12:invokevirtual   #423 <Method void GSObject.parseQueryString(String)>
		boolean flag1 = false;
	//    7   15:iconst_0        
	//    8   16:istore          5
		static class _cls8
		{

			static final int $SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions[];

			static 
			{
				$SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions = new int[GSWebBridgeActions.values().length];
			//    0    0:invokestatic    #18  <Method GSWebBridge$GSWebBridgeActions[] GSWebBridge$GSWebBridgeActions.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions>
				try
				{
					$SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions[GSWebBridgeActions.IS_SESSION_VALID.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions>
			//    5   12:getstatic       #24  <Field GSWebBridge$GSWebBridgeActions GSWebBridge$GSWebBridgeActions.IS_SESSION_VALID>
			//    6   15:invokevirtual   #28  <Method int GSWebBridge$GSWebBridgeActions.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions>
			//*  10   23:getstatic       #31  <Field GSWebBridge$GSWebBridgeActions GSWebBridge$GSWebBridgeActions.SEND_REQUEST>
			//*  11   26:invokevirtual   #28  <Method int GSWebBridge$GSWebBridgeActions.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions>
			//*  15   34:getstatic       #34  <Field GSWebBridge$GSWebBridgeActions GSWebBridge$GSWebBridgeActions.SEND_OAUTH_REQUEST>
			//*  16   37:invokevirtual   #28  <Method int GSWebBridge$GSWebBridgeActions.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions>
			//*  20   45:getstatic       #37  <Field GSWebBridge$GSWebBridgeActions GSWebBridge$GSWebBridgeActions.GET_IDS>
			//*  21   48:invokevirtual   #28  <Method int GSWebBridge$GSWebBridgeActions.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions>
			//*  25   56:getstatic       #40  <Field GSWebBridge$GSWebBridgeActions GSWebBridge$GSWebBridgeActions.ON_PLUGIN_EVENT>
			//*  26   59:invokevirtual   #28  <Method int GSWebBridge$GSWebBridgeActions.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions>
			//*  30   67:getstatic       #43  <Field GSWebBridge$GSWebBridgeActions GSWebBridge$GSWebBridgeActions.REGISTER_FOR_NAMESPACE_EVENTS>
			//*  31   70:invokevirtual   #28  <Method int GSWebBridge$GSWebBridgeActions.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   35   77:astore_0        
				try
				{
					$SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions[GSWebBridgeActions.SEND_REQUEST.ordinal()] = 2;
				}
			//*  36   78:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   37   81:astore_0        
				try
				{
					$SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions[GSWebBridgeActions.SEND_OAUTH_REQUEST.ordinal()] = 3;
				}
			//*  38   82:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   39   85:astore_0        
				try
				{
					$SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions[GSWebBridgeActions.GET_IDS.ordinal()] = 4;
				}
			//*  40   86:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   41   89:astore_0        
				try
				{
					$SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions[GSWebBridgeActions.ON_PLUGIN_EVENT.ordinal()] = 5;
				}
			//*  42   90:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   43   93:astore_0        
				try
				{
					$SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions[GSWebBridgeActions.REGISTER_FOR_NAMESPACE_EVENTS.ordinal()] = 6;
				}
			//*  44   94:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   45   97:astore_0        
			//*  46   98:return          
			}
		}

		boolean flag;
		String s3;
		GSWebBridgeActions gswebbridgeactions;
		GSObject gsobject;
		GSObject gsobject1;
		try
		{
			gswebbridgeactions = GSWebBridgeActions.valueOf(s.toUpperCase(Locale.ROOT));
	//    9   18:aload_1         
	//   10   19:getstatic       #429 <Field Locale Locale.ROOT>
	//   11   22:invokevirtual   #433 <Method String String.toUpperCase(Locale)>
	//   12   25:invokestatic    #436 <Method GSWebBridge$GSWebBridgeActions GSWebBridge$GSWebBridgeActions.valueOf(String)>
	//   13   28:astore          7
		}
	//*  14   30:aload           10
	//*  15   32:ldc2            #438 <String "callbackID">
	//*  16   35:aconst_null     
	//*  17   36:invokevirtual   #312 <Method String GSObject.getString(String, String)>
	//*  18   39:astore          6
	//*  19   41:new             #184 <Class GSObject>
	//*  20   44:dup             
	//*  21   45:invokespecial   #185 <Method void GSObject()>
	//*  22   48:astore          8
	//*  23   50:aload           8
	//*  24   52:aload_0         
	//*  25   53:aload           10
	//*  26   55:ldc2            #440 <String "params">
	//*  27   58:aconst_null     
	//*  28   59:invokevirtual   #312 <Method String GSObject.getString(String, String)>
	//*  29   62:invokespecial   #442 <Method String unobfuscate(String)>
	//*  30   65:invokevirtual   #423 <Method void GSObject.parseQueryString(String)>
	//*  31   68:new             #184 <Class GSObject>
	//*  32   71:dup             
	//*  33   72:invokespecial   #185 <Method void GSObject()>
	//*  34   75:astore          9
	//*  35   77:aload           9
	//*  36   79:aload           10
	//*  37   81:ldc2            #444 <String "settings">
	//*  38   84:aconst_null     
	//*  39   85:invokevirtual   #312 <Method String GSObject.getString(String, String)>
	//*  40   88:invokevirtual   #423 <Method void GSObject.parseQueryString(String)>
	//*  41   91:invokestatic    #447 <Method boolean GigyaLog.getDebugMode()>
	//*  42   94:ifeq            212
	//*  43   97:getstatic       #63  <Field String TAG>
	//*  44  100:astore          10
	//*  45  102:new             #86  <Class StringBuilder>
	//*  46  105:dup             
	//*  47  106:invokespecial   #87  <Method void StringBuilder()>
	//*  48  109:astore          11
	//*  49  111:aload           11
	//*  50  113:ldc2            #449 <String "invoking">
	//*  51  116:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//*  52  119:pop             
	//*  53  120:aload           11
	//*  54  122:aload_1         
	//*  55  123:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//*  56  126:pop             
	//*  57  127:aload_2         
	//*  58  128:ifnull          176
	//*  59  131:aload_2         
	//*  60  132:invokevirtual   #452 <Method boolean String.isEmpty()>
	//*  61  135:ifne            176
	//*  62  138:new             #86  <Class StringBuilder>
	//*  63  141:dup             
	//*  64  142:invokespecial   #87  <Method void StringBuilder()>
	//*  65  145:astore_1        
	//*  66  146:aload_1         
	//*  67  147:ldc2            #454 <String " (method: ">
	//*  68  150:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//*  69  153:pop             
	//*  70  154:aload_1         
	//*  71  155:aload_2         
	//*  72  156:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//*  73  159:pop             
	//*  74  160:aload_1         
	//*  75  161:ldc2            #456 <String ")">
	//*  76  164:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//*  77  167:pop             
	//*  78  168:aload_1         
	//*  79  169:invokevirtual   #101 <Method String StringBuilder.toString()>
	//*  80  172:astore_1        
	//*  81  173:goto            179
	//*  82  176:ldc1            #225 <String "">
	//*  83  178:astore_1        
	//*  84  179:aload           11
	//*  85  181:aload_1         
	//*  86  182:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//*  87  185:pop             
	//*  88  186:aload           11
	//*  89  188:ldc2            #458 <String " with: ">
	//*  90  191:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//*  91  194:pop             
	//*  92  195:aload           11
	//*  93  197:aload_3         
	//*  94  198:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//*  95  201:pop             
	//*  96  202:aload           10
	//*  97  204:aload           11
	//*  98  206:invokevirtual   #101 <Method String StringBuilder.toString()>
	//*  99  209:invokestatic    #263 <Method void GigyaLog.d(String, String)>
	//* 100  212:getstatic       #462 <Field int[] GSWebBridge$8.$SwitchMap$com$gigya$socialize$android$GSWebBridge$GSWebBridgeActions>
	//* 101  215:aload           7
	//* 102  217:invokevirtual   #466 <Method int GSWebBridge$GSWebBridgeActions.ordinal()>
	//* 103  220:iaload          
	//* 104  221:tableswitch     1 6: default 260
	//	               1 312
	//	               2 299
	//	               3 286
	//	               4 278
	//	               5 270
	//	               6 262
	//* 105  260:iconst_1        
	//* 106  261:ireturn         
	//* 107  262:aload_0         
	//* 108  263:aload           8
	//* 109  265:invokespecial   #468 <Method void registerForNamespaceEvents(GSObject)>
	//* 110  268:iconst_1        
	//* 111  269:ireturn         
	//* 112  270:aload_0         
	//* 113  271:aload           8
	//* 114  273:invokespecial   #470 <Method void receivePluginEvent(GSObject)>
	//* 115  276:iconst_1        
	//* 116  277:ireturn         
	//* 117  278:aload_0         
	//* 118  279:aload           6
	//* 119  281:invokespecial   #472 <Method void getIDs(String)>
	//* 120  284:iconst_1        
	//* 121  285:ireturn         
	//* 122  286:aload_0         
	//* 123  287:aload_2         
	//* 124  288:aload           8
	//* 125  290:aload           9
	//* 126  292:aload           6
	//* 127  294:invokespecial   #474 <Method void sendOAuthRequest(String, GSObject, GSObject, String)>
	//* 128  297:iconst_1        
	//* 129  298:ireturn         
	//* 130  299:aload_0         
	//* 131  300:aload_2         
	//* 132  301:aload           8
	//* 133  303:aload           9
	//* 134  305:aload           6
	//* 135  307:invokespecial   #476 <Method void sendRequest(String, GSObject, GSObject, String)>
	//* 136  310:iconst_1        
	//* 137  311:ireturn         
	//* 138  312:invokestatic    #154 <Method GSAPI GSAPI.getInstance()>
	//* 139  315:invokevirtual   #392 <Method GSSession GSAPI.getSession()>
	//* 140  318:astore_1        
	//* 141  319:iload           5
	//* 142  321:istore          4
	//* 143  323:aload_1         
	//* 144  324:ifnull          341
	//* 145  327:iload           5
	//* 146  329:istore          4
	//* 147  331:aload_1         
	//* 148  332:invokevirtual   #399 <Method boolean GSSession.isValid()>
	//* 149  335:ifeq            341
	//* 150  338:iconst_1        
	//* 151  339:istore          4
	//* 152  341:aload_0         
	//* 153  342:aload           6
	//* 154  344:iload           4
	//* 155  346:invokestatic    #251 <Method Boolean Boolean.valueOf(boolean)>
	//* 156  349:invokespecial   #109 <Method void invokeCallback(String, Object)>
	//* 157  352:iconst_1        
	//* 158  353:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 159  354:astore_1        
		{
			return false;
	//  160  355:iconst_0        
	//  161  356:ireturn         
		}
		s3 = gsobject2.getString("callbackID", ((String) (null)));
		gsobject = new GSObject();
		gsobject.parseQueryString(unobfuscate(gsobject2.getString("params", ((String) (null)))));
		gsobject1 = new GSObject();
		gsobject1.parseQueryString(gsobject2.getString("settings", ((String) (null))));
		if(GigyaLog.getDebugMode())
		{
			String s4 = TAG;
			StringBuilder stringbuilder = new StringBuilder();
			stringbuilder.append("invoking");
			stringbuilder.append(s);
			if(s1 != null && !s1.isEmpty())
			{
				s = ((String) (new StringBuilder()));
				((StringBuilder) (s)).append(" (method: ");
				((StringBuilder) (s)).append(s1);
				((StringBuilder) (s)).append(")");
				s = ((StringBuilder) (s)).toString();
			} else
			{
				s = "";
			}
			stringbuilder.append(s);
			stringbuilder.append(" with: ");
			stringbuilder.append(s2);
			GigyaLog.d(s4, stringbuilder.toString());
		}
		switch(_cls8..SwitchMap.com.gigya.socialize.android.GSWebBridge.GSWebBridgeActions[gswebbridgeactions.ordinal()])
		{
		default:
			return true;

		case 6: // '\006'
			registerForNamespaceEvents(gsobject);
			return true;

		case 5: // '\005'
			receivePluginEvent(gsobject);
			return true;

		case 4: // '\004'
			getIDs(s3);
			return true;

		case 3: // '\003'
			sendOAuthRequest(s1, gsobject, gsobject1, s3);
			return true;

		case 2: // '\002'
			sendRequest(s1, gsobject, gsobject1, s3);
			return true;

		case 1: // '\001'
			s = ((String) (GSAPI.getInstance().getSession()));
			flag = flag1;
			break;
		}
		if(s != null)
		{
			flag = flag1;
			if(((GSSession) (s)).isValid())
				flag = true;
		}
		invokeCallback(s3, ((Object) (Boolean.valueOf(flag))));
		return true;
	}

	private static final String CALLBACK_JS_PATH = "gigya._.apiAdapters.mobile.mobileCallbacks";
	private static final String GLOBAL_EVENTS_JS_PATH = "gigya._.apiAdapter.onSDKEvent";
	protected static final String REDIRECT_URL_SCHEME = "gsapi";
	private static String TAG = ((Class) (com/gigya/socialize/android/GSWebBridge)).getCanonicalName();
	private static final String WEB_BRIDGE_CONTEXT_PREFIX = "js_";
	private static ArrayList bridges = new ArrayList();
	private GSAccountsEventListener accountsListener;
	private Activity activity;
	private String bridgeId;
	private GSWebBridgeListenerProxy listener;
	private GSSocializeEventListener socializeListener;
	private WebView webView;

	static 
	{
	//    0    0:ldc1            #2   <Class GSWebBridge>
	//    1    2:invokevirtual   #61  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #63  <Field String TAG>
	//    3    8:new             #65  <Class ArrayList>
	//    4   11:dup             
	//    5   12:invokespecial   #68  <Method void ArrayList()>
	//    6   15:putstatic       #70  <Field ArrayList bridges>
	//*   7   18:return          
	}


/*
	static void access$000(GSWebBridge gswebbridge, String s, Object obj)
	{
		gswebbridge.invokeCallback(s, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #109 <Method void invokeCallback(String, Object)>
		return;
	//    4    6:return          
	}

*/


/*
	static WebView access$100(GSWebBridge gswebbridge)
	{
		return gswebbridge.webView;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field WebView webView>
	//    2    4:areturn         
	}

*/


/*
	static GSWebBridgeListenerProxy access$200(GSWebBridge gswebbridge)
	{
		return gswebbridge.listener;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field GSWebBridgeListenerProxy listener>
	//    2    4:areturn         
	}

*/


/*
	static String access$300(GSWebBridge gswebbridge)
	{
		return gswebbridge.bridgeId;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field String bridgeId>
	//    2    4:areturn         
	}

*/


/*
	static void access$400(GSWebBridge gswebbridge, String s, GSObject gsobject)
	{
		gswebbridge.invokeGlobalEvent(s, gsobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #121 <Method void invokeGlobalEvent(String, GSObject)>
		return;
	//    4    6:return          
	}

*/
}
