// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.upstream.DataSource;

public interface HlsDataSourceFactory
{

	public abstract DataSource createDataSource(int i);
}
