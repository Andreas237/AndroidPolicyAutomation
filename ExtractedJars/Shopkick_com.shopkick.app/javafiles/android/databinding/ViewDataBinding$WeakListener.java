// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.arch.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;

// Referenced classes of package android.databinding:
//			ViewDataBinding

private static class ViewDataBinding$WeakListener extends WeakReference
{

	protected ViewDataBinding getBinder()
	{
		ViewDataBinding viewdatabinding = (ViewDataBinding)get();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #38  <Method Object get()>
	//    2    4:checkcast       #7   <Class ViewDataBinding>
	//    3    7:astore_1        
		if(viewdatabinding == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       17
			unregister();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #42  <Method boolean unregister()>
	//    8   16:pop             
		return viewdatabinding;
	//    9   17:aload_1         
	//   10   18:areturn         
	}

	public Object getTarget()
	{
		return mTarget;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Object mTarget>
	//    2    4:areturn         
	}

	public void setLifecycleOwner(LifecycleOwner lifecycleowner)
	{
		mObservable.setLifecycleOwner(lifecycleowner);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field ViewDataBinding$ObservableReference mObservable>
	//    2    4:aload_1         
	//    3    5:invokeinterface #52  <Method void ViewDataBinding$ObservableReference.setLifecycleOwner(LifecycleOwner)>
	//    4   10:return          
	}

	public void setTarget(Object obj)
	{
		unregister();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #42  <Method boolean unregister()>
	//    2    4:pop             
		mTarget = obj;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #45  <Field Object mTarget>
		obj = mTarget;
	//    6   10:aload_0         
	//    7   11:getfield        #45  <Field Object mTarget>
	//    8   14:astore_1        
		if(obj != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          29
			mObservable.addListener(obj);
	//   11   19:aload_0         
	//   12   20:getfield        #29  <Field ViewDataBinding$ObservableReference mObservable>
	//   13   23:aload_1         
	//   14   24:invokeinterface #57  <Method void ViewDataBinding$ObservableReference.addListener(Object)>
	//   15   29:return          
	}

	public boolean unregister()
	{
		Object obj = mTarget;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Object mTarget>
	//    2    4:astore_2        
		boolean flag;
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          24
		{
			mObservable.removeListener(obj);
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field ViewDataBinding$ObservableReference mObservable>
	//    7   13:aload_2         
	//    8   14:invokeinterface #61  <Method void ViewDataBinding$ObservableReference.removeListener(Object)>
			flag = true;
	//    9   19:iconst_1        
	//   10   20:istore_1        
		} else
	//*  11   21:goto            26
		{
			flag = false;
	//   12   24:iconst_0        
	//   13   25:istore_1        
		}
		mTarget = null;
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:putfield        #45  <Field Object mTarget>
		return flag;
	//   17   31:iload_1         
	//   18   32:ireturn         
	}

	protected final int mLocalFieldId;
	private final erence mObservable;
	private Object mTarget;

	public ViewDataBinding$WeakListener(ViewDataBinding viewdatabinding, int i, erence erence)
	{
		super(((Object) (viewdatabinding)), ViewDataBinding.access$700());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #22  <Method java.lang.ref.ReferenceQueue ViewDataBinding.access$700()>
	//    3    5:invokespecial   #25  <Method void WeakReference(Object, java.lang.ref.ReferenceQueue)>
		mLocalFieldId = i;
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:putfield        #27  <Field int mLocalFieldId>
		mObservable = erence;
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:putfield        #29  <Field ViewDataBinding$ObservableReference mObservable>
	//   10   18:return          
	}
}
