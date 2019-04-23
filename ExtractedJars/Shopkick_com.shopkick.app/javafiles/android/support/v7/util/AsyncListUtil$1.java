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
	//*  17   37:ifnull          93
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   18   40:new             #63  <Class StringBuilder>
	//   19   43:dup             
	//   20   44:invokespecial   #64  <Method void StringBuilder()>
	//   21   47:astore          7
			stringbuilder.append("duplicate tile @");
	//   22   49:aload           7
	//   23   51:ldc1            #66  <String "duplicate tile @">
	//   24   53:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   25   56:pop             
			stringbuilder.append(tile1.mStartPosition);
	//   26   57:aload           7
	//   27   59:aload           6
	//   28   61:getfield        #75  <Field int TileList$Tile.mStartPosition>
	//   29   64:invokevirtual   #78  <Method StringBuilder StringBuilder.append(int)>
	//   30   67:pop             
			Log.e("AsyncListUtil", stringbuilder.toString());
	//   31   68:ldc1            #80  <String "AsyncListUtil">
	//   32   70:aload           7
	//   33   72:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   34   75:invokestatic    #90  <Method int Log.e(String, String)>
	//   35   78:pop             
			mBackgroundProxy.recycleTile(tile1);
	//   36   79:aload_0         
	//   37   80:getfield        #15  <Field AsyncListUtil this$0>
	//   38   83:getfield        #40  <Field ThreadUtil$BackgroundCallback AsyncListUtil.mBackgroundProxy>
	//   39   86:aload           6
	//   40   88:invokeinterface #50  <Method void ThreadUtil$BackgroundCallback.recycleTile(TileList$Tile)>
		}
		int j = tile.mStartPosition;
	//   41   93:aload_2         
	//   42   94:getfield        #75  <Field int TileList$Tile.mStartPosition>
	//   43   97:istore_3        
		int k = tile.mItemCount;
	//   44   98:aload_2         
	//   45   99:getfield        #93  <Field int TileList$Tile.mItemCount>
	//   46  102:istore          4
		for(i = 0; i < mMissingPositions.size();)
	//*  47  104:iconst_0        
	//*  48  105:istore_1        
	//*  49  106:iload_1         
	//*  50  107:aload_0         
	//*  51  108:getfield        #15  <Field AsyncListUtil this$0>
	//*  52  111:getfield        #97  <Field SparseIntArray AsyncListUtil.mMissingPositions>
	//*  53  114:invokevirtual   #100 <Method int SparseIntArray.size()>
	//*  54  117:icmpge          184
		{
			int l = mMissingPositions.keyAt(i);
	//   55  120:aload_0         
	//   56  121:getfield        #15  <Field AsyncListUtil this$0>
	//   57  124:getfield        #97  <Field SparseIntArray AsyncListUtil.mMissingPositions>
	//   58  127:iload_1         
	//   59  128:invokevirtual   #104 <Method int SparseIntArray.keyAt(int)>
	//   60  131:istore          5
			if(tile.mStartPosition <= l && l < j + k)
	//*  61  133:aload_2         
	//*  62  134:getfield        #75  <Field int TileList$Tile.mStartPosition>
	//*  63  137:iload           5
	//*  64  139:icmpgt          177
	//*  65  142:iload           5
	//*  66  144:iload_3         
	//*  67  145:iload           4
	//*  68  147:iadd            
	//*  69  148:icmpge          177
			{
				mMissingPositions.removeAt(i);
	//   70  151:aload_0         
	//   71  152:getfield        #15  <Field AsyncListUtil this$0>
	//   72  155:getfield        #97  <Field SparseIntArray AsyncListUtil.mMissingPositions>
	//   73  158:iload_1         
	//   74  159:invokevirtual   #108 <Method void SparseIntArray.removeAt(int)>
				mViewCallback.onItemLoaded(l);
	//   75  162:aload_0         
	//   76  163:getfield        #15  <Field AsyncListUtil this$0>
	//   77  166:getfield        #112 <Field AsyncListUtil$ViewCallback AsyncListUtil.mViewCallback>
	//   78  169:iload           5
	//   79  171:invokevirtual   #117 <Method void AsyncListUtil$ViewCallback.onItemLoaded(int)>
			} else
	//*  80  174:goto            106
			{
				i++;
	//   81  177:iload_1         
	//   82  178:iconst_1        
	//   83  179:iadd            
	//   84  180:istore_1        
			}
		}

	//*  85  181:goto            106
	//   86  184:return          
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
		Object obj = ((Object) (mTileList.removeAtPos(j)));
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field AsyncListUtil this$0>
	//    7   13:getfield        #30  <Field TileList AsyncListUtil.mTileList>
	//    8   16:iload_2         
	//    9   17:invokevirtual   #124 <Method TileList$Tile TileList.removeAtPos(int)>
	//   10   20:astore_3        
		if(obj == null)
	//*  11   21:aload_3         
	//*  12   22:ifnonnull       57
		{
			obj = ((Object) (new StringBuilder()));
	//   13   25:new             #63  <Class StringBuilder>
	//   14   28:dup             
	//   15   29:invokespecial   #64  <Method void StringBuilder()>
	//   16   32:astore_3        
			((StringBuilder) (obj)).append("tile not found @");
	//   17   33:aload_3         
	//   18   34:ldc1            #126 <String "tile not found @">
	//   19   36:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			((StringBuilder) (obj)).append(j);
	//   21   40:aload_3         
	//   22   41:iload_2         
	//   23   42:invokevirtual   #78  <Method StringBuilder StringBuilder.append(int)>
	//   24   45:pop             
			Log.e("AsyncListUtil", ((StringBuilder) (obj)).toString());
	//   25   46:ldc1            #80  <String "AsyncListUtil">
	//   26   48:aload_3         
	//   27   49:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   28   52:invokestatic    #90  <Method int Log.e(String, String)>
	//   29   55:pop             
			return;
	//   30   56:return          
		} else
		{
			mBackgroundProxy.recycleTile(((TileList.Tile) (obj)));
	//   31   57:aload_0         
	//   32   58:getfield        #15  <Field AsyncListUtil this$0>
	//   33   61:getfield        #40  <Field ThreadUtil$BackgroundCallback AsyncListUtil.mBackgroundProxy>
	//   34   64:aload_3         
	//   35   65:invokeinterface #50  <Method void ThreadUtil$BackgroundCallback.recycleTile(TileList$Tile)>
			return;
	//   36   70:return          
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
			AsyncListUtil asynclistutil = AsyncListUtil.this;
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field AsyncListUtil this$0>
	//    7   13:astore_3        
			asynclistutil.mItemCount = j;
	//    8   14:aload_3         
	//    9   15:iload_2         
	//   10   16:putfield        #128 <Field int AsyncListUtil.mItemCount>
			asynclistutil.mViewCallback.onDataRefresh();
	//   11   19:aload_3         
	//   12   20:getfield        #112 <Field AsyncListUtil$ViewCallback AsyncListUtil.mViewCallback>
	//   13   23:invokevirtual   #131 <Method void AsyncListUtil$ViewCallback.onDataRefresh()>
			asynclistutil = AsyncListUtil.this;
	//   14   26:aload_0         
	//   15   27:getfield        #15  <Field AsyncListUtil this$0>
	//   16   30:astore_3        
			asynclistutil.mDisplayedGeneration = asynclistutil.mRequestedGeneration;
	//   17   31:aload_3         
	//   18   32:aload_3         
	//   19   33:getfield        #25  <Field int AsyncListUtil.mRequestedGeneration>
	//   20   36:putfield        #134 <Field int AsyncListUtil.mDisplayedGeneration>
			recycleAllTiles();
	//   21   39:aload_0         
	//   22   40:invokespecial   #136 <Method void recycleAllTiles()>
			asynclistutil = AsyncListUtil.this;
	//   23   43:aload_0         
	//   24   44:getfield        #15  <Field AsyncListUtil this$0>
	//   25   47:astore_3        
			asynclistutil.mAllowScrollHints = false;
	//   26   48:aload_3         
	//   27   49:iconst_0        
	//   28   50:putfield        #140 <Field boolean AsyncListUtil.mAllowScrollHints>
			asynclistutil.updateRange();
	//   29   53:aload_3         
	//   30   54:invokevirtual   #143 <Method void AsyncListUtil.updateRange()>
			return;
	//   31   57:return          
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
