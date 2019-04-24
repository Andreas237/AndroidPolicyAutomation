// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.content.Context;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DefaultHttpDataSourceFactory, DefaultDataSource, TransferListener, DataSource

public final class DefaultDataSourceFactory
	implements DataSource.Factory
{

	public DefaultDataSourceFactory(Context context1, TransferListener transferlistener, DataSource.Factory factory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		context = context1.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #24  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #26  <Field Context context>
		listener = transferlistener;
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:putfield        #28  <Field TransferListener listener>
		baseDataSourceFactory = factory;
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:putfield        #30  <Field DataSource$Factory baseDataSourceFactory>
	//   12   22:return          
	}

	public DefaultDataSourceFactory(Context context1, String s)
	{
		this(context1, s, ((TransferListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #37  <Method void DefaultDataSourceFactory(Context, String, TransferListener)>
	//    5    7:return          
	}

	public DefaultDataSourceFactory(Context context1, String s, TransferListener transferlistener)
	{
		this(context1, transferlistener, ((DataSource.Factory) (new DefaultHttpDataSourceFactory(s, transferlistener))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:new             #39  <Class DefaultHttpDataSourceFactory>
	//    4    6:dup             
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #42  <Method void DefaultHttpDataSourceFactory(String, TransferListener)>
	//    8   12:invokespecial   #44  <Method void DefaultDataSourceFactory(Context, TransferListener, DataSource$Factory)>
	//    9   15:return          
	}

	public volatile DataSource createDataSource()
	{
		return ((DataSource) (createDataSource()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method DefaultDataSource createDataSource()>
	//    2    4:areturn         
	}

	public DefaultDataSource createDataSource()
	{
		return new DefaultDataSource(context, listener, baseDataSourceFactory.createDataSource());
	//    0    0:new             #52  <Class DefaultDataSource>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field Context context>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field TransferListener listener>
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field DataSource$Factory baseDataSourceFactory>
	//    8   16:invokeinterface #54  <Method DataSource DataSource$Factory.createDataSource()>
	//    9   21:invokespecial   #57  <Method void DefaultDataSource(Context, TransferListener, DataSource)>
	//   10   24:areturn         
	}

	private final DataSource.Factory baseDataSourceFactory;
	private final Context context;
	private final TransferListener listener;
}
