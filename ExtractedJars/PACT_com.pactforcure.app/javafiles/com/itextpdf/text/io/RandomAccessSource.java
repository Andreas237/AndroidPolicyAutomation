// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.io;

import java.io.IOException;

public interface RandomAccessSource
{

	public abstract void close()
		throws IOException;

	public abstract int get(long l)
		throws IOException;

	public abstract int get(long l, byte abyte0[], int i, int j)
		throws IOException;

	public abstract long length();
}
