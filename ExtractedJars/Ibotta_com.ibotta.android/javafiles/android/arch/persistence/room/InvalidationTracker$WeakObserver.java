// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.persistence.room;

import java.lang.ref.WeakReference;
import java.util.Set;

// Referenced classes of package android.arch.persistence.room:
//			InvalidationTracker

static class InvalidationTracker$WeakObserver extends InvalidationTracker.Observer
{

	public void onInvalidated(Set set)
	{
		InvalidationTracker.Observer observer = (InvalidationTracker.Observer)mDelegateRef.get();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field WeakReference mDelegateRef>
	//    2    4:invokevirtual   #38  <Method Object WeakReference.get()>
	//    3    7:checkcast       #4   <Class InvalidationTracker$Observer>
	//    4   10:astore_2        
		if(observer == null)
	//*   5   11:aload_2         
	//*   6   12:ifnonnull       24
		{
			mTracker.removeObserver(((InvalidationTracker.Observer) (this)));
	//    7   15:aload_0         
	//    8   16:getfield        #23  <Field InvalidationTracker mTracker>
	//    9   19:aload_0         
	//   10   20:invokevirtual   #42  <Method void InvalidationTracker.removeObserver(InvalidationTracker$Observer)>
			return;
	//   11   23:return          
		} else
		{
			observer.onInvalidated(set);
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #44  <Method void InvalidationTracker$Observer.onInvalidated(Set)>
			return;
	//   15   29:return          
		}
	}

	final WeakReference mDelegateRef;
	final InvalidationTracker mTracker;

	InvalidationTracker$WeakObserver(InvalidationTracker invalidationtracker, InvalidationTracker.Observer observer)
	{
		super(observer.mTables);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:getfield        #18  <Field String[] InvalidationTracker$Observer.mTables>
	//    3    5:invokespecial   #21  <Method void InvalidationTracker$Observer(String[])>
		mTracker = invalidationtracker;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #23  <Field InvalidationTracker mTracker>
		mDelegateRef = new WeakReference(((Object) (observer)));
	//    7   13:aload_0         
	//    8   14:new             #25  <Class WeakReference>
	//    9   17:dup             
	//   10   18:aload_2         
	//   11   19:invokespecial   #28  <Method void WeakReference(Object)>
	//   12   22:putfield        #30  <Field WeakReference mDelegateRef>
	//   13   25:return          
	}
}
