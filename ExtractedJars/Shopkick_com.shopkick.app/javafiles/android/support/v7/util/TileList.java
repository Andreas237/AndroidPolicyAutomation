// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import android.util.SparseArray;
import java.lang.reflect.Array;

class TileList
{
	public static class Tile
	{

		boolean containsPosition(int i)
		{
			int j = mStartPosition;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field int mStartPosition>
		//    2    4:istore_2        
			return j <= i && i < j + mItemCount;
		//    3    5:iload_2         
		//    4    6:iload_1         
		//    5    7:icmpgt          22
		//    6   10:iload_1         
		//    7   11:iload_2         
		//    8   12:aload_0         
		//    9   13:getfield        #40  <Field int mItemCount>
		//   10   16:iadd            
		//   11   17:icmpge          22
		//   12   20:iconst_1        
		//   13   21:ireturn         
		//   14   22:iconst_0        
		//   15   23:ireturn         
		}

		Object getByPosition(int i)
		{
			return mItems[i - mStartPosition];
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field Object[] mItems>
		//    2    4:iload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #38  <Field int mStartPosition>
		//    5    9:isub            
		//    6   10:aaload          
		//    7   11:areturn         
		}

		public int mItemCount;
		public final Object mItems[];
		Tile mNext;
		public int mStartPosition;

		public Tile(Class class1, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
			mItems = (Object[])Array.newInstance(class1, i);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokestatic    #28  <Method Object Array.newInstance(Class, int)>
		//    6   10:checkcast       #29  <Class Object[]>
		//    7   13:putfield        #31  <Field Object[] mItems>
		//    8   16:return          
		}
	}


	public TileList(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #23  <Class SparseArray>
	//    4    8:dup             
	//    5    9:bipush          10
	//    6   11:invokespecial   #25  <Method void SparseArray(int)>
	//    7   14:putfield        #27  <Field SparseArray mTiles>
		mTileSize = i;
	//    8   17:aload_0         
	//    9   18:iload_1         
	//   10   19:putfield        #29  <Field int mTileSize>
	//   11   22:return          
	}

	public Tile addOrReplace(Tile tile)
	{
		int i = mTiles.indexOfKey(tile.mStartPosition);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field SparseArray mTiles>
	//    2    4:aload_1         
	//    3    5:getfield        #35  <Field int TileList$Tile.mStartPosition>
	//    4    8:invokevirtual   #39  <Method int SparseArray.indexOfKey(int)>
	//    5   11:istore_2        
		if(i < 0)
	//*   6   12:iload_2         
	//*   7   13:ifge            30
		{
			mTiles.put(tile.mStartPosition, ((Object) (tile)));
	//    8   16:aload_0         
	//    9   17:getfield        #27  <Field SparseArray mTiles>
	//   10   20:aload_1         
	//   11   21:getfield        #35  <Field int TileList$Tile.mStartPosition>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #43  <Method void SparseArray.put(int, Object)>
			return null;
	//   14   28:aconst_null     
	//   15   29:areturn         
		}
		Tile tile1 = (Tile)mTiles.valueAt(i);
	//   16   30:aload_0         
	//   17   31:getfield        #27  <Field SparseArray mTiles>
	//   18   34:iload_2         
	//   19   35:invokevirtual   #47  <Method Object SparseArray.valueAt(int)>
	//   20   38:checkcast       #7   <Class TileList$Tile>
	//   21   41:astore_3        
		mTiles.setValueAt(i, ((Object) (tile)));
	//   22   42:aload_0         
	//   23   43:getfield        #27  <Field SparseArray mTiles>
	//   24   46:iload_2         
	//   25   47:aload_1         
	//   26   48:invokevirtual   #50  <Method void SparseArray.setValueAt(int, Object)>
		if(mLastAccessedTile == tile1)
	//*  27   51:aload_0         
	//*  28   52:getfield        #52  <Field TileList$Tile mLastAccessedTile>
	//*  29   55:aload_3         
	//*  30   56:if_acmpne       64
			mLastAccessedTile = tile;
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:putfield        #52  <Field TileList$Tile mLastAccessedTile>
		return tile1;
	//   34   64:aload_3         
	//   35   65:areturn         
	}

	public void clear()
	{
		mTiles.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field SparseArray mTiles>
	//    2    4:invokevirtual   #57  <Method void SparseArray.clear()>
	//    3    7:return          
	}

	public Tile getAtIndex(int i)
	{
		return (Tile)mTiles.valueAt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field SparseArray mTiles>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #47  <Method Object SparseArray.valueAt(int)>
	//    4    8:checkcast       #7   <Class TileList$Tile>
	//    5   11:areturn         
	}

	public Object getItemAt(int i)
	{
		Tile tile = mLastAccessedTile;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field TileList$Tile mLastAccessedTile>
	//    2    4:astore_3        
		if(tile == null || !tile.containsPosition(i))
	//*   3    5:aload_3         
	//*   4    6:ifnull          17
	//*   5    9:aload_3         
	//*   6   10:iload_1         
	//*   7   11:invokevirtual   #65  <Method boolean TileList$Tile.containsPosition(int)>
	//*   8   14:ifne            56
		{
			int j = mTileSize;
	//    9   17:aload_0         
	//   10   18:getfield        #29  <Field int mTileSize>
	//   11   21:istore_2        
			j = mTiles.indexOfKey(i - i % j);
	//   12   22:aload_0         
	//   13   23:getfield        #27  <Field SparseArray mTiles>
	//   14   26:iload_1         
	//   15   27:iload_1         
	//   16   28:iload_2         
	//   17   29:irem            
	//   18   30:isub            
	//   19   31:invokevirtual   #39  <Method int SparseArray.indexOfKey(int)>
	//   20   34:istore_2        
			if(j < 0)
	//*  21   35:iload_2         
	//*  22   36:ifge            41
				return ((Object) (null));
	//   23   39:aconst_null     
	//   24   40:areturn         
			mLastAccessedTile = (Tile)mTiles.valueAt(j);
	//   25   41:aload_0         
	//   26   42:aload_0         
	//   27   43:getfield        #27  <Field SparseArray mTiles>
	//   28   46:iload_2         
	//   29   47:invokevirtual   #47  <Method Object SparseArray.valueAt(int)>
	//   30   50:checkcast       #7   <Class TileList$Tile>
	//   31   53:putfield        #52  <Field TileList$Tile mLastAccessedTile>
		}
		return mLastAccessedTile.getByPosition(i);
	//   32   56:aload_0         
	//   33   57:getfield        #52  <Field TileList$Tile mLastAccessedTile>
	//   34   60:iload_1         
	//   35   61:invokevirtual   #68  <Method Object TileList$Tile.getByPosition(int)>
	//   36   64:areturn         
	}

	public Tile removeAtPos(int i)
	{
		Tile tile = (Tile)mTiles.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field SparseArray mTiles>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #73  <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #7   <Class TileList$Tile>
	//    5   11:astore_2        
		if(mLastAccessedTile == tile)
	//*   6   12:aload_0         
	//*   7   13:getfield        #52  <Field TileList$Tile mLastAccessedTile>
	//*   8   16:aload_2         
	//*   9   17:if_acmpne       25
			mLastAccessedTile = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #52  <Field TileList$Tile mLastAccessedTile>
		mTiles.delete(i);
	//   13   25:aload_0         
	//   14   26:getfield        #27  <Field SparseArray mTiles>
	//   15   29:iload_1         
	//   16   30:invokevirtual   #76  <Method void SparseArray.delete(int)>
		return tile;
	//   17   33:aload_2         
	//   18   34:areturn         
	}

	public int size()
	{
		return mTiles.size();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field SparseArray mTiles>
	//    2    4:invokevirtual   #80  <Method int SparseArray.size()>
	//    3    7:ireturn         
	}

	Tile mLastAccessedTile;
	final int mTileSize;
	private final SparseArray mTiles = new SparseArray(10);
}
