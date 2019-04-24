// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DataSpec

public interface DataSource
{
	public static interface Factory
	{

		public abstract DataSource createDataSource();
	}


	public abstract void close()
		throws IOException;

	public abstract Uri getUri();

	public abstract long open(DataSpec dataspec)
		throws IOException;

	public abstract int read(byte abyte0[], int i, int j)
		throws IOException;
}
