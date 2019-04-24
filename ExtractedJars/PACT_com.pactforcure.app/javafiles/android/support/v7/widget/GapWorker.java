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
		int j;
		int k;
		int l1;
		l1 = mRecyclerViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ArrayList mRecyclerViews>
	//    2    4:invokevirtual   #54  <Method int ArrayList.size()>
	//    3    7:istore          5
		k = 0;
	//    4    9:iconst_0        
	//    5   10:istore_2        
		for(int i = 0; i < l1;)
	//*   6   11:iconst_0        
	//*   7   12:istore_1        
	//*   8   13:iload_1         
	//*   9   14:iload           5
	//*  10   16:icmpge          73
		{
			RecyclerView recyclerview = (RecyclerView)mRecyclerViews.get(i);
	//   11   19:aload_0         
	//   12   20:getfield        #47  <Field ArrayList mRecyclerViews>
	//   13   23:iload_1         
	//   14   24:invokevirtual   #58  <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #60  <Class RecyclerView>
	//   16   30:astore          8
			int l = k;
	//   17   32:iload_2         
	//   18   33:istore_3        
			if(recyclerview.getWindowVisibility() == 0)
	//*  19   34:aload           8
	//*  20   36:invokevirtual   #63  <Method int RecyclerView.getWindowVisibility()>
	//*  21   39:ifne            64
			{
				recyclerview.mPrefetchRegistry.collectPrefetchPositionsFromView(recyclerview, false);
	//   22   42:aload           8
	//   23   44:getfield        #67  <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   24   47:aload           8
	//   25   49:iconst_0        
	//   26   50:invokevirtual   #71  <Method void GapWorker$LayoutPrefetchRegistryImpl.collectPrefetchPositionsFromView(RecyclerView, boolean)>
				l = k + recyclerview.mPrefetchRegistry.mCount;
	//   27   53:iload_2         
	//   28   54:aload           8
	//   29   56:getfield        #67  <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   30   59:getfield        #75  <Field int GapWorker$LayoutPrefetchRegistryImpl.mCount>
	//   31   62:iadd            
	//   32   63:istore_3        
			}
			i++;
	//   33   64:iload_1         
	//   34   65:iconst_1        
	//   35   66:iadd            
	//   36   67:istore_1        
			k = l;
	//   37   68:iload_3         
	//   38   69:istore_2        
		}

	//*  39   70:goto            13
		mTasks.ensureCapacity(k);
	//   40   73:aload_0         
	//   41   74:getfield        #49  <Field ArrayList mTasks>
	//   42   77:iload_2         
	//   43   78:invokevirtual   #79  <Method void ArrayList.ensureCapacity(int)>
		j = 0;
	//   44   81:iconst_0        
	//   45   82:istore_1        
		k = 0;
	//   46   83:iconst_0        
	//   47   84:istore_2        
_L2:
		int j1;
		RecyclerView recyclerview1;
		if(k >= l1)
			break MISSING_BLOCK_LABEL_291;
	//   48   85:iload_2         
	//   49   86:iload           5
	//   50   88:icmpge          291
		recyclerview1 = (RecyclerView)mRecyclerViews.get(k);
	//   51   91:aload_0         
	//   52   92:getfield        #47  <Field ArrayList mRecyclerViews>
	//   53   95:iload_2         
	//   54   96:invokevirtual   #58  <Method Object ArrayList.get(int)>
	//   55   99:checkcast       #60  <Class RecyclerView>
	//   56  102:astore          9
		if(recyclerview1.getWindowVisibility() == 0)
			break; /* Loop/switch isn't completed */
	//   57  104:aload           9
	//   58  106:invokevirtual   #63  <Method int RecyclerView.getWindowVisibility()>
	//   59  109:ifeq            125
		j1 = j;
	//   60  112:iload_1         
	//   61  113:istore          4
_L4:
		k++;
	//   62  115:iload_2         
	//   63  116:iconst_1        
	//   64  117:iadd            
	//   65  118:istore_2        
		j = j1;
	//   66  119:iload           4
	//   67  121:istore_1        
		if(true) goto _L2; else goto _L1
	//   68  122:goto            85
_L1:
		int i1;
		int i2;
		LayoutPrefetchRegistryImpl layoutprefetchregistryimpl;
		layoutprefetchregistryimpl = recyclerview1.mPrefetchRegistry;
	//   69  125:aload           9
	//   70  127:getfield        #67  <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   71  130:astore          10
		i2 = Math.abs(layoutprefetchregistryimpl.mPrefetchDx) + Math.abs(layoutprefetchregistryimpl.mPrefetchDy);
	//   72  132:aload           10
	//   73  134:getfield        #82  <Field int GapWorker$LayoutPrefetchRegistryImpl.mPrefetchDx>
	//   74  137:invokestatic    #88  <Method int Math.abs(int)>
	//   75  140:aload           10
	//   76  142:getfield        #91  <Field int GapWorker$LayoutPrefetchRegistryImpl.mPrefetchDy>
	//   77  145:invokestatic    #88  <Method int Math.abs(int)>
	//   78  148:iadd            
	//   79  149:istore          6
		i1 = 0;
	//   80  151:iconst_0        
	//   81  152:istore_3        
_L5:
		j1 = j;
	//   82  153:iload_1         
	//   83  154:istore          4
		if(i1 >= layoutprefetchregistryimpl.mCount * 2) goto _L4; else goto _L3
	//   84  156:iload_3         
	//   85  157:aload           10
	//   86  159:getfield        #75  <Field int GapWorker$LayoutPrefetchRegistryImpl.mCount>
	//   87  162:iconst_2        
	//   88  163:imul            
	//   89  164:icmpge          115
_L3:
		int k1;
		boolean flag;
		Task task;
		if(j >= mTasks.size())
	//*  90  167:iload_1         
	//*  91  168:aload_0         
	//*  92  169:getfield        #49  <Field ArrayList mTasks>
	//*  93  172:invokevirtual   #54  <Method int ArrayList.size()>
	//*  94  175:icmplt          269
		{
			task = new Task();
	//   95  178:new             #13  <Class GapWorker$Task>
	//   96  181:dup             
	//   97  182:invokespecial   #92  <Method void GapWorker$Task()>
	//   98  185:astore          8
			mTasks.add(((Object) (task)));
	//   99  187:aload_0         
	//  100  188:getfield        #49  <Field ArrayList mTasks>
	//  101  191:aload           8
	//  102  193:invokevirtual   #96  <Method boolean ArrayList.add(Object)>
	//  103  196:pop             
		} else
	//* 104  197:aload           10
	//* 105  199:getfield        #100 <Field int[] GapWorker$LayoutPrefetchRegistryImpl.mPrefetchArray>
	//* 106  202:iload_3         
	//* 107  203:iconst_1        
	//* 108  204:iadd            
	//* 109  205:iaload          
	//* 110  206:istore          4
	//* 111  208:iload           4
	//* 112  210:iload           6
	//* 113  212:icmpgt          285
	//* 114  215:iconst_1        
	//* 115  216:istore          7
	//* 116  218:aload           8
	//* 117  220:iload           7
	//* 118  222:putfield        #104 <Field boolean GapWorker$Task.immediate>
	//* 119  225:aload           8
	//* 120  227:iload           6
	//* 121  229:putfield        #107 <Field int GapWorker$Task.viewVelocity>
	//* 122  232:aload           8
	//* 123  234:iload           4
	//* 124  236:putfield        #110 <Field int GapWorker$Task.distanceToItem>
	//* 125  239:aload           8
	//* 126  241:aload           9
	//* 127  243:putfield        #114 <Field RecyclerView GapWorker$Task.view>
	//* 128  246:aload           8
	//* 129  248:aload           10
	//* 130  250:getfield        #100 <Field int[] GapWorker$LayoutPrefetchRegistryImpl.mPrefetchArray>
	//* 131  253:iload_3         
	//* 132  254:iaload          
	//* 133  255:putfield        #117 <Field int GapWorker$Task.position>
	//* 134  258:iload_1         
	//* 135  259:iconst_1        
	//* 136  260:iadd            
	//* 137  261:istore_1        
	//* 138  262:iload_3         
	//* 139  263:iconst_2        
	//* 140  264:iadd            
	//* 141  265:istore_3        
	//* 142  266:goto            153
		{
			task = (Task)mTasks.get(j);
	//  143  269:aload_0         
	//  144  270:getfield        #49  <Field ArrayList mTasks>
	//  145  273:iload_1         
	//  146  274:invokevirtual   #58  <Method Object ArrayList.get(int)>
	//  147  277:checkcast       #13  <Class GapWorker$Task>
	//  148  280:astore          8
		}
		k1 = layoutprefetchregistryimpl.mPrefetchArray[i1 + 1];
		if(k1 <= i2)
			flag = true;
		else
	//* 149  282:goto            197
			flag = false;
	//  150  285:iconst_0        
	//  151  286:istore          7
		task.immediate = flag;
		task.viewVelocity = i2;
		task.distanceToItem = k1;
		task.view = recyclerview1;
		task.position = layoutprefetchregistryimpl.mPrefetchArray[i1];
		j++;
		i1 += 2;
		  goto _L5
		  goto _L4
	//* 152  288:goto            218
		Collections.sort(((java.util.List) (mTasks)), sTaskComparator);
	//  153  291:aload_0         
	//  154  292:getfield        #49  <Field ArrayList mTasks>
	//  155  295:getstatic       #40  <Field Comparator sTaskComparator>
	//  156  298:invokestatic    #123 <Method void Collections.sort(java.util.List, Comparator)>
		return;
	//  157  301:return          
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
		int k = recyclerview.mChildHelper.getUnfilteredChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field ChildHelper RecyclerView.mChildHelper>
	//    2    4:invokevirtual   #171 <Method int ChildHelper.getUnfilteredChildCount()>
	//    3    7:istore_3        
		for(int j = 0; j < k; j++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:iload_3         
	//*   8   12:icmpge          54
		{
			RecyclerView.ViewHolder viewholder = RecyclerView.getChildViewHolderInt(recyclerview.mChildHelper.getUnfilteredChildAt(j));
	//    9   15:aload_0         
	//   10   16:getfield        #166 <Field ChildHelper RecyclerView.mChildHelper>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #175 <Method android.view.View ChildHelper.getUnfilteredChildAt(int)>
	//   13   23:invokestatic    #179 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(android.view.View)>
	//   14   26:astore          4
			if(viewholder.mPosition == i && !viewholder.isInvalid())
	//*  15   28:aload           4
	//*  16   30:getfield        #182 <Field int RecyclerView$ViewHolder.mPosition>
	//*  17   33:iload_1         
	//*  18   34:icmpne          47
	//*  19   37:aload           4
	//*  20   39:invokevirtual   #144 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*  21   42:ifne            47
				return true;
	//   22   45:iconst_1        
	//   23   46:ireturn         
		}

	//   24   47:iload_2         
	//   25   48:iconst_1        
	//   26   49:iadd            
	//   27   50:istore_2        
	//*  28   51:goto            10
		return false;
	//   29   54:iconst_0        
	//   30   55:ireturn         
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
		l = 0L;
	//   17   35:lconst_0        
	//   18   36:lstore          4
		i = 0;
	//   19   38:iconst_0        
	//   20   39:istore_1        
_L3:
		if(i >= j) goto _L2; else goto _L1
	//   21   40:iload_1         
	//   22   41:iload_2         
	//   23   42:icmpge          93
_L1:
		RecyclerView recyclerview = (RecyclerView)mRecyclerViews.get(i);
	//   24   45:aload_0         
	//   25   46:getfield        #47  <Field ArrayList mRecyclerViews>
	//   26   49:iload_1         
	//   27   50:invokevirtual   #58  <Method Object ArrayList.get(int)>
	//   28   53:checkcast       #60  <Class RecyclerView>
	//   29   56:astore          8
		long l1 = l;
	//   30   58:lload           4
	//   31   60:lstore          6
		if(recyclerview.getWindowVisibility() == 0)
	//*  32   62:aload           8
	//*  33   64:invokevirtual   #63  <Method int RecyclerView.getWindowVisibility()>
	//*  34   67:ifne            82
			l1 = Math.max(recyclerview.getDrawingTime(), l);
	//   35   70:aload           8
	//   36   72:invokevirtual   #283 <Method long RecyclerView.getDrawingTime()>
	//   37   75:lload           4
	//   38   77:invokestatic    #287 <Method long Math.max(long, long)>
	//   39   80:lstore          6
		i++;
	//   40   82:iload_1         
	//   41   83:iconst_1        
	//   42   84:iadd            
	//   43   85:istore_1        
		l = l1;
	//   44   86:lload           6
	//   45   88:lstore          4
		  goto _L3
	//*  46   90:goto            40
_L2:
		if(l == 0L)
	//*  47   93:lload           4
	//*  48   95:lconst_0        
	//*  49   96:lcmp            
	//*  50   97:ifne            109
		{
			mPostTimeNs = 0L;
	//   51  100:aload_0         
	//   52  101:lconst_0        
	//   53  102:putfield        #254 <Field long mPostTimeNs>
			TraceCompat.endSection();
	//   54  105:invokestatic    #214 <Method void TraceCompat.endSection()>
			return;
	//   55  108:return          
		}
		prefetch(TimeUnit.MILLISECONDS.toNanos(l) + mFrameIntervalNs);
	//   56  109:aload_0         
	//   57  110:getstatic       #293 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   58  113:lload           4
	//   59  115:invokevirtual   #297 <Method long TimeUnit.toNanos(long)>
	//   60  118:aload_0         
	//   61  119:getfield        #299 <Field long mFrameIntervalNs>
	//   62  122:ladd            
	//   63  123:invokevirtual   #301 <Method void prefetch(long)>
		mPostTimeNs = 0L;
	//   64  126:aload_0         
	//   65  127:lconst_0        
	//   66  128:putfield        #254 <Field long mPostTimeNs>
		TraceCompat.endSection();
	//   67  131:invokestatic    #214 <Method void TraceCompat.endSection()>
		return;
	//   68  134:return          
		Exception exception;
		exception;
	//   69  135:astore          8
		mPostTimeNs = 0L;
	//   70  137:aload_0         
	//   71  138:lconst_0        
	//   72  139:putfield        #254 <Field long mPostTimeNs>
		TraceCompat.endSection();
	//   73  142:invokestatic    #214 <Method void TraceCompat.endSection()>
		throw exception;
	//   74  145:aload           8
	//   75  147:athrow          
	}

	static final ThreadLocal sGapWorker = new ThreadLocal();
	static Comparator sTaskComparator = new Comparator() {

		public int compare(Task task, Task task1)
		{
			byte byte0 = -1;
		//    0    0:iconst_m1       
		//    1    1:istore          5
			int i;
			boolean flag;
			if(task.view == null)
		//*   2    3:aload_1         
		//*   3    4:getfield        #22  <Field RecyclerView GapWorker$Task.view>
		//*   4    7:ifnonnull       37
				i = 1;
		//    5   10:iconst_1        
		//    6   11:istore_3        
			else
		//*   7   12:aload_2         
		//*   8   13:getfield        #22  <Field RecyclerView GapWorker$Task.view>
		//*   9   16:ifnonnull       42
		//*  10   19:iconst_1        
		//*  11   20:istore          4
		//*  12   22:iload_3         
		//*  13   23:iload           4
		//*  14   25:icmpeq          50
		//*  15   28:aload_1         
		//*  16   29:getfield        #22  <Field RecyclerView GapWorker$Task.view>
		//*  17   32:ifnonnull       48
		//*  18   35:iconst_1        
		//*  19   36:ireturn         
				i = 0;
		//   20   37:iconst_0        
		//   21   38:istore_3        
			if(task1.view == null)
				flag = true;
			else
		//*  22   39:goto            12
				flag = false;
		//   23   42:iconst_0        
		//   24   43:istore          4
			if(i != flag)
				return task.view != null ? -1 : 1;
		//   25   45:goto            22
		//   26   48:iconst_m1       
		//   27   49:ireturn         
			if(task.immediate != task1.immediate)
		//*  28   50:aload_1         
		//*  29   51:getfield        #26  <Field boolean GapWorker$Task.immediate>
		//*  30   54:aload_2         
		//*  31   55:getfield        #26  <Field boolean GapWorker$Task.immediate>
		//*  32   58:icmpeq          78
			{
				if(task.immediate)
		//*  33   61:aload_1         
		//*  34   62:getfield        #26  <Field boolean GapWorker$Task.immediate>
		//*  35   65:ifeq            73
					i = ((int) (byte0));
		//   36   68:iload           5
		//   37   70:istore_3        
				else
		//*  38   71:iload_3         
		//*  39   72:ireturn         
					i = 1;
		//   40   73:iconst_1        
		//   41   74:istore_3        
				return i;
			}
		//*  42   75:goto            71
			i = task1.viewVelocity - task.viewVelocity;
		//   43   78:aload_2         
		//   44   79:getfield        #30  <Field int GapWorker$Task.viewVelocity>
		//   45   82:aload_1         
		//   46   83:getfield        #30  <Field int GapWorker$Task.viewVelocity>
		//   47   86:isub            
		//   48   87:istore_3        
			if(i != 0)
		//*  49   88:iload_3         
		//*  50   89:ifeq            94
				return i;
		//   51   92:iload_3         
		//   52   93:ireturn         
			i = task.distanceToItem - task1.distanceToItem;
		//   53   94:aload_1         
		//   54   95:getfield        #33  <Field int GapWorker$Task.distanceToItem>
		//   55   98:aload_2         
		//   56   99:getfield        #33  <Field int GapWorker$Task.distanceToItem>
		//   57  102:isub            
		//   58  103:istore_3        
			if(i != 0)
		//*  59  104:iload_3         
		//*  60  105:ifeq            110
				return i;
		//   61  108:iload_3         
		//   62  109:ireturn         
			else
				return 0;
		//   63  110:iconst_0        
		//   64  111:ireturn         
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
