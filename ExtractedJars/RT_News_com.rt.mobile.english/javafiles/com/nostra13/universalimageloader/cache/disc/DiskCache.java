// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.nostra13.universalimageloader.cache.disc;

import android.graphics.Bitmap;
import java.io.*;

public interface DiskCache
{

	public abstract void clear();

	public abstract void close();

	public abstract File get(String s);

	public abstract File getDirectory();

	public abstract boolean remove(String s);

	public abstract boolean save(String s, Bitmap bitmap)
		throws IOException;

	public abstract boolean save(String s, InputStream inputstream, com.nostra13.universalimageloader.utils.IoUtils.CopyListener copylistener)
		throws IOException;
}
