// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.fetcher;

import com.apollographql.apollo.interceptor.ApolloInterceptor;
import com.apollographql.apollo.internal.ApolloLogger;

public interface ResponseFetcher
{

	public abstract ApolloInterceptor provideInterceptor(ApolloLogger apollologger);
}
