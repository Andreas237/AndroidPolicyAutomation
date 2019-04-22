// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.api.cache.http;

import java.io.IOException;
import okio.Sink;

public interface HttpCacheRecordEditor
{

	public abstract void abort()
		throws IOException;

	public abstract Sink bodySink();

	public abstract void commit()
		throws IOException;

	public abstract Sink headerSink();
}
