// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;

import java.io.IOException;

public interface DataRewinder
{
	public static interface Factory
	{

		public abstract DataRewinder build(Object obj);

		public abstract Class getDataClass();
	}


	public abstract void cleanup();

	public abstract Object rewindAndGet()
		throws IOException;
}
