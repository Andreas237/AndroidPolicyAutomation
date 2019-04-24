// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.facebook.stetho.common.ProcessUtil;
import com.facebook.stetho.server.SecureHttpRequestHandler;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.apache.http.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpRequestHandlerRegistry;
import org.json.*;

public class ChromeDiscoveryHandler extends SecureHttpRequestHandler
{

	public ChromeDiscoveryHandler(Context context, String s)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void SecureHttpRequestHandler(Context)>
		mContext = context;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #43  <Field Context mContext>
		mInspectorPath = s;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #45  <Field String mInspectorPath>
	//    9   15:return          
	}

	private static StringEntity createStringEntity(String s, String s1)
		throws UnsupportedEncodingException
	{
		s1 = ((String) (new StringEntity(s1, "UTF-8")));
	//    0    0:new             #52  <Class StringEntity>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc1            #54  <String "UTF-8">
	//    4    7:invokespecial   #57  <Method void StringEntity(String, String)>
	//    5   10:astore_1        
		((StringEntity) (s1)).setContentType(s);
	//    6   11:aload_1         
	//    7   12:aload_0         
	//    8   13:invokevirtual   #61  <Method void StringEntity.setContentType(String)>
		return ((StringEntity) (s1));
	//    9   16:aload_1         
	//   10   17:areturn         
	}

	private CharSequence getAppLabel()
	{
		return mContext.getPackageManager().getApplicationLabel(mContext.getApplicationInfo());
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Context mContext>
	//    2    4:invokevirtual   #70  <Method PackageManager Context.getPackageManager()>
	//    3    7:aload_0         
	//    4    8:getfield        #43  <Field Context mContext>
	//    5   11:invokevirtual   #74  <Method android.content.pm.ApplicationInfo Context.getApplicationInfo()>
	//    6   14:invokevirtual   #80  <Method CharSequence PackageManager.getApplicationLabel(android.content.pm.ApplicationInfo)>
	//    7   17:areturn         
	}

	private String getAppLabelAndVersion()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #86  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #89  <Method void StringBuilder()>
	//    3    7:astore_1        
		PackageManager packagemanager = mContext.getPackageManager();
	//    4    8:aload_0         
	//    5    9:getfield        #43  <Field Context mContext>
	//    6   12:invokevirtual   #70  <Method PackageManager Context.getPackageManager()>
	//    7   15:astore_2        
		stringbuilder.append(getAppLabel());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokespecial   #91  <Method CharSequence getAppLabel()>
	//   11   21:invokevirtual   #95  <Method StringBuilder StringBuilder.append(CharSequence)>
	//   12   24:pop             
		stringbuilder.append('/');
	//   13   25:aload_1         
	//   14   26:bipush          47
	//   15   28:invokevirtual   #98  <Method StringBuilder StringBuilder.append(char)>
	//   16   31:pop             
		try
		{
			stringbuilder.append(packagemanager.getPackageInfo(mContext.getPackageName(), 0).versionName);
	//   17   32:aload_1         
	//   18   33:aload_2         
	//   19   34:aload_0         
	//   20   35:getfield        #43  <Field Context mContext>
	//   21   38:invokevirtual   #101 <Method String Context.getPackageName()>
	//   22   41:iconst_0        
	//   23   42:invokevirtual   #105 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   24   45:getfield        #110 <Field String PackageInfo.versionName>
	//   25   48:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
		}
	//*  27   52:aload_1         
	//*  28   53:invokevirtual   #116 <Method String StringBuilder.toString()>
	//*  29   56:areturn         
		catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
	//*  30   57:astore_1        
		{
			throw new RuntimeException(((Throwable) (namenotfoundexception)));
	//   31   58:new             #118 <Class RuntimeException>
	//   32   61:dup             
	//   33   62:aload_1         
	//   34   63:invokespecial   #121 <Method void RuntimeException(Throwable)>
	//   35   66:athrow          
		}
		return stringbuilder.toString();
	}

	private void handleActivate(HttpResponse httpresponse)
		throws UnsupportedEncodingException
	{
		setSuccessfulResponse(httpresponse, ((HttpEntity) (createStringEntity("text/plain", "Target activation ignored"))));
	//    0    0:aload_1         
	//    1    1:ldc1            #125 <String "text/plain">
	//    2    3:ldc1            #127 <String "Target activation ignored">
	//    3    5:invokestatic    #129 <Method StringEntity createStringEntity(String, String)>
	//    4    8:invokestatic    #133 <Method void setSuccessfulResponse(HttpResponse, HttpEntity)>
	//    5   11:return          
	}

	private void handlePageList(HttpResponse httpresponse)
		throws JSONException, UnsupportedEncodingException
	{
		if(mPageListResponse == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #138 <Field StringEntity mPageListResponse>
	//*   2    4:ifnonnull       173
		{
			JSONArray jsonarray = new JSONArray();
	//    3    7:new             #140 <Class JSONArray>
	//    4   10:dup             
	//    5   11:invokespecial   #141 <Method void JSONArray()>
	//    6   14:astore_2        
			JSONObject jsonobject = new JSONObject();
	//    7   15:new             #143 <Class JSONObject>
	//    8   18:dup             
	//    9   19:invokespecial   #144 <Method void JSONObject()>
	//   10   22:astore_3        
			jsonobject.put("type", "app");
	//   11   23:aload_3         
	//   12   24:ldc1            #146 <String "type">
	//   13   26:ldc1            #148 <String "app">
	//   14   28:invokevirtual   #152 <Method JSONObject JSONObject.put(String, Object)>
	//   15   31:pop             
			jsonobject.put("title", ((Object) (makeTitle())));
	//   16   32:aload_3         
	//   17   33:ldc1            #154 <String "title">
	//   18   35:aload_0         
	//   19   36:invokespecial   #157 <Method String makeTitle()>
	//   20   39:invokevirtual   #152 <Method JSONObject JSONObject.put(String, Object)>
	//   21   42:pop             
			jsonobject.put("id", "1");
	//   22   43:aload_3         
	//   23   44:ldc1            #159 <String "id">
	//   24   46:ldc1            #8   <String "1">
	//   25   48:invokevirtual   #152 <Method JSONObject JSONObject.put(String, Object)>
	//   26   51:pop             
			jsonobject.put("description", "");
	//   27   52:aload_3         
	//   28   53:ldc1            #161 <String "description">
	//   29   55:ldc1            #163 <String "">
	//   30   57:invokevirtual   #152 <Method JSONObject JSONObject.put(String, Object)>
	//   31   60:pop             
			StringBuilder stringbuilder = new StringBuilder();
	//   32   61:new             #86  <Class StringBuilder>
	//   33   64:dup             
	//   34   65:invokespecial   #89  <Method void StringBuilder()>
	//   35   68:astore          4
			stringbuilder.append("ws://");
	//   36   70:aload           4
	//   37   72:ldc1            #165 <String "ws://">
	//   38   74:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   39   77:pop             
			stringbuilder.append(mInspectorPath);
	//   40   78:aload           4
	//   41   80:aload_0         
	//   42   81:getfield        #45  <Field String mInspectorPath>
	//   43   84:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   44   87:pop             
			jsonobject.put("webSocketDebuggerUrl", ((Object) (stringbuilder.toString())));
	//   45   88:aload_3         
	//   46   89:ldc1            #167 <String "webSocketDebuggerUrl">
	//   47   91:aload           4
	//   48   93:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   49   96:invokevirtual   #152 <Method JSONObject JSONObject.put(String, Object)>
	//   50   99:pop             
			jsonobject.put("devtoolsFrontendUrl", ((Object) ((new android.net.Uri.Builder()).scheme("http").authority("chrome-devtools-frontend.appspot.com").appendEncodedPath("serve_rev").appendEncodedPath("@188492").appendEncodedPath("devtools.html").appendQueryParameter("ws", mInspectorPath).build().toString())));
	//   51  100:aload_3         
	//   52  101:ldc1            #169 <String "devtoolsFrontendUrl">
	//   53  103:new             #171 <Class android.net.Uri$Builder>
	//   54  106:dup             
	//   55  107:invokespecial   #172 <Method void android.net.Uri$Builder()>
	//   56  110:ldc1            #174 <String "http">
	//   57  112:invokevirtual   #178 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//   58  115:ldc1            #180 <String "chrome-devtools-frontend.appspot.com">
	//   59  117:invokevirtual   #183 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//   60  120:ldc1            #185 <String "serve_rev">
	//   61  122:invokevirtual   #188 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
	//   62  125:ldc1            #26  <String "@188492">
	//   63  127:invokevirtual   #188 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
	//   64  130:ldc1            #190 <String "devtools.html">
	//   65  132:invokevirtual   #188 <Method android.net.Uri$Builder android.net.Uri$Builder.appendEncodedPath(String)>
	//   66  135:ldc1            #192 <String "ws">
	//   67  137:aload_0         
	//   68  138:getfield        #45  <Field String mInspectorPath>
	//   69  141:invokevirtual   #196 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   70  144:invokevirtual   #200 <Method Uri android.net.Uri$Builder.build()>
	//   71  147:invokevirtual   #203 <Method String Uri.toString()>
	//   72  150:invokevirtual   #152 <Method JSONObject JSONObject.put(String, Object)>
	//   73  153:pop             
			jsonarray.put(((Object) (jsonobject)));
	//   74  154:aload_2         
	//   75  155:aload_3         
	//   76  156:invokevirtual   #206 <Method JSONArray JSONArray.put(Object)>
	//   77  159:pop             
			mPageListResponse = createStringEntity("application/json", jsonarray.toString());
	//   78  160:aload_0         
	//   79  161:ldc1            #208 <String "application/json">
	//   80  163:aload_2         
	//   81  164:invokevirtual   #209 <Method String JSONArray.toString()>
	//   82  167:invokestatic    #129 <Method StringEntity createStringEntity(String, String)>
	//   83  170:putfield        #138 <Field StringEntity mPageListResponse>
		}
		setSuccessfulResponse(httpresponse, ((HttpEntity) (mPageListResponse)));
	//   84  173:aload_1         
	//   85  174:aload_0         
	//   86  175:getfield        #138 <Field StringEntity mPageListResponse>
	//   87  178:invokestatic    #133 <Method void setSuccessfulResponse(HttpResponse, HttpEntity)>
	//   88  181:return          
	}

	private void handleVersion(HttpResponse httpresponse)
		throws JSONException, UnsupportedEncodingException
	{
		if(mVersionResponse == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #212 <Field StringEntity mVersionResponse>
	//*   2    4:ifnonnull       80
		{
			JSONObject jsonobject = new JSONObject();
	//    3    7:new             #143 <Class JSONObject>
	//    4   10:dup             
	//    5   11:invokespecial   #144 <Method void JSONObject()>
	//    6   14:astore_2        
			jsonobject.put("WebKit-Version", "537.36 (@188492)");
	//    7   15:aload_2         
	//    8   16:ldc1            #214 <String "WebKit-Version">
	//    9   18:ldc1            #29  <String "537.36 (@188492)">
	//   10   20:invokevirtual   #152 <Method JSONObject JSONObject.put(String, Object)>
	//   11   23:pop             
			jsonobject.put("User-Agent", "Stetho");
	//   12   24:aload_2         
	//   13   25:ldc1            #216 <String "User-Agent">
	//   14   27:ldc1            #23  <String "Stetho">
	//   15   29:invokevirtual   #152 <Method JSONObject JSONObject.put(String, Object)>
	//   16   32:pop             
			jsonobject.put("Protocol-Version", "1.1");
	//   17   33:aload_2         
	//   18   34:ldc1            #218 <String "Protocol-Version">
	//   19   36:ldc1            #20  <String "1.1">
	//   20   38:invokevirtual   #152 <Method JSONObject JSONObject.put(String, Object)>
	//   21   41:pop             
			jsonobject.put("Browser", ((Object) (getAppLabelAndVersion())));
	//   22   42:aload_2         
	//   23   43:ldc1            #220 <String "Browser">
	//   24   45:aload_0         
	//   25   46:invokespecial   #222 <Method String getAppLabelAndVersion()>
	//   26   49:invokevirtual   #152 <Method JSONObject JSONObject.put(String, Object)>
	//   27   52:pop             
			jsonobject.put("Android-Package", ((Object) (mContext.getPackageName())));
	//   28   53:aload_2         
	//   29   54:ldc1            #224 <String "Android-Package">
	//   30   56:aload_0         
	//   31   57:getfield        #43  <Field Context mContext>
	//   32   60:invokevirtual   #101 <Method String Context.getPackageName()>
	//   33   63:invokevirtual   #152 <Method JSONObject JSONObject.put(String, Object)>
	//   34   66:pop             
			mVersionResponse = createStringEntity("application/json", jsonobject.toString());
	//   35   67:aload_0         
	//   36   68:ldc1            #208 <String "application/json">
	//   37   70:aload_2         
	//   38   71:invokevirtual   #225 <Method String JSONObject.toString()>
	//   39   74:invokestatic    #129 <Method StringEntity createStringEntity(String, String)>
	//   40   77:putfield        #212 <Field StringEntity mVersionResponse>
		}
		setSuccessfulResponse(httpresponse, ((HttpEntity) (mVersionResponse)));
	//   41   80:aload_1         
	//   42   81:aload_0         
	//   43   82:getfield        #212 <Field StringEntity mVersionResponse>
	//   44   85:invokestatic    #133 <Method void setSuccessfulResponse(HttpResponse, HttpEntity)>
	//   45   88:return          
	}

	private String makeTitle()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #86  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #89  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append(getAppLabel());
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:invokespecial   #91  <Method CharSequence getAppLabel()>
	//    7   13:invokevirtual   #95  <Method StringBuilder StringBuilder.append(CharSequence)>
	//    8   16:pop             
		stringbuilder.append(" (powered by Stetho)");
	//    9   17:aload_2         
	//   10   18:ldc1            #227 <String " (powered by Stetho)">
	//   11   20:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
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
	//   25   45:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		return stringbuilder.toString();
	//   27   49:aload_2         
	//   28   50:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   29   53:areturn         
	}

	private static void setSuccessfulResponse(HttpResponse httpresponse, HttpEntity httpentity)
	{
		httpresponse.setStatusCode(200);
	//    0    0:aload_0         
	//    1    1:sipush          200
	//    2    4:invokeinterface #248 <Method void HttpResponse.setStatusCode(int)>
		httpresponse.setReasonPhrase("OK");
	//    3    9:aload_0         
	//    4   10:ldc1            #250 <String "OK">
	//    5   12:invokeinterface #253 <Method void HttpResponse.setReasonPhrase(String)>
		httpresponse.setEntity(httpentity);
	//    6   17:aload_0         
	//    7   18:aload_1         
	//    8   19:invokeinterface #257 <Method void HttpResponse.setEntity(HttpEntity)>
	//    9   24:return          
	}

	protected void handleSecured(HttpRequest httprequest, HttpResponse httpresponse, HttpContext httpcontext)
		throws HttpException, IOException
	{
		httprequest = ((HttpRequest) (Uri.parse(httprequest.getRequestLine().getUri())));
	//    0    0:aload_1         
	//    1    1:invokeinterface #269 <Method RequestLine HttpRequest.getRequestLine()>
	//    2    6:invokeinterface #274 <Method String RequestLine.getUri()>
	//    3   11:invokestatic    #278 <Method Uri Uri.parse(String)>
	//    4   14:astore_1        
		httpcontext = ((HttpContext) (((Uri) (httprequest)).getPath()));
	//    5   15:aload_1         
	//    6   16:invokevirtual   #281 <Method String Uri.getPath()>
	//    7   19:astore_3        
		if("/json/version".equals(((Object) (httpcontext))))
	//*   8   20:ldc1            #17  <String "/json/version">
	//*   9   22:aload_3         
	//*  10   23:invokevirtual   #285 <Method boolean String.equals(Object)>
	//*  11   26:ifeq            35
		{
			handleVersion(httpresponse);
	//   12   29:aload_0         
	//   13   30:aload_2         
	//   14   31:invokespecial   #287 <Method void handleVersion(HttpResponse)>
			return;
	//   15   34:return          
		}
		if("/json".equals(((Object) (httpcontext))))
	//*  16   35:ldc1            #14  <String "/json">
	//*  17   37:aload_3         
	//*  18   38:invokevirtual   #285 <Method boolean String.equals(Object)>
	//*  19   41:ifeq            50
		{
			handlePageList(httpresponse);
	//   20   44:aload_0         
	//   21   45:aload_2         
	//   22   46:invokespecial   #289 <Method void handlePageList(HttpResponse)>
			return;
	//   23   49:return          
		}
		if("/json/activate/1".equals(((Object) (httpcontext))))
	//*  24   50:ldc1            #11  <String "/json/activate/1">
	//*  25   52:aload_3         
	//*  26   53:invokevirtual   #285 <Method boolean String.equals(Object)>
	//*  27   56:ifeq            65
		{
			handleActivate(httpresponse);
	//   28   59:aload_0         
	//   29   60:aload_2         
	//   30   61:invokespecial   #291 <Method void handleActivate(HttpResponse)>
			return;
	//   31   64:return          
		}
		try
		{
			httpresponse.setStatusCode(501);
	//   32   65:aload_2         
	//   33   66:sipush          501
	//   34   69:invokeinterface #248 <Method void HttpResponse.setStatusCode(int)>
			httpresponse.setReasonPhrase("Not Implemented");
	//   35   74:aload_2         
	//   36   75:ldc2            #293 <String "Not Implemented">
	//   37   78:invokeinterface #253 <Method void HttpResponse.setReasonPhrase(String)>
			httpcontext = ((HttpContext) (new StringBuilder()));
	//   38   83:new             #86  <Class StringBuilder>
	//   39   86:dup             
	//   40   87:invokespecial   #89  <Method void StringBuilder()>
	//   41   90:astore_3        
			((StringBuilder) (httpcontext)).append("No support for ");
	//   42   91:aload_3         
	//   43   92:ldc2            #295 <String "No support for ">
	//   44   95:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   45   98:pop             
			((StringBuilder) (httpcontext)).append(((Uri) (httprequest)).getPath());
	//   46   99:aload_3         
	//   47  100:aload_1         
	//   48  101:invokevirtual   #281 <Method String Uri.getPath()>
	//   49  104:invokevirtual   #113 <Method StringBuilder StringBuilder.append(String)>
	//   50  107:pop             
			httpresponse.setEntity(((HttpEntity) (new StringEntity(((StringBuilder) (httpcontext)).toString()))));
	//   51  108:aload_2         
	//   52  109:new             #52  <Class StringEntity>
	//   53  112:dup             
	//   54  113:aload_3         
	//   55  114:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   56  117:invokespecial   #297 <Method void StringEntity(String)>
	//   57  120:invokeinterface #257 <Method void HttpResponse.setEntity(HttpEntity)>
			return;
	//   58  125:return          
		}
		// Misplaced declaration of an exception variable
		catch(HttpRequest httprequest)
	//*  59  126:astore_1        
		{
			httpresponse.setStatusCode(500);
	//   60  127:aload_2         
	//   61  128:sipush          500
	//   62  131:invokeinterface #248 <Method void HttpResponse.setStatusCode(int)>
		}
		httpresponse.setReasonPhrase("Internal Server Error");
	//   63  136:aload_2         
	//   64  137:ldc2            #299 <String "Internal Server Error">
	//   65  140:invokeinterface #253 <Method void HttpResponse.setReasonPhrase(String)>
		httpresponse.setEntity(((HttpEntity) (new StringEntity(((JSONException) (httprequest)).toString(), "UTF-8"))));
	//   66  145:aload_2         
	//   67  146:new             #52  <Class StringEntity>
	//   68  149:dup             
	//   69  150:aload_1         
	//   70  151:invokevirtual   #300 <Method String JSONException.toString()>
	//   71  154:ldc1            #54  <String "UTF-8">
	//   72  156:invokespecial   #57  <Method void StringEntity(String, String)>
	//   73  159:invokeinterface #257 <Method void HttpResponse.setEntity(HttpEntity)>
		return;
	//   74  164:return          
	}

	public void register(HttpRequestHandlerRegistry httprequesthandlerregistry)
	{
		httprequesthandlerregistry.register("/json", ((org.apache.http.protocol.HttpRequestHandler) (this)));
	//    0    0:aload_1         
	//    1    1:ldc1            #14  <String "/json">
	//    2    3:aload_0         
	//    3    4:invokevirtual   #307 <Method void HttpRequestHandlerRegistry.register(String, org.apache.http.protocol.HttpRequestHandler)>
		httprequesthandlerregistry.register("/json/version", ((org.apache.http.protocol.HttpRequestHandler) (this)));
	//    4    7:aload_1         
	//    5    8:ldc1            #17  <String "/json/version">
	//    6   10:aload_0         
	//    7   11:invokevirtual   #307 <Method void HttpRequestHandlerRegistry.register(String, org.apache.http.protocol.HttpRequestHandler)>
		httprequesthandlerregistry.register("/json/activate/1*", ((org.apache.http.protocol.HttpRequestHandler) (this)));
	//    8   14:aload_1         
	//    9   15:ldc2            #309 <String "/json/activate/1*">
	//   10   18:aload_0         
	//   11   19:invokevirtual   #307 <Method void HttpRequestHandlerRegistry.register(String, org.apache.http.protocol.HttpRequestHandler)>
	//   12   22:return          
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
	private StringEntity mPageListResponse;
	private StringEntity mVersionResponse;
}
