// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.arch.lifecycle.LifecycleOwner;

// Referenced classes of package android.databinding:
//			ViewDataBinding, Observable

private static class ViewDataBinding$WeakPropertyListener extends Observable$OnPropertyChangedCallback
	implements ViewDataBinding.ObservableReference
{

	public void addListener(Observable observable)
	{
		observable.addOnPropertyChangedCallback(((Observable$OnPropertyChangedCallback) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #34  <Method void Observable.addOnPropertyChangedCallback(Observable$OnPropertyChangedCallback)>
	//    3    7:return          
	}

	public volatile void addListener(Object obj)
	{
		addListener((Observable)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class Observable>
	//    3    5:invokevirtual   #37  <Method void addListener(Observable)>
	//    4    8:return          
	}

	public ViewDataBinding.WeakListener getListener()
	{
		return mListener;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
	//    2    4:areturn         
	}

	public void onPropertyChanged(Observable observable, int i)
	{
		ViewDataBinding viewdatabinding = mListener.getBinder();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
	//    2    4:invokevirtual   #47  <Method ViewDataBinding ViewDataBinding$WeakListener.getBinder()>
	//    3    7:astore_3        
		if(viewdatabinding == null)
	//*   4    8:aload_3         
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		if((Observable)mListener.getTarget() != observable)
	//*   7   13:aload_0         
	//*   8   14:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
	//*   9   17:invokevirtual   #51  <Method Object ViewDataBinding$WeakListener.getTarget()>
	//*  10   20:checkcast       #30  <Class Observable>
	//*  11   23:aload_1         
	//*  12   24:if_acmpeq       28
		{
			return;
	//   13   27:return          
		} else
		{
			ViewDataBinding.access$800(viewdatabinding, mListener.mLocalFieldId, ((Object) (observable)), i);
	//   14   28:aload_3         
	//   15   29:aload_0         
	//   16   30:getfield        #25  <Field ViewDataBinding$WeakListener mListener>
	//   17   33:getfield        #55  <Field int ViewDataBinding$WeakListener.mLocalFieldId>
	//   18   36:aload_1         
	//   19   37:iload_2         
	//   20   38:invokestatic    #59  <Method void ViewDataBinding.access$800(ViewDataBinding, int, Object, int)>
			return;
	//   21   41:return          
		}
	}

	public void removeListener(Observable observable)
	{
		observable.removeOnPropertyChangedCallback(((Observable$OnPropertyChangedCallback) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #63  <Method void Observable.removeOnPropertyChangedCallback(Observable$OnPropertyChangedCallback)>
	//    3    7:return          
	}

	public volatile void removeListener(Object obj)
	{
		removeListener((Observable)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #30  <Class Observable>
	//    3    5:invokevirtual   #65  <Method void removeListener(Observable)>
	//    4    8:return          
	}

	public void setLifecycleOwner(LifecycleOwner lifecycleowner)
	{
	//    0    0:return          
	}

	final ViewDataBinding.WeakListener mListener;

	public ViewDataBinding$WeakPropertyListener(ViewDataBinding viewdatabinding, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Observable$OnPropertyChangedCallback()>
		mListener = new ViewDataBinding.WeakListener(viewdatabinding, i, ((ViewDataBinding.ObservableReference) (this)));
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
