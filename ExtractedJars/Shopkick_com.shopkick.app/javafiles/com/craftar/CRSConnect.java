// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

// Referenced classes of package com.craftar:
//			MySSLSocketFactory, ConnectParams, CLog, SearchParams, 
//			HttpUtils

public class CRSConnect
{
	static interface NetworkCallback
	{

		public abstract void onResult(int i, String s);
	}


	public CRSConnect()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		searchUrl = "https://search.craftar.net/v2/search";
	//    2    4:aload_0         
	//    3    5:ldc1            #17  <String "https://search.craftar.net/v2/search">
	//    4    7:putfield        #25  <Field String searchUrl>
		connectUrl = "https://search.craftar.net/v2/timestamp";
	//    5   10:aload_0         
	//    6   11:ldc1            #14  <String "https://search.craftar.net/v2/timestamp">
	//    7   13:putfield        #27  <Field String connectUrl>
		HttpsURLConnection.setDefaultSSLSocketFactory(((javax.net.ssl.SSLSocketFactory) (new MySSLSocketFactory())));
	//    8   16:new             #29  <Class MySSLSocketFactory>
	//    9   19:dup             
	//   10   20:invokespecial   #30  <Method void MySSLSocketFactory()>
	//   11   23:invokestatic    #36  <Method void HttpsURLConnection.setDefaultSSLSocketFactory(javax.net.ssl.SSLSocketFactory)>
	//   12   26:return          
	}

	public void connect(ConnectParams connectparams, NetworkCallback networkcallback)
		throws IOException
	{
		connectparams = ((ConnectParams) (connectparams.token));
	//    0    0:aload_1         
	//    1    1:getfield        #48  <Field String ConnectParams.token>
	//    2    4:astore_1        
		Object obj = ((Object) (new StringBuilder()));
	//    3    5:new             #50  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #51  <Method void StringBuilder()>
	//    6   12:astore_3        
		((StringBuilder) (obj)).append("connectSync to: ");
	//    7   13:aload_3         
	//    8   14:ldc1            #53  <String "connectSync to: ">
	//    9   16:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   10   19:pop             
		((StringBuilder) (obj)).append(connectUrl);
	//   11   20:aload_3         
	//   12   21:aload_0         
	//   13   22:getfield        #27  <Field String connectUrl>
	//   14   25:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   15   28:pop             
		((StringBuilder) (obj)).append(" with token ");
	//   16   29:aload_3         
	//   17   30:ldc1            #59  <String " with token ">
	//   18   32:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
		((StringBuilder) (obj)).append(((String) (connectparams)));
	//   20   36:aload_3         
	//   21   37:aload_1         
	//   22   38:invokevirtual   #57  <Method StringBuilder StringBuilder.append(String)>
	//   23   41:pop             
		CLog.d(((StringBuilder) (obj)).toString());
	//   24   42:aload_3         
	//   25   43:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   26   46:invokestatic    #69  <Method void CLog.d(String)>
		obj = ((Object) ((HttpURLConnection)(new URL(connectUrl)).openConnection()));
	//   27   49:new             #71  <Class URL>
	//   28   52:dup             
	//   29   53:aload_0         
	//   30   54:getfield        #27  <Field String connectUrl>
	//   31   57:invokespecial   #73  <Method void URL(String)>
	//   32   60:invokevirtual   #77  <Method java.net.URLConnection URL.openConnection()>
	//   33   63:checkcast       #79  <Class HttpURLConnection>
	//   34   66:astore_3        
		((HttpURLConnection) (obj)).setRequestMethod("POST");
	//   35   67:aload_3         
	//   36   68:ldc1            #81  <String "POST">
	//   37   70:invokevirtual   #84  <Method void HttpURLConnection.setRequestMethod(String)>
		((HttpURLConnection) (obj)).setDoInput(true);
	//   38   73:aload_3         
	//   39   74:iconst_1        
	//   40   75:invokevirtual   #88  <Method void HttpURLConnection.setDoInput(boolean)>
		((HttpURLConnection) (obj)).setDoOutput(true);
	//   41   78:aload_3         
	//   42   79:iconst_1        
	//   43   80:invokevirtual   #91  <Method void HttpURLConnection.setDoOutput(boolean)>
		Object obj1 = ((Object) (new HttpUtils.URLParameterBuilder()));
	//   44   83:new             #93  <Class HttpUtils$URLParameterBuilder>
	//   45   86:dup             
	//   46   87:invokespecial   #94  <Method void HttpUtils$URLParameterBuilder()>
	//   47   90:astore          4
		((HttpUtils.URLParameterBuilder) (obj1)).addParameter("token", ((String) (connectparams)));
	//   48   92:aload           4
	//   49   94:ldc1            #95  <String "token">
	//   50   96:aload_1         
	//   51   97:invokevirtual   #99  <Method void HttpUtils$URLParameterBuilder.addParameter(String, String)>
		connectparams = ((ConnectParams) (((HttpURLConnection) (obj)).getOutputStream()));
	//   52  100:aload_3         
	//   53  101:invokevirtual   #103 <Method OutputStream HttpURLConnection.getOutputStream()>
	//   54  104:astore_1        
		((OutputStream) (connectparams)).write(((HttpUtils.URLParameterBuilder) (obj1)).getURLParameters().getBytes());
	//   55  105:aload_1         
	//   56  106:aload           4
	//   57  108:invokevirtual   #106 <Method String HttpUtils$URLParameterBuilder.getURLParameters()>
	//   58  111:invokevirtual   #112 <Method byte[] String.getBytes()>
	//   59  114:invokevirtual   #118 <Method void OutputStream.write(byte[])>
		((OutputStream) (connectparams)).close();
	//   60  117:aload_1         
	//   61  118:invokevirtual   #121 <Method void OutputStream.close()>
		((HttpURLConnection) (obj)).connect();
	//   62  121:aload_3         
	//   63  122:invokevirtual   #123 <Method void HttpURLConnection.connect()>
		obj1 = ((Object) (new StringBuffer("")));
	//   64  125:new             #125 <Class StringBuffer>
	//   65  128:dup             
	//   66  129:ldc1            #127 <String "">
	//   67  131:invokespecial   #128 <Method void StringBuffer(String)>
	//   68  134:astore          4
		try
		{
			connectparams = ((ConnectParams) (((HttpURLConnection) (obj)).getInputStream()));
	//   69  136:aload_3         
	//   70  137:invokevirtual   #132 <Method java.io.InputStream HttpURLConnection.getInputStream()>
	//   71  140:astore_1        
		}
	//*  72  141:goto            149
	//*  73  144:aload_3         
	//*  74  145:invokevirtual   #135 <Method java.io.InputStream HttpURLConnection.getErrorStream()>
	//*  75  148:astore_1        
	//*  76  149:new             #137 <Class BufferedReader>
	//*  77  152:dup             
	//*  78  153:new             #139 <Class InputStreamReader>
	//*  79  156:dup             
	//*  80  157:aload_1         
	//*  81  158:invokespecial   #142 <Method void InputStreamReader(java.io.InputStream)>
	//*  82  161:invokespecial   #145 <Method void BufferedReader(java.io.Reader)>
	//*  83  164:astore_1        
	//*  84  165:aload_1         
	//*  85  166:invokevirtual   #148 <Method String BufferedReader.readLine()>
	//*  86  169:astore          5
	//*  87  171:aload           5
	//*  88  173:ifnull          187
	//*  89  176:aload           4
	//*  90  178:aload           5
	//*  91  180:invokevirtual   #151 <Method StringBuffer StringBuffer.append(String)>
	//*  92  183:pop             
	//*  93  184:goto            165
	//*  94  187:aload_1         
	//*  95  188:invokevirtual   #152 <Method void BufferedReader.close()>
	//*  96  191:aload           4
	//*  97  193:invokevirtual   #153 <Method String StringBuffer.toString()>
	//*  98  196:astore_1        
	//*  99  197:aload_2         
	//* 100  198:aload_3         
	//* 101  199:invokevirtual   #157 <Method int HttpURLConnection.getResponseCode()>
	//* 102  202:aload_1         
	//* 103  203:invokeinterface #161 <Method void CRSConnect$NetworkCallback.onResult(int, String)>
	//* 104  208:return          
		// Misplaced declaration of an exception variable
		catch(ConnectParams connectparams)
		{
			connectparams = ((ConnectParams) (((HttpURLConnection) (obj)).getErrorStream()));
		}
		connectparams = ((ConnectParams) (new BufferedReader(((java.io.Reader) (new InputStreamReader(((java.io.InputStream) (connectparams))))))));
		do
		{
			String s = ((BufferedReader) (connectparams)).readLine();
			if(s != null)
			{
				((StringBuffer) (obj1)).append(s);
			} else
			{
				((BufferedReader) (connectparams)).close();
				connectparams = ((ConnectParams) (((StringBuffer) (obj1)).toString()));
				networkcallback.onResult(((HttpURLConnection) (obj)).getResponseCode(), ((String) (connectparams)));
				return;
			}
		} while(true);
	//* 105  209:astore_1        
	//* 106  210:goto            144
	}

	public void search(SearchParams searchparams, NetworkCallback networkcallback)
		throws IOException
	{
		HttpURLConnection httpurlconnection = (HttpURLConnection)(new URL(searchUrl)).openConnection();
	//    0    0:new             #71  <Class URL>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field String searchUrl>
	//    4    8:invokespecial   #73  <Method void URL(String)>
	//    5   11:invokevirtual   #77  <Method java.net.URLConnection URL.openConnection()>
	//    6   14:checkcast       #79  <Class HttpURLConnection>
	//    7   17:astore          4
		httpurlconnection.setUseCaches(false);
	//    8   19:aload           4
	//    9   21:iconst_0        
	//   10   22:invokevirtual   #169 <Method void HttpURLConnection.setUseCaches(boolean)>
		httpurlconnection.setDoOutput(true);
	//   11   25:aload           4
	//   12   27:iconst_1        
	//   13   28:invokevirtual   #91  <Method void HttpURLConnection.setDoOutput(boolean)>
		httpurlconnection.setRequestMethod("POST");
	//   14   31:aload           4
	//   15   33:ldc1            #81  <String "POST">
	//   16   35:invokevirtual   #84  <Method void HttpURLConnection.setRequestMethod(String)>
		httpurlconnection.setRequestProperty("Connection", "Keep-Alive");
	//   17   38:aload           4
	//   18   40:ldc1            #171 <String "Connection">
	//   19   42:ldc1            #173 <String "Keep-Alive">
	//   20   44:invokevirtual   #176 <Method void HttpURLConnection.setRequestProperty(String, String)>
		httpurlconnection.setRequestProperty("Cache-Control", "no-cache");
	//   21   47:aload           4
	//   22   49:ldc1            #178 <String "Cache-Control">
	//   23   51:ldc1            #180 <String "no-cache">
	//   24   53:invokevirtual   #176 <Method void HttpURLConnection.setRequestProperty(String, String)>
		httpurlconnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
	//   25   56:aload           4
	//   26   58:ldc1            #182 <String "Content-Type">
	//   27   60:ldc1            #184 <String "multipart/form-data;boundary=*****">
	//   28   62:invokevirtual   #176 <Method void HttpURLConnection.setRequestProperty(String, String)>
		DataOutputStream dataoutputstream = new DataOutputStream(httpurlconnection.getOutputStream());
	//   29   65:new             #186 <Class DataOutputStream>
	//   30   68:dup             
	//   31   69:aload           4
	//   32   71:invokevirtual   #103 <Method OutputStream HttpURLConnection.getOutputStream()>
	//   33   74:invokespecial   #189 <Method void DataOutputStream(OutputStream)>
	//   34   77:astore          5
		HttpUtils.addStringDataToRequestStream(dataoutputstream, "token", searchparams.token);
	//   35   79:aload           5
	//   36   81:ldc1            #95  <String "token">
	//   37   83:aload_1         
	//   38   84:getfield        #192 <Field String SearchParams.token>
	//   39   87:invokestatic    #198 <Method void HttpUtils.addStringDataToRequestStream(DataOutputStream, String, String)>
		if(searchparams.requestBoundingBoxes)
	//*  40   90:aload_1         
	//*  41   91:getfield        #202 <Field boolean SearchParams.requestBoundingBoxes>
	//*  42   94:ifeq            106
			HttpUtils.addStringDataToRequestStream(dataoutputstream, "bboxes", "true");
	//   43   97:aload           5
	//   44   99:ldc1            #204 <String "bboxes">
	//   45  101:ldc1            #206 <String "true">
	//   46  103:invokestatic    #198 <Method void HttpUtils.addStringDataToRequestStream(DataOutputStream, String, String)>
		if(searchparams.embedCustom)
	//*  47  106:aload_1         
	//*  48  107:getfield        #209 <Field boolean SearchParams.embedCustom>
	//*  49  110:ifeq            122
			HttpUtils.addStringDataToRequestStream(dataoutputstream, "embed_custom", "true");
	//   50  113:aload           5
	//   51  115:ldc1            #211 <String "embed_custom">
	//   52  117:ldc1            #206 <String "true">
	//   53  119:invokestatic    #198 <Method void HttpUtils.addStringDataToRequestStream(DataOutputStream, String, String)>
		if(searchparams.embedTrackingData)
	//*  54  122:aload_1         
	//*  55  123:getfield        #214 <Field boolean SearchParams.embedTrackingData>
	//*  56  126:ifeq            138
			HttpUtils.addStringDataToRequestStream(dataoutputstream, "embed_tracking", "true");
	//   57  129:aload           5
	//   58  131:ldc1            #216 <String "embed_tracking">
	//   59  133:ldc1            #206 <String "true">
	//   60  135:invokestatic    #198 <Method void HttpUtils.addStringDataToRequestStream(DataOutputStream, String, String)>
		HttpUtils.addStringDataToRequestStream(dataoutputstream, "app_id", searchparams.appID);
	//   61  138:aload           5
	//   62  140:ldc1            #218 <String "app_id">
	//   63  142:aload_1         
	//   64  143:getfield        #221 <Field String SearchParams.appID>
	//   65  146:invokestatic    #198 <Method void HttpUtils.addStringDataToRequestStream(DataOutputStream, String, String)>
		HttpUtils.addStringDataToRequestStream(dataoutputstream, "version", searchparams.sdkVersion);
	//   66  149:aload           5
	//   67  151:ldc1            #223 <String "version">
	//   68  153:aload_1         
	//   69  154:getfield        #226 <Field String SearchParams.sdkVersion>
	//   70  157:invokestatic    #198 <Method void HttpUtils.addStringDataToRequestStream(DataOutputStream, String, String)>
		HttpUtils.addImageDataToRequestStream(dataoutputstream, searchparams.image);
	//   71  160:aload           5
	//   72  162:aload_1         
	//   73  163:getfield        #230 <Field byte[] SearchParams.image>
	//   74  166:invokestatic    #234 <Method void HttpUtils.addImageDataToRequestStream(DataOutputStream, byte[])>
		dataoutputstream.writeBytes("--*****--\r\n");
	//   75  169:aload           5
	//   76  171:ldc1            #236 <String "--*****--\r\n">
	//   77  173:invokevirtual   #239 <Method void DataOutputStream.writeBytes(String)>
		dataoutputstream.flush();
	//   78  176:aload           5
	//   79  178:invokevirtual   #242 <Method void DataOutputStream.flush()>
		dataoutputstream.close();
	//   80  181:aload           5
	//   81  183:invokevirtual   #243 <Method void DataOutputStream.close()>
		int i;
		try
		{
			i = httpurlconnection.getResponseCode();
	//   82  186:aload           4
	//   83  188:invokevirtual   #157 <Method int HttpURLConnection.getResponseCode()>
	//   84  191:istore_3        
		}
	//*  85  192:goto            201
	//*  86  195:aload           4
	//*  87  197:invokevirtual   #157 <Method int HttpURLConnection.getResponseCode()>
	//*  88  200:istore_3        
	//*  89  201:iload_3         
	//*  90  202:sipush          200
	//*  91  205:icmpeq          237
	//*  92  208:aload_2         
	//*  93  209:iload_3         
	//*  94  210:aload           4
	//*  95  212:invokevirtual   #135 <Method java.io.InputStream HttpURLConnection.getErrorStream()>
	//*  96  215:invokestatic    #247 <Method String HttpUtils.readTextStream(java.io.InputStream)>
	//*  97  218:invokeinterface #161 <Method void CRSConnect$NetworkCallback.onResult(int, String)>
	//*  98  223:return          
	//*  99  224:astore_1        
	//* 100  225:aload_2         
	//* 101  226:iload_3         
	//* 102  227:aload_1         
	//* 103  228:invokevirtual   #250 <Method String Exception.getLocalizedMessage()>
	//* 104  231:invokeinterface #161 <Method void CRSConnect$NetworkCallback.onResult(int, String)>
	//* 105  236:return          
	//* 106  237:aload           4
	//* 107  239:invokevirtual   #132 <Method java.io.InputStream HttpURLConnection.getInputStream()>
	//* 108  242:invokestatic    #247 <Method String HttpUtils.readTextStream(java.io.InputStream)>
	//* 109  245:astore_1        
	//* 110  246:aload           4
	//* 111  248:invokevirtual   #253 <Method void HttpURLConnection.disconnect()>
	//* 112  251:aload_2         
	//* 113  252:iload_3         
	//* 114  253:aload_1         
	//* 115  254:invokeinterface #161 <Method void CRSConnect$NetworkCallback.onResult(int, String)>
	//* 116  259:return          
		// Misplaced declaration of an exception variable
		catch(SearchParams searchparams)
		{
			i = httpurlconnection.getResponseCode();
		}
		if(i != 200)
		{
			try
			{
				networkcallback.onResult(i, HttpUtils.readTextStream(httpurlconnection.getErrorStream()));
				return;
			}
			// Misplaced declaration of an exception variable
			catch(SearchParams searchparams)
			{
				networkcallback.onResult(i, ((Exception) (searchparams)).getLocalizedMessage());
			}
			return;
		} else
		{
			searchparams = ((SearchParams) (HttpUtils.readTextStream(httpurlconnection.getInputStream())));
			httpurlconnection.disconnect();
			networkcallback.onResult(i, ((String) (searchparams)));
			return;
		}
	//* 117  260:astore_1        
	//* 118  261:goto            195
	}

	public void setConnectUrl(String s)
	{
		connectUrl = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field String connectUrl>
	//    3    5:return          
	}

	public void setSearchUrl(String s)
	{
		searchUrl = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field String searchUrl>
	//    3    5:return          
	}

	static final String BASE_URL = "https://search.craftar.net/v2/";
	static final String CONNECT_URL = "https://search.craftar.net/v2/timestamp";
	static final String SEARCH_URL = "https://search.craftar.net/v2/search";
	String connectUrl;
	String searchUrl;
}
