// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.exception.ApolloException;

// Referenced classes of package com.apollographql.apollo.interceptor:
//			ApolloInterceptor

public static interface ApolloInterceptor$CallBack
{

	public abstract void onCompleted();

	public abstract void onFailure(ApolloException apolloexception);

	public abstract void onFetch(ceType cetype);

	public abstract void onResponse(orResponse orresponse);
}
