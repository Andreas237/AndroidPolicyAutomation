// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import java.io.File;

public interface DiskCache
{
	public static interface Factory
	{

		public abstract DiskCache build();
	}

	public static interface Writer
	{

		public abstract boolean write(File file);
	}


	public abstract void clear();

	public abstract void delete(Key key);

	public abstract File get(Key key);

	public abstract void put(Key key, Writer writer);
}
