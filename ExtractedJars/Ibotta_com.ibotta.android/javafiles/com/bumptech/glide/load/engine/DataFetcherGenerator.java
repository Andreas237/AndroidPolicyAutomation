// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;

interface DataFetcherGenerator
{
	public static interface FetcherReadyCallback
	{

		public abstract void onDataFetcherFailed(Key key, Exception exception, DataFetcher datafetcher, DataSource datasource);

		public abstract void onDataFetcherReady(Key key, Object obj, DataFetcher datafetcher, DataSource datasource, Key key1);

		public abstract void reschedule();
	}


	public abstract void cancel();

	public abstract boolean startNext();
}
