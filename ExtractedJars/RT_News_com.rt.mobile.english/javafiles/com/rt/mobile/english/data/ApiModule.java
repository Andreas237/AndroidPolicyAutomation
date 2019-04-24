// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.rt.mobile.english.data;

import android.app.Application;
import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rt.mobile.english.data.articles.ArticleVideoDeserializer;
import com.rt.mobile.english.data.articles.ArticlesService;
import com.rt.mobile.english.data.articles.HtmlService;
import com.rt.mobile.english.data.channels.ChannelsService;
import com.rt.mobile.english.data.galleries.GalleriesService;
import com.rt.mobile.english.data.media.MediaService;
import com.rt.mobile.english.data.shows.ShowsService;
import com.rt.mobile.english.data.videos.VideoService;
import com.squareup.okhttp.OkHttpClient;
import org.joda.time.DateTime;
import retrofit.*;
import retrofit.client.Client;
import retrofit.client.OkClient;
import retrofit.converter.GsonConverter;

// Referenced classes of package com.rt.mobile.english.data:
//			LocaleHelper, DateTimeAdapter, StringConverter

public final class ApiModule
{

	public ApiModule()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	ArticlesService provideArticleService(RestAdapter restadapter)
	{
		return (ArticlesService)restadapter.create(com/rt/mobile/english/data/articles/ArticlesService);
	//    0    0:aload_1         
	//    1    1:ldc1            #23  <Class ArticlesService>
	//    2    3:invokevirtual   #29  <Method Object RestAdapter.create(Class)>
	//    3    6:checkcast       #23  <Class ArticlesService>
	//    4    9:areturn         
	}

	ChannelsService provideChannelsService(RestAdapter restadapter)
	{
		return (ChannelsService)restadapter.create(com/rt/mobile/english/data/channels/ChannelsService);
	//    0    0:aload_1         
	//    1    1:ldc1            #35  <Class ChannelsService>
	//    2    3:invokevirtual   #29  <Method Object RestAdapter.create(Class)>
	//    3    6:checkcast       #35  <Class ChannelsService>
	//    4    9:areturn         
	}

	Endpoint provideEndpoint(Application application)
	{
		return Endpoints.newFixedEndpoint(LocaleHelper.onAttach(((Context) (application))).getString(0x7f1000bf));
	//    0    0:aload_1         
	//    1    1:invokestatic    #43  <Method Context LocaleHelper.onAttach(Context)>
	//    2    4:ldc1            #44  <Int 0x7f1000bf>
	//    3    6:invokevirtual   #50  <Method String Context.getString(int)>
	//    4    9:invokestatic    #56  <Method Endpoint Endpoints.newFixedEndpoint(String)>
	//    5   12:areturn         
	}

	GalleriesService provideGalleryService(RestAdapter restadapter)
	{
		return (GalleriesService)restadapter.create(com/rt/mobile/english/data/galleries/GalleriesService);
	//    0    0:aload_1         
	//    1    1:ldc1            #60  <Class GalleriesService>
	//    2    3:invokevirtual   #29  <Method Object RestAdapter.create(Class)>
	//    3    6:checkcast       #60  <Class GalleriesService>
	//    4    9:areturn         
	}

	Gson provideGson()
	{
		return (new GsonBuilder()).registerTypeAdapter(org/joda/time/DateTime, ((Object) (new DateTimeAdapter()))).registerTypeAdapter(com/rt/mobile/english/data/articles/Article$Video, ((Object) (new ArticleVideoDeserializer()))).create();
	//    0    0:new             #64  <Class GsonBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void GsonBuilder()>
	//    3    7:ldc1            #67  <Class DateTime>
	//    4    9:new             #69  <Class DateTimeAdapter>
	//    5   12:dup             
	//    6   13:invokespecial   #70  <Method void DateTimeAdapter()>
	//    7   16:invokevirtual   #74  <Method GsonBuilder GsonBuilder.registerTypeAdapter(java.lang.reflect.Type, Object)>
	//    8   19:ldc1            #76  <Class com.rt.mobile.english.data.articles.Article$Video>
	//    9   21:new             #78  <Class ArticleVideoDeserializer>
	//   10   24:dup             
	//   11   25:invokespecial   #79  <Method void ArticleVideoDeserializer()>
	//   12   28:invokevirtual   #74  <Method GsonBuilder GsonBuilder.registerTypeAdapter(java.lang.reflect.Type, Object)>
	//   13   31:invokevirtual   #81  <Method Gson GsonBuilder.create()>
	//   14   34:areturn         
	}

	HtmlService provideHtmlService(RestAdapter restadapter)
	{
		return (HtmlService)restadapter.create(com/rt/mobile/english/data/articles/HtmlService);
	//    0    0:aload_1         
	//    1    1:ldc1            #86  <Class HtmlService>
	//    2    3:invokevirtual   #29  <Method Object RestAdapter.create(Class)>
	//    3    6:checkcast       #86  <Class HtmlService>
	//    4    9:areturn         
	}

	Client provideJsonClient(OkHttpClient okhttpclient)
	{
		return ((Client) (new OkClient(okhttpclient)));
	//    0    0:new             #90  <Class OkClient>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #93  <Method void OkClient(OkHttpClient)>
	//    4    8:areturn         
	}

	RestAdapter provideJsonRestAdapter(Endpoint endpoint, Client client, Gson gson)
	{
		return (new retrofit.RestAdapter.Builder()).setClient(client).setEndpoint(endpoint).setConverter(((retrofit.converter.Converter) (new GsonConverter(gson)))).build();
	//    0    0:new             #97  <Class retrofit.RestAdapter$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void retrofit.RestAdapter$Builder()>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #102 <Method retrofit.RestAdapter$Builder retrofit.RestAdapter$Builder.setClient(Client)>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #106 <Method retrofit.RestAdapter$Builder retrofit.RestAdapter$Builder.setEndpoint(Endpoint)>
	//    7   15:new             #108 <Class GsonConverter>
	//    8   18:dup             
	//    9   19:aload_3         
	//   10   20:invokespecial   #111 <Method void GsonConverter(Gson)>
	//   11   23:invokevirtual   #115 <Method retrofit.RestAdapter$Builder retrofit.RestAdapter$Builder.setConverter(retrofit.converter.Converter)>
	//   12   26:invokevirtual   #119 <Method RestAdapter retrofit.RestAdapter$Builder.build()>
	//   13   29:areturn         
	}

	MediaService provideMediaService(RestAdapter restadapter)
	{
		return (MediaService)restadapter.create(com/rt/mobile/english/data/media/MediaService);
	//    0    0:aload_1         
	//    1    1:ldc1            #123 <Class MediaService>
	//    2    3:invokevirtual   #29  <Method Object RestAdapter.create(Class)>
	//    3    6:checkcast       #123 <Class MediaService>
	//    4    9:areturn         
	}

	ShowsService provideShowService(RestAdapter restadapter)
	{
		return (ShowsService)restadapter.create(com/rt/mobile/english/data/shows/ShowsService);
	//    0    0:aload_1         
	//    1    1:ldc1            #127 <Class ShowsService>
	//    2    3:invokevirtual   #29  <Method Object RestAdapter.create(Class)>
	//    3    6:checkcast       #127 <Class ShowsService>
	//    4    9:areturn         
	}

	RestAdapter provideStringRestAdapter(Endpoint endpoint, Client client, Gson gson)
	{
		return (new retrofit.RestAdapter.Builder()).setClient(client).setEndpoint(endpoint).setConverter(((retrofit.converter.Converter) (new StringConverter()))).build();
	//    0    0:new             #97  <Class retrofit.RestAdapter$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #98  <Method void retrofit.RestAdapter$Builder()>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #102 <Method retrofit.RestAdapter$Builder retrofit.RestAdapter$Builder.setClient(Client)>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #106 <Method retrofit.RestAdapter$Builder retrofit.RestAdapter$Builder.setEndpoint(Endpoint)>
	//    7   15:new             #130 <Class StringConverter>
	//    8   18:dup             
	//    9   19:invokespecial   #131 <Method void StringConverter()>
	//   10   22:invokevirtual   #115 <Method retrofit.RestAdapter$Builder retrofit.RestAdapter$Builder.setConverter(retrofit.converter.Converter)>
	//   11   25:invokevirtual   #119 <Method RestAdapter retrofit.RestAdapter$Builder.build()>
	//   12   28:areturn         
	}

	VideoService provideVideoService(RestAdapter restadapter)
	{
		return (VideoService)restadapter.create(com/rt/mobile/english/data/videos/VideoService);
	//    0    0:aload_1         
	//    1    1:ldc1            #135 <Class VideoService>
	//    2    3:invokevirtual   #29  <Method Object RestAdapter.create(Class)>
	//    3    6:checkcast       #135 <Class VideoService>
	//    4    9:areturn         
	}
}
