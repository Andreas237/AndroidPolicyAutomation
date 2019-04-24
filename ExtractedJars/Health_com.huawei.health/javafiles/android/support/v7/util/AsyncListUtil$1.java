// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;

import android.util.Log;
import android.util.SparseIntArray;

// Referenced classes of package android.support.v7.util:
//			AsyncListUtil, TileList

class AsyncListUtil$1
	implements hreadCallback
{

	private boolean isRequestedGeneration(int i)
	{
		return i == mRequestedGeneration;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #15  <Field AsyncListUtil this$0>
	//    3    5:getfield        #25  <Field int AsyncListUtil.mRequestedGeneration>
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private void recycleAllTiles()
	{
		for(int i = 0; i < mTileList.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #15  <Field AsyncListUtil this$0>
	//*   5    7:getfield        #30  <Field TileList AsyncListUtil.mTileList>
	//*   6   10:invokevirtual   #36  <Method int TileList.size()>
	//*   7   13:icmpge          46
			mBackgroundProxy.recycleTile(mTileList.getAtIndex(i));
	//    8   16:aload_0         
	//    9   17:getfield        #15  <Field AsyncListUtil this$0>
	//   10   20:getfield        #40  <Field ThreadUtil$BackgroundCallback AsyncListUtil.mBackgroundProxy>
	//   11   23:aload_0         
	//   12   24:getfield        #15  <Field AsyncListUtil this$0>
	//   13   27:getfield        #30  <Field TileList AsyncListUtil.mTileList>
	//   14   30:iload_1         
	//   15   31:invokevirtual   #44  <Method TileList$Tile TileList.getAtIndex(int)>
	//   16   34:invokeinterface #50  <Method void ThreadUtil$BackgroundCallback.recycleTile(TileList$Tile)>

	//   17   39:iload_1         
	//   18   40:iconst_1        
	//   19   41:iadd            
	//   20   42:istore_1        
	//*  21   43:goto            2
		mTileList.clear();
	//   22   46:aload_0         
	//   23   47:getfield        #15  <Field AsyncListUtil this$0>
	//   24   50:getfield        #30  <Field TileList AsyncListUtil.mTileList>
	//   25   53:invokevirtual   #53  <Method void TileList.clear()>
	//   26   56:return          
	}

	public void addTile(int i, TileList.Tile tile)
	{
		if(!isRequestedGeneration(i))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokespecial   #57  <Method boolean isRequestedGeneration(int)>
	//*   3    5:ifne            22
		{
			mBackgroundProxy.recycleTile(tile);
	//    4    8:aload_0         
	//    5    9:getfield        #15  <Field AsyncListUtil this$0>
	//    6   12:getfield        #40  <Field ThreadUtil$BackgroundCallback AsyncListUtil.mBackgroundProxy>
	//    7   15:aload_2         
	//    8   16:invokeinterface #50  <Method void ThreadUtil$BackgroundCallback.recycleTile(TileList$Tile)>
			return;
	//    9   21:return          
		}
		TileList.Tile tile1 = mTileList.addOrReplace(tile);
	//   10   22:aload_0         
	//   11   23:getfield        #15  <Field AsyncListUtil this$0>
	//   12   26:getfield        #30  <Field TileList AsyncListUtil.mTileList>
	//   13   29:aload_2         
	//   14   30:invokevirtual   #61  <Method TileList$Tile TileList.addOrReplace(TileList$Tile)>
	//   15   33:astore          6
		if(tile1 != null)
	//*  16   35:aload           6
	//*  17   37:ifnull          83
		{
			Log.e("AsyncListUtil", (new StringBuilder()).append("duplicate tile @").append(tile1.mStartPosition).toString());
	//   18   40:ldc1            #63  <String "AsyncListUtil">
	//   19   42:new             #65  <Class StringBuilder>
	//   20   45:dup             
	//   21   46:invokespecial   #66  <Method void StringBuilder()>
	//   22   49:ldc1            #68  <String "duplicate tile @">
	//   23   51:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   24   54:aload           6
	//   25   56:getfield        #77  <Field int TileList$Tile.mStartPosition>
	//   26   59:invokevirtual   #80  <Method StringBuilder StringBuilder.append(int)>
	//   27   62:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   28   65:invokestatic    #90  <Method int Log.e(String, String)>
	//   29   68:pop             
			mBackgroundProxy.recycleTile(tile1);
	//   30   69:aload_0         
	//   31   70:getfield        #15  <Field AsyncListUtil this$0>
	//   32   73:getfield        #40  <Field ThreadUtil$BackgroundCallback AsyncListUtil.mBackgroundProxy>
	//   33   76:aload           6
	//   34   78:invokeinterface #50  <Method void ThreadUtil$BackgroundCallback.recycleTile(TileList$Tile)>
		}
		int j = tile.mStartPosition;
	//   35   83:aload_2         
	//   36   84:getfield        #77  <Field int TileList$Tile.mStartPosition>
	//   37   87:istore_3        
		int k = tile.mItemCount;
	//   38   88:aload_2         
	//   39   89:getfield        #93  <Field int TileList$Tile.mItemCount>
	//   40   92:istore          4
		for(i = 0; i < mMissingPositions.size();)
	//*  41   94:iconst_0        
	//*  42   95:istore_1        
	//*  43   96:iload_1         
	//*  44   97:aload_0         
	//*  45   98:getfield        #15  <Field AsyncListUtil this$0>
	//*  46  101:getfield        #97  <Field SparseIntArray AsyncListUtil.mMissingPositions>
	//*  47  104:invokevirtual   #100 <Method int SparseIntArray.size()>
	//*  48  107:icmpge          174
		{
			int l = mMissingPositions.keyAt(i);
	//   49  110:aload_0         
	//   50  111:getfield        #15  <Field AsyncListUtil this$0>
	//   51  114:getfield        #97  <Field SparseIntArray AsyncListUtil.mMissingPositions>
	//   52  117:iload_1         
	//   53  118:invokevirtual   #104 <Method int SparseIntArray.keyAt(int)>
	//   54  121:istore          5
			if(tile.mStartPosition <= l && l < j + k)
	//*  55  123:aload_2         
	//*  56  124:getfield        #77  <Field int TileList$Tile.mStartPosition>
	//*  57  127:iload           5
	//*  58  129:icmpgt          167
	//*  59  132:iload           5
	//*  60  134:iload_3         
	//*  61  135:iload           4
	//*  62  137:iadd            
	//*  63  138:icmpge          167
			{
				mMissingPositions.removeAt(i);
	//   64  141:aload_0         
	//   65  142:getfield        #15  <Field AsyncListUtil this$0>
	//   66  145:getfield        #97  <Field SparseIntArray AsyncListUtil.mMissingPositions>
	//   67  148:iload_1         
	//   68  149:invokevirtual   #108 <Method void SparseIntArray.removeAt(int)>
				mViewCallback.onItemLoaded(l);
	//   69  152:aload_0         
	//   70  153:getfield        #15  <Field AsyncListUtil this$0>
	//   71  156:getfield        #112 <Field AsyncListUtil$ViewCallback AsyncListUtil.mViewCallback>
	//   72  159:iload           5
	//   73  161:invokevirtual   #117 <Method void AsyncListUtil$ViewCallback.onItemLoaded(int)>
			} else
	//*  74  164:goto            171
			{
				i++;
	//   75  167:iload_1         
	//   76  168:iconst_1        
	//   77  169:iadd            
	//   78  170:istore_1        
			}
		}

	//*  79  171:goto            96
	//   80  174:return          
	}

	public void removeTile(int i, int j)
	{
		if(!isRequestedGeneration(i))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokespecial   #57  <Method boolean isRequestedGeneration(int)>
	//*   3    5:ifne            9
			return;
	//    4    8:return          
		TileList.Tile tile = mTileList.removeAtPos(j);
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field AsyncListUtil this$0>
	//    7   13:getfield        #30  <Field TileList AsyncListUtil.mTileList>
	//    8   16:iload_2         
	//    9   17:invokevirtual   #124 <Method TileList$Tile TileList.removeAtPos(int)>
	//   10   20:astore_3        
		if(tile == null)
	//*  11   21:aload_3         
	//*  12   22:ifnonnull       51
		{
			Log.e("AsyncListUtil", (new StringBuilder()).append("tile not found @").append(j).toString());
	//   13   25:ldc1            #63  <String "AsyncListUtil">
	//   14   27:new             #65  <Class StringBuilder>
	//   15   30:dup             
	//   16   31:invokespecial   #66  <Method void StringBuilder()>
	//   17   34:ldc1            #126 <String "tile not found @">
	//   18   36:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:iload_2         
	//   20   40:invokevirtual   #80  <Method StringBuilder StringBuilder.append(int)>
	//   21   43:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   22   46:invokestatic    #90  <Method int Log.e(String, String)>
	//   23   49:pop             
			return;
	//   24   50:return          
		} else
		{
			mBackgroundProxy.recycleTile(tile);
	//   25   51:aload_0         
	//   26   52:getfield        #15  <Field AsyncListUtil this$0>
	//   27   55:getfield        #40  <Field ThreadUtil$BackgroundCallback AsyncListUtil.mBackgroundProxy>
	//   28   58:aload_3         
	//   29   59:invokeinterface #50  <Method void ThreadUtil$BackgroundCallback.recycleTile(TileList$Tile)>
			return;
	//   30   64:return          
		}
	}

	public void updateItemCount(int i, int j)
	{
		if(!isRequestedGeneration(i))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokespecial   #57  <Method boolean isRequestedGeneration(int)>
	//*   3    5:ifne            9
		{
			return;
	//    4    8:return          
		} else
		{
			mItemCount = j;
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field AsyncListUtil this$0>
	//    7   13:iload_2         
	//    8   14:putfield        #128 <Field int AsyncListUtil.mItemCount>
			mViewCallback.onDataRefresh();
	//    9   17:aload_0         
	//   10   18:getfield        #15  <Field AsyncListUtil this$0>
	//   11   21:getfield        #112 <Field AsyncListUtil$ViewCallback AsyncListUtil.mViewCallback>
	//   12   24:invokevirtual   #131 <Method void AsyncListUtil$ViewCallback.onDataRefresh()>
			mDisplayedGeneration = mRequestedGeneration;
	//   13   27:aload_0         
	//   14   28:getfield        #15  <Field AsyncListUtil this$0>
	//   15   31:aload_0         
	//   16   32:getfield        #15  <Field AsyncListUtil this$0>
	//   17   35:getfield        #25  <Field int AsyncListUtil.mRequestedGeneration>
	//   18   38:putfield        #134 <Field int AsyncListUtil.mDisplayedGeneration>
			recycleAllTiles();
	//   19   41:aload_0         
	//   20   42:invokespecial   #136 <Method void recycleAllTiles()>
			mAllowScrollHints = false;
	//   21   45:aload_0         
	//   22   46:getfield        #15  <Field AsyncListUtil this$0>
	//   23   49:iconst_0        
	//   24   50:putfield        #140 <Field boolean AsyncListUtil.mAllowScrollHints>
			updateRange();
	//   25   53:aload_0         
	//   26   54:getfield        #15  <Field AsyncListUtil this$0>
	//   27   57:invokevirtual   #143 <Method void AsyncListUtil.updateRange()>
			return;
	//   28   60:return          
		}
	}

	final AsyncListUtil this$0;

	AsyncListUtil$1()
	{
		this$0 = AsyncListUtil.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AsyncListUtil this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
