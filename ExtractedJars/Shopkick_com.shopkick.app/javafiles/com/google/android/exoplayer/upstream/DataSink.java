// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;

import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.upstream:
//			DataSpec

public interface DataSink
{

	public abstract void close()
		throws IOException;

	public abstract DataSink open(DataSpec dataspec)
		throws IOException;

	public abstract void write(byte abyte0[], int i, int j)
		throws IOException;
}
