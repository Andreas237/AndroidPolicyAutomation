// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.upstream.DataSource;

// Referenced classes of package com.google.android.exoplayer2.source.hls:
//			HlsDataSourceFactory

public final class DefaultHlsDataSourceFactory
	implements HlsDataSourceFactory
{

	public DefaultHlsDataSourceFactory(com.google.android.exoplayer2.upstream.DataSource.Factory factory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		dataSourceFactory = factory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
	//    5    9:return          
	}

	public DataSource createDataSource(int i)
	{
		return dataSourceFactory.createDataSource();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field com.google.android.exoplayer2.upstream.DataSource$Factory dataSourceFactory>
	//    2    4:invokeinterface #23  <Method DataSource com.google.android.exoplayer2.upstream.DataSource$Factory.createDataSource()>
	//    3    9:areturn         
	}

	private final com.google.android.exoplayer2.upstream.DataSource.Factory dataSourceFactory;
}
