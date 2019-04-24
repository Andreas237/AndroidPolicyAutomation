// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

public interface DataFetcher
{
	public static interface DataCallback
	{

		public abstract void onDataReady(Object obj);

		public abstract void onLoadFailed(Exception exception);
	}


	public abstract void cancel();

	public abstract void cleanup();

	public abstract Class getDataClass();

	public abstract DataSource getDataSource();

	public abstract void loadData(Priority priority, DataCallback datacallback);
}
