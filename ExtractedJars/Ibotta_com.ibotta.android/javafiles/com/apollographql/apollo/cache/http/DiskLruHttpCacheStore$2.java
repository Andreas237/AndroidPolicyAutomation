// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.http;

import com.apollographql.apollo.api.cache.http.HttpCacheRecordEditor;
import java.io.IOException;
import okio.Sink;

// Referenced classes of package com.apollographql.apollo.cache.http:
//			DiskLruHttpCacheStore

class DiskLruHttpCacheStore$2
	implements HttpCacheRecordEditor
{

	public void abort()
		throws IOException
	{
		val$editor.abort();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field okhttp3.internal.cache.DiskLruCache$Editor val$editor>
	//    2    4:invokevirtual   #32  <Method void okhttp3.internal.cache.DiskLruCache$Editor.abort()>
	//    3    7:return          
	}

	public Sink bodySink()
	{
		return val$editor.newSink(1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field okhttp3.internal.cache.DiskLruCache$Editor val$editor>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #40  <Method Sink okhttp3.internal.cache.DiskLruCache$Editor.newSink(int)>
	//    4    8:areturn         
	}

	public void commit()
		throws IOException
	{
		val$editor.commit();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field okhttp3.internal.cache.DiskLruCache$Editor val$editor>
	//    2    4:invokevirtual   #44  <Method void okhttp3.internal.cache.DiskLruCache$Editor.commit()>
	//    3    7:return          
	}

	public Sink headerSink()
	{
		return val$editor.newSink(0);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field okhttp3.internal.cache.DiskLruCache$Editor val$editor>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #40  <Method Sink okhttp3.internal.cache.DiskLruCache$Editor.newSink(int)>
	//    4    8:areturn         
	}

	final DiskLruHttpCacheStore this$0;
	final okhttp3.internal.cache.DiskLruCache.Editor val$editor;

	DiskLruHttpCacheStore$2()
	{
		this$0 = final_disklruhttpcachestore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field DiskLruHttpCacheStore this$0>
		val$editor = okhttp3.internal.cache.DiskLruCache.Editor.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field okhttp3.internal.cache.DiskLruCache$Editor val$editor>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
