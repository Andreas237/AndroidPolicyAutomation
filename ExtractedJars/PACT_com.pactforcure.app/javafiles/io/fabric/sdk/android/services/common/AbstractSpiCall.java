// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.Kit;
import io.fabric.sdk.android.services.network.*;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			CommonUtils

public abstract class AbstractSpiCall
{

	public AbstractSpiCall(Kit kit1, String s, String s1, HttpRequestFactory httprequestfactory, HttpMethod httpmethod)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void Object()>
		if(s1 == null)
	//*   2    4:aload_3         
	//*   3    5:ifnonnull       18
			throw new IllegalArgumentException("url must not be null.");
	//    4    8:new             #70  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #72  <String "url must not be null.">
	//    7   14:invokespecial   #75  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		if(httprequestfactory == null)
	//*   9   18:aload           4
	//*  10   20:ifnonnull       33
		{
			throw new IllegalArgumentException("requestFactory must not be null.");
	//   11   23:new             #70  <Class IllegalArgumentException>
	//   12   26:dup             
	//   13   27:ldc1            #77  <String "requestFactory must not be null.">
	//   14   29:invokespecial   #75  <Method void IllegalArgumentException(String)>
	//   15   32:athrow          
		} else
		{
			kit = kit1;
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:putfield        #79  <Field Kit kit>
			protocolAndHostOverride = s;
	//   19   38:aload_0         
	//   20   39:aload_2         
	//   21   40:putfield        #81  <Field String protocolAndHostOverride>
			url = overrideProtocolAndHost(s1);
	//   22   43:aload_0         
	//   23   44:aload_0         
	//   24   45:aload_3         
	//   25   46:invokespecial   #85  <Method String overrideProtocolAndHost(String)>
	//   26   49:putfield        #87  <Field String url>
			requestFactory = httprequestfactory;
	//   27   52:aload_0         
	//   28   53:aload           4
	//   29   55:putfield        #89  <Field HttpRequestFactory requestFactory>
			method = httpmethod;
	//   30   58:aload_0         
	//   31   59:aload           5
	//   32   61:putfield        #91  <Field HttpMethod method>
			return;
	//   33   64:return          
		}
	}

	private String overrideProtocolAndHost(String s)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(!CommonUtils.isNullOrEmpty(protocolAndHostOverride))
	//*   2    2:aload_0         
	//*   3    3:getfield        #81  <Field String protocolAndHostOverride>
	//*   4    6:invokestatic    #97  <Method boolean CommonUtils.isNullOrEmpty(String)>
	//*   5    9:ifne            27
			s1 = PROTOCOL_AND_HOST_PATTERN.matcher(((CharSequence) (s))).replaceFirst(protocolAndHostOverride);
	//    6   12:getstatic       #63  <Field Pattern PROTOCOL_AND_HOST_PATTERN>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #101 <Method Matcher Pattern.matcher(CharSequence)>
	//    9   19:aload_0         
	//   10   20:getfield        #81  <Field String protocolAndHostOverride>
	//   11   23:invokevirtual   #106 <Method String Matcher.replaceFirst(String)>
	//   12   26:astore_2        
		return s1;
	//   13   27:aload_2         
	//   14   28:areturn         
	}

	protected HttpRequest getHttpRequest()
	{
		return getHttpRequest(Collections.emptyMap());
	//    0    0:aload_0         
	//    1    1:invokestatic    #114 <Method Map Collections.emptyMap()>
	//    2    4:invokevirtual   #117 <Method HttpRequest getHttpRequest(Map)>
	//    3    7:areturn         
	}

	protected HttpRequest getHttpRequest(Map map)
	{
		return requestFactory.buildHttpRequest(method, getUrl(), map).useCaches(false).connectTimeout(10000).header("User-Agent", (new StringBuilder()).append("Crashlytics Android SDK/").append(kit.getVersion()).toString()).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field HttpRequestFactory requestFactory>
	//    2    4:aload_0         
	//    3    5:getfield        #91  <Field HttpMethod method>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #121 <Method String getUrl()>
	//    6   12:aload_1         
	//    7   13:invokeinterface #127 <Method HttpRequest HttpRequestFactory.buildHttpRequest(HttpMethod, String, Map)>
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #133 <Method HttpRequest HttpRequest.useCaches(boolean)>
	//   10   22:sipush          10000
	//   11   25:invokevirtual   #137 <Method HttpRequest HttpRequest.connectTimeout(int)>
	//   12   28:ldc1            #41  <String "User-Agent">
	//   13   30:new             #139 <Class StringBuilder>
	//   14   33:dup             
	//   15   34:invokespecial   #140 <Method void StringBuilder()>
	//   16   37:ldc1            #17  <String "Crashlytics Android SDK/">
	//   17   39:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   18   42:aload_0         
	//   19   43:getfield        #79  <Field Kit kit>
	//   20   46:invokevirtual   #149 <Method String Kit.getVersion()>
	//   21   49:invokevirtual   #144 <Method StringBuilder StringBuilder.append(String)>
	//   22   52:invokevirtual   #152 <Method String StringBuilder.toString()>
	//   23   55:invokevirtual   #156 <Method HttpRequest HttpRequest.header(String, String)>
	//   24   58:ldc1            #35  <String "X-CRASHLYTICS-DEVELOPER-TOKEN">
	//   25   60:ldc1            #14  <String "470fa2b4ae81cd56ecbcda9735803434cec591fa">
	//   26   62:invokevirtual   #156 <Method HttpRequest HttpRequest.header(String, String)>
	//   27   65:areturn         
	}

	protected String getUrl()
	{
		return url;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field String url>
	//    2    4:areturn         
	}

	public static final String ACCEPT_JSON_VALUE = "application/json";
	public static final String ANDROID_CLIENT_TYPE = "android";
	public static final String CLS_ANDROID_SDK_DEVELOPER_TOKEN = "470fa2b4ae81cd56ecbcda9735803434cec591fa";
	public static final String CRASHLYTICS_USER_AGENT = "Crashlytics Android SDK/";
	public static final int DEFAULT_TIMEOUT = 10000;
	public static final String HEADER_ACCEPT = "Accept";
	public static final String HEADER_API_KEY = "X-CRASHLYTICS-API-KEY";
	public static final String HEADER_CLIENT_TYPE = "X-CRASHLYTICS-API-CLIENT-TYPE";
	public static final String HEADER_CLIENT_VERSION = "X-CRASHLYTICS-API-CLIENT-VERSION";
	public static final String HEADER_DEVELOPER_TOKEN = "X-CRASHLYTICS-DEVELOPER-TOKEN";
	public static final String HEADER_REQUEST_ID = "X-REQUEST-ID";
	public static final String HEADER_USER_AGENT = "User-Agent";
	private static final Pattern PROTOCOL_AND_HOST_PATTERN = Pattern.compile("http(s?)://[^\\/]+", 2);
	protected final Kit kit;
	private final HttpMethod method;
	private final String protocolAndHostOverride;
	private final HttpRequestFactory requestFactory;
	private final String url;

	static 
	{
	//    0    0:ldc1            #55  <String "http(s?)://[^\\/]+">
	//    1    2:iconst_2        
	//    2    3:invokestatic    #61  <Method Pattern Pattern.compile(String, int)>
	//    3    6:putstatic       #63  <Field Pattern PROTOCOL_AND_HOST_PATTERN>
	//*   4    9:return          
	}
}
