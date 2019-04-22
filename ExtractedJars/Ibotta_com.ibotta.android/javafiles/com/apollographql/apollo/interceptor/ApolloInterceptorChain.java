// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.interceptor;

import java.util.concurrent.Executor;

public interface ApolloInterceptorChain
{

	public abstract void dispose();

	public abstract void proceedAsync(ApolloInterceptor.InterceptorRequest interceptorrequest, Executor executor, ApolloInterceptor.CallBack callback);
}
