// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

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
		if(mTarget != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #45  <Field Object mTarget>
	//*   8   14:ifnull          30
			mObservable.addListener(mTarget);
	//    9   17:aload_0         
	//   10   18:getfield        #29  <Field ViewDataBinding$ObservableReference mObservable>
	//   11   21:aload_0         
	//   12   22:getfield        #45  <Field Object mTarget>
	//   13   25:invokeinterface #53  <Method void ViewDataBinding$ObservableReference.addListener(Object)>
	//   14   30:return          
	}

	public boolean unregister()
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(mTarget != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #45  <Field Object mTarget>
	//*   4    6:ifnull          24
		{
			mObservable.removeListener(mTarget);
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field ViewDataBinding$ObservableReference mObservable>
	//    7   13:aload_0         
	//    8   14:getfield        #45  <Field Object mTarget>
	//    9   17:invokeinterface #57  <Method void ViewDataBinding$ObservableReference.removeListener(Object)>
			flag = true;
	//   10   22:iconst_1        
	//   11   23:istore_1        
		}
		mTarget = null;
	//   12   24:aload_0         
	//   13   25:aconst_null     
	//   14   26:putfield        #45  <Field Object mTarget>
		return flag;
	//   15   29:iload_1         
	//   16   30:ireturn         
	}

	protected final int mLocalFieldId;
	private final erence mObservable;
	private Object mTarget;

	public ViewDataBinding$WeakListener(ViewDataBinding viewdatabinding, int i, erence erence)
	{
		super(((Object) (viewdatabinding)), ViewDataBinding.access$600());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #22  <Method java.lang.ref.ReferenceQueue ViewDataBinding.access$600()>
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
