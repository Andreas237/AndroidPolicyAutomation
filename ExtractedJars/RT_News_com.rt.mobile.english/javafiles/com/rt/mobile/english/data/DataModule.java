// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.rt.mobile.english.data;

import android.app.Application;
import com.facebook.stetho.okhttp.StethoInterceptor;
import com.rt.mobile.english.ui.widget.ChromeCast;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.security.SecureRandom;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

// Referenced classes of package com.rt.mobile.english.data:
//			AppEventCounter, EditionManager

public final class DataModule
{

	public DataModule()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
	//    2    4:return          
	}

	AppEventCounter provideAppEventCounter(Application application)
	{
		return new AppEventCounter(((android.content.Context) (application)));
	//    0    0:new             #56  <Class AppEventCounter>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #59  <Method void AppEventCounter(android.content.Context)>
	//    4    8:areturn         
	}

	ChromeCast provideChromeCast()
	{
		return new ChromeCast();
	//    0    0:new             #64  <Class ChromeCast>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void ChromeCast()>
	//    3    7:areturn         
	}

	EditionManager provideEditions()
	{
		return new EditionManager();
	//    0    0:new             #69  <Class EditionManager>
	//    1    3:dup             
	//    2    4:invokespecial   #70  <Method void EditionManager()>
	//    3    7:areturn         
	}

	OkHttpClient provideOkHttpImageClient(Application application)
	{
		Object obj1;
		try
		{
			Object obj = ((Object) (new _cls2()));
	//    0    0:new             #79  <Class DataModule$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #82  <Method void DataModule$2(DataModule)>
	//    4    8:astore_2        
			obj1 = ((Object) (SSLContext.getInstance("SSL")));
	//    5    9:ldc1            #84  <String "SSL">
	//    6   11:invokestatic    #90  <Method SSLContext SSLContext.getInstance(String)>
	//    7   14:astore_3        
			SecureRandom securerandom = new SecureRandom();
	//    8   15:new             #92  <Class SecureRandom>
	//    9   18:dup             
	//   10   19:invokespecial   #93  <Method void SecureRandom()>
	//   11   22:astore          4
			((SSLContext) (obj1)).init(((javax.net.ssl.KeyManager []) (null)), new TrustManager[] {
				obj
			}, securerandom);
	//   12   24:aload_3         
	//   13   25:aconst_null     
	//   14   26:iconst_1        
	//   15   27:anewarray       TrustManager[]
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:aload_2         
	//   19   33:aastore         
	//   20   34:aload           4
	//   21   36:invokevirtual   #99  <Method void SSLContext.init(javax.net.ssl.KeyManager[], TrustManager[], SecureRandom)>
			obj = ((Object) (((SSLContext) (obj1)).getSocketFactory()));
	//   22   39:aload_3         
	//   23   40:invokevirtual   #103 <Method javax.net.ssl.SSLSocketFactory SSLContext.getSocketFactory()>
	//   24   43:astore_2        
			obj1 = ((Object) (new OkHttpClient()));
	//   25   44:new             #105 <Class OkHttpClient>
	//   26   47:dup             
	//   27   48:invokespecial   #106 <Method void OkHttpClient()>
	//   28   51:astore_3        
			((OkHttpClient) (obj1)).networkInterceptors().add(((Object) (new StethoInterceptor())));
	//   29   52:aload_3         
	//   30   53:invokevirtual   #110 <Method List OkHttpClient.networkInterceptors()>
	//   31   56:new             #112 <Class StethoInterceptor>
	//   32   59:dup             
	//   33   60:invokespecial   #113 <Method void StethoInterceptor()>
	//   34   63:invokeinterface #119 <Method boolean List.add(Object)>
	//   35   68:pop             
			((OkHttpClient) (obj1)).setSslSocketFactory(((javax.net.ssl.SSLSocketFactory) (obj)));
	//   36   69:aload_3         
	//   37   70:aload_2         
	//   38   71:invokevirtual   #123 <Method OkHttpClient OkHttpClient.setSslSocketFactory(javax.net.ssl.SSLSocketFactory)>
	//   39   74:pop             
			((OkHttpClient) (obj1)).setCache(new Cache(new File(application.getCacheDir(), "cache_img"), 0x2d00000L));
	//   40   75:aload_3         
	//   41   76:new             #125 <Class Cache>
	//   42   79:dup             
	//   43   80:new             #127 <Class File>
	//   44   83:dup             
	//   45   84:aload_1         
	//   46   85:invokevirtual   #133 <Method File Application.getCacheDir()>
	//   47   88:ldc1            #135 <String "cache_img">
	//   48   90:invokespecial   #138 <Method void File(File, String)>
	//   49   93:ldc2w           #139 <Long 0x2d00000L>
	//   50   96:invokespecial   #143 <Method void Cache(File, long)>
	//   51   99:invokevirtual   #147 <Method OkHttpClient OkHttpClient.setCache(Cache)>
	//   52  102:pop             
		}
	//*  53  103:aload_3         
	//*  54  104:areturn         
		// Misplaced declaration of an exception variable
		catch(Application application)
	//*  55  105:astore_1        
		{
			throw new RuntimeException(((Throwable) (application)));
	//   56  106:new             #149 <Class RuntimeException>
	//   57  109:dup             
	//   58  110:aload_1         
	//   59  111:invokespecial   #152 <Method void RuntimeException(Throwable)>
	//   60  114:athrow          
		}
		return ((OkHttpClient) (obj1));
	}

	OkHttpClient provideOkHttpJsonClient(Application application)
	{
		Object obj1;
		try
		{
			Object obj = ((Object) (new _cls1()));
	//    0    0:new             #156 <Class DataModule$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #157 <Method void DataModule$1(DataModule)>
	//    4    8:astore_2        
			obj1 = ((Object) (SSLContext.getInstance("SSL")));
	//    5    9:ldc1            #84  <String "SSL">
	//    6   11:invokestatic    #90  <Method SSLContext SSLContext.getInstance(String)>
	//    7   14:astore_3        
			SecureRandom securerandom = new SecureRandom();
	//    8   15:new             #92  <Class SecureRandom>
	//    9   18:dup             
	//   10   19:invokespecial   #93  <Method void SecureRandom()>
	//   11   22:astore          4
			((SSLContext) (obj1)).init(((javax.net.ssl.KeyManager []) (null)), new TrustManager[] {
				obj
			}, securerandom);
	//   12   24:aload_3         
	//   13   25:aconst_null     
	//   14   26:iconst_1        
	//   15   27:anewarray       TrustManager[]
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:aload_2         
	//   19   33:aastore         
	//   20   34:aload           4
	//   21   36:invokevirtual   #99  <Method void SSLContext.init(javax.net.ssl.KeyManager[], TrustManager[], SecureRandom)>
			obj = ((Object) (((SSLContext) (obj1)).getSocketFactory()));
	//   22   39:aload_3         
	//   23   40:invokevirtual   #103 <Method javax.net.ssl.SSLSocketFactory SSLContext.getSocketFactory()>
	//   24   43:astore_2        
			obj1 = ((Object) (new OkHttpClient()));
	//   25   44:new             #105 <Class OkHttpClient>
	//   26   47:dup             
	//   27   48:invokespecial   #106 <Method void OkHttpClient()>
	//   28   51:astore_3        
			((OkHttpClient) (obj1)).setSslSocketFactory(((javax.net.ssl.SSLSocketFactory) (obj)));
	//   29   52:aload_3         
	//   30   53:aload_2         
	//   31   54:invokevirtual   #123 <Method OkHttpClient OkHttpClient.setSslSocketFactory(javax.net.ssl.SSLSocketFactory)>
	//   32   57:pop             
			((OkHttpClient) (obj1)).networkInterceptors().add(((Object) (new StethoInterceptor())));
	//   33   58:aload_3         
	//   34   59:invokevirtual   #110 <Method List OkHttpClient.networkInterceptors()>
	//   35   62:new             #112 <Class StethoInterceptor>
	//   36   65:dup             
	//   37   66:invokespecial   #113 <Method void StethoInterceptor()>
	//   38   69:invokeinterface #119 <Method boolean List.add(Object)>
	//   39   74:pop             
			((OkHttpClient) (obj1)).setCache(new Cache(new File(application.getCacheDir(), "cache_json"), 0xf00000L));
	//   40   75:aload_3         
	//   41   76:new             #125 <Class Cache>
	//   42   79:dup             
	//   43   80:new             #127 <Class File>
	//   44   83:dup             
	//   45   84:aload_1         
	//   46   85:invokevirtual   #133 <Method File Application.getCacheDir()>
	//   47   88:ldc1            #159 <String "cache_json">
	//   48   90:invokespecial   #138 <Method void File(File, String)>
	//   49   93:ldc2w           #160 <Long 0xf00000L>
	//   50   96:invokespecial   #143 <Method void Cache(File, long)>
	//   51   99:invokevirtual   #147 <Method OkHttpClient OkHttpClient.setCache(Cache)>
	//   52  102:pop             
		}
	//*  53  103:aload_3         
	//*  54  104:areturn         
		// Misplaced declaration of an exception variable
		catch(Application application)
	//*  55  105:astore_1        
		{
			throw new RuntimeException(((Throwable) (application)));
	//   56  106:new             #149 <Class RuntimeException>
	//   57  109:dup             
	//   58  110:aload_1         
	//   59  111:invokespecial   #152 <Method void RuntimeException(Throwable)>
	//   60  114:athrow          
		}
		return ((OkHttpClient) (obj1));
	}

	Picasso providePicasso(Application application, OkHttpClient okhttpclient)
	{
		return (new com.squareup.picasso.Picasso.Builder(((android.content.Context) (application)))).downloader(((com.squareup.picasso.Downloader) (new OkHttpDownloader(okhttpclient)))).listener(((com.squareup.picasso.Picasso.Listener) (new _cls3()))).build();
	//    0    0:new             #165 <Class com.squareup.picasso.Picasso$Builder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #166 <Method void com.squareup.picasso.Picasso$Builder(android.content.Context)>
	//    4    8:new             #168 <Class OkHttpDownloader>
	//    5   11:dup             
	//    6   12:aload_2         
	//    7   13:invokespecial   #171 <Method void OkHttpDownloader(OkHttpClient)>
	//    8   16:invokevirtual   #175 <Method com.squareup.picasso.Picasso$Builder com.squareup.picasso.Picasso$Builder.downloader(com.squareup.picasso.Downloader)>
	//    9   19:new             #177 <Class DataModule$3>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #178 <Method void DataModule$3(DataModule)>
	//   13   27:invokevirtual   #182 <Method com.squareup.picasso.Picasso$Builder com.squareup.picasso.Picasso$Builder.listener(com.squareup.picasso.Picasso$Listener)>
	//   14   30:invokevirtual   #186 <Method Picasso com.squareup.picasso.Picasso$Builder.build()>
	//   15   33:areturn         
	}

	static final int DISK_CACHE_SIZE_IMG = 0x2d00000;
	static final int DISK_CACHE_SIZE_JSON = 0xf00000;

	/* member class not found */
	class _cls2 {}


	/* member class not found */
	class _cls1 {}


	/* member class not found */
	class _cls3 {}

}
