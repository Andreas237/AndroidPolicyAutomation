// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pactforcure.app.core.BackboneApplication;
import com.pactforcure.app.participant.ParticipantStorage;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

// Referenced classes of package com.pactforcure.app.api:
//			AcceptLanguageInterceptor, ApiService, AuthorizedApiService

public class ApiServiceFactory
{

	public ApiServiceFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	private static ObjectMapper buildLenientObjectMapper()
	{
		ObjectMapper objectmapper = new ObjectMapper();
	//    0    0:new             #16  <Class ObjectMapper>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void ObjectMapper()>
	//    3    7:astore_0        
		objectmapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	//    4    8:aload_0         
	//    5    9:getstatic       #23  <Field DeserializationFeature DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES>
	//    6   12:invokevirtual   #27  <Method ObjectMapper ObjectMapper.disable(DeserializationFeature)>
	//    7   15:pop             
		return objectmapper;
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	static Response lambda$newAuthorizedApiService$0(okhttp3.Interceptor.Chain chain)
		throws IOException
	{
		return chain.proceed(chain.request().newBuilder().header("Authorization", ParticipantStorage.getAccessToken()).build());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokeinterface #37  <Method Request okhttp3.Interceptor$Chain.request()>
	//    3    7:invokevirtual   #43  <Method okhttp3.Request$Builder Request.newBuilder()>
	//    4   10:ldc1            #45  <String "Authorization">
	//    5   12:invokestatic    #51  <Method String ParticipantStorage.getAccessToken()>
	//    6   15:invokevirtual   #57  <Method okhttp3.Request$Builder okhttp3.Request$Builder.header(String, String)>
	//    7   18:invokevirtual   #60  <Method Request okhttp3.Request$Builder.build()>
	//    8   21:invokeinterface #64  <Method Response okhttp3.Interceptor$Chain.proceed(Request)>
	//    9   26:areturn         
	}

	public static ApiService newApiService()
	{
		Object obj = ((Object) (new HttpLoggingInterceptor()));
	//    0    0:new             #69  <Class HttpLoggingInterceptor>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void HttpLoggingInterceptor()>
	//    3    7:astore_0        
		AcceptLanguageInterceptor acceptlanguageinterceptor = new AcceptLanguageInterceptor(Locale.getDefault());
	//    4    8:new             #72  <Class AcceptLanguageInterceptor>
	//    5   11:dup             
	//    6   12:invokestatic    #78  <Method Locale Locale.getDefault()>
	//    7   15:invokespecial   #81  <Method void AcceptLanguageInterceptor(Locale)>
	//    8   18:astore_1        
		((HttpLoggingInterceptor) (obj)).setLevel(okhttp3.logging.HttpLoggingInterceptor.Level.BODY);
	//    9   19:aload_0         
	//   10   20:getstatic       #87  <Field okhttp3.logging.HttpLoggingInterceptor$Level okhttp3.logging.HttpLoggingInterceptor$Level.BODY>
	//   11   23:invokevirtual   #91  <Method HttpLoggingInterceptor HttpLoggingInterceptor.setLevel(okhttp3.logging.HttpLoggingInterceptor$Level)>
	//   12   26:pop             
		obj = ((Object) ((new okhttp3.OkHttpClient.Builder()).addInterceptor(((okhttp3.Interceptor) (acceptlanguageinterceptor))).addInterceptor(((okhttp3.Interceptor) (obj))).connectTimeout(15L, TimeUnit.SECONDS).readTimeout(15L, TimeUnit.SECONDS).writeTimeout(15L, TimeUnit.SECONDS)));
	//   13   27:new             #93  <Class okhttp3.OkHttpClient$Builder>
	//   14   30:dup             
	//   15   31:invokespecial   #94  <Method void okhttp3.OkHttpClient$Builder()>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #98  <Method okhttp3.OkHttpClient$Builder okhttp3.OkHttpClient$Builder.addInterceptor(okhttp3.Interceptor)>
	//   18   38:aload_0         
	//   19   39:invokevirtual   #98  <Method okhttp3.OkHttpClient$Builder okhttp3.OkHttpClient$Builder.addInterceptor(okhttp3.Interceptor)>
	//   20   42:ldc2w           #99  <Long 15L>
	//   21   45:getstatic       #106 <Field TimeUnit TimeUnit.SECONDS>
	//   22   48:invokevirtual   #110 <Method okhttp3.OkHttpClient$Builder okhttp3.OkHttpClient$Builder.connectTimeout(long, TimeUnit)>
	//   23   51:ldc2w           #99  <Long 15L>
	//   24   54:getstatic       #106 <Field TimeUnit TimeUnit.SECONDS>
	//   25   57:invokevirtual   #113 <Method okhttp3.OkHttpClient$Builder okhttp3.OkHttpClient$Builder.readTimeout(long, TimeUnit)>
	//   26   60:ldc2w           #99  <Long 15L>
	//   27   63:getstatic       #106 <Field TimeUnit TimeUnit.SECONDS>
	//   28   66:invokevirtual   #116 <Method okhttp3.OkHttpClient$Builder okhttp3.OkHttpClient$Builder.writeTimeout(long, TimeUnit)>
	//   29   69:astore_0        
		return (ApiService)(new retrofit2.Retrofit.Builder()).baseUrl(BackboneApplication.get().getString(0x7f0801be)).addConverterFactory(((retrofit2.Converter.Factory) (JacksonConverterFactory.create(buildLenientObjectMapper())))).client(((okhttp3.OkHttpClient.Builder) (obj)).build()).build().create(com/pactforcure/app/api/ApiService);
	//   30   70:new             #118 <Class retrofit2.Retrofit$Builder>
	//   31   73:dup             
	//   32   74:invokespecial   #119 <Method void retrofit2.Retrofit$Builder()>
	//   33   77:invokestatic    #125 <Method BackboneApplication BackboneApplication.get()>
	//   34   80:ldc1            #126 <Int 0x7f0801be>
	//   35   82:invokevirtual   #130 <Method String BackboneApplication.getString(int)>
	//   36   85:invokevirtual   #134 <Method retrofit2.Retrofit$Builder retrofit2.Retrofit$Builder.baseUrl(String)>
	//   37   88:invokestatic    #136 <Method ObjectMapper buildLenientObjectMapper()>
	//   38   91:invokestatic    #142 <Method JacksonConverterFactory JacksonConverterFactory.create(ObjectMapper)>
	//   39   94:invokevirtual   #146 <Method retrofit2.Retrofit$Builder retrofit2.Retrofit$Builder.addConverterFactory(retrofit2.Converter$Factory)>
	//   40   97:aload_0         
	//   41   98:invokevirtual   #149 <Method okhttp3.OkHttpClient okhttp3.OkHttpClient$Builder.build()>
	//   42  101:invokevirtual   #153 <Method retrofit2.Retrofit$Builder retrofit2.Retrofit$Builder.client(okhttp3.OkHttpClient)>
	//   43  104:invokevirtual   #156 <Method Retrofit retrofit2.Retrofit$Builder.build()>
	//   44  107:ldc1            #158 <Class ApiService>
	//   45  109:invokevirtual   #163 <Method Object Retrofit.create(Class)>
	//   46  112:checkcast       #158 <Class ApiService>
	//   47  115:areturn         
	}

	public static AuthorizedApiService newAuthorizedApiService()
	{
		Object obj = ((Object) (new HttpLoggingInterceptor()));
	//    0    0:new             #69  <Class HttpLoggingInterceptor>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void HttpLoggingInterceptor()>
	//    3    7:astore_0        
		AcceptLanguageInterceptor acceptlanguageinterceptor = new AcceptLanguageInterceptor(Locale.getDefault());
	//    4    8:new             #72  <Class AcceptLanguageInterceptor>
	//    5   11:dup             
	//    6   12:invokestatic    #78  <Method Locale Locale.getDefault()>
	//    7   15:invokespecial   #81  <Method void AcceptLanguageInterceptor(Locale)>
	//    8   18:astore_1        
		((HttpLoggingInterceptor) (obj)).setLevel(okhttp3.logging.HttpLoggingInterceptor.Level.BODY);
	//    9   19:aload_0         
	//   10   20:getstatic       #87  <Field okhttp3.logging.HttpLoggingInterceptor$Level okhttp3.logging.HttpLoggingInterceptor$Level.BODY>
	//   11   23:invokevirtual   #91  <Method HttpLoggingInterceptor HttpLoggingInterceptor.setLevel(okhttp3.logging.HttpLoggingInterceptor$Level)>
	//   12   26:pop             
		obj = ((Object) ((new okhttp3.OkHttpClient.Builder()).addInterceptor(((Interceptor) (acceptlanguageinterceptor))).addInterceptor(((Interceptor) (obj))).connectTimeout(15L, TimeUnit.SECONDS).readTimeout(15L, TimeUnit.SECONDS).writeTimeout(15L, TimeUnit.SECONDS)));
	//   13   27:new             #93  <Class okhttp3.OkHttpClient$Builder>
	//   14   30:dup             
	//   15   31:invokespecial   #94  <Method void okhttp3.OkHttpClient$Builder()>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #98  <Method okhttp3.OkHttpClient$Builder okhttp3.OkHttpClient$Builder.addInterceptor(Interceptor)>
	//   18   38:aload_0         
	//   19   39:invokevirtual   #98  <Method okhttp3.OkHttpClient$Builder okhttp3.OkHttpClient$Builder.addInterceptor(Interceptor)>
	//   20   42:ldc2w           #99  <Long 15L>
	//   21   45:getstatic       #106 <Field TimeUnit TimeUnit.SECONDS>
	//   22   48:invokevirtual   #110 <Method okhttp3.OkHttpClient$Builder okhttp3.OkHttpClient$Builder.connectTimeout(long, TimeUnit)>
	//   23   51:ldc2w           #99  <Long 15L>
	//   24   54:getstatic       #106 <Field TimeUnit TimeUnit.SECONDS>
	//   25   57:invokevirtual   #113 <Method okhttp3.OkHttpClient$Builder okhttp3.OkHttpClient$Builder.readTimeout(long, TimeUnit)>
	//   26   60:ldc2w           #99  <Long 15L>
	//   27   63:getstatic       #106 <Field TimeUnit TimeUnit.SECONDS>
	//   28   66:invokevirtual   #116 <Method okhttp3.OkHttpClient$Builder okhttp3.OkHttpClient$Builder.writeTimeout(long, TimeUnit)>
	//   29   69:astore_0        
		class .Lambda._cls1
			implements Interceptor
		{

			public static Interceptor lambdaFactory$()
			{
				return ((Interceptor) (instance));
			//    0    0:getstatic       #15  <Field ApiServiceFactory$$Lambda$1 instance>
			//    1    3:areturn         
			}

			public Response intercept(okhttp3.Interceptor.Chain chain)
			{
				return ApiServiceFactory.lambda$newAuthorizedApiService$0(chain);
			//    0    0:aload_1         
			//    1    1:invokestatic    #26  <Method Response ApiServiceFactory.lambda$newAuthorizedApiService$0(okhttp3.Interceptor$Chain)>
			//    2    4:areturn         
			}

			private static final .Lambda._cls1 instance = new .Lambda._cls1();

			static 
			{
			//    0    0:new             #2   <Class ApiServiceFactory$$Lambda$1>
			//    1    3:dup             
			//    2    4:invokespecial   #13  <Method void ApiServiceFactory$$Lambda$1()>
			//    3    7:putstatic       #15  <Field ApiServiceFactory$$Lambda$1 instance>
			//*   4   10:return          
			}

			private .Lambda._cls1()
			{
			//    0    0:aload_0         
			//    1    1:invokespecial   #17  <Method void Object()>
			//    2    4:return          
			}
		}

		((okhttp3.OkHttpClient.Builder) (obj)).addInterceptor(.Lambda._cls1.lambdaFactory.());
	//   30   70:aload_0         
	//   31   71:invokestatic    #171 <Method Interceptor ApiServiceFactory$$Lambda$1.lambdaFactory$()>
	//   32   74:invokevirtual   #98  <Method okhttp3.OkHttpClient$Builder okhttp3.OkHttpClient$Builder.addInterceptor(Interceptor)>
	//   33   77:pop             
		return (AuthorizedApiService)(new retrofit2.Retrofit.Builder()).baseUrl(BackboneApplication.get().getString(0x7f0801be)).addConverterFactory(((retrofit2.Converter.Factory) (JacksonConverterFactory.create(buildLenientObjectMapper())))).client(((okhttp3.OkHttpClient.Builder) (obj)).build()).build().create(com/pactforcure/app/api/AuthorizedApiService);
	//   34   78:new             #118 <Class retrofit2.Retrofit$Builder>
	//   35   81:dup             
	//   36   82:invokespecial   #119 <Method void retrofit2.Retrofit$Builder()>
	//   37   85:invokestatic    #125 <Method BackboneApplication BackboneApplication.get()>
	//   38   88:ldc1            #126 <Int 0x7f0801be>
	//   39   90:invokevirtual   #130 <Method String BackboneApplication.getString(int)>
	//   40   93:invokevirtual   #134 <Method retrofit2.Retrofit$Builder retrofit2.Retrofit$Builder.baseUrl(String)>
	//   41   96:invokestatic    #136 <Method ObjectMapper buildLenientObjectMapper()>
	//   42   99:invokestatic    #142 <Method JacksonConverterFactory JacksonConverterFactory.create(ObjectMapper)>
	//   43  102:invokevirtual   #146 <Method retrofit2.Retrofit$Builder retrofit2.Retrofit$Builder.addConverterFactory(retrofit2.Converter$Factory)>
	//   44  105:aload_0         
	//   45  106:invokevirtual   #149 <Method okhttp3.OkHttpClient okhttp3.OkHttpClient$Builder.build()>
	//   46  109:invokevirtual   #153 <Method retrofit2.Retrofit$Builder retrofit2.Retrofit$Builder.client(okhttp3.OkHttpClient)>
	//   47  112:invokevirtual   #156 <Method Retrofit retrofit2.Retrofit$Builder.build()>
	//   48  115:ldc1            #173 <Class AuthorizedApiService>
	//   49  117:invokevirtual   #163 <Method Object Retrofit.create(Class)>
	//   50  120:checkcast       #173 <Class AuthorizedApiService>
	//   51  123:areturn         
	}

	private static final int TIMEOUT = 15;
}
