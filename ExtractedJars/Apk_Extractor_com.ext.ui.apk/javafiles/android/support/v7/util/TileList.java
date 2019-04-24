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
			return mStartPosition <= i && i < mStartPosition + mItemCount;
		//    0    0:aload_0         
		//    1    1:getfield        #38  <Field int mStartPosition>
		//    2    4:iload_1         
		//    3    5:icmpgt          23
		//    4    8:iload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #38  <Field int mStartPosition>
		//    7   13:aload_0         
		//    8   14:getfield        #40  <Field int mItemCount>
		//    9   17:iadd            
		//   10   18:icmpge          23
		//   11   21:iconst_1        
		//   12   22:ireturn         
		//   13   23:iconst_0        
		//   14   24:ireturn         
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
			mItems = (Object[])(Object[])Array.newInstance(class1, i);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:invokestatic    #28  <Method Object Array.newInstance(Class, int)>
		//    6   10:checkcast       #29  <Class Object[]>
		//    7   13:checkcast       #29  <Class Object[]>
		//    8   16:putfield        #31  <Field Object[] mItems>
		//    9   19:return          
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
		Tile tile1;
		if(i < 0)
	//*   6   12:iload_2         
	//*   7   13:ifge            32
		{
			mTiles.put(tile.mStartPosition, ((Object) (tile)));
	//    8   16:aload_0         
	//    9   17:getfield        #27  <Field SparseArray mTiles>
	//   10   20:aload_1         
	//   11   21:getfield        #35  <Field int TileList$Tile.mStartPosition>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #43  <Method void SparseArray.put(int, Object)>
			tile1 = null;
	//   14   28:aconst_null     
	//   15   29:astore_3        
		} else
	//*  16   30:aload_3         
	//*  17   31:areturn         
		{
			Tile tile2 = (Tile)mTiles.valueAt(i);
	//   18   32:aload_0         
	//   19   33:getfield        #27  <Field SparseArray mTiles>
	//   20   36:iload_2         
	//   21   37:invokevirtual   #47  <Method Object SparseArray.valueAt(int)>
	//   22   40:checkcast       #7   <Class TileList$Tile>
	//   23   43:astore          4
			mTiles.setValueAt(i, ((Object) (tile)));
	//   24   45:aload_0         
	//   25   46:getfield        #27  <Field SparseArray mTiles>
	//   26   49:iload_2         
	//   27   50:aload_1         
	//   28   51:invokevirtual   #50  <Method void SparseArray.setValueAt(int, Object)>
			tile1 = tile2;
	//   29   54:aload           4
	//   30   56:astore_3        
			if(mLastAccessedTile == tile2)
	//*  31   57:aload_0         
	//*  32   58:getfield        #52  <Field TileList$Tile mLastAccessedTile>
	//*  33   61:aload           4
	//*  34   63:if_acmpne       30
			{
				mLastAccessedTile = tile;
	//   35   66:aload_0         
	//   36   67:aload_1         
	//   37   68:putfield        #52  <Field TileList$Tile mLastAccessedTile>
				return tile2;
	//   38   71:aload           4
	//   39   73:areturn         
			}
		}
		return tile1;
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
		if(mLastAccessedTile == null || !mLastAccessedTile.containsPosition(i))
	//*   0    0:aload_0         
	//*   1    1:getfield        #52  <Field TileList$Tile mLastAccessedTile>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #52  <Field TileList$Tile mLastAccessedTile>
	//*   5   11:iload_1         
	//*   6   12:invokevirtual   #65  <Method boolean TileList$Tile.containsPosition(int)>
	//*   7   15:ifne            57
		{
			int j = mTileSize;
	//    8   18:aload_0         
	//    9   19:getfield        #29  <Field int mTileSize>
	//   10   22:istore_2        
			j = mTiles.indexOfKey(i - i % j);
	//   11   23:aload_0         
	//   12   24:getfield        #27  <Field SparseArray mTiles>
	//   13   27:iload_1         
	//   14   28:iload_1         
	//   15   29:iload_2         
	//   16   30:irem            
	//   17   31:isub            
	//   18   32:invokevirtual   #39  <Method int SparseArray.indexOfKey(int)>
	//   19   35:istore_2        
			if(j < 0)
	//*  20   36:iload_2         
	//*  21   37:ifge            42
				return ((Object) (null));
	//   22   40:aconst_null     
	//   23   41:areturn         
			mLastAccessedTile = (Tile)mTiles.valueAt(j);
	//   24   42:aload_0         
	//   25   43:aload_0         
	//   26   44:getfield        #27  <Field SparseArray mTiles>
	//   27   47:iload_2         
	//   28   48:invokevirtual   #47  <Method Object SparseArray.valueAt(int)>
	//   29   51:checkcast       #7   <Class TileList$Tile>
	//   30   54:putfield        #52  <Field TileList$Tile mLastAccessedTile>
		}
		return mLastAccessedTile.getByPosition(i);
	//   31   57:aload_0         
	//   32   58:getfield        #52  <Field TileList$Tile mLastAccessedTile>
	//   33   61:iload_1         
	//   34   62:invokevirtual   #68  <Method Object TileList$Tile.getByPosition(int)>
	//   35   65:areturn         
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
