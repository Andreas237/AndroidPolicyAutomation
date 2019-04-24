// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.network;

import io.fabric.sdk.android.DefaultLogger;
import io.fabric.sdk.android.Logger;
import java.util.*;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package io.fabric.sdk.android.services.network:
//			HttpRequestFactory, NetworkUtils, HttpMethod, HttpRequest, 
//			PinningInfoProvider

public class DefaultHttpRequestFactory
	implements HttpRequestFactory
{

	public DefaultHttpRequestFactory()
	{
		this(((Logger) (new DefaultLogger())));
	//    0    0:aload_0         
	//    1    1:new             #24  <Class DefaultLogger>
	//    2    4:dup             
	//    3    5:invokespecial   #26  <Method void DefaultLogger()>
	//    4    8:invokespecial   #29  <Method void DefaultHttpRequestFactory(Logger)>
	//    5   11:return          
	}

	public DefaultHttpRequestFactory(Logger logger1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		logger = logger1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field Logger logger>
	//    5    9:return          
	}

	private SSLSocketFactory getSSLSocketFactory()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		SSLSocketFactory sslsocketfactory;
		if(sslSocketFactory == null && !attemptedSslInit)
	//*   2    2:aload_0         
	//*   3    3:getfield        #37  <Field SSLSocketFactory sslSocketFactory>
	//*   4    6:ifnonnull       24
	//*   5    9:aload_0         
	//*   6   10:getfield        #39  <Field boolean attemptedSslInit>
	//*   7   13:ifne            24
			sslSocketFactory = initSSLSocketFactory();
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:invokespecial   #42  <Method SSLSocketFactory initSSLSocketFactory()>
	//   11   21:putfield        #37  <Field SSLSocketFactory sslSocketFactory>
		sslsocketfactory = sslSocketFactory;
	//   12   24:aload_0         
	//   13   25:getfield        #37  <Field SSLSocketFactory sslSocketFactory>
	//   14   28:astore_1        
		this;
	//   15   29:aload_0         
		JVM INSTR monitorexit ;
	//   16   30:monitorexit     
		return sslsocketfactory;
	//   17   31:aload_1         
	//   18   32:areturn         
		Exception exception;
		exception;
	//   19   33:astore_1        
	//*  20   34:aload_0         
		throw exception;
	//   21   35:monitorexit     
	//   22   36:aload_1         
	//   23   37:athrow          
	}

	private SSLSocketFactory initSSLSocketFactory()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		attemptedSslInit = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #39  <Field boolean attemptedSslInit>
		SSLSocketFactory sslsocketfactory;
		sslsocketfactory = NetworkUtils.getSSLSocketFactory(pinningInfo);
	//    5    7:aload_0         
	//    6    8:getfield        #46  <Field PinningInfoProvider pinningInfo>
	//    7   11:invokestatic    #51  <Method SSLSocketFactory NetworkUtils.getSSLSocketFactory(PinningInfoProvider)>
	//    8   14:astore_1        
		logger.d("Fabric", "Custom SSL pinning enabled");
	//    9   15:aload_0         
	//   10   16:getfield        #33  <Field Logger logger>
	//   11   19:ldc1            #53  <String "Fabric">
	//   12   21:ldc1            #55  <String "Custom SSL pinning enabled">
	//   13   23:invokeinterface #61  <Method void Logger.d(String, String)>
_L1:
		this;
	//   14   28:aload_0         
		JVM INSTR monitorexit ;
	//   15   29:monitorexit     
		return sslsocketfactory;
	//   16   30:aload_1         
	//   17   31:areturn         
		Object obj;
		obj;
	//   18   32:astore_1        
		logger.e("Fabric", "Exception while validating pinned certs", ((Throwable) (obj)));
	//   19   33:aload_0         
	//   20   34:getfield        #33  <Field Logger logger>
	//   21   37:ldc1            #53  <String "Fabric">
	//   22   39:ldc1            #63  <String "Exception while validating pinned certs">
	//   23   41:aload_1         
	//   24   42:invokeinterface #67  <Method void Logger.e(String, String, Throwable)>
		obj = null;
	//   25   47:aconst_null     
	//   26   48:astore_1        
		  goto _L1
	//*  27   49:goto            28
		obj;
	//   28   52:astore_1        
	//*  29   53:aload_0         
		throw obj;
	//   30   54:monitorexit     
	//   31   55:aload_1         
	//   32   56:athrow          
	}

	private boolean isHttps(String s)
	{
		return s != null && s.toLowerCase(Locale.US).startsWith("https");
	//    0    0:aload_1         
	//    1    1:ifnull          21
	//    2    4:aload_1         
	//    3    5:getstatic       #75  <Field Locale Locale.US>
	//    4    8:invokevirtual   #81  <Method String String.toLowerCase(Locale)>
	//    5   11:ldc1            #12  <String "https">
	//    6   13:invokevirtual   #84  <Method boolean String.startsWith(String)>
	//    7   16:ifeq            21
	//    8   19:iconst_1        
	//    9   20:ireturn         
	//   10   21:iconst_0        
	//   11   22:ireturn         
	}

	private void resetSSLSocketFactory()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		attemptedSslInit = false;
	//    2    2:aload_0         
	//    3    3:iconst_0        
	//    4    4:putfield        #39  <Field boolean attemptedSslInit>
		sslSocketFactory = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #37  <Field SSLSocketFactory sslSocketFactory>
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return;
	//   10   14:return          
		Exception exception;
		exception;
	//   11   15:astore_1        
	//*  12   16:aload_0         
		throw exception;
	//   13   17:monitorexit     
	//   14   18:aload_1         
	//   15   19:athrow          
	}

	public HttpRequest buildHttpRequest(HttpMethod httpmethod, String s)
	{
		return buildHttpRequest(httpmethod, s, Collections.emptyMap());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #93  <Method Map Collections.emptyMap()>
	//    4    6:invokevirtual   #96  <Method HttpRequest buildHttpRequest(HttpMethod, String, Map)>
	//    5    9:areturn         
	}

	public HttpRequest buildHttpRequest(HttpMethod httpmethod, String s, Map map)
	{
		static class _cls1
		{

			static final int $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[];

			static 
			{
				$SwitchMap$io$fabric$sdk$android$services$network$HttpMethod = new int[HttpMethod.values().length];
			//    0    0:invokestatic    #18  <Method HttpMethod[] HttpMethod.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod>
				try
				{
					$SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[HttpMethod.GET.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod>
			//    5   12:getstatic       #24  <Field HttpMethod HttpMethod.GET>
			//    6   15:invokevirtual   #28  <Method int HttpMethod.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod>
			//*  10   23:getstatic       #31  <Field HttpMethod HttpMethod.POST>
			//*  11   26:invokevirtual   #28  <Method int HttpMethod.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod>
			//*  15   34:getstatic       #34  <Field HttpMethod HttpMethod.PUT>
			//*  16   37:invokevirtual   #28  <Method int HttpMethod.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$io$fabric$sdk$android$services$network$HttpMethod>
			//*  20   45:getstatic       #37  <Field HttpMethod HttpMethod.DELETE>
			//*  21   48:invokevirtual   #28  <Method int HttpMethod.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:return          
			//*  25   54:astore_0        
			//*  26   55:return          
			//*  27   56:astore_0        
			//*  28   57:goto            42
			//*  29   60:astore_0        
			//*  30   61:goto            31
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   64:astore_0        
				try
				{
					$SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[HttpMethod.POST.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror2) { }
				try
				{
					$SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[HttpMethod.PUT.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$io$fabric$sdk$android$services$network$HttpMethod[HttpMethod.DELETE.ordinal()] = 4;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  32   65:goto            20
			}
		}

		_cls1..SwitchMap.io.fabric.sdk.android.services.network.HttpMethod[httpmethod.ordinal()];
	//    0    0:getstatic       #100 <Field int[] DefaultHttpRequestFactory$1.$SwitchMap$io$fabric$sdk$android$services$network$HttpMethod>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #106 <Method int HttpMethod.ordinal()>
	//    3    7:iaload          
		JVM INSTR tableswitch 1 4: default 40
	//	               1 50
	//	               2 94
	//	               3 104
	//	               4 112;
	//    4    8:tableswitch     1 4: default 40
	//	               1 50
	//	               2 94
	//	               3 104
	//	               4 112
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		throw new IllegalArgumentException("Unsupported HTTP method!");
	//    5   40:new             #108 <Class IllegalArgumentException>
	//    6   43:dup             
	//    7   44:ldc1            #110 <String "Unsupported HTTP method!">
	//    8   46:invokespecial   #113 <Method void IllegalArgumentException(String)>
	//    9   49:athrow          
_L2:
		httpmethod = ((HttpMethod) (HttpRequest.get(((CharSequence) (s)), map, true)));
	//   10   50:aload_2         
	//   11   51:aload_3         
	//   12   52:iconst_1        
	//   13   53:invokestatic    #119 <Method HttpRequest HttpRequest.get(CharSequence, Map, boolean)>
	//   14   56:astore_1        
_L7:
		if(isHttps(s) && pinningInfo != null)
	//*  15   57:aload_0         
	//*  16   58:aload_2         
	//*  17   59:invokespecial   #121 <Method boolean isHttps(String)>
	//*  18   62:ifeq            92
	//*  19   65:aload_0         
	//*  20   66:getfield        #46  <Field PinningInfoProvider pinningInfo>
	//*  21   69:ifnull          92
		{
			s = ((String) (getSSLSocketFactory()));
	//   22   72:aload_0         
	//   23   73:invokespecial   #123 <Method SSLSocketFactory getSSLSocketFactory()>
	//   24   76:astore_2        
			if(s != null)
	//*  25   77:aload_2         
	//*  26   78:ifnull          92
				((HttpsURLConnection)((HttpRequest) (httpmethod)).getConnection()).setSSLSocketFactory(((SSLSocketFactory) (s)));
	//   27   81:aload_1         
	//   28   82:invokevirtual   #127 <Method java.net.HttpURLConnection HttpRequest.getConnection()>
	//   29   85:checkcast       #129 <Class HttpsURLConnection>
	//   30   88:aload_2         
	//   31   89:invokevirtual   #133 <Method void HttpsURLConnection.setSSLSocketFactory(SSLSocketFactory)>
		}
		return ((HttpRequest) (httpmethod));
	//   32   92:aload_1         
	//   33   93:areturn         
_L3:
		httpmethod = ((HttpMethod) (HttpRequest.post(((CharSequence) (s)), map, true)));
	//   34   94:aload_2         
	//   35   95:aload_3         
	//   36   96:iconst_1        
	//   37   97:invokestatic    #136 <Method HttpRequest HttpRequest.post(CharSequence, Map, boolean)>
	//   38  100:astore_1        
		continue; /* Loop/switch isn't completed */
	//   39  101:goto            57
_L4:
		httpmethod = ((HttpMethod) (HttpRequest.put(((CharSequence) (s)))));
	//   40  104:aload_2         
	//   41  105:invokestatic    #140 <Method HttpRequest HttpRequest.put(CharSequence)>
	//   42  108:astore_1        
		continue; /* Loop/switch isn't completed */
	//   43  109:goto            57
_L5:
		httpmethod = ((HttpMethod) (HttpRequest.delete(((CharSequence) (s)))));
	//   44  112:aload_2         
	//   45  113:invokestatic    #143 <Method HttpRequest HttpRequest.delete(CharSequence)>
	//   46  116:astore_1        
		if(true) goto _L7; else goto _L6
	//   47  117:goto            57
_L6:
	}

	public PinningInfoProvider getPinningInfoProvider()
	{
		return pinningInfo;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field PinningInfoProvider pinningInfo>
	//    2    4:areturn         
	}

	public void setPinningInfoProvider(PinningInfoProvider pinninginfoprovider)
	{
		if(pinningInfo != pinninginfoprovider)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field PinningInfoProvider pinningInfo>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			pinningInfo = pinninginfoprovider;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #46  <Field PinningInfoProvider pinningInfo>
			resetSSLSocketFactory();
	//    7   13:aload_0         
	//    8   14:invokespecial   #151 <Method void resetSSLSocketFactory()>
		}
	//    9   17:return          
	}

	private static final String HTTPS = "https";
	private boolean attemptedSslInit;
	private final Logger logger;
	private PinningInfoProvider pinningInfo;
	private SSLSocketFactory sslSocketFactory;
}
