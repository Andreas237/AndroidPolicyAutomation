// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.api.Releasable;
import java.util.Iterator;

public interface DataBuffer
	extends Releasable, Iterable
{

	public abstract void close();

	public abstract Object get(int i);

	public abstract int getCount();

	public abstract boolean isClosed();

	public abstract Iterator iterator();

	public abstract void release();

	public abstract Iterator singleRefIterator();

	public abstract Bundle zzxf();
}
