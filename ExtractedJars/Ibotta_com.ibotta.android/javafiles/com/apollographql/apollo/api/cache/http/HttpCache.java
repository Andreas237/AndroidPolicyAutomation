// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api.cache.http;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

public interface HttpCache
{

	public abstract void clear();

	public abstract Interceptor interceptor();

	public abstract Response read(String s);

	public abstract Response read(String s, boolean flag);

	public abstract void remove(String s)
		throws IOException;

	public abstract void removeQuietly(String s);
}
