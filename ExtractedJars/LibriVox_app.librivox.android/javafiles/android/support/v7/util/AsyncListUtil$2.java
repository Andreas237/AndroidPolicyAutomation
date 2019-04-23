// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import android.util.Log;
import android.util.SparseBooleanArray;

// Referenced classes of package android.support.v7.util:
//			AsyncListUtil

class AsyncListUtil$2
	implements roundCallback
{

	private TileList.Tile acquireTile()
	{
		TileList.Tile tile = mRecycledRoot;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field TileList$Tile mRecycledRoot>
	//    2    4:astore_1        
		if(tile != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
		{
			mRecycledRoot = tile.mNext;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #39  <Field TileList$Tile TileList$Tile.mNext>
	//    8   14:putfield        #34  <Field TileList$Tile mRecycledRoot>
			return tile;
	//    9   17:aload_1         
	//   10   18:areturn         
		} else
		{
			return new TileList.Tile(mTClass, mTileSize);
	//   11   19:new             #36  <Class TileList$Tile>
	//   12   22:dup             
	//   13   23:aload_0         
	//   14   24:getfield        #21  <Field AsyncListUtil this$0>
	//   15   27:getfield        #45  <Field Class AsyncListUtil.mTClass>
	//   16   30:aload_0         
	//   17   31:getfield        #21  <Field AsyncListUtil this$0>
	//   18   34:getfield        #48  <Field int AsyncListUtil.mTileSize>
	//   19   37:invokespecial   #51  <Method void TileList$Tile(Class, int)>
	//   20   40:areturn         
		}
	}

	private void addTile(TileList.Tile tile)
	{
		mLoadedTiles.put(tile.mStartPosition, true);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field SparseBooleanArray mLoadedTiles>
	//    2    4:aload_1         
	//    3    5:getfield        #56  <Field int TileList$Tile.mStartPosition>
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #60  <Method void SparseBooleanArray.put(int, boolean)>
		mMainThreadProxy.addTile(mGeneration, tile);
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field AsyncListUtil this$0>
	//    8   16:getfield        #64  <Field ThreadUtil$MainThreadCallback AsyncListUtil.mMainThreadProxy>
	//    9   19:aload_0         
	//   10   20:getfield        #66  <Field int mGeneration>
	//   11   23:aload_1         
	//   12   24:invokeinterface #71  <Method void ThreadUtil$MainThreadCallback.addTile(int, TileList$Tile)>
	//   13   29:return          
	}

	private void flushTileCache(int i)
	{
		for(int j = mDataCallback.getMaxCachedTiles(); mLoadedTiles.size() >= j;)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field AsyncListUtil this$0>
	//*   2    4:getfield        #77  <Field AsyncListUtil$DataCallback AsyncListUtil.mDataCallback>
	//*   3    7:invokevirtual   #83  <Method int AsyncListUtil$DataCallback.getMaxCachedTiles()>
	//*   4   10:istore_2        
	//*   5   11:aload_0         
	//*   6   12:getfield        #29  <Field SparseBooleanArray mLoadedTiles>
	//*   7   15:invokevirtual   #86  <Method int SparseBooleanArray.size()>
	//*   8   18:iload_2         
	//*   9   19:icmplt          120
		{
			int k = mLoadedTiles.keyAt(0);
	//   10   22:aload_0         
	//   11   23:getfield        #29  <Field SparseBooleanArray mLoadedTiles>
	//   12   26:iconst_0        
	//   13   27:invokevirtual   #90  <Method int SparseBooleanArray.keyAt(int)>
	//   14   30:istore_3        
			SparseBooleanArray sparsebooleanarray = mLoadedTiles;
	//   15   31:aload_0         
	//   16   32:getfield        #29  <Field SparseBooleanArray mLoadedTiles>
	//   17   35:astore          7
			int l = sparsebooleanarray.keyAt(sparsebooleanarray.size() - 1);
	//   18   37:aload           7
	//   19   39:aload           7
	//   20   41:invokevirtual   #86  <Method int SparseBooleanArray.size()>
	//   21   44:iconst_1        
	//   22   45:isub            
	//   23   46:invokevirtual   #90  <Method int SparseBooleanArray.keyAt(int)>
	//   24   49:istore          4
			int i1 = mFirstRequiredTileStart - k;
	//   25   51:aload_0         
	//   26   52:getfield        #92  <Field int mFirstRequiredTileStart>
	//   27   55:iload_3         
	//   28   56:isub            
	//   29   57:istore          5
			int j1 = l - mLastRequiredTileStart;
	//   30   59:iload           4
	//   31   61:aload_0         
	//   32   62:getfield        #94  <Field int mLastRequiredTileStart>
	//   33   65:isub            
	//   34   66:istore          6
			if(i1 > 0 && (i1 >= j1 || i == 2))
	//*  35   68:iload           5
	//*  36   70:ifle            93
	//*  37   73:iload           5
	//*  38   75:iload           6
	//*  39   77:icmpge          85
	//*  40   80:iload_1         
	//*  41   81:iconst_2        
	//*  42   82:icmpne          93
				removeTile(k);
	//   43   85:aload_0         
	//   44   86:iload_3         
	//   45   87:invokespecial   #97  <Method void removeTile(int)>
			else
	//*  46   90:goto            11
			if(j1 > 0 && (i1 < j1 || i == 1))
	//*  47   93:iload           6
	//*  48   95:ifle            119
	//*  49   98:iload           5
	//*  50  100:iload           6
	//*  51  102:icmplt          110
	//*  52  105:iload_1         
	//*  53  106:iconst_1        
	//*  54  107:icmpne          119
				removeTile(l);
	//   55  110:aload_0         
	//   56  111:iload           4
	//   57  113:invokespecial   #97  <Method void removeTile(int)>
			else
	//*  58  116:goto            11
				return;
	//   59  119:return          
		}

	//   60  120:return          
	}

	private int getTileStart(int i)
	{
		return i - i % mTileSize;
	//    0    0:iload_1         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field AsyncListUtil this$0>
	//    4    6:getfield        #48  <Field int AsyncListUtil.mTileSize>
	//    5    9:irem            
	//    6   10:isub            
	//    7   11:ireturn         
	}

	private boolean isTileLoaded(int i)
	{
		return mLoadedTiles.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field SparseBooleanArray mLoadedTiles>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #103 <Method boolean SparseBooleanArray.get(int)>
	//    4    8:ireturn         
	}

	private transient void log(String s, Object aobj[])
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #107 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #108 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("[BKGR] ");
	//    4    8:aload_3         
	//    5    9:ldc1            #110 <String "[BKGR] ">
	//    6   11:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(String.format(s, aobj));
	//    8   15:aload_3         
	//    9   16:aload_1         
	//   10   17:aload_2         
	//   11   18:invokestatic    #120 <Method String String.format(String, Object[])>
	//   12   21:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
		Log.d("AsyncListUtil", stringbuilder.toString());
	//   14   25:ldc1            #122 <String "AsyncListUtil">
	//   15   27:aload_3         
	//   16   28:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   17   31:invokestatic    #132 <Method int Log.d(String, String)>
	//   18   34:pop             
	//   19   35:return          
	}

	private void removeTile(int i)
	{
		mLoadedTiles.delete(i);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field SparseBooleanArray mLoadedTiles>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #135 <Method void SparseBooleanArray.delete(int)>
		mMainThreadProxy.removeTile(mGeneration, i);
	//    4    8:aload_0         
	//    5    9:getfield        #21  <Field AsyncListUtil this$0>
	//    6   12:getfield        #64  <Field ThreadUtil$MainThreadCallback AsyncListUtil.mMainThreadProxy>
	//    7   15:aload_0         
	//    8   16:getfield        #66  <Field int mGeneration>
	//    9   19:iload_1         
	//   10   20:invokeinterface #138 <Method void ThreadUtil$MainThreadCallback.removeTile(int, int)>
	//   11   25:return          
	}

	private void requestTiles(int i, int j, int k, boolean flag)
	{
		for(int l = i; l <= j; l += mTileSize)
	//*   0    0:iload_1         
	//*   1    1:istore          5
	//*   2    3:iload           5
	//*   3    5:iload_2         
	//*   4    6:icmpgt          59
		{
			int i1;
			if(flag)
	//*   5    9:iload           4
	//*   6   11:ifeq            25
				i1 = (j + i) - l;
	//    7   14:iload_2         
	//    8   15:iload_1         
	//    9   16:iadd            
	//   10   17:iload           5
	//   11   19:isub            
	//   12   20:istore          6
			else
	//*  13   22:goto            29
				i1 = l;
	//   14   25:iload           5
	//   15   27:istore          6
			mBackgroundProxy.loadTile(i1, k);
	//   16   29:aload_0         
	//   17   30:getfield        #21  <Field AsyncListUtil this$0>
	//   18   33:getfield        #144 <Field ThreadUtil$BackgroundCallback AsyncListUtil.mBackgroundProxy>
	//   19   36:iload           6
	//   20   38:iload_3         
	//   21   39:invokeinterface #147 <Method void ThreadUtil$BackgroundCallback.loadTile(int, int)>
		}

	//   22   44:iload           5
	//   23   46:aload_0         
	//   24   47:getfield        #21  <Field AsyncListUtil this$0>
	//   25   50:getfield        #48  <Field int AsyncListUtil.mTileSize>
	//   26   53:iadd            
	//   27   54:istore          5
	//*  28   56:goto            3
	//   29   59:return          
	}

	public void loadTile(int i, int j)
	{
		if(isTileLoaded(i))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokespecial   #149 <Method boolean isTileLoaded(int)>
	//*   3    5:ifeq            9
		{
			return;
	//    4    8:return          
		} else
		{
			TileList.Tile tile = acquireTile();
	//    5    9:aload_0         
	//    6   10:invokespecial   #151 <Method TileList$Tile acquireTile()>
	//    7   13:astore_3        
			tile.mStartPosition = i;
	//    8   14:aload_3         
	//    9   15:iload_1         
	//   10   16:putfield        #56  <Field int TileList$Tile.mStartPosition>
			tile.mItemCount = Math.min(mTileSize, mItemCount - tile.mStartPosition);
	//   11   19:aload_3         
	//   12   20:aload_0         
	//   13   21:getfield        #21  <Field AsyncListUtil this$0>
	//   14   24:getfield        #48  <Field int AsyncListUtil.mTileSize>
	//   15   27:aload_0         
	//   16   28:getfield        #153 <Field int mItemCount>
	//   17   31:aload_3         
	//   18   32:getfield        #56  <Field int TileList$Tile.mStartPosition>
	//   19   35:isub            
	//   20   36:invokestatic    #159 <Method int Math.min(int, int)>
	//   21   39:putfield        #160 <Field int TileList$Tile.mItemCount>
			mDataCallback.fillData(tile.mItems, tile.mStartPosition, tile.mItemCount);
	//   22   42:aload_0         
	//   23   43:getfield        #21  <Field AsyncListUtil this$0>
	//   24   46:getfield        #77  <Field AsyncListUtil$DataCallback AsyncListUtil.mDataCallback>
	//   25   49:aload_3         
	//   26   50:getfield        #164 <Field Object[] TileList$Tile.mItems>
	//   27   53:aload_3         
	//   28   54:getfield        #56  <Field int TileList$Tile.mStartPosition>
	//   29   57:aload_3         
	//   30   58:getfield        #160 <Field int TileList$Tile.mItemCount>
	//   31   61:invokevirtual   #168 <Method void AsyncListUtil$DataCallback.fillData(Object[], int, int)>
			flushTileCache(j);
	//   32   64:aload_0         
	//   33   65:iload_2         
	//   34   66:invokespecial   #170 <Method void flushTileCache(int)>
			addTile(tile);
	//   35   69:aload_0         
	//   36   70:aload_3         
	//   37   71:invokespecial   #172 <Method void addTile(TileList$Tile)>
			return;
	//   38   74:return          
		}
	}

	public void recycleTile(TileList.Tile tile)
	{
		mDataCallback.recycleData(tile.mItems, tile.mItemCount);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AsyncListUtil this$0>
	//    2    4:getfield        #77  <Field AsyncListUtil$DataCallback AsyncListUtil.mDataCallback>
	//    3    7:aload_1         
	//    4    8:getfield        #164 <Field Object[] TileList$Tile.mItems>
	//    5   11:aload_1         
	//    6   12:getfield        #160 <Field int TileList$Tile.mItemCount>
	//    7   15:invokevirtual   #177 <Method void AsyncListUtil$DataCallback.recycleData(Object[], int)>
		tile.mNext = mRecycledRoot;
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #34  <Field TileList$Tile mRecycledRoot>
	//   11   23:putfield        #39  <Field TileList$Tile TileList$Tile.mNext>
		mRecycledRoot = tile;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #34  <Field TileList$Tile mRecycledRoot>
	//   15   31:return          
	}

	public void refresh(int i)
	{
		mGeneration = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #66  <Field int mGeneration>
		mLoadedTiles.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #29  <Field SparseBooleanArray mLoadedTiles>
	//    5    9:invokevirtual   #181 <Method void SparseBooleanArray.clear()>
		mItemCount = mDataCallback.refreshData();
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #21  <Field AsyncListUtil this$0>
	//    9   17:getfield        #77  <Field AsyncListUtil$DataCallback AsyncListUtil.mDataCallback>
	//   10   20:invokevirtual   #184 <Method int AsyncListUtil$DataCallback.refreshData()>
	//   11   23:putfield        #153 <Field int mItemCount>
		mMainThreadProxy.updateItemCount(mGeneration, mItemCount);
	//   12   26:aload_0         
	//   13   27:getfield        #21  <Field AsyncListUtil this$0>
	//   14   30:getfield        #64  <Field ThreadUtil$MainThreadCallback AsyncListUtil.mMainThreadProxy>
	//   15   33:aload_0         
	//   16   34:getfield        #66  <Field int mGeneration>
	//   17   37:aload_0         
	//   18   38:getfield        #153 <Field int mItemCount>
	//   19   41:invokeinterface #187 <Method void ThreadUtil$MainThreadCallback.updateItemCount(int, int)>
	//   20   46:return          
	}

	public void updateRange(int i, int j, int k, int l, int i1)
	{
		if(i > j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmple          6
			return;
	//    3    5:return          
		i = getTileStart(i);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:invokespecial   #191 <Method int getTileStart(int)>
	//    7   11:istore_1        
		j = getTileStart(j);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokespecial   #191 <Method int getTileStart(int)>
	//   11   17:istore_2        
		mFirstRequiredTileStart = getTileStart(k);
	//   12   18:aload_0         
	//   13   19:aload_0         
	//   14   20:iload_3         
	//   15   21:invokespecial   #191 <Method int getTileStart(int)>
	//   16   24:putfield        #92  <Field int mFirstRequiredTileStart>
		mLastRequiredTileStart = getTileStart(l);
	//   17   27:aload_0         
	//   18   28:aload_0         
	//   19   29:iload           4
	//   20   31:invokespecial   #191 <Method int getTileStart(int)>
	//   21   34:putfield        #94  <Field int mLastRequiredTileStart>
		if(i1 == 1)
	//*  22   37:iload           5
	//*  23   39:iconst_1        
	//*  24   40:icmpne          76
		{
			requestTiles(mFirstRequiredTileStart, j, i1, true);
	//   25   43:aload_0         
	//   26   44:aload_0         
	//   27   45:getfield        #92  <Field int mFirstRequiredTileStart>
	//   28   48:iload_2         
	//   29   49:iload           5
	//   30   51:iconst_1        
	//   31   52:invokespecial   #193 <Method void requestTiles(int, int, int, boolean)>
			requestTiles(j + mTileSize, mLastRequiredTileStart, i1, false);
	//   32   55:aload_0         
	//   33   56:iload_2         
	//   34   57:aload_0         
	//   35   58:getfield        #21  <Field AsyncListUtil this$0>
	//   36   61:getfield        #48  <Field int AsyncListUtil.mTileSize>
	//   37   64:iadd            
	//   38   65:aload_0         
	//   39   66:getfield        #94  <Field int mLastRequiredTileStart>
	//   40   69:iload           5
	//   41   71:iconst_0        
	//   42   72:invokespecial   #193 <Method void requestTiles(int, int, int, boolean)>
			return;
	//   43   75:return          
		} else
		{
			requestTiles(i, mLastRequiredTileStart, i1, false);
	//   44   76:aload_0         
	//   45   77:iload_1         
	//   46   78:aload_0         
	//   47   79:getfield        #94  <Field int mLastRequiredTileStart>
	//   48   82:iload           5
	//   49   84:iconst_0        
	//   50   85:invokespecial   #193 <Method void requestTiles(int, int, int, boolean)>
			requestTiles(mFirstRequiredTileStart, i - mTileSize, i1, true);
	//   51   88:aload_0         
	//   52   89:aload_0         
	//   53   90:getfield        #92  <Field int mFirstRequiredTileStart>
	//   54   93:iload_1         
	//   55   94:aload_0         
	//   56   95:getfield        #21  <Field AsyncListUtil this$0>
	//   57   98:getfield        #48  <Field int AsyncListUtil.mTileSize>
	//   58  101:isub            
	//   59  102:iload           5
	//   60  104:iconst_1        
	//   61  105:invokespecial   #193 <Method void requestTiles(int, int, int, boolean)>
			return;
	//   62  108:return          
		}
	}

	private int mFirstRequiredTileStart;
	private int mGeneration;
	private int mItemCount;
	private int mLastRequiredTileStart;
	final SparseBooleanArray mLoadedTiles = new SparseBooleanArray();
	private TileList.Tile mRecycledRoot;
	final AsyncListUtil this$0;

	AsyncListUtil$2()
	{
		this$0 = AsyncListUtil.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field AsyncListUtil this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
	//    5    9:aload_0         
	//    6   10:new             #26  <Class SparseBooleanArray>
	//    7   13:dup             
	//    8   14:invokespecial   #27  <Method void SparseBooleanArray()>
	//    9   17:putfield        #29  <Field SparseBooleanArray mLoadedTiles>
	//   10   20:return          
	}
}
