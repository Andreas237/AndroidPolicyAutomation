// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;


interface ThreadUtil
{
	public static interface BackgroundCallback
	{

		public abstract void loadTile(int i, int j);

		public abstract void recycleTile(TileList.Tile tile);

		public abstract void refresh(int i);

		public abstract void updateRange(int i, int j, int k, int l, int i1);
	}

	public static interface MainThreadCallback
	{

		public abstract void addTile(int i, TileList.Tile tile);

		public abstract void removeTile(int i, int j);

		public abstract void updateItemCount(int i, int j);
	}


	public abstract BackgroundCallback getBackgroundProxy(BackgroundCallback backgroundcallback);

	public abstract MainThreadCallback getMainThreadProxy(MainThreadCallback mainthreadcallback);
}
