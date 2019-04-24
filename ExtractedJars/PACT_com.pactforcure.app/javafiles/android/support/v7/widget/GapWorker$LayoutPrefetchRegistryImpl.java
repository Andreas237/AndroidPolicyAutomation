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
		int k;
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            14
			throw new IllegalArgumentException("Layout positions must be non-negative");
	//    2    4:new             #24  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #26  <String "Layout positions must be non-negative">
	//    5   10:invokespecial   #29  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(j < 0)
	//*   7   14:iload_2         
	//*   8   15:ifge            28
			throw new IllegalArgumentException("Pixel distance must be non-negative");
	//    9   18:new             #24  <Class IllegalArgumentException>
	//   10   21:dup             
	//   11   22:ldc1            #31  <String "Pixel distance must be non-negative">
	//   12   24:invokespecial   #29  <Method void IllegalArgumentException(String)>
	//   13   27:athrow          
		k = mCount * 2;
	//   14   28:aload_0         
	//   15   29:getfield        #33  <Field int mCount>
	//   16   32:iconst_2        
	//   17   33:imul            
	//   18   34:istore_3        
		if(mPrefetchArray != null) goto _L2; else goto _L1
	//   19   35:aload_0         
	//   20   36:getfield        #35  <Field int[] mPrefetchArray>
	//   21   39:ifnonnull       84
_L1:
		mPrefetchArray = new int[4];
	//   22   42:aload_0         
	//   23   43:iconst_4        
	//   24   44:newarray        int[]
	//   25   46:putfield        #35  <Field int[] mPrefetchArray>
		Arrays.fill(mPrefetchArray, -1);
	//   26   49:aload_0         
	//   27   50:getfield        #35  <Field int[] mPrefetchArray>
	//   28   53:iconst_m1       
	//   29   54:invokestatic    #41  <Method void Arrays.fill(int[], int)>
_L4:
		mPrefetchArray[k] = i;
	//   30   57:aload_0         
	//   31   58:getfield        #35  <Field int[] mPrefetchArray>
	//   32   61:iload_3         
	//   33   62:iload_1         
	//   34   63:iastore         
		mPrefetchArray[k + 1] = j;
	//   35   64:aload_0         
	//   36   65:getfield        #35  <Field int[] mPrefetchArray>
	//   37   68:iload_3         
	//   38   69:iconst_1        
	//   39   70:iadd            
	//   40   71:iload_2         
	//   41   72:iastore         
		mCount = mCount + 1;
	//   42   73:aload_0         
	//   43   74:aload_0         
	//   44   75:getfield        #33  <Field int mCount>
	//   45   78:iconst_1        
	//   46   79:iadd            
	//   47   80:putfield        #33  <Field int mCount>
		return;
	//   48   83:return          
_L2:
		if(k >= mPrefetchArray.length)
	//*  49   84:iload_3         
	//*  50   85:aload_0         
	//*  51   86:getfield        #35  <Field int[] mPrefetchArray>
	//*  52   89:arraylength     
	//*  53   90:icmplt          57
		{
			int ai[] = mPrefetchArray;
	//   54   93:aload_0         
	//   55   94:getfield        #35  <Field int[] mPrefetchArray>
	//   56   97:astore          4
			mPrefetchArray = new int[k * 2];
	//   57   99:aload_0         
	//   58  100:iload_3         
	//   59  101:iconst_2        
	//   60  102:imul            
	//   61  103:newarray        int[]
	//   62  105:putfield        #35  <Field int[] mPrefetchArray>
			System.arraycopy(((Object) (ai)), 0, ((Object) (mPrefetchArray)), 0, ai.length);
	//   63  108:aload           4
	//   64  110:iconst_0        
	//   65  111:aload_0         
	//   66  112:getfield        #35  <Field int[] mPrefetchArray>
	//   67  115:iconst_0        
	//   68  116:aload           4
	//   69  118:arraylength     
	//   70  119:invokestatic    #47  <Method void System.arraycopy(Object, int, Object, int, int)>
		}
		if(true) goto _L4; else goto _L3
	//   71  122:goto            57
_L3:
	}

	void clearPrefetchPositions()
	{
		if(mPrefetchArray != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field int[] mPrefetchArray>
	//*   2    4:ifnull          15
			Arrays.fill(mPrefetchArray, -1);
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field int[] mPrefetchArray>
	//    5   11:iconst_m1       
	//    6   12:invokestatic    #41  <Method void Arrays.fill(int[], int)>
		mCount = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #33  <Field int mCount>
	//   10   20:return          
	}

	void collectPrefetchPositionsFromView(RecyclerView recyclerview, boolean flag)
	{
		RecyclerView.LayoutManager layoutmanager;
		mCount = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #33  <Field int mCount>
		if(mPrefetchArray != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #35  <Field int[] mPrefetchArray>
	//*   5    9:ifnull          20
			Arrays.fill(mPrefetchArray, -1);
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field int[] mPrefetchArray>
	//    8   16:iconst_m1       
	//    9   17:invokestatic    #41  <Method void Arrays.fill(int[], int)>
		layoutmanager = recyclerview.mLayout;
	//   10   20:aload_1         
	//   11   21:getfield        #56  <Field RecyclerView$LayoutManager RecyclerView.mLayout>
	//   12   24:astore_3        
		if(recyclerview.mAdapter == null || layoutmanager == null || !layoutmanager.isItemPrefetchEnabled()) goto _L2; else goto _L1
	//   13   25:aload_1         
	//   14   26:getfield        #60  <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   15   29:ifnull          100
	//   16   32:aload_3         
	//   17   33:ifnull          100
	//   18   36:aload_3         
	//   19   37:invokevirtual   #66  <Method boolean RecyclerView$LayoutManager.isItemPrefetchEnabled()>
	//   20   40:ifeq            100
_L1:
		if(!flag) goto _L4; else goto _L3
	//   21   43:iload_2         
	//   22   44:ifeq            101
_L3:
		if(!recyclerview.mAdapterHelper.hasPendingUpdates())
	//*  23   47:aload_1         
	//*  24   48:getfield        #70  <Field AdapterHelper RecyclerView.mAdapterHelper>
	//*  25   51:invokevirtual   #75  <Method boolean AdapterHelper.hasPendingUpdates()>
	//*  26   54:ifne            69
			layoutmanager.collectInitialPrefetchPositions(recyclerview.mAdapter.getItemCount(), ((etchRegistry) (this)));
	//   27   57:aload_3         
	//   28   58:aload_1         
	//   29   59:getfield        #60  <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   30   62:invokevirtual   #81  <Method int RecyclerView$Adapter.getItemCount()>
	//   31   65:aload_0         
	//   32   66:invokevirtual   #85  <Method void RecyclerView$LayoutManager.collectInitialPrefetchPositions(int, RecyclerView$LayoutManager$LayoutPrefetchRegistry)>
_L6:
		if(mCount > layoutmanager.mPrefetchMaxCountObserved)
	//*  33   69:aload_0         
	//*  34   70:getfield        #33  <Field int mCount>
	//*  35   73:aload_3         
	//*  36   74:getfield        #88  <Field int RecyclerView$LayoutManager.mPrefetchMaxCountObserved>
	//*  37   77:icmple          100
		{
			layoutmanager.mPrefetchMaxCountObserved = mCount;
	//   38   80:aload_3         
	//   39   81:aload_0         
	//   40   82:getfield        #33  <Field int mCount>
	//   41   85:putfield        #88  <Field int RecyclerView$LayoutManager.mPrefetchMaxCountObserved>
			layoutmanager.mPrefetchMaxObservedInInitialPrefetch = flag;
	//   42   88:aload_3         
	//   43   89:iload_2         
	//   44   90:putfield        #92  <Field boolean RecyclerView$LayoutManager.mPrefetchMaxObservedInInitialPrefetch>
			recyclerview.mRecycler.updateViewCacheSize();
	//   45   93:aload_1         
	//   46   94:getfield        #96  <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//   47   97:invokevirtual   #101 <Method void RecyclerView$Recycler.updateViewCacheSize()>
		}
_L2:
		return;
	//   48  100:return          
_L4:
		if(!recyclerview.hasPendingAdapterUpdates())
	//*  49  101:aload_1         
	//*  50  102:invokevirtual   #104 <Method boolean RecyclerView.hasPendingAdapterUpdates()>
	//*  51  105:ifne            69
			layoutmanager.collectAdjacentPrefetchPositions(mPrefetchDx, mPrefetchDy, recyclerview.mState, ((etchRegistry) (this)));
	//   52  108:aload_3         
	//   53  109:aload_0         
	//   54  110:getfield        #106 <Field int mPrefetchDx>
	//   55  113:aload_0         
	//   56  114:getfield        #108 <Field int mPrefetchDy>
	//   57  117:aload_1         
	//   58  118:getfield        #112 <Field RecyclerView$State RecyclerView.mState>
	//   59  121:aload_0         
	//   60  122:invokevirtual   #116 <Method void RecyclerView$LayoutManager.collectAdjacentPrefetchPositions(int, int, RecyclerView$State, RecyclerView$LayoutManager$LayoutPrefetchRegistry)>
		if(true) goto _L6; else goto _L5
	//   61  125:goto            69
_L5:
	}

	boolean lastPrefetchIncludedPosition(int i)
	{
		if(mPrefetchArray != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field int[] mPrefetchArray>
	//*   2    4:ifnull          40
		{
			int k = mCount;
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field int mCount>
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
	//*  14   22:getfield        #35  <Field int[] mPrefetchArray>
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
	//    2    2:putfield        #106 <Field int mPrefetchDx>
		mPrefetchDy = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #108 <Field int mPrefetchDy>
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
