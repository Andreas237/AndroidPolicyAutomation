// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.arch.lifecycle.LifecycleOwner;

// Referenced classes of package android.databinding:
//			ViewDataBinding, ObservableList

private static class ViewDataBinding$WeakListListener extends ack
	implements ce
{

	public void addListener(ObservableList observablelist)
	{
		observablelist.addOnListChangedCallback(((ack) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #34  <Method void ObservableList.addOnListChangedCallback(ObservableList$OnListChangedCallback)>
	//    3    7:return          
	}

	public volatile void addListener(Object obj)
	{
		addListener((ObservableList)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class ObservableList>
	//    3    5:invokevirtual   #37  <Method void addListener(ObservableList)>
	//    4    8:return          
	}

	public ViewDataBinding.WeakListener getListener()
	{
		return mListener;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
	//    2    4:areturn         
	}

	public void onChanged(ObservableList observablelist)
	{
		ViewDataBinding viewdatabinding = mListener.getBinder();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
	//    2    4:invokevirtual   #46  <Method ViewDataBinding ViewDataBinding$WeakListener.getBinder()>
	//    3    7:astore_2        
		if(viewdatabinding == null)
	//*   4    8:aload_2         
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		ObservableList observablelist1 = (ObservableList)mListener.getTarget();
	//    7   13:aload_0         
	//    8   14:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
	//    9   17:invokevirtual   #50  <Method Object ViewDataBinding$WeakListener.getTarget()>
	//   10   20:checkcast       #30  <Class ObservableList>
	//   11   23:astore_3        
		if(observablelist1 != observablelist)
	//*  12   24:aload_3         
	//*  13   25:aload_1         
	//*  14   26:if_acmpeq       30
		{
			return;
	//   15   29:return          
		} else
		{
			ViewDataBinding.access$800(viewdatabinding, mListener.mLocalFieldId, ((Object) (observablelist1)), 0);
	//   16   30:aload_2         
	//   17   31:aload_0         
	//   18   32:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
	//   19   35:getfield        #54  <Field int ViewDataBinding$WeakListener.mLocalFieldId>
	//   20   38:aload_3         
	//   21   39:iconst_0        
	//   22   40:invokestatic    #58  <Method void ViewDataBinding.access$800(ViewDataBinding, int, Object, int)>
			return;
	//   23   43:return          
		}
	}

	public void onItemRangeChanged(ObservableList observablelist, int i, int j)
	{
		onChanged(observablelist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #62  <Method void onChanged(ObservableList)>
	//    3    5:return          
	}

	public void onItemRangeInserted(ObservableList observablelist, int i, int j)
	{
		onChanged(observablelist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #62  <Method void onChanged(ObservableList)>
	//    3    5:return          
	}

	public void onItemRangeMoved(ObservableList observablelist, int i, int j, int k)
	{
		onChanged(observablelist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #62  <Method void onChanged(ObservableList)>
	//    3    5:return          
	}

	public void onItemRangeRemoved(ObservableList observablelist, int i, int j)
	{
		onChanged(observablelist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #62  <Method void onChanged(ObservableList)>
	//    3    5:return          
	}

	public void removeListener(ObservableList observablelist)
	{
		observablelist.removeOnListChangedCallback(((ack) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #70  <Method void ObservableList.removeOnListChangedCallback(ObservableList$OnListChangedCallback)>
	//    3    7:return          
	}

	public volatile void removeListener(Object obj)
	{
		removeListener((ObservableList)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class ObservableList>
	//    3    5:invokevirtual   #72  <Method void removeListener(ObservableList)>
	//    4    8:return          
	}

	public void setLifecycleOwner(LifecycleOwner lifecycleowner)
	{
	//    0    0:return          
	}

	final ViewDataBinding.WeakListener mListener;

	public ViewDataBinding$WeakListListener(ViewDataBinding viewdatabinding, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void ObservableList$OnListChangedCallback()>
		mListener = new ViewDataBinding.WeakListener(viewdatabinding, i, ((ce) (this)));
	//    2    4:aload_0         
	//    3    5:new             #20  <Class ViewDataBinding$WeakListener>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:aload_0         
	//    8   12:invokespecial   #23  <Method void ViewDataBinding$WeakListener(ViewDataBinding, int, ViewDataBinding$ObservableReference)>
	//    9   15:putfield        #25  <Field ViewDataBinding$WeakListener mListener>
	//   10   18:return          
	}
}
