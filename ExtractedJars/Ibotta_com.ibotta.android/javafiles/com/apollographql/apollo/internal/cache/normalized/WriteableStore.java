// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.cache.normalized;

import com.apollographql.apollo.cache.CacheHeaders;
import com.apollographql.apollo.cache.normalized.Record;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.apollographql.apollo.internal.cache.normalized:
//			ReadableStore

public interface WriteableStore
	extends ReadableStore
{

	public abstract Set merge(Record record, CacheHeaders cacheheaders);

	public abstract Set merge(Collection collection, CacheHeaders cacheheaders);
}
