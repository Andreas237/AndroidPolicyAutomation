// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import android.net.Uri;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.util.Util;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			DataSpec, DataSourceInputStream, UriDataSource

public final class UriLoadable
	implements Loader.Loadable
{
	public static interface Parser
	{

		public abstract Object parse(String s, InputStream inputstream)
			throws ParserException, IOException;
	}


	public UriLoadable(String s, UriDataSource uridatasource, Parser parser1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		uriDataSource = uridatasource;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #29  <Field UriDataSource uriDataSource>
		parser = parser1;
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:putfield        #31  <Field UriLoadable$Parser parser>
		dataSpec = new DataSpec(Uri.parse(s), 1);
	//    8   14:aload_0         
	//    9   15:new             #33  <Class DataSpec>
	//   10   18:dup             
	//   11   19:aload_1         
	//   12   20:invokestatic    #39  <Method Uri Uri.parse(String)>
	//   13   23:iconst_1        
	//   14   24:invokespecial   #42  <Method void DataSpec(Uri, int)>
	//   15   27:putfield        #44  <Field DataSpec dataSpec>
	//   16   30:return          
	}

	public final void cancelLoad()
	{
		isCanceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #50  <Field boolean isCanceled>
	//    3    5:return          
	}

	public final Object getResult()
	{
		return result;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Object result>
	//    2    4:areturn         
	}

	public final boolean isLoadCanceled()
	{
		return isCanceled;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field boolean isCanceled>
	//    2    4:ireturn         
	}

	public final void load()
		throws IOException, InterruptedException
	{
		DataSourceInputStream datasourceinputstream = new DataSourceInputStream(((DataSource) (uriDataSource)), dataSpec);
	//    0    0:new             #64  <Class DataSourceInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field UriDataSource uriDataSource>
	//    4    8:aload_0         
	//    5    9:getfield        #44  <Field DataSpec dataSpec>
	//    6   12:invokespecial   #67  <Method void DataSourceInputStream(DataSource, DataSpec)>
	//    7   15:astore_1        
		datasourceinputstream.open();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #70  <Method void DataSourceInputStream.open()>
		result = parser.parse(uriDataSource.getUri(), ((InputStream) (datasourceinputstream)));
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #31  <Field UriLoadable$Parser parser>
	//   13   25:aload_0         
	//   14   26:getfield        #29  <Field UriDataSource uriDataSource>
	//   15   29:invokeinterface #76  <Method String UriDataSource.getUri()>
	//   16   34:aload_1         
	//   17   35:invokeinterface #79  <Method Object UriLoadable$Parser.parse(String, InputStream)>
	//   18   40:putfield        #54  <Field Object result>
		Util.closeQuietly(((java.io.Closeable) (datasourceinputstream)));
	//   19   43:aload_1         
	//   20   44:invokestatic    #85  <Method void Util.closeQuietly(java.io.Closeable)>
		return;
	//   21   47:return          
		Exception exception;
		exception;
	//   22   48:astore_2        
		Util.closeQuietly(((java.io.Closeable) (datasourceinputstream)));
	//   23   49:aload_1         
	//   24   50:invokestatic    #85  <Method void Util.closeQuietly(java.io.Closeable)>
		throw exception;
	//   25   53:aload_2         
	//   26   54:athrow          
	}

	private final DataSpec dataSpec;
	private volatile boolean isCanceled;
	private final Parser parser;
	private volatile Object result;
	private final UriDataSource uriDataSource;
}
