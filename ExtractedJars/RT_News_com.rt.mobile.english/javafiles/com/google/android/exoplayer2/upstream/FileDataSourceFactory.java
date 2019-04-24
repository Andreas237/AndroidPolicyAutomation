// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;


// Referenced classes of package com.google.android.exoplayer2.upstream:
//			FileDataSource, TransferListener, DataSource

public final class FileDataSourceFactory
	implements DataSource.Factory
{

	public FileDataSourceFactory()
	{
		this(((TransferListener) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #14  <Method void FileDataSourceFactory(TransferListener)>
	//    3    5:return          
	}

	public FileDataSourceFactory(TransferListener transferlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		listener = transferlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field TransferListener listener>
	//    5    9:return          
	}

	public DataSource createDataSource()
	{
		return ((DataSource) (new FileDataSource(listener)));
	//    0    0:new             #25  <Class FileDataSource>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field TransferListener listener>
	//    4    8:invokespecial   #26  <Method void FileDataSource(TransferListener)>
	//    5   11:areturn         
	}

	private final TransferListener listener;
}
