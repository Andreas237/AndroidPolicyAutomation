// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.database.Observable;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

static class RecyclerView$AdapterDataObservable extends Observable
{

	public boolean hasObservers()
	{
		return !mObservers.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ArrayList mObservers>
	//    2    4:invokevirtual   #24  <Method boolean ArrayList.isEmpty()>
	//    3    7:ifne            12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public void notifyChanged()
	{
		for(int i = mObservers.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ArrayList mObservers>
	//*   2    4:invokevirtual   #29  <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            35
			((RecyclerView.AdapterDataObserver)mObservers.get(i)).onChanged();
	//    8   14:aload_0         
	//    9   15:getfield        #19  <Field ArrayList mObservers>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #33  <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #35  <Class RecyclerView$AdapterDataObserver>
	//   13   25:invokevirtual   #38  <Method void RecyclerView$AdapterDataObserver.onChanged()>

	//   14   28:iload_1         
	//   15   29:iconst_1        
	//   16   30:isub            
	//   17   31:istore_1        
	//*  18   32:goto            10
	//   19   35:return          
	}

	public void notifyItemMoved(int i, int j)
	{
		for(int k = mObservers.size() - 1; k >= 0; k--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ArrayList mObservers>
	//*   2    4:invokevirtual   #29  <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_3        
	//*   6   10:iload_3         
	//*   7   11:iflt            38
			((RecyclerView.AdapterDataObserver)mObservers.get(k)).onItemRangeMoved(i, j, 1);
	//    8   14:aload_0         
	//    9   15:getfield        #19  <Field ArrayList mObservers>
	//   10   18:iload_3         
	//   11   19:invokevirtual   #33  <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #35  <Class RecyclerView$AdapterDataObserver>
	//   13   25:iload_1         
	//   14   26:iload_2         
	//   15   27:iconst_1        
	//   16   28:invokevirtual   #44  <Method void RecyclerView$AdapterDataObserver.onItemRangeMoved(int, int, int)>

	//   17   31:iload_3         
	//   18   32:iconst_1        
	//   19   33:isub            
	//   20   34:istore_3        
	//*  21   35:goto            10
	//   22   38:return          
	}

	public void notifyItemRangeChanged(int i, int j)
	{
		notifyItemRangeChanged(i, j, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #48  <Method void notifyItemRangeChanged(int, int, Object)>
	//    5    7:return          
	}

	public void notifyItemRangeChanged(int i, int j, Object obj)
	{
		for(int k = mObservers.size() - 1; k >= 0; k--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ArrayList mObservers>
	//*   2    4:invokevirtual   #29  <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore          4
	//*   6   11:iload           4
	//*   7   13:iflt            43
			((RecyclerView.AdapterDataObserver)mObservers.get(k)).onItemRangeChanged(i, j, obj);
	//    8   16:aload_0         
	//    9   17:getfield        #19  <Field ArrayList mObservers>
	//   10   20:iload           4
	//   11   22:invokevirtual   #33  <Method Object ArrayList.get(int)>
	//   12   25:checkcast       #35  <Class RecyclerView$AdapterDataObserver>
	//   13   28:iload_1         
	//   14   29:iload_2         
	//   15   30:aload_3         
	//   16   31:invokevirtual   #51  <Method void RecyclerView$AdapterDataObserver.onItemRangeChanged(int, int, Object)>

	//   17   34:iload           4
	//   18   36:iconst_1        
	//   19   37:isub            
	//   20   38:istore          4
	//*  21   40:goto            11
	//   22   43:return          
	}

	public void notifyItemRangeInserted(int i, int j)
	{
		for(int k = mObservers.size() - 1; k >= 0; k--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ArrayList mObservers>
	//*   2    4:invokevirtual   #29  <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_3        
	//*   6   10:iload_3         
	//*   7   11:iflt            37
			((RecyclerView.AdapterDataObserver)mObservers.get(k)).onItemRangeInserted(i, j);
	//    8   14:aload_0         
	//    9   15:getfield        #19  <Field ArrayList mObservers>
	//   10   18:iload_3         
	//   11   19:invokevirtual   #33  <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #35  <Class RecyclerView$AdapterDataObserver>
	//   13   25:iload_1         
	//   14   26:iload_2         
	//   15   27:invokevirtual   #55  <Method void RecyclerView$AdapterDataObserver.onItemRangeInserted(int, int)>

	//   16   30:iload_3         
	//   17   31:iconst_1        
	//   18   32:isub            
	//   19   33:istore_3        
	//*  20   34:goto            10
	//   21   37:return          
	}

	public void notifyItemRangeRemoved(int i, int j)
	{
		for(int k = mObservers.size() - 1; k >= 0; k--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field ArrayList mObservers>
	//*   2    4:invokevirtual   #29  <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_3        
	//*   6   10:iload_3         
	//*   7   11:iflt            37
			((RecyclerView.AdapterDataObserver)mObservers.get(k)).onItemRangeRemoved(i, j);
	//    8   14:aload_0         
	//    9   15:getfield        #19  <Field ArrayList mObservers>
	//   10   18:iload_3         
	//   11   19:invokevirtual   #33  <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #35  <Class RecyclerView$AdapterDataObserver>
	//   13   25:iload_1         
	//   14   26:iload_2         
	//   15   27:invokevirtual   #59  <Method void RecyclerView$AdapterDataObserver.onItemRangeRemoved(int, int)>

	//   16   30:iload_3         
	//   17   31:iconst_1        
	//   18   32:isub            
	//   19   33:istore_3        
	//*  20   34:goto            10
	//   21   37:return          
	}

	RecyclerView$AdapterDataObservable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Observable()>
	//    2    4:return          
	}
}
