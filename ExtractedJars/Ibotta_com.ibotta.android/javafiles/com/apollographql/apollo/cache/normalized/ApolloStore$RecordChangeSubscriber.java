// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;

import java.util.Set;

// Referenced classes of package com.apollographql.apollo.cache.normalized:
//			ApolloStore

public static interface ApolloStore$RecordChangeSubscriber
{

	public abstract void onCacheRecordsChanged(Set set);
}
