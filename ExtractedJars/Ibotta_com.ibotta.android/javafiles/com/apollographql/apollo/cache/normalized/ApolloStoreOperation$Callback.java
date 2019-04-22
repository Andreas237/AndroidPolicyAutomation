// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.cache.normalized;


// Referenced classes of package com.apollographql.apollo.cache.normalized:
//			ApolloStoreOperation

public static interface ApolloStoreOperation$Callback
{

	public abstract void onFailure(Throwable throwable);

	public abstract void onSuccess(Object obj);
}
