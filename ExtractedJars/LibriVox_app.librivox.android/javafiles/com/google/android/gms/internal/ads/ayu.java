// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.nio.ByteBuffer;

public interface ayu
	extends Closeable
{

	public abstract int a(ByteBuffer bytebuffer);

	public abstract long a();

	public abstract ByteBuffer a(long l, long l1);

	public abstract void a(long l);

	public abstract long b();

	public abstract void close();
}
