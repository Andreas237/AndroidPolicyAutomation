// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.os.TraceCompat;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView, ChildHelper, AdapterHelper

final class GapWorker
	implements Runnable
{
	static class LayoutPrefetchRegistryImpl
		implements RecyclerView.LayoutManager.LayoutPrefetchRegistry
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
				layoutmanager.collectInitialPrefetchPositions(recyclerview.mAdapter.getItemCount(), ((RecyclerView.LayoutManager.LayoutPrefetchRegistry) (this)));
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
				layoutmanager.collectAdjacentPrefetchPositions(mPrefetchDx, mPrefetchDy, recyclerview.mState, ((RecyclerView.LayoutManager.LayoutPrefetchRegistry) (this)));
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
			boolean flag;
			boolean flag1;
			flag1 = false;
		//    0    0:iconst_0        
		//    1    1:istore          5
			flag = flag1;
		//    2    3:iload           5
		//    3    5:istore          4
			if(mPrefetchArray == null) goto _L2; else goto _L1
		//    4    7:aload_0         
		//    5    8:getfield        #35  <Field int[] mPrefetchArray>
		//    6   11:ifnull          45
_L1:
			int j;
			int k;
			k = mCount;
		//    7   14:aload_0         
		//    8   15:getfield        #33  <Field int mCount>
		//    9   18:istore_3        
			j = 0;
		//   10   19:iconst_0        
		//   11   20:istore_2        
_L7:
			flag = flag1;
		//   12   21:iload           5
		//   13   23:istore          4
			if(j >= k * 2) goto _L2; else goto _L3
		//   14   25:iload_2         
		//   15   26:iload_3         
		//   16   27:iconst_2        
		//   17   28:imul            
		//   18   29:icmpge          45
_L3:
			if(mPrefetchArray[j] != i) goto _L5; else goto _L4
		//   19   32:aload_0         
		//   20   33:getfield        #35  <Field int[] mPrefetchArray>
		//   21   36:iload_2         
		//   22   37:iaload          
		//   23   38:iload_1         
		//   24   39:icmpne          48
_L4:
			flag = true;
		//   25   42:iconst_1        
		//   26   43:istore          4
_L2:
			return flag;
		//   27   45:iload           4
		//   28   47:ireturn         
_L5:
			j += 2;
		//   29   48:iload_2         
		//   30   49:iconst_2        
		//   31   50:iadd            
		//   32   51:istore_2        
			if(true) goto _L7; else goto _L6
		//   33   52:goto            21
_L6:
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

		LayoutPrefetchRegistryImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}

	static class Task
	{

		public void clear()
		{
			immediate = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #23  <Field boolean immediate>
			viewVelocity = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #25  <Field int viewVelocity>
			distanceToItem = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #27  <Field int distanceToItem>
			view = null;
		//    9   15:aload_0         
		//   10   16:aconst_null     
		//   11   17:putfield        #29  <Field RecyclerView view>
			position = 0;
		//   12   20:aload_0         
		//   13   21:iconst_0        
		//   14   22:putfield        #31  <Field int position>
		//   15   25:return          
		}

		public int distanceToItem;
		public boolean immediate;
		public int position;
		public RecyclerView view;
		public int viewVelocity;

		Task()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
		//    2    4:return          
		}
	}


	GapWorker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		mRecyclerViews = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #44  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #45  <Method void ArrayList()>
	//    6   12:putfield        #47  <Field ArrayList mRecyclerViews>
		mTasks = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #44  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #45  <Method void ArrayList()>
	//   11   23:putfield        #49  <Field ArrayList mTasks>
	//   12   26:return          
	}

	private void buildTaskList()
	{
		int l = mRecyclerViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ArrayList mRecyclerViews>
	//    2    4:invokevirtual   #54  <Method int ArrayList.size()>
	//    3    7:istore          4
		int j = 0;
	//    4    9:iconst_0        
	//    5   10:istore_2        
		int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_1        
		for(; j < l; j++)
	//*   8   13:iload_2         
	//*   9   14:iload           4
	//*  10   16:icmpge          69
		{
			RecyclerView recyclerview = (RecyclerView)mRecyclerViews.get(j);
	//   11   19:aload_0         
	//   12   20:getfield        #47  <Field ArrayList mRecyclerViews>
	//   13   23:iload_2         
	//   14   24:invokevirtual   #58  <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #60  <Class RecyclerView>
	//   16   30:astore          8
			if(recyclerview.getWindowVisibility() == 0)
	//*  17   32:aload           8
	//*  18   34:invokevirtual   #63  <Method int RecyclerView.getWindowVisibility()>
	//*  19   37:ifne            292
			{
				recyclerview.mPrefetchRegistry.collectPrefetchPositionsFromView(recyclerview, false);
	//   20   40:aload           8
	//   21   42:getfield        #67  <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   22   45:aload           8
	//   23   47:iconst_0        
	//   24   48:invokevirtual   #71  <Method void GapWorker$LayoutPrefetchRegistryImpl.collectPrefetchPositionsFromView(RecyclerView, boolean)>
				i = recyclerview.mPrefetchRegistry.mCount + i;
	//   25   51:aload           8
	//   26   53:getfield        #67  <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   27   56:getfield        #75  <Field int GapWorker$LayoutPrefetchRegistryImpl.mCount>
	//   28   59:iload_1         
	//   29   60:iadd            
	//   30   61:istore_1        
			}
		}

	//   31   62:iload_2         
	//   32   63:iconst_1        
	//   33   64:iadd            
	//   34   65:istore_2        
	//*  35   66:goto            13
		mTasks.ensureCapacity(i);
	//   36   69:aload_0         
	//   37   70:getfield        #49  <Field ArrayList mTasks>
	//   38   73:iload_1         
	//   39   74:invokevirtual   #79  <Method void ArrayList.ensureCapacity(int)>
		j = 0;
	//   40   77:iconst_0        
	//   41   78:istore_2        
		i = 0;
	//   42   79:iconst_0        
	//   43   80:istore_1        
		while(j < l) 
	//*  44   81:iload_2         
	//*  45   82:iload           4
	//*  46   84:icmpge          278
		{
			RecyclerView recyclerview1 = (RecyclerView)mRecyclerViews.get(j);
	//   47   87:aload_0         
	//   48   88:getfield        #47  <Field ArrayList mRecyclerViews>
	//   49   91:iload_2         
	//   50   92:invokevirtual   #58  <Method Object ArrayList.get(int)>
	//   51   95:checkcast       #60  <Class RecyclerView>
	//   52   98:astore          9
			if(recyclerview1.getWindowVisibility() == 0)
	//*  53  100:aload           9
	//*  54  102:invokevirtual   #63  <Method int RecyclerView.getWindowVisibility()>
	//*  55  105:ifeq            115
	//*  56  108:iload_2         
	//*  57  109:iconst_1        
	//*  58  110:iadd            
	//*  59  111:istore_2        
	//*  60  112:goto            81
			{
				LayoutPrefetchRegistryImpl layoutprefetchregistryimpl = recyclerview1.mPrefetchRegistry;
	//   61  115:aload           9
	//   62  117:getfield        #67  <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   63  120:astore          10
				int i1 = Math.abs(layoutprefetchregistryimpl.mPrefetchDx) + Math.abs(layoutprefetchregistryimpl.mPrefetchDy);
	//   64  122:aload           10
	//   65  124:getfield        #82  <Field int GapWorker$LayoutPrefetchRegistryImpl.mPrefetchDx>
	//   66  127:invokestatic    #88  <Method int Math.abs(int)>
	//   67  130:aload           10
	//   68  132:getfield        #91  <Field int GapWorker$LayoutPrefetchRegistryImpl.mPrefetchDy>
	//   69  135:invokestatic    #88  <Method int Math.abs(int)>
	//   70  138:iadd            
	//   71  139:istore          5
				int k = 0;
	//   72  141:iconst_0        
	//   73  142:istore_3        
				while(k < layoutprefetchregistryimpl.mCount * 2) 
	//*  74  143:iload_3         
	//*  75  144:aload           10
	//*  76  146:getfield        #75  <Field int GapWorker$LayoutPrefetchRegistryImpl.mCount>
	//*  77  149:iconst_2        
	//*  78  150:imul            
	//*  79  151:icmpge          289
				{
					int j1;
					boolean flag;
					Task task;
					if(i >= mTasks.size())
	//*  80  154:iload_1         
	//*  81  155:aload_0         
	//*  82  156:getfield        #49  <Field ArrayList mTasks>
	//*  83  159:invokevirtual   #54  <Method int ArrayList.size()>
	//*  84  162:icmplt          256
					{
						task = new Task();
	//   85  165:new             #13  <Class GapWorker$Task>
	//   86  168:dup             
	//   87  169:invokespecial   #92  <Method void GapWorker$Task()>
	//   88  172:astore          8
						mTasks.add(((Object) (task)));
	//   89  174:aload_0         
	//   90  175:getfield        #49  <Field ArrayList mTasks>
	//   91  178:aload           8
	//   92  180:invokevirtual   #96  <Method boolean ArrayList.add(Object)>
	//   93  183:pop             
					} else
	//*  94  184:aload           10
	//*  95  186:getfield        #100 <Field int[] GapWorker$LayoutPrefetchRegistryImpl.mPrefetchArray>
	//*  96  189:iload_3         
	//*  97  190:iconst_1        
	//*  98  191:iadd            
	//*  99  192:iaload          
	//* 100  193:istore          6
	//* 101  195:iload           6
	//* 102  197:iload           5
	//* 103  199:icmpgt          272
	//* 104  202:iconst_1        
	//* 105  203:istore          7
	//* 106  205:aload           8
	//* 107  207:iload           7
	//* 108  209:putfield        #104 <Field boolean GapWorker$Task.immediate>
	//* 109  212:aload           8
	//* 110  214:iload           5
	//* 111  216:putfield        #107 <Field int GapWorker$Task.viewVelocity>
	//* 112  219:aload           8
	//* 113  221:iload           6
	//* 114  223:putfield        #110 <Field int GapWorker$Task.distanceToItem>
	//* 115  226:aload           8
	//* 116  228:aload           9
	//* 117  230:putfield        #114 <Field RecyclerView GapWorker$Task.view>
	//* 118  233:aload           8
	//* 119  235:aload           10
	//* 120  237:getfield        #100 <Field int[] GapWorker$LayoutPrefetchRegistryImpl.mPrefetchArray>
	//* 121  240:iload_3         
	//* 122  241:iaload          
	//* 123  242:putfield        #117 <Field int GapWorker$Task.position>
	//* 124  245:iload_1         
	//* 125  246:iconst_1        
	//* 126  247:iadd            
	//* 127  248:istore_1        
	//* 128  249:iload_3         
	//* 129  250:iconst_2        
	//* 130  251:iadd            
	//* 131  252:istore_3        
	//* 132  253:goto            143
					{
						task = (Task)mTasks.get(i);
	//  133  256:aload_0         
	//  134  257:getfield        #49  <Field ArrayList mTasks>
	//  135  260:iload_1         
	//  136  261:invokevirtual   #58  <Method Object ArrayList.get(int)>
	//  137  264:checkcast       #13  <Class GapWorker$Task>
	//  138  267:astore          8
					}
					j1 = layoutprefetchregistryimpl.mPrefetchArray[k + 1];
					if(j1 <= i1)
						flag = true;
					else
	//* 139  269:goto            184
						flag = false;
	//  140  272:iconst_0        
	//  141  273:istore          7
					task.immediate = flag;
					task.viewVelocity = i1;
					task.distanceToItem = j1;
					task.view = recyclerview1;
					task.position = layoutprefetchregistryimpl.mPrefetchArray[k];
					i++;
					k += 2;
				}
			}
			j++;
		}
	//* 142  275:goto            205
		Collections.sort(((java.util.List) (mTasks)), sTaskComparator);
	//  143  278:aload_0         
	//  144  279:getfield        #49  <Field ArrayList mTasks>
	//  145  282:getstatic       #40  <Field Comparator sTaskComparator>
	//  146  285:invokestatic    #123 <Method void Collections.sort(java.util.List, Comparator)>
	//  147  288:return          
	//* 148  289:goto            108
	//* 149  292:goto            62
	}

	private void flushTaskWithDeadline(Task task, long l)
	{
		long l1;
		if(task.immediate)
	//*   0    0:aload_1         
	//*   1    1:getfield        #104 <Field boolean GapWorker$Task.immediate>
	//*   2    4:ifeq            68
			l1 = 0xffffffffL;
	//    3    7:ldc2w           #126 <Long 0xffffffffL>
	//    4   10:lstore          4
		else
	//*   5   12:aload_0         
	//*   6   13:aload_1         
	//*   7   14:getfield        #114 <Field RecyclerView GapWorker$Task.view>
	//*   8   17:aload_1         
	//*   9   18:getfield        #117 <Field int GapWorker$Task.position>
	//*  10   21:lload           4
	//*  11   23:invokespecial   #131 <Method RecyclerView$ViewHolder prefetchPositionWithDeadline(RecyclerView, int, long)>
	//*  12   26:astore_1        
	//*  13   27:aload_1         
	//*  14   28:ifnull          67
	//*  15   31:aload_1         
	//*  16   32:getfield        #137 <Field WeakReference RecyclerView$ViewHolder.mNestedRecyclerView>
	//*  17   35:ifnull          67
	//*  18   38:aload_1         
	//*  19   39:invokevirtual   #141 <Method boolean RecyclerView$ViewHolder.isBound()>
	//*  20   42:ifeq            67
	//*  21   45:aload_1         
	//*  22   46:invokevirtual   #144 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*  23   49:ifne            67
	//*  24   52:aload_0         
	//*  25   53:aload_1         
	//*  26   54:getfield        #137 <Field WeakReference RecyclerView$ViewHolder.mNestedRecyclerView>
	//*  27   57:invokevirtual   #149 <Method Object WeakReference.get()>
	//*  28   60:checkcast       #60  <Class RecyclerView>
	//*  29   63:lload_2         
	//*  30   64:invokespecial   #153 <Method void prefetchInnerRecyclerViewWithDeadline(RecyclerView, long)>
	//*  31   67:return          
			l1 = l;
	//   32   68:lload_2         
	//   33   69:lstore          4
		task = ((Task) (prefetchPositionWithDeadline(task.view, task.position, l1)));
		if(task != null && ((RecyclerView.ViewHolder) (task)).mNestedRecyclerView != null && ((RecyclerView.ViewHolder) (task)).isBound() && !((RecyclerView.ViewHolder) (task)).isInvalid())
			prefetchInnerRecyclerViewWithDeadline((RecyclerView)((RecyclerView.ViewHolder) (task)).mNestedRecyclerView.get(), l);
	//*  34   71:goto            12
	}

	private void flushTasksWithDeadline(long l)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		do
		{
			Task task;
label0:
			{
				if(i < mTasks.size())
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #49  <Field ArrayList mTasks>
	//*   5    7:invokevirtual   #54  <Method int ArrayList.size()>
	//*   6   10:icmpge          34
				{
					task = (Task)mTasks.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #49  <Field ArrayList mTasks>
	//    9   17:iload_3         
	//   10   18:invokevirtual   #58  <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #13  <Class GapWorker$Task>
	//   12   24:astore          4
					if(task.view != null)
						break label0;
	//   13   26:aload           4
	//   14   28:getfield        #114 <Field RecyclerView GapWorker$Task.view>
	//   15   31:ifnonnull       35
				}
				return;
	//   16   34:return          
			}
			flushTaskWithDeadline(task, l);
	//   17   35:aload_0         
	//   18   36:aload           4
	//   19   38:lload_1         
	//   20   39:invokespecial   #157 <Method void flushTaskWithDeadline(GapWorker$Task, long)>
			task.clear();
	//   21   42:aload           4
	//   22   44:invokevirtual   #160 <Method void GapWorker$Task.clear()>
			i++;
	//   23   47:iload_3         
	//   24   48:iconst_1        
	//   25   49:iadd            
	//   26   50:istore_3        
		} while(true);
	//   27   51:goto            2
	}

	static boolean isPrefetchPositionAttached(RecyclerView recyclerview, int i)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		int k = recyclerview.mChildHelper.getUnfilteredChildCount();
	//    2    3:aload_0         
	//    3    4:getfield        #166 <Field ChildHelper RecyclerView.mChildHelper>
	//    4    7:invokevirtual   #171 <Method int ChildHelper.getUnfilteredChildCount()>
	//    5   10:istore_3        
		int j = 0;
	//    6   11:iconst_0        
	//    7   12:istore_2        
		do
		{
label0:
			{
				boolean flag = flag1;
	//    8   13:iload           5
	//    9   15:istore          4
				if(j < k)
	//*  10   17:iload_2         
	//*  11   18:iload_3         
	//*  12   19:icmpge          55
				{
					RecyclerView.ViewHolder viewholder = RecyclerView.getChildViewHolderInt(recyclerview.mChildHelper.getUnfilteredChildAt(j));
	//   13   22:aload_0         
	//   14   23:getfield        #166 <Field ChildHelper RecyclerView.mChildHelper>
	//   15   26:iload_2         
	//   16   27:invokevirtual   #175 <Method android.view.View ChildHelper.getUnfilteredChildAt(int)>
	//   17   30:invokestatic    #179 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(android.view.View)>
	//   18   33:astore          6
					if(viewholder.mPosition != i || viewholder.isInvalid())
						break label0;
	//   19   35:aload           6
	//   20   37:getfield        #182 <Field int RecyclerView$ViewHolder.mPosition>
	//   21   40:iload_1         
	//   22   41:icmpne          58
	//   23   44:aload           6
	//   24   46:invokevirtual   #144 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//   25   49:ifne            58
					flag = true;
	//   26   52:iconst_1        
	//   27   53:istore          4
				}
				return flag;
	//   28   55:iload           4
	//   29   57:ireturn         
			}
			j++;
	//   30   58:iload_2         
	//   31   59:iconst_1        
	//   32   60:iadd            
	//   33   61:istore_2        
		} while(true);
	//   34   62:goto            13
	}

	private void prefetchInnerRecyclerViewWithDeadline(RecyclerView recyclerview, long l)
	{
		if(recyclerview != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       5
_L1:
		return;
	//    2    4:return          
_L2:
		LayoutPrefetchRegistryImpl layoutprefetchregistryimpl;
		if(recyclerview.mDataSetHasChangedAfterLayout && recyclerview.mChildHelper.getUnfilteredChildCount() != 0)
	//*   3    5:aload_1         
	//*   4    6:getfield        #186 <Field boolean RecyclerView.mDataSetHasChangedAfterLayout>
	//*   5    9:ifeq            26
	//*   6   12:aload_1         
	//*   7   13:getfield        #166 <Field ChildHelper RecyclerView.mChildHelper>
	//*   8   16:invokevirtual   #171 <Method int ChildHelper.getUnfilteredChildCount()>
	//*   9   19:ifeq            26
			recyclerview.removeAndRecycleViews();
	//   10   22:aload_1         
	//   11   23:invokevirtual   #189 <Method void RecyclerView.removeAndRecycleViews()>
		layoutprefetchregistryimpl = recyclerview.mPrefetchRegistry;
	//   12   26:aload_1         
	//   13   27:getfield        #67  <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   14   30:astore          5
		layoutprefetchregistryimpl.collectPrefetchPositionsFromView(recyclerview, true);
	//   15   32:aload           5
	//   16   34:aload_1         
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #71  <Method void GapWorker$LayoutPrefetchRegistryImpl.collectPrefetchPositionsFromView(RecyclerView, boolean)>
		if(layoutprefetchregistryimpl.mCount == 0) goto _L1; else goto _L3
	//   19   39:aload           5
	//   20   41:getfield        #75  <Field int GapWorker$LayoutPrefetchRegistryImpl.mCount>
	//   21   44:ifeq            4
_L3:
		TraceCompat.beginSection("RV Nested Prefetch");
	//   22   47:ldc1            #191 <String "RV Nested Prefetch">
	//   23   49:invokestatic    #197 <Method void TraceCompat.beginSection(String)>
		recyclerview.mState.prepareForNestedPrefetch(recyclerview.mAdapter);
	//   24   52:aload_1         
	//   25   53:getfield        #201 <Field RecyclerView$State RecyclerView.mState>
	//   26   56:aload_1         
	//   27   57:getfield        #205 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   28   60:invokevirtual   #211 <Method void RecyclerView$State.prepareForNestedPrefetch(RecyclerView$Adapter)>
		int i = 0;
	//   29   63:iconst_0        
	//   30   64:istore          4
_L5:
		if(i >= layoutprefetchregistryimpl.mCount * 2)
			break; /* Loop/switch isn't completed */
	//   31   66:iload           4
	//   32   68:aload           5
	//   33   70:getfield        #75  <Field int GapWorker$LayoutPrefetchRegistryImpl.mCount>
	//   34   73:iconst_2        
	//   35   74:imul            
	//   36   75:icmpge          102
		prefetchPositionWithDeadline(recyclerview, layoutprefetchregistryimpl.mPrefetchArray[i], l);
	//   37   78:aload_0         
	//   38   79:aload_1         
	//   39   80:aload           5
	//   40   82:getfield        #100 <Field int[] GapWorker$LayoutPrefetchRegistryImpl.mPrefetchArray>
	//   41   85:iload           4
	//   42   87:iaload          
	//   43   88:lload_2         
	//   44   89:invokespecial   #131 <Method RecyclerView$ViewHolder prefetchPositionWithDeadline(RecyclerView, int, long)>
	//   45   92:pop             
		i += 2;
	//   46   93:iload           4
	//   47   95:iconst_2        
	//   48   96:iadd            
	//   49   97:istore          4
		if(true) goto _L5; else goto _L4
	//   50   99:goto            66
_L4:
		TraceCompat.endSection();
	//   51  102:invokestatic    #214 <Method void TraceCompat.endSection()>
		return;
	//   52  105:return          
		recyclerview;
	//   53  106:astore_1        
		TraceCompat.endSection();
	//   54  107:invokestatic    #214 <Method void TraceCompat.endSection()>
		throw recyclerview;
	//   55  110:aload_1         
	//   56  111:athrow          
	}

	private RecyclerView.ViewHolder prefetchPositionWithDeadline(RecyclerView recyclerview, int i, long l)
	{
		RecyclerView.Recycler recycler;
		if(isPrefetchPositionAttached(recyclerview, i))
	//*   0    0:aload_1         
	//*   1    1:iload_2         
	//*   2    2:invokestatic    #217 <Method boolean isPrefetchPositionAttached(RecyclerView, int)>
	//*   3    5:ifeq            10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		recycler = recyclerview.mRecycler;
	//    6   10:aload_1         
	//    7   11:getfield        #221 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//    8   14:astore          5
		RecyclerView.ViewHolder viewholder;
		recyclerview.onEnterLayoutOrScroll();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #224 <Method void RecyclerView.onEnterLayoutOrScroll()>
		viewholder = recycler.tryGetViewHolderForPositionByDeadline(i, false, l);
	//   11   20:aload           5
	//   12   22:iload_2         
	//   13   23:iconst_0        
	//   14   24:lload_3         
	//   15   25:invokevirtual   #230 <Method RecyclerView$ViewHolder RecyclerView$Recycler.tryGetViewHolderForPositionByDeadline(int, boolean, long)>
	//   16   28:astore          6
		if(viewholder == null)
			break MISSING_BLOCK_LABEL_61;
	//   17   30:aload           6
	//   18   32:ifnull          61
		if(!viewholder.isBound() || viewholder.isInvalid())
			break MISSING_BLOCK_LABEL_69;
	//   19   35:aload           6
	//   20   37:invokevirtual   #141 <Method boolean RecyclerView$ViewHolder.isBound()>
	//   21   40:ifeq            69
	//   22   43:aload           6
	//   23   45:invokevirtual   #144 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//   24   48:ifne            69
		recycler.recycleView(viewholder.itemView);
	//   25   51:aload           5
	//   26   53:aload           6
	//   27   55:getfield        #234 <Field android.view.View RecyclerView$ViewHolder.itemView>
	//   28   58:invokevirtual   #238 <Method void RecyclerView$Recycler.recycleView(android.view.View)>
_L2:
		recyclerview.onExitLayoutOrScroll(false);
	//   29   61:aload_1         
	//   30   62:iconst_0        
	//   31   63:invokevirtual   #242 <Method void RecyclerView.onExitLayoutOrScroll(boolean)>
		return viewholder;
	//   32   66:aload           6
	//   33   68:areturn         
		recycler.addViewHolderToRecycledViewPool(viewholder, false);
	//   34   69:aload           5
	//   35   71:aload           6
	//   36   73:iconst_0        
	//   37   74:invokevirtual   #246 <Method void RecyclerView$Recycler.addViewHolderToRecycledViewPool(RecyclerView$ViewHolder, boolean)>
		if(true) goto _L2; else goto _L1
	//   38   77:goto            61
_L1:
		Exception exception;
		exception;
	//   39   80:astore          5
		recyclerview.onExitLayoutOrScroll(false);
	//   40   82:aload_1         
	//   41   83:iconst_0        
	//   42   84:invokevirtual   #242 <Method void RecyclerView.onExitLayoutOrScroll(boolean)>
		throw exception;
	//   43   87:aload           5
	//   44   89:athrow          
	}

	public void add(RecyclerView recyclerview)
	{
		mRecyclerViews.add(((Object) (recyclerview)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ArrayList mRecyclerViews>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #96  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	void postFromTraversal(RecyclerView recyclerview, int i, int j)
	{
		if(recyclerview.isAttachedToWindow() && mPostTimeNs == 0L)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #252 <Method boolean RecyclerView.isAttachedToWindow()>
	//*   2    4:ifeq            30
	//*   3    7:aload_0         
	//*   4    8:getfield        #254 <Field long mPostTimeNs>
	//*   5   11:lconst_0        
	//*   6   12:lcmp            
	//*   7   13:ifne            30
		{
			mPostTimeNs = recyclerview.getNanoTime();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #258 <Method long RecyclerView.getNanoTime()>
	//   11   21:putfield        #254 <Field long mPostTimeNs>
			recyclerview.post(((Runnable) (this)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #262 <Method boolean RecyclerView.post(Runnable)>
	//   15   29:pop             
		}
		recyclerview.mPrefetchRegistry.setPrefetchVector(i, j);
	//   16   30:aload_1         
	//   17   31:getfield        #67  <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   18   34:iload_2         
	//   19   35:iload_3         
	//   20   36:invokevirtual   #266 <Method void GapWorker$LayoutPrefetchRegistryImpl.setPrefetchVector(int, int)>
	//   21   39:return          
	}

	void prefetch(long l)
	{
		buildTaskList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #269 <Method void buildTaskList()>
		flushTasksWithDeadline(l);
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:invokespecial   #271 <Method void flushTasksWithDeadline(long)>
	//    5    9:return          
	}

	public void remove(RecyclerView recyclerview)
	{
		mRecyclerViews.remove(((Object) (recyclerview)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ArrayList mRecyclerViews>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #274 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void run()
	{
		boolean flag;
		TraceCompat.beginSection("RV Prefetch");
	//    0    0:ldc2            #277 <String "RV Prefetch">
	//    1    3:invokestatic    #197 <Method void TraceCompat.beginSection(String)>
		flag = mRecyclerViews.isEmpty();
	//    2    6:aload_0         
	//    3    7:getfield        #47  <Field ArrayList mRecyclerViews>
	//    4   10:invokevirtual   #280 <Method boolean ArrayList.isEmpty()>
	//    5   13:istore_3        
		if(flag)
	//*   6   14:iload_3         
	//*   7   15:ifeq            27
		{
			mPostTimeNs = 0L;
	//    8   18:aload_0         
	//    9   19:lconst_0        
	//   10   20:putfield        #254 <Field long mPostTimeNs>
			TraceCompat.endSection();
	//   11   23:invokestatic    #214 <Method void TraceCompat.endSection()>
			return;
	//   12   26:return          
		}
		int j = mRecyclerViews.size();
	//   13   27:aload_0         
	//   14   28:getfield        #47  <Field ArrayList mRecyclerViews>
	//   15   31:invokevirtual   #54  <Method int ArrayList.size()>
	//   16   34:istore_2        
		int i;
		long l;
		i = 0;
	//   17   35:iconst_0        
	//   18   36:istore_1        
		l = 0L;
	//   19   37:lconst_0        
	//   20   38:lstore          4
_L3:
		if(i >= j) goto _L2; else goto _L1
	//   21   40:iload_1         
	//   22   41:iload_2         
	//   23   42:icmpge          85
_L1:
		RecyclerView recyclerview = (RecyclerView)mRecyclerViews.get(i);
	//   24   45:aload_0         
	//   25   46:getfield        #47  <Field ArrayList mRecyclerViews>
	//   26   49:iload_1         
	//   27   50:invokevirtual   #58  <Method Object ArrayList.get(int)>
	//   28   53:checkcast       #60  <Class RecyclerView>
	//   29   56:astore          6
		if(recyclerview.getWindowVisibility() == 0)
	//*  30   58:aload           6
	//*  31   60:invokevirtual   #63  <Method int RecyclerView.getWindowVisibility()>
	//*  32   63:ifne            140
			l = Math.max(recyclerview.getDrawingTime(), l);
	//   33   66:aload           6
	//   34   68:invokevirtual   #283 <Method long RecyclerView.getDrawingTime()>
	//   35   71:lload           4
	//   36   73:invokestatic    #287 <Method long Math.max(long, long)>
	//   37   76:lstore          4
		i++;
	//   38   78:iload_1         
	//   39   79:iconst_1        
	//   40   80:iadd            
	//   41   81:istore_1        
		  goto _L3
	//*  42   82:goto            40
_L2:
		if(l == 0L)
	//*  43   85:lload           4
	//*  44   87:lconst_0        
	//*  45   88:lcmp            
	//*  46   89:ifne            101
		{
			mPostTimeNs = 0L;
	//   47   92:aload_0         
	//   48   93:lconst_0        
	//   49   94:putfield        #254 <Field long mPostTimeNs>
			TraceCompat.endSection();
	//   50   97:invokestatic    #214 <Method void TraceCompat.endSection()>
			return;
	//   51  100:return          
		}
		prefetch(TimeUnit.MILLISECONDS.toNanos(l) + mFrameIntervalNs);
	//   52  101:aload_0         
	//   53  102:getstatic       #293 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   54  105:lload           4
	//   55  107:invokevirtual   #297 <Method long TimeUnit.toNanos(long)>
	//   56  110:aload_0         
	//   57  111:getfield        #299 <Field long mFrameIntervalNs>
	//   58  114:ladd            
	//   59  115:invokevirtual   #301 <Method void prefetch(long)>
		mPostTimeNs = 0L;
	//   60  118:aload_0         
	//   61  119:lconst_0        
	//   62  120:putfield        #254 <Field long mPostTimeNs>
		TraceCompat.endSection();
	//   63  123:invokestatic    #214 <Method void TraceCompat.endSection()>
		return;
	//   64  126:return          
		Exception exception;
		exception;
	//   65  127:astore          6
		mPostTimeNs = 0L;
	//   66  129:aload_0         
	//   67  130:lconst_0        
	//   68  131:putfield        #254 <Field long mPostTimeNs>
		TraceCompat.endSection();
	//   69  134:invokestatic    #214 <Method void TraceCompat.endSection()>
		throw exception;
	//   70  137:aload           6
	//   71  139:athrow          
	//*  72  140:goto            78
	}

	static final ThreadLocal sGapWorker = new ThreadLocal();
	static Comparator sTaskComparator = new Comparator() {

		public int compare(Task task, Task task1)
		{
			int i;
			byte byte0;
			byte0 = -1;
		//    0    0:iconst_m1       
		//    1    1:istore          5
			boolean flag1 = true;
		//    2    3:iconst_1        
		//    3    4:istore          6
			boolean flag;
			if(task.view == null)
		//*   4    6:aload_1         
		//*   5    7:getfield        #22  <Field RecyclerView GapWorker$Task.view>
		//*   6   10:ifnonnull       43
				i = 1;
		//    7   13:iconst_1        
		//    8   14:istore_3        
			else
		//*   9   15:aload_2         
		//*  10   16:getfield        #22  <Field RecyclerView GapWorker$Task.view>
		//*  11   19:ifnonnull       48
		//*  12   22:iconst_1        
		//*  13   23:istore          4
		//*  14   25:iload_3         
		//*  15   26:iload           4
		//*  16   28:icmpeq          56
		//*  17   31:aload_1         
		//*  18   32:getfield        #22  <Field RecyclerView GapWorker$Task.view>
		//*  19   35:ifnonnull       54
		//*  20   38:iload           6
		//*  21   40:istore_3        
		//*  22   41:iload_3         
		//*  23   42:ireturn         
				i = 0;
		//   24   43:iconst_0        
		//   25   44:istore_3        
			if(task1.view == null)
				flag = true;
			else
		//*  26   45:goto            15
				flag = false;
		//   27   48:iconst_0        
		//   28   49:istore          4
			if(i == flag) goto _L2; else goto _L1
_L1:
			if(task.view != null) goto _L4; else goto _L3
_L3:
			i = ((int) (flag1));
_L6:
			return i;
		//*  29   51:goto            25
_L4:
			return -1;
		//   30   54:iconst_m1       
		//   31   55:ireturn         
_L2:
			if(task.immediate != task1.immediate)
		//*  32   56:aload_1         
		//*  33   57:getfield        #26  <Field boolean GapWorker$Task.immediate>
		//*  34   60:aload_2         
		//*  35   61:getfield        #26  <Field boolean GapWorker$Task.immediate>
		//*  36   64:icmpeq          84
			{
				if(task.immediate)
		//*  37   67:aload_1         
		//*  38   68:getfield        #26  <Field boolean GapWorker$Task.immediate>
		//*  39   71:ifeq            79
					i = ((int) (byte0));
		//   40   74:iload           5
		//   41   76:istore_3        
				else
		//*  42   77:iload_3         
		//*  43   78:ireturn         
					i = 1;
		//   44   79:iconst_1        
		//   45   80:istore_3        
				return i;
			}
		//*  46   81:goto            77
			int j = task1.viewVelocity - task.viewVelocity;
		//   47   84:aload_2         
		//   48   85:getfield        #30  <Field int GapWorker$Task.viewVelocity>
		//   49   88:aload_1         
		//   50   89:getfield        #30  <Field int GapWorker$Task.viewVelocity>
		//   51   92:isub            
		//   52   93:istore          4
			i = j;
		//   53   95:iload           4
		//   54   97:istore_3        
			if(j == 0)
		//*  55   98:iload           4
		//*  56  100:ifne            41
			{
				int k = task.distanceToItem - task1.distanceToItem;
		//   57  103:aload_1         
		//   58  104:getfield        #33  <Field int GapWorker$Task.distanceToItem>
		//   59  107:aload_2         
		//   60  108:getfield        #33  <Field int GapWorker$Task.distanceToItem>
		//   61  111:isub            
		//   62  112:istore          4
				i = k;
		//   63  114:iload           4
		//   64  116:istore_3        
				if(k == 0)
		//*  65  117:iload           4
		//*  66  119:ifne            41
					return 0;
		//   67  122:iconst_0        
		//   68  123:ireturn         
			}
			if(true) goto _L6; else goto _L5
_L5:
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((Task)obj, (Task)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class GapWorker$Task>
		//    3    5:aload_2         
		//    4    6:checkcast       #18  <Class GapWorker$Task>
		//    5    9:invokevirtual   #36  <Method int compare(GapWorker$Task, GapWorker$Task)>
		//    6   12:ireturn         
		}

	}
;
	long mFrameIntervalNs;
	long mPostTimeNs;
	ArrayList mRecyclerViews;
	private ArrayList mTasks;

	static 
	{
	//    0    0:new             #32  <Class ThreadLocal>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void ThreadLocal()>
	//    3    7:putstatic       #37  <Field ThreadLocal sGapWorker>
	//    4   10:new             #8   <Class GapWorker$1>
	//    5   13:dup             
	//    6   14:invokespecial   #38  <Method void GapWorker$1()>
	//    7   17:putstatic       #40  <Field Comparator sTaskComparator>
	//*   8   20:return          
	}
}
