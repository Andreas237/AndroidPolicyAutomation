// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.http;

import com.apollographql.apollo.api.cache.http.HttpCacheRecord;
import java.io.IOException;
import okio.ForwardingSource;
import okio.Source;

// Referenced classes of package com.apollographql.apollo.cache.http:
//			ApolloHttpCache

class ApolloHttpCache$1 extends ForwardingSource
{

	public void close()
		throws IOException
	{
		super.close();
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void ForwardingSource.close()>
		closeQuietly(val$cacheRecord);
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field ApolloHttpCache this$0>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field HttpCacheRecord val$cacheRecord>
	//    6   12:invokevirtual   #41  <Method void ApolloHttpCache.closeQuietly(HttpCacheRecord)>
		if(val$expireAfterRead)
	//*   7   15:aload_0         
	//*   8   16:getfield        #25  <Field boolean val$expireAfterRead>
	//*   9   19:ifeq            33
			removeQuietly(val$cacheKey);
	//   10   22:aload_0         
	//   11   23:getfield        #21  <Field ApolloHttpCache this$0>
	//   12   26:aload_0         
	//   13   27:getfield        #27  <Field String val$cacheKey>
	//   14   30:invokevirtual   #45  <Method void ApolloHttpCache.removeQuietly(String)>
	//   15   33:return          
	}

	final ApolloHttpCache this$0;
	final String val$cacheKey;
	final HttpCacheRecord val$cacheRecord;
	final boolean val$expireAfterRead;

	ApolloHttpCache$1(String s)
	{
		this$0 = final_apollohttpcache;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ApolloHttpCache this$0>
		val$cacheRecord = httpcacherecord;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #23  <Field HttpCacheRecord val$cacheRecord>
		val$expireAfterRead = Z.this;
	//    6   10:aload_0         
	//    7   11:iload           4
	//    8   13:putfield        #25  <Field boolean val$expireAfterRead>
		val$cacheKey = s;
	//    9   16:aload_0         
	//   10   17:aload           5
	//   11   19:putfield        #27  <Field String val$cacheKey>
		super(final_source);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokespecial   #30  <Method void ForwardingSource(Source)>
	//   15   27:return          
	}
}
