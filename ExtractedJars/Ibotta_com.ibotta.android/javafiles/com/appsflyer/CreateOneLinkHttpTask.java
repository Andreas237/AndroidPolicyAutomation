// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import com.appsflyer.share.LinkGenerator;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appsflyer:
//			OneLinkHttpTask, AppsFlyerProperties, ServerConfigHandler, AFLogger

public class CreateOneLinkHttpTask extends OneLinkHttpTask
{
	public static interface ResponseListener
	{

		public abstract void onResponse(String s);

		public abstract void onResponseError(String s);
	}


	final void _mth02CB()
	{
		Object obj = ((Object) (AppsFlyerProperties.getInstance().getString("onelinkDomain")));
	//    0    0:invokestatic    #25  <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//    1    3:ldc1            #27  <String "onelinkDomain">
	//    2    5:invokevirtual   #31  <Method String AppsFlyerProperties.getString(String)>
	//    3    8:astore_1        
		obj = ((Object) ((new LinkGenerator("af_app_invites")).setBaseURL(super._fld02CE, ((String) (obj)), _fld02CB).addParameter("af_siteid", _fld02CB).addParameters(_fld02CA)));
	//    4    9:new             #33  <Class LinkGenerator>
	//    5   12:dup             
	//    6   13:ldc1            #35  <String "af_app_invites">
	//    7   15:invokespecial   #39  <Method void LinkGenerator(String)>
	//    8   18:aload_0         
	//    9   19:getfield        #42  <Field String OneLinkHttpTask._fld02CE>
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #44  <Field String _fld02CB>
	//   13   27:invokevirtual   #48  <Method LinkGenerator LinkGenerator.setBaseURL(String, String, String)>
	//   14   30:ldc1            #50  <String "af_siteid">
	//   15   32:aload_0         
	//   16   33:getfield        #44  <Field String _fld02CB>
	//   17   36:invokevirtual   #54  <Method LinkGenerator LinkGenerator.addParameter(String, String)>
	//   18   39:aload_0         
	//   19   40:getfield        #56  <Field Map _fld02CA>
	//   20   43:invokevirtual   #60  <Method LinkGenerator LinkGenerator.addParameters(Map)>
	//   21   46:astore_1        
		String s = AppsFlyerProperties.getInstance().getString("AppUserId");
	//   22   47:invokestatic    #25  <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   23   50:ldc1            #62  <String "AppUserId">
	//   24   52:invokevirtual   #31  <Method String AppsFlyerProperties.getString(String)>
	//   25   55:astore_2        
		if(s != null)
	//*  26   56:aload_2         
	//*  27   57:ifnull          66
			((LinkGenerator) (obj)).setReferrerCustomerId(s);
	//   28   60:aload_1         
	//   29   61:aload_2         
	//   30   62:invokevirtual   #66  <Method LinkGenerator LinkGenerator.setReferrerCustomerId(String)>
	//   31   65:pop             
		obj = ((Object) (((LinkGenerator) (obj)).generateLink()));
	//   32   66:aload_1         
	//   33   67:invokevirtual   #70  <Method String LinkGenerator.generateLink()>
	//   34   70:astore_1        
		_fld0971.onResponse(((String) (obj)));
	//   35   71:aload_0         
	//   36   72:getfield        #72  <Field CreateOneLinkHttpTask$ResponseListener _fld0971>
	//   37   75:aload_1         
	//   38   76:invokeinterface #75  <Method void CreateOneLinkHttpTask$ResponseListener.onResponse(String)>
	//   39   81:return          
	}

	final String _mth02CE()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #78  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #80  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(ServerConfigHandler.getUrl("https://onelink.%s/shortlink-sdk/v1"));
	//    4    8:aload_1         
	//    5    9:ldc1            #82  <String "https://onelink.%s/shortlink-sdk/v1">
	//    6   11:invokestatic    #87  <Method String ServerConfigHandler.getUrl(String)>
	//    7   14:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append("/");
	//    9   18:aload_1         
	//   10   19:ldc1            #93  <String "/">
	//   11   21:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(super._fld02CE);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #42  <Field String OneLinkHttpTask._fld02CE>
	//   16   30:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		return ((Object) (stringbuilder)).toString();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #98  <Method String Object.toString()>
	//   20   38:areturn         
	}

	final void _mth02CE(String s)
	{
		try
		{
			JSONObject jsonobject = JSONObjectInstrumentation.init(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #106 <Method JSONObject JSONObjectInstrumentation.init(String)>
	//    2    4:astore_2        
			String s1;
			for(Iterator iterator = jsonobject.keys(); iterator.hasNext(); _fld0971.onResponse(jsonobject.optString(s1)))
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #112 <Method Iterator JSONObject.keys()>
	//*   5    9:astore_3        
	//*   6   10:aload_3         
	//*   7   11:invokeinterface #118 <Method boolean Iterator.hasNext()>
	//*   8   16:ifeq            48
				s1 = (String)iterator.next();
	//    9   19:aload_3         
	//   10   20:invokeinterface #122 <Method Object Iterator.next()>
	//   11   25:checkcast       #124 <Class String>
	//   12   28:astore          4

	//   13   30:aload_0         
	//   14   31:getfield        #72  <Field CreateOneLinkHttpTask$ResponseListener _fld0971>
	//   15   34:aload_2         
	//   16   35:aload           4
	//   17   37:invokevirtual   #127 <Method String JSONObject.optString(String)>
	//   18   40:invokeinterface #75  <Method void CreateOneLinkHttpTask$ResponseListener.onResponse(String)>
		}
	//*  19   45:goto            10
	//*  20   48:return          
		catch(JSONException jsonexception)
	//*  21   49:astore_2        
		{
			_fld0971.onResponseError("Can't parse one link data");
	//   22   50:aload_0         
	//   23   51:getfield        #72  <Field CreateOneLinkHttpTask$ResponseListener _fld0971>
	//   24   54:ldc1            #129 <String "Can't parse one link data">
	//   25   56:invokeinterface #132 <Method void CreateOneLinkHttpTask$ResponseListener.onResponseError(String)>
			AFLogger.afErrorLog("Error while parsing to json ".concat(String.valueOf(((Object) (s)))), ((Throwable) (jsonexception)));
	//   26   61:ldc1            #134 <String "Error while parsing to json ">
	//   27   63:aload_1         
	//   28   64:invokestatic    #138 <Method String String.valueOf(Object)>
	//   29   67:invokevirtual   #141 <Method String String.concat(String)>
	//   30   70:aload_2         
	//   31   71:invokestatic    #147 <Method void AFLogger.afErrorLog(String, Throwable)>
			return;
	//   32   74:return          
		}
	}

	final void _mth02CE(HttpsURLConnection httpsurlconnection)
		throws JSONException, IOException
	{
		if(_fld02BC)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field boolean _fld02BC>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		((HttpURLConnection) (httpsurlconnection)).setRequestMethod("POST");
	//    4    8:aload_1         
	//    5    9:ldc1            #154 <String "POST">
	//    6   11:invokevirtual   #159 <Method void HttpURLConnection.setRequestMethod(String)>
		((URLConnection) (httpsurlconnection)).setDoInput(true);
	//    7   14:aload_1         
	//    8   15:iconst_1        
	//    9   16:invokevirtual   #165 <Method void URLConnection.setDoInput(boolean)>
		((URLConnection) (httpsurlconnection)).setDoOutput(true);
	//   10   19:aload_1         
	//   11   20:iconst_1        
	//   12   21:invokevirtual   #168 <Method void URLConnection.setDoOutput(boolean)>
		((URLConnection) (httpsurlconnection)).setUseCaches(false);
	//   13   24:aload_1         
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #171 <Method void URLConnection.setUseCaches(boolean)>
		JSONObject jsonobject = new JSONObject();
	//   16   29:new             #108 <Class JSONObject>
	//   17   32:dup             
	//   18   33:invokespecial   #172 <Method void JSONObject()>
	//   19   36:astore_3        
		Object obj = ((Object) (new JSONObject(_fld02CA)));
	//   20   37:new             #108 <Class JSONObject>
	//   21   40:dup             
	//   22   41:aload_0         
	//   23   42:getfield        #56  <Field Map _fld02CA>
	//   24   45:invokespecial   #175 <Method void JSONObject(Map)>
	//   25   48:astore_2        
		jsonobject.put("ttl", ((Object) (_fld02CF)));
	//   26   49:aload_3         
	//   27   50:ldc1            #177 <String "ttl">
	//   28   52:aload_0         
	//   29   53:getfield        #179 <Field String _fld02CF>
	//   30   56:invokevirtual   #183 <Method JSONObject JSONObject.put(String, Object)>
	//   31   59:pop             
		jsonobject.put("data", obj);
	//   32   60:aload_3         
	//   33   61:ldc1            #185 <String "data">
	//   34   63:aload_2         
	//   35   64:invokevirtual   #183 <Method JSONObject JSONObject.put(String, Object)>
	//   36   67:pop             
		((URLConnection) (httpsurlconnection)).connect();
	//   37   68:aload_1         
	//   38   69:invokevirtual   #188 <Method void URLConnection.connect()>
		obj = ((Object) (new DataOutputStream(((URLConnection) (httpsurlconnection)).getOutputStream())));
	//   39   72:new             #190 <Class DataOutputStream>
	//   40   75:dup             
	//   41   76:aload_1         
	//   42   77:invokevirtual   #194 <Method OutputStream URLConnection.getOutputStream()>
	//   43   80:invokespecial   #197 <Method void DataOutputStream(OutputStream)>
	//   44   83:astore_2        
		if(!(jsonobject instanceof JSONObject))
	//*  45   84:aload_3         
	//*  46   85:instanceof      #108 <Class JSONObject>
	//*  47   88:ifne            99
			httpsurlconnection = ((HttpsURLConnection) (jsonobject.toString()));
	//   48   91:aload_3         
	//   49   92:invokevirtual   #198 <Method String JSONObject.toString()>
	//   50   95:astore_1        
		else
	//*  51   96:goto            107
			httpsurlconnection = ((HttpsURLConnection) (JSONObjectInstrumentation.toString((JSONObject)jsonobject)));
	//   52   99:aload_3         
	//   53  100:checkcast       #108 <Class JSONObject>
	//   54  103:invokestatic    #201 <Method String JSONObjectInstrumentation.toString(JSONObject)>
	//   55  106:astore_1        
		((DataOutputStream) (obj)).writeBytes(((String) (httpsurlconnection)));
	//   56  107:aload_2         
	//   57  108:aload_1         
	//   58  109:invokevirtual   #204 <Method void DataOutputStream.writeBytes(String)>
		((OutputStream) (obj)).flush();
	//   59  112:aload_2         
	//   60  113:invokevirtual   #209 <Method void OutputStream.flush()>
		((OutputStream) (obj)).close();
	//   61  116:aload_2         
	//   62  117:invokevirtual   #212 <Method void OutputStream.close()>
	//   63  120:return          
	}

	private boolean _fld02BC;
	private Map _fld02CA;
	private String _fld02CB;
	private String _fld02CF;
	private ResponseListener _fld0971;
}
