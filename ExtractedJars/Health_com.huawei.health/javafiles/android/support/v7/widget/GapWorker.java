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
			int k = mCount * 2;
		//   14   28:aload_0         
		//   15   29:getfield        #33  <Field int mCount>
		//   16   32:iconst_2        
		//   17   33:imul            
		//   18   34:istore_3        
			if(mPrefetchArray == null)
		//*  19   35:aload_0         
		//*  20   36:getfield        #35  <Field int[] mPrefetchArray>
		//*  21   39:ifnonnull       60
			{
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
			} else
		//*  30   57:goto            98
			if(k >= mPrefetchArray.length)
		//*  31   60:iload_3         
		//*  32   61:aload_0         
		//*  33   62:getfield        #35  <Field int[] mPrefetchArray>
		//*  34   65:arraylength     
		//*  35   66:icmplt          98
			{
				int ai[] = mPrefetchArray;
		//   36   69:aload_0         
		//   37   70:getfield        #35  <Field int[] mPrefetchArray>
		//   38   73:astore          4
				mPrefetchArray = new int[k * 2];
		//   39   75:aload_0         
		//   40   76:iload_3         
		//   41   77:iconst_2        
		//   42   78:imul            
		//   43   79:newarray        int[]
		//   44   81:putfield        #35  <Field int[] mPrefetchArray>
				System.arraycopy(((Object) (ai)), 0, ((Object) (mPrefetchArray)), 0, ai.length);
		//   45   84:aload           4
		//   46   86:iconst_0        
		//   47   87:aload_0         
		//   48   88:getfield        #35  <Field int[] mPrefetchArray>
		//   49   91:iconst_0        
		//   50   92:aload           4
		//   51   94:arraylength     
		//   52   95:invokestatic    #47  <Method void System.arraycopy(Object, int, Object, int, int)>
			}
			mPrefetchArray[k] = i;
		//   53   98:aload_0         
		//   54   99:getfield        #35  <Field int[] mPrefetchArray>
		//   55  102:iload_3         
		//   56  103:iload_1         
		//   57  104:iastore         
			mPrefetchArray[k + 1] = j;
		//   58  105:aload_0         
		//   59  106:getfield        #35  <Field int[] mPrefetchArray>
		//   60  109:iload_3         
		//   61  110:iconst_1        
		//   62  111:iadd            
		//   63  112:iload_2         
		//   64  113:iastore         
			mCount = mCount + 1;
		//   65  114:aload_0         
		//   66  115:aload_0         
		//   67  116:getfield        #33  <Field int mCount>
		//   68  119:iconst_1        
		//   69  120:iadd            
		//   70  121:putfield        #33  <Field int mCount>
		//   71  124:return          
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
			RecyclerView.LayoutManager layoutmanager = recyclerview.mLayout;
		//   10   20:aload_1         
		//   11   21:getfield        #56  <Field RecyclerView$LayoutManager RecyclerView.mLayout>
		//   12   24:astore_3        
			if(recyclerview.mAdapter != null && layoutmanager != null && layoutmanager.isItemPrefetchEnabled())
		//*  13   25:aload_1         
		//*  14   26:getfield        #60  <Field RecyclerView$Adapter RecyclerView.mAdapter>
		//*  15   29:ifnull          127
		//*  16   32:aload_3         
		//*  17   33:ifnull          127
		//*  18   36:aload_3         
		//*  19   37:invokevirtual   #66  <Method boolean RecyclerView$LayoutManager.isItemPrefetchEnabled()>
		//*  20   40:ifeq            127
			{
				if(flag)
		//*  21   43:iload_2         
		//*  22   44:ifeq            72
				{
					if(!recyclerview.mAdapterHelper.hasPendingUpdates())
		//*  23   47:aload_1         
		//*  24   48:getfield        #70  <Field AdapterHelper RecyclerView.mAdapterHelper>
		//*  25   51:invokevirtual   #75  <Method boolean AdapterHelper.hasPendingUpdates()>
		//*  26   54:ifne            96
						layoutmanager.collectInitialPrefetchPositions(recyclerview.mAdapter.getItemCount(), ((RecyclerView.LayoutManager.LayoutPrefetchRegistry) (this)));
		//   27   57:aload_3         
		//   28   58:aload_1         
		//   29   59:getfield        #60  <Field RecyclerView$Adapter RecyclerView.mAdapter>
		//   30   62:invokevirtual   #81  <Method int RecyclerView$Adapter.getItemCount()>
		//   31   65:aload_0         
		//   32   66:invokevirtual   #85  <Method void RecyclerView$LayoutManager.collectInitialPrefetchPositions(int, RecyclerView$LayoutManager$LayoutPrefetchRegistry)>
				} else
		//*  33   69:goto            96
				if(!recyclerview.hasPendingAdapterUpdates())
		//*  34   72:aload_1         
		//*  35   73:invokevirtual   #88  <Method boolean RecyclerView.hasPendingAdapterUpdates()>
		//*  36   76:ifne            96
					layoutmanager.collectAdjacentPrefetchPositions(mPrefetchDx, mPrefetchDy, recyclerview.mState, ((RecyclerView.LayoutManager.LayoutPrefetchRegistry) (this)));
		//   37   79:aload_3         
		//   38   80:aload_0         
		//   39   81:getfield        #90  <Field int mPrefetchDx>
		//   40   84:aload_0         
		//   41   85:getfield        #92  <Field int mPrefetchDy>
		//   42   88:aload_1         
		//   43   89:getfield        #96  <Field RecyclerView$State RecyclerView.mState>
		//   44   92:aload_0         
		//   45   93:invokevirtual   #100 <Method void RecyclerView$LayoutManager.collectAdjacentPrefetchPositions(int, int, RecyclerView$State, RecyclerView$LayoutManager$LayoutPrefetchRegistry)>
				if(mCount > layoutmanager.mPrefetchMaxCountObserved)
		//*  46   96:aload_0         
		//*  47   97:getfield        #33  <Field int mCount>
		//*  48  100:aload_3         
		//*  49  101:getfield        #103 <Field int RecyclerView$LayoutManager.mPrefetchMaxCountObserved>
		//*  50  104:icmple          127
				{
					layoutmanager.mPrefetchMaxCountObserved = mCount;
		//   51  107:aload_3         
		//   52  108:aload_0         
		//   53  109:getfield        #33  <Field int mCount>
		//   54  112:putfield        #103 <Field int RecyclerView$LayoutManager.mPrefetchMaxCountObserved>
					layoutmanager.mPrefetchMaxObservedInInitialPrefetch = flag;
		//   55  115:aload_3         
		//   56  116:iload_2         
		//   57  117:putfield        #107 <Field boolean RecyclerView$LayoutManager.mPrefetchMaxObservedInInitialPrefetch>
					recyclerview.mRecycler.updateViewCacheSize();
		//   58  120:aload_1         
		//   59  121:getfield        #111 <Field RecyclerView$Recycler RecyclerView.mRecycler>
		//   60  124:invokevirtual   #116 <Method void RecyclerView$Recycler.updateViewCacheSize()>
				}
			}
		//   61  127:return          
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
		int l1 = mRecyclerViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ArrayList mRecyclerViews>
	//    2    4:invokevirtual   #54  <Method int ArrayList.size()>
	//    3    7:istore          5
		int k = 0;
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
			int i1 = k;
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
				i1 = k + recyclerview.mPrefetchRegistry.mCount;
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
			k = i1;
	//   37   68:iload_3         
	//   38   69:istore_2        
		}

	//*  39   70:goto            13
		mTasks.ensureCapacity(k);
	//   40   73:aload_0         
	//   41   74:getfield        #49  <Field ArrayList mTasks>
	//   42   77:iload_2         
	//   43   78:invokevirtual   #79  <Method void ArrayList.ensureCapacity(int)>
		int j = 0;
	//   44   81:iconst_0        
	//   45   82:istore_1        
		for(int l = 0; l < l1;)
	//*  46   83:iconst_0        
	//*  47   84:istore_2        
	//*  48   85:iload_2         
	//*  49   86:iload           5
	//*  50   88:icmpge          294
		{
			RecyclerView recyclerview1 = (RecyclerView)mRecyclerViews.get(l);
	//   51   91:aload_0         
	//   52   92:getfield        #47  <Field ArrayList mRecyclerViews>
	//   53   95:iload_2         
	//   54   96:invokevirtual   #58  <Method Object ArrayList.get(int)>
	//   55   99:checkcast       #60  <Class RecyclerView>
	//   56  102:astore          9
			int k1;
			if(recyclerview1.getWindowVisibility() != 0)
	//*  57  104:aload           9
	//*  58  106:invokevirtual   #63  <Method int RecyclerView.getWindowVisibility()>
	//*  59  109:ifeq            118
			{
				k1 = j;
	//   60  112:iload_1         
	//   61  113:istore          4
			} else
	//*  62  115:goto            284
			{
				LayoutPrefetchRegistryImpl layoutprefetchregistryimpl = recyclerview1.mPrefetchRegistry;
	//   63  118:aload           9
	//   64  120:getfield        #67  <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   65  123:astore          10
				int i2 = Math.abs(layoutprefetchregistryimpl.mPrefetchDx) + Math.abs(layoutprefetchregistryimpl.mPrefetchDy);
	//   66  125:aload           10
	//   67  127:getfield        #82  <Field int GapWorker$LayoutPrefetchRegistryImpl.mPrefetchDx>
	//   68  130:invokestatic    #88  <Method int Math.abs(int)>
	//   69  133:aload           10
	//   70  135:getfield        #91  <Field int GapWorker$LayoutPrefetchRegistryImpl.mPrefetchDy>
	//   71  138:invokestatic    #88  <Method int Math.abs(int)>
	//   72  141:iadd            
	//   73  142:istore          6
				int j1 = 0;
	//   74  144:iconst_0        
	//   75  145:istore_3        
				do
				{
					k1 = j;
	//   76  146:iload_1         
	//   77  147:istore          4
					if(j1 >= layoutprefetchregistryimpl.mCount * 2)
						break;
	//   78  149:iload_3         
	//   79  150:aload           10
	//   80  152:getfield        #75  <Field int GapWorker$LayoutPrefetchRegistryImpl.mCount>
	//   81  155:iconst_2        
	//   82  156:imul            
	//   83  157:icmpge          284
					Task task;
					if(j >= mTasks.size())
	//*  84  160:iload_1         
	//*  85  161:aload_0         
	//*  86  162:getfield        #49  <Field ArrayList mTasks>
	//*  87  165:invokevirtual   #54  <Method int ArrayList.size()>
	//*  88  168:icmplt          193
					{
						task = new Task();
	//   89  171:new             #13  <Class GapWorker$Task>
	//   90  174:dup             
	//   91  175:invokespecial   #92  <Method void GapWorker$Task()>
	//   92  178:astore          8
						mTasks.add(((Object) (task)));
	//   93  180:aload_0         
	//   94  181:getfield        #49  <Field ArrayList mTasks>
	//   95  184:aload           8
	//   96  186:invokevirtual   #96  <Method boolean ArrayList.add(Object)>
	//   97  189:pop             
					} else
	//*  98  190:goto            206
					{
						task = (Task)mTasks.get(j);
	//   99  193:aload_0         
	//  100  194:getfield        #49  <Field ArrayList mTasks>
	//  101  197:iload_1         
	//  102  198:invokevirtual   #58  <Method Object ArrayList.get(int)>
	//  103  201:checkcast       #13  <Class GapWorker$Task>
	//  104  204:astore          8
					}
					k1 = layoutprefetchregistryimpl.mPrefetchArray[j1 + 1];
	//  105  206:aload           10
	//  106  208:getfield        #100 <Field int[] GapWorker$LayoutPrefetchRegistryImpl.mPrefetchArray>
	//  107  211:iload_3         
	//  108  212:iconst_1        
	//  109  213:iadd            
	//  110  214:iaload          
	//  111  215:istore          4
					boolean flag;
					if(k1 <= i2)
	//* 112  217:iload           4
	//* 113  219:iload           6
	//* 114  221:icmpgt          230
						flag = true;
	//  115  224:iconst_1        
	//  116  225:istore          7
					else
	//* 117  227:goto            233
						flag = false;
	//  118  230:iconst_0        
	//  119  231:istore          7
					task.immediate = flag;
	//  120  233:aload           8
	//  121  235:iload           7
	//  122  237:putfield        #104 <Field boolean GapWorker$Task.immediate>
					task.viewVelocity = i2;
	//  123  240:aload           8
	//  124  242:iload           6
	//  125  244:putfield        #107 <Field int GapWorker$Task.viewVelocity>
					task.distanceToItem = k1;
	//  126  247:aload           8
	//  127  249:iload           4
	//  128  251:putfield        #110 <Field int GapWorker$Task.distanceToItem>
					task.view = recyclerview1;
	//  129  254:aload           8
	//  130  256:aload           9
	//  131  258:putfield        #114 <Field RecyclerView GapWorker$Task.view>
					task.position = layoutprefetchregistryimpl.mPrefetchArray[j1];
	//  132  261:aload           8
	//  133  263:aload           10
	//  134  265:getfield        #100 <Field int[] GapWorker$LayoutPrefetchRegistryImpl.mPrefetchArray>
	//  135  268:iload_3         
	//  136  269:iaload          
	//  137  270:putfield        #117 <Field int GapWorker$Task.position>
					j++;
	//  138  273:iload_1         
	//  139  274:iconst_1        
	//  140  275:iadd            
	//  141  276:istore_1        
					j1 += 2;
	//  142  277:iload_3         
	//  143  278:iconst_2        
	//  144  279:iadd            
	//  145  280:istore_3        
				} while(true);
	//  146  281:goto            146
			}
			l++;
	//  147  284:iload_2         
	//  148  285:iconst_1        
	//  149  286:iadd            
	//  150  287:istore_2        
			j = k1;
	//  151  288:iload           4
	//  152  290:istore_1        
		}

	//* 153  291:goto            85
		Collections.sort(((java.util.List) (mTasks)), sTaskComparator);
	//  154  294:aload_0         
	//  155  295:getfield        #49  <Field ArrayList mTasks>
	//  156  298:getstatic       #40  <Field Comparator sTaskComparator>
	//  157  301:invokestatic    #123 <Method void Collections.sort(java.util.List, Comparator)>
	//  158  304:return          
	}

	private void flushTaskWithDeadline(Task task, long l)
	{
		long l1;
		if(task.immediate)
	//*   0    0:aload_1         
	//*   1    1:getfield        #104 <Field boolean GapWorker$Task.immediate>
	//*   2    4:ifeq            15
			l1 = 0xffffffffL;
	//    3    7:ldc2w           #126 <Long 0xffffffffL>
	//    4   10:lstore          4
		else
	//*   5   12:goto            18
			l1 = l;
	//    6   15:lload_2         
	//    7   16:lstore          4
		task = ((Task) (prefetchPositionWithDeadline(task.view, task.position, l1)));
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:getfield        #114 <Field RecyclerView GapWorker$Task.view>
	//   11   23:aload_1         
	//   12   24:getfield        #117 <Field int GapWorker$Task.position>
	//   13   27:lload           4
	//   14   29:invokespecial   #131 <Method RecyclerView$ViewHolder prefetchPositionWithDeadline(RecyclerView, int, long)>
	//   15   32:astore_1        
		if(task != null && ((RecyclerView.ViewHolder) (task)).mNestedRecyclerView != null)
	//*  16   33:aload_1         
	//*  17   34:ifnull          59
	//*  18   37:aload_1         
	//*  19   38:getfield        #137 <Field WeakReference RecyclerView$ViewHolder.mNestedRecyclerView>
	//*  20   41:ifnull          59
			prefetchInnerRecyclerViewWithDeadline((RecyclerView)((RecyclerView.ViewHolder) (task)).mNestedRecyclerView.get(), l);
	//   21   44:aload_0         
	//   22   45:aload_1         
	//   23   46:getfield        #137 <Field WeakReference RecyclerView$ViewHolder.mNestedRecyclerView>
	//   24   49:invokevirtual   #142 <Method Object WeakReference.get()>
	//   25   52:checkcast       #60  <Class RecyclerView>
	//   26   55:lload_2         
	//   27   56:invokespecial   #146 <Method void prefetchInnerRecyclerViewWithDeadline(RecyclerView, long)>
	//   28   59:return          
	}

	private void flushTasksWithDeadline(long l)
	{
		for(int i = 0; i < mTasks.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #49  <Field ArrayList mTasks>
	//*   5    7:invokevirtual   #54  <Method int ArrayList.size()>
	//*   6   10:icmpge          54
		{
			Task task = (Task)mTasks.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #49  <Field ArrayList mTasks>
	//    9   17:iload_3         
	//   10   18:invokevirtual   #58  <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #13  <Class GapWorker$Task>
	//   12   24:astore          4
			if(task.view == null)
	//*  13   26:aload           4
	//*  14   28:getfield        #114 <Field RecyclerView GapWorker$Task.view>
	//*  15   31:ifnonnull       35
				return;
	//   16   34:return          
			flushTaskWithDeadline(task, l);
	//   17   35:aload_0         
	//   18   36:aload           4
	//   19   38:lload_1         
	//   20   39:invokespecial   #150 <Method void flushTaskWithDeadline(GapWorker$Task, long)>
			task.clear();
	//   21   42:aload           4
	//   22   44:invokevirtual   #153 <Method void GapWorker$Task.clear()>
		}

	//   23   47:iload_3         
	//   24   48:iconst_1        
	//   25   49:iadd            
	//   26   50:istore_3        
	//*  27   51:goto            2
	//   28   54:return          
	}

	static boolean isPrefetchPositionAttached(RecyclerView recyclerview, int i)
	{
		int k = recyclerview.mChildHelper.getUnfilteredChildCount();
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field ChildHelper RecyclerView.mChildHelper>
	//    2    4:invokevirtual   #164 <Method int ChildHelper.getUnfilteredChildCount()>
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
	//   10   16:getfield        #159 <Field ChildHelper RecyclerView.mChildHelper>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #168 <Method android.view.View ChildHelper.getUnfilteredChildAt(int)>
	//   13   23:invokestatic    #172 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(android.view.View)>
	//   14   26:astore          4
			if(viewholder.mPosition == i && !viewholder.isInvalid())
	//*  15   28:aload           4
	//*  16   30:getfield        #175 <Field int RecyclerView$ViewHolder.mPosition>
	//*  17   33:iload_1         
	//*  18   34:icmpne          47
	//*  19   37:aload           4
	//*  20   39:invokevirtual   #179 <Method boolean RecyclerView$ViewHolder.isInvalid()>
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
		LayoutPrefetchRegistryImpl layoutprefetchregistryimpl;
		if(recyclerview == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(recyclerview.mDataSetHasChangedAfterLayout && recyclerview.mChildHelper.getUnfilteredChildCount() != 0)
	//*   3    5:aload_1         
	//*   4    6:getfield        #183 <Field boolean RecyclerView.mDataSetHasChangedAfterLayout>
	//*   5    9:ifeq            26
	//*   6   12:aload_1         
	//*   7   13:getfield        #159 <Field ChildHelper RecyclerView.mChildHelper>
	//*   8   16:invokevirtual   #164 <Method int ChildHelper.getUnfilteredChildCount()>
	//*   9   19:ifeq            26
			recyclerview.removeAndRecycleViews();
	//   10   22:aload_1         
	//   11   23:invokevirtual   #186 <Method void RecyclerView.removeAndRecycleViews()>
		layoutprefetchregistryimpl = recyclerview.mPrefetchRegistry;
	//   12   26:aload_1         
	//   13   27:getfield        #67  <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   14   30:astore          5
		layoutprefetchregistryimpl.collectPrefetchPositionsFromView(recyclerview, true);
	//   15   32:aload           5
	//   16   34:aload_1         
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #71  <Method void GapWorker$LayoutPrefetchRegistryImpl.collectPrefetchPositionsFromView(RecyclerView, boolean)>
		if(layoutprefetchregistryimpl.mCount == 0)
			break MISSING_BLOCK_LABEL_112;
	//   19   39:aload           5
	//   20   41:getfield        #75  <Field int GapWorker$LayoutPrefetchRegistryImpl.mCount>
	//   21   44:ifeq            112
		TraceCompat.beginSection("RV Nested Prefetch");
	//   22   47:ldc1            #188 <String "RV Nested Prefetch">
	//   23   49:invokestatic    #194 <Method void TraceCompat.beginSection(String)>
		recyclerview.mState.prepareForNestedPrefetch(recyclerview.mAdapter);
	//   24   52:aload_1         
	//   25   53:getfield        #198 <Field RecyclerView$State RecyclerView.mState>
	//   26   56:aload_1         
	//   27   57:getfield        #202 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   28   60:invokevirtual   #208 <Method void RecyclerView$State.prepareForNestedPrefetch(RecyclerView$Adapter)>
		int i = 0;
	//   29   63:iconst_0        
	//   30   64:istore          4
_L2:
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
		if(true) goto _L2; else goto _L1
	//   50   99:goto            66
_L1:
		TraceCompat.endSection();
	//   51  102:invokestatic    #211 <Method void TraceCompat.endSection()>
		return;
	//   52  105:return          
		recyclerview;
	//   53  106:astore_1        
		TraceCompat.endSection();
	//   54  107:invokestatic    #211 <Method void TraceCompat.endSection()>
		throw recyclerview;
	//   55  110:aload_1         
	//   56  111:athrow          
	//   57  112:return          
	}

	private RecyclerView.ViewHolder prefetchPositionWithDeadline(RecyclerView recyclerview, int i, long l)
	{
		if(isPrefetchPositionAttached(recyclerview, i))
	//*   0    0:aload_1         
	//*   1    1:iload_2         
	//*   2    2:invokestatic    #214 <Method boolean isPrefetchPositionAttached(RecyclerView, int)>
	//*   3    5:ifeq            10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		recyclerview = ((RecyclerView) (recyclerview.mRecycler));
	//    6   10:aload_1         
	//    7   11:getfield        #218 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//    8   14:astore_1        
		RecyclerView.ViewHolder viewholder = ((RecyclerView.Recycler) (recyclerview)).tryGetViewHolderForPositionByDeadline(i, false, l);
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:iconst_0        
	//   12   18:lload_3         
	//   13   19:invokevirtual   #224 <Method RecyclerView$ViewHolder RecyclerView$Recycler.tryGetViewHolderForPositionByDeadline(int, boolean, long)>
	//   14   22:astore          5
		if(viewholder != null)
	//*  15   24:aload           5
	//*  16   26:ifnull          56
		{
			if(viewholder.isBound())
	//*  17   29:aload           5
	//*  18   31:invokevirtual   #227 <Method boolean RecyclerView$ViewHolder.isBound()>
	//*  19   34:ifeq            49
			{
				((RecyclerView.Recycler) (recyclerview)).recycleView(viewholder.itemView);
	//   20   37:aload_1         
	//   21   38:aload           5
	//   22   40:getfield        #231 <Field android.view.View RecyclerView$ViewHolder.itemView>
	//   23   43:invokevirtual   #235 <Method void RecyclerView$Recycler.recycleView(android.view.View)>
				return viewholder;
	//   24   46:aload           5
	//   25   48:areturn         
			}
			((RecyclerView.Recycler) (recyclerview)).addViewHolderToRecycledViewPool(viewholder, false);
	//   26   49:aload_1         
	//   27   50:aload           5
	//   28   52:iconst_0        
	//   29   53:invokevirtual   #239 <Method void RecyclerView$Recycler.addViewHolderToRecycledViewPool(RecyclerView$ViewHolder, boolean)>
		}
		return viewholder;
	//   30   56:aload           5
	//   31   58:areturn         
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
	//*   1    1:invokevirtual   #245 <Method boolean RecyclerView.isAttachedToWindow()>
	//*   2    4:ifeq            30
	//*   3    7:aload_0         
	//*   4    8:getfield        #247 <Field long mPostTimeNs>
	//*   5   11:lconst_0        
	//*   6   12:lcmp            
	//*   7   13:ifne            30
		{
			mPostTimeNs = recyclerview.getNanoTime();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #251 <Method long RecyclerView.getNanoTime()>
	//   11   21:putfield        #247 <Field long mPostTimeNs>
			recyclerview.post(((Runnable) (this)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #255 <Method boolean RecyclerView.post(Runnable)>
	//   15   29:pop             
		}
		recyclerview.mPrefetchRegistry.setPrefetchVector(i, j);
	//   16   30:aload_1         
	//   17   31:getfield        #67  <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   18   34:iload_2         
	//   19   35:iload_3         
	//   20   36:invokevirtual   #259 <Method void GapWorker$LayoutPrefetchRegistryImpl.setPrefetchVector(int, int)>
	//   21   39:return          
	}

	void prefetch(long l)
	{
		buildTaskList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #262 <Method void buildTaskList()>
		flushTasksWithDeadline(l);
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:invokespecial   #264 <Method void flushTasksWithDeadline(long)>
	//    5    9:return          
	}

	public void remove(RecyclerView recyclerview)
	{
		mRecyclerViews.remove(((Object) (recyclerview)));
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field ArrayList mRecyclerViews>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #267 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void run()
	{
		boolean flag;
		TraceCompat.beginSection("RV Prefetch");
	//    0    0:ldc2            #270 <String "RV Prefetch">
	//    1    3:invokestatic    #194 <Method void TraceCompat.beginSection(String)>
		flag = mRecyclerViews.isEmpty();
	//    2    6:aload_0         
	//    3    7:getfield        #47  <Field ArrayList mRecyclerViews>
	//    4   10:invokevirtual   #273 <Method boolean ArrayList.isEmpty()>
	//    5   13:istore_3        
		if(flag)
	//*   6   14:iload_3         
	//*   7   15:ifeq            27
		{
			mPostTimeNs = 0L;
	//    8   18:aload_0         
	//    9   19:lconst_0        
	//   10   20:putfield        #247 <Field long mPostTimeNs>
			TraceCompat.endSection();
	//   11   23:invokestatic    #211 <Method void TraceCompat.endSection()>
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
	//   36   72:invokevirtual   #276 <Method long RecyclerView.getDrawingTime()>
	//   37   75:lload           4
	//   38   77:invokestatic    #280 <Method long Math.max(long, long)>
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
	//   53  102:putfield        #247 <Field long mPostTimeNs>
			TraceCompat.endSection();
	//   54  105:invokestatic    #211 <Method void TraceCompat.endSection()>
			return;
	//   55  108:return          
		}
		prefetch(TimeUnit.MILLISECONDS.toNanos(l) + mFrameIntervalNs);
	//   56  109:aload_0         
	//   57  110:getstatic       #286 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   58  113:lload           4
	//   59  115:invokevirtual   #290 <Method long TimeUnit.toNanos(long)>
	//   60  118:aload_0         
	//   61  119:getfield        #292 <Field long mFrameIntervalNs>
	//   62  122:ladd            
	//   63  123:invokevirtual   #294 <Method void prefetch(long)>
		mPostTimeNs = 0L;
	//   64  126:aload_0         
	//   65  127:lconst_0        
	//   66  128:putfield        #247 <Field long mPostTimeNs>
		TraceCompat.endSection();
	//   67  131:invokestatic    #211 <Method void TraceCompat.endSection()>
		return;
	//   68  134:return          
		Exception exception;
		exception;
	//   69  135:astore          8
		mPostTimeNs = 0L;
	//   70  137:aload_0         
	//   71  138:lconst_0        
	//   72  139:putfield        #247 <Field long mPostTimeNs>
		TraceCompat.endSection();
	//   73  142:invokestatic    #211 <Method void TraceCompat.endSection()>
		throw exception;
	//   74  145:aload           8
	//   75  147:athrow          
	}

	static final ThreadLocal sGapWorker = new ThreadLocal();
	static Comparator sTaskComparator = new Comparator() {

		public int compare(Task task, Task task1)
		{
			int i;
			if(task.view == null)
		//*   0    0:aload_1         
		//*   1    1:getfield        #22  <Field RecyclerView GapWorker$Task.view>
		//*   2    4:ifnonnull       12
				i = 1;
		//    3    7:iconst_1        
		//    4    8:istore_3        
			else
		//*   5    9:goto            14
				i = 0;
		//    6   12:iconst_0        
		//    7   13:istore_3        
			boolean flag;
			if(task1.view == null)
		//*   8   14:aload_2         
		//*   9   15:getfield        #22  <Field RecyclerView GapWorker$Task.view>
		//*  10   18:ifnonnull       27
				flag = true;
		//   11   21:iconst_1        
		//   12   22:istore          4
			else
		//*  13   24:goto            30
				flag = false;
		//   14   27:iconst_0        
		//   15   28:istore          4
			if(i != flag)
		//*  16   30:iload_3         
		//*  17   31:iload           4
		//*  18   33:icmpeq          47
				return task.view != null ? -1 : 1;
		//   19   36:aload_1         
		//   20   37:getfield        #22  <Field RecyclerView GapWorker$Task.view>
		//   21   40:ifnonnull       45
		//   22   43:iconst_1        
		//   23   44:ireturn         
		//   24   45:iconst_m1       
		//   25   46:ireturn         
			if(task.immediate != task1.immediate)
		//*  26   47:aload_1         
		//*  27   48:getfield        #26  <Field boolean GapWorker$Task.immediate>
		//*  28   51:aload_2         
		//*  29   52:getfield        #26  <Field boolean GapWorker$Task.immediate>
		//*  30   55:icmpeq          69
				return !task.immediate ? 1 : -1;
		//   31   58:aload_1         
		//   32   59:getfield        #26  <Field boolean GapWorker$Task.immediate>
		//   33   62:ifeq            67
		//   34   65:iconst_m1       
		//   35   66:ireturn         
		//   36   67:iconst_1        
		//   37   68:ireturn         
			i = task1.viewVelocity - task.viewVelocity;
		//   38   69:aload_2         
		//   39   70:getfield        #30  <Field int GapWorker$Task.viewVelocity>
		//   40   73:aload_1         
		//   41   74:getfield        #30  <Field int GapWorker$Task.viewVelocity>
		//   42   77:isub            
		//   43   78:istore_3        
			if(i != 0)
		//*  44   79:iload_3         
		//*  45   80:ifeq            85
				return i;
		//   46   83:iload_3         
		//   47   84:ireturn         
			i = task.distanceToItem - task1.distanceToItem;
		//   48   85:aload_1         
		//   49   86:getfield        #33  <Field int GapWorker$Task.distanceToItem>
		//   50   89:aload_2         
		//   51   90:getfield        #33  <Field int GapWorker$Task.distanceToItem>
		//   52   93:isub            
		//   53   94:istore_3        
			if(i != 0)
		//*  54   95:iload_3         
		//*  55   96:ifeq            101
				return i;
		//   56   99:iload_3         
		//   57  100:ireturn         
			else
				return 0;
		//   58  101:iconst_0        
		//   59  102:ireturn         
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
