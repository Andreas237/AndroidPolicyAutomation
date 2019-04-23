// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.integration.okhttp3;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.util.ContentLengthInputStream;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import okhttp3.*;

public class OkHttpStreamFetcher
	implements DataFetcher, Callback
{

	public OkHttpStreamFetcher(okhttp3.Call.Factory factory, GlideUrl glideurl)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		client = factory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field okhttp3.Call$Factory client>
		url = glideurl;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field GlideUrl url>
	//    8   14:return          
	}

	public void cancel()
	{
		Call call1 = call;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Call call>
	//    2    4:astore_1        
		if(call1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			call1.cancel();
	//    5    9:aload_1         
	//    6   10:invokeinterface #43  <Method void Call.cancel()>
	//    7   15:return          
	}

	public void cleanup()
	{
		ResponseBody responsebody;
		try
		{
			if(stream != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field InputStream stream>
	//*   2    4:ifnull          14
				stream.close();
	//    3    7:aload_0         
	//    4    8:getfield        #48  <Field InputStream stream>
	//    5   11:invokevirtual   #53  <Method void InputStream.close()>
		}
	//*   6   14:aload_0         
	//*   7   15:getfield        #55  <Field ResponseBody responseBody>
	//*   8   18:astore_1        
	//*   9   19:aload_1         
	//*  10   20:ifnull          27
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #58  <Method void ResponseBody.close()>
	//*  13   27:aload_0         
	//*  14   28:aconst_null     
	//*  15   29:putfield        #60  <Field com.bumptech.glide.load.data.DataFetcher$DataCallback callback>
	//*  16   32:return          
		catch(IOException ioexception) { }
	//   17   33:astore_1        
		responsebody = responseBody;
		if(responsebody != null)
			responsebody.close();
		callback = null;
	//*  18   34:goto            14
	}

	public Class getDataClass()
	{
		return java/io/InputStream;
	//    0    0:ldc1            #50  <Class InputStream>
	//    1    2:areturn         
	}

	public DataSource getDataSource()
	{
		return DataSource.REMOTE;
	//    0    0:getstatic       #74  <Field DataSource DataSource.REMOTE>
	//    1    3:areturn         
	}

	public void loadData(Priority priority, com.bumptech.glide.load.data.DataFetcher.DataCallback datacallback)
	{
		priority = ((Priority) ((new okhttp3.Request.Builder()).url(url.toStringUrl())));
	//    0    0:new             #78  <Class okhttp3.Request$Builder>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void okhttp3.Request$Builder()>
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field GlideUrl url>
	//    5   11:invokevirtual   #85  <Method String GlideUrl.toStringUrl()>
	//    6   14:invokevirtual   #88  <Method okhttp3.Request$Builder okhttp3.Request$Builder.url(String)>
	//    7   17:astore_1        
		java.util.Map.Entry entry;
		for(Iterator iterator = url.getHeaders().entrySet().iterator(); iterator.hasNext(); ((okhttp3.Request.Builder) (priority)).addHeader((String)entry.getKey(), (String)entry.getValue()))
	//*   8   18:aload_0         
	//*   9   19:getfield        #35  <Field GlideUrl url>
	//*  10   22:invokevirtual   #92  <Method Map GlideUrl.getHeaders()>
	//*  11   25:invokeinterface #98  <Method Set Map.entrySet()>
	//*  12   30:invokeinterface #104 <Method Iterator Set.iterator()>
	//*  13   35:astore_3        
	//*  14   36:aload_3         
	//*  15   37:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//*  16   42:ifeq            84
			entry = (java.util.Map.Entry)iterator.next();
	//   17   45:aload_3         
	//   18   46:invokeinterface #114 <Method Object Iterator.next()>
	//   19   51:checkcast       #116 <Class java.util.Map$Entry>
	//   20   54:astore          4

	//   21   56:aload_1         
	//   22   57:aload           4
	//   23   59:invokeinterface #119 <Method Object java.util.Map$Entry.getKey()>
	//   24   64:checkcast       #121 <Class String>
	//   25   67:aload           4
	//   26   69:invokeinterface #124 <Method Object java.util.Map$Entry.getValue()>
	//   27   74:checkcast       #121 <Class String>
	//   28   77:invokevirtual   #128 <Method okhttp3.Request$Builder okhttp3.Request$Builder.addHeader(String, String)>
	//   29   80:pop             
	//*  30   81:goto            36
		priority = ((Priority) (((okhttp3.Request.Builder) (priority)).build()));
	//   31   84:aload_1         
	//   32   85:invokevirtual   #132 <Method okhttp3.Request okhttp3.Request$Builder.build()>
	//   33   88:astore_1        
		callback = datacallback;
	//   34   89:aload_0         
	//   35   90:aload_2         
	//   36   91:putfield        #60  <Field com.bumptech.glide.load.data.DataFetcher$DataCallback callback>
		call = client.newCall(((okhttp3.Request) (priority)));
	//   37   94:aload_0         
	//   38   95:aload_0         
	//   39   96:getfield        #33  <Field okhttp3.Call$Factory client>
	//   40   99:aload_1         
	//   41  100:invokeinterface #138 <Method Call okhttp3.Call$Factory.newCall(okhttp3.Request)>
	//   42  105:putfield        #39  <Field Call call>
		call.enqueue(((Callback) (this)));
	//   43  108:aload_0         
	//   44  109:getfield        #39  <Field Call call>
	//   45  112:aload_0         
	//   46  113:invokeinterface #142 <Method void Call.enqueue(Callback)>
	//   47  118:return          
	}

	public void onFailure(Call call1, IOException ioexception)
	{
		if(Log.isLoggable("OkHttpFetcher", 3))
	//*   0    0:ldc1            #13  <String "OkHttpFetcher">
	//*   1    2:iconst_3        
	//*   2    3:invokestatic    #152 <Method boolean Log.isLoggable(String, int)>
	//*   3    6:ifeq            18
			Log.d("OkHttpFetcher", "OkHttp failed to obtain result", ((Throwable) (ioexception)));
	//    4    9:ldc1            #13  <String "OkHttpFetcher">
	//    5   11:ldc1            #154 <String "OkHttp failed to obtain result">
	//    6   13:aload_2         
	//    7   14:invokestatic    #158 <Method int Log.d(String, String, Throwable)>
	//    8   17:pop             
		callback.onLoadFailed(((Exception) (ioexception)));
	//    9   18:aload_0         
	//   10   19:getfield        #60  <Field com.bumptech.glide.load.data.DataFetcher$DataCallback callback>
	//   11   22:aload_2         
	//   12   23:invokeinterface #164 <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onLoadFailed(Exception)>
	//   13   28:return          
	}

	public void onResponse(Call call1, Response response)
	{
		responseBody = response.body();
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #172 <Method ResponseBody Response.body()>
	//    3    5:putfield        #55  <Field ResponseBody responseBody>
		if(response.isSuccessful())
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #175 <Method boolean Response.isSuccessful()>
	//*   6   12:ifeq            58
		{
			long l = ((ResponseBody)Preconditions.checkNotNull(((Object) (responseBody)))).contentLength();
	//    7   15:aload_0         
	//    8   16:getfield        #55  <Field ResponseBody responseBody>
	//    9   19:invokestatic    #181 <Method Object Preconditions.checkNotNull(Object)>
	//   10   22:checkcast       #57  <Class ResponseBody>
	//   11   25:invokevirtual   #185 <Method long ResponseBody.contentLength()>
	//   12   28:lstore_3        
			stream = ContentLengthInputStream.obtain(responseBody.byteStream(), l);
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #55  <Field ResponseBody responseBody>
	//   16   34:invokevirtual   #189 <Method InputStream ResponseBody.byteStream()>
	//   17   37:lload_3         
	//   18   38:invokestatic    #195 <Method InputStream ContentLengthInputStream.obtain(InputStream, long)>
	//   19   41:putfield        #48  <Field InputStream stream>
			callback.onDataReady(((Object) (stream)));
	//   20   44:aload_0         
	//   21   45:getfield        #60  <Field com.bumptech.glide.load.data.DataFetcher$DataCallback callback>
	//   22   48:aload_0         
	//   23   49:getfield        #48  <Field InputStream stream>
	//   24   52:invokeinterface #199 <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onDataReady(Object)>
			return;
	//   25   57:return          
		} else
		{
			callback.onLoadFailed(((Exception) (new HttpException(response.message(), response.code()))));
	//   26   58:aload_0         
	//   27   59:getfield        #60  <Field com.bumptech.glide.load.data.DataFetcher$DataCallback callback>
	//   28   62:new             #201 <Class HttpException>
	//   29   65:dup             
	//   30   66:aload_2         
	//   31   67:invokevirtual   #204 <Method String Response.message()>
	//   32   70:aload_2         
	//   33   71:invokevirtual   #208 <Method int Response.code()>
	//   34   74:invokespecial   #211 <Method void HttpException(String, int)>
	//   35   77:invokeinterface #164 <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onLoadFailed(Exception)>
			return;
	//   36   82:return          
		}
	}

	private static final String TAG = "OkHttpFetcher";
	private volatile Call call;
	private com.bumptech.glide.load.data.DataFetcher.DataCallback callback;
	private final okhttp3.Call.Factory client;
	private ResponseBody responseBody;
	private InputStream stream;
	private final GlideUrl url;
}
