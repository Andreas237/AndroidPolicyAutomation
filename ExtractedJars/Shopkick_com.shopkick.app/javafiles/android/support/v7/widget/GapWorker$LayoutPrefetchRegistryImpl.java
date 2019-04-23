// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import java.util.Arrays;

// Referenced classes of package android.support.v7.widget:
//			GapWorker, RecyclerView, AdapterHelper

static class GapWorker$LayoutPrefetchRegistryImpl
	implements etchRegistry
{

	public void addPosition(int i, int j)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            113
		{
			if(j >= 0)
	//*   2    4:iload_2         
	//*   3    5:iflt            103
			{
				int k = mCount * 2;
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field int mCount>
	//    6   12:iconst_2        
	//    7   13:imul            
	//    8   14:istore_3        
				int ai[] = mPrefetchArray;
	//    9   15:aload_0         
	//   10   16:getfield        #26  <Field int[] mPrefetchArray>
	//   11   19:astore          4
				if(ai == null)
	//*  12   21:aload           4
	//*  13   23:ifnonnull       44
				{
					mPrefetchArray = new int[4];
	//   14   26:aload_0         
	//   15   27:iconst_4        
	//   16   28:newarray        int[]
	//   17   30:putfield        #26  <Field int[] mPrefetchArray>
					Arrays.fill(mPrefetchArray, -1);
	//   18   33:aload_0         
	//   19   34:getfield        #26  <Field int[] mPrefetchArray>
	//   20   37:iconst_m1       
	//   21   38:invokestatic    #32  <Method void Arrays.fill(int[], int)>
				} else
	//*  22   41:goto            74
				if(k >= ai.length)
	//*  23   44:iload_3         
	//*  24   45:aload           4
	//*  25   47:arraylength     
	//*  26   48:icmplt          74
				{
					mPrefetchArray = new int[k * 2];
	//   27   51:aload_0         
	//   28   52:iload_3         
	//   29   53:iconst_2        
	//   30   54:imul            
	//   31   55:newarray        int[]
	//   32   57:putfield        #26  <Field int[] mPrefetchArray>
					System.arraycopy(((Object) (ai)), 0, ((Object) (mPrefetchArray)), 0, ai.length);
	//   33   60:aload           4
	//   34   62:iconst_0        
	//   35   63:aload_0         
	//   36   64:getfield        #26  <Field int[] mPrefetchArray>
	//   37   67:iconst_0        
	//   38   68:aload           4
	//   39   70:arraylength     
	//   40   71:invokestatic    #38  <Method void System.arraycopy(Object, int, Object, int, int)>
				}
				ai = mPrefetchArray;
	//   41   74:aload_0         
	//   42   75:getfield        #26  <Field int[] mPrefetchArray>
	//   43   78:astore          4
				ai[k] = i;
	//   44   80:aload           4
	//   45   82:iload_3         
	//   46   83:iload_1         
	//   47   84:iastore         
				ai[k + 1] = j;
	//   48   85:aload           4
	//   49   87:iload_3         
	//   50   88:iconst_1        
	//   51   89:iadd            
	//   52   90:iload_2         
	//   53   91:iastore         
				mCount = mCount + 1;
	//   54   92:aload_0         
	//   55   93:aload_0         
	//   56   94:getfield        #24  <Field int mCount>
	//   57   97:iconst_1        
	//   58   98:iadd            
	//   59   99:putfield        #24  <Field int mCount>
				return;
	//   60  102:return          
			} else
			{
				throw new IllegalArgumentException("Pixel distance must be non-negative");
	//   61  103:new             #40  <Class IllegalArgumentException>
	//   62  106:dup             
	//   63  107:ldc1            #42  <String "Pixel distance must be non-negative">
	//   64  109:invokespecial   #45  <Method void IllegalArgumentException(String)>
	//   65  112:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("Layout positions must be non-negative");
	//   66  113:new             #40  <Class IllegalArgumentException>
	//   67  116:dup             
	//   68  117:ldc1            #47  <String "Layout positions must be non-negative">
	//   69  119:invokespecial   #45  <Method void IllegalArgumentException(String)>
	//   70  122:athrow          
		}
	}

	void clearPrefetchPositions()
	{
		int ai[] = mPrefetchArray;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int[] mPrefetchArray>
	//    2    4:astore_1        
		if(ai != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			Arrays.fill(ai, -1);
	//    5    9:aload_1         
	//    6   10:iconst_m1       
	//    7   11:invokestatic    #32  <Method void Arrays.fill(int[], int)>
		mCount = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #24  <Field int mCount>
	//   11   19:return          
	}

	void collectPrefetchPositionsFromView(RecyclerView recyclerview, boolean flag)
	{
		mCount = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #24  <Field int mCount>
		int ai[] = mPrefetchArray;
	//    3    5:aload_0         
	//    4    6:getfield        #26  <Field int[] mPrefetchArray>
	//    5    9:astore_3        
		if(ai != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          19
			Arrays.fill(ai, -1);
	//    8   14:aload_3         
	//    9   15:iconst_m1       
	//   10   16:invokestatic    #32  <Method void Arrays.fill(int[], int)>
		RecyclerView.LayoutManager layoutmanager = recyclerview.mLayout;
	//   11   19:aload_1         
	//   12   20:getfield        #56  <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   13   23:astore_3        
		if(recyclerview.mAdapter != null && layoutmanager != null && layoutmanager.isItemPrefetchEnabled())
	//*  14   24:aload_1         
	//*  15   25:getfield        #60  <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//*  16   28:ifnull          126
	//*  17   31:aload_3         
	//*  18   32:ifnull          126
	//*  19   35:aload_3         
	//*  20   36:invokevirtual   #66  <Method boolean RecyclerView$LayoutManager.isItemPrefetchEnabled()>
	//*  21   39:ifeq            126
		{
			if(flag)
	//*  22   42:iload_2         
	//*  23   43:ifeq            71
			{
				if(!recyclerview.mAdapterHelper.hasPendingUpdates())
	//*  24   46:aload_1         
	//*  25   47:getfield        #70  <Field AdapterHelper RecyclerView.mAdapterHelper>
	//*  26   50:invokevirtual   #75  <Method boolean AdapterHelper.hasPendingUpdates()>
	//*  27   53:ifne            95
					layoutmanager.collectInitialPrefetchPositions(recyclerview.mAdapter.getItemCount(), ((etchRegistry) (this)));
	//   28   56:aload_3         
	//   29   57:aload_1         
	//   30   58:getfield        #60  <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   31   61:invokevirtual   #81  <Method int RecyclerView$Adapter.getItemCount()>
	//   32   64:aload_0         
	//   33   65:invokevirtual   #85  <Method void RecyclerView$LayoutManager.collectInitialPrefetchPositions(int, RecyclerView$LayoutManager$LayoutPrefetchRegistry)>
			} else
	//*  34   68:goto            95
			if(!recyclerview.hasPendingAdapterUpdates())
	//*  35   71:aload_1         
	//*  36   72:invokevirtual   #88  <Method boolean RecyclerView.hasPendingAdapterUpdates()>
	//*  37   75:ifne            95
				layoutmanager.collectAdjacentPrefetchPositions(mPrefetchDx, mPrefetchDy, recyclerview.mState, ((etchRegistry) (this)));
	//   38   78:aload_3         
	//   39   79:aload_0         
	//   40   80:getfield        #90  <Field int mPrefetchDx>
	//   41   83:aload_0         
	//   42   84:getfield        #92  <Field int mPrefetchDy>
	//   43   87:aload_1         
	//   44   88:getfield        #96  <Field RecyclerView$State RecyclerView.mState>
	//   45   91:aload_0         
	//   46   92:invokevirtual   #100 <Method void RecyclerView$LayoutManager.collectAdjacentPrefetchPositions(int, int, RecyclerView$State, RecyclerView$LayoutManager$LayoutPrefetchRegistry)>
			if(mCount > layoutmanager.mPrefetchMaxCountObserved)
	//*  47   95:aload_0         
	//*  48   96:getfield        #24  <Field int mCount>
	//*  49   99:aload_3         
	//*  50  100:getfield        #103 <Field int RecyclerView$LayoutManager.mPrefetchMaxCountObserved>
	//*  51  103:icmple          126
			{
				layoutmanager.mPrefetchMaxCountObserved = mCount;
	//   52  106:aload_3         
	//   53  107:aload_0         
	//   54  108:getfield        #24  <Field int mCount>
	//   55  111:putfield        #103 <Field int RecyclerView$LayoutManager.mPrefetchMaxCountObserved>
				layoutmanager.mPrefetchMaxObservedInInitialPrefetch = flag;
	//   56  114:aload_3         
	//   57  115:iload_2         
	//   58  116:putfield        #107 <Field boolean RecyclerView$LayoutManager.mPrefetchMaxObservedInInitialPrefetch>
				recyclerview.mRecycler.updateViewCacheSize();
	//   59  119:aload_1         
	//   60  120:getfield        #111 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//   61  123:invokevirtual   #116 <Method void RecyclerView$Recycler.updateViewCacheSize()>
			}
		}
	//   62  126:return          
	}

	boolean lastPrefetchIncludedPosition(int i)
	{
		if(mPrefetchArray != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field int[] mPrefetchArray>
	//*   2    4:ifnull          40
		{
			int k = mCount;
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field int mCount>
	//    5   11:istore_3        
			for(int j = 0; j < k * 2; j += 2)
	//*   6   12:iconst_0        
	//*   7   13:istore_2        
	//*   8   14:iload_2         
	//*   9   15:iload_3         
	//*  10   16:iconst_2        
	//*  11   17:imul            
	//*  12   18:icmpge          40
				if(mPrefetchArray[j] == i)
	//*  13   21:aload_0         
	//*  14   22:getfield        #26  <Field int[] mPrefetchArray>
	//*  15   25:iload_2         
	//*  16   26:iaload          
	//*  17   27:iload_1         
	//*  18   28:icmpne          33
					return true;
	//   19   31:iconst_1        
	//   20   32:ireturn         

	//   21   33:iload_2         
	//   22   34:iconst_2        
	//   23   35:iadd            
	//   24   36:istore_2        
		}
	//*  25   37:goto            14
		return false;
	//   26   40:iconst_0        
	//   27   41:ireturn         
	}

	void setPrefetchVector(int i, int j)
	{
		mPrefetchDx = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #90  <Field int mPrefetchDx>
		mPrefetchDy = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #92  <Field int mPrefetchDy>
	//    6   10:return          
	}

	int mCount;
	int mPrefetchArray[];
	int mPrefetchDx;
	int mPrefetchDy;

	GapWorker$LayoutPrefetchRegistryImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}
}
