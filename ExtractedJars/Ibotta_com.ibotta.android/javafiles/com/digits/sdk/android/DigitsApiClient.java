// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import com.newrelic.agent.android.instrumentation.retrofit.RetrofitInstrumentation;
import com.twitter.sdk.android.core.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLSocketFactory;
import retrofit.RestAdapter;
import retrofit.android.MainThreadExecutor;

// Referenced classes of package com.digits.sdk.android:
//			Digits, DigitsUserAgent, DigitsApi, DigitsRequestInterceptor

class DigitsApiClient
{
	public static interface AccountService
	{

		public abstract void verifyAccount(Callback callback);
	}

	protected static interface DeviceService
	{

		public abstract void register(String s, String s1, Boolean boolean1, String s2, String s3, String s4, Callback callback);
	}

	protected static interface SdkService
	{

		public abstract void account(String s, String s1, Callback callback);

		public abstract void auth(String s, String s1, Callback callback);

		public abstract void login(String s, long l, String s1, Callback callback);

		public abstract void verifyPin(String s, long l, String s1, Callback callback);
	}


	DigitsApiClient(Session session1)
	{
		this(session1, TwitterCore.getInstance().getAuthConfig(), TwitterCore.getInstance().getSSLSocketFactory(), Digits.getInstance().getExecutorService(), new DigitsUserAgent(Digits.getInstance().getVersion(), android.os.Build.VERSION.RELEASE));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #29  <Method TwitterCore TwitterCore.getInstance()>
	//    3    5:invokevirtual   #33  <Method TwitterAuthConfig TwitterCore.getAuthConfig()>
	//    4    8:invokestatic    #29  <Method TwitterCore TwitterCore.getInstance()>
	//    5   11:invokevirtual   #37  <Method SSLSocketFactory TwitterCore.getSSLSocketFactory()>
	//    6   14:invokestatic    #42  <Method Digits Digits.getInstance()>
	//    7   17:invokevirtual   #46  <Method ExecutorService Digits.getExecutorService()>
	//    8   20:new             #48  <Class DigitsUserAgent>
	//    9   23:dup             
	//   10   24:invokestatic    #42  <Method Digits Digits.getInstance()>
	//   11   27:invokevirtual   #52  <Method String Digits.getVersion()>
	//   12   30:getstatic       #58  <Field String android.os.Build$VERSION.RELEASE>
	//   13   33:invokespecial   #61  <Method void DigitsUserAgent(String, String)>
	//   14   36:invokespecial   #64  <Method void DigitsApiClient(Session, TwitterAuthConfig, SSLSocketFactory, ExecutorService, DigitsUserAgent)>
	//   15   39:return          
	}

	DigitsApiClient(Session session1, TwitterAuthConfig twitterauthconfig, SSLSocketFactory sslsocketfactory, ExecutorService executorservice, DigitsUserAgent digitsuseragent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void Object()>
		session = session1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #70  <Field Session session>
		services = new ConcurrentHashMap();
	//    5    9:aload_0         
	//    6   10:new             #72  <Class ConcurrentHashMap>
	//    7   13:dup             
	//    8   14:invokespecial   #73  <Method void ConcurrentHashMap()>
	//    9   17:putfield        #75  <Field ConcurrentHashMap services>
		executorservice = ((ExecutorService) ((new retrofit.RestAdapter.Builder()).setEndpoint((new DigitsApi()).getBaseHostUrl()).setRequestInterceptor(((retrofit.RequestInterceptor) (new DigitsRequestInterceptor(digitsuseragent)))).setExecutors(((java.util.concurrent.Executor) (executorservice)), ((java.util.concurrent.Executor) (new MainThreadExecutor())))));
	//   10   20:new             #77  <Class retrofit.RestAdapter$Builder>
	//   11   23:dup             
	//   12   24:invokespecial   #78  <Method void retrofit.RestAdapter$Builder()>
	//   13   27:new             #80  <Class DigitsApi>
	//   14   30:dup             
	//   15   31:invokespecial   #81  <Method void DigitsApi()>
	//   16   34:invokevirtual   #84  <Method String DigitsApi.getBaseHostUrl()>
	//   17   37:invokevirtual   #88  <Method retrofit.RestAdapter$Builder retrofit.RestAdapter$Builder.setEndpoint(String)>
	//   18   40:new             #90  <Class DigitsRequestInterceptor>
	//   19   43:dup             
	//   20   44:aload           5
	//   21   46:invokespecial   #93  <Method void DigitsRequestInterceptor(DigitsUserAgent)>
	//   22   49:invokevirtual   #97  <Method retrofit.RestAdapter$Builder retrofit.RestAdapter$Builder.setRequestInterceptor(retrofit.RequestInterceptor)>
	//   23   52:aload           4
	//   24   54:new             #99  <Class MainThreadExecutor>
	//   25   57:dup             
	//   26   58:invokespecial   #100 <Method void MainThreadExecutor()>
	//   27   61:invokevirtual   #104 <Method retrofit.RestAdapter$Builder retrofit.RestAdapter$Builder.setExecutors(java.util.concurrent.Executor, java.util.concurrent.Executor)>
	//   28   64:astore          4
		session1 = ((Session) (new AuthenticatedClient(twitterauthconfig, session1, sslsocketfactory)));
	//   29   66:new             #106 <Class AuthenticatedClient>
	//   30   69:dup             
	//   31   70:aload_2         
	//   32   71:aload_1         
	//   33   72:aload_3         
	//   34   73:invokespecial   #109 <Method void AuthenticatedClient(TwitterAuthConfig, Session, SSLSocketFactory)>
	//   35   76:astore_1        
		if(!(executorservice instanceof retrofit.RestAdapter.Builder))
	//*  36   77:aload           4
	//*  37   79:instanceof      #77  <Class retrofit.RestAdapter$Builder>
	//*  38   82:ifne            95
			session1 = ((Session) (((retrofit.RestAdapter.Builder) (executorservice)).setClient(((retrofit.client.Client) (session1)))));
	//   39   85:aload           4
	//   40   87:aload_1         
	//   41   88:invokevirtual   #113 <Method retrofit.RestAdapter$Builder retrofit.RestAdapter$Builder.setClient(retrofit.client.Client)>
	//   42   91:astore_1        
		else
	//*  43   92:goto            105
			session1 = ((Session) (RetrofitInstrumentation.setClient((retrofit.RestAdapter.Builder)executorservice, ((retrofit.client.Client) (session1)))));
	//   44   95:aload           4
	//   45   97:checkcast       #77  <Class retrofit.RestAdapter$Builder>
	//   46  100:aload_1         
	//   47  101:invokestatic    #118 <Method retrofit.RestAdapter$Builder RetrofitInstrumentation.setClient(retrofit.RestAdapter$Builder, retrofit.client.Client)>
	//   48  104:astore_1        
		restAdapter = ((retrofit.RestAdapter.Builder) (session1)).build();
	//   49  105:aload_0         
	//   50  106:aload_1         
	//   51  107:invokevirtual   #122 <Method RestAdapter retrofit.RestAdapter$Builder.build()>
	//   52  110:putfield        #124 <Field RestAdapter restAdapter>
	//   53  113:return          
	}

	private Object getService(Class class1)
	{
		if(!services.containsKey(((Object) (class1))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field ConcurrentHashMap services>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #130 <Method boolean ConcurrentHashMap.containsKey(Object)>
	//*   4    8:ifne            28
			services.put(((Object) (class1)), restAdapter.create(class1));
	//    5   11:aload_0         
	//    6   12:getfield        #75  <Field ConcurrentHashMap services>
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #124 <Field RestAdapter restAdapter>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #135 <Method Object RestAdapter.create(Class)>
	//   12   24:invokevirtual   #139 <Method Object ConcurrentHashMap.put(Object, Object)>
	//   13   27:pop             
		return services.get(((Object) (class1)));
	//   14   28:aload_0         
	//   15   29:getfield        #75  <Field ConcurrentHashMap services>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #143 <Method Object ConcurrentHashMap.get(Object)>
	//   18   36:areturn         
	}

	public AccountService getAccountService()
	{
		return (AccountService)getService(com/digits/sdk/android/DigitsApiClient$AccountService);
	//    0    0:aload_0         
	//    1    1:ldc1            #6   <Class DigitsApiClient$AccountService>
	//    2    3:invokespecial   #149 <Method Object getService(Class)>
	//    3    6:checkcast       #6   <Class DigitsApiClient$AccountService>
	//    4    9:areturn         
	}

	public DeviceService getDeviceService()
	{
		return (DeviceService)getService(com/digits/sdk/android/DigitsApiClient$DeviceService);
	//    0    0:aload_0         
	//    1    1:ldc1            #9   <Class DigitsApiClient$DeviceService>
	//    2    3:invokespecial   #149 <Method Object getService(Class)>
	//    3    6:checkcast       #9   <Class DigitsApiClient$DeviceService>
	//    4    9:areturn         
	}

	public SdkService getSdkService()
	{
		return (SdkService)getService(com/digits/sdk/android/DigitsApiClient$SdkService);
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <Class DigitsApiClient$SdkService>
	//    2    3:invokespecial   #149 <Method Object getService(Class)>
	//    3    6:checkcast       #12  <Class DigitsApiClient$SdkService>
	//    4    9:areturn         
	}

	public Session getSession()
	{
		return session;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field Session session>
	//    2    4:areturn         
	}

	private final RestAdapter restAdapter;
	private final ConcurrentHashMap services;
	private final Session session;
}
