// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.os.TraceCompat;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static abstract class RecyclerView$Adapter
{

	public final void bindViewHolder(er er, int i)
	{
		er.mPosition = i;
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:putfield        #33  <Field int RecyclerView$ViewHolder.mPosition>
		if(hasStableIds())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #37  <Method boolean hasStableIds()>
	//*   5    9:ifeq            21
			er.mItemId = getItemId(i);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:iload_2         
	//    9   15:invokevirtual   #41  <Method long getItemId(int)>
	//   10   18:putfield        #45  <Field long RecyclerView$ViewHolder.mItemId>
		er.setFlags(1, 519);
	//   11   21:aload_1         
	//   12   22:iconst_1        
	//   13   23:sipush          519
	//   14   26:invokevirtual   #49  <Method void RecyclerView$ViewHolder.setFlags(int, int)>
		TraceCompat.beginSection("RV OnBindView");
	//   15   29:ldc1            #51  <String "RV OnBindView">
	//   16   31:invokestatic    #57  <Method void TraceCompat.beginSection(String)>
		onBindViewHolder(er, i, er.getUnmodifiedPayloads());
	//   17   34:aload_0         
	//   18   35:aload_1         
	//   19   36:iload_2         
	//   20   37:aload_1         
	//   21   38:invokevirtual   #61  <Method List RecyclerView$ViewHolder.getUnmodifiedPayloads()>
	//   22   41:invokevirtual   #65  <Method void onBindViewHolder(RecyclerView$ViewHolder, int, List)>
		er.clearPayload();
	//   23   44:aload_1         
	//   24   45:invokevirtual   #68  <Method void RecyclerView$ViewHolder.clearPayload()>
		er = ((er) (er.itemView.getLayoutParams()));
	//   25   48:aload_1         
	//   26   49:getfield        #72  <Field View RecyclerView$ViewHolder.itemView>
	//   27   52:invokevirtual   #78  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   28   55:astore_1        
		if(er instanceof rams)
	//*  29   56:aload_1         
	//*  30   57:instanceof      #80  <Class RecyclerView$LayoutParams>
	//*  31   60:ifeq            71
			((rams)er).mInsetsDirty = true;
	//   32   63:aload_1         
	//   33   64:checkcast       #80  <Class RecyclerView$LayoutParams>
	//   34   67:iconst_1        
	//   35   68:putfield        #83  <Field boolean RecyclerView$LayoutParams.mInsetsDirty>
		TraceCompat.endSection();
	//   36   71:invokestatic    #86  <Method void TraceCompat.endSection()>
	//   37   74:return          
	}

	public final er createViewHolder(ViewGroup viewgroup, int i)
	{
		TraceCompat.beginSection("RV CreateView");
	//    0    0:ldc1            #93  <String "RV CreateView">
	//    1    2:invokestatic    #57  <Method void TraceCompat.beginSection(String)>
		viewgroup = ((ViewGroup) (onCreateViewHolder(viewgroup, i)));
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:invokevirtual   #96  <Method RecyclerView$ViewHolder onCreateViewHolder(ViewGroup, int)>
	//    6   11:astore_1        
		if(((er) (viewgroup)).itemView.getParent() != null)
			break MISSING_BLOCK_LABEL_32;
	//    7   12:aload_1         
	//    8   13:getfield        #72  <Field View RecyclerView$ViewHolder.itemView>
	//    9   16:invokevirtual   #100 <Method android.view.ViewParent View.getParent()>
	//   10   19:ifnonnull       32
		viewgroup.mItemViewType = i;
	//   11   22:aload_1         
	//   12   23:iload_2         
	//   13   24:putfield        #103 <Field int RecyclerView$ViewHolder.mItemViewType>
		TraceCompat.endSection();
	//   14   27:invokestatic    #86  <Method void TraceCompat.endSection()>
		return ((er) (viewgroup));
	//   15   30:aload_1         
	//   16   31:areturn         
		throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
	//   17   32:new             #105 <Class IllegalStateException>
	//   18   35:dup             
	//   19   36:ldc1            #107 <String "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)">
	//   20   38:invokespecial   #109 <Method void IllegalStateException(String)>
	//   21   41:athrow          
		viewgroup;
	//   22   42:astore_1        
		TraceCompat.endSection();
	//   23   43:invokestatic    #86  <Method void TraceCompat.endSection()>
		throw viewgroup;
	//   24   46:aload_1         
	//   25   47:athrow          
	}

	public abstract int getItemCount();

	public long getItemId(int i)
	{
		return -1L;
	//    0    0:ldc2w           #114 <Long -1L>
	//    1    3:lreturn         
	}

	public int getItemViewType(int i)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean hasObservers()
	{
		return mObservable.hasObservers();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RecyclerView$AdapterDataObservable mObservable>
	//    2    4:invokevirtual   #120 <Method boolean RecyclerView$AdapterDataObservable.hasObservers()>
	//    3    7:ireturn         
	}

	public final boolean hasStableIds()
	{
		return mHasStableIds;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field boolean mHasStableIds>
	//    2    4:ireturn         
	}

	public final void notifyDataSetChanged()
	{
		mObservable.notifyChanged();
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RecyclerView$AdapterDataObservable mObservable>
	//    2    4:invokevirtual   #124 <Method void RecyclerView$AdapterDataObservable.notifyChanged()>
	//    3    7:return          
	}

	public final void notifyItemChanged(int i)
	{
		mObservable.notifyItemRangeChanged(i, 1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RecyclerView$AdapterDataObservable mObservable>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #129 <Method void RecyclerView$AdapterDataObservable.notifyItemRangeChanged(int, int)>
	//    5    9:return          
	}

	public final void notifyItemChanged(int i, Object obj)
	{
		mObservable.notifyItemRangeChanged(i, 1, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RecyclerView$AdapterDataObservable mObservable>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:aload_2         
	//    5    7:invokevirtual   #134 <Method void RecyclerView$AdapterDataObservable.notifyItemRangeChanged(int, int, Object)>
	//    6   10:return          
	}

	public final void notifyItemInserted(int i)
	{
		mObservable.notifyItemRangeInserted(i, 1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RecyclerView$AdapterDataObservable mObservable>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #138 <Method void RecyclerView$AdapterDataObservable.notifyItemRangeInserted(int, int)>
	//    5    9:return          
	}

	public final void notifyItemMoved(int i, int j)
	{
		mObservable.notifyItemMoved(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RecyclerView$AdapterDataObservable mObservable>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #141 <Method void RecyclerView$AdapterDataObservable.notifyItemMoved(int, int)>
	//    5    9:return          
	}

	public final void notifyItemRangeChanged(int i, int j)
	{
		mObservable.notifyItemRangeChanged(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RecyclerView$AdapterDataObservable mObservable>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #129 <Method void RecyclerView$AdapterDataObservable.notifyItemRangeChanged(int, int)>
	//    5    9:return          
	}

	public final void notifyItemRangeChanged(int i, int j, Object obj)
	{
		mObservable.notifyItemRangeChanged(i, j, obj);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RecyclerView$AdapterDataObservable mObservable>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #134 <Method void RecyclerView$AdapterDataObservable.notifyItemRangeChanged(int, int, Object)>
	//    6   10:return          
	}

	public final void notifyItemRangeInserted(int i, int j)
	{
		mObservable.notifyItemRangeInserted(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RecyclerView$AdapterDataObservable mObservable>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #138 <Method void RecyclerView$AdapterDataObservable.notifyItemRangeInserted(int, int)>
	//    5    9:return          
	}

	public final void notifyItemRangeRemoved(int i, int j)
	{
		mObservable.notifyItemRangeRemoved(i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RecyclerView$AdapterDataObservable mObservable>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #144 <Method void RecyclerView$AdapterDataObservable.notifyItemRangeRemoved(int, int)>
	//    5    9:return          
	}

	public final void notifyItemRemoved(int i)
	{
		mObservable.notifyItemRangeRemoved(i, 1);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RecyclerView$AdapterDataObservable mObservable>
	//    2    4:iload_1         
	//    3    5:iconst_1        
	//    4    6:invokevirtual   #144 <Method void RecyclerView$AdapterDataObservable.notifyItemRangeRemoved(int, int)>
	//    5    9:return          
	}

	public void onAttachedToRecyclerView(RecyclerView recyclerview)
	{
	//    0    0:return          
	}

	public abstract void onBindViewHolder(er er, int i);

	public void onBindViewHolder(er er, int i, List list)
	{
		onBindViewHolder(er, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #149 <Method void onBindViewHolder(RecyclerView$ViewHolder, int)>
	//    4    6:return          
	}

	public abstract er onCreateViewHolder(ViewGroup viewgroup, int i);

	public void onDetachedFromRecyclerView(RecyclerView recyclerview)
	{
	//    0    0:return          
	}

	public boolean onFailedToRecycleView(er er)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onViewAttachedToWindow(er er)
	{
	//    0    0:return          
	}

	public void onViewDetachedFromWindow(er er)
	{
	//    0    0:return          
	}

	public void onViewRecycled(er er)
	{
	//    0    0:return          
	}

	public void registerAdapterDataObserver(ataObserver ataobserver)
	{
		mObservable.registerObserver(((Object) (ataobserver)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RecyclerView$AdapterDataObservable mObservable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #165 <Method void RecyclerView$AdapterDataObservable.registerObserver(Object)>
	//    4    8:return          
	}

	public void setHasStableIds(boolean flag)
	{
		if(!hasObservers())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #168 <Method boolean hasObservers()>
	//*   2    4:ifne            13
		{
			mHasStableIds = flag;
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:putfield        #23  <Field boolean mHasStableIds>
			return;
	//    6   12:return          
		} else
		{
			throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
	//    7   13:new             #105 <Class IllegalStateException>
	//    8   16:dup             
	//    9   17:ldc1            #170 <String "Cannot change whether this adapter has stable IDs while the adapter has registered observers.">
	//   10   19:invokespecial   #109 <Method void IllegalStateException(String)>
	//   11   22:athrow          
		}
	}

	public void unregisterAdapterDataObserver(ataObserver ataobserver)
	{
		mObservable.unregisterObserver(((Object) (ataobserver)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RecyclerView$AdapterDataObservable mObservable>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #174 <Method void RecyclerView$AdapterDataObservable.unregisterObserver(Object)>
	//    4    8:return          
	}

	private boolean mHasStableIds;
	private final ataObservable mObservable = new ataObservable();

	public RecyclerView$Adapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #18  <Class RecyclerView$AdapterDataObservable>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void RecyclerView$AdapterDataObservable()>
	//    6   12:putfield        #21  <Field RecyclerView$AdapterDataObservable mObservable>
		mHasStableIds = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #23  <Field boolean mHasStableIds>
	//   10   20:return          
	}
}
