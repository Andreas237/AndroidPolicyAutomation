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
		if(mRecycledRoot != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field TileList$Tile mRecycledRoot>
	//*   2    4:ifnull          25
		{
			TileList.Tile tile = mRecycledRoot;
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field TileList$Tile mRecycledRoot>
	//    5   11:astore_1        
			mRecycledRoot = mRecycledRoot.mNext;
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #38  <Field TileList$Tile mRecycledRoot>
	//    9   17:getfield        #43  <Field TileList$Tile TileList$Tile.mNext>
	//   10   20:putfield        #38  <Field TileList$Tile mRecycledRoot>
			return tile;
	//   11   23:aload_1         
	//   12   24:areturn         
		} else
		{
			return new TileList.Tile(mTClass, mTileSize);
	//   13   25:new             #40  <Class TileList$Tile>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:getfield        #25  <Field AsyncListUtil this$0>
	//   17   33:getfield        #47  <Field Class AsyncListUtil.mTClass>
	//   18   36:aload_0         
	//   19   37:getfield        #25  <Field AsyncListUtil this$0>
	//   20   40:getfield        #50  <Field int AsyncListUtil.mTileSize>
	//   21   43:invokespecial   #53  <Method void TileList$Tile(Class, int)>
	//   22   46:areturn         
		}
	}

	private void addTile(TileList.Tile tile)
	{
		mLoadedTiles.put(tile.mStartPosition, true);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
	//    2    4:aload_1         
	//    3    5:getfield        #60  <Field int TileList$Tile.mStartPosition>
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #64  <Method void SparseBooleanArray.put(int, boolean)>
		mMainThreadProxy.addTile(mGeneration, tile);
	//    6   12:aload_0         
	//    7   13:getfield        #25  <Field AsyncListUtil this$0>
	//    8   16:getfield        #68  <Field ThreadUtil$MainThreadCallback AsyncListUtil.mMainThreadProxy>
	//    9   19:aload_0         
	//   10   20:getfield        #70  <Field int mGeneration>
	//   11   23:aload_1         
	//   12   24:invokeinterface #75  <Method void ThreadUtil$MainThreadCallback.addTile(int, TileList$Tile)>
	//   13   29:return          
	}

	private void flushTileCache(int i)
	{
		int j = mDataCallback.getMaxCachedTiles();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field AsyncListUtil this$0>
	//    2    4:getfield        #82  <Field AsyncListUtil$DataCallback AsyncListUtil.mDataCallback>
	//    3    7:invokevirtual   #88  <Method int AsyncListUtil$DataCallback.getMaxCachedTiles()>
	//    4   10:istore_2        
		do
		{
			if(mLoadedTiles.size() < j)
				break;
	//    5   11:aload_0         
	//    6   12:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
	//    7   15:invokevirtual   #91  <Method int SparseBooleanArray.size()>
	//    8   18:iload_2         
	//    9   19:icmplt          117
			int k = mLoadedTiles.keyAt(0);
	//   10   22:aload_0         
	//   11   23:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
	//   12   26:iconst_0        
	//   13   27:invokevirtual   #95  <Method int SparseBooleanArray.keyAt(int)>
	//   14   30:istore_3        
			int l = mLoadedTiles.keyAt(mLoadedTiles.size() - 1);
	//   15   31:aload_0         
	//   16   32:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
	//   17   35:aload_0         
	//   18   36:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
	//   19   39:invokevirtual   #91  <Method int SparseBooleanArray.size()>
	//   20   42:iconst_1        
	//   21   43:isub            
	//   22   44:invokevirtual   #95  <Method int SparseBooleanArray.keyAt(int)>
	//   23   47:istore          4
			int i1 = mFirstRequiredTileStart - k;
	//   24   49:aload_0         
	//   25   50:getfield        #97  <Field int mFirstRequiredTileStart>
	//   26   53:iload_3         
	//   27   54:isub            
	//   28   55:istore          5
			int j1 = l - mLastRequiredTileStart;
	//   29   57:iload           4
	//   30   59:aload_0         
	//   31   60:getfield        #99  <Field int mLastRequiredTileStart>
	//   32   63:isub            
	//   33   64:istore          6
			if(i1 > 0 && (i1 >= j1 || i == 2))
	//*  34   66:iload           5
	//*  35   68:ifle            91
	//*  36   71:iload           5
	//*  37   73:iload           6
	//*  38   75:icmpge          83
	//*  39   78:iload_1         
	//*  40   79:iconst_2        
	//*  41   80:icmpne          91
			{
				removeTile(k);
	//   42   83:aload_0         
	//   43   84:iload_3         
	//   44   85:invokespecial   #102 <Method void removeTile(int)>
				continue;
	//   45   88:goto            11
			}
			if(j1 <= 0 || i1 >= j1 && i != 1)
				break;
	//   46   91:iload           6
	//   47   93:ifle            117
	//   48   96:iload           5
	//   49   98:iload           6
	//   50  100:icmplt          108
	//   51  103:iload_1         
	//   52  104:iconst_1        
	//   53  105:icmpne          117
			removeTile(l);
	//   54  108:aload_0         
	//   55  109:iload           4
	//   56  111:invokespecial   #102 <Method void removeTile(int)>
		} while(true);
	//   57  114:goto            11
	//   58  117:return          
	}

	private int getTileStart(int i)
	{
		return i - i % mTileSize;
	//    0    0:iload_1         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #25  <Field AsyncListUtil this$0>
	//    4    6:getfield        #50  <Field int AsyncListUtil.mTileSize>
	//    5    9:irem            
	//    6   10:isub            
	//    7   11:ireturn         
	}

	private boolean isTileLoaded(int i)
	{
		return mLoadedTiles.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #108 <Method boolean SparseBooleanArray.get(int)>
	//    4    8:ireturn         
	}

	private transient void log(String s, Object aobj[])
	{
		Log.d("AsyncListUtil", (new StringBuilder()).append("[BKGR] ").append(String.format(s, aobj)).toString());
	//    0    0:ldc1            #112 <String "AsyncListUtil">
	//    1    2:new             #114 <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #115 <Method void StringBuilder()>
	//    4    9:ldc1            #117 <String "[BKGR] ">
	//    5   11:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_1         
	//    7   15:aload_2         
	//    8   16:invokestatic    #127 <Method String String.format(String, Object[])>
	//    9   19:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   11   25:invokestatic    #137 <Method int Log.d(String, String)>
	//   12   28:pop             
	//   13   29:return          
	}

	private void removeTile(int i)
	{
		mLoadedTiles.delete(i);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #140 <Method void SparseBooleanArray.delete(int)>
		mMainThreadProxy.removeTile(mGeneration, i);
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field AsyncListUtil this$0>
	//    6   12:getfield        #68  <Field ThreadUtil$MainThreadCallback AsyncListUtil.mMainThreadProxy>
	//    7   15:aload_0         
	//    8   16:getfield        #70  <Field int mGeneration>
	//    9   19:iload_1         
	//   10   20:invokeinterface #143 <Method void ThreadUtil$MainThreadCallback.removeTile(int, int)>
	//   11   25:return          
	}

	private void requestTiles(int i, int j, int k, boolean flag)
	{
		int l = i;
	//    0    0:iload_1         
	//    1    1:istore          5
		while(l <= j) 
	//*   2    3:iload           5
	//*   3    5:iload_2         
	//*   4    6:icmpgt          59
		{
			int i1;
			if(flag)
	//*   5    9:iload           4
	//*   6   11:ifeq            52
				i1 = (j + i) - l;
	//    7   14:iload_2         
	//    8   15:iload_1         
	//    9   16:iadd            
	//   10   17:iload           5
	//   11   19:isub            
	//   12   20:istore          6
			else
	//*  13   22:aload_0         
	//*  14   23:getfield        #25  <Field AsyncListUtil this$0>
	//*  15   26:getfield        #149 <Field ThreadUtil$BackgroundCallback AsyncListUtil.mBackgroundProxy>
	//*  16   29:iload           6
	//*  17   31:iload_3         
	//*  18   32:invokeinterface #152 <Method void ThreadUtil$BackgroundCallback.loadTile(int, int)>
	//*  19   37:iload           5
	//*  20   39:aload_0         
	//*  21   40:getfield        #25  <Field AsyncListUtil this$0>
	//*  22   43:getfield        #50  <Field int AsyncListUtil.mTileSize>
	//*  23   46:iadd            
	//*  24   47:istore          5
	//*  25   49:goto            3
				i1 = l;
	//   26   52:iload           5
	//   27   54:istore          6
			mBackgroundProxy.loadTile(i1, k);
			l += mTileSize;
		}
	//*  28   56:goto            22
	//   29   59:return          
	}

	public void loadTile(int i, int j)
	{
		if(isTileLoaded(i))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokespecial   #154 <Method boolean isTileLoaded(int)>
	//*   3    5:ifeq            9
		{
			return;
	//    4    8:return          
		} else
		{
			TileList.Tile tile = acquireTile();
	//    5    9:aload_0         
	//    6   10:invokespecial   #156 <Method TileList$Tile acquireTile()>
	//    7   13:astore_3        
			tile.mStartPosition = i;
	//    8   14:aload_3         
	//    9   15:iload_1         
	//   10   16:putfield        #60  <Field int TileList$Tile.mStartPosition>
			tile.mItemCount = Math.min(mTileSize, mItemCount - tile.mStartPosition);
	//   11   19:aload_3         
	//   12   20:aload_0         
	//   13   21:getfield        #25  <Field AsyncListUtil this$0>
	//   14   24:getfield        #50  <Field int AsyncListUtil.mTileSize>
	//   15   27:aload_0         
	//   16   28:getfield        #158 <Field int mItemCount>
	//   17   31:aload_3         
	//   18   32:getfield        #60  <Field int TileList$Tile.mStartPosition>
	//   19   35:isub            
	//   20   36:invokestatic    #164 <Method int Math.min(int, int)>
	//   21   39:putfield        #165 <Field int TileList$Tile.mItemCount>
			mDataCallback.fillData(tile.mItems, tile.mStartPosition, tile.mItemCount);
	//   22   42:aload_0         
	//   23   43:getfield        #25  <Field AsyncListUtil this$0>
	//   24   46:getfield        #82  <Field AsyncListUtil$DataCallback AsyncListUtil.mDataCallback>
	//   25   49:aload_3         
	//   26   50:getfield        #169 <Field Object[] TileList$Tile.mItems>
	//   27   53:aload_3         
	//   28   54:getfield        #60  <Field int TileList$Tile.mStartPosition>
	//   29   57:aload_3         
	//   30   58:getfield        #165 <Field int TileList$Tile.mItemCount>
	//   31   61:invokevirtual   #173 <Method void AsyncListUtil$DataCallback.fillData(Object[], int, int)>
			flushTileCache(j);
	//   32   64:aload_0         
	//   33   65:iload_2         
	//   34   66:invokespecial   #175 <Method void flushTileCache(int)>
			addTile(tile);
	//   35   69:aload_0         
	//   36   70:aload_3         
	//   37   71:invokespecial   #177 <Method void addTile(TileList$Tile)>
			return;
	//   38   74:return          
		}
	}

	public void recycleTile(TileList.Tile tile)
	{
		mDataCallback.recycleData(tile.mItems, tile.mItemCount);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field AsyncListUtil this$0>
	//    2    4:getfield        #82  <Field AsyncListUtil$DataCallback AsyncListUtil.mDataCallback>
	//    3    7:aload_1         
	//    4    8:getfield        #169 <Field Object[] TileList$Tile.mItems>
	//    5   11:aload_1         
	//    6   12:getfield        #165 <Field int TileList$Tile.mItemCount>
	//    7   15:invokevirtual   #182 <Method void AsyncListUtil$DataCallback.recycleData(Object[], int)>
		tile.mNext = mRecycledRoot;
	//    8   18:aload_1         
	//    9   19:aload_0         
	//   10   20:getfield        #38  <Field TileList$Tile mRecycledRoot>
	//   11   23:putfield        #43  <Field TileList$Tile TileList$Tile.mNext>
		mRecycledRoot = tile;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #38  <Field TileList$Tile mRecycledRoot>
	//   15   31:return          
	}

	public void refresh(int i)
	{
		mGeneration = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #70  <Field int mGeneration>
		mLoadedTiles.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field SparseBooleanArray mLoadedTiles>
	//    5    9:invokevirtual   #186 <Method void SparseBooleanArray.clear()>
		mItemCount = mDataCallback.refreshData();
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field AsyncListUtil this$0>
	//    9   17:getfield        #82  <Field AsyncListUtil$DataCallback AsyncListUtil.mDataCallback>
	//   10   20:invokevirtual   #189 <Method int AsyncListUtil$DataCallback.refreshData()>
	//   11   23:putfield        #158 <Field int mItemCount>
		mMainThreadProxy.updateItemCount(mGeneration, mItemCount);
	//   12   26:aload_0         
	//   13   27:getfield        #25  <Field AsyncListUtil this$0>
	//   14   30:getfield        #68  <Field ThreadUtil$MainThreadCallback AsyncListUtil.mMainThreadProxy>
	//   15   33:aload_0         
	//   16   34:getfield        #70  <Field int mGeneration>
	//   17   37:aload_0         
	//   18   38:getfield        #158 <Field int mItemCount>
	//   19   41:invokeinterface #192 <Method void ThreadUtil$MainThreadCallback.updateItemCount(int, int)>
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
	//    6    8:invokespecial   #196 <Method int getTileStart(int)>
	//    7   11:istore_1        
		j = getTileStart(j);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokespecial   #196 <Method int getTileStart(int)>
	//   11   17:istore_2        
		mFirstRequiredTileStart = getTileStart(k);
	//   12   18:aload_0         
	//   13   19:aload_0         
	//   14   20:iload_3         
	//   15   21:invokespecial   #196 <Method int getTileStart(int)>
	//   16   24:putfield        #97  <Field int mFirstRequiredTileStart>
		mLastRequiredTileStart = getTileStart(l);
	//   17   27:aload_0         
	//   18   28:aload_0         
	//   19   29:iload           4
	//   20   31:invokespecial   #196 <Method int getTileStart(int)>
	//   21   34:putfield        #99  <Field int mLastRequiredTileStart>
		if(i1 == 1)
	//*  22   37:iload           5
	//*  23   39:iconst_1        
	//*  24   40:icmpne          76
		{
			requestTiles(mFirstRequiredTileStart, j, i1, true);
	//   25   43:aload_0         
	//   26   44:aload_0         
	//   27   45:getfield        #97  <Field int mFirstRequiredTileStart>
	//   28   48:iload_2         
	//   29   49:iload           5
	//   30   51:iconst_1        
	//   31   52:invokespecial   #198 <Method void requestTiles(int, int, int, boolean)>
			requestTiles(mTileSize + j, mLastRequiredTileStart, i1, false);
	//   32   55:aload_0         
	//   33   56:aload_0         
	//   34   57:getfield        #25  <Field AsyncListUtil this$0>
	//   35   60:getfield        #50  <Field int AsyncListUtil.mTileSize>
	//   36   63:iload_2         
	//   37   64:iadd            
	//   38   65:aload_0         
	//   39   66:getfield        #99  <Field int mLastRequiredTileStart>
	//   40   69:iload           5
	//   41   71:iconst_0        
	//   42   72:invokespecial   #198 <Method void requestTiles(int, int, int, boolean)>
			return;
	//   43   75:return          
		} else
		{
			requestTiles(i, mLastRequiredTileStart, i1, false);
	//   44   76:aload_0         
	//   45   77:iload_1         
	//   46   78:aload_0         
	//   47   79:getfield        #99  <Field int mLastRequiredTileStart>
	//   48   82:iload           5
	//   49   84:iconst_0        
	//   50   85:invokespecial   #198 <Method void requestTiles(int, int, int, boolean)>
			requestTiles(mFirstRequiredTileStart, i - mTileSize, i1, true);
	//   51   88:aload_0         
	//   52   89:aload_0         
	//   53   90:getfield        #97  <Field int mFirstRequiredTileStart>
	//   54   93:iload_1         
	//   55   94:aload_0         
	//   56   95:getfield        #25  <Field AsyncListUtil this$0>
	//   57   98:getfield        #50  <Field int AsyncListUtil.mTileSize>
	//   58  101:isub            
	//   59  102:iload           5
	//   60  104:iconst_1        
	//   61  105:invokespecial   #198 <Method void requestTiles(int, int, int, boolean)>
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
	//    2    2:putfield        #25  <Field AsyncListUtil this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #28  <Method void Object()>
	//    5    9:aload_0         
	//    6   10:new             #30  <Class SparseBooleanArray>
	//    7   13:dup             
	//    8   14:invokespecial   #31  <Method void SparseBooleanArray()>
	//    9   17:putfield        #33  <Field SparseBooleanArray mLoadedTiles>
	//   10   20:return          
	}
}
