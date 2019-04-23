// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;


// Referenced classes of package android.support.v7.util:
//			ThreadUtil

public static interface ThreadUtil$MainThreadCallback
{

	public abstract void addTile(int i, TileList.Tile tile);

	public abstract void removeTile(int i, int j);

	public abstract void updateItemCount(int i, int j);
}
