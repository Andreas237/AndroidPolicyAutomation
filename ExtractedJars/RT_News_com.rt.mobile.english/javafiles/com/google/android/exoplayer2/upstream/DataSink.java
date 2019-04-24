// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DataSpec

public interface DataSink
{
	public static interface Factory
	{

		public abstract DataSink createDataSink();
	}


	public abstract void close()
		throws IOException;

	public abstract void open(DataSpec dataspec)
		throws IOException;

	public abstract void write(byte abyte0[], int i, int j)
		throws IOException;
}
