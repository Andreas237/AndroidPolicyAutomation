// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DataSource, DataSpec

public final class DummyDataSource
	implements DataSource
{

	private DummyDataSource()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}


	public void close()
		throws IOException
	{
	//    0    0:return          
	}

	public Uri getUri()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public long open(DataSpec dataspec)
		throws IOException
	{
		throw new IOException("Dummy source");
	//    0    0:new             #28  <Class IOException>
	//    1    3:dup             
	//    2    4:ldc1            #35  <String "Dummy source">
	//    3    6:invokespecial   #38  <Method void IOException(String)>
	//    4    9:athrow          
	}

	public int read(byte abyte0[], int i, int j)
		throws IOException
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #42  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public static final DataSource.Factory FACTORY = new DataSource.Factory() {

		public DataSource createDataSource()
		{
			return ((DataSource) (new DummyDataSource()));
		//    0    0:new             #8   <Class DummyDataSource>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:invokespecial   #18  <Method void DummyDataSource(DummyDataSource$1)>
		//    4    8:areturn         
		}

	}
;
	public static final DummyDataSource INSTANCE = new DummyDataSource();

	static 
	{
	//    0    0:new             #2   <Class DummyDataSource>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void DummyDataSource()>
	//    3    7:putstatic       #19  <Field DummyDataSource INSTANCE>
	//    4   10:new             #8   <Class DummyDataSource$1>
	//    5   13:dup             
	//    6   14:invokespecial   #20  <Method void DummyDataSource$1()>
	//    7   17:putstatic       #22  <Field DataSource$Factory FACTORY>
	//*   8   20:return          
	}
}
