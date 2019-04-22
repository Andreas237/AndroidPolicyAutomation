// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.facebook.stetho.common.ProcessUtil;
import com.facebook.stetho.server.SocketLike;
import com.facebook.stetho.server.http.*;
import com.newrelic.agent.android.instrumentation.JSONArrayInstrumentation;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import org.json.*;

public class ChromeDiscoveryHandler
	implements HttpHandler
{

	public ChromeDiscoveryHandler(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #46  <Field Context mContext>
		mInspectorPath = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #48  <Field String mInspectorPath>
	//    8   14:return          
	}

	private CharSequence getAppLabel()
	{
		return mContext.getPackageManager().getApplicationLabel(mContext.getApplicationInfo());
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Context mContext>
	//    2    4:invokevirtual   #57  <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field Context mContext>
	//    5   11:invokevirtual   #61  <Method android.content.pm.ApplicationInfo Context.getApplicationInfo()>
	//    6   14:invokevirtual   #67  <Method CharSequence PackageManager.getApplicationLabel(android.content.pm.ApplicationInfo)>
	//    7   17:areturn         
	}

	private String getAppLabelAndVersion()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void StringBuilder()>
	//    3    7:astore_1        
		PackageManager packagemanager = mContext.getPackageManager();
	//    4    8:aload_0         
	//    5    9:getfield        #46  <Field Context mContext>
	//    6   12:invokevirtual   #57  <Method PackageManager Context.getPackageManager()>
	//    7   15:astore_2        
		stringbuilder.append(getAppLabel());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokespecial   #76  <Method CharSequence getAppLabel()>
	//   11   21:invokevirtual   #80  <Method StringBuilder StringBuilder.append(CharSequence)>
	//   12   24:pop             
		stringbuilder.append('/');
	//   13   25:aload_1         
	//   14   26:bipush          47
	//   15   28:invokevirtual   #83  <Method StringBuilder StringBuilder.append(char)>
	//   16   31:pop             
		try
		{
			stringbuilder.append(packagemanager.getPackageInfo(mContext.getPackageName(), 0).versionName);
	//   17   32:aload_1         
	//   18   33:aload_2         
	//   19   34:aload_0         
	//   20   35:getfield        #46  <Field Context mContext>
	//   21   38:invokevirtual   #86  <Method String Context.getPackageName()>
	//   22   41:iconst_0        
	//   23   42:invokevirtual   #90  <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   24   45:getfield        #95  <Field String PackageInfo.versionName>
	//   25   48:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
		}
	//*  27   52:aload_1         
	//*  28   53:invokevirtual   #101 <Method String StringBuilder.toString()>
	//*  29   56:areturn         
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//*  30   57:astore_1        
		{
			throw new RuntimeException(((Throwable) (namenotfoundexception)));
	//   31   58:new             #103 <Class RuntimeException>
	//   32   61:dup             
	//   33   62:aload_1         
	//   34   63:invokespecial   #106 <Method void RuntimeException(Throwable)>
	//   35   66:athrow          
		}
		return stringbuilder.toString();
	}

	private void handleActivate(LightHttpResponse lighthttpresponse)
	{
		setSuccessfulResponse(lighthttpresponse, LightHttpBody.create("Target activation ignored\n", "text/plain"));
	//    0    0:aload_1         
	//    1    1:ldc1            #110 <String "Target activation ignored\n">
	//    2    3:ldc1            #112 <String "text/plain">
	//    3    5:invokestatic    #118 <Method LightHttpBody LightHttpBody.create(String, String)>
	//    4    8:invokestatic    #122 <Method void setSuccessfulResponse(LightHttpResponse, LightHttpBody)>
	//    5   11:return          
	}

	private void handlePageList(LightHttpResponse lighthttpresponse)
		throws JSONException
	{
		if(mPageListResponse == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field LightHttpBody mPageListResponse>
	//*   2    4:ifnonnull       193
		{
			Object obj = ((Object) (new JSONArray()));
	//    3    7:new             #129 <Class JSONArray>
	//    4   10:dup             
	//    5   11:invokespecial   #130 <Method void JSONArray()>
	//    6   14:astore_2        
			JSONObject jsonobject = new JSONObject();
	//    7   15:new             #132 <Class JSONObject>
	//    8   18:dup             
	//    9   19:invokespecial   #133 <Method void JSONObject()>
	//   10   22:astore_3        
			jsonobject.put("type", "app");
	//   11   23:aload_3         
	//   12   24:ldc1            #135 <String "type">
	//   13   26:ldc1            #137 <String "app">
	//   14   28:invokevirtual   #141 <Method JSONObject JSONObject.put(String, Object)>
	//   15   31:pop             
			jsonobject.put("title", ((Object) (makeTitle())));
	//   16   32:aload_3         
	//   17   33:ldc1            #143 <String "title">
	//   18   35:aload_0         
	//   19   36:invokespecial   #146 <Method String makeTitle()>
	//   20   39:invokevirtual   #141 <Method JSONObject JSONObject.put(String, Object)>
	//   21   42:pop             
			jsonobject.put("id", "1");
	//   22   43:aload_3         
	//   23   44:ldc1            #148 <String "id">
	//   24   46:ldc1            #11  <String "1">
	//   25   48:invokevirtual   #141 <Method JSONObject JSONObject.put(String, Object)>
	//   26   51:pop             
			jsonobject.put("description", "");
	//   27   52:aload_3         
	//   28   53:ldc1            #150 <String "description">
	//   29   55:ldc1            #152 <String "">
	//   30   57:invokevirtual   #141 <Method JSONObject JSONObject.put(String, Object)>
	//   31   60:pop             
			StringBuilder stringbuilder = new StringBuilder();
	//   32   61:new             #73  <Class StringBuilder>
	//   33   64:dup             
	//   34   65:invokespecial   #74  <Method void StringBuilder()>
	//   35   68:astore          4
			stringbuilder.append("ws://");
	//   36   70:aload           4
	//   37   72:ldc1            #154 <String "ws://">
	//   38   74:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   39   77:pop             
			stringbuilder.append(mInspectorPath);
	//   40   78:aload           4
	//   41   80:aload_0         
	//   42   81:getfield        #48  <Field String mInspectorPath>
	//   43   84:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   44   87:pop             
			jsonobject.put("webSocketDebuggerUrl", ((Object) (stringbuilder.toString())));
	//   45   88:aload_3         
	//   46   89:ldc1            #156 <String "webSocketDebuggerUrl">
	//   47   91:aload           4
	//   48   93:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   49   96:invokevirtual   #141 <Method JSONObject JSONObject.put(String, Object)>
	//   50   99:pop             
			jsonobject.put("devtoolsFrontendUrl", ((Object) ((new android.net.Uri.Builder()).scheme("http").authority("chrome-devtools-frontend.appspot.com").appendEncodedPath("serve_rev").appendEncodedPath("@188492").appendEncodedPath("devtools.html").appendQueryParameter("ws", mInspectorPath).build().toString())));
	//   51  100:aload_3         
	//   52  101:ldc1            #158 <String "devtoolsFrontendUrl">
	//   53  103:new             #160 <Class android.net.Uri$Builder>
	//   54  106:dup             
	//   55  107:invokespecial   #161 <Method void android.net.Uri$Builder()>
	//   56  110:ldc1            #163 <String "http">
	//   57  112:invokevirtual   #167 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//   58  115:ldc1            #169 <String "chrome-devtools-frontend.appspot.com">
	//   59  117:invokevirtual   #172 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//   60  120:ldc1            #174 <String "serve_rev">
	//   61  122:invokevirtual   #177 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
	//   62  125:ldc1            #29  <String "@188492">
	//   63  127:invokevirtual   #177 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
	//   64  130:ldc1            #179 <String "devtools.html">
	//   65  132:invokevirtual   #177 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
	//   66  135:ldc1            #181 <String "ws">
	//   67  137:aload_0         
	//   68  138:getfield        #48  <Field String mInspectorPath>
	//   69  141:invokevirtual   #185 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   70  144:invokevirtual   #189 <Method Uri android.net.Uri$Builder.build()>
	//   71  147:invokevirtual   #192 <Method String Uri.toString()>
	//   72  150:invokevirtual   #141 <Method JSONObject JSONObject.put(String, Object)>
	//   73  153:pop             
			((JSONArray) (obj)).put(((Object) (jsonobject)));
	//   74  154:aload_2         
	//   75  155:aload_3         
	//   76  156:invokevirtual   #195 <Method JSONArray JSONArray.put(Object)>
	//   77  159:pop             
			if(!(obj instanceof JSONArray))
	//*  78  160:aload_2         
	//*  79  161:instanceof      #129 <Class JSONArray>
	//*  80  164:ifne            175
				obj = ((Object) (((JSONArray) (obj)).toString()));
	//   81  167:aload_2         
	//   82  168:invokevirtual   #196 <Method String JSONArray.toString()>
	//   83  171:astore_2        
			else
	//*  84  172:goto            183
				obj = ((Object) (JSONArrayInstrumentation.toString((JSONArray)obj)));
	//   85  175:aload_2         
	//   86  176:checkcast       #129 <Class JSONArray>
	//   87  179:invokestatic    #201 <Method String JSONArrayInstrumentation.toString(JSONArray)>
	//   88  182:astore_2        
			mPageListResponse = LightHttpBody.create(((String) (obj)), "application/json");
	//   89  183:aload_0         
	//   90  184:aload_2         
	//   91  185:ldc1            #203 <String "application/json">
	//   92  187:invokestatic    #118 <Method LightHttpBody LightHttpBody.create(String, String)>
	//   93  190:putfield        #127 <Field LightHttpBody mPageListResponse>
		}
		setSuccessfulResponse(lighthttpresponse, mPageListResponse);
	//   94  193:aload_1         
	//   95  194:aload_0         
	//   96  195:getfield        #127 <Field LightHttpBody mPageListResponse>
	//   97  198:invokestatic    #122 <Method void setSuccessfulResponse(LightHttpResponse, LightHttpBody)>
	//   98  201:return          
	}

	private void handleVersion(LightHttpResponse lighthttpresponse)
		throws JSONException
	{
		if(mVersionResponse == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #207 <Field LightHttpBody mVersionResponse>
	//*   2    4:ifnonnull       100
		{
			Object obj = ((Object) (new JSONObject()));
	//    3    7:new             #132 <Class JSONObject>
	//    4   10:dup             
	//    5   11:invokespecial   #133 <Method void JSONObject()>
	//    6   14:astore_2        
			((JSONObject) (obj)).put("WebKit-Version", "537.36 (@188492)");
	//    7   15:aload_2         
	//    8   16:ldc1            #209 <String "WebKit-Version">
	//    9   18:ldc1            #32  <String "537.36 (@188492)">
	//   10   20:invokevirtual   #141 <Method JSONObject JSONObject.put(String, Object)>
	//   11   23:pop             
			((JSONObject) (obj)).put("User-Agent", "Stetho");
	//   12   24:aload_2         
	//   13   25:ldc1            #211 <String "User-Agent">
	//   14   27:ldc1            #26  <String "Stetho">
	//   15   29:invokevirtual   #141 <Method JSONObject JSONObject.put(String, Object)>
	//   16   32:pop             
			((JSONObject) (obj)).put("Protocol-Version", "1.1");
	//   17   33:aload_2         
	//   18   34:ldc1            #213 <String "Protocol-Version">
	//   19   36:ldc1            #23  <String "1.1">
	//   20   38:invokevirtual   #141 <Method JSONObject JSONObject.put(String, Object)>
	//   21   41:pop             
			((JSONObject) (obj)).put("Browser", ((Object) (getAppLabelAndVersion())));
	//   22   42:aload_2         
	//   23   43:ldc1            #215 <String "Browser">
	//   24   45:aload_0         
	//   25   46:invokespecial   #217 <Method String getAppLabelAndVersion()>
	//   26   49:invokevirtual   #141 <Method JSONObject JSONObject.put(String, Object)>
	//   27   52:pop             
			((JSONObject) (obj)).put("Android-Package", ((Object) (mContext.getPackageName())));
	//   28   53:aload_2         
	//   29   54:ldc1            #219 <String "Android-Package">
	//   30   56:aload_0         
	//   31   57:getfield        #46  <Field Context mContext>
	//   32   60:invokevirtual   #86  <Method String Context.getPackageName()>
	//   33   63:invokevirtual   #141 <Method JSONObject JSONObject.put(String, Object)>
	//   34   66:pop             
			if(!(obj instanceof JSONObject))
	//*  35   67:aload_2         
	//*  36   68:instanceof      #132 <Class JSONObject>
	//*  37   71:ifne            82
				obj = ((Object) (((JSONObject) (obj)).toString()));
	//   38   74:aload_2         
	//   39   75:invokevirtual   #220 <Method String JSONObject.toString()>
	//   40   78:astore_2        
			else
	//*  41   79:goto            90
				obj = ((Object) (JSONObjectInstrumentation.toString((JSONObject)obj)));
	//   42   82:aload_2         
	//   43   83:checkcast       #132 <Class JSONObject>
	//   44   86:invokestatic    #225 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   45   89:astore_2        
			mVersionResponse = LightHttpBody.create(((String) (obj)), "application/json");
	//   46   90:aload_0         
	//   47   91:aload_2         
	//   48   92:ldc1            #203 <String "application/json">
	//   49   94:invokestatic    #118 <Method LightHttpBody LightHttpBody.create(String, String)>
	//   50   97:putfield        #207 <Field LightHttpBody mVersionResponse>
		}
		setSuccessfulResponse(lighthttpresponse, mVersionResponse);
	//   51  100:aload_1         
	//   52  101:aload_0         
	//   53  102:getfield        #207 <Field LightHttpBody mVersionResponse>
	//   54  105:invokestatic    #122 <Method void setSuccessfulResponse(LightHttpResponse, LightHttpBody)>
	//   55  108:return          
	}

	private String makeTitle()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #73  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(getAppLabel());
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:invokespecial   #76  <Method CharSequence getAppLabel()>
	//    7   13:invokevirtual   #80  <Method StringBuilder StringBuilder.append(CharSequence)>
	//    8   16:pop             
		stringbuilder.append(" (powered by Stetho)");
	//    9   17:aload_2         
	//   10   18:ldc1            #227 <String " (powered by Stetho)">
	//   11   20:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		String s = ProcessUtil.getProcessName();
	//   13   24:invokestatic    #232 <Method String ProcessUtil.getProcessName()>
	//   14   27:astore_3        
		int i = s.indexOf(':');
	//   15   28:aload_3         
	//   16   29:bipush          58
	//   17   31:invokevirtual   #238 <Method int String.indexOf(int)>
	//   18   34:istore_1        
		if(i >= 0)
	//*  19   35:iload_1         
	//*  20   36:iflt            49
			stringbuilder.append(s.substring(i));
	//   21   39:aload_2         
	//   22   40:aload_3         
	//   23   41:iload_1         
	//   24   42:invokevirtual   #242 <Method String String.substring(int)>
	//   25   45:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		return stringbuilder.toString();
	//   27   49:aload_2         
	//   28   50:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   29   53:areturn         
	}

	private static void setSuccessfulResponse(LightHttpResponse lighthttpresponse, LightHttpBody lighthttpbody)
	{
		lighthttpresponse.code = 200;
	//    0    0:aload_0         
	//    1    1:sipush          200
	//    2    4:putfield        #248 <Field int LightHttpResponse.code>
		lighthttpresponse.reasonPhrase = "OK";
	//    3    7:aload_0         
	//    4    8:ldc1            #250 <String "OK">
	//    5   10:putfield        #253 <Field String LightHttpResponse.reasonPhrase>
		lighthttpresponse.body = lighthttpbody;
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:putfield        #256 <Field LightHttpBody LightHttpResponse.body>
	//    9   18:return          
	}

	public boolean handleRequest(SocketLike socketlike, LightHttpRequest lighthttprequest, LightHttpResponse lighthttpresponse)
	{
		socketlike = ((SocketLike) (lighthttprequest.uri.getPath()));
	//    0    0:aload_2         
	//    1    1:getfield        #264 <Field Uri LightHttpRequest.uri>
	//    2    4:invokevirtual   #267 <Method String Uri.getPath()>
	//    3    7:astore_1        
		if("/json/version".equals(((Object) (socketlike))))
	//*   4    8:ldc1            #20  <String "/json/version">
	//*   5   10:aload_1         
	//*   6   11:invokevirtual   #271 <Method boolean String.equals(Object)>
	//*   7   14:ifeq            25
		{
			handleVersion(lighthttpresponse);
	//    8   17:aload_0         
	//    9   18:aload_3         
	//   10   19:invokespecial   #273 <Method void handleVersion(LightHttpResponse)>
			break MISSING_BLOCK_LABEL_172;
	//   11   22:goto            172
		}
		if("/json".equals(((Object) (socketlike))))
	//*  12   25:ldc1            #17  <String "/json">
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #271 <Method boolean String.equals(Object)>
	//*  15   31:ifeq            42
		{
			handlePageList(lighthttpresponse);
	//   16   34:aload_0         
	//   17   35:aload_3         
	//   18   36:invokespecial   #275 <Method void handlePageList(LightHttpResponse)>
			break MISSING_BLOCK_LABEL_172;
	//   19   39:goto            172
		}
		if("/json/activate/1".equals(((Object) (socketlike))))
	//*  20   42:ldc1            #14  <String "/json/activate/1">
	//*  21   44:aload_1         
	//*  22   45:invokevirtual   #271 <Method boolean String.equals(Object)>
	//*  23   48:ifeq            59
		{
			handleActivate(lighthttpresponse);
	//   24   51:aload_0         
	//   25   52:aload_3         
	//   26   53:invokespecial   #277 <Method void handleActivate(LightHttpResponse)>
			break MISSING_BLOCK_LABEL_172;
	//   27   56:goto            172
		}
		try
		{
			lighthttpresponse.code = 501;
	//   28   59:aload_3         
	//   29   60:sipush          501
	//   30   63:putfield        #248 <Field int LightHttpResponse.code>
			lighthttpresponse.reasonPhrase = "Not implemented";
	//   31   66:aload_3         
	//   32   67:ldc2            #279 <String "Not implemented">
	//   33   70:putfield        #253 <Field String LightHttpResponse.reasonPhrase>
			lighthttprequest = ((LightHttpRequest) (new StringBuilder()));
	//   34   73:new             #73  <Class StringBuilder>
	//   35   76:dup             
	//   36   77:invokespecial   #74  <Method void StringBuilder()>
	//   37   80:astore_2        
			((StringBuilder) (lighthttprequest)).append("No support for ");
	//   38   81:aload_2         
	//   39   82:ldc2            #281 <String "No support for ">
	//   40   85:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   41   88:pop             
			((StringBuilder) (lighthttprequest)).append(((String) (socketlike)));
	//   42   89:aload_2         
	//   43   90:aload_1         
	//   44   91:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   45   94:pop             
			((StringBuilder) (lighthttprequest)).append("\n");
	//   46   95:aload_2         
	//   47   96:ldc2            #283 <String "\n">
	//   48   99:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   49  102:pop             
			lighthttpresponse.body = LightHttpBody.create(((StringBuilder) (lighthttprequest)).toString(), "text/plain");
	//   50  103:aload_3         
	//   51  104:aload_2         
	//   52  105:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   53  108:ldc1            #112 <String "text/plain">
	//   54  110:invokestatic    #118 <Method LightHttpBody LightHttpBody.create(String, String)>
	//   55  113:putfield        #256 <Field LightHttpBody LightHttpResponse.body>
		}
	//*  56  116:goto            172
		// Misplaced declaration of an exception variable
		catch(SocketLike socketlike)
	//*  57  119:astore_1        
		{
			lighthttpresponse.code = 500;
	//   58  120:aload_3         
	//   59  121:sipush          500
	//   60  124:putfield        #248 <Field int LightHttpResponse.code>
			lighthttpresponse.reasonPhrase = "Internal server error";
	//   61  127:aload_3         
	//   62  128:ldc2            #285 <String "Internal server error">
	//   63  131:putfield        #253 <Field String LightHttpResponse.reasonPhrase>
			lighthttprequest = ((LightHttpRequest) (new StringBuilder()));
	//   64  134:new             #73  <Class StringBuilder>
	//   65  137:dup             
	//   66  138:invokespecial   #74  <Method void StringBuilder()>
	//   67  141:astore_2        
			((StringBuilder) (lighthttprequest)).append(((JSONException) (socketlike)).toString());
	//   68  142:aload_2         
	//   69  143:aload_1         
	//   70  144:invokevirtual   #286 <Method String JSONException.toString()>
	//   71  147:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   72  150:pop             
			((StringBuilder) (lighthttprequest)).append("\n");
	//   73  151:aload_2         
	//   74  152:ldc2            #283 <String "\n">
	//   75  155:invokevirtual   #98  <Method StringBuilder StringBuilder.append(String)>
	//   76  158:pop             
			lighthttpresponse.body = LightHttpBody.create(((StringBuilder) (lighthttprequest)).toString(), "text/plain");
	//   77  159:aload_3         
	//   78  160:aload_2         
	//   79  161:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   80  164:ldc1            #112 <String "text/plain">
	//   81  166:invokestatic    #118 <Method LightHttpBody LightHttpBody.create(String, String)>
	//   82  169:putfield        #256 <Field LightHttpBody LightHttpResponse.body>
		}
		return true;
	//   83  172:iconst_1        
	//   84  173:ireturn         
	}

	public void register(HandlerRegistry handlerregistry)
	{
		handlerregistry.register(((com.facebook.stetho.server.http.PathMatcher) (new ExactPathMatcher("/json"))), ((HttpHandler) (this)));
	//    0    0:aload_1         
	//    1    1:new             #290 <Class ExactPathMatcher>
	//    2    4:dup             
	//    3    5:ldc1            #17  <String "/json">
	//    4    7:invokespecial   #293 <Method void ExactPathMatcher(String)>
	//    5   10:aload_0         
	//    6   11:invokevirtual   #298 <Method void HandlerRegistry.register(com.facebook.stetho.server.http.PathMatcher, HttpHandler)>
		handlerregistry.register(((com.facebook.stetho.server.http.PathMatcher) (new ExactPathMatcher("/json/version"))), ((HttpHandler) (this)));
	//    7   14:aload_1         
	//    8   15:new             #290 <Class ExactPathMatcher>
	//    9   18:dup             
	//   10   19:ldc1            #20  <String "/json/version">
	//   11   21:invokespecial   #293 <Method void ExactPathMatcher(String)>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #298 <Method void HandlerRegistry.register(com.facebook.stetho.server.http.PathMatcher, HttpHandler)>
		handlerregistry.register(((com.facebook.stetho.server.http.PathMatcher) (new ExactPathMatcher("/json/activate/1"))), ((HttpHandler) (this)));
	//   14   28:aload_1         
	//   15   29:new             #290 <Class ExactPathMatcher>
	//   16   32:dup             
	//   17   33:ldc1            #14  <String "/json/activate/1">
	//   18   35:invokespecial   #293 <Method void ExactPathMatcher(String)>
	//   19   38:aload_0         
	//   20   39:invokevirtual   #298 <Method void HandlerRegistry.register(com.facebook.stetho.server.http.PathMatcher, HttpHandler)>
	//   21   42:return          
	}

	private static final String PAGE_ID = "1";
	private static final String PATH_ACTIVATE = "/json/activate/1";
	private static final String PATH_PAGE_LIST = "/json";
	private static final String PATH_VERSION = "/json/version";
	private static final String PROTOCOL_VERSION = "1.1";
	private static final String USER_AGENT = "Stetho";
	private static final String WEBKIT_REV = "@188492";
	private static final String WEBKIT_VERSION = "537.36 (@188492)";
	private final Context mContext;
	private final String mInspectorPath;
	private LightHttpBody mPageListResponse;
	private LightHttpBody mVersionResponse;
}
