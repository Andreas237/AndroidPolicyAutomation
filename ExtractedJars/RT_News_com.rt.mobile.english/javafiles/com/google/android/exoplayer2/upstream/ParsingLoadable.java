// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DataSpec, DataSourceInputStream, DataSource

public final class ParsingLoadable
	implements Loader.Loadable
{
	public static interface Parser
	{

		public abstract Object parse(Uri uri, InputStream inputstream)
			throws IOException;
	}


	public ParsingLoadable(DataSource datasource, Uri uri, int i, Parser parser1)
	{
		this(datasource, new DataSpec(uri, 3), i, parser1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #28  <Class DataSpec>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:iconst_3        
	//    6    8:invokespecial   #31  <Method void DataSpec(Uri, int)>
	//    7   11:iload_3         
	//    8   12:aload           4
	//    9   14:invokespecial   #34  <Method void ParsingLoadable(DataSource, DataSpec, int, ParsingLoadable$Parser)>
	//   10   17:return          
	}

	public ParsingLoadable(DataSource datasource, DataSpec dataspec, int i, Parser parser1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		dataSource = datasource;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #42  <Field DataSource dataSource>
		dataSpec = dataspec;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #44  <Field DataSpec dataSpec>
		type = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #46  <Field int type>
		parser = parser1;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #48  <Field ParsingLoadable$Parser parser>
	//   14   25:return          
	}

	public static Object load(DataSource datasource, Parser parser1, Uri uri)
		throws IOException
	{
		datasource = ((DataSource) (new ParsingLoadable(datasource, uri, 0, parser1)));
	//    0    0:new             #2   <Class ParsingLoadable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:invokespecial   #55  <Method void ParsingLoadable(DataSource, Uri, int, ParsingLoadable$Parser)>
	//    7   11:astore_0        
		((ParsingLoadable) (datasource)).load();
	//    8   12:aload_0         
	//    9   13:invokevirtual   #57  <Method void load()>
		return ((ParsingLoadable) (datasource)).getResult();
	//   10   16:aload_0         
	//   11   17:invokevirtual   #61  <Method Object getResult()>
	//   12   20:areturn         
	}

	public long bytesLoaded()
	{
		return bytesLoaded;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field long bytesLoaded>
	//    2    4:lreturn         
	}

	public final void cancelLoad()
	{
	//    0    0:return          
	}

	public final Object getResult()
	{
		return result;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Object result>
	//    2    4:areturn         
	}

	public final void load()
		throws IOException
	{
		DataSourceInputStream datasourceinputstream = new DataSourceInputStream(dataSource, dataSpec);
	//    0    0:new             #72  <Class DataSourceInputStream>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #42  <Field DataSource dataSource>
	//    4    8:aload_0         
	//    5    9:getfield        #44  <Field DataSpec dataSpec>
	//    6   12:invokespecial   #75  <Method void DataSourceInputStream(DataSource, DataSpec)>
	//    7   15:astore_1        
		datasourceinputstream.open();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #78  <Method void DataSourceInputStream.open()>
		result = parser.parse(dataSource.getUri(), ((InputStream) (datasourceinputstream)));
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #48  <Field ParsingLoadable$Parser parser>
	//   13   25:aload_0         
	//   14   26:getfield        #42  <Field DataSource dataSource>
	//   15   29:invokeinterface #84  <Method Uri DataSource.getUri()>
	//   16   34:aload_1         
	//   17   35:invokeinterface #88  <Method Object ParsingLoadable$Parser.parse(Uri, InputStream)>
	//   18   40:putfield        #69  <Field Object result>
		bytesLoaded = datasourceinputstream.bytesRead();
	//   19   43:aload_0         
	//   20   44:aload_1         
	//   21   45:invokevirtual   #91  <Method long DataSourceInputStream.bytesRead()>
	//   22   48:putfield        #66  <Field long bytesLoaded>
		Util.closeQuietly(((java.io.Closeable) (datasourceinputstream)));
	//   23   51:aload_1         
	//   24   52:invokestatic    #97  <Method void Util.closeQuietly(java.io.Closeable)>
		return;
	//   25   55:return          
		Exception exception;
		exception;
	//   26   56:astore_2        
		bytesLoaded = datasourceinputstream.bytesRead();
	//   27   57:aload_0         
	//   28   58:aload_1         
	//   29   59:invokevirtual   #91  <Method long DataSourceInputStream.bytesRead()>
	//   30   62:putfield        #66  <Field long bytesLoaded>
		Util.closeQuietly(((java.io.Closeable) (datasourceinputstream)));
	//   31   65:aload_1         
	//   32   66:invokestatic    #97  <Method void Util.closeQuietly(java.io.Closeable)>
		throw exception;
	//   33   69:aload_2         
	//   34   70:athrow          
	}

	private volatile long bytesLoaded;
	private final DataSource dataSource;
	public final DataSpec dataSpec;
	private final Parser parser;
	private volatile Object result;
	public final int type;
}
