// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hwCloudJs.service.jsapi;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import android.widget.Toast;
import com.huawei.hwCloudJs.JsClientApi;
import com.huawei.hwCloudJs.api.IJsWebview;
import com.huawei.hwCloudJs.core.JSRequest;
import com.huawei.hwCloudJs.core.JsCallback;
import com.huawei.hwCloudJs.core.a.b;
import com.huawei.hwCloudJs.core.webview.MainWebviewActivity;
import com.huawei.hwCloudJs.d.a;
import com.huawei.hwCloudJs.d.d;
import com.huawei.hwCloudJs.d.e;
import com.huawei.hwCloudJs.d.f;
import com.huawei.hwCloudJs.service.jsmsg.NativeMsg;
import com.huawei.hwCloudJs.support.a.c;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.huawei.hwCloudJs.service.jsapi:
//			a

public class JsCoreApi extends JSRequest
{
	public static final class ChannelMessageReq extends NativeMsg
	{

		public String getChannelName()
		{
			return channelName;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field String channelName>
		//    2    4:areturn         
		}

		public String getData()
		{
			return data;
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field String data>
		//    2    4:areturn         
		}

		public String getOrigin()
		{
			return origin;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field String origin>
		//    2    4:areturn         
		}

		public String getSource()
		{
			return source;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field String source>
		//    2    4:areturn         
		}

		public void setChannelName(String s)
		{
			channelName = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #31  <Field String channelName>
		//    3    5:return          
		}

		public void setData(String s)
		{
			data = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #34  <Field String data>
		//    3    5:return          
		}

		public void setOrigin(String s)
		{
			origin = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #37  <Field String origin>
		//    3    5:return          
		}

		public void setSource(String s)
		{
			source = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #40  <Field String source>
		//    3    5:return          
		}

		private String channelName;
		private String data;
		private String origin;
		private String source;

		public ChannelMessageReq()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void NativeMsg()>
		//    2    4:return          
		}
	}


	public JsCoreApi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void JSRequest()>
	//    2    4:return          
	}

	private void a(Context context, UrlDescription urldescription)
	{
		if(context == null || urldescription == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          8
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       17
		{
			Log.e("JsCoreApi", "JS redirectTo  null");
	//    4    8:ldc1            #24  <String "JsCoreApi">
	//    5   10:ldc1            #32  <String "JS redirectTo  null">
	//    6   12:invokestatic    #38  <Method int Log.e(String, String)>
	//    7   15:pop             
			return;
	//    8   16:return          
		}
	/* block-local class not found */
	class UrlDescription {}

		String s = urldescription.getToUrl();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #42  <Method String JsCoreApi$UrlDescription.getToUrl()>
	//   11   21:astore_3        
		urldescription = ((UrlDescription) (urldescription.getTitle()));
	//   12   22:aload_2         
	//   13   23:invokevirtual   #45  <Method String JsCoreApi$UrlDescription.getTitle()>
	//   14   26:astore_2        
		Intent intent = new Intent(context, com/huawei/hwCloudJs/core/webview/MainWebviewActivity);
	//   15   27:new             #47  <Class Intent>
	//   16   30:dup             
	//   17   31:aload_1         
	//   18   32:ldc1            #49  <Class MainWebviewActivity>
	//   19   34:invokespecial   #52  <Method void Intent(Context, Class)>
	//   20   37:astore          4
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*  21   39:aload_3         
	//*  22   40:invokestatic    #58  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  23   43:ifne            64
		{
			intent.putExtra("url", s);
	//   24   46:aload           4
	//   25   48:ldc1            #60  <String "url">
	//   26   50:aload_3         
	//   27   51:invokevirtual   #64  <Method Intent Intent.putExtra(String, String)>
	//   28   54:pop             
			intent.putExtra("urlTitle", ((String) (urldescription)));
	//   29   55:aload           4
	//   30   57:ldc1            #66  <String "urlTitle">
	//   31   59:aload_2         
	//   32   60:invokevirtual   #64  <Method Intent Intent.putExtra(String, String)>
	//   33   63:pop             
		}
		context.startActivity(intent);
	//   34   64:aload_1         
	//   35   65:aload           4
	//   36   67:invokevirtual   #72  <Method void Context.startActivity(Intent)>
		if(context instanceof Activity)
	//*  37   70:aload_1         
	//*  38   71:instanceof      #74  <Class Activity>
	//*  39   74:ifeq            84
			((Activity)context).finish();
	//   40   77:aload_1         
	//   41   78:checkcast       #74  <Class Activity>
	//   42   81:invokevirtual   #77  <Method void Activity.finish()>
	//   43   84:return          
	}

	private boolean a(WebView webview, String s)
	{
		Object obj;
		obj = ((Object) (JsClientApi.getjsWebviewClass()));
	//    0    0:invokestatic    #88  <Method Class JsClientApi.getjsWebviewClass()>
	//    1    3:astore          4
		if(obj == null)
			break MISSING_BLOCK_LABEL_64;
	//    2    5:aload           4
	//    3    7:ifnull          64
		boolean flag;
		obj = ((Class) (obj)).newInstance();
	//    4   10:aload           4
	//    5   12:invokevirtual   #94  <Method Object Class.newInstance()>
	//    6   15:astore          4
		if(!(obj instanceof IJsWebview))
			break MISSING_BLOCK_LABEL_64;
	//    7   17:aload           4
	//    8   19:instanceof      #96  <Class IJsWebview>
	//    9   22:ifeq            40
		flag = ((IJsWebview)obj).overrideUrlLoading(webview, s);
	//   10   25:aload           4
	//   11   27:checkcast       #96  <Class IJsWebview>
	//   12   30:aload_1         
	//   13   31:aload_2         
	//   14   32:invokeinterface #99  <Method boolean IJsWebview.overrideUrlLoading(WebView, String)>
	//   15   37:istore_3        
		return flag;
	//   16   38:iload_3         
	//   17   39:ireturn         
	//*  18   40:goto            64
		webview;
	//   19   43:astore_1        
		Log.e("JsCoreApi", "Js initJsWebview InstantiationException");
	//   20   44:ldc1            #24  <String "JsCoreApi">
	//   21   46:ldc1            #101 <String "Js initJsWebview InstantiationException">
	//   22   48:invokestatic    #38  <Method int Log.e(String, String)>
	//   23   51:pop             
		break MISSING_BLOCK_LABEL_64;
	//   24   52:goto            64
		webview;
	//   25   55:astore_1        
		Log.e("JsCoreApi", "Js initJsWebview IllegalAccessException");
	//   26   56:ldc1            #24  <String "JsCoreApi">
	//   27   58:ldc1            #103 <String "Js initJsWebview IllegalAccessException">
	//   28   60:invokestatic    #38  <Method int Log.e(String, String)>
	//   29   63:pop             
		return false;
	//   30   64:iconst_0        
	//   31   65:ireturn         
	}

	public void checkAvailability(CheckAvailReq checkavailreq, JsCallback jscallback)
	{
	/* block-local class not found */
	class CheckAvailReq {}

		JSONObject jsonobject;
		Log.i("JsCoreApi", "checkAvailability done");
	//    0    0:ldc1            #24  <String "JsCoreApi">
	//    1    2:ldc1            #112 <String "checkAvailability done">
	//    2    4:invokestatic    #115 <Method int Log.i(String, String)>
	//    3    7:pop             
		if(checkavailreq == null || checkavailreq.getApiList() == null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          19
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #119 <Method List JsCoreApi$CheckAvailReq.getApiList()>
	//*   8   16:ifnonnull       24
		{
			jscallback.failure();
	//    9   19:aload_2         
	//   10   20:invokevirtual   #124 <Method void JsCallback.failure()>
			return;
	//   11   23:return          
		}
		jsonobject = new JSONObject();
	//   12   24:new             #126 <Class JSONObject>
	//   13   27:dup             
	//   14   28:invokespecial   #127 <Method void JSONObject()>
	//   15   31:astore          6
		int j;
		checkavailreq = ((CheckAvailReq) (checkavailreq.getApiList()));
	//   16   33:aload_1         
	//   17   34:invokevirtual   #119 <Method List JsCoreApi$CheckAvailReq.getApiList()>
	//   18   37:astore_1        
		j = ((List) (checkavailreq)).size();
	//   19   38:aload_1         
	//   20   39:invokeinterface #133 <Method int List.size()>
	//   21   44:istore          4
		int i = 0;
	//   22   46:iconst_0        
	//   23   47:istore_3        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   24   48:iload_3         
	//   25   49:iload           4
	//   26   51:icmpge          100
		String s = (String)((List) (checkavailreq)).get(i);
	//   27   54:aload_1         
	//   28   55:iload_3         
	//   29   56:invokeinterface #137 <Method Object List.get(int)>
	//   30   61:checkcast       #139 <Class String>
	//   31   64:astore          7
		boolean flag;
		if(b.a().b(s) != null)
	//*  32   66:invokestatic    #144 <Method b b.a()>
	//*  33   69:aload           7
	//*  34   71:invokevirtual   #148 <Method com.huawei.hwCloudJs.core.a.a b.b(String)>
	//*  35   74:ifnull          124
			flag = true;
	//   36   77:iconst_1        
	//   37   78:istore          5
		else
	//*  38   80:goto            83
	//*  39   83:aload           6
	//*  40   85:aload           7
	//*  41   87:iload           5
	//*  42   89:invokevirtual   #152 <Method JSONObject JSONObject.put(String, boolean)>
	//*  43   92:pop             
	//*  44   93:iload_3         
	//*  45   94:iconst_1        
	//*  46   95:iadd            
	//*  47   96:istore_3        
	//*  48   97:goto            48
	//*  49  100:aload_2         
	//*  50  101:aload           6
	//*  51  103:invokevirtual   #155 <Method String JSONObject.toString()>
	//*  52  106:invokevirtual   #159 <Method void JsCallback.success(String)>
	//*  53  109:return          
	//*  54  110:astore_1        
	//*  55  111:ldc1            #24  <String "JsCoreApi">
	//*  56  113:ldc1            #161 <String "JS checkAvailability JSONException">
	//*  57  115:invokestatic    #38  <Method int Log.e(String, String)>
	//*  58  118:pop             
	//*  59  119:aload_2         
	//*  60  120:invokevirtual   #124 <Method void JsCallback.failure()>
	//*  61  123:return          
			flag = false;
	//   62  124:iconst_0        
	//   63  125:istore          5
		jsonobject.put(s, flag);
		i++;
		if(true) goto _L2; else goto _L1
_L1:
		try
		{
			jscallback.success(jsonobject.toString());
			return;
		}
		// Misplaced declaration of an exception variable
		catch(CheckAvailReq checkavailreq)
		{
			Log.e("JsCoreApi", "JS checkAvailability JSONException");
		}
		jscallback.failure();
		return;
	//*  64  127:goto            83
	}

	public void close(JsCallback jscallback)
	{
		Log.i("JsCoreApi", "JS close Webview ");
	//    0    0:ldc1            #24  <String "JsCoreApi">
	//    1    2:ldc1            #169 <String "JS close Webview ">
	//    2    4:invokestatic    #115 <Method int Log.i(String, String)>
	//    3    7:pop             
		Object obj = ((Object) (jscallback.getWebView()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #173 <Method WebView JsCallback.getWebView()>
	//    6   12:astore_2        
		if(obj == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       30
		{
			Log.e("JsCoreApi", "JS close Webview null");
	//    9   17:ldc1            #24  <String "JsCoreApi">
	//   10   19:ldc1            #175 <String "JS close Webview null">
	//   11   21:invokestatic    #38  <Method int Log.e(String, String)>
	//   12   24:pop             
			jscallback.failure();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #124 <Method void JsCallback.failure()>
			return;
	//   15   29:return          
		}
		obj = ((Object) (((WebView) (obj)).getContext()));
	//   16   30:aload_2         
	//   17   31:invokevirtual   #181 <Method Context WebView.getContext()>
	//   18   34:astore_2        
		if(obj instanceof Activity)
	//*  19   35:aload_2         
	//*  20   36:instanceof      #74  <Class Activity>
	//*  21   39:ifeq            50
		{
			((Activity)obj).finish();
	//   22   42:aload_2         
	//   23   43:checkcast       #74  <Class Activity>
	//   24   46:invokevirtual   #77  <Method void Activity.finish()>
			return;
	//   25   49:return          
		} else
		{
			jscallback.failure();
	//   26   50:aload_1         
	//   27   51:invokevirtual   #124 <Method void JsCallback.failure()>
			return;
	//   28   54:return          
		}
	}

	public void getAppInfo(String s, JsCallback jscallback)
	{
		Log.i("JsCoreApi", "JS getAppInfo");
	//    0    0:ldc1            #24  <String "JsCoreApi">
	//    1    2:ldc1            #185 <String "JS getAppInfo">
	//    2    4:invokestatic    #115 <Method int Log.i(String, String)>
	//    3    7:pop             
		Object obj = ((Object) (jscallback.getWebView()));
	//    4    8:aload_2         
	//    5    9:invokevirtual   #173 <Method WebView JsCallback.getWebView()>
	//    6   12:astore          4
		if(obj == null)
	//*   7   14:aload           4
	//*   8   16:ifnonnull       24
		{
			jscallback.failure();
	//    9   19:aload_2         
	//   10   20:invokevirtual   #124 <Method void JsCallback.failure()>
			return;
	//   11   23:return          
		}
		Context context = ((WebView) (obj)).getContext();
	//   12   24:aload           4
	//   13   26:invokevirtual   #181 <Method Context WebView.getContext()>
	//   14   29:astore          6
		if(!f.c(context, s))
	//*  15   31:aload           6
	//*  16   33:aload_1         
	//*  17   34:invokestatic    #191 <Method boolean f.c(Context, String)>
	//*  18   37:ifne            55
		{
			Log.e("JsCoreApi", "JS getAppInfo package not Installed!");
	//   19   40:ldc1            #24  <String "JsCoreApi">
	//   20   42:ldc1            #193 <String "JS getAppInfo package not Installed!">
	//   21   44:invokestatic    #38  <Method int Log.e(String, String)>
	//   22   47:pop             
			jscallback.failure(11);
	//   23   48:aload_2         
	//   24   49:bipush          11
	//   25   51:invokevirtual   #196 <Method void JsCallback.failure(int)>
			return;
	//   26   54:return          
		}
		obj = ((Object) (com.huawei.hwCloudJs.service.jsapi.a.a().a(context, s)));
	//   27   55:invokestatic    #201 <Method com.huawei.hwCloudJs.service.jsapi.a com.huawei.hwCloudJs.service.jsapi.a.a()>
	//   28   58:aload           6
	//   29   60:aload_1         
	//   30   61:invokevirtual   #204 <Method String com.huawei.hwCloudJs.service.jsapi.a.a(Context, String)>
	//   31   64:astore          4
		String s1 = f.a(context, s);
	//   32   66:aload           6
	//   33   68:aload_1         
	//   34   69:invokestatic    #205 <Method String f.a(Context, String)>
	//   35   72:astore          5
		int i = f.b(context, s);
	//   36   74:aload           6
	//   37   76:aload_1         
	//   38   77:invokestatic    #208 <Method int f.b(Context, String)>
	//   39   80:istore_3        
		try
		{
			s = ((String) (new JSONObject()));
	//   40   81:new             #126 <Class JSONObject>
	//   41   84:dup             
	//   42   85:invokespecial   #127 <Method void JSONObject()>
	//   43   88:astore_1        
			((JSONObject) (s)).put("sign", obj);
	//   44   89:aload_1         
	//   45   90:ldc1            #210 <String "sign">
	//   46   92:aload           4
	//   47   94:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//   48   97:pop             
			((JSONObject) (s)).put("versionName", ((Object) (s1)));
	//   49   98:aload_1         
	//   50   99:ldc1            #215 <String "versionName">
	//   51  101:aload           5
	//   52  103:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//   53  106:pop             
			((JSONObject) (s)).put("versionCode", ((Object) ((new StringBuilder()).append(i).append("").toString())));
	//   54  107:aload_1         
	//   55  108:ldc1            #217 <String "versionCode">
	//   56  110:new             #219 <Class StringBuilder>
	//   57  113:dup             
	//   58  114:invokespecial   #220 <Method void StringBuilder()>
	//   59  117:iload_3         
	//   60  118:invokevirtual   #224 <Method StringBuilder StringBuilder.append(int)>
	//   61  121:ldc1            #226 <String "">
	//   62  123:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   63  126:invokevirtual   #230 <Method String StringBuilder.toString()>
	//   64  129:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//   65  132:pop             
			jscallback.success(((JSONObject) (s)).toString());
	//   66  133:aload_2         
	//   67  134:aload_1         
	//   68  135:invokevirtual   #155 <Method String JSONObject.toString()>
	//   69  138:invokevirtual   #159 <Method void JsCallback.success(String)>
			return;
	//   70  141:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  71  142:astore_1        
		{
			Log.e("JsCoreApi", "JS getAppInfo JSONException!");
	//   72  143:ldc1            #24  <String "JsCoreApi">
	//   73  145:ldc1            #232 <String "JS getAppInfo JSONException!">
	//   74  147:invokestatic    #38  <Method int Log.e(String, String)>
	//   75  150:pop             
		}
		jscallback.failure();
	//   76  151:aload_2         
	//   77  152:invokevirtual   #124 <Method void JsCallback.failure()>
	//   78  155:return          
	}

	public void getBrowserInfo(JsCallback jscallback)
	{
		Log.i("JsCoreApi", "JS getBrowserInfo");
	//    0    0:ldc1            #24  <String "JsCoreApi">
	//    1    2:ldc1            #235 <String "JS getBrowserInfo">
	//    2    4:invokestatic    #115 <Method int Log.i(String, String)>
	//    3    7:pop             
		Object obj = ((Object) (jscallback.getWebView()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #173 <Method WebView JsCallback.getWebView()>
	//    6   12:astore_2        
		if(obj == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       22
		{
			jscallback.failure();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #124 <Method void JsCallback.failure()>
			return;
	//   11   21:return          
		} else
		{
			obj = ((Object) (((WebView) (obj)).getContext()));
	//   12   22:aload_2         
	//   13   23:invokevirtual   #181 <Method Context WebView.getContext()>
	//   14   26:astore_2        
			jscallback.success(((Object) (com.huawei.hwCloudJs.service.jsapi.a.a().a(((Context) (obj))))));
	//   15   27:aload_1         
	//   16   28:invokestatic    #201 <Method com.huawei.hwCloudJs.service.jsapi.a com.huawei.hwCloudJs.service.jsapi.a.a()>
	//   17   31:aload_2         
	//   18   32:invokevirtual   #238 <Method com.huawei.hwCloudJs.service.jsapi.bean.BrowserInfo com.huawei.hwCloudJs.service.jsapi.a.a(Context)>
	//   19   35:invokevirtual   #241 <Method void JsCallback.success(Object)>
			return;
	//   20   38:return          
		}
	}

	public void getNetworkType(JsCallback jscallback)
	{
		Log.i("JsCoreApi", "JS  getNetworkType");
	//    0    0:ldc1            #24  <String "JsCoreApi">
	//    1    2:ldc1            #244 <String "JS  getNetworkType">
	//    2    4:invokestatic    #115 <Method int Log.i(String, String)>
	//    3    7:pop             
		String s = d.b();
	//    4    8:invokestatic    #248 <Method String d.b()>
	//    5   11:astore_2        
		JSONObject jsonobject = new JSONObject();
	//    6   12:new             #126 <Class JSONObject>
	//    7   15:dup             
	//    8   16:invokespecial   #127 <Method void JSONObject()>
	//    9   19:astore_3        
		try
		{
			jsonobject.put("networkType", ((Object) (s)));
	//   10   20:aload_3         
	//   11   21:ldc1            #250 <String "networkType">
	//   12   23:aload_2         
	//   13   24:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//   14   27:pop             
			jscallback.success(jsonobject.toString());
	//   15   28:aload_1         
	//   16   29:aload_3         
	//   17   30:invokevirtual   #155 <Method String JSONObject.toString()>
	//   18   33:invokevirtual   #159 <Method void JsCallback.success(String)>
			return;
	//   19   36:return          
		}
		catch(JSONException jsonexception)
	//*  20   37:astore_2        
		{
			jscallback.failure();
	//   21   38:aload_1         
	//   22   39:invokevirtual   #124 <Method void JsCallback.failure()>
		}
	//   23   42:return          
	}

	public void getSystemInfo(JsCallback jscallback)
	{
		try
		{
			JSONObject jsonobject = new JSONObject();
	//    0    0:new             #126 <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #127 <Method void JSONObject()>
	//    3    7:astore_2        
			jsonobject.put("model", ((Object) (com.huawei.hwCloudJs.d.a.c())));
	//    4    8:aload_2         
	//    5    9:ldc1            #253 <String "model">
	//    6   11:invokestatic    #257 <Method String a.c()>
	//    7   14:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//    8   17:pop             
			jsonobject.put("romVersion", ((Object) (com.huawei.hwCloudJs.d.a.d())));
	//    9   18:aload_2         
	//   10   19:ldc2            #259 <String "romVersion">
	//   11   22:invokestatic    #262 <Method String a.d()>
	//   12   25:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//   13   28:pop             
			jsonobject.put("osVersion", ((Object) (com.huawei.hwCloudJs.d.a.b())));
	//   14   29:aload_2         
	//   15   30:ldc2            #264 <String "osVersion">
	//   16   33:invokestatic    #265 <Method String a.b()>
	//   17   36:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//   18   39:pop             
			jsonobject.put("region", ((Object) (com.huawei.hwCloudJs.d.a.f())));
	//   19   40:aload_2         
	//   20   41:ldc2            #267 <String "region">
	//   21   44:invokestatic    #270 <Method String a.f()>
	//   22   47:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//   23   50:pop             
			jsonobject.put("language", ((Object) (com.huawei.hwCloudJs.d.a.e())));
	//   24   51:aload_2         
	//   25   52:ldc2            #272 <String "language">
	//   26   55:invokestatic    #274 <Method String a.e()>
	//   27   58:invokevirtual   #213 <Method JSONObject JSONObject.put(String, Object)>
	//   28   61:pop             
			jscallback.success(jsonobject.toString());
	//   29   62:aload_1         
	//   30   63:aload_2         
	//   31   64:invokevirtual   #155 <Method String JSONObject.toString()>
	//   32   67:invokevirtual   #159 <Method void JsCallback.success(String)>
			return;
	//   33   70:return          
		}
		catch(JSONException jsonexception)
	//*  34   71:astore_2        
		{
			jscallback.failure();
	//   35   72:aload_1         
	//   36   73:invokevirtual   #124 <Method void JsCallback.failure()>
		}
	//   37   76:return          
	}

	public void navigateTo(UrlDescription urldescription, JsCallback jscallback)
	{
		Log.i("JsCoreApi", "JS  navigateTo");
	//    0    0:ldc1            #24  <String "JsCoreApi">
	//    1    2:ldc2            #278 <String "JS  navigateTo">
	//    2    5:invokestatic    #115 <Method int Log.i(String, String)>
	//    3    8:pop             
		if(urldescription == null || !f.a(urldescription.getToUrl()))
	//*   4    9:aload_1         
	//*   5   10:ifnull          23
	//*   6   13:aload_1         
	//*   7   14:invokevirtual   #42  <Method String JsCoreApi$UrlDescription.getToUrl()>
	//*   8   17:invokestatic    #281 <Method boolean f.a(String)>
	//*   9   20:ifne            39
		{
			Log.e("JsCoreApi", "JS  navigateTo JS_RET_CODE_PARSE_PARAM_ERROR");
	//   10   23:ldc1            #24  <String "JsCoreApi">
	//   11   25:ldc2            #283 <String "JS  navigateTo JS_RET_CODE_PARSE_PARAM_ERROR">
	//   12   28:invokestatic    #38  <Method int Log.e(String, String)>
	//   13   31:pop             
			jscallback.failure(13);
	//   14   32:aload_2         
	//   15   33:bipush          13
	//   16   35:invokevirtual   #196 <Method void JsCallback.failure(int)>
			return;
	//   17   38:return          
		}
		WebView webview = jscallback.getWebView();
	//   18   39:aload_2         
	//   19   40:invokevirtual   #173 <Method WebView JsCallback.getWebView()>
	//   20   43:astore_3        
		if(webview == null)
	//*  21   44:aload_3         
	//*  22   45:ifnonnull       53
		{
			jscallback.failure();
	//   23   48:aload_2         
	//   24   49:invokevirtual   #124 <Method void JsCallback.failure()>
			return;
	//   25   52:return          
		}
		if(a(webview, urldescription.getToUrl()))
	//*  26   53:aload_0         
	//*  27   54:aload_3         
	//*  28   55:aload_1         
	//*  29   56:invokevirtual   #42  <Method String JsCoreApi$UrlDescription.getToUrl()>
	//*  30   59:invokespecial   #285 <Method boolean a(WebView, String)>
	//*  31   62:ifeq            81
		{
			Log.e("JsCoreApi", "JS  navigateTo JS_RET_CODE_PARSE_PARAM_ERROR overrideLoadingUrl");
	//   32   65:ldc1            #24  <String "JsCoreApi">
	//   33   67:ldc2            #287 <String "JS  navigateTo JS_RET_CODE_PARSE_PARAM_ERROR overrideLoadingUrl">
	//   34   70:invokestatic    #38  <Method int Log.e(String, String)>
	//   35   73:pop             
			jscallback.failure(13);
	//   36   74:aload_2         
	//   37   75:bipush          13
	//   38   77:invokevirtual   #196 <Method void JsCallback.failure(int)>
			return;
	//   39   80:return          
		} else
		{
			JsClientApi.navigateTo(webview.getContext(), urldescription);
	//   40   81:aload_3         
	//   41   82:invokevirtual   #181 <Method Context WebView.getContext()>
	//   42   85:aload_1         
	//   43   86:invokestatic    #289 <Method void JsClientApi.navigateTo(Context, JsCoreApi$UrlDescription)>
			return;
	//   44   89:return          
		}
	}

	public void postChannelMessage(ChannelMessageReq channelmessagereq, JsCallback jscallback)
	{
		WebView webview;
		Object obj;
		String s;
		Log.i("JsCoreApi", "JS  postChannelMessage");
	//    0    0:ldc1            #24  <String "JsCoreApi">
	//    1    2:ldc2            #295 <String "JS  postChannelMessage">
	//    2    5:invokestatic    #115 <Method int Log.i(String, String)>
	//    3    8:pop             
		if(channelmessagereq == null)
	//*   4    9:aload_1         
	//*   5   10:ifnonnull       29
		{
			Log.e("JsCoreApi", "JS postChannelMessage JS_CONFIG_RET_CODE_PARSE_PARAM_ERROR");
	//    6   13:ldc1            #24  <String "JsCoreApi">
	//    7   15:ldc2            #297 <String "JS postChannelMessage JS_CONFIG_RET_CODE_PARSE_PARAM_ERROR">
	//    8   18:invokestatic    #38  <Method int Log.e(String, String)>
	//    9   21:pop             
			jscallback.failure(13);
	//   10   22:aload_2         
	//   11   23:bipush          13
	//   12   25:invokevirtual   #196 <Method void JsCallback.failure(int)>
			return;
	//   13   28:return          
		}
		webview = jscallback.getWebView();
	//   14   29:aload_2         
	//   15   30:invokevirtual   #173 <Method WebView JsCallback.getWebView()>
	//   16   33:astore_3        
		if(webview == null)
	//*  17   34:aload_3         
	//*  18   35:ifnonnull       43
		{
			jscallback.failure();
	//   19   38:aload_2         
	//   20   39:invokevirtual   #124 <Method void JsCallback.failure()>
			return;
	//   21   42:return          
		}
		obj = ((Object) (com.huawei.hwCloudJs.d.a.a(webview)));
	//   22   43:aload_3         
	//   23   44:invokestatic    #300 <Method String a.a(WebView)>
	//   24   47:astore          4
		s = jscallback.getwebviewId();
	//   25   49:aload_2         
	//   26   50:invokevirtual   #303 <Method String JsCallback.getwebviewId()>
	//   27   53:astore          5
		webview = null;
	//   28   55:aconst_null     
	//   29   56:astore_3        
		obj = ((Object) (new URL(((String) (obj)))));
	//   30   57:new             #305 <Class URL>
	//   31   60:dup             
	//   32   61:aload           4
	//   33   63:invokespecial   #307 <Method void URL(String)>
	//   34   66:astore          4
		obj = ((Object) ((new StringBuilder()).append(((URL) (obj)).getProtocol()).append("://").append(((URL) (obj)).getAuthority()).toString()));
	//   35   68:new             #219 <Class StringBuilder>
	//   36   71:dup             
	//   37   72:invokespecial   #220 <Method void StringBuilder()>
	//   38   75:aload           4
	//   39   77:invokevirtual   #310 <Method String URL.getProtocol()>
	//   40   80:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   41   83:ldc2            #312 <String "://">
	//   42   86:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   43   89:aload           4
	//   44   91:invokevirtual   #315 <Method String URL.getAuthority()>
	//   45   94:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   46   97:invokevirtual   #230 <Method String StringBuilder.toString()>
	//   47  100:astore          4
		jscallback = ((JsCallback) (obj));
	//   48  102:aload           4
	//   49  104:astore_2        
		break MISSING_BLOCK_LABEL_125;
	//   50  105:goto            125
		MalformedURLException malformedurlexception;
		malformedurlexception;
	//   51  108:astore          4
		Log.e("JsCoreApi", "JS postChannelMessage MalformedURLException");
	//   52  110:ldc1            #24  <String "JsCoreApi">
	//   53  112:ldc2            #317 <String "JS postChannelMessage MalformedURLException">
	//   54  115:invokestatic    #38  <Method int Log.e(String, String)>
	//   55  118:pop             
		jscallback.failure();
	//   56  119:aload_2         
	//   57  120:invokevirtual   #124 <Method void JsCallback.failure()>
		jscallback = ((JsCallback) (webview));
	//   58  123:aload_3         
	//   59  124:astore_2        
		channelmessagereq.setOrigin(((String) (jscallback)));
	//   60  125:aload_1         
	//   61  126:aload_2         
	//   62  127:invokevirtual   #320 <Method void JsCoreApi$ChannelMessageReq.setOrigin(String)>
		channelmessagereq.setSource(s);
	//   63  130:aload_1         
	//   64  131:aload           5
	//   65  133:invokevirtual   #323 <Method void JsCoreApi$ChannelMessageReq.setSource(String)>
		com.huawei.hwCloudJs.service.jsmsg.a.a().a(((com.huawei.hwCloudJs.support.b.d) (channelmessagereq)));
	//   66  136:invokestatic    #328 <Method com.huawei.hwCloudJs.service.jsmsg.a com.huawei.hwCloudJs.service.jsmsg.a.a()>
	//   67  139:aload_1         
	//   68  140:invokevirtual   #331 <Method void com.huawei.hwCloudJs.service.jsmsg.a.a(com.huawei.hwCloudJs.support.b.d)>
		return;
	//   69  143:return          
	}

	public void preload(PreloadReq preloadreq, JsCallback jscallback)
	{
		Log.i("JsCoreApi", "JS  preload");
	//    0    0:ldc1            #24  <String "JsCoreApi">
	//    1    2:ldc2            #335 <String "JS  preload">
	//    2    5:invokestatic    #115 <Method int Log.i(String, String)>
	//    3    8:pop             
	/* block-local class not found */
	class PreloadReq {}

		if(preloadreq == null || preloadreq.getUrlList() == null)
	//*   4    9:aload_1         
	//*   5   10:ifnull          20
	//*   6   13:aload_1         
	//*   7   14:invokevirtual   #338 <Method List JsCoreApi$PreloadReq.getUrlList()>
	//*   8   17:ifnonnull       36
		{
			Log.e("JsCoreApi", "JS  preload JS_RET_CODE_PARSE_PARAM_ERROR");
	//    9   20:ldc1            #24  <String "JsCoreApi">
	//   10   22:ldc2            #340 <String "JS  preload JS_RET_CODE_PARSE_PARAM_ERROR">
	//   11   25:invokestatic    #38  <Method int Log.e(String, String)>
	//   12   28:pop             
			jscallback.failure(13);
	//   13   29:aload_2         
	//   14   30:bipush          13
	//   15   32:invokevirtual   #196 <Method void JsCallback.failure(int)>
			return;
	//   16   35:return          
		} else
		{
			c.a((String[])(String[])preloadreq.getUrlList().toArray(((Object []) (new String[0]))), preloadreq.getFlag());
	//   17   36:aload_1         
	//   18   37:invokevirtual   #338 <Method List JsCoreApi$PreloadReq.getUrlList()>
	//   19   40:iconst_0        
	//   20   41:anewarray       String[]
	//   21   44:invokeinterface #344 <Method Object[] List.toArray(Object[])>
	//   22   49:checkcast       #346 <Class String[]>
	//   23   52:checkcast       #346 <Class String[]>
	//   24   55:aload_1         
	//   25   56:invokevirtual   #349 <Method int JsCoreApi$PreloadReq.getFlag()>
	//   26   59:invokestatic    #354 <Method void c.a(String[], int)>
			return;
	//   27   62:return          
		}
	}

	public void redirectTo(UrlDescription urldescription, JsCallback jscallback)
	{
		if(urldescription == null || !f.a(urldescription.getToUrl()))
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #42  <Method String JsCoreApi$UrlDescription.getToUrl()>
	//*   4    8:invokestatic    #281 <Method boolean f.a(String)>
	//*   5   11:ifne            30
		{
			Log.e("JsCoreApi", "JS  redirectTo JS_RET_CODE_PARSE_PARAM_ERROR");
	//    6   14:ldc1            #24  <String "JsCoreApi">
	//    7   16:ldc2            #357 <String "JS  redirectTo JS_RET_CODE_PARSE_PARAM_ERROR">
	//    8   19:invokestatic    #38  <Method int Log.e(String, String)>
	//    9   22:pop             
			jscallback.failure(13);
	//   10   23:aload_2         
	//   11   24:bipush          13
	//   12   26:invokevirtual   #196 <Method void JsCallback.failure(int)>
			return;
	//   13   29:return          
		}
		WebView webview = jscallback.getWebView();
	//   14   30:aload_2         
	//   15   31:invokevirtual   #173 <Method WebView JsCallback.getWebView()>
	//   16   34:astore_3        
		if(webview == null)
	//*  17   35:aload_3         
	//*  18   36:ifnonnull       44
		{
			jscallback.failure();
	//   19   39:aload_2         
	//   20   40:invokevirtual   #124 <Method void JsCallback.failure()>
			return;
	//   21   43:return          
		}
		if(a(webview, urldescription.getToUrl()))
	//*  22   44:aload_0         
	//*  23   45:aload_3         
	//*  24   46:aload_1         
	//*  25   47:invokevirtual   #42  <Method String JsCoreApi$UrlDescription.getToUrl()>
	//*  26   50:invokespecial   #285 <Method boolean a(WebView, String)>
	//*  27   53:ifeq            72
		{
			Log.e("JsCoreApi", "JS  redirectTo JS_RET_CODE_PARSE_PARAM_ERROR overrideLoadingUrl");
	//   28   56:ldc1            #24  <String "JsCoreApi">
	//   29   58:ldc2            #359 <String "JS  redirectTo JS_RET_CODE_PARSE_PARAM_ERROR overrideLoadingUrl">
	//   30   61:invokestatic    #38  <Method int Log.e(String, String)>
	//   31   64:pop             
			jscallback.failure(13);
	//   32   65:aload_2         
	//   33   66:bipush          13
	//   34   68:invokevirtual   #196 <Method void JsCallback.failure(int)>
			return;
	//   35   71:return          
		} else
		{
			a(webview.getContext(), urldescription);
	//   36   72:aload_0         
	//   37   73:aload_3         
	//   38   74:invokevirtual   #181 <Method Context WebView.getContext()>
	//   39   77:aload_1         
	//   40   78:invokespecial   #361 <Method void a(Context, JsCoreApi$UrlDescription)>
			return;
	//   41   81:return          
		}
	}

	public void share(ShareReq sharereq, JsCallback jscallback)
	{
		Log.i("JsCoreApi", "JS share");
	//    0    0:ldc1            #24  <String "JsCoreApi">
	//    1    2:ldc2            #367 <String "JS share">
	//    2    5:invokestatic    #115 <Method int Log.i(String, String)>
	//    3    8:pop             
		WebView webview = jscallback.getWebView();
	//    4    9:aload_2         
	//    5   10:invokevirtual   #173 <Method WebView JsCallback.getWebView()>
	//    6   13:astore          6
		if(webview == null)
	//*   7   15:aload           6
	//*   8   17:ifnonnull       25
		{
			jscallback.failure();
	//    9   20:aload_2         
	//   10   21:invokevirtual   #124 <Method void JsCallback.failure()>
			return;
	//   11   24:return          
		}
		if(sharereq == null)
	//*  12   25:aload_1         
	//*  13   26:ifnonnull       36
		{
			jscallback.failure(13);
	//   14   29:aload_2         
	//   15   30:bipush          13
	//   16   32:invokevirtual   #196 <Method void JsCallback.failure(int)>
			return;
	//   17   35:return          
		}
	/* block-local class not found */
	class ShareReq {}

		String s1 = sharereq.getTitle();
	//   18   36:aload_1         
	//   19   37:invokevirtual   #368 <Method String JsCoreApi$ShareReq.getTitle()>
	//   20   40:astore          7
		String s = sharereq.getDesc();
	//   21   42:aload_1         
	//   22   43:invokevirtual   #371 <Method String JsCoreApi$ShareReq.getDesc()>
	//   23   46:astore          4
		Object obj = ((Object) (sharereq.getLink()));
	//   24   48:aload_1         
	//   25   49:invokevirtual   #374 <Method String JsCoreApi$ShareReq.getLink()>
	//   26   52:astore          5
		sharereq = ((ShareReq) (s));
	//   27   54:aload           4
	//   28   56:astore_1        
		if(s == null)
	//*  29   57:aload           4
	//*  30   59:ifnonnull       65
			sharereq = "";
	//   31   62:ldc1            #226 <String "">
	//   32   64:astore_1        
		s = ((String) (obj));
	//   33   65:aload           5
	//   34   67:astore          4
		if(obj == null)
	//*  35   69:aload           5
	//*  36   71:ifnonnull       78
			s = "";
	//   37   74:ldc1            #226 <String "">
	//   38   76:astore          4
		obj = ((Object) (new Intent()));
	//   39   78:new             #47  <Class Intent>
	//   40   81:dup             
	//   41   82:invokespecial   #375 <Method void Intent()>
	//   42   85:astore          5
		((Intent) (obj)).setAction("android.intent.action.SEND");
	//   43   87:aload           5
	//   44   89:ldc2            #377 <String "android.intent.action.SEND">
	//   45   92:invokevirtual   #381 <Method Intent Intent.setAction(String)>
	//   46   95:pop             
		((Intent) (obj)).putExtra("android.intent.extra.TEXT", (new StringBuilder()).append(s1).append(":").append(((String) (sharereq))).append(" ").append(s).toString());
	//   47   96:aload           5
	//   48   98:ldc2            #383 <String "android.intent.extra.TEXT">
	//   49  101:new             #219 <Class StringBuilder>
	//   50  104:dup             
	//   51  105:invokespecial   #220 <Method void StringBuilder()>
	//   52  108:aload           7
	//   53  110:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   54  113:ldc2            #385 <String ":">
	//   55  116:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   56  119:aload_1         
	//   57  120:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   58  123:ldc2            #387 <String " ">
	//   59  126:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   60  129:aload           4
	//   61  131:invokevirtual   #229 <Method StringBuilder StringBuilder.append(String)>
	//   62  134:invokevirtual   #230 <Method String StringBuilder.toString()>
	//   63  137:invokevirtual   #64  <Method Intent Intent.putExtra(String, String)>
	//   64  140:pop             
		((Intent) (obj)).setType("text/plain");
	//   65  141:aload           5
	//   66  143:ldc2            #389 <String "text/plain">
	//   67  146:invokevirtual   #392 <Method Intent Intent.setType(String)>
	//   68  149:pop             
		try
		{
			int i = e.b(webview.getContext(), "jssdk_share");
	//   69  150:aload           6
	//   70  152:invokevirtual   #181 <Method Context WebView.getContext()>
	//   71  155:ldc2            #394 <String "jssdk_share">
	//   72  158:invokestatic    #397 <Method int e.b(Context, String)>
	//   73  161:istore_3        
			webview.getContext().startActivity(Intent.createChooser(((Intent) (obj)), ((CharSequence) (webview.getContext().getString(i)))));
	//   74  162:aload           6
	//   75  164:invokevirtual   #181 <Method Context WebView.getContext()>
	//   76  167:aload           5
	//   77  169:aload           6
	//   78  171:invokevirtual   #181 <Method Context WebView.getContext()>
	//   79  174:iload_3         
	//   80  175:invokevirtual   #401 <Method String Context.getString(int)>
	//   81  178:invokestatic    #405 <Method Intent Intent.createChooser(Intent, CharSequence)>
	//   82  181:invokevirtual   #72  <Method void Context.startActivity(Intent)>
			return;
	//   83  184:return          
		}
		// Misplaced declaration of an exception variable
		catch(ShareReq sharereq)
	//*  84  185:astore_1        
		{
			Log.e("JsCoreApi", "JS share ActivityNotFoundException");
	//   85  186:ldc1            #24  <String "JsCoreApi">
	//   86  188:ldc2            #407 <String "JS share ActivityNotFoundException">
	//   87  191:invokestatic    #38  <Method int Log.e(String, String)>
	//   88  194:pop             
		}
		jscallback.failure();
	//   89  195:aload_2         
	//   90  196:invokevirtual   #124 <Method void JsCallback.failure()>
	//   91  199:return          
	}

	public void showDialog(DialogReq dialogreq, JsCallback jscallback)
	{
		if(dialogreq == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
		{
			jscallback.failure(13);
	//    2    4:aload_2         
	//    3    5:bipush          13
	//    4    7:invokevirtual   #196 <Method void JsCallback.failure(int)>
			return;
	//    5   10:return          
		}
		WebView webview = jscallback.getWebView();
	//    6   11:aload_2         
	//    7   12:invokevirtual   #173 <Method WebView JsCallback.getWebView()>
	//    8   15:astore_3        
		if(webview == null || webview.getContext() == null)
	//*   9   16:aload_3         
	//*  10   17:ifnull          27
	//*  11   20:aload_3         
	//*  12   21:invokevirtual   #181 <Method Context WebView.getContext()>
	//*  13   24:ifnonnull       32
		{
			jscallback.failure();
	//   14   27:aload_2         
	//   15   28:invokevirtual   #124 <Method void JsCallback.failure()>
			return;
	//   16   31:return          
		}
	/* block-local class not found */
	class DialogReq {}

		List list = dialogreq.getButtons();
	//   17   32:aload_1         
	//   18   33:invokevirtual   #412 <Method List JsCoreApi$DialogReq.getButtons()>
	//   19   36:astore          4
		if(list == null || list.size() < 1 || list.size() > 2)
	//*  20   38:aload           4
	//*  21   40:ifnull          65
	//*  22   43:aload           4
	//*  23   45:invokeinterface #133 <Method int List.size()>
	//*  24   50:iconst_1        
	//*  25   51:icmplt          65
	//*  26   54:aload           4
	//*  27   56:invokeinterface #133 <Method int List.size()>
	//*  28   61:iconst_2        
	//*  29   62:icmple          72
		{
			jscallback.failure(13);
	//   30   65:aload_2         
	//   31   66:bipush          13
	//   32   68:invokevirtual   #196 <Method void JsCallback.failure(int)>
			return;
	//   33   71:return          
		} else
		{
			jscallback = ((JsCallback) (new android.app.AlertDialog.Builder(webview.getContext())));
	//   34   72:new             #414 <Class android.app.AlertDialog$Builder>
	//   35   75:dup             
	//   36   76:aload_3         
	//   37   77:invokevirtual   #181 <Method Context WebView.getContext()>
	//   38   80:invokespecial   #417 <Method void android.app.AlertDialog$Builder(Context)>
	//   39   83:astore_2        
			((android.app.AlertDialog.Builder) (jscallback)).setTitle(((CharSequence) (dialogreq.getTitle())));
	//   40   84:aload_2         
	//   41   85:aload_1         
	//   42   86:invokevirtual   #418 <Method String JsCoreApi$DialogReq.getTitle()>
	//   43   89:invokevirtual   #422 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   44   92:pop             
			((android.app.AlertDialog.Builder) (jscallback)).setMessage(((CharSequence) (dialogreq.getMessage())));
	//   45   93:aload_2         
	//   46   94:aload_1         
	//   47   95:invokevirtual   #425 <Method String JsCoreApi$DialogReq.getMessage()>
	//   48   98:invokevirtual   #428 <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(CharSequence)>
	//   49  101:pop             
			dialogreq = ((DialogReq) (((android.app.AlertDialog.Builder) (jscallback)).create()));
	//   50  102:aload_2         
	//   51  103:invokevirtual   #432 <Method AlertDialog android.app.AlertDialog$Builder.create()>
	//   52  106:astore_1        
			((AlertDialog) (dialogreq)).setCanceledOnTouchOutside(false);
	//   53  107:aload_1         
	//   54  108:iconst_0        
	//   55  109:invokevirtual   #438 <Method void AlertDialog.setCanceledOnTouchOutside(boolean)>
			((AlertDialog) (dialogreq)).show();
	//   56  112:aload_1         
	//   57  113:invokevirtual   #441 <Method void AlertDialog.show()>
			return;
	//   58  116:return          
		}
	}

	public void showToast(ToastReq toastreq, JsCallback jscallback)
	{
		Log.i("JsCoreApi", "JS  showToast");
	//    0    0:ldc1            #24  <String "JsCoreApi">
	//    1    2:ldc2            #445 <String "JS  showToast">
	//    2    5:invokestatic    #115 <Method int Log.i(String, String)>
	//    3    8:pop             
		if(toastreq == null)
	//*   4    9:aload_1         
	//*   5   10:ifnonnull       29
		{
			Log.e("JsCoreApi", "JS  showToast JS_RET_CODE_PARSE_PARAM_ERROR");
	//    6   13:ldc1            #24  <String "JsCoreApi">
	//    7   15:ldc2            #447 <String "JS  showToast JS_RET_CODE_PARSE_PARAM_ERROR">
	//    8   18:invokestatic    #38  <Method int Log.e(String, String)>
	//    9   21:pop             
			jscallback.failure(13);
	//   10   22:aload_2         
	//   11   23:bipush          13
	//   12   25:invokevirtual   #196 <Method void JsCallback.failure(int)>
			return;
	//   13   28:return          
		}
		WebView webview = jscallback.getWebView();
	//   14   29:aload_2         
	//   15   30:invokevirtual   #173 <Method WebView JsCallback.getWebView()>
	//   16   33:astore          4
		if(webview == null || webview.getContext() == null)
	//*  17   35:aload           4
	//*  18   37:ifnull          48
	//*  19   40:aload           4
	//*  20   42:invokevirtual   #181 <Method Context WebView.getContext()>
	//*  21   45:ifnonnull       53
		{
			jscallback.failure();
	//   22   48:aload_2         
	//   23   49:invokevirtual   #124 <Method void JsCallback.failure()>
			return;
	//   24   52:return          
		}
	/* block-local class not found */
	class ToastReq {}

		jscallback = ((JsCallback) (toastreq.getTitle()));
	//   25   53:aload_1         
	//   26   54:invokevirtual   #448 <Method String JsCoreApi$ToastReq.getTitle()>
	//   27   57:astore_2        
		int i;
		if(toastreq.getDuration() == 1)
	//*  28   58:aload_1         
	//*  29   59:invokevirtual   #451 <Method int JsCoreApi$ToastReq.getDuration()>
	//*  30   62:iconst_1        
	//*  31   63:icmpne          71
			i = 1;
	//   32   66:iconst_1        
	//   33   67:istore_3        
		else
	//*  34   68:goto            73
			i = 0;
	//   35   71:iconst_0        
	//   36   72:istore_3        
		Toast.makeText(webview.getContext(), ((CharSequence) (jscallback)), i).show();
	//   37   73:aload           4
	//   38   75:invokevirtual   #181 <Method Context WebView.getContext()>
	//   39   78:aload_2         
	//   40   79:iload_3         
	//   41   80:invokestatic    #457 <Method Toast Toast.makeText(Context, CharSequence, int)>
	//   42   83:invokevirtual   #458 <Method void Toast.show()>
	//   43   86:return          
	}

	private static final String a = "JsCoreApi";
}
