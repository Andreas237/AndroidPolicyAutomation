// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;


// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DefaultHttpDataSource, TransferListener, HttpDataSource

public final class DefaultHttpDataSourceFactory extends HttpDataSource.BaseFactory
{

	public DefaultHttpDataSourceFactory(String s)
	{
		this(s, ((TransferListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #19  <Method void DefaultHttpDataSourceFactory(String, TransferListener)>
	//    4    6:return          
	}

	public DefaultHttpDataSourceFactory(String s, TransferListener transferlistener)
	{
		this(s, transferlistener, 8000, 8000, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:sipush          8000
	//    4    6:sipush          8000
	//    5    9:iconst_0        
	//    6   10:invokespecial   #23  <Method void DefaultHttpDataSourceFactory(String, TransferListener, int, int, boolean)>
	//    7   13:return          
	}

	public DefaultHttpDataSourceFactory(String s, TransferListener transferlistener, int i, int j, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void HttpDataSource$BaseFactory()>
		userAgent = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #30  <Field String userAgent>
		listener = transferlistener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field TransferListener listener>
		connectTimeoutMillis = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #34  <Field int connectTimeoutMillis>
		readTimeoutMillis = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #36  <Field int readTimeoutMillis>
		allowCrossProtocolRedirects = flag;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #38  <Field boolean allowCrossProtocolRedirects>
	//   17   31:return          
	}

	protected DefaultHttpDataSource createDataSourceInternal(HttpDataSource.RequestProperties requestproperties)
	{
		return new DefaultHttpDataSource(userAgent, ((com.google.android.exoplayer2.util.Predicate) (null)), listener, connectTimeoutMillis, readTimeoutMillis, allowCrossProtocolRedirects, requestproperties);
	//    0    0:new             #43  <Class DefaultHttpDataSource>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field String userAgent>
	//    4    8:aconst_null     
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field TransferListener listener>
	//    7   13:aload_0         
	//    8   14:getfield        #34  <Field int connectTimeoutMillis>
	//    9   17:aload_0         
	//   10   18:getfield        #36  <Field int readTimeoutMillis>
	//   11   21:aload_0         
	//   12   22:getfield        #38  <Field boolean allowCrossProtocolRedirects>
	//   13   25:aload_1         
	//   14   26:invokespecial   #46  <Method void DefaultHttpDataSource(String, com.google.android.exoplayer2.util.Predicate, TransferListener, int, int, boolean, HttpDataSource$RequestProperties)>
	//   15   29:areturn         
	}

	protected volatile HttpDataSource createDataSourceInternal(HttpDataSource.RequestProperties requestproperties)
	{
		return ((HttpDataSource) (createDataSourceInternal(requestproperties)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #49  <Method DefaultHttpDataSource createDataSourceInternal(HttpDataSource$RequestProperties)>
	//    3    5:areturn         
	}

	private final boolean allowCrossProtocolRedirects;
	private final int connectTimeoutMillis;
	private final TransferListener listener;
	private final int readTimeoutMillis;
	private final String userAgent;
}
