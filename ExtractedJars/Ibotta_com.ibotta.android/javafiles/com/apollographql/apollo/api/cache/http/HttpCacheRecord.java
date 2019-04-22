// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api.cache.http;

import okio.Source;

public interface HttpCacheRecord
{

	public abstract Source bodySource();

	public abstract void close();

	public abstract Source headerSource();
}
