// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api.cache.http;

import java.io.IOException;

// Referenced classes of package com.apollographql.apollo.api.cache.http:
//			HttpCacheRecord, HttpCacheRecordEditor

public interface HttpCacheStore
{

	public abstract HttpCacheRecord cacheRecord(String s)
		throws IOException;

	public abstract HttpCacheRecordEditor cacheRecordEditor(String s)
		throws IOException;

	public abstract void delete()
		throws IOException;

	public abstract void remove(String s)
		throws IOException;
}
