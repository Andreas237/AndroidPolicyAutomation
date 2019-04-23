// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.arch.lifecycle.*;

// Referenced classes of package android.databinding:
//			ViewDataBinding

private static class ViewDataBinding$LiveDataListener
	implements Observer, ce
{

	public void addListener(LiveData livedata)
	{
		LifecycleOwner lifecycleowner = mLifecycleOwner;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field LifecycleOwner mLifecycleOwner>
	//    2    4:astore_2        
		if(lifecycleowner != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
			livedata.observe(lifecycleowner, ((Observer) (this)));
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #40  <Method void LiveData.observe(LifecycleOwner, Observer)>
	//    9   15:return          
	}

	public volatile void addListener(Object obj)
	{
		addListener((LiveData)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class LiveData>
	//    3    5:invokevirtual   #45  <Method void addListener(LiveData)>
	//    4    8:return          
	}

	public ViewDataBinding.WeakListener getListener()
	{
		return mListener;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ViewDataBinding$WeakListener mListener>
	//    2    4:areturn         
	}

	public void onChanged(Object obj)
	{
		ViewDataBinding.access$800(mListener.getBinder(), mListener.mLocalFieldId, mListener.getTarget(), 0);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ViewDataBinding$WeakListener mListener>
	//    2    4:invokevirtual   #54  <Method ViewDataBinding ViewDataBinding$WeakListener.getBinder()>
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field ViewDataBinding$WeakListener mListener>
	//    5   11:getfield        #58  <Field int ViewDataBinding$WeakListener.mLocalFieldId>
	//    6   14:aload_0         
	//    7   15:getfield        #29  <Field ViewDataBinding$WeakListener mListener>
	//    8   18:invokevirtual   #62  <Method Object ViewDataBinding$WeakListener.getTarget()>
	//    9   21:iconst_0        
	//   10   22:invokestatic    #66  <Method void ViewDataBinding.access$800(ViewDataBinding, int, Object, int)>
	//   11   25:return          
	}

	public void removeListener(LiveData livedata)
	{
		livedata.removeObserver(((Observer) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #72  <Method void LiveData.removeObserver(Observer)>
	//    3    5:return          
	}

	public volatile void removeListener(Object obj)
	{
		removeListener((LiveData)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #36  <Class LiveData>
	//    3    5:invokevirtual   #74  <Method void removeListener(LiveData)>
	//    4    8:return          
	}

	public void setLifecycleOwner(LifecycleOwner lifecycleowner)
	{
		LiveData livedata = (LiveData)mListener.getTarget();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ViewDataBinding$WeakListener mListener>
	//    2    4:invokevirtual   #62  <Method Object ViewDataBinding$WeakListener.getTarget()>
	//    3    7:checkcast       #36  <Class LiveData>
	//    4   10:astore_2        
		if(livedata != null)
	//*   5   11:aload_2         
	//*   6   12:ifnull          37
		{
			if(mLifecycleOwner != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #34  <Field LifecycleOwner mLifecycleOwner>
	//*   9   19:ifnull          27
				livedata.removeObserver(((Observer) (this)));
	//   10   22:aload_2         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #72  <Method void LiveData.removeObserver(Observer)>
			if(lifecycleowner != null)
	//*  13   27:aload_1         
	//*  14   28:ifnull          37
				livedata.observe(lifecycleowner, ((Observer) (this)));
	//   15   31:aload_2         
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:invokevirtual   #40  <Method void LiveData.observe(LifecycleOwner, Observer)>
		}
		mLifecycleOwner = lifecycleowner;
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:putfield        #34  <Field LifecycleOwner mLifecycleOwner>
	//   22   42:return          
	}

	LifecycleOwner mLifecycleOwner;
	final ViewDataBinding.WeakListener mListener;

	public ViewDataBinding$LiveDataListener(ViewDataBinding viewdatabinding, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mListener = new ViewDataBinding.WeakListener(viewdatabinding, i, ((ce) (this)));
	//    2    4:aload_0         
	//    3    5:new             #24  <Class ViewDataBinding$WeakListener>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:iload_2         
	//    7   11:aload_0         
	//    8   12:invokespecial   #27  <Method void ViewDataBinding$WeakListener(ViewDataBinding, int, ViewDataBinding$ObservableReference)>
	//    9   15:putfield        #29  <Field ViewDataBinding$WeakListener mListener>
	//   10   18:return          
	}
}
