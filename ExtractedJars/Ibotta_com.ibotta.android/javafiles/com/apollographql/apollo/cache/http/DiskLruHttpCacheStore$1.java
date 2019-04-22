// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.http;

import com.apollographql.apollo.api.cache.http.HttpCacheRecord;
import okio.Source;

// Referenced classes of package com.apollographql.apollo.cache.http:
//			DiskLruHttpCacheStore

class DiskLruHttpCacheStore$1
	implements HttpCacheRecord
{

	public Source bodySource()
	{
		return val$snapshot.getSource(1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field okhttp3.internal.cache.DiskLruCache$Snapshot val$snapshot>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #34  <Method Source okhttp3.internal.cache.DiskLruCache$Snapshot.getSource(int)>
	//    4    8:areturn         
	}

	public void close()
	{
		val$snapshot.close();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field okhttp3.internal.cache.DiskLruCache$Snapshot val$snapshot>
	//    2    4:invokevirtual   #38  <Method void okhttp3.internal.cache.DiskLruCache$Snapshot.close()>
	//    3    7:return          
	}

	public Source headerSource()
	{
		return val$snapshot.getSource(0);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field okhttp3.internal.cache.DiskLruCache$Snapshot val$snapshot>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #34  <Method Source okhttp3.internal.cache.DiskLruCache$Snapshot.getSource(int)>
	//    4    8:areturn         
	}

	final DiskLruHttpCacheStore this$0;
	final okhttp3.internal.cache.DiskLruCache.Snapshot val$snapshot;

	DiskLruHttpCacheStore$1()
	{
		this$0 = final_disklruhttpcachestore;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field DiskLruHttpCacheStore this$0>
		val$snapshot = okhttp3.internal.cache.DiskLruCache.Snapshot.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field okhttp3.internal.cache.DiskLruCache$Snapshot val$snapshot>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
