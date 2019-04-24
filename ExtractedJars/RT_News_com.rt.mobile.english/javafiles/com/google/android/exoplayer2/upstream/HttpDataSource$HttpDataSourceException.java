// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.lang.annotation.Annotation;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			HttpDataSource, DataSpec

public static class HttpDataSource$HttpDataSourceException extends IOException
{
	public static interface Type
		extends Annotation
	{
	}


	public static final int TYPE_CLOSE = 3;
	public static final int TYPE_OPEN = 1;
	public static final int TYPE_READ = 2;
	public final DataSpec dataSpec;
	public final int type;

	public HttpDataSource$HttpDataSourceException(DataSpec dataspec, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void IOException()>
		dataSpec = dataspec;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field DataSpec dataSpec>
		type = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #29  <Field int type>
	//    8   14:return          
	}

	public HttpDataSource$HttpDataSourceException(IOException ioexception, DataSpec dataspec, int i)
	{
		super(((Throwable) (ioexception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #34  <Method void IOException(Throwable)>
		dataSpec = dataspec;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field DataSpec dataSpec>
		type = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #29  <Field int type>
	//    9   15:return          
	}

	public HttpDataSource$HttpDataSourceException(String s, DataSpec dataspec, int i)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void IOException(String)>
		dataSpec = dataspec;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field DataSpec dataSpec>
		type = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #29  <Field int type>
	//    9   15:return          
	}

	public HttpDataSource$HttpDataSourceException(String s, IOException ioexception, DataSpec dataspec, int i)
	{
		super(s, ((Throwable) (ioexception)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #42  <Method void IOException(String, Throwable)>
		dataSpec = dataspec;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #27  <Field DataSpec dataSpec>
		type = i;
	//    7   11:aload_0         
	//    8   12:iload           4
	//    9   14:putfield        #29  <Field int type>
	//   10   17:return          
	}
}
