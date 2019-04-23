// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.os.h;
import java.lang.ref.WeakReference;
import java.util.*;
import java.util.concurrent.TimeUnit;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView, ChildHelper

final class GapWorker
	implements Runnable
{

	GapWorker()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		mRecyclerViews = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #34  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void ArrayList()>
	//    6   12:putfield        #37  <Field ArrayList mRecyclerViews>
		mTasks = new ArrayList();
	//    7   15:aload_0         
	//    8   16:new             #34  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #35  <Method void ArrayList()>
	//   11   23:putfield        #39  <Field ArrayList mTasks>
	//   12   26:return          
	}

	private void buildTaskList()
	{
		int i1 = mRecyclerViews.size();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList mRecyclerViews>
	//    2    4:invokevirtual   #44  <Method int ArrayList.size()>
	//    3    7:istore          4
		int i = 0;
	//    4    9:iconst_0        
	//    5   10:istore_1        
		int j;
		int k;
		for(j = 0; i < i1; j = k)
	//*   6   11:iconst_0        
	//*   7   12:istore_2        
	//*   8   13:iload_1         
	//*   9   14:iload           4
	//*  10   16:icmpge          73
		{
			RecyclerView recyclerview = (RecyclerView)mRecyclerViews.get(i);
	//   11   19:aload_0         
	//   12   20:getfield        #37  <Field ArrayList mRecyclerViews>
	//   13   23:iload_1         
	//   14   24:invokevirtual   #48  <Method Object ArrayList.get(int)>
	//   15   27:checkcast       #50  <Class RecyclerView>
	//   16   30:astore          8
			k = j;
	//   17   32:iload_2         
	//   18   33:istore_3        
			if(recyclerview.getWindowVisibility() == 0)
	//*  19   34:aload           8
	//*  20   36:invokevirtual   #53  <Method int RecyclerView.getWindowVisibility()>
	//*  21   39:ifne            64
			{
				recyclerview.mPrefetchRegistry.collectPrefetchPositionsFromView(recyclerview, false);
	//   22   42:aload           8
	//   23   44:getfield        #57  <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   24   47:aload           8
	//   25   49:iconst_0        
	//   26   50:invokevirtual   #63  <Method void GapWorker$LayoutPrefetchRegistryImpl.collectPrefetchPositionsFromView(RecyclerView, boolean)>
				k = j + recyclerview.mPrefetchRegistry.mCount;
	//   27   53:iload_2         
	//   28   54:aload           8
	//   29   56:getfield        #57  <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   30   59:getfield        #67  <Field int GapWorker$LayoutPrefetchRegistryImpl.mCount>
	//   31   62:iadd            
	//   32   63:istore_3        
			}
			i++;
	//   33   64:iload_1         
	//   34   65:iconst_1        
	//   35   66:iadd            
	//   36   67:istore_1        
		}

	//   37   68:iload_3         
	//   38   69:istore_2        
	//*  39   70:goto            13
		mTasks.ensureCapacity(j);
	//   40   73:aload_0         
	//   41   74:getfield        #39  <Field ArrayList mTasks>
	//   42   77:iload_2         
	//   43   78:invokevirtual   #71  <Method void ArrayList.ensureCapacity(int)>
		j = 0;
	//   44   81:iconst_0        
	//   45   82:istore_2        
		i = 0;
	//   46   83:iconst_0        
	//   47   84:istore_1        
label0:
		for(; j < i1; j++)
	//*  48   85:iload_2         
	//*  49   86:iload           4
	//*  50   88:icmpge          285
		{
			RecyclerView recyclerview1 = (RecyclerView)mRecyclerViews.get(j);
	//   51   91:aload_0         
	//   52   92:getfield        #37  <Field ArrayList mRecyclerViews>
	//   53   95:iload_2         
	//   54   96:invokevirtual   #48  <Method Object ArrayList.get(int)>
	//   55   99:checkcast       #50  <Class RecyclerView>
	//   56  102:astore          9
			if(recyclerview1.getWindowVisibility() != 0)
	//*  57  104:aload           9
	//*  58  106:invokevirtual   #53  <Method int RecyclerView.getWindowVisibility()>
	//*  59  109:ifeq            115
				continue;
	//   60  112:goto            278
			LayoutPrefetchRegistryImpl layoutprefetchregistryimpl = recyclerview1.mPrefetchRegistry;
	//   61  115:aload           9
	//   62  117:getfield        #57  <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   63  120:astore          10
			int j1 = Math.abs(layoutprefetchregistryimpl.mPrefetchDx) + Math.abs(layoutprefetchregistryimpl.mPrefetchDy);
	//   64  122:aload           10
	//   65  124:getfield        #74  <Field int GapWorker$LayoutPrefetchRegistryImpl.mPrefetchDx>
	//   66  127:invokestatic    #80  <Method int Math.abs(int)>
	//   67  130:aload           10
	//   68  132:getfield        #83  <Field int GapWorker$LayoutPrefetchRegistryImpl.mPrefetchDy>
	//   69  135:invokestatic    #80  <Method int Math.abs(int)>
	//   70  138:iadd            
	//   71  139:istore          5
			int l = 0;
	//   72  141:iconst_0        
	//   73  142:istore_3        
			do
			{
				if(l >= layoutprefetchregistryimpl.mCount * 2)
					continue label0;
	//   74  143:iload_3         
	//   75  144:aload           10
	//   76  146:getfield        #67  <Field int GapWorker$LayoutPrefetchRegistryImpl.mCount>
	//   77  149:iconst_2        
	//   78  150:imul            
	//   79  151:icmpge          278
				Task task;
				if(i >= mTasks.size())
	//*  80  154:iload_1         
	//*  81  155:aload_0         
	//*  82  156:getfield        #39  <Field ArrayList mTasks>
	//*  83  159:invokevirtual   #44  <Method int ArrayList.size()>
	//*  84  162:icmplt          187
				{
					task = new Task();
	//   85  165:new             #85  <Class GapWorker$Task>
	//   86  168:dup             
	//   87  169:invokespecial   #86  <Method void GapWorker$Task()>
	//   88  172:astore          8
					mTasks.add(((Object) (task)));
	//   89  174:aload_0         
	//   90  175:getfield        #39  <Field ArrayList mTasks>
	//   91  178:aload           8
	//   92  180:invokevirtual   #90  <Method boolean ArrayList.add(Object)>
	//   93  183:pop             
				} else
	//*  94  184:goto            200
				{
					task = (Task)mTasks.get(i);
	//   95  187:aload_0         
	//   96  188:getfield        #39  <Field ArrayList mTasks>
	//   97  191:iload_1         
	//   98  192:invokevirtual   #48  <Method Object ArrayList.get(int)>
	//   99  195:checkcast       #85  <Class GapWorker$Task>
	//  100  198:astore          8
				}
				int k1 = layoutprefetchregistryimpl.mPrefetchArray[l + 1];
	//  101  200:aload           10
	//  102  202:getfield        #94  <Field int[] GapWorker$LayoutPrefetchRegistryImpl.mPrefetchArray>
	//  103  205:iload_3         
	//  104  206:iconst_1        
	//  105  207:iadd            
	//  106  208:iaload          
	//  107  209:istore          6
				boolean flag;
				if(k1 <= j1)
	//* 108  211:iload           6
	//* 109  213:iload           5
	//* 110  215:icmpgt          224
					flag = true;
	//  111  218:iconst_1        
	//  112  219:istore          7
				else
	//* 113  221:goto            227
					flag = false;
	//  114  224:iconst_0        
	//  115  225:istore          7
				task.immediate = flag;
	//  116  227:aload           8
	//  117  229:iload           7
	//  118  231:putfield        #98  <Field boolean GapWorker$Task.immediate>
				task.viewVelocity = j1;
	//  119  234:aload           8
	//  120  236:iload           5
	//  121  238:putfield        #101 <Field int GapWorker$Task.viewVelocity>
				task.distanceToItem = k1;
	//  122  241:aload           8
	//  123  243:iload           6
	//  124  245:putfield        #104 <Field int GapWorker$Task.distanceToItem>
				task.view = recyclerview1;
	//  125  248:aload           8
	//  126  250:aload           9
	//  127  252:putfield        #108 <Field RecyclerView GapWorker$Task.view>
				task.position = layoutprefetchregistryimpl.mPrefetchArray[l];
	//  128  255:aload           8
	//  129  257:aload           10
	//  130  259:getfield        #94  <Field int[] GapWorker$LayoutPrefetchRegistryImpl.mPrefetchArray>
	//  131  262:iload_3         
	//  132  263:iaload          
	//  133  264:putfield        #111 <Field int GapWorker$Task.position>
				i++;
	//  134  267:iload_1         
	//  135  268:iconst_1        
	//  136  269:iadd            
	//  137  270:istore_1        
				l += 2;
	//  138  271:iload_3         
	//  139  272:iconst_2        
	//  140  273:iadd            
	//  141  274:istore_3        
			} while(true);
	//  142  275:goto            143
		}

	//  143  278:iload_2         
	//  144  279:iconst_1        
	//  145  280:iadd            
	//  146  281:istore_2        
	//* 147  282:goto            85
		Collections.sort(((java.util.List) (mTasks)), sTaskComparator);
	//  148  285:aload_0         
	//  149  286:getfield        #39  <Field ArrayList mTasks>
	//  150  289:getstatic       #30  <Field Comparator sTaskComparator>
	//  151  292:invokestatic    #117 <Method void Collections.sort(java.util.List, Comparator)>
	//  152  295:return          
	}

	private void flushTaskWithDeadline(Task task, long l)
	{
		long l1;
		if(task.immediate)
	//*   0    0:aload_1         
	//*   1    1:getfield        #98  <Field boolean GapWorker$Task.immediate>
	//*   2    4:ifeq            15
			l1 = 0xffffffffL;
	//    3    7:ldc2w           #120 <Long 0xffffffffL>
	//    4   10:lstore          4
		else
	//*   5   12:goto            18
			l1 = l;
	//    6   15:lload_2         
	//    7   16:lstore          4
		task = ((Task) (prefetchPositionWithDeadline(task.view, task.position, l1)));
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:getfield        #108 <Field RecyclerView GapWorker$Task.view>
	//   11   23:aload_1         
	//   12   24:getfield        #111 <Field int GapWorker$Task.position>
	//   13   27:lload           4
	//   14   29:invokespecial   #125 <Method RecyclerView$ViewHolder prefetchPositionWithDeadline(RecyclerView, int, long)>
	//   15   32:astore_1        
		if(task != null && ((RecyclerView.ViewHolder) (task)).mNestedRecyclerView != null && ((RecyclerView.ViewHolder) (task)).isBound() && !((RecyclerView.ViewHolder) (task)).isInvalid())
	//*  16   33:aload_1         
	//*  17   34:ifnull          73
	//*  18   37:aload_1         
	//*  19   38:getfield        #131 <Field WeakReference RecyclerView$ViewHolder.mNestedRecyclerView>
	//*  20   41:ifnull          73
	//*  21   44:aload_1         
	//*  22   45:invokevirtual   #135 <Method boolean RecyclerView$ViewHolder.isBound()>
	//*  23   48:ifeq            73
	//*  24   51:aload_1         
	//*  25   52:invokevirtual   #138 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*  26   55:ifne            73
			prefetchInnerRecyclerViewWithDeadline((RecyclerView)((RecyclerView.ViewHolder) (task)).mNestedRecyclerView.get(), l);
	//   27   58:aload_0         
	//   28   59:aload_1         
	//   29   60:getfield        #131 <Field WeakReference RecyclerView$ViewHolder.mNestedRecyclerView>
	//   30   63:invokevirtual   #143 <Method Object WeakReference.get()>
	//   31   66:checkcast       #50  <Class RecyclerView>
	//   32   69:lload_2         
	//   33   70:invokespecial   #147 <Method void prefetchInnerRecyclerViewWithDeadline(RecyclerView, long)>
	//   34   73:return          
	}

	private void flushTasksWithDeadline(long l)
	{
		for(int i = 0; i < mTasks.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #39  <Field ArrayList mTasks>
	//*   5    7:invokevirtual   #44  <Method int ArrayList.size()>
	//*   6   10:icmpge          54
		{
			Task task = (Task)mTasks.get(i);
	//    7   13:aload_0         
	//    8   14:getfield        #39  <Field ArrayList mTasks>
	//    9   17:iload_3         
	//   10   18:invokevirtual   #48  <Method Object ArrayList.get(int)>
	//   11   21:checkcast       #85  <Class GapWorker$Task>
	//   12   24:astore          4
			if(task.view == null)
	//*  13   26:aload           4
	//*  14   28:getfield        #108 <Field RecyclerView GapWorker$Task.view>
	//*  15   31:ifnonnull       35
				return;
	//   16   34:return          
			flushTaskWithDeadline(task, l);
	//   17   35:aload_0         
	//   18   36:aload           4
	//   19   38:lload_1         
	//   20   39:invokespecial   #151 <Method void flushTaskWithDeadline(GapWorker$Task, long)>
			task.clear();
	//   21   42:aload           4
	//   22   44:invokevirtual   #154 <Method void GapWorker$Task.clear()>
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
	//    1    1:getfield        #160 <Field ChildHelper RecyclerView.mChildHelper>
	//    2    4:invokevirtual   #165 <Method int ChildHelper.getUnfilteredChildCount()>
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
	//   10   16:getfield        #160 <Field ChildHelper RecyclerView.mChildHelper>
	//   11   19:iload_2         
	//   12   20:invokevirtual   #169 <Method android.view.View ChildHelper.getUnfilteredChildAt(int)>
	//   13   23:invokestatic    #173 <Method RecyclerView$ViewHolder RecyclerView.getChildViewHolderInt(android.view.View)>
	//   14   26:astore          4
			if(viewholder.mPosition == i && !viewholder.isInvalid())
	//*  15   28:aload           4
	//*  16   30:getfield        #176 <Field int RecyclerView$ViewHolder.mPosition>
	//*  17   33:iload_1         
	//*  18   34:icmpne          47
	//*  19   37:aload           4
	//*  20   39:invokevirtual   #138 <Method boolean RecyclerView$ViewHolder.isInvalid()>
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
	//*   4    6:getfield        #179 <Field boolean RecyclerView.mDataSetHasChangedAfterLayout>
	//*   5    9:ifeq            26
	//*   6   12:aload_1         
	//*   7   13:getfield        #160 <Field ChildHelper RecyclerView.mChildHelper>
	//*   8   16:invokevirtual   #165 <Method int ChildHelper.getUnfilteredChildCount()>
	//*   9   19:ifeq            26
			recyclerview.removeAndRecycleViews();
	//   10   22:aload_1         
	//   11   23:invokevirtual   #182 <Method void RecyclerView.removeAndRecycleViews()>
		layoutprefetchregistryimpl = recyclerview.mPrefetchRegistry;
	//   12   26:aload_1         
	//   13   27:getfield        #57  <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   14   30:astore          5
		layoutprefetchregistryimpl.collectPrefetchPositionsFromView(recyclerview, true);
	//   15   32:aload           5
	//   16   34:aload_1         
	//   17   35:iconst_1        
	//   18   36:invokevirtual   #63  <Method void GapWorker$LayoutPrefetchRegistryImpl.collectPrefetchPositionsFromView(RecyclerView, boolean)>
		if(layoutprefetchregistryimpl.mCount == 0)
			break MISSING_BLOCK_LABEL_112;
	//   19   39:aload           5
	//   20   41:getfield        #67  <Field int GapWorker$LayoutPrefetchRegistryImpl.mCount>
	//   21   44:ifeq            112
		h.a("RV Nested Prefetch");
	//   22   47:ldc1            #184 <String "RV Nested Prefetch">
	//   23   49:invokestatic    #190 <Method void h.a(String)>
		recyclerview.mState.prepareForNestedPrefetch(recyclerview.mAdapter);
	//   24   52:aload_1         
	//   25   53:getfield        #194 <Field RecyclerView$State RecyclerView.mState>
	//   26   56:aload_1         
	//   27   57:getfield        #198 <Field RecyclerView$Adapter RecyclerView.mAdapter>
	//   28   60:invokevirtual   #204 <Method void RecyclerView$State.prepareForNestedPrefetch(RecyclerView$Adapter)>
		int i = 0;
	//   29   63:iconst_0        
	//   30   64:istore          4
_L2:
		if(i >= layoutprefetchregistryimpl.mCount * 2)
			break; /* Loop/switch isn't completed */
	//   31   66:iload           4
	//   32   68:aload           5
	//   33   70:getfield        #67  <Field int GapWorker$LayoutPrefetchRegistryImpl.mCount>
	//   34   73:iconst_2        
	//   35   74:imul            
	//   36   75:icmpge          102
		prefetchPositionWithDeadline(recyclerview, layoutprefetchregistryimpl.mPrefetchArray[i], l);
	//   37   78:aload_0         
	//   38   79:aload_1         
	//   39   80:aload           5
	//   40   82:getfield        #94  <Field int[] GapWorker$LayoutPrefetchRegistryImpl.mPrefetchArray>
	//   41   85:iload           4
	//   42   87:iaload          
	//   43   88:lload_2         
	//   44   89:invokespecial   #125 <Method RecyclerView$ViewHolder prefetchPositionWithDeadline(RecyclerView, int, long)>
	//   45   92:pop             
		i += 2;
	//   46   93:iload           4
	//   47   95:iconst_2        
	//   48   96:iadd            
	//   49   97:istore          4
		if(true) goto _L2; else goto _L1
	//   50   99:goto            66
_L1:
		h.a();
	//   51  102:invokestatic    #206 <Method void h.a()>
		return;
	//   52  105:return          
		recyclerview;
	//   53  106:astore_1        
		h.a();
	//   54  107:invokestatic    #206 <Method void h.a()>
		throw recyclerview;
	//   55  110:aload_1         
	//   56  111:athrow          
	//   57  112:return          
	}

	private RecyclerView.ViewHolder prefetchPositionWithDeadline(RecyclerView recyclerview, int i, long l)
	{
		RecyclerView.Recycler recycler;
		if(isPrefetchPositionAttached(recyclerview, i))
	//*   0    0:aload_1         
	//*   1    1:iload_2         
	//*   2    2:invokestatic    #208 <Method boolean isPrefetchPositionAttached(RecyclerView, int)>
	//*   3    5:ifeq            10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		recycler = recyclerview.mRecycler;
	//    6   10:aload_1         
	//    7   11:getfield        #212 <Field RecyclerView$Recycler RecyclerView.mRecycler>
	//    8   14:astore          5
		RecyclerView.ViewHolder viewholder;
		recyclerview.onEnterLayoutOrScroll();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #215 <Method void RecyclerView.onEnterLayoutOrScroll()>
		viewholder = recycler.tryGetViewHolderForPositionByDeadline(i, false, l);
	//   11   20:aload           5
	//   12   22:iload_2         
	//   13   23:iconst_0        
	//   14   24:lload_3         
	//   15   25:invokevirtual   #221 <Method RecyclerView$ViewHolder RecyclerView$Recycler.tryGetViewHolderForPositionByDeadline(int, boolean, long)>
	//   16   28:astore          6
		if(viewholder == null)
			break MISSING_BLOCK_LABEL_72;
	//   17   30:aload           6
	//   18   32:ifnull          72
		if(viewholder.isBound() && !viewholder.isInvalid())
	//*  19   35:aload           6
	//*  20   37:invokevirtual   #135 <Method boolean RecyclerView$ViewHolder.isBound()>
	//*  21   40:ifeq            64
	//*  22   43:aload           6
	//*  23   45:invokevirtual   #138 <Method boolean RecyclerView$ViewHolder.isInvalid()>
	//*  24   48:ifne            64
		{
			recycler.recycleView(viewholder.itemView);
	//   25   51:aload           5
	//   26   53:aload           6
	//   27   55:getfield        #225 <Field android.view.View RecyclerView$ViewHolder.itemView>
	//   28   58:invokevirtual   #229 <Method void RecyclerView$Recycler.recycleView(android.view.View)>
			break MISSING_BLOCK_LABEL_72;
	//   29   61:goto            72
		}
		recycler.addViewHolderToRecycledViewPool(viewholder, false);
	//   30   64:aload           5
	//   31   66:aload           6
	//   32   68:iconst_0        
	//   33   69:invokevirtual   #233 <Method void RecyclerView$Recycler.addViewHolderToRecycledViewPool(RecyclerView$ViewHolder, boolean)>
		recyclerview.onExitLayoutOrScroll(false);
	//   34   72:aload_1         
	//   35   73:iconst_0        
	//   36   74:invokevirtual   #237 <Method void RecyclerView.onExitLayoutOrScroll(boolean)>
		return viewholder;
	//   37   77:aload           6
	//   38   79:areturn         
		Exception exception;
		exception;
	//   39   80:astore          5
		recyclerview.onExitLayoutOrScroll(false);
	//   40   82:aload_1         
	//   41   83:iconst_0        
	//   42   84:invokevirtual   #237 <Method void RecyclerView.onExitLayoutOrScroll(boolean)>
		throw exception;
	//   43   87:aload           5
	//   44   89:athrow          
	}

	public void add(RecyclerView recyclerview)
	{
		mRecyclerViews.add(((Object) (recyclerview)));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList mRecyclerViews>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #90  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	void postFromTraversal(RecyclerView recyclerview, int i, int j)
	{
		if(recyclerview.isAttachedToWindow() && mPostTimeNs == 0L)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #243 <Method boolean RecyclerView.isAttachedToWindow()>
	//*   2    4:ifeq            30
	//*   3    7:aload_0         
	//*   4    8:getfield        #245 <Field long mPostTimeNs>
	//*   5   11:lconst_0        
	//*   6   12:lcmp            
	//*   7   13:ifne            30
		{
			mPostTimeNs = recyclerview.getNanoTime();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #249 <Method long RecyclerView.getNanoTime()>
	//   11   21:putfield        #245 <Field long mPostTimeNs>
			recyclerview.post(((Runnable) (this)));
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #253 <Method boolean RecyclerView.post(Runnable)>
	//   15   29:pop             
		}
		recyclerview.mPrefetchRegistry.setPrefetchVector(i, j);
	//   16   30:aload_1         
	//   17   31:getfield        #57  <Field GapWorker$LayoutPrefetchRegistryImpl RecyclerView.mPrefetchRegistry>
	//   18   34:iload_2         
	//   19   35:iload_3         
	//   20   36:invokevirtual   #257 <Method void GapWorker$LayoutPrefetchRegistryImpl.setPrefetchVector(int, int)>
	//   21   39:return          
	}

	void prefetch(long l)
	{
		buildTaskList();
	//    0    0:aload_0         
	//    1    1:invokespecial   #260 <Method void buildTaskList()>
		flushTasksWithDeadline(l);
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:invokespecial   #262 <Method void flushTasksWithDeadline(long)>
	//    5    9:return          
	}

	public void remove(RecyclerView recyclerview)
	{
		mRecyclerViews.remove(((Object) (recyclerview)));
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList mRecyclerViews>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #265 <Method boolean ArrayList.remove(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void run()
	{
		boolean flag;
		h.a("RV Prefetch");
	//    0    0:ldc2            #268 <String "RV Prefetch">
	//    1    3:invokestatic    #190 <Method void h.a(String)>
		flag = mRecyclerViews.isEmpty();
	//    2    6:aload_0         
	//    3    7:getfield        #37  <Field ArrayList mRecyclerViews>
	//    4   10:invokevirtual   #271 <Method boolean ArrayList.isEmpty()>
	//    5   13:istore_3        
		if(flag)
	//*   6   14:iload_3         
	//*   7   15:ifeq            27
		{
			mPostTimeNs = 0L;
	//    8   18:aload_0         
	//    9   19:lconst_0        
	//   10   20:putfield        #245 <Field long mPostTimeNs>
			h.a();
	//   11   23:invokestatic    #206 <Method void h.a()>
			return;
	//   12   26:return          
		}
		int j = mRecyclerViews.size();
	//   13   27:aload_0         
	//   14   28:getfield        #37  <Field ArrayList mRecyclerViews>
	//   15   31:invokevirtual   #44  <Method int ArrayList.size()>
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
	//   23   42:icmpge          93
_L1:
		RecyclerView recyclerview = (RecyclerView)mRecyclerViews.get(i);
	//   24   45:aload_0         
	//   25   46:getfield        #37  <Field ArrayList mRecyclerViews>
	//   26   49:iload_1         
	//   27   50:invokevirtual   #48  <Method Object ArrayList.get(int)>
	//   28   53:checkcast       #50  <Class RecyclerView>
	//   29   56:astore          8
		long l1 = l;
	//   30   58:lload           4
	//   31   60:lstore          6
		if(recyclerview.getWindowVisibility() == 0)
	//*  32   62:aload           8
	//*  33   64:invokevirtual   #53  <Method int RecyclerView.getWindowVisibility()>
	//*  34   67:ifne            82
			l1 = Math.max(recyclerview.getDrawingTime(), l);
	//   35   70:aload           8
	//   36   72:invokevirtual   #274 <Method long RecyclerView.getDrawingTime()>
	//   37   75:lload           4
	//   38   77:invokestatic    #278 <Method long Math.max(long, long)>
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
	//   53  102:putfield        #245 <Field long mPostTimeNs>
			h.a();
	//   54  105:invokestatic    #206 <Method void h.a()>
			return;
	//   55  108:return          
		}
		prefetch(TimeUnit.MILLISECONDS.toNanos(l) + mFrameIntervalNs);
	//   56  109:aload_0         
	//   57  110:getstatic       #284 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   58  113:lload           4
	//   59  115:invokevirtual   #288 <Method long TimeUnit.toNanos(long)>
	//   60  118:aload_0         
	//   61  119:getfield        #290 <Field long mFrameIntervalNs>
	//   62  122:ladd            
	//   63  123:invokevirtual   #292 <Method void prefetch(long)>
		mPostTimeNs = 0L;
	//   64  126:aload_0         
	//   65  127:lconst_0        
	//   66  128:putfield        #245 <Field long mPostTimeNs>
		h.a();
	//   67  131:invokestatic    #206 <Method void h.a()>
		return;
	//   68  134:return          
		Exception exception;
		exception;
	//   69  135:astore          8
		mPostTimeNs = 0L;
	//   70  137:aload_0         
	//   71  138:lconst_0        
	//   72  139:putfield        #245 <Field long mPostTimeNs>
		h.a();
	//   73  142:invokestatic    #206 <Method void h.a()>
		throw exception;
	//   74  145:aload           8
	//   75  147:athrow          
	}

	static final ThreadLocal sGapWorker = new ThreadLocal();
	static Comparator sTaskComparator = new _cls1();
	long mFrameIntervalNs;
	long mPostTimeNs;
	ArrayList mRecyclerViews;
	private ArrayList mTasks;

	static 
	{
	//    0    0:new             #20  <Class ThreadLocal>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void ThreadLocal()>
	//    3    7:putstatic       #25  <Field ThreadLocal sGapWorker>
	//    4   10:new             #27  <Class GapWorker$1>
	//    5   13:dup             
	//    6   14:invokespecial   #28  <Method void GapWorker$1()>
	//    7   17:putstatic       #30  <Field Comparator sTaskComparator>
	//*   8   20:return          
	}

	private class LayoutPrefetchRegistryImpl
		implements RecyclerView.LayoutManager.LayoutPrefetchRegistry
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
		//    5    9:getfield        #21  <Field int mCount>
		//    6   12:iconst_2        
		//    7   13:imul            
		//    8   14:istore_3        
					int ai[] = mPrefetchArray;
		//    9   15:aload_0         
		//   10   16:getfield        #23  <Field int[] mPrefetchArray>
		//   11   19:astore          4
					if(ai == null)
		//*  12   21:aload           4
		//*  13   23:ifnonnull       44
					{
						mPrefetchArray = new int[4];
		//   14   26:aload_0         
		//   15   27:iconst_4        
		//   16   28:newarray        int[]
		//   17   30:putfield        #23  <Field int[] mPrefetchArray>
						Arrays.fill(mPrefetchArray, -1);
		//   18   33:aload_0         
		//   19   34:getfield        #23  <Field int[] mPrefetchArray>
		//   20   37:iconst_m1       
		//   21   38:invokestatic    #29  <Method void Arrays.fill(int[], int)>
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
		//   32   57:putfield        #23  <Field int[] mPrefetchArray>
						System.arraycopy(((Object) (ai)), 0, ((Object) (mPrefetchArray)), 0, ai.length);
		//   33   60:aload           4
		//   34   62:iconst_0        
		//   35   63:aload_0         
		//   36   64:getfield        #23  <Field int[] mPrefetchArray>
		//   37   67:iconst_0        
		//   38   68:aload           4
		//   39   70:arraylength     
		//   40   71:invokestatic    #35  <Method void System.arraycopy(Object, int, Object, int, int)>
					}
					ai = mPrefetchArray;
		//   41   74:aload_0         
		//   42   75:getfield        #23  <Field int[] mPrefetchArray>
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
		//   56   94:getfield        #21  <Field int mCount>
		//   57   97:iconst_1        
		//   58   98:iadd            
		//   59   99:putfield        #21  <Field int mCount>
					return;
		//   60  102:return          
				} else
				{
					throw new IllegalArgumentException("Pixel distance must be non-negative");
		//   61  103:new             #37  <Class IllegalArgumentException>
		//   62  106:dup             
		//   63  107:ldc1            #39  <String "Pixel distance must be non-negative">
		//   64  109:invokespecial   #42  <Method void IllegalArgumentException(String)>
		//   65  112:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("Layout positions must be non-negative");
		//   66  113:new             #37  <Class IllegalArgumentException>
		//   67  116:dup             
		//   68  117:ldc1            #44  <String "Layout positions must be non-negative">
		//   69  119:invokespecial   #42  <Method void IllegalArgumentException(String)>
		//   70  122:athrow          
			}
		}

		void clearPrefetchPositions()
		{
			int ai[] = mPrefetchArray;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field int[] mPrefetchArray>
		//    2    4:astore_1        
			if(ai != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          14
				Arrays.fill(ai, -1);
		//    5    9:aload_1         
		//    6   10:iconst_m1       
		//    7   11:invokestatic    #29  <Method void Arrays.fill(int[], int)>
			mCount = 0;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #21  <Field int mCount>
		//   11   19:return          
		}

		void collectPrefetchPositionsFromView(RecyclerView recyclerview, boolean flag)
		{
			mCount = 0;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #21  <Field int mCount>
			int ai[] = mPrefetchArray;
		//    3    5:aload_0         
		//    4    6:getfield        #23  <Field int[] mPrefetchArray>
		//    5    9:astore_3        
			if(ai != null)
		//*   6   10:aload_3         
		//*   7   11:ifnull          19
				Arrays.fill(ai, -1);
		//    8   14:aload_3         
		//    9   15:iconst_m1       
		//   10   16:invokestatic    #29  <Method void Arrays.fill(int[], int)>
			RecyclerView.LayoutManager layoutmanager = recyclerview.mLayout;
		//   11   19:aload_1         
		//   12   20:getfield        #53  <Field RecyclerView$LayoutManager RecyclerView.mLayout>
		//   13   23:astore_3        
			if(recyclerview.mAdapter != null && layoutmanager != null && layoutmanager.isItemPrefetchEnabled())
		//*  14   24:aload_1         
		//*  15   25:getfield        #57  <Field RecyclerView$Adapter RecyclerView.mAdapter>
		//*  16   28:ifnull          126
		//*  17   31:aload_3         
		//*  18   32:ifnull          126
		//*  19   35:aload_3         
		//*  20   36:invokevirtual   #63  <Method boolean RecyclerView$LayoutManager.isItemPrefetchEnabled()>
		//*  21   39:ifeq            126
			{
				if(flag)
		//*  22   42:iload_2         
		//*  23   43:ifeq            71
				{
					if(!recyclerview.mAdapterHelper.hasPendingUpdates())
		//*  24   46:aload_1         
		//*  25   47:getfield        #67  <Field AdapterHelper RecyclerView.mAdapterHelper>
		//*  26   50:invokevirtual   #72  <Method boolean AdapterHelper.hasPendingUpdates()>
		//*  27   53:ifne            95
						layoutmanager.collectInitialPrefetchPositions(recyclerview.mAdapter.getItemCount(), ((RecyclerView.LayoutManager.LayoutPrefetchRegistry) (this)));
		//   28   56:aload_3         
		//   29   57:aload_1         
		//   30   58:getfield        #57  <Field RecyclerView$Adapter RecyclerView.mAdapter>
		//   31   61:invokevirtual   #78  <Method int RecyclerView$Adapter.getItemCount()>
		//   32   64:aload_0         
		//   33   65:invokevirtual   #82  <Method void RecyclerView$LayoutManager.collectInitialPrefetchPositions(int, RecyclerView$LayoutManager$LayoutPrefetchRegistry)>
				} else
		//*  34   68:goto            95
				if(!recyclerview.hasPendingAdapterUpdates())
		//*  35   71:aload_1         
		//*  36   72:invokevirtual   #85  <Method boolean RecyclerView.hasPendingAdapterUpdates()>
		//*  37   75:ifne            95
					layoutmanager.collectAdjacentPrefetchPositions(mPrefetchDx, mPrefetchDy, recyclerview.mState, ((RecyclerView.LayoutManager.LayoutPrefetchRegistry) (this)));
		//   38   78:aload_3         
		//   39   79:aload_0         
		//   40   80:getfield        #87  <Field int mPrefetchDx>
		//   41   83:aload_0         
		//   42   84:getfield        #89  <Field int mPrefetchDy>
		//   43   87:aload_1         
		//   44   88:getfield        #93  <Field RecyclerView$State RecyclerView.mState>
		//   45   91:aload_0         
		//   46   92:invokevirtual   #97  <Method void RecyclerView$LayoutManager.collectAdjacentPrefetchPositions(int, int, RecyclerView$State, RecyclerView$LayoutManager$LayoutPrefetchRegistry)>
				if(mCount > layoutmanager.mPrefetchMaxCountObserved)
		//*  47   95:aload_0         
		//*  48   96:getfield        #21  <Field int mCount>
		//*  49   99:aload_3         
		//*  50  100:getfield        #100 <Field int RecyclerView$LayoutManager.mPrefetchMaxCountObserved>
		//*  51  103:icmple          126
				{
					layoutmanager.mPrefetchMaxCountObserved = mCount;
		//   52  106:aload_3         
		//   53  107:aload_0         
		//   54  108:getfield        #21  <Field int mCount>
		//   55  111:putfield        #100 <Field int RecyclerView$LayoutManager.mPrefetchMaxCountObserved>
					layoutmanager.mPrefetchMaxObservedInInitialPrefetch = flag;
		//   56  114:aload_3         
		//   57  115:iload_2         
		//   58  116:putfield        #104 <Field boolean RecyclerView$LayoutManager.mPrefetchMaxObservedInInitialPrefetch>
					recyclerview.mRecycler.updateViewCacheSize();
		//   59  119:aload_1         
		//   60  120:getfield        #108 <Field RecyclerView$Recycler RecyclerView.mRecycler>
		//   61  123:invokevirtual   #113 <Method void RecyclerView$Recycler.updateViewCacheSize()>
				}
			}
		//   62  126:return          
		}

		boolean lastPrefetchIncludedPosition(int i)
		{
			if(mPrefetchArray != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field int[] mPrefetchArray>
		//*   2    4:ifnull          40
			{
				int k = mCount;
		//    3    7:aload_0         
		//    4    8:getfield        #21  <Field int mCount>
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
		//*  14   22:getfield        #23  <Field int[] mPrefetchArray>
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
		//    2    2:putfield        #87  <Field int mPrefetchDx>
			mPrefetchDy = j;
		//    3    5:aload_0         
		//    4    6:iload_2         
		//    5    7:putfield        #89  <Field int mPrefetchDy>
		//    6   10:return          
		}

		int mCount;
		int mPrefetchArray[];
		int mPrefetchDx;
		int mPrefetchDy;

		LayoutPrefetchRegistryImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}


	private class Task
	{

		public void clear()
		{
			immediate = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #20  <Field boolean immediate>
			viewVelocity = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #22  <Field int viewVelocity>
			distanceToItem = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #24  <Field int distanceToItem>
			view = null;
		//    9   15:aload_0         
		//   10   16:aconst_null     
		//   11   17:putfield        #26  <Field RecyclerView view>
			position = 0;
		//   12   20:aload_0         
		//   13   21:iconst_0        
		//   14   22:putfield        #28  <Field int position>
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
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}
	}


	private class _cls1
		implements Comparator
	{

		public int compare(Task task, Task task1)
		{
			RecyclerView recyclerview = task.view;
		//    0    0:aload_1         
		//    1    1:getfield        #19  <Field RecyclerView GapWorker$Task.view>
		//    2    4:astore          6
			boolean flag1 = true;
		//    3    6:iconst_1        
		//    4    7:istore          5
			int i;
			if(recyclerview == null)
		//*   5    9:aload           6
		//*   6   11:ifnonnull       19
				i = 1;
		//    7   14:iconst_1        
		//    8   15:istore_3        
			else
		//*   9   16:goto            21
				i = 0;
		//   10   19:iconst_0        
		//   11   20:istore_3        
			boolean flag;
			if(task1.view == null)
		//*  12   21:aload_2         
		//*  13   22:getfield        #19  <Field RecyclerView GapWorker$Task.view>
		//*  14   25:ifnonnull       34
				flag = true;
		//   15   28:iconst_1        
		//   16   29:istore          4
			else
		//*  17   31:goto            37
				flag = false;
		//   18   34:iconst_0        
		//   19   35:istore          4
			if(i != flag)
		//*  20   37:iload_3         
		//*  21   38:iload           4
		//*  22   40:icmpeq          54
				return task.view != null ? -1 : 1;
		//   23   43:aload_1         
		//   24   44:getfield        #19  <Field RecyclerView GapWorker$Task.view>
		//   25   47:ifnonnull       52
		//   26   50:iconst_1        
		//   27   51:ireturn         
		//   28   52:iconst_m1       
		//   29   53:ireturn         
			if(task.immediate != task1.immediate)
		//*  30   54:aload_1         
		//*  31   55:getfield        #23  <Field boolean GapWorker$Task.immediate>
		//*  32   58:aload_2         
		//*  33   59:getfield        #23  <Field boolean GapWorker$Task.immediate>
		//*  34   62:icmpeq          79
			{
				i = ((int) (flag1));
		//   35   65:iload           5
		//   36   67:istore_3        
				if(task.immediate)
		//*  37   68:aload_1         
		//*  38   69:getfield        #23  <Field boolean GapWorker$Task.immediate>
		//*  39   72:ifeq            77
					i = -1;
		//   40   75:iconst_m1       
		//   41   76:istore_3        
				return i;
		//   42   77:iload_3         
		//   43   78:ireturn         
			}
			i = task1.viewVelocity - task.viewVelocity;
		//   44   79:aload_2         
		//   45   80:getfield        #27  <Field int GapWorker$Task.viewVelocity>
		//   46   83:aload_1         
		//   47   84:getfield        #27  <Field int GapWorker$Task.viewVelocity>
		//   48   87:isub            
		//   49   88:istore_3        
			if(i != 0)
		//*  50   89:iload_3         
		//*  51   90:ifeq            95
				return i;
		//   52   93:iload_3         
		//   53   94:ireturn         
			i = task.distanceToItem - task1.distanceToItem;
		//   54   95:aload_1         
		//   55   96:getfield        #30  <Field int GapWorker$Task.distanceToItem>
		//   56   99:aload_2         
		//   57  100:getfield        #30  <Field int GapWorker$Task.distanceToItem>
		//   58  103:isub            
		//   59  104:istore_3        
			if(i != 0)
		//*  60  105:iload_3         
		//*  61  106:ifeq            111
				return i;
		//   62  109:iload_3         
		//   63  110:ireturn         
			else
				return 0;
		//   64  111:iconst_0        
		//   65  112:ireturn         
		}

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((Task)obj, (Task)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #15  <Class GapWorker$Task>
		//    3    5:aload_2         
		//    4    6:checkcast       #15  <Class GapWorker$Task>
		//    5    9:invokevirtual   #33  <Method int compare(GapWorker$Task, GapWorker$Task)>
		//    6   12:ireturn         
		}

		_cls1()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #10  <Method void Object()>
		//    2    4:return          
		}
	}

}
