// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;


public interface ThreadUtil$BackgroundCallback
{

	public abstract void loadTile(int i, int j);

	public abstract void recycleTile(TileList.Tile tile);

	public abstract void refresh(int i);

	public abstract void updateRange(int i, int j, int k, int l, int i1);
}
