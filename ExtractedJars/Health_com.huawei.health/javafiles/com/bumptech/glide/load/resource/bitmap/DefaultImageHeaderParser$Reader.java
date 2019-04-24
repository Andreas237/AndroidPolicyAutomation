// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			DefaultImageHeaderParser

static interface DefaultImageHeaderParser$Reader
{

	public abstract int getByte()
		throws IOException;

	public abstract int getUInt16()
		throws IOException;

	public abstract short getUInt8()
		throws IOException;

	public abstract int read(byte abyte0[], int i)
		throws IOException;

	public abstract long skip(long l)
		throws IOException;
}
