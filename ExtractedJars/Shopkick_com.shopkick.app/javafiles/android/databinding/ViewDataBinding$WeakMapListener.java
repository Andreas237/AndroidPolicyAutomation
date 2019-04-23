// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.arch.lifecycle.LifecycleOwner;

// Referenced classes of package android.databinding:
//			ViewDataBinding, ObservableMap

private static class ViewDataBinding$WeakMapListener extends ck
	implements nce
{

	public void addListener(ObservableMap observablemap)
	{
		observablemap.addOnMapChangedCallback(((ck) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #34  <Method void ObservableMap.addOnMapChangedCallback(ObservableMap$OnMapChangedCallback)>
	//    3    7:return          
	}

	public volatile void addListener(Object obj)
	{
		addListener((ObservableMap)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class ObservableMap>
	//    3    5:invokevirtual   #37  <Method void addListener(ObservableMap)>
	//    4    8:return          
	}

	public ViewDataBinding.WeakListener getListener()
	{
		return mListener;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
	//    2    4:areturn         
	}

	public void onMapChanged(ObservableMap observablemap, Object obj)
	{
		obj = ((Object) (mListener.getBinder()));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
	//    2    4:invokevirtual   #47  <Method ViewDataBinding ViewDataBinding$WeakListener.getBinder()>
	//    3    7:astore_2        
		if(obj != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          38
		{
			if(observablemap != mListener.getTarget())
	//*   6   12:aload_1         
	//*   7   13:aload_0         
	//*   8   14:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
	//*   9   17:invokevirtual   #51  <Method Object ViewDataBinding$WeakListener.getTarget()>
	//*  10   20:if_acmpeq       24
			{
				return;
	//   11   23:return          
			} else
			{
				ViewDataBinding.access$800(((ViewDataBinding) (obj)), mListener.mLocalFieldId, ((Object) (observablemap)), 0);
	//   12   24:aload_2         
	//   13   25:aload_0         
	//   14   26:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
	//   15   29:getfield        #55  <Field int ViewDataBinding$WeakListener.mLocalFieldId>
	//   16   32:aload_1         
	//   17   33:iconst_0        
	//   18   34:invokestatic    #59  <Method void ViewDataBinding.access$800(ViewDataBinding, int, Object, int)>
				return;
	//   19   37:return          
			}
		} else
		{
			return;
	//   20   38:return          
		}
	}

	public void removeListener(ObservableMap observablemap)
	{
		observablemap.removeOnMapChangedCallback(((ck) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #63  <Method void ObservableMap.removeOnMapChangedCallback(ObservableMap$OnMapChangedCallback)>
	//    3    7:return          
	}

	public volatile void removeListener(Object obj)
	{
		removeListener((ObservableMap)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class ObservableMap>
	//    3    5:invokevirtual   #65  <Method void removeListener(ObservableMap)>
	//    4    8:return          
	}

	public void setLifecycleOwner(LifecycleOwner lifecycleowner)
	{
	//    0    0:return          
	}

	final ViewDataBinding.WeakListener mListener;

	public ViewDataBinding$WeakMapListener(ViewDataBinding viewdatabinding, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void ObservableMap$OnMapChangedCallback()>
		mListener = new ViewDataBinding.WeakListener(viewdatabinding, i, ((nce) (this)));
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
